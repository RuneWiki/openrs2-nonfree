import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class6_Sub1_Sub36 extends Class6_Sub1 {

	@OriginalMember(owner = "client!vk", name = "L", descriptor = "I")
	private int anInt9373 = 1;

	@OriginalMember(owner = "client!vk", name = "N", descriptor = "I")
	private int anInt9375 = 1;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			@Pc(29) int local29 = this.anInt9373 + this.anInt9373 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(41) int local41 = this.anInt9375 + this.anInt9375 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][] local48 = new int[local29][];
			@Pc(69) int local69;
			for (@Pc(54) int local54 = arg0 - this.anInt9373; local54 <= arg0 + this.anInt9373; local54++) {
				@Pc(64) int[] local64 = this.method8165(0, Static574.anInt9711 & local54);
				@Pc(67) int[] local67 = new int[Static289.anInt5549];
				local69 = 0;
				for (@Pc(73) int local73 = -this.anInt9375; local73 <= this.anInt9375; local73++) {
					local69 += local64[local73 & Static153.anInt3343];
				}
				@Pc(94) int local94 = 0;
				while (local94 < Static289.anInt5549) {
					local67[local94] = local45 * local69 >> 16;
					local69 -= local64[Static153.anInt3343 & local94 - this.anInt9375];
					local94++;
					local69 += local64[this.anInt9375 + local94 & Static153.anInt3343];
				}
				local48[this.anInt9373 + local54 - arg0] = local67;
			}
			for (@Pc(150) int local150 = 0; local150 < Static289.anInt5549; local150++) {
				@Pc(154) int local154 = 0;
				for (local69 = 0; local69 < local29; local69++) {
					local154 += local48[local69][local150];
				}
				local17[local150] = local33 * local154 >> 16;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8158(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass184_41.method4578(arg0);
		if (super.aClass184_41.aBoolean402) {
			@Pc(28) int local28 = this.anInt9373 + this.anInt9373 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(41) int local41 = this.anInt9375 + this.anInt9375 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][][] local48 = new int[local28][][];
			@Pc(72) int local72;
			@Pc(74) int local74;
			for (@Pc(54) int local54 = arg0 - this.anInt9373; local54 <= this.anInt9373 + arg0; local54++) {
				@Pc(64) int[][] local64 = this.method8162(Static574.anInt9711 & local54, 0);
				@Pc(68) int[][] local68 = new int[3][Static289.anInt5549];
				@Pc(70) int local70 = 0;
				local72 = 0;
				local74 = 0;
				@Pc(78) int[] local78 = local64[0];
				@Pc(82) int[] local82 = local64[1];
				@Pc(86) int[] local86 = local64[2];
				for (@Pc(90) int local90 = -this.anInt9375; local90 <= this.anInt9375; local90++) {
					@Pc(96) int local96 = Static153.anInt3343 & local90;
					local74 += local86[local96];
					local72 += local82[local96];
					local70 += local78[local96];
				}
				@Pc(127) int[] local127 = local68[0];
				@Pc(131) int[] local131 = local68[1];
				@Pc(135) int[] local135 = local68[2];
				@Pc(137) int local137 = 0;
				while (local137 < Static289.anInt5549) {
					local127[local137] = local70 * local45 >> 16;
					local131[local137] = local72 * local45 >> 16;
					local135[local137] = local74 * local45 >> 16;
					@Pc(171) int local171 = local137 - this.anInt9375 & Static153.anInt3343;
					local137++;
					local72 -= local82[local171];
					local70 -= local78[local171];
					local74 -= local86[local171];
					@Pc(197) int local197 = local137 + this.anInt9375 & Static153.anInt3343;
					local70 += local78[local197];
					local72 += local82[local197];
					local74 += local86[local197];
				}
				local48[this.anInt9373 + local54 - arg0] = local68;
			}
			@Pc(238) int[] local238 = local11[0];
			@Pc(242) int[] local242 = local11[1];
			@Pc(246) int[] local246 = local11[2];
			for (local72 = 0; local72 < Static289.anInt5549; local72++) {
				local74 = 0;
				@Pc(254) int local254 = 0;
				@Pc(256) int local256 = 0;
				for (@Pc(258) int local258 = 0; local258 < local28; local258++) {
					@Pc(264) int[][] local264 = local48[local258];
					local256 += local264[2][local72];
					local254 += local264[1][local72];
					local74 += local264[0][local72];
				}
				local238[local72] = local74 * local32 >> 16;
				local242[local72] = local254 * local32 >> 16;
				local246[local72] = local32 * local256 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt9375 = arg1.method4966();
		} else if (arg0 == 1) {
			this.anInt9373 = arg1.method4966();
		} else if (arg0 == 2) {
			super.aBoolean719 = arg1.method4966() == 1;
		}
	}
}
