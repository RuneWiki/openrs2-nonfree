import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nd", name = "Cb", descriptor = "[I")
	public static int[] anIntArray340 = new int[32];

	@OriginalMember(owner = "client!nd", name = "ab", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!nd", name = "db", descriptor = "[S")
	private short[] aShortArray59;

	@OriginalMember(owner = "client!nd", name = "lb", descriptor = "[I")
	public int[] anIntArray338;

	@OriginalMember(owner = "client!nd", name = "ob", descriptor = "[I")
	public int[] anIntArray339;

	@OriginalMember(owner = "client!nd", name = "pb", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!nd", name = "qb", descriptor = "I")
	public int anInt2066;

	@OriginalMember(owner = "client!nd", name = "Gb", descriptor = "[I")
	private int[] anIntArray341;

	@OriginalMember(owner = "client!nd", name = "Ub", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!nd", name = "gc", descriptor = "[I")
	private int[] anIntArray343;

	@OriginalMember(owner = "client!nd", name = "W", descriptor = "I")
	public int anInt2054 = -1;

	@OriginalMember(owner = "client!nd", name = "eb", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!nd", name = "hb", descriptor = "I")
	public int anInt2061 = 0;

	@OriginalMember(owner = "client!nd", name = "tb", descriptor = "I")
	private int anInt2068 = 0;

	@OriginalMember(owner = "client!nd", name = "vb", descriptor = "I")
	private int anInt2070 = 0;

	@OriginalMember(owner = "client!nd", name = "wb", descriptor = "I")
	public int anInt2071 = -1;

	@OriginalMember(owner = "client!nd", name = "sb", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!nd", name = "Y", descriptor = "I")
	public int anInt2056 = -1;

	@OriginalMember(owner = "client!nd", name = "Db", descriptor = "[Lclient!sc;")
	public final Class66[] aClass66Array12 = new Class66[5];

	@OriginalMember(owner = "client!nd", name = "Bb", descriptor = "Z")
	public boolean aBoolean83 = false;

	@OriginalMember(owner = "client!nd", name = "zb", descriptor = "Lclient!sc;")
	public Class66 aClass66_1125 = Static105.aClass66_1443;

	@OriginalMember(owner = "client!nd", name = "X", descriptor = "I")
	private int anInt2055 = 0;

	@OriginalMember(owner = "client!nd", name = "fb", descriptor = "I")
	public int anInt2060 = 0;

	@OriginalMember(owner = "client!nd", name = "Qb", descriptor = "I")
	public int anInt2083 = 1;

	@OriginalMember(owner = "client!nd", name = "Eb", descriptor = "I")
	public int anInt2075 = -1;

	@OriginalMember(owner = "client!nd", name = "Ib", descriptor = "I")
	private int anInt2078 = -1;

	@OriginalMember(owner = "client!nd", name = "Mb", descriptor = "Z")
	public boolean aBoolean85 = true;

	@OriginalMember(owner = "client!nd", name = "Xb", descriptor = "Z")
	public boolean aBoolean87 = false;

	@OriginalMember(owner = "client!nd", name = "Wb", descriptor = "I")
	public int anInt2088 = 16;

	@OriginalMember(owner = "client!nd", name = "Pb", descriptor = "Z")
	public boolean aBoolean86 = false;

	@OriginalMember(owner = "client!nd", name = "Yb", descriptor = "I")
	public int anInt2089 = -1;

	@OriginalMember(owner = "client!nd", name = "Nb", descriptor = "I")
	private int anInt2081 = -1;

	@OriginalMember(owner = "client!nd", name = "nb", descriptor = "I")
	public int anInt2065 = 1;

	@OriginalMember(owner = "client!nd", name = "Rb", descriptor = "I")
	public int anInt2084 = 2;

	@OriginalMember(owner = "client!nd", name = "cc", descriptor = "I")
	private int anInt2092 = 0;

	@OriginalMember(owner = "client!nd", name = "Lb", descriptor = "I")
	private int anInt2080 = 128;

	@OriginalMember(owner = "client!nd", name = "Tb", descriptor = "I")
	public int anInt2086 = 0;

	@OriginalMember(owner = "client!nd", name = "Kb", descriptor = "I")
	private int anInt2079 = 128;

	@OriginalMember(owner = "client!nd", name = "kb", descriptor = "I")
	private int anInt2064 = 128;

	@OriginalMember(owner = "client!nd", name = "ec", descriptor = "I")
	public int anInt2094 = 0;

	@OriginalMember(owner = "client!nd", name = "bb", descriptor = "I")
	private int anInt2058 = 0;

	@OriginalMember(owner = "client!nd", name = "ac", descriptor = "I")
	private int anInt2090 = -1;

	@OriginalMember(owner = "client!nd", name = "Jb", descriptor = "Z")
	public boolean aBoolean84 = true;

	@OriginalMember(owner = "client!nd", name = "fc", descriptor = "I")
	public int anInt2095 = -1;

	static {
		@Pc(13) int local13 = 2;
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			anIntArray340[local15] = local13 - 1;
			local13 += local13;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[[IIIBII)Lclient!wc;")
	public Class1_Sub1_Sub1 method1436(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(21) long local21;
		if (this.anIntArray341 == null) {
			local21 = (this.anInt2066 << 10) + arg2;
		} else {
			local21 = (this.anInt2066 << 10) + ((arg0 << 3) + arg2);
		}
		@Pc(37) Class1_Sub1_Sub1 local37 = (Class1_Sub1_Sub1) Static8.aClass60_22.method1745(local21);
		if (local37 == null) {
			@Pc(45) Class1_Sub1_Sub1_Sub7 local45 = this.method1442(arg2, arg0);
			if (local45 == null) {
				return null;
			}
			if (this.aBoolean81) {
				local37 = local45;
				local45.aShort2 = (short) (this.anInt2058 + 64);
				local45.aShort1 = (short) (this.anInt2068 * 5 + 768);
				local45.method1913();
			} else {
				local37 = local45.method1899(this.anInt2058 + 64, this.anInt2068 * 5 + 768, -50, -10, -50);
			}
			Static8.aClass60_22.method1741(local21, local37);
		}
		if (this.aBoolean81) {
			local37 = ((Class1_Sub1_Sub1_Sub7) local37).method1903();
		}
		if (this.anInt2081 >= 0) {
			if (local37 instanceof Class1_Sub1_Sub1_Sub6) {
				local37 = ((Class1_Sub1_Sub1_Sub6) local37).method1328(arg1, arg5, arg4, arg3, true, this.anInt2081);
			} else if (local37 instanceof Class1_Sub1_Sub1_Sub7) {
				local37 = ((Class1_Sub1_Sub1_Sub7) local37).method1919(arg1, arg5, arg4, arg3, this.anInt2081);
			}
		}
		return local37;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILclient!mc;)V")
	private void method1437(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub12 arg1) {
		@Pc(164) int local164;
		@Pc(174) int local174;
		if (arg0 == 1) {
			local164 = arg1.method1190();
			if (local164 > 0) {
				if (this.anIntArray343 == null || Static95.aBoolean103) {
					this.anIntArray343 = new int[local164];
					this.anIntArray341 = new int[local164];
					for (local174 = 0; local174 < local164; local174++) {
						this.anIntArray343[local174] = arg1.method1176();
						this.anIntArray341[local174] = arg1.method1190();
					}
				} else {
					arg1.anInt1694 += local164 * 3;
				}
			}
		} else if (arg0 == 2) {
			this.aClass66_1125 = arg1.method1214();
		} else if (arg0 == 5) {
			local164 = arg1.method1190();
			if (local164 > 0) {
				if (this.anIntArray343 != null && !Static95.aBoolean103) {
					arg1.anInt1694 += local164 * 2;
					return;
				}
				this.anIntArray343 = new int[local164];
				this.anIntArray341 = null;
				for (local174 = 0; local174 < local164; local174++) {
					this.anIntArray343[local174] = arg1.method1176();
				}
				return;
			}
		} else if (arg0 == 14) {
			this.anInt2065 = arg1.method1190();
			return;
		} else if (arg0 == 15) {
			this.anInt2083 = arg1.method1190();
			return;
		} else if (arg0 == 17) {
			this.anInt2084 = 0;
			this.aBoolean85 = false;
			return;
		} else if (arg0 == 18) {
			this.aBoolean85 = false;
			return;
		} else if (arg0 == 19) {
			this.anInt2089 = arg1.method1190();
			return;
		} else if (arg0 == 21) {
			this.anInt2081 = 0;
			return;
		} else if (arg0 == 22) {
			this.aBoolean81 = true;
			return;
		} else if (arg0 == 23) {
			this.aBoolean87 = true;
			return;
		} else {
			if (arg0 == 24) {
				this.anInt2075 = arg1.method1176();
				if (this.anInt2075 == 65535) {
					this.anInt2075 = -1;
					return;
				}
			} else if (arg0 == 27) {
				this.anInt2084 = 1;
				return;
			} else if (arg0 == 28) {
				this.anInt2088 = arg1.method1190();
				return;
			} else if (arg0 == 29) {
				this.anInt2058 = arg1.method1211();
			} else if (arg0 == 39) {
				this.anInt2068 = arg1.method1211() * 5;
				return;
			} else {
				if (arg0 >= 30 && arg0 < 35) {
					this.aClass66Array12[arg0 - 30] = arg1.method1214();
					if (this.aClass66Array12[arg0 - 30].method1843(Static39.aClass66_615)) {
						this.aClass66Array12[arg0 - 30] = null;
						return;
					}
				} else if (arg0 == 40) {
					local164 = arg1.method1190();
					this.aShortArray60 = new short[local164];
					this.aShortArray61 = new short[local164];
					for (local174 = 0; local174 < local164; local174++) {
						this.aShortArray60[local174] = (short) arg1.method1176();
						this.aShortArray61[local174] = (short) arg1.method1176();
					}
					return;
				} else if (arg0 == 41) {
					local164 = arg1.method1190();
					this.aShortArray59 = new short[local164];
					this.aShortArray58 = new short[local164];
					for (local174 = 0; local174 < local164; local174++) {
						this.aShortArray59[local174] = (short) arg1.method1176();
						this.aShortArray58[local174] = (short) arg1.method1176();
					}
				} else if (arg0 == 60) {
					this.anInt2095 = arg1.method1176();
					return;
				} else if (arg0 == 62) {
					this.aBoolean82 = true;
					return;
				} else if (arg0 == 64) {
					this.aBoolean84 = false;
					return;
				} else if (arg0 == 65) {
					this.anInt2064 = arg1.method1176();
					return;
				} else if (arg0 == 66) {
					this.anInt2079 = arg1.method1176();
					return;
				} else if (arg0 == 67) {
					this.anInt2080 = arg1.method1176();
					return;
				} else if (arg0 == 68) {
					this.anInt2071 = arg1.method1176();
					return;
				} else if (arg0 == 69) {
					this.anInt2061 = arg1.method1190();
					return;
				} else if (arg0 == 70) {
					this.anInt2070 = arg1.method1181();
					return;
				} else if (arg0 == 71) {
					this.anInt2092 = arg1.method1181();
					return;
				} else if (arg0 == 72) {
					this.anInt2055 = arg1.method1181();
					return;
				} else if (arg0 == 73) {
					this.aBoolean83 = true;
					return;
				} else if (arg0 == 74) {
					this.aBoolean86 = true;
					return;
				} else if (arg0 == 75) {
					this.anInt2054 = arg1.method1190();
					return;
				} else if (arg0 == 77) {
					this.anInt2078 = arg1.method1176();
					if (this.anInt2078 == 65535) {
						this.anInt2078 = -1;
					}
					this.anInt2090 = arg1.method1176();
					if (this.anInt2090 == 65535) {
						this.anInt2090 = -1;
					}
					local164 = arg1.method1190();
					this.anIntArray338 = new int[local164 + 1];
					for (local174 = 0; local174 <= local164; local174++) {
						this.anIntArray338[local174] = arg1.method1176();
						if (this.anIntArray338[local174] == 65535) {
							this.anIntArray338[local174] = -1;
						}
					}
					return;
				} else if (arg0 == 78) {
					this.anInt2056 = arg1.method1176();
					this.anInt2086 = arg1.method1190();
					return;
				} else {
					if (arg0 == 79) {
						this.anInt2094 = arg1.method1176();
						this.anInt2060 = arg1.method1176();
						this.anInt2086 = arg1.method1190();
						local164 = arg1.method1190();
						this.anIntArray339 = new int[local164];
						for (local174 = 0; local174 < local164; local174++) {
							this.anIntArray339[local174] = arg1.method1176();
						}
					} else if (arg0 == 81) {
						this.anInt2081 = arg1.method1190() * 256;
						return;
					}
					return;
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)Z")
	public boolean method1439() {
		if (this.anIntArray338 == null) {
			return this.anInt2056 != -1 || this.anIntArray339 != null;
		}
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray338.length; local22++) {
			if (this.anIntArray338[local22] != -1) {
				@Pc(37) Class1_Sub1_Sub9 local37 = Static122.method1995(this.anIntArray338[local22]);
				if (local37.anInt2056 != -1 || local37.anIntArray339 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)Lclient!nd;")
	public Class1_Sub1_Sub9 method1440() {
		@Pc(5) int local5 = -1;
		if (this.anInt2078 != -1) {
			local5 = Static52.method1096(this.anInt2078);
		} else if (this.anInt2090 != -1) {
			local5 = Static103.anIntArray429[this.anInt2090];
		}
		return local5 < 0 || local5 >= this.anIntArray338.length || this.anIntArray338[local5] == -1 ? null : Static122.method1995(this.anIntArray338[local5]);
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)Z")
	public boolean method1441() {
		if (this.anIntArray343 == null) {
			return true;
		}
		@Pc(19) boolean local19 = true;
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray343.length; local21++) {
			local19 &= Static54.aClass5_50.method119(this.anIntArray343[local21] & 0xFFFF, 0);
		}
		return local19;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)Lclient!td;")
	private Class1_Sub1_Sub1_Sub7 method1442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class1_Sub1_Sub1_Sub7 local13 = null;
		@Pc(31) boolean local31;
		@Pc(49) int local49;
		@Pc(51) int local51;
		@Pc(57) int local57;
		if (this.anIntArray341 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.anIntArray343 == null) {
				return null;
			}
			local31 = this.aBoolean82;
			if (arg1 == 2 && arg0 > 3) {
				local31 = !local31;
			}
			local49 = this.anIntArray343.length;
			for (local51 = 0; local51 < local49; local51++) {
				local57 = this.anIntArray343[local51];
				if (local31) {
					local57 += 65536;
				}
				local13 = (Class1_Sub1_Sub1_Sub7) Static34.aClass60_11.method1745((long) local57);
				if (local13 == null) {
					local13 = Static113.method1911(Static54.aClass5_50, local57 & 0xFFFF);
					if (local13 == null) {
						return null;
					}
					if (local31) {
						local13.method1921();
					}
					Static34.aClass60_11.method1741((long) local57, local13);
				}
				if (local49 > 1) {
					Static116.aClass1_Sub1_Sub1_Sub7Array1[local51] = local13;
				}
			}
			if (local49 > 1) {
				local13 = new Class1_Sub1_Sub1_Sub7(Static116.aClass1_Sub1_Sub1_Sub7Array1, local49);
			}
		} else {
			@Pc(120) int local120 = -1;
			for (local49 = 0; local49 < this.anIntArray341.length; local49++) {
				if (arg1 == this.anIntArray341[local49]) {
					local120 = local49;
					break;
				}
			}
			if (local120 == -1) {
				return null;
			}
			@Pc(157) boolean local157 = arg0 > 3 ^ this.aBoolean82;
			local51 = this.anIntArray343[local120];
			if (local157) {
				local51 += 65536;
			}
			local13 = (Class1_Sub1_Sub1_Sub7) Static34.aClass60_11.method1745((long) local51);
			if (local13 == null) {
				local13 = Static113.method1911(Static54.aClass5_50, local51 & 0xFFFF);
				if (local13 == null) {
					return null;
				}
				if (local157) {
					local13.method1921();
				}
				Static34.aClass60_11.method1741((long) local51, local13);
			}
		}
		if (this.anInt2064 == 128 && this.anInt2079 == 128 && this.anInt2080 == 128) {
			local31 = false;
		} else {
			local31 = true;
		}
		@Pc(236) boolean local236;
		if (this.anInt2070 == 0 && this.anInt2092 == 0 && this.anInt2055 == 0) {
			local236 = false;
		} else {
			local236 = true;
		}
		@Pc(267) Class1_Sub1_Sub1_Sub7 local267 = new Class1_Sub1_Sub1_Sub7(local13, arg0 == 0 && !local31 && !local236, this.aShortArray60 == null, this.aShortArray59 == null, true);
		if (arg1 == 4 && arg0 > 3) {
			local267.method1918();
			local267.method1916(45, 0, -45);
		}
		@Pc(287) int local287 = arg0 & 0x3;
		if (local287 == 1) {
			local267.method1909();
		} else if (local287 == 2) {
			local267.method1908();
		} else if (local287 == 3) {
			local267.method1905();
		}
		if (this.aShortArray60 != null) {
			for (local57 = 0; local57 < this.aShortArray60.length; local57++) {
				local267.method1914(this.aShortArray60[local57], this.aShortArray61[local57]);
			}
		}
		if (this.aShortArray59 != null) {
			for (local57 = 0; local57 < this.aShortArray59.length; local57++) {
				local267.method1915(this.aShortArray59[local57], this.aShortArray58[local57]);
			}
		}
		if (local31) {
			local267.method1901(this.anInt2064, this.anInt2079, this.anInt2080);
		}
		if (local236) {
			local267.method1916(this.anInt2070, this.anInt2092, this.anInt2055);
		}
		return local267;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!mc;I)V")
	public void method1443(@OriginalArg(0) Class1_Sub12 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method1190();
			if (local12 == 0) {
				return;
			}
			this.method1437(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[[IBIIII)Lclient!lb;")
	public Class1_Sub1_Sub1_Sub6 method1445(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(20) long local20;
		if (this.anIntArray341 == null) {
			local20 = arg5 + (this.anInt2066 << 10);
		} else {
			local20 = (this.anInt2066 << 10) + (arg4 << 3) + arg5;
		}
		@Pc(36) Class1_Sub1_Sub1_Sub6 local36 = (Class1_Sub1_Sub1_Sub6) Static129.aClass60_90.method1745(local20);
		if (local36 == null) {
			@Pc(48) Class1_Sub1_Sub1_Sub7 local48 = this.method1442(arg5, arg4);
			if (local48 == null) {
				return null;
			}
			local36 = local48.method1899(this.anInt2058 + 64, this.anInt2068 * 5 + 768, -50, -10, -50);
			Static129.aClass60_90.method1741(local20, local36);
		}
		if (this.anInt2081 >= 0) {
			local36 = local36.method1328(arg1, arg3, arg0, arg2, true, this.anInt2081);
		}
		return local36;
	}

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V")
	public void method1447() {
		if (this.anInt2089 == -1) {
			this.anInt2089 = 0;
			if (this.anIntArray343 != null && (this.anIntArray341 == null || this.anIntArray341[0] == 10)) {
				this.anInt2089 = 1;
			}
			for (@Pc(37) int local37 = 0; local37 < 5; local37++) {
				if (this.aClass66Array12[local37] != null) {
					this.anInt2089 = 1;
				}
			}
		}
		if (this.anInt2054 == -1) {
			this.anInt2054 = this.anInt2084 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)Z")
	public boolean method1450(@OriginalArg(1) int arg0) {
		if (this.anIntArray341 != null) {
			for (@Pc(59) int local59 = 0; local59 < this.anIntArray341.length; local59++) {
				if (this.anIntArray341[local59] == arg0) {
					return Static54.aClass5_50.method119(this.anIntArray343[local59] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray343 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(28) boolean local28 = true;
			for (@Pc(30) int local30 = 0; local30 < this.anIntArray343.length; local30++) {
				local28 &= Static54.aClass5_50.method119(this.anIntArray343[local30] & 0xFFFF, 0);
			}
			return local28;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BIIIILclient!tb;[[III)Lclient!lb;")
	public Class1_Sub1_Sub1_Sub6 method1451(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub1_Sub15 arg4, @OriginalArg(6) int[][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(21) long local21;
		if (this.anIntArray341 == null) {
			local21 = (this.anInt2066 << 10) + arg0;
		} else {
			local21 = (this.anInt2066 << 10) + ((arg1 << 3) + arg0);
		}
		@Pc(37) Class1_Sub1_Sub1_Sub6 local37 = (Class1_Sub1_Sub1_Sub6) Static129.aClass60_90.method1745(local21);
		if (local37 == null) {
			@Pc(45) Class1_Sub1_Sub1_Sub7 local45 = this.method1442(arg0, arg1);
			if (local45 == null) {
				return null;
			}
			local37 = local45.method1899(this.anInt2058 + 64, this.anInt2068 * 5 + 768, -50, -10, -50);
			Static129.aClass60_90.method1741(local21, local37);
		}
		if (arg4 == null && this.anInt2081 == -1) {
			return local37;
		}
		if (arg4 == null) {
			local37 = local37.method1325(true);
		} else {
			local37 = arg4.method1875(local37, arg7, arg0);
		}
		if (this.anInt2081 >= 0) {
			local37 = local37.method1328(arg5, arg2, arg3, arg6, false, this.anInt2081);
		}
		return local37;
	}
}
