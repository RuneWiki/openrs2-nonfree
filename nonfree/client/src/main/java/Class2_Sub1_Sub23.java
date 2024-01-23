import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class2_Sub1_Sub23 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ng", name = "V", descriptor = "I")
	private int anInt3728 = 1;

	@OriginalMember(owner = "client!ng", name = "U", descriptor = "I")
	private int anInt3727 = 1;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4941(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = this.aClass150_41.method3894(arg0);
		if (this.aClass150_41.aBoolean405) {
			@Pc(25) int local25 = this.anInt3727 + this.anInt3727 + 1;
			@Pc(29) int local29 = 65536 / local25;
			@Pc(37) int local37 = this.anInt3728 + this.anInt3728 + 1;
			@Pc(41) int local41 = 65536 / local37;
			@Pc(44) int[][][] local44 = new int[local25][][];
			@Pc(70) int local70;
			@Pc(72) int local72;
			@Pc(74) int local74;
			for (@Pc(50) int local50 = arg0 - this.anInt3727; local50 <= this.anInt3727 + arg0; local50++) {
				@Pc(64) int[][] local64 = this.method4937(0, local50 & Static39.anInt939);
				@Pc(68) int[][] local68 = new int[3][Static114.anInt1359];
				local70 = 0;
				local72 = 0;
				local74 = 0;
				@Pc(78) int[] local78 = local64[0];
				@Pc(82) int[] local82 = local64[2];
				@Pc(86) int[] local86 = local64[1];
				for (@Pc(90) int local90 = -this.anInt3728; local90 <= this.anInt3728; local90++) {
					@Pc(102) int local102 = local90 & Static129.anInt2676;
					local72 += local86[local102];
					local74 += local82[local102];
					local70 += local78[local102];
				}
				@Pc(127) int[] local127 = local68[1];
				@Pc(131) int[] local131 = local68[0];
				@Pc(135) int[] local135 = local68[2];
				@Pc(137) int local137 = 0;
				while (Static114.anInt1359 > local137) {
					local131[local137] = local41 * local70 >> 16;
					local127[local137] = local41 * local72 >> 16;
					local135[local137] = local74 * local41 >> 16;
					@Pc(176) int local176 = local137 - this.anInt3728 & Static129.anInt2676;
					local74 -= local82[local176];
					local72 -= local86[local176];
					local137++;
					local70 -= local78[local176];
					@Pc(202) int local202 = local137 + this.anInt3728 & Static129.anInt2676;
					local70 += local78[local202];
					local72 += local86[local202];
					local74 += local82[local202];
				}
				local44[this.anInt3727 + local50 - arg0] = local68;
			}
			@Pc(238) int[] local238 = local13[1];
			@Pc(242) int[] local242 = local13[2];
			@Pc(246) int[] local246 = local13[0];
			for (local70 = 0; local70 < Static114.anInt1359; local70++) {
				local72 = 0;
				local74 = 0;
				@Pc(257) int local257 = 0;
				for (@Pc(259) int local259 = 0; local259 < local25; local259++) {
					@Pc(266) int[][] local266 = local44[local259];
					local257 += local266[2][local70];
					local74 += local266[1][local70];
					local72 += local266[0][local70];
				}
				local246[local70] = local72 * local29 >> 16;
				local238[local70] = local74 * local29 >> 16;
				local242[local70] = local29 * local257 >> 16;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3728 = arg0.method4261();
		} else if (arg1 == 1) {
			this.anInt3727 = arg0.method4261();
		} else if (arg1 == 2) {
			this.aBoolean492 = arg0.method4261() == 1;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			@Pc(29) int local29 = this.anInt3727 + this.anInt3727 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(41) int local41 = this.anInt3728 + this.anInt3728 + 1;
			@Pc(44) int[][] local44 = new int[local29][];
			@Pc(48) int local48 = 65536 / local41;
			@Pc(54) int local54;
			for (local54 = arg0 - this.anInt3727; local54 <= arg0 + this.anInt3727; local54++) {
				@Pc(72) int[] local72 = this.method4946(local54 & Static39.anInt939, 0);
				@Pc(75) int[] local75 = new int[Static114.anInt1359];
				@Pc(77) int local77 = 0;
				@Pc(81) int local81;
				for (local81 = -this.anInt3728; local81 <= this.anInt3728; local81++) {
					local77 += local72[Static129.anInt2676 & local81];
				}
				local81 = 0;
				while (Static114.anInt1359 > local81) {
					local75[local81] = local77 * local48 >> 16;
					local77 -= local72[Static129.anInt2676 & local81 - this.anInt3728];
					local81++;
					local77 += local72[Static129.anInt2676 & local81 + this.anInt3728];
				}
				local44[this.anInt3727 + local54 - arg0] = local75;
			}
			for (local54 = 0; local54 < Static114.anInt1359; local54++) {
				@Pc(166) int local166 = 0;
				for (@Pc(168) int local168 = 0; local168 < local29; local168++) {
					local166 += local44[local168][local54];
				}
				local17[local54] = local33 * local166 >> 16;
			}
		}
		return local17;
	}
}
