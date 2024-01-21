import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
	private int anInt424;

	@OriginalMember(owner = "client!bc", name = "K", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!bc", name = "O", descriptor = "[I")
	public int[] anIntArray26;

	@OriginalMember(owner = "client!bc", name = "Y", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!bc", name = "ob", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!bc", name = "qb", descriptor = "I")
	public int anInt453;

	@OriginalMember(owner = "client!bc", name = "wb", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!bc", name = "Eb", descriptor = "[I")
	public int[] anIntArray28;

	@OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
	public int anInt426 = -1;

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
	private int anInt422 = 128;

	@OriginalMember(owner = "client!bc", name = "J", descriptor = "[Lclient!qe;")
	public Class83[] aClass83Array8 = new Class83[] { null, null, null, null, Static31.aClass83_231 };

	@OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
	private int anInt427 = -1;

	@OriginalMember(owner = "client!bc", name = "N", descriptor = "I")
	public int anInt433 = 0;

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
	public int anInt423 = -1;

	@OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
	private int anInt428 = 0;

	@OriginalMember(owner = "client!bc", name = "P", descriptor = "I")
	public int anInt434 = 0;

	@OriginalMember(owner = "client!bc", name = "U", descriptor = "[Lclient!qe;")
	public Class83[] aClass83Array9 = new Class83[] { null, null, Static46.aClass83_349, null, null };

	@OriginalMember(owner = "client!bc", name = "T", descriptor = "I")
	private int anInt438 = -1;

	@OriginalMember(owner = "client!bc", name = "mb", descriptor = "I")
	private int anInt451 = 0;

	@OriginalMember(owner = "client!bc", name = "V", descriptor = "I")
	private int anInt439 = 0;

	@OriginalMember(owner = "client!bc", name = "tb", descriptor = "I")
	public int anInt456 = 0;

	@OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
	private int anInt437 = 128;

	@OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
	private int anInt429 = -1;

	@OriginalMember(owner = "client!bc", name = "kb", descriptor = "Z")
	public boolean aBoolean25 = false;

	@OriginalMember(owner = "client!bc", name = "R", descriptor = "I")
	private int anInt436 = 128;

	@OriginalMember(owner = "client!bc", name = "xb", descriptor = "I")
	private int anInt458 = -1;

	@OriginalMember(owner = "client!bc", name = "rb", descriptor = "I")
	private int anInt454 = -1;

	@OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
	public int anInt425 = -1;

	@OriginalMember(owner = "client!bc", name = "ib", descriptor = "I")
	public int anInt448 = 1;

	@OriginalMember(owner = "client!bc", name = "cb", descriptor = "I")
	private int anInt443 = -1;

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
	public int anInt421 = 2000;

	@OriginalMember(owner = "client!bc", name = "Bb", descriptor = "I")
	private int anInt461 = 0;

	@OriginalMember(owner = "client!bc", name = "Ab", descriptor = "I")
	public int anInt460 = 0;

	@OriginalMember(owner = "client!bc", name = "fb", descriptor = "I")
	public int anInt445 = 0;

	@OriginalMember(owner = "client!bc", name = "I", descriptor = "I")
	public int anInt431 = 0;

	@OriginalMember(owner = "client!bc", name = "Db", descriptor = "I")
	private int anInt463 = -1;

	@OriginalMember(owner = "client!bc", name = "D", descriptor = "Z")
	public boolean aBoolean24 = false;

	@OriginalMember(owner = "client!bc", name = "Fb", descriptor = "I")
	private int anInt464 = -1;

	@OriginalMember(owner = "client!bc", name = "Hb", descriptor = "I")
	public int anInt466 = -1;

	@OriginalMember(owner = "client!bc", name = "bb", descriptor = "I")
	public int anInt442 = 0;

	@OriginalMember(owner = "client!bc", name = "Gb", descriptor = "I")
	public int anInt465 = 0;

	@OriginalMember(owner = "client!bc", name = "lb", descriptor = "I")
	public int anInt450 = -1;

	@OriginalMember(owner = "client!bc", name = "Cb", descriptor = "I")
	public int anInt462 = -1;

	@OriginalMember(owner = "client!bc", name = "ub", descriptor = "Lclient!qe;")
	public Class83 aClass83_87 = Static107.aClass83_930;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)Z")
	public boolean method331(@OriginalArg(0) boolean arg0) {
		@Pc(13) int local13 = this.anInt438;
		@Pc(16) int local16 = this.anInt427;
		if (arg0) {
			local13 = this.anInt429;
			local16 = this.anInt454;
		}
		if (local16 == -1) {
			return true;
		}
		@Pc(31) boolean local31 = true;
		if (!Static31.aClass28_39.method872(local16, 0)) {
			local31 = false;
		}
		if (local13 != -1 && !Static31.aClass28_39.method872(local13, 0)) {
			local31 = false;
		}
		return local31;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IBLclient!ki;I)Lclient!gj;")
	public Class24_Sub3 method332(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2_Sub16 arg1, @OriginalArg(3) int arg2) {
		if (this.anIntArray28 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (arg0 >= this.anIntArray26[local17] && this.anIntArray26[local17] != 0) {
					local15 = this.anIntArray28[local17];
				}
			}
			if (local15 != -1) {
				return Static113.method1987(local15).method332(1, arg1, arg2);
			}
		}
		@Pc(64) Class24_Sub3 local64 = (Class24_Sub3) Static142.aClass91_11.method2702((long) this.anInt453);
		if (local64 == null) {
			@Pc(72) Class24_Sub7 local72 = Static198.method2988(Static31.aClass28_39, this.anInt424);
			if (local72 == null) {
				return null;
			}
			@Pc(81) int local81;
			if (this.aShortArray5 != null) {
				for (local81 = 0; local81 < this.aShortArray5.length; local81++) {
					local72.method2986(this.aShortArray5[local81], this.aShortArray8[local81]);
				}
			}
			if (this.aShortArray6 != null) {
				for (local81 = 0; local81 < this.aShortArray6.length; local81++) {
					local72.method2998(this.aShortArray6[local81], this.aShortArray7[local81]);
				}
			}
			local64 = local72.method2991(this.anInt451 + 64, this.anInt428 + 768, -50, -10, -50);
			if (this.anInt437 != 128 || this.anInt422 != 128 || this.anInt436 != 128) {
				local64.method2738(this.anInt437, this.anInt422, this.anInt436);
			}
			local64.aBoolean170 = true;
			Static142.aClass91_11.method2710((long) this.anInt453, local64);
		}
		if (arg1 != null) {
			local64 = arg1.method1764(arg2, local64);
		}
		return local64;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(ZI)Z")
	public boolean method333(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt426;
		@Pc(9) int local9 = this.anInt458;
		@Pc(12) int local12 = this.anInt464;
		if (arg0) {
			local12 = this.anInt463;
			local9 = this.anInt443;
			local6 = this.anInt425;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static31.aClass28_39.method872(local6, 0)) {
			local30 = false;
		}
		if (local9 != -1 && !Static31.aClass28_39.method872(local9, 0)) {
			local30 = false;
		}
		if (local12 != -1 && !Static31.aClass28_39.method872(local12, 0)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)Lclient!v;")
	public Class24_Sub7 method334(@OriginalArg(1) boolean arg0) {
		@Pc(4) int local4 = this.anInt426;
		@Pc(11) int local11 = this.anInt458;
		@Pc(14) int local14 = this.anInt464;
		if (arg0) {
			local11 = this.anInt443;
			local14 = this.anInt463;
			local4 = this.anInt425;
		}
		if (local4 == -1) {
			return null;
		}
		@Pc(36) Class24_Sub7 local36 = Static198.method2988(Static31.aClass28_39, local4);
		if (local11 != -1) {
			@Pc(44) Class24_Sub7 local44 = Static198.method2988(Static31.aClass28_39, local11);
			if (local14 == -1) {
				@Pc(58) Class24_Sub7[] local58 = new Class24_Sub7[] { local36, local44 };
				local36 = new Class24_Sub7(local58, 2);
			} else {
				@Pc(71) Class24_Sub7 local71 = Static198.method2988(Static31.aClass28_39, local14);
				@Pc(86) Class24_Sub7[] local86 = new Class24_Sub7[] { local36, local44, local71 };
				local36 = new Class24_Sub7(local86, 3);
			}
		}
		if (!arg0 && this.anInt461 != 0) {
			local36.method2981(0, this.anInt461, 0);
		}
		if (arg0 && this.anInt439 != 0) {
			local36.method2981(0, this.anInt439, 0);
		}
		@Pc(131) int local131;
		if (this.aShortArray5 != null) {
			for (local131 = 0; local131 < this.aShortArray5.length; local131++) {
				local36.method2986(this.aShortArray5[local131], this.aShortArray8[local131]);
			}
		}
		if (this.aShortArray6 != null) {
			for (local131 = 0; local131 < this.aShortArray6.length; local131++) {
				local36.method2998(this.aShortArray6[local131], this.aShortArray7[local131]);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!bc;BLclient!bc;)V")
	public void method335(@OriginalArg(0) Class2_Sub2_Sub3 arg0, @OriginalArg(2) Class2_Sub2_Sub3 arg1) {
		this.aShortArray8 = arg0.aShortArray8;
		this.aClass83Array9 = arg1.aClass83Array9;
		this.anInt438 = arg1.anInt438;
		this.anInt433 = arg0.anInt433;
		this.anInt431 = arg0.anInt431;
		this.aBoolean25 = arg1.aBoolean25;
		this.anInt421 = arg0.anInt421;
		this.anInt427 = arg1.anInt427;
		this.anInt464 = arg1.anInt464;
		this.aShortArray7 = arg0.aShortArray7;
		this.anInt458 = arg1.anInt458;
		this.anInt424 = arg0.anInt424;
		this.anInt443 = arg1.anInt443;
		this.aShortArray6 = arg0.aShortArray6;
		this.anInt448 = 0;
		this.aShortArray5 = arg0.aShortArray5;
		this.anInt456 = arg1.anInt456;
		this.anInt429 = arg1.anInt429;
		this.anInt445 = arg0.anInt445;
		this.anInt434 = arg0.anInt434;
		this.anInt463 = arg1.anInt463;
		this.anInt425 = arg1.anInt425;
		this.anInt460 = arg0.anInt460;
		this.anInt454 = arg1.anInt454;
		this.aClass83_87 = arg1.aClass83_87;
		this.aClass83Array8 = new Class83[5];
		this.anInt426 = arg1.anInt426;
		if (arg1.aClass83Array8 != null) {
			for (@Pc(125) int local125 = 0; local125 < 4; local125++) {
				this.aClass83Array8[local125] = arg1.aClass83Array8[local125];
			}
		}
		this.aClass83Array8[4] = Static201.aClass83_1146;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILclient!ra;)V")
	private void method336(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt424 = arg1.method269();
		} else if (arg0 == 2) {
			this.aClass83_87 = arg1.method259();
		} else if (arg0 == 4) {
			this.anInt421 = arg1.method269();
		} else if (arg0 == 5) {
			this.anInt445 = arg1.method269();
		} else if (arg0 == 6) {
			this.anInt460 = arg1.method269();
		} else if (arg0 == 7) {
			this.anInt431 = arg1.method269();
			if (this.anInt431 > 32767) {
				this.anInt431 -= 65536;
				return;
			}
		} else {
			if (arg0 == 8) {
				this.anInt433 = arg1.method269();
				if (this.anInt433 > 32767) {
					this.anInt433 -= 65536;
					return;
				}
			} else if (arg0 == 11) {
				this.anInt465 = 1;
			} else if (arg0 == 12) {
				this.anInt448 = arg1.method248();
				return;
			} else if (arg0 == 16) {
				this.aBoolean25 = true;
				return;
			} else if (arg0 == 23) {
				this.anInt426 = arg1.method269();
				this.anInt461 = arg1.method260();
				return;
			} else if (arg0 == 24) {
				this.anInt458 = arg1.method269();
				return;
			} else if (arg0 == 25) {
				this.anInt425 = arg1.method269();
				this.anInt439 = arg1.method260();
				return;
			} else {
				if (arg0 == 26) {
					this.anInt443 = arg1.method269();
				} else if (arg0 >= 30 && arg0 < 35) {
					this.aClass83Array9[arg0 - 30] = arg1.method259();
					if (this.aClass83Array9[arg0 - 30].method2398(Static47.aClass83_366)) {
						this.aClass83Array9[arg0 - 30] = null;
						return;
					}
				} else if (arg0 < 35 || arg0 >= 40) {
					@Pc(378) int local378;
					@Pc(388) int local388;
					if (arg0 != 40) {
						if (arg0 != 41) {
							if (arg0 == 65) {
								this.aBoolean24 = true;
								return;
							}
							if (arg0 == 78) {
								this.anInt464 = arg1.method269();
								return;
							}
							if (arg0 == 79) {
								this.anInt463 = arg1.method269();
								return;
							}
							if (arg0 == 90) {
								this.anInt427 = arg1.method269();
								return;
							}
							if (arg0 == 91) {
								this.anInt454 = arg1.method269();
								return;
							}
							if (arg0 != 92) {
								if (arg0 != 93) {
									if (arg0 == 95) {
										this.anInt434 = arg1.method269();
										return;
									}
									if (arg0 != 96) {
										if (arg0 == 97) {
											this.anInt423 = arg1.method269();
											return;
										}
										if (arg0 == 98) {
											this.anInt466 = arg1.method269();
											return;
										}
										if (arg0 >= 100 && arg0 < 110) {
											if (this.anIntArray28 == null) {
												this.anIntArray26 = new int[10];
												this.anIntArray28 = new int[10];
											}
											this.anIntArray28[arg0 - 100] = arg1.method269();
											this.anIntArray26[arg0 - 100] = arg1.method269();
											return;
										}
										if (arg0 != 110) {
											if (arg0 == 111) {
												this.anInt422 = arg1.method269();
												return;
											}
											if (arg0 == 112) {
												this.anInt436 = arg1.method269();
												return;
											}
											if (arg0 != 113) {
												if (arg0 != 114) {
													if (arg0 != 115) {
														if (arg0 == 121) {
															this.anInt462 = arg1.method269();
														} else if (arg0 == 122) {
															this.anInt450 = arg1.method269();
															return;
														}
														return;
													}
													this.anInt456 = arg1.method260();
													return;
												}
												this.anInt428 = arg1.method221() * 5;
												return;
											}
											this.anInt451 = arg1.method221();
											return;
										}
										this.anInt437 = arg1.method269();
										return;
									}
									this.anInt442 = arg1.method260();
									return;
								}
								this.anInt429 = arg1.method269();
								return;
							}
							this.anInt438 = arg1.method269();
							return;
						}
						local378 = arg1.method260();
						this.aShortArray6 = new short[local378];
						this.aShortArray7 = new short[local378];
						for (local388 = 0; local388 < local378; local388++) {
							this.aShortArray6[local388] = (short) arg1.method269();
							this.aShortArray7[local388] = (short) arg1.method269();
						}
						return;
					}
					local378 = arg1.method260();
					this.aShortArray5 = new short[local378];
					this.aShortArray8 = new short[local378];
					for (local388 = 0; local388 < local378; local388++) {
						this.aShortArray5[local388] = (short) arg1.method269();
						this.aShortArray8[local388] = (short) arg1.method269();
					}
					return;
				} else {
					this.aClass83Array8[arg0 - 35] = arg1.method259();
					return;
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!ra;)V")
	public void method337(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method260();
			if (local15 == 0) {
				return;
			}
			this.method336(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!bc;Lclient!bc;)V")
	public void method338(@OriginalArg(1) Class2_Sub2_Sub3 arg0, @OriginalArg(2) Class2_Sub2_Sub3 arg1) {
		this.aShortArray7 = arg1.aShortArray7;
		this.anInt431 = arg1.anInt431;
		this.anInt460 = arg1.anInt460;
		this.anInt465 = 1;
		this.anInt424 = arg1.anInt424;
		this.anInt434 = arg1.anInt434;
		this.anInt448 = arg0.anInt448;
		this.aShortArray6 = arg1.aShortArray6;
		this.aClass83_87 = arg0.aClass83_87;
		this.anInt433 = arg1.anInt433;
		this.anInt445 = arg1.anInt445;
		this.anInt421 = arg1.anInt421;
		this.aShortArray5 = arg1.aShortArray5;
		this.aShortArray8 = arg1.aShortArray8;
		this.aBoolean25 = arg0.aBoolean25;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
	public void method340() {
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)Lclient!si;")
	public Class24_Sub3_Sub1 method342() {
		@Pc(11) Class24_Sub7 local11 = Static198.method2988(Static31.aClass28_39, this.anInt424);
		if (local11 == null) {
			return null;
		}
		@Pc(20) int local20;
		if (this.aShortArray5 != null) {
			for (local20 = 0; local20 < this.aShortArray5.length; local20++) {
				local11.method2986(this.aShortArray5[local20], this.aShortArray8[local20]);
			}
		}
		if (this.aShortArray6 != null) {
			for (local20 = 0; local20 < this.aShortArray6.length; local20++) {
				local11.method2998(this.aShortArray6[local20], this.aShortArray7[local20]);
			}
		}
		@Pc(84) Class24_Sub3_Sub1 local84 = local11.method2983(this.anInt451 + 64, this.anInt428 + 768);
		if (this.anInt437 != 128 || this.anInt422 != 128 || this.anInt436 != 128) {
			local84.method2738(this.anInt437, this.anInt422, this.anInt436);
		}
		return local84;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BZ)Lclient!v;")
	public Class24_Sub7 method343(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt427;
		@Pc(17) int local17 = this.anInt438;
		if (arg0) {
			local17 = this.anInt429;
			local8 = this.anInt454;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(35) Class24_Sub7 local35 = Static198.method2988(Static31.aClass28_39, local8);
		if (local17 != -1) {
			@Pc(44) Class24_Sub7 local44 = Static198.method2988(Static31.aClass28_39, local17);
			@Pc(55) Class24_Sub7[] local55 = new Class24_Sub7[] { local35, local44 };
			local35 = new Class24_Sub7(local55, 2);
		}
		@Pc(66) int local66;
		if (this.aShortArray5 != null) {
			for (local66 = 0; local66 < this.aShortArray5.length; local66++) {
				local35.method2986(this.aShortArray5[local66], this.aShortArray8[local66]);
			}
		}
		if (this.aShortArray6 != null) {
			for (local66 = 0; local66 < this.aShortArray6.length; local66++) {
				local35.method2998(this.aShortArray6[local66], this.aShortArray7[local66]);
			}
		}
		return local35;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(ZI)Lclient!bc;")
	public Class2_Sub2_Sub3 method344(@OriginalArg(1) int arg0) {
		if (this.anIntArray28 != null && arg0 > 1) {
			@Pc(23) int local23 = -1;
			for (@Pc(25) int local25 = 0; local25 < 10; local25++) {
				if (arg0 >= this.anIntArray26[local25] && this.anIntArray26[local25] != 0) {
					local23 = this.anIntArray28[local25];
				}
			}
			if (local23 != -1) {
				return Static113.method1987(local23);
			}
		}
		return this;
	}
}
