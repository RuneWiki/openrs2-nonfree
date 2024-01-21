import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vb", name = "Y", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!vb", name = "sb", descriptor = "[I")
	private int[] anIntArray364;

	@OriginalMember(owner = "client!vb", name = "Ab", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!vb", name = "Eb", descriptor = "I")
	public int anInt2969;

	@OriginalMember(owner = "client!vb", name = "Wb", descriptor = "[I")
	public int[] anIntArray365;

	@OriginalMember(owner = "client!vb", name = "Yb", descriptor = "[I")
	public int[] anIntArray366;

	@OriginalMember(owner = "client!vb", name = "ac", descriptor = "[I")
	private int[] anIntArray367;

	@OriginalMember(owner = "client!vb", name = "X", descriptor = "I")
	public int anInt2950 = -1;

	@OriginalMember(owner = "client!vb", name = "gb", descriptor = "I")
	private int anInt2956 = -1;

	@OriginalMember(owner = "client!vb", name = "Z", descriptor = "I")
	private int anInt2951 = 0;

	@OriginalMember(owner = "client!vb", name = "ib", descriptor = "I")
	public int anInt2958 = -1;

	@OriginalMember(owner = "client!vb", name = "tb", descriptor = "I")
	private int anInt2963 = 0;

	@OriginalMember(owner = "client!vb", name = "R", descriptor = "I")
	private int anInt2945 = 128;

	@OriginalMember(owner = "client!vb", name = "yb", descriptor = "I")
	private int anInt2967 = 0;

	@OriginalMember(owner = "client!vb", name = "vb", descriptor = "I")
	public int anInt2965 = 0;

	@OriginalMember(owner = "client!vb", name = "ob", descriptor = "I")
	public int anInt2960 = 16;

	@OriginalMember(owner = "client!vb", name = "T", descriptor = "I")
	public int anInt2947 = -1;

	@OriginalMember(owner = "client!vb", name = "kb", descriptor = "Z")
	public boolean aBoolean171 = false;

	@OriginalMember(owner = "client!vb", name = "Cb", descriptor = "[Lclient!id;")
	public final Class34[] aClass34Array23 = new Class34[5];

	@OriginalMember(owner = "client!vb", name = "fb", descriptor = "I")
	public int anInt2955 = 0;

	@OriginalMember(owner = "client!vb", name = "Bb", descriptor = "Lclient!id;")
	public Class34 aClass34_1529 = Static74.aClass34_997;

	@OriginalMember(owner = "client!vb", name = "Gb", descriptor = "Z")
	public boolean aBoolean172 = false;

	@OriginalMember(owner = "client!vb", name = "W", descriptor = "I")
	private int anInt2949 = -1;

	@OriginalMember(owner = "client!vb", name = "Ib", descriptor = "I")
	public int anInt2971 = 2;

	@OriginalMember(owner = "client!vb", name = "Hb", descriptor = "Z")
	public boolean aBoolean173 = true;

	@OriginalMember(owner = "client!vb", name = "cb", descriptor = "I")
	public int anInt2953 = -1;

	@OriginalMember(owner = "client!vb", name = "eb", descriptor = "Z")
	public boolean aBoolean169 = false;

	@OriginalMember(owner = "client!vb", name = "Kb", descriptor = "I")
	public int anInt2972 = -1;

	@OriginalMember(owner = "client!vb", name = "S", descriptor = "I")
	public int anInt2946 = 1;

	@OriginalMember(owner = "client!vb", name = "wb", descriptor = "I")
	public int anInt2966 = 0;

	@OriginalMember(owner = "client!vb", name = "jb", descriptor = "Z")
	public boolean aBoolean170 = false;

	@OriginalMember(owner = "client!vb", name = "Mb", descriptor = "I")
	private int anInt2973 = 0;

	@OriginalMember(owner = "client!vb", name = "bb", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!vb", name = "Qb", descriptor = "I")
	public int anInt2977 = 0;

	@OriginalMember(owner = "client!vb", name = "Sb", descriptor = "I")
	private int anInt2979 = 0;

	@OriginalMember(owner = "client!vb", name = "Ub", descriptor = "I")
	private int anInt2981 = 128;

	@OriginalMember(owner = "client!vb", name = "Tb", descriptor = "I")
	public int anInt2980 = -1;

	@OriginalMember(owner = "client!vb", name = "Vb", descriptor = "Z")
	public boolean aBoolean175 = true;

	@OriginalMember(owner = "client!vb", name = "Jb", descriptor = "Z")
	private boolean aBoolean174 = false;

	@OriginalMember(owner = "client!vb", name = "qb", descriptor = "I")
	public int anInt2962 = 1;

	@OriginalMember(owner = "client!vb", name = "Pb", descriptor = "I")
	private int anInt2976 = 128;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIII)Lclient!ha;")
	public Class1_Sub1_Sub1 method1954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) long local12;
		if (this.anIntArray367 == null) {
			local12 = arg3 + (this.anInt2969 << 10);
		} else {
			local12 = arg3 + (this.anInt2969 << 10) + (arg0 << 3);
		}
		@Pc(37) Class1_Sub1_Sub1 local37 = (Class1_Sub1_Sub1) Static14.aClass63_6.method1663(local12);
		if (local37 == null) {
			@Pc(45) Class1_Sub1_Sub1_Sub4 local45 = this.method1962(arg0, arg3);
			if (local45 == null) {
				return null;
			}
			if (this.aBoolean174) {
				local45.aShort1 = (short) (this.anInt2967 + 64);
				local37 = local45;
				local45.aShort2 = (short) (this.anInt2979 * 5 + 768);
				local45.method1421();
			} else {
				local37 = local45.method1410(this.anInt2967 + 64, 768 - -(this.anInt2979 * 5), -50, -10, -50);
			}
			Static14.aClass63_6.method1659(local37, local12);
		}
		if (this.aBoolean174) {
			local37 = ((Class1_Sub1_Sub1_Sub4) local37).method1413();
		}
		if (this.aBoolean170) {
			if (local37 instanceof Class1_Sub1_Sub1_Sub2) {
				local37 = ((Class1_Sub1_Sub1_Sub2) local37).method1094(arg2, arg4, arg5, arg1, true);
			} else if (local37 instanceof Class1_Sub1_Sub1_Sub4) {
				local37 = ((Class1_Sub1_Sub1_Sub4) local37).method1428(arg2, arg4, arg5, arg1);
			}
		}
		return local37;
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)Z")
	public boolean method1955() {
		if (this.anIntArray366 == null) {
			return this.anInt2950 != -1 || this.anIntArray365 != null;
		}
		for (@Pc(29) int local29 = 0; local29 < this.anIntArray366.length; local29++) {
			if (this.anIntArray366[local29] != -1) {
				@Pc(44) Class1_Sub1_Sub16 local44 = Static28.method2008(this.anIntArray366[local29]);
				if (local44.anInt2950 != -1 || local44.anIntArray365 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBIIIII)Lclient!ka;")
	public Class1_Sub1_Sub1_Sub2 method1957(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) long local14;
		if (this.anIntArray367 == null) {
			local14 = (this.anInt2969 << 10) + arg5;
		} else {
			local14 = arg5 + (this.anInt2969 << 10) + (arg1 << 3);
		}
		@Pc(35) Class1_Sub1_Sub1_Sub2 local35 = (Class1_Sub1_Sub1_Sub2) Static118.aClass63_24.method1663(local14);
		if (local35 == null) {
			@Pc(43) Class1_Sub1_Sub1_Sub4 local43 = this.method1962(arg1, arg5);
			if (local43 == null) {
				return null;
			}
			local35 = local43.method1410(this.anInt2967 + 64, this.anInt2979 * 5 + 768, -50, -10, -50);
			Static118.aClass63_24.method1659(local35, local14);
		}
		if (this.aBoolean170) {
			local35 = local35.method1094(arg3, arg4, arg0, arg2, true);
		}
		return local35;
	}

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)Lclient!vb;")
	public Class1_Sub1_Sub16 method1958() {
		@Pc(13) int local13 = -1;
		if (this.anInt2949 != -1) {
			local13 = Static67.method1129(this.anInt2949);
		} else if (this.anInt2956 != -1) {
			local13 = Static39.anIntArray116[this.anInt2956];
		}
		return local13 < 0 || this.anIntArray366.length <= local13 || this.anIntArray366[local13] == -1 ? null : Static28.method2008(this.anIntArray366[local13]);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)Z")
	public boolean method1959(@OriginalArg(0) int arg0) {
		if (this.anIntArray367 != null) {
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray367.length; local17++) {
				if (this.anIntArray367[local17] == arg0) {
					return Static80.aClass35_22.method1561(0, this.anIntArray364[local17] & 0xFFFF);
				}
			}
			return true;
		} else if (this.anIntArray364 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(66) boolean local66 = true;
			for (@Pc(68) int local68 = 0; local68 < this.anIntArray364.length; local68++) {
				local66 &= Static80.aClass35_22.method1561(0, this.anIntArray364[local68] & 0xFFFF);
			}
			return local66;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!of;I)V")
	public void method1960(@OriginalArg(0) Class1_Sub19 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2072();
			if (local5 == 0) {
				return;
			}
			this.method1968(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "(I)V")
	public void method1961() {
		if (this.anInt2980 == -1) {
			this.anInt2980 = 0;
			if (this.anIntArray364 != null && (this.anIntArray367 == null || this.anIntArray367[0] == 10)) {
				this.anInt2980 = 1;
			}
			for (@Pc(28) int local28 = 0; local28 < 5; local28++) {
				if (this.aClass34Array23[local28] != null) {
					this.anInt2980 = 1;
				}
			}
		}
		if (this.anInt2958 == -1) {
			this.anInt2958 = this.anInt2971 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZII)Lclient!nf;")
	private Class1_Sub1_Sub1_Sub4 method1962(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class1_Sub1_Sub1_Sub4 local7 = null;
		@Pc(34) boolean local34;
		@Pc(24) int local24;
		@Pc(36) int local36;
		@Pc(42) int local42;
		if (this.anIntArray367 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray364 == null) {
				return null;
			}
			local24 = this.anIntArray364.length;
			local34 = arg1 > 3 ^ this.aBoolean168;
			for (local36 = 0; local36 < local24; local36++) {
				local42 = this.anIntArray364[local36];
				if (local34) {
					local42 += 65536;
				}
				local7 = (Class1_Sub1_Sub1_Sub4) Static10.aClass63_4.method1663((long) local42);
				if (local7 == null) {
					local7 = Static83.method1412(Static80.aClass35_22, local42 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local34) {
						local7.method1420();
					}
					Static10.aClass63_4.method1659(local7, (long) local42);
				}
				if (local24 > 1) {
					Static9.aClass1_Sub1_Sub1_Sub4Array1[local36] = local7;
				}
			}
			if (local24 > 1) {
				local7 = new Class1_Sub1_Sub1_Sub4(Static9.aClass1_Sub1_Sub1_Sub4Array1, local24);
			}
		} else {
			@Pc(105) int local105 = -1;
			for (local24 = 0; local24 < this.anIntArray367.length; local24++) {
				if (this.anIntArray367[local24] == arg0) {
					local105 = local24;
					break;
				}
			}
			if (local105 == -1) {
				return null;
			}
			local36 = this.anIntArray364[local105];
			@Pc(145) boolean local145 = this.aBoolean168 ^ arg1 > 3;
			if (local145) {
				local36 += 65536;
			}
			local7 = (Class1_Sub1_Sub1_Sub4) Static10.aClass63_4.method1663((long) local36);
			if (local7 == null) {
				local7 = Static83.method1412(Static80.aClass35_22, local36 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local145) {
					local7.method1420();
				}
				Static10.aClass63_4.method1659(local7, (long) local36);
			}
		}
		if (this.anInt2976 == 128 && this.anInt2945 == 128 && this.anInt2981 == 128) {
			local34 = false;
		} else {
			local34 = true;
		}
		@Pc(215) boolean local215;
		if (this.anInt2963 == 0 && this.anInt2951 == 0 && this.anInt2973 == 0) {
			local215 = false;
		} else {
			local215 = true;
		}
		@Pc(243) Class1_Sub1_Sub1_Sub4 local243 = new Class1_Sub1_Sub1_Sub4(local7, arg1 == 0 && !local34 && !local215, this.aShortArray17 == null, true);
		@Pc(247) int local247 = arg1 & 0x3;
		if (local247 == 1) {
			local243.method1422();
		} else if (local247 == 2) {
			local243.method1417();
		} else if (local247 == 3) {
			local243.method1425();
		}
		if (this.aShortArray17 != null) {
			for (local42 = 0; local42 < this.aShortArray17.length; local42++) {
				local243.method1415(this.aShortArray17[local42], this.aShortArray18[local42]);
			}
		}
		if (local34) {
			local243.method1427(this.anInt2976, this.anInt2945, this.anInt2981);
		}
		if (local215) {
			local243.method1416(this.anInt2963, this.anInt2951, this.anInt2973);
		}
		return local243;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILclient!gd;IIBIII)Lclient!ka;")
	public Class1_Sub1_Sub1_Sub2 method1963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(22) long local22;
		if (this.anIntArray367 == null) {
			local22 = (this.anInt2969 << 10) + arg1;
		} else {
			local22 = arg1 + (this.anInt2969 << 10) + (arg7 << 3);
		}
		@Pc(39) Class1_Sub1_Sub1_Sub2 local39 = (Class1_Sub1_Sub1_Sub2) Static118.aClass63_24.method1663(local22);
		if (local39 == null) {
			@Pc(51) Class1_Sub1_Sub1_Sub4 local51 = this.method1962(arg7, arg1);
			if (local51 == null) {
				return null;
			}
			local39 = local51.method1410(this.anInt2967 + 64, this.anInt2979 * 5 + 768, -50, -10, -50);
			Static118.aClass63_24.method1659(local39, local22);
		}
		if (arg2 == null && !this.aBoolean170) {
			return local39;
		}
		if (arg2 == null) {
			local39 = local39.method1098(true);
		} else {
			local39 = arg2.method720(local39, arg1, arg5);
		}
		if (this.aBoolean170) {
			local39.method1094(arg6, arg3, arg0, arg4, false);
		}
		return local39;
	}

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "(I)Z")
	public boolean method1967() {
		if (this.anIntArray364 == null) {
			return true;
		}
		@Pc(20) boolean local20 = true;
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray364.length; local22++) {
			local20 &= Static80.aClass35_22.method1561(0, this.anIntArray364[local22] & 0xFFFF);
		}
		return local20;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BILclient!of;)V")
	private void method1968(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub19 arg1) {
		@Pc(19) int local19;
		@Pc(48) int local48;
		if (arg0 == 1) {
			local19 = arg1.method2072();
			if (local19 > 0) {
				if (this.anIntArray364 != null && !Static23.aBoolean40) {
					arg1.anInt3111 += local19 * 3;
					return;
				}
				this.anIntArray364 = new int[local19];
				this.anIntArray367 = new int[local19];
				for (local48 = 0; local48 < local19; local48++) {
					this.anIntArray364[local48] = arg1.method2051();
					this.anIntArray367[local48] = arg1.method2072();
				}
				return;
			}
		} else if (arg0 == 2) {
			this.aClass34_1529 = arg1.method2084();
		} else if (arg0 == 5) {
			local19 = arg1.method2072();
			if (local19 > 0) {
				if (this.anIntArray364 != null && !Static23.aBoolean40) {
					arg1.anInt3111 += local19 * 2;
					return;
				}
				this.anIntArray364 = new int[local19];
				this.anIntArray367 = null;
				for (local48 = 0; local48 < local19; local48++) {
					this.anIntArray364[local48] = arg1.method2051();
				}
				return;
			}
		} else if (arg0 == 14) {
			this.anInt2962 = arg1.method2072();
			return;
		} else if (arg0 == 15) {
			this.anInt2946 = arg1.method2072();
			return;
		} else if (arg0 == 17) {
			this.anInt2971 = 0;
			this.aBoolean173 = false;
			return;
		} else if (arg0 == 18) {
			this.aBoolean173 = false;
			return;
		} else if (arg0 == 19) {
			this.anInt2980 = arg1.method2072();
			return;
		} else if (arg0 == 21) {
			this.aBoolean170 = true;
			return;
		} else if (arg0 == 22) {
			this.aBoolean174 = true;
			return;
		} else if (arg0 == 23) {
			this.aBoolean171 = true;
			return;
		} else {
			if (arg0 == 24) {
				this.anInt2947 = arg1.method2051();
				if (this.anInt2947 == 65535) {
					this.anInt2947 = -1;
					return;
				}
			} else if (arg0 == 27) {
				this.anInt2971 = 1;
			} else if (arg0 == 28) {
				this.anInt2960 = arg1.method2072();
				return;
			} else if (arg0 == 29) {
				this.anInt2967 = arg1.method2086();
				return;
			} else {
				if (arg0 == 39) {
					this.anInt2979 = arg1.method2086() * 5;
				} else if (arg0 >= 30 && arg0 < 35) {
					this.aClass34Array23[arg0 - 30] = arg1.method2084();
					if (this.aClass34Array23[arg0 - 30].method961(Static23.aClass34_402)) {
						this.aClass34Array23[arg0 - 30] = null;
						return;
					}
				} else if (arg0 == 40) {
					local19 = arg1.method2072();
					this.aShortArray17 = new short[local19];
					this.aShortArray18 = new short[local19];
					for (local48 = 0; local48 < local19; local48++) {
						this.aShortArray17[local48] = (short) arg1.method2051();
						this.aShortArray18[local48] = (short) arg1.method2051();
					}
					return;
				} else if (arg0 == 60) {
					this.anInt2953 = arg1.method2051();
					return;
				} else if (arg0 == 62) {
					this.aBoolean168 = true;
					return;
				} else if (arg0 == 64) {
					this.aBoolean175 = false;
					return;
				} else if (arg0 == 65) {
					this.anInt2976 = arg1.method2051();
					return;
				} else if (arg0 == 66) {
					this.anInt2945 = arg1.method2051();
					return;
				} else if (arg0 == 67) {
					this.anInt2981 = arg1.method2051();
					return;
				} else if (arg0 == 68) {
					this.anInt2972 = arg1.method2051();
					return;
				} else if (arg0 == 69) {
					this.anInt2966 = arg1.method2072();
					return;
				} else if (arg0 == 70) {
					this.anInt2963 = arg1.method2064();
					return;
				} else if (arg0 == 71) {
					this.anInt2951 = arg1.method2064();
					return;
				} else if (arg0 == 72) {
					this.anInt2973 = arg1.method2064();
					return;
				} else if (arg0 == 73) {
					this.aBoolean169 = true;
					return;
				} else if (arg0 == 74) {
					this.aBoolean172 = true;
					return;
				} else if (arg0 == 75) {
					this.anInt2958 = arg1.method2072();
					return;
				} else if (arg0 == 77) {
					this.anInt2949 = arg1.method2051();
					if (this.anInt2949 == 65535) {
						this.anInt2949 = -1;
					}
					this.anInt2956 = arg1.method2051();
					if (this.anInt2956 == 65535) {
						this.anInt2956 = -1;
					}
					local19 = arg1.method2072();
					this.anIntArray366 = new int[local19 + 1];
					for (local48 = 0; local48 <= local19; local48++) {
						this.anIntArray366[local48] = arg1.method2051();
						if (this.anIntArray366[local48] == 65535) {
							this.anIntArray366[local48] = -1;
						}
					}
					return;
				} else {
					if (arg0 == 78) {
						this.anInt2950 = arg1.method2051();
						this.anInt2955 = arg1.method2072();
					} else if (arg0 == 79) {
						this.anInt2977 = arg1.method2051();
						this.anInt2965 = arg1.method2051();
						this.anInt2955 = arg1.method2072();
						local19 = arg1.method2072();
						this.anIntArray365 = new int[local19];
						for (local48 = 0; local48 < local19; local48++) {
							this.anIntArray365[local48] = arg1.method2051();
						}
						return;
					}
					return;
				}
				return;
			}
			return;
		}
	}
}
