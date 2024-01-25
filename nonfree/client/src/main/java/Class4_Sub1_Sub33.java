import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class4_Sub1_Sub33 extends Class4_Sub1 {

	@OriginalMember(owner = "client!tn", name = "H", descriptor = "I")
	private int anInt9219 = 1;

	@OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
	private int anInt9218 = 1;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			@Pc(31) int local31 = this.anInt9219 + this.anInt9219 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(44) int local44 = this.anInt9218 + this.anInt9218 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][] local51 = new int[local31][];
			@Pc(71) int local71;
			for (@Pc(56) int local56 = arg0 - this.anInt9219; local56 <= arg0 + this.anInt9219; local56++) {
				@Pc(66) int[] local66 = this.method8392(local56 & Static237.anInt4286, 0);
				@Pc(69) int[] local69 = new int[Static376.anInt7260];
				local71 = 0;
				for (@Pc(75) int local75 = -this.anInt9218; local75 <= this.anInt9218; local75++) {
					local71 += local66[local75 & Static569.anInt9982];
				}
				@Pc(96) int local96 = 0;
				while (local96 < Static376.anInt7260) {
					local69[local96] = local71 * local48 >> 16;
					local71 -= local66[Static569.anInt9982 & local96 - this.anInt9218];
					local96++;
					local71 += local66[this.anInt9218 + local96 & Static569.anInt9982];
				}
				local51[this.anInt9219 + local56 - arg0] = local69;
			}
			for (@Pc(156) int local156 = 0; local156 < Static376.anInt7260; local156++) {
				@Pc(160) int local160 = 0;
				for (local71 = 0; local71 < local31; local71++) {
					local160 += local51[local71][local156];
				}
				local11[local156] = local160 * local35 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8388(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass84_41.method2457(arg0);
		if (super.aClass84_41.aBoolean194) {
			@Pc(32) int local32 = this.anInt9219 + this.anInt9219 + 1;
			@Pc(36) int local36 = 65536 / local32;
			@Pc(44) int local44 = this.anInt9218 + this.anInt9218 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][][] local51 = new int[local32][][];
			@Pc(75) int local75;
			@Pc(77) int local77;
			for (@Pc(57) int local57 = arg0 - this.anInt9219; local57 <= this.anInt9219 + arg0; local57++) {
				@Pc(67) int[][] local67 = this.method8385(Static237.anInt4286 & local57, 0);
				@Pc(71) int[][] local71 = new int[3][Static376.anInt7260];
				@Pc(73) int local73 = 0;
				local75 = 0;
				local77 = 0;
				@Pc(81) int[] local81 = local67[0];
				@Pc(85) int[] local85 = local67[1];
				@Pc(89) int[] local89 = local67[2];
				for (@Pc(93) int local93 = -this.anInt9218; local93 <= this.anInt9218; local93++) {
					@Pc(99) int local99 = Static569.anInt9982 & local93;
					local73 += local81[local99];
					local77 += local89[local99];
					local75 += local85[local99];
				}
				@Pc(130) int[] local130 = local71[0];
				@Pc(134) int[] local134 = local71[1];
				@Pc(138) int[] local138 = local71[2];
				@Pc(140) int local140 = 0;
				while (local140 < Static376.anInt7260) {
					local130[local140] = local73 * local48 >> 16;
					local134[local140] = local75 * local48 >> 16;
					local138[local140] = local77 * local48 >> 16;
					@Pc(174) int local174 = Static569.anInt9982 & local140 - this.anInt9218;
					local73 -= local81[local174];
					local140++;
					local75 -= local85[local174];
					local77 -= local89[local174];
					@Pc(201) int local201 = local140 + this.anInt9218 & Static569.anInt9982;
					local75 += local85[local201];
					local73 += local81[local201];
					local77 += local89[local201];
				}
				local51[this.anInt9219 + local57 - arg0] = local71;
			}
			@Pc(243) int[] local243 = local11[0];
			@Pc(247) int[] local247 = local11[1];
			@Pc(251) int[] local251 = local11[2];
			for (local75 = 0; local75 < Static376.anInt7260; local75++) {
				local77 = 0;
				@Pc(259) int local259 = 0;
				@Pc(261) int local261 = 0;
				for (@Pc(263) int local263 = 0; local263 < local32; local263++) {
					@Pc(269) int[][] local269 = local51[local263];
					local77 += local269[0][local75];
					local261 += local269[2][local75];
					local259 += local269[1][local75];
				}
				local243[local75] = local77 * local36 >> 16;
				local247[local75] = local259 * local36 >> 16;
				local251[local75] = local261 * local36 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt9218 = arg1.method4905();
		} else if (arg0 == 1) {
			this.anInt9219 = arg1.method4905();
		} else if (arg0 == 2) {
			super.aBoolean726 = arg1.method4905() == 1;
		}
	}
}
