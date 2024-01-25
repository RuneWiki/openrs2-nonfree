import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!maa")
public final class Class5_Sub2_Sub19 extends Class5_Sub2 {

	@OriginalMember(owner = "client!maa", name = "I", descriptor = "I")
	private int anInt5897 = 1;

	@OriginalMember(owner = "client!maa", name = "L", descriptor = "I")
	private int anInt5900 = 1;

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5900 = arg0.method8645();
		} else if (arg1 == 1) {
			this.anInt5897 = arg0.method8645();
		} else if (arg1 == 2) {
			super.aBoolean834 = arg0.method8645() == 1;
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			@Pc(28) int local28 = this.anInt5897 + this.anInt5897 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt5900 + this.anInt5900 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][] local47 = new int[local28][];
			@Pc(68) int local68;
			for (@Pc(53) int local53 = arg0 - this.anInt5897; local53 <= this.anInt5897 + arg0; local53++) {
				@Pc(63) int[] local63 = this.method8821(Static271.anInt4487 & local53, 0);
				@Pc(66) int[] local66 = new int[Static314.anInt6320];
				local68 = 0;
				for (@Pc(72) int local72 = -this.anInt5900; local72 <= this.anInt5900; local72++) {
					local68 += local63[local72 & Static550.anInt6610];
				}
				@Pc(89) int local89 = 0;
				while (Static314.anInt6320 > local89) {
					local66[local89] = local44 * local68 >> 16;
					local68 -= local63[local89 - this.anInt5900 & Static550.anInt6610];
					local89++;
					local68 += local63[local89 + this.anInt5900 & Static550.anInt6610];
				}
				local47[local53 + this.anInt5897 - arg0] = local66;
			}
			for (@Pc(153) int local153 = 0; local153 < Static314.anInt6320; local153++) {
				@Pc(157) int local157 = 0;
				for (local68 = 0; local68 < local28; local68++) {
					local157 += local47[local68][local153];
				}
				local11[local153] = local32 * local157 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(IZ)[[I")
	@Override
	public int[][] method8827(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass370_41.method8551(arg0);
		if (super.aClass370_41.aBoolean819) {
			@Pc(23) int local23 = this.anInt5897 + this.anInt5897 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt5900 + this.anInt5900 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][][] local42 = new int[local23][][];
			@Pc(65) int local65;
			@Pc(67) int local67;
			for (@Pc(47) int local47 = arg0 - this.anInt5897; local47 <= this.anInt5897 + arg0; local47++) {
				@Pc(57) int[][] local57 = this.method8823(local47 & Static271.anInt4487, 0);
				@Pc(61) int[][] local61 = new int[3][Static314.anInt6320];
				@Pc(63) int local63 = 0;
				local65 = 0;
				local67 = 0;
				@Pc(71) int[] local71 = local57[0];
				@Pc(75) int[] local75 = local57[1];
				@Pc(79) int[] local79 = local57[2];
				for (@Pc(83) int local83 = -this.anInt5900; local83 <= this.anInt5900; local83++) {
					@Pc(89) int local89 = Static550.anInt6610 & local83;
					local65 += local75[local89];
					local67 += local79[local89];
					local63 += local71[local89];
				}
				@Pc(116) int[] local116 = local61[0];
				@Pc(120) int[] local120 = local61[1];
				@Pc(124) int[] local124 = local61[2];
				@Pc(126) int local126 = 0;
				while (local126 < Static314.anInt6320) {
					local116[local126] = local39 * local63 >> 16;
					local120[local126] = local65 * local39 >> 16;
					local124[local126] = local39 * local67 >> 16;
					@Pc(160) int local160 = local126 - this.anInt5900 & Static550.anInt6610;
					local67 -= local79[local160];
					local126++;
					local65 -= local75[local160];
					local63 -= local71[local160];
					@Pc(187) int local187 = Static550.anInt6610 & local126 + this.anInt5900;
					local65 += local75[local187];
					local67 += local79[local187];
					local63 += local71[local187];
				}
				local42[this.anInt5897 + local47 - arg0] = local61;
			}
			@Pc(237) int[] local237 = local11[0];
			@Pc(241) int[] local241 = local11[1];
			@Pc(245) int[] local245 = local11[2];
			for (local65 = 0; local65 < Static314.anInt6320; local65++) {
				local67 = 0;
				@Pc(253) int local253 = 0;
				@Pc(255) int local255 = 0;
				for (@Pc(257) int local257 = 0; local257 < local23; local257++) {
					@Pc(263) int[][] local263 = local42[local257];
					local255 += local263[2][local65];
					local67 += local263[0][local65];
					local253 += local263[1][local65];
				}
				local237[local65] = local67 * local27 >> 16;
				local241[local65] = local27 * local253 >> 16;
				local245[local65] = local255 * local27 >> 16;
			}
		}
		return local11;
	}
}
