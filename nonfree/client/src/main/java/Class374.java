import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class374 {

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "[I")
	private final int[] anIntArray566;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "[I")
	private final int[] anIntArray565;

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "[I")
	private final int[] anIntArray569;

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "[I")
	private final int[] anIntArray567;

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "[[I")
	private final int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
	private final int anInt10589;

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "[I")
	private final int[] anIntArray571;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
	public Class374() {
		@Pc(4) int local4 = Static670.method8936(16);
		if (local4 != 1) {
			throw new RuntimeException();
		}
		@Pc(14) int local14 = Static670.method8936(5);
		@Pc(16) int local16 = 0;
		this.anIntArray566 = new int[local14];
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < local14; local22++) {
			local26 = Static670.method8936(4);
			this.anIntArray566[local22] = local26;
			if (local26 >= local16) {
				local16 = local26 + 1;
			}
		}
		this.anIntArray565 = new int[local16];
		this.anIntArray569 = new int[local16];
		this.anIntArray567 = new int[local16];
		this.anIntArrayArray60 = new int[local16][];
		@Pc(77) int local77;
		@Pc(99) int local99;
		for (local26 = 0; local26 < local16; local26++) {
			this.anIntArray565[local26] = Static670.method8936(3) + 1;
			local77 = this.anIntArray569[local26] = Static670.method8936(2);
			if (local77 != 0) {
				this.anIntArray567[local26] = Static670.method8936(8);
			}
			local77 = 0x1 << local77;
			@Pc(92) int[] local92 = new int[local77];
			this.anIntArrayArray60[local26] = local92;
			for (local99 = 0; local99 < local77; local99++) {
				local92[local99] = Static670.method8936(8) - 1;
			}
		}
		this.anInt10589 = Static670.method8936(2) + 1;
		local77 = Static670.method8936(4);
		@Pc(126) int local126 = 2;
		for (local99 = 0; local99 < local14; local99++) {
			local126 += this.anIntArray565[this.anIntArray566[local99]];
		}
		this.anIntArray571 = new int[local126];
		this.anIntArray571[0] = 0;
		this.anIntArray571[1] = 0x1 << local77;
		local126 = 2;
		for (@Pc(163) int local163 = 0; local163 < local14; local163++) {
			@Pc(169) int local169 = this.anIntArray566[local163];
			for (@Pc(171) int local171 = 0; local171 < this.anIntArray565[local169]; local171++) {
				this.anIntArray571[local126++] = Static670.method8936(local77);
			}
		}
		if (Static644.anIntArray570 == null || Static644.anIntArray570.length < local126) {
			Static644.anIntArray570 = new int[local126];
			Static644.anIntArray568 = new int[local126];
			Static644.aBooleanArray30 = new boolean[local126];
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)V")
	private void method8669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(9) int local9 = Static644.anIntArray570[arg0];
		@Pc(13) int local13 = Static644.anIntArray568[arg0];
		@Pc(17) boolean local17 = Static644.aBooleanArray30[arg0];
		for (@Pc(21) int local21 = arg0 + 1; local21 <= arg1; local21++) {
			@Pc(26) int local26 = Static644.anIntArray570[local21];
			if (local26 < local9) {
				Static644.anIntArray570[local5] = local26;
				Static644.anIntArray568[local5] = Static644.anIntArray568[local21];
				Static644.aBooleanArray30[local5] = Static644.aBooleanArray30[local21];
				local5++;
				Static644.anIntArray570[local21] = Static644.anIntArray570[local5];
				Static644.anIntArray568[local21] = Static644.anIntArray568[local5];
				Static644.aBooleanArray30[local21] = Static644.aBooleanArray30[local5];
			}
		}
		Static644.anIntArray570[local5] = local9;
		Static644.anIntArray568[local5] = local13;
		Static644.aBooleanArray30[local5] = local17;
		this.method8669(arg0, local5 - 1);
		this.method8669(local5 + 1, arg1);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIII[FI)V")
	private void method8670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4[arg0] *= Static644.aFloatArray69[arg1];
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
			arg4[local61] *= Static644.aFloatArray69[local20];
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIII)I")
	private int method8672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "()Z")
	public boolean method8673() {
		@Pc(5) boolean local5 = Static670.method8929() != 0;
		if (!local5) {
			return false;
		}
		@Pc(13) int local13 = this.anIntArray571.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			Static644.anIntArray570[local15] = this.anIntArray571[local15];
		}
		@Pc(34) int local34 = Static644.anIntArray564[this.anInt10589 - 1];
		@Pc(40) int local40 = Static407.method5605(local34 - 1);
		Static644.anIntArray568[0] = Static670.method8936(local40);
		Static644.anIntArray568[1] = Static670.method8936(local40);
		@Pc(52) int local52 = 2;
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray566.length; local54++) {
			@Pc(60) int local60 = this.anIntArray566[local54];
			@Pc(65) int local65 = this.anIntArray565[local60];
			@Pc(70) int local70 = this.anIntArray569[local60];
			@Pc(76) int local76 = (0x1 << local70) - 1;
			@Pc(78) int local78 = 0;
			if (local70 > 0) {
				local78 = Static670.aClass351Array1[this.anIntArray567[local60]].method8255();
			}
			for (@Pc(90) int local90 = 0; local90 < local65; local90++) {
				@Pc(100) int local100 = this.anIntArrayArray60[local60][local78 & local76];
				local78 >>>= local70;
				Static644.anIntArray568[local52++] = local100 >= 0 ? Static670.aClass351Array1[local100].method8255() : 0;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([FI)V")
	public void method8674(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = this.anIntArray571.length;
		@Pc(10) int local10 = Static644.anIntArray564[this.anInt10589 - 1];
		Static644.aBooleanArray30[0] = Static644.aBooleanArray30[1] = true;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(55) int local55;
		for (@Pc(20) int local20 = 2; local20 < local3; local20++) {
			local25 = Static644.method8671(Static644.anIntArray570, local20);
			local29 = Static644.method8668(Static644.anIntArray570, local20);
			local47 = this.method8672(Static644.anIntArray570[local25], Static644.anIntArray568[local25], Static644.anIntArray570[local29], Static644.anIntArray568[local29], Static644.anIntArray570[local20]);
			local51 = Static644.anIntArray568[local20];
			local55 = local10 - local47;
			@Pc(66) int local66 = (local55 < local47 ? local55 : local47) << 1;
			if (local51 == 0) {
				Static644.aBooleanArray30[local20] = false;
				Static644.anIntArray568[local20] = local47;
			} else {
				Static644.aBooleanArray30[local25] = Static644.aBooleanArray30[local29] = true;
				Static644.aBooleanArray30[local20] = true;
				if (local51 >= local66) {
					Static644.anIntArray568[local20] = local55 > local47 ? local51 + local47 - local47 : local47 - local51 + local55 - 1;
				} else {
					Static644.anIntArray568[local20] = (local51 & 0x1) == 0 ? local47 + local51 / 2 : local47 - (local51 + 1) / 2;
				}
			}
		}
		this.method8669(0, local3 - 1);
		local25 = 0;
		local29 = Static644.anIntArray568[0] * this.anInt10589;
		for (local47 = 1; local47 < local3; local47++) {
			if (Static644.aBooleanArray30[local47]) {
				local51 = Static644.anIntArray570[local47];
				local55 = Static644.anIntArray568[local47] * this.anInt10589;
				this.method8670(local25, local29, local51, local55, arg0, arg1);
				if (local51 >= arg1) {
					return;
				}
				local25 = local51;
				local29 = local55;
			}
		}
		@Pc(193) float local193 = Static644.aFloatArray69[local29];
		for (local55 = local25; local55 < arg1; local55++) {
			arg0[local55] *= local193;
		}
	}
}
