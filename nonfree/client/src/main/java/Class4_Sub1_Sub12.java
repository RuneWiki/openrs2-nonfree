import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class4_Sub1_Sub12 extends Class4_Sub1 {

	@OriginalMember(owner = "client!l", name = "C", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!l", name = "J", descriptor = "[I")
	public int[] anIntArray231;

	@OriginalMember(owner = "client!l", name = "db", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!l", name = "eb", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!l", name = "gb", descriptor = "[I")
	public int[] anIntArray232;

	@OriginalMember(owner = "client!l", name = "xb", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!l", name = "yb", descriptor = "I")
	public int anInt2497;

	@OriginalMember(owner = "client!l", name = "Hb", descriptor = "I")
	private int anInt2505;

	@OriginalMember(owner = "client!l", name = "K", descriptor = "I")
	public int anInt2468 = -1;

	@OriginalMember(owner = "client!l", name = "G", descriptor = "I")
	private int anInt2465 = -1;

	@OriginalMember(owner = "client!l", name = "A", descriptor = "[Lclient!jd;")
	public Class46[] aClass46Array18 = new Class46[] { null, null, Static155.aClass46_1304, null, null };

	@OriginalMember(owner = "client!l", name = "Y", descriptor = "I")
	public int anInt2481 = 0;

	@OriginalMember(owner = "client!l", name = "L", descriptor = "I")
	private int anInt2469 = 0;

	@OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
	public int anInt2474 = 0;

	@OriginalMember(owner = "client!l", name = "H", descriptor = "I")
	private int anInt2466 = 128;

	@OriginalMember(owner = "client!l", name = "bb", descriptor = "I")
	private int anInt2483 = -1;

	@OriginalMember(owner = "client!l", name = "I", descriptor = "I")
	private int anInt2467 = 0;

	@OriginalMember(owner = "client!l", name = "mb", descriptor = "[Lclient!jd;")
	public Class46[] aClass46Array19 = new Class46[] { null, null, null, null, Static102.aClass46_936 };

	@OriginalMember(owner = "client!l", name = "V", descriptor = "I")
	public int anInt2479 = -1;

	@OriginalMember(owner = "client!l", name = "U", descriptor = "I")
	public int anInt2478 = -1;

	@OriginalMember(owner = "client!l", name = "qb", descriptor = "I")
	public int anInt2491 = 0;

	@OriginalMember(owner = "client!l", name = "lb", descriptor = "I")
	private int anInt2488 = -1;

	@OriginalMember(owner = "client!l", name = "T", descriptor = "I")
	private int anInt2477 = -1;

	@OriginalMember(owner = "client!l", name = "pb", descriptor = "Z")
	public boolean aBoolean109 = false;

	@OriginalMember(owner = "client!l", name = "nb", descriptor = "I")
	public int anInt2489 = 0;

	@OriginalMember(owner = "client!l", name = "B", descriptor = "Lclient!jd;")
	public Class46 aClass46_895 = Static53.aClass46_511;

	@OriginalMember(owner = "client!l", name = "hb", descriptor = "I")
	public int anInt2485 = 0;

	@OriginalMember(owner = "client!l", name = "ub", descriptor = "I")
	private int anInt2495 = 128;

	@OriginalMember(owner = "client!l", name = "vb", descriptor = "I")
	private int anInt2496 = -1;

	@OriginalMember(owner = "client!l", name = "cb", descriptor = "I")
	public int anInt2484 = 1;

	@OriginalMember(owner = "client!l", name = "fb", descriptor = "Z")
	public boolean aBoolean108 = false;

	@OriginalMember(owner = "client!l", name = "P", descriptor = "I")
	private int anInt2473 = -1;

	@OriginalMember(owner = "client!l", name = "Bb", descriptor = "I")
	public int anInt2499 = 2000;

	@OriginalMember(owner = "client!l", name = "Db", descriptor = "I")
	private int anInt2501 = 0;

	@OriginalMember(owner = "client!l", name = "M", descriptor = "I")
	private int anInt2470 = 0;

	@OriginalMember(owner = "client!l", name = "Eb", descriptor = "I")
	private int anInt2502 = -1;

	@OriginalMember(owner = "client!l", name = "sb", descriptor = "I")
	public int anInt2493 = 0;

	@OriginalMember(owner = "client!l", name = "Gb", descriptor = "I")
	public int anInt2504 = 0;

	@OriginalMember(owner = "client!l", name = "Cb", descriptor = "I")
	private int anInt2500 = 128;

	@OriginalMember(owner = "client!l", name = "Ib", descriptor = "I")
	private int anInt2506 = -1;

	@OriginalMember(owner = "client!l", name = "Fb", descriptor = "I")
	public int anInt2503 = -1;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)Lclient!ff;")
	public Class4_Sub1_Sub1_Sub6 method1879(@OriginalArg(0) boolean arg0) {
		@Pc(4) int local4 = this.anInt2483;
		@Pc(17) int local17 = this.anInt2496;
		if (arg0) {
			local4 = this.anInt2477;
			local17 = this.anInt2465;
		}
		if (local4 == -1) {
			return null;
		}
		@Pc(36) Class4_Sub1_Sub1_Sub6 local36 = Static51.method1003(Static131.aClass62_32, local4);
		if (local17 != -1) {
			@Pc(44) Class4_Sub1_Sub1_Sub6 local44 = Static51.method1003(Static131.aClass62_32, local17);
			@Pc(55) Class4_Sub1_Sub1_Sub6[] local55 = new Class4_Sub1_Sub1_Sub6[] { local36, local44 };
			local36 = new Class4_Sub1_Sub1_Sub6(local55, 2);
		}
		@Pc(66) int local66;
		if (this.aShortArray30 != null) {
			for (local66 = 0; local66 < this.aShortArray30.length; local66++) {
				local36.method1011(this.aShortArray30[local66], this.aShortArray29[local66]);
			}
		}
		if (this.aShortArray28 != null) {
			for (local66 = 0; local66 < this.aShortArray28.length; local66++) {
				local36.method1010(this.aShortArray28[local66], this.aShortArray31[local66]);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZZ)Z")
	public boolean method1880(@OriginalArg(0) boolean arg0) {
		@Pc(13) int local13 = this.anInt2506;
		@Pc(16) int local16 = this.anInt2488;
		@Pc(19) int local19 = this.anInt2468;
		if (arg0) {
			local19 = this.anInt2503;
			local16 = this.anInt2502;
			local13 = this.anInt2473;
		}
		if (local19 == -1) {
			return true;
		}
		@Pc(37) boolean local37 = true;
		if (!Static131.aClass62_32.method2872(0, local19)) {
			local37 = false;
		}
		if (local16 != -1 && !Static131.aClass62_32.method2872(0, local16)) {
			local37 = false;
		}
		if (local13 != -1 && !Static131.aClass62_32.method2872(0, local13)) {
			local37 = false;
		}
		return local37;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!h;B)V")
	private void method1882(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt2505 = arg1.method1252();
		} else if (arg0 == 2) {
			this.aClass46_895 = arg1.method1247();
		} else if (arg0 == 4) {
			this.anInt2499 = arg1.method1252();
		} else if (arg0 == 5) {
			this.anInt2493 = arg1.method1252();
		} else if (arg0 == 6) {
			this.anInt2491 = arg1.method1252();
		} else if (arg0 == 7) {
			this.anInt2504 = arg1.method1252();
			if (this.anInt2504 > 32767) {
				this.anInt2504 -= 65536;
			}
		} else if (arg0 == 8) {
			this.anInt2485 = arg1.method1252();
			if (this.anInt2485 > 32767) {
				this.anInt2485 -= 65536;
			}
		} else if (arg0 == 11) {
			this.anInt2481 = 1;
		} else if (arg0 == 12) {
			this.anInt2484 = arg1.method1263();
		} else if (arg0 == 16) {
			this.aBoolean109 = true;
		} else if (arg0 == 23) {
			this.anInt2468 = arg1.method1252();
			this.anInt2467 = arg1.method1253();
		} else if (arg0 == 24) {
			this.anInt2488 = arg1.method1252();
		} else if (arg0 == 25) {
			this.anInt2503 = arg1.method1252();
			this.anInt2469 = arg1.method1253();
		} else if (arg0 == 26) {
			this.anInt2502 = arg1.method1252();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass46Array18[arg0 - 30] = arg1.method1247();
			if (this.aClass46Array18[arg0 - 30].method1683(Static130.aClass46_1141)) {
				this.aClass46Array18[arg0 - 30] = null;
			}
		} else if (arg0 >= 35 && arg0 < 40) {
			this.aClass46Array19[arg0 - 35] = arg1.method1247();
		} else {
			@Pc(171) int local171;
			@Pc(181) int local181;
			if (arg0 == 40) {
				local171 = arg1.method1253();
				this.aShortArray30 = new short[local171];
				this.aShortArray29 = new short[local171];
				for (local181 = 0; local181 < local171; local181++) {
					this.aShortArray30[local181] = (short) arg1.method1252();
					this.aShortArray29[local181] = (short) arg1.method1252();
				}
			} else if (arg0 == 41) {
				local171 = arg1.method1253();
				this.aShortArray31 = new short[local171];
				this.aShortArray28 = new short[local171];
				for (local181 = 0; local181 < local171; local181++) {
					this.aShortArray28[local181] = (short) arg1.method1252();
					this.aShortArray31[local181] = (short) arg1.method1252();
				}
			} else if (arg0 == 65) {
				this.aBoolean108 = true;
			} else if (arg0 == 78) {
				this.anInt2506 = arg1.method1252();
			} else if (arg0 == 79) {
				this.anInt2473 = arg1.method1252();
			} else if (arg0 == 90) {
				this.anInt2483 = arg1.method1252();
			} else if (arg0 == 91) {
				this.anInt2477 = arg1.method1252();
			} else if (arg0 == 92) {
				this.anInt2496 = arg1.method1252();
			} else if (arg0 == 93) {
				this.anInt2465 = arg1.method1252();
			} else if (arg0 == 95) {
				this.anInt2474 = arg1.method1252();
			} else if (arg0 == 97) {
				this.anInt2479 = arg1.method1252();
			} else if (arg0 == 98) {
				this.anInt2478 = arg1.method1252();
			} else if (arg0 >= 100 && arg0 < 110) {
				if (this.anIntArray231 == null) {
					this.anIntArray231 = new int[10];
					this.anIntArray232 = new int[10];
				}
				this.anIntArray231[arg0 - 100] = arg1.method1252();
				this.anIntArray232[arg0 - 100] = arg1.method1252();
			} else if (arg0 == 110) {
				this.anInt2495 = arg1.method1252();
			} else if (arg0 == 111) {
				this.anInt2500 = arg1.method1252();
			} else if (arg0 == 112) {
				this.anInt2466 = arg1.method1252();
			} else if (arg0 == 113) {
				this.anInt2470 = arg1.method1241();
			} else if (arg0 == 114) {
				this.anInt2501 = arg1.method1241() * 5;
			} else if (arg0 == 115) {
				this.anInt2489 = arg1.method1253();
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IILclient!ca;I)Lclient!dg;")
	public Class4_Sub1_Sub1_Sub4 method1883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub4 arg2) {
		if (this.anIntArray231 != null && arg1 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (arg1 >= this.anIntArray232[local15] && this.anIntArray232[local15] != 0) {
					local13 = this.anIntArray231[local15];
				}
			}
			if (local13 != -1) {
				return Static83.method1663(local13).method1883(arg0, 1, arg2);
			}
		}
		@Pc(73) Class4_Sub1_Sub1_Sub4 local73 = (Class4_Sub1_Sub1_Sub4) Static36.aClass66_20.method2225((long) this.anInt2497);
		if (local73 == null) {
			@Pc(81) Class4_Sub1_Sub1_Sub6 local81 = Static51.method1003(Static131.aClass62_32, this.anInt2505);
			if (local81 == null) {
				return null;
			}
			@Pc(90) int local90;
			if (this.aShortArray30 != null) {
				for (local90 = 0; local90 < this.aShortArray30.length; local90++) {
					local81.method1011(this.aShortArray30[local90], this.aShortArray29[local90]);
				}
			}
			if (this.aShortArray28 != null) {
				for (local90 = 0; local90 < this.aShortArray28.length; local90++) {
					local81.method1010(this.aShortArray28[local90], this.aShortArray31[local90]);
				}
			}
			local73 = local81.method1007(this.anInt2470 + 64, this.anInt2501 + 768, -50, -10, -50, false);
			if (this.anInt2495 != 128 || this.anInt2500 != 128 || this.anInt2466 != 128) {
				local73.method2826(this.anInt2495, this.anInt2500, this.anInt2466);
			}
			Static36.aClass66_20.method2222(local73, (long) this.anInt2497);
		}
		if (arg2 != null) {
			local73 = arg2.method349(arg0, local73);
		}
		return local73;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(ZZ)Z")
	public boolean method1884(@OriginalArg(0) boolean arg0) {
		@Pc(12) int local12 = this.anInt2483;
		@Pc(15) int local15 = this.anInt2496;
		if (arg0) {
			local12 = this.anInt2477;
			local15 = this.anInt2465;
		}
		if (local12 == -1) {
			return true;
		}
		@Pc(31) boolean local31 = true;
		if (!Static131.aClass62_32.method2872(0, local12)) {
			local31 = false;
		}
		if (local15 != -1 && !Static131.aClass62_32.method2872(0, local15)) {
			local31 = false;
		}
		return local31;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ)Lclient!ff;")
	public Class4_Sub1_Sub1_Sub6 method1885(@OriginalArg(1) boolean arg0) {
		@Pc(16) int local16 = this.anInt2468;
		@Pc(19) int local19 = this.anInt2488;
		@Pc(22) int local22 = this.anInt2506;
		if (arg0) {
			local16 = this.anInt2503;
			local19 = this.anInt2502;
			local22 = this.anInt2473;
		}
		if (local16 == -1) {
			return null;
		}
		@Pc(43) Class4_Sub1_Sub1_Sub6 local43 = Static51.method1003(Static131.aClass62_32, local16);
		if (local19 != -1) {
			@Pc(52) Class4_Sub1_Sub1_Sub6 local52 = Static51.method1003(Static131.aClass62_32, local19);
			if (local22 == -1) {
				@Pc(95) Class4_Sub1_Sub1_Sub6[] local95 = new Class4_Sub1_Sub1_Sub6[] { local43, local52 };
				local43 = new Class4_Sub1_Sub1_Sub6(local95, 2);
			} else {
				@Pc(61) Class4_Sub1_Sub1_Sub6 local61 = Static51.method1003(Static131.aClass62_32, local22);
				@Pc(76) Class4_Sub1_Sub1_Sub6[] local76 = new Class4_Sub1_Sub1_Sub6[] { local43, local52, local61 };
				local43 = new Class4_Sub1_Sub1_Sub6(local76, 3);
			}
		}
		if (!arg0 && this.anInt2467 != 0) {
			local43.method992(0, this.anInt2467, 0);
		}
		if (arg0 && this.anInt2469 != 0) {
			local43.method992(0, this.anInt2469, 0);
		}
		@Pc(131) int local131;
		if (this.aShortArray30 != null) {
			for (local131 = 0; local131 < this.aShortArray30.length; local131++) {
				local43.method1011(this.aShortArray30[local131], this.aShortArray29[local131]);
			}
		}
		if (this.aShortArray28 != null) {
			for (local131 = 0; local131 < this.aShortArray28.length; local131++) {
				local43.method1010(this.aShortArray28[local131], this.aShortArray31[local131]);
			}
		}
		return local43;
	}

	@OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V")
	public void method1886() {
	}

	@OriginalMember(owner = "client!l", name = "h", descriptor = "(I)Lclient!uc;")
	public Class4_Sub1_Sub1_Sub4_Sub1 method1887() {
		@Pc(17) Class4_Sub1_Sub1_Sub6 local17 = Static51.method1003(Static131.aClass62_32, this.anInt2505);
		if (local17 == null) {
			return null;
		}
		@Pc(26) int local26;
		if (this.aShortArray30 != null) {
			for (local26 = 0; local26 < this.aShortArray30.length; local26++) {
				local17.method1011(this.aShortArray30[local26], this.aShortArray29[local26]);
			}
		}
		if (this.aShortArray28 != null) {
			for (local26 = 0; local26 < this.aShortArray28.length; local26++) {
				local17.method1010(this.aShortArray28[local26], this.aShortArray31[local26]);
			}
		}
		@Pc(85) Class4_Sub1_Sub1_Sub4_Sub1 local85 = local17.method1008(this.anInt2470 + 64, this.anInt2501 + 768);
		local85.aBoolean148 = true;
		if (this.anInt2495 != 128 || this.anInt2500 != 128 || this.anInt2466 != 128) {
			local85.method2826(this.anInt2495, this.anInt2500, this.anInt2466);
		}
		return local85;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IZ)Lclient!l;")
	public Class4_Sub1_Sub12 method1888(@OriginalArg(0) int arg0) {
		if (this.anIntArray231 != null && arg0 > 1) {
			@Pc(19) int local19 = -1;
			for (@Pc(21) int local21 = 0; local21 < 10; local21++) {
				if (arg0 >= this.anIntArray232[local21] && this.anIntArray232[local21] != 0) {
					local19 = this.anIntArray231[local21];
				}
			}
			if (local19 != -1) {
				return Static83.method1663(local19);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!h;)V")
	public void method1890(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1253();
			if (local5 == 0) {
				return;
			}
			this.method1882(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!l;Lclient!l;)V")
	public void method1892(@OriginalArg(1) Class4_Sub1_Sub12 arg0, @OriginalArg(2) Class4_Sub1_Sub12 arg1) {
		this.anInt2484 = arg0.anInt2484;
		this.anInt2493 = arg1.anInt2493;
		this.anInt2491 = arg1.anInt2491;
		this.anInt2499 = arg1.anInt2499;
		this.anInt2485 = arg1.anInt2485;
		this.aClass46_895 = arg0.aClass46_895;
		this.aBoolean109 = arg0.aBoolean109;
		this.anInt2474 = arg1.anInt2474;
		this.anInt2505 = arg1.anInt2505;
		this.anInt2504 = arg1.anInt2504;
		this.aShortArray28 = arg1.aShortArray28;
		this.aShortArray29 = arg1.aShortArray29;
		this.anInt2481 = 1;
		this.aShortArray30 = arg1.aShortArray30;
		this.aShortArray31 = arg1.aShortArray31;
	}
}
