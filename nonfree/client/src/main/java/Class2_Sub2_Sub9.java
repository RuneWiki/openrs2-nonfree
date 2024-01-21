import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class2_Sub2_Sub9 extends Class2_Sub2 {

	@OriginalMember(owner = "client!hf", name = "nb", descriptor = "I")
	public int anInt1091;

	@OriginalMember(owner = "client!hf", name = "tb", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!hf", name = "Ab", descriptor = "[I")
	private int[] anIntArray131;

	@OriginalMember(owner = "client!hf", name = "Gb", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!hf", name = "Sb", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!hf", name = "Yb", descriptor = "[I")
	private int[] anIntArray132;

	@OriginalMember(owner = "client!hf", name = "cb", descriptor = "I")
	public int anInt1082 = -1;

	@OriginalMember(owner = "client!hf", name = "kb", descriptor = "I")
	private int anInt1088 = 0;

	@OriginalMember(owner = "client!hf", name = "gb", descriptor = "I")
	private int anInt1085 = 0;

	@OriginalMember(owner = "client!hf", name = "sb", descriptor = "Z")
	public boolean aBoolean44 = false;

	@OriginalMember(owner = "client!hf", name = "Y", descriptor = "I")
	public int anInt1078 = -1;

	@OriginalMember(owner = "client!hf", name = "Db", descriptor = "I")
	public int anInt1100 = -1;

	@OriginalMember(owner = "client!hf", name = "zb", descriptor = "[Lclient!u;")
	public final Class74[] aClass74Array8 = new Class74[5];

	@OriginalMember(owner = "client!hf", name = "fb", descriptor = "I")
	public int anInt1084 = -1;

	@OriginalMember(owner = "client!hf", name = "Z", descriptor = "I")
	private int anInt1079 = 128;

	@OriginalMember(owner = "client!hf", name = "Eb", descriptor = "I")
	public int anInt1101 = -1;

	@OriginalMember(owner = "client!hf", name = "Kb", descriptor = "I")
	public int anInt1103 = 1;

	@OriginalMember(owner = "client!hf", name = "qb", descriptor = "I")
	public int anInt1093 = -1;

	@OriginalMember(owner = "client!hf", name = "Nb", descriptor = "Lclient!u;")
	public Class74 aClass74_806 = Static116.aClass74_1560;

	@OriginalMember(owner = "client!hf", name = "ub", descriptor = "I")
	public int anInt1095 = -1;

	@OriginalMember(owner = "client!hf", name = "Hb", descriptor = "I")
	private int anInt1102 = 128;

	@OriginalMember(owner = "client!hf", name = "wb", descriptor = "I")
	private int anInt1097 = -1;

	@OriginalMember(owner = "client!hf", name = "ab", descriptor = "I")
	public int anInt1080 = -1;

	@OriginalMember(owner = "client!hf", name = "Ib", descriptor = "Z")
	public boolean aBoolean45 = true;

	@OriginalMember(owner = "client!hf", name = "Pb", descriptor = "I")
	private int anInt1105 = -1;

	@OriginalMember(owner = "client!hf", name = "Rb", descriptor = "Z")
	public boolean aBoolean46 = true;

	@OriginalMember(owner = "client!hf", name = "Vb", descriptor = "Z")
	public boolean aBoolean47 = true;

	@OriginalMember(owner = "client!hf", name = "jb", descriptor = "I")
	public int anInt1087 = 32;

	@OriginalMember(owner = "client!hf", name = "Zb", descriptor = "I")
	public int anInt1110 = -1;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!ma;BIILclient!ma;)Lclient!na;")
	public Class2_Sub2_Sub2_Sub5 method764(@OriginalArg(0) Class2_Sub2_Sub11 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub2_Sub11 arg3) {
		if (this.anIntArray130 != null) {
			@Pc(19) Class2_Sub2_Sub9 local19 = this.method767();
			return local19 == null ? null : local19.method764(arg0, arg1, arg2, arg3);
		}
		@Pc(39) Class2_Sub2_Sub2_Sub5 local39 = (Class2_Sub2_Sub2_Sub5) Static29.aClass16_28.method490((long) this.anInt1091);
		if (local39 == null) {
			@Pc(43) boolean local43 = false;
			for (@Pc(45) int local45 = 0; local45 < this.anIntArray132.length; local45++) {
				if (!Static4.aClass26_1.method1375(0, this.anIntArray132[local45])) {
					local43 = true;
				}
			}
			if (local43) {
				return null;
			}
			@Pc(73) Class2_Sub2_Sub2_Sub7[] local73 = new Class2_Sub2_Sub2_Sub7[this.anIntArray132.length];
			for (@Pc(75) int local75 = 0; local75 < this.anIntArray132.length; local75++) {
				local73[local75] = Static94.method1414(Static4.aClass26_1, this.anIntArray132[local75]);
			}
			@Pc(105) Class2_Sub2_Sub2_Sub7 local105;
			if (local73.length == 1) {
				local105 = local73[0];
			} else {
				local105 = new Class2_Sub2_Sub2_Sub7(local73, local73.length);
			}
			if (this.aShortArray6 != null) {
				for (@Pc(119) int local119 = 0; local119 < this.aShortArray6.length; local119++) {
					local105.method1415(this.aShortArray6[local119], this.aShortArray7[local119]);
				}
			}
			local39 = local105.method1412(this.anInt1085 + 64, this.anInt1088 + 850, -30, -50, -30);
			Static29.aClass16_28.method492(local39, (long) this.anInt1091);
		}
		@Pc(170) Class2_Sub2_Sub2_Sub5 local170;
		if (arg3 != null && arg0 != null) {
			local170 = arg3.method1050(arg1, arg2, local39, arg0);
		} else if (arg3 != null) {
			local170 = arg3.method1044(local39, arg1);
		} else if (arg0 == null) {
			local170 = local39.method1118(true);
		} else {
			local170 = arg0.method1044(local39, arg2);
		}
		if (this.anInt1102 != 128 || this.anInt1079 != 128) {
			local170.method1129(this.anInt1102, this.anInt1079, this.anInt1102);
		}
		return local170;
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)Lclient!pf;")
	public Class2_Sub2_Sub2_Sub7 method766() {
		if (this.anIntArray130 != null) {
			@Pc(12) Class2_Sub2_Sub9 local12 = this.method767();
			return local12 == null ? null : local12.method766();
		} else if (this.anIntArray131 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(37) int local37 = 0; local37 < this.anIntArray131.length; local37++) {
				if (!Static4.aClass26_1.method1375(0, this.anIntArray131[local37])) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(69) Class2_Sub2_Sub2_Sub7[] local69 = new Class2_Sub2_Sub2_Sub7[this.anIntArray131.length];
			for (@Pc(71) int local71 = 0; local71 < this.anIntArray131.length; local71++) {
				local69[local71] = Static94.method1414(Static4.aClass26_1, this.anIntArray131[local71]);
			}
			@Pc(102) Class2_Sub2_Sub2_Sub7 local102;
			if (local69.length == 1) {
				local102 = local69[0];
			} else {
				local102 = new Class2_Sub2_Sub2_Sub7(local69, local69.length);
			}
			if (this.aShortArray6 != null) {
				for (@Pc(113) int local113 = 0; local113 < this.aShortArray6.length; local113++) {
					local102.method1415(this.aShortArray6[local113], this.aShortArray7[local113]);
				}
			}
			return local102;
		}
	}

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)Lclient!hf;")
	public Class2_Sub2_Sub9 method767() {
		@Pc(5) int local5 = -1;
		if (this.anInt1105 != -1) {
			local5 = Static116.method1730(this.anInt1105);
		} else if (this.anInt1097 != -1) {
			local5 = Static88.anIntArray260[this.anInt1097];
		}
		return local5 < 0 || local5 >= this.anIntArray130.length || this.anIntArray130[local5] == -1 ? null : Static8.method168(this.anIntArray130[local5]);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!ic;)V")
	public void method769(@OriginalArg(1) Class2_Sub10 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1514();
			if (local9 == 0) {
				return;
			}
			this.method772(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "(B)V")
	public void method771() {
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!ic;I)V")
	private void method772(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		@Pc(88) int local88;
		@Pc(98) int local98;
		if (arg0 == 1) {
			local88 = arg1.method1514();
			this.anIntArray132 = new int[local88];
			for (local98 = 0; local98 < local88; local98++) {
				this.anIntArray132[local98] = arg1.method1517();
			}
		} else if (arg0 == 2) {
			this.aClass74_806 = arg1.method1530();
		} else if (arg0 == 12) {
			this.anInt1103 = arg1.method1514();
		} else if (arg0 == 13) {
			this.anInt1110 = arg1.method1517();
		} else if (arg0 == 14) {
			this.anInt1100 = arg1.method1517();
		} else if (arg0 == 15) {
			this.anInt1080 = arg1.method1517();
		} else if (arg0 == 16) {
			this.anInt1095 = arg1.method1517();
		} else if (arg0 == 17) {
			this.anInt1100 = arg1.method1517();
			this.anInt1101 = arg1.method1517();
			this.anInt1078 = arg1.method1517();
			this.anInt1082 = arg1.method1517();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass74Array8[arg0 - 30] = arg1.method1530();
			if (this.aClass74Array8[arg0 - 30].method1701(Static79.aClass74_1213)) {
				this.aClass74Array8[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local88 = arg1.method1514();
			this.aShortArray6 = new short[local88];
			this.aShortArray7 = new short[local88];
			for (local98 = 0; local98 < local88; local98++) {
				this.aShortArray6[local98] = (short) arg1.method1517();
				this.aShortArray7[local98] = (short) arg1.method1517();
			}
		} else if (arg0 == 60) {
			local88 = arg1.method1514();
			this.anIntArray131 = new int[local88];
			for (local98 = 0; local98 < local88; local98++) {
				this.anIntArray131[local98] = arg1.method1517();
			}
		} else if (arg0 == 93) {
			this.aBoolean46 = false;
		} else if (arg0 == 95) {
			this.anInt1093 = arg1.method1517();
		} else if (arg0 == 97) {
			this.anInt1102 = arg1.method1517();
		} else if (arg0 == 98) {
			this.anInt1079 = arg1.method1517();
		} else if (arg0 == 99) {
			this.aBoolean44 = true;
		} else if (arg0 == 100) {
			this.anInt1085 = arg1.method1509();
		} else if (arg0 == 101) {
			this.anInt1088 = arg1.method1509() * 5;
		} else if (arg0 == 102) {
			this.anInt1084 = arg1.method1517();
		} else if (arg0 == 103) {
			this.anInt1087 = arg1.method1517();
		} else if (arg0 == 106) {
			this.anInt1105 = arg1.method1517();
			if (this.anInt1105 == 65535) {
				this.anInt1105 = -1;
			}
			this.anInt1097 = arg1.method1517();
			if (this.anInt1097 == 65535) {
				this.anInt1097 = -1;
			}
			local88 = arg1.method1514();
			this.anIntArray130 = new int[local88 + 1];
			for (local98 = 0; local98 <= local88; local98++) {
				this.anIntArray130[local98] = arg1.method1517();
				if (this.anIntArray130[local98] == 65535) {
					this.anIntArray130[local98] = -1;
				}
			}
		} else if (arg0 == 107) {
			this.aBoolean47 = false;
		} else if (arg0 == 109) {
			this.aBoolean45 = false;
		}
	}

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)Z")
	public boolean method774() {
		if (this.anIntArray130 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt1105 != -1) {
			local10 = Static116.method1730(this.anInt1105);
		} else if (this.anInt1097 != -1) {
			local10 = Static88.anIntArray260[this.anInt1097];
		}
		return local10 >= 0 && local10 < this.anIntArray130.length && this.anIntArray130[local10] != -1;
	}
}
