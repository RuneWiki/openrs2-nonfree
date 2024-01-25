import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!go", name = "L", descriptor = "I")
	private int anInt2238 = 1;

	@OriginalMember(owner = "client!go", name = "I", descriptor = "I")
	private int anInt2236 = 1;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt2236 = arg1.method3141();
		} else if (arg0 == 1) {
			this.anInt2238 = arg1.method3141();
		} else if (arg0 == 2) {
			super.aBoolean583 = arg1.method3141() == 1;
		}
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5664(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass129_41.method3671(arg0);
		if (super.aClass129_41.aBoolean338) {
			@Pc(29) int local29 = this.anInt2238 + this.anInt2238 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(41) int local41 = this.anInt2236 + this.anInt2236 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][][] local48 = new int[local29][][];
			@Pc(72) int local72;
			@Pc(74) int local74;
			for (@Pc(54) int local54 = arg0 - this.anInt2238; local54 <= this.anInt2238 + arg0; local54++) {
				@Pc(64) int[][] local64 = this.method5659(Static206.anInt4136 & local54, 0);
				@Pc(68) int[][] local68 = new int[3][Static251.anInt6509];
				@Pc(70) int local70 = 0;
				local72 = 0;
				local74 = 0;
				@Pc(78) int[] local78 = local64[0];
				@Pc(82) int[] local82 = local64[1];
				@Pc(86) int[] local86 = local64[2];
				for (@Pc(90) int local90 = -this.anInt2236; local90 <= this.anInt2236; local90++) {
					@Pc(96) int local96 = Static260.anInt5056 & local90;
					local72 += local82[local96];
					local74 += local86[local96];
					local70 += local78[local96];
				}
				@Pc(127) int[] local127 = local68[0];
				@Pc(131) int[] local131 = local68[1];
				@Pc(135) int[] local135 = local68[2];
				@Pc(137) int local137 = 0;
				while (local137 < Static251.anInt6509) {
					local127[local137] = local70 * local45 >> 16;
					local131[local137] = local72 * local45 >> 16;
					local135[local137] = local45 * local74 >> 16;
					@Pc(171) int local171 = Static260.anInt5056 & local137 - this.anInt2236;
					local137++;
					local70 -= local78[local171];
					local74 -= local86[local171];
					local72 -= local82[local171];
					@Pc(197) int local197 = local137 + this.anInt2236 & Static260.anInt5056;
					local72 += local82[local197];
					local70 += local78[local197];
					local74 += local86[local197];
				}
				local48[this.anInt2238 + local54 - arg0] = local68;
			}
			@Pc(246) int[] local246 = local11[0];
			@Pc(250) int[] local250 = local11[1];
			@Pc(254) int[] local254 = local11[2];
			for (local72 = 0; local72 < Static251.anInt6509; local72++) {
				local74 = 0;
				@Pc(262) int local262 = 0;
				@Pc(264) int local264 = 0;
				for (@Pc(266) int local266 = 0; local266 < local29; local266++) {
					@Pc(272) int[][] local272 = local48[local266];
					local264 += local272[2][local72];
					local74 += local272[0][local72];
					local262 += local272[1][local72];
				}
				local246[local72] = local74 * local33 >> 16;
				local250[local72] = local33 * local262 >> 16;
				local254[local72] = local264 * local33 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			@Pc(23) int local23 = this.anInt2238 + this.anInt2238 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(36) int local36 = this.anInt2236 + this.anInt2236 + 1;
			@Pc(40) int local40 = 65536 / local36;
			@Pc(43) int[][] local43 = new int[local23][];
			@Pc(64) int local64;
			for (@Pc(49) int local49 = arg0 - this.anInt2238; local49 <= this.anInt2238 + arg0; local49++) {
				@Pc(59) int[] local59 = this.method5654(0, local49 & Static206.anInt4136);
				@Pc(62) int[] local62 = new int[Static251.anInt6509];
				local64 = 0;
				for (@Pc(68) int local68 = -this.anInt2236; local68 <= this.anInt2236; local68++) {
					local64 += local59[Static260.anInt5056 & local68];
				}
				@Pc(85) int local85 = 0;
				while (local85 < Static251.anInt6509) {
					local62[local85] = local64 * local40 >> 16;
					local64 -= local59[local85 - this.anInt2236 & Static260.anInt5056];
					local85++;
					local64 += local59[Static260.anInt5056 & this.anInt2236 + local85];
				}
				local43[this.anInt2238 + local49 - arg0] = local62;
			}
			for (@Pc(141) int local141 = 0; local141 < Static251.anInt6509; local141++) {
				@Pc(145) int local145 = 0;
				for (local64 = 0; local64 < local23; local64++) {
					local145 += local43[local64][local141];
				}
				local11[local141] = local27 * local145 >> 16;
			}
		}
		return local11;
	}
}
