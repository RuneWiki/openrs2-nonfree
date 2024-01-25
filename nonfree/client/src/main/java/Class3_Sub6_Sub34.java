import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class3_Sub6_Sub34 extends Class3_Sub6 {

	@OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
	private int anInt8507 = 1;

	@OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
	private int anInt8505 = 1;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			@Pc(28) int local28 = this.anInt8507 + this.anInt8507 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(41) int local41 = this.anInt8505 + this.anInt8505 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][] local48 = new int[local28][];
			@Pc(68) int local68;
			for (@Pc(53) int local53 = arg0 - this.anInt8507; local53 <= arg0 + this.anInt8507; local53++) {
				@Pc(63) int[] local63 = this.method7769(local53 & Static68.anInt1579, 0);
				@Pc(66) int[] local66 = new int[Static521.anInt8383];
				local68 = 0;
				for (@Pc(72) int local72 = -this.anInt8505; local72 <= this.anInt8505; local72++) {
					local68 += local63[local72 & Static296.anInt5049];
				}
				@Pc(89) int local89 = 0;
				while (Static521.anInt8383 > local89) {
					local66[local89] = local68 * local45 >> 16;
					local68 -= local63[Static296.anInt5049 & local89 - this.anInt8505];
					local89++;
					local68 += local63[local89 + this.anInt8505 & Static296.anInt5049];
				}
				local48[local53 + this.anInt8507 - arg0] = local66;
			}
			for (@Pc(146) int local146 = 0; local146 < Static521.anInt8383; local146++) {
				@Pc(150) int local150 = 0;
				for (local68 = 0; local68 < local28; local68++) {
					local150 += local48[local68][local146];
				}
				local11[local146] = local32 * local150 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8505 = arg0.method5175();
		} else if (arg1 == 1) {
			this.anInt8507 = arg0.method5175();
		} else if (arg1 == 2) {
			super.aBoolean729 = arg0.method5175() == 1;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method7776(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass155_41.method3666(arg0);
		if (super.aClass155_41.aBoolean306) {
			@Pc(29) int local29 = this.anInt8507 + this.anInt8507 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(41) int local41 = this.anInt8505 + this.anInt8505 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][][] local48 = new int[local29][][];
			@Pc(72) int local72;
			@Pc(74) int local74;
			for (@Pc(54) int local54 = arg0 - this.anInt8507; local54 <= this.anInt8507 + arg0; local54++) {
				@Pc(64) int[][] local64 = this.method7773(0, Static68.anInt1579 & local54);
				@Pc(68) int[][] local68 = new int[3][Static521.anInt8383];
				@Pc(70) int local70 = 0;
				local72 = 0;
				local74 = 0;
				@Pc(78) int[] local78 = local64[0];
				@Pc(82) int[] local82 = local64[1];
				@Pc(86) int[] local86 = local64[2];
				for (@Pc(90) int local90 = -this.anInt8505; local90 <= this.anInt8505; local90++) {
					@Pc(96) int local96 = Static296.anInt5049 & local90;
					local74 += local86[local96];
					local72 += local82[local96];
					local70 += local78[local96];
				}
				@Pc(127) int[] local127 = local68[0];
				@Pc(131) int[] local131 = local68[1];
				@Pc(135) int[] local135 = local68[2];
				@Pc(137) int local137 = 0;
				while (Static521.anInt8383 > local137) {
					local127[local137] = local45 * local70 >> 16;
					local131[local137] = local45 * local72 >> 16;
					local135[local137] = local74 * local45 >> 16;
					@Pc(171) int local171 = Static296.anInt5049 & local137 - this.anInt8505;
					local72 -= local82[local171];
					local70 -= local78[local171];
					local74 -= local86[local171];
					local137++;
					@Pc(198) int local198 = local137 + this.anInt8505 & Static296.anInt5049;
					local70 += local78[local198];
					local74 += local86[local198];
					local72 += local82[local198];
				}
				local48[local54 + this.anInt8507 - arg0] = local68;
			}
			@Pc(245) int[] local245 = local16[0];
			@Pc(249) int[] local249 = local16[1];
			@Pc(253) int[] local253 = local16[2];
			for (local72 = 0; local72 < Static521.anInt8383; local72++) {
				local74 = 0;
				@Pc(261) int local261 = 0;
				@Pc(263) int local263 = 0;
				for (@Pc(265) int local265 = 0; local265 < local29; local265++) {
					@Pc(271) int[][] local271 = local48[local265];
					local263 += local271[2][local72];
					local74 += local271[0][local72];
					local261 += local271[1][local72];
				}
				local245[local72] = local33 * local74 >> 16;
				local249[local72] = local261 * local33 >> 16;
				local253[local72] = local33 * local263 >> 16;
			}
		}
		return local16;
	}
}
