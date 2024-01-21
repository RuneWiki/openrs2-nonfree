import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class10_Sub1_Sub15 extends Class10_Sub1 {

	@OriginalMember(owner = "client!ud", name = "T", descriptor = "I")
	private int anInt2513;

	@OriginalMember(owner = "client!ud", name = "X", descriptor = "[I")
	public int[] anIntArray329;

	@OriginalMember(owner = "client!ud", name = "ab", descriptor = "[I")
	public int[] anIntArray330;

	@OriginalMember(owner = "client!ud", name = "mb", descriptor = "[I")
	private int[] anIntArray331;

	@OriginalMember(owner = "client!ud", name = "pb", descriptor = "I")
	public int anInt2530;

	@OriginalMember(owner = "client!ud", name = "qb", descriptor = "[I")
	private int[] anIntArray332;

	@OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
	public int anInt2512 = 0;

	@OriginalMember(owner = "client!ud", name = "hb", descriptor = "I")
	public int anInt2524 = 0;

	@OriginalMember(owner = "client!ud", name = "R", descriptor = "Z")
	public boolean aBoolean116 = false;

	@OriginalMember(owner = "client!ud", name = "fb", descriptor = "I")
	private int anInt2522 = -1;

	@OriginalMember(owner = "client!ud", name = "rb", descriptor = "[Lclient!va;")
	public Class61[] aClass61Array13 = new Class61[] { null, null, Static50.aClass61_574, null, null };

	@OriginalMember(owner = "client!ud", name = "Y", descriptor = "Lclient!va;")
	public Class61 aClass61_1029 = Static9.aClass61_79;

	@OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
	public int anInt2510 = 0;

	@OriginalMember(owner = "client!ud", name = "ub", descriptor = "I")
	public int anInt2531 = 2000;

	@OriginalMember(owner = "client!ud", name = "db", descriptor = "I")
	private int anInt2520 = -1;

	@OriginalMember(owner = "client!ud", name = "wb", descriptor = "I")
	private int anInt2532 = 128;

	@OriginalMember(owner = "client!ud", name = "kb", descriptor = "I")
	private int anInt2526 = -1;

	@OriginalMember(owner = "client!ud", name = "ob", descriptor = "I")
	public int anInt2529 = 1;

	@OriginalMember(owner = "client!ud", name = "nb", descriptor = "I")
	public int anInt2528 = 0;

	@OriginalMember(owner = "client!ud", name = "Jb", descriptor = "I")
	public int anInt2541 = 0;

	@OriginalMember(owner = "client!ud", name = "Ab", descriptor = "I")
	private int anInt2535 = -1;

	@OriginalMember(owner = "client!ud", name = "bb", descriptor = "I")
	public int anInt2518 = -1;

	@OriginalMember(owner = "client!ud", name = "gb", descriptor = "I")
	public int anInt2523 = -1;

	@OriginalMember(owner = "client!ud", name = "sb", descriptor = "[Lclient!va;")
	public Class61[] aClass61Array14 = new Class61[] { null, null, null, null, Static94.aClass61_961 };

	@OriginalMember(owner = "client!ud", name = "ib", descriptor = "I")
	private int anInt2525 = -1;

	@OriginalMember(owner = "client!ud", name = "Z", descriptor = "I")
	private int anInt2517 = 128;

	@OriginalMember(owner = "client!ud", name = "Cb", descriptor = "I")
	private int anInt2537 = 0;

	@OriginalMember(owner = "client!ud", name = "Bb", descriptor = "I")
	private int anInt2536 = 0;

	@OriginalMember(owner = "client!ud", name = "Db", descriptor = "I")
	private int anInt2538 = -1;

	@OriginalMember(owner = "client!ud", name = "Rb", descriptor = "I")
	public int anInt2549 = 0;

	@OriginalMember(owner = "client!ud", name = "Pb", descriptor = "I")
	private int anInt2547 = -1;

	@OriginalMember(owner = "client!ud", name = "V", descriptor = "I")
	public int anInt2515 = 0;

	@OriginalMember(owner = "client!ud", name = "Mb", descriptor = "I")
	public int anInt2544 = 0;

	@OriginalMember(owner = "client!ud", name = "Lb", descriptor = "I")
	private int anInt2543 = -1;

	@OriginalMember(owner = "client!ud", name = "Qb", descriptor = "I")
	private int anInt2548 = -1;

	@OriginalMember(owner = "client!ud", name = "tb", descriptor = "Z")
	public boolean aBoolean118 = false;

	@OriginalMember(owner = "client!ud", name = "Wb", descriptor = "I")
	private int anInt2551 = -1;

	@OriginalMember(owner = "client!ud", name = "W", descriptor = "I")
	private int anInt2516 = 128;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ud;BLclient!ud;)V")
	public void method1571(@OriginalArg(0) Class10_Sub1_Sub15 arg0, @OriginalArg(2) Class10_Sub1_Sub15 arg1) {
		this.aBoolean118 = arg1.aBoolean118;
		this.anInt2528 = arg0.anInt2528;
		this.aClass61_1029 = arg1.aClass61_1029;
		this.anInt2513 = arg0.anInt2513;
		this.anInt2541 = arg0.anInt2541;
		this.anIntArray331 = arg0.anIntArray331;
		this.anInt2510 = arg0.anInt2510;
		this.anIntArray332 = arg0.anIntArray332;
		this.anInt2529 = arg1.anInt2529;
		this.aBoolean116 = true;
		this.anInt2531 = arg0.anInt2531;
		this.anInt2524 = arg0.anInt2524;
		this.anInt2515 = arg0.anInt2515;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!tc;B)V")
	public void method1573(@OriginalArg(0) Class10_Sub10 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1111();
			if (local15 == 0) {
				return;
			}
			this.method1579(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BZ)Z")
	public boolean method1574(@OriginalArg(1) boolean arg0) {
		@Pc(2) int local2 = this.anInt2525;
		@Pc(15) int local15 = this.anInt2520;
		if (arg0) {
			local15 = this.anInt2538;
			local2 = this.anInt2535;
		}
		if (local2 == -1) {
			return true;
		}
		@Pc(31) boolean local31 = true;
		if (!Static57.aClass11_40.method218(local2, 0)) {
			local31 = false;
		}
		if (local15 != -1 && !Static57.aClass11_40.method218(local15, 0)) {
			local31 = false;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(B)V")
	public void method1575() {
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)Z")
	public boolean method1577(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt2548;
		@Pc(15) int local15 = this.anInt2551;
		@Pc(18) int local18 = this.anInt2543;
		if (arg0) {
			local15 = this.anInt2547;
			local18 = this.anInt2522;
			local6 = this.anInt2526;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(36) boolean local36 = true;
		if (!Static57.aClass11_40.method218(local6, 0)) {
			local36 = false;
		}
		if (local18 != -1 && !Static57.aClass11_40.method218(local18, 0)) {
			local36 = false;
		}
		if (local15 != -1 && !Static57.aClass11_40.method218(local15, 0)) {
			local36 = false;
		}
		return local36;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IBZ)Lclient!rb;")
	public Class10_Sub1_Sub5_Sub4 method1578(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(25) int local25;
		if (this.anIntArray329 != null && arg0 > 1) {
			@Pc(23) int local23 = -1;
			for (local25 = 0; local25 < 10; local25++) {
				if (arg0 >= this.anIntArray330[local25] && this.anIntArray330[local25] != 0) {
					local23 = this.anIntArray329[local25];
				}
			}
			if (local23 != -1) {
				return Static94.method1491(local23).method1578(1, arg1);
			}
		}
		@Pc(77) Class10_Sub1_Sub5_Sub4 local77;
		if (arg1) {
			local77 = (Class10_Sub1_Sub5_Sub4) Static30.aClass29_25.method644((long) this.anInt2530);
			if (local77 != null) {
				return local77;
			}
		}
		local77 = Static84.method1335(Static57.aClass11_40, this.anInt2513);
		if (local77 == null) {
			return null;
		}
		if (this.anInt2516 != 128 || this.anInt2532 != 128 || this.anInt2517 != 128) {
			local77.method1316(this.anInt2516, this.anInt2532, this.anInt2517);
		}
		if (this.anIntArray331 != null) {
			for (local25 = 0; local25 < this.anIntArray331.length; local25++) {
				local77.method1328(this.anIntArray331[local25], this.anIntArray332[local25]);
			}
		}
		if (arg1) {
			local77.method1324(this.anInt2549 + 64, this.anInt2512 + 768, -50, -10, -50, true);
			local77.aBoolean98 = true;
			Static30.aClass29_25.method649(local77, (long) this.anInt2530);
		}
		return local77;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!tc;I)V")
	private void method1579(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub10 arg1) {
		if (arg0 == 1) {
			this.anInt2513 = arg1.method1160();
		} else if (arg0 == 2) {
			this.aClass61_1029 = arg1.method1151();
		} else if (arg0 == 4) {
			this.anInt2531 = arg1.method1160();
		} else if (arg0 == 5) {
			this.anInt2510 = arg1.method1160();
		} else if (arg0 == 6) {
			this.anInt2524 = arg1.method1160();
		} else if (arg0 == 7) {
			this.anInt2541 = arg1.method1160();
			if (this.anInt2541 > 32767) {
				this.anInt2541 -= 65536;
				return;
			}
		} else {
			if (arg0 == 8) {
				this.anInt2515 = arg1.method1160();
				if (this.anInt2515 > 32767) {
					this.anInt2515 -= 65536;
					return;
				}
			} else if (arg0 == 10) {
				arg1.method1160();
			} else if (arg0 == 11) {
				this.aBoolean116 = true;
				return;
			} else if (arg0 == 12) {
				this.anInt2529 = arg1.method1112();
				return;
			} else if (arg0 == 16) {
				this.aBoolean118 = true;
				return;
			} else if (arg0 == 23) {
				this.anInt2548 = arg1.method1160();
				this.anInt2537 = arg1.method1111();
				return;
			} else if (arg0 == 24) {
				this.anInt2543 = arg1.method1160();
				return;
			} else if (arg0 == 25) {
				this.anInt2526 = arg1.method1160();
				this.anInt2536 = arg1.method1111();
				return;
			} else {
				if (arg0 == 26) {
					this.anInt2522 = arg1.method1160();
				} else if (arg0 >= 30 && arg0 < 35) {
					this.aClass61Array13[arg0 - 30] = arg1.method1151();
					if (this.aClass61Array13[arg0 - 30].method1594(Static105.aClass61_1068)) {
						this.aClass61Array13[arg0 - 30] = null;
						return;
					}
				} else if (arg0 < 35 || arg0 >= 40) {
					if (arg0 != 40) {
						if (arg0 == 78) {
							this.anInt2551 = arg1.method1160();
							return;
						}
						if (arg0 != 79) {
							if (arg0 == 90) {
								this.anInt2525 = arg1.method1160();
								return;
							}
							if (arg0 == 91) {
								this.anInt2535 = arg1.method1160();
								return;
							}
							if (arg0 == 92) {
								this.anInt2520 = arg1.method1160();
								return;
							}
							if (arg0 != 93) {
								if (arg0 == 95) {
									this.anInt2528 = arg1.method1160();
									return;
								}
								if (arg0 == 97) {
									this.anInt2523 = arg1.method1160();
									return;
								}
								if (arg0 != 98) {
									if (arg0 >= 100 && arg0 < 110) {
										if (this.anIntArray329 == null) {
											this.anIntArray329 = new int[10];
											this.anIntArray330 = new int[10];
										}
										this.anIntArray329[arg0 - 100] = arg1.method1160();
										this.anIntArray330[arg0 - 100] = arg1.method1160();
										return;
									}
									if (arg0 == 110) {
										this.anInt2516 = arg1.method1160();
										return;
									}
									if (arg0 == 111) {
										this.anInt2532 = arg1.method1160();
										return;
									}
									if (arg0 != 112) {
										if (arg0 == 113) {
											this.anInt2549 = arg1.method1131();
											return;
										}
										if (arg0 == 114) {
											this.anInt2512 = arg1.method1131() * 5;
										} else if (arg0 == 115) {
											this.anInt2544 = arg1.method1111();
											return;
										}
										return;
									}
									this.anInt2517 = arg1.method1160();
									return;
								}
								this.anInt2518 = arg1.method1160();
								return;
							}
							this.anInt2538 = arg1.method1160();
							return;
						}
						this.anInt2547 = arg1.method1160();
						return;
					}
					@Pc(342) int local342 = arg1.method1111();
					this.anIntArray332 = new int[local342];
					this.anIntArray331 = new int[local342];
					for (@Pc(352) int local352 = 0; local352 < local342; local352++) {
						this.anIntArray331[local352] = arg1.method1160();
						this.anIntArray332[local352] = arg1.method1160();
					}
					return;
				} else {
					this.aClass61Array14[arg0 - 35] = arg1.method1151();
					return;
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZZ)Lclient!rb;")
	public Class10_Sub1_Sub5_Sub4 method1581(@OriginalArg(1) boolean arg0) {
		@Pc(4) int local4 = this.anInt2548;
		@Pc(19) int local19 = this.anInt2543;
		@Pc(22) int local22 = this.anInt2551;
		if (arg0) {
			local4 = this.anInt2526;
			local19 = this.anInt2522;
			local22 = this.anInt2547;
		}
		if (local4 == -1) {
			return null;
		}
		@Pc(44) Class10_Sub1_Sub5_Sub4 local44 = Static84.method1335(Static57.aClass11_40, local4);
		if (local19 != -1) {
			@Pc(52) Class10_Sub1_Sub5_Sub4 local52 = Static84.method1335(Static57.aClass11_40, local19);
			if (local22 == -1) {
				@Pc(94) Class10_Sub1_Sub5_Sub4[] local94 = new Class10_Sub1_Sub5_Sub4[] { local44, local52 };
				local44 = new Class10_Sub1_Sub5_Sub4(local94, 2);
			} else {
				@Pc(60) Class10_Sub1_Sub5_Sub4 local60 = Static84.method1335(Static57.aClass11_40, local22);
				@Pc(75) Class10_Sub1_Sub5_Sub4[] local75 = new Class10_Sub1_Sub5_Sub4[] { local44, local52, local60 };
				local44 = new Class10_Sub1_Sub5_Sub4(local75, 3);
			}
		}
		if (!arg0 && this.anInt2537 != 0) {
			local44.method1315(0, this.anInt2537, 0);
		}
		if (arg0 && this.anInt2536 != 0) {
			local44.method1315(0, this.anInt2536, 0);
		}
		if (this.anIntArray331 != null) {
			for (@Pc(127) int local127 = 0; local127 < this.anIntArray331.length; local127++) {
				local44.method1328(this.anIntArray331[local127], this.anIntArray332[local127]);
			}
		}
		return local44;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)Lclient!rb;")
	public Class10_Sub1_Sub5_Sub4 method1583(@OriginalArg(0) boolean arg0) {
		@Pc(4) int local4 = this.anInt2525;
		@Pc(7) int local7 = this.anInt2520;
		if (arg0) {
			local4 = this.anInt2535;
			local7 = this.anInt2538;
		}
		if (local4 == -1) {
			return null;
		}
		@Pc(37) Class10_Sub1_Sub5_Sub4 local37 = Static84.method1335(Static57.aClass11_40, local4);
		if (local7 != -1) {
			@Pc(46) Class10_Sub1_Sub5_Sub4 local46 = Static84.method1335(Static57.aClass11_40, local7);
			@Pc(57) Class10_Sub1_Sub5_Sub4[] local57 = new Class10_Sub1_Sub5_Sub4[] { local37, local46 };
			local37 = new Class10_Sub1_Sub5_Sub4(local57, 2);
		}
		if (this.anIntArray331 != null) {
			for (@Pc(68) int local68 = 0; local68 < this.anIntArray331.length; local68++) {
				local37.method1328(this.anIntArray331[local68], this.anIntArray332[local68]);
			}
		}
		return local37;
	}
}
