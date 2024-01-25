import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class6_Sub5_Sub23 extends Class6_Sub5 {

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
	private int anInt4719 = 1;

	@OriginalMember(owner = "client!nb", name = "R", descriptor = "I")
	private int anInt4723 = 1;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method6545(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass162_41.method3811(arg0);
		if (super.aClass162_41.aBoolean291) {
			@Pc(28) int local28 = this.anInt4719 + this.anInt4719 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(41) int local41 = this.anInt4723 + this.anInt4723 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][][] local48 = new int[local28][][];
			@Pc(72) int local72;
			@Pc(74) int local74;
			for (@Pc(54) int local54 = arg0 - this.anInt4719; local54 <= arg0 + this.anInt4719; local54++) {
				@Pc(64) int[][] local64 = this.method6544(Static52.anInt1464 & local54, 0);
				@Pc(68) int[][] local68 = new int[3][Static240.anInt4386];
				@Pc(70) int local70 = 0;
				local72 = 0;
				local74 = 0;
				@Pc(78) int[] local78 = local64[0];
				@Pc(82) int[] local82 = local64[1];
				@Pc(86) int[] local86 = local64[2];
				for (@Pc(90) int local90 = -this.anInt4723; local90 <= this.anInt4723; local90++) {
					@Pc(96) int local96 = Static408.anInt7338 & local90;
					local72 += local82[local96];
					local70 += local78[local96];
					local74 += local86[local96];
				}
				@Pc(127) int[] local127 = local68[0];
				@Pc(131) int[] local131 = local68[1];
				@Pc(135) int[] local135 = local68[2];
				@Pc(137) int local137 = 0;
				while (local137 < Static240.anInt4386) {
					local127[local137] = local70 * local45 >> 16;
					local131[local137] = local72 * local45 >> 16;
					local135[local137] = local45 * local74 >> 16;
					@Pc(171) int local171 = local137 - this.anInt4723 & Static408.anInt7338;
					local74 -= local86[local171];
					local137++;
					local70 -= local78[local171];
					local72 -= local82[local171];
					@Pc(198) int local198 = local137 + this.anInt4723 & Static408.anInt7338;
					local70 += local78[local198];
					local74 += local86[local198];
					local72 += local82[local198];
				}
				local48[this.anInt4719 + local54 - arg0] = local68;
			}
			@Pc(245) int[] local245 = local16[0];
			@Pc(249) int[] local249 = local16[1];
			@Pc(253) int[] local253 = local16[2];
			for (local72 = 0; local72 < Static240.anInt4386; local72++) {
				local74 = 0;
				@Pc(261) int local261 = 0;
				@Pc(263) int local263 = 0;
				for (@Pc(265) int local265 = 0; local265 < local28; local265++) {
					@Pc(271) int[][] local271 = local48[local265];
					local74 += local271[0][local72];
					local263 += local271[2][local72];
					local261 += local271[1][local72];
				}
				local245[local72] = local32 * local74 >> 16;
				local249[local72] = local261 * local32 >> 16;
				local253[local72] = local263 * local32 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			@Pc(29) int local29 = this.anInt4719 + this.anInt4719 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(41) int local41 = this.anInt4723 + this.anInt4723 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][] local48 = new int[local29][];
			@Pc(69) int local69;
			for (@Pc(54) int local54 = arg0 - this.anInt4719; local54 <= arg0 + this.anInt4719; local54++) {
				@Pc(64) int[] local64 = this.method6543(0, local54 & Static52.anInt1464);
				@Pc(67) int[] local67 = new int[Static240.anInt4386];
				local69 = 0;
				for (@Pc(73) int local73 = -this.anInt4723; local73 <= this.anInt4723; local73++) {
					local69 += local64[Static408.anInt7338 & local73];
				}
				@Pc(94) int local94 = 0;
				while (Static240.anInt4386 > local94) {
					local67[local94] = local69 * local45 >> 16;
					local69 -= local64[local94 - this.anInt4723 & Static408.anInt7338];
					local94++;
					local69 += local64[Static408.anInt7338 & local94 + this.anInt4723];
				}
				local48[this.anInt4719 + local54 - arg0] = local67;
			}
			for (@Pc(159) int local159 = 0; local159 < Static240.anInt4386; local159++) {
				@Pc(163) int local163 = 0;
				for (local69 = 0; local69 < local29; local69++) {
					local163 += local48[local69][local159];
				}
				local17[local159] = local33 * local163 >> 16;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt4723 = arg1.method6433();
		} else if (arg0 == 1) {
			this.anInt4719 = arg1.method6433();
		} else if (arg0 == 2) {
			super.aBoolean495 = arg1.method6433() == 1;
		}
	}
}
