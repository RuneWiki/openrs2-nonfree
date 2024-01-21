import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!aa", name = "O", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!aa", name = "Bb", descriptor = "I")
	private int anInt73;

	@OriginalMember(owner = "client!aa", name = "Eb", descriptor = "I")
	public int anInt76;

	@OriginalMember(owner = "client!aa", name = "Lb", descriptor = "[I")
	public int[] anIntArray1;

	@OriginalMember(owner = "client!aa", name = "Ob", descriptor = "[I")
	public int[] anIntArray2;

	@OriginalMember(owner = "client!aa", name = "Xb", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!aa", name = "uc", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!aa", name = "zc", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
	private int anInt57 = -1;

	@OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
	public int anInt54 = -1;

	@OriginalMember(owner = "client!aa", name = "cb", descriptor = "I")
	public int anInt62 = 0;

	@OriginalMember(owner = "client!aa", name = "pb", descriptor = "I")
	private int anInt68 = -1;

	@OriginalMember(owner = "client!aa", name = "jb", descriptor = "I")
	public int anInt64 = 1;

	@OriginalMember(owner = "client!aa", name = "T", descriptor = "I")
	public int anInt58 = 0;

	@OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
	public int anInt60 = 0;

	@OriginalMember(owner = "client!aa", name = "vb", descriptor = "[Lclient!ea;")
	public Class18[] aClass18Array2 = new Class18[] { null, null, Static116.aClass18_835, null, null };

	@OriginalMember(owner = "client!aa", name = "Db", descriptor = "I")
	private int anInt75 = 128;

	@OriginalMember(owner = "client!aa", name = "Ab", descriptor = "I")
	private int anInt72 = 0;

	@OriginalMember(owner = "client!aa", name = "yb", descriptor = "I")
	public int anInt70 = -1;

	@OriginalMember(owner = "client!aa", name = "ib", descriptor = "I")
	private int anInt63 = -1;

	@OriginalMember(owner = "client!aa", name = "Fb", descriptor = "I")
	public int anInt77 = 2000;

	@OriginalMember(owner = "client!aa", name = "ub", descriptor = "Lclient!ea;")
	public Class18 aClass18_28 = Static11.aClass18_125;

	@OriginalMember(owner = "client!aa", name = "Cb", descriptor = "I")
	private int anInt74 = -1;

	@OriginalMember(owner = "client!aa", name = "ob", descriptor = "I")
	private int anInt67 = -1;

	@OriginalMember(owner = "client!aa", name = "Sb", descriptor = "I")
	private int anInt82 = 128;

	@OriginalMember(owner = "client!aa", name = "Pb", descriptor = "I")
	private int anInt80 = -1;

	@OriginalMember(owner = "client!aa", name = "Ub", descriptor = "I")
	private int anInt83 = 0;

	@OriginalMember(owner = "client!aa", name = "lb", descriptor = "I")
	private int anInt66 = -1;

	@OriginalMember(owner = "client!aa", name = "jc", descriptor = "I")
	private int anInt89 = 0;

	@OriginalMember(owner = "client!aa", name = "J", descriptor = "Z")
	public boolean aBoolean1 = false;

	@OriginalMember(owner = "client!aa", name = "mc", descriptor = "I")
	private int anInt91 = -1;

	@OriginalMember(owner = "client!aa", name = "ic", descriptor = "I")
	private int anInt88 = -1;

	@OriginalMember(owner = "client!aa", name = "pc", descriptor = "I")
	private int anInt93 = -1;

	@OriginalMember(owner = "client!aa", name = "oc", descriptor = "I")
	public int anInt92 = 0;

	@OriginalMember(owner = "client!aa", name = "rc", descriptor = "I")
	public int anInt94 = 0;

	@OriginalMember(owner = "client!aa", name = "hc", descriptor = "I")
	private int anInt87 = 0;

	@OriginalMember(owner = "client!aa", name = "X", descriptor = "[Lclient!ea;")
	public Class18[] aClass18Array1 = new Class18[] { null, null, null, null, Static4.aClass18_66 };

	@OriginalMember(owner = "client!aa", name = "dc", descriptor = "I")
	public int anInt86 = 0;

	@OriginalMember(owner = "client!aa", name = "tc", descriptor = "Z")
	public boolean aBoolean2 = false;

	@OriginalMember(owner = "client!aa", name = "yc", descriptor = "I")
	private int anInt96 = 128;

	@OriginalMember(owner = "client!aa", name = "Bc", descriptor = "I")
	public int anInt97 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!hc;)V")
	public void method39(@OriginalArg(1) Class1_Sub6 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method544();
			if (local11 == 0) {
				return;
			}
			this.method43(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!aa;Lclient!aa;B)V")
	public void method41(@OriginalArg(0) Class1_Sub1_Sub1 arg0, @OriginalArg(1) Class1_Sub1_Sub1 arg1) {
		this.aBoolean2 = arg1.aBoolean2;
		this.anInt64 = arg1.anInt64;
		this.anInt77 = arg0.anInt77;
		this.aShortArray1 = arg0.aShortArray1;
		this.anInt86 = 1;
		this.anInt97 = arg0.anInt97;
		this.anInt62 = arg0.anInt62;
		this.aShortArray4 = arg0.aShortArray4;
		this.anInt94 = arg0.anInt94;
		this.anInt58 = arg0.anInt58;
		this.aClass18_28 = arg1.aClass18_28;
		this.anInt60 = arg0.anInt60;
		this.aShortArray5 = arg0.aShortArray5;
		this.aShortArray2 = arg0.aShortArray2;
		this.anInt73 = arg0.anInt73;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BZ)Z")
	public boolean method42(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt66;
		@Pc(9) int local9 = this.anInt80;
		@Pc(12) int local12 = this.anInt57;
		if (arg0) {
			local12 = this.anInt88;
			local6 = this.anInt68;
			local9 = this.anInt63;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static113.aClass16_33.method2238(local6, 0)) {
			local30 = false;
		}
		if (local9 != -1 && !Static113.aClass16_33.method2238(local9, 0)) {
			local30 = false;
		}
		if (local12 != -1 && !Static113.aClass16_33.method2238(local12, 0)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILclient!hc;)V")
	private void method43(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		if (arg0 == 1) {
			this.anInt73 = arg1.method546();
		} else if (arg0 == 2) {
			this.aClass18_28 = arg1.method510();
		} else if (arg0 == 4) {
			this.anInt77 = arg1.method546();
		} else if (arg0 == 5) {
			this.anInt60 = arg1.method546();
			return;
		} else if (arg0 == 6) {
			this.anInt58 = arg1.method546();
			return;
		} else if (arg0 == 7) {
			this.anInt62 = arg1.method546();
			if (this.anInt62 > 32767) {
				this.anInt62 -= 65536;
				return;
			}
		} else {
			if (arg0 == 8) {
				this.anInt94 = arg1.method546();
				if (this.anInt94 > 32767) {
					this.anInt94 -= 65536;
					return;
				}
			} else if (arg0 == 11) {
				this.anInt86 = 1;
			} else if (arg0 == 12) {
				this.anInt64 = arg1.method499();
				return;
			} else if (arg0 == 16) {
				this.aBoolean2 = true;
				return;
			} else if (arg0 == 23) {
				this.anInt66 = arg1.method546();
				this.anInt87 = arg1.method544();
				return;
			} else if (arg0 == 24) {
				this.anInt80 = arg1.method546();
				return;
			} else if (arg0 == 25) {
				this.anInt68 = arg1.method546();
				this.anInt89 = arg1.method544();
				return;
			} else if (arg0 == 26) {
				this.anInt63 = arg1.method546();
				return;
			} else {
				if (arg0 >= 30 && arg0 < 35) {
					this.aClass18Array2[arg0 - 30] = arg1.method510();
					if (this.aClass18Array2[arg0 - 30].method734(Static59.aClass18_217)) {
						this.aClass18Array2[arg0 - 30] = null;
						return;
					}
				} else if (arg0 < 35 || arg0 >= 40) {
					@Pc(411) int local411;
					@Pc(421) int local421;
					if (arg0 != 40) {
						if (arg0 != 41) {
							if (arg0 != 65) {
								if (arg0 != 78) {
									if (arg0 == 79) {
										this.anInt88 = arg1.method546();
										return;
									}
									if (arg0 == 90) {
										this.anInt93 = arg1.method546();
										return;
									}
									if (arg0 != 91) {
										if (arg0 == 92) {
											this.anInt91 = arg1.method546();
											return;
										}
										if (arg0 == 93) {
											this.anInt74 = arg1.method546();
											return;
										}
										if (arg0 == 95) {
											this.anInt97 = arg1.method546();
											return;
										}
										if (arg0 == 97) {
											this.anInt54 = arg1.method546();
											return;
										}
										if (arg0 != 98) {
											if (arg0 >= 100 && arg0 < 110) {
												if (this.anIntArray1 == null) {
													this.anIntArray2 = new int[10];
													this.anIntArray1 = new int[10];
												}
												this.anIntArray1[arg0 - 100] = arg1.method546();
												this.anIntArray2[arg0 - 100] = arg1.method546();
												return;
											}
											if (arg0 != 110) {
												if (arg0 == 111) {
													this.anInt82 = arg1.method546();
													return;
												}
												if (arg0 != 112) {
													if (arg0 == 113) {
														this.anInt83 = arg1.method548();
													} else if (arg0 == 114) {
														this.anInt72 = arg1.method548() * 5;
														return;
													} else if (arg0 == 115) {
														this.anInt92 = arg1.method544();
														return;
													}
													return;
												}
												this.anInt96 = arg1.method546();
												return;
											}
											this.anInt75 = arg1.method546();
											return;
										}
										this.anInt70 = arg1.method546();
										return;
									}
									this.anInt67 = arg1.method546();
									return;
								}
								this.anInt57 = arg1.method546();
								return;
							}
							this.aBoolean1 = true;
							return;
						}
						local411 = arg1.method544();
						this.aShortArray1 = new short[local411];
						this.aShortArray4 = new short[local411];
						for (local421 = 0; local421 < local411; local421++) {
							this.aShortArray1[local421] = (short) arg1.method546();
							this.aShortArray4[local421] = (short) arg1.method546();
						}
						return;
					}
					local411 = arg1.method544();
					this.aShortArray5 = new short[local411];
					this.aShortArray2 = new short[local411];
					for (local421 = 0; local421 < local411; local421++) {
						this.aShortArray2[local421] = (short) arg1.method546();
						this.aShortArray5[local421] = (short) arg1.method546();
					}
				} else {
					this.aClass18Array1[arg0 - 35] = arg1.method510();
					return;
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(IZ)Lclient!ja;")
	public Class1_Sub1_Sub5_Sub5 method45(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt66;
		@Pc(11) int local11 = this.anInt80;
		@Pc(19) int local19 = this.anInt57;
		if (arg0) {
			local11 = this.anInt63;
			local19 = this.anInt88;
			local8 = this.anInt68;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(40) Class1_Sub1_Sub5_Sub5 local40 = Static70.method1483(Static113.aClass16_33, local8);
		if (local11 != -1) {
			@Pc(48) Class1_Sub1_Sub5_Sub5 local48 = Static70.method1483(Static113.aClass16_33, local11);
			if (local19 == -1) {
				@Pc(62) Class1_Sub1_Sub5_Sub5[] local62 = new Class1_Sub1_Sub5_Sub5[] { local40, local48 };
				local40 = new Class1_Sub1_Sub5_Sub5(local62, 2);
			} else {
				@Pc(75) Class1_Sub1_Sub5_Sub5 local75 = Static70.method1483(Static113.aClass16_33, local19);
				@Pc(90) Class1_Sub1_Sub5_Sub5[] local90 = new Class1_Sub1_Sub5_Sub5[] { local40, local48, local75 };
				local40 = new Class1_Sub1_Sub5_Sub5(local90, 3);
			}
		}
		if (!arg0 && this.anInt87 != 0) {
			local40.method1474(0, this.anInt87, 0);
		}
		if (arg0 && this.anInt89 != 0) {
			local40.method1474(0, this.anInt89, 0);
		}
		@Pc(126) int local126;
		if (this.aShortArray2 != null) {
			for (local126 = 0; local126 < this.aShortArray2.length; local126++) {
				local40.method1489(this.aShortArray2[local126], this.aShortArray5[local126]);
			}
		}
		if (this.aShortArray1 != null) {
			for (local126 = 0; local126 < this.aShortArray1.length; local126++) {
				local40.method1479(this.aShortArray1[local126], this.aShortArray4[local126]);
			}
		}
		return local40;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(BZ)Lclient!ja;")
	public Class1_Sub1_Sub5_Sub5 method46(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt93;
		@Pc(16) int local16 = this.anInt91;
		if (arg0) {
			local16 = this.anInt74;
			local8 = this.anInt67;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(34) Class1_Sub1_Sub5_Sub5 local34 = Static70.method1483(Static113.aClass16_33, local8);
		if (local16 != -1) {
			@Pc(42) Class1_Sub1_Sub5_Sub5 local42 = Static70.method1483(Static113.aClass16_33, local16);
			@Pc(53) Class1_Sub1_Sub5_Sub5[] local53 = new Class1_Sub1_Sub5_Sub5[] { local34, local42 };
			local34 = new Class1_Sub1_Sub5_Sub5(local53, 2);
		}
		@Pc(64) int local64;
		if (this.aShortArray2 != null) {
			for (local64 = 0; local64 < this.aShortArray2.length; local64++) {
				local34.method1489(this.aShortArray2[local64], this.aShortArray5[local64]);
			}
		}
		if (this.aShortArray1 != null) {
			for (local64 = 0; local64 < this.aShortArray1.length; local64++) {
				local34.method1479(this.aShortArray1[local64], this.aShortArray4[local64]);
			}
		}
		return local34;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)Lclient!rg;")
	public Class1_Sub1_Sub5_Sub4 method47(@OriginalArg(1) int arg0) {
		@Pc(17) int local17;
		if (this.anIntArray1 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (local17 = 0; local17 < 10; local17++) {
				if (arg0 >= this.anIntArray2[local17] && this.anIntArray2[local17] != 0) {
					local15 = this.anIntArray1[local17];
				}
			}
			if (local15 != -1) {
				return Static101.method2134(local15).method47(1);
			}
		}
		@Pc(60) Class1_Sub1_Sub5_Sub5 local60 = Static70.method1483(Static113.aClass16_33, this.anInt73);
		if (local60 == null) {
			return null;
		}
		if (this.aShortArray2 != null) {
			for (local17 = 0; local17 < this.aShortArray2.length; local17++) {
				local60.method1489(this.aShortArray2[local17], this.aShortArray5[local17]);
			}
		}
		if (this.aShortArray1 != null) {
			for (local17 = 0; local17 < this.aShortArray1.length; local17++) {
				local60.method1479(this.aShortArray1[local17], this.aShortArray4[local17]);
			}
		}
		@Pc(136) Class1_Sub1_Sub5_Sub4 local136 = local60.method1472(this.anInt83 + 64, this.anInt72 + 768, -50, -10, -50, true);
		if (this.anInt75 != 128 || this.anInt82 != 128 || this.anInt96 != 128) {
			local60.method1488(this.anInt75, this.anInt82, this.anInt96);
		}
		return local136;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)Z")
	public boolean method48(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt93;
		@Pc(9) int local9 = this.anInt91;
		if (arg0) {
			local9 = this.anInt74;
			local6 = this.anInt67;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(32) boolean local32 = true;
		if (!Static113.aClass16_33.method2238(local6, 0)) {
			local32 = false;
		}
		if (local9 != -1 && !Static113.aClass16_33.method2238(local9, 0)) {
			local32 = false;
		}
		return local32;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(BI)Lclient!rg;")
	public Class1_Sub1_Sub5_Sub4 method49(@OriginalArg(1) int arg0) {
		if (this.anIntArray1 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (arg0 >= this.anIntArray2[local15] && this.anIntArray2[local15] != 0) {
					local13 = this.anIntArray1[local15];
				}
			}
			if (local13 != -1) {
				return Static101.method2134(local13).method49(1);
			}
		}
		@Pc(62) Class1_Sub1_Sub5_Sub4 local62 = (Class1_Sub1_Sub5_Sub4) Static164.aClass66_22.method2599((long) this.anInt76);
		if (local62 != null) {
			return local62;
		}
		@Pc(77) Class1_Sub1_Sub5_Sub5 local77 = Static70.method1483(Static113.aClass16_33, this.anInt73);
		if (local77 == null) {
			return null;
		}
		@Pc(86) int local86;
		if (this.aShortArray2 != null) {
			for (local86 = 0; local86 < this.aShortArray2.length; local86++) {
				local77.method1489(this.aShortArray2[local86], this.aShortArray5[local86]);
			}
		}
		if (this.aShortArray1 != null) {
			for (local86 = 0; local86 < this.aShortArray1.length; local86++) {
				local77.method1479(this.aShortArray1[local86], this.aShortArray4[local86]);
			}
		}
		local62 = local77.method1472(this.anInt83 + 64, 768 - -this.anInt72, -50, -10, -50, false);
		if (this.anInt75 != 128 || this.anInt82 != 128 || this.anInt96 != 128) {
			local77.method1488(this.anInt75, this.anInt82, this.anInt96);
		}
		local62.aBoolean56 = true;
		Static164.aClass66_22.method2597((long) this.anInt76, local62);
		return local62;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
	public void method50() {
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Lclient!aa;")
	public Class1_Sub1_Sub1 method51(@OriginalArg(0) int arg0) {
		if (this.anIntArray1 != null && arg0 > 1) {
			@Pc(21) int local21 = -1;
			for (@Pc(23) int local23 = 0; local23 < 10; local23++) {
				if (this.anIntArray2[local23] <= arg0 && this.anIntArray2[local23] != 0) {
					local21 = this.anIntArray1[local23];
				}
			}
			if (local21 != -1) {
				return Static101.method2134(local21);
			}
		}
		return this;
	}
}
