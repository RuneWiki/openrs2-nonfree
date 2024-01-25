import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class68 {

	@OriginalMember(owner = "client!es", name = "b", descriptor = "[Lclient!ve;")
	private final Class204[] aClass204Array1 = new Class204[10];

	@OriginalMember(owner = "client!es", name = "a", descriptor = "I")
	private int anInt2001;

	@OriginalMember(owner = "client!es", name = "c", descriptor = "I")
	private int anInt2002;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!ap;)V")
	public Class68(@OriginalArg(0) Class7_Sub3 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method2772();
			if (local12 != 0) {
				arg0.anInt3005--;
				this.aClass204Array1[local7] = new Class204();
				this.aClass204Array1[local7].method5286(arg0);
			}
		}
		this.anInt2001 = arg0.method2764();
		this.anInt2002 = arg0.method2764();
	}

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "()V")
	private Class68() {
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "()I")
	public int method1604() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass204Array1[local3] != null && this.aClass204Array1[local3].anInt6262 / 20 < local1) {
				local1 = this.aClass204Array1[local3].anInt6262 / 20;
			}
		}
		if (this.anInt2001 < this.anInt2002 && this.anInt2001 / 20 < local1) {
			local1 = this.anInt2001 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass204Array1[local55] != null) {
				this.aClass204Array1[local55].anInt6262 -= local1 * 20;
			}
		}
		if (this.anInt2001 < this.anInt2002) {
			this.anInt2001 -= local1 * 20;
			this.anInt2002 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "()[B")
	private byte[] method1605() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass204Array1[local3] != null && this.aClass204Array1[local3].anInt6260 + this.aClass204Array1[local3].anInt6262 > local1) {
				local1 = this.aClass204Array1[local3].anInt6260 + this.aClass204Array1[local3].anInt6262;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass204Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass204Array1[local54].anInt6260 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass204Array1[local54].anInt6262 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass204Array1[local54].method5283(local70, this.aClass204Array1[local54].anInt6260);
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

	@OriginalMember(owner = "client!es", name = "c", descriptor = "()Lclient!kf;")
	public Class7_Sub20_Sub1 method1606() {
		@Pc(2) byte[] local2 = this.method1605();
		return new Class7_Sub20_Sub1(22050, local2, this.anInt2001 * 22050 / 1000, this.anInt2002 * 22050 / 1000);
	}
}
