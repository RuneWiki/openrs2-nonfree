import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class40 {

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "[[I")
	public int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!dc", name = "R", descriptor = "[I")
	public int[] anIntArray90;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
	public int anInt1438 = -1;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
	public int anInt1442 = -1;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
	public int anInt1444 = -1;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
	public int anInt1436 = 0;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
	public int anInt1452 = -1;

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
	public int anInt1450 = -1;

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
	public int anInt1456 = -1;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
	public int anInt1443 = -1;

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
	public int anInt1455 = 0;

	@OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
	public int anInt1459 = -1;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
	public int anInt1446 = -1;

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
	public int anInt1454 = 0;

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
	public int anInt1458 = -1;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
	public int anInt1435 = 0;

	@OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
	public int anInt1463 = 0;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
	public int anInt1441 = -1;

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "I")
	public int anInt1462 = 0;

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
	public int anInt1453 = 0;

	@OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
	public int anInt1464 = -1;

	@OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
	public int anInt1460 = 0;

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "[I")
	public int[] anIntArray88 = null;

	@OriginalMember(owner = "client!dc", name = "L", descriptor = "I")
	public int anInt1467 = -1;

	@OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
	public int anInt1469 = -1;

	@OriginalMember(owner = "client!dc", name = "F", descriptor = "[I")
	public int[] anIntArray89 = null;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
	public int anInt1445 = -1;

	@OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
	public int anInt1468 = 0;

	@OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
	public int anInt1461 = -1;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
	public int anInt1437 = -1;

	@OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
	public int anInt1475 = -1;

	@OriginalMember(owner = "client!dc", name = "O", descriptor = "Z")
	public boolean aBoolean106 = true;

	@OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
	private int anInt1477 = 0;

	@OriginalMember(owner = "client!dc", name = "I", descriptor = "I")
	public int anInt1465 = -1;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
	public int anInt1439 = -1;

	@OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
	public int anInt1474 = 0;

	@OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
	public int anInt1466 = -1;

	@OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
	public int anInt1472 = -1;

	@OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
	public int anInt1476 = -1;

	@OriginalMember(owner = "client!dc", name = "ab", descriptor = "I")
	public int anInt1478 = -1;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLclient!lf;)V")
	public void method1171(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3440();
			if (local11 == 0) {
				return;
			}
			this.method1174(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!lf;I)V")
	private void method1174(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt1464 = arg1.method3401();
			this.anInt1441 = arg1.method3401();
			if (this.anInt1464 == 65535) {
				this.anInt1464 = -1;
			}
			if (this.anInt1441 == 65535) {
				this.anInt1441 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt1472 = arg1.method3401();
		} else if (arg0 == 3) {
			this.anInt1461 = arg1.method3401();
		} else if (arg0 == 4) {
			this.anInt1478 = arg1.method3401();
		} else if (arg0 == 5) {
			this.anInt1438 = arg1.method3401();
		} else if (arg0 == 6) {
			this.anInt1443 = arg1.method3401();
		} else if (arg0 == 7) {
			this.anInt1450 = arg1.method3401();
		} else if (arg0 == 8) {
			this.anInt1466 = arg1.method3401();
		} else if (arg0 == 9) {
			this.anInt1452 = arg1.method3401();
		} else if (arg0 == 26) {
			this.anInt1454 = (short) (arg1.method3440() * 4);
			this.anInt1460 = (short) (arg1.method3440() * 4);
		} else {
			@Pc(71) int local71;
			@Pc(79) int local79;
			if (arg0 == 27) {
				if (this.anIntArrayArray33 == null) {
					this.anIntArrayArray33 = new int[12][];
				}
				local71 = arg1.method3440();
				this.anIntArrayArray33[local71] = new int[6];
				for (local79 = 0; local79 < 6; local79++) {
					this.anIntArrayArray33[local71][local79] = arg1.method3447();
				}
			} else if (arg0 == 28) {
				this.anIntArray90 = new int[12];
				for (local71 = 0; local71 < 12; local71++) {
					this.anIntArray90[local71] = arg1.method3440();
					if (this.anIntArray90[local71] == 255) {
						this.anIntArray90[local71] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt1453 = arg1.method3440();
			} else if (arg0 == 30) {
				this.anInt1468 = arg1.method3401();
			} else if (arg0 == 31) {
				this.anInt1435 = arg1.method3440();
			} else if (arg0 == 32) {
				this.anInt1455 = arg1.method3401();
			} else if (arg0 == 33) {
				this.anInt1463 = arg1.method3447();
			} else if (arg0 == 34) {
				this.anInt1474 = arg1.method3440();
			} else if (arg0 == 35) {
				this.anInt1462 = arg1.method3401();
			} else if (arg0 == 36) {
				this.anInt1436 = arg1.method3447();
			} else if (arg0 == 37) {
				this.anInt1442 = arg1.method3440();
			} else if (arg0 == 38) {
				this.anInt1465 = arg1.method3401();
			} else if (arg0 == 39) {
				this.anInt1476 = arg1.method3401();
			} else if (arg0 == 40) {
				this.anInt1467 = arg1.method3401();
			} else if (arg0 == 41) {
				this.anInt1437 = arg1.method3401();
			} else if (arg0 == 42) {
				this.anInt1439 = arg1.method3401();
			} else if (arg0 == 43) {
				arg1.method3401();
			} else if (arg0 == 44) {
				this.anInt1459 = arg1.method3401();
			} else if (arg0 == 45) {
				this.anInt1444 = arg1.method3401();
			} else if (arg0 == 46) {
				this.anInt1456 = arg1.method3401();
			} else if (arg0 == 47) {
				this.anInt1475 = arg1.method3401();
			} else if (arg0 == 48) {
				this.anInt1469 = arg1.method3401();
			} else if (arg0 == 49) {
				this.anInt1446 = arg1.method3401();
			} else if (arg0 == 50) {
				this.anInt1445 = arg1.method3401();
			} else if (arg0 == 51) {
				this.anInt1458 = arg1.method3401();
			} else if (arg0 == 52) {
				local71 = arg1.method3440();
				this.anIntArray88 = new int[local71];
				this.anIntArray89 = new int[local71];
				for (local79 = 0; local79 < local71; local79++) {
					this.anIntArray89[local79] = arg1.method3401();
					@Pc(317) int local317 = arg1.method3440();
					this.anIntArray88[local79] = local317;
					this.anInt1477 += local317;
				}
				return;
			} else if (arg0 == 53) {
				this.aBoolean106 = false;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	public void method1177() {
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)I")
	public int method1178() {
		if (this.anInt1464 != -1) {
			return this.anInt1464;
		} else if (this.anIntArray89 == null) {
			return -1;
		} else {
			@Pc(23) int local23 = (int) ((double) this.anInt1477 * Math.random());
			@Pc(25) int local25;
			for (local25 = 0; this.anIntArray88[local25] <= local23; local25++) {
				local23 -= this.anIntArray88[local25];
			}
			return this.anIntArray89[local25];
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Z")
	public boolean method1179(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt1464 == arg0) {
			return true;
		} else {
			if (this.anIntArray89 != null) {
				for (@Pc(25) int local25 = 0; local25 < this.anIntArray89.length; local25++) {
					if (this.anIntArray89[local25] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
