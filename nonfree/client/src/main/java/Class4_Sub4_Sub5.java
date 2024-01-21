import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class4_Sub4_Sub5 extends Class4_Sub4 {

	@OriginalMember(owner = "client!gf", name = "T", descriptor = "[I")
	public int[] anIntArray93;

	@OriginalMember(owner = "client!gf", name = "W", descriptor = "I")
	public int anInt1083;

	@OriginalMember(owner = "client!gf", name = "Y", descriptor = "[I")
	public int[] anIntArray94;

	@OriginalMember(owner = "client!gf", name = "Z", descriptor = "[I")
	private int[] anIntArray95;

	@OriginalMember(owner = "client!gf", name = "db", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!gf", name = "pb", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!gf", name = "Cb", descriptor = "[I")
	private int[] anIntArray96;

	@OriginalMember(owner = "client!gf", name = "K", descriptor = "I")
	private int anInt1074 = 128;

	@OriginalMember(owner = "client!gf", name = "nb", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!gf", name = "Q", descriptor = "I")
	public int anInt1078 = -1;

	@OriginalMember(owner = "client!gf", name = "ib", descriptor = "Z")
	private boolean aBoolean33 = false;

	@OriginalMember(owner = "client!gf", name = "ob", descriptor = "I")
	public int anInt1092 = -1;

	@OriginalMember(owner = "client!gf", name = "I", descriptor = "I")
	private int anInt1073 = 0;

	@OriginalMember(owner = "client!gf", name = "L", descriptor = "I")
	public int anInt1075 = 1;

	@OriginalMember(owner = "client!gf", name = "eb", descriptor = "I")
	public int anInt1085 = 1;

	@OriginalMember(owner = "client!gf", name = "yb", descriptor = "I")
	private int anInt1098 = 0;

	@OriginalMember(owner = "client!gf", name = "rb", descriptor = "Z")
	public boolean aBoolean37 = false;

	@OriginalMember(owner = "client!gf", name = "S", descriptor = "I")
	public int anInt1080 = 2;

	@OriginalMember(owner = "client!gf", name = "ub", descriptor = "I")
	private int anInt1094 = 0;

	@OriginalMember(owner = "client!gf", name = "tb", descriptor = "Z")
	public boolean aBoolean38 = true;

	@OriginalMember(owner = "client!gf", name = "mb", descriptor = "I")
	private int anInt1091 = 128;

	@OriginalMember(owner = "client!gf", name = "bb", descriptor = "Z")
	public boolean aBoolean32 = true;

	@OriginalMember(owner = "client!gf", name = "sb", descriptor = "I")
	public int anInt1093 = 0;

	@OriginalMember(owner = "client!gf", name = "O", descriptor = "[Lclient!qc;")
	public final Class60[] aClass60Array7 = new Class60[5];

	@OriginalMember(owner = "client!gf", name = "Bb", descriptor = "I")
	public int anInt1100 = 0;

	@OriginalMember(owner = "client!gf", name = "kb", descriptor = "I")
	private int anInt1089 = -1;

	@OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
	public int anInt1079 = -1;

	@OriginalMember(owner = "client!gf", name = "U", descriptor = "I")
	private int anInt1081 = -1;

	@OriginalMember(owner = "client!gf", name = "qb", descriptor = "Z")
	public boolean aBoolean36 = false;

	@OriginalMember(owner = "client!gf", name = "Db", descriptor = "I")
	public int anInt1101 = -1;

	@OriginalMember(owner = "client!gf", name = "fb", descriptor = "I")
	public int anInt1086 = -1;

	@OriginalMember(owner = "client!gf", name = "V", descriptor = "I")
	public int anInt1082 = 0;

	@OriginalMember(owner = "client!gf", name = "Qb", descriptor = "I")
	private int anInt1112 = 0;

	@OriginalMember(owner = "client!gf", name = "Ab", descriptor = "Lclient!qc;")
	public Class60 aClass60_451 = Static32.aClass60_354;

	@OriginalMember(owner = "client!gf", name = "Eb", descriptor = "I")
	public int anInt1102 = -1;

	@OriginalMember(owner = "client!gf", name = "Sb", descriptor = "Z")
	public boolean aBoolean39 = false;

	@OriginalMember(owner = "client!gf", name = "Ib", descriptor = "I")
	public int anInt1105 = 0;

	@OriginalMember(owner = "client!gf", name = "Hb", descriptor = "I")
	private int anInt1104 = 128;

	@OriginalMember(owner = "client!gf", name = "Lb", descriptor = "I")
	private int anInt1108 = 0;

	@OriginalMember(owner = "client!gf", name = "Rb", descriptor = "I")
	public int anInt1113 = 16;

	@OriginalMember(owner = "client!gf", name = "jb", descriptor = "Z")
	public boolean aBoolean34 = false;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!t;IIIIIBII)Lclient!rb;")
	public Class4_Sub4_Sub1_Sub6 method722(@OriginalArg(0) Class4_Sub4_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(13) long local13;
		if (this.anIntArray96 == null) {
			local13 = (this.anInt1083 << 10) + arg3;
		} else {
			local13 = (arg6 << 3) + (this.anInt1083 << 10) + arg3;
		}
		@Pc(38) Class4_Sub4_Sub1_Sub6 local38 = (Class4_Sub4_Sub1_Sub6) Static5.aClass48_3.method1390(local13);
		if (local38 == null) {
			@Pc(46) Class4_Sub4_Sub1_Sub7 local46 = this.method725(arg6, arg3);
			if (local46 == null) {
				return null;
			}
			local38 = local46.method2003(this.anInt1108 + 64, this.anInt1094 * 5 + 768, -50, -10, -50);
			Static5.aClass48_3.method1392(local38, local13);
		}
		if (arg0 == null && !this.aBoolean37) {
			return local38;
		}
		if (arg0 == null) {
			local38 = local38.method1798(true);
		} else {
			local38 = arg0.method1924(local38, arg7, arg3);
		}
		if (this.aBoolean37) {
			local38.method1794(arg2, arg1, arg5, arg4, false);
		}
		return local38;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZ)Z")
	public boolean method723(@OriginalArg(0) int arg0) {
		if (this.anIntArray96 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray96.length; local15++) {
				if (this.anIntArray96[local15] == arg0) {
					return Static131.aClass40_91.method1120(this.anIntArray95[local15] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray95 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(62) boolean local62 = true;
			for (@Pc(64) int local64 = 0; local64 < this.anIntArray95.length; local64++) {
				local62 &= Static131.aClass40_91.method1120(this.anIntArray95[local64] & 0xFFFF, 0);
			}
			return local62;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIB)Lclient!u;")
	private Class4_Sub4_Sub1_Sub7 method725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class4_Sub4_Sub1_Sub7 local7 = null;
		@Pc(37) boolean local37;
		@Pc(41) int local41;
		@Pc(43) int local43;
		@Pc(49) int local49;
		if (this.anIntArray96 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray95 == null) {
				return null;
			}
			local37 = this.aBoolean33 ^ arg1 > 3;
			local41 = this.anIntArray95.length;
			for (local43 = 0; local43 < local41; local43++) {
				local49 = this.anIntArray95[local43];
				if (local37) {
					local49 += 65536;
				}
				local7 = (Class4_Sub4_Sub1_Sub7) Static73.aClass48_43.method1390((long) local49);
				if (local7 == null) {
					local7 = Static118.method2001(Static131.aClass40_91, local49 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local37) {
						local7.method1986();
					}
					Static73.aClass48_43.method1392(local7, (long) local49);
				}
				if (local41 > 1) {
					Static119.aClass4_Sub4_Sub1_Sub7Array1[local43] = local7;
				}
			}
			if (local41 > 1) {
				local7 = new Class4_Sub4_Sub1_Sub7(Static119.aClass4_Sub4_Sub1_Sub7Array1, local41);
			}
		} else {
			@Pc(114) int local114 = -1;
			for (local41 = 0; local41 < this.anIntArray96.length; local41++) {
				if (this.anIntArray96[local41] == arg0) {
					local114 = local41;
					break;
				}
			}
			if (local114 == -1) {
				return null;
			}
			local43 = this.anIntArray95[local114];
			@Pc(164) boolean local164 = arg1 > 3 ^ this.aBoolean33;
			if (local164) {
				local43 += 65536;
			}
			local7 = (Class4_Sub4_Sub1_Sub7) Static73.aClass48_43.method1390((long) local43);
			if (local7 == null) {
				local7 = Static118.method2001(Static131.aClass40_91, local43 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local164) {
					local7.method1986();
				}
				Static73.aClass48_43.method1392(local7, (long) local43);
			}
		}
		if (this.anInt1104 == 128 && this.anInt1074 == 128 && this.anInt1091 == 128) {
			local37 = false;
		} else {
			local37 = true;
		}
		@Pc(239) boolean local239;
		if (this.anInt1112 == 0 && this.anInt1073 == 0 && this.anInt1098 == 0) {
			local239 = false;
		} else {
			local239 = true;
		}
		@Pc(264) Class4_Sub4_Sub1_Sub7 local264 = new Class4_Sub4_Sub1_Sub7(local7, arg1 == 0 && !local37 && !local239, this.aShortArray2 == null, true);
		@Pc(268) int local268 = arg1 & 0x3;
		if (local268 == 1) {
			local264.method1985();
		} else if (local268 == 2) {
			local264.method1992();
		} else if (local268 == 3) {
			local264.method1996();
		}
		if (this.aShortArray2 != null) {
			for (local49 = 0; local49 < this.aShortArray2.length; local49++) {
				local264.method1998(this.aShortArray2[local49], this.aShortArray3[local49]);
			}
		}
		if (local37) {
			local264.method1990(this.anInt1104, this.anInt1074, this.anInt1091);
		}
		if (local239) {
			local264.method2000(this.anInt1112, this.anInt1073, this.anInt1098);
		}
		return local264;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)Lclient!gf;")
	public Class4_Sub4_Sub5 method727() {
		@Pc(5) int local5 = -1;
		if (this.anInt1089 != -1) {
			local5 = Static121.method2046(this.anInt1089);
		} else if (this.anInt1081 != -1) {
			local5 = Static62.anIntArray168[this.anInt1081];
		}
		return local5 < 0 || this.anIntArray94.length <= local5 || this.anIntArray94[local5] == -1 ? null : Static24.method477(this.anIntArray94[local5]);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZIIIIII)Lclient!rb;")
	public Class4_Sub4_Sub1_Sub6 method728(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) long local19;
		if (this.anIntArray96 == null) {
			local19 = arg0 + (this.anInt1083 << 10);
		} else {
			local19 = arg0 + (this.anInt1083 << 10) + (arg3 << 3);
		}
		@Pc(35) Class4_Sub4_Sub1_Sub6 local35 = (Class4_Sub4_Sub1_Sub6) Static5.aClass48_3.method1390(local19);
		if (local35 == null) {
			@Pc(56) Class4_Sub4_Sub1_Sub7 local56 = this.method725(arg3, arg0);
			if (local56 == null) {
				return null;
			}
			local35 = local56.method2003(this.anInt1108 + 64, this.anInt1094 * 5 + 768, -50, -10, -50);
			Static5.aClass48_3.method1392(local35, local19);
		}
		if (this.aBoolean37) {
			local35 = local35.method1794(arg4, arg1, arg2, arg5, true);
		}
		return local35;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!re;B)V")
	private void method729(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub13 arg1) {
		@Pc(8) int local8;
		@Pc(28) int local28;
		if (arg0 == 1) {
			local8 = arg1.method1223();
			if (local8 > 0) {
				if (this.anIntArray95 == null || Static81.aBoolean80) {
					this.anIntArray96 = new int[local8];
					this.anIntArray95 = new int[local8];
					for (local28 = 0; local28 < local8; local28++) {
						this.anIntArray95[local28] = arg1.method1244();
						this.anIntArray96[local28] = arg1.method1223();
					}
				} else {
					arg1.anInt1643 += local8 * 3;
				}
			}
		} else if (arg0 == 2) {
			this.aClass60_451 = arg1.method1249();
		} else if (arg0 == 5) {
			local8 = arg1.method1223();
			if (local8 > 0) {
				if (this.anIntArray95 == null || Static81.aBoolean80) {
					this.anIntArray96 = null;
					this.anIntArray95 = new int[local8];
					for (local28 = 0; local28 < local8; local28++) {
						this.anIntArray95[local28] = arg1.method1244();
					}
				} else {
					arg1.anInt1643 += local8 * 2;
				}
			}
		} else if (arg0 == 14) {
			this.anInt1075 = arg1.method1223();
		} else if (arg0 == 15) {
			this.anInt1085 = arg1.method1223();
		} else if (arg0 == 17) {
			this.anInt1080 = 0;
			this.aBoolean38 = false;
		} else if (arg0 == 18) {
			this.aBoolean38 = false;
		} else if (arg0 == 19) {
			this.anInt1102 = arg1.method1223();
		} else if (arg0 == 21) {
			this.aBoolean37 = true;
		} else if (arg0 == 22) {
			this.aBoolean35 = true;
		} else if (arg0 == 23) {
			this.aBoolean39 = true;
		} else if (arg0 == 24) {
			this.anInt1078 = arg1.method1244();
			if (this.anInt1078 == 65535) {
				this.anInt1078 = -1;
			}
		} else if (arg0 == 27) {
			this.anInt1080 = 1;
		} else if (arg0 == 28) {
			this.anInt1113 = arg1.method1223();
		} else if (arg0 == 29) {
			this.anInt1108 = arg1.method1224();
		} else if (arg0 == 39) {
			this.anInt1094 = arg1.method1224() * 5;
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass60Array7[arg0 - 30] = arg1.method1249();
			if (this.aClass60Array7[arg0 - 30].method1661(Static95.aClass60_924)) {
				this.aClass60Array7[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local8 = arg1.method1223();
			this.aShortArray3 = new short[local8];
			this.aShortArray2 = new short[local8];
			for (local28 = 0; local28 < local8; local28++) {
				this.aShortArray2[local28] = (short) arg1.method1244();
				this.aShortArray3[local28] = (short) arg1.method1244();
			}
		} else if (arg0 == 60) {
			this.anInt1101 = arg1.method1244();
		} else if (arg0 == 62) {
			this.aBoolean33 = true;
		} else if (arg0 == 64) {
			this.aBoolean32 = false;
		} else if (arg0 == 65) {
			this.anInt1104 = arg1.method1244();
		} else if (arg0 == 66) {
			this.anInt1074 = arg1.method1244();
		} else if (arg0 == 67) {
			this.anInt1091 = arg1.method1244();
		} else if (arg0 == 68) {
			this.anInt1092 = arg1.method1244();
		} else if (arg0 == 69) {
			this.anInt1082 = arg1.method1223();
		} else if (arg0 == 70) {
			this.anInt1112 = arg1.method1246();
		} else if (arg0 == 71) {
			this.anInt1073 = arg1.method1246();
		} else if (arg0 == 72) {
			this.anInt1098 = arg1.method1246();
		} else if (arg0 == 73) {
			this.aBoolean36 = true;
		} else if (arg0 == 74) {
			this.aBoolean34 = true;
		} else if (arg0 == 75) {
			this.anInt1086 = arg1.method1223();
		} else if (arg0 == 77) {
			this.anInt1089 = arg1.method1244();
			if (this.anInt1089 == 65535) {
				this.anInt1089 = -1;
			}
			this.anInt1081 = arg1.method1244();
			if (this.anInt1081 == 65535) {
				this.anInt1081 = -1;
			}
			local8 = arg1.method1223();
			this.anIntArray94 = new int[local8 + 1];
			for (local28 = 0; local28 <= local8; local28++) {
				this.anIntArray94[local28] = arg1.method1244();
				if (this.anIntArray94[local28] == 65535) {
					this.anIntArray94[local28] = -1;
				}
			}
		} else if (arg0 == 78) {
			this.anInt1079 = arg1.method1244();
			this.anInt1105 = arg1.method1223();
		} else if (arg0 == 79) {
			this.anInt1093 = arg1.method1244();
			this.anInt1100 = arg1.method1244();
			this.anInt1105 = arg1.method1223();
			local8 = arg1.method1223();
			this.anIntArray93 = new int[local8];
			for (local28 = 0; local28 < local8; local28++) {
				this.anIntArray93[local28] = arg1.method1244();
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)Z")
	public boolean method731() {
		if (this.anIntArray94 == null) {
			return this.anInt1079 != -1 || this.anIntArray93 != null;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray94.length; local21++) {
			if (this.anIntArray94[local21] != -1) {
				@Pc(45) Class4_Sub4_Sub5 local45 = Static24.method477(this.anIntArray94[local21]);
				if (local45.anInt1079 != -1 || local45.anIntArray93 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIZIIII)Lclient!le;")
	public Class4_Sub4_Sub1 method732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) long local16;
		if (this.anIntArray96 == null) {
			local16 = arg5 + (this.anInt1083 << 10);
		} else {
			local16 = (this.anInt1083 << 10) + (arg0 << 3) + arg5;
		}
		@Pc(38) Class4_Sub4_Sub1 local38 = (Class4_Sub4_Sub1) Static56.aClass48_36.method1390(local16);
		if (local38 == null) {
			@Pc(51) Class4_Sub4_Sub1_Sub7 local51 = this.method725(arg0, arg5);
			if (local51 == null) {
				return null;
			}
			if (this.aBoolean35) {
				local51.aShort2 = (short) (this.anInt1094 * 5 + 768);
				local38 = local51;
				local51.aShort1 = (short) (this.anInt1108 + 64);
				local51.method1987();
			} else {
				local38 = local51.method2003(this.anInt1108 + 64, this.anInt1094 * 5 + 768, -50, -10, -50);
			}
			Static56.aClass48_36.method1392(local38, local16);
		}
		if (this.aBoolean35) {
			local38 = ((Class4_Sub4_Sub1_Sub7) local38).method1989();
		}
		if (this.aBoolean37) {
			if (local38 instanceof Class4_Sub4_Sub1_Sub6) {
				local38 = ((Class4_Sub4_Sub1_Sub6) local38).method1794(arg4, arg1, arg2, arg3, true);
			} else if (local38 instanceof Class4_Sub4_Sub1_Sub7) {
				local38 = ((Class4_Sub4_Sub1_Sub7) local38).method1999(arg4, arg1, arg2, arg3);
			}
		}
		return local38;
	}

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "(B)Z")
	public boolean method733() {
		if (this.anIntArray95 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(23) int local23 = 0; local23 < this.anIntArray95.length; local23++) {
			local12 &= Static131.aClass40_91.method1120(this.anIntArray95[local23] & 0xFFFF, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!re;)V")
	public void method734(@OriginalArg(1) Class4_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1223();
			if (local5 == 0) {
				return;
			}
			this.method729(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(Z)V")
	public void method735() {
		if (this.anInt1102 == -1) {
			this.anInt1102 = 0;
			if (this.anIntArray95 != null && (this.anIntArray96 == null || this.anIntArray96[0] == 10)) {
				this.anInt1102 = 1;
			}
			for (@Pc(26) int local26 = 0; local26 < 5; local26++) {
				if (this.aClass60Array7[local26] != null) {
					this.anInt1102 = 1;
				}
			}
		}
		if (this.anInt1086 == -1) {
			this.anInt1086 = this.anInt1080 == 0 ? 0 : 1;
		}
	}
}
