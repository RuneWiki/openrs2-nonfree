import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class3_Sub1_Sub5 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ld", name = "fb", descriptor = "I")
	public int anInt1512;

	@OriginalMember(owner = "client!ld", name = "ib", descriptor = "[I")
	public int[] anIntArray213;

	@OriginalMember(owner = "client!ld", name = "mb", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!ld", name = "nb", descriptor = "[I")
	public int[] anIntArray215;

	@OriginalMember(owner = "client!ld", name = "ub", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!ld", name = "Ib", descriptor = "[I")
	private int[] anIntArray217;

	@OriginalMember(owner = "client!ld", name = "kc", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!ld", name = "jb", descriptor = "I")
	private int anInt1513 = 0;

	@OriginalMember(owner = "client!ld", name = "pb", descriptor = "I")
	private int anInt1516 = -1;

	@OriginalMember(owner = "client!ld", name = "cb", descriptor = "Lclient!ad;")
	public Class4 aClass4_777 = Static58.aClass4_738;

	@OriginalMember(owner = "client!ld", name = "wb", descriptor = "I")
	private int anInt1521 = 128;

	@OriginalMember(owner = "client!ld", name = "vb", descriptor = "I")
	private int anInt1520 = 0;

	@OriginalMember(owner = "client!ld", name = "Cb", descriptor = "I")
	private int anInt1526 = 128;

	@OriginalMember(owner = "client!ld", name = "gb", descriptor = "Z")
	public boolean aBoolean110 = false;

	@OriginalMember(owner = "client!ld", name = "Eb", descriptor = "I")
	public int anInt1528 = 0;

	@OriginalMember(owner = "client!ld", name = "rb", descriptor = "Z")
	private boolean aBoolean112 = false;

	@OriginalMember(owner = "client!ld", name = "Pb", descriptor = "I")
	public int anInt1535 = 0;

	@OriginalMember(owner = "client!ld", name = "Rb", descriptor = "Z")
	public boolean aBoolean116 = true;

	@OriginalMember(owner = "client!ld", name = "tb", descriptor = "I")
	public int anInt1519 = -1;

	@OriginalMember(owner = "client!ld", name = "Hb", descriptor = "I")
	private int anInt1531 = 0;

	@OriginalMember(owner = "client!ld", name = "Kb", descriptor = "I")
	public int anInt1533 = -1;

	@OriginalMember(owner = "client!ld", name = "Vb", descriptor = "I")
	public int anInt1539 = 16;

	@OriginalMember(owner = "client!ld", name = "hb", descriptor = "Z")
	public boolean aBoolean111 = false;

	@OriginalMember(owner = "client!ld", name = "Jb", descriptor = "I")
	public int anInt1532 = -1;

	@OriginalMember(owner = "client!ld", name = "Fb", descriptor = "I")
	private int anInt1529 = 128;

	@OriginalMember(owner = "client!ld", name = "xb", descriptor = "I")
	public int anInt1522 = 0;

	@OriginalMember(owner = "client!ld", name = "ob", descriptor = "I")
	private int anInt1515 = 0;

	@OriginalMember(owner = "client!ld", name = "Zb", descriptor = "I")
	public int anInt1543 = 1;

	@OriginalMember(owner = "client!ld", name = "Yb", descriptor = "I")
	public int anInt1542 = 0;

	@OriginalMember(owner = "client!ld", name = "cc", descriptor = "I")
	private int anInt1545 = -1;

	@OriginalMember(owner = "client!ld", name = "dc", descriptor = "Z")
	public boolean aBoolean117 = false;

	@OriginalMember(owner = "client!ld", name = "Mb", descriptor = "Z")
	public boolean aBoolean114 = false;

	@OriginalMember(owner = "client!ld", name = "Ab", descriptor = "Z")
	public boolean aBoolean113 = true;

	@OriginalMember(owner = "client!ld", name = "zb", descriptor = "I")
	public int anInt1524 = -1;

	@OriginalMember(owner = "client!ld", name = "Nb", descriptor = "Z")
	public boolean aBoolean115 = true;

	@OriginalMember(owner = "client!ld", name = "lc", descriptor = "I")
	public int anInt1548 = 1;

	@OriginalMember(owner = "client!ld", name = "Xb", descriptor = "I")
	public int anInt1541 = -1;

	@OriginalMember(owner = "client!ld", name = "Ob", descriptor = "[Lclient!ad;")
	public final Class4[] aClass4Array12 = new Class4[5];

	@OriginalMember(owner = "client!ld", name = "ac", descriptor = "I")
	public int anInt1544 = -1;

	@OriginalMember(owner = "client!ld", name = "ic", descriptor = "I")
	private int anInt1547 = 0;

	@OriginalMember(owner = "client!ld", name = "gc", descriptor = "Z")
	private boolean aBoolean118 = false;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)V")
	public void method1026() {
		if (this.anInt1524 == -1) {
			this.anInt1524 = 0;
			if (this.anIntArray216 != null && (this.anIntArray214 == null || this.anIntArray214[0] == 10)) {
				this.anInt1524 = 1;
			}
			for (@Pc(25) int local25 = 0; local25 < 5; local25++) {
				if (this.aClass4Array12[local25] != null) {
					this.anInt1524 = 1;
				}
			}
		}
		if (this.anInt1532 == -1) {
			this.anInt1532 = this.aBoolean113 ? 1 : 0;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILclient!m;IIIIBI)Lclient!hc;")
	public Class3_Sub1_Sub1_Sub4 method1027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(22) long local22;
		if (this.anIntArray214 == null) {
			local22 = arg0 + (this.anInt1512 << 10);
		} else {
			local22 = (arg6 << 3) + (this.anInt1512 << 10) + arg0;
		}
		@Pc(38) Class3_Sub1_Sub1_Sub4 local38 = (Class3_Sub1_Sub1_Sub4) Static27.aClass8_13.method195(local22);
		if (local38 == null) {
			local38 = this.method1031(true, arg0, arg6, true);
			if (local38 == null) {
				return null;
			}
			Static27.aClass8_13.method199(local22, local38);
		}
		if (arg2 == null && !this.aBoolean114) {
			return local38;
		}
		if (arg2 == null) {
			local38 = local38.method788(true);
		} else {
			local38 = arg2.method1072(arg5, arg0, local38);
		}
		if (this.aBoolean114) {
			@Pc(97) int local97 = (arg7 + arg1 + arg4 + arg3) / 4;
			for (@Pc(99) int local99 = 0; local99 < local38.anInt1115; local99++) {
				@Pc(106) int local106 = local38.anIntArray130[local99];
				@Pc(111) int local111 = local38.anIntArray129[local99];
				@Pc(125) int local125 = arg4 + (arg1 - arg4) * (local111 + 64) / 128;
				@Pc(138) int local138 = arg7 + (local111 + 64) * (arg3 - arg7) / 128;
				@Pc(151) int local151 = local125 + (local106 + 64) * (local138 - local125) / 128;
				local38.anIntArray127[local99] += local151 - local97;
			}
		}
		return local38;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZIIIII)Lclient!hc;")
	public Class3_Sub1_Sub1_Sub4 method1028(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(20) long local20;
		if (this.anIntArray214 == null) {
			local20 = arg5 + (this.anInt1512 << 10);
		} else {
			local20 = arg5 + (arg3 << 3) + (this.anInt1512 << 10);
		}
		@Pc(36) Class3_Sub1_Sub1_Sub4 local36 = (Class3_Sub1_Sub1_Sub4) Static35.aClass8_9.method195(local20);
		if (local36 == null) {
			local36 = this.method1031(!this.aBoolean118, arg5, arg3, false);
			if (local36 == null) {
				return null;
			}
			Static35.aClass8_9.method199(local20, local36);
		}
		if (this.aBoolean114 || this.aBoolean118) {
			local36 = new Class3_Sub1_Sub1_Sub4(local36, this.aBoolean114, this.aBoolean118);
		}
		if (this.aBoolean114) {
			@Pc(89) int local89 = (arg4 + arg1 + arg0 + arg2) / 4;
			for (@Pc(91) int local91 = 0; local91 < local36.anInt1115; local91++) {
				@Pc(98) int local98 = local36.anIntArray129[local91];
				@Pc(103) int local103 = local36.anIntArray130[local91];
				@Pc(115) int local115 = arg2 + (local98 + 64) * (arg4 - arg2) / 128;
				@Pc(127) int local127 = arg1 + (local98 + 64) * (arg0 - arg1) / 128;
				@Pc(140) int local140 = local127 + (local115 - local127) * (local103 + 64) / 128;
				local36.anIntArray127[local91] += local140 - local89;
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)Z")
	public boolean method1029() {
		if (this.anIntArray216 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray216.length; local19++) {
			local12 &= Static87.aClass64_43.method1633(this.anIntArray216[local19] & 0xFFFF, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)Lclient!ld;")
	public Class3_Sub1_Sub5 method1030() {
		@Pc(13) int local13 = -1;
		if (this.anInt1545 != -1) {
			local13 = Static1.method3(this.anInt1545);
		} else if (this.anInt1516 != -1) {
			local13 = Static106.anIntArray329[this.anInt1516];
		}
		return local13 < 0 || local13 >= this.anIntArray215.length || this.anIntArray215[local13] == -1 ? null : Static38.method1911(this.anIntArray215[local13]);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZIIZI)Lclient!hc;")
	private Class3_Sub1_Sub1_Sub4 method1031(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class3_Sub1_Sub1_Sub4 local7 = null;
		@Pc(30) boolean local30;
		@Pc(34) int local34;
		@Pc(36) int local36;
		if (this.anIntArray214 == null) {
			if (arg2 != 10) {
				return null;
			}
			if (this.anIntArray216 == null) {
				return null;
			}
			local30 = this.aBoolean112 ^ arg1 > 3;
			local34 = this.anIntArray216.length;
			for (local36 = 0; local36 < local34; local36++) {
				@Pc(42) int local42 = this.anIntArray216[local36];
				if (local30) {
					local42 += 65536;
				}
				local7 = (Class3_Sub1_Sub1_Sub4) Static101.aClass8_30.method195((long) local42);
				if (local7 == null) {
					local7 = Static41.method789(Static87.aClass64_43, local42 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local30) {
						local7.method784();
					}
					Static101.aClass8_30.method199((long) local42, local7);
				}
				if (local34 > 1) {
					Static36.aClass3_Sub1_Sub1_Sub4Array1[local36] = local7;
				}
			}
			if (local34 > 1) {
				local7 = new Class3_Sub1_Sub1_Sub4(Static36.aClass3_Sub1_Sub1_Sub4Array1, local34);
			}
		} else {
			@Pc(101) int local101 = -1;
			for (local34 = 0; local34 < this.anIntArray214.length; local34++) {
				if (arg2 == this.anIntArray214[local34]) {
					local101 = local34;
					break;
				}
			}
			if (local101 == -1) {
				return null;
			}
			@Pc(145) boolean local145 = arg1 > 3 ^ this.aBoolean112;
			local36 = this.anIntArray216[local101];
			if (local145) {
				local36 += 65536;
			}
			local7 = (Class3_Sub1_Sub1_Sub4) Static101.aClass8_30.method195((long) local36);
			if (local7 == null) {
				local7 = Static41.method789(Static87.aClass64_43, local36 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local145) {
					local7.method784();
				}
				Static101.aClass8_30.method199((long) local36, local7);
			}
		}
		if (this.anInt1529 == 128 && this.anInt1526 == 128 && this.anInt1521 == 128) {
			local30 = false;
		} else {
			local30 = true;
		}
		@Pc(228) boolean local228;
		if (this.anInt1547 == 0 && this.anInt1531 == 0 && this.anInt1513 == 0) {
			local228 = false;
		} else {
			local228 = true;
		}
		@Pc(253) Class3_Sub1_Sub1_Sub4 local253 = new Class3_Sub1_Sub1_Sub4(local7, arg1 == 0 && !local30 && !local228, this.anIntArray217 == null, true);
		@Pc(257) int local257 = arg1 & 0x3;
		if (local257 == 1) {
			local253.method770();
		} else if (local257 == 2) {
			local253.method772();
		} else if (local257 == 3) {
			local253.method767();
		}
		if (this.anIntArray217 != null) {
			for (@Pc(295) int local295 = 0; local295 < this.anIntArray217.length; local295++) {
				local253.method771(this.anIntArray217[local295], this.anIntArray218[local295]);
			}
		}
		if (local30) {
			local253.method763(this.anInt1529, this.anInt1526, this.anInt1521);
		}
		if (local228) {
			local253.method786(this.anInt1547, this.anInt1531, this.anInt1513);
		}
		if (arg3) {
			local253.method768();
		}
		local253.method781(this.anInt1520 + 64, 768 - -(this.anInt1515 * 5), -50, -10, -50, arg0);
		return local253;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!gb;ZI)V")
	private void method1035(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8;
		@Pc(38) int local38;
		if (arg1 == 1) {
			local8 = arg0.method446();
			if (local8 > 0) {
				if (this.anIntArray216 == null || Static87.aBoolean105) {
					this.anIntArray216 = new int[local8];
					this.anIntArray214 = new int[local8];
					for (local38 = 0; local38 < local8; local38++) {
						this.anIntArray216[local38] = arg0.method459();
						this.anIntArray214[local38] = arg0.method446();
					}
				} else {
					arg0.anInt627 += local8 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass4_777 = arg0.method417();
		} else if (arg1 == 5) {
			local8 = arg0.method446();
			if (local8 > 0) {
				if (this.anIntArray216 == null || Static87.aBoolean105) {
					this.anIntArray214 = null;
					this.anIntArray216 = new int[local8];
					for (local38 = 0; local38 < local8; local38++) {
						this.anIntArray216[local38] = arg0.method459();
					}
				} else {
					arg0.anInt627 += local8 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.anInt1548 = arg0.method446();
		} else if (arg1 == 15) {
			this.anInt1543 = arg0.method446();
		} else if (arg1 == 17) {
			this.aBoolean113 = false;
		} else if (arg1 == 18) {
			this.aBoolean116 = false;
		} else if (arg1 == 19) {
			this.anInt1524 = arg0.method446();
		} else if (arg1 == 21) {
			this.aBoolean114 = true;
		} else if (arg1 == 22) {
			this.aBoolean118 = true;
		} else if (arg1 == 23) {
			this.aBoolean111 = true;
		} else if (arg1 == 24) {
			this.anInt1541 = arg0.method459();
			if (this.anInt1541 == 65535) {
				this.anInt1541 = -1;
			}
		} else if (arg1 == 28) {
			this.anInt1539 = arg0.method446();
		} else if (arg1 == 29) {
			this.anInt1520 = arg0.method434();
		} else if (arg1 == 39) {
			this.anInt1515 = arg0.method434() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass4Array12[arg1 - 30] = arg0.method417();
			if (this.aClass4Array12[arg1 - 30].method160(Static61.aClass4_783)) {
				this.aClass4Array12[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local8 = arg0.method446();
			this.anIntArray217 = new int[local8];
			this.anIntArray218 = new int[local8];
			for (local38 = 0; local38 < local8; local38++) {
				this.anIntArray217[local38] = arg0.method459();
				this.anIntArray218[local38] = arg0.method459();
			}
		} else if (arg1 == 60) {
			this.anInt1533 = arg0.method459();
		} else if (arg1 == 62) {
			this.aBoolean112 = true;
		} else if (arg1 == 64) {
			this.aBoolean115 = false;
		} else if (arg1 == 65) {
			this.anInt1529 = arg0.method459();
		} else if (arg1 == 66) {
			this.anInt1526 = arg0.method459();
		} else if (arg1 == 67) {
			this.anInt1521 = arg0.method459();
		} else if (arg1 == 68) {
			this.anInt1519 = arg0.method459();
		} else if (arg1 == 69) {
			this.anInt1542 = arg0.method446();
		} else if (arg1 == 70) {
			this.anInt1547 = arg0.method445();
		} else if (arg1 == 71) {
			this.anInt1531 = arg0.method445();
		} else if (arg1 == 72) {
			this.anInt1513 = arg0.method445();
		} else if (arg1 == 73) {
			this.aBoolean117 = true;
		} else if (arg1 == 74) {
			this.aBoolean110 = true;
		} else if (arg1 == 75) {
			this.anInt1532 = arg0.method446();
		} else if (arg1 == 77) {
			this.anInt1545 = arg0.method459();
			if (this.anInt1545 == 65535) {
				this.anInt1545 = -1;
			}
			this.anInt1516 = arg0.method459();
			if (this.anInt1516 == 65535) {
				this.anInt1516 = -1;
			}
			local8 = arg0.method446();
			this.anIntArray215 = new int[local8 + 1];
			for (local38 = 0; local38 <= local8; local38++) {
				this.anIntArray215[local38] = arg0.method459();
				if (this.anIntArray215[local38] == 65535) {
					this.anIntArray215[local38] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.anInt1544 = arg0.method459();
			this.anInt1535 = arg0.method446();
		} else if (arg1 == 79) {
			this.anInt1522 = arg0.method459();
			this.anInt1528 = arg0.method459();
			this.anInt1535 = arg0.method446();
			local8 = arg0.method446();
			this.anIntArray213 = new int[local8];
			for (local38 = 0; local38 < local8; local38++) {
				this.anIntArray213[local38] = arg0.method459();
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!gb;)V")
	public void method1037(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method446();
			if (local5 == 0) {
				return;
			}
			this.method1035(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "(I)Z")
	public boolean method1038() {
		if (this.anIntArray215 == null) {
			return this.anInt1544 != -1 || this.anIntArray213 != null;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray215.length; local21++) {
			if (this.anIntArray215[local21] != -1) {
				@Pc(37) Class3_Sub1_Sub5 local37 = Static38.method1911(this.anIntArray215[local21]);
				if (local37.anInt1544 != -1 || local37.anIntArray213 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Z")
	public boolean method1039(@OriginalArg(1) int arg0) {
		if (this.anIntArray214 != null) {
			for (@Pc(57) int local57 = 0; local57 < this.anIntArray214.length; local57++) {
				if (arg0 == this.anIntArray214[local57]) {
					return Static87.aClass64_43.method1633(this.anIntArray216[local57] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray216 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(28) boolean local28 = true;
			for (@Pc(30) int local30 = 0; local30 < this.anIntArray216.length; local30++) {
				local28 &= Static87.aClass64_43.method1633(this.anIntArray216[local30] & 0xFFFF, 0);
			}
			return local28;
		} else {
			return true;
		}
	}
}
