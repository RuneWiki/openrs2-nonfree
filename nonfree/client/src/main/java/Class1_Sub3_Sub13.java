import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class1_Sub3_Sub13 extends Class1_Sub3 {

	@OriginalMember(owner = "client!is", name = "M", descriptor = "I")
	private int anInt4139 = 1;

	@OriginalMember(owner = "client!is", name = "Q", descriptor = "I")
	private int anInt4142 = 1;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt4139 = arg1.method4487();
		} else if (arg0 == 1) {
			this.anInt4142 = arg1.method4487();
		} else if (arg0 == 2) {
			super.aBoolean708 = arg1.method4487() == 1;
		}
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8190(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass281_41.method7073(arg0);
		if (super.aClass281_41.aBoolean590) {
			@Pc(25) int local25 = this.anInt4142 + this.anInt4142 + 1;
			@Pc(29) int local29 = 65536 / local25;
			@Pc(38) int local38 = this.anInt4139 + this.anInt4139 + 1;
			@Pc(42) int local42 = 65536 / local38;
			@Pc(45) int[][][] local45 = new int[local25][][];
			@Pc(70) int local70;
			@Pc(72) int local72;
			for (@Pc(50) int local50 = arg0 - this.anInt4142; local50 <= this.anInt4142 + arg0; local50++) {
				@Pc(62) int[][] local62 = this.method8199(0, Static109.anInt2298 & local50);
				@Pc(66) int[][] local66 = new int[3][Static254.anInt4973];
				@Pc(68) int local68 = 0;
				local70 = 0;
				local72 = 0;
				@Pc(76) int[] local76 = local62[0];
				@Pc(80) int[] local80 = local62[1];
				@Pc(84) int[] local84 = local62[2];
				for (@Pc(88) int local88 = -this.anInt4139; local88 <= this.anInt4139; local88++) {
					@Pc(94) int local94 = Static184.anInt3830 & local88;
					local70 += local80[local94];
					local68 += local76[local94];
					local72 += local84[local94];
				}
				@Pc(125) int[] local125 = local66[0];
				@Pc(129) int[] local129 = local66[1];
				@Pc(133) int[] local133 = local66[2];
				@Pc(135) int local135 = 0;
				while (Static254.anInt4973 > local135) {
					local125[local135] = local42 * local68 >> 16;
					local129[local135] = local70 * local42 >> 16;
					local133[local135] = local72 * local42 >> 16;
					@Pc(169) int local169 = Static184.anInt3830 & local135 - this.anInt4139;
					local135++;
					local68 -= local76[local169];
					local70 -= local80[local169];
					local72 -= local84[local169];
					@Pc(195) int local195 = local135 + this.anInt4139 & Static184.anInt3830;
					local72 += local84[local195];
					local68 += local76[local195];
					local70 += local80[local195];
				}
				local45[local50 + this.anInt4142 - arg0] = local66;
			}
			@Pc(241) int[] local241 = local13[0];
			@Pc(245) int[] local245 = local13[1];
			@Pc(249) int[] local249 = local13[2];
			for (local70 = 0; local70 < Static254.anInt4973; local70++) {
				local72 = 0;
				@Pc(257) int local257 = 0;
				@Pc(259) int local259 = 0;
				for (@Pc(261) int local261 = 0; local261 < local25; local261++) {
					@Pc(267) int[][] local267 = local45[local261];
					local259 += local267[2][local70];
					local72 += local267[0][local70];
					local257 += local267[1][local70];
				}
				local241[local70] = local29 * local72 >> 16;
				local245[local70] = local257 * local29 >> 16;
				local249[local70] = local259 * local29 >> 16;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			@Pc(28) int local28 = this.anInt4142 + this.anInt4142 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(41) int local41 = this.anInt4139 + this.anInt4139 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][] local48 = new int[local28][];
			@Pc(69) int local69;
			for (@Pc(54) int local54 = arg0 - this.anInt4142; local54 <= this.anInt4142 + arg0; local54++) {
				@Pc(64) int[] local64 = this.method8201(0, Static109.anInt2298 & local54);
				@Pc(67) int[] local67 = new int[Static254.anInt4973];
				local69 = 0;
				for (@Pc(73) int local73 = -this.anInt4139; local73 <= this.anInt4139; local73++) {
					local69 += local64[Static184.anInt3830 & local73];
				}
				@Pc(94) int local94 = 0;
				while (Static254.anInt4973 > local94) {
					local67[local94] = local45 * local69 >> 16;
					local69 -= local64[local94 - this.anInt4139 & Static184.anInt3830];
					local94++;
					local69 += local64[Static184.anInt3830 & this.anInt4139 + local94];
				}
				local48[local54 + this.anInt4142 - arg0] = local67;
			}
			for (@Pc(153) int local153 = 0; local153 < Static254.anInt4973; local153++) {
				@Pc(157) int local157 = 0;
				for (local69 = 0; local69 < local28; local69++) {
					local157 += local48[local69][local153];
				}
				local11[local153] = local157 * local32 >> 16;
			}
		}
		return local11;
	}
}
