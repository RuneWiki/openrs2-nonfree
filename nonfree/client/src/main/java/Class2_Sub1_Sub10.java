import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class2_Sub1_Sub10 extends Class2_Sub1 {

	@OriginalMember(owner = "client!of", name = "lb", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!of", name = "qb", descriptor = "[I")
	public int[] anIntArray247;

	@OriginalMember(owner = "client!of", name = "ub", descriptor = "I")
	public int anInt2230;

	@OriginalMember(owner = "client!of", name = "zb", descriptor = "[I")
	public int[] anIntArray248;

	@OriginalMember(owner = "client!of", name = "Mb", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!of", name = "Wb", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!of", name = "Zb", descriptor = "I")
	private int anInt2254;

	@OriginalMember(owner = "client!of", name = "dc", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!of", name = "V", descriptor = "I")
	private int anInt2217 = -1;

	@OriginalMember(owner = "client!of", name = "Z", descriptor = "I")
	private int anInt2220 = 0;

	@OriginalMember(owner = "client!of", name = "cb", descriptor = "I")
	public int anInt2222 = 0;

	@OriginalMember(owner = "client!of", name = "jb", descriptor = "I")
	public int anInt2225 = 0;

	@OriginalMember(owner = "client!of", name = "X", descriptor = "I")
	public int anInt2218 = 0;

	@OriginalMember(owner = "client!of", name = "vb", descriptor = "I")
	private int anInt2231 = 128;

	@OriginalMember(owner = "client!of", name = "kb", descriptor = "I")
	public int anInt2226 = 0;

	@OriginalMember(owner = "client!of", name = "fb", descriptor = "Lclient!je;")
	public Class40 aClass40_1161 = Static86.aClass40_1631;

	@OriginalMember(owner = "client!of", name = "mb", descriptor = "Z")
	public boolean aBoolean171 = false;

	@OriginalMember(owner = "client!of", name = "T", descriptor = "I")
	public int anInt2215 = -1;

	@OriginalMember(owner = "client!of", name = "Qb", descriptor = "I")
	private int anInt2246 = -1;

	@OriginalMember(owner = "client!of", name = "Sb", descriptor = "I")
	public int anInt2248 = 0;

	@OriginalMember(owner = "client!of", name = "U", descriptor = "I")
	public int anInt2216 = 0;

	@OriginalMember(owner = "client!of", name = "yb", descriptor = "I")
	private int anInt2233 = -1;

	@OriginalMember(owner = "client!of", name = "gb", descriptor = "[Lclient!je;")
	public Class40[] aClass40Array14 = new Class40[] { null, null, null, null, Static80.aClass40_1055 };

	@OriginalMember(owner = "client!of", name = "Bb", descriptor = "I")
	private int anInt2235 = -1;

	@OriginalMember(owner = "client!of", name = "Eb", descriptor = "I")
	private int anInt2238 = -1;

	@OriginalMember(owner = "client!of", name = "Cb", descriptor = "I")
	private int anInt2236 = -1;

	@OriginalMember(owner = "client!of", name = "hb", descriptor = "I")
	private int anInt2223 = 128;

	@OriginalMember(owner = "client!of", name = "ib", descriptor = "I")
	public int anInt2224 = 0;

	@OriginalMember(owner = "client!of", name = "cc", descriptor = "I")
	private int anInt2255 = 0;

	@OriginalMember(owner = "client!of", name = "Ab", descriptor = "I")
	private int anInt2234 = -1;

	@OriginalMember(owner = "client!of", name = "Hb", descriptor = "I")
	private int anInt2241 = -1;

	@OriginalMember(owner = "client!of", name = "Yb", descriptor = "I")
	public int anInt2253 = -1;

	@OriginalMember(owner = "client!of", name = "ec", descriptor = "[Lclient!je;")
	public Class40[] aClass40Array15 = new Class40[] { null, null, Static106.aClass40_1363, null, null };

	@OriginalMember(owner = "client!of", name = "ob", descriptor = "I")
	private int anInt2227 = -1;

	@OriginalMember(owner = "client!of", name = "Vb", descriptor = "I")
	private int anInt2251 = 128;

	@OriginalMember(owner = "client!of", name = "fc", descriptor = "I")
	private int anInt2256 = -1;

	@OriginalMember(owner = "client!of", name = "Gb", descriptor = "I")
	public int anInt2240 = 0;

	@OriginalMember(owner = "client!of", name = "gc", descriptor = "I")
	public int anInt2257 = 1;

	@OriginalMember(owner = "client!of", name = "Fb", descriptor = "I")
	public int anInt2239 = 2000;

	@OriginalMember(owner = "client!of", name = "hc", descriptor = "I")
	public int anInt2258 = 0;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)Lclient!of;")
	public Class2_Sub1_Sub10 method1567(@OriginalArg(0) int arg0) {
		if (this.anIntArray247 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (arg0 >= this.anIntArray248[local15] && this.anIntArray248[local15] != 0) {
					local13 = this.anIntArray247[local15];
				}
			}
			if (local13 != -1) {
				return Static102.method1800(local13);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)Lclient!wc;")
	public Class2_Sub1_Sub1_Sub7 method1568(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt2234;
		@Pc(11) int local11 = this.anInt2238;
		if (arg0) {
			local8 = this.anInt2256;
			local11 = this.anInt2236;
		}
		if (local11 == -1) {
			return null;
		}
		@Pc(29) Class2_Sub1_Sub1_Sub7 local29 = Static131.method2175(Static8.aClass24_4, local11);
		if (local8 != -1) {
			@Pc(38) Class2_Sub1_Sub1_Sub7 local38 = Static131.method2175(Static8.aClass24_4, local8);
			@Pc(49) Class2_Sub1_Sub1_Sub7[] local49 = new Class2_Sub1_Sub1_Sub7[] { local29, local38 };
			local29 = new Class2_Sub1_Sub1_Sub7(local49, 2);
		}
		@Pc(60) int local60;
		if (this.aShortArray12 != null) {
			for (local60 = 0; local60 < this.aShortArray12.length; local60++) {
				local29.method2184(this.aShortArray12[local60], this.aShortArray11[local60]);
			}
		}
		if (this.aShortArray14 != null) {
			for (local60 = 0; local60 < this.aShortArray14.length; local60++) {
				local29.method2191(this.aShortArray14[local60], this.aShortArray13[local60]);
			}
		}
		return local29;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Lclient!wc;")
	public Class2_Sub1_Sub1_Sub7 method1569(@OriginalArg(0) int arg0) {
		@Pc(22) int local22;
		if (this.anIntArray247 != null && arg0 > 1) {
			@Pc(20) int local20 = -1;
			for (local22 = 0; local22 < 10; local22++) {
				if (arg0 >= this.anIntArray248[local22] && this.anIntArray248[local22] != 0) {
					local20 = this.anIntArray247[local22];
				}
			}
			if (local20 != -1) {
				return Static102.method1800(local20).method1569(1);
			}
		}
		@Pc(68) Class2_Sub1_Sub1_Sub7 local68 = Static131.method2175(Static8.aClass24_4, this.anInt2254);
		if (local68 == null) {
			return null;
		}
		if (this.anInt2251 != 128 || this.anInt2223 != 128 || this.anInt2231 != 128) {
			local68.method2181(this.anInt2251, this.anInt2223, this.anInt2231);
		}
		if (this.aShortArray12 != null) {
			for (local22 = 0; local22 < this.aShortArray12.length; local22++) {
				local68.method2184(this.aShortArray12[local22], this.aShortArray11[local22]);
			}
		}
		if (this.aShortArray14 != null) {
			for (local22 = 0; local22 < this.aShortArray14.length; local22++) {
				local68.method2191(this.aShortArray14[local22], this.aShortArray13[local22]);
			}
		}
		return local68;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!na;B)V")
	public void method1570(@OriginalArg(0) Class2_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method640();
			if (local5 == 0) {
				return;
			}
			this.method1573(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!na;ZI)V")
	private void method1573(@OriginalArg(0) Class2_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2254 = arg0.method632();
		} else if (arg1 == 2) {
			this.aClass40_1161 = arg0.method625();
		} else if (arg1 == 4) {
			this.anInt2239 = arg0.method632();
		} else if (arg1 == 5) {
			this.anInt2248 = arg0.method632();
		} else if (arg1 == 6) {
			this.anInt2240 = arg0.method632();
		} else if (arg1 == 7) {
			this.anInt2224 = arg0.method632();
			if (this.anInt2224 > 32767) {
				this.anInt2224 -= 65536;
			}
		} else if (arg1 == 8) {
			this.anInt2218 = arg0.method632();
			if (this.anInt2218 > 32767) {
				this.anInt2218 -= 65536;
				return;
			}
		} else if (arg1 == 11) {
			this.anInt2258 = 1;
			return;
		} else if (arg1 == 12) {
			this.anInt2257 = arg0.method622();
			return;
		} else if (arg1 == 16) {
			this.aBoolean171 = true;
		} else if (arg1 == 23) {
			this.anInt2235 = arg0.method632();
			this.anInt2220 = arg0.method640();
			return;
		} else if (arg1 == 24) {
			this.anInt2233 = arg0.method632();
			return;
		} else if (arg1 == 25) {
			this.anInt2246 = arg0.method632();
			this.anInt2255 = arg0.method640();
			return;
		} else if (arg1 == 26) {
			this.anInt2227 = arg0.method632();
			return;
		} else {
			if (arg1 >= 30 && arg1 < 35) {
				this.aClass40Array15[arg1 - 30] = arg0.method625();
				if (this.aClass40Array15[arg1 - 30].method984(Static133.aClass40_1647)) {
					this.aClass40Array15[arg1 - 30] = null;
					return;
				}
			} else if (arg1 < 35 || arg1 >= 40) {
				@Pc(216) int local216;
				@Pc(226) int local226;
				if (arg1 == 40) {
					local216 = arg0.method640();
					this.aShortArray12 = new short[local216];
					this.aShortArray11 = new short[local216];
					for (local226 = 0; local226 < local216; local226++) {
						this.aShortArray12[local226] = (short) arg0.method632();
						this.aShortArray11[local226] = (short) arg0.method632();
					}
					return;
				}
				if (arg1 != 41) {
					if (arg1 != 78) {
						if (arg1 == 79) {
							this.anInt2217 = arg0.method632();
							return;
						}
						if (arg1 != 90) {
							if (arg1 != 91) {
								if (arg1 == 92) {
									this.anInt2234 = arg0.method632();
									return;
								}
								if (arg1 != 93) {
									if (arg1 != 95) {
										if (arg1 == 97) {
											this.anInt2253 = arg0.method632();
											return;
										}
										if (arg1 != 98) {
											if (arg1 >= 100 && arg1 < 110) {
												if (this.anIntArray247 == null) {
													this.anIntArray248 = new int[10];
													this.anIntArray247 = new int[10];
												}
												this.anIntArray247[arg1 - 100] = arg0.method632();
												this.anIntArray248[arg1 - 100] = arg0.method632();
												return;
											}
											if (arg1 == 110) {
												this.anInt2251 = arg0.method632();
												return;
											}
											if (arg1 == 111) {
												this.anInt2223 = arg0.method632();
												return;
											}
											if (arg1 != 112) {
												if (arg1 == 113) {
													this.anInt2216 = arg0.method658();
													return;
												}
												if (arg1 == 114) {
													this.anInt2226 = arg0.method658() * 5;
												} else if (arg1 == 115) {
													this.anInt2225 = arg0.method640();
													return;
												}
												return;
											}
											this.anInt2231 = arg0.method632();
											return;
										}
										this.anInt2215 = arg0.method632();
										return;
									}
									this.anInt2222 = arg0.method632();
									return;
								}
								this.anInt2256 = arg0.method632();
								return;
							}
							this.anInt2236 = arg0.method632();
							return;
						}
						this.anInt2238 = arg0.method632();
						return;
					}
					this.anInt2241 = arg0.method632();
					return;
				}
				local216 = arg0.method640();
				this.aShortArray14 = new short[local216];
				this.aShortArray13 = new short[local216];
				for (local226 = 0; local226 < local216; local226++) {
					this.aShortArray14[local226] = (short) arg0.method632();
					this.aShortArray13[local226] = (short) arg0.method632();
				}
			} else {
				this.aClass40Array14[arg1 - 35] = arg0.method625();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZZ)Z")
	public boolean method1574(@OriginalArg(0) boolean arg0) {
		@Pc(2) int local2 = this.anInt2233;
		@Pc(9) int local9 = this.anInt2241;
		@Pc(12) int local12 = this.anInt2235;
		if (arg0) {
			local9 = this.anInt2217;
			local2 = this.anInt2227;
			local12 = this.anInt2246;
		}
		if (local12 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static8.aClass24_4.method1924(local12, 0)) {
			local30 = false;
		}
		if (local2 != -1 && !Static8.aClass24_4.method1924(local2, 0)) {
			local30 = false;
		}
		if (local9 != -1 && !Static8.aClass24_4.method1924(local9, 0)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(I)V")
	public void method1575() {
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZB)Z")
	public boolean method1576(@OriginalArg(0) boolean arg0) {
		@Pc(11) int local11 = this.anInt2234;
		@Pc(14) int local14 = this.anInt2238;
		if (arg0) {
			local11 = this.anInt2256;
			local14 = this.anInt2236;
		}
		if (local14 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static8.aClass24_4.method1924(local14, 0)) {
			local30 = false;
		}
		if (local11 != -1 && !Static8.aClass24_4.method1924(local11, 0)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(II)Lclient!ad;")
	public Class2_Sub1_Sub1_Sub2 method1578(@OriginalArg(0) int arg0) {
		if (this.anIntArray247 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (this.anIntArray248[local17] <= arg0 && this.anIntArray248[local17] != 0) {
					local15 = this.anIntArray247[local17];
				}
			}
			if (local15 != -1) {
				return Static102.method1800(local15).method1578(1);
			}
		}
		@Pc(60) Class2_Sub1_Sub1_Sub2 local60 = (Class2_Sub1_Sub1_Sub2) Static32.aClass55_29.method1410((long) this.anInt2230);
		if (local60 != null) {
			return local60;
		}
		@Pc(70) Class2_Sub1_Sub1_Sub7 local70 = Static131.method2175(Static8.aClass24_4, this.anInt2254);
		if (local70 == null) {
			return null;
		}
		if (this.anInt2251 != 128 || this.anInt2223 != 128 || this.anInt2231 != 128) {
			local70.method2181(this.anInt2251, this.anInt2223, this.anInt2231);
		}
		@Pc(105) int local105;
		if (this.aShortArray12 != null) {
			for (local105 = 0; local105 < this.aShortArray12.length; local105++) {
				local70.method2184(this.aShortArray12[local105], this.aShortArray11[local105]);
			}
		}
		if (this.aShortArray14 != null) {
			for (local105 = 0; local105 < this.aShortArray14.length; local105++) {
				local70.method2191(this.aShortArray14[local105], this.aShortArray13[local105]);
			}
		}
		local60 = local70.method2176(this.anInt2216 + 64, this.anInt2226 + 768, -50, -10, -50);
		local60.aBoolean14 = true;
		Static32.aClass55_29.method1411((long) this.anInt2230, local60);
		return local60;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!of;BLclient!of;)V")
	public void method1579(@OriginalArg(0) Class2_Sub1_Sub10 arg0, @OriginalArg(2) Class2_Sub1_Sub10 arg1) {
		this.aShortArray12 = arg0.aShortArray12;
		this.anInt2224 = arg0.anInt2224;
		this.anInt2222 = arg0.anInt2222;
		this.anInt2239 = arg0.anInt2239;
		this.aShortArray14 = arg0.aShortArray14;
		this.anInt2240 = arg0.anInt2240;
		this.anInt2248 = arg0.anInt2248;
		this.aShortArray13 = arg0.aShortArray13;
		this.aClass40_1161 = arg1.aClass40_1161;
		this.anInt2218 = arg0.anInt2218;
		this.anInt2254 = arg0.anInt2254;
		this.anInt2258 = 1;
		this.aBoolean171 = arg1.aBoolean171;
		this.anInt2257 = arg1.anInt2257;
		this.aShortArray11 = arg0.aShortArray11;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(ZI)Lclient!wc;")
	public Class2_Sub1_Sub1_Sub7 method1580(@OriginalArg(0) boolean arg0) {
		@Pc(4) int local4 = this.anInt2235;
		@Pc(11) int local11 = this.anInt2233;
		@Pc(14) int local14 = this.anInt2241;
		if (arg0) {
			local11 = this.anInt2227;
			local14 = this.anInt2217;
			local4 = this.anInt2246;
		}
		if (local4 == -1) {
			return null;
		}
		@Pc(41) Class2_Sub1_Sub1_Sub7 local41 = Static131.method2175(Static8.aClass24_4, local4);
		if (local11 != -1) {
			@Pc(49) Class2_Sub1_Sub1_Sub7 local49 = Static131.method2175(Static8.aClass24_4, local11);
			if (local14 == -1) {
				@Pc(63) Class2_Sub1_Sub1_Sub7[] local63 = new Class2_Sub1_Sub1_Sub7[] { local41, local49 };
				local41 = new Class2_Sub1_Sub1_Sub7(local63, 2);
			} else {
				@Pc(76) Class2_Sub1_Sub1_Sub7 local76 = Static131.method2175(Static8.aClass24_4, local14);
				@Pc(91) Class2_Sub1_Sub1_Sub7[] local91 = new Class2_Sub1_Sub1_Sub7[] { local41, local49, local76 };
				local41 = new Class2_Sub1_Sub1_Sub7(local91, 3);
			}
		}
		if (!arg0 && this.anInt2220 != 0) {
			local41.method2195(0, this.anInt2220, 0);
		}
		if (arg0 && this.anInt2255 != 0) {
			local41.method2195(0, this.anInt2255, 0);
		}
		@Pc(127) int local127;
		if (this.aShortArray12 != null) {
			for (local127 = 0; local127 < this.aShortArray12.length; local127++) {
				local41.method2184(this.aShortArray12[local127], this.aShortArray11[local127]);
			}
		}
		if (this.aShortArray14 != null) {
			for (local127 = 0; local127 < this.aShortArray14.length; local127++) {
				local41.method2191(this.aShortArray14[local127], this.aShortArray13[local127]);
			}
		}
		return local41;
	}
}
