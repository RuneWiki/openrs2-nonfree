import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class29 {

	@OriginalMember(owner = "client!da", name = "h", descriptor = "[I")
	private int[] anIntArray85;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "[I")
	private int[] anIntArray82;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "[I")
	private int[] anIntArray81;

	@OriginalMember(owner = "client!da", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!da", name = "j", descriptor = "I")
	private int anInt1104;

	@OriginalMember(owner = "client!da", name = "i", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	public Class29() {
		@Pc(4) int local4 = Static130.method2477(16);
		if (local4 != 1) {
			throw new RuntimeException();
		}
		@Pc(14) int local14 = Static130.method2477(5);
		@Pc(16) int local16 = 0;
		this.anIntArray85 = new int[local14];
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < local14; local22++) {
			local26 = Static130.method2477(4);
			this.anIntArray85[local22] = local26;
			if (local26 >= local16) {
				local16 = local26 + 1;
			}
		}
		this.anIntArray83 = new int[local16];
		this.anIntArray82 = new int[local16];
		this.anIntArray81 = new int[local16];
		this.anIntArrayArray11 = new int[local16][];
		@Pc(77) int local77;
		@Pc(99) int local99;
		for (local26 = 0; local26 < local16; local26++) {
			this.anIntArray83[local26] = Static130.method2477(3) + 1;
			local77 = this.anIntArray82[local26] = Static130.method2477(2);
			if (local77 != 0) {
				this.anIntArray81[local26] = Static130.method2477(8);
			}
			local77 = 0x1 << local77;
			@Pc(92) int[] local92 = new int[local77];
			this.anIntArrayArray11[local26] = local92;
			for (local99 = 0; local99 < local77; local99++) {
				local92[local99] = Static130.method2477(8) - 1;
			}
		}
		this.anInt1104 = Static130.method2477(2) + 1;
		local77 = Static130.method2477(4);
		@Pc(126) int local126 = 2;
		for (local99 = 0; local99 < local14; local99++) {
			local126 += this.anIntArray83[this.anIntArray85[local99]];
		}
		this.anIntArray86 = new int[local126];
		this.anIntArray86[0] = 0;
		this.anIntArray86[1] = 0x1 << local77;
		local126 = 2;
		for (@Pc(163) int local163 = 0; local163 < local14; local163++) {
			@Pc(169) int local169 = this.anIntArray85[local163];
			for (@Pc(171) int local171 = 0; local171 < this.anIntArray83[local169]; local171++) {
				this.anIntArray86[local126++] = Static130.method2477(local77);
			}
		}
		if (Static41.anIntArray84 == null || Static41.anIntArray84.length < local126) {
			Static41.anIntArray84 = new int[local126];
			Static41.anIntArray87 = new int[local126];
			Static41.aBooleanArray2 = new boolean[local126];
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII[FI)V")
	private void method729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4[arg0] *= Static41.aFloatArray1[arg1];
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
			arg4[local61] *= Static41.aFloatArray1[local20];
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()Z")
	public boolean method731() {
		@Pc(5) boolean local5 = Static130.method2478() != 0;
		if (!local5) {
			return false;
		}
		@Pc(13) int local13 = this.anIntArray86.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			Static41.anIntArray84[local15] = this.anIntArray86[local15];
		}
		@Pc(34) int local34 = Static41.anIntArray88[this.anInt1104 - 1];
		@Pc(40) int local40 = Static67.method1314(local34 - 1);
		Static41.anIntArray87[0] = Static130.method2477(local40);
		Static41.anIntArray87[1] = Static130.method2477(local40);
		@Pc(52) int local52 = 2;
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray85.length; local54++) {
			@Pc(60) int local60 = this.anIntArray85[local54];
			@Pc(65) int local65 = this.anIntArray83[local60];
			@Pc(70) int local70 = this.anIntArray82[local60];
			@Pc(76) int local76 = (0x1 << local70) - 1;
			@Pc(78) int local78 = 0;
			if (local70 > 0) {
				local78 = Static130.aClass121Array1[this.anIntArray81[local60]].method3515();
			}
			for (@Pc(90) int local90 = 0; local90 < local65; local90++) {
				@Pc(100) int local100 = this.anIntArrayArray11[local60][local78 & local76];
				local78 >>>= local70;
				Static41.anIntArray87[local52++] = local100 >= 0 ? Static130.aClass121Array1[local100].method3515() : 0;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII)I")
	private int method732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V")
	private void method734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(9) int local9 = Static41.anIntArray84[arg0];
		@Pc(13) int local13 = Static41.anIntArray87[arg0];
		@Pc(17) boolean local17 = Static41.aBooleanArray2[arg0];
		for (@Pc(21) int local21 = arg0 + 1; local21 <= arg1; local21++) {
			@Pc(26) int local26 = Static41.anIntArray84[local21];
			if (local26 < local9) {
				Static41.anIntArray84[local5] = local26;
				Static41.anIntArray87[local5] = Static41.anIntArray87[local21];
				Static41.aBooleanArray2[local5] = Static41.aBooleanArray2[local21];
				local5++;
				Static41.anIntArray84[local21] = Static41.anIntArray84[local5];
				Static41.anIntArray87[local21] = Static41.anIntArray87[local5];
				Static41.aBooleanArray2[local21] = Static41.aBooleanArray2[local5];
			}
		}
		Static41.anIntArray84[local5] = local9;
		Static41.anIntArray87[local5] = local13;
		Static41.aBooleanArray2[local5] = local17;
		this.method734(arg0, local5 - 1);
		this.method734(local5 + 1, arg1);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([FI)V")
	public void method735(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = this.anIntArray86.length;
		@Pc(10) int local10 = Static41.anIntArray88[this.anInt1104 - 1];
		Static41.aBooleanArray2[0] = Static41.aBooleanArray2[1] = true;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(55) int local55;
		for (@Pc(20) int local20 = 2; local20 < local3; local20++) {
			local25 = Static41.method733(Static41.anIntArray84, local20);
			local29 = Static41.method728(Static41.anIntArray84, local20);
			local47 = this.method732(Static41.anIntArray84[local25], Static41.anIntArray87[local25], Static41.anIntArray84[local29], Static41.anIntArray87[local29], Static41.anIntArray84[local20]);
			local51 = Static41.anIntArray87[local20];
			local55 = local10 - local47;
			@Pc(66) int local66 = (local55 < local47 ? local55 : local47) << 1;
			if (local51 == 0) {
				Static41.aBooleanArray2[local20] = false;
				Static41.anIntArray87[local20] = local47;
			} else {
				Static41.aBooleanArray2[local25] = Static41.aBooleanArray2[local29] = true;
				Static41.aBooleanArray2[local20] = true;
				if (local51 >= local66) {
					Static41.anIntArray87[local20] = local55 > local47 ? local51 + local47 - local47 : local47 - local51 + local55 - 1;
				} else {
					Static41.anIntArray87[local20] = (local51 & 0x1) == 0 ? local47 + local51 / 2 : local47 - (local51 + 1) / 2;
				}
			}
		}
		this.method734(0, local3 - 1);
		local25 = 0;
		local29 = Static41.anIntArray87[0] * this.anInt1104;
		for (local47 = 1; local47 < local3; local47++) {
			if (Static41.aBooleanArray2[local47]) {
				local51 = Static41.anIntArray84[local47];
				local55 = Static41.anIntArray87[local47] * this.anInt1104;
				this.method729(local25, local29, local51, local55, arg0, arg1);
				if (local51 >= arg1) {
					return;
				}
				local25 = local51;
				local29 = local55;
			}
		}
		@Pc(193) float local193 = Static41.aFloatArray1[local29];
		for (local55 = local25; local55 < arg1; local55++) {
			arg0[local55] *= local193;
		}
	}
}
