import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class44 {

	@OriginalMember(owner = "client!l", name = "k", descriptor = "[I")
	private final int[] anIntArray266;

	@OriginalMember(owner = "client!l", name = "i", descriptor = "[I")
	private final int[] anIntArray264;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "[I")
	private final int[] anIntArray260;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "[I")
	private final int[] anIntArray267;

	@OriginalMember(owner = "client!l", name = "e", descriptor = "[[I")
	private final int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "I")
	private final int anInt2805;

	@OriginalMember(owner = "client!l", name = "h", descriptor = "[I")
	private final int[] anIntArray263;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	public Class44() {
		@Pc(4) int local4 = Static23.method483(16);
		if (local4 != 1) {
			throw new RuntimeException();
		}
		@Pc(14) int local14 = Static23.method483(5);
		@Pc(16) int local16 = 0;
		this.anIntArray266 = new int[local14];
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < local14; local22++) {
			local26 = Static23.method483(4);
			this.anIntArray266[local22] = local26;
			if (local26 >= local16) {
				local16 = local26 + 1;
			}
		}
		this.anIntArray264 = new int[local16];
		this.anIntArray260 = new int[local16];
		this.anIntArray267 = new int[local16];
		this.anIntArrayArray25 = new int[local16][];
		@Pc(77) int local77;
		@Pc(99) int local99;
		for (local26 = 0; local26 < local16; local26++) {
			this.anIntArray264[local26] = Static23.method483(3) + 1;
			local77 = this.anIntArray260[local26] = Static23.method483(2);
			if (local77 != 0) {
				this.anIntArray267[local26] = Static23.method483(8);
			}
			local77 = 0x1 << local77;
			@Pc(92) int[] local92 = new int[local77];
			this.anIntArrayArray25[local26] = local92;
			for (local99 = 0; local99 < local77; local99++) {
				local92[local99] = Static23.method483(8) - 1;
			}
		}
		this.anInt2805 = Static23.method483(2) + 1;
		local77 = Static23.method483(4);
		@Pc(126) int local126 = 2;
		for (local99 = 0; local99 < local14; local99++) {
			local126 += this.anIntArray264[this.anIntArray266[local99]];
		}
		this.anIntArray263 = new int[local126];
		this.anIntArray263[0] = 0;
		this.anIntArray263[1] = 0x1 << local77;
		local126 = 2;
		for (@Pc(163) int local163 = 0; local163 < local14; local163++) {
			@Pc(169) int local169 = this.anIntArray266[local163];
			for (@Pc(171) int local171 = 0; local171 < this.anIntArray264[local169]; local171++) {
				this.anIntArray263[local126++] = Static23.method483(local77);
			}
		}
		if (Static97.anIntArray261 == null || Static97.anIntArray261.length < local126) {
			Static97.anIntArray261 = new int[local126];
			Static97.anIntArray262 = new int[local126];
			Static97.aBooleanArray13 = new boolean[local126];
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([FI)V")
	public void method2080(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = this.anIntArray263.length;
		@Pc(10) int local10 = Static97.anIntArray265[this.anInt2805 - 1];
		Static97.aBooleanArray13[0] = Static97.aBooleanArray13[1] = true;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(55) int local55;
		for (@Pc(20) int local20 = 2; local20 < local3; local20++) {
			local25 = Static97.method2081(Static97.anIntArray261, local20);
			local29 = Static97.method2087(Static97.anIntArray261, local20);
			local47 = this.method2085(Static97.anIntArray261[local25], Static97.anIntArray262[local25], Static97.anIntArray261[local29], Static97.anIntArray262[local29], Static97.anIntArray261[local20]);
			local51 = Static97.anIntArray262[local20];
			local55 = local10 - local47;
			@Pc(66) int local66 = (local55 < local47 ? local55 : local47) << 1;
			if (local51 == 0) {
				Static97.aBooleanArray13[local20] = false;
				Static97.anIntArray262[local20] = local47;
			} else {
				Static97.aBooleanArray13[local25] = Static97.aBooleanArray13[local29] = true;
				Static97.aBooleanArray13[local20] = true;
				if (local51 >= local66) {
					Static97.anIntArray262[local20] = local55 > local47 ? local51 + local47 - local47 : local47 - local51 + local55 - 1;
				} else {
					Static97.anIntArray262[local20] = (local51 & 0x1) == 0 ? local47 + local51 / 2 : local47 - (local51 + 1) / 2;
				}
			}
		}
		this.method2083(0, local3 - 1);
		local25 = 0;
		local29 = Static97.anIntArray262[0] * this.anInt2805;
		for (local47 = 1; local47 < local3; local47++) {
			if (Static97.aBooleanArray13[local47]) {
				local51 = Static97.anIntArray261[local47];
				local55 = Static97.anIntArray262[local47] * this.anInt2805;
				this.method2084(local25, local29, local51, local55, arg0, arg1);
				if (local51 >= arg1) {
					return;
				}
				local25 = local51;
				local29 = local55;
			}
		}
		@Pc(193) float local193 = Static97.aFloatArray9[local29];
		for (local55 = local25; local55 < arg1; local55++) {
			arg0[local55] *= local193;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "()Z")
	public boolean method2082() {
		@Pc(5) boolean local5 = Static23.method491() != 0;
		if (!local5) {
			return false;
		}
		@Pc(13) int local13 = this.anIntArray263.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			Static97.anIntArray261[local15] = this.anIntArray263[local15];
		}
		@Pc(34) int local34 = Static97.anIntArray265[this.anInt2805 - 1];
		@Pc(40) int local40 = Static121.method2476(local34 - 1);
		Static97.anIntArray262[0] = Static23.method483(local40);
		Static97.anIntArray262[1] = Static23.method483(local40);
		@Pc(52) int local52 = 2;
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray266.length; local54++) {
			@Pc(60) int local60 = this.anIntArray266[local54];
			@Pc(65) int local65 = this.anIntArray264[local60];
			@Pc(70) int local70 = this.anIntArray260[local60];
			@Pc(76) int local76 = (0x1 << local70) - 1;
			@Pc(78) int local78 = 0;
			if (local70 > 0) {
				local78 = Static23.aClass89Array1[this.anIntArray267[local60]].method3491();
			}
			for (@Pc(90) int local90 = 0; local90 < local65; local90++) {
				@Pc(100) int local100 = this.anIntArrayArray25[local60][local78 & local76];
				local78 >>>= local70;
				Static97.anIntArray262[local52++] = local100 >= 0 ? Static23.aClass89Array1[local100].method3491() : 0;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V")
	private void method2083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(9) int local9 = Static97.anIntArray261[arg0];
		@Pc(13) int local13 = Static97.anIntArray262[arg0];
		@Pc(17) boolean local17 = Static97.aBooleanArray13[arg0];
		for (@Pc(21) int local21 = arg0 + 1; local21 <= arg1; local21++) {
			@Pc(26) int local26 = Static97.anIntArray261[local21];
			if (local26 < local9) {
				Static97.anIntArray261[local5] = local26;
				Static97.anIntArray262[local5] = Static97.anIntArray262[local21];
				Static97.aBooleanArray13[local5] = Static97.aBooleanArray13[local21];
				local5++;
				Static97.anIntArray261[local21] = Static97.anIntArray261[local5];
				Static97.anIntArray262[local21] = Static97.anIntArray262[local5];
				Static97.aBooleanArray13[local21] = Static97.aBooleanArray13[local5];
			}
		}
		Static97.anIntArray261[local5] = local9;
		Static97.anIntArray262[local5] = local13;
		Static97.aBooleanArray13[local5] = local17;
		this.method2083(arg0, local5 - 1);
		this.method2083(local5 + 1, arg1);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII[FI)V")
	private void method2084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4[arg0] *= Static97.aFloatArray9[arg1];
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
			arg4[local61] *= Static97.aFloatArray9[local20];
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIII)I")
	private int method2085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}
}
