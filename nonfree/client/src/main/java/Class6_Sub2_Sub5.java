import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class6_Sub2_Sub5 extends Class6_Sub2 {

	@OriginalMember(owner = "client!f", name = "wb", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!f", name = "yb", descriptor = "I")
	private int anInt1083;

	@OriginalMember(owner = "client!f", name = "Bb", descriptor = "[I")
	public int[] anIntArray67;

	@OriginalMember(owner = "client!f", name = "Hb", descriptor = "[I")
	public int[] anIntArray68;

	@OriginalMember(owner = "client!f", name = "Nb", descriptor = "[I")
	private int[] anIntArray69;

	@OriginalMember(owner = "client!f", name = "ac", descriptor = "I")
	public int anInt1102;

	@OriginalMember(owner = "client!f", name = "jb", descriptor = "I")
	private int anInt1073 = -1;

	@OriginalMember(owner = "client!f", name = "fb", descriptor = "I")
	private int anInt1071 = -1;

	@OriginalMember(owner = "client!f", name = "gb", descriptor = "I")
	public int anInt1072 = 0;

	@OriginalMember(owner = "client!f", name = "lb", descriptor = "[Lclient!rc;")
	public Class55[] aClass55Array6 = new Class55[] { null, null, null, null, Static112.aClass55_1360 };

	@OriginalMember(owner = "client!f", name = "pb", descriptor = "I")
	private int anInt1078 = 128;

	@OriginalMember(owner = "client!f", name = "hb", descriptor = "Lclient!rc;")
	public Class55 aClass55_392 = Static61.aClass55_740;

	@OriginalMember(owner = "client!f", name = "ab", descriptor = "I")
	public int anInt1066 = 1;

	@OriginalMember(owner = "client!f", name = "xb", descriptor = "I")
	public int anInt1082 = -1;

	@OriginalMember(owner = "client!f", name = "Jb", descriptor = "I")
	private int anInt1090 = 0;

	@OriginalMember(owner = "client!f", name = "Qb", descriptor = "I")
	private int anInt1094 = -1;

	@OriginalMember(owner = "client!f", name = "tb", descriptor = "I")
	private int anInt1081 = -1;

	@OriginalMember(owner = "client!f", name = "Tb", descriptor = "I")
	private int anInt1097 = -1;

	@OriginalMember(owner = "client!f", name = "Gb", descriptor = "Z")
	public boolean aBoolean46 = false;

	@OriginalMember(owner = "client!f", name = "Db", descriptor = "I")
	private int anInt1086 = -1;

	@OriginalMember(owner = "client!f", name = "Lb", descriptor = "I")
	public int anInt1091 = -1;

	@OriginalMember(owner = "client!f", name = "cb", descriptor = "I")
	public int anInt1068 = 0;

	@OriginalMember(owner = "client!f", name = "Rb", descriptor = "I")
	private int anInt1095 = -1;

	@OriginalMember(owner = "client!f", name = "Xb", descriptor = "I")
	private int anInt1100 = -1;

	@OriginalMember(owner = "client!f", name = "ob", descriptor = "I")
	public int anInt1077 = 0;

	@OriginalMember(owner = "client!f", name = "Yb", descriptor = "[Lclient!rc;")
	public Class55[] aClass55Array7 = new Class55[] { null, null, Static31.aClass55_457, null, null };

	@OriginalMember(owner = "client!f", name = "Ab", descriptor = "I")
	public int anInt1084 = 0;

	@OriginalMember(owner = "client!f", name = "dc", descriptor = "I")
	public int anInt1105 = 2000;

	@OriginalMember(owner = "client!f", name = "fc", descriptor = "I")
	public int anInt1106 = 0;

	@OriginalMember(owner = "client!f", name = "kb", descriptor = "I")
	private int anInt1074 = -1;

	@OriginalMember(owner = "client!f", name = "bc", descriptor = "I")
	public int anInt1103 = 0;

	@OriginalMember(owner = "client!f", name = "cc", descriptor = "I")
	private int anInt1104 = 128;

	@OriginalMember(owner = "client!f", name = "hc", descriptor = "I")
	public int anInt1108 = 0;

	@OriginalMember(owner = "client!f", name = "Cb", descriptor = "I")
	public int anInt1085 = 0;

	@OriginalMember(owner = "client!f", name = "gc", descriptor = "I")
	private int anInt1107 = 0;

	@OriginalMember(owner = "client!f", name = "bb", descriptor = "I")
	public int anInt1067 = 0;

	@OriginalMember(owner = "client!f", name = "kc", descriptor = "I")
	private int anInt1111 = -1;

	@OriginalMember(owner = "client!f", name = "jc", descriptor = "I")
	private int anInt1110 = 128;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZB)Lclient!jb;")
	public Class6_Sub2_Sub3_Sub3 method691(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt1095;
		@Pc(11) int local11 = this.anInt1081;
		@Pc(14) int local14 = this.anInt1086;
		if (arg0) {
			local14 = this.anInt1100;
			local11 = this.anInt1074;
			local8 = this.anInt1111;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(36) Class6_Sub2_Sub3_Sub3 local36 = Static42.method974(Static38.aClass40_21, local8);
		if (local11 != -1) {
			@Pc(44) Class6_Sub2_Sub3_Sub3 local44 = Static42.method974(Static38.aClass40_21, local11);
			if (local14 == -1) {
				@Pc(87) Class6_Sub2_Sub3_Sub3[] local87 = new Class6_Sub2_Sub3_Sub3[] { local36, local44 };
				local36 = new Class6_Sub2_Sub3_Sub3(local87, 2);
			} else {
				@Pc(53) Class6_Sub2_Sub3_Sub3 local53 = Static42.method974(Static38.aClass40_21, local14);
				@Pc(68) Class6_Sub2_Sub3_Sub3[] local68 = new Class6_Sub2_Sub3_Sub3[] { local36, local44, local53 };
				local36 = new Class6_Sub2_Sub3_Sub3(local68, 3);
			}
		}
		if (!arg0 && this.anInt1090 != 0) {
			local36.method971(0, this.anInt1090, 0);
		}
		if (arg0 && this.anInt1107 != 0) {
			local36.method971(0, this.anInt1107, 0);
		}
		if (this.anIntArray69 != null) {
			for (@Pc(129) int local129 = 0; local129 < this.anIntArray69.length; local129++) {
				local36.method961(this.anIntArray69[local129], this.anIntArray66[local129]);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BIZ)Lclient!jb;")
	public Class6_Sub2_Sub3_Sub3 method692(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) int local17;
		if (this.anIntArray68 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (local17 = 0; local17 < 10; local17++) {
				if (arg0 >= this.anIntArray67[local17] && this.anIntArray67[local17] != 0) {
					local15 = this.anIntArray68[local17];
				}
			}
			if (local15 != -1) {
				return Static58.method1195(local15).method692(1, arg1);
			}
		}
		@Pc(65) Class6_Sub2_Sub3_Sub3 local65;
		if (arg1) {
			local65 = (Class6_Sub2_Sub3_Sub3) Static91.aClass36_30.method1154((long) this.anInt1102);
			if (local65 != null) {
				return local65;
			}
		}
		local65 = Static42.method974(Static38.aClass40_21, this.anInt1083);
		if (local65 == null) {
			return null;
		}
		if (this.anInt1078 != 128 || this.anInt1104 != 128 || this.anInt1110 != 128) {
			local65.method957(this.anInt1078, this.anInt1104, this.anInt1110);
		}
		if (this.anIntArray69 != null) {
			for (local17 = 0; local17 < this.anIntArray69.length; local17++) {
				local65.method961(this.anIntArray69[local17], this.anIntArray66[local17]);
			}
		}
		if (arg1) {
			local65.method965(this.anInt1085 + 64, this.anInt1077 + 768, -50, -10, -50, true);
			local65.aBoolean66 = true;
			Static91.aClass36_30.method1161((long) this.anInt1102, local65);
		}
		return local65;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Lclient!f;")
	public Class6_Sub2_Sub5 method693(@OriginalArg(0) int arg0) {
		if (this.anIntArray68 != null && arg0 > 1) {
			@Pc(17) int local17 = -1;
			for (@Pc(19) int local19 = 0; local19 < 10; local19++) {
				if (arg0 >= this.anIntArray67[local19] && this.anIntArray67[local19] != 0) {
					local17 = this.anIntArray68[local19];
				}
			}
			if (local17 != -1) {
				return Static58.method1195(local17);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)Z")
	public boolean method694(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt1097;
		@Pc(9) int local9 = this.anInt1094;
		if (arg0) {
			local9 = this.anInt1073;
			local6 = this.anInt1071;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(24) boolean local24 = true;
		if (!Static38.aClass40_21.method1223(local6, 0)) {
			local24 = false;
		}
		if (local9 != -1 && !Static38.aClass40_21.method1223(local9, 0)) {
			local24 = false;
		}
		return local24;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(ZI)Z")
	public boolean method695(@OriginalArg(0) boolean arg0) {
		@Pc(14) int local14 = this.anInt1095;
		@Pc(17) int local17 = this.anInt1081;
		@Pc(20) int local20 = this.anInt1086;
		if (arg0) {
			local14 = this.anInt1111;
			local20 = this.anInt1100;
			local17 = this.anInt1074;
		}
		if (local14 == -1) {
			return true;
		}
		@Pc(38) boolean local38 = true;
		if (!Static38.aClass40_21.method1223(local14, 0)) {
			local38 = false;
		}
		if (local17 != -1 && !Static38.aClass40_21.method1223(local17, 0)) {
			local38 = false;
		}
		if (local20 != -1 && !Static38.aClass40_21.method1223(local20, 0)) {
			local38 = false;
		}
		return local38;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!b;I)V")
	public void method698(@OriginalArg(0) Class6_Sub1 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1495();
			if (local7 == 0) {
				return;
			}
			this.method699(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!b;Z)V")
	private void method699(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1 arg1) {
		if (arg0 == 1) {
			this.anInt1083 = arg1.method1500();
		} else if (arg0 == 2) {
			this.aClass55_392 = arg1.method1461();
		} else if (arg0 == 4) {
			this.anInt1105 = arg1.method1500();
		} else if (arg0 == 5) {
			this.anInt1108 = arg1.method1500();
		} else if (arg0 == 6) {
			this.anInt1106 = arg1.method1500();
		} else if (arg0 == 7) {
			this.anInt1072 = arg1.method1500();
			if (this.anInt1072 > 32767) {
				this.anInt1072 -= 65536;
			}
		} else if (arg0 == 8) {
			this.anInt1067 = arg1.method1500();
			if (this.anInt1067 > 32767) {
				this.anInt1067 -= 65536;
			}
		} else if (arg0 == 11) {
			this.anInt1084 = 1;
		} else if (arg0 == 12) {
			this.anInt1066 = arg1.method1503();
		} else if (arg0 == 16) {
			this.aBoolean46 = true;
		} else if (arg0 == 23) {
			this.anInt1095 = arg1.method1500();
			this.anInt1090 = arg1.method1495();
		} else if (arg0 == 24) {
			this.anInt1081 = arg1.method1500();
		} else if (arg0 == 25) {
			this.anInt1111 = arg1.method1500();
			this.anInt1107 = arg1.method1495();
		} else if (arg0 == 26) {
			this.anInt1074 = arg1.method1500();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass55Array7[arg0 - 30] = arg1.method1461();
			if (this.aClass55Array7[arg0 - 30].method1642(Static7.aClass55_124)) {
				this.aClass55Array7[arg0 - 30] = null;
			}
		} else if (arg0 >= 35 && arg0 < 40) {
			this.aClass55Array6[arg0 - 35] = arg1.method1461();
		} else if (arg0 == 40) {
			@Pc(342) int local342 = arg1.method1495();
			this.anIntArray69 = new int[local342];
			this.anIntArray66 = new int[local342];
			for (@Pc(352) int local352 = 0; local352 < local342; local352++) {
				this.anIntArray69[local352] = arg1.method1500();
				this.anIntArray66[local352] = arg1.method1500();
			}
		} else if (arg0 == 78) {
			this.anInt1086 = arg1.method1500();
		} else if (arg0 == 79) {
			this.anInt1100 = arg1.method1500();
		} else if (arg0 == 90) {
			this.anInt1097 = arg1.method1500();
		} else if (arg0 == 91) {
			this.anInt1071 = arg1.method1500();
		} else if (arg0 == 92) {
			this.anInt1094 = arg1.method1500();
		} else if (arg0 == 93) {
			this.anInt1073 = arg1.method1500();
		} else if (arg0 == 95) {
			this.anInt1068 = arg1.method1500();
		} else if (arg0 == 97) {
			this.anInt1082 = arg1.method1500();
		} else if (arg0 == 98) {
			this.anInt1091 = arg1.method1500();
		} else if (arg0 >= 100 && arg0 < 110) {
			if (this.anIntArray68 == null) {
				this.anIntArray68 = new int[10];
				this.anIntArray67 = new int[10];
			}
			this.anIntArray68[arg0 - 100] = arg1.method1500();
			this.anIntArray67[arg0 - 100] = arg1.method1500();
		} else if (arg0 == 110) {
			this.anInt1078 = arg1.method1500();
		} else if (arg0 == 111) {
			this.anInt1104 = arg1.method1500();
		} else if (arg0 == 112) {
			this.anInt1110 = arg1.method1500();
		} else if (arg0 == 113) {
			this.anInt1085 = arg1.method1484();
		} else if (arg0 == 114) {
			this.anInt1077 = arg1.method1484() * 5;
		} else if (arg0 == 115) {
			this.anInt1103 = arg1.method1495();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)Lclient!jb;")
	public Class6_Sub2_Sub3_Sub3 method700(@OriginalArg(1) boolean arg0) {
		@Pc(16) int local16 = this.anInt1097;
		@Pc(19) int local19 = this.anInt1094;
		if (arg0) {
			local19 = this.anInt1073;
			local16 = this.anInt1071;
		}
		if (local16 == -1) {
			return null;
		}
		@Pc(37) Class6_Sub2_Sub3_Sub3 local37 = Static42.method974(Static38.aClass40_21, local16);
		if (local19 != -1) {
			@Pc(46) Class6_Sub2_Sub3_Sub3 local46 = Static42.method974(Static38.aClass40_21, local19);
			@Pc(57) Class6_Sub2_Sub3_Sub3[] local57 = new Class6_Sub2_Sub3_Sub3[] { local37, local46 };
			local37 = new Class6_Sub2_Sub3_Sub3(local57, 2);
		}
		if (this.anIntArray69 != null) {
			for (@Pc(68) int local68 = 0; local68 < this.anIntArray69.length; local68++) {
				local37.method961(this.anIntArray69[local68], this.anIntArray66[local68]);
			}
		}
		return local37;
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
	public void method702() {
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZLclient!f;Lclient!f;)V")
	public void method703(@OriginalArg(1) Class6_Sub2_Sub5 arg0, @OriginalArg(2) Class6_Sub2_Sub5 arg1) {
		this.anInt1083 = arg0.anInt1083;
		this.aClass55_392 = arg1.aClass55_392;
		this.aBoolean46 = arg1.aBoolean46;
		this.anInt1108 = arg0.anInt1108;
		this.anIntArray69 = arg0.anIntArray69;
		this.anInt1068 = arg0.anInt1068;
		this.anInt1106 = arg0.anInt1106;
		this.anInt1105 = arg0.anInt1105;
		this.anInt1072 = arg0.anInt1072;
		this.anInt1067 = arg0.anInt1067;
		this.anInt1066 = arg1.anInt1066;
		this.anInt1084 = 1;
		this.anIntArray66 = arg0.anIntArray66;
	}
}
