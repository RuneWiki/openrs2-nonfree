import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class4_Sub2_Sub5 extends Class4_Sub2 {

	@OriginalMember(owner = "client!db", name = "V", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
	private int anInt597;

	@OriginalMember(owner = "client!db", name = "ob", descriptor = "[I")
	public int[] anIntArray62;

	@OriginalMember(owner = "client!db", name = "Db", descriptor = "[I")
	public int[] anIntArray63;

	@OriginalMember(owner = "client!db", name = "Kb", descriptor = "I")
	public int anInt628;

	@OriginalMember(owner = "client!db", name = "Tb", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!db", name = "fb", descriptor = "I")
	private int anInt603 = -1;

	@OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
	public int anInt600 = 0;

	@OriginalMember(owner = "client!db", name = "vb", descriptor = "I")
	private int anInt616 = 128;

	@OriginalMember(owner = "client!db", name = "ib", descriptor = "I")
	public int anInt606 = 0;

	@OriginalMember(owner = "client!db", name = "bb", descriptor = "I")
	public int anInt599 = 0;

	@OriginalMember(owner = "client!db", name = "yb", descriptor = "I")
	public int anInt619 = 0;

	@OriginalMember(owner = "client!db", name = "kb", descriptor = "I")
	private int anInt608 = -1;

	@OriginalMember(owner = "client!db", name = "gb", descriptor = "I")
	public int anInt604 = 0;

	@OriginalMember(owner = "client!db", name = "xb", descriptor = "I")
	private int anInt618 = 128;

	@OriginalMember(owner = "client!db", name = "wb", descriptor = "I")
	private int anInt617 = -1;

	@OriginalMember(owner = "client!db", name = "mb", descriptor = "Z")
	public boolean aBoolean25 = false;

	@OriginalMember(owner = "client!db", name = "nb", descriptor = "[Lclient!ja;")
	public Class39[] aClass39Array2 = new Class39[] { null, null, Static31.aClass39_431, null, null };

	@OriginalMember(owner = "client!db", name = "ub", descriptor = "I")
	private int anInt615 = 0;

	@OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
	public int anInt602 = 0;

	@OriginalMember(owner = "client!db", name = "Fb", descriptor = "I")
	private int anInt624 = -1;

	@OriginalMember(owner = "client!db", name = "tb", descriptor = "I")
	private int anInt614 = -1;

	@OriginalMember(owner = "client!db", name = "db", descriptor = "I")
	private int anInt601 = -1;

	@OriginalMember(owner = "client!db", name = "Eb", descriptor = "I")
	private int anInt623 = -1;

	@OriginalMember(owner = "client!db", name = "W", descriptor = "I")
	public int anInt595 = -1;

	@OriginalMember(owner = "client!db", name = "rb", descriptor = "I")
	public int anInt612 = 0;

	@OriginalMember(owner = "client!db", name = "Rb", descriptor = "I")
	private int anInt634 = -1;

	@OriginalMember(owner = "client!db", name = "Gb", descriptor = "Lclient!ja;")
	public Class39 aClass39_352 = Static120.aClass39_1547;

	@OriginalMember(owner = "client!db", name = "pb", descriptor = "I")
	public int anInt610 = 0;

	@OriginalMember(owner = "client!db", name = "Ub", descriptor = "I")
	private int anInt635 = -1;

	@OriginalMember(owner = "client!db", name = "Ab", descriptor = "I")
	public int anInt621 = -1;

	@OriginalMember(owner = "client!db", name = "Ob", descriptor = "I")
	public int anInt632 = 2000;

	@OriginalMember(owner = "client!db", name = "Nb", descriptor = "I")
	public int anInt631 = 1;

	@OriginalMember(owner = "client!db", name = "Pb", descriptor = "I")
	private int anInt633 = 0;

	@OriginalMember(owner = "client!db", name = "Mb", descriptor = "I")
	public int anInt630 = 0;

	@OriginalMember(owner = "client!db", name = "Lb", descriptor = "I")
	private int anInt629 = -1;

	@OriginalMember(owner = "client!db", name = "Qb", descriptor = "[Lclient!ja;")
	public Class39[] aClass39Array3 = new Class39[] { null, null, null, null, Static45.aClass39_697 };

	@OriginalMember(owner = "client!db", name = "X", descriptor = "I")
	private int anInt596 = 128;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZI)Z")
	public boolean method408(@OriginalArg(0) boolean arg0) {
		@Pc(11) int local11 = this.anInt608;
		@Pc(14) int local14 = this.anInt614;
		@Pc(17) int local17 = this.anInt635;
		if (arg0) {
			local17 = this.anInt624;
			local11 = this.anInt617;
			local14 = this.anInt623;
		}
		if (local11 == -1) {
			return true;
		}
		@Pc(36) boolean local36 = true;
		if (!Static82.aClass20_40.method491(local11, 0)) {
			local36 = false;
		}
		if (local17 != -1 && !Static82.aClass20_40.method491(local17, 0)) {
			local36 = false;
		}
		if (local14 != -1 && !Static82.aClass20_40.method491(local14, 0)) {
			local36 = false;
		}
		return local36;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZB)Z")
	public boolean method409(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt601;
		@Pc(17) int local17 = this.anInt603;
		if (arg0) {
			local6 = this.anInt634;
			local17 = this.anInt629;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(33) boolean local33 = true;
		if (!Static82.aClass20_40.method491(local6, 0)) {
			local33 = false;
		}
		if (local17 != -1 && !Static82.aClass20_40.method491(local17, 0)) {
			local33 = false;
		}
		return local33;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)Lclient!qb;")
	public Class4_Sub2_Sub1_Sub4 method410(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt608;
		@Pc(11) int local11 = this.anInt635;
		@Pc(14) int local14 = this.anInt614;
		if (arg0) {
			local11 = this.anInt624;
			local14 = this.anInt623;
			local8 = this.anInt617;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(35) Class4_Sub2_Sub1_Sub4 local35 = Static95.method1747(Static82.aClass20_40, local8);
		if (local11 != -1) {
			@Pc(43) Class4_Sub2_Sub1_Sub4 local43 = Static95.method1747(Static82.aClass20_40, local11);
			if (local14 == -1) {
				@Pc(86) Class4_Sub2_Sub1_Sub4[] local86 = new Class4_Sub2_Sub1_Sub4[] { local35, local43 };
				local35 = new Class4_Sub2_Sub1_Sub4(local86, 2);
			} else {
				@Pc(52) Class4_Sub2_Sub1_Sub4 local52 = Static95.method1747(Static82.aClass20_40, local14);
				@Pc(67) Class4_Sub2_Sub1_Sub4[] local67 = new Class4_Sub2_Sub1_Sub4[] { local35, local43, local52 };
				local35 = new Class4_Sub2_Sub1_Sub4(local67, 3);
			}
		}
		if (!arg0 && this.anInt633 != 0) {
			local35.method1740(0, this.anInt633, 0);
		}
		if (arg0 && this.anInt615 != 0) {
			local35.method1740(0, this.anInt615, 0);
		}
		if (this.aShortArray2 != null) {
			for (@Pc(119) int local119 = 0; local119 < this.aShortArray2.length; local119++) {
				local35.method1731(this.aShortArray2[local119], this.aShortArray1[local119]);
			}
		}
		return local35;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
	public void method411() {
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(ZI)Lclient!qb;")
	public Class4_Sub2_Sub1_Sub4 method412(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt601;
		@Pc(11) int local11 = this.anInt603;
		if (arg0) {
			local8 = this.anInt634;
			local11 = this.anInt629;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(35) Class4_Sub2_Sub1_Sub4 local35 = Static95.method1747(Static82.aClass20_40, local8);
		if (local11 != -1) {
			@Pc(43) Class4_Sub2_Sub1_Sub4 local43 = Static95.method1747(Static82.aClass20_40, local11);
			@Pc(54) Class4_Sub2_Sub1_Sub4[] local54 = new Class4_Sub2_Sub1_Sub4[] { local35, local43 };
			local35 = new Class4_Sub2_Sub1_Sub4(local54, 2);
		}
		if (this.aShortArray2 != null) {
			for (@Pc(65) int local65 = 0; local65 < this.aShortArray2.length; local65++) {
				local35.method1731(this.aShortArray2[local65], this.aShortArray1[local65]);
			}
		}
		return local35;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!db;Lclient!db;)V")
	public void method413(@OriginalArg(1) Class4_Sub2_Sub5 arg0, @OriginalArg(2) Class4_Sub2_Sub5 arg1) {
		this.anInt631 = arg0.anInt631;
		this.anInt606 = 1;
		this.aShortArray2 = arg1.aShortArray2;
		this.aShortArray1 = arg1.aShortArray1;
		this.anInt610 = arg1.anInt610;
		this.anInt630 = arg1.anInt630;
		this.anInt597 = arg1.anInt597;
		this.aClass39_352 = arg0.aClass39_352;
		this.anInt604 = arg1.anInt604;
		this.anInt599 = arg1.anInt599;
		this.aBoolean25 = arg0.aBoolean25;
		this.anInt612 = arg1.anInt612;
		this.anInt632 = arg1.anInt632;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!s;B)V")
	public void method415(@OriginalArg(0) Class4_Sub16 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method1474();
			if (local17 == 0) {
				return;
			}
			this.method417(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(IB)Lclient!vb;")
	public Class4_Sub2_Sub1_Sub6 method416(@OriginalArg(0) int arg0) {
		if (this.anIntArray63 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (arg0 >= this.anIntArray62[local15] && this.anIntArray62[local15] != 0) {
					local13 = this.anIntArray63[local15];
				}
			}
			if (local13 != -1) {
				return Static119.method2166(local13).method416(1);
			}
		}
		@Pc(58) Class4_Sub2_Sub1_Sub6 local58 = (Class4_Sub2_Sub1_Sub6) Static108.aClass12_75.method235((long) this.anInt628);
		if (local58 != null) {
			return local58;
		}
		@Pc(68) Class4_Sub2_Sub1_Sub4 local68 = Static95.method1747(Static82.aClass20_40, this.anInt597);
		if (local68 == null) {
			return null;
		}
		if (this.anInt596 != 128 || this.anInt616 != 128 || this.anInt618 != 128) {
			local68.method1738(this.anInt596, this.anInt616, this.anInt618);
		}
		if (this.aShortArray2 != null) {
			for (@Pc(106) int local106 = 0; local106 < this.aShortArray2.length; local106++) {
				local68.method1731(this.aShortArray2[local106], this.aShortArray1[local106]);
			}
		}
		local58 = local68.method1743(this.anInt619 + 64, this.anInt602 + 768, -50, -10, -50);
		local58.aBoolean152 = true;
		Static108.aClass12_75.method234(local58, (long) this.anInt628);
		return local58;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!s;I)V")
	private void method417(@OriginalArg(1) Class4_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt597 = arg0.method1490();
		} else if (arg1 == 2) {
			this.aClass39_352 = arg0.method1464();
		} else if (arg1 == 4) {
			this.anInt632 = arg0.method1490();
		} else if (arg1 == 5) {
			this.anInt610 = arg0.method1490();
		} else if (arg1 == 6) {
			this.anInt604 = arg0.method1490();
		} else if (arg1 == 7) {
			this.anInt599 = arg0.method1490();
			if (this.anInt599 <= 32767) {
				return;
			}
			this.anInt599 -= 65536;
		} else if (arg1 == 8) {
			this.anInt630 = arg0.method1490();
			if (this.anInt630 > 32767) {
				this.anInt630 -= 65536;
				return;
			}
		} else if (arg1 == 11) {
			this.anInt606 = 1;
			return;
		} else if (arg1 == 12) {
			this.anInt631 = arg0.method1486();
			return;
		} else if (arg1 == 16) {
			this.aBoolean25 = true;
			return;
		} else if (arg1 == 23) {
			this.anInt608 = arg0.method1490();
			this.anInt633 = arg0.method1474();
			return;
		} else if (arg1 == 24) {
			this.anInt635 = arg0.method1490();
			return;
		} else {
			if (arg1 == 25) {
				this.anInt617 = arg0.method1490();
				this.anInt615 = arg0.method1474();
			} else if (arg1 == 26) {
				this.anInt624 = arg0.method1490();
				return;
			} else if (arg1 >= 30 && arg1 < 35) {
				this.aClass39Array2[arg1 - 30] = arg0.method1464();
				if (this.aClass39Array2[arg1 - 30].method954(Static114.aClass39_1489)) {
					this.aClass39Array2[arg1 - 30] = null;
					return;
				}
			} else if (arg1 < 35 || arg1 >= 40) {
				if (arg1 != 40) {
					if (arg1 != 78) {
						if (arg1 == 79) {
							this.anInt623 = arg0.method1490();
							return;
						}
						if (arg1 != 90) {
							if (arg1 != 91) {
								if (arg1 != 92) {
									if (arg1 == 93) {
										this.anInt629 = arg0.method1490();
										return;
									}
									if (arg1 != 95) {
										if (arg1 != 97) {
											if (arg1 == 98) {
												this.anInt621 = arg0.method1490();
												return;
											}
											if (arg1 >= 100 && arg1 < 110) {
												if (this.anIntArray63 == null) {
													this.anIntArray63 = new int[10];
													this.anIntArray62 = new int[10];
												}
												this.anIntArray63[arg1 - 100] = arg0.method1490();
												this.anIntArray62[arg1 - 100] = arg0.method1490();
												return;
											}
											if (arg1 != 110) {
												if (arg1 != 111) {
													if (arg1 != 112) {
														if (arg1 != 113) {
															if (arg1 == 114) {
																this.anInt602 = arg0.method1477() * 5;
															} else if (arg1 == 115) {
																this.anInt600 = arg0.method1474();
																return;
															}
															return;
														}
														this.anInt619 = arg0.method1477();
														return;
													}
													this.anInt618 = arg0.method1490();
													return;
												}
												this.anInt616 = arg0.method1490();
												return;
											}
											this.anInt596 = arg0.method1490();
											return;
										}
										this.anInt595 = arg0.method1490();
										return;
									}
									this.anInt612 = arg0.method1490();
									return;
								}
								this.anInt603 = arg0.method1490();
								return;
							}
							this.anInt634 = arg0.method1490();
							return;
						}
						this.anInt601 = arg0.method1490();
						return;
					}
					this.anInt614 = arg0.method1490();
					return;
				}
				@Pc(337) int local337 = arg0.method1474();
				this.aShortArray1 = new short[local337];
				this.aShortArray2 = new short[local337];
				for (@Pc(347) int local347 = 0; local347 < local337; local347++) {
					this.aShortArray2[local347] = (short) arg0.method1490();
					this.aShortArray1[local347] = (short) arg0.method1490();
				}
				return;
			} else {
				this.aClass39Array3[arg1 - 35] = arg0.method1464();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(II)Lclient!qb;")
	public Class4_Sub2_Sub1_Sub4 method418(@OriginalArg(0) int arg0) {
		@Pc(17) int local17;
		if (this.anIntArray63 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (local17 = 0; local17 < 10; local17++) {
				if (this.anIntArray62[local17] <= arg0 && this.anIntArray62[local17] != 0) {
					local15 = this.anIntArray63[local17];
				}
			}
			if (local15 != -1) {
				return Static119.method2166(local15).method418(1);
			}
		}
		@Pc(56) Class4_Sub2_Sub1_Sub4 local56 = Static95.method1747(Static82.aClass20_40, this.anInt597);
		if (local56 == null) {
			return null;
		}
		if (this.anInt596 != 128 || this.anInt616 != 128 || this.anInt618 != 128) {
			local56.method1738(this.anInt596, this.anInt616, this.anInt618);
		}
		if (this.aShortArray2 != null) {
			for (local17 = 0; local17 < this.aShortArray2.length; local17++) {
				local56.method1731(this.aShortArray2[local17], this.aShortArray1[local17]);
			}
		}
		return local56;
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(II)Lclient!db;")
	public Class4_Sub2_Sub5 method419(@OriginalArg(1) int arg0) {
		if (this.anIntArray63 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (arg0 >= this.anIntArray62[local17] && this.anIntArray62[local17] != 0) {
					local15 = this.anIntArray63[local17];
				}
			}
			if (local15 != -1) {
				return Static119.method2166(local15);
			}
		}
		return this;
	}
}
