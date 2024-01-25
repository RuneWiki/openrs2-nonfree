import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class233 {

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "[Lclient!as;")
	private final Class17[] aClass17Array1 = new Class17[10];

	@OriginalMember(owner = "client!qaa", name = "c", descriptor = "I")
	private int anInt6842;

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "I")
	private int anInt6841;

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lclient!os;)V")
	public Class233(@OriginalArg(0) Class1_Sub17 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method4487();
			if (local12 != 0) {
				arg0.anInt4872--;
				this.aClass17Array1[local7] = new Class17();
				this.aClass17Array1[local7].method596(arg0);
			}
		}
		this.anInt6842 = arg0.method4494();
		this.anInt6841 = arg0.method4494();
	}

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "()V")
	private Class233() {
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "()[B")
	private byte[] method6177() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass17Array1[local3] != null && this.aClass17Array1[local3].anInt421 + this.aClass17Array1[local3].anInt419 > local1) {
				local1 = this.aClass17Array1[local3].anInt421 + this.aClass17Array1[local3].anInt419;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass17Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass17Array1[local54].anInt421 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass17Array1[local54].anInt419 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass17Array1[local54].method595(local70, this.aClass17Array1[local54].anInt421);
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

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "()Lclient!mr;")
	public Class1_Sub30_Sub1 method6178() {
		@Pc(2) byte[] local2 = this.method6177();
		return new Class1_Sub30_Sub1(22050, local2, this.anInt6842 * 22050 / 1000, this.anInt6841 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!qaa", name = "c", descriptor = "()I")
	public int method6180() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass17Array1[local3] != null && this.aClass17Array1[local3].anInt419 / 20 < local1) {
				local1 = this.aClass17Array1[local3].anInt419 / 20;
			}
		}
		if (this.anInt6842 < this.anInt6841 && this.anInt6842 / 20 < local1) {
			local1 = this.anInt6842 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass17Array1[local55] != null) {
				this.aClass17Array1[local55].anInt419 -= local1 * 20;
			}
		}
		if (this.anInt6842 < this.anInt6841) {
			this.anInt6842 -= local1 * 20;
			this.anInt6841 -= local1 * 20;
		}
		return local1;
	}
}
