import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class5_Sub2_Sub9 extends Class5_Sub2 {

	@OriginalMember(owner = "client!dw", name = "G", descriptor = "I")
	private int anInt2090 = 1;

	@OriginalMember(owner = "client!dw", name = "H", descriptor = "I")
	private int anInt2091 = 1;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2090 = arg0.method5966();
		} else if (arg1 == 1) {
			this.anInt2091 = arg0.method5966();
		} else if (arg1 == 2) {
			super.aBoolean762 = arg0.method5966() == 1;
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			@Pc(29) int local29 = this.anInt2091 + this.anInt2091 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(41) int local41 = this.anInt2090 + this.anInt2090 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][] local48 = new int[local29][];
			@Pc(69) int local69;
			for (@Pc(54) int local54 = arg0 - this.anInt2091; local54 <= this.anInt2091 + arg0; local54++) {
				@Pc(64) int[] local64 = this.method9042(Static273.anInt4903 & local54, 0);
				@Pc(67) int[] local67 = new int[Static597.anInt10025];
				local69 = 0;
				for (@Pc(73) int local73 = -this.anInt2090; local73 <= this.anInt2090; local73++) {
					local69 += local64[local73 & Static28.anInt365];
				}
				@Pc(90) int local90 = 0;
				while (local90 < Static597.anInt10025) {
					local67[local90] = local45 * local69 >> 16;
					local69 -= local64[Static28.anInt365 & local90 - this.anInt2090];
					local90++;
					local69 += local64[Static28.anInt365 & local90 + this.anInt2090];
				}
				local48[local54 + this.anInt2091 - arg0] = local67;
			}
			for (@Pc(146) int local146 = 0; local146 < Static597.anInt10025; local146++) {
				@Pc(150) int local150 = 0;
				for (local69 = 0; local69 < local29; local69++) {
					local150 += local48[local69][local146];
				}
				local11[local146] = local33 * local150 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method9037(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass160_41.method3854(arg0);
		if (super.aClass160_41.aBoolean310) {
			@Pc(32) int local32 = this.anInt2091 + this.anInt2091 + 1;
			@Pc(36) int local36 = 65536 / local32;
			@Pc(45) int local45 = this.anInt2090 + this.anInt2090 + 1;
			@Pc(49) int local49 = 65536 / local45;
			@Pc(52) int[][][] local52 = new int[local32][][];
			@Pc(76) int local76;
			@Pc(78) int local78;
			for (@Pc(58) int local58 = arg0 - this.anInt2091; local58 <= arg0 + this.anInt2091; local58++) {
				@Pc(68) int[][] local68 = this.method9033(0, local58 & Static273.anInt4903);
				@Pc(72) int[][] local72 = new int[3][Static597.anInt10025];
				@Pc(74) int local74 = 0;
				local76 = 0;
				local78 = 0;
				@Pc(82) int[] local82 = local68[0];
				@Pc(86) int[] local86 = local68[1];
				@Pc(90) int[] local90 = local68[2];
				for (@Pc(94) int local94 = -this.anInt2090; local94 <= this.anInt2090; local94++) {
					@Pc(100) int local100 = local94 & Static28.anInt365;
					local74 += local82[local100];
					local78 += local90[local100];
					local76 += local86[local100];
				}
				@Pc(131) int[] local131 = local72[0];
				@Pc(135) int[] local135 = local72[1];
				@Pc(139) int[] local139 = local72[2];
				@Pc(141) int local141 = 0;
				while (Static597.anInt10025 > local141) {
					local131[local141] = local49 * local74 >> 16;
					local135[local141] = local49 * local76 >> 16;
					local139[local141] = local78 * local49 >> 16;
					@Pc(175) int local175 = local141 - this.anInt2090 & Static28.anInt365;
					local76 -= local86[local175];
					local78 -= local90[local175];
					local141++;
					local74 -= local82[local175];
					@Pc(202) int local202 = local141 + this.anInt2090 & Static28.anInt365;
					local76 += local86[local202];
					local74 += local82[local202];
					local78 += local90[local202];
				}
				local52[this.anInt2091 + local58 - arg0] = local72;
			}
			@Pc(244) int[] local244 = local19[0];
			@Pc(248) int[] local248 = local19[1];
			@Pc(252) int[] local252 = local19[2];
			for (local76 = 0; local76 < Static597.anInt10025; local76++) {
				local78 = 0;
				@Pc(260) int local260 = 0;
				@Pc(262) int local262 = 0;
				for (@Pc(264) int local264 = 0; local264 < local32; local264++) {
					@Pc(270) int[][] local270 = local52[local264];
					local260 += local270[1][local76];
					local262 += local270[2][local76];
					local78 += local270[0][local76];
				}
				local244[local76] = local36 * local78 >> 16;
				local248[local76] = local260 * local36 >> 16;
				local252[local76] = local262 * local36 >> 16;
			}
		}
		return local19;
	}
}
