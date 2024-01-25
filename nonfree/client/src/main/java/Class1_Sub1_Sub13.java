import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ft", name = "K", descriptor = "I")
	private int anInt2196 = 1;

	@OriginalMember(owner = "client!ft", name = "O", descriptor = "I")
	private int anInt2199 = 1;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2199 = arg1.method4463();
		} else if (arg0 == 1) {
			this.anInt2196 = arg1.method4463();
		} else if (arg0 == 2) {
			super.aBoolean612 = arg1.method4463() == 1;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			@Pc(29) int local29 = this.anInt2196 + this.anInt2196 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(41) int local41 = this.anInt2199 + this.anInt2199 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][] local48 = new int[local29][];
			@Pc(69) int local69;
			for (@Pc(54) int local54 = arg0 - this.anInt2196; local54 <= this.anInt2196 + arg0; local54++) {
				@Pc(64) int[] local64 = this.method5620(Static249.anInt4068 & local54, 0);
				@Pc(67) int[] local67 = new int[Static434.anInt4326];
				local69 = 0;
				for (@Pc(73) int local73 = -this.anInt2199; local73 <= this.anInt2199; local73++) {
					local69 += local64[local73 & Static429.anInt7144];
				}
				@Pc(94) int local94 = 0;
				while (local94 < Static434.anInt4326) {
					local67[local94] = local69 * local45 >> 16;
					local69 -= local64[local94 - this.anInt2199 & Static429.anInt7144];
					local94++;
					local69 += local64[Static429.anInt7144 & this.anInt2199 + local94];
				}
				local48[this.anInt2196 + local54 - arg0] = local67;
			}
			for (@Pc(157) int local157 = 0; local157 < Static434.anInt4326; local157++) {
				@Pc(161) int local161 = 0;
				for (local69 = 0; local69 < local29; local69++) {
					local161 += local48[local69][local157];
				}
				local16[local157] = local33 * local161 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5626(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass117_41.method2345(arg0);
		if (super.aClass117_41.aBoolean221) {
			@Pc(23) int local23 = this.anInt2196 + this.anInt2196 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt2199 + this.anInt2199 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][][] local42 = new int[local23][][];
			@Pc(66) int local66;
			@Pc(68) int local68;
			for (@Pc(48) int local48 = arg0 - this.anInt2196; local48 <= arg0 + this.anInt2196; local48++) {
				@Pc(58) int[][] local58 = this.method5624(0, Static249.anInt4068 & local48);
				@Pc(62) int[][] local62 = new int[3][Static434.anInt4326];
				@Pc(64) int local64 = 0;
				local66 = 0;
				local68 = 0;
				@Pc(72) int[] local72 = local58[0];
				@Pc(76) int[] local76 = local58[1];
				@Pc(80) int[] local80 = local58[2];
				for (@Pc(84) int local84 = -this.anInt2199; local84 <= this.anInt2199; local84++) {
					@Pc(90) int local90 = local84 & Static429.anInt7144;
					local68 += local80[local90];
					local66 += local76[local90];
					local64 += local72[local90];
				}
				@Pc(117) int[] local117 = local62[0];
				@Pc(121) int[] local121 = local62[1];
				@Pc(125) int[] local125 = local62[2];
				@Pc(127) int local127 = 0;
				while (Static434.anInt4326 > local127) {
					local117[local127] = local64 * local39 >> 16;
					local121[local127] = local66 * local39 >> 16;
					local125[local127] = local68 * local39 >> 16;
					@Pc(160) int local160 = Static429.anInt7144 & local127 - this.anInt2199;
					local68 -= local80[local160];
					local64 -= local72[local160];
					local127++;
					local66 -= local76[local160];
					@Pc(186) int local186 = this.anInt2199 + local127 & Static429.anInt7144;
					local64 += local72[local186];
					local68 += local80[local186];
					local66 += local76[local186];
				}
				local42[this.anInt2196 + local48 - arg0] = local62;
			}
			@Pc(232) int[] local232 = local11[0];
			@Pc(236) int[] local236 = local11[1];
			@Pc(240) int[] local240 = local11[2];
			for (local66 = 0; local66 < Static434.anInt4326; local66++) {
				local68 = 0;
				@Pc(248) int local248 = 0;
				@Pc(250) int local250 = 0;
				for (@Pc(252) int local252 = 0; local252 < local23; local252++) {
					@Pc(258) int[][] local258 = local42[local252];
					local68 += local258[0][local66];
					local250 += local258[2][local66];
					local248 += local258[1][local66];
				}
				local232[local66] = local68 * local27 >> 16;
				local236[local66] = local27 * local248 >> 16;
				local240[local66] = local27 * local250 >> 16;
			}
		}
		return local11;
	}
}
