import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class1_Sub3_Sub39 extends Class1_Sub3 {

	@OriginalMember(owner = "client!wl", name = "K", descriptor = "I")
	private int anInt5613 = 1;

	@OriginalMember(owner = "client!wl", name = "N", descriptor = "I")
	private int anInt5616 = 1;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			@Pc(29) int local29 = this.anInt5613 + this.anInt5613 + 1;
			@Pc(38) int local38 = this.anInt5616 + this.anInt5616 + 1;
			@Pc(42) int local42 = 65536 / local29;
			@Pc(46) int local46 = 65536 / local38;
			@Pc(49) int[][] local49 = new int[local29][];
			@Pc(55) int local55;
			for (local55 = arg0 - this.anInt5613; local55 <= this.anInt5613 + arg0; local55++) {
				@Pc(69) int[] local69 = this.method4450(0, Static202.anInt4099 & local55);
				@Pc(72) int[] local72 = new int[Static227.anInt4511];
				@Pc(74) int local74 = 0;
				@Pc(78) int local78;
				for (local78 = -this.anInt5616; local78 <= this.anInt5616; local78++) {
					local74 += local69[local78 & Static229.anInt4527];
				}
				local78 = 0;
				while (local78 < Static227.anInt4511) {
					local72[local78] = local74 * local46 >> 16;
					local74 -= local69[Static229.anInt4527 & local78 - this.anInt5616];
					local78++;
					local74 += local69[Static229.anInt4527 & this.anInt5616 + local78];
				}
				local49[local55 + this.anInt5613 - arg0] = local72;
			}
			for (local55 = 0; local55 < Static227.anInt4511; local55++) {
				@Pc(160) int local160 = 0;
				for (@Pc(162) int local162 = 0; local162 < local29; local162++) {
					local160 += local49[local162][local55];
				}
				local16[local55] = local160 * local42 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4452(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = this.aClass56_41.method1596(arg0);
		if (this.aClass56_41.aBoolean144) {
			@Pc(25) int local25 = this.anInt5613 + this.anInt5613 + 1;
			@Pc(29) int local29 = 65536 / local25;
			@Pc(37) int local37 = this.anInt5616 + this.anInt5616 + 1;
			@Pc(40) int[][][] local40 = new int[local25][][];
			@Pc(44) int local44 = 65536 / local37;
			@Pc(74) int local74;
			@Pc(78) int local78;
			@Pc(76) int local76;
			for (@Pc(50) int local50 = arg0 - this.anInt5613; local50 <= arg0 + this.anInt5613; local50++) {
				@Pc(68) int[][] local68 = this.method4455(0, local50 & Static202.anInt4099);
				@Pc(72) int[][] local72 = new int[3][Static227.anInt4511];
				local74 = 0;
				local76 = 0;
				local78 = 0;
				@Pc(82) int[] local82 = local68[0];
				@Pc(86) int[] local86 = local68[2];
				@Pc(90) int[] local90 = local68[1];
				for (@Pc(94) int local94 = -this.anInt5616; local94 <= this.anInt5616; local94++) {
					@Pc(102) int local102 = Static229.anInt4527 & local94;
					local78 += local90[local102];
					local76 += local86[local102];
					local74 += local82[local102];
				}
				@Pc(127) int[] local127 = local72[0];
				@Pc(131) int[] local131 = local72[1];
				@Pc(135) int[] local135 = local72[2];
				@Pc(137) int local137 = 0;
				while (Static227.anInt4511 > local137) {
					local127[local137] = local74 * local44 >> 16;
					local131[local137] = local78 * local44 >> 16;
					local135[local137] = local44 * local76 >> 16;
					@Pc(172) int local172 = local137 - this.anInt5616 & Static229.anInt4527;
					local137++;
					local74 -= local82[local172];
					local78 -= local90[local172];
					local76 -= local86[local172];
					@Pc(198) int local198 = this.anInt5616 + local137 & Static229.anInt4527;
					local78 += local90[local198];
					local76 += local86[local198];
					local74 += local82[local198];
				}
				local40[this.anInt5613 + local50 - arg0] = local72;
			}
			@Pc(234) int[] local234 = local11[0];
			@Pc(238) int[] local238 = local11[1];
			@Pc(242) int[] local242 = local11[2];
			for (local74 = 0; local74 < Static227.anInt4511; local74++) {
				local76 = 0;
				local78 = 0;
				@Pc(257) int local257 = 0;
				for (@Pc(259) int local259 = 0; local259 < local25; local259++) {
					@Pc(270) int[][] local270 = local40[local259];
					local76 += local270[1][local74];
					local257 += local270[2][local74];
					local78 += local270[0][local74];
				}
				local234[local74] = local78 * local29 >> 16;
				local238[local74] = local29 * local76 >> 16;
				local242[local74] = local29 * local257 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5616 = arg0.method2690();
		} else if (arg1 == 1) {
			this.anInt5613 = arg0.method2690();
		} else if (arg1 == 2) {
			this.aBoolean451 = arg0.method2690() == 1;
		}
	}
}
