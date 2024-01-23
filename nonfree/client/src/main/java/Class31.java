import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class31 {

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "[I")
	private int[] anIntArray109;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "[I")
	private int[] anIntArray106;

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "[I")
	private int[] anIntArray108;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "[I")
	private int[] anIntArray103;

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "[I")
	private int[] anIntArray110;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
	public Class31() {
		@Pc(4) int local4 = Static135.method2266(16);
		if (local4 != 1) {
			throw new RuntimeException();
		}
		@Pc(14) int local14 = Static135.method2266(5);
		@Pc(16) int local16 = 0;
		this.anIntArray109 = new int[local14];
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < local14; local22++) {
			local26 = Static135.method2266(4);
			this.anIntArray109[local22] = local26;
			if (local26 >= local16) {
				local16 = local26 + 1;
			}
		}
		this.anIntArray106 = new int[local16];
		this.anIntArray108 = new int[local16];
		this.anIntArray103 = new int[local16];
		this.anIntArrayArray18 = new int[local16][];
		@Pc(77) int local77;
		@Pc(99) int local99;
		for (local26 = 0; local26 < local16; local26++) {
			this.anIntArray106[local26] = Static135.method2266(3) + 1;
			local77 = this.anIntArray108[local26] = Static135.method2266(2);
			if (local77 != 0) {
				this.anIntArray103[local26] = Static135.method2266(8);
			}
			local77 = 0x1 << local77;
			@Pc(92) int[] local92 = new int[local77];
			this.anIntArrayArray18[local26] = local92;
			for (local99 = 0; local99 < local77; local99++) {
				local92[local99] = Static135.method2266(8) - 1;
			}
		}
		this.anInt993 = Static135.method2266(2) + 1;
		local77 = Static135.method2266(4);
		@Pc(126) int local126 = 2;
		for (local99 = 0; local99 < local14; local99++) {
			local126 += this.anIntArray106[this.anIntArray109[local99]];
		}
		this.anIntArray110 = new int[local126];
		this.anIntArray110[0] = 0;
		this.anIntArray110[1] = 0x1 << local77;
		local126 = 2;
		for (@Pc(163) int local163 = 0; local163 < local14; local163++) {
			@Pc(169) int local169 = this.anIntArray109[local163];
			for (@Pc(171) int local171 = 0; local171 < this.anIntArray106[local169]; local171++) {
				this.anIntArray110[local126++] = Static135.method2266(local77);
			}
		}
		if (Static45.anIntArray107 == null || Static45.anIntArray107.length < local126) {
			Static45.anIntArray107 = new int[local126];
			Static45.anIntArray104 = new int[local126];
			Static45.aBooleanArray9 = new boolean[local126];
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)I")
	private int method876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "([FI)V")
	public void method878(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = this.anIntArray110.length;
		@Pc(10) int local10 = Static45.anIntArray105[this.anInt993 - 1];
		Static45.aBooleanArray9[0] = Static45.aBooleanArray9[1] = true;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(55) int local55;
		for (@Pc(20) int local20 = 2; local20 < local3; local20++) {
			local25 = Static45.method880(Static45.anIntArray107, local20);
			local29 = Static45.method877(Static45.anIntArray107, local20);
			local47 = this.method876(Static45.anIntArray107[local25], Static45.anIntArray104[local25], Static45.anIntArray107[local29], Static45.anIntArray104[local29], Static45.anIntArray107[local20]);
			local51 = Static45.anIntArray104[local20];
			local55 = local10 - local47;
			@Pc(66) int local66 = (local55 < local47 ? local55 : local47) << 1;
			if (local51 == 0) {
				Static45.aBooleanArray9[local20] = false;
				Static45.anIntArray104[local20] = local47;
			} else {
				Static45.aBooleanArray9[local25] = Static45.aBooleanArray9[local29] = true;
				Static45.aBooleanArray9[local20] = true;
				if (local51 >= local66) {
					Static45.anIntArray104[local20] = local55 > local47 ? local51 + local47 - local47 : local47 - local51 + local55 - 1;
				} else {
					Static45.anIntArray104[local20] = (local51 & 0x1) == 0 ? local47 + local51 / 2 : local47 - (local51 + 1) / 2;
				}
			}
		}
		this.method883(0, local3 - 1);
		local25 = 0;
		local29 = Static45.anIntArray104[0] * this.anInt993;
		for (local47 = 1; local47 < local3; local47++) {
			if (Static45.aBooleanArray9[local47]) {
				local51 = Static45.anIntArray107[local47];
				local55 = Static45.anIntArray104[local47] * this.anInt993;
				this.method881(local25, local29, local51, local55, arg0, arg1);
				if (local51 >= arg1) {
					return;
				}
				local25 = local51;
				local29 = local55;
			}
		}
		@Pc(193) float local193 = Static45.aFloatArray1[local29];
		for (local55 = local25; local55 < arg1; local55++) {
			arg0[local55] *= local193;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIII[FI)V")
	private void method881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4[arg0] *= Static45.aFloatArray1[arg1];
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
			arg4[local61] *= Static45.aFloatArray1[local20];
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "()Z")
	public boolean method882() {
		@Pc(5) boolean local5 = Static135.method2268() != 0;
		if (!local5) {
			return false;
		}
		@Pc(13) int local13 = this.anIntArray110.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			Static45.anIntArray107[local15] = this.anIntArray110[local15];
		}
		@Pc(34) int local34 = Static45.anIntArray105[this.anInt993 - 1];
		@Pc(40) int local40 = Static57.method3708(local34 - 1);
		Static45.anIntArray104[0] = Static135.method2266(local40);
		Static45.anIntArray104[1] = Static135.method2266(local40);
		@Pc(52) int local52 = 2;
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray109.length; local54++) {
			@Pc(60) int local60 = this.anIntArray109[local54];
			@Pc(65) int local65 = this.anIntArray106[local60];
			@Pc(70) int local70 = this.anIntArray108[local60];
			@Pc(76) int local76 = (0x1 << local70) - 1;
			@Pc(78) int local78 = 0;
			if (local70 > 0) {
				local78 = Static135.aClass122Array1[this.anIntArray103[local60]].method3657();
			}
			for (@Pc(90) int local90 = 0; local90 < local65; local90++) {
				@Pc(100) int local100 = this.anIntArrayArray18[local60][local78 & local76];
				local78 >>>= local70;
				Static45.anIntArray104[local52++] = local100 >= 0 ? Static135.aClass122Array1[local100].method3657() : 0;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V")
	private void method883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(9) int local9 = Static45.anIntArray107[arg0];
		@Pc(13) int local13 = Static45.anIntArray104[arg0];
		@Pc(17) boolean local17 = Static45.aBooleanArray9[arg0];
		for (@Pc(21) int local21 = arg0 + 1; local21 <= arg1; local21++) {
			@Pc(26) int local26 = Static45.anIntArray107[local21];
			if (local26 < local9) {
				Static45.anIntArray107[local5] = local26;
				Static45.anIntArray104[local5] = Static45.anIntArray104[local21];
				Static45.aBooleanArray9[local5] = Static45.aBooleanArray9[local21];
				local5++;
				Static45.anIntArray107[local21] = Static45.anIntArray107[local5];
				Static45.anIntArray104[local21] = Static45.anIntArray104[local5];
				Static45.aBooleanArray9[local21] = Static45.aBooleanArray9[local5];
			}
		}
		Static45.anIntArray107[local5] = local9;
		Static45.anIntArray104[local5] = local13;
		Static45.aBooleanArray9[local5] = local17;
		this.method883(arg0, local5 - 1);
		this.method883(local5 + 1, arg1);
	}
}
