import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class116 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "[Lclient!iha;")
	private final Class163[] aClass163Array1 = new Class163[10];

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
	private int anInt3824;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
	private int anInt3825;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!ol;)V")
	public Class116(@OriginalArg(0) Class2_Sub8 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method5203();
			if (local12 != 0) {
				arg0.anInt5725--;
				this.aClass163Array1[local7] = new Class163();
				this.aClass163Array1[local7].method4431(arg0);
			}
		}
		this.anInt3824 = arg0.method5211();
		this.anInt3825 = arg0.method5211();
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	private Class116() {
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "()[B")
	private byte[] method3541() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass163Array1[local3] != null && this.aClass163Array1[local3].anInt4890 + this.aClass163Array1[local3].anInt4891 > local1) {
				local1 = this.aClass163Array1[local3].anInt4890 + this.aClass163Array1[local3].anInt4891;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass163Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass163Array1[local54].anInt4890 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass163Array1[local54].anInt4891 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass163Array1[local54].method4432(local70, this.aClass163Array1[local54].anInt4890);
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

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "()Lclient!ud;")
	public Class2_Sub44_Sub1 method3542() {
		@Pc(2) byte[] local2 = this.method3541();
		return new Class2_Sub44_Sub1(22050, local2, this.anInt3824 * 22050 / 1000, this.anInt3825 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "()I")
	public int method3544() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass163Array1[local3] != null && this.aClass163Array1[local3].anInt4891 / 20 < local1) {
				local1 = this.aClass163Array1[local3].anInt4891 / 20;
			}
		}
		if (this.anInt3824 < this.anInt3825 && this.anInt3824 / 20 < local1) {
			local1 = this.anInt3824 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass163Array1[local55] != null) {
				this.aClass163Array1[local55].anInt4891 -= local1 * 20;
			}
		}
		if (this.anInt3824 < this.anInt3825) {
			this.anInt3824 -= local1 * 20;
			this.anInt3825 -= local1 * 20;
		}
		return local1;
	}
}
