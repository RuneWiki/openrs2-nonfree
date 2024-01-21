import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ee", name = "Z", descriptor = "I")
	private int anInt1302;

	@OriginalMember(owner = "client!ee", name = "eb", descriptor = "I")
	public int anInt1306;

	@OriginalMember(owner = "client!ee", name = "jb", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!ee", name = "ob", descriptor = "[I")
	public int[] anIntArray136;

	@OriginalMember(owner = "client!ee", name = "vb", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!ee", name = "wb", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!ee", name = "yb", descriptor = "[I")
	public int[] anIntArray137;

	@OriginalMember(owner = "client!ee", name = "Cb", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!ee", name = "Q", descriptor = "[Lclient!dd;")
	public Class13[] aClass13Array8 = new Class13[] { null, null, Static62.aClass13_844, null, null };

	@OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
	public int anInt1291 = 0;

	@OriginalMember(owner = "client!ee", name = "L", descriptor = "Z")
	public boolean aBoolean88 = false;

	@OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
	public int anInt1287 = 0;

	@OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
	private int anInt1290 = 0;

	@OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
	public int anInt1288 = 0;

	@OriginalMember(owner = "client!ee", name = "V", descriptor = "I")
	private int anInt1298 = -1;

	@OriginalMember(owner = "client!ee", name = "ab", descriptor = "I")
	public int anInt1303 = -1;

	@OriginalMember(owner = "client!ee", name = "R", descriptor = "Lclient!dd;")
	public Class13 aClass13_463 = Static129.aClass13_1091;

	@OriginalMember(owner = "client!ee", name = "lb", descriptor = "I")
	private int anInt1312 = -1;

	@OriginalMember(owner = "client!ee", name = "Y", descriptor = "I")
	private int anInt1301 = 0;

	@OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
	private int anInt1289 = 128;

	@OriginalMember(owner = "client!ee", name = "cb", descriptor = "I")
	public int anInt1305 = 0;

	@OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
	private int anInt1292 = 128;

	@OriginalMember(owner = "client!ee", name = "hb", descriptor = "I")
	private int anInt1309 = 128;

	@OriginalMember(owner = "client!ee", name = "Eb", descriptor = "I")
	private int anInt1323 = 0;

	@OriginalMember(owner = "client!ee", name = "Bb", descriptor = "I")
	public int anInt1322 = 2000;

	@OriginalMember(owner = "client!ee", name = "mb", descriptor = "I")
	private int anInt1313 = -1;

	@OriginalMember(owner = "client!ee", name = "W", descriptor = "I")
	public int anInt1299 = 0;

	@OriginalMember(owner = "client!ee", name = "tb", descriptor = "I")
	private int anInt1318 = -1;

	@OriginalMember(owner = "client!ee", name = "xb", descriptor = "I")
	public int anInt1320 = 1;

	@OriginalMember(owner = "client!ee", name = "kb", descriptor = "I")
	private int anInt1311 = -1;

	@OriginalMember(owner = "client!ee", name = "Fb", descriptor = "I")
	public int anInt1324 = -1;

	@OriginalMember(owner = "client!ee", name = "sb", descriptor = "I")
	public int anInt1317 = -1;

	@OriginalMember(owner = "client!ee", name = "Hb", descriptor = "I")
	public int anInt1326 = 0;

	@OriginalMember(owner = "client!ee", name = "pb", descriptor = "[Lclient!dd;")
	public Class13[] aClass13Array9 = new Class13[] { null, null, null, null, Static186.aClass13_1432 };

	@OriginalMember(owner = "client!ee", name = "rb", descriptor = "I")
	private int anInt1316 = -1;

	@OriginalMember(owner = "client!ee", name = "Gb", descriptor = "I")
	private int anInt1325 = -1;

	@OriginalMember(owner = "client!ee", name = "Ab", descriptor = "I")
	private int anInt1321 = -1;

	@OriginalMember(owner = "client!ee", name = "zb", descriptor = "Z")
	public boolean aBoolean89 = false;

	@OriginalMember(owner = "client!ee", name = "Ib", descriptor = "I")
	public int anInt1327 = -1;

	@OriginalMember(owner = "client!ee", name = "Kb", descriptor = "I")
	public int anInt1329 = 0;

	@OriginalMember(owner = "client!ee", name = "Lb", descriptor = "I")
	private int anInt1330 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZI)Z")
	public boolean method1057(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt1312;
		@Pc(9) int local9 = this.anInt1311;
		if (arg0) {
			local6 = this.anInt1325;
			local9 = this.anInt1316;
		}
		if (local9 == -1) {
			return true;
		}
		@Pc(25) boolean local25 = true;
		if (!Static83.aClass4_56.method2247(local9, 0)) {
			local25 = false;
		}
		if (local6 != -1 && !Static83.aClass4_56.method2247(local6, 0)) {
			local25 = false;
		}
		return local25;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(ZI)Lclient!be;")
	public Class1_Sub2_Sub2_Sub1 method1058(@OriginalArg(0) boolean arg0) {
		@Pc(4) int local4 = this.anInt1318;
		@Pc(21) int local21 = this.anInt1327;
		@Pc(24) int local24 = this.anInt1321;
		if (arg0) {
			local24 = this.anInt1313;
			local4 = this.anInt1298;
			local21 = this.anInt1317;
		}
		if (local21 == -1) {
			return null;
		}
		@Pc(45) Class1_Sub2_Sub2_Sub1 local45 = Static13.method505(Static83.aClass4_56, local21);
		if (local4 != -1) {
			@Pc(53) Class1_Sub2_Sub2_Sub1 local53 = Static13.method505(Static83.aClass4_56, local4);
			if (local24 == -1) {
				@Pc(68) Class1_Sub2_Sub2_Sub1[] local68 = new Class1_Sub2_Sub2_Sub1[] { local45, local53 };
				local45 = new Class1_Sub2_Sub2_Sub1(local68, 2);
			} else {
				@Pc(81) Class1_Sub2_Sub2_Sub1 local81 = Static13.method505(Static83.aClass4_56, local24);
				@Pc(96) Class1_Sub2_Sub2_Sub1[] local96 = new Class1_Sub2_Sub2_Sub1[] { local45, local53, local81 };
				local45 = new Class1_Sub2_Sub2_Sub1(local96, 3);
			}
		}
		if (!arg0 && this.anInt1323 != 0) {
			local45.method509(0, this.anInt1323, 0);
		}
		if (arg0 && this.anInt1330 != 0) {
			local45.method509(0, this.anInt1330, 0);
		}
		@Pc(135) int local135;
		if (this.aShortArray17 != null) {
			for (local135 = 0; local135 < this.aShortArray17.length; local135++) {
				local45.method513(this.aShortArray17[local135], this.aShortArray16[local135]);
			}
		}
		if (this.aShortArray15 != null) {
			for (local135 = 0; local135 < this.aShortArray15.length; local135++) {
				local45.method503(this.aShortArray15[local135], this.aShortArray18[local135]);
			}
		}
		return local45;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ce;B)V")
	public void method1059(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1607();
			if (local5 == 0) {
				return;
			}
			this.method1065(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIBLclient!fa;)Lclient!ia;")
	public Class1_Sub2_Sub2_Sub5 method1060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub2_Sub8 arg2) {
		if (this.anIntArray136 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (this.anIntArray137[local15] <= arg0 && this.anIntArray137[local15] != 0) {
					local13 = this.anIntArray136[local15];
				}
			}
			if (local13 != -1) {
				return Static184.method2994(local13).method1060(1, arg1, arg2);
			}
		}
		@Pc(71) Class1_Sub2_Sub2_Sub5 local71 = (Class1_Sub2_Sub2_Sub5) Static102.aClass47_21.method1999((long) this.anInt1306);
		if (local71 == null) {
			@Pc(79) Class1_Sub2_Sub2_Sub1 local79 = Static13.method505(Static83.aClass4_56, this.anInt1302);
			if (local79 == null) {
				return null;
			}
			@Pc(88) int local88;
			if (this.aShortArray17 != null) {
				for (local88 = 0; local88 < this.aShortArray17.length; local88++) {
					local79.method513(this.aShortArray17[local88], this.aShortArray16[local88]);
				}
			}
			if (this.aShortArray15 != null) {
				for (local88 = 0; local88 < this.aShortArray15.length; local88++) {
					local79.method503(this.aShortArray15[local88], this.aShortArray18[local88]);
				}
			}
			local71 = local79.method511(this.anInt1301 + 64, this.anInt1290 + 768, -50, -10, -50, false);
			if (this.anInt1289 != 128 || this.anInt1309 != 128 || this.anInt1292 != 128) {
				local71.method2719(this.anInt1289, this.anInt1309, this.anInt1292);
			}
			Static102.aClass47_21.method1998(local71, (long) this.anInt1306);
		}
		if (arg2 != null) {
			local71 = arg2.method1204(arg1, local71);
		}
		return local71;
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(ZI)Z")
	public boolean method1061(@OriginalArg(0) boolean arg0) {
		@Pc(2) int local2 = this.anInt1327;
		@Pc(5) int local5 = this.anInt1321;
		@Pc(12) int local12 = this.anInt1318;
		if (arg0) {
			local5 = this.anInt1313;
			local2 = this.anInt1317;
			local12 = this.anInt1298;
		}
		if (local2 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static83.aClass4_56.method2247(local2, 0)) {
			local30 = false;
		}
		if (local12 != -1 && !Static83.aClass4_56.method2247(local12, 0)) {
			local30 = false;
		}
		if (local5 != -1 && !Static83.aClass4_56.method2247(local5, 0)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BZ)Lclient!be;")
	public Class1_Sub2_Sub2_Sub1 method1062(@OriginalArg(1) boolean arg0) {
		@Pc(4) int local4 = this.anInt1311;
		@Pc(7) int local7 = this.anInt1312;
		if (arg0) {
			local4 = this.anInt1316;
			local7 = this.anInt1325;
		}
		if (local4 == -1) {
			return null;
		}
		@Pc(29) Class1_Sub2_Sub2_Sub1 local29 = Static13.method505(Static83.aClass4_56, local4);
		if (local7 != -1) {
			@Pc(37) Class1_Sub2_Sub2_Sub1 local37 = Static13.method505(Static83.aClass4_56, local7);
			@Pc(48) Class1_Sub2_Sub2_Sub1[] local48 = new Class1_Sub2_Sub2_Sub1[] { local29, local37 };
			local29 = new Class1_Sub2_Sub2_Sub1(local48, 2);
		}
		@Pc(59) int local59;
		if (this.aShortArray17 != null) {
			for (local59 = 0; local59 < this.aShortArray17.length; local59++) {
				local29.method513(this.aShortArray17[local59], this.aShortArray16[local59]);
			}
		}
		if (this.aShortArray15 != null) {
			for (local59 = 0; local59 < this.aShortArray15.length; local59++) {
				local29.method503(this.aShortArray15[local59], this.aShortArray18[local59]);
			}
		}
		return local29;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)Lclient!ee;")
	public Class1_Sub2_Sub6 method1063(@OriginalArg(0) int arg0) {
		if (this.anIntArray136 != null && arg0 > 1) {
			@Pc(20) int local20 = -1;
			for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
				if (this.anIntArray137[local22] <= arg0 && this.anIntArray137[local22] != 0) {
					local20 = this.anIntArray136[local22];
				}
			}
			if (local20 != -1) {
				return Static184.method2994(local20);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IBLclient!ce;)V")
	private void method1065(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt1302 = arg1.method1642();
		} else if (arg0 == 2) {
			this.aClass13_463 = arg1.method1622();
		} else if (arg0 == 4) {
			this.anInt1322 = arg1.method1642();
		} else if (arg0 == 5) {
			this.anInt1326 = arg1.method1642();
		} else if (arg0 == 6) {
			this.anInt1299 = arg1.method1642();
		} else if (arg0 == 7) {
			this.anInt1291 = arg1.method1642();
			if (this.anInt1291 > 32767) {
				this.anInt1291 -= 65536;
			}
		} else if (arg0 == 8) {
			this.anInt1305 = arg1.method1642();
			if (this.anInt1305 > 32767) {
				this.anInt1305 -= 65536;
			}
		} else if (arg0 == 11) {
			this.anInt1287 = 1;
		} else if (arg0 == 12) {
			this.anInt1320 = arg1.method1626();
		} else if (arg0 == 16) {
			this.aBoolean88 = true;
		} else if (arg0 == 23) {
			this.anInt1327 = arg1.method1642();
			this.anInt1323 = arg1.method1607();
		} else if (arg0 == 24) {
			this.anInt1318 = arg1.method1642();
		} else if (arg0 == 25) {
			this.anInt1317 = arg1.method1642();
			this.anInt1330 = arg1.method1607();
		} else if (arg0 == 26) {
			this.anInt1298 = arg1.method1642();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass13Array8[arg0 - 30] = arg1.method1622();
			if (this.aClass13Array8[arg0 - 30].method894(Static42.aClass13_486)) {
				this.aClass13Array8[arg0 - 30] = null;
			}
		} else if (arg0 >= 35 && arg0 < 40) {
			this.aClass13Array9[arg0 - 35] = arg1.method1622();
		} else {
			@Pc(352) int local352;
			@Pc(362) int local362;
			if (arg0 == 40) {
				local352 = arg1.method1607();
				this.aShortArray17 = new short[local352];
				this.aShortArray16 = new short[local352];
				for (local362 = 0; local362 < local352; local362++) {
					this.aShortArray17[local362] = (short) arg1.method1642();
					this.aShortArray16[local362] = (short) arg1.method1642();
				}
			} else if (arg0 == 41) {
				local352 = arg1.method1607();
				this.aShortArray18 = new short[local352];
				this.aShortArray15 = new short[local352];
				for (local362 = 0; local362 < local352; local362++) {
					this.aShortArray15[local362] = (short) arg1.method1642();
					this.aShortArray18[local362] = (short) arg1.method1642();
				}
			} else if (arg0 == 65) {
				this.aBoolean89 = true;
			} else if (arg0 == 78) {
				this.anInt1321 = arg1.method1642();
			} else if (arg0 == 79) {
				this.anInt1313 = arg1.method1642();
			} else if (arg0 == 90) {
				this.anInt1311 = arg1.method1642();
			} else if (arg0 == 91) {
				this.anInt1316 = arg1.method1642();
			} else if (arg0 == 92) {
				this.anInt1312 = arg1.method1642();
			} else if (arg0 == 93) {
				this.anInt1325 = arg1.method1642();
			} else if (arg0 == 95) {
				this.anInt1288 = arg1.method1642();
			} else if (arg0 == 97) {
				this.anInt1324 = arg1.method1642();
			} else if (arg0 == 98) {
				this.anInt1303 = arg1.method1642();
			} else if (arg0 >= 100 && arg0 < 110) {
				if (this.anIntArray136 == null) {
					this.anIntArray137 = new int[10];
					this.anIntArray136 = new int[10];
				}
				this.anIntArray136[arg0 - 100] = arg1.method1642();
				this.anIntArray137[arg0 - 100] = arg1.method1642();
			} else if (arg0 == 110) {
				this.anInt1289 = arg1.method1642();
			} else if (arg0 == 111) {
				this.anInt1309 = arg1.method1642();
			} else if (arg0 == 112) {
				this.anInt1292 = arg1.method1642();
			} else if (arg0 == 113) {
				this.anInt1301 = arg1.method1611();
			} else if (arg0 == 114) {
				this.anInt1290 = arg1.method1611() * 5;
			} else if (arg0 == 115) {
				this.anInt1329 = arg1.method1607();
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)Lclient!sg;")
	public Class1_Sub2_Sub2_Sub5_Sub1 method1068() {
		@Pc(11) Class1_Sub2_Sub2_Sub1 local11 = Static13.method505(Static83.aClass4_56, this.anInt1302);
		if (local11 == null) {
			return null;
		}
		@Pc(20) int local20;
		if (this.aShortArray17 != null) {
			for (local20 = 0; local20 < this.aShortArray17.length; local20++) {
				local11.method513(this.aShortArray17[local20], this.aShortArray16[local20]);
			}
		}
		if (this.aShortArray15 != null) {
			for (local20 = 0; local20 < this.aShortArray15.length; local20++) {
				local11.method503(this.aShortArray15[local20], this.aShortArray18[local20]);
			}
		}
		@Pc(80) Class1_Sub2_Sub2_Sub5_Sub1 local80 = local11.method508(this.anInt1301 + 64, this.anInt1290 + 768);
		local80.aBoolean287 = true;
		if (this.anInt1289 != 128 || this.anInt1309 != 128 || this.anInt1292 != 128) {
			local80.method2719(this.anInt1289, this.anInt1309, this.anInt1292);
		}
		return local80;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ee;Lclient!ee;B)V")
	public void method1069(@OriginalArg(0) Class1_Sub2_Sub6 arg0, @OriginalArg(1) Class1_Sub2_Sub6 arg1) {
		this.anInt1305 = arg1.anInt1305;
		this.aClass13_463 = arg0.aClass13_463;
		this.anInt1326 = arg1.anInt1326;
		this.anInt1291 = arg1.anInt1291;
		this.anInt1320 = arg0.anInt1320;
		this.aShortArray18 = arg1.aShortArray18;
		this.anInt1322 = arg1.anInt1322;
		this.aShortArray16 = arg1.aShortArray16;
		this.anInt1288 = arg1.anInt1288;
		this.anInt1302 = arg1.anInt1302;
		this.anInt1287 = 1;
		this.anInt1299 = arg1.anInt1299;
		this.aShortArray15 = arg1.aShortArray15;
		this.aBoolean88 = arg0.aBoolean88;
		this.aShortArray17 = arg1.aShortArray17;
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
	public void method1070() {
	}
}
