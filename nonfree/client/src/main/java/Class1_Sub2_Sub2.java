import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!b", name = "O", descriptor = "I")
	public int anInt281;

	@OriginalMember(owner = "client!b", name = "S", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!b", name = "lb", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!b", name = "vb", descriptor = "[I")
	public int[] anIntArray35;

	@OriginalMember(owner = "client!b", name = "Ab", descriptor = "[I")
	public int[] anIntArray36;

	@OriginalMember(owner = "client!b", name = "Bb", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!b", name = "Ob", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!b", name = "Tb", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!b", name = "K", descriptor = "I")
	private int anInt277 = 128;

	@OriginalMember(owner = "client!b", name = "P", descriptor = "I")
	public int anInt282 = -1;

	@OriginalMember(owner = "client!b", name = "V", descriptor = "I")
	public int anInt287 = -1;

	@OriginalMember(owner = "client!b", name = "N", descriptor = "I")
	public int anInt280 = -1;

	@OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
	private int anInt283 = 0;

	@OriginalMember(owner = "client!b", name = "mb", descriptor = "I")
	private int anInt302 = 0;

	@OriginalMember(owner = "client!b", name = "U", descriptor = "I")
	private int anInt286 = 0;

	@OriginalMember(owner = "client!b", name = "T", descriptor = "I")
	public int anInt285 = 1;

	@OriginalMember(owner = "client!b", name = "hb", descriptor = "I")
	private int anInt298 = 128;

	@OriginalMember(owner = "client!b", name = "sb", descriptor = "I")
	private int anInt305 = -1;

	@OriginalMember(owner = "client!b", name = "Y", descriptor = "I")
	public int anInt290 = -1;

	@OriginalMember(owner = "client!b", name = "gb", descriptor = "I")
	private int anInt297 = -1;

	@OriginalMember(owner = "client!b", name = "nb", descriptor = "Lclient!oc;")
	public Class65 aClass65_229 = Static70.aClass65_1068;

	@OriginalMember(owner = "client!b", name = "Eb", descriptor = "I")
	public int anInt313 = 0;

	@OriginalMember(owner = "client!b", name = "wb", descriptor = "Z")
	public boolean aBoolean12 = false;

	@OriginalMember(owner = "client!b", name = "Cb", descriptor = "I")
	public int anInt311 = 2000;

	@OriginalMember(owner = "client!b", name = "pb", descriptor = "[Lclient!oc;")
	public Class65[] aClass65Array4 = new Class65[] { null, null, null, null, Static109.aClass65_1560 };

	@OriginalMember(owner = "client!b", name = "X", descriptor = "I")
	public int anInt289 = 0;

	@OriginalMember(owner = "client!b", name = "W", descriptor = "I")
	public int anInt288 = 0;

	@OriginalMember(owner = "client!b", name = "Fb", descriptor = "I")
	private int anInt314 = -1;

	@OriginalMember(owner = "client!b", name = "Hb", descriptor = "I")
	private int anInt316 = 128;

	@OriginalMember(owner = "client!b", name = "ib", descriptor = "I")
	private int anInt299 = -1;

	@OriginalMember(owner = "client!b", name = "yb", descriptor = "I")
	private int anInt309 = -1;

	@OriginalMember(owner = "client!b", name = "Ib", descriptor = "I")
	private int anInt317 = -1;

	@OriginalMember(owner = "client!b", name = "Kb", descriptor = "I")
	private int anInt319 = -1;

	@OriginalMember(owner = "client!b", name = "fb", descriptor = "I")
	public int anInt296 = 0;

	@OriginalMember(owner = "client!b", name = "rb", descriptor = "I")
	public int anInt304 = -1;

	@OriginalMember(owner = "client!b", name = "jb", descriptor = "I")
	public int anInt300 = -1;

	@OriginalMember(owner = "client!b", name = "Mb", descriptor = "I")
	public int anInt321 = 0;

	@OriginalMember(owner = "client!b", name = "Nb", descriptor = "I")
	private int anInt322 = 0;

	@OriginalMember(owner = "client!b", name = "Pb", descriptor = "[Lclient!oc;")
	public Class65[] aClass65Array5 = new Class65[] { null, null, Static108.aClass65_1551, null, null };

	@OriginalMember(owner = "client!b", name = "Rb", descriptor = "I")
	public int anInt323 = 0;

	@OriginalMember(owner = "client!b", name = "Db", descriptor = "I")
	public int anInt312 = 0;

	@OriginalMember(owner = "client!b", name = "zb", descriptor = "Z")
	public boolean aBoolean13 = false;

	@OriginalMember(owner = "client!b", name = "Sb", descriptor = "I")
	private int anInt324 = -1;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IZLclient!wa;)V")
	private void method215(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt310 = arg1.method1753();
		} else if (arg0 == 2) {
			this.aClass65_229 = arg1.method1706();
		} else if (arg0 == 4) {
			this.anInt311 = arg1.method1753();
		} else if (arg0 == 5) {
			this.anInt323 = arg1.method1753();
		} else if (arg0 == 6) {
			this.anInt313 = arg1.method1753();
		} else if (arg0 == 7) {
			this.anInt296 = arg1.method1753();
			if (this.anInt296 > 32767) {
				this.anInt296 -= 65536;
				return;
			}
		} else if (arg0 == 8) {
			this.anInt312 = arg1.method1753();
			if (this.anInt312 > 32767) {
				this.anInt312 -= 65536;
				return;
			}
		} else if (arg0 == 11) {
			this.anInt321 = 1;
		} else if (arg0 == 12) {
			this.anInt285 = arg1.method1700();
			return;
		} else if (arg0 == 16) {
			this.aBoolean13 = true;
			return;
		} else if (arg0 == 23) {
			this.anInt287 = arg1.method1753();
			this.anInt283 = arg1.method1738();
			return;
		} else if (arg0 == 24) {
			this.anInt299 = arg1.method1753();
			return;
		} else {
			if (arg0 == 25) {
				this.anInt282 = arg1.method1753();
				this.anInt302 = arg1.method1738();
			} else if (arg0 == 26) {
				this.anInt297 = arg1.method1753();
				return;
			} else if (arg0 >= 30 && arg0 < 35) {
				this.aClass65Array5[arg0 - 30] = arg1.method1706();
				if (this.aClass65Array5[arg0 - 30].method2489(Static186.aClass65_2441)) {
					this.aClass65Array5[arg0 - 30] = null;
					return;
				}
			} else if (arg0 < 35 || arg0 >= 40) {
				@Pc(154) int local154;
				@Pc(164) int local164;
				if (arg0 == 40) {
					local154 = arg1.method1738();
					this.aShortArray15 = new short[local154];
					this.aShortArray16 = new short[local154];
					for (local164 = 0; local164 < local154; local164++) {
						this.aShortArray16[local164] = (short) arg1.method1753();
						this.aShortArray15[local164] = (short) arg1.method1753();
					}
					return;
				}
				if (arg0 != 41) {
					if (arg0 != 65) {
						if (arg0 == 78) {
							this.anInt324 = arg1.method1753();
							return;
						}
						if (arg0 == 79) {
							this.anInt319 = arg1.method1753();
							return;
						}
						if (arg0 != 90) {
							if (arg0 != 91) {
								if (arg0 != 92) {
									if (arg0 == 93) {
										this.anInt309 = arg1.method1753();
										return;
									}
									if (arg0 != 95) {
										if (arg0 == 97) {
											this.anInt290 = arg1.method1753();
											return;
										}
										if (arg0 == 98) {
											this.anInt300 = arg1.method1753();
											return;
										}
										if (arg0 >= 100 && arg0 < 110) {
											if (this.anIntArray36 == null) {
												this.anIntArray36 = new int[10];
												this.anIntArray35 = new int[10];
											}
											this.anIntArray36[arg0 - 100] = arg1.method1753();
											this.anIntArray35[arg0 - 100] = arg1.method1753();
											return;
										}
										if (arg0 != 110) {
											if (arg0 == 111) {
												this.anInt277 = arg1.method1753();
												return;
											}
											if (arg0 != 112) {
												if (arg0 == 113) {
													this.anInt322 = arg1.method1720();
													return;
												}
												if (arg0 == 114) {
													this.anInt286 = arg1.method1720() * 5;
													return;
												}
												if (arg0 != 115) {
													if (arg0 == 121) {
														this.anInt280 = arg1.method1753();
													} else if (arg0 == 122) {
														this.anInt304 = arg1.method1753();
														return;
													}
													return;
												}
												this.anInt288 = arg1.method1738();
												return;
											}
											this.anInt316 = arg1.method1753();
											return;
										}
										this.anInt298 = arg1.method1753();
										return;
									}
									this.anInt289 = arg1.method1753();
									return;
								}
								this.anInt305 = arg1.method1753();
								return;
							}
							this.anInt317 = arg1.method1753();
							return;
						}
						this.anInt314 = arg1.method1753();
						return;
					}
					this.aBoolean12 = true;
					return;
				}
				local154 = arg1.method1738();
				this.aShortArray14 = new short[local154];
				this.aShortArray13 = new short[local154];
				for (local164 = 0; local164 < local154; local164++) {
					this.aShortArray13[local164] = (short) arg1.method1753();
					this.aShortArray14[local164] = (short) arg1.method1753();
				}
				return;
			} else {
				this.aClass65Array4[arg0 - 35] = arg1.method1706();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!kg;BII)Lclient!bf;")
	public Class6_Sub3 method216(@OriginalArg(0) Class1_Sub2_Sub14 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.anIntArray36 != null && arg2 > 1) {
			@Pc(21) int local21 = -1;
			for (@Pc(23) int local23 = 0; local23 < 10; local23++) {
				if (arg2 >= this.anIntArray35[local23] && this.anIntArray35[local23] != 0) {
					local21 = this.anIntArray36[local23];
				}
			}
			if (local21 != -1) {
				return Static40.method700(local21).method216(arg0, arg1, 1);
			}
		}
		@Pc(69) Class6_Sub3 local69 = (Class6_Sub3) Static139.aClass67_8.method2570((long) this.anInt281);
		if (local69 == null) {
			@Pc(77) Class6_Sub1 local77 = Static10.method193(Static12.aClass60_1, this.anInt310);
			if (local77 == null) {
				return null;
			}
			@Pc(86) int local86;
			if (this.aShortArray16 != null) {
				for (local86 = 0; local86 < this.aShortArray16.length; local86++) {
					local77.method199(this.aShortArray16[local86], this.aShortArray15[local86]);
				}
			}
			if (this.aShortArray13 != null) {
				for (local86 = 0; local86 < this.aShortArray13.length; local86++) {
					local77.method192(this.aShortArray13[local86], this.aShortArray14[local86]);
				}
			}
			local69 = local77.method184(this.anInt322 + 64, this.anInt286 + 768, -50, -10, -50);
			if (this.anInt298 != 128 || this.anInt277 != 128 || this.anInt316 != 128) {
				local69.method1185(this.anInt298, this.anInt277, this.anInt316);
			}
			Static139.aClass67_8.method2567(local69, (long) this.anInt281);
		}
		if (arg0 != null) {
			local69 = arg0.method1881(arg1, local69);
		}
		return local69;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(II)Lclient!b;")
	public Class1_Sub2_Sub2 method217(@OriginalArg(1) int arg0) {
		if (this.anIntArray36 != null && arg0 > 1) {
			@Pc(18) int local18 = -1;
			for (@Pc(20) int local20 = 0; local20 < 10; local20++) {
				if (this.anIntArray35[local20] <= arg0 && this.anIntArray35[local20] != 0) {
					local18 = this.anIntArray36[local20];
				}
			}
			if (local18 != -1) {
				return Static40.method700(local18);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BZ)Z")
	public boolean method218(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt299;
		@Pc(9) int local9 = this.anInt287;
		@Pc(12) int local12 = this.anInt324;
		if (arg0) {
			local9 = this.anInt282;
			local12 = this.anInt319;
			local6 = this.anInt297;
		}
		if (local9 == -1) {
			return true;
		}
		@Pc(39) boolean local39 = true;
		if (!Static12.aClass60_1.method2317(local9, 0)) {
			local39 = false;
		}
		if (local6 != -1 && !Static12.aClass60_1.method2317(local6, 0)) {
			local39 = false;
		}
		if (local12 != -1 && !Static12.aClass60_1.method2317(local12, 0)) {
			local39 = false;
		}
		return local39;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!b;ILclient!b;)V")
	public void method220(@OriginalArg(0) Class1_Sub2_Sub2 arg0, @OriginalArg(2) Class1_Sub2_Sub2 arg1) {
		this.anInt310 = arg1.anInt310;
		this.anInt321 = 1;
		this.aShortArray16 = arg1.aShortArray16;
		this.anInt296 = arg1.anInt296;
		this.anInt312 = arg1.anInt312;
		this.aShortArray15 = arg1.aShortArray15;
		this.anInt289 = arg1.anInt289;
		this.anInt311 = arg1.anInt311;
		this.anInt323 = arg1.anInt323;
		this.anInt313 = arg1.anInt313;
		this.aShortArray13 = arg1.aShortArray13;
		this.aClass65_229 = arg0.aClass65_229;
		this.anInt285 = arg0.anInt285;
		this.aShortArray14 = arg1.aShortArray14;
		this.aBoolean13 = arg0.aBoolean13;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BLclient!wa;)V")
	public void method221(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1738();
			if (local7 == 0) {
				return;
			}
			this.method215(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(Z)V")
	public void method223() {
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!b;Lclient!b;I)V")
	public void method224(@OriginalArg(0) Class1_Sub2_Sub2 arg0, @OriginalArg(1) Class1_Sub2_Sub2 arg1) {
		this.anInt285 = 0;
		this.anInt324 = arg0.anInt324;
		this.anInt287 = arg0.anInt287;
		this.anInt310 = arg1.anInt310;
		this.aShortArray15 = arg1.aShortArray15;
		this.aShortArray14 = arg1.aShortArray14;
		this.anInt296 = arg1.anInt296;
		this.aClass65_229 = arg0.aClass65_229;
		this.anInt309 = arg0.anInt309;
		this.aShortArray13 = arg1.aShortArray13;
		this.anInt305 = arg0.anInt305;
		this.anInt314 = arg0.anInt314;
		this.aShortArray16 = arg1.aShortArray16;
		this.anInt289 = arg1.anInt289;
		this.anInt313 = arg1.anInt313;
		this.anInt311 = arg1.anInt311;
		this.anInt299 = arg0.anInt299;
		this.aBoolean13 = arg0.aBoolean13;
		this.anInt288 = arg0.anInt288;
		this.aClass65Array5 = arg0.aClass65Array5;
		this.aClass65Array4 = new Class65[5];
		this.anInt282 = arg0.anInt282;
		this.anInt319 = arg0.anInt319;
		this.anInt323 = arg1.anInt323;
		this.anInt297 = arg0.anInt297;
		this.anInt317 = arg0.anInt317;
		this.anInt312 = arg1.anInt312;
		if (arg0.aClass65Array4 != null) {
			for (@Pc(123) int local123 = 0; local123 < 4; local123++) {
				this.aClass65Array4[local123] = arg0.aClass65Array4[local123];
			}
		}
		this.aClass65Array4[4] = Static9.aClass65_118;
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(I)Lclient!h;")
	public Class6_Sub3_Sub1 method226() {
		@Pc(11) Class6_Sub1 local11 = Static10.method193(Static12.aClass60_1, this.anInt310);
		if (local11 == null) {
			return null;
		}
		@Pc(20) int local20;
		if (this.aShortArray16 != null) {
			for (local20 = 0; local20 < this.aShortArray16.length; local20++) {
				local11.method199(this.aShortArray16[local20], this.aShortArray15[local20]);
			}
		}
		if (this.aShortArray13 != null) {
			for (local20 = 0; local20 < this.aShortArray13.length; local20++) {
				local11.method192(this.aShortArray13[local20], this.aShortArray14[local20]);
			}
		}
		@Pc(80) Class6_Sub3_Sub1 local80 = local11.method200(this.anInt322 + 64, this.anInt286 + 768);
		local80.aBoolean76 = true;
		if (this.anInt298 != 128 || this.anInt277 != 128 || this.anInt316 != 128) {
			local80.method1185(this.anInt298, this.anInt277, this.anInt316);
		}
		return local80;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)Z")
	public boolean method227(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt314;
		@Pc(9) int local9 = this.anInt305;
		if (arg0) {
			local9 = this.anInt309;
			local6 = this.anInt317;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(24) boolean local24 = true;
		if (!Static12.aClass60_1.method2317(local6, 0)) {
			local24 = false;
		}
		if (local9 != -1 && !Static12.aClass60_1.method2317(local9, 0)) {
			local24 = false;
		}
		return local24;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZB)Lclient!ai;")
	public Class6_Sub1 method228(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt305;
		@Pc(11) int local11 = this.anInt314;
		if (arg0) {
			local11 = this.anInt317;
			local8 = this.anInt309;
		}
		if (local11 == -1) {
			return null;
		}
		@Pc(29) Class6_Sub1 local29 = Static10.method193(Static12.aClass60_1, local11);
		if (local8 != -1) {
			@Pc(37) Class6_Sub1 local37 = Static10.method193(Static12.aClass60_1, local8);
			@Pc(48) Class6_Sub1[] local48 = new Class6_Sub1[] { local29, local37 };
			local29 = new Class6_Sub1(local48, 2);
		}
		@Pc(59) int local59;
		if (this.aShortArray16 != null) {
			for (local59 = 0; local59 < this.aShortArray16.length; local59++) {
				local29.method199(this.aShortArray16[local59], this.aShortArray15[local59]);
			}
		}
		if (this.aShortArray13 != null) {
			for (local59 = 0; local59 < this.aShortArray13.length; local59++) {
				local29.method192(this.aShortArray13[local59], this.aShortArray14[local59]);
			}
		}
		return local29;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ)Lclient!ai;")
	public Class6_Sub1 method229(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt287;
		@Pc(9) int local9 = this.anInt324;
		@Pc(12) int local12 = this.anInt299;
		if (arg0) {
			local12 = this.anInt297;
			local9 = this.anInt319;
			local6 = this.anInt282;
		}
		if (local6 == -1) {
			return null;
		}
		@Pc(35) Class6_Sub1 local35 = Static10.method193(Static12.aClass60_1, local6);
		if (local12 != -1) {
			@Pc(44) Class6_Sub1 local44 = Static10.method193(Static12.aClass60_1, local12);
			if (local9 == -1) {
				@Pc(58) Class6_Sub1[] local58 = new Class6_Sub1[] { local35, local44 };
				local35 = new Class6_Sub1(local58, 2);
			} else {
				@Pc(70) Class6_Sub1 local70 = Static10.method193(Static12.aClass60_1, local9);
				@Pc(85) Class6_Sub1[] local85 = new Class6_Sub1[] { local35, local44, local70 };
				local35 = new Class6_Sub1(local85, 3);
			}
		}
		if (!arg0 && this.anInt283 != 0) {
			local35.method185(0, this.anInt283, 0);
		}
		if (arg0 && this.anInt302 != 0) {
			local35.method185(0, this.anInt302, 0);
		}
		@Pc(124) int local124;
		if (this.aShortArray16 != null) {
			for (local124 = 0; local124 < this.aShortArray16.length; local124++) {
				local35.method199(this.aShortArray16[local124], this.aShortArray15[local124]);
			}
		}
		if (this.aShortArray13 != null) {
			for (local124 = 0; local124 < this.aShortArray13.length; local124++) {
				local35.method192(this.aShortArray13[local124], this.aShortArray14[local124]);
			}
		}
		return local35;
	}
}
