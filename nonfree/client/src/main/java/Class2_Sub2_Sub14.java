import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class2_Sub2_Sub14 extends Class2_Sub2 {

	@OriginalMember(owner = "client!rb", name = "bb", descriptor = "[I")
	public int[] anIntArray318;

	@OriginalMember(owner = "client!rb", name = "cb", descriptor = "[I")
	public int[] anIntArray319;

	@OriginalMember(owner = "client!rb", name = "rb", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!rb", name = "sb", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!rb", name = "Db", descriptor = "[I")
	private int[] anIntArray320;

	@OriginalMember(owner = "client!rb", name = "Xb", descriptor = "I")
	public int anInt2267;

	@OriginalMember(owner = "client!rb", name = "rc", descriptor = "[I")
	private int[] anIntArray322;

	@OriginalMember(owner = "client!rb", name = "ob", descriptor = "Z")
	public boolean aBoolean90 = false;

	@OriginalMember(owner = "client!rb", name = "gb", descriptor = "I")
	public int anInt2239 = -1;

	@OriginalMember(owner = "client!rb", name = "nb", descriptor = "I")
	private int anInt2245 = 0;

	@OriginalMember(owner = "client!rb", name = "jb", descriptor = "I")
	private int anInt2241 = 0;

	@OriginalMember(owner = "client!rb", name = "vb", descriptor = "Z")
	public boolean aBoolean91 = false;

	@OriginalMember(owner = "client!rb", name = "Ib", descriptor = "I")
	public int anInt2257 = 0;

	@OriginalMember(owner = "client!rb", name = "zb", descriptor = "I")
	private int anInt2251 = 128;

	@OriginalMember(owner = "client!rb", name = "hb", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!rb", name = "Eb", descriptor = "Z")
	public boolean aBoolean92 = false;

	@OriginalMember(owner = "client!rb", name = "lb", descriptor = "I")
	public int anInt2243 = 0;

	@OriginalMember(owner = "client!rb", name = "Ab", descriptor = "I")
	public int anInt2252 = -1;

	@OriginalMember(owner = "client!rb", name = "Vb", descriptor = "I")
	private int anInt2265 = 128;

	@OriginalMember(owner = "client!rb", name = "Yb", descriptor = "I")
	public int anInt2268 = -1;

	@OriginalMember(owner = "client!rb", name = "Ub", descriptor = "I")
	public int anInt2264 = 0;

	@OriginalMember(owner = "client!rb", name = "bc", descriptor = "I")
	public int anInt2271 = -1;

	@OriginalMember(owner = "client!rb", name = "qb", descriptor = "I")
	private int anInt2246 = 0;

	@OriginalMember(owner = "client!rb", name = "ib", descriptor = "I")
	private int anInt2240 = -1;

	@OriginalMember(owner = "client!rb", name = "Sb", descriptor = "I")
	private int anInt2263 = 0;

	@OriginalMember(owner = "client!rb", name = "Cb", descriptor = "I")
	private int anInt2253 = 128;

	@OriginalMember(owner = "client!rb", name = "Mb", descriptor = "Z")
	public boolean aBoolean93 = true;

	@OriginalMember(owner = "client!rb", name = "ac", descriptor = "I")
	private int anInt2270 = -1;

	@OriginalMember(owner = "client!rb", name = "Fb", descriptor = "I")
	public int anInt2254 = 16;

	@OriginalMember(owner = "client!rb", name = "hc", descriptor = "I")
	public int anInt2275 = 0;

	@OriginalMember(owner = "client!rb", name = "gc", descriptor = "Z")
	public boolean aBoolean95 = true;

	@OriginalMember(owner = "client!rb", name = "Kb", descriptor = "I")
	public int anInt2259 = 1;

	@OriginalMember(owner = "client!rb", name = "kb", descriptor = "I")
	public int anInt2242 = 2;

	@OriginalMember(owner = "client!rb", name = "fc", descriptor = "I")
	private int anInt2274 = 0;

	@OriginalMember(owner = "client!rb", name = "lc", descriptor = "[Lclient!u;")
	public final Class74[] aClass74Array16 = new Class74[5];

	@OriginalMember(owner = "client!rb", name = "oc", descriptor = "I")
	public int anInt2279 = 1;

	@OriginalMember(owner = "client!rb", name = "pc", descriptor = "Lclient!u;")
	public Class74 aClass74_1461 = Static8.aClass74_196;

	@OriginalMember(owner = "client!rb", name = "ec", descriptor = "I")
	public int anInt2273 = -1;

	@OriginalMember(owner = "client!rb", name = "qc", descriptor = "Z")
	public boolean aBoolean96 = false;

	@OriginalMember(owner = "client!rb", name = "Qb", descriptor = "Z")
	private boolean aBoolean94 = false;

	@OriginalMember(owner = "client!rb", name = "Zb", descriptor = "I")
	public int anInt2269 = -1;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIII)Lclient!na;")
	public Class2_Sub2_Sub2_Sub5 method1551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) long local18;
		if (this.anIntArray322 == null) {
			local18 = (this.anInt2267 << 10) + arg4;
		} else {
			local18 = arg4 + (this.anInt2267 << 10) + (arg0 << 3);
		}
		@Pc(42) Class2_Sub2_Sub2_Sub5 local42 = (Class2_Sub2_Sub2_Sub5) Static90.aClass16_67.method490(local18);
		if (local42 == null) {
			@Pc(50) Class2_Sub2_Sub2_Sub7 local50 = this.method1563(arg4, arg0);
			if (local50 == null) {
				return null;
			}
			local42 = local50.method1412(this.anInt2241 + 64, this.anInt2274 * 5 + 768, -50, -10, -50);
			Static90.aClass16_67.method492(local42, local18);
		}
		if (this.aBoolean90) {
			local42 = local42.method1137(arg3, arg5, arg2, arg1, true);
		}
		return local42;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)Z")
	public boolean method1553(@OriginalArg(1) int arg0) {
		if (this.anIntArray322 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray322.length; local18++) {
				if (arg0 == this.anIntArray322[local18]) {
					return Static75.aClass26_17.method1375(0, this.anIntArray320[local18] & 0xFFFF);
				}
			}
			return true;
		} else if (this.anIntArray320 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(57) boolean local57 = true;
			for (@Pc(59) int local59 = 0; local59 < this.anIntArray320.length; local59++) {
				local57 &= Static75.aClass26_17.method1375(0, this.anIntArray320[local59] & 0xFFFF);
			}
			return local57;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)Z")
	public boolean method1554() {
		if (this.anIntArray320 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray320.length; local14++) {
			local12 &= Static75.aClass26_17.method1375(0, this.anIntArray320[local14] & 0xFFFF);
		}
		return local12;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)Z")
	public boolean method1555() {
		if (this.anIntArray318 == null) {
			return this.anInt2273 != -1 || this.anIntArray319 != null;
		}
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray318.length; local22++) {
			if (this.anIntArray318[local22] != -1) {
				@Pc(52) Class2_Sub2_Sub14 local52 = Static2.method19(this.anIntArray318[local22]);
				if (local52.anInt2273 != -1 || local52.anIntArray319 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIILclient!ma;IBIII)Lclient!na;")
	public Class2_Sub2_Sub2_Sub5 method1556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub2_Sub11 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(22) long local22;
		if (this.anIntArray322 == null) {
			local22 = arg4 + (this.anInt2267 << 10);
		} else {
			local22 = arg4 + (arg5 << 3) + (this.anInt2267 << 10);
		}
		@Pc(38) Class2_Sub2_Sub2_Sub5 local38 = (Class2_Sub2_Sub2_Sub5) Static90.aClass16_67.method490(local22);
		if (local38 == null) {
			@Pc(50) Class2_Sub2_Sub2_Sub7 local50 = this.method1563(arg4, arg5);
			if (local50 == null) {
				return null;
			}
			local38 = local50.method1412(this.anInt2241 + 64, this.anInt2274 * 5 + 768, -50, -10, -50);
			Static90.aClass16_67.method492(local38, local22);
		}
		if (arg3 == null && !this.aBoolean90) {
			return local38;
		}
		if (arg3 == null) {
			local38 = local38.method1118(true);
		} else {
			local38 = arg3.method1045(arg4, arg7, local38);
		}
		if (this.aBoolean90) {
			local38.method1137(arg2, arg0, arg6, arg1, false);
		}
		return local38;
	}

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "(I)Lclient!rb;")
	public Class2_Sub2_Sub14 method1558() {
		@Pc(5) int local5 = -1;
		if (this.anInt2240 != -1) {
			local5 = Static116.method1730(this.anInt2240);
		} else if (this.anInt2270 != -1) {
			local5 = Static88.anIntArray260[this.anInt2270];
		}
		return local5 < 0 || this.anIntArray318.length <= local5 || this.anIntArray318[local5] == -1 ? null : Static2.method19(this.anIntArray318[local5]);
	}

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "(I)V")
	public void method1560() {
		if (this.anInt2271 == -1) {
			this.anInt2271 = 0;
			if (this.anIntArray320 != null && (this.anIntArray322 == null || this.anIntArray322[0] == 10)) {
				this.anInt2271 = 1;
			}
			for (@Pc(27) int local27 = 0; local27 < 5; local27++) {
				if (this.aClass74Array16[local27] != null) {
					this.anInt2271 = 1;
				}
			}
		}
		if (this.anInt2252 == -1) {
			this.anInt2252 = this.anInt2242 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!ic;)V")
	public void method1562(@OriginalArg(1) Class2_Sub10 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1514();
			if (local13 == 0) {
				return;
			}
			this.method1566(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)Lclient!pf;")
	private Class2_Sub2_Sub2_Sub7 method1563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class2_Sub2_Sub2_Sub7 local5 = null;
		@Pc(12) int local12;
		@Pc(58) int local58;
		@Pc(121) boolean local121;
		@Pc(133) int local133;
		if (this.anIntArray322 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.anIntArray320 == null) {
				return null;
			}
			local121 = arg0 > 3 ^ this.aBoolean94;
			local12 = this.anIntArray320.length;
			for (local58 = 0; local58 < local12; local58++) {
				local133 = this.anIntArray320[local58];
				if (local121) {
					local133 += 65536;
				}
				local5 = (Class2_Sub2_Sub2_Sub7) Static35.aClass16_93.method490((long) local133);
				if (local5 == null) {
					local5 = Static94.method1414(Static75.aClass26_17, local133 & 0xFFFF);
					if (local5 == null) {
						return null;
					}
					if (local121) {
						local5.method1411();
					}
					Static35.aClass16_93.method492(local5, (long) local133);
				}
				if (local12 > 1) {
					Static77.aClass2_Sub2_Sub2_Sub7Array1[local58] = local5;
				}
			}
			if (local12 > 1) {
				local5 = new Class2_Sub2_Sub2_Sub7(Static77.aClass2_Sub2_Sub2_Sub7Array1, local12);
			}
		} else {
			@Pc(10) int local10 = -1;
			for (local12 = 0; local12 < this.anIntArray322.length; local12++) {
				if (this.anIntArray322[local12] == arg1) {
					local10 = local12;
					break;
				}
			}
			if (local10 == -1) {
				return null;
			}
			@Pc(53) boolean local53 = this.aBoolean94 ^ arg0 > 3;
			local58 = this.anIntArray320[local10];
			if (local53) {
				local58 += 65536;
			}
			local5 = (Class2_Sub2_Sub2_Sub7) Static35.aClass16_93.method490((long) local58);
			if (local5 == null) {
				local5 = Static94.method1414(Static75.aClass26_17, local58 & 0xFFFF);
				if (local5 == null) {
					return null;
				}
				if (local53) {
					local5.method1411();
				}
				Static35.aClass16_93.method492(local5, (long) local58);
			}
		}
		if (this.anInt2265 == 128 && this.anInt2251 == 128 && this.anInt2253 == 128) {
			local121 = false;
		} else {
			local121 = true;
		}
		@Pc(232) boolean local232;
		if (this.anInt2245 == 0 && this.anInt2263 == 0 && this.anInt2246 == 0) {
			local232 = false;
		} else {
			local232 = true;
		}
		@Pc(256) Class2_Sub2_Sub2_Sub7 local256 = new Class2_Sub2_Sub2_Sub7(local5, arg0 == 0 && !local121 && !local232, this.aShortArray13 == null, true);
		@Pc(260) int local260 = arg0 & 0x3;
		if (local260 == 1) {
			local256.method1418();
		} else if (local260 == 2) {
			local256.method1408();
		} else if (local260 == 3) {
			local256.method1407();
		}
		if (this.aShortArray13 != null) {
			for (local133 = 0; local133 < this.aShortArray13.length; local133++) {
				local256.method1415(this.aShortArray13[local133], this.aShortArray14[local133]);
			}
		}
		if (local121) {
			local256.method1403(this.anInt2265, this.anInt2251, this.anInt2253);
		}
		if (local232) {
			local256.method1416(this.anInt2245, this.anInt2263, this.anInt2246);
		}
		return local256;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIBIIII)Lclient!vb;")
	public Class2_Sub2_Sub2 method1564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(21) long local21;
		if (this.anIntArray322 == null) {
			local21 = (this.anInt2267 << 10) + arg5;
		} else {
			local21 = arg5 + (arg4 << 3) + (this.anInt2267 << 10);
		}
		@Pc(41) Class2_Sub2_Sub2 local41 = (Class2_Sub2_Sub2) Static123.aClass16_89.method490(local21);
		if (local41 == null) {
			@Pc(49) Class2_Sub2_Sub2_Sub7 local49 = this.method1563(arg5, arg4);
			if (local49 == null) {
				return null;
			}
			if (this.aBoolean89) {
				local41 = local49;
				local49.aShort2 = (short) (this.anInt2241 + 64);
				local49.aShort1 = (short) (this.anInt2274 * 5 + 768);
				local49.method1400();
			} else {
				local41 = local49.method1412(this.anInt2241 + 64, this.anInt2274 * 5 + 768, -50, -10, -50);
			}
			Static123.aClass16_89.method492(local41, local21);
		}
		if (this.aBoolean89) {
			local41 = ((Class2_Sub2_Sub2_Sub7) local41).method1402();
		}
		if (this.aBoolean90) {
			if (local41 instanceof Class2_Sub2_Sub2_Sub5) {
				local41 = ((Class2_Sub2_Sub2_Sub5) local41).method1137(arg1, arg2, arg0, arg3, true);
			} else if (local41 instanceof Class2_Sub2_Sub2_Sub7) {
				local41 = ((Class2_Sub2_Sub2_Sub7) local41).method1410(arg1, arg2, arg0, arg3);
			}
		}
		return local41;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!ic;B)V")
	private void method1566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		@Pc(14) int local14;
		@Pc(34) int local34;
		if (arg0 == 1) {
			local14 = arg1.method1514();
			if (local14 > 0) {
				if (this.anIntArray320 != null && !Static32.aBoolean28) {
					arg1.anInt2187 += local14 * 3;
					return;
				}
				this.anIntArray320 = new int[local14];
				this.anIntArray322 = new int[local14];
				for (local34 = 0; local34 < local14; local34++) {
					this.anIntArray320[local34] = arg1.method1517();
					this.anIntArray322[local34] = arg1.method1514();
				}
				return;
			}
		} else if (arg0 == 2) {
			this.aClass74_1461 = arg1.method1530();
			return;
		} else if (arg0 == 5) {
			local14 = arg1.method1514();
			if (local14 > 0) {
				if (this.anIntArray320 != null && !Static32.aBoolean28) {
					arg1.anInt2187 += local14 * 2;
					return;
				}
				this.anIntArray320 = new int[local14];
				this.anIntArray322 = null;
				for (local34 = 0; local34 < local14; local34++) {
					this.anIntArray320[local34] = arg1.method1517();
				}
				return;
			}
		} else if (arg0 == 14) {
			this.anInt2279 = arg1.method1514();
			return;
		} else if (arg0 == 15) {
			this.anInt2259 = arg1.method1514();
			return;
		} else if (arg0 == 17) {
			this.anInt2242 = 0;
			this.aBoolean93 = false;
		} else if (arg0 == 18) {
			this.aBoolean93 = false;
			return;
		} else if (arg0 == 19) {
			this.anInt2271 = arg1.method1514();
			return;
		} else if (arg0 == 21) {
			this.aBoolean90 = true;
			return;
		} else if (arg0 == 22) {
			this.aBoolean89 = true;
			return;
		} else if (arg0 == 23) {
			this.aBoolean92 = true;
			return;
		} else {
			if (arg0 == 24) {
				this.anInt2268 = arg1.method1517();
				if (this.anInt2268 == 65535) {
					this.anInt2268 = -1;
					return;
				}
			} else if (arg0 == 27) {
				this.anInt2242 = 1;
			} else if (arg0 == 28) {
				this.anInt2254 = arg1.method1514();
				return;
			} else if (arg0 == 29) {
				this.anInt2241 = arg1.method1509();
				return;
			} else if (arg0 == 39) {
				this.anInt2274 = arg1.method1509() * 5;
				return;
			} else {
				if (arg0 >= 30 && arg0 < 35) {
					this.aClass74Array16[arg0 - 30] = arg1.method1530();
					if (this.aClass74Array16[arg0 - 30].method1701(Static79.aClass74_1213)) {
						this.aClass74Array16[arg0 - 30] = null;
						return;
					}
				} else if (arg0 == 40) {
					local14 = arg1.method1514();
					this.aShortArray13 = new short[local14];
					this.aShortArray14 = new short[local14];
					for (local34 = 0; local34 < local14; local34++) {
						this.aShortArray13[local34] = (short) arg1.method1517();
						this.aShortArray14[local34] = (short) arg1.method1517();
					}
				} else if (arg0 == 60) {
					this.anInt2269 = arg1.method1517();
					return;
				} else if (arg0 == 62) {
					this.aBoolean94 = true;
					return;
				} else if (arg0 == 64) {
					this.aBoolean95 = false;
					return;
				} else if (arg0 == 65) {
					this.anInt2265 = arg1.method1517();
					return;
				} else if (arg0 == 66) {
					this.anInt2251 = arg1.method1517();
					return;
				} else if (arg0 == 67) {
					this.anInt2253 = arg1.method1517();
					return;
				} else if (arg0 == 68) {
					this.anInt2239 = arg1.method1517();
					return;
				} else if (arg0 == 69) {
					this.anInt2243 = arg1.method1514();
					return;
				} else if (arg0 == 70) {
					this.anInt2245 = arg1.method1480();
					return;
				} else if (arg0 == 71) {
					this.anInt2263 = arg1.method1480();
					return;
				} else if (arg0 == 72) {
					this.anInt2246 = arg1.method1480();
					return;
				} else if (arg0 == 73) {
					this.aBoolean91 = true;
					return;
				} else if (arg0 == 74) {
					this.aBoolean96 = true;
					return;
				} else if (arg0 == 75) {
					this.anInt2252 = arg1.method1514();
					return;
				} else if (arg0 == 77) {
					this.anInt2240 = arg1.method1517();
					if (this.anInt2240 == 65535) {
						this.anInt2240 = -1;
					}
					this.anInt2270 = arg1.method1517();
					if (this.anInt2270 == 65535) {
						this.anInt2270 = -1;
					}
					local14 = arg1.method1514();
					this.anIntArray318 = new int[local14 + 1];
					for (local34 = 0; local34 <= local14; local34++) {
						this.anIntArray318[local34] = arg1.method1517();
						if (this.anIntArray318[local34] == 65535) {
							this.anIntArray318[local34] = -1;
						}
					}
					return;
				} else {
					if (arg0 == 78) {
						this.anInt2273 = arg1.method1517();
						this.anInt2264 = arg1.method1514();
					} else if (arg0 == 79) {
						this.anInt2257 = arg1.method1517();
						this.anInt2275 = arg1.method1517();
						this.anInt2264 = arg1.method1514();
						local14 = arg1.method1514();
						this.anIntArray319 = new int[local14];
						for (local34 = 0; local34 < local14; local34++) {
							this.anIntArray319[local34] = arg1.method1517();
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
