import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class3_Sub3_Sub4 extends Class3_Sub3 {

	@OriginalMember(owner = "client!jc", name = "T", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!jc", name = "V", descriptor = "[I")
	public int[] anIntArray215;

	@OriginalMember(owner = "client!jc", name = "sb", descriptor = "[I")
	public int[] anIntArray216;

	@OriginalMember(owner = "client!jc", name = "vb", descriptor = "[I")
	private int[] anIntArray217;

	@OriginalMember(owner = "client!jc", name = "zb", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!jc", name = "Ob", descriptor = "I")
	public int anInt1332;

	@OriginalMember(owner = "client!jc", name = "Pb", descriptor = "[I")
	private int[] anIntArray219;

	@OriginalMember(owner = "client!jc", name = "W", descriptor = "I")
	private int anInt1300 = 0;

	@OriginalMember(owner = "client!jc", name = "bb", descriptor = "I")
	public int anInt1305 = 0;

	@OriginalMember(owner = "client!jc", name = "ab", descriptor = "I")
	private int anInt1304 = 0;

	@OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
	public int anInt1299 = 0;

	@OriginalMember(owner = "client!jc", name = "ub", descriptor = "I")
	public int anInt1320 = 0;

	@OriginalMember(owner = "client!jc", name = "yb", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!jc", name = "hb", descriptor = "I")
	public int anInt1309 = 1;

	@OriginalMember(owner = "client!jc", name = "qb", descriptor = "I")
	public int anInt1317 = -1;

	@OriginalMember(owner = "client!jc", name = "jb", descriptor = "I")
	public int anInt1311 = -1;

	@OriginalMember(owner = "client!jc", name = "lb", descriptor = "I")
	private int anInt1312 = 0;

	@OriginalMember(owner = "client!jc", name = "Eb", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!jc", name = "Fb", descriptor = "Lclient!hb;")
	public Class27 aClass27_642 = Static47.aClass27_624;

	@OriginalMember(owner = "client!jc", name = "nb", descriptor = "I")
	public int anInt1314 = -1;

	@OriginalMember(owner = "client!jc", name = "gb", descriptor = "I")
	public int anInt1308 = -1;

	@OriginalMember(owner = "client!jc", name = "Db", descriptor = "I")
	private int anInt1325 = 128;

	@OriginalMember(owner = "client!jc", name = "Mb", descriptor = "Z")
	public boolean aBoolean64 = true;

	@OriginalMember(owner = "client!jc", name = "Cb", descriptor = "Z")
	public boolean aBoolean62 = true;

	@OriginalMember(owner = "client!jc", name = "Jb", descriptor = "I")
	private int anInt1328 = 0;

	@OriginalMember(owner = "client!jc", name = "eb", descriptor = "[Lclient!hb;")
	public final Class27[] aClass27Array6 = new Class27[5];

	@OriginalMember(owner = "client!jc", name = "Qb", descriptor = "Z")
	public boolean aBoolean65 = false;

	@OriginalMember(owner = "client!jc", name = "Tb", descriptor = "Z")
	public boolean aBoolean66 = false;

	@OriginalMember(owner = "client!jc", name = "Sb", descriptor = "I")
	private int anInt1333 = 128;

	@OriginalMember(owner = "client!jc", name = "db", descriptor = "Z")
	public boolean aBoolean60 = false;

	@OriginalMember(owner = "client!jc", name = "Vb", descriptor = "I")
	public int anInt1334 = 1;

	@OriginalMember(owner = "client!jc", name = "fb", descriptor = "I")
	public int anInt1307 = -1;

	@OriginalMember(owner = "client!jc", name = "rb", descriptor = "I")
	public int anInt1318 = -1;

	@OriginalMember(owner = "client!jc", name = "Ub", descriptor = "Z")
	public boolean aBoolean67 = false;

	@OriginalMember(owner = "client!jc", name = "Nb", descriptor = "I")
	public int anInt1331 = 0;

	@OriginalMember(owner = "client!jc", name = "Wb", descriptor = "Z")
	public boolean aBoolean68 = true;

	@OriginalMember(owner = "client!jc", name = "Kb", descriptor = "I")
	private int anInt1329 = -1;

	@OriginalMember(owner = "client!jc", name = "mb", descriptor = "I")
	private int anInt1313 = 128;

	@OriginalMember(owner = "client!jc", name = "Zb", descriptor = "I")
	private int anInt1337 = 0;

	@OriginalMember(owner = "client!jc", name = "Yb", descriptor = "I")
	public int anInt1336 = 16;

	@OriginalMember(owner = "client!jc", name = "ac", descriptor = "I")
	private int anInt1338 = -1;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ua;IIIIIIII)Lclient!de;")
	public Class3_Sub3_Sub1_Sub1 method968(@OriginalArg(0) Class3_Sub3_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(22) long local22;
		if (this.anIntArray218 == null) {
			local22 = arg4 + (this.anInt1332 << 10);
		} else {
			local22 = arg4 + (arg2 << 3) + (this.anInt1332 << 10);
		}
		@Pc(42) Class3_Sub3_Sub1_Sub1 local42 = (Class3_Sub3_Sub1_Sub1) Static76.aClass21_24.method658(local22);
		if (local42 == null) {
			local42 = this.method980(arg4, true, true, arg2);
			if (local42 == null) {
				return null;
			}
			Static76.aClass21_24.method660(local42, local22);
		}
		if (arg0 == null && !this.aBoolean67) {
			return local42;
		}
		if (arg0 == null) {
			local42 = local42.method405(true);
		} else {
			local42 = arg0.method1798(arg6, arg4, local42);
		}
		if (this.aBoolean67) {
			@Pc(96) int local96 = (arg5 + arg1 + arg3 + arg7) / 4;
			for (@Pc(98) int local98 = 0; local98 < local42.anInt538; local98++) {
				@Pc(105) int local105 = local42.anIntArray74[local98];
				@Pc(110) int local110 = local42.anIntArray80[local98];
				@Pc(123) int local123 = (local105 + 64) * (-arg3 + arg7) / 128 + arg3;
				@Pc(136) int local136 = (local105 + 64) * (-arg5 + arg1) / 128 + arg5;
				@Pc(149) int local149 = (local136 - local123) * (local110 + 64) / 128 + local123;
				local42.anIntArray76[local98] += local149 - local96;
			}
		}
		return local42;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V")
	public void method969() {
		if (this.anInt1311 == -1) {
			this.anInt1311 = 0;
			if (this.anIntArray219 != null && (this.anIntArray218 == null || this.anIntArray218[0] == 10)) {
				this.anInt1311 = 1;
			}
			for (@Pc(26) int local26 = 0; local26 < 5; local26++) {
				if (this.aClass27Array6[local26] != null) {
					this.anInt1311 = 1;
				}
			}
		}
		if (this.anInt1307 == -1) {
			this.anInt1307 = this.aBoolean68 ? 1 : 0;
		}
	}

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "(I)Z")
	public boolean method970() {
		if (this.anIntArray219 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray219.length; local14++) {
			local12 &= Static38.aClass54_17.method1598(this.anIntArray219[local14] & 0xFFFF, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)Lclient!jc;")
	public Class3_Sub3_Sub4 method974() {
		@Pc(1) int local1 = -1;
		if (this.anInt1329 != -1) {
			local1 = Static93.method1749(this.anInt1329);
		} else if (this.anInt1338 != -1) {
			local1 = Static18.anIntArray60[this.anInt1338];
		}
		return local1 < 0 || local1 >= this.anIntArray215.length || this.anIntArray215[local1] == -1 ? null : Static108.method1902(this.anIntArray215[local1]);
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(B)Z")
	public boolean method976() {
		if (this.anIntArray215 == null) {
			return this.anInt1308 != -1 || this.anIntArray216 != null;
		}
		for (@Pc(28) int local28 = 0; local28 < this.anIntArray215.length; local28++) {
			if (this.anIntArray215[local28] != -1) {
				@Pc(43) Class3_Sub3_Sub4 local43 = Static108.method1902(this.anIntArray215[local28]);
				if (local43.anInt1308 != -1 || local43.anIntArray216 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)Lclient!de;")
	public Class3_Sub3_Sub1_Sub1 method977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(20) long local20;
		if (this.anIntArray218 == null) {
			local20 = (this.anInt1332 << 10) + arg4;
		} else {
			local20 = (this.anInt1332 << 10) + (arg3 << 3) + arg4;
		}
		@Pc(42) Class3_Sub3_Sub1_Sub1 local42 = (Class3_Sub3_Sub1_Sub1) Static62.aClass21_19.method658(local20);
		if (local42 == null) {
			local42 = this.method980(arg4, !this.aBoolean63, false, arg3);
			if (local42 == null) {
				return null;
			}
			Static62.aClass21_19.method660(local42, local20);
		}
		if (this.aBoolean67 || this.aBoolean63) {
			local42 = new Class3_Sub3_Sub1_Sub1(local42, this.aBoolean67, this.aBoolean63);
		}
		if (this.aBoolean67) {
			@Pc(95) int local95 = (arg0 + arg5 + arg1 + arg2) / 4;
			for (@Pc(97) int local97 = 0; local97 < local42.anInt538; local97++) {
				@Pc(104) int local104 = local42.anIntArray74[local97];
				@Pc(109) int local109 = local42.anIntArray80[local97];
				@Pc(122) int local122 = (local104 + 64) * (arg2 - arg1) / 128 + arg1;
				@Pc(136) int local136 = arg0 + (local104 + 64) * (arg5 + -arg0) / 128;
				@Pc(149) int local149 = (local109 + 64) * (local136 - local122) / 128 + local122;
				local42.anIntArray76[local97] += local149 - local95;
			}
		}
		return local42;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILclient!wd;)V")
	private void method979(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		@Pc(23) int local23;
		@Pc(49) int local49;
		if (arg0 == 1) {
			local23 = arg1.method1421();
			if (local23 > 0) {
				if (this.anIntArray219 == null || Static1.aBoolean1) {
					this.anIntArray218 = new int[local23];
					this.anIntArray219 = new int[local23];
					for (local49 = 0; local49 < local23; local49++) {
						this.anIntArray219[local49] = arg1.method1451();
						this.anIntArray218[local49] = arg1.method1421();
					}
				} else {
					arg1.anInt2060 += local23 * 3;
				}
			}
		} else if (arg0 == 2) {
			this.aClass27_642 = arg1.method1426();
		} else if (arg0 == 5) {
			local23 = arg1.method1421();
			if (local23 > 0) {
				if (this.anIntArray219 == null || Static1.aBoolean1) {
					this.anIntArray219 = new int[local23];
					this.anIntArray218 = null;
					for (local49 = 0; local49 < local23; local49++) {
						this.anIntArray219[local49] = arg1.method1451();
					}
				} else {
					arg1.anInt2060 += local23 * 2;
				}
			}
		} else if (arg0 == 14) {
			this.anInt1334 = arg1.method1421();
		} else if (arg0 == 15) {
			this.anInt1309 = arg1.method1421();
		} else if (arg0 == 17) {
			this.aBoolean68 = false;
		} else if (arg0 == 18) {
			this.aBoolean64 = false;
		} else if (arg0 == 19) {
			this.anInt1311 = arg1.method1421();
		} else if (arg0 == 21) {
			this.aBoolean67 = true;
		} else if (arg0 == 22) {
			this.aBoolean63 = true;
		} else if (arg0 == 23) {
			this.aBoolean60 = true;
		} else if (arg0 == 24) {
			this.anInt1318 = arg1.method1451();
			if (this.anInt1318 == 65535) {
				this.anInt1318 = -1;
			}
		} else if (arg0 == 28) {
			this.anInt1336 = arg1.method1421();
		} else if (arg0 == 29) {
			this.anInt1337 = arg1.method1432();
		} else if (arg0 == 39) {
			this.anInt1328 = arg1.method1432() * 5;
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass27Array6[arg0 - 30] = arg1.method1426();
			if (this.aClass27Array6[arg0 - 30].method763(Static107.aClass27_1339)) {
				this.aClass27Array6[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local23 = arg1.method1421();
			this.anIntArray217 = new int[local23];
			this.anIntArray214 = new int[local23];
			for (local49 = 0; local49 < local23; local49++) {
				this.anIntArray217[local49] = arg1.method1451();
				this.anIntArray214[local49] = arg1.method1451();
			}
		} else if (arg0 == 60) {
			this.anInt1317 = arg1.method1451();
		} else if (arg0 == 62) {
			this.aBoolean61 = true;
		} else if (arg0 == 64) {
			this.aBoolean62 = false;
		} else if (arg0 == 65) {
			this.anInt1333 = arg1.method1451();
		} else if (arg0 == 66) {
			this.anInt1313 = arg1.method1451();
		} else if (arg0 == 67) {
			this.anInt1325 = arg1.method1451();
		} else if (arg0 == 68) {
			this.anInt1314 = arg1.method1451();
		} else if (arg0 == 69) {
			this.anInt1299 = arg1.method1421();
		} else if (arg0 == 70) {
			this.anInt1300 = arg1.method1428();
		} else if (arg0 == 71) {
			this.anInt1304 = arg1.method1428();
		} else if (arg0 == 72) {
			this.anInt1312 = arg1.method1428();
		} else if (arg0 == 73) {
			this.aBoolean66 = true;
		} else if (arg0 == 74) {
			this.aBoolean65 = true;
		} else if (arg0 == 75) {
			this.anInt1307 = arg1.method1421();
		} else if (arg0 == 77) {
			this.anInt1329 = arg1.method1451();
			if (this.anInt1329 == 65535) {
				this.anInt1329 = -1;
			}
			this.anInt1338 = arg1.method1451();
			if (this.anInt1338 == 65535) {
				this.anInt1338 = -1;
			}
			local23 = arg1.method1421();
			this.anIntArray215 = new int[local23 + 1];
			for (local49 = 0; local49 <= local23; local49++) {
				this.anIntArray215[local49] = arg1.method1451();
				if (this.anIntArray215[local49] == 65535) {
					this.anIntArray215[local49] = -1;
				}
			}
		} else if (arg0 == 78) {
			this.anInt1308 = arg1.method1451();
			this.anInt1305 = arg1.method1421();
		} else if (arg0 == 79) {
			this.anInt1331 = arg1.method1451();
			this.anInt1320 = arg1.method1451();
			this.anInt1305 = arg1.method1421();
			local23 = arg1.method1421();
			this.anIntArray216 = new int[local23];
			for (local49 = 0; local49 < local23; local49++) {
				this.anIntArray216[local49] = arg1.method1451();
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZZIB)Lclient!de;")
	private Class3_Sub3_Sub1_Sub1 method980(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class3_Sub3_Sub1_Sub1 local7 = null;
		@Pc(14) int local14;
		@Pc(42) int local42;
		@Pc(113) boolean local113;
		if (this.anIntArray218 == null) {
			if (arg3 != 10) {
				return null;
			}
			if (this.anIntArray219 == null) {
				return null;
			}
			local113 = this.aBoolean61 ^ arg0 > 3;
			local14 = this.anIntArray219.length;
			for (local42 = 0; local42 < local14; local42++) {
				@Pc(125) int local125 = this.anIntArray219[local42];
				if (local113) {
					local125 += 65536;
				}
				local7 = (Class3_Sub3_Sub1_Sub1) Static10.aClass21_9.method658((long) local125);
				if (local7 == null) {
					local7 = Static21.method398(Static38.aClass54_17, local125 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local113) {
						local7.method399();
					}
					Static10.aClass21_9.method660(local7, (long) local125);
				}
				if (local14 > 1) {
					Static104.aClass3_Sub3_Sub1_Sub1Array1[local42] = local7;
				}
			}
			if (local14 > 1) {
				local7 = new Class3_Sub3_Sub1_Sub1(Static104.aClass3_Sub3_Sub1_Sub1Array1, local14);
			}
		} else {
			@Pc(12) int local12 = -1;
			for (local14 = 0; local14 < this.anIntArray218.length; local14++) {
				if (arg3 == this.anIntArray218[local14]) {
					local12 = local14;
					break;
				}
			}
			if (local12 == -1) {
				return null;
			}
			local42 = this.anIntArray219[local12];
			@Pc(52) boolean local52 = this.aBoolean61 ^ arg0 > 3;
			if (local52) {
				local42 += 65536;
			}
			local7 = (Class3_Sub3_Sub1_Sub1) Static10.aClass21_9.method658((long) local42);
			if (local7 == null) {
				local7 = Static21.method398(Static38.aClass54_17, local42 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local52) {
					local7.method399();
				}
				Static10.aClass21_9.method660(local7, (long) local42);
			}
		}
		if (this.anInt1333 == 128 && this.anInt1313 == 128 && this.anInt1325 == 128) {
			local113 = false;
		} else {
			local113 = true;
		}
		@Pc(222) boolean local222;
		if (this.anInt1300 == 0 && this.anInt1304 == 0 && this.anInt1312 == 0) {
			local222 = false;
		} else {
			local222 = true;
		}
		@Pc(250) Class3_Sub3_Sub1_Sub1 local250 = new Class3_Sub3_Sub1_Sub1(local7, arg0 == 0 && !local113 && !local222, this.anIntArray217 == null, true);
		@Pc(254) int local254 = arg0 & 0x3;
		if (local254 == 1) {
			local250.method408();
		} else if (local254 == 2) {
			local250.method397();
		} else if (local254 == 3) {
			local250.method420();
		}
		if (this.anIntArray217 != null) {
			for (@Pc(290) int local290 = 0; local290 < this.anIntArray217.length; local290++) {
				local250.method406(this.anIntArray217[local290], this.anIntArray214[local290]);
			}
		}
		if (local113) {
			local250.method418(this.anInt1333, this.anInt1313, this.anInt1325);
		}
		if (local222) {
			local250.method412(this.anInt1300, this.anInt1304, this.anInt1312);
		}
		if (arg2) {
			local250.method396();
		}
		local250.method407(this.anInt1337 + 64, 768 - -(this.anInt1328 * 5), -50, -10, -50, arg1);
		return local250;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLclient!wd;)V")
	public void method981(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1421();
			if (local9 == 0) {
				return;
			}
			this.method979(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)Z")
	public boolean method983(@OriginalArg(0) int arg0) {
		if (this.anIntArray218 != null) {
			for (@Pc(54) int local54 = 0; local54 < this.anIntArray218.length; local54++) {
				if (this.anIntArray218[local54] == arg0) {
					return Static38.aClass54_17.method1598(this.anIntArray219[local54] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray219 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(27) boolean local27 = true;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray219.length; local29++) {
				local27 &= Static38.aClass54_17.method1598(this.anIntArray219[local29] & 0xFFFF, 0);
			}
			return local27;
		} else {
			return true;
		}
	}
}
