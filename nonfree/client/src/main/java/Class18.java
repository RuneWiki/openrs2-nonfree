import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class18 {

	@OriginalMember(owner = "client!at", name = "g", descriptor = "[I")
	private final int[] anIntArray28;

	@OriginalMember(owner = "client!at", name = "c", descriptor = "[I")
	private final int[] anIntArray24;

	@OriginalMember(owner = "client!at", name = "i", descriptor = "[I")
	private final int[] anIntArray30;

	@OriginalMember(owner = "client!at", name = "e", descriptor = "[I")
	private final int[] anIntArray26;

	@OriginalMember(owner = "client!at", name = "l", descriptor = "[[I")
	private final int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "I")
	private final int anInt216;

	@OriginalMember(owner = "client!at", name = "h", descriptor = "[I")
	private final int[] anIntArray29;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "()V")
	public Class18() {
		@Pc(4) int local4 = Static87.method1447(16);
		if (local4 != 1) {
			throw new RuntimeException();
		}
		@Pc(14) int local14 = Static87.method1447(5);
		@Pc(16) int local16 = 0;
		this.anIntArray28 = new int[local14];
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < local14; local22++) {
			local26 = Static87.method1447(4);
			this.anIntArray28[local22] = local26;
			if (local26 >= local16) {
				local16 = local26 + 1;
			}
		}
		this.anIntArray24 = new int[local16];
		this.anIntArray30 = new int[local16];
		this.anIntArray26 = new int[local16];
		this.anIntArrayArray3 = new int[local16][];
		@Pc(77) int local77;
		@Pc(99) int local99;
		for (local26 = 0; local26 < local16; local26++) {
			this.anIntArray24[local26] = Static87.method1447(3) + 1;
			local77 = this.anIntArray30[local26] = Static87.method1447(2);
			if (local77 != 0) {
				this.anIntArray26[local26] = Static87.method1447(8);
			}
			local77 = 0x1 << local77;
			@Pc(92) int[] local92 = new int[local77];
			this.anIntArrayArray3[local26] = local92;
			for (local99 = 0; local99 < local77; local99++) {
				local92[local99] = Static87.method1447(8) - 1;
			}
		}
		this.anInt216 = Static87.method1447(2) + 1;
		local77 = Static87.method1447(4);
		@Pc(126) int local126 = 2;
		for (local99 = 0; local99 < local14; local99++) {
			local126 += this.anIntArray24[this.anIntArray28[local99]];
		}
		this.anIntArray29 = new int[local126];
		this.anIntArray29[0] = 0;
		this.anIntArray29[1] = 0x1 << local77;
		local126 = 2;
		for (@Pc(163) int local163 = 0; local163 < local14; local163++) {
			@Pc(169) int local169 = this.anIntArray28[local163];
			for (@Pc(171) int local171 = 0; local171 < this.anIntArray24[local169]; local171++) {
				this.anIntArray29[local126++] = Static87.method1447(local77);
			}
		}
		if (Static18.anIntArray27 == null || Static18.anIntArray27.length < local126) {
			Static18.anIntArray27 = new int[local126];
			Static18.anIntArray31 = new int[local126];
			Static18.aBooleanArray5 = new boolean[local126];
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "([FI)V")
	public void method211(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = this.anIntArray29.length;
		@Pc(10) int local10 = Static18.anIntArray25[this.anInt216 - 1];
		Static18.aBooleanArray5[0] = Static18.aBooleanArray5[1] = true;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(55) int local55;
		for (@Pc(20) int local20 = 2; local20 < local3; local20++) {
			local25 = Static18.method217(Static18.anIntArray27, local20);
			local29 = Static18.method218(Static18.anIntArray27, local20);
			local47 = this.method212(Static18.anIntArray27[local25], Static18.anIntArray31[local25], Static18.anIntArray27[local29], Static18.anIntArray31[local29], Static18.anIntArray27[local20]);
			local51 = Static18.anIntArray31[local20];
			local55 = local10 - local47;
			@Pc(66) int local66 = (local55 < local47 ? local55 : local47) << 1;
			if (local51 == 0) {
				Static18.aBooleanArray5[local20] = false;
				Static18.anIntArray31[local20] = local47;
			} else {
				Static18.aBooleanArray5[local25] = Static18.aBooleanArray5[local29] = true;
				Static18.aBooleanArray5[local20] = true;
				if (local51 >= local66) {
					Static18.anIntArray31[local20] = local55 > local47 ? local51 + local47 - local47 : local47 - local51 + local55 - 1;
				} else {
					Static18.anIntArray31[local20] = (local51 & 0x1) == 0 ? local47 + local51 / 2 : local47 - (local51 + 1) / 2;
				}
			}
		}
		this.method215(0, local3 - 1);
		local25 = 0;
		local29 = Static18.anIntArray31[0] * this.anInt216;
		for (local47 = 1; local47 < local3; local47++) {
			if (Static18.aBooleanArray5[local47]) {
				local51 = Static18.anIntArray27[local47];
				local55 = Static18.anIntArray31[local47] * this.anInt216;
				this.method216(local25, local29, local51, local55, arg0, arg1);
				if (local51 >= arg1) {
					return;
				}
				local25 = local51;
				local29 = local55;
			}
		}
		@Pc(193) float local193 = Static18.aFloatArray2[local29];
		for (local55 = local25; local55 < arg1; local55++) {
			arg0[local55] *= local193;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIII)I")
	private int method212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "()Z")
	public boolean method214() {
		@Pc(5) boolean local5 = Static87.method1445() != 0;
		if (!local5) {
			return false;
		}
		@Pc(13) int local13 = this.anIntArray29.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			Static18.anIntArray27[local15] = this.anIntArray29[local15];
		}
		@Pc(34) int local34 = Static18.anIntArray25[this.anInt216 - 1];
		@Pc(40) int local40 = Static25.method311(local34 - 1);
		Static18.anIntArray31[0] = Static87.method1447(local40);
		Static18.anIntArray31[1] = Static87.method1447(local40);
		@Pc(52) int local52 = 2;
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray28.length; local54++) {
			@Pc(60) int local60 = this.anIntArray28[local54];
			@Pc(65) int local65 = this.anIntArray24[local60];
			@Pc(70) int local70 = this.anIntArray30[local60];
			@Pc(76) int local76 = (0x1 << local70) - 1;
			@Pc(78) int local78 = 0;
			if (local70 > 0) {
				local78 = Static87.aClass173Array1[this.anIntArray26[local60]].method4038();
			}
			for (@Pc(90) int local90 = 0; local90 < local65; local90++) {
				@Pc(100) int local100 = this.anIntArrayArray3[local60][local78 & local76];
				local78 >>>= local70;
				Static18.anIntArray31[local52++] = local100 >= 0 ? Static87.aClass173Array1[local100].method4038() : 0;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)V")
	private void method215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(9) int local9 = Static18.anIntArray27[arg0];
		@Pc(13) int local13 = Static18.anIntArray31[arg0];
		@Pc(17) boolean local17 = Static18.aBooleanArray5[arg0];
		for (@Pc(21) int local21 = arg0 + 1; local21 <= arg1; local21++) {
			@Pc(26) int local26 = Static18.anIntArray27[local21];
			if (local26 < local9) {
				Static18.anIntArray27[local5] = local26;
				Static18.anIntArray31[local5] = Static18.anIntArray31[local21];
				Static18.aBooleanArray5[local5] = Static18.aBooleanArray5[local21];
				local5++;
				Static18.anIntArray27[local21] = Static18.anIntArray27[local5];
				Static18.anIntArray31[local21] = Static18.anIntArray31[local5];
				Static18.aBooleanArray5[local21] = Static18.aBooleanArray5[local5];
			}
		}
		Static18.anIntArray27[local5] = local9;
		Static18.anIntArray31[local5] = local13;
		Static18.aBooleanArray5[local5] = local17;
		this.method215(arg0, local5 - 1);
		this.method215(local5 + 1, arg1);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIII[FI)V")
	private void method216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4[arg0] *= Static18.aFloatArray2[arg1];
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
			arg4[local61] *= Static18.aFloatArray2[local20];
		}
	}
}
