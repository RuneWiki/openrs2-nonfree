import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bh", name = "bb", descriptor = "I")
	private int anInt413 = 1;

	@OriginalMember(owner = "client!bh", name = "db", descriptor = "I")
	private int anInt415 = 1;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt415 = arg0.method2771();
		} else if (arg1 == 1) {
			this.anInt413 = arg0.method2771();
		} else if (arg1 == 2) {
			super.aBoolean231 = arg0.method2771() == 1;
		}
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method3576(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass33_41.method1274(arg0);
		if (super.aClass33_41.aBoolean80) {
			@Pc(28) int local28 = this.anInt415 + this.anInt415 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt413 + this.anInt413 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][][] local47 = new int[local40][][];
			@Pc(70) int local70;
			@Pc(72) int local72;
			for (@Pc(52) int local52 = arg0 - this.anInt413; local52 <= arg0 + this.anInt413; local52++) {
				@Pc(62) int[][] local62 = this.method3579(local52 & Static91.anInt2110, 0);
				@Pc(66) int[][] local66 = new int[3][Static115.anInt2578];
				@Pc(68) int local68 = 0;
				local70 = 0;
				local72 = 0;
				@Pc(76) int[] local76 = local62[0];
				@Pc(80) int[] local80 = local62[1];
				@Pc(84) int[] local84 = local62[2];
				for (@Pc(88) int local88 = -this.anInt415; local88 <= this.anInt415; local88++) {
					@Pc(94) int local94 = local88 & Static48.anInt1202;
					local68 += local76[local94];
					local72 += local84[local94];
					local70 += local80[local94];
				}
				@Pc(125) int[] local125 = local66[0];
				@Pc(129) int[] local129 = local66[2];
				@Pc(133) int[] local133 = local66[1];
				@Pc(135) int local135 = 0;
				while (local135 < Static115.anInt2578) {
					local125[local135] = local68 * local32 >> 16;
					local133[local135] = local32 * local70 >> 16;
					local129[local135] = local32 * local72 >> 16;
					@Pc(169) int local169 = local135 - this.anInt415 & Static48.anInt1202;
					local68 -= local76[local169];
					local72 -= local84[local169];
					local135++;
					local70 -= local80[local169];
					@Pc(195) int local195 = local135 + this.anInt415 & Static48.anInt1202;
					local72 += local84[local195];
					local70 += local80[local195];
					local68 += local76[local195];
				}
				local47[this.anInt413 + local52 - arg0] = local66;
			}
			@Pc(245) int[] local245 = local16[0];
			@Pc(249) int[] local249 = local16[1];
			@Pc(253) int[] local253 = local16[2];
			for (local70 = 0; local70 < Static115.anInt2578; local70++) {
				local72 = 0;
				@Pc(261) int local261 = 0;
				@Pc(263) int local263 = 0;
				for (@Pc(265) int local265 = 0; local265 < local40; local265++) {
					@Pc(271) int[][] local271 = local47[local265];
					local72 += local271[0][local70];
					local263 += local271[2][local70];
					local261 += local271[1][local70];
				}
				local245[local70] = local44 * local72 >> 16;
				local249[local70] = local44 * local261 >> 16;
				local253[local70] = local44 * local263 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			@Pc(28) int local28 = this.anInt413 + this.anInt413 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(41) int local41 = this.anInt415 + this.anInt415 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][] local48 = new int[local28][];
			@Pc(69) int local69;
			for (@Pc(54) int local54 = arg0 - this.anInt413; local54 <= this.anInt413 + arg0; local54++) {
				@Pc(64) int[] local64 = this.method3580(local54 & Static91.anInt2110, 0);
				@Pc(67) int[] local67 = new int[Static115.anInt2578];
				local69 = 0;
				for (@Pc(73) int local73 = -this.anInt415; local73 <= this.anInt415; local73++) {
					local69 += local64[Static48.anInt1202 & local73];
				}
				@Pc(90) int local90 = 0;
				while (local90 < Static115.anInt2578) {
					local67[local90] = local69 * local45 >> 16;
					local69 -= local64[local90 - this.anInt415 & Static48.anInt1202];
					local90++;
					local69 += local64[this.anInt415 + local90 & Static48.anInt1202];
				}
				local48[this.anInt413 + local54 - arg0] = local67;
			}
			for (@Pc(150) int local150 = 0; local150 < Static115.anInt2578; local150++) {
				@Pc(154) int local154 = 0;
				for (local69 = 0; local69 < local28; local69++) {
					local154 += local48[local69][local150];
				}
				local12[local150] = local154 * local32 >> 16;
			}
		}
		return local12;
	}
}
