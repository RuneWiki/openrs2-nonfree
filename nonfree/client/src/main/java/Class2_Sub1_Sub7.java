import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class2_Sub1_Sub7 extends Class2_Sub1 {

	@OriginalMember(owner = "client!j", name = "gb", descriptor = "I")
	public int anInt1294;

	@OriginalMember(owner = "client!j", name = "jb", descriptor = "[I")
	private int[] anIntArray181;

	@OriginalMember(owner = "client!j", name = "mb", descriptor = "[I")
	public int[] anIntArray182;

	@OriginalMember(owner = "client!j", name = "yb", descriptor = "I")
	private int anInt1310;

	@OriginalMember(owner = "client!j", name = "Fb", descriptor = "[I")
	private int[] anIntArray183;

	@OriginalMember(owner = "client!j", name = "Ob", descriptor = "[I")
	public int[] anIntArray184;

	@OriginalMember(owner = "client!j", name = "R", descriptor = "I")
	public int anInt1284 = 0;

	@OriginalMember(owner = "client!j", name = "U", descriptor = "I")
	private int anInt1286 = 128;

	@OriginalMember(owner = "client!j", name = "Y", descriptor = "[Lclient!ke;")
	public Class39[] aClass39Array10 = new Class39[] { null, null, null, null, Static18.aClass39_278 };

	@OriginalMember(owner = "client!j", name = "fb", descriptor = "I")
	private int anInt1293 = -1;

	@OriginalMember(owner = "client!j", name = "cb", descriptor = "Lclient!ke;")
	public Class39 aClass39_588 = Static100.aClass39_1245;

	@OriginalMember(owner = "client!j", name = "nb", descriptor = "I")
	public int anInt1299 = 0;

	@OriginalMember(owner = "client!j", name = "sb", descriptor = "I")
	private int anInt1304 = -1;

	@OriginalMember(owner = "client!j", name = "ib", descriptor = "I")
	private int anInt1296 = 128;

	@OriginalMember(owner = "client!j", name = "ob", descriptor = "I")
	public int anInt1300 = 0;

	@OriginalMember(owner = "client!j", name = "pb", descriptor = "I")
	private int anInt1301 = 0;

	@OriginalMember(owner = "client!j", name = "vb", descriptor = "I")
	private int anInt1307 = -1;

	@OriginalMember(owner = "client!j", name = "T", descriptor = "Z")
	public boolean aBoolean68 = false;

	@OriginalMember(owner = "client!j", name = "X", descriptor = "[Lclient!ke;")
	public Class39[] aClass39Array9 = new Class39[] { null, null, Static45.aClass39_564, null, null };

	@OriginalMember(owner = "client!j", name = "Ab", descriptor = "Z")
	public boolean aBoolean69 = false;

	@OriginalMember(owner = "client!j", name = "Hb", descriptor = "I")
	private int anInt1316 = -1;

	@OriginalMember(owner = "client!j", name = "Ib", descriptor = "I")
	private int anInt1317 = -1;

	@OriginalMember(owner = "client!j", name = "hb", descriptor = "I")
	public int anInt1295 = 0;

	@OriginalMember(owner = "client!j", name = "Jb", descriptor = "I")
	private int anInt1318 = -1;

	@OriginalMember(owner = "client!j", name = "W", descriptor = "I")
	private int anInt1288 = 0;

	@OriginalMember(owner = "client!j", name = "tb", descriptor = "I")
	public int anInt1305 = -1;

	@OriginalMember(owner = "client!j", name = "Eb", descriptor = "I")
	public int anInt1314 = 0;

	@OriginalMember(owner = "client!j", name = "Nb", descriptor = "I")
	private int anInt1322 = -1;

	@OriginalMember(owner = "client!j", name = "Gb", descriptor = "I")
	private int anInt1315 = -1;

	@OriginalMember(owner = "client!j", name = "Lb", descriptor = "I")
	private int anInt1320 = -1;

	@OriginalMember(owner = "client!j", name = "rb", descriptor = "I")
	public int anInt1303 = 0;

	@OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
	private int anInt1283 = 128;

	@OriginalMember(owner = "client!j", name = "Z", descriptor = "I")
	public int anInt1289 = 2000;

	@OriginalMember(owner = "client!j", name = "Tb", descriptor = "I")
	private int anInt1326 = -1;

	@OriginalMember(owner = "client!j", name = "Vb", descriptor = "I")
	public int anInt1327 = -1;

	@OriginalMember(owner = "client!j", name = "Kb", descriptor = "I")
	public int anInt1319 = 0;

	@OriginalMember(owner = "client!j", name = "ec", descriptor = "I")
	public int anInt1328 = 1;

	@OriginalMember(owner = "client!j", name = "ab", descriptor = "I")
	public int anInt1290 = 0;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IZ)Z")
	public boolean method898(@OriginalArg(1) boolean arg0) {
		@Pc(2) int local2 = this.anInt1316;
		@Pc(9) int local9 = this.anInt1315;
		@Pc(12) int local12 = this.anInt1317;
		if (arg0) {
			local2 = this.anInt1326;
			local12 = this.anInt1293;
			local9 = this.anInt1318;
		}
		if (local2 == -1) {
			return true;
		}
		@Pc(38) boolean local38 = true;
		if (!Static96.aClass36_65.method1768(0, local2)) {
			local38 = false;
		}
		if (local12 != -1 && !Static96.aClass36_65.method1768(0, local12)) {
			local38 = false;
		}
		if (local9 != -1 && !Static96.aClass36_65.method1768(0, local9)) {
			local38 = false;
		}
		return local38;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(IZ)Lclient!ga;")
	public Class2_Sub1_Sub2_Sub2 method899(@OriginalArg(1) boolean arg0) {
		@Pc(9) int local9 = this.anInt1320;
		@Pc(12) int local12 = this.anInt1322;
		if (arg0) {
			local9 = this.anInt1307;
			local12 = this.anInt1304;
		}
		if (local9 == -1) {
			return null;
		}
		@Pc(35) Class2_Sub1_Sub2_Sub2 local35 = Static32.method722(Static96.aClass36_65, local9);
		if (local12 != -1) {
			@Pc(44) Class2_Sub1_Sub2_Sub2 local44 = Static32.method722(Static96.aClass36_65, local12);
			@Pc(55) Class2_Sub1_Sub2_Sub2[] local55 = new Class2_Sub1_Sub2_Sub2[] { local35, local44 };
			local35 = new Class2_Sub1_Sub2_Sub2(local55, 2);
		}
		if (this.anIntArray183 != null) {
			for (@Pc(66) int local66 = 0; local66 < this.anIntArray183.length; local66++) {
				local35.method716(this.anIntArray183[local66], this.anIntArray181[local66]);
			}
		}
		return local35;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!g;)V")
	public void method901(@OriginalArg(1) Class2_Sub5 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1281();
			if (local13 == 0) {
				return;
			}
			this.method907(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IZZ)Lclient!ga;")
	public Class2_Sub1_Sub2_Sub2 method903(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(28) int local28;
		if (this.anIntArray182 != null && arg0 > 1) {
			@Pc(26) int local26 = -1;
			for (local28 = 0; local28 < 10; local28++) {
				if (this.anIntArray184[local28] <= arg0 && this.anIntArray184[local28] != 0) {
					local26 = this.anIntArray182[local28];
				}
			}
			if (local26 != -1) {
				return Static66.method1384(local26).method903(1, arg1);
			}
		}
		@Pc(73) Class2_Sub1_Sub2_Sub2 local73;
		if (arg1) {
			local73 = (Class2_Sub1_Sub2_Sub2) Static82.aClass54_23.method1634((long) this.anInt1294);
			if (local73 != null) {
				return local73;
			}
		}
		local73 = Static32.method722(Static96.aClass36_65, this.anInt1310);
		if (local73 == null) {
			return null;
		}
		if (this.anInt1296 != 128 || this.anInt1283 != 128 || this.anInt1286 != 128) {
			local73.method714(this.anInt1296, this.anInt1283, this.anInt1286);
		}
		if (this.anIntArray183 != null) {
			for (local28 = 0; local28 < this.anIntArray183.length; local28++) {
				local73.method716(this.anIntArray183[local28], this.anIntArray181[local28]);
			}
		}
		if (arg1) {
			local73.method712(this.anInt1319 + 64, this.anInt1314 + 768, -50, -10, -50, true);
			local73.aBoolean56 = true;
			Static82.aClass54_23.method1637((long) this.anInt1294, local73);
		}
		return local73;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!j;BLclient!j;)V")
	public void method904(@OriginalArg(0) Class2_Sub1_Sub7 arg0, @OriginalArg(2) Class2_Sub1_Sub7 arg1) {
		this.anInt1300 = arg0.anInt1300;
		this.anInt1284 = arg0.anInt1284;
		this.anInt1295 = arg0.anInt1295;
		this.anInt1310 = arg0.anInt1310;
		this.aBoolean68 = true;
		this.anInt1328 = arg1.anInt1328;
		this.anInt1290 = arg0.anInt1290;
		this.anInt1303 = arg0.anInt1303;
		this.anIntArray181 = arg0.anIntArray181;
		this.anInt1289 = arg0.anInt1289;
		this.aClass39_588 = arg1.aClass39_588;
		this.anIntArray183 = arg0.anIntArray183;
		this.aBoolean69 = arg1.aBoolean69;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZZ)Lclient!ga;")
	public Class2_Sub1_Sub2_Sub2 method905(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt1316;
		@Pc(11) int local11 = this.anInt1317;
		@Pc(14) int local14 = this.anInt1315;
		if (arg0) {
			local14 = this.anInt1318;
			local8 = this.anInt1326;
			local11 = this.anInt1293;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(36) Class2_Sub1_Sub2_Sub2 local36 = Static32.method722(Static96.aClass36_65, local8);
		if (local11 != -1) {
			@Pc(45) Class2_Sub1_Sub2_Sub2 local45 = Static32.method722(Static96.aClass36_65, local11);
			if (local14 == -1) {
				@Pc(60) Class2_Sub1_Sub2_Sub2[] local60 = new Class2_Sub1_Sub2_Sub2[] { local36, local45 };
				local36 = new Class2_Sub1_Sub2_Sub2(local60, 2);
			} else {
				@Pc(73) Class2_Sub1_Sub2_Sub2 local73 = Static32.method722(Static96.aClass36_65, local14);
				@Pc(88) Class2_Sub1_Sub2_Sub2[] local88 = new Class2_Sub1_Sub2_Sub2[] { local36, local45, local73 };
				local36 = new Class2_Sub1_Sub2_Sub2(local88, 3);
			}
		}
		if (!arg0 && this.anInt1288 != 0) {
			local36.method692(0, this.anInt1288, 0);
		}
		if (arg0 && this.anInt1301 != 0) {
			local36.method692(0, this.anInt1301, 0);
		}
		if (this.anIntArray183 != null) {
			for (@Pc(127) int local127 = 0; local127 < this.anIntArray183.length; local127++) {
				local36.method716(this.anIntArray183[local127], this.anIntArray181[local127]);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!g;II)V")
	private void method907(@OriginalArg(0) Class2_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1310 = arg0.method1273();
		} else if (arg1 == 2) {
			this.aClass39_588 = arg0.method1250();
		} else if (arg1 == 4) {
			this.anInt1289 = arg0.method1273();
		} else if (arg1 == 5) {
			this.anInt1284 = arg0.method1273();
		} else if (arg1 == 6) {
			this.anInt1300 = arg0.method1273();
		} else if (arg1 == 7) {
			this.anInt1303 = arg0.method1273();
			if (this.anInt1303 > 32767) {
				this.anInt1303 -= 65536;
			}
		} else if (arg1 == 8) {
			this.anInt1290 = arg0.method1273();
			if (this.anInt1290 > 32767) {
				this.anInt1290 -= 65536;
			}
		} else if (arg1 == 10) {
			arg0.method1273();
		} else if (arg1 == 11) {
			this.aBoolean68 = true;
		} else if (arg1 == 12) {
			this.anInt1328 = arg0.method1276();
		} else if (arg1 == 16) {
			this.aBoolean69 = true;
		} else if (arg1 == 23) {
			this.anInt1316 = arg0.method1273();
			this.anInt1288 = arg0.method1281();
		} else if (arg1 == 24) {
			this.anInt1317 = arg0.method1273();
		} else if (arg1 == 25) {
			this.anInt1326 = arg0.method1273();
			this.anInt1301 = arg0.method1281();
		} else if (arg1 == 26) {
			this.anInt1293 = arg0.method1273();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass39Array9[arg1 - 30] = arg0.method1250();
			if (this.aClass39Array9[arg1 - 30].method1106(Static109.aClass39_1332)) {
				this.aClass39Array9[arg1 - 30] = null;
			}
		} else if (arg1 >= 35 && arg1 < 40) {
			this.aClass39Array10[arg1 - 35] = arg0.method1250();
		} else if (arg1 == 40) {
			@Pc(180) int local180 = arg0.method1281();
			this.anIntArray181 = new int[local180];
			this.anIntArray183 = new int[local180];
			for (@Pc(190) int local190 = 0; local190 < local180; local190++) {
				this.anIntArray183[local190] = arg0.method1273();
				this.anIntArray181[local190] = arg0.method1273();
			}
		} else if (arg1 == 78) {
			this.anInt1315 = arg0.method1273();
		} else if (arg1 == 79) {
			this.anInt1318 = arg0.method1273();
		} else if (arg1 == 90) {
			this.anInt1320 = arg0.method1273();
		} else if (arg1 == 91) {
			this.anInt1307 = arg0.method1273();
		} else if (arg1 == 92) {
			this.anInt1322 = arg0.method1273();
		} else if (arg1 == 93) {
			this.anInt1304 = arg0.method1273();
		} else if (arg1 == 95) {
			this.anInt1295 = arg0.method1273();
		} else if (arg1 == 97) {
			this.anInt1305 = arg0.method1273();
		} else if (arg1 == 98) {
			this.anInt1327 = arg0.method1273();
		} else if (arg1 >= 100 && arg1 < 110) {
			if (this.anIntArray182 == null) {
				this.anIntArray182 = new int[10];
				this.anIntArray184 = new int[10];
			}
			this.anIntArray182[arg1 - 100] = arg0.method1273();
			this.anIntArray184[arg1 - 100] = arg0.method1273();
		} else if (arg1 == 110) {
			this.anInt1296 = arg0.method1273();
		} else if (arg1 == 111) {
			this.anInt1283 = arg0.method1273();
		} else if (arg1 == 112) {
			this.anInt1286 = arg0.method1273();
		} else if (arg1 == 113) {
			this.anInt1319 = arg0.method1254();
		} else if (arg1 == 114) {
			this.anInt1314 = arg0.method1254() * 5;
		} else if (arg1 == 115) {
			this.anInt1299 = arg0.method1281();
		}
	}

	@OriginalMember(owner = "client!j", name = "f", descriptor = "(I)V")
	public void method908() {
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZI)Z")
	public boolean method909(@OriginalArg(0) boolean arg0) {
		@Pc(16) int local16 = this.anInt1322;
		@Pc(19) int local19 = this.anInt1320;
		if (arg0) {
			local19 = this.anInt1307;
			local16 = this.anInt1304;
		}
		if (local19 == -1) {
			return true;
		}
		@Pc(35) boolean local35 = true;
		if (!Static96.aClass36_65.method1768(0, local19)) {
			local35 = false;
		}
		if (local16 != -1 && !Static96.aClass36_65.method1768(0, local16)) {
			local35 = false;
		}
		return local35;
	}
}
