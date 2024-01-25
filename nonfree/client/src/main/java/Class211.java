import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class211 {

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "[Lclient!vd;")
	private final Class250[] aClass250Array1 = new Class250[10];

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
	private int anInt6000;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
	private int anInt5999;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class211(@OriginalArg(0) Class1_Sub28 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method5337();
			if (local12 != 0) {
				arg0.anInt6812--;
				this.aClass250Array1[local7] = new Class250();
				this.aClass250Array1[local7].method5608(arg0);
			}
		}
		this.anInt6000 = arg0.method5335();
		this.anInt5999 = arg0.method5335();
	}

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
	private Class211() {
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "()Lclient!jj;")
	public Class1_Sub25_Sub1 method4738() {
		@Pc(2) byte[] local2 = this.method4739();
		return new Class1_Sub25_Sub1(22050, local2, this.anInt6000 * 22050 / 1000, this.anInt5999 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "()[B")
	private byte[] method4739() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass250Array1[local3] != null && this.aClass250Array1[local3].anInt7154 + this.aClass250Array1[local3].anInt7155 > local1) {
				local1 = this.aClass250Array1[local3].anInt7154 + this.aClass250Array1[local3].anInt7155;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass250Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass250Array1[local54].anInt7154 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass250Array1[local54].anInt7155 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass250Array1[local54].method5605(local70, this.aClass250Array1[local54].anInt7154);
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

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "()I")
	public int method4740() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass250Array1[local3] != null && this.aClass250Array1[local3].anInt7155 / 20 < local1) {
				local1 = this.aClass250Array1[local3].anInt7155 / 20;
			}
		}
		if (this.anInt6000 < this.anInt5999 && this.anInt6000 / 20 < local1) {
			local1 = this.anInt6000 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass250Array1[local55] != null) {
				this.aClass250Array1[local55].anInt7155 -= local1 * 20;
			}
		}
		if (this.anInt6000 < this.anInt5999) {
			this.anInt6000 -= local1 * 20;
			this.anInt5999 -= local1 * 20;
		}
		return local1;
	}
}
