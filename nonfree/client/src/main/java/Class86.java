import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class86 {

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "[I")
	private final int[] anIntArray562;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "[I")
	private final int[] anIntArray561;

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "[I")
	private final int[] anIntArray566;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "[I")
	private final int[] anIntArray564;

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "[[I")
	private final int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
	private final int anInt4179;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "[I")
	private final int[] anIntArray563;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
	public Class86() {
		@Pc(4) int local4 = Static117.method2068(16);
		if (local4 != 1) {
			throw new RuntimeException();
		}
		@Pc(14) int local14 = Static117.method2068(5);
		@Pc(16) int local16 = 0;
		this.anIntArray562 = new int[local14];
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < local14; local22++) {
			local26 = Static117.method2068(4);
			this.anIntArray562[local22] = local26;
			if (local26 >= local16) {
				local16 = local26 + 1;
			}
		}
		this.anIntArray561 = new int[local16];
		this.anIntArray566 = new int[local16];
		this.anIntArray564 = new int[local16];
		this.anIntArrayArray39 = new int[local16][];
		@Pc(77) int local77;
		@Pc(99) int local99;
		for (local26 = 0; local26 < local16; local26++) {
			this.anIntArray561[local26] = Static117.method2068(3) + 1;
			local77 = this.anIntArray566[local26] = Static117.method2068(2);
			if (local77 != 0) {
				this.anIntArray564[local26] = Static117.method2068(8);
			}
			local77 = 0x1 << local77;
			@Pc(92) int[] local92 = new int[local77];
			this.anIntArrayArray39[local26] = local92;
			for (local99 = 0; local99 < local77; local99++) {
				local92[local99] = Static117.method2068(8) - 1;
			}
		}
		this.anInt4179 = Static117.method2068(2) + 1;
		local77 = Static117.method2068(4);
		@Pc(126) int local126 = 2;
		for (local99 = 0; local99 < local14; local99++) {
			local126 += this.anIntArray561[this.anIntArray562[local99]];
		}
		this.anIntArray563 = new int[local126];
		this.anIntArray563[0] = 0;
		this.anIntArray563[1] = 0x1 << local77;
		local126 = 2;
		for (@Pc(163) int local163 = 0; local163 < local14; local163++) {
			@Pc(169) int local169 = this.anIntArray562[local163];
			for (@Pc(171) int local171 = 0; local171 < this.anIntArray561[local169]; local171++) {
				this.anIntArray563[local126++] = Static117.method2068(local77);
			}
		}
		if (Static172.anIntArray567 == null || Static172.anIntArray567.length < local126) {
			Static172.anIntArray567 = new int[local126];
			Static172.anIntArray565 = new int[local126];
			Static172.aBooleanArray19 = new boolean[local126];
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
	private void method2977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(9) int local9 = Static172.anIntArray567[arg0];
		@Pc(13) int local13 = Static172.anIntArray565[arg0];
		@Pc(17) boolean local17 = Static172.aBooleanArray19[arg0];
		for (@Pc(21) int local21 = arg0 + 1; local21 <= arg1; local21++) {
			@Pc(26) int local26 = Static172.anIntArray567[local21];
			if (local26 < local9) {
				Static172.anIntArray567[local5] = local26;
				Static172.anIntArray565[local5] = Static172.anIntArray565[local21];
				Static172.aBooleanArray19[local5] = Static172.aBooleanArray19[local21];
				local5++;
				Static172.anIntArray567[local21] = Static172.anIntArray567[local5];
				Static172.anIntArray565[local21] = Static172.anIntArray565[local5];
				Static172.aBooleanArray19[local21] = Static172.aBooleanArray19[local5];
			}
		}
		Static172.anIntArray567[local5] = local9;
		Static172.anIntArray565[local5] = local13;
		Static172.aBooleanArray19[local5] = local17;
		this.method2977(arg0, local5 - 1);
		this.method2977(local5 + 1, arg1);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIII[FI)V")
	private void method2978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4[arg0] *= Static172.aFloatArray9[arg1];
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
			arg4[local61] *= Static172.aFloatArray9[local20];
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIII)I")
	private int method2980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([FI)V")
	public void method2981(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = this.anIntArray563.length;
		@Pc(10) int local10 = Static172.anIntArray568[this.anInt4179 - 1];
		Static172.aBooleanArray19[0] = Static172.aBooleanArray19[1] = true;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(55) int local55;
		for (@Pc(20) int local20 = 2; local20 < local3; local20++) {
			local25 = Static172.method2983(Static172.anIntArray567, local20);
			local29 = Static172.method2984(Static172.anIntArray567, local20);
			local47 = this.method2980(Static172.anIntArray567[local25], Static172.anIntArray565[local25], Static172.anIntArray567[local29], Static172.anIntArray565[local29], Static172.anIntArray567[local20]);
			local51 = Static172.anIntArray565[local20];
			local55 = local10 - local47;
			@Pc(66) int local66 = (local55 < local47 ? local55 : local47) << 1;
			if (local51 == 0) {
				Static172.aBooleanArray19[local20] = false;
				Static172.anIntArray565[local20] = local47;
			} else {
				Static172.aBooleanArray19[local25] = Static172.aBooleanArray19[local29] = true;
				Static172.aBooleanArray19[local20] = true;
				if (local51 >= local66) {
					Static172.anIntArray565[local20] = local55 > local47 ? local51 + local47 - local47 : local47 - local51 + local55 - 1;
				} else {
					Static172.anIntArray565[local20] = (local51 & 0x1) == 0 ? local47 + local51 / 2 : local47 - (local51 + 1) / 2;
				}
			}
		}
		this.method2977(0, local3 - 1);
		local25 = 0;
		local29 = Static172.anIntArray565[0] * this.anInt4179;
		for (local47 = 1; local47 < local3; local47++) {
			if (Static172.aBooleanArray19[local47]) {
				local51 = Static172.anIntArray567[local47];
				local55 = Static172.anIntArray565[local47] * this.anInt4179;
				this.method2978(local25, local29, local51, local55, arg0, arg1);
				if (local51 >= arg1) {
					return;
				}
				local25 = local51;
				local29 = local55;
			}
		}
		@Pc(193) float local193 = Static172.aFloatArray9[local29];
		for (local55 = local25; local55 < arg1; local55++) {
			arg0[local55] *= local193;
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "()Z")
	public boolean method2982() {
		@Pc(5) boolean local5 = Static117.method2074() != 0;
		if (!local5) {
			return false;
		}
		@Pc(13) int local13 = this.anIntArray563.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			Static172.anIntArray567[local15] = this.anIntArray563[local15];
		}
		@Pc(34) int local34 = Static172.anIntArray568[this.anInt4179 - 1];
		@Pc(40) int local40 = Static81.method881(local34 - 1);
		Static172.anIntArray565[0] = Static117.method2068(local40);
		Static172.anIntArray565[1] = Static117.method2068(local40);
		@Pc(52) int local52 = 2;
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray562.length; local54++) {
			@Pc(60) int local60 = this.anIntArray562[local54];
			@Pc(65) int local65 = this.anIntArray561[local60];
			@Pc(70) int local70 = this.anIntArray566[local60];
			@Pc(76) int local76 = (0x1 << local70) - 1;
			@Pc(78) int local78 = 0;
			if (local70 > 0) {
				local78 = Static117.aClass54Array1[this.anIntArray564[local60]].method1721();
			}
			for (@Pc(90) int local90 = 0; local90 < local65; local90++) {
				@Pc(100) int local100 = this.anIntArrayArray39[local60][local78 & local76];
				local78 >>>= local70;
				Static172.anIntArray565[local52++] = local100 >= 0 ? Static117.aClass54Array1[local100].method1721() : 0;
			}
		}
		return true;
	}
}
