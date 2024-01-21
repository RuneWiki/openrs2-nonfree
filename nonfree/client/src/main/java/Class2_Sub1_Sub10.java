import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class2_Sub1_Sub10 extends Class2_Sub1 {

	@OriginalMember(owner = "client!lf", name = "D", descriptor = "[I")
	private int[] anIntArray231;

	@OriginalMember(owner = "client!lf", name = "L", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
	public int anInt2219;

	@OriginalMember(owner = "client!lf", name = "bb", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!lf", name = "mb", descriptor = "[I")
	public int[] anIntArray234;

	@OriginalMember(owner = "client!lf", name = "pb", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!lf", name = "ub", descriptor = "[I")
	public int[] anIntArray235;

	@OriginalMember(owner = "client!lf", name = "xb", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!lf", name = "yb", descriptor = "[I")
	private int[] anIntArray236;

	@OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
	public int anInt2210 = 1;

	@OriginalMember(owner = "client!lf", name = "O", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
	private int anInt2214 = 0;

	@OriginalMember(owner = "client!lf", name = "U", descriptor = "Z")
	public boolean aBoolean96 = false;

	@OriginalMember(owner = "client!lf", name = "Z", descriptor = "Z")
	public boolean aBoolean97 = false;

	@OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
	public int anInt2212 = -1;

	@OriginalMember(owner = "client!lf", name = "hb", descriptor = "I")
	public int anInt2226 = 0;

	@OriginalMember(owner = "client!lf", name = "jb", descriptor = "I")
	private int anInt2227 = 0;

	@OriginalMember(owner = "client!lf", name = "ib", descriptor = "[Lclient!cd;")
	public final Class10[] aClass10Array16 = new Class10[5];

	@OriginalMember(owner = "client!lf", name = "rb", descriptor = "I")
	public int anInt2231 = -1;

	@OriginalMember(owner = "client!lf", name = "R", descriptor = "Z")
	public boolean aBoolean94 = true;

	@OriginalMember(owner = "client!lf", name = "db", descriptor = "I")
	private int anInt2222 = 0;

	@OriginalMember(owner = "client!lf", name = "kb", descriptor = "Z")
	public boolean aBoolean99 = true;

	@OriginalMember(owner = "client!lf", name = "cb", descriptor = "Z")
	private boolean aBoolean98 = false;

	@OriginalMember(owner = "client!lf", name = "lb", descriptor = "I")
	private int anInt2228 = -1;

	@OriginalMember(owner = "client!lf", name = "vb", descriptor = "I")
	public int anInt2234 = -1;

	@OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
	public int anInt2218 = -1;

	@OriginalMember(owner = "client!lf", name = "Y", descriptor = "I")
	public int anInt2220 = 2;

	@OriginalMember(owner = "client!lf", name = "wb", descriptor = "I")
	private int anInt2235 = -1;

	@OriginalMember(owner = "client!lf", name = "ob", descriptor = "Lclient!cd;")
	public Class10 aClass10_939 = Static110.aClass10_1094;

	@OriginalMember(owner = "client!lf", name = "Cb", descriptor = "I")
	private int anInt2238 = 128;

	@OriginalMember(owner = "client!lf", name = "zb", descriptor = "I")
	public int anInt2236 = 0;

	@OriginalMember(owner = "client!lf", name = "gb", descriptor = "I")
	public int anInt2225 = 1;

	@OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
	private int anInt2211 = 128;

	@OriginalMember(owner = "client!lf", name = "Ab", descriptor = "Z")
	public boolean aBoolean100 = false;

	@OriginalMember(owner = "client!lf", name = "Jb", descriptor = "I")
	public int anInt2245 = -1;

	@OriginalMember(owner = "client!lf", name = "Eb", descriptor = "I")
	public int anInt2240 = 16;

	@OriginalMember(owner = "client!lf", name = "Lb", descriptor = "I")
	public int anInt2247 = -1;

	@OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
	private int anInt2213 = 0;

	@OriginalMember(owner = "client!lf", name = "Ib", descriptor = "I")
	private int anInt2244 = 0;

	@OriginalMember(owner = "client!lf", name = "Gb", descriptor = "I")
	public int anInt2242 = 0;

	@OriginalMember(owner = "client!lf", name = "Hb", descriptor = "I")
	private int anInt2243 = -1;

	@OriginalMember(owner = "client!lf", name = "Kb", descriptor = "I")
	private int anInt2246 = 128;

	@OriginalMember(owner = "client!lf", name = "Nb", descriptor = "I")
	public int anInt2249 = 0;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIB[[II)Lclient!bh;")
	public Class2_Sub1_Sub3_Sub3 method1574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) int arg5) {
		@Pc(15) long local15;
		if (this.anIntArray231 == null) {
			local15 = (this.anInt2219 << 10) + arg5;
		} else {
			local15 = (arg3 << 3) + (this.anInt2219 << 10) + arg5;
		}
		@Pc(42) Class2_Sub1_Sub3_Sub3 local42 = (Class2_Sub1_Sub3_Sub3) Static119.aClass72_20.method2259(local15);
		if (local42 == null) {
			@Pc(50) Class2_Sub1_Sub3_Sub7 local50 = this.method1577(arg3, arg5);
			if (local50 == null) {
				return null;
			}
			local42 = local50.method2565(this.anInt2213 + 64, 768 - -(this.anInt2222 * 5), -50, -10, -50, this.anInt2228 >= 0);
			Static119.aClass72_20.method2254(local42, local15);
		}
		if (this.anInt2228 >= 0) {
			local42 = local42.method814(arg4, arg1, arg0, arg2, true, this.anInt2228);
		}
		return local42;
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
	public void method1575() {
		if (this.anInt2212 == -1) {
			this.anInt2212 = 0;
			if (this.anIntArray236 != null && (this.anIntArray231 == null || this.anIntArray231[0] == 10)) {
				this.anInt2212 = 1;
			}
			for (@Pc(27) int local27 = 0; local27 < 5; local27++) {
				if (this.aClass10Array16[local27] != null) {
					this.anInt2212 = 1;
				}
			}
		}
		if (this.anInt2247 == -1) {
			this.anInt2247 = this.anInt2220 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)Z")
	public boolean method1576() {
		if (this.anIntArray234 == null) {
			return this.anInt2245 != -1 || this.anIntArray235 != null;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anIntArray234.length; local27++) {
			if (this.anIntArray234[local27] != -1) {
				@Pc(43) Class2_Sub1_Sub10 local43 = Static62.method1106(this.anIntArray234[local27]);
				if (local43.anInt2245 != -1 || local43.anIntArray235 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BII)Lclient!v;")
	private Class2_Sub1_Sub3_Sub7 method1577(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class2_Sub1_Sub3_Sub7 local3 = null;
		@Pc(27) boolean local27;
		@Pc(24) int local24;
		@Pc(43) int local43;
		@Pc(49) int local49;
		if (this.anIntArray231 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray236 == null) {
				return null;
			}
			local24 = this.anIntArray236.length;
			local27 = this.aBoolean98;
			if (arg0 == 2 && arg1 > 3) {
				local27 = !local27;
			}
			for (local43 = 0; local43 < local24; local43++) {
				local49 = this.anIntArray236[local43];
				if (local27) {
					local49 += 65536;
				}
				local3 = (Class2_Sub1_Sub3_Sub7) Static24.aClass72_3.method2259((long) local49);
				if (local3 == null) {
					local3 = Static166.method2551(Static168.aClass29_69, local49 & 0xFFFF);
					if (local3 == null) {
						return null;
					}
					if (local27) {
						local3.method2564();
					}
					Static24.aClass72_3.method2254(local3, (long) local49);
				}
				if (local24 > 1) {
					Static7.aClass2_Sub1_Sub3_Sub7Array1[local43] = local3;
				}
			}
			if (local24 > 1) {
				local3 = new Class2_Sub1_Sub3_Sub7(Static7.aClass2_Sub1_Sub3_Sub7Array1, local24);
			}
		} else {
			@Pc(110) int local110 = -1;
			for (local24 = 0; local24 < this.anIntArray231.length; local24++) {
				if (arg0 == this.anIntArray231[local24]) {
					local110 = local24;
					break;
				}
			}
			if (local110 == -1) {
				return null;
			}
			@Pc(148) boolean local148 = this.aBoolean98 ^ arg1 > 3;
			local43 = this.anIntArray236[local110];
			if (local148) {
				local43 += 65536;
			}
			local3 = (Class2_Sub1_Sub3_Sub7) Static24.aClass72_3.method2259((long) local43);
			if (local3 == null) {
				local3 = Static166.method2551(Static168.aClass29_69, local43 & 0xFFFF);
				if (local3 == null) {
					return null;
				}
				if (local148) {
					local3.method2564();
				}
				Static24.aClass72_3.method2254(local3, (long) local43);
			}
		}
		if (this.anInt2246 == 128 && this.anInt2211 == 128 && this.anInt2238 == 128) {
			local27 = false;
		} else {
			local27 = true;
		}
		@Pc(233) boolean local233;
		if (this.anInt2227 == 0 && this.anInt2214 == 0 && this.anInt2244 == 0) {
			local233 = false;
		} else {
			local233 = true;
		}
		@Pc(267) Class2_Sub1_Sub3_Sub7 local267 = new Class2_Sub1_Sub3_Sub7(local3, arg1 == 0 && !local27 && !local233, this.aShortArray18 == null, this.aShortArray20 == null, true);
		if (arg0 == 4 && arg1 > 3) {
			local267.method2556();
			local267.method2555(45, 0, -45);
		}
		@Pc(285) int local285 = arg1 & 0x3;
		if (local285 == 1) {
			local267.method2568();
		} else if (local285 == 2) {
			local267.method2550();
		} else if (local285 == 3) {
			local267.method2553();
		}
		if (this.aShortArray18 != null) {
			for (local49 = 0; local49 < this.aShortArray18.length; local49++) {
				local267.method2566(this.aShortArray18[local49], this.aShortArray19[local49]);
			}
		}
		if (this.aShortArray20 != null) {
			for (local49 = 0; local49 < this.aShortArray20.length; local49++) {
				local267.method2567(this.aShortArray20[local49], this.aShortArray21[local49]);
			}
		}
		if (local27) {
			local267.method2547(this.anInt2246, this.anInt2211, this.anInt2238);
		}
		if (local233) {
			local267.method2555(this.anInt2227, this.anInt2214, this.anInt2244);
		}
		return local267;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBLclient!va;)V")
	private void method1578(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		@Pc(19) int local19;
		@Pc(36) int local36;
		if (arg0 == 1) {
			local19 = arg1.method1461();
			if (local19 > 0) {
				if (this.anIntArray236 != null && !Static80.aBoolean81) {
					arg1.anInt2077 += local19 * 3;
					return;
				}
				this.anIntArray231 = new int[local19];
				this.anIntArray236 = new int[local19];
				for (local36 = 0; local36 < local19; local36++) {
					this.anIntArray236[local36] = arg1.method1456();
					this.anIntArray231[local36] = arg1.method1461();
				}
				return;
			}
		} else if (arg0 == 2) {
			this.aClass10_939 = arg1.method1452();
		} else if (arg0 == 5) {
			local19 = arg1.method1461();
			if (local19 > 0) {
				if (this.anIntArray236 != null && !Static80.aBoolean81) {
					arg1.anInt2077 += local19 * 2;
					return;
				}
				this.anIntArray236 = new int[local19];
				this.anIntArray231 = null;
				for (local36 = 0; local36 < local19; local36++) {
					this.anIntArray236[local36] = arg1.method1456();
				}
				return;
			}
		} else if (arg0 == 14) {
			this.anInt2225 = arg1.method1461();
			return;
		} else if (arg0 == 15) {
			this.anInt2210 = arg1.method1461();
			return;
		} else if (arg0 == 17) {
			this.anInt2220 = 0;
			this.aBoolean94 = false;
			return;
		} else if (arg0 == 18) {
			this.aBoolean94 = false;
			return;
		} else if (arg0 == 19) {
			this.anInt2212 = arg1.method1461();
			return;
		} else if (arg0 == 21) {
			this.anInt2228 = 0;
			return;
		} else if (arg0 == 22) {
			this.aBoolean93 = true;
			return;
		} else {
			if (arg0 == 23) {
				this.aBoolean96 = true;
			} else if (arg0 == 24) {
				this.anInt2231 = arg1.method1456();
				if (this.anInt2231 == 65535) {
					this.anInt2231 = -1;
					return;
				}
			} else if (arg0 == 27) {
				this.anInt2220 = 1;
				return;
			} else {
				if (arg0 == 28) {
					this.anInt2240 = arg1.method1461();
				} else if (arg0 == 29) {
					this.anInt2213 = arg1.method1463();
					return;
				} else if (arg0 == 39) {
					this.anInt2222 = arg1.method1463() * 5;
					return;
				} else if (arg0 >= 30 && arg0 < 35) {
					this.aClass10Array16[arg0 - 30] = arg1.method1452();
					if (this.aClass10Array16[arg0 - 30].method343(Static2.aClass10_32)) {
						this.aClass10Array16[arg0 - 30] = null;
						return;
					}
				} else if (arg0 == 40) {
					local19 = arg1.method1461();
					this.aShortArray18 = new short[local19];
					this.aShortArray19 = new short[local19];
					for (local36 = 0; local36 < local19; local36++) {
						this.aShortArray18[local36] = (short) arg1.method1456();
						this.aShortArray19[local36] = (short) arg1.method1456();
					}
					return;
				} else if (arg0 == 41) {
					local19 = arg1.method1461();
					this.aShortArray20 = new short[local19];
					this.aShortArray21 = new short[local19];
					for (local36 = 0; local36 < local19; local36++) {
						this.aShortArray20[local36] = (short) arg1.method1456();
						this.aShortArray21[local36] = (short) arg1.method1456();
					}
					return;
				} else if (arg0 == 60) {
					this.anInt2218 = arg1.method1456();
					return;
				} else if (arg0 == 62) {
					this.aBoolean98 = true;
					return;
				} else if (arg0 == 64) {
					this.aBoolean99 = false;
					return;
				} else if (arg0 == 65) {
					this.anInt2246 = arg1.method1456();
					return;
				} else if (arg0 == 66) {
					this.anInt2211 = arg1.method1456();
					return;
				} else if (arg0 == 67) {
					this.anInt2238 = arg1.method1456();
					return;
				} else if (arg0 == 68) {
					this.anInt2234 = arg1.method1456();
					return;
				} else if (arg0 == 69) {
					this.anInt2242 = arg1.method1461();
					return;
				} else if (arg0 == 70) {
					this.anInt2227 = arg1.method1455();
					return;
				} else if (arg0 == 71) {
					this.anInt2214 = arg1.method1455();
					return;
				} else if (arg0 == 72) {
					this.anInt2244 = arg1.method1455();
					return;
				} else if (arg0 == 73) {
					this.aBoolean97 = true;
					return;
				} else if (arg0 == 74) {
					this.aBoolean100 = true;
					return;
				} else if (arg0 == 75) {
					this.anInt2247 = arg1.method1461();
					return;
				} else if (arg0 == 77) {
					this.anInt2235 = arg1.method1456();
					if (this.anInt2235 == 65535) {
						this.anInt2235 = -1;
					}
					this.anInt2243 = arg1.method1456();
					if (this.anInt2243 == 65535) {
						this.anInt2243 = -1;
					}
					local19 = arg1.method1461();
					this.anIntArray234 = new int[local19 + 1];
					for (local36 = 0; local36 <= local19; local36++) {
						this.anIntArray234[local36] = arg1.method1456();
						if (this.anIntArray234[local36] == 65535) {
							this.anIntArray234[local36] = -1;
						}
					}
					return;
				} else if (arg0 == 78) {
					this.anInt2245 = arg1.method1456();
					this.anInt2236 = arg1.method1461();
					return;
				} else {
					if (arg0 == 79) {
						this.anInt2249 = arg1.method1456();
						this.anInt2226 = arg1.method1456();
						this.anInt2236 = arg1.method1461();
						local19 = arg1.method1461();
						this.anIntArray235 = new int[local19];
						for (local36 = 0; local36 < local19; local36++) {
							this.anIntArray235[local36] = arg1.method1456();
						}
					} else if (arg0 == 81) {
						this.anInt2228 = arg1.method1461() * 256;
						return;
					}
					return;
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)Lclient!lf;")
	public Class2_Sub1_Sub10 method1580() {
		@Pc(5) int local5 = -1;
		if (this.anInt2235 != -1) {
			local5 = Static26.method592(this.anInt2235);
		} else if (this.anInt2243 != -1) {
			local5 = Static51.anIntArray143[this.anInt2243];
		}
		return local5 < 0 || this.anIntArray234.length <= local5 || this.anIntArray234[local5] == -1 ? null : Static62.method1106(this.anIntArray234[local5]);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(BI)Z")
	public boolean method1581(@OriginalArg(1) int arg0) {
		if (this.anIntArray231 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray231.length; local15++) {
				if (arg0 == this.anIntArray231[local15]) {
					return Static168.aClass29_69.method1016(this.anIntArray236[local15] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray236 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(62) boolean local62 = true;
			for (@Pc(64) int local64 = 0; local64 < this.anIntArray236.length; local64++) {
				local62 &= Static168.aClass29_69.method1016(this.anIntArray236[local64] & 0xFFFF, 0);
			}
			return local62;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLclient!va;)V")
	public void method1582(@OriginalArg(1) Class2_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1461();
			if (local9 == 0) {
				return;
			}
			this.method1578(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III[[IIII)Lclient!sh;")
	public Class2_Sub1_Sub3 method1583(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(23) long local23;
		if (this.anIntArray231 == null) {
			local23 = (this.anInt2219 << 10) + arg1;
		} else {
			local23 = (this.anInt2219 << 10) - (-(arg4 << 3) - arg1);
		}
		@Pc(45) Class2_Sub1_Sub3 local45 = (Class2_Sub1_Sub3) Static27.aClass72_6.method2259(local23);
		if (local45 == null) {
			@Pc(53) Class2_Sub1_Sub3_Sub7 local53 = this.method1577(arg4, arg1);
			if (local53 == null) {
				return null;
			}
			if (this.aBoolean93) {
				local45 = local53;
				local53.aShort1 = (short) (this.anInt2222 * 5 + 768);
				local53.aShort2 = (short) (this.anInt2213 + 64);
				local53.method2549();
			} else {
				local45 = local53.method2565(this.anInt2213 + 64, this.anInt2222 * 5 + 768, -50, -10, -50, ~this.anInt2228 <= -1);
			}
			Static27.aClass72_6.method2254(local45, local23);
		}
		if (this.aBoolean93) {
			local45 = ((Class2_Sub1_Sub3_Sub7) local45).method2562();
		}
		if (this.anInt2228 >= 0) {
			if (local45 instanceof Class2_Sub1_Sub3_Sub3) {
				local45 = ((Class2_Sub1_Sub3_Sub3) local45).method814(arg2, arg5, arg3, arg0, true, this.anInt2228);
			} else if (local45 instanceof Class2_Sub1_Sub3_Sub7) {
				local45 = ((Class2_Sub1_Sub3_Sub7) local45).method2563(arg2, arg5, arg3, arg0, this.anInt2228);
			}
		}
		return local45;
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)Z")
	public boolean method1585() {
		if (this.anIntArray236 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray236.length; local14++) {
			local12 &= Static168.aClass29_69.method1016(this.anIntArray236[local14] & 0xFFFF, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BIIILclient!ke;I[[III)Lclient!bh;")
	public Class2_Sub1_Sub3_Sub3 method1586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub1_Sub9 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(17) long local17;
		if (this.anIntArray231 == null) {
			local17 = (this.anInt2219 << 10) + arg4;
		} else {
			local17 = arg4 + (this.anInt2219 << 10) + (arg7 << 3);
		}
		@Pc(37) Class2_Sub1_Sub3_Sub3 local37 = (Class2_Sub1_Sub3_Sub3) Static48.aClass72_12.method2259(local17);
		if (local37 == null) {
			@Pc(45) Class2_Sub1_Sub3_Sub7 local45 = this.method1577(arg7, arg4);
			if (local45 == null) {
				return null;
			}
			local37 = local45.method2565(this.anInt2213 + 64, 768 - -(this.anInt2222 * 5), -50, -10, -50, true);
			Static48.aClass72_12.method2254(local37, local17);
		}
		if (arg3 == null && this.anInt2228 == -1) {
			return local37;
		}
		if (arg3 == null) {
			local37 = local37.method809(true);
		} else {
			local37 = arg3.method1368(local37, arg4, arg6);
		}
		if (this.anInt2228 >= 0) {
			local37 = local37.method814(arg5, arg2, arg1, arg0, false, this.anInt2228);
		}
		return local37;
	}
}
