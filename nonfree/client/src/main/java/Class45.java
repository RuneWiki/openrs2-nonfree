import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class45 {

	@OriginalMember(owner = "client!e", name = "t", descriptor = "[I")
	public int[] anIntArray169;

	@OriginalMember(owner = "client!e", name = "F", descriptor = "[[I")
	public int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "I")
	public int anInt1468 = -1;

	@OriginalMember(owner = "client!e", name = "s", descriptor = "I")
	public int anInt1473 = -1;

	@OriginalMember(owner = "client!e", name = "o", descriptor = "I")
	public int anInt1471 = -1;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "I")
	public int anInt1467 = 0;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "I")
	public int anInt1462 = -1;

	@OriginalMember(owner = "client!e", name = "v", descriptor = "I")
	public int anInt1475 = -1;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "I")
	public int anInt1466 = -1;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Z")
	public boolean aBoolean130 = true;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "I")
	public int anInt1469 = -1;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "I")
	public int anInt1463 = -1;

	@OriginalMember(owner = "client!e", name = "B", descriptor = "I")
	public int anInt1481 = -1;

	@OriginalMember(owner = "client!e", name = "u", descriptor = "I")
	public int anInt1474 = -1;

	@OriginalMember(owner = "client!e", name = "z", descriptor = "I")
	public int anInt1479 = -1;

	@OriginalMember(owner = "client!e", name = "y", descriptor = "I")
	public int anInt1478 = 0;

	@OriginalMember(owner = "client!e", name = "I", descriptor = "I")
	public int anInt1487 = 0;

	@OriginalMember(owner = "client!e", name = "w", descriptor = "I")
	public int anInt1476 = -1;

	@OriginalMember(owner = "client!e", name = "H", descriptor = "I")
	public int anInt1486 = 0;

	@OriginalMember(owner = "client!e", name = "N", descriptor = "I")
	public int anInt1492 = -1;

	@OriginalMember(owner = "client!e", name = "J", descriptor = "I")
	public int anInt1488 = -1;

	@OriginalMember(owner = "client!e", name = "C", descriptor = "I")
	public int anInt1482 = -1;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "[I")
	public int[] anIntArray167 = null;

	@OriginalMember(owner = "client!e", name = "x", descriptor = "I")
	public int anInt1477 = -1;

	@OriginalMember(owner = "client!e", name = "r", descriptor = "[I")
	public int[] anIntArray168 = null;

	@OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
	public int anInt1494 = -1;

	@OriginalMember(owner = "client!e", name = "S", descriptor = "I")
	public int anInt1496 = -1;

	@OriginalMember(owner = "client!e", name = "D", descriptor = "I")
	public int anInt1483 = 0;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "I")
	public int anInt1465 = 0;

	@OriginalMember(owner = "client!e", name = "V", descriptor = "I")
	public int anInt1499 = 0;

	@OriginalMember(owner = "client!e", name = "T", descriptor = "I")
	public int anInt1497 = 0;

	@OriginalMember(owner = "client!e", name = "K", descriptor = "I")
	public int anInt1489 = -1;

	@OriginalMember(owner = "client!e", name = "M", descriptor = "I")
	public int anInt1491 = -1;

	@OriginalMember(owner = "client!e", name = "L", descriptor = "I")
	public int anInt1490 = -1;

	@OriginalMember(owner = "client!e", name = "W", descriptor = "I")
	public int anInt1500 = -1;

	@OriginalMember(owner = "client!e", name = "U", descriptor = "I")
	private int anInt1498 = 0;

	@OriginalMember(owner = "client!e", name = "ab", descriptor = "I")
	public int anInt1504 = -1;

	@OriginalMember(owner = "client!e", name = "Z", descriptor = "I")
	public int anInt1503 = 0;

	@OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
	public int anInt1502 = -1;

	@OriginalMember(owner = "client!e", name = "P", descriptor = "I")
	public int anInt1493 = 0;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Z")
	public boolean method1421(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt1488) {
			return true;
		} else {
			if (this.anIntArray167 != null) {
				for (@Pc(34) int local34 = 0; local34 < this.anIntArray167.length; local34++) {
					if (this.anIntArray167[local34] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
	public void method1428() {
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(B)I")
	public int method1429() {
		if (this.anInt1488 != -1) {
			return this.anInt1488;
		} else if (this.anIntArray167 == null) {
			return -1;
		} else {
			@Pc(22) int local22 = (int) (Math.random() * (double) this.anInt1498);
			@Pc(24) int local24;
			for (local24 = 0; local22 >= this.anIntArray168[local24]; local24++) {
				local22 -= this.anIntArray168[local24];
			}
			return this.anIntArray167[local24];
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!eb;I)V")
	private void method1430(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt1488 = arg1.method3115();
			this.anInt1491 = arg1.method3115();
			if (this.anInt1491 == 65535) {
				this.anInt1491 = -1;
			}
			if (this.anInt1488 == 65535) {
				this.anInt1488 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt1504 = arg1.method3115();
		} else if (arg0 == 3) {
			this.anInt1476 = arg1.method3115();
		} else if (arg0 == 4) {
			this.anInt1482 = arg1.method3115();
		} else if (arg0 == 5) {
			this.anInt1500 = arg1.method3115();
		} else if (arg0 == 6) {
			this.anInt1490 = arg1.method3115();
		} else if (arg0 == 7) {
			this.anInt1494 = arg1.method3115();
		} else if (arg0 == 8) {
			this.anInt1489 = arg1.method3115();
		} else if (arg0 == 9) {
			this.anInt1481 = arg1.method3115();
		} else if (arg0 == 26) {
			this.anInt1487 = (short) (arg1.method3141() * 4);
			this.anInt1497 = (short) (arg1.method3141() * 4);
		} else {
			@Pc(106) int local106;
			@Pc(340) int local340;
			if (arg0 == 27) {
				if (this.anIntArrayArray9 == null) {
					this.anIntArrayArray9 = new int[12][];
				}
				local106 = arg1.method3141();
				this.anIntArrayArray9[local106] = new int[6];
				for (local340 = 0; local340 < 6; local340++) {
					this.anIntArrayArray9[local106][local340] = arg1.method3090();
				}
			} else if (arg0 == 28) {
				this.anIntArray169 = new int[12];
				for (local106 = 0; local106 < 12; local106++) {
					this.anIntArray169[local106] = arg1.method3141();
					if (this.anIntArray169[local106] == 255) {
						this.anIntArray169[local106] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt1486 = arg1.method3141();
			} else if (arg0 == 30) {
				this.anInt1493 = arg1.method3115();
			} else if (arg0 == 31) {
				this.anInt1478 = arg1.method3141();
			} else if (arg0 == 32) {
				this.anInt1499 = arg1.method3115();
			} else if (arg0 == 33) {
				this.anInt1483 = arg1.method3090();
			} else if (arg0 == 34) {
				this.anInt1467 = arg1.method3141();
			} else if (arg0 == 35) {
				this.anInt1465 = arg1.method3115();
			} else if (arg0 == 36) {
				this.anInt1503 = arg1.method3090();
			} else if (arg0 == 37) {
				this.anInt1477 = arg1.method3141();
			} else if (arg0 == 38) {
				this.anInt1471 = arg1.method3115();
			} else if (arg0 == 39) {
				this.anInt1473 = arg1.method3115();
			} else if (arg0 == 40) {
				this.anInt1474 = arg1.method3115();
			} else if (arg0 == 41) {
				this.anInt1468 = arg1.method3115();
			} else if (arg0 == 42) {
				this.anInt1502 = arg1.method3115();
			} else if (arg0 == 43) {
				arg1.method3115();
			} else if (arg0 == 44) {
				this.anInt1462 = arg1.method3115();
			} else if (arg0 == 45) {
				this.anInt1466 = arg1.method3115();
			} else if (arg0 == 46) {
				this.anInt1496 = arg1.method3115();
			} else if (arg0 == 47) {
				this.anInt1492 = arg1.method3115();
			} else if (arg0 == 48) {
				this.anInt1475 = arg1.method3115();
			} else if (arg0 == 49) {
				this.anInt1463 = arg1.method3115();
			} else if (arg0 == 50) {
				this.anInt1479 = arg1.method3115();
			} else if (arg0 == 51) {
				this.anInt1469 = arg1.method3115();
			} else if (arg0 == 52) {
				local106 = arg1.method3141();
				this.anIntArray168 = new int[local106];
				this.anIntArray167 = new int[local106];
				for (local340 = 0; local340 < local106; local340++) {
					this.anIntArray167[local340] = arg1.method3115();
					@Pc(353) int local353 = arg1.method3141();
					this.anIntArray168[local340] = local353;
					this.anInt1498 += local353;
				}
			} else if (arg0 == 53) {
				this.aBoolean130 = false;
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!eb;I)V")
	public void method1431(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method3141();
			if (local17 == 0) {
				return;
			}
			this.method1430(local17, arg0);
		}
	}
}
