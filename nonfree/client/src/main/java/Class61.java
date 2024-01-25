import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class61 {

	@OriginalMember(owner = "client!co", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!co", name = "s", descriptor = "[I")
	public int[] anIntArray125;

	@OriginalMember(owner = "client!co", name = "N", descriptor = "[I")
	public int[] anIntArray128;

	@OriginalMember(owner = "client!co", name = "Z", descriptor = "[Lclient!q;")
	private Class25[] aClass25Array1;

	@OriginalMember(owner = "client!co", name = "k", descriptor = "Z")
	public boolean aBoolean91 = true;

	@OriginalMember(owner = "client!co", name = "p", descriptor = "I")
	public int anInt1304 = -1;

	@OriginalMember(owner = "client!co", name = "u", descriptor = "I")
	public int anInt1307 = -1;

	@OriginalMember(owner = "client!co", name = "f", descriptor = "I")
	public int anInt1296 = 0;

	@OriginalMember(owner = "client!co", name = "o", descriptor = "I")
	public int anInt1303 = -1;

	@OriginalMember(owner = "client!co", name = "A", descriptor = "I")
	public int anInt1313 = -1;

	@OriginalMember(owner = "client!co", name = "F", descriptor = "I")
	public int anInt1318 = -1;

	@OriginalMember(owner = "client!co", name = "r", descriptor = "I")
	public int anInt1306 = 0;

	@OriginalMember(owner = "client!co", name = "j", descriptor = "I")
	public int anInt1300 = -1;

	@OriginalMember(owner = "client!co", name = "E", descriptor = "I")
	public int anInt1317 = -1;

	@OriginalMember(owner = "client!co", name = "G", descriptor = "I")
	public int anInt1319 = 0;

	@OriginalMember(owner = "client!co", name = "C", descriptor = "I")
	public int anInt1315 = 0;

	@OriginalMember(owner = "client!co", name = "w", descriptor = "I")
	public int anInt1309 = -1;

	@OriginalMember(owner = "client!co", name = "d", descriptor = "I")
	public int anInt1294 = -1;

	@OriginalMember(owner = "client!co", name = "x", descriptor = "I")
	private int anInt1310 = 0;

	@OriginalMember(owner = "client!co", name = "b", descriptor = "I")
	public int anInt1293 = 0;

	@OriginalMember(owner = "client!co", name = "Q", descriptor = "I")
	public int anInt1326 = -1;

	@OriginalMember(owner = "client!co", name = "e", descriptor = "I")
	public int anInt1295 = 0;

	@OriginalMember(owner = "client!co", name = "z", descriptor = "I")
	public int anInt1312 = -1;

	@OriginalMember(owner = "client!co", name = "h", descriptor = "I")
	public int anInt1298 = -1;

	@OriginalMember(owner = "client!co", name = "q", descriptor = "I")
	public int anInt1305 = -1;

	@OriginalMember(owner = "client!co", name = "L", descriptor = "I")
	public int anInt1323 = 0;

	@OriginalMember(owner = "client!co", name = "K", descriptor = "I")
	public int anInt1322 = -1;

	@OriginalMember(owner = "client!co", name = "S", descriptor = "I")
	public int anInt1328 = -1;

	@OriginalMember(owner = "client!co", name = "V", descriptor = "I")
	public int anInt1330 = -1;

	@OriginalMember(owner = "client!co", name = "I", descriptor = "[I")
	public int[] anIntArray127 = null;

	@OriginalMember(owner = "client!co", name = "y", descriptor = "I")
	public int anInt1311 = 0;

	@OriginalMember(owner = "client!co", name = "l", descriptor = "I")
	public int anInt1301 = -1;

	@OriginalMember(owner = "client!co", name = "Y", descriptor = "I")
	public int anInt1333 = -1;

	@OriginalMember(owner = "client!co", name = "H", descriptor = "I")
	public int anInt1320 = -1;

	@OriginalMember(owner = "client!co", name = "W", descriptor = "I")
	public int anInt1331 = -1;

	@OriginalMember(owner = "client!co", name = "R", descriptor = "I")
	public int anInt1327 = 0;

	@OriginalMember(owner = "client!co", name = "M", descriptor = "I")
	public int anInt1324 = -1;

	@OriginalMember(owner = "client!co", name = "n", descriptor = "[I")
	public int[] anIntArray124 = null;

	@OriginalMember(owner = "client!co", name = "g", descriptor = "I")
	public int anInt1297 = 0;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "I")
	public int anInt1292 = -1;

	@OriginalMember(owner = "client!co", name = "B", descriptor = "I")
	public int anInt1314 = -1;

	@OriginalMember(owner = "client!co", name = "O", descriptor = "I")
	public int anInt1325 = -1;

	@OriginalMember(owner = "client!co", name = "cb", descriptor = "I")
	public int anInt1336 = -1;

	@OriginalMember(owner = "client!co", name = "db", descriptor = "I")
	public int anInt1337 = 0;

	@OriginalMember(owner = "client!co", name = "X", descriptor = "I")
	private final int anInt1332 = -1;

	@OriginalMember(owner = "client!co", name = "ab", descriptor = "I")
	public int anInt1334 = 0;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!gk;B)V")
	public void method1196(@OriginalArg(0) Class2_Sub7 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4464();
			if (local15 == 0) {
				return;
			}
			this.method1198(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!gk;II)V")
	private void method1198(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1314 = arg0.method4518();
			this.anInt1326 = arg0.method4518();
			if (this.anInt1326 == 65535) {
				this.anInt1326 = -1;
			}
			if (this.anInt1314 == 65535) {
				this.anInt1314 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt1301 = arg0.method4518();
		} else if (arg1 == 3) {
			this.anInt1309 = arg0.method4518();
		} else if (arg1 == 4) {
			this.anInt1298 = arg0.method4518();
		} else if (arg1 == 5) {
			this.anInt1312 = arg0.method4518();
		} else if (arg1 == 6) {
			this.anInt1317 = arg0.method4518();
		} else if (arg1 == 7) {
			this.anInt1325 = arg0.method4518();
		} else if (arg1 == 8) {
			this.anInt1328 = arg0.method4518();
		} else if (arg1 == 9) {
			this.anInt1331 = arg0.method4518();
		} else if (arg1 == 26) {
			this.anInt1315 = (short) (arg0.method4464() * 4);
			this.anInt1323 = (short) (arg0.method4464() * 4);
		} else {
			@Pc(114) int local114;
			@Pc(329) int local329;
			if (arg1 == 27) {
				if (this.anIntArrayArray19 == null) {
					this.anIntArrayArray19 = new int[12][];
				}
				local114 = arg0.method4464();
				this.anIntArrayArray19[local114] = new int[6];
				for (local329 = 0; local329 < 6; local329++) {
					this.anIntArrayArray19[local114][local329] = arg0.method4478();
				}
			} else if (arg1 == 28) {
				this.anIntArray125 = new int[12];
				for (local114 = 0; local114 < 12; local114++) {
					this.anIntArray125[local114] = arg0.method4464();
					if (this.anIntArray125[local114] == 255) {
						this.anIntArray125[local114] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt1293 = arg0.method4464();
			} else if (arg1 == 30) {
				this.anInt1306 = arg0.method4518();
			} else if (arg1 == 31) {
				this.anInt1296 = arg0.method4464();
			} else if (arg1 == 32) {
				this.anInt1297 = arg0.method4518();
			} else if (arg1 == 33) {
				this.anInt1295 = arg0.method4478();
			} else if (arg1 == 34) {
				this.anInt1337 = arg0.method4464();
			} else if (arg1 == 35) {
				this.anInt1327 = arg0.method4518();
			} else if (arg1 == 36) {
				this.anInt1334 = arg0.method4478();
			} else if (arg1 == 37) {
				this.anInt1294 = arg0.method4464();
			} else if (arg1 == 38) {
				this.anInt1320 = arg0.method4518();
			} else if (arg1 == 39) {
				this.anInt1318 = arg0.method4518();
			} else if (arg1 == 40) {
				this.anInt1322 = arg0.method4518();
			} else if (arg1 == 41) {
				this.anInt1300 = arg0.method4518();
			} else if (arg1 == 42) {
				this.anInt1324 = arg0.method4518();
			} else if (arg1 == 43) {
				this.anInt1330 = arg0.method4518();
			} else if (arg1 == 44) {
				this.anInt1313 = arg0.method4518();
			} else if (arg1 == 45) {
				this.anInt1304 = arg0.method4518();
			} else if (arg1 == 46) {
				this.anInt1305 = arg0.method4518();
			} else if (arg1 == 47) {
				this.anInt1303 = arg0.method4518();
			} else if (arg1 == 48) {
				this.anInt1307 = arg0.method4518();
			} else if (arg1 == 49) {
				this.anInt1336 = arg0.method4518();
			} else if (arg1 == 50) {
				this.anInt1292 = arg0.method4518();
			} else if (arg1 == 51) {
				this.anInt1333 = arg0.method4518();
			} else if (arg1 == 52) {
				local114 = arg0.method4464();
				this.anIntArray127 = new int[local114];
				this.anIntArray124 = new int[local114];
				for (local329 = 0; local329 < local114; local329++) {
					this.anIntArray127[local329] = arg0.method4518();
					@Pc(342) int local342 = arg0.method4464();
					this.anIntArray124[local329] = local342;
					this.anInt1310 += local342;
				}
			} else if (arg1 == 53) {
				this.aBoolean91 = false;
			} else if (arg1 == 54) {
				this.anInt1319 = arg0.method4464() << 6;
				this.anInt1311 = arg0.method4464() << 6;
			} else if (arg1 == 55) {
				if (this.anIntArray128 == null) {
					this.anIntArray128 = new int[12];
				}
				local114 = arg0.method4464();
				this.anIntArray128[local114] = arg0.method4518();
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)Z")
	public boolean method1201(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt1314) {
			return true;
		} else {
			if (this.anIntArray127 != null) {
				for (@Pc(27) int local27 = 0; local27 < this.anIntArray127.length; local27++) {
					if (this.anIntArray127[local27] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZLclient!r;)[Lclient!q;")
	public Class25[] method1202(@OriginalArg(1) Class162 arg0) {
		if (this.aClass25Array1 != null && this.anInt1332 == arg0.anInt8492) {
			return this.aClass25Array1;
		} else if (this.anIntArrayArray19 == null) {
			return null;
		} else {
			this.aClass25Array1 = new Class25[this.anIntArrayArray19.length];
			for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray19.length; local29++) {
				@Pc(33) int local33 = 0;
				@Pc(35) int local35 = 0;
				@Pc(37) int local37 = 0;
				@Pc(39) int local39 = 0;
				@Pc(41) int local41 = 0;
				@Pc(43) int local43 = 0;
				if (this.anIntArrayArray19[local29] != null) {
					local37 = this.anIntArrayArray19[local29][2];
					local35 = this.anIntArrayArray19[local29][1];
					local39 = this.anIntArrayArray19[local29][3] << 3;
					local41 = this.anIntArrayArray19[local29][4] << 3;
					local33 = this.anIntArrayArray19[local29][0];
					local43 = this.anIntArrayArray19[local29][5] << 3;
				}
				if (local33 != 0 || local35 != 0 || local37 != 0 || local39 != 0 || local41 != 0 || local43 != 0) {
					@Pc(131) Class25 local131 = this.aClass25Array1[local29] = arg0.method6889();
					if (local43 != 0) {
						local131.AA(local43);
					}
					if (local39 != 0) {
						local131.w(local39);
					}
					if (local41 != 0) {
						local131.ZA(local41);
					}
					local131.U(local33, local35, local37);
				}
			}
			return this.aClass25Array1;
		}
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)I")
	public int method1203() {
		if (this.anInt1314 != -1) {
			return this.anInt1314;
		} else if (this.anIntArray127 == null) {
			return -1;
		} else {
			@Pc(22) int local22 = (int) (Math.random() * (double) this.anInt1310);
			@Pc(24) int local24;
			for (local24 = 0; this.anIntArray124[local24] <= local22; local24++) {
				local22 -= this.anIntArray124[local24];
			}
			return this.anIntArray127[local24];
		}
	}
}
