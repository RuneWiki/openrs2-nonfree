import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class2_Sub1_Sub17 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ta", name = "Ab", descriptor = "[I")
	private int[] anIntArray300;

	@OriginalMember(owner = "client!ta", name = "Cb", descriptor = "I")
	private int anInt2425;

	@OriginalMember(owner = "client!ta", name = "Nb", descriptor = "[I")
	private int[] anIntArray302;

	@OriginalMember(owner = "client!ta", name = "cc", descriptor = "[I")
	public int[] anIntArray303;

	@OriginalMember(owner = "client!ta", name = "fc", descriptor = "[I")
	public int[] anIntArray304;

	@OriginalMember(owner = "client!ta", name = "xc", descriptor = "I")
	public int anInt2467;

	@OriginalMember(owner = "client!ta", name = "xb", descriptor = "I")
	private int anInt2422 = -1;

	@OriginalMember(owner = "client!ta", name = "wb", descriptor = "[Lclient!a;")
	public Class1[] aClass1Array22 = new Class1[] { null, null, null, null, Static13.aClass1_596 };

	@OriginalMember(owner = "client!ta", name = "sb", descriptor = "I")
	public int anInt2419 = 0;

	@OriginalMember(owner = "client!ta", name = "Pb", descriptor = "I")
	private int anInt2436 = 0;

	@OriginalMember(owner = "client!ta", name = "tb", descriptor = "Lclient!a;")
	public Class1 aClass1_2571 = Static102.aClass1_2694;

	@OriginalMember(owner = "client!ta", name = "Hb", descriptor = "I")
	public int anInt2430 = 0;

	@OriginalMember(owner = "client!ta", name = "Zb", descriptor = "I")
	public int anInt2446 = 1;

	@OriginalMember(owner = "client!ta", name = "Db", descriptor = "I")
	public int anInt2426 = 0;

	@OriginalMember(owner = "client!ta", name = "ac", descriptor = "I")
	private int anInt2447 = 0;

	@OriginalMember(owner = "client!ta", name = "Wb", descriptor = "I")
	public int anInt2443 = 0;

	@OriginalMember(owner = "client!ta", name = "Rb", descriptor = "I")
	private int anInt2438 = -1;

	@OriginalMember(owner = "client!ta", name = "bc", descriptor = "I")
	public int anInt2448 = 0;

	@OriginalMember(owner = "client!ta", name = "Bb", descriptor = "[Lclient!a;")
	public Class1[] aClass1Array23 = new Class1[] { null, null, Static54.aClass1_1835, null, null };

	@OriginalMember(owner = "client!ta", name = "Kb", descriptor = "I")
	private int anInt2433 = 128;

	@OriginalMember(owner = "client!ta", name = "Eb", descriptor = "I")
	public int anInt2427 = -1;

	@OriginalMember(owner = "client!ta", name = "Tb", descriptor = "I")
	private int anInt2440 = -1;

	@OriginalMember(owner = "client!ta", name = "Ob", descriptor = "I")
	public int anInt2435 = 2000;

	@OriginalMember(owner = "client!ta", name = "Vb", descriptor = "I")
	private int anInt2442 = -1;

	@OriginalMember(owner = "client!ta", name = "Ub", descriptor = "I")
	public int anInt2441 = 0;

	@OriginalMember(owner = "client!ta", name = "Yb", descriptor = "I")
	public int anInt2445 = 0;

	@OriginalMember(owner = "client!ta", name = "lc", descriptor = "I")
	public int anInt2456 = 0;

	@OriginalMember(owner = "client!ta", name = "Qb", descriptor = "I")
	private int anInt2437 = -1;

	@OriginalMember(owner = "client!ta", name = "qc", descriptor = "I")
	private int anInt2461 = -1;

	@OriginalMember(owner = "client!ta", name = "pc", descriptor = "I")
	public int anInt2460 = 0;

	@OriginalMember(owner = "client!ta", name = "ec", descriptor = "I")
	private int anInt2450 = 128;

	@OriginalMember(owner = "client!ta", name = "mc", descriptor = "I")
	private int anInt2457 = -1;

	@OriginalMember(owner = "client!ta", name = "tc", descriptor = "I")
	private int anInt2464 = -1;

	@OriginalMember(owner = "client!ta", name = "uc", descriptor = "Z")
	public boolean aBoolean144 = false;

	@OriginalMember(owner = "client!ta", name = "wc", descriptor = "I")
	private int anInt2466 = -1;

	@OriginalMember(owner = "client!ta", name = "yc", descriptor = "I")
	private int anInt2468 = 128;

	@OriginalMember(owner = "client!ta", name = "Jb", descriptor = "I")
	public int anInt2432 = -1;

	@OriginalMember(owner = "client!ta", name = "hc", descriptor = "I")
	private int anInt2452 = -1;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BZ)Z")
	public boolean method1624(@OriginalArg(1) boolean arg0) {
		@Pc(12) int local12 = this.anInt2422;
		@Pc(15) int local15 = this.anInt2457;
		if (arg0) {
			local15 = this.anInt2440;
			local12 = this.anInt2466;
		}
		if (local12 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static12.aClass8_26.method1685(local12, 0)) {
			local30 = false;
		}
		if (local15 != -1 && !Static12.aClass8_26.method1685(local15, 0)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZB)Z")
	public boolean method1625(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt2452;
		@Pc(9) int local9 = this.anInt2438;
		@Pc(12) int local12 = this.anInt2442;
		if (arg0) {
			local12 = this.anInt2461;
			local9 = this.anInt2437;
			local6 = this.anInt2464;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(31) boolean local31 = true;
		if (!Static12.aClass8_26.method1685(local6, 0)) {
			local31 = false;
		}
		if (local9 != -1 && !Static12.aClass8_26.method1685(local9, 0)) {
			local31 = false;
		}
		if (local12 != -1 && !Static12.aClass8_26.method1685(local12, 0)) {
			local31 = false;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)Lclient!pa;")
	public Class2_Sub1_Sub1_Sub5 method1626(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt2452;
		@Pc(11) int local11 = this.anInt2438;
		@Pc(22) int local22 = this.anInt2442;
		if (arg0) {
			local8 = this.anInt2464;
			local11 = this.anInt2437;
			local22 = this.anInt2461;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(43) Class2_Sub1_Sub1_Sub5 local43 = Static75.method1431(Static12.aClass8_26, local8);
		if (local11 != -1) {
			@Pc(51) Class2_Sub1_Sub1_Sub5 local51 = Static75.method1431(Static12.aClass8_26, local11);
			if (local22 == -1) {
				@Pc(65) Class2_Sub1_Sub1_Sub5[] local65 = new Class2_Sub1_Sub1_Sub5[] { local43, local51 };
				local43 = new Class2_Sub1_Sub1_Sub5(local65, 2);
			} else {
				@Pc(78) Class2_Sub1_Sub1_Sub5 local78 = Static75.method1431(Static12.aClass8_26, local22);
				@Pc(93) Class2_Sub1_Sub1_Sub5[] local93 = new Class2_Sub1_Sub1_Sub5[] { local43, local51, local78 };
				local43 = new Class2_Sub1_Sub1_Sub5(local93, 3);
			}
		}
		if (!arg0 && this.anInt2436 != 0) {
			local43.method1429(0, this.anInt2436, 0);
		}
		if (arg0 && this.anInt2447 != 0) {
			local43.method1429(0, this.anInt2447, 0);
		}
		if (this.anIntArray300 != null) {
			for (@Pc(129) int local129 = 0; local129 < this.anIntArray300.length; local129++) {
				local43.method1404(this.anIntArray300[local129], this.anIntArray302[local129]);
			}
		}
		return local43;
	}

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "(I)V")
	public void method1627() {
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BI)Lclient!ta;")
	public Class2_Sub1_Sub17 method1629(@OriginalArg(1) int arg0) {
		if (this.anIntArray303 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (arg0 >= this.anIntArray304[local17] && this.anIntArray304[local17] != 0) {
					local15 = this.anIntArray303[local17];
				}
			}
			if (local15 != -1) {
				return Static73.method1374(local15);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(ZB)Lclient!pa;")
	public Class2_Sub1_Sub1_Sub5 method1633(@OriginalArg(0) boolean arg0) {
		@Pc(4) int local4 = this.anInt2422;
		@Pc(7) int local7 = this.anInt2457;
		if (arg0) {
			local4 = this.anInt2466;
			local7 = this.anInt2440;
		}
		if (local4 == -1) {
			return null;
		}
		@Pc(34) Class2_Sub1_Sub1_Sub5 local34 = Static75.method1431(Static12.aClass8_26, local4);
		if (local7 != -1) {
			@Pc(42) Class2_Sub1_Sub1_Sub5 local42 = Static75.method1431(Static12.aClass8_26, local7);
			@Pc(53) Class2_Sub1_Sub1_Sub5[] local53 = new Class2_Sub1_Sub1_Sub5[] { local34, local42 };
			local34 = new Class2_Sub1_Sub1_Sub5(local53, 2);
		}
		if (this.anIntArray300 != null) {
			for (@Pc(64) int local64 = 0; local64 < this.anIntArray300.length; local64++) {
				local34.method1404(this.anIntArray300[local64], this.anIntArray302[local64]);
			}
		}
		return local34;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILclient!ba;)V")
	private void method1636(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt2425 = arg1.method792();
		} else if (arg0 == 2) {
			this.aClass1_2571 = arg1.method787();
		} else if (arg0 == 4) {
			this.anInt2435 = arg1.method792();
		} else if (arg0 == 5) {
			this.anInt2460 = arg1.method792();
		} else if (arg0 == 6) {
			this.anInt2448 = arg1.method792();
		} else if (arg0 == 7) {
			this.anInt2426 = arg1.method792();
			if (this.anInt2426 > 32767) {
				this.anInt2426 -= 65536;
			}
		} else if (arg0 == 8) {
			this.anInt2430 = arg1.method792();
			if (this.anInt2430 > 32767) {
				this.anInt2430 -= 65536;
			}
		} else if (arg0 == 11) {
			this.anInt2419 = 1;
		} else if (arg0 == 12) {
			this.anInt2446 = arg1.method814();
		} else if (arg0 == 16) {
			this.aBoolean144 = true;
		} else if (arg0 == 23) {
			this.anInt2452 = arg1.method792();
			this.anInt2436 = arg1.method791();
		} else if (arg0 == 24) {
			this.anInt2438 = arg1.method792();
		} else if (arg0 == 25) {
			this.anInt2464 = arg1.method792();
			this.anInt2447 = arg1.method791();
		} else if (arg0 == 26) {
			this.anInt2437 = arg1.method792();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass1Array23[arg0 - 30] = arg1.method787();
			if (this.aClass1Array23[arg0 - 30].method14(Static98.aClass1_2627)) {
				this.aClass1Array23[arg0 - 30] = null;
			}
		} else if (arg0 >= 35 && arg0 < 40) {
			this.aClass1Array22[arg0 - 35] = arg1.method787();
		} else if (arg0 == 40) {
			@Pc(389) int local389 = arg1.method791();
			this.anIntArray302 = new int[local389];
			this.anIntArray300 = new int[local389];
			for (@Pc(399) int local399 = 0; local399 < local389; local399++) {
				this.anIntArray300[local399] = arg1.method792();
				this.anIntArray302[local399] = arg1.method792();
			}
		} else if (arg0 == 78) {
			this.anInt2442 = arg1.method792();
		} else if (arg0 == 79) {
			this.anInt2461 = arg1.method792();
		} else if (arg0 == 90) {
			this.anInt2422 = arg1.method792();
		} else if (arg0 == 91) {
			this.anInt2466 = arg1.method792();
		} else if (arg0 == 92) {
			this.anInt2457 = arg1.method792();
		} else if (arg0 == 93) {
			this.anInt2440 = arg1.method792();
		} else if (arg0 == 95) {
			this.anInt2445 = arg1.method792();
		} else if (arg0 == 97) {
			this.anInt2432 = arg1.method792();
		} else if (arg0 == 98) {
			this.anInt2427 = arg1.method792();
		} else if (arg0 >= 100 && arg0 < 110) {
			if (this.anIntArray303 == null) {
				this.anIntArray304 = new int[10];
				this.anIntArray303 = new int[10];
			}
			this.anIntArray303[arg0 - 100] = arg1.method792();
			this.anIntArray304[arg0 - 100] = arg1.method792();
		} else if (arg0 == 110) {
			this.anInt2433 = arg1.method792();
		} else if (arg0 == 111) {
			this.anInt2468 = arg1.method792();
		} else if (arg0 == 112) {
			this.anInt2450 = arg1.method792();
		} else if (arg0 == 113) {
			this.anInt2443 = arg1.method831();
		} else if (arg0 == 114) {
			this.anInt2456 = arg1.method831() * 5;
		} else if (arg0 == 115) {
			this.anInt2441 = arg1.method791();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ba;I)V")
	public void method1637(@OriginalArg(0) Class2_Sub3 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method791();
			if (local15 == 0) {
				return;
			}
			this.method1636(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ta;ZLclient!ta;)V")
	public void method1638(@OriginalArg(0) Class2_Sub1_Sub17 arg0, @OriginalArg(2) Class2_Sub1_Sub17 arg1) {
		this.anInt2460 = arg0.anInt2460;
		this.anInt2426 = arg0.anInt2426;
		this.anInt2445 = arg0.anInt2445;
		this.aClass1_2571 = arg1.aClass1_2571;
		this.anInt2446 = arg1.anInt2446;
		this.anInt2419 = 1;
		this.anInt2435 = arg0.anInt2435;
		this.aBoolean144 = arg1.aBoolean144;
		this.anIntArray302 = arg0.anIntArray302;
		this.anIntArray300 = arg0.anIntArray300;
		this.anInt2448 = arg0.anInt2448;
		this.anInt2430 = arg0.anInt2430;
		this.anInt2425 = arg0.anInt2425;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZII)Lclient!pa;")
	public Class2_Sub1_Sub1_Sub5 method1639(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(20) int local20;
		if (this.anIntArray303 != null && arg1 > 1) {
			@Pc(18) int local18 = -1;
			for (local20 = 0; local20 < 10; local20++) {
				if (arg1 >= this.anIntArray304[local20] && this.anIntArray304[local20] != 0) {
					local18 = this.anIntArray303[local20];
				}
			}
			if (local18 != -1) {
				return Static73.method1374(local18).method1639(arg0, 1);
			}
		}
		@Pc(68) Class2_Sub1_Sub1_Sub5 local68;
		if (arg0) {
			local68 = (Class2_Sub1_Sub1_Sub5) Static103.aClass11_26.method431((long) this.anInt2467);
			if (local68 != null) {
				return local68;
			}
		}
		local68 = Static75.method1431(Static12.aClass8_26, this.anInt2425);
		if (local68 == null) {
			return null;
		}
		if (this.anInt2433 != 128 || this.anInt2468 != 128 || this.anInt2450 != 128) {
			local68.method1422(this.anInt2433, this.anInt2468, this.anInt2450);
		}
		if (this.anIntArray300 != null) {
			for (local20 = 0; local20 < this.anIntArray300.length; local20++) {
				local68.method1404(this.anIntArray300[local20], this.anIntArray302[local20]);
			}
		}
		if (arg0) {
			local68.method1403(this.anInt2443 + 64, this.anInt2456 + 768, -50, -10, -50, true);
			local68.aBoolean111 = true;
			Static103.aClass11_26.method430((long) this.anInt2467, local68);
		}
		return local68;
	}
}
