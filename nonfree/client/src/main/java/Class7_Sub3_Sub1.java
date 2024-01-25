import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class7_Sub3_Sub1 extends Class7_Sub3 {

	@OriginalMember(owner = "client!aq", name = "H", descriptor = "I")
	private int anInt210 = 1;

	@OriginalMember(owner = "client!aq", name = "J", descriptor = "I")
	private int anInt211 = 1;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method5596(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass235_41.method4862(arg0);
		if (super.aClass235_41.aBoolean402) {
			@Pc(32) int local32 = this.anInt211 + this.anInt211 + 1;
			@Pc(36) int local36 = 65536 / local32;
			@Pc(44) int local44 = this.anInt210 + this.anInt210 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][][] local51 = new int[local32][][];
			@Pc(75) int local75;
			@Pc(77) int local77;
			for (@Pc(57) int local57 = arg0 - this.anInt211; local57 <= arg0 + this.anInt211; local57++) {
				@Pc(67) int[][] local67 = this.method5597(0, Static25.anInt366 & local57);
				@Pc(71) int[][] local71 = new int[3][Static58.anInt1052];
				@Pc(73) int local73 = 0;
				local75 = 0;
				local77 = 0;
				@Pc(81) int[] local81 = local67[0];
				@Pc(85) int[] local85 = local67[1];
				@Pc(89) int[] local89 = local67[2];
				for (@Pc(93) int local93 = -this.anInt210; local93 <= this.anInt210; local93++) {
					@Pc(99) int local99 = Static410.anInt6497 & local93;
					local75 += local85[local99];
					local73 += local81[local99];
					local77 += local89[local99];
				}
				@Pc(126) int[] local126 = local71[0];
				@Pc(130) int[] local130 = local71[1];
				@Pc(134) int[] local134 = local71[2];
				@Pc(136) int local136 = 0;
				while (Static58.anInt1052 > local136) {
					local126[local136] = local48 * local73 >> 16;
					local130[local136] = local48 * local75 >> 16;
					local134[local136] = local48 * local77 >> 16;
					@Pc(170) int local170 = Static410.anInt6497 & local136 - this.anInt210;
					local136++;
					local75 -= local85[local170];
					local77 -= local89[local170];
					local73 -= local81[local170];
					@Pc(196) int local196 = local136 + this.anInt210 & Static410.anInt6497;
					local75 += local85[local196];
					local77 += local89[local196];
					local73 += local81[local196];
				}
				local51[local57 + this.anInt211 - arg0] = local71;
			}
			@Pc(242) int[] local242 = local19[0];
			@Pc(246) int[] local246 = local19[1];
			@Pc(250) int[] local250 = local19[2];
			for (local75 = 0; local75 < Static58.anInt1052; local75++) {
				local77 = 0;
				@Pc(258) int local258 = 0;
				@Pc(260) int local260 = 0;
				for (@Pc(262) int local262 = 0; local262 < local32; local262++) {
					@Pc(268) int[][] local268 = local51[local262];
					local260 += local268[2][local75];
					local258 += local268[1][local75];
					local77 += local268[0][local75];
				}
				local242[local75] = local77 * local36 >> 16;
				local246[local75] = local258 * local36 >> 16;
				local250[local75] = local260 * local36 >> 16;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt210 = arg1.method3981();
		} else if (arg0 == 1) {
			this.anInt211 = arg1.method3981();
		} else if (arg0 == 2) {
			super.aBoolean490 = arg1.method3981() == 1;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			@Pc(23) int local23 = this.anInt211 + this.anInt211 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(36) int local36 = this.anInt210 + this.anInt210 + 1;
			@Pc(40) int local40 = 65536 / local36;
			@Pc(43) int[][] local43 = new int[local23][];
			@Pc(64) int local64;
			for (@Pc(49) int local49 = arg0 - this.anInt211; local49 <= arg0 + this.anInt211; local49++) {
				@Pc(59) int[] local59 = this.method5591(0, local49 & Static25.anInt366);
				@Pc(62) int[] local62 = new int[Static58.anInt1052];
				local64 = 0;
				for (@Pc(68) int local68 = -this.anInt210; local68 <= this.anInt210; local68++) {
					local64 += local59[local68 & Static410.anInt6497];
				}
				@Pc(89) int local89 = 0;
				while (local89 < Static58.anInt1052) {
					local62[local89] = local40 * local64 >> 16;
					local64 -= local59[Static410.anInt6497 & local89 - this.anInt210];
					local89++;
					local64 += local59[Static410.anInt6497 & local89 + this.anInt210];
				}
				local43[local49 + this.anInt211 - arg0] = local62;
			}
			for (@Pc(146) int local146 = 0; local146 < Static58.anInt1052; local146++) {
				@Pc(150) int local150 = 0;
				for (local64 = 0; local64 < local23; local64++) {
					local150 += local43[local64][local146];
				}
				local11[local146] = local27 * local150 >> 16;
			}
		}
		return local11;
	}
}
