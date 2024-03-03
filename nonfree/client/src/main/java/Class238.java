import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class238 {

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "[F")
	private static final float[] aFloatArray30 = new float[] { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F, 1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F, 1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F, 2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F, 2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F, 3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F, 4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F, 6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F, 7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F, 1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F, 1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F, 1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F, 2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F, 2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F, 3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F, 4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F, 5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F, 7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F, 1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F, 1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F, 1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F, 2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F, 2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F, 3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F, 4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F, 6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F, 7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F, 1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F, 1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F, 1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F, 2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F, 2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F, 3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F, 4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F, 5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F, 7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F, 9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F, 0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F, 0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F, 0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F, 0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F, 0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F, 0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F, 0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F, 0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F, 0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F, 0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F, 0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F, 0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F, 0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F, 0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F, 0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F, 0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F, 0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F, 0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F, 0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F, 0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F, 0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F, 0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F, 0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F, 0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F };

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "[I")
	private static final int[] anIntArray471 = new int[] { 256, 128, 86, 64 };

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "[I")
	private final int[] anIntArray474;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "[I")
	private final int[] anIntArray472;

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "[I")
	private final int[] anIntArray473;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "[I")
	private final int[] anIntArray469;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "[[I")
	private final int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
	private final int anInt6759;

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "[I")
	private final int[] anIntArray475;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V", line = 307)
	public Class238() {
		@Pc(4) int local4 = Static246.method4514(16);
		if (local4 != 1) {
			throw new RuntimeException();
		}
		@Pc(14) int local14 = Static246.method4514(5);
		@Pc(16) int local16 = 0;
		this.anIntArray474 = new int[local14];
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < local14; local22++) {
			local26 = Static246.method4514(4);
			this.anIntArray474[local22] = local26;
			if (local26 >= local16) {
				local16 = local26 + 1;
			}
		}
		this.anIntArray472 = new int[local16];
		this.anIntArray473 = new int[local16];
		this.anIntArray469 = new int[local16];
		this.anIntArrayArray60 = new int[local16][];
		@Pc(77) int local77;
		@Pc(99) int local99;
		for (local26 = 0; local26 < local16; local26++) {
			this.anIntArray472[local26] = Static246.method4514(3) + 1;
			local77 = this.anIntArray473[local26] = Static246.method4514(2);
			if (local77 != 0) {
				this.anIntArray469[local26] = Static246.method4514(8);
			}
			local77 = 0x1 << local77;
			@Pc(92) int[] local92 = new int[local77];
			this.anIntArrayArray60[local26] = local92;
			for (local99 = 0; local99 < local77; local99++) {
				local92[local99] = Static246.method4514(8) - 1;
			}
		}
		this.anInt6759 = Static246.method4514(2) + 1;
		local77 = Static246.method4514(4);
		@Pc(126) int local126 = 2;
		for (local99 = 0; local99 < local14; local99++) {
			local126 += this.anIntArray472[this.anIntArray474[local99]];
		}
		this.anIntArray475 = new int[local126];
		this.anIntArray475[0] = 0;
		this.anIntArray475[1] = 0x1 << local77;
		local126 = 2;
		for (@Pc(163) int local163 = 0; local163 < local14; local163++) {
			@Pc(169) int local169 = this.anIntArray474[local163];
			for (@Pc(171) int local171 = 0; local171 < this.anIntArray472[local169]; local171++) {
				this.anIntArray475[local126++] = Static246.method4514(local77);
			}
		}
		if (Static337.anIntArray470 == null || Static337.anIntArray470.length < local126) {
			Static337.anIntArray470 = new int[local126];
			Static337.anIntArray468 = new int[local126];
			Static337.aBooleanArray60 = new boolean[local126];
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII[FI)V", line = 7)
	private void method6057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4[arg0] *= aFloatArray30[arg1];
		if (arg2 > arg5) {
			arg2 = arg5;
		}
		for (@Pc(61) int local61 = arg0 + 1; local61 < arg2; local61++) {
			local22 += local43;
			if (local22 >= local7) {
				local22 -= local7;
				local20 += local32;
			} else {
				local20 += local18;
			}
			arg4[local61] *= aFloatArray30[local20];
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "([FI)V", line = 57)
	public void method6058(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = this.anIntArray475.length;
		@Pc(10) int local10 = anIntArray471[this.anInt6759 - 1];
		Static337.aBooleanArray60[0] = Static337.aBooleanArray60[1] = true;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(55) int local55;
		for (@Pc(20) int local20 = 2; local20 < local3; local20++) {
			local25 = Static337.method6060(Static337.anIntArray470, local20);
			local29 = Static337.method6061(Static337.anIntArray470, local20);
			local47 = this.method6063(Static337.anIntArray470[local25], Static337.anIntArray468[local25], Static337.anIntArray470[local29], Static337.anIntArray468[local29], Static337.anIntArray470[local20]);
			local51 = Static337.anIntArray468[local20];
			local55 = local10 - local47;
			@Pc(66) int local66 = (local55 < local47 ? local55 : local47) << 1;
			if (local51 == 0) {
				Static337.aBooleanArray60[local20] = false;
				Static337.anIntArray468[local20] = local47;
			} else {
				Static337.aBooleanArray60[local25] = Static337.aBooleanArray60[local29] = true;
				Static337.aBooleanArray60[local20] = true;
				if (local51 >= local66) {
					Static337.anIntArray468[local20] = local55 > local47 ? local51 + local47 - local47 : local47 - local51 + local55 - 1;
				} else {
					Static337.anIntArray468[local20] = (local51 & 0x1) == 0 ? local47 + local51 / 2 : local47 - (local51 + 1) / 2;
				}
			}
		}
		this.method6059(0, local3 - 1);
		local25 = 0;
		local29 = Static337.anIntArray468[0] * this.anInt6759;
		for (local47 = 1; local47 < local3; local47++) {
			if (Static337.aBooleanArray60[local47]) {
				local51 = Static337.anIntArray470[local47];
				local55 = Static337.anIntArray468[local47] * this.anInt6759;
				this.method6057(local25, local29, local51, local55, arg0, arg1);
				if (local51 >= arg1) {
					return;
				}
				local25 = local51;
				local29 = local55;
			}
		}
		@Pc(193) float local193 = aFloatArray30[local29];
		for (local55 = local25; local55 < arg1; local55++) {
			arg0[local55] *= local193;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V", line = 141)
	private void method6059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(9) int local9 = Static337.anIntArray470[arg0];
		@Pc(13) int local13 = Static337.anIntArray468[arg0];
		@Pc(17) boolean local17 = Static337.aBooleanArray60[arg0];
		for (@Pc(21) int local21 = arg0 + 1; local21 <= arg1; local21++) {
			@Pc(26) int local26 = Static337.anIntArray470[local21];
			if (local26 < local9) {
				Static337.anIntArray470[local5] = local26;
				Static337.anIntArray468[local5] = Static337.anIntArray468[local21];
				Static337.aBooleanArray60[local5] = Static337.aBooleanArray60[local21];
				local5++;
				Static337.anIntArray470[local21] = Static337.anIntArray470[local5];
				Static337.anIntArray468[local21] = Static337.anIntArray468[local5];
				Static337.aBooleanArray60[local21] = Static337.aBooleanArray60[local5];
			}
		}
		Static337.anIntArray470[local5] = local9;
		Static337.anIntArray468[local5] = local13;
		Static337.aBooleanArray60[local5] = local17;
		this.method6059(arg0, local5 - 1);
		this.method6059(local5 + 1, arg1);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "()Z", line = 234)
	public boolean method6062() {
		@Pc(5) boolean local5 = Static246.method4523() != 0;
		if (!local5) {
			return false;
		}
		@Pc(13) int local13 = this.anIntArray475.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			Static337.anIntArray470[local15] = this.anIntArray475[local15];
		}
		@Pc(34) int local34 = anIntArray471[this.anInt6759 - 1];
		@Pc(40) int local40 = Static264.method4930(local34 - 1);
		Static337.anIntArray468[0] = Static246.method4514(local40);
		Static337.anIntArray468[1] = Static246.method4514(local40);
		@Pc(52) int local52 = 2;
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray474.length; local54++) {
			@Pc(60) int local60 = this.anIntArray474[local54];
			@Pc(65) int local65 = this.anIntArray472[local60];
			@Pc(70) int local70 = this.anIntArray473[local60];
			@Pc(76) int local76 = (0x1 << local70) - 1;
			@Pc(78) int local78 = 0;
			if (local70 > 0) {
				local78 = Static246.aClass175Array1[this.anIntArray469[local60]].method4440();
			}
			for (@Pc(90) int local90 = 0; local90 < local65; local90++) {
				@Pc(100) int local100 = this.anIntArrayArray60[local60][local78 & local76];
				local78 >>>= local70;
				Static337.anIntArray468[local52++] = local100 >= 0 ? Static246.aClass175Array1[local100].method4440() : 0;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIII)I", line = 295)
	private int method6063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}
}
