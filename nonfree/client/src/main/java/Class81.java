import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class81 {

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "[Lclient!tn;")
	private final Class198[] aClass198Array1 = new Class198[10];

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
	private int anInt2390;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
	private int anInt2391;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lclient!eb;)V")
	public Class81(@OriginalArg(0) Class1_Sub7 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method3141();
			if (local12 != 0) {
				arg0.anInt3368--;
				this.aClass198Array1[local7] = new Class198();
				this.aClass198Array1[local7].method5143(arg0);
			}
		}
		this.anInt2390 = arg0.method3115();
		this.anInt2391 = arg0.method3115();
	}

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	private Class81() {
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "()[B")
	private byte[] method2200() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass198Array1[local3] != null && this.aClass198Array1[local3].anInt5848 + this.aClass198Array1[local3].anInt5849 > local1) {
				local1 = this.aClass198Array1[local3].anInt5848 + this.aClass198Array1[local3].anInt5849;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass198Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass198Array1[local54].anInt5848 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass198Array1[local54].anInt5849 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass198Array1[local54].method5140(local70, this.aClass198Array1[local54].anInt5848);
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

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "()I")
	public int method2201() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass198Array1[local3] != null && this.aClass198Array1[local3].anInt5849 / 20 < local1) {
				local1 = this.aClass198Array1[local3].anInt5849 / 20;
			}
		}
		if (this.anInt2390 < this.anInt2391 && this.anInt2390 / 20 < local1) {
			local1 = this.anInt2390 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass198Array1[local55] != null) {
				this.aClass198Array1[local55].anInt5849 -= local1 * 20;
			}
		}
		if (this.anInt2390 < this.anInt2391) {
			this.anInt2390 -= local1 * 20;
			this.anInt2391 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "()Lclient!eg;")
	public Class1_Sub12_Sub1 method2202() {
		@Pc(2) byte[] local2 = this.method2200();
		return new Class1_Sub12_Sub1(22050, local2, this.anInt2390 * 22050 / 1000, this.anInt2391 * 22050 / 1000);
	}
}
