import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class27 {

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "Z")
	public boolean aBoolean99 = true;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
	public final int anInt977;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
	public final int anInt975;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
	public final int anInt976;

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
	public final int anInt978;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "[I")
	public final int[] anIntArray120;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "[I")
	public final int[] anIntArray115;

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "[I")
	public final int[] anIntArray126;

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "[I")
	public final int[] anIntArray125;

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "[I")
	public final int[] anIntArray127;

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "[I")
	public final int[] anIntArray113;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "[I")
	public final int[] anIntArray119;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "[I")
	public final int[] anIntArray117;

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "[I")
	public final int[] anIntArray122;

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "[I")
	public int[] anIntArray118;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public Class27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18) {
		if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
			this.aBoolean99 = false;
		}
		this.anInt977 = arg0;
		this.anInt975 = arg1;
		this.anInt976 = arg17;
		this.anInt978 = arg18;
		@Pc(30) short local30 = 128;
		@Pc(34) int local34 = local30 / 2;
		@Pc(38) int local38 = local30 / 4;
		@Pc(44) int local44 = local30 * 3 / 4;
		@Pc(48) int[] local48 = Static40.anIntArrayArray10[arg0];
		@Pc(51) int local51 = local48.length;
		this.anIntArray120 = new int[local51];
		this.anIntArray115 = new int[local51];
		this.anIntArray126 = new int[local51];
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
			this.anIntArray120[local79] = local140;
			this.anIntArray115[local79] = local144;
			this.anIntArray126[local79] = local142;
			local66[local79] = local146;
			local69[local79] = local148;
		}
		@Pc(534) int[] local534 = Static40.anIntArrayArray9[arg0];
		local140 = local534.length / 4;
		this.anIntArray125 = new int[local140];
		this.anIntArray127 = new int[local140];
		this.anIntArray113 = new int[local140];
		this.anIntArray119 = new int[local140];
		this.anIntArray117 = new int[local140];
		this.anIntArray122 = new int[local140];
		if (arg2 != -1) {
			this.anIntArray118 = new int[local140];
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
			this.anIntArray125[local144] = local148;
			this.anIntArray127[local144] = local591;
			this.anIntArray113[local144] = local597;
			if (local146 == 0) {
				this.anIntArray119[local144] = local66[local148];
				this.anIntArray117[local144] = local66[local591];
				this.anIntArray122[local144] = local66[local597];
				if (this.anIntArray118 != null) {
					this.anIntArray118[local144] = -1;
				}
			} else {
				this.anIntArray119[local144] = local69[local148];
				this.anIntArray117[local144] = local69[local591];
				this.anIntArray122[local144] = local69[local597];
				if (this.anIntArray118 != null) {
					this.anIntArray118[local144] = arg2;
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
