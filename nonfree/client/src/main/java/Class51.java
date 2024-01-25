import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class51 {

	@OriginalMember(owner = "client!di", name = "N", descriptor = "[I")
	public int[] anIntArray58;

	@OriginalMember(owner = "client!di", name = "Y", descriptor = "[[I")
	public int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!di", name = "b", descriptor = "I")
	public int anInt1286 = -1;

	@OriginalMember(owner = "client!di", name = "d", descriptor = "I")
	public int anInt1288 = -1;

	@OriginalMember(owner = "client!di", name = "g", descriptor = "I")
	public int anInt1291 = -1;

	@OriginalMember(owner = "client!di", name = "o", descriptor = "I")
	public int anInt1299 = 0;

	@OriginalMember(owner = "client!di", name = "q", descriptor = "I")
	public int anInt1300 = -1;

	@OriginalMember(owner = "client!di", name = "k", descriptor = "I")
	public int anInt1295 = -1;

	@OriginalMember(owner = "client!di", name = "y", descriptor = "I")
	public int anInt1308 = 0;

	@OriginalMember(owner = "client!di", name = "w", descriptor = "I")
	public int anInt1306 = -1;

	@OriginalMember(owner = "client!di", name = "f", descriptor = "I")
	public int anInt1290 = -1;

	@OriginalMember(owner = "client!di", name = "t", descriptor = "I")
	public int anInt1303 = -1;

	@OriginalMember(owner = "client!di", name = "n", descriptor = "I")
	public int anInt1298 = 0;

	@OriginalMember(owner = "client!di", name = "A", descriptor = "I")
	public int anInt1310 = -1;

	@OriginalMember(owner = "client!di", name = "x", descriptor = "I")
	public int anInt1307 = -1;

	@OriginalMember(owner = "client!di", name = "h", descriptor = "I")
	public int anInt1292 = -1;

	@OriginalMember(owner = "client!di", name = "I", descriptor = "I")
	public int anInt1317 = -1;

	@OriginalMember(owner = "client!di", name = "B", descriptor = "I")
	public int anInt1311 = 0;

	@OriginalMember(owner = "client!di", name = "r", descriptor = "I")
	public int anInt1301 = 0;

	@OriginalMember(owner = "client!di", name = "P", descriptor = "Z")
	public boolean aBoolean103 = true;

	@OriginalMember(owner = "client!di", name = "L", descriptor = "I")
	public int anInt1319 = 0;

	@OriginalMember(owner = "client!di", name = "J", descriptor = "I")
	public int anInt1318 = -1;

	@OriginalMember(owner = "client!di", name = "j", descriptor = "I")
	public int anInt1294 = -1;

	@OriginalMember(owner = "client!di", name = "G", descriptor = "I")
	public int anInt1315 = -1;

	@OriginalMember(owner = "client!di", name = "C", descriptor = "I")
	public int anInt1312 = 0;

	@OriginalMember(owner = "client!di", name = "c", descriptor = "I")
	public int anInt1287 = 0;

	@OriginalMember(owner = "client!di", name = "M", descriptor = "I")
	public int anInt1320 = -1;

	@OriginalMember(owner = "client!di", name = "m", descriptor = "I")
	public int anInt1297 = -1;

	@OriginalMember(owner = "client!di", name = "R", descriptor = "I")
	public int anInt1322 = -1;

	@OriginalMember(owner = "client!di", name = "S", descriptor = "I")
	private int anInt1323 = 0;

	@OriginalMember(owner = "client!di", name = "l", descriptor = "I")
	public int anInt1296 = 0;

	@OriginalMember(owner = "client!di", name = "u", descriptor = "I")
	public int anInt1304 = -1;

	@OriginalMember(owner = "client!di", name = "W", descriptor = "[I")
	public int[] anIntArray59 = null;

	@OriginalMember(owner = "client!di", name = "U", descriptor = "I")
	public int anInt1325 = 0;

	@OriginalMember(owner = "client!di", name = "T", descriptor = "I")
	public int anInt1324 = -1;

	@OriginalMember(owner = "client!di", name = "z", descriptor = "I")
	public int anInt1309 = -1;

	@OriginalMember(owner = "client!di", name = "X", descriptor = "I")
	public int anInt1327 = -1;

	@OriginalMember(owner = "client!di", name = "F", descriptor = "I")
	public int anInt1314 = 0;

	@OriginalMember(owner = "client!di", name = "Q", descriptor = "I")
	public int anInt1321 = -1;

	@OriginalMember(owner = "client!di", name = "V", descriptor = "I")
	public int anInt1326 = -1;

	@OriginalMember(owner = "client!di", name = "i", descriptor = "I")
	public int anInt1293 = 0;

	@OriginalMember(owner = "client!di", name = "p", descriptor = "[I")
	public int[] anIntArray57 = null;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "I")
	public int anInt1285 = -1;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)I")
	public int method1120() {
		if (this.anInt1318 != -1) {
			return this.anInt1318;
		} else if (this.anIntArray57 == null) {
			return -1;
		} else {
			@Pc(28) int local28 = (int) ((double) this.anInt1323 * Math.random());
			@Pc(30) int local30;
			for (local30 = 0; local28 >= this.anIntArray59[local30]; local30++) {
				local28 -= this.anIntArray59[local30];
			}
			return this.anIntArray57[local30];
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!dh;BI)V")
	private void method1121(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1318 = arg0.method4485();
			this.anInt1290 = arg0.method4485();
			if (this.anInt1318 == 65535) {
				this.anInt1318 = -1;
			}
			if (this.anInt1290 == 65535) {
				this.anInt1290 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt1317 = arg0.method4485();
		} else if (arg1 == 3) {
			this.anInt1303 = arg0.method4485();
		} else if (arg1 == 4) {
			this.anInt1300 = arg0.method4485();
		} else if (arg1 == 5) {
			this.anInt1291 = arg0.method4485();
		} else if (arg1 == 6) {
			this.anInt1321 = arg0.method4485();
		} else if (arg1 == 7) {
			this.anInt1322 = arg0.method4485();
		} else if (arg1 == 8) {
			this.anInt1294 = arg0.method4485();
		} else if (arg1 == 9) {
			this.anInt1310 = arg0.method4485();
		} else if (arg1 == 26) {
			this.anInt1301 = (short) (arg0.method4463() * 4);
			this.anInt1325 = (short) (arg0.method4463() * 4);
		} else {
			@Pc(97) int local97;
			@Pc(105) int local105;
			if (arg1 == 27) {
				if (this.anIntArrayArray34 == null) {
					this.anIntArrayArray34 = new int[12][];
				}
				local97 = arg0.method4463();
				this.anIntArrayArray34[local97] = new int[6];
				for (local105 = 0; local105 < 6; local105++) {
					this.anIntArrayArray34[local97][local105] = arg0.method4482();
				}
			} else if (arg1 == 28) {
				this.anIntArray58 = new int[12];
				for (local97 = 0; local97 < 12; local97++) {
					this.anIntArray58[local97] = arg0.method4463();
					if (this.anIntArray58[local97] == 255) {
						this.anIntArray58[local97] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt1298 = arg0.method4463();
			} else if (arg1 == 30) {
				this.anInt1312 = arg0.method4485();
			} else if (arg1 == 31) {
				this.anInt1311 = arg0.method4463();
			} else if (arg1 == 32) {
				this.anInt1287 = arg0.method4485();
			} else if (arg1 == 33) {
				this.anInt1293 = arg0.method4482();
			} else if (arg1 == 34) {
				this.anInt1308 = arg0.method4463();
			} else if (arg1 == 35) {
				this.anInt1314 = arg0.method4485();
			} else if (arg1 == 36) {
				this.anInt1299 = arg0.method4482();
			} else if (arg1 == 37) {
				this.anInt1309 = arg0.method4463();
			} else if (arg1 == 38) {
				this.anInt1304 = arg0.method4485();
			} else if (arg1 == 39) {
				this.anInt1320 = arg0.method4485();
			} else if (arg1 == 40) {
				this.anInt1307 = arg0.method4485();
			} else if (arg1 == 41) {
				this.anInt1315 = arg0.method4485();
			} else if (arg1 == 42) {
				this.anInt1292 = arg0.method4485();
			} else if (arg1 == 43) {
				this.anInt1288 = arg0.method4485();
			} else if (arg1 == 44) {
				this.anInt1297 = arg0.method4485();
			} else if (arg1 == 45) {
				this.anInt1295 = arg0.method4485();
			} else if (arg1 == 46) {
				this.anInt1306 = arg0.method4485();
			} else if (arg1 == 47) {
				this.anInt1286 = arg0.method4485();
			} else if (arg1 == 48) {
				this.anInt1327 = arg0.method4485();
			} else if (arg1 == 49) {
				this.anInt1326 = arg0.method4485();
			} else if (arg1 == 50) {
				this.anInt1285 = arg0.method4485();
			} else if (arg1 == 51) {
				this.anInt1324 = arg0.method4485();
			} else if (arg1 == 52) {
				local97 = arg0.method4463();
				this.anIntArray59 = new int[local97];
				this.anIntArray57 = new int[local97];
				for (local105 = 0; local105 < local97; local105++) {
					this.anIntArray57[local105] = arg0.method4485();
					@Pc(392) int local392 = arg0.method4463();
					this.anIntArray59[local105] = local392;
					this.anInt1323 += local392;
				}
			} else if (arg1 == 53) {
				this.aBoolean103 = false;
			} else if (arg1 == 54) {
				this.anInt1319 = arg0.method4463() << 6;
				this.anInt1296 = arg0.method4463() << 6;
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!dh;)V")
	public void method1123(@OriginalArg(1) Class1_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4463();
			if (local5 == 0) {
				return;
			}
			this.method1121(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)Z")
	public boolean method1124(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt1318) {
			return true;
		} else {
			if (this.anIntArray57 != null) {
				for (@Pc(29) int local29 = 0; local29 < this.anIntArray57.length; local29++) {
					if (this.anIntArray57[local29] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
