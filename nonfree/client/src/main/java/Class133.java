import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class133 {

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "Z")
	public boolean aBoolean272 = true;

	@OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
	public int anInt4002;

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
	public int anInt4000;

	@OriginalMember(owner = "client!oo", name = "v", descriptor = "I")
	public int anInt4003;

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
	public int anInt4001;

	@OriginalMember(owner = "client!oo", name = "s", descriptor = "[I")
	public int[] anIntArray331;

	@OriginalMember(owner = "client!oo", name = "q", descriptor = "[I")
	public int[] anIntArray329;

	@OriginalMember(owner = "client!oo", name = "n", descriptor = "[I")
	public int[] anIntArray326;

	@OriginalMember(owner = "client!oo", name = "p", descriptor = "[I")
	public int[] anIntArray328;

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "[I")
	public int[] anIntArray324;

	@OriginalMember(owner = "client!oo", name = "r", descriptor = "[I")
	public int[] anIntArray330;

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "[I")
	public int[] anIntArray323;

	@OriginalMember(owner = "client!oo", name = "t", descriptor = "[I")
	public int[] anIntArray332;

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "[I")
	public int[] anIntArray321;

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "[I")
	public int[] anIntArray320;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public Class133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18) {
		if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
			this.aBoolean272 = false;
		}
		this.anInt4002 = arg0;
		this.anInt4000 = arg1;
		this.anInt4003 = arg17;
		this.anInt4001 = arg18;
		@Pc(30) short local30 = 128;
		@Pc(34) int local34 = local30 / 2;
		@Pc(38) int local38 = local30 / 4;
		@Pc(44) int local44 = local30 * 3 / 4;
		@Pc(48) int[] local48 = Static211.anIntArrayArray30[arg0];
		@Pc(51) int local51 = local48.length;
		this.anIntArray331 = new int[local51];
		this.anIntArray329 = new int[local51];
		this.anIntArray326 = new int[local51];
		@Pc(66) int[] local66 = new int[local51];
		@Pc(69) int[] local69 = new int[local51];
		@Pc(73) int local73 = arg3 * local30;
		@Pc(77) int local77 = arg4 * local30;
		@Pc(86) int local86;
		@Pc(142) int local142;
		@Pc(144) int local144;
		@Pc(146) int local146;
		@Pc(148) int local148;
		@Pc(150) int local150;
		for (@Pc(79) int local79 = 0; local79 < local51; local79++) {
			local86 = local48[local79];
			if ((local86 & 0x1) == 0 && local86 <= 8) {
				local86 = (local86 - arg1 - arg1 - 1 & 0x7) + 1;
			}
			if (local86 > 8 && local86 <= 12) {
				local86 = (local86 - arg1 - 9 & 0x3) + 9;
			}
			if (local86 > 12 && local86 <= 16) {
				local86 = (local86 - arg1 - 13 & 0x3) + 13;
			}
			if (local86 == 1) {
				local142 = local73;
				local144 = local77;
				local146 = arg5;
				local148 = arg9;
				local150 = arg13;
			} else if (local86 == 2) {
				local142 = local73 + local34;
				local144 = local77;
				local146 = arg5 + arg6 >> 1;
				local148 = arg9 + arg10 >> 1;
				local150 = arg13 + arg14 >> 1;
			} else if (local86 == 3) {
				local142 = local73 + local30;
				local144 = local77;
				local146 = arg6;
				local148 = arg10;
				local150 = arg14;
			} else if (local86 == 4) {
				local142 = local73 + local30;
				local144 = local77 + local34;
				local146 = arg6 + arg7 >> 1;
				local148 = arg10 + arg11 >> 1;
				local150 = arg14 + arg15 >> 1;
			} else if (local86 == 5) {
				local142 = local73 + local30;
				local144 = local77 + local30;
				local146 = arg7;
				local148 = arg11;
				local150 = arg15;
			} else if (local86 == 6) {
				local142 = local73 + local34;
				local144 = local77 + local30;
				local146 = arg7 + arg8 >> 1;
				local148 = arg11 + arg12 >> 1;
				local150 = arg15 + arg16 >> 1;
			} else if (local86 == 7) {
				local142 = local73;
				local144 = local77 + local30;
				local146 = arg8;
				local148 = arg12;
				local150 = arg16;
			} else if (local86 == 8) {
				local142 = local73;
				local144 = local77 + local34;
				local146 = arg8 + arg5 >> 1;
				local148 = arg12 + arg9 >> 1;
				local150 = arg16 + arg13 >> 1;
			} else if (local86 == 9) {
				local142 = local73 + local34;
				local144 = local77 + local38;
				local146 = arg5 + arg6 >> 1;
				local148 = arg9 + arg10 >> 1;
				local150 = arg13 + arg14 >> 1;
			} else if (local86 == 10) {
				local142 = local73 + local44;
				local144 = local77 + local34;
				local146 = arg6 + arg7 >> 1;
				local148 = arg10 + arg11 >> 1;
				local150 = arg14 + arg15 >> 1;
			} else if (local86 == 11) {
				local142 = local73 + local34;
				local144 = local77 + local44;
				local146 = arg7 + arg8 >> 1;
				local148 = arg11 + arg12 >> 1;
				local150 = arg15 + arg16 >> 1;
			} else if (local86 == 12) {
				local142 = local73 + local38;
				local144 = local77 + local34;
				local146 = arg8 + arg5 >> 1;
				local148 = arg12 + arg9 >> 1;
				local150 = arg16 + arg13 >> 1;
			} else if (local86 == 13) {
				local142 = local73 + local38;
				local144 = local77 + local38;
				local146 = arg5;
				local148 = arg9;
				local150 = arg13;
			} else if (local86 == 14) {
				local142 = local73 + local44;
				local144 = local77 + local38;
				local146 = arg6;
				local148 = arg10;
				local150 = arg14;
			} else if (local86 == 15) {
				local142 = local73 + local44;
				local144 = local77 + local44;
				local146 = arg7;
				local148 = arg11;
				local150 = arg15;
			} else {
				local142 = local73 + local38;
				local144 = local77 + local44;
				local146 = arg8;
				local148 = arg12;
				local150 = arg16;
			}
			this.anIntArray331[local79] = local142;
			this.anIntArray329[local79] = local146;
			this.anIntArray326[local79] = local144;
			local66[local79] = local148;
			local69[local79] = local150;
		}
		@Pc(534) int[] local534 = Static211.anIntArrayArray29[arg0];
		local86 = local534.length / 4;
		this.anIntArray328 = new int[local86];
		this.anIntArray324 = new int[local86];
		this.anIntArray330 = new int[local86];
		this.anIntArray323 = new int[local86];
		this.anIntArray332 = new int[local86];
		this.anIntArray321 = new int[local86];
		if (arg2 != -1) {
			this.anIntArray320 = new int[local86];
		}
		local142 = 0;
		for (local144 = 0; local144 < local86; local144++) {
			local146 = local534[local142];
			local148 = local534[local142 + 1];
			local150 = local534[local142 + 2];
			@Pc(599) int local599 = local534[local142 + 3];
			local142 += 4;
			if (local148 < 4) {
				local148 = local148 - arg1 & 0x3;
			}
			if (local150 < 4) {
				local150 = local150 - arg1 & 0x3;
			}
			if (local599 < 4) {
				local599 = local599 - arg1 & 0x3;
			}
			this.anIntArray328[local144] = local148;
			this.anIntArray324[local144] = local150;
			this.anIntArray330[local144] = local599;
			if (local146 == 0) {
				this.anIntArray323[local144] = local66[local148];
				this.anIntArray332[local144] = local66[local150];
				this.anIntArray321[local144] = local66[local599];
				if (this.anIntArray320 != null) {
					this.anIntArray320[local144] = -1;
				}
			} else {
				this.anIntArray323[local144] = local69[local148];
				this.anIntArray332[local144] = local69[local150];
				this.anIntArray321[local144] = local69[local599];
				if (this.anIntArray320 != null) {
					this.anIntArray320[local144] = arg2;
				}
			}
		}
		local144 = arg5;
		local146 = arg6;
		if (arg6 < arg5) {
			local144 = arg6;
		}
		if (arg6 > arg6) {
			local146 = arg6;
		}
		if (arg7 < local144) {
			local144 = arg7;
		}
		if (arg7 > arg6) {
			local146 = arg7;
		}
		if (arg8 < local144) {
			;
		}
		if (arg8 > local146) {
			;
		}
	}
}
