import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class4_Sub6_Sub1 extends Class4_Sub6 {

	@OriginalMember(owner = "client!be", name = "O", descriptor = "I")
	private int anInt445 = 1;

	@OriginalMember(owner = "client!be", name = "R", descriptor = "I")
	private int anInt447 = 1;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt445 = arg1.method3440();
		} else if (arg0 == 1) {
			this.anInt447 = arg1.method3440();
		} else if (arg0 == 2) {
			super.aBoolean489 = arg1.method3440() == 1;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			@Pc(31) int local31 = this.anInt447 + this.anInt447 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt445 + this.anInt445 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][] local50 = new int[local31][];
			@Pc(70) int local70;
			for (@Pc(55) int local55 = arg0 - this.anInt447; local55 <= arg0 + this.anInt447; local55++) {
				@Pc(65) int[] local65 = this.method5702(Static341.anInt266 & local55, 0);
				@Pc(68) int[] local68 = new int[Static31.anInt797];
				local70 = 0;
				for (@Pc(74) int local74 = -this.anInt445; local74 <= this.anInt445; local74++) {
					local70 += local65[Static335.anInt6403 & local74];
				}
				@Pc(91) int local91 = 0;
				while (Static31.anInt797 > local91) {
					local68[local91] = local47 * local70 >> 16;
					local70 -= local65[local91 - this.anInt445 & Static335.anInt6403];
					local91++;
					local70 += local65[local91 + this.anInt445 & Static335.anInt6403];
				}
				local50[this.anInt447 + local55 - arg0] = local68;
			}
			for (@Pc(151) int local151 = 0; local151 < Static31.anInt797; local151++) {
				@Pc(155) int local155 = 0;
				for (local70 = 0; local70 < local31; local70++) {
					local155 += local50[local70][local151];
				}
				local11[local151] = local35 * local155 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5694(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass90_41.method2575(arg0);
		if (super.aClass90_41.aBoolean211) {
			@Pc(31) int local31 = this.anInt447 + this.anInt447 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt445 + this.anInt445 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][][] local50 = new int[local31][][];
			@Pc(76) int local76;
			@Pc(78) int local78;
			for (@Pc(56) int local56 = arg0 - this.anInt447; local56 <= this.anInt447 + arg0; local56++) {
				@Pc(68) int[][] local68 = this.method5693(0, local56 & Static341.anInt266);
				@Pc(72) int[][] local72 = new int[3][Static31.anInt797];
				@Pc(74) int local74 = 0;
				local76 = 0;
				local78 = 0;
				@Pc(82) int[] local82 = local68[0];
				@Pc(86) int[] local86 = local68[1];
				@Pc(90) int[] local90 = local68[2];
				for (@Pc(94) int local94 = -this.anInt445; local94 <= this.anInt445; local94++) {
					@Pc(100) int local100 = local94 & Static335.anInt6403;
					local78 += local90[local100];
					local74 += local82[local100];
					local76 += local86[local100];
				}
				@Pc(127) int[] local127 = local72[0];
				@Pc(131) int[] local131 = local72[1];
				@Pc(135) int[] local135 = local72[2];
				@Pc(137) int local137 = 0;
				while (local137 < Static31.anInt797) {
					local127[local137] = local47 * local74 >> 16;
					local131[local137] = local76 * local47 >> 16;
					local135[local137] = local47 * local78 >> 16;
					@Pc(171) int local171 = local137 - this.anInt445 & Static335.anInt6403;
					local78 -= local90[local171];
					local76 -= local86[local171];
					local74 -= local82[local171];
					local137++;
					@Pc(197) int local197 = this.anInt445 + local137 & Static335.anInt6403;
					local74 += local82[local197];
					local76 += local86[local197];
					local78 += local90[local197];
				}
				local50[this.anInt447 + local56 - arg0] = local72;
			}
			@Pc(243) int[] local243 = local19[0];
			@Pc(247) int[] local247 = local19[1];
			@Pc(251) int[] local251 = local19[2];
			for (local76 = 0; local76 < Static31.anInt797; local76++) {
				local78 = 0;
				@Pc(259) int local259 = 0;
				@Pc(261) int local261 = 0;
				for (@Pc(263) int local263 = 0; local263 < local31; local263++) {
					@Pc(269) int[][] local269 = local50[local263];
					local261 += local269[2][local76];
					local259 += local269[1][local76];
					local78 += local269[0][local76];
				}
				local243[local76] = local35 * local78 >> 16;
				local247[local76] = local259 * local35 >> 16;
				local251[local76] = local261 * local35 >> 16;
			}
		}
		return local19;
	}
}
