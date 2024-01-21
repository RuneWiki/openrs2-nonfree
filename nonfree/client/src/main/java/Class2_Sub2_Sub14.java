import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class2_Sub2_Sub14 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
	private int anInt2291 = 1;

	@OriginalMember(owner = "client!ia", name = "ab", descriptor = "I")
	private int anInt2293 = 1;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt2293 = arg1.method218();
		} else if (arg0 == 1) {
			this.anInt2291 = arg1.method218();
		} else if (arg0 == 2) {
			super.aBoolean183 = arg1.method218() == 1;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			@Pc(29) int local29 = this.anInt2291 + this.anInt2291 + 1;
			@Pc(37) int local37 = this.anInt2293 + this.anInt2293 + 1;
			@Pc(41) int local41 = 65536 / local37;
			@Pc(44) int[][] local44 = new int[local29][];
			@Pc(48) int local48 = 65536 / local29;
			@Pc(58) int local58;
			for (@Pc(54) int local54 = arg0 - this.anInt2291; local54 <= this.anInt2291 + arg0; local54++) {
				local58 = 0;
				@Pc(66) int[] local66 = this.method3569(Static53.anInt1668 & local54, 0);
				@Pc(69) int[] local69 = new int[Static106.anInt3045];
				for (@Pc(73) int local73 = -this.anInt2293; local73 <= this.anInt2293; local73++) {
					local58 += local66[Static96.anInt3099 & local73];
				}
				@Pc(94) int local94 = 0;
				while (local94 < Static106.anInt3045) {
					local69[local94] = local58 * local41 >> 16;
					local58 -= local66[local94 - this.anInt2293 & Static96.anInt3099];
					local94++;
					local58 += local66[this.anInt2293 + local94 & Static96.anInt3099];
				}
				local44[local54 + this.anInt2291 - arg0] = local69;
			}
			for (@Pc(155) int local155 = 0; local155 < Static106.anInt3045; local155++) {
				@Pc(159) int local159 = 0;
				for (local58 = 0; local58 < local29; local58++) {
					local159 += local44[local58][local155];
				}
				local16[local155] = local48 * local159 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3568(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass90_41.method3443(arg0);
		if (super.aClass90_41.aBoolean177) {
			@Pc(19) int local19 = this.anInt2291 + this.anInt2291 + 1;
			@Pc(27) int local27 = this.anInt2293 + this.anInt2293 + 1;
			@Pc(31) int local31 = 65536 / local19;
			@Pc(35) int local35 = 65536 / local27;
			@Pc(38) int[][][] local38 = new int[local19][][];
			@Pc(62) int local62;
			@Pc(68) int local68;
			for (@Pc(44) int local44 = arg0 - this.anInt2291; local44 <= arg0 + this.anInt2291; local44++) {
				@Pc(54) int[][] local54 = this.method3557(local44 & Static53.anInt1668, 0);
				@Pc(58) int[][] local58 = new int[3][Static106.anInt3045];
				@Pc(60) int local60 = 0;
				local62 = 0;
				@Pc(66) int[] local66 = local54[1];
				local68 = 0;
				@Pc(72) int[] local72 = local54[2];
				@Pc(76) int[] local76 = local54[0];
				for (@Pc(80) int local80 = -this.anInt2293; local80 <= this.anInt2293; local80++) {
					@Pc(86) int local86 = Static96.anInt3099 & local80;
					local60 += local76[local86];
					local68 += local72[local86];
					local62 += local66[local86];
				}
				@Pc(117) int[] local117 = local58[1];
				@Pc(121) int[] local121 = local58[0];
				@Pc(125) int[] local125 = local58[2];
				@Pc(127) int local127 = 0;
				while (Static106.anInt3045 > local127) {
					local121[local127] = local60 * local35 >> 16;
					local117[local127] = local35 * local62 >> 16;
					local125[local127] = local68 * local35 >> 16;
					@Pc(160) int local160 = local127 - this.anInt2293 & Static96.anInt3099;
					local127++;
					local60 -= local76[local160];
					local68 -= local72[local160];
					local62 -= local66[local160];
					@Pc(187) int local187 = local127 + this.anInt2293 & Static96.anInt3099;
					local60 += local76[local187];
					local68 += local72[local187];
					local62 += local66[local187];
				}
				local38[this.anInt2291 + local44 - arg0] = local58;
			}
			@Pc(233) int[] local233 = local7[2];
			@Pc(237) int[] local237 = local7[1];
			@Pc(241) int[] local241 = local7[0];
			for (local62 = 0; local62 < Static106.anInt3045; local62++) {
				local68 = 0;
				@Pc(249) int local249 = 0;
				@Pc(251) int local251 = 0;
				for (@Pc(253) int local253 = 0; local253 < local19; local253++) {
					@Pc(259) int[][] local259 = local38[local253];
					local249 += local259[2][local62];
					local68 += local259[0][local62];
					local251 += local259[1][local62];
				}
				local241[local62] = local31 * local68 >> 16;
				local237[local62] = local31 * local251 >> 16;
				local233[local62] = local31 * local249 >> 16;
			}
		}
		return local7;
	}
}
