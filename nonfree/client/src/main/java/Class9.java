import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class9 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "[Lclient!te;")
	private final Class65[] aClass65Array1 = new Class65[10];

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!gb;)V")
	public Class9(@OriginalArg(0) Class3_Sub4 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method446();
			if (local12 != 0) {
				arg0.anInt627--;
				this.aClass65Array1[local7] = new Class65();
				this.aClass65Array1[local7].method1686(arg0);
			}
		}
		this.anInt339 = arg0.method459();
		this.anInt338 = arg0.method459();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "()[B")
	private byte[] method210() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass65Array1[local3] != null && this.aClass65Array1[local3].anInt2528 + this.aClass65Array1[local3].anInt2527 > local1) {
				local1 = this.aClass65Array1[local3].anInt2528 + this.aClass65Array1[local3].anInt2527;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass65Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass65Array1[local54].anInt2528 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass65Array1[local54].anInt2527 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass65Array1[local54].method1689(local70, this.aClass65Array1[local54].anInt2528);
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

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "()Lclient!ta;")
	public Class3_Sub9_Sub1 method211() {
		@Pc(2) byte[] local2 = this.method210();
		return new Class3_Sub9_Sub1(22050, local2, this.anInt339 * 22050 / 1000, this.anInt338 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "()I")
	public int method213() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass65Array1[local3] != null && this.aClass65Array1[local3].anInt2527 / 20 < local1) {
				local1 = this.aClass65Array1[local3].anInt2527 / 20;
			}
		}
		if (this.anInt339 < this.anInt338 && this.anInt339 / 20 < local1) {
			local1 = this.anInt339 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass65Array1[local55] != null) {
				this.aClass65Array1[local55].anInt2527 -= local1 * 20;
			}
		}
		if (this.anInt339 < this.anInt338) {
			this.anInt339 -= local1 * 20;
			this.anInt338 -= local1 * 20;
		}
		return local1;
	}
}
