import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class4_Sub3_Sub27 extends Class4_Sub3 {

	@OriginalMember(owner = "client!nk", name = "G", descriptor = "I")
	private int anInt5053 = 1;

	@OriginalMember(owner = "client!nk", name = "L", descriptor = "I")
	private int anInt5056 = 1;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt5056 = arg1.method4614();
		} else if (arg0 == 1) {
			this.anInt5053 = arg1.method4614();
		} else if (arg0 == 2) {
			super.aBoolean587 = arg1.method4614() == 1;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6335(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass93_41.method2622(arg0);
		if (super.aClass93_41.aBoolean189) {
			@Pc(28) int local28 = this.anInt5053 + this.anInt5053 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(41) int local41 = this.anInt5056 + this.anInt5056 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][][] local48 = new int[local28][][];
			@Pc(72) int local72;
			@Pc(74) int local74;
			for (@Pc(54) int local54 = arg0 - this.anInt5053; local54 <= this.anInt5053 + arg0; local54++) {
				@Pc(64) int[][] local64 = this.method6331(Static429.anInt7355 & local54, 0);
				@Pc(68) int[][] local68 = new int[3][Static304.anInt5637];
				@Pc(70) int local70 = 0;
				local72 = 0;
				local74 = 0;
				@Pc(78) int[] local78 = local64[0];
				@Pc(82) int[] local82 = local64[1];
				@Pc(86) int[] local86 = local64[2];
				for (@Pc(90) int local90 = -this.anInt5056; local90 <= this.anInt5056; local90++) {
					@Pc(96) int local96 = local90 & Static279.anInt5254;
					local74 += local86[local96];
					local70 += local78[local96];
					local72 += local82[local96];
				}
				@Pc(127) int[] local127 = local68[0];
				@Pc(131) int[] local131 = local68[1];
				@Pc(135) int[] local135 = local68[2];
				@Pc(137) int local137 = 0;
				while (local137 < Static304.anInt5637) {
					local127[local137] = local70 * local45 >> 16;
					local131[local137] = local72 * local45 >> 16;
					local135[local137] = local74 * local45 >> 16;
					@Pc(171) int local171 = Static279.anInt5254 & local137 - this.anInt5056;
					local70 -= local78[local171];
					local137++;
					local72 -= local82[local171];
					local74 -= local86[local171];
					@Pc(197) int local197 = local137 + this.anInt5056 & Static279.anInt5254;
					local74 += local86[local197];
					local70 += local78[local197];
					local72 += local82[local197];
				}
				local48[this.anInt5053 + local54 - arg0] = local68;
			}
			@Pc(247) int[] local247 = local16[0];
			@Pc(251) int[] local251 = local16[1];
			@Pc(255) int[] local255 = local16[2];
			for (local72 = 0; local72 < Static304.anInt5637; local72++) {
				local74 = 0;
				@Pc(263) int local263 = 0;
				@Pc(265) int local265 = 0;
				for (@Pc(267) int local267 = 0; local267 < local28; local267++) {
					@Pc(273) int[][] local273 = local48[local267];
					local74 += local273[0][local72];
					local263 += local273[1][local72];
					local265 += local273[2][local72];
				}
				local247[local72] = local32 * local74 >> 16;
				local251[local72] = local32 * local263 >> 16;
				local255[local72] = local265 * local32 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			@Pc(28) int local28 = this.anInt5053 + this.anInt5053 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt5056 + this.anInt5056 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][] local47 = new int[local28][];
			@Pc(68) int local68;
			for (@Pc(53) int local53 = arg0 - this.anInt5053; local53 <= arg0 + this.anInt5053; local53++) {
				@Pc(63) int[] local63 = this.method6337(0, local53 & Static429.anInt7355);
				@Pc(66) int[] local66 = new int[Static304.anInt5637];
				local68 = 0;
				for (@Pc(72) int local72 = -this.anInt5056; local72 <= this.anInt5056; local72++) {
					local68 += local63[Static279.anInt5254 & local72];
				}
				@Pc(89) int local89 = 0;
				while (local89 < Static304.anInt5637) {
					local66[local89] = local68 * local44 >> 16;
					local68 -= local63[Static279.anInt5254 & local89 - this.anInt5056];
					local89++;
					local68 += local63[local89 + this.anInt5056 & Static279.anInt5254];
				}
				local47[this.anInt5053 + local53 - arg0] = local66;
			}
			for (@Pc(149) int local149 = 0; local149 < Static304.anInt5637; local149++) {
				@Pc(153) int local153 = 0;
				for (local68 = 0; local68 < local28; local68++) {
					local153 += local47[local68][local149];
				}
				local16[local149] = local153 * local32 >> 16;
			}
		}
		return local16;
	}
}
