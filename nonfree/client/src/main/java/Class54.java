import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class54 {

	@OriginalMember(owner = "client!ef", name = "D", descriptor = "[[I")
	public int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!ef", name = "cb", descriptor = "[I")
	public int[] anIntArray96;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
	public int anInt1470 = -1;

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
	public int anInt1479 = -1;

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
	public int anInt1485 = 0;

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
	public int anInt1477 = 0;

	@OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
	public int anInt1493 = -1;

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
	public int anInt1476 = -1;

	@OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
	public int anInt1501 = -1;

	@OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
	public int anInt1500 = -1;

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
	public int anInt1495 = 0;

	@OriginalMember(owner = "client!ef", name = "x", descriptor = "I")
	public int anInt1491 = -1;

	@OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
	public int anInt1486 = 0;

	@OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
	public int anInt1490 = -1;

	@OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
	public int anInt1496 = -1;

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
	public int anInt1475 = -1;

	@OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
	public int anInt1489 = 0;

	@OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
	public int anInt1504 = -1;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
	public int anInt1482 = -1;

	@OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
	public int anInt1510 = -1;

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
	public int anInt1481 = -1;

	@OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
	public int anInt1488 = -1;

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
	public int anInt1484 = -1;

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "[I")
	private int[] anIntArray93 = null;

	@OriginalMember(owner = "client!ef", name = "L", descriptor = "Z")
	public boolean aBoolean75 = true;

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
	public int anInt1487 = 0;

	@OriginalMember(owner = "client!ef", name = "Y", descriptor = "I")
	public int anInt1513 = -1;

	@OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
	public int anInt1499 = -1;

	@OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
	public int anInt1506 = -1;

	@OriginalMember(owner = "client!ef", name = "S", descriptor = "I")
	public int anInt1508 = -1;

	@OriginalMember(owner = "client!ef", name = "V", descriptor = "I")
	public int anInt1511 = 0;

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
	public int anInt1478 = 0;

	@OriginalMember(owner = "client!ef", name = "bb", descriptor = "I")
	public int anInt1515 = 0;

	@OriginalMember(owner = "client!ef", name = "W", descriptor = "[I")
	private int[] anIntArray95 = null;

	@OriginalMember(owner = "client!ef", name = "G", descriptor = "I")
	public int anInt1498 = -1;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
	public int anInt1473 = -1;

	@OriginalMember(owner = "client!ef", name = "T", descriptor = "I")
	public int anInt1509 = -1;

	@OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
	private int anInt1503 = 0;

	@OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
	public int anInt1492 = 0;

	@OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
	public int anInt1505 = -1;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
	public void method1153() {
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)Z")
	public boolean method1154(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt1508) {
			return true;
		} else {
			if (this.anIntArray93 != null) {
				for (@Pc(30) int local30 = 0; local30 < this.anIntArray93.length; local30++) {
					if (arg0 == this.anIntArray93[local30]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILclient!fb;)V")
	private void method1155(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt1508 = arg1.method3649();
			this.anInt1493 = arg1.method3649();
			if (this.anInt1493 == 65535) {
				this.anInt1493 = -1;
			}
			if (this.anInt1508 == 65535) {
				this.anInt1508 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt1499 = arg1.method3649();
		} else if (arg0 == 3) {
			this.anInt1473 = arg1.method3649();
		} else if (arg0 == 4) {
			this.anInt1482 = arg1.method3649();
		} else if (arg0 == 5) {
			this.anInt1475 = arg1.method3649();
		} else if (arg0 == 6) {
			this.anInt1509 = arg1.method3649();
		} else if (arg0 == 7) {
			this.anInt1491 = arg1.method3649();
		} else if (arg0 == 8) {
			this.anInt1498 = arg1.method3649();
		} else if (arg0 == 9) {
			this.anInt1505 = arg1.method3649();
		} else if (arg0 == 26) {
			this.anInt1515 = (short) (arg1.method3643() * 4);
			this.anInt1489 = (short) (arg1.method3643() * 4);
		} else {
			@Pc(133) int local133;
			@Pc(141) int local141;
			if (arg0 == 27) {
				if (this.anIntArrayArray9 == null) {
					this.anIntArrayArray9 = new int[12][];
				}
				local133 = arg1.method3643();
				this.anIntArrayArray9[local133] = new int[6];
				for (local141 = 0; local141 < 6; local141++) {
					this.anIntArrayArray9[local133][local141] = arg1.method3622();
				}
			} else if (arg0 == 28) {
				this.anIntArray96 = new int[12];
				for (local133 = 0; local133 < 12; local133++) {
					this.anIntArray96[local133] = arg1.method3643();
					if (this.anIntArray96[local133] == 255) {
						this.anIntArray96[local133] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt1487 = arg1.method3643();
			} else if (arg0 == 30) {
				this.anInt1492 = arg1.method3649();
			} else if (arg0 == 31) {
				this.anInt1477 = arg1.method3643();
			} else if (arg0 == 32) {
				this.anInt1511 = arg1.method3649();
			} else if (arg0 == 33) {
				this.anInt1486 = arg1.method3622();
			} else if (arg0 == 34) {
				this.anInt1485 = arg1.method3643();
			} else if (arg0 == 35) {
				this.anInt1495 = arg1.method3649();
			} else if (arg0 == 36) {
				this.anInt1478 = arg1.method3622();
			} else if (arg0 == 37) {
				this.anInt1496 = arg1.method3643();
			} else if (arg0 == 38) {
				this.anInt1513 = arg1.method3649();
			} else if (arg0 == 39) {
				this.anInt1490 = arg1.method3649();
			} else if (arg0 == 40) {
				this.anInt1488 = arg1.method3649();
			} else if (arg0 == 41) {
				this.anInt1476 = arg1.method3649();
			} else if (arg0 == 42) {
				this.anInt1506 = arg1.method3649();
			} else if (arg0 == 43) {
				arg1.method3649();
			} else if (arg0 == 44) {
				this.anInt1481 = arg1.method3649();
			} else if (arg0 == 45) {
				this.anInt1470 = arg1.method3649();
			} else if (arg0 == 46) {
				this.anInt1504 = arg1.method3649();
			} else if (arg0 == 47) {
				this.anInt1484 = arg1.method3649();
			} else if (arg0 == 48) {
				this.anInt1500 = arg1.method3649();
			} else if (arg0 == 49) {
				this.anInt1479 = arg1.method3649();
			} else if (arg0 == 50) {
				this.anInt1510 = arg1.method3649();
			} else if (arg0 == 51) {
				this.anInt1501 = arg1.method3649();
			} else if (arg0 == 52) {
				local133 = arg1.method3643();
				this.anIntArray93 = new int[local133];
				this.anIntArray95 = new int[local133];
				for (local141 = 0; local141 < local133; local141++) {
					this.anIntArray93[local141] = arg1.method3649();
					@Pc(444) int local444 = arg1.method3643();
					this.anIntArray95[local141] = local444;
					this.anInt1503 += local444;
				}
			} else if (arg0 == 53) {
				this.aBoolean75 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)I")
	public int method1157() {
		if (this.anInt1508 != -1) {
			return this.anInt1508;
		} else if (this.anIntArray93 == null) {
			return -1;
		} else {
			@Pc(24) int local24 = (int) (Math.random() * (double) this.anInt1503);
			@Pc(26) int local26;
			for (local26 = 0; local24 >= this.anIntArray95[local26]; local26++) {
				local24 -= this.anIntArray95[local26];
			}
			return this.anIntArray93[local26];
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!fb;B)V")
	public void method1159(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method3643();
			if (local17 == 0) {
				return;
			}
			this.method1155(local17, arg0);
		}
	}
}
