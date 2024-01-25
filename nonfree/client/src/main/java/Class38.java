import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class38 {

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "[Lclient!so;")
	private final Class231[] aClass231Array1 = new Class231[10];

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
	private int anInt727;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
	private int anInt728;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!fh;)V")
	public Class38(@OriginalArg(0) Class4_Sub9 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method5007();
			if (local12 != 0) {
				arg0.anInt6207--;
				this.aClass231Array1[local7] = new Class231();
				this.aClass231Array1[local7].method4867(arg0);
			}
		}
		this.anInt727 = arg0.method5028();
		this.anInt728 = arg0.method5028();
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
	private Class38() {
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "()[B")
	private byte[] method612() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass231Array1[local3] != null && this.aClass231Array1[local3].anInt6063 + this.aClass231Array1[local3].anInt6062 > local1) {
				local1 = this.aClass231Array1[local3].anInt6063 + this.aClass231Array1[local3].anInt6062;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass231Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass231Array1[local54].anInt6063 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass231Array1[local54].anInt6062 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass231Array1[local54].method4868(local70, this.aClass231Array1[local54].anInt6063);
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

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "()I")
	public int method613() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass231Array1[local3] != null && this.aClass231Array1[local3].anInt6062 / 20 < local1) {
				local1 = this.aClass231Array1[local3].anInt6062 / 20;
			}
		}
		if (this.anInt727 < this.anInt728 && this.anInt727 / 20 < local1) {
			local1 = this.anInt727 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass231Array1[local55] != null) {
				this.aClass231Array1[local55].anInt6062 -= local1 * 20;
			}
		}
		if (this.anInt727 < this.anInt728) {
			this.anInt727 -= local1 * 20;
			this.anInt728 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "()Lclient!jc;")
	public Class4_Sub15_Sub1 method615() {
		@Pc(2) byte[] local2 = this.method612();
		return new Class4_Sub15_Sub1(22050, local2, this.anInt727 * 22050 / 1000, this.anInt728 * 22050 / 1000);
	}
}
