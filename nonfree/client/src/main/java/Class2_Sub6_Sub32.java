import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class2_Sub6_Sub32 extends Class2_Sub6 {

	@OriginalMember(owner = "client!uh", name = "H", descriptor = "I")
	private int anInt9346 = 1;

	@OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
	private int anInt9348 = 1;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt9346 = arg1.method8547();
		} else if (arg0 == 1) {
			this.anInt9348 = arg1.method8547();
		} else if (arg0 == 2) {
			super.aBoolean743 = arg1.method8547() == 1;
		}
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8470(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = super.aClass52_41.method962(arg0);
		if (super.aClass52_41.aBoolean88) {
			@Pc(28) int local28 = this.anInt9348 + this.anInt9348 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(41) int local41 = this.anInt9346 + this.anInt9346 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][][] local48 = new int[local28][][];
			@Pc(72) int local72;
			@Pc(74) int local74;
			for (@Pc(54) int local54 = arg0 - this.anInt9348; local54 <= this.anInt9348 + arg0; local54++) {
				@Pc(64) int[][] local64 = this.method8465(0, local54 & Static53.anInt1098);
				@Pc(68) int[][] local68 = new int[3][Static51.anInt1085];
				@Pc(70) int local70 = 0;
				local72 = 0;
				local74 = 0;
				@Pc(78) int[] local78 = local64[0];
				@Pc(82) int[] local82 = local64[1];
				@Pc(86) int[] local86 = local64[2];
				for (@Pc(90) int local90 = -this.anInt9346; local90 <= this.anInt9346; local90++) {
					@Pc(96) int local96 = local90 & Static332.anInt5256;
					local72 += local82[local96];
					local74 += local86[local96];
					local70 += local78[local96];
				}
				@Pc(127) int[] local127 = local68[0];
				@Pc(131) int[] local131 = local68[1];
				@Pc(135) int[] local135 = local68[2];
				@Pc(137) int local137 = 0;
				while (Static51.anInt1085 > local137) {
					local127[local137] = local45 * local70 >> 16;
					local131[local137] = local45 * local72 >> 16;
					local135[local137] = local45 * local74 >> 16;
					@Pc(171) int local171 = Static332.anInt5256 & local137 - this.anInt9346;
					local137++;
					local72 -= local82[local171];
					local74 -= local86[local171];
					local70 -= local78[local171];
					@Pc(198) int local198 = local137 + this.anInt9346 & Static332.anInt5256;
					local70 += local78[local198];
					local74 += local86[local198];
					local72 += local82[local198];
				}
				local48[local54 + this.anInt9348 - arg0] = local68;
			}
			@Pc(245) int[] local245 = local15[0];
			@Pc(249) int[] local249 = local15[1];
			@Pc(253) int[] local253 = local15[2];
			for (local72 = 0; local72 < Static51.anInt1085; local72++) {
				local74 = 0;
				@Pc(261) int local261 = 0;
				@Pc(263) int local263 = 0;
				for (@Pc(265) int local265 = 0; local265 < local28; local265++) {
					@Pc(271) int[][] local271 = local48[local265];
					local261 += local271[1][local72];
					local263 += local271[2][local72];
					local74 += local271[0][local72];
				}
				local245[local72] = local74 * local32 >> 16;
				local249[local72] = local261 * local32 >> 16;
				local253[local72] = local263 * local32 >> 16;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			@Pc(23) int local23 = this.anInt9348 + this.anInt9348 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt9346 + this.anInt9346 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][] local42 = new int[local23][];
			@Pc(63) int local63;
			for (@Pc(48) int local48 = arg0 - this.anInt9348; local48 <= this.anInt9348 + arg0; local48++) {
				@Pc(58) int[] local58 = this.method8461(0, Static53.anInt1098 & local48);
				@Pc(61) int[] local61 = new int[Static51.anInt1085];
				local63 = 0;
				for (@Pc(67) int local67 = -this.anInt9346; local67 <= this.anInt9346; local67++) {
					local63 += local58[Static332.anInt5256 & local67];
				}
				@Pc(84) int local84 = 0;
				while (Static51.anInt1085 > local84) {
					local61[local84] = local63 * local39 >> 16;
					local63 -= local58[Static332.anInt5256 & local84 - this.anInt9346];
					local84++;
					local63 += local58[Static332.anInt5256 & this.anInt9346 + local84];
				}
				local42[local48 + this.anInt9348 - arg0] = local61;
			}
			for (@Pc(141) int local141 = 0; local141 < Static51.anInt1085; local141++) {
				@Pc(145) int local145 = 0;
				for (local63 = 0; local63 < local23; local63++) {
					local145 += local42[local63][local141];
				}
				local11[local141] = local145 * local27 >> 16;
			}
		}
		return local11;
	}
}
