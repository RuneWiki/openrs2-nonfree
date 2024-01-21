import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!je", name = "X", descriptor = "[I")
	private int[] anIntArray189;

	@OriginalMember(owner = "client!je", name = "ab", descriptor = "I")
	public int anInt1248;

	@OriginalMember(owner = "client!je", name = "bb", descriptor = "[I")
	public int[] anIntArray190;

	@OriginalMember(owner = "client!je", name = "hb", descriptor = "[I")
	private int[] anIntArray191;

	@OriginalMember(owner = "client!je", name = "ob", descriptor = "[I")
	public int[] anIntArray193;

	@OriginalMember(owner = "client!je", name = "xb", descriptor = "[I")
	private int[] anIntArray194;

	@OriginalMember(owner = "client!je", name = "Wb", descriptor = "[I")
	private int[] anIntArray195;

	@OriginalMember(owner = "client!je", name = "fb", descriptor = "I")
	public int anInt1250 = -1;

	@OriginalMember(owner = "client!je", name = "V", descriptor = "Z")
	public boolean aBoolean70 = false;

	@OriginalMember(owner = "client!je", name = "kb", descriptor = "I")
	private int anInt1254 = 0;

	@OriginalMember(owner = "client!je", name = "eb", descriptor = "Z")
	public boolean aBoolean72 = false;

	@OriginalMember(owner = "client!je", name = "cb", descriptor = "I")
	private int anInt1249 = 0;

	@OriginalMember(owner = "client!je", name = "qb", descriptor = "I")
	public int anInt1258 = 0;

	@OriginalMember(owner = "client!je", name = "tb", descriptor = "I")
	private int anInt1260 = 128;

	@OriginalMember(owner = "client!je", name = "rb", descriptor = "Z")
	public boolean aBoolean73 = false;

	@OriginalMember(owner = "client!je", name = "db", descriptor = "Z")
	public boolean aBoolean71 = true;

	@OriginalMember(owner = "client!je", name = "jb", descriptor = "I")
	public int anInt1253 = 0;

	@OriginalMember(owner = "client!je", name = "W", descriptor = "I")
	private int anInt1247 = -1;

	@OriginalMember(owner = "client!je", name = "Eb", descriptor = "I")
	public int anInt1267 = 0;

	@OriginalMember(owner = "client!je", name = "Fb", descriptor = "[Lclient!mc;")
	public final Class42[] aClass42Array8 = new Class42[5];

	@OriginalMember(owner = "client!je", name = "zb", descriptor = "Z")
	public boolean aBoolean75 = true;

	@OriginalMember(owner = "client!je", name = "Ib", descriptor = "I")
	public int anInt1270 = -1;

	@OriginalMember(owner = "client!je", name = "Nb", descriptor = "I")
	public int anInt1273 = -1;

	@OriginalMember(owner = "client!je", name = "yb", descriptor = "I")
	private int anInt1263 = 0;

	@OriginalMember(owner = "client!je", name = "sb", descriptor = "I")
	private int anInt1259 = 128;

	@OriginalMember(owner = "client!je", name = "Qb", descriptor = "I")
	public int anInt1276 = 1;

	@OriginalMember(owner = "client!je", name = "Ab", descriptor = "I")
	public int anInt1264 = 16;

	@OriginalMember(owner = "client!je", name = "Db", descriptor = "Lclient!mc;")
	public Class42 aClass42_693 = Static88.aClass42_1248;

	@OriginalMember(owner = "client!je", name = "pb", descriptor = "I")
	private int anInt1257 = 128;

	@OriginalMember(owner = "client!je", name = "Rb", descriptor = "Z")
	public boolean aBoolean76 = false;

	@OriginalMember(owner = "client!je", name = "Pb", descriptor = "I")
	private int anInt1275 = 0;

	@OriginalMember(owner = "client!je", name = "vb", descriptor = "Z")
	public boolean aBoolean74 = true;

	@OriginalMember(owner = "client!je", name = "U", descriptor = "I")
	private int anInt1246 = 0;

	@OriginalMember(owner = "client!je", name = "cc", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!je", name = "Yb", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!je", name = "Zb", descriptor = "I")
	public int anInt1280 = 0;

	@OriginalMember(owner = "client!je", name = "fc", descriptor = "I")
	private int anInt1284 = -1;

	@OriginalMember(owner = "client!je", name = "Mb", descriptor = "I")
	public int anInt1272 = -1;

	@OriginalMember(owner = "client!je", name = "Vb", descriptor = "I")
	public int anInt1279 = 1;

	@OriginalMember(owner = "client!je", name = "dc", descriptor = "I")
	public int anInt1282 = -1;

	@OriginalMember(owner = "client!je", name = "ib", descriptor = "I")
	public int anInt1252 = -1;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(BI)Z")
	public boolean method875(@OriginalArg(1) int arg0) {
		if (this.anIntArray195 != null) {
			for (@Pc(53) int local53 = 0; local53 < this.anIntArray195.length; local53++) {
				if (arg0 == this.anIntArray195[local53]) {
					return Static20.aClass33_7.method1310(0, this.anIntArray189[local53] & 0xFFFF);
				}
			}
			return true;
		} else if (this.anIntArray189 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(26) boolean local26 = true;
			for (@Pc(28) int local28 = 0; local28 < this.anIntArray189.length; local28++) {
				local26 &= Static20.aClass33_7.method1310(0, this.anIntArray189[local28] & 0xFFFF);
			}
			return local26;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZIZBI)Lclient!pc;")
	private Class1_Sub1_Sub8_Sub3 method876(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class1_Sub1_Sub8_Sub3 local13 = null;
		@Pc(38) boolean local38;
		@Pc(42) int local42;
		@Pc(44) int local44;
		@Pc(50) int local50;
		if (this.anIntArray195 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.anIntArray189 == null) {
				return null;
			}
			local38 = arg3 > 3 ^ this.aBoolean77;
			local42 = this.anIntArray189.length;
			for (local44 = 0; local44 < local42; local44++) {
				local50 = this.anIntArray189[local44];
				if (local38) {
					local50 += 65536;
				}
				local13 = (Class1_Sub1_Sub8_Sub3) Static38.aClass37_15.method982((long) local50);
				if (local13 == null) {
					local13 = Static76.method1372(Static20.aClass33_7, local50 & 0xFFFF);
					if (local13 == null) {
						return null;
					}
					if (local38) {
						local13.method1382();
					}
					Static38.aClass37_15.method981((long) local50, local13);
				}
				if (local42 > 1) {
					Static15.aClass1_Sub1_Sub8_Sub3Array1[local44] = local13;
				}
			}
			if (local42 > 1) {
				local13 = new Class1_Sub1_Sub8_Sub3(Static15.aClass1_Sub1_Sub8_Sub3Array1, local42);
			}
		} else {
			@Pc(113) int local113 = -1;
			for (local42 = 0; local42 < this.anIntArray195.length; local42++) {
				if (arg1 == this.anIntArray195[local42]) {
					local113 = local42;
					break;
				}
			}
			if (local113 == -1) {
				return null;
			}
			local44 = this.anIntArray189[local113];
			@Pc(164) boolean local164 = arg3 > 3 ^ this.aBoolean77;
			if (local164) {
				local44 += 65536;
			}
			local13 = (Class1_Sub1_Sub8_Sub3) Static38.aClass37_15.method982((long) local44);
			if (local13 == null) {
				local13 = Static76.method1372(Static20.aClass33_7, local44 & 0xFFFF);
				if (local13 == null) {
					return null;
				}
				if (local164) {
					local13.method1382();
				}
				Static38.aClass37_15.method981((long) local44, local13);
			}
		}
		@Pc(220) boolean local220;
		if (this.anInt1254 == 0 && this.anInt1263 == 0 && this.anInt1275 == 0) {
			local220 = false;
		} else {
			local220 = true;
		}
		if (this.anInt1260 == 128 && this.anInt1259 == 128 && this.anInt1257 == 128) {
			local38 = false;
		} else {
			local38 = true;
		}
		@Pc(272) Class1_Sub1_Sub8_Sub3 local272 = new Class1_Sub1_Sub8_Sub3(local13, arg3 == 0 && !local38 && !local220, this.anIntArray191 == null, true);
		@Pc(276) int local276 = arg3 & 0x3;
		if (local276 == 1) {
			local272.method1390();
		} else if (local276 == 2) {
			local272.method1388();
		} else if (local276 == 3) {
			local272.method1376();
		}
		if (this.anIntArray191 != null) {
			for (local50 = 0; local50 < this.anIntArray191.length; local50++) {
				local272.method1383(this.anIntArray191[local50], this.anIntArray194[local50]);
			}
		}
		if (local38) {
			local272.method1364(this.anInt1260, this.anInt1259, this.anInt1257);
		}
		if (local220) {
			local272.method1375(this.anInt1254, this.anInt1263, this.anInt1275);
		}
		if (arg0) {
			local272.method1377();
		}
		local272.method1394(this.anInt1246 + 64, this.anInt1249 * 5 + 768, -50, -10, -50, arg2);
		return local272;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!ka;BI)V")
	private void method878(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6;
		@Pc(32) int local32;
		if (arg1 == 1) {
			local6 = arg0.method1186();
			if (local6 > 0) {
				if (this.anIntArray189 == null || Static27.aBoolean38) {
					this.anIntArray195 = new int[local6];
					this.anIntArray189 = new int[local6];
					for (local32 = 0; local32 < local6; local32++) {
						this.anIntArray189[local32] = arg0.method1199();
						this.anIntArray195[local32] = arg0.method1186();
					}
				} else {
					arg0.anInt1692 += local6 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass42_693 = arg0.method1201();
		} else if (arg1 == 5) {
			local6 = arg0.method1186();
			if (local6 > 0) {
				if (this.anIntArray189 == null || Static27.aBoolean38) {
					this.anIntArray189 = new int[local6];
					this.anIntArray195 = null;
					for (local32 = 0; local32 < local6; local32++) {
						this.anIntArray189[local32] = arg0.method1199();
					}
				} else {
					arg0.anInt1692 += local6 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.anInt1279 = arg0.method1186();
		} else if (arg1 == 15) {
			this.anInt1276 = arg0.method1186();
		} else if (arg1 == 17) {
			this.aBoolean75 = false;
		} else if (arg1 == 18) {
			this.aBoolean71 = false;
		} else if (arg1 == 19) {
			this.anInt1272 = arg0.method1186();
		} else if (arg1 == 21) {
			this.aBoolean73 = true;
		} else if (arg1 == 22) {
			this.aBoolean79 = true;
		} else if (arg1 == 23) {
			this.aBoolean72 = true;
		} else if (arg1 == 24) {
			this.anInt1252 = arg0.method1199();
			if (this.anInt1252 == 65535) {
				this.anInt1252 = -1;
			}
		} else if (arg1 == 28) {
			this.anInt1264 = arg0.method1186();
		} else if (arg1 == 29) {
			this.anInt1246 = arg0.method1209();
		} else if (arg1 == 39) {
			this.anInt1249 = arg0.method1209() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass42Array8[arg1 - 30] = arg0.method1201();
			if (this.aClass42Array8[arg1 - 30].method1040(Static107.aClass42_1423)) {
				this.aClass42Array8[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local6 = arg0.method1186();
			this.anIntArray191 = new int[local6];
			this.anIntArray194 = new int[local6];
			for (local32 = 0; local32 < local6; local32++) {
				this.anIntArray191[local32] = arg0.method1199();
				this.anIntArray194[local32] = arg0.method1199();
			}
		} else if (arg1 == 60) {
			this.anInt1270 = arg0.method1199();
		} else if (arg1 == 62) {
			this.aBoolean77 = true;
		} else if (arg1 == 64) {
			this.aBoolean74 = false;
		} else if (arg1 == 65) {
			this.anInt1260 = arg0.method1199();
		} else if (arg1 == 66) {
			this.anInt1259 = arg0.method1199();
		} else if (arg1 == 67) {
			this.anInt1257 = arg0.method1199();
		} else if (arg1 == 68) {
			this.anInt1282 = arg0.method1199();
		} else if (arg1 == 69) {
			this.anInt1280 = arg0.method1186();
		} else if (arg1 == 70) {
			this.anInt1254 = arg0.method1226();
		} else if (arg1 == 71) {
			this.anInt1263 = arg0.method1226();
		} else if (arg1 == 72) {
			this.anInt1275 = arg0.method1226();
		} else if (arg1 == 73) {
			this.aBoolean76 = true;
		} else if (arg1 == 74) {
			this.aBoolean70 = true;
		} else if (arg1 == 75) {
			this.anInt1250 = arg0.method1186();
		} else if (arg1 == 77) {
			this.anInt1247 = arg0.method1199();
			if (this.anInt1247 == 65535) {
				this.anInt1247 = -1;
			}
			this.anInt1284 = arg0.method1199();
			if (this.anInt1284 == 65535) {
				this.anInt1284 = -1;
			}
			local6 = arg0.method1186();
			this.anIntArray190 = new int[local6 + 1];
			for (local32 = 0; local32 <= local6; local32++) {
				this.anIntArray190[local32] = arg0.method1199();
				if (this.anIntArray190[local32] == 65535) {
					this.anIntArray190[local32] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.anInt1273 = arg0.method1199();
			this.anInt1267 = arg0.method1186();
		} else if (arg1 == 79) {
			this.anInt1258 = arg0.method1199();
			this.anInt1253 = arg0.method1199();
			this.anInt1267 = arg0.method1186();
			local6 = arg0.method1186();
			this.anIntArray193 = new int[local6];
			for (local32 = 0; local32 < local6; local32++) {
				this.anIntArray193[local32] = arg0.method1199();
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "(I)Lclient!je;")
	public Class1_Sub1_Sub9 method879() {
		@Pc(13) int local13 = -1;
		if (this.anInt1247 != -1) {
			local13 = Static52.method973(this.anInt1247);
		} else if (this.anInt1284 != -1) {
			local13 = Static51.anIntArray200[this.anInt1284];
		}
		return local13 < 0 || local13 >= this.anIntArray190.length || this.anIntArray190[local13] == -1 ? null : Static42.method1755(this.anIntArray190[local13]);
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V")
	public void method880() {
		if (this.anInt1272 == -1) {
			this.anInt1272 = 0;
			if (this.anIntArray189 != null && (this.anIntArray195 == null || this.anIntArray195[0] == 10)) {
				this.anInt1272 = 1;
			}
			for (@Pc(26) int local26 = 0; local26 < 5; local26++) {
				if (this.aClass42Array8[local26] != null) {
					this.anInt1272 = 1;
				}
			}
		}
		if (this.anInt1250 == -1) {
			this.anInt1250 = this.aBoolean75 ? 1 : 0;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIII)Lclient!pc;")
	public Class1_Sub1_Sub8_Sub3 method881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(21) long local21;
		if (this.anIntArray195 == null) {
			local21 = arg4 + (this.anInt1248 << 10);
		} else {
			local21 = (arg5 << 3) + (this.anInt1248 << 10) + arg4;
		}
		@Pc(41) Class1_Sub1_Sub8_Sub3 local41 = (Class1_Sub1_Sub8_Sub3) Static88.aClass37_23.method982(local21);
		if (local41 == null) {
			local41 = this.method876(false, arg5, !this.aBoolean79, arg4);
			if (local41 == null) {
				return null;
			}
			Static88.aClass37_23.method981(local21, local41);
		}
		if (this.aBoolean73 || this.aBoolean79) {
			local41 = new Class1_Sub1_Sub8_Sub3(local41, this.aBoolean73, this.aBoolean79);
		}
		if (this.aBoolean73) {
			@Pc(96) int local96 = (arg2 + arg1 + arg3 + arg0) / 4;
			for (@Pc(98) int local98 = 0; local98 < local41.anInt1944; local98++) {
				@Pc(105) int local105 = local41.anIntArray275[local98];
				@Pc(110) int local110 = local41.anIntArray283[local98];
				@Pc(124) int local124 = arg3 + (local105 + 64) * (-arg3 + arg1) / 128;
				@Pc(136) int local136 = (local105 + 64) * (arg2 - arg0) / 128 + arg0;
				@Pc(149) int local149 = (local110 + 64) * (local136 - local124) / 128 + local124;
				local41.anIntArray274[local98] += local149 - local96;
			}
		}
		return local41;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!s;IIIIIII)Lclient!pc;")
	public Class1_Sub1_Sub8_Sub3 method882(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) long local16;
		if (this.anIntArray195 == null) {
			local16 = arg2 + (this.anInt1248 << 10);
		} else {
			local16 = arg2 + (arg0 << 3) + (this.anInt1248 << 10);
		}
		@Pc(36) Class1_Sub1_Sub8_Sub3 local36 = (Class1_Sub1_Sub8_Sub3) Static2.aClass37_1.method982(local16);
		if (local36 == null) {
			local36 = this.method876(true, arg0, true, arg2);
			if (local36 == null) {
				return null;
			}
			Static2.aClass37_1.method981(local16, local36);
		}
		if (arg1 == null && !this.aBoolean73) {
			return local36;
		}
		if (arg1 == null) {
			local36 = local36.method1380(true);
		} else {
			local36 = arg1.method1619(arg2, local36, arg4);
		}
		if (this.aBoolean73) {
			@Pc(99) int local99 = (arg3 + arg7 + arg6 + arg5) / 4;
			for (@Pc(101) int local101 = 0; local101 < local36.anInt1944; local101++) {
				@Pc(108) int local108 = local36.anIntArray275[local101];
				@Pc(120) int local120 = (local108 + 64) * (arg5 - arg3) / 128 + arg3;
				@Pc(133) int local133 = (local108 + 64) * (-arg6 + arg7) / 128 + arg6;
				@Pc(138) int local138 = local36.anIntArray283[local101];
				@Pc(151) int local151 = local133 + (local138 + 64) * (-local133 + local120) / 128;
				local36.anIntArray274[local101] += local151 - local99;
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!ka;B)V")
	public void method883(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method1186();
			if (local11 == 0) {
				return;
			}
			this.method878(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(B)Z")
	public boolean method884() {
		if (this.anIntArray189 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray189.length; local14++) {
			local12 &= Static20.aClass33_7.method1310(0, this.anIntArray189[local14] & 0xFFFF);
		}
		return local12;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)Z")
	public boolean method885() {
		if (this.anIntArray190 == null) {
			return this.anInt1273 != -1 || this.anIntArray193 != null;
		}
		for (@Pc(26) int local26 = 0; local26 < this.anIntArray190.length; local26++) {
			if (this.anIntArray190[local26] != -1) {
				@Pc(42) Class1_Sub1_Sub9 local42 = Static42.method1755(this.anIntArray190[local26]);
				if (local42.anInt1273 != -1 || local42.anIntArray193 != null) {
					return true;
				}
			}
		}
		return false;
	}
}
