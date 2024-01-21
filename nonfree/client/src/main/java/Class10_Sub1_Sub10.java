import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class10_Sub1_Sub10 extends Class10_Sub1 {

	@OriginalMember(owner = "client!je", name = "hb", descriptor = "[I")
	public static int[] anIntArray147 = new int[99];

	@OriginalMember(owner = "client!je", name = "T", descriptor = "[I")
	public int[] anIntArray146;

	@OriginalMember(owner = "client!je", name = "Z", descriptor = "I")
	public int anInt1368;

	@OriginalMember(owner = "client!je", name = "ib", descriptor = "[I")
	private int[] anIntArray148;

	@OriginalMember(owner = "client!je", name = "ob", descriptor = "[I")
	private int[] anIntArray149;

	@OriginalMember(owner = "client!je", name = "Hb", descriptor = "[I")
	private int[] anIntArray150;

	@OriginalMember(owner = "client!je", name = "Kb", descriptor = "[I")
	private int[] anIntArray151;

	@OriginalMember(owner = "client!je", name = "M", descriptor = "I")
	private int anInt1358 = -1;

	@OriginalMember(owner = "client!je", name = "R", descriptor = "I")
	private int anInt1363 = 0;

	@OriginalMember(owner = "client!je", name = "bb", descriptor = "I")
	public int anInt1369 = 1;

	@OriginalMember(owner = "client!je", name = "eb", descriptor = "Z")
	public boolean aBoolean57 = true;

	@OriginalMember(owner = "client!je", name = "W", descriptor = "I")
	public int anInt1366 = -1;

	@OriginalMember(owner = "client!je", name = "gb", descriptor = "I")
	private int anInt1372 = 128;

	@OriginalMember(owner = "client!je", name = "nb", descriptor = "I")
	public int anInt1375 = -1;

	@OriginalMember(owner = "client!je", name = "V", descriptor = "Lclient!va;")
	public Class61 aClass61_567 = Static46.aClass61_538;

	@OriginalMember(owner = "client!je", name = "fb", descriptor = "Z")
	public boolean aBoolean58 = false;

	@OriginalMember(owner = "client!je", name = "pb", descriptor = "I")
	public int anInt1376 = -1;

	@OriginalMember(owner = "client!je", name = "mb", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!je", name = "ab", descriptor = "Z")
	public boolean aBoolean56 = true;

	@OriginalMember(owner = "client!je", name = "tb", descriptor = "Z")
	public boolean aBoolean60 = false;

	@OriginalMember(owner = "client!je", name = "ub", descriptor = "Z")
	public boolean aBoolean61 = true;

	@OriginalMember(owner = "client!je", name = "db", descriptor = "I")
	public int anInt1371 = -1;

	@OriginalMember(owner = "client!je", name = "N", descriptor = "I")
	private int anInt1359 = 0;

	@OriginalMember(owner = "client!je", name = "Cb", descriptor = "I")
	private int anInt1385 = 128;

	@OriginalMember(owner = "client!je", name = "Q", descriptor = "I")
	private int anInt1362 = 0;

	@OriginalMember(owner = "client!je", name = "jb", descriptor = "I")
	private int anInt1373 = -1;

	@OriginalMember(owner = "client!je", name = "X", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!je", name = "rb", descriptor = "I")
	public int anInt1378 = 1;

	@OriginalMember(owner = "client!je", name = "Fb", descriptor = "Z")
	public boolean aBoolean62 = false;

	@OriginalMember(owner = "client!je", name = "Bb", descriptor = "I")
	public int anInt1384 = -1;

	@OriginalMember(owner = "client!je", name = "xb", descriptor = "I")
	public int anInt1381 = 0;

	@OriginalMember(owner = "client!je", name = "kb", descriptor = "[Lclient!va;")
	public final Class61[] aClass61Array9 = new Class61[5];

	@OriginalMember(owner = "client!je", name = "Ab", descriptor = "I")
	private int anInt1383 = 0;

	@OriginalMember(owner = "client!je", name = "Ib", descriptor = "I")
	private int anInt1389 = 128;

	@OriginalMember(owner = "client!je", name = "Db", descriptor = "I")
	public int anInt1386 = 16;

	@OriginalMember(owner = "client!je", name = "Jb", descriptor = "Z")
	public boolean aBoolean63 = false;

	@OriginalMember(owner = "client!je", name = "Mb", descriptor = "I")
	private int anInt1390 = 0;

	static {
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 99; local10++) {
			@Pc(15) int local15 = local10 + 1;
			@Pc(28) int local28 = (int) (Math.pow(2.0D, (double) local15 / 7.0D) * 300.0D + (double) local15);
			local8 += local28;
			anIntArray147[local10] = local8 / 4;
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)Lclient!je;")
	public Class10_Sub1_Sub10 method765() {
		@Pc(13) int local13 = -1;
		if (this.anInt1358 != -1) {
			local13 = Static69.method1014(this.anInt1358);
		} else if (this.anInt1373 != -1) {
			local13 = Static74.anIntArray228[this.anInt1373];
		}
		return local13 < 0 || local13 >= this.anIntArray146.length || this.anIntArray146[local13] == -1 ? null : Static18.method405(this.anIntArray146[local13]);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!tc;B)V")
	public void method767(@OriginalArg(0) Class10_Sub10 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1111();
			if (local9 == 0) {
				return;
			}
			this.method775(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIILclient!ge;IIIII)Lclient!rb;")
	public Class10_Sub1_Sub5_Sub4 method770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10_Sub1_Sub6 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(17) long local17;
		if (this.anIntArray150 == null) {
			local17 = (this.anInt1368 << 10) + arg2;
		} else {
			local17 = (arg4 << 3) + (this.anInt1368 << 10) + arg2;
		}
		@Pc(45) Class10_Sub1_Sub5_Sub4 local45 = (Class10_Sub1_Sub5_Sub4) Static62.aClass29_45.method644(local17);
		if (local45 == null) {
			local45 = this.method779(arg4, true, arg2, true);
			if (local45 == null) {
				return null;
			}
			Static62.aClass29_45.method649(local45, local17);
		}
		if (arg3 == null && !this.aBoolean58) {
			return local45;
		}
		if (arg3 == null) {
			local45 = local45.method1337(true);
		} else {
			local45 = arg3.method581(local45, arg2, arg5);
		}
		if (this.aBoolean58) {
			@Pc(99) int local99 = (arg6 + arg7 + arg0 + arg1) / 4;
			for (@Pc(101) int local101 = 0; local101 < local45.anInt2261; local101++) {
				@Pc(108) int local108 = local45.anIntArray259[local101];
				@Pc(113) int local113 = local45.anIntArray256[local101];
				@Pc(126) int local126 = (local113 + 64) * (arg7 + -arg0) / 128 + arg0;
				@Pc(140) int local140 = arg6 + (arg1 - arg6) * (local113 + 64) / 128;
				@Pc(153) int local153 = (local108 + 64) * (-local126 + local140) / 128 + local126;
				local45.anIntArray265[local101] += local153 - local99;
			}
		}
		return local45;
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
	public void method772() {
		if (this.anInt1371 == -1) {
			this.anInt1371 = 0;
			if (this.anIntArray151 != null && (this.anIntArray150 == null || this.anIntArray150[0] == 10)) {
				this.anInt1371 = 1;
			}
			for (@Pc(30) int local30 = 0; local30 < 5; local30++) {
				if (this.aClass61Array9[local30] != null) {
					this.anInt1371 = 1;
				}
			}
		}
		if (this.anInt1384 == -1) {
			this.anInt1384 = this.aBoolean56 ? 1 : 0;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IILclient!tc;)V")
	private void method775(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub10 arg1) {
		@Pc(10) int local10;
		@Pc(30) int local30;
		if (arg0 == 1) {
			local10 = arg1.method1111();
			if (local10 > 0) {
				if (this.anIntArray151 == null || Static80.aBoolean96) {
					this.anIntArray151 = new int[local10];
					this.anIntArray150 = new int[local10];
					for (local30 = 0; local30 < local10; local30++) {
						this.anIntArray151[local30] = arg1.method1160();
						this.anIntArray150[local30] = arg1.method1111();
					}
				} else {
					arg1.anInt1957 += local10 * 3;
				}
			}
		} else if (arg0 == 2) {
			this.aClass61_567 = arg1.method1151();
		} else if (arg0 == 5) {
			local10 = arg1.method1111();
			if (local10 > 0) {
				if (this.anIntArray151 == null || Static80.aBoolean96) {
					this.anIntArray150 = null;
					this.anIntArray151 = new int[local10];
					for (local30 = 0; local30 < local10; local30++) {
						this.anIntArray151[local30] = arg1.method1160();
					}
				} else {
					arg1.anInt1957 += local10 * 2;
				}
			}
		} else if (arg0 == 14) {
			this.anInt1369 = arg1.method1111();
		} else if (arg0 == 15) {
			this.anInt1378 = arg1.method1111();
		} else if (arg0 == 17) {
			this.aBoolean56 = false;
		} else if (arg0 == 18) {
			this.aBoolean57 = false;
		} else if (arg0 == 19) {
			this.anInt1371 = arg1.method1111();
		} else if (arg0 == 21) {
			this.aBoolean58 = true;
		} else if (arg0 == 22) {
			this.aBoolean55 = true;
		} else if (arg0 == 23) {
			this.aBoolean63 = true;
		} else if (arg0 == 24) {
			this.anInt1375 = arg1.method1160();
			if (this.anInt1375 == 65535) {
				this.anInt1375 = -1;
			}
		} else if (arg0 == 28) {
			this.anInt1386 = arg1.method1111();
		} else if (arg0 == 29) {
			this.anInt1390 = arg1.method1131();
		} else if (arg0 == 39) {
			this.anInt1362 = arg1.method1131() * 5;
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass61Array9[arg0 - 30] = arg1.method1151();
			if (this.aClass61Array9[arg0 - 30].method1594(Static105.aClass61_1068)) {
				this.aClass61Array9[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local10 = arg1.method1111();
			this.anIntArray149 = new int[local10];
			this.anIntArray148 = new int[local10];
			for (local30 = 0; local30 < local10; local30++) {
				this.anIntArray148[local30] = arg1.method1160();
				this.anIntArray149[local30] = arg1.method1160();
			}
		} else if (arg0 == 60) {
			this.anInt1366 = arg1.method1160();
		} else if (arg0 == 62) {
			this.aBoolean59 = true;
		} else if (arg0 == 64) {
			this.aBoolean61 = false;
		} else if (arg0 == 65) {
			this.anInt1372 = arg1.method1160();
		} else if (arg0 == 66) {
			this.anInt1385 = arg1.method1160();
		} else if (arg0 == 67) {
			this.anInt1389 = arg1.method1160();
		} else if (arg0 == 68) {
			this.anInt1376 = arg1.method1160();
		} else if (arg0 == 69) {
			this.anInt1381 = arg1.method1111();
		} else if (arg0 == 70) {
			this.anInt1363 = arg1.method1117();
		} else if (arg0 == 71) {
			this.anInt1383 = arg1.method1117();
		} else if (arg0 == 72) {
			this.anInt1359 = arg1.method1117();
		} else if (arg0 == 73) {
			this.aBoolean60 = true;
		} else if (arg0 == 74) {
			this.aBoolean62 = true;
		} else if (arg0 == 75) {
			this.anInt1384 = arg1.method1111();
		} else if (arg0 == 77) {
			this.anInt1358 = arg1.method1160();
			if (this.anInt1358 == 65535) {
				this.anInt1358 = -1;
			}
			this.anInt1373 = arg1.method1160();
			if (this.anInt1373 == 65535) {
				this.anInt1373 = -1;
			}
			local10 = arg1.method1111();
			this.anIntArray146 = new int[local10 + 1];
			for (local30 = 0; local30 <= local10; local30++) {
				this.anIntArray146[local30] = arg1.method1160();
				if (this.anIntArray146[local30] == 65535) {
					this.anIntArray146[local30] = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIII)Lclient!rb;")
	public Class10_Sub1_Sub5_Sub4 method776(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) long local13;
		if (this.anIntArray150 == null) {
			local13 = (this.anInt1368 << 10) + arg2;
		} else {
			local13 = (arg3 << 3) + (this.anInt1368 << 10) + arg2;
		}
		@Pc(37) Class10_Sub1_Sub5_Sub4 local37 = (Class10_Sub1_Sub5_Sub4) Static71.aClass29_50.method644(local13);
		if (local37 == null) {
			local37 = this.method779(arg3, !this.aBoolean55, arg2, false);
			if (local37 == null) {
				return null;
			}
			Static71.aClass29_50.method649(local37, local13);
		}
		if (this.aBoolean58 || this.aBoolean55) {
			local37 = new Class10_Sub1_Sub5_Sub4(local37, this.aBoolean58, this.aBoolean55);
		}
		if (this.aBoolean58) {
			@Pc(97) int local97 = (arg1 + arg5 + arg4 + arg0) / 4;
			for (@Pc(99) int local99 = 0; local99 < local37.anInt2261; local99++) {
				@Pc(106) int local106 = local37.anIntArray259[local99];
				@Pc(111) int local111 = local37.anIntArray256[local99];
				@Pc(125) int local125 = arg0 + (arg4 - arg0) * (local111 + 64) / 128;
				@Pc(138) int local138 = (local111 + 64) * (arg5 - arg1) / 128 + arg1;
				@Pc(151) int local151 = local125 + (local138 - local125) * (local106 + 64) / 128;
				local37.anIntArray265[local99] += local151 - local97;
			}
		}
		return local37;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)Z")
	public boolean method777(@OriginalArg(0) int arg0) {
		if (this.anIntArray150 != null) {
			for (@Pc(56) int local56 = 0; local56 < this.anIntArray150.length; local56++) {
				if (arg0 == this.anIntArray150[local56]) {
					return Static11.aClass11_11.method218(this.anIntArray151[local56] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray151 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(25) boolean local25 = true;
			for (@Pc(27) int local27 = 0; local27 < this.anIntArray151.length; local27++) {
				local25 &= Static11.aClass11_11.method218(this.anIntArray151[local27] & 0xFFFF, 0);
			}
			return local25;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(B)Z")
	public boolean method778() {
		if (this.anIntArray151 == null) {
			return true;
		}
		@Pc(20) boolean local20 = true;
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray151.length; local22++) {
			local20 &= Static11.aClass11_11.method218(this.anIntArray151[local22] & 0xFFFF, 0);
		}
		return local20;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZIZIZ)Lclient!rb;")
	private Class10_Sub1_Sub5_Sub4 method779(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) Class10_Sub1_Sub5_Sub4 local7 = null;
		@Pc(14) int local14;
		@Pc(56) int local56;
		@Pc(115) boolean local115;
		@Pc(127) int local127;
		if (this.anIntArray150 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray151 == null) {
				return null;
			}
			local115 = this.aBoolean59 ^ arg2 > 3;
			local14 = this.anIntArray151.length;
			for (local56 = 0; local56 < local14; local56++) {
				local127 = this.anIntArray151[local56];
				if (local115) {
					local127 += 65536;
				}
				local7 = (Class10_Sub1_Sub5_Sub4) Static27.aClass29_21.method644((long) local127);
				if (local7 == null) {
					local7 = Static84.method1335(Static11.aClass11_11, local127 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local115) {
						local7.method1320();
					}
					Static27.aClass29_21.method649(local7, (long) local127);
				}
				if (local14 > 1) {
					Static22.aClass10_Sub1_Sub5_Sub4Array1[local56] = local7;
				}
			}
			if (local14 > 1) {
				local7 = new Class10_Sub1_Sub5_Sub4(Static22.aClass10_Sub1_Sub5_Sub4Array1, local14);
			}
		} else {
			@Pc(12) int local12 = -1;
			for (local14 = 0; local14 < this.anIntArray150.length; local14++) {
				if (this.anIntArray150[local14] == arg0) {
					local12 = local14;
					break;
				}
			}
			if (local12 == -1) {
				return null;
			}
			@Pc(51) boolean local51 = this.aBoolean59 ^ arg2 > 3;
			local56 = this.anIntArray151[local12];
			if (local51) {
				local56 += 65536;
			}
			local7 = (Class10_Sub1_Sub5_Sub4) Static27.aClass29_21.method644((long) local56);
			if (local7 == null) {
				local7 = Static84.method1335(Static11.aClass11_11, local56 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local51) {
					local7.method1320();
				}
				Static27.aClass29_21.method649(local7, (long) local56);
			}
		}
		if (this.anInt1372 == 128 && this.anInt1385 == 128 && this.anInt1389 == 128) {
			local115 = false;
		} else {
			local115 = true;
		}
		@Pc(219) boolean local219;
		if (this.anInt1363 == 0 && this.anInt1383 == 0 && this.anInt1359 == 0) {
			local219 = false;
		} else {
			local219 = true;
		}
		@Pc(247) Class10_Sub1_Sub5_Sub4 local247 = new Class10_Sub1_Sub5_Sub4(local7, arg2 == 0 && !local115 && !local219, this.anIntArray148 == null, true);
		@Pc(258) int local258 = arg2 & 0x3;
		if (local258 == 1) {
			local247.method1312();
		} else if (local258 == 2) {
			local247.method1321();
		} else if (local258 == 3) {
			local247.method1311();
		}
		if (this.anIntArray148 != null) {
			for (local127 = 0; local127 < this.anIntArray148.length; local127++) {
				local247.method1328(this.anIntArray148[local127], this.anIntArray149[local127]);
			}
		}
		if (local115) {
			local247.method1316(this.anInt1372, this.anInt1385, this.anInt1389);
		}
		if (local219) {
			local247.method1315(this.anInt1363, this.anInt1383, this.anInt1359);
		}
		if (arg3) {
			local247.method1310();
		}
		local247.method1324(this.anInt1390 + 64, this.anInt1362 * 5 + 768, -50, -10, -50, arg1);
		return local247;
	}
}
