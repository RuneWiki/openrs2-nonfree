import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oia")
public final class Class243 {

	@OriginalMember(owner = "client!oia", name = "c", descriptor = "[Lclient!pda;")
	private final Class253[] aClass253Array1 = new Class253[10];

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "I")
	private int anInt7436;

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "I")
	private int anInt7435;

	@OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(Lclient!ud;)V")
	public Class243(@OriginalArg(0) Class2_Sub34 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method6904();
			if (local12 != 0) {
				arg0.anInt8188--;
				this.aClass253Array1[local7] = new Class253();
				this.aClass253Array1[local7].method6418(arg0);
			}
		}
		this.anInt7436 = arg0.method6884();
		this.anInt7435 = arg0.method6884();
	}

	@OriginalMember(owner = "client!oia", name = "<init>", descriptor = "()V")
	private Class243() {
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "()I")
	public int method6253() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass253Array1[local3] != null && this.aClass253Array1[local3].anInt7679 / 20 < local1) {
				local1 = this.aClass253Array1[local3].anInt7679 / 20;
			}
		}
		if (this.anInt7436 < this.anInt7435 && this.anInt7436 / 20 < local1) {
			local1 = this.anInt7436 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass253Array1[local55] != null) {
				this.aClass253Array1[local55].anInt7679 -= local1 * 20;
			}
		}
		if (this.anInt7436 < this.anInt7435) {
			this.anInt7436 -= local1 * 20;
			this.anInt7435 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "()[B")
	private byte[] method6255() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass253Array1[local3] != null && this.aClass253Array1[local3].anInt7677 + this.aClass253Array1[local3].anInt7679 > local1) {
				local1 = this.aClass253Array1[local3].anInt7677 + this.aClass253Array1[local3].anInt7679;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass253Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass253Array1[local54].anInt7677 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass253Array1[local54].anInt7679 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass253Array1[local54].method6420(local70, this.aClass253Array1[local54].anInt7677);
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

	@OriginalMember(owner = "client!oia", name = "c", descriptor = "()Lclient!cj;")
	public Class2_Sub12_Sub1 method6256() {
		@Pc(2) byte[] local2 = this.method6255();
		return new Class2_Sub12_Sub1(22050, local2, this.anInt7436 * 22050 / 1000, this.anInt7435 * 22050 / 1000);
	}
}
