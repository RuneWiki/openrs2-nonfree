import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class300 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "[Lclient!qj;")
	public Class289[] aClass289Array1;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "[I")
	public int[] anIntArray566;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "[[B")
	public byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
	public int anInt7891;

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray94;

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "Lclient!qj;")
	public Class289 aClass289_1;

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray95;

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "[I")
	public int[] anIntArray567;

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
	public int anInt7892;

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "[I")
	public int[] anIntArray568;

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
	public int anInt7893;

	@OriginalMember(owner = "client!rf", name = "t", descriptor = "[I")
	public int[] anIntArray570;

	@OriginalMember(owner = "client!rf", name = "u", descriptor = "[I")
	public int[] anIntArray571;

	@OriginalMember(owner = "client!rf", name = "v", descriptor = "[I")
	public int[] anIntArray572;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
	public final int anInt7888;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "[B")
	private byte[] aByteArray82;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "([BI[B)V")
	public Class300(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt7888 = Static240.method8185(arg0.length, arg0);
		if (this.anInt7888 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray82 = Static595.method8390(arg0.length, 0, arg0);
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				if (arg2[local40] != this.aByteArray82[local40]) {
					throw new RuntimeException();
				}
			}
		}
		this.method6915(arg0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "([BZ)V")
	private void method6915(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class2_Sub17 local12 = new Class2_Sub17(Static583.method8069(arg0));
		@Pc(21) int local21 = local12.method2859();
		if (local21 < 5 || local21 > 6) {
			throw new RuntimeException();
		}
		if (local21 >= 6) {
			this.anInt7891 = local12.method2881();
		} else {
			this.anInt7891 = 0;
		}
		@Pc(50) int local50 = local12.method2859();
		@Pc(58) boolean local58 = (local50 & 0x1) != 0;
		@Pc(66) boolean local66 = (local50 & 0x2) != 0;
		this.anInt7892 = local12.method2825();
		@Pc(73) int local73 = 0;
		this.anIntArray568 = new int[this.anInt7892];
		@Pc(80) int local80 = -1;
		for (@Pc(82) int local82 = 0; local82 < this.anInt7892; local82++) {
			this.anIntArray568[local82] = local73 += local12.method2825();
			if (this.anIntArray568[local82] > local80) {
				local80 = this.anIntArray568[local82];
			}
		}
		this.anInt7893 = local80 + 1;
		this.anIntArray567 = new int[this.anInt7893];
		if (local66) {
			this.aByteArrayArray20 = new byte[this.anInt7893][];
		}
		this.anIntArray572 = new int[this.anInt7893];
		this.anIntArray566 = new int[this.anInt7893];
		this.anIntArray570 = new int[this.anInt7893];
		this.anIntArrayArray95 = new int[this.anInt7893][];
		@Pc(157) int local157;
		@Pc(171) int local171;
		if (local58) {
			this.anIntArray571 = new int[this.anInt7893];
			for (local157 = 0; local157 < this.anInt7893; local157++) {
				this.anIntArray571[local157] = -1;
			}
			for (local171 = 0; local171 < this.anInt7892; local171++) {
				this.anIntArray571[this.anIntArray568[local171]] = local12.method2881();
			}
			this.aClass289_1 = new Class289(this.anIntArray571);
		}
		for (local157 = 0; local157 < this.anInt7892; local157++) {
			this.anIntArray567[this.anIntArray568[local157]] = local12.method2881();
		}
		if (local66) {
			for (local171 = 0; local171 < this.anInt7892; local171++) {
				@Pc(227) byte[] local227 = new byte[64];
				local12.method2832(local227, 64, 0);
				this.aByteArrayArray20[this.anIntArray568[local171]] = local227;
			}
		}
		for (local171 = 0; local171 < this.anInt7892; local171++) {
			this.anIntArray572[this.anIntArray568[local171]] = local12.method2881();
		}
		for (@Pc(275) int local275 = 0; local275 < this.anInt7892; local275++) {
			this.anIntArray570[this.anIntArray568[local275]] = local12.method2825();
		}
		@Pc(305) int local305;
		@Pc(310) int local310;
		@Pc(314) int local314;
		@Pc(322) int local322;
		@Pc(339) int local339;
		for (@Pc(298) int local298 = 0; local298 < this.anInt7892; local298++) {
			local305 = this.anIntArray568[local298];
			local310 = this.anIntArray570[local305];
			local73 = 0;
			local314 = -1;
			this.anIntArrayArray95[local305] = new int[local310];
			for (local322 = 0; local322 < local310; local322++) {
				local339 = this.anIntArrayArray95[local305][local322] = local73 += local12.method2825();
				if (local314 < local339) {
					local314 = local339;
				}
			}
			this.anIntArray566[local305] = local314 + 1;
			if (local310 == local314 + 1) {
				this.anIntArrayArray95[local305] = null;
			}
		}
		if (!local58) {
			return;
		}
		this.anIntArrayArray94 = new int[local80 + 1][];
		this.aClass289Array1 = new Class289[local80 + 1];
		for (local305 = 0; local305 < this.anInt7892; local305++) {
			local310 = this.anIntArray568[local305];
			local314 = this.anIntArray570[local310];
			this.anIntArrayArray94[local310] = new int[this.anIntArray566[local310]];
			for (local322 = 0; local322 < this.anIntArray566[local310]; local322++) {
				this.anIntArrayArray94[local310][local322] = -1;
			}
			for (local339 = 0; local339 < local314; local339++) {
				@Pc(440) int local440;
				if (this.anIntArrayArray95[local310] == null) {
					local440 = local339;
				} else {
					local440 = this.anIntArrayArray95[local310][local339];
				}
				this.anIntArrayArray94[local310][local440] = local12.method2881();
			}
			this.aClass289Array1[local310] = new Class289(this.anIntArrayArray94[local310]);
		}
	}
}
