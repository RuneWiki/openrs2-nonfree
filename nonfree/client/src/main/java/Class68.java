import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class68 {

	@OriginalMember(owner = "client!se", name = "d", descriptor = "Z")
	public boolean aBoolean110 = true;

	@OriginalMember(owner = "client!se", name = "h", descriptor = "I")
	public final int anInt2618;

	@OriginalMember(owner = "client!se", name = "s", descriptor = "I")
	public final int anInt2619;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "I")
	public final int anInt2620;

	@OriginalMember(owner = "client!se", name = "v", descriptor = "I")
	public final int anInt2621;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "[I")
	public final int[] anIntArray440;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "[I")
	public final int[] anIntArray434;

	@OriginalMember(owner = "client!se", name = "t", descriptor = "[I")
	public final int[] anIntArray445;

	@OriginalMember(owner = "client!se", name = "k", descriptor = "[I")
	public final int[] anIntArray438;

	@OriginalMember(owner = "client!se", name = "q", descriptor = "[I")
	public final int[] anIntArray443;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "[I")
	public final int[] anIntArray437;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "[I")
	public final int[] anIntArray442;

	@OriginalMember(owner = "client!se", name = "f", descriptor = "[I")
	public final int[] anIntArray435;

	@OriginalMember(owner = "client!se", name = "l", descriptor = "[I")
	public final int[] anIntArray439;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "[I")
	public int[] anIntArray431;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public Class68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18) {
		if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
			this.aBoolean110 = false;
		}
		this.anInt2618 = arg0;
		this.anInt2619 = arg1;
		this.anInt2620 = arg17;
		this.anInt2621 = arg18;
		@Pc(30) short local30 = 128;
		@Pc(34) int local34 = local30 / 2;
		@Pc(38) int local38 = local30 / 4;
		@Pc(44) int local44 = local30 * 3 / 4;
		@Pc(48) int[] local48 = Static107.anIntArrayArray26[arg0];
		@Pc(51) int local51 = local48.length;
		this.anIntArray440 = new int[local51];
		this.anIntArray434 = new int[local51];
		this.anIntArray445 = new int[local51];
		@Pc(66) int[] local66 = new int[local51];
		@Pc(69) int[] local69 = new int[local51];
		@Pc(73) int local73 = arg3 * local30;
		@Pc(77) int local77 = arg4 * local30;
		@Pc(140) int local140;
		@Pc(142) int local142;
		@Pc(144) int local144;
		@Pc(146) int local146;
		@Pc(148) int local148;
		for (@Pc(79) int local79 = 0; local79 < local51; local79++) {
			@Pc(84) int local84 = local48[local79];
			if ((local84 & 0x1) == 0 && local84 <= 8) {
				local84 = (local84 - arg1 - arg1 - 1 & 0x7) + 1;
			}
			if (local84 > 8 && local84 <= 12) {
				local84 = (local84 - arg1 - 9 & 0x3) + 9;
			}
			if (local84 > 12 && local84 <= 16) {
				local84 = (local84 - arg1 - 13 & 0x3) + 13;
			}
			if (local84 == 1) {
				local140 = local73;
				local142 = local77;
				local144 = arg5;
				local146 = arg9;
				local148 = arg13;
			} else if (local84 == 2) {
				local140 = local73 + local34;
				local142 = local77;
				local144 = arg5 + arg6 >> 1;
				local146 = arg9 + arg10 >> 1;
				local148 = arg13 + arg14 >> 1;
			} else if (local84 == 3) {
				local140 = local73 + local30;
				local142 = local77;
				local144 = arg6;
				local146 = arg10;
				local148 = arg14;
			} else if (local84 == 4) {
				local140 = local73 + local30;
				local142 = local77 + local34;
				local144 = arg6 + arg7 >> 1;
				local146 = arg10 + arg11 >> 1;
				local148 = arg14 + arg15 >> 1;
			} else if (local84 == 5) {
				local140 = local73 + local30;
				local142 = local77 + local30;
				local144 = arg7;
				local146 = arg11;
				local148 = arg15;
			} else if (local84 == 6) {
				local140 = local73 + local34;
				local142 = local77 + local30;
				local144 = arg7 + arg8 >> 1;
				local146 = arg11 + arg12 >> 1;
				local148 = arg15 + arg16 >> 1;
			} else if (local84 == 7) {
				local140 = local73;
				local142 = local77 + local30;
				local144 = arg8;
				local146 = arg12;
				local148 = arg16;
			} else if (local84 == 8) {
				local140 = local73;
				local142 = local77 + local34;
				local144 = arg8 + arg5 >> 1;
				local146 = arg12 + arg9 >> 1;
				local148 = arg16 + arg13 >> 1;
			} else if (local84 == 9) {
				local140 = local73 + local34;
				local142 = local77 + local38;
				local144 = arg5 + arg6 >> 1;
				local146 = arg9 + arg10 >> 1;
				local148 = arg13 + arg14 >> 1;
			} else if (local84 == 10) {
				local140 = local73 + local44;
				local142 = local77 + local34;
				local144 = arg6 + arg7 >> 1;
				local146 = arg10 + arg11 >> 1;
				local148 = arg14 + arg15 >> 1;
			} else if (local84 == 11) {
				local140 = local73 + local34;
				local142 = local77 + local44;
				local144 = arg7 + arg8 >> 1;
				local146 = arg11 + arg12 >> 1;
				local148 = arg15 + arg16 >> 1;
			} else if (local84 == 12) {
				local140 = local73 + local38;
				local142 = local77 + local34;
				local144 = arg8 + arg5 >> 1;
				local146 = arg12 + arg9 >> 1;
				local148 = arg16 + arg13 >> 1;
			} else if (local84 == 13) {
				local140 = local73 + local38;
				local142 = local77 + local38;
				local144 = arg5;
				local146 = arg9;
				local148 = arg13;
			} else if (local84 == 14) {
				local140 = local73 + local44;
				local142 = local77 + local38;
				local144 = arg6;
				local146 = arg10;
				local148 = arg14;
			} else if (local84 == 15) {
				local140 = local73 + local44;
				local142 = local77 + local44;
				local144 = arg7;
				local146 = arg11;
				local148 = arg15;
			} else {
				local140 = local73 + local38;
				local142 = local77 + local44;
				local144 = arg8;
				local146 = arg12;
				local148 = arg16;
			}
			this.anIntArray440[local79] = local140;
			this.anIntArray434[local79] = local144;
			this.anIntArray445[local79] = local142;
			local66[local79] = local146;
			local69[local79] = local148;
		}
		@Pc(534) int[] local534 = Static107.anIntArrayArray27[arg0];
		local140 = local534.length / 4;
		this.anIntArray438 = new int[local140];
		this.anIntArray443 = new int[local140];
		this.anIntArray437 = new int[local140];
		this.anIntArray442 = new int[local140];
		this.anIntArray435 = new int[local140];
		this.anIntArray439 = new int[local140];
		if (arg2 != -1) {
			this.anIntArray431 = new int[local140];
		}
		local142 = 0;
		for (local144 = 0; local144 < local140; local144++) {
			local146 = local534[local142];
			local148 = local534[local142 + 1];
			@Pc(591) int local591 = local534[local142 + 2];
			@Pc(597) int local597 = local534[local142 + 3];
			local142 += 4;
			if (local148 < 4) {
				local148 = local148 - arg1 & 0x3;
			}
			if (local591 < 4) {
				local591 = local591 - arg1 & 0x3;
			}
			if (local597 < 4) {
				local597 = local597 - arg1 & 0x3;
			}
			this.anIntArray438[local144] = local148;
			this.anIntArray443[local144] = local591;
			this.anIntArray437[local144] = local597;
			if (local146 == 0) {
				this.anIntArray442[local144] = local66[local148];
				this.anIntArray435[local144] = local66[local591];
				this.anIntArray439[local144] = local66[local597];
				if (this.anIntArray431 != null) {
					this.anIntArray431[local144] = -1;
				}
			} else {
				this.anIntArray442[local144] = local69[local148];
				this.anIntArray435[local144] = local69[local591];
				this.anIntArray439[local144] = local69[local597];
				if (this.anIntArray431 != null) {
					this.anIntArray431[local144] = arg2;
				}
			}
		}
		local146 = arg5;
		local148 = arg6;
		if (arg6 < arg5) {
			local146 = arg6;
		}
		if (arg6 > arg6) {
			local148 = arg6;
		}
		if (arg7 < local146) {
			local146 = arg7;
		}
		if (arg7 > arg6) {
			local148 = arg7;
		}
		if (arg8 < local146) {
			;
		}
		if (arg8 > local148) {
			;
		}
	}
}
