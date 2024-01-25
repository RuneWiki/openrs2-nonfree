import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class1_Sub5_Sub24 extends Class1_Sub5 {

	@OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
	private int anInt4781 = 1;

	@OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
	private int anInt4785 = 1;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			@Pc(27) int local27 = this.anInt4785 + this.anInt4785 + 1;
			@Pc(31) int local31 = 65536 / local27;
			@Pc(39) int local39 = this.anInt4781 + this.anInt4781 + 1;
			@Pc(43) int local43 = 65536 / local39;
			@Pc(46) int[][] local46 = new int[local27][];
			@Pc(67) int local67;
			for (@Pc(52) int local52 = arg0 - this.anInt4785; local52 <= arg0 + this.anInt4785; local52++) {
				@Pc(62) int[] local62 = this.method5802(0, local52 & Static42.anInt1137);
				@Pc(65) int[] local65 = new int[Static75.anInt1566];
				local67 = 0;
				for (@Pc(71) int local71 = -this.anInt4781; local71 <= this.anInt4781; local71++) {
					local67 += local62[local71 & Static239.anInt2816];
				}
				@Pc(92) int local92 = 0;
				while (Static75.anInt1566 > local92) {
					local65[local92] = local67 * local43 >> 16;
					local67 -= local62[Static239.anInt2816 & local92 - this.anInt4781];
					local92++;
					local67 += local62[Static239.anInt2816 & this.anInt4781 + local92];
				}
				local46[local52 + this.anInt4785 - arg0] = local65;
			}
			for (@Pc(156) int local156 = 0; local156 < Static75.anInt1566; local156++) {
				@Pc(160) int local160 = 0;
				for (local67 = 0; local67 < local27; local67++) {
					local160 += local46[local67][local156];
				}
				local15[local156] = local31 * local160 >> 16;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4781 = arg0.method5720();
		} else if (arg1 == 1) {
			this.anInt4785 = arg0.method5720();
		} else if (arg1 == 2) {
			super.aBoolean552 = arg0.method5720() == 1;
		}
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5811(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass151_41.method4015(arg0);
		if (super.aClass151_41.aBoolean368) {
			@Pc(28) int local28 = this.anInt4785 + this.anInt4785 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt4781 + this.anInt4781 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][][] local47 = new int[local28][][];
			@Pc(71) int local71;
			@Pc(73) int local73;
			for (@Pc(53) int local53 = arg0 - this.anInt4785; local53 <= this.anInt4785 + arg0; local53++) {
				@Pc(63) int[][] local63 = this.method5807(Static42.anInt1137 & local53, 0);
				@Pc(67) int[][] local67 = new int[3][Static75.anInt1566];
				@Pc(69) int local69 = 0;
				local71 = 0;
				local73 = 0;
				@Pc(77) int[] local77 = local63[0];
				@Pc(81) int[] local81 = local63[1];
				@Pc(85) int[] local85 = local63[2];
				for (@Pc(89) int local89 = -this.anInt4781; local89 <= this.anInt4781; local89++) {
					@Pc(95) int local95 = Static239.anInt2816 & local89;
					local73 += local85[local95];
					local71 += local81[local95];
					local69 += local77[local95];
				}
				@Pc(122) int[] local122 = local67[0];
				@Pc(126) int[] local126 = local67[1];
				@Pc(130) int[] local130 = local67[2];
				@Pc(132) int local132 = 0;
				while (Static75.anInt1566 > local132) {
					local122[local132] = local44 * local69 >> 16;
					local126[local132] = local44 * local71 >> 16;
					local130[local132] = local44 * local73 >> 16;
					@Pc(166) int local166 = local132 - this.anInt4781 & Static239.anInt2816;
					local73 -= local85[local166];
					local71 -= local81[local166];
					local69 -= local77[local166];
					local132++;
					@Pc(192) int local192 = this.anInt4781 + local132 & Static239.anInt2816;
					local73 += local85[local192];
					local71 += local81[local192];
					local69 += local77[local192];
				}
				local47[this.anInt4785 + local53 - arg0] = local67;
			}
			@Pc(242) int[] local242 = local16[0];
			@Pc(246) int[] local246 = local16[1];
			@Pc(250) int[] local250 = local16[2];
			for (local71 = 0; local71 < Static75.anInt1566; local71++) {
				local73 = 0;
				@Pc(258) int local258 = 0;
				@Pc(260) int local260 = 0;
				for (@Pc(262) int local262 = 0; local262 < local28; local262++) {
					@Pc(268) int[][] local268 = local47[local262];
					local73 += local268[0][local71];
					local260 += local268[2][local71];
					local258 += local268[1][local71];
				}
				local242[local71] = local32 * local73 >> 16;
				local246[local71] = local258 * local32 >> 16;
				local250[local71] = local32 * local260 >> 16;
			}
		}
		return local16;
	}
}
