import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class4_Sub1_Sub17 extends Class4_Sub1 {

	@OriginalMember(owner = "client!jm", name = "J", descriptor = "I")
	private int anInt2658 = 1;

	@OriginalMember(owner = "client!jm", name = "W", descriptor = "I")
	private int anInt2665 = 1;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4542(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass113_41.method2911(arg0);
		if (this.aClass113_41.aBoolean232) {
			@Pc(31) int local31 = this.anInt2658 + this.anInt2658 + 1;
			@Pc(39) int local39 = this.anInt2665 + this.anInt2665 + 1;
			@Pc(42) int[][][] local42 = new int[local31][][];
			@Pc(46) int local46 = 65536 / local39;
			@Pc(50) int local50 = 65536 / local31;
			@Pc(78) int local78;
			@Pc(84) int local84;
			@Pc(86) int local86;
			for (@Pc(56) int local56 = arg0 - this.anInt2658; local56 <= this.anInt2658 + arg0; local56++) {
				@Pc(76) int[][] local76 = this.method4549(0, local56 & Static19.anInt437);
				local78 = 0;
				@Pc(82) int[][] local82 = new int[3][Static68.anInt1753];
				local84 = 0;
				local86 = 0;
				@Pc(90) int[] local90 = local76[0];
				@Pc(94) int[] local94 = local76[2];
				@Pc(98) int[] local98 = local76[1];
				for (@Pc(102) int local102 = -this.anInt2665; local102 <= this.anInt2665; local102++) {
					@Pc(110) int local110 = local102 & Static295.anInt5711;
					local78 += local90[local110];
					local84 += local98[local110];
					local86 += local94[local110];
				}
				@Pc(135) int[] local135 = local82[0];
				@Pc(139) int[] local139 = local82[1];
				@Pc(143) int[] local143 = local82[2];
				@Pc(145) int local145 = 0;
				while (Static68.anInt1753 > local145) {
					local135[local145] = local46 * local78 >> 16;
					local139[local145] = local84 * local46 >> 16;
					local143[local145] = local86 * local46 >> 16;
					@Pc(180) int local180 = Static295.anInt5711 & local145 - this.anInt2665;
					local145++;
					local86 -= local94[local180];
					local78 -= local90[local180];
					local84 -= local98[local180];
					@Pc(206) int local206 = this.anInt2665 + local145 & Static295.anInt5711;
					local84 += local98[local206];
					local78 += local90[local206];
					local86 += local94[local206];
				}
				local42[local56 + this.anInt2658 - arg0] = local82;
			}
			@Pc(244) int[] local244 = local18[0];
			@Pc(248) int[] local248 = local18[1];
			@Pc(252) int[] local252 = local18[2];
			for (local78 = 0; local78 < Static68.anInt1753; local78++) {
				local86 = 0;
				local84 = 0;
				@Pc(263) int local263 = 0;
				for (@Pc(265) int local265 = 0; local265 < local31; local265++) {
					@Pc(276) int[][] local276 = local42[local265];
					local86 += local276[1][local78];
					local84 += local276[0][local78];
					local263 += local276[2][local78];
				}
				local244[local78] = local50 * local84 >> 16;
				local248[local78] = local86 * local50 >> 16;
				local252[local78] = local50 * local263 >> 16;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt2665 = arg1.method3110();
		} else if (arg0 == 1) {
			this.anInt2658 = arg1.method3110();
		} else if (arg0 == 2) {
			this.aBoolean392 = arg1.method3110() == 1;
		}
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			@Pc(24) int local24 = this.anInt2658 + this.anInt2658 + 1;
			@Pc(27) int[][] local27 = new int[local24][];
			@Pc(35) int local35 = this.anInt2665 + this.anInt2665 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(45) int local45;
			for (local45 = arg0 - this.anInt2658; local45 <= arg0 + this.anInt2658; local45++) {
				@Pc(63) int[] local63 = this.method4538(0, local45 & Static19.anInt437);
				@Pc(65) int local65 = 0;
				@Pc(68) int[] local68 = new int[Static68.anInt1753];
				@Pc(72) int local72;
				for (local72 = -this.anInt2665; local72 <= this.anInt2665; local72++) {
					local65 += local63[local72 & Static295.anInt5711];
				}
				local72 = 0;
				while (Static68.anInt1753 > local72) {
					local68[local72] = local39 * local65 >> 16;
					local65 -= local63[Static295.anInt5711 & local72 - this.anInt2665];
					local72++;
					local65 += local63[this.anInt2665 + local72 & Static295.anInt5711];
				}
				local27[this.anInt2658 + local45 - arg0] = local68;
			}
			@Pc(151) int local151 = 65536 / local24;
			for (local45 = 0; local45 < Static68.anInt1753; local45++) {
				@Pc(158) int local158 = 0;
				for (@Pc(160) int local160 = 0; local160 < local24; local160++) {
					local158 += local27[local160][local45];
				}
				local11[local45] = local158 * local151 >> 16;
			}
		}
		return local11;
	}
}
