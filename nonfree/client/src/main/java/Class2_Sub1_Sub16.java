import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class2_Sub1_Sub16 extends Class2_Sub1 {

	@OriginalMember(owner = "client!va", name = "X", descriptor = "[I")
	private int[] anIntArray384;

	@OriginalMember(owner = "client!va", name = "bb", descriptor = "Lclient!lc;")
	public Class31 aClass31_936;

	@OriginalMember(owner = "client!va", name = "zb", descriptor = "I")
	public int anInt2720;

	@OriginalMember(owner = "client!va", name = "Cb", descriptor = "[I")
	private int[] anIntArray385;

	@OriginalMember(owner = "client!va", name = "Ob", descriptor = "[I")
	private int[] anIntArray386;

	@OriginalMember(owner = "client!va", name = "Rb", descriptor = "[I")
	private int[] anIntArray387;

	@OriginalMember(owner = "client!va", name = "Xb", descriptor = "[I")
	public int[] anIntArray388;

	@OriginalMember(owner = "client!va", name = "db", descriptor = "Z")
	public boolean aBoolean144 = true;

	@OriginalMember(owner = "client!va", name = "ab", descriptor = "I")
	public int anInt2701 = -1;

	@OriginalMember(owner = "client!va", name = "ub", descriptor = "Z")
	public boolean aBoolean146 = false;

	@OriginalMember(owner = "client!va", name = "W", descriptor = "I")
	public int anInt2699 = 1;

	@OriginalMember(owner = "client!va", name = "Bb", descriptor = "I")
	public int anInt2721 = 16;

	@OriginalMember(owner = "client!va", name = "eb", descriptor = "I")
	public int anInt2703 = -1;

	@OriginalMember(owner = "client!va", name = "hb", descriptor = "I")
	private int anInt2706 = 128;

	@OriginalMember(owner = "client!va", name = "kb", descriptor = "Z")
	public boolean aBoolean145 = true;

	@OriginalMember(owner = "client!va", name = "Ab", descriptor = "[Lclient!lc;")
	public final Class31[] aClass31Array16 = new Class31[5];

	@OriginalMember(owner = "client!va", name = "yb", descriptor = "I")
	private int anInt2719 = 0;

	@OriginalMember(owner = "client!va", name = "Ib", descriptor = "I")
	private int anInt2724 = 0;

	@OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
	private int anInt2700 = 128;

	@OriginalMember(owner = "client!va", name = "Pb", descriptor = "I")
	private int anInt2728 = -1;

	@OriginalMember(owner = "client!va", name = "V", descriptor = "I")
	public int anInt2698 = 1;

	@OriginalMember(owner = "client!va", name = "cb", descriptor = "I")
	public int anInt2702 = 0;

	@OriginalMember(owner = "client!va", name = "Qb", descriptor = "I")
	private int anInt2729 = 128;

	@OriginalMember(owner = "client!va", name = "Nb", descriptor = "Z")
	public boolean aBoolean149 = false;

	@OriginalMember(owner = "client!va", name = "qb", descriptor = "I")
	private int anInt2713 = -1;

	@OriginalMember(owner = "client!va", name = "Jb", descriptor = "I")
	private int anInt2725 = 0;

	@OriginalMember(owner = "client!va", name = "Vb", descriptor = "Z")
	private boolean aBoolean150 = false;

	@OriginalMember(owner = "client!va", name = "Db", descriptor = "I")
	public int anInt2722 = -1;

	@OriginalMember(owner = "client!va", name = "mb", descriptor = "I")
	private int anInt2709 = 0;

	@OriginalMember(owner = "client!va", name = "Fb", descriptor = "Z")
	public boolean aBoolean147 = true;

	@OriginalMember(owner = "client!va", name = "Mb", descriptor = "Z")
	public boolean aBoolean148 = false;

	@OriginalMember(owner = "client!va", name = "Yb", descriptor = "I")
	private int anInt2733 = 0;

	@OriginalMember(owner = "client!va", name = "Tb", descriptor = "I")
	public int anInt2730 = -1;

	@OriginalMember(owner = "client!va", name = "Sb", descriptor = "Lclient!lc;")
	public Class31 aClass31_939 = Static43.aClass31_576;

	@OriginalMember(owner = "client!va", name = "Zb", descriptor = "Z")
	public boolean aBoolean151 = false;

	@OriginalMember(owner = "client!va", name = "jb", descriptor = "I")
	public int anInt2707 = -1;

	@OriginalMember(owner = "client!va", name = "bc", descriptor = "Z")
	private boolean aBoolean152 = false;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZIIBZ)Lclient!hb;")
	private Class2_Sub1_Sub4_Sub5 method1703(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) Class2_Sub1_Sub4_Sub5 local7 = null;
		@Pc(38) boolean local38;
		@Pc(26) int local26;
		@Pc(40) int local40;
		@Pc(46) int local46;
		if (this.anIntArray385 == null) {
			if (arg2 != 10) {
				return null;
			}
			if (this.anIntArray387 == null) {
				return null;
			}
			local26 = this.anIntArray387.length;
			local38 = this.aBoolean150 ^ arg1 > 3;
			for (local40 = 0; local40 < local26; local40++) {
				local46 = this.anIntArray387[local40];
				if (local38) {
					local46 += 65536;
				}
				local7 = (Class2_Sub1_Sub4_Sub5) Static5.aClass17_9.method786((long) local46);
				if (local7 == null) {
					local7 = Static35.method896(Static18.aClass11_6, local46 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local38) {
						local7.method910();
					}
					Static5.aClass17_9.method783(local7, (long) local46);
				}
				if (local26 > 1) {
					Static90.aClass2_Sub1_Sub4_Sub5Array1[local40] = local7;
				}
			}
			if (local26 > 1) {
				local7 = new Class2_Sub1_Sub4_Sub5(Static90.aClass2_Sub1_Sub4_Sub5Array1, local26);
			}
		} else {
			@Pc(109) int local109 = -1;
			for (local26 = 0; local26 < this.anIntArray385.length; local26++) {
				if (this.anIntArray385[local26] == arg2) {
					local109 = local26;
					break;
				}
			}
			if (local109 == -1) {
				return null;
			}
			local40 = this.anIntArray387[local109];
			@Pc(153) boolean local153 = arg1 > 3 ^ this.aBoolean150;
			if (local153) {
				local40 += 65536;
			}
			local7 = (Class2_Sub1_Sub4_Sub5) Static5.aClass17_9.method786((long) local40);
			if (local7 == null) {
				local7 = Static35.method896(Static18.aClass11_6, local40 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local153) {
					local7.method910();
				}
				Static5.aClass17_9.method783(local7, (long) local40);
			}
		}
		if (this.anInt2706 == 128 && this.anInt2729 == 128 && this.anInt2700 == 128) {
			local38 = false;
		} else {
			local38 = true;
		}
		@Pc(231) boolean local231;
		if (this.anInt2709 == 0 && this.anInt2733 == 0 && this.anInt2725 == 0) {
			local231 = false;
		} else {
			local231 = true;
		}
		@Pc(256) Class2_Sub1_Sub4_Sub5 local256 = new Class2_Sub1_Sub4_Sub5(local7, arg1 == 0 && !local38 && !local231, this.anIntArray386 == null, true);
		@Pc(260) int local260 = arg1 & 0x3;
		if (local260 == 1) {
			local256.method901();
		} else if (local260 == 2) {
			local256.method908();
		} else if (local260 == 3) {
			local256.method903();
		}
		if (this.anIntArray386 != null) {
			for (local46 = 0; local46 < this.anIntArray386.length; local46++) {
				local256.method924(this.anIntArray386[local46], this.anIntArray384[local46]);
			}
		}
		if (local38) {
			local256.method895(this.anInt2706, this.anInt2729, this.anInt2700);
		}
		if (local231) {
			local256.method922(this.anInt2709, this.anInt2733, this.anInt2725);
		}
		if (arg0) {
			local256.method897();
		}
		local256.method904(this.anInt2719 + 64, this.anInt2724 * 5 + 768, -50, -10, -50, arg3);
		return local256;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIII)Lclient!hb;")
	public Class2_Sub1_Sub4_Sub5 method1704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(20) long local20;
		if (this.anIntArray385 == null) {
			local20 = arg5 + (this.anInt2720 << 10);
		} else {
			local20 = arg5 + (arg1 << 3) + (this.anInt2720 << 10);
		}
		@Pc(36) Class2_Sub1_Sub4_Sub5 local36 = (Class2_Sub1_Sub4_Sub5) Static27.aClass17_44.method786(local20);
		if (local36 == null) {
			local36 = this.method1703(false, arg5, arg1, !this.aBoolean152);
			if (local36 == null) {
				return null;
			}
			Static27.aClass17_44.method783(local36, local20);
		}
		if (this.aBoolean149 || this.aBoolean152) {
			local36 = new Class2_Sub1_Sub4_Sub5(local36, this.aBoolean149, this.aBoolean152);
		}
		if (this.aBoolean149) {
			@Pc(94) int local94 = (arg3 + arg2 + arg4 + arg0) / 4;
			for (@Pc(96) int local96 = 0; local96 < local36.anInt1353; local96++) {
				@Pc(103) int local103 = local36.anIntArray180[local96];
				@Pc(116) int local116 = (local103 + 64) * (arg3 - arg2) / 128 + arg2;
				@Pc(121) int local121 = local36.anIntArray177[local96];
				@Pc(134) int local134 = (arg4 - arg0) * (local103 + 64) / 128 + arg0;
				@Pc(147) int local147 = local116 + (local134 - local116) * (local121 + 64) / 128;
				local36.anIntArray190[local96] += local147 - local94;
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!pd;I)V")
	public void method1705(@OriginalArg(0) Class2_Sub6 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method665();
			if (local9 == 0) {
				return;
			}
			this.method1716(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Z")
	public boolean method1708(@OriginalArg(0) int arg0) {
		if (this.anIntArray385 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray385.length; local15++) {
				if (arg0 == this.anIntArray385[local15]) {
					return Static18.aClass11_6.method347(0, this.anIntArray387[local15] & 0xFFFF);
				}
			}
			return true;
		} else if (this.anIntArray387 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(60) boolean local60 = true;
			for (@Pc(62) int local62 = 0; local62 < this.anIntArray387.length; local62++) {
				local60 &= Static18.aClass11_6.method347(0, this.anIntArray387[local62] & 0xFFFF);
			}
			return local60;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZIIIIILclient!mb;II)Lclient!hb;")
	public Class2_Sub1_Sub4_Sub5 method1709(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2_Sub1_Sub10 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(18) long local18;
		if (this.anIntArray385 == null) {
			local18 = (this.anInt2720 << 10) + arg2;
		} else {
			local18 = (this.anInt2720 << 10) + (arg0 << 3) + arg2;
		}
		@Pc(42) Class2_Sub1_Sub4_Sub5 local42 = (Class2_Sub1_Sub4_Sub5) Static50.aClass17_21.method786(local18);
		if (local42 == null) {
			local42 = this.method1703(true, arg2, arg0, true);
			if (local42 == null) {
				return null;
			}
			Static50.aClass17_21.method783(local42, local18);
		}
		if (arg5 == null && !this.aBoolean149) {
			return local42;
		}
		if (arg5 == null) {
			local42 = local42.method902(true);
		} else {
			local42 = arg5.method1302(arg2, arg7, local42);
		}
		if (this.aBoolean149) {
			@Pc(97) int local97 = (arg4 + arg6 + arg3 + arg1) / 4;
			for (@Pc(99) int local99 = 0; local99 < local42.anInt1353; local99++) {
				@Pc(106) int local106 = local42.anIntArray180[local99];
				@Pc(111) int local111 = local42.anIntArray177[local99];
				@Pc(125) int local125 = arg6 + (local106 + 64) * (arg4 + -arg6) / 128;
				@Pc(138) int local138 = (local106 + 64) * (-arg1 + arg3) / 128 + arg1;
				@Pc(152) int local152 = local125 + (local111 + 64) * (-local125 + local138) / 128;
				local42.anIntArray190[local99] += local152 - local97;
			}
		}
		return local42;
	}

	@OriginalMember(owner = "client!va", name = "h", descriptor = "(I)Lclient!va;")
	public Class2_Sub1_Sub16 method1711() {
		@Pc(5) int local5 = -1;
		if (this.anInt2728 != -1) {
			local5 = Static68.method1373(this.anInt2728);
		} else if (this.anInt2713 != -1) {
			local5 = Static8.anIntArray46[this.anInt2713];
		}
		return local5 < 0 || this.anIntArray388.length <= local5 || this.anIntArray388[local5] == -1 ? null : Static92.method1045(this.anIntArray388[local5]);
	}

	@OriginalMember(owner = "client!va", name = "i", descriptor = "(I)Z")
	public boolean method1712() {
		if (this.anIntArray387 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray387.length; local14++) {
			local12 &= Static18.aClass11_6.method347(0, this.anIntArray387[local14] & 0xFFFF);
		}
		return local12;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!pd;I)V")
	private void method1716(@OriginalArg(1) Class2_Sub6 arg0, @OriginalArg(2) int arg1) {
		@Pc(32) int local32;
		@Pc(51) int local51;
		if (arg1 == 1) {
			local32 = arg0.method665();
			if (local32 > 0) {
				if (this.anIntArray387 == null || Static98.aBoolean67) {
					this.anIntArray385 = new int[local32];
					this.anIntArray387 = new int[local32];
					for (local51 = 0; local51 < local32; local51++) {
						this.anIntArray387[local51] = arg0.method627();
						this.anIntArray385[local51] = arg0.method665();
					}
				} else {
					arg0.anInt952 += local32 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass31_939 = arg0.method670();
		} else if (arg1 == 3) {
			this.aClass31_936 = arg0.method670();
		} else if (arg1 == 5) {
			local32 = arg0.method665();
			if (local32 > 0) {
				if (this.anIntArray387 == null || Static98.aBoolean67) {
					this.anIntArray387 = new int[local32];
					this.anIntArray385 = null;
					for (local51 = 0; local51 < local32; local51++) {
						this.anIntArray387[local51] = arg0.method627();
					}
				} else {
					arg0.anInt952 += local32 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.anInt2698 = arg0.method665();
		} else if (arg1 == 15) {
			this.anInt2699 = arg0.method665();
		} else if (arg1 == 17) {
			this.aBoolean144 = false;
		} else if (arg1 == 18) {
			this.aBoolean145 = false;
		} else if (arg1 == 19) {
			this.anInt2722 = arg0.method665();
		} else if (arg1 == 21) {
			this.aBoolean149 = true;
		} else if (arg1 == 22) {
			this.aBoolean152 = true;
		} else if (arg1 == 23) {
			this.aBoolean148 = true;
		} else if (arg1 == 24) {
			this.anInt2703 = arg0.method627();
			if (this.anInt2703 == 65535) {
				this.anInt2703 = -1;
			}
		} else if (arg1 == 28) {
			this.anInt2721 = arg0.method665();
		} else if (arg1 == 29) {
			this.anInt2719 = arg0.method673();
		} else if (arg1 == 39) {
			this.anInt2724 = arg0.method673() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass31Array16[arg1 - 30] = arg0.method670();
			if (this.aClass31Array16[arg1 - 30].method1210(Static19.aClass31_284)) {
				this.aClass31Array16[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local32 = arg0.method665();
			this.anIntArray386 = new int[local32];
			this.anIntArray384 = new int[local32];
			for (local51 = 0; local51 < local32; local51++) {
				this.anIntArray386[local51] = arg0.method627();
				this.anIntArray384[local51] = arg0.method627();
			}
		} else if (arg1 == 60) {
			this.anInt2730 = arg0.method627();
		} else if (arg1 == 62) {
			this.aBoolean150 = true;
		} else if (arg1 == 64) {
			this.aBoolean147 = false;
		} else if (arg1 == 65) {
			this.anInt2706 = arg0.method627();
		} else if (arg1 == 66) {
			this.anInt2729 = arg0.method627();
		} else if (arg1 == 67) {
			this.anInt2700 = arg0.method627();
		} else if (arg1 == 68) {
			this.anInt2707 = arg0.method627();
		} else if (arg1 == 69) {
			this.anInt2702 = arg0.method665();
		} else if (arg1 == 70) {
			this.anInt2709 = arg0.method657();
		} else if (arg1 == 71) {
			this.anInt2733 = arg0.method657();
		} else if (arg1 == 72) {
			this.anInt2725 = arg0.method657();
		} else if (arg1 == 73) {
			this.aBoolean146 = true;
		} else if (arg1 == 74) {
			this.aBoolean151 = true;
		} else if (arg1 == 75) {
			this.anInt2701 = arg0.method665();
		} else if (arg1 == 77) {
			this.anInt2728 = arg0.method627();
			if (this.anInt2728 == 65535) {
				this.anInt2728 = -1;
			}
			this.anInt2713 = arg0.method627();
			if (this.anInt2713 == 65535) {
				this.anInt2713 = -1;
			}
			local32 = arg0.method665();
			this.anIntArray388 = new int[local32 + 1];
			for (local51 = 0; local51 <= local32; local51++) {
				this.anIntArray388[local51] = arg0.method627();
				if (this.anIntArray388[local51] == 65535) {
					this.anIntArray388[local51] = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(B)V")
	public void method1718() {
		if (this.anInt2722 == -1) {
			this.anInt2722 = 0;
			if (this.anIntArray387 != null && (this.anIntArray385 == null || this.anIntArray385[0] == 10)) {
				this.anInt2722 = 1;
			}
			for (@Pc(28) int local28 = 0; local28 < 5; local28++) {
				if (this.aClass31Array16[local28] != null) {
					this.anInt2722 = 1;
				}
			}
		}
		if (this.anInt2701 == -1) {
			this.anInt2701 = this.aBoolean144 ? 1 : 0;
		}
	}
}
