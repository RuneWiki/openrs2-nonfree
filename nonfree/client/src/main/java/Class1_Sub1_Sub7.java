import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!eg", name = "J", descriptor = "[I")
	public int[] anIntArray137;

	@OriginalMember(owner = "client!eg", name = "P", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!eg", name = "W", descriptor = "I")
	private int anInt1139;

	@OriginalMember(owner = "client!eg", name = "jb", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!eg", name = "mb", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!eg", name = "pb", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!eg", name = "Ab", descriptor = "[I")
	public int[] anIntArray138;

	@OriginalMember(owner = "client!eg", name = "Hb", descriptor = "I")
	public int anInt1165;

	@OriginalMember(owner = "client!eg", name = "L", descriptor = "I")
	public int anInt1131 = 0;

	@OriginalMember(owner = "client!eg", name = "R", descriptor = "I")
	private int anInt1136 = 128;

	@OriginalMember(owner = "client!eg", name = "cb", descriptor = "I")
	public int anInt1144 = -1;

	@OriginalMember(owner = "client!eg", name = "gb", descriptor = "I")
	private int anInt1148 = -1;

	@OriginalMember(owner = "client!eg", name = "bb", descriptor = "I")
	public int anInt1143 = -1;

	@OriginalMember(owner = "client!eg", name = "Z", descriptor = "I")
	public int anInt1142 = 1;

	@OriginalMember(owner = "client!eg", name = "M", descriptor = "I")
	private int anInt1132 = 0;

	@OriginalMember(owner = "client!eg", name = "kb", descriptor = "I")
	private int anInt1150 = 0;

	@OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
	private int anInt1134 = -1;

	@OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
	public int anInt1130 = -1;

	@OriginalMember(owner = "client!eg", name = "db", descriptor = "I")
	private int anInt1145 = -1;

	@OriginalMember(owner = "client!eg", name = "hb", descriptor = "[Lclient!ed;")
	public Class23[] aClass23Array3 = new Class23[] { null, null, null, null, Static108.aClass23_678 };

	@OriginalMember(owner = "client!eg", name = "Q", descriptor = "I")
	public int anInt1135 = 0;

	@OriginalMember(owner = "client!eg", name = "Y", descriptor = "I")
	public int anInt1141 = 0;

	@OriginalMember(owner = "client!eg", name = "ib", descriptor = "I")
	private int anInt1149 = -1;

	@OriginalMember(owner = "client!eg", name = "eb", descriptor = "I")
	private int anInt1146 = -1;

	@OriginalMember(owner = "client!eg", name = "lb", descriptor = "I")
	private int anInt1151 = -1;

	@OriginalMember(owner = "client!eg", name = "T", descriptor = "Z")
	public boolean aBoolean53 = false;

	@OriginalMember(owner = "client!eg", name = "ab", descriptor = "Lclient!ed;")
	public Class23 aClass23_431 = Static96.aClass23_958;

	@OriginalMember(owner = "client!eg", name = "Gb", descriptor = "[Lclient!ed;")
	public Class23[] aClass23Array4 = new Class23[] { null, null, Static60.aClass23_1663, null, null };

	@OriginalMember(owner = "client!eg", name = "fb", descriptor = "I")
	public int anInt1147 = -1;

	@OriginalMember(owner = "client!eg", name = "tb", descriptor = "I")
	public int anInt1155 = 0;

	@OriginalMember(owner = "client!eg", name = "vb", descriptor = "I")
	private int anInt1157 = 0;

	@OriginalMember(owner = "client!eg", name = "ub", descriptor = "I")
	private int anInt1156 = 0;

	@OriginalMember(owner = "client!eg", name = "wb", descriptor = "I")
	public int anInt1158 = 0;

	@OriginalMember(owner = "client!eg", name = "sb", descriptor = "I")
	public int anInt1154 = 2000;

	@OriginalMember(owner = "client!eg", name = "Eb", descriptor = "I")
	public int anInt1163 = 0;

	@OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
	private int anInt1137 = 128;

	@OriginalMember(owner = "client!eg", name = "Cb", descriptor = "I")
	private int anInt1161 = -1;

	@OriginalMember(owner = "client!eg", name = "Mb", descriptor = "I")
	public int anInt1169 = 0;

	@OriginalMember(owner = "client!eg", name = "ob", descriptor = "I")
	private int anInt1152 = -1;

	@OriginalMember(owner = "client!eg", name = "Pb", descriptor = "Z")
	public boolean aBoolean54 = false;

	@OriginalMember(owner = "client!eg", name = "Kb", descriptor = "I")
	private int anInt1167 = 128;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLclient!jg;)V")
	public void method697(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method861();
			if (local5 == 0) {
				return;
			}
			this.method702(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZZ)Z")
	public boolean method698(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt1145;
		@Pc(9) int local9 = this.anInt1144;
		@Pc(12) int local12 = this.anInt1149;
		if (arg0) {
			local9 = this.anInt1130;
			local6 = this.anInt1151;
			local12 = this.anInt1148;
		}
		if (local9 == -1) {
			return true;
		}
		@Pc(31) boolean local31 = true;
		if (!Static62.aClass30_25.method1284(local9, 0)) {
			local31 = false;
		}
		if (local6 != -1 && !Static62.aClass30_25.method1284(local6, 0)) {
			local31 = false;
		}
		if (local12 != -1 && !Static62.aClass30_25.method1284(local12, 0)) {
			local31 = false;
		}
		return local31;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!eg;ILclient!eg;)V")
	public void method699(@OriginalArg(0) Class1_Sub1_Sub7 arg0, @OriginalArg(2) Class1_Sub1_Sub7 arg1) {
		this.aShortArray18 = arg1.aShortArray18;
		this.anInt1163 = arg1.anInt1163;
		this.aClass23_431 = arg0.aClass23_431;
		this.aShortArray15 = arg1.aShortArray15;
		this.aBoolean54 = arg0.aBoolean54;
		this.anInt1155 = 1;
		this.anInt1131 = arg1.anInt1131;
		this.anInt1142 = arg0.anInt1142;
		this.aShortArray17 = arg1.aShortArray17;
		this.anInt1154 = arg1.anInt1154;
		this.anInt1141 = arg1.anInt1141;
		this.anInt1158 = arg1.anInt1158;
		this.aShortArray16 = arg1.aShortArray16;
		this.anInt1169 = arg1.anInt1169;
		this.anInt1139 = arg1.anInt1139;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BZ)Lclient!sf;")
	public Class1_Sub1_Sub1_Sub6 method701(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt1144;
		@Pc(11) int local11 = this.anInt1145;
		@Pc(14) int local14 = this.anInt1149;
		if (arg0) {
			local8 = this.anInt1130;
			local14 = this.anInt1148;
			local11 = this.anInt1151;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(46) Class1_Sub1_Sub1_Sub6 local46 = Static151.method2610(Static62.aClass30_25, local8);
		if (local11 != -1) {
			@Pc(55) Class1_Sub1_Sub1_Sub6 local55 = Static151.method2610(Static62.aClass30_25, local11);
			if (local14 == -1) {
				@Pc(98) Class1_Sub1_Sub1_Sub6[] local98 = new Class1_Sub1_Sub1_Sub6[] { local46, local55 };
				local46 = new Class1_Sub1_Sub1_Sub6(local98, 2);
			} else {
				@Pc(64) Class1_Sub1_Sub1_Sub6 local64 = Static151.method2610(Static62.aClass30_25, local14);
				@Pc(79) Class1_Sub1_Sub1_Sub6[] local79 = new Class1_Sub1_Sub1_Sub6[] { local46, local55, local64 };
				local46 = new Class1_Sub1_Sub1_Sub6(local79, 3);
			}
		}
		if (!arg0 && this.anInt1156 != 0) {
			local46.method2594(0, this.anInt1156, 0);
		}
		if (arg0 && this.anInt1150 != 0) {
			local46.method2594(0, this.anInt1150, 0);
		}
		@Pc(134) int local134;
		if (this.aShortArray18 != null) {
			for (local134 = 0; local134 < this.aShortArray18.length; local134++) {
				local46.method2593(this.aShortArray18[local134], this.aShortArray15[local134]);
			}
		}
		if (this.aShortArray17 != null) {
			for (local134 = 0; local134 < this.aShortArray17.length; local134++) {
				local46.method2603(this.aShortArray17[local134], this.aShortArray16[local134]);
			}
		}
		return local46;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!jg;II)V")
	private void method702(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1139 = arg0.method878();
		} else if (arg1 == 2) {
			this.aClass23_431 = arg0.method864();
		} else if (arg1 == 4) {
			this.anInt1154 = arg0.method878();
		} else if (arg1 == 5) {
			this.anInt1169 = arg0.method878();
		} else if (arg1 == 6) {
			this.anInt1163 = arg0.method878();
		} else if (arg1 == 7) {
			this.anInt1141 = arg0.method878();
			if (this.anInt1141 > 32767) {
				this.anInt1141 -= 65536;
			}
		} else if (arg1 == 8) {
			this.anInt1131 = arg0.method878();
			if (this.anInt1131 > 32767) {
				this.anInt1131 -= 65536;
			}
		} else if (arg1 == 11) {
			this.anInt1155 = 1;
		} else if (arg1 == 12) {
			this.anInt1142 = arg0.method868();
		} else if (arg1 == 16) {
			this.aBoolean54 = true;
		} else if (arg1 == 23) {
			this.anInt1144 = arg0.method878();
			this.anInt1156 = arg0.method861();
		} else if (arg1 == 24) {
			this.anInt1145 = arg0.method878();
		} else if (arg1 == 25) {
			this.anInt1130 = arg0.method878();
			this.anInt1150 = arg0.method861();
		} else if (arg1 == 26) {
			this.anInt1151 = arg0.method878();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass23Array4[arg1 - 30] = arg0.method864();
			if (this.aClass23Array4[arg1 - 30].method644(Static103.aClass23_1015)) {
				this.aClass23Array4[arg1 - 30] = null;
			}
		} else if (arg1 >= 35 && arg1 < 40) {
			this.aClass23Array3[arg1 - 35] = arg0.method864();
		} else {
			@Pc(163) int local163;
			@Pc(173) int local173;
			if (arg1 == 40) {
				local163 = arg0.method861();
				this.aShortArray15 = new short[local163];
				this.aShortArray18 = new short[local163];
				for (local173 = 0; local173 < local163; local173++) {
					this.aShortArray18[local173] = (short) arg0.method878();
					this.aShortArray15[local173] = (short) arg0.method878();
				}
			} else if (arg1 == 41) {
				local163 = arg0.method861();
				this.aShortArray16 = new short[local163];
				this.aShortArray17 = new short[local163];
				for (local173 = 0; local173 < local163; local173++) {
					this.aShortArray17[local173] = (short) arg0.method878();
					this.aShortArray16[local173] = (short) arg0.method878();
				}
			} else if (arg1 == 65) {
				this.aBoolean53 = true;
			} else if (arg1 == 78) {
				this.anInt1149 = arg0.method878();
			} else if (arg1 == 79) {
				this.anInt1148 = arg0.method878();
			} else if (arg1 == 90) {
				this.anInt1146 = arg0.method878();
			} else if (arg1 == 91) {
				this.anInt1161 = arg0.method878();
			} else if (arg1 == 92) {
				this.anInt1134 = arg0.method878();
			} else if (arg1 == 93) {
				this.anInt1152 = arg0.method878();
			} else if (arg1 == 95) {
				this.anInt1158 = arg0.method878();
			} else if (arg1 == 97) {
				this.anInt1147 = arg0.method878();
			} else if (arg1 == 98) {
				this.anInt1143 = arg0.method878();
			} else if (arg1 >= 100 && arg1 < 110) {
				if (this.anIntArray137 == null) {
					this.anIntArray137 = new int[10];
					this.anIntArray138 = new int[10];
				}
				this.anIntArray137[arg1 - 100] = arg0.method878();
				this.anIntArray138[arg1 - 100] = arg0.method878();
			} else if (arg1 == 110) {
				this.anInt1137 = arg0.method878();
			} else if (arg1 == 111) {
				this.anInt1136 = arg0.method878();
			} else if (arg1 == 112) {
				this.anInt1167 = arg0.method878();
			} else if (arg1 == 113) {
				this.anInt1157 = arg0.method900();
			} else if (arg1 == 114) {
				this.anInt1132 = arg0.method900() * 5;
			} else if (arg1 == 115) {
				this.anInt1135 = arg0.method861();
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIILclient!wf;)Lclient!w;")
	public Class1_Sub1_Sub1_Sub2 method703(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub18 arg2) {
		if (this.anIntArray137 != null && arg1 > 1) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (arg1 >= this.anIntArray138[local17] && this.anIntArray138[local17] != 0) {
					local15 = this.anIntArray137[local17];
				}
			}
			if (local15 != -1) {
				return Static2.method118(local15).method703(arg0, 1, arg2);
			}
		}
		@Pc(73) Class1_Sub1_Sub1_Sub2 local73 = (Class1_Sub1_Sub1_Sub2) Static103.aClass79_14.method2657((long) this.anInt1165);
		if (local73 == null) {
			@Pc(81) Class1_Sub1_Sub1_Sub6 local81 = Static151.method2610(Static62.aClass30_25, this.anInt1139);
			if (local81 == null) {
				return null;
			}
			@Pc(90) int local90;
			if (this.aShortArray18 != null) {
				for (local90 = 0; local90 < this.aShortArray18.length; local90++) {
					local81.method2593(this.aShortArray18[local90], this.aShortArray15[local90]);
				}
			}
			if (this.aShortArray17 != null) {
				for (local90 = 0; local90 < this.aShortArray17.length; local90++) {
					local81.method2603(this.aShortArray17[local90], this.aShortArray16[local90]);
				}
			}
			local73 = local81.method2609(this.anInt1157 + 64, 768 - -this.anInt1132, -50, -10, -50, false);
			if (this.anInt1137 != 128 || this.anInt1136 != 128 || this.anInt1167 != 128) {
				local73.method1078(this.anInt1137, this.anInt1136, this.anInt1167);
			}
			Static103.aClass79_14.method2658((long) this.anInt1165, local73);
		}
		if (arg2 != null) {
			local73 = arg2.method3100(local73, arg0);
		}
		return local73;
	}

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "(I)V")
	public void method704() {
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)Lclient!gg;")
	public Class1_Sub1_Sub1_Sub2_Sub1 method705() {
		@Pc(11) Class1_Sub1_Sub1_Sub6 local11 = Static151.method2610(Static62.aClass30_25, this.anInt1139);
		if (local11 == null) {
			return null;
		}
		if (this.aShortArray18 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.aShortArray18.length; local20++) {
				local11.method2593(this.aShortArray18[local20], this.aShortArray15[local20]);
			}
		}
		if (this.aShortArray17 != null) {
			for (@Pc(51) int local51 = 0; local51 < this.aShortArray17.length; local51++) {
				local11.method2603(this.aShortArray17[local51], this.aShortArray16[local51]);
			}
		}
		@Pc(84) Class1_Sub1_Sub1_Sub2_Sub1 local84 = local11.method2592(this.anInt1157 + 64, 768 - -this.anInt1132);
		local84.aBoolean79 = true;
		if (this.anInt1137 != 128 || this.anInt1136 != 128 || this.anInt1167 != 128) {
			local84.method1078(this.anInt1137, this.anInt1136, this.anInt1167);
		}
		return local84;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(ZZ)Lclient!sf;")
	public Class1_Sub1_Sub1_Sub6 method706(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt1146;
		@Pc(11) int local11 = this.anInt1134;
		if (arg0) {
			local8 = this.anInt1161;
			local11 = this.anInt1152;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(36) Class1_Sub1_Sub1_Sub6 local36 = Static151.method2610(Static62.aClass30_25, local8);
		if (local11 != -1) {
			@Pc(44) Class1_Sub1_Sub1_Sub6 local44 = Static151.method2610(Static62.aClass30_25, local11);
			@Pc(55) Class1_Sub1_Sub1_Sub6[] local55 = new Class1_Sub1_Sub1_Sub6[] { local36, local44 };
			local36 = new Class1_Sub1_Sub1_Sub6(local55, 2);
		}
		@Pc(66) int local66;
		if (this.aShortArray18 != null) {
			for (local66 = 0; local66 < this.aShortArray18.length; local66++) {
				local36.method2593(this.aShortArray18[local66], this.aShortArray15[local66]);
			}
		}
		if (this.aShortArray17 != null) {
			for (local66 = 0; local66 < this.aShortArray17.length; local66++) {
				local36.method2603(this.aShortArray17[local66], this.aShortArray16[local66]);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Lclient!eg;")
	public Class1_Sub1_Sub7 method707(@OriginalArg(1) int arg0) {
		if (this.anIntArray137 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (arg0 >= this.anIntArray138[local15] && this.anIntArray138[local15] != 0) {
					local13 = this.anIntArray137[local15];
				}
			}
			if (local13 != -1) {
				return Static2.method118(local13);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZ)Z")
	public boolean method708(@OriginalArg(1) boolean arg0) {
		@Pc(14) int local14 = this.anInt1146;
		@Pc(17) int local17 = this.anInt1134;
		if (arg0) {
			local14 = this.anInt1161;
			local17 = this.anInt1152;
		}
		if (local14 == -1) {
			return true;
		}
		@Pc(32) boolean local32 = true;
		if (!Static62.aClass30_25.method1284(local14, 0)) {
			local32 = false;
		}
		if (local17 != -1 && !Static62.aClass30_25.method1284(local17, 0)) {
			local32 = false;
		}
		return local32;
	}
}
