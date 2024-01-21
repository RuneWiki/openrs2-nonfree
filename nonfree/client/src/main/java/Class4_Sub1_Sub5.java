import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class4_Sub1_Sub5 extends Class4_Sub1 {

	@OriginalMember(owner = "client!hd", name = "N", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!hd", name = "P", descriptor = "[I")
	private int[] anIntArray134;

	@OriginalMember(owner = "client!hd", name = "U", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!hd", name = "cb", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!hd", name = "jb", descriptor = "[I")
	public int[] anIntArray135;

	@OriginalMember(owner = "client!hd", name = "mb", descriptor = "I")
	public int anInt1255;

	@OriginalMember(owner = "client!hd", name = "Ib", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!hd", name = "Qb", descriptor = "[I")
	public int[] anIntArray137;

	@OriginalMember(owner = "client!hd", name = "ac", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!hd", name = "V", descriptor = "Z")
	public boolean aBoolean117 = false;

	@OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
	public int anInt1242 = -1;

	@OriginalMember(owner = "client!hd", name = "ab", descriptor = "I")
	public int anInt1250 = -1;

	@OriginalMember(owner = "client!hd", name = "hb", descriptor = "I")
	private int anInt1252 = 128;

	@OriginalMember(owner = "client!hd", name = "Ab", descriptor = "I")
	public int anInt1268 = 2;

	@OriginalMember(owner = "client!hd", name = "eb", descriptor = "Lclient!ec;")
	public Class22 aClass22_309 = Static96.aClass22_712;

	@OriginalMember(owner = "client!hd", name = "nb", descriptor = "I")
	public int anInt1256 = 1;

	@OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
	public int anInt1241 = 0;

	@OriginalMember(owner = "client!hd", name = "Db", descriptor = "I")
	private int anInt1270 = 128;

	@OriginalMember(owner = "client!hd", name = "Bb", descriptor = "I")
	private int anInt1269 = -1;

	@OriginalMember(owner = "client!hd", name = "yb", descriptor = "I")
	public int anInt1267 = 1;

	@OriginalMember(owner = "client!hd", name = "wb", descriptor = "I")
	private int anInt1265 = 0;

	@OriginalMember(owner = "client!hd", name = "Kb", descriptor = "I")
	public int anInt1275 = 16;

	@OriginalMember(owner = "client!hd", name = "Fb", descriptor = "I")
	public int anInt1271 = 0;

	@OriginalMember(owner = "client!hd", name = "W", descriptor = "I")
	private int anInt1246 = 0;

	@OriginalMember(owner = "client!hd", name = "Rb", descriptor = "I")
	public int anInt1280 = -1;

	@OriginalMember(owner = "client!hd", name = "Lb", descriptor = "I")
	private int anInt1276 = -1;

	@OriginalMember(owner = "client!hd", name = "xb", descriptor = "I")
	private int anInt1266 = 0;

	@OriginalMember(owner = "client!hd", name = "Pb", descriptor = "I")
	public int anInt1279 = 0;

	@OriginalMember(owner = "client!hd", name = "K", descriptor = "Z")
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!hd", name = "qb", descriptor = "I")
	public int anInt1259 = -1;

	@OriginalMember(owner = "client!hd", name = "Tb", descriptor = "I")
	private int anInt1281 = -1;

	@OriginalMember(owner = "client!hd", name = "Ub", descriptor = "[Lclient!ec;")
	public final Class22[] aClass22Array8 = new Class22[5];

	@OriginalMember(owner = "client!hd", name = "kb", descriptor = "Z")
	public boolean aBoolean119 = true;

	@OriginalMember(owner = "client!hd", name = "ob", descriptor = "I")
	private int anInt1257 = 0;

	@OriginalMember(owner = "client!hd", name = "Sb", descriptor = "Z")
	public boolean aBoolean120 = true;

	@OriginalMember(owner = "client!hd", name = "O", descriptor = "Z")
	public boolean aBoolean116 = false;

	@OriginalMember(owner = "client!hd", name = "Vb", descriptor = "I")
	public int anInt1282 = -1;

	@OriginalMember(owner = "client!hd", name = "rb", descriptor = "I")
	public int anInt1260 = -1;

	@OriginalMember(owner = "client!hd", name = "bc", descriptor = "I")
	private int anInt1285 = 128;

	@OriginalMember(owner = "client!hd", name = "Wb", descriptor = "Z")
	private boolean aBoolean121 = false;

	@OriginalMember(owner = "client!hd", name = "Yb", descriptor = "I")
	public int anInt1283 = 0;

	@OriginalMember(owner = "client!hd", name = "Hb", descriptor = "I")
	private int anInt1273 = 0;

	@OriginalMember(owner = "client!hd", name = "bb", descriptor = "Z")
	public boolean aBoolean118 = false;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)Z")
	public boolean method874() {
		if (this.anIntArray137 == null) {
			return this.anInt1282 != -1 || this.anIntArray135 != null;
		}
		for (@Pc(29) int local29 = 0; local29 < this.anIntArray137.length; local29++) {
			if (this.anIntArray137[local29] != -1) {
				@Pc(44) Class4_Sub1_Sub5 local44 = Static5.method45(this.anIntArray137[local29]);
				if (local44.anInt1282 != -1 || local44.anIntArray135 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII[[III)Lclient!od;")
	public Class4_Sub1_Sub3_Sub3 method875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) long local19;
		if (this.anIntArray134 == null) {
			local19 = arg4 + (this.anInt1255 << 10);
		} else {
			local19 = arg4 + (arg1 << 3) + (this.anInt1255 << 10);
		}
		@Pc(39) Class4_Sub1_Sub3_Sub3 local39 = (Class4_Sub1_Sub3_Sub3) Static115.aClass33_31.method998(local19);
		if (local39 == null) {
			@Pc(47) Class4_Sub1_Sub3_Sub4 local47 = this.method876(arg4, arg1);
			if (local47 == null) {
				return null;
			}
			local39 = local47.method1531(this.anInt1265 + 64, this.anInt1273 * 5 + 768, -50, -10, -50);
			Static115.aClass33_31.method997(local19, local39);
		}
		if (this.anInt1276 >= 0) {
			local39 = local39.method1478(arg3, arg0, arg5, arg2, true, this.anInt1276);
		}
		return local39;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZI)Lclient!p;")
	private Class4_Sub1_Sub3_Sub4 method876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class4_Sub1_Sub3_Sub4 local7 = null;
		@Pc(14) int local14;
		@Pc(46) int local46;
		@Pc(108) boolean local108;
		@Pc(134) int local134;
		if (this.anIntArray134 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.anIntArray136 == null) {
				return null;
			}
			local108 = this.aBoolean121;
			if (arg1 == 2 && arg0 > 3) {
				local108 = !local108;
			}
			local14 = this.anIntArray136.length;
			for (local46 = 0; local46 < local14; local46++) {
				local134 = this.anIntArray136[local46];
				if (local108) {
					local134 += 65536;
				}
				local7 = (Class4_Sub1_Sub3_Sub4) Static96.aClass33_28.method998((long) local134);
				if (local7 == null) {
					local7 = Static86.method1524(Static99.aClass20_48, local134 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local108) {
						local7.method1528();
					}
					Static96.aClass33_28.method997((long) local134, local7);
				}
				if (local14 > 1) {
					Static115.aClass4_Sub1_Sub3_Sub4Array1[local46] = local7;
				}
			}
			if (local14 > 1) {
				local7 = new Class4_Sub1_Sub3_Sub4(Static115.aClass4_Sub1_Sub3_Sub4Array1, local14);
			}
		} else {
			@Pc(12) int local12 = -1;
			for (local14 = 0; local14 < this.anIntArray134.length; local14++) {
				if (this.anIntArray134[local14] == arg1) {
					local12 = local14;
					break;
				}
			}
			if (local12 == -1) {
				return null;
			}
			local46 = this.anIntArray136[local12];
			@Pc(56) boolean local56 = arg0 > 3 ^ this.aBoolean121;
			if (local56) {
				local46 += 65536;
			}
			local7 = (Class4_Sub1_Sub3_Sub4) Static96.aClass33_28.method998((long) local46);
			if (local7 == null) {
				local7 = Static86.method1524(Static99.aClass20_48, local46 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local56) {
					local7.method1528();
				}
				Static96.aClass33_28.method997((long) local46, local7);
			}
		}
		if (this.anInt1252 == 128 && this.anInt1270 == 128 && this.anInt1285 == 128) {
			local108 = false;
		} else {
			local108 = true;
		}
		@Pc(232) boolean local232;
		if (this.anInt1246 == 0 && this.anInt1257 == 0 && this.anInt1266 == 0) {
			local232 = false;
		} else {
			local232 = true;
		}
		@Pc(263) Class4_Sub1_Sub3_Sub4 local263 = new Class4_Sub1_Sub3_Sub4(local7, arg0 == 0 && !local108 && !local232, this.aShortArray6 == null, this.aShortArray7 == null, true);
		if (arg1 == 4 && arg0 > 3) {
			local263.method1535();
			local263.method1518(45, 0, -45);
		}
		@Pc(283) int local283 = arg0 & 0x3;
		if (local283 == 1) {
			local263.method1521();
		} else if (local283 == 2) {
			local263.method1526();
		} else if (local283 == 3) {
			local263.method1522();
		}
		if (this.aShortArray6 != null) {
			for (local134 = 0; local134 < this.aShortArray6.length; local134++) {
				local263.method1517(this.aShortArray6[local134], this.aShortArray8[local134]);
			}
		}
		if (this.aShortArray7 != null) {
			for (local134 = 0; local134 < this.aShortArray7.length; local134++) {
				local263.method1537(this.aShortArray7[local134], this.aShortArray5[local134]);
			}
		}
		if (local108) {
			local263.method1539(this.anInt1252, this.anInt1270, this.anInt1285);
		}
		if (local232) {
			local263.method1518(this.anInt1246, this.anInt1257, this.anInt1266);
		}
		return local263;
	}

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)Z")
	public boolean method877() {
		if (this.anIntArray136 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray136.length; local19++) {
			local12 &= Static99.aClass20_48.method604(this.anIntArray136[local19] & 0xFFFF, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZLclient!vc;II[[IIIII)Lclient!od;")
	public Class4_Sub1_Sub3_Sub3 method878(@OriginalArg(1) Class4_Sub1_Sub17 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(13) long local13;
		if (this.anIntArray134 == null) {
			local13 = (this.anInt1255 << 10) + arg7;
		} else {
			local13 = (arg2 << 3) + (this.anInt1255 << 10) + arg7;
		}
		@Pc(37) Class4_Sub1_Sub3_Sub3 local37 = (Class4_Sub1_Sub3_Sub3) Static115.aClass33_31.method998(local13);
		if (local37 == null) {
			@Pc(45) Class4_Sub1_Sub3_Sub4 local45 = this.method876(arg7, arg2);
			if (local45 == null) {
				return null;
			}
			local37 = local45.method1531(this.anInt1265 + 64, this.anInt1273 * 5 + 768, -50, -10, -50);
			Static115.aClass33_31.method997(local13, local37);
		}
		if (arg0 == null && this.anInt1276 == -1) {
			return local37;
		}
		if (arg0 == null) {
			local37 = local37.method1469(true);
		} else {
			local37 = arg0.method1913(arg7, arg5, local37);
		}
		if (this.anInt1276 >= 0) {
			local37 = local37.method1478(arg3, arg4, arg6, arg1, false, this.anInt1276);
		}
		return local37;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLclient!jd;I)V")
	private void method879(@OriginalArg(1) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16;
		@Pc(33) int local33;
		if (arg1 == 1) {
			local16 = arg0.method719();
			if (local16 > 0) {
				if (this.anIntArray136 != null && !Static32.aBoolean85) {
					arg0.anInt1099 += local16 * 3;
					return;
				}
				this.anIntArray136 = new int[local16];
				this.anIntArray134 = new int[local16];
				for (local33 = 0; local33 < local16; local33++) {
					this.anIntArray136[local33] = arg0.method718();
					this.anIntArray134[local33] = arg0.method719();
				}
				return;
			}
		} else if (arg1 == 2) {
			this.aClass22_309 = arg0.method742();
		} else if (arg1 == 5) {
			local16 = arg0.method719();
			if (local16 > 0) {
				if (this.anIntArray136 != null && !Static32.aBoolean85) {
					arg0.anInt1099 += local16 * 2;
					return;
				}
				this.anIntArray134 = null;
				this.anIntArray136 = new int[local16];
				for (local33 = 0; local33 < local16; local33++) {
					this.anIntArray136[local33] = arg0.method718();
				}
				return;
			}
		} else if (arg1 == 14) {
			this.anInt1256 = arg0.method719();
			return;
		} else if (arg1 == 15) {
			this.anInt1267 = arg0.method719();
			return;
		} else if (arg1 == 17) {
			this.aBoolean119 = false;
			this.anInt1268 = 0;
			return;
		} else if (arg1 == 18) {
			this.aBoolean119 = false;
			return;
		} else if (arg1 == 19) {
			this.anInt1242 = arg0.method719();
			return;
		} else if (arg1 == 21) {
			this.anInt1276 = 0;
			return;
		} else if (arg1 == 22) {
			this.aBoolean115 = true;
			return;
		} else if (arg1 == 23) {
			this.aBoolean118 = true;
			return;
		} else {
			if (arg1 == 24) {
				this.anInt1259 = arg0.method718();
				if (this.anInt1259 == 65535) {
					this.anInt1259 = -1;
					return;
				}
			} else if (arg1 == 27) {
				this.anInt1268 = 1;
			} else if (arg1 == 28) {
				this.anInt1275 = arg0.method719();
				return;
			} else if (arg1 == 29) {
				this.anInt1265 = arg0.method731();
				return;
			} else if (arg1 == 39) {
				this.anInt1273 = arg0.method731() * 5;
				return;
			} else {
				if (arg1 >= 30 && arg1 < 35) {
					this.aClass22Array8[arg1 - 30] = arg0.method742();
					if (this.aClass22Array8[arg1 - 30].method480(Static134.aClass22_978)) {
						this.aClass22Array8[arg1 - 30] = null;
						return;
					}
				} else if (arg1 == 40) {
					local16 = arg0.method719();
					this.aShortArray6 = new short[local16];
					this.aShortArray8 = new short[local16];
					for (local33 = 0; local33 < local16; local33++) {
						this.aShortArray6[local33] = (short) arg0.method718();
						this.aShortArray8[local33] = (short) arg0.method718();
					}
				} else if (arg1 == 41) {
					local16 = arg0.method719();
					this.aShortArray5 = new short[local16];
					this.aShortArray7 = new short[local16];
					for (local33 = 0; local33 < local16; local33++) {
						this.aShortArray7[local33] = (short) arg0.method718();
						this.aShortArray5[local33] = (short) arg0.method718();
					}
					return;
				} else if (arg1 == 60) {
					this.anInt1250 = arg0.method718();
					return;
				} else if (arg1 == 62) {
					this.aBoolean121 = true;
					return;
				} else if (arg1 == 64) {
					this.aBoolean120 = false;
					return;
				} else if (arg1 == 65) {
					this.anInt1252 = arg0.method718();
					return;
				} else if (arg1 == 66) {
					this.anInt1270 = arg0.method718();
					return;
				} else if (arg1 == 67) {
					this.anInt1285 = arg0.method718();
					return;
				} else if (arg1 == 68) {
					this.anInt1260 = arg0.method718();
					return;
				} else if (arg1 == 69) {
					this.anInt1241 = arg0.method719();
					return;
				} else if (arg1 == 70) {
					this.anInt1246 = arg0.method738();
					return;
				} else if (arg1 == 71) {
					this.anInt1257 = arg0.method738();
					return;
				} else if (arg1 == 72) {
					this.anInt1266 = arg0.method738();
					return;
				} else if (arg1 == 73) {
					this.aBoolean117 = true;
					return;
				} else if (arg1 == 74) {
					this.aBoolean116 = true;
					return;
				} else if (arg1 == 75) {
					this.anInt1280 = arg0.method719();
					return;
				} else if (arg1 == 77) {
					this.anInt1281 = arg0.method718();
					if (this.anInt1281 == 65535) {
						this.anInt1281 = -1;
					}
					this.anInt1269 = arg0.method718();
					if (this.anInt1269 == 65535) {
						this.anInt1269 = -1;
					}
					local16 = arg0.method719();
					this.anIntArray137 = new int[local16 + 1];
					for (local33 = 0; local33 <= local16; local33++) {
						this.anIntArray137[local33] = arg0.method718();
						if (this.anIntArray137[local33] == 65535) {
							this.anIntArray137[local33] = -1;
						}
					}
					return;
				} else if (arg1 == 78) {
					this.anInt1282 = arg0.method718();
					this.anInt1271 = arg0.method719();
					return;
				} else {
					if (arg1 == 79) {
						this.anInt1283 = arg0.method718();
						this.anInt1279 = arg0.method718();
						this.anInt1271 = arg0.method719();
						local16 = arg0.method719();
						this.anIntArray135 = new int[local16];
						for (local33 = 0; local33 < local16; local33++) {
							this.anIntArray135[local33] = arg0.method718();
						}
					} else if (arg1 == 81) {
						this.anInt1276 = arg0.method719() * 256;
						return;
					}
					return;
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!jd;Z)V")
	public void method882(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method719();
			if (local5 == 0) {
				return;
			}
			this.method879(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZIII[[III)Lclient!dd;")
	public Class4_Sub1_Sub3 method884(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(21) long local21;
		if (this.anIntArray134 == null) {
			local21 = arg2 + (this.anInt1255 << 10);
		} else {
			local21 = (this.anInt1255 << 10) + (arg5 << 3) + arg2;
		}
		@Pc(42) Class4_Sub1_Sub3 local42 = (Class4_Sub1_Sub3) Static29.aClass33_10.method998(local21);
		if (local42 == null) {
			@Pc(50) Class4_Sub1_Sub3_Sub4 local50 = this.method876(arg2, arg5);
			if (local50 == null) {
				return null;
			}
			if (this.aBoolean115) {
				local42 = local50;
				local50.aShort2 = (short) (this.anInt1273 * 5 + 768);
				local50.aShort1 = (short) (this.anInt1265 + 64);
				local50.method1523();
			} else {
				local42 = local50.method1531(this.anInt1265 + 64, this.anInt1273 * 5 + 768, -50, -10, -50);
			}
			Static29.aClass33_10.method997(local21, local42);
		}
		if (this.aBoolean115) {
			local42 = ((Class4_Sub1_Sub3_Sub4) local42).method1516();
		}
		if (this.anInt1276 >= 0) {
			if (local42 instanceof Class4_Sub1_Sub3_Sub3) {
				local42 = ((Class4_Sub1_Sub3_Sub3) local42).method1478(arg3, arg4, arg1, arg0, true, this.anInt1276);
			} else if (local42 instanceof Class4_Sub1_Sub3_Sub4) {
				local42 = ((Class4_Sub1_Sub3_Sub4) local42).method1520(arg3, arg4, arg1, arg0, this.anInt1276);
			}
		}
		return local42;
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)Lclient!hd;")
	public Class4_Sub1_Sub5 method885() {
		@Pc(5) int local5 = -1;
		if (this.anInt1281 != -1) {
			local5 = Static57.method1093(this.anInt1281);
		} else if (this.anInt1269 != -1) {
			local5 = Static23.anIntArray61[this.anInt1269];
		}
		return local5 < 0 || local5 >= this.anIntArray137.length || this.anIntArray137[local5] == -1 ? null : Static5.method45(this.anIntArray137[local5]);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)Z")
	public boolean method886(@OriginalArg(1) int arg0) {
		if (this.anIntArray134 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray134.length; local15++) {
				if (this.anIntArray134[local15] == arg0) {
					return Static99.aClass20_48.method604(this.anIntArray136[local15] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray136 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(58) boolean local58 = true;
			for (@Pc(60) int local60 = 0; local60 < this.anIntArray136.length; local60++) {
				local58 &= Static99.aClass20_48.method604(this.anIntArray136[local60] & 0xFFFF, 0);
			}
			return local58;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
	public void method887() {
		if (this.anInt1242 == -1) {
			this.anInt1242 = 0;
			if (this.anIntArray136 != null && (this.anIntArray134 == null || this.anIntArray134[0] == 10)) {
				this.anInt1242 = 1;
			}
			for (@Pc(31) int local31 = 0; local31 < 5; local31++) {
				if (this.aClass22Array8[local31] != null) {
					this.anInt1242 = 1;
				}
			}
		}
		if (this.anInt1280 == -1) {
			this.anInt1280 = this.anInt1268 == 0 ? 0 : 1;
		}
	}
}
