import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class116 {

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "[Lclient!qs;")
	private final Class257[] aClass257Array1 = new Class257[10];

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
	private int anInt3720;

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
	private int anInt3719;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!daa;)V")
	public Class116(@OriginalArg(0) Class12_Sub8 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method5216();
			if (local12 != 0) {
				arg0.anInt6217--;
				this.aClass257Array1[local7] = new Class257();
				this.aClass257Array1[local7].method6420(arg0);
			}
		}
		this.anInt3720 = arg0.method5199();
		this.anInt3719 = arg0.method5199();
	}

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	private Class116() {
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "()Lclient!ke;")
	public Class12_Sub29_Sub1 method3273() {
		@Pc(2) byte[] local2 = this.method3275();
		return new Class12_Sub29_Sub1(22050, local2, this.anInt3720 * 22050 / 1000, this.anInt3719 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "()[B")
	private byte[] method3275() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass257Array1[local3] != null && this.aClass257Array1[local3].anInt7714 + this.aClass257Array1[local3].anInt7713 > local1) {
				local1 = this.aClass257Array1[local3].anInt7714 + this.aClass257Array1[local3].anInt7713;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass257Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass257Array1[local54].anInt7714 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass257Array1[local54].anInt7713 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass257Array1[local54].method6422(local70, this.aClass257Array1[local54].anInt7714);
				for (@Pc(94) int local94 = 0; local94 < local70; local94++) {
					@Pc(107) int local107 = local52[local94 + local80] + (local92[local94] >> 8);
					if ((local107 + 128 & 0xFFFFFF00) != 0) {
						local107 = local107 >> 31 ^ 0x7F;
					}
					local52[local94 + local80] = (byte) local107;
				}
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "()I")
	public int method3276() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass257Array1[local3] != null && this.aClass257Array1[local3].anInt7713 / 20 < local1) {
				local1 = this.aClass257Array1[local3].anInt7713 / 20;
			}
		}
		if (this.anInt3720 < this.anInt3719 && this.anInt3720 / 20 < local1) {
			local1 = this.anInt3720 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass257Array1[local55] != null) {
				this.aClass257Array1[local55].anInt7713 -= local1 * 20;
			}
		}
		if (this.anInt3720 < this.anInt3719) {
			this.anInt3720 -= local1 * 20;
			this.anInt3719 -= local1 * 20;
		}
		return local1;
	}
}
