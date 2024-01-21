import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class2_Sub1_Sub13 extends Class2_Sub1 {

	@OriginalMember(owner = "client!sc", name = "hb", descriptor = "I")
	private int anInt2457;

	@OriginalMember(owner = "client!sc", name = "wb", descriptor = "Lclient!lc;")
	public Class31 aClass31_856;

	@OriginalMember(owner = "client!sc", name = "Kb", descriptor = "[I")
	private int[] anIntArray347;

	@OriginalMember(owner = "client!sc", name = "Qb", descriptor = "I")
	public int anInt2481;

	@OriginalMember(owner = "client!sc", name = "Rb", descriptor = "[I")
	public int[] anIntArray348;

	@OriginalMember(owner = "client!sc", name = "fc", descriptor = "[I")
	private int[] anIntArray350;

	@OriginalMember(owner = "client!sc", name = "gc", descriptor = "[I")
	public int[] anIntArray351;

	@OriginalMember(owner = "client!sc", name = "ab", descriptor = "I")
	public int anInt2450 = -1;

	@OriginalMember(owner = "client!sc", name = "jb", descriptor = "I")
	public int anInt2458 = 0;

	@OriginalMember(owner = "client!sc", name = "Ab", descriptor = "I")
	private int anInt2469 = -1;

	@OriginalMember(owner = "client!sc", name = "lb", descriptor = "I")
	private int anInt2459 = 0;

	@OriginalMember(owner = "client!sc", name = "Eb", descriptor = "I")
	private int anInt2473 = 0;

	@OriginalMember(owner = "client!sc", name = "rb", descriptor = "I")
	private int anInt2463 = -1;

	@OriginalMember(owner = "client!sc", name = "ib", descriptor = "[Lclient!lc;")
	public Class31[] aClass31Array11 = new Class31[] { null, null, null, null, Static58.aClass31_683 };

	@OriginalMember(owner = "client!sc", name = "Ib", descriptor = "I")
	public int anInt2476 = 0;

	@OriginalMember(owner = "client!sc", name = "Pb", descriptor = "I")
	public int anInt2480 = 0;

	@OriginalMember(owner = "client!sc", name = "mb", descriptor = "I")
	private int anInt2460 = 128;

	@OriginalMember(owner = "client!sc", name = "U", descriptor = "Z")
	public boolean aBoolean126 = false;

	@OriginalMember(owner = "client!sc", name = "Db", descriptor = "I")
	private int anInt2472 = -1;

	@OriginalMember(owner = "client!sc", name = "sb", descriptor = "I")
	public int anInt2464 = 0;

	@OriginalMember(owner = "client!sc", name = "qb", descriptor = "Z")
	public boolean aBoolean128 = false;

	@OriginalMember(owner = "client!sc", name = "gb", descriptor = "I")
	private int anInt2456 = -1;

	@OriginalMember(owner = "client!sc", name = "Cb", descriptor = "I")
	private int anInt2471 = -1;

	@OriginalMember(owner = "client!sc", name = "nb", descriptor = "I")
	public int anInt2461 = -1;

	@OriginalMember(owner = "client!sc", name = "Sb", descriptor = "I")
	public int anInt2482 = 2000;

	@OriginalMember(owner = "client!sc", name = "pb", descriptor = "I")
	public int anInt2462 = 1;

	@OriginalMember(owner = "client!sc", name = "ac", descriptor = "I")
	private int anInt2485 = -1;

	@OriginalMember(owner = "client!sc", name = "Fb", descriptor = "I")
	private int anInt2474 = -1;

	@OriginalMember(owner = "client!sc", name = "tb", descriptor = "I")
	private int anInt2465 = -1;

	@OriginalMember(owner = "client!sc", name = "Z", descriptor = "I")
	public int anInt2449 = 0;

	@OriginalMember(owner = "client!sc", name = "ec", descriptor = "I")
	public int anInt2488 = 0;

	@OriginalMember(owner = "client!sc", name = "Nb", descriptor = "[Lclient!lc;")
	public Class31[] aClass31Array12 = new Class31[] { null, null, Static68.aClass31_766, null, null };

	@OriginalMember(owner = "client!sc", name = "Mb", descriptor = "I")
	public int anInt2478 = 0;

	@OriginalMember(owner = "client!sc", name = "Yb", descriptor = "Lclient!lc;")
	public Class31 aClass31_861 = Static54.aClass31_647;

	@OriginalMember(owner = "client!sc", name = "Bb", descriptor = "I")
	private int anInt2470 = 128;

	@OriginalMember(owner = "client!sc", name = "hc", descriptor = "I")
	private int anInt2489 = -1;

	@OriginalMember(owner = "client!sc", name = "jc", descriptor = "I")
	public int anInt2491 = 0;

	@OriginalMember(owner = "client!sc", name = "ic", descriptor = "I")
	private int anInt2490 = 128;

	@OriginalMember(owner = "client!sc", name = "kc", descriptor = "I")
	private int anInt2492 = -1;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZZ)Z")
	public boolean method1536(@OriginalArg(1) boolean arg0) {
		@Pc(2) int local2 = this.anInt2456;
		@Pc(9) int local9 = this.anInt2465;
		@Pc(12) int local12 = this.anInt2471;
		if (arg0) {
			local12 = this.anInt2485;
			local9 = this.anInt2492;
			local2 = this.anInt2474;
		}
		if (local9 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static91.aClass11_23.method347(0, local9)) {
			local30 = false;
		}
		if (local2 != -1 && !Static91.aClass11_23.method347(0, local2)) {
			local30 = false;
		}
		if (local12 != -1 && !Static91.aClass11_23.method347(0, local12)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!pd;)V")
	public void method1538(@OriginalArg(1) Class2_Sub6 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method665();
			if (local9 == 0) {
				return;
			}
			this.method1539(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!pd;I)V")
	private void method1539(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub6 arg1) {
		if (arg0 == 1) {
			this.anInt2457 = arg1.method627();
		} else if (arg0 == 2) {
			this.aClass31_861 = arg1.method670();
		} else if (arg0 == 3) {
			this.aClass31_856 = arg1.method670();
		} else if (arg0 == 4) {
			this.anInt2482 = arg1.method627();
		} else if (arg0 == 5) {
			this.anInt2478 = arg1.method627();
		} else if (arg0 == 6) {
			this.anInt2491 = arg1.method627();
		} else if (arg0 == 7) {
			this.anInt2458 = arg1.method627();
			if (this.anInt2458 > 32767) {
				this.anInt2458 -= 65536;
				return;
			}
		} else if (arg0 == 8) {
			this.anInt2464 = arg1.method627();
			if (this.anInt2464 > 32767) {
				this.anInt2464 -= 65536;
				return;
			}
		} else if (arg0 == 10) {
			arg1.method627();
			return;
		} else if (arg0 == 11) {
			this.aBoolean128 = true;
		} else if (arg0 == 16) {
			this.aBoolean126 = true;
			return;
		} else if (arg0 == 23) {
			this.anInt2465 = arg1.method627();
			this.anInt2459 = arg1.method665();
			return;
		} else if (arg0 == 24) {
			this.anInt2456 = arg1.method627();
			return;
		} else if (arg0 == 25) {
			this.anInt2492 = arg1.method627();
			this.anInt2473 = arg1.method665();
			return;
		} else if (arg0 == 26) {
			this.anInt2474 = arg1.method627();
			return;
		} else {
			if (arg0 >= 30 && arg0 < 35) {
				this.aClass31Array12[arg0 - 30] = arg1.method670();
				if (this.aClass31Array12[arg0 - 30].method1210(Static19.aClass31_284)) {
					this.aClass31Array12[arg0 - 30] = null;
					return;
				}
			} else if (arg0 < 35 || arg0 >= 40) {
				if (arg0 != 40) {
					if (arg0 != 78) {
						if (arg0 != 79) {
							if (arg0 != 90) {
								if (arg0 == 91) {
									this.anInt2469 = arg1.method627();
									return;
								}
								if (arg0 != 92) {
									if (arg0 != 93) {
										if (arg0 == 95) {
											this.anInt2480 = arg1.method627();
											return;
										}
										if (arg0 != 97) {
											if (arg0 == 98) {
												this.anInt2461 = arg1.method627();
												return;
											}
											if (arg0 >= 100 && arg0 < 110) {
												if (this.anIntArray351 == null) {
													this.anIntArray351 = new int[10];
													this.anIntArray348 = new int[10];
												}
												this.anIntArray351[arg0 - 100] = arg1.method627();
												this.anIntArray348[arg0 - 100] = arg1.method627();
												return;
											}
											if (arg0 != 110) {
												if (arg0 == 111) {
													this.anInt2490 = arg1.method627();
													return;
												}
												if (arg0 != 112) {
													if (arg0 == 113) {
														this.anInt2488 = arg1.method673();
														return;
													}
													if (arg0 == 114) {
														this.anInt2449 = arg1.method673() * 5;
													} else if (arg0 == 115) {
														this.anInt2476 = arg1.method665();
														return;
													}
													return;
												}
												this.anInt2470 = arg1.method627();
												return;
											}
											this.anInt2460 = arg1.method627();
											return;
										}
										this.anInt2450 = arg1.method627();
										return;
									}
									this.anInt2472 = arg1.method627();
									return;
								}
								this.anInt2463 = arg1.method627();
								return;
							}
							this.anInt2489 = arg1.method627();
							return;
						}
						this.anInt2485 = arg1.method627();
						return;
					}
					this.anInt2471 = arg1.method627();
					return;
				}
				@Pc(370) int local370 = arg1.method665();
				this.anIntArray347 = new int[local370];
				this.anIntArray350 = new int[local370];
				for (@Pc(380) int local380 = 0; local380 < local370; local380++) {
					this.anIntArray347[local380] = arg1.method627();
					this.anIntArray350[local380] = arg1.method627();
				}
			} else {
				this.aClass31Array11[arg0 - 35] = arg1.method670();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZB)Z")
	public boolean method1540(@OriginalArg(0) boolean arg0) {
		@Pc(15) int local15 = this.anInt2489;
		@Pc(18) int local18 = this.anInt2463;
		if (arg0) {
			local18 = this.anInt2472;
			local15 = this.anInt2469;
		}
		if (local15 == -1) {
			return true;
		}
		@Pc(34) boolean local34 = true;
		if (!Static91.aClass11_23.method347(0, local15)) {
			local34 = false;
		}
		if (local18 != -1 && !Static91.aClass11_23.method347(0, local18)) {
			local34 = false;
		}
		return local34;
	}

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)V")
	public void method1545() {
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIZ)Lclient!hb;")
	public Class2_Sub1_Sub4_Sub5 method1546(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) int local17;
		if (this.anIntArray351 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (local17 = 0; local17 < 10; local17++) {
				if (arg0 >= this.anIntArray348[local17] && this.anIntArray348[local17] != 0) {
					local15 = this.anIntArray351[local17];
				}
			}
			if (local15 != -1) {
				return Static7.method178(local15).method1546(1, arg1);
			}
		}
		@Pc(69) Class2_Sub1_Sub4_Sub5 local69;
		if (arg1) {
			local69 = (Class2_Sub1_Sub4_Sub5) Static49.aClass17_97.method786((long) this.anInt2481);
			if (local69 != null) {
				return local69;
			}
		}
		local69 = Static35.method896(Static91.aClass11_23, this.anInt2457);
		if (local69 == null) {
			return null;
		}
		if (this.anInt2460 != 128 || this.anInt2490 != 128 || this.anInt2470 != 128) {
			local69.method895(this.anInt2460, this.anInt2490, this.anInt2470);
		}
		if (this.anIntArray347 != null) {
			for (local17 = 0; local17 < this.anIntArray347.length; local17++) {
				local69.method924(this.anIntArray347[local17], this.anIntArray350[local17]);
			}
		}
		if (arg1) {
			local69.method904(this.anInt2488 + 64, this.anInt2449 + 768, -50, -10, -50, true);
			local69.aBoolean74 = true;
			Static49.aClass17_97.method783(local69, (long) this.anInt2481);
		}
		return local69;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!sc;BLclient!sc;)V")
	public void method1549(@OriginalArg(0) Class2_Sub1_Sub13 arg0, @OriginalArg(2) Class2_Sub1_Sub13 arg1) {
		this.anInt2457 = arg0.anInt2457;
		this.anIntArray347 = arg0.anIntArray347;
		this.anInt2464 = arg0.anInt2464;
		this.anInt2458 = arg0.anInt2458;
		this.anInt2462 = arg1.anInt2462;
		this.anInt2480 = arg0.anInt2480;
		this.aBoolean128 = true;
		this.aClass31_856 = Static65.aClass31_757;
		this.anInt2478 = arg0.anInt2478;
		this.aBoolean126 = arg1.aBoolean126;
		this.anInt2482 = arg0.anInt2482;
		this.anInt2491 = arg0.anInt2491;
		this.aClass31_861 = arg1.aClass31_861;
		this.anIntArray350 = arg0.anIntArray350;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)Lclient!hb;")
	public Class2_Sub1_Sub4_Sub5 method1550(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt2465;
		@Pc(11) int local11 = this.anInt2471;
		@Pc(14) int local14 = this.anInt2456;
		if (arg0) {
			local8 = this.anInt2492;
			local14 = this.anInt2474;
			local11 = this.anInt2485;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(35) Class2_Sub1_Sub4_Sub5 local35 = Static35.method896(Static91.aClass11_23, local8);
		if (local14 != -1) {
			@Pc(43) Class2_Sub1_Sub4_Sub5 local43 = Static35.method896(Static91.aClass11_23, local14);
			if (local11 == -1) {
				@Pc(58) Class2_Sub1_Sub4_Sub5[] local58 = new Class2_Sub1_Sub4_Sub5[] { local35, local43 };
				local35 = new Class2_Sub1_Sub4_Sub5(local58, 2);
			} else {
				@Pc(71) Class2_Sub1_Sub4_Sub5 local71 = Static35.method896(Static91.aClass11_23, local11);
				@Pc(86) Class2_Sub1_Sub4_Sub5[] local86 = new Class2_Sub1_Sub4_Sub5[] { local35, local43, local71 };
				local35 = new Class2_Sub1_Sub4_Sub5(local86, 3);
			}
		}
		if (!arg0 && this.anInt2459 != 0) {
			local35.method922(0, this.anInt2459, 0);
		}
		if (arg0 && this.anInt2473 != 0) {
			local35.method922(0, this.anInt2473, 0);
		}
		if (this.anIntArray347 != null) {
			for (@Pc(125) int local125 = 0; local125 < this.anIntArray347.length; local125++) {
				local35.method924(this.anIntArray347[local125], this.anIntArray350[local125]);
			}
		}
		return local35;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZI)Lclient!hb;")
	public Class2_Sub1_Sub4_Sub5 method1551(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt2489;
		@Pc(11) int local11 = this.anInt2463;
		if (arg0) {
			local8 = this.anInt2469;
			local11 = this.anInt2472;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(30) Class2_Sub1_Sub4_Sub5 local30 = Static35.method896(Static91.aClass11_23, local8);
		if (local11 != -1) {
			@Pc(45) Class2_Sub1_Sub4_Sub5 local45 = Static35.method896(Static91.aClass11_23, local11);
			@Pc(56) Class2_Sub1_Sub4_Sub5[] local56 = new Class2_Sub1_Sub4_Sub5[] { local30, local45 };
			local30 = new Class2_Sub1_Sub4_Sub5(local56, 2);
		}
		if (this.anIntArray347 != null) {
			for (@Pc(67) int local67 = 0; local67 < this.anIntArray347.length; local67++) {
				local30.method924(this.anIntArray347[local67], this.anIntArray350[local67]);
			}
		}
		return local30;
	}
}
