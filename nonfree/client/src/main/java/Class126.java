import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class126 {

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "[I")
	private final int[] anIntArray296;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "[I")
	private final int[] anIntArray293;

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "[I")
	private final int[] anIntArray299;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "[I")
	private final int[] anIntArray294;

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "[[I")
	private final int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
	private final int anInt3579;

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "[I")
	private final int[] anIntArray297;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
	public Class126() {
		@Pc(4) int local4 = Static99.method1791(16);
		if (local4 != 1) {
			throw new RuntimeException();
		}
		@Pc(14) int local14 = Static99.method1791(5);
		@Pc(16) int local16 = 0;
		this.anIntArray296 = new int[local14];
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < local14; local22++) {
			local26 = Static99.method1791(4);
			this.anIntArray296[local22] = local26;
			if (local26 >= local16) {
				local16 = local26 + 1;
			}
		}
		this.anIntArray293 = new int[local16];
		this.anIntArray299 = new int[local16];
		this.anIntArray294 = new int[local16];
		this.anIntArrayArray20 = new int[local16][];
		@Pc(77) int local77;
		@Pc(99) int local99;
		for (local26 = 0; local26 < local16; local26++) {
			this.anIntArray293[local26] = Static99.method1791(3) + 1;
			local77 = this.anIntArray299[local26] = Static99.method1791(2);
			if (local77 != 0) {
				this.anIntArray294[local26] = Static99.method1791(8);
			}
			local77 = 0x1 << local77;
			@Pc(92) int[] local92 = new int[local77];
			this.anIntArrayArray20[local26] = local92;
			for (local99 = 0; local99 < local77; local99++) {
				local92[local99] = Static99.method1791(8) - 1;
			}
		}
		this.anInt3579 = Static99.method1791(2) + 1;
		local77 = Static99.method1791(4);
		@Pc(126) int local126 = 2;
		for (local99 = 0; local99 < local14; local99++) {
			local126 += this.anIntArray293[this.anIntArray296[local99]];
		}
		this.anIntArray297 = new int[local126];
		this.anIntArray297[0] = 0;
		this.anIntArray297[1] = 0x1 << local77;
		local126 = 2;
		for (@Pc(163) int local163 = 0; local163 < local14; local163++) {
			@Pc(169) int local169 = this.anIntArray296[local163];
			for (@Pc(171) int local171 = 0; local171 < this.anIntArray293[local169]; local171++) {
				this.anIntArray297[local126++] = Static99.method1791(local77);
			}
		}
		if (Static190.anIntArray300 == null || Static190.anIntArray300.length < local126) {
			Static190.anIntArray300 = new int[local126];
			Static190.anIntArray298 = new int[local126];
			Static190.aBooleanArray10 = new boolean[local126];
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII[FI)V")
	private void method2979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4[arg0] *= Static190.aFloatArray23[arg1];
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
			arg4[local61] *= Static190.aFloatArray23[local20];
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "()Z")
	public boolean method2980() {
		@Pc(5) boolean local5 = Static99.method1797() != 0;
		if (!local5) {
			return false;
		}
		@Pc(13) int local13 = this.anIntArray297.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			Static190.anIntArray300[local15] = this.anIntArray297[local15];
		}
		@Pc(34) int local34 = Static190.anIntArray295[this.anInt3579 - 1];
		@Pc(40) int local40 = Static296.method5214(local34 - 1);
		Static190.anIntArray298[0] = Static99.method1791(local40);
		Static190.anIntArray298[1] = Static99.method1791(local40);
		@Pc(52) int local52 = 2;
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray296.length; local54++) {
			@Pc(60) int local60 = this.anIntArray296[local54];
			@Pc(65) int local65 = this.anIntArray293[local60];
			@Pc(70) int local70 = this.anIntArray299[local60];
			@Pc(76) int local76 = (0x1 << local70) - 1;
			@Pc(78) int local78 = 0;
			if (local70 > 0) {
				local78 = Static99.aClass314Array1[this.anIntArray294[local60]].method7636();
			}
			for (@Pc(90) int local90 = 0; local90 < local65; local90++) {
				@Pc(100) int local100 = this.anIntArrayArray20[local60][local78 & local76];
				local78 >>>= local70;
				Static190.anIntArray298[local52++] = local100 >= 0 ? Static99.aClass314Array1[local100].method7636() : 0;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V")
	private void method2983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(9) int local9 = Static190.anIntArray300[arg0];
		@Pc(13) int local13 = Static190.anIntArray298[arg0];
		@Pc(17) boolean local17 = Static190.aBooleanArray10[arg0];
		for (@Pc(21) int local21 = arg0 + 1; local21 <= arg1; local21++) {
			@Pc(26) int local26 = Static190.anIntArray300[local21];
			if (local26 < local9) {
				Static190.anIntArray300[local5] = local26;
				Static190.anIntArray298[local5] = Static190.anIntArray298[local21];
				Static190.aBooleanArray10[local5] = Static190.aBooleanArray10[local21];
				local5++;
				Static190.anIntArray300[local21] = Static190.anIntArray300[local5];
				Static190.anIntArray298[local21] = Static190.anIntArray298[local5];
				Static190.aBooleanArray10[local21] = Static190.aBooleanArray10[local5];
			}
		}
		Static190.anIntArray300[local5] = local9;
		Static190.anIntArray298[local5] = local13;
		Static190.aBooleanArray10[local5] = local17;
		this.method2983(arg0, local5 - 1);
		this.method2983(local5 + 1, arg1);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIII)I")
	private int method2984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([FI)V")
	public void method2985(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = this.anIntArray297.length;
		@Pc(10) int local10 = Static190.anIntArray295[this.anInt3579 - 1];
		Static190.aBooleanArray10[0] = Static190.aBooleanArray10[1] = true;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(55) int local55;
		for (@Pc(20) int local20 = 2; local20 < local3; local20++) {
			local25 = Static190.method2978(Static190.anIntArray300, local20);
			local29 = Static190.method2982(Static190.anIntArray300, local20);
			local47 = this.method2984(Static190.anIntArray300[local25], Static190.anIntArray298[local25], Static190.anIntArray300[local29], Static190.anIntArray298[local29], Static190.anIntArray300[local20]);
			local51 = Static190.anIntArray298[local20];
			local55 = local10 - local47;
			@Pc(66) int local66 = (local55 < local47 ? local55 : local47) << 1;
			if (local51 == 0) {
				Static190.aBooleanArray10[local20] = false;
				Static190.anIntArray298[local20] = local47;
			} else {
				Static190.aBooleanArray10[local25] = Static190.aBooleanArray10[local29] = true;
				Static190.aBooleanArray10[local20] = true;
				if (local51 >= local66) {
					Static190.anIntArray298[local20] = local55 > local47 ? local51 + local47 - local47 : local47 - local51 + local55 - 1;
				} else {
					Static190.anIntArray298[local20] = (local51 & 0x1) == 0 ? local47 + local51 / 2 : local47 - (local51 + 1) / 2;
				}
			}
		}
		this.method2983(0, local3 - 1);
		local25 = 0;
		local29 = Static190.anIntArray298[0] * this.anInt3579;
		for (local47 = 1; local47 < local3; local47++) {
			if (Static190.aBooleanArray10[local47]) {
				local51 = Static190.anIntArray300[local47];
				local55 = Static190.anIntArray298[local47] * this.anInt3579;
				this.method2979(local25, local29, local51, local55, arg0, arg1);
				if (local51 >= arg1) {
					return;
				}
				local25 = local51;
				local29 = local55;
			}
		}
		@Pc(193) float local193 = Static190.aFloatArray23[local29];
		for (local55 = local25; local55 < arg1; local55++) {
			arg0[local55] *= local193;
		}
	}
}
