import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class17 {

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "[I")
	private final int[] anIntArray87;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "[I")
	private final int[] anIntArray85;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "[I")
	private final int[] anIntArray86;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "[I")
	private final int[] anIntArray90;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "[[I")
	private final int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
	private final int anInt1023;

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "[I")
	private final int[] anIntArray83;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	public Class17() {
		@Pc(4) int local4 = Static55.method976(16);
		if (local4 != 1) {
			throw new RuntimeException();
		}
		@Pc(14) int local14 = Static55.method976(5);
		@Pc(16) int local16 = 0;
		this.anIntArray87 = new int[local14];
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < local14; local22++) {
			local26 = Static55.method976(4);
			this.anIntArray87[local22] = local26;
			if (local26 >= local16) {
				local16 = local26 + 1;
			}
		}
		this.anIntArray85 = new int[local16];
		this.anIntArray86 = new int[local16];
		this.anIntArray90 = new int[local16];
		this.anIntArrayArray5 = new int[local16][];
		@Pc(77) int local77;
		@Pc(99) int local99;
		for (local26 = 0; local26 < local16; local26++) {
			this.anIntArray85[local26] = Static55.method976(3) + 1;
			local77 = this.anIntArray86[local26] = Static55.method976(2);
			if (local77 != 0) {
				this.anIntArray90[local26] = Static55.method976(8);
			}
			local77 = 0x1 << local77;
			@Pc(92) int[] local92 = new int[local77];
			this.anIntArrayArray5[local26] = local92;
			for (local99 = 0; local99 < local77; local99++) {
				local92[local99] = Static55.method976(8) - 1;
			}
		}
		this.anInt1023 = Static55.method976(2) + 1;
		local77 = Static55.method976(4);
		@Pc(126) int local126 = 2;
		for (local99 = 0; local99 < local14; local99++) {
			local126 += this.anIntArray85[this.anIntArray87[local99]];
		}
		this.anIntArray83 = new int[local126];
		this.anIntArray83[0] = 0;
		this.anIntArray83[1] = 0x1 << local77;
		local126 = 2;
		for (@Pc(163) int local163 = 0; local163 < local14; local163++) {
			@Pc(169) int local169 = this.anIntArray87[local163];
			for (@Pc(171) int local171 = 0; local171 < this.anIntArray85[local169]; local171++) {
				this.anIntArray83[local126++] = Static55.method976(local77);
			}
		}
		if (Static39.anIntArray84 == null || Static39.anIntArray84.length < local126) {
			Static39.anIntArray84 = new int[local126];
			Static39.anIntArray89 = new int[local126];
			Static39.aBooleanArray3 = new boolean[local126];
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
	private void method767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(9) int local9 = Static39.anIntArray84[arg0];
		@Pc(13) int local13 = Static39.anIntArray89[arg0];
		@Pc(17) boolean local17 = Static39.aBooleanArray3[arg0];
		for (@Pc(21) int local21 = arg0 + 1; local21 <= arg1; local21++) {
			@Pc(26) int local26 = Static39.anIntArray84[local21];
			if (local26 < local9) {
				Static39.anIntArray84[local5] = local26;
				Static39.anIntArray89[local5] = Static39.anIntArray89[local21];
				Static39.aBooleanArray3[local5] = Static39.aBooleanArray3[local21];
				local5++;
				Static39.anIntArray84[local21] = Static39.anIntArray84[local5];
				Static39.anIntArray89[local21] = Static39.anIntArray89[local5];
				Static39.aBooleanArray3[local21] = Static39.aBooleanArray3[local5];
			}
		}
		Static39.anIntArray84[local5] = local9;
		Static39.anIntArray89[local5] = local13;
		Static39.aBooleanArray3[local5] = local17;
		this.method767(arg0, local5 - 1);
		this.method767(local5 + 1, arg1);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "()Z")
	public boolean method768() {
		@Pc(5) boolean local5 = Static55.method986() != 0;
		if (!local5) {
			return false;
		}
		@Pc(13) int local13 = this.anIntArray83.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			Static39.anIntArray84[local15] = this.anIntArray83[local15];
		}
		@Pc(34) int local34 = Static39.anIntArray88[this.anInt1023 - 1];
		@Pc(40) int local40 = Static136.method2283(local34 - 1);
		Static39.anIntArray89[0] = Static55.method976(local40);
		Static39.anIntArray89[1] = Static55.method976(local40);
		@Pc(52) int local52 = 2;
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray87.length; local54++) {
			@Pc(60) int local60 = this.anIntArray87[local54];
			@Pc(65) int local65 = this.anIntArray85[local60];
			@Pc(70) int local70 = this.anIntArray86[local60];
			@Pc(76) int local76 = (0x1 << local70) - 1;
			@Pc(78) int local78 = 0;
			if (local70 > 0) {
				local78 = Static55.aClass10Array1[this.anIntArray90[local60]].method554();
			}
			for (@Pc(90) int local90 = 0; local90 < local65; local90++) {
				@Pc(100) int local100 = this.anIntArrayArray5[local60][local78 & local76];
				local78 >>>= local70;
				Static39.anIntArray89[local52++] = local100 >= 0 ? Static55.aClass10Array1[local100].method554() : 0;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII[FI)V")
	private void method770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4[arg0] *= Static39.aFloatArray1[arg1];
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
			arg4[local61] *= Static39.aFloatArray1[local20];
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([FI)V")
	public void method773(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = this.anIntArray83.length;
		@Pc(10) int local10 = Static39.anIntArray88[this.anInt1023 - 1];
		Static39.aBooleanArray3[0] = Static39.aBooleanArray3[1] = true;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(55) int local55;
		for (@Pc(20) int local20 = 2; local20 < local3; local20++) {
			local25 = Static39.method772(Static39.anIntArray84, local20);
			local29 = Static39.method769(Static39.anIntArray84, local20);
			local47 = this.method774(Static39.anIntArray84[local25], Static39.anIntArray89[local25], Static39.anIntArray84[local29], Static39.anIntArray89[local29], Static39.anIntArray84[local20]);
			local51 = Static39.anIntArray89[local20];
			local55 = local10 - local47;
			@Pc(66) int local66 = (local55 < local47 ? local55 : local47) << 1;
			if (local51 == 0) {
				Static39.aBooleanArray3[local20] = false;
				Static39.anIntArray89[local20] = local47;
			} else {
				Static39.aBooleanArray3[local25] = Static39.aBooleanArray3[local29] = true;
				Static39.aBooleanArray3[local20] = true;
				if (local51 >= local66) {
					Static39.anIntArray89[local20] = local55 > local47 ? local51 + local47 - local47 : local47 - local51 + local55 - 1;
				} else {
					Static39.anIntArray89[local20] = (local51 & 0x1) == 0 ? local47 + local51 / 2 : local47 - (local51 + 1) / 2;
				}
			}
		}
		this.method767(0, local3 - 1);
		local25 = 0;
		local29 = Static39.anIntArray89[0] * this.anInt1023;
		for (local47 = 1; local47 < local3; local47++) {
			if (Static39.aBooleanArray3[local47]) {
				local51 = Static39.anIntArray84[local47];
				local55 = Static39.anIntArray89[local47] * this.anInt1023;
				this.method770(local25, local29, local51, local55, arg0, arg1);
				if (local51 >= arg1) {
					return;
				}
				local25 = local51;
				local29 = local55;
			}
		}
		@Pc(193) float local193 = Static39.aFloatArray1[local29];
		for (local55 = local25; local55 < arg1; local55++) {
			arg0[local55] *= local193;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIII)I")
	private int method774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}
}
