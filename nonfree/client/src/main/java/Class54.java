import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class54 {

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "[I")
	public int[] anIntArray74;

	@OriginalMember(owner = "client!cg", name = "y", descriptor = "[[I")
	public int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "Z")
	public boolean aBoolean104 = true;

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
	public int anInt1391 = -1;

	@OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
	public int anInt1398 = 0;

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
	public int anInt1392 = 0;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
	public int anInt1384 = -1;

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
	public int anInt1390 = 0;

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
	public int anInt1385 = -1;

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
	public int anInt1394 = -1;

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
	public int anInt1387 = -1;

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
	public int anInt1388 = 0;

	@OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
	public int anInt1402 = -1;

	@OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
	public int anInt1395 = -1;

	@OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
	public int anInt1400 = -1;

	@OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
	public int anInt1403 = 0;

	@OriginalMember(owner = "client!cg", name = "q", descriptor = "[I")
	public int[] anIntArray73 = null;

	@OriginalMember(owner = "client!cg", name = "I", descriptor = "I")
	public int anInt1408 = -1;

	@OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
	public int anInt1406 = -1;

	@OriginalMember(owner = "client!cg", name = "F", descriptor = "[I")
	public int[] anIntArray75 = null;

	@OriginalMember(owner = "client!cg", name = "M", descriptor = "I")
	public int anInt1412 = -1;

	@OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
	public int anInt1397 = -1;

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
	public int anInt1393 = -1;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
	public int anInt1380 = -1;

	@OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
	public int anInt1410 = 0;

	@OriginalMember(owner = "client!cg", name = "H", descriptor = "I")
	public int anInt1407 = -1;

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
	public int anInt1386 = -1;

	@OriginalMember(owner = "client!cg", name = "O", descriptor = "I")
	public int anInt1414 = 0;

	@OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
	public int anInt1401 = -1;

	@OriginalMember(owner = "client!cg", name = "N", descriptor = "I")
	public int anInt1413 = -1;

	@OriginalMember(owner = "client!cg", name = "D", descriptor = "I")
	public int anInt1404 = 0;

	@OriginalMember(owner = "client!cg", name = "R", descriptor = "I")
	public int anInt1417 = -1;

	@OriginalMember(owner = "client!cg", name = "P", descriptor = "I")
	public int anInt1415 = 0;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
	public int anInt1381 = -1;

	@OriginalMember(owner = "client!cg", name = "Q", descriptor = "I")
	public int anInt1416 = -1;

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
	public int anInt1396 = 0;

	@OriginalMember(owner = "client!cg", name = "V", descriptor = "I")
	private int anInt1421 = 0;

	@OriginalMember(owner = "client!cg", name = "U", descriptor = "I")
	public int anInt1420 = 0;

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
	public int anInt1389 = -1;

	@OriginalMember(owner = "client!cg", name = "T", descriptor = "I")
	public int anInt1419 = -1;

	@OriginalMember(owner = "client!cg", name = "S", descriptor = "I")
	public int anInt1418 = -1;

	@OriginalMember(owner = "client!cg", name = "W", descriptor = "I")
	public int anInt1422 = 0;

	@OriginalMember(owner = "client!cg", name = "X", descriptor = "I")
	public int anInt1423 = -1;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)I")
	public int method966() {
		if (this.anInt1394 != -1) {
			return this.anInt1394;
		} else if (this.anIntArray75 == null) {
			return -1;
		} else {
			@Pc(22) int local22 = (int) (Math.random() * (double) this.anInt1421);
			@Pc(24) int local24;
			for (local24 = 0; this.anIntArray73[local24] <= local22; local24++) {
				local22 -= this.anIntArray73[local24];
			}
			return this.anIntArray75[local24];
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!es;I)V")
	public void method968(@OriginalArg(0) Class2_Sub15 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4325();
			if (local9 == 0) {
				return;
			}
			this.method970(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)Z")
	public boolean method969(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt1394) {
			return true;
		} else {
			if (this.anIntArray75 != null) {
				for (@Pc(33) int local33 = 0; local33 < this.anIntArray75.length; local33++) {
					if (this.anIntArray75[local33] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IBLclient!es;)V")
	private void method970(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt1394 = arg1.method4294();
			this.anInt1401 = arg1.method4294();
			if (this.anInt1401 == 65535) {
				this.anInt1401 = -1;
			}
			if (this.anInt1394 == 65535) {
				this.anInt1394 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt1389 = arg1.method4294();
		} else if (arg0 == 3) {
			this.anInt1384 = arg1.method4294();
		} else if (arg0 == 4) {
			this.anInt1391 = arg1.method4294();
		} else if (arg0 == 5) {
			this.anInt1397 = arg1.method4294();
		} else if (arg0 == 6) {
			this.anInt1387 = arg1.method4294();
		} else if (arg0 == 7) {
			this.anInt1386 = arg1.method4294();
		} else if (arg0 == 8) {
			this.anInt1412 = arg1.method4294();
		} else if (arg0 == 9) {
			this.anInt1423 = arg1.method4294();
		} else if (arg0 == 26) {
			this.anInt1388 = (short) (arg1.method4325() * 4);
			this.anInt1422 = (short) (arg1.method4325() * 4);
		} else {
			@Pc(137) int local137;
			@Pc(145) int local145;
			if (arg0 == 27) {
				if (this.anIntArrayArray2 == null) {
					this.anIntArrayArray2 = new int[12][];
				}
				local137 = arg1.method4325();
				this.anIntArrayArray2[local137] = new int[6];
				for (local145 = 0; local145 < 6; local145++) {
					this.anIntArrayArray2[local137][local145] = arg1.method4334();
				}
			} else if (arg0 == 28) {
				this.anIntArray74 = new int[12];
				for (local137 = 0; local137 < 12; local137++) {
					this.anIntArray74[local137] = arg1.method4325();
					if (this.anIntArray74[local137] == 255) {
						this.anIntArray74[local137] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt1390 = arg1.method4325();
			} else if (arg0 == 30) {
				this.anInt1410 = arg1.method4294();
			} else if (arg0 == 31) {
				this.anInt1392 = arg1.method4325();
			} else if (arg0 == 32) {
				this.anInt1398 = arg1.method4294();
			} else if (arg0 == 33) {
				this.anInt1414 = arg1.method4334();
			} else if (arg0 == 34) {
				this.anInt1415 = arg1.method4325();
			} else if (arg0 == 35) {
				this.anInt1396 = arg1.method4294();
			} else if (arg0 == 36) {
				this.anInt1403 = arg1.method4334();
			} else if (arg0 == 37) {
				this.anInt1381 = arg1.method4325();
			} else if (arg0 == 38) {
				this.anInt1418 = arg1.method4294();
			} else if (arg0 == 39) {
				this.anInt1413 = arg1.method4294();
			} else if (arg0 == 40) {
				this.anInt1408 = arg1.method4294();
			} else if (arg0 == 41) {
				this.anInt1395 = arg1.method4294();
			} else if (arg0 == 42) {
				this.anInt1393 = arg1.method4294();
			} else if (arg0 == 43) {
				this.anInt1385 = arg1.method4294();
			} else if (arg0 == 44) {
				this.anInt1416 = arg1.method4294();
			} else if (arg0 == 45) {
				this.anInt1380 = arg1.method4294();
			} else if (arg0 == 46) {
				this.anInt1402 = arg1.method4294();
			} else if (arg0 == 47) {
				this.anInt1406 = arg1.method4294();
			} else if (arg0 == 48) {
				this.anInt1407 = arg1.method4294();
			} else if (arg0 == 49) {
				this.anInt1419 = arg1.method4294();
			} else if (arg0 == 50) {
				this.anInt1400 = arg1.method4294();
			} else if (arg0 == 51) {
				this.anInt1417 = arg1.method4294();
			} else if (arg0 == 52) {
				local137 = arg1.method4325();
				this.anIntArray75 = new int[local137];
				this.anIntArray73 = new int[local137];
				for (local145 = 0; local145 < local137; local145++) {
					this.anIntArray75[local145] = arg1.method4294();
					@Pc(421) int local421 = arg1.method4325();
					this.anIntArray73[local145] = local421;
					this.anInt1421 += local421;
				}
			} else if (arg0 == 53) {
				this.aBoolean104 = false;
			} else if (arg0 == 54) {
				this.anInt1420 = arg1.method4325() << 6;
				this.anInt1404 = arg1.method4325() << 6;
			}
		}
	}
}
