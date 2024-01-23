import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class8_Sub3_Sub38 extends Class8_Sub3 {

	@OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
	private int anInt5439 = 1;

	@OriginalMember(owner = "client!va", name = "U", descriptor = "I")
	private int anInt5442 = 1;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt5442 = arg1.method2334();
		} else if (arg0 == 1) {
			this.anInt5439 = arg1.method2334();
		} else if (arg0 == 2) {
			this.aBoolean469 = arg1.method2334() == 1;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			@Pc(30) int local30 = this.anInt5439 + this.anInt5439 + 1;
			@Pc(38) int local38 = this.anInt5442 + this.anInt5442 + 1;
			@Pc(41) int[][] local41 = new int[local30][];
			@Pc(45) int local45 = 65536 / local38;
			@Pc(51) int local51;
			for (local51 = arg0 - this.anInt5439; local51 <= this.anInt5439 + arg0; local51++) {
				@Pc(69) int[] local69 = this.method4230(local51 & Static51.anInt1120, 0);
				@Pc(72) int[] local72 = new int[Static239.anInt4789];
				@Pc(74) int local74 = 0;
				@Pc(78) int local78;
				for (local78 = -this.anInt5442; local78 <= this.anInt5442; local78++) {
					local74 += local69[Static214.anInt4402 & local78];
				}
				local78 = 0;
				while (local78 < Static239.anInt4789) {
					local72[local78] = local74 * local45 >> 16;
					local74 -= local69[local78 - this.anInt5442 & Static214.anInt4402];
					local78++;
					local74 += local69[Static214.anInt4402 & local78 + this.anInt5442];
				}
				local41[this.anInt5439 + local51 - arg0] = local72;
			}
			@Pc(152) int local152 = 65536 / local30;
			for (local51 = 0; local51 < Static239.anInt4789; local51++) {
				@Pc(159) int local159 = 0;
				for (@Pc(161) int local161 = 0; local161 < local30; local161++) {
					local159 += local41[local161][local51];
				}
				local17[local51] = local152 * local159 >> 16;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4217(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass166_41.method4037(arg0);
		if (this.aClass166_41.aBoolean451) {
			@Pc(31) int local31 = this.anInt5439 + this.anInt5439 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(38) int[][][] local38 = new int[local31][][];
			@Pc(46) int local46 = this.anInt5442 + this.anInt5442 + 1;
			@Pc(50) int local50 = 65536 / local46;
			@Pc(72) int local72;
			@Pc(80) int local80;
			@Pc(78) int local78;
			for (@Pc(56) int local56 = arg0 - this.anInt5439; local56 <= this.anInt5439 + arg0; local56++) {
				@Pc(70) int[][] local70 = this.method4224(local56 & Static51.anInt1120, 0);
				local72 = 0;
				@Pc(76) int[][] local76 = new int[3][Static239.anInt4789];
				local78 = 0;
				local80 = 0;
				@Pc(84) int[] local84 = local70[0];
				@Pc(88) int[] local88 = local70[1];
				@Pc(92) int[] local92 = local70[2];
				for (@Pc(96) int local96 = -this.anInt5442; local96 <= this.anInt5442; local96++) {
					@Pc(108) int local108 = Static214.anInt4402 & local96;
					local80 += local88[local108];
					local78 += local92[local108];
					local72 += local84[local108];
				}
				@Pc(133) int[] local133 = local76[1];
				@Pc(137) int[] local137 = local76[2];
				@Pc(141) int[] local141 = local76[0];
				@Pc(143) int local143 = 0;
				while (local143 < Static239.anInt4789) {
					local141[local143] = local50 * local72 >> 16;
					local133[local143] = local80 * local50 >> 16;
					local137[local143] = local50 * local78 >> 16;
					@Pc(177) int local177 = Static214.anInt4402 & local143 - this.anInt5442;
					local143++;
					local78 -= local92[local177];
					local72 -= local84[local177];
					local80 -= local88[local177];
					@Pc(203) int local203 = this.anInt5442 + local143 & Static214.anInt4402;
					local80 += local88[local203];
					local72 += local84[local203];
					local78 += local92[local203];
				}
				local38[local56 + this.anInt5439 - arg0] = local76;
			}
			@Pc(240) int[] local240 = local18[0];
			@Pc(244) int[] local244 = local18[1];
			@Pc(248) int[] local248 = local18[2];
			for (local72 = 0; local72 < Static239.anInt4789; local72++) {
				local80 = 0;
				local78 = 0;
				@Pc(259) int local259 = 0;
				for (@Pc(261) int local261 = 0; local261 < local31; local261++) {
					@Pc(272) int[][] local272 = local38[local261];
					local78 += local272[1][local72];
					local80 += local272[0][local72];
					local259 += local272[2][local72];
				}
				local240[local72] = local35 * local80 >> 16;
				local244[local72] = local35 * local78 >> 16;
				local248[local72] = local259 * local35 >> 16;
			}
		}
		return local18;
	}
}
