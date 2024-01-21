import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class28 {

	@OriginalMember(owner = "client!he", name = "c", descriptor = "[Lclient!wc;")
	private final Class68[] aClass68Array1 = new Class68[10];

	@OriginalMember(owner = "client!he", name = "b", descriptor = "I")
	private int anInt1351;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "I")
	private int anInt1350;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!b;)V")
	public Class28(@OriginalArg(0) Class6_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1495();
			if (local12 != 0) {
				arg0.anInt2209--;
				this.aClass68Array1[local7] = new Class68();
				this.aClass68Array1[local7].method2075(arg0);
			}
		}
		this.anInt1351 = arg0.method1500();
		this.anInt1350 = arg0.method1500();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "()I")
	public int method870() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass68Array1[local3] != null && this.aClass68Array1[local3].anInt3246 / 20 < local1) {
				local1 = this.aClass68Array1[local3].anInt3246 / 20;
			}
		}
		if (this.anInt1351 < this.anInt1350 && this.anInt1351 / 20 < local1) {
			local1 = this.anInt1351 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass68Array1[local55] != null) {
				this.aClass68Array1[local55].anInt3246 -= local1 * 20;
			}
		}
		if (this.anInt1351 < this.anInt1350) {
			this.anInt1351 -= local1 * 20;
			this.anInt1350 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "()Lclient!da;")
	public Class6_Sub4_Sub1 method871() {
		@Pc(2) byte[] local2 = this.method873();
		return new Class6_Sub4_Sub1(22050, local2, this.anInt1351 * 22050 / 1000, this.anInt1350 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "()[B")
	private byte[] method873() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass68Array1[local3] != null && this.aClass68Array1[local3].anInt3245 + this.aClass68Array1[local3].anInt3246 > local1) {
				local1 = this.aClass68Array1[local3].anInt3245 + this.aClass68Array1[local3].anInt3246;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass68Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass68Array1[local54].anInt3245 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass68Array1[local54].anInt3246 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass68Array1[local54].method2078(local70, this.aClass68Array1[local54].anInt3245);
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
}
