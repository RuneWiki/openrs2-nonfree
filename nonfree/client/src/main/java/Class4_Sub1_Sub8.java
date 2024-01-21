import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class4_Sub1_Sub8 extends Class4_Sub1 {

	@OriginalMember(owner = "client!j", name = "I", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!j", name = "N", descriptor = "[I")
	public int[] anIntArray143;

	@OriginalMember(owner = "client!j", name = "T", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!j", name = "ob", descriptor = "I")
	public int anInt1456;

	@OriginalMember(owner = "client!j", name = "wb", descriptor = "I")
	private int anInt1463;

	@OriginalMember(owner = "client!j", name = "Bb", descriptor = "[I")
	public int[] anIntArray145;

	@OriginalMember(owner = "client!j", name = "Kb", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!j", name = "Ub", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!j", name = "J", descriptor = "I")
	private int anInt1431 = -1;

	@OriginalMember(owner = "client!j", name = "P", descriptor = "I")
	public int anInt1436 = 0;

	@OriginalMember(owner = "client!j", name = "Z", descriptor = "I")
	public int anInt1445 = 0;

	@OriginalMember(owner = "client!j", name = "Y", descriptor = "I")
	public int anInt1444 = 0;

	@OriginalMember(owner = "client!j", name = "K", descriptor = "I")
	private int anInt1432 = 128;

	@OriginalMember(owner = "client!j", name = "hb", descriptor = "Z")
	public boolean aBoolean140 = false;

	@OriginalMember(owner = "client!j", name = "rb", descriptor = "I")
	private int anInt1459 = 128;

	@OriginalMember(owner = "client!j", name = "ab", descriptor = "I")
	private int anInt1446 = -1;

	@OriginalMember(owner = "client!j", name = "U", descriptor = "I")
	private int anInt1440 = 0;

	@OriginalMember(owner = "client!j", name = "Ab", descriptor = "I")
	public int anInt1466 = -1;

	@OriginalMember(owner = "client!j", name = "gb", descriptor = "I")
	public int anInt1449 = 2000;

	@OriginalMember(owner = "client!j", name = "ub", descriptor = "I")
	private int anInt1462 = -1;

	@OriginalMember(owner = "client!j", name = "M", descriptor = "I")
	private int anInt1434 = 128;

	@OriginalMember(owner = "client!j", name = "db", descriptor = "I")
	public int anInt1448 = -1;

	@OriginalMember(owner = "client!j", name = "Fb", descriptor = "I")
	public int anInt1469 = 0;

	@OriginalMember(owner = "client!j", name = "V", descriptor = "I")
	private int anInt1441 = -1;

	@OriginalMember(owner = "client!j", name = "pb", descriptor = "I")
	private int anInt1457 = -1;

	@OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
	public int anInt1437 = 1;

	@OriginalMember(owner = "client!j", name = "Nb", descriptor = "I")
	private int anInt1475 = -1;

	@OriginalMember(owner = "client!j", name = "Ob", descriptor = "I")
	public int anInt1476 = 0;

	@OriginalMember(owner = "client!j", name = "zb", descriptor = "[Lclient!ec;")
	public Class22[] aClass22Array11 = new Class22[] { null, null, Static24.aClass22_163, null, null };

	@OriginalMember(owner = "client!j", name = "Gb", descriptor = "I")
	private int anInt1470 = -1;

	@OriginalMember(owner = "client!j", name = "Jb", descriptor = "I")
	private int anInt1472 = -1;

	@OriginalMember(owner = "client!j", name = "Db", descriptor = "I")
	private int anInt1467 = -1;

	@OriginalMember(owner = "client!j", name = "W", descriptor = "I")
	public int anInt1442 = 0;

	@OriginalMember(owner = "client!j", name = "kb", descriptor = "I")
	private int anInt1452 = -1;

	@OriginalMember(owner = "client!j", name = "R", descriptor = "I")
	public int anInt1438 = 0;

	@OriginalMember(owner = "client!j", name = "yb", descriptor = "I")
	public int anInt1465 = 0;

	@OriginalMember(owner = "client!j", name = "Rb", descriptor = "[Lclient!ec;")
	public Class22[] aClass22Array12 = new Class22[] { null, null, null, null, Static96.aClass22_716 };

	@OriginalMember(owner = "client!j", name = "Sb", descriptor = "Lclient!ec;")
	public Class22 aClass22_359 = Static88.aClass22_675;

	@OriginalMember(owner = "client!j", name = "Tb", descriptor = "I")
	private int anInt1478 = 0;

	@OriginalMember(owner = "client!j", name = "Pb", descriptor = "I")
	public int anInt1477 = 0;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BZ)Z")
	public boolean method980(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt1462;
		@Pc(9) int local9 = this.anInt1452;
		if (arg0) {
			local9 = this.anInt1431;
			local6 = this.anInt1475;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(24) boolean local24 = true;
		if (!Static29.aClass20_15.method604(local6, 0)) {
			local24 = false;
		}
		if (local9 != -1 && !Static29.aClass20_15.method604(local9, 0)) {
			local24 = false;
		}
		return local24;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(IZ)Lclient!p;")
	public Class4_Sub1_Sub3_Sub4 method982(@OriginalArg(1) boolean arg0) {
		@Pc(13) int local13 = this.anInt1446;
		@Pc(16) int local16 = this.anInt1470;
		@Pc(19) int local19 = this.anInt1441;
		if (arg0) {
			local16 = this.anInt1467;
			local19 = this.anInt1472;
			local13 = this.anInt1457;
		}
		if (local13 == -1) {
			return null;
		}
		@Pc(41) Class4_Sub1_Sub3_Sub4 local41 = Static86.method1524(Static29.aClass20_15, local13);
		if (local16 != -1) {
			@Pc(49) Class4_Sub1_Sub3_Sub4 local49 = Static86.method1524(Static29.aClass20_15, local16);
			if (local19 == -1) {
				@Pc(91) Class4_Sub1_Sub3_Sub4[] local91 = new Class4_Sub1_Sub3_Sub4[] { local41, local49 };
				local41 = new Class4_Sub1_Sub3_Sub4(local91, 2);
			} else {
				@Pc(57) Class4_Sub1_Sub3_Sub4 local57 = Static86.method1524(Static29.aClass20_15, local19);
				@Pc(72) Class4_Sub1_Sub3_Sub4[] local72 = new Class4_Sub1_Sub3_Sub4[] { local41, local49, local57 };
				local41 = new Class4_Sub1_Sub3_Sub4(local72, 3);
			}
		}
		if (!arg0 && this.anInt1478 != 0) {
			local41.method1518(0, this.anInt1478, 0);
		}
		if (arg0 && this.anInt1440 != 0) {
			local41.method1518(0, this.anInt1440, 0);
		}
		@Pc(124) int local124;
		if (this.aShortArray11 != null) {
			for (local124 = 0; local124 < this.aShortArray11.length; local124++) {
				local41.method1517(this.aShortArray11[local124], this.aShortArray12[local124]);
			}
		}
		if (this.aShortArray10 != null) {
			for (local124 = 0; local124 < this.aShortArray10.length; local124++) {
				local41.method1537(this.aShortArray10[local124], this.aShortArray9[local124]);
			}
		}
		return local41;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(II)Lclient!od;")
	public Class4_Sub1_Sub3_Sub3 method983(@OriginalArg(0) int arg0) {
		if (this.anIntArray145 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (this.anIntArray143[local15] <= arg0 && this.anIntArray143[local15] != 0) {
					local13 = this.anIntArray145[local15];
				}
			}
			if (local13 != -1) {
				return Static123.method2000(local13).method983(1);
			}
		}
		@Pc(58) Class4_Sub1_Sub3_Sub3 local58 = (Class4_Sub1_Sub3_Sub3) Static42.aClass33_13.method998((long) this.anInt1456);
		if (local58 != null) {
			return local58;
		}
		@Pc(68) Class4_Sub1_Sub3_Sub4 local68 = Static86.method1524(Static29.aClass20_15, this.anInt1463);
		if (local68 == null) {
			return null;
		}
		if (this.anInt1434 != 128 || this.anInt1459 != 128 || this.anInt1432 != 128) {
			local68.method1539(this.anInt1434, this.anInt1459, this.anInt1432);
		}
		@Pc(99) int local99;
		if (this.aShortArray11 != null) {
			for (local99 = 0; local99 < this.aShortArray11.length; local99++) {
				local68.method1517(this.aShortArray11[local99], this.aShortArray12[local99]);
			}
		}
		if (this.aShortArray10 != null) {
			for (local99 = 0; local99 < this.aShortArray10.length; local99++) {
				local68.method1537(this.aShortArray10[local99], this.aShortArray9[local99]);
			}
		}
		local58 = local68.method1531(this.anInt1442 + 64, 768 - -this.anInt1444, -50, -10, -50);
		local58.aBoolean199 = true;
		Static42.aClass33_13.method997((long) this.anInt1456, local58);
		return local58;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BI)Lclient!j;")
	public Class4_Sub1_Sub8 method984(@OriginalArg(1) int arg0) {
		if (this.anIntArray145 != null && arg0 > 1) {
			@Pc(18) int local18 = -1;
			for (@Pc(20) int local20 = 0; local20 < 10; local20++) {
				if (arg0 >= this.anIntArray143[local20] && this.anIntArray143[local20] != 0) {
					local18 = this.anIntArray145[local20];
				}
			}
			if (local18 != -1) {
				return Static123.method2000(local18);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
	public void method985() {
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(IZ)Lclient!p;")
	public Class4_Sub1_Sub3_Sub4 method986(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt1462;
		@Pc(11) int local11 = this.anInt1452;
		if (arg0) {
			local11 = this.anInt1431;
			local8 = this.anInt1475;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(29) Class4_Sub1_Sub3_Sub4 local29 = Static86.method1524(Static29.aClass20_15, local8);
		if (local11 != -1) {
			@Pc(37) Class4_Sub1_Sub3_Sub4 local37 = Static86.method1524(Static29.aClass20_15, local11);
			@Pc(48) Class4_Sub1_Sub3_Sub4[] local48 = new Class4_Sub1_Sub3_Sub4[] { local29, local37 };
			local29 = new Class4_Sub1_Sub3_Sub4(local48, 2);
		}
		@Pc(59) int local59;
		if (this.aShortArray11 != null) {
			for (local59 = 0; local59 < this.aShortArray11.length; local59++) {
				local29.method1517(this.aShortArray11[local59], this.aShortArray12[local59]);
			}
		}
		if (this.aShortArray10 != null) {
			for (local59 = 0; local59 < this.aShortArray10.length; local59++) {
				local29.method1537(this.aShortArray10[local59], this.aShortArray9[local59]);
			}
		}
		return local29;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!jd;I)V")
	public void method988(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method719();
			if (local5 == 0) {
				return;
			}
			this.method990(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BLclient!jd;I)V")
	private void method990(@OriginalArg(1) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1463 = arg0.method718();
		} else if (arg1 == 2) {
			this.aClass22_359 = arg0.method742();
		} else if (arg1 == 4) {
			this.anInt1449 = arg0.method718();
		} else if (arg1 == 5) {
			this.anInt1477 = arg0.method718();
		} else if (arg1 == 6) {
			this.anInt1469 = arg0.method718();
		} else if (arg1 == 7) {
			this.anInt1445 = arg0.method718();
			if (this.anInt1445 > 32767) {
				this.anInt1445 -= 65536;
				return;
			}
		} else if (arg1 == 8) {
			this.anInt1438 = arg0.method718();
			if (this.anInt1438 > 32767) {
				this.anInt1438 -= 65536;
				return;
			}
		} else if (arg1 == 11) {
			this.anInt1465 = 1;
			return;
		} else if (arg1 == 12) {
			this.anInt1437 = arg0.method725();
		} else if (arg1 == 16) {
			this.aBoolean140 = true;
			return;
		} else if (arg1 == 23) {
			this.anInt1446 = arg0.method718();
			this.anInt1478 = arg0.method719();
			return;
		} else if (arg1 == 24) {
			this.anInt1470 = arg0.method718();
			return;
		} else {
			if (arg1 == 25) {
				this.anInt1457 = arg0.method718();
				this.anInt1440 = arg0.method719();
			} else if (arg1 == 26) {
				this.anInt1467 = arg0.method718();
				return;
			} else if (arg1 >= 30 && arg1 < 35) {
				this.aClass22Array11[arg1 - 30] = arg0.method742();
				if (this.aClass22Array11[arg1 - 30].method480(Static134.aClass22_978)) {
					this.aClass22Array11[arg1 - 30] = null;
					return;
				}
			} else if (arg1 < 35 || arg1 >= 40) {
				@Pc(170) int local170;
				@Pc(180) int local180;
				if (arg1 != 40) {
					if (arg1 != 41) {
						if (arg1 == 78) {
							this.anInt1441 = arg0.method718();
							return;
						}
						if (arg1 != 79) {
							if (arg1 != 90) {
								if (arg1 == 91) {
									this.anInt1475 = arg0.method718();
									return;
								}
								if (arg1 == 92) {
									this.anInt1452 = arg0.method718();
									return;
								}
								if (arg1 == 93) {
									this.anInt1431 = arg0.method718();
									return;
								}
								if (arg1 == 95) {
									this.anInt1436 = arg0.method718();
									return;
								}
								if (arg1 != 97) {
									if (arg1 == 98) {
										this.anInt1448 = arg0.method718();
										return;
									}
									if (arg1 >= 100 && arg1 < 110) {
										if (this.anIntArray145 == null) {
											this.anIntArray143 = new int[10];
											this.anIntArray145 = new int[10];
										}
										this.anIntArray145[arg1 - 100] = arg0.method718();
										this.anIntArray143[arg1 - 100] = arg0.method718();
										return;
									}
									if (arg1 == 110) {
										this.anInt1434 = arg0.method718();
										return;
									}
									if (arg1 == 111) {
										this.anInt1459 = arg0.method718();
										return;
									}
									if (arg1 != 112) {
										if (arg1 == 113) {
											this.anInt1442 = arg0.method731();
											return;
										}
										if (arg1 == 114) {
											this.anInt1444 = arg0.method731() * 5;
										} else if (arg1 == 115) {
											this.anInt1476 = arg0.method719();
											return;
										}
										return;
									}
									this.anInt1432 = arg0.method718();
									return;
								}
								this.anInt1466 = arg0.method718();
								return;
							}
							this.anInt1462 = arg0.method718();
							return;
						}
						this.anInt1472 = arg0.method718();
						return;
					}
					local170 = arg0.method719();
					this.aShortArray9 = new short[local170];
					this.aShortArray10 = new short[local170];
					for (local180 = 0; local180 < local170; local180++) {
						this.aShortArray10[local180] = (short) arg0.method718();
						this.aShortArray9[local180] = (short) arg0.method718();
					}
					return;
				}
				local170 = arg0.method719();
				this.aShortArray12 = new short[local170];
				this.aShortArray11 = new short[local170];
				for (local180 = 0; local180 < local170; local180++) {
					this.aShortArray11[local180] = (short) arg0.method718();
					this.aShortArray12[local180] = (short) arg0.method718();
				}
				return;
			} else {
				this.aClass22Array12[arg1 - 35] = arg0.method742();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZI)Z")
	public boolean method992(@OriginalArg(0) boolean arg0) {
		@Pc(11) int local11 = this.anInt1446;
		@Pc(14) int local14 = this.anInt1470;
		@Pc(17) int local17 = this.anInt1441;
		if (arg0) {
			local17 = this.anInt1472;
			local14 = this.anInt1467;
			local11 = this.anInt1457;
		}
		if (local11 == -1) {
			return true;
		}
		@Pc(35) boolean local35 = true;
		if (!Static29.aClass20_15.method604(local11, 0)) {
			local35 = false;
		}
		if (local14 != -1 && !Static29.aClass20_15.method604(local14, 0)) {
			local35 = false;
		}
		if (local17 != -1 && !Static29.aClass20_15.method604(local17, 0)) {
			local35 = false;
		}
		return local35;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!j;Lclient!j;I)V")
	public void method994(@OriginalArg(0) Class4_Sub1_Sub8 arg0, @OriginalArg(1) Class4_Sub1_Sub8 arg1) {
		this.anInt1436 = arg1.anInt1436;
		this.aShortArray11 = arg1.aShortArray11;
		this.anInt1437 = arg0.anInt1437;
		this.aBoolean140 = arg0.aBoolean140;
		this.aClass22_359 = arg0.aClass22_359;
		this.aShortArray10 = arg1.aShortArray10;
		this.anInt1465 = 1;
		this.anInt1438 = arg1.anInt1438;
		this.anInt1463 = arg1.anInt1463;
		this.anInt1449 = arg1.anInt1449;
		this.anInt1469 = arg1.anInt1469;
		this.anInt1477 = arg1.anInt1477;
		this.aShortArray12 = arg1.aShortArray12;
		this.aShortArray9 = arg1.aShortArray9;
		this.anInt1445 = arg1.anInt1445;
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(II)Lclient!p;")
	public Class4_Sub1_Sub3_Sub4 method995(@OriginalArg(0) int arg0) {
		@Pc(23) int local23;
		if (this.anIntArray145 != null && arg0 > 1) {
			@Pc(21) int local21 = -1;
			for (local23 = 0; local23 < 10; local23++) {
				if (arg0 >= this.anIntArray143[local23] && this.anIntArray143[local23] != 0) {
					local21 = this.anIntArray145[local23];
				}
			}
			if (local21 != -1) {
				return Static123.method2000(local21).method995(1);
			}
		}
		@Pc(65) Class4_Sub1_Sub3_Sub4 local65 = Static86.method1524(Static29.aClass20_15, this.anInt1463);
		if (local65 == null) {
			return null;
		}
		if (this.anInt1434 != 128 || this.anInt1459 != 128 || this.anInt1432 != 128) {
			local65.method1539(this.anInt1434, this.anInt1459, this.anInt1432);
		}
		if (this.aShortArray11 != null) {
			for (local23 = 0; local23 < this.aShortArray11.length; local23++) {
				local65.method1517(this.aShortArray11[local23], this.aShortArray12[local23]);
			}
		}
		if (this.aShortArray10 != null) {
			for (local23 = 0; local23 < this.aShortArray10.length; local23++) {
				local65.method1537(this.aShortArray10[local23], this.aShortArray9[local23]);
			}
		}
		return local65;
	}
}
