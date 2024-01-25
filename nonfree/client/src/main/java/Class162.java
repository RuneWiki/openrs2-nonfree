import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class162 {

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "[I")
	private final int[] anIntArray336;

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "[I")
	private final int[] anIntArray341;

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "[I")
	private final int[] anIntArray338;

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "[I")
	private final int[] anIntArray340;

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "[[I")
	private final int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
	private final int anInt4293;

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "[I")
	private final int[] anIntArray335;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
	public Class162() {
		@Pc(4) int local4 = Static258.method3655(16);
		if (local4 != 1) {
			throw new RuntimeException();
		}
		@Pc(14) int local14 = Static258.method3655(5);
		@Pc(16) int local16 = 0;
		this.anIntArray336 = new int[local14];
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < local14; local22++) {
			local26 = Static258.method3655(4);
			this.anIntArray336[local22] = local26;
			if (local26 >= local16) {
				local16 = local26 + 1;
			}
		}
		this.anIntArray341 = new int[local16];
		this.anIntArray338 = new int[local16];
		this.anIntArray340 = new int[local16];
		this.anIntArrayArray27 = new int[local16][];
		@Pc(77) int local77;
		@Pc(99) int local99;
		for (local26 = 0; local26 < local16; local26++) {
			this.anIntArray341[local26] = Static258.method3655(3) + 1;
			local77 = this.anIntArray338[local26] = Static258.method3655(2);
			if (local77 != 0) {
				this.anIntArray340[local26] = Static258.method3655(8);
			}
			local77 = 0x1 << local77;
			@Pc(92) int[] local92 = new int[local77];
			this.anIntArrayArray27[local26] = local92;
			for (local99 = 0; local99 < local77; local99++) {
				local92[local99] = Static258.method3655(8) - 1;
			}
		}
		this.anInt4293 = Static258.method3655(2) + 1;
		local77 = Static258.method3655(4);
		@Pc(126) int local126 = 2;
		for (local99 = 0; local99 < local14; local99++) {
			local126 += this.anIntArray341[this.anIntArray336[local99]];
		}
		this.anIntArray335 = new int[local126];
		this.anIntArray335[0] = 0;
		this.anIntArray335[1] = 0x1 << local77;
		local126 = 2;
		for (@Pc(163) int local163 = 0; local163 < local14; local163++) {
			@Pc(169) int local169 = this.anIntArray336[local163];
			for (@Pc(171) int local171 = 0; local171 < this.anIntArray341[local169]; local171++) {
				this.anIntArray335[local126++] = Static258.method3655(local77);
			}
		}
		if (Static247.anIntArray342 == null || Static247.anIntArray342.length < local126) {
			Static247.anIntArray342 = new int[local126];
			Static247.anIntArray337 = new int[local126];
			Static247.aBooleanArray16 = new boolean[local126];
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "()Z")
	public boolean method3562() {
		@Pc(5) boolean local5 = Static258.method3653() != 0;
		if (!local5) {
			return false;
		}
		@Pc(13) int local13 = this.anIntArray335.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			Static247.anIntArray342[local15] = this.anIntArray335[local15];
		}
		@Pc(34) int local34 = Static247.anIntArray339[this.anInt4293 - 1];
		@Pc(40) int local40 = Static113.method1791(local34 - 1);
		Static247.anIntArray337[0] = Static258.method3655(local40);
		Static247.anIntArray337[1] = Static258.method3655(local40);
		@Pc(52) int local52 = 2;
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray336.length; local54++) {
			@Pc(60) int local60 = this.anIntArray336[local54];
			@Pc(65) int local65 = this.anIntArray341[local60];
			@Pc(70) int local70 = this.anIntArray338[local60];
			@Pc(76) int local76 = (0x1 << local70) - 1;
			@Pc(78) int local78 = 0;
			if (local70 > 0) {
				local78 = Static258.aClass59Array1[this.anIntArray340[local60]].method1141();
			}
			for (@Pc(90) int local90 = 0; local90 < local65; local90++) {
				@Pc(100) int local100 = this.anIntArrayArray27[local60][local78 & local76];
				local78 >>>= local70;
				Static247.anIntArray337[local52++] = local100 >= 0 ? Static258.aClass59Array1[local100].method1141() : 0;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V")
	private void method3563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(9) int local9 = Static247.anIntArray342[arg0];
		@Pc(13) int local13 = Static247.anIntArray337[arg0];
		@Pc(17) boolean local17 = Static247.aBooleanArray16[arg0];
		for (@Pc(21) int local21 = arg0 + 1; local21 <= arg1; local21++) {
			@Pc(26) int local26 = Static247.anIntArray342[local21];
			if (local26 < local9) {
				Static247.anIntArray342[local5] = local26;
				Static247.anIntArray337[local5] = Static247.anIntArray337[local21];
				Static247.aBooleanArray16[local5] = Static247.aBooleanArray16[local21];
				local5++;
				Static247.anIntArray342[local21] = Static247.anIntArray342[local5];
				Static247.anIntArray337[local21] = Static247.anIntArray337[local5];
				Static247.aBooleanArray16[local21] = Static247.aBooleanArray16[local5];
			}
		}
		Static247.anIntArray342[local5] = local9;
		Static247.anIntArray337[local5] = local13;
		Static247.aBooleanArray16[local5] = local17;
		this.method3563(arg0, local5 - 1);
		this.method3563(local5 + 1, arg1);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII)I")
	private int method3565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "([FI)V")
	public void method3566(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = this.anIntArray335.length;
		@Pc(10) int local10 = Static247.anIntArray339[this.anInt4293 - 1];
		Static247.aBooleanArray16[0] = Static247.aBooleanArray16[1] = true;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(55) int local55;
		for (@Pc(20) int local20 = 2; local20 < local3; local20++) {
			local25 = Static247.method3560(Static247.anIntArray342, local20);
			local29 = Static247.method3561(Static247.anIntArray342, local20);
			local47 = this.method3565(Static247.anIntArray342[local25], Static247.anIntArray337[local25], Static247.anIntArray342[local29], Static247.anIntArray337[local29], Static247.anIntArray342[local20]);
			local51 = Static247.anIntArray337[local20];
			local55 = local10 - local47;
			@Pc(66) int local66 = (local55 < local47 ? local55 : local47) << 1;
			if (local51 == 0) {
				Static247.aBooleanArray16[local20] = false;
				Static247.anIntArray337[local20] = local47;
			} else {
				Static247.aBooleanArray16[local25] = Static247.aBooleanArray16[local29] = true;
				Static247.aBooleanArray16[local20] = true;
				if (local51 >= local66) {
					Static247.anIntArray337[local20] = local55 > local47 ? local51 + local47 - local47 : local47 - local51 + local55 - 1;
				} else {
					Static247.anIntArray337[local20] = (local51 & 0x1) == 0 ? local47 + local51 / 2 : local47 - (local51 + 1) / 2;
				}
			}
		}
		this.method3563(0, local3 - 1);
		local25 = 0;
		local29 = Static247.anIntArray337[0] * this.anInt4293;
		for (local47 = 1; local47 < local3; local47++) {
			if (Static247.aBooleanArray16[local47]) {
				local51 = Static247.anIntArray342[local47];
				local55 = Static247.anIntArray337[local47] * this.anInt4293;
				this.method3567(local25, local29, local51, local55, arg0, arg1);
				if (local51 >= arg1) {
					return;
				}
				local25 = local51;
				local29 = local55;
			}
		}
		@Pc(193) float local193 = Static247.aFloatArray18[local29];
		for (local55 = local25; local55 < arg1; local55++) {
			arg0[local55] *= local193;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIII[FI)V")
	private void method3567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4[arg0] *= Static247.aFloatArray18[arg1];
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
			arg4[local61] *= Static247.aFloatArray18[local20];
		}
	}
}
