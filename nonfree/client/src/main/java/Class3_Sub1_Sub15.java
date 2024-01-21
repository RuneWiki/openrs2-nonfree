import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class3_Sub1_Sub15 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ta", name = "bb", descriptor = "[I")
	public int[] anIntArray259;

	@OriginalMember(owner = "client!ta", name = "hb", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!ta", name = "tb", descriptor = "[I")
	public int[] anIntArray261;

	@OriginalMember(owner = "client!ta", name = "Db", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!ta", name = "Vb", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!ta", name = "Zb", descriptor = "I")
	public int anInt2737;

	@OriginalMember(owner = "client!ta", name = "gc", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!ta", name = "X", descriptor = "I")
	private int anInt2708 = 0;

	@OriginalMember(owner = "client!ta", name = "fb", descriptor = "Lclient!oa;")
	public Class56 aClass56_1493 = Static103.aClass56_1418;

	@OriginalMember(owner = "client!ta", name = "lb", descriptor = "I")
	public int anInt2714 = 0;

	@OriginalMember(owner = "client!ta", name = "kb", descriptor = "Z")
	public boolean aBoolean129 = true;

	@OriginalMember(owner = "client!ta", name = "sb", descriptor = "Z")
	public boolean aBoolean131 = false;

	@OriginalMember(owner = "client!ta", name = "Y", descriptor = "Z")
	public boolean aBoolean128 = false;

	@OriginalMember(owner = "client!ta", name = "Bb", descriptor = "Z")
	public boolean aBoolean133 = false;

	@OriginalMember(owner = "client!ta", name = "qb", descriptor = "I")
	public int anInt2717 = 2;

	@OriginalMember(owner = "client!ta", name = "pb", descriptor = "I")
	public int anInt2716 = -1;

	@OriginalMember(owner = "client!ta", name = "cb", descriptor = "I")
	private int anInt2709 = 128;

	@OriginalMember(owner = "client!ta", name = "gb", descriptor = "I")
	private int anInt2712 = 128;

	@OriginalMember(owner = "client!ta", name = "vb", descriptor = "Z")
	public boolean aBoolean132 = false;

	@OriginalMember(owner = "client!ta", name = "Xb", descriptor = "I")
	public int anInt2735 = 0;

	@OriginalMember(owner = "client!ta", name = "bc", descriptor = "I")
	private int anInt2738 = 0;

	@OriginalMember(owner = "client!ta", name = "ub", descriptor = "I")
	public int anInt2718 = 16;

	@OriginalMember(owner = "client!ta", name = "Jb", descriptor = "I")
	private int anInt2725 = 0;

	@OriginalMember(owner = "client!ta", name = "ib", descriptor = "[Lclient!oa;")
	public final Class56[] aClass56Array12 = new Class56[5];

	@OriginalMember(owner = "client!ta", name = "Ub", descriptor = "I")
	public int anInt2734 = 0;

	@OriginalMember(owner = "client!ta", name = "Mb", descriptor = "I")
	public int anInt2728 = -1;

	@OriginalMember(owner = "client!ta", name = "Tb", descriptor = "Z")
	private boolean aBoolean137 = false;

	@OriginalMember(owner = "client!ta", name = "Ib", descriptor = "Z")
	public boolean aBoolean136 = true;

	@OriginalMember(owner = "client!ta", name = "hc", descriptor = "I")
	public int anInt2742 = -1;

	@OriginalMember(owner = "client!ta", name = "cc", descriptor = "I")
	public int anInt2739 = -1;

	@OriginalMember(owner = "client!ta", name = "wb", descriptor = "I")
	private int anInt2719 = -1;

	@OriginalMember(owner = "client!ta", name = "ob", descriptor = "Z")
	private boolean aBoolean130 = false;

	@OriginalMember(owner = "client!ta", name = "Sb", descriptor = "I")
	public int anInt2733 = 0;

	@OriginalMember(owner = "client!ta", name = "kc", descriptor = "I")
	public int anInt2745 = 1;

	@OriginalMember(owner = "client!ta", name = "ic", descriptor = "I")
	public int anInt2743 = 1;

	@OriginalMember(owner = "client!ta", name = "fc", descriptor = "I")
	private int anInt2741 = 128;

	@OriginalMember(owner = "client!ta", name = "jc", descriptor = "I")
	public int anInt2744 = -1;

	@OriginalMember(owner = "client!ta", name = "dc", descriptor = "I")
	private int anInt2740 = -1;

	@OriginalMember(owner = "client!ta", name = "Cb", descriptor = "I")
	public int anInt2722 = -1;

	@OriginalMember(owner = "client!ta", name = "lc", descriptor = "I")
	private int anInt2746 = 0;

	@OriginalMember(owner = "client!ta", name = "eb", descriptor = "I")
	private int anInt2711 = 0;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIBI)Lclient!t;")
	public Class3_Sub1_Sub2_Sub6 method1816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) long local14;
		if (this.anIntArray260 == null) {
			local14 = arg0 + (this.anInt2737 << 10);
		} else {
			local14 = (arg1 << 3) + ((this.anInt2737 << 10) + arg0);
		}
		@Pc(35) Class3_Sub1_Sub2_Sub6 local35 = (Class3_Sub1_Sub2_Sub6) Static17.aClass52_10.method1342(local14);
		if (local35 == null) {
			@Pc(51) Class3_Sub1_Sub2_Sub1 local51 = this.method1819(arg0, arg1);
			if (local51 == null) {
				return null;
			}
			local35 = local51.method215(this.anInt2738 + 64, this.anInt2725 * 5 + 768, -50, -10, -50);
			Static17.aClass52_10.method1344(local35, local14);
		}
		if (this.aBoolean131) {
			local35 = local35.method1801(arg2, arg5, arg4, arg3, true);
		}
		return local35;
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(B)Lclient!ta;")
	public Class3_Sub1_Sub15 method1817() {
		@Pc(1) int local1 = -1;
		if (this.anInt2719 != -1) {
			local1 = Static75.method1343(this.anInt2719);
		} else if (this.anInt2740 != -1) {
			local1 = Static115.anIntArray292[this.anInt2740];
		}
		return local1 < 0 || this.anIntArray259.length <= local1 || this.anIntArray259[local1] == -1 ? null : Static122.method1962(this.anIntArray259[local1]);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLclient!b;)V")
	public void method1818(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method270();
			if (local9 == 0) {
				return;
			}
			this.method1830(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIB)Lclient!bd;")
	private Class3_Sub1_Sub2_Sub1 method1819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class3_Sub1_Sub2_Sub1 local3 = null;
		@Pc(30) boolean local30;
		@Pc(34) int local34;
		@Pc(36) int local36;
		@Pc(42) int local42;
		if (this.anIntArray260 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.anIntArray262 == null) {
				return null;
			}
			local30 = arg0 > 3 ^ this.aBoolean130;
			local34 = this.anIntArray262.length;
			for (local36 = 0; local36 < local34; local36++) {
				local42 = this.anIntArray262[local36];
				if (local30) {
					local42 += 65536;
				}
				local3 = (Class3_Sub1_Sub2_Sub1) Static14.aClass52_6.method1342((long) local42);
				if (local3 == null) {
					local3 = Static10.method222(Static26.aClass44_14, local42 & 0xFFFF);
					if (local3 == null) {
						return null;
					}
					if (local30) {
						local3.method220();
					}
					Static14.aClass52_6.method1344(local3, (long) local42);
				}
				if (local34 > 1) {
					Static9.aClass3_Sub1_Sub2_Sub1Array1[local36] = local3;
				}
			}
			if (local34 > 1) {
				local3 = new Class3_Sub1_Sub2_Sub1(Static9.aClass3_Sub1_Sub2_Sub1Array1, local34);
			}
		} else {
			@Pc(105) int local105 = -1;
			for (local34 = 0; local34 < this.anIntArray260.length; local34++) {
				if (arg1 == this.anIntArray260[local34]) {
					local105 = local34;
					break;
				}
			}
			if (local105 == -1) {
				return null;
			}
			local36 = this.anIntArray262[local105];
			@Pc(151) boolean local151 = this.aBoolean130 ^ arg0 > 3;
			if (local151) {
				local36 += 65536;
			}
			local3 = (Class3_Sub1_Sub2_Sub1) Static14.aClass52_6.method1342((long) local36);
			if (local3 == null) {
				local3 = Static10.method222(Static26.aClass44_14, local36 & 0xFFFF);
				if (local3 == null) {
					return null;
				}
				if (local151) {
					local3.method220();
				}
				Static14.aClass52_6.method1344(local3, (long) local36);
			}
		}
		if (this.anInt2709 == 128 && this.anInt2712 == 128 && this.anInt2741 == 128) {
			local30 = false;
		} else {
			local30 = true;
		}
		@Pc(218) boolean local218;
		if (this.anInt2711 == 0 && this.anInt2746 == 0 && this.anInt2708 == 0) {
			local218 = false;
		} else {
			local218 = true;
		}
		@Pc(243) Class3_Sub1_Sub2_Sub1 local243 = new Class3_Sub1_Sub2_Sub1(local3, arg0 == 0 && !local30 && !local218, this.aShortArray11 == null, true);
		@Pc(247) int local247 = arg0 & 0x3;
		if (local247 == 1) {
			local243.method229();
		} else if (local247 == 2) {
			local243.method227();
		} else if (local247 == 3) {
			local243.method224();
		}
		if (this.aShortArray11 != null) {
			for (local42 = 0; local42 < this.aShortArray11.length; local42++) {
				local243.method223(this.aShortArray11[local42], this.aShortArray12[local42]);
			}
		}
		if (local30) {
			local243.method217(this.anInt2709, this.anInt2712, this.anInt2741);
		}
		if (local218) {
			local243.method226(this.anInt2711, this.anInt2746, this.anInt2708);
		}
		return local243;
	}

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "(B)Z")
	public boolean method1821() {
		if (this.anIntArray259 == null) {
			return this.anInt2744 != -1 || this.anIntArray261 != null;
		}
		for (@Pc(28) int local28 = 0; local28 < this.anIntArray259.length; local28++) {
			if (this.anIntArray259[local28] != -1) {
				@Pc(44) Class3_Sub1_Sub15 local44 = Static122.method1962(this.anIntArray259[local28]);
				if (local44.anInt2744 != -1 || local44.anIntArray261 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!ed;IIIIBII)Lclient!t;")
	public Class3_Sub1_Sub2_Sub6 method1823(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(25) long local25;
		if (this.anIntArray260 == null) {
			local25 = (this.anInt2737 << 10) + arg7;
		} else {
			local25 = arg7 + (this.anInt2737 << 10) + (arg5 << 3);
		}
		@Pc(41) Class3_Sub1_Sub2_Sub6 local41 = (Class3_Sub1_Sub2_Sub6) Static17.aClass52_10.method1342(local25);
		if (local41 == null) {
			@Pc(49) Class3_Sub1_Sub2_Sub1 local49 = this.method1819(arg7, arg5);
			if (local49 == null) {
				return null;
			}
			local41 = local49.method215(this.anInt2738 + 64, this.anInt2725 * 5 + 768, -50, -10, -50);
			Static17.aClass52_10.method1344(local41, local25);
		}
		if (arg1 == null && !this.aBoolean131) {
			return local41;
		}
		if (arg1 == null) {
			local41 = local41.method1796(true);
		} else {
			local41 = arg1.method590(arg6, local41, arg7);
		}
		if (this.aBoolean131) {
			local41.method1801(arg3, arg2, arg4, arg0, false);
		}
		return local41;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIII)Lclient!nd;")
	public Class3_Sub1_Sub2 method1825(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) long local12;
		if (this.anIntArray260 == null) {
			local12 = (this.anInt2737 << 10) + arg3;
		} else {
			local12 = arg3 + (arg1 << 3) + (this.anInt2737 << 10);
		}
		@Pc(41) Class3_Sub1_Sub2 local41 = (Class3_Sub1_Sub2) Static79.aClass52_40.method1342(local12);
		if (local41 == null) {
			@Pc(49) Class3_Sub1_Sub2_Sub1 local49 = this.method1819(arg3, arg1);
			if (local49 == null) {
				return null;
			}
			if (this.aBoolean137) {
				local41 = local49;
				local49.aShort2 = (short) (this.anInt2725 * 5 + 768);
				local49.aShort1 = (short) (this.anInt2738 + 64);
				local49.method228();
			} else {
				local41 = local49.method215(this.anInt2738 + 64, this.anInt2725 * 5 + 768, -50, -10, -50);
			}
			Static79.aClass52_40.method1344(local41, local12);
		}
		if (this.aBoolean137) {
			local41 = ((Class3_Sub1_Sub2_Sub1) local41).method218();
		}
		if (this.aBoolean131) {
			if (local41 instanceof Class3_Sub1_Sub2_Sub6) {
				local41 = ((Class3_Sub1_Sub2_Sub6) local41).method1801(arg2, arg5, arg4, arg0, true);
			} else if (local41 instanceof Class3_Sub1_Sub2_Sub1) {
				local41 = ((Class3_Sub1_Sub2_Sub1) local41).method225(arg2, arg5, arg4, arg0);
			}
		}
		return local41;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)Z")
	public boolean method1827(@OriginalArg(1) int arg0) {
		if (this.anIntArray260 != null) {
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray260.length; local17++) {
				if (arg0 == this.anIntArray260[local17]) {
					return Static26.aClass44_14.method1137(this.anIntArray262[local17] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray262 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(66) boolean local66 = true;
			for (@Pc(68) int local68 = 0; local68 < this.anIntArray262.length; local68++) {
				local66 &= Static26.aClass44_14.method1137(this.anIntArray262[local68] & 0xFFFF, 0);
			}
			return local66;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "(B)Z")
	public boolean method1828() {
		if (this.anIntArray262 == null) {
			return true;
		}
		@Pc(20) boolean local20 = true;
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray262.length; local22++) {
			local20 &= Static26.aClass44_14.method1137(this.anIntArray262[local22] & 0xFFFF, 0);
		}
		return local20;
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)V")
	public void method1829() {
		if (this.anInt2728 == -1) {
			this.anInt2728 = 0;
			if (this.anIntArray262 != null && (this.anIntArray260 == null || this.anIntArray260[0] == 10)) {
				this.anInt2728 = 1;
			}
			for (@Pc(32) int local32 = 0; local32 < 5; local32++) {
				if (this.aClass56Array12[local32] != null) {
					this.anInt2728 = 1;
				}
			}
		}
		if (this.anInt2722 == -1) {
			this.anInt2722 = this.anInt2717 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!b;II)V")
	private void method1830(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(23) int local23;
		@Pc(42) int local42;
		if (arg1 == 1) {
			local23 = arg0.method270();
			if (local23 > 0) {
				if (this.anIntArray262 == null || Static53.aBoolean66) {
					this.anIntArray260 = new int[local23];
					this.anIntArray262 = new int[local23];
					for (local42 = 0; local42 < local23; local42++) {
						this.anIntArray262[local42] = arg0.method276();
						this.anIntArray260[local42] = arg0.method270();
					}
				} else {
					arg0.anInt413 += local23 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass56_1493 = arg0.method301();
		} else if (arg1 == 5) {
			local23 = arg0.method270();
			if (local23 > 0) {
				if (this.anIntArray262 == null || Static53.aBoolean66) {
					this.anIntArray260 = null;
					this.anIntArray262 = new int[local23];
					for (local42 = 0; local42 < local23; local42++) {
						this.anIntArray262[local42] = arg0.method276();
					}
				} else {
					arg0.anInt413 += local23 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.anInt2745 = arg0.method270();
		} else if (arg1 == 15) {
			this.anInt2743 = arg0.method270();
		} else if (arg1 == 17) {
			this.aBoolean136 = false;
			this.anInt2717 = 0;
		} else if (arg1 == 18) {
			this.aBoolean136 = false;
		} else if (arg1 == 19) {
			this.anInt2728 = arg0.method270();
		} else if (arg1 == 21) {
			this.aBoolean131 = true;
		} else if (arg1 == 22) {
			this.aBoolean137 = true;
		} else if (arg1 == 23) {
			this.aBoolean128 = true;
		} else if (arg1 == 24) {
			this.anInt2742 = arg0.method276();
			if (this.anInt2742 == 65535) {
				this.anInt2742 = -1;
			}
		} else if (arg1 == 27) {
			this.anInt2717 = 1;
		} else if (arg1 == 28) {
			this.anInt2718 = arg0.method270();
		} else if (arg1 == 29) {
			this.anInt2738 = arg0.method265();
		} else if (arg1 == 39) {
			this.anInt2725 = arg0.method265() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass56Array12[arg1 - 30] = arg0.method301();
			if (this.aClass56Array12[arg1 - 30].method1418(Static15.aClass56_217)) {
				this.aClass56Array12[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local23 = arg0.method270();
			this.aShortArray11 = new short[local23];
			this.aShortArray12 = new short[local23];
			for (local42 = 0; local42 < local23; local42++) {
				this.aShortArray11[local42] = (short) arg0.method276();
				this.aShortArray12[local42] = (short) arg0.method276();
			}
		} else if (arg1 == 60) {
			this.anInt2716 = arg0.method276();
		} else if (arg1 == 62) {
			this.aBoolean130 = true;
		} else if (arg1 == 64) {
			this.aBoolean129 = false;
		} else if (arg1 == 65) {
			this.anInt2709 = arg0.method276();
		} else if (arg1 == 66) {
			this.anInt2712 = arg0.method276();
		} else if (arg1 == 67) {
			this.anInt2741 = arg0.method276();
		} else if (arg1 == 68) {
			this.anInt2739 = arg0.method276();
		} else if (arg1 == 69) {
			this.anInt2714 = arg0.method270();
		} else if (arg1 == 70) {
			this.anInt2711 = arg0.method315();
		} else if (arg1 == 71) {
			this.anInt2746 = arg0.method315();
		} else if (arg1 == 72) {
			this.anInt2708 = arg0.method315();
		} else if (arg1 == 73) {
			this.aBoolean132 = true;
		} else if (arg1 == 74) {
			this.aBoolean133 = true;
		} else if (arg1 == 75) {
			this.anInt2722 = arg0.method270();
		} else if (arg1 == 77) {
			this.anInt2719 = arg0.method276();
			if (this.anInt2719 == 65535) {
				this.anInt2719 = -1;
			}
			this.anInt2740 = arg0.method276();
			if (this.anInt2740 == 65535) {
				this.anInt2740 = -1;
			}
			local23 = arg0.method270();
			this.anIntArray259 = new int[local23 + 1];
			for (local42 = 0; local42 <= local23; local42++) {
				this.anIntArray259[local42] = arg0.method276();
				if (this.anIntArray259[local42] == 65535) {
					this.anIntArray259[local42] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.anInt2744 = arg0.method276();
			this.anInt2734 = arg0.method270();
		} else if (arg1 == 79) {
			this.anInt2735 = arg0.method276();
			this.anInt2733 = arg0.method276();
			this.anInt2734 = arg0.method270();
			local23 = arg0.method270();
			this.anIntArray261 = new int[local23];
			for (local42 = 0; local42 < local23; local42++) {
				this.anIntArray261[local42] = arg0.method276();
			}
		}
	}
}
