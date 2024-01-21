import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nh", name = "V", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!nh", name = "ab", descriptor = "[I")
	private int[] anIntArray316;

	@OriginalMember(owner = "client!nh", name = "eb", descriptor = "I")
	public int anInt3243;

	@OriginalMember(owner = "client!nh", name = "hb", descriptor = "[I")
	private int[] anIntArray317;

	@OriginalMember(owner = "client!nh", name = "rb", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!nh", name = "sb", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!nh", name = "ub", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!nh", name = "yb", descriptor = "[I")
	public int[] anIntArray318;

	@OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
	public int anInt3234 = 1;

	@OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
	private int anInt3229 = -1;

	@OriginalMember(owner = "client!nh", name = "K", descriptor = "I")
	private int anInt3233 = -1;

	@OriginalMember(owner = "client!nh", name = "I", descriptor = "Z")
	public boolean aBoolean128 = true;

	@OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
	public int anInt3237 = -1;

	@OriginalMember(owner = "client!nh", name = "N", descriptor = "Z")
	public boolean aBoolean129 = true;

	@OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
	public int anInt3235 = -1;

	@OriginalMember(owner = "client!nh", name = "gb", descriptor = "Lclient!rf;")
	public Class70 aClass70_1091 = Static59.aClass70_593;

	@OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
	public int anInt3239 = -1;

	@OriginalMember(owner = "client!nh", name = "Y", descriptor = "[Lclient!rf;")
	public final Class70[] aClass70Array17 = new Class70[5];

	@OriginalMember(owner = "client!nh", name = "db", descriptor = "I")
	private int anInt3242 = 0;

	@OriginalMember(owner = "client!nh", name = "ob", descriptor = "I")
	private int anInt3249 = 128;

	@OriginalMember(owner = "client!nh", name = "fb", descriptor = "I")
	public int anInt3244 = -1;

	@OriginalMember(owner = "client!nh", name = "jb", descriptor = "I")
	private int anInt3245 = 128;

	@OriginalMember(owner = "client!nh", name = "bb", descriptor = "I")
	public int anInt3241 = -1;

	@OriginalMember(owner = "client!nh", name = "X", descriptor = "S")
	public short aShort34 = 0;

	@OriginalMember(owner = "client!nh", name = "pb", descriptor = "Z")
	public boolean aBoolean130 = true;

	@OriginalMember(owner = "client!nh", name = "lb", descriptor = "I")
	public int anInt3247 = -1;

	@OriginalMember(owner = "client!nh", name = "S", descriptor = "S")
	public short aShort33 = 0;

	@OriginalMember(owner = "client!nh", name = "qb", descriptor = "Z")
	public boolean aBoolean131 = false;

	@OriginalMember(owner = "client!nh", name = "tb", descriptor = "I")
	private int anInt3250 = 0;

	@OriginalMember(owner = "client!nh", name = "wb", descriptor = "I")
	public int anInt3252 = -1;

	@OriginalMember(owner = "client!nh", name = "nb", descriptor = "I")
	public int anInt3248 = -1;

	@OriginalMember(owner = "client!nh", name = "xb", descriptor = "I")
	public int anInt3253 = 32;

	@OriginalMember(owner = "client!nh", name = "zb", descriptor = "I")
	public int anInt3254 = -1;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
	public void method2423() {
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!fa;II)V")
	private void method2424(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (arg1 == 1) {
			local18 = arg0.method1234();
			this.anIntArray316 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray316[local24] = arg0.method1280();
			}
		} else if (arg1 == 2) {
			this.aClass70_1091 = arg0.method1253();
		} else if (arg1 == 12) {
			this.anInt3234 = arg0.method1234();
		} else if (arg1 == 13) {
			this.anInt3237 = arg0.method1280();
		} else if (arg1 == 14) {
			this.anInt3244 = arg0.method1280();
		} else if (arg1 == 15) {
			this.anInt3241 = arg0.method1280();
		} else if (arg1 == 16) {
			this.anInt3239 = arg0.method1280();
		} else if (arg1 == 17) {
			this.anInt3244 = arg0.method1280();
			this.anInt3235 = arg0.method1280();
			this.anInt3247 = arg0.method1280();
			this.anInt3248 = arg0.method1280();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass70Array17[arg1 - 30] = arg0.method1253();
			if (this.aClass70Array17[arg1 - 30].method2905(Static67.aClass70_646)) {
				this.aClass70Array17[arg1 - 30] = null;
				return;
			}
		} else if (arg1 == 40) {
			local18 = arg0.method1234();
			this.aShortArray28 = new short[local18];
			this.aShortArray29 = new short[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.aShortArray29[local24] = (short) arg0.method1280();
				this.aShortArray28[local24] = (short) arg0.method1280();
			}
			return;
		} else if (arg1 == 41) {
			local18 = arg0.method1234();
			this.aShortArray27 = new short[local18];
			this.aShortArray30 = new short[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.aShortArray27[local24] = (short) arg0.method1280();
				this.aShortArray30[local24] = (short) arg0.method1280();
			}
			return;
		} else if (arg1 == 60) {
			local18 = arg0.method1234();
			this.anIntArray317 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray317[local24] = arg0.method1280();
			}
			return;
		} else if (arg1 == 93) {
			this.aBoolean129 = false;
			return;
		} else if (arg1 == 95) {
			this.anInt3252 = arg0.method1280();
			return;
		} else if (arg1 == 97) {
			this.anInt3249 = arg0.method1280();
			return;
		} else if (arg1 == 98) {
			this.anInt3245 = arg0.method1280();
			return;
		} else if (arg1 == 99) {
			this.aBoolean131 = true;
			return;
		} else if (arg1 == 100) {
			this.anInt3242 = arg0.method1243();
			return;
		} else if (arg1 == 101) {
			this.anInt3250 = arg0.method1243() * 5;
			return;
		} else if (arg1 == 102) {
			this.anInt3254 = arg0.method1280();
			return;
		} else if (arg1 == 103) {
			this.anInt3253 = arg0.method1280();
			return;
		} else if (arg1 == 106) {
			this.anInt3233 = arg0.method1280();
			if (this.anInt3233 == 65535) {
				this.anInt3233 = -1;
			}
			this.anInt3229 = arg0.method1280();
			if (this.anInt3229 == 65535) {
				this.anInt3229 = -1;
			}
			local18 = arg0.method1234();
			this.anIntArray318 = new int[local18 + 1];
			for (local24 = 0; local24 <= local18; local24++) {
				this.anIntArray318[local24] = arg0.method1280();
				if (this.anIntArray318[local24] == 65535) {
					this.anIntArray318[local24] = -1;
				}
			}
			return;
		} else {
			if (arg1 == 107) {
				this.aBoolean128 = false;
			} else if (arg1 == 109) {
				this.aBoolean130 = false;
				return;
			} else if (arg1 != 111) {
				if (arg1 == 113) {
					arg0.method1280();
					arg0.method1280();
					return;
				}
				if (arg1 == 114) {
					arg0.method1243();
					arg0.method1243();
					return;
				}
				if (arg1 == 115) {
					this.aShort34 = (short) (arg0.method1234() * 4);
					this.aShort33 = (short) (arg0.method1234() * 4);
					return;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILclient!re;ILclient!re;)Lclient!je;")
	public Class1_Sub1_Sub4_Sub1 method2425(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub17 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub17 arg3) {
		if (this.anIntArray318 != null) {
			@Pc(17) Class1_Sub1_Sub13 local17 = this.method2427();
			return local17 == null ? null : local17.method2425(arg0, arg1, arg2, arg3);
		}
		@Pc(37) Class1_Sub1_Sub4_Sub1 local37 = (Class1_Sub1_Sub4_Sub1) Static174.aClass25_28.method1302((long) this.anInt3243);
		if (local37 == null) {
			@Pc(41) boolean local41 = false;
			for (@Pc(43) int local43 = 0; local43 < this.anIntArray316.length; local43++) {
				if (!Static83.aClass76_136.method3329(this.anIntArray316[local43], 0)) {
					local41 = true;
				}
			}
			if (local41) {
				return null;
			}
			@Pc(77) Class1_Sub1_Sub4_Sub3[] local77 = new Class1_Sub1_Sub4_Sub3[this.anIntArray316.length];
			for (@Pc(79) int local79 = 0; local79 < this.anIntArray316.length; local79++) {
				local77[local79] = Static46.method1144(Static83.aClass76_136, this.anIntArray316[local79]);
			}
			@Pc(110) Class1_Sub1_Sub4_Sub3 local110;
			if (local77.length == 1) {
				local110 = local77[0];
			} else {
				local110 = new Class1_Sub1_Sub4_Sub3(local77, local77.length);
			}
			@Pc(121) int local121;
			if (this.aShortArray29 != null) {
				for (local121 = 0; local121 < this.aShortArray29.length; local121++) {
					local110.method1146(this.aShortArray29[local121], this.aShortArray28[local121]);
				}
			}
			if (this.aShortArray27 != null) {
				for (local121 = 0; local121 < this.aShortArray27.length; local121++) {
					local110.method1149(this.aShortArray27[local121], this.aShortArray30[local121]);
				}
			}
			local37 = local110.method1135(this.anInt3242 + 64, this.anInt3250 + 850, -30, -50, -30, true);
			Static174.aClass25_28.method1299(local37, (long) this.anInt3243);
		}
		@Pc(201) Class1_Sub1_Sub4_Sub1 local201;
		if (arg1 != null && arg3 != null) {
			local201 = arg1.method2881(arg3, local37, arg0, arg2);
		} else if (arg1 != null) {
			local201 = arg1.method2886(arg2, local37);
		} else if (arg3 == null) {
			local201 = local37.method733(true);
		} else {
			local201 = arg3.method2886(arg0, local37);
		}
		if (this.anInt3249 != 128 || this.anInt3245 != 128) {
			local201.method719(this.anInt3249, this.anInt3245, this.anInt3249);
		}
		return local201;
	}

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "(I)Lclient!nh;")
	public Class1_Sub1_Sub13 method2427() {
		@Pc(5) int local5 = -1;
		if (this.anInt3233 != -1) {
			local5 = Static79.method1809(this.anInt3233);
		} else if (this.anInt3229 != -1) {
			local5 = Static133.anIntArray330[this.anInt3229];
		}
		return local5 < 0 || this.anIntArray318.length <= local5 || this.anIntArray318[local5] == -1 ? null : Static41.method1031(this.anIntArray318[local5]);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IBLclient!re;)Lclient!je;")
	public Class1_Sub1_Sub4_Sub1 method2428(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub17 arg1) {
		if (this.anIntArray318 != null) {
			@Pc(19) Class1_Sub1_Sub13 local19 = this.method2427();
			return local19 == null ? null : local19.method2428(arg0, arg1);
		} else if (this.anIntArray317 == null) {
			return null;
		} else {
			@Pc(42) Class1_Sub1_Sub4_Sub1 local42 = (Class1_Sub1_Sub4_Sub1) Static178.aClass25_29.method1302((long) this.anInt3243);
			if (local42 == null) {
				@Pc(46) boolean local46 = false;
				for (@Pc(48) int local48 = 0; local48 < this.anIntArray317.length; local48++) {
					if (!Static83.aClass76_136.method3329(this.anIntArray317[local48], 0)) {
						local46 = true;
					}
				}
				if (local46) {
					return null;
				}
				@Pc(80) Class1_Sub1_Sub4_Sub3[] local80 = new Class1_Sub1_Sub4_Sub3[this.anIntArray317.length];
				for (@Pc(82) int local82 = 0; local82 < this.anIntArray317.length; local82++) {
					local80[local82] = Static46.method1144(Static83.aClass76_136, this.anIntArray317[local82]);
				}
				@Pc(111) Class1_Sub1_Sub4_Sub3 local111;
				if (local80.length == 1) {
					local111 = local80[0];
				} else {
					local111 = new Class1_Sub1_Sub4_Sub3(local80, local80.length);
				}
				@Pc(122) int local122;
				if (this.aShortArray29 != null) {
					for (local122 = 0; local122 < this.aShortArray29.length; local122++) {
						local111.method1146(this.aShortArray29[local122], this.aShortArray28[local122]);
					}
				}
				if (this.aShortArray27 != null) {
					for (local122 = 0; local122 < this.aShortArray27.length; local122++) {
						local111.method1149(this.aShortArray27[local122], this.aShortArray30[local122]);
					}
				}
				local42 = local111.method1135(64, 768, -50, -10, -50, true);
				Static178.aClass25_29.method1299(local42, (long) this.anInt3243);
			}
			if (arg1 != null) {
				local42 = arg1.method2888(local42, arg0);
			}
			return local42;
		}
	}

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "(I)Z")
	public boolean method2429() {
		if (this.anIntArray318 == null) {
			return true;
		}
		@Pc(15) int local15 = -1;
		if (this.anInt3233 != -1) {
			local15 = Static79.method1809(this.anInt3233);
		} else if (this.anInt3229 != -1) {
			local15 = Static133.anIntArray330[this.anInt3229];
		}
		return local15 >= 0 && this.anIntArray318.length > local15 && this.anIntArray318[local15] != -1;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!fa;Z)V")
	public void method2430(@OriginalArg(0) Class1_Sub9 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1234();
			if (local13 == 0) {
				return;
			}
			this.method2424(arg0, local13);
		}
	}
}
