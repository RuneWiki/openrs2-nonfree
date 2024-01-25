import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class83 {

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "[I")
	private int[] anIntArray210;

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "[I")
	public int[] anIntArray211;

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "Lclient!nc;")
	public Class174 aClass174_1;

	@OriginalMember(owner = "client!fn", name = "v", descriptor = "I")
	public int anInt1994;

	@OriginalMember(owner = "client!fn", name = "A", descriptor = "[I")
	public int[] anIntArray212;

	@OriginalMember(owner = "client!fn", name = "C", descriptor = "[Z")
	public boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
	public int anInt1985 = 99;

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
	public int anInt1981 = 2;

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
	public int anInt1987 = -1;

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
	public int anInt1984 = -1;

	@OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
	public int anInt1992 = -1;

	@OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
	public int anInt1986 = -1;

	@OriginalMember(owner = "client!fn", name = "x", descriptor = "Z")
	public boolean aBoolean156 = false;

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "Z")
	public boolean aBoolean153 = false;

	@OriginalMember(owner = "client!fn", name = "j", descriptor = "Z")
	public boolean aBoolean155 = false;

	@OriginalMember(owner = "client!fn", name = "B", descriptor = "I")
	public int anInt1998 = 5;

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "Z")
	public boolean aBoolean154 = false;

	@OriginalMember(owner = "client!fn", name = "z", descriptor = "I")
	public int anInt1997 = -1;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILclient!cd;III)Lclient!cd;")
	public Class39 method1827(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray212[arg2];
		@Pc(13) int local13 = this.anIntArray211[arg2];
		@Pc(21) Class6_Sub1_Sub5 local21 = this.aClass174_1.method4013(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg1.method4863((byte) 1, arg0, true);
		}
		@Pc(43) Class6_Sub1_Sub5 local43 = null;
		if ((this.aBoolean156 || Static116.aBoolean157) && arg4 != -1 && this.anIntArray211.length > arg4) {
			@Pc(61) int local61 = this.anIntArray211[arg4];
			local43 = this.aClass174_1.method4013(local61 >> 16);
			arg4 = local61 & 0xFFFF;
		}
		@Pc(75) Class6_Sub1_Sub5 local75 = null;
		@Pc(77) Class6_Sub1_Sub5 local77 = null;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.anIntArray210 != null) {
			if (arg2 < this.anIntArray210.length) {
				local79 = this.anIntArray210[arg2];
				if (local79 != 65535) {
					local75 = this.aClass174_1.method4013(local79 >> 16);
					local79 &= 0xFFFF;
				}
			}
			if ((this.aBoolean156 || Static116.aBoolean157) && arg4 != -1 && arg4 < this.anIntArray210.length) {
				local81 = this.anIntArray210[arg4];
				if (local81 != 65535) {
					local77 = this.aClass174_1.method4013(local81 >> 16);
					local81 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean153) {
			arg0 |= 0x200;
		}
		if (local21.method1090(local25)) {
			arg0 |= 0x80;
		}
		if (local21.method1094(local25)) {
			arg0 |= 0x100;
		}
		if (local21.method1092(local25)) {
			arg0 |= 0x400;
		}
		if (local75 != null) {
			if (local75.method1090(local79)) {
				arg0 |= 0x80;
			}
			if (local75.method1094(local79)) {
				arg0 |= 0x100;
			}
			if (local75.method1092(local79)) {
				arg0 |= 0x400;
			}
		}
		if (local43 != null) {
			if (local43.method1090(arg4)) {
				arg0 |= 0x80;
			}
			if (local43.method1094(arg4)) {
				arg0 |= 0x100;
			}
			if (local43.method1092(arg4)) {
				arg0 |= 0x400;
			}
		}
		if (local77 != null) {
			if (local77.method1090(local81)) {
				arg0 |= 0x80;
			}
			if (local77.method1094(local81)) {
				arg0 |= 0x100;
			}
			if (local77.method1092(local81)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(279) Class39 local279 = arg1.method4863((byte) 1, arg0, true);
		local279.method4893(0, local8, local43, local25, arg3 - 1, arg4, this.aBoolean153, local21);
		if (local75 != null) {
			local279.method4893(0, local8, local77, local79, arg3 - 1, local81, this.aBoolean153, local75);
		}
		return local279;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
	public void method1829() {
		if (this.anInt1997 == -1) {
			if (this.aBooleanArray12 == null) {
				this.anInt1997 = 0;
			} else {
				this.anInt1997 = 2;
			}
		}
		if (this.anInt1992 != -1) {
			return;
		}
		if (this.aBooleanArray12 == null) {
			this.anInt1992 = 0;
		} else {
			this.anInt1992 = 2;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BIIZ)I")
	public int method1831(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(24) int local24 = this.anIntArray211[arg1];
		@Pc(26) Class6_Sub1_Sub5 local26 = null;
		@Pc(34) Class6_Sub1_Sub5 local34 = this.aClass174_1.method4013(local24 >> 16);
		@Pc(38) int local38 = local24 & 0xFFFF;
		if (local34 == null) {
			return 0;
		}
		if ((this.aBoolean156 || Static116.aBoolean157) && arg0 != -1 && this.anIntArray211.length > arg0) {
			local19 = this.anIntArray211[arg0];
			local26 = this.aClass174_1.method4013(local19 >> 16);
			local19 &= 0xFFFF;
		}
		if (this.aBoolean153) {
			local17 = 512;
		}
		if (local34.method1090(local38)) {
			local17 |= 0x80;
		}
		if (local34.method1094(local38)) {
			local17 |= 0x100;
		}
		if (local34.method1092(local38)) {
			local17 |= 0x400;
		}
		if (local26 != null) {
			if (local26.method1090(local19)) {
				local17 |= 0x80;
			}
			if (local26.method1094(local19)) {
				local17 |= 0x100;
			}
			if (local26.method1092(local19)) {
				local17 |= 0x400;
			}
		}
		if (this.anIntArray210 != null && arg2) {
			@Pc(163) int local163;
			@Pc(178) Class6_Sub1_Sub5 local178;
			if (arg1 < this.anIntArray210.length) {
				local163 = this.anIntArray210[arg1];
				if (local163 != 65535) {
					local178 = this.aClass174_1.method4013(local163 >> 16);
					local163 &= 0xFFFF;
					if (local178 != null) {
						if (local178.method1090(local163)) {
							local17 |= 0x80;
						}
						if (local178.method1094(local163)) {
							local17 |= 0x100;
						}
						if (local178.method1092(local163)) {
							local17 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean156 || Static116.aBoolean157) && arg0 != -1 && this.anIntArray210.length > arg0) {
				local163 = this.anIntArray210[arg0];
				if (local163 != 65535) {
					local178 = this.aClass174_1.method4013(local163 >> 16);
					local163 &= 0xFFFF;
					if (local178 != null) {
						if (local178.method1090(local163)) {
							local17 |= 0x80;
						}
						if (local178.method1094(local163)) {
							local17 |= 0x100;
						}
						if (local178.method1092(local163)) {
							local17 |= 0x400;
						}
					}
				}
			}
		}
		return local17 | 0x20;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!ha;I)V")
	private void method1832(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		@Pc(39) int local39;
		@Pc(58) int local58;
		if (arg0 == 1) {
			local14 = arg1.method3108();
			this.anIntArray212 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray212[local20] = arg1.method3108();
			}
			this.anIntArray211 = new int[local14];
			for (local39 = 0; local39 < local14; local39++) {
				this.anIntArray211[local39] = arg1.method3108();
			}
			for (local58 = 0; local58 < local14; local58++) {
				this.anIntArray211[local58] += arg1.method3108() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt1987 = arg1.method3108();
		} else if (arg0 == 3) {
			this.aBooleanArray12 = new boolean[256];
			local14 = arg1.method3111();
			for (local20 = 0; local20 < local14; local20++) {
				this.aBooleanArray12[arg1.method3111()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean154 = true;
		} else if (arg0 == 5) {
			this.anInt1998 = arg1.method3111();
		} else if (arg0 == 6) {
			this.anInt1986 = arg1.method3108();
		} else if (arg0 == 7) {
			this.anInt1984 = arg1.method3108();
		} else if (arg0 == 8) {
			this.anInt1985 = arg1.method3111();
		} else if (arg0 == 9) {
			this.anInt1992 = arg1.method3111();
		} else if (arg0 == 10) {
			this.anInt1997 = arg1.method3111();
		} else if (arg0 == 11) {
			this.anInt1981 = arg1.method3111();
		} else if (arg0 == 12) {
			local14 = arg1.method3111();
			this.anIntArray210 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray210[local20] = arg1.method3108();
			}
			for (local39 = 0; local39 < local14; local39++) {
				this.anIntArray210[local39] += arg1.method3108() << 16;
			}
		} else if (arg0 == 13) {
			local14 = arg1.method3108();
			this.anIntArrayArray22 = new int[local14][];
			for (local20 = 0; local20 < local14; local20++) {
				local39 = arg1.method3111();
				if (local39 > 0) {
					this.anIntArrayArray22[local20] = new int[local39];
					this.anIntArrayArray22[local20][0] = arg1.method3078();
					for (local58 = 1; local58 < local39; local58++) {
						this.anIntArrayArray22[local20][local58] = arg1.method3108();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean153 = true;
		} else if (arg0 == 15) {
			this.aBoolean156 = true;
		} else if (arg0 == 16) {
			this.aBoolean155 = true;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!ha;)V")
	public void method1833(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3111();
			if (local15 == 0) {
				return;
			}
			this.method1832(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IBLclient!cd;IIIII)Lclient!cd;")
	public Class39 method1834(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class39 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray212[arg5];
		@Pc(13) int local13 = this.anIntArray211[arg5];
		@Pc(21) Class6_Sub1_Sub5 local21 = this.aClass174_1.method4013(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg2.method4863(arg1, arg6, true);
		}
		@Pc(47) Class6_Sub1_Sub5 local47 = null;
		if ((this.aBoolean156 || Static116.aBoolean157) && arg4 != -1 && this.anIntArray211.length > arg4) {
			@Pc(69) int local69 = this.anIntArray211[arg4];
			local47 = this.aClass174_1.method4013(local69 >> 16);
			arg4 = local69 & 0xFFFF;
		}
		if (this.aBoolean153) {
			arg6 |= 0x200;
		}
		if (local21.method1090(local25)) {
			arg6 |= 0x80;
		}
		if (local21.method1094(local25)) {
			arg6 |= 0x100;
		}
		if (local21.method1092(local25)) {
			arg6 |= 0x400;
		}
		if (local47 != null) {
			if (local47.method1090(arg4)) {
				arg6 |= 0x80;
			}
			if (local47.method1094(arg4)) {
				arg6 |= 0x100;
			}
			if (local47.method1092(arg4)) {
				arg6 |= 0x400;
			}
		}
		arg6 |= 0x20;
		@Pc(156) Class39 local156 = arg2.method4863(arg1, arg6, true);
		local156.method4893(arg0, local8, local47, local25, arg3 - 1, arg4, this.aBoolean153, local21);
		return local156;
	}
}
