import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class170 {

	@OriginalMember(owner = "client!og", name = "R", descriptor = "[I")
	public int[] anIntArray564;

	@OriginalMember(owner = "client!og", name = "U", descriptor = "[[I")
	public int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "I")
	public int anInt4529 = -1;

	@OriginalMember(owner = "client!og", name = "n", descriptor = "I")
	private int anInt4542 = 0;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "I")
	public int anInt4532 = 0;

	@OriginalMember(owner = "client!og", name = "b", descriptor = "I")
	public int anInt4530 = -1;

	@OriginalMember(owner = "client!og", name = "q", descriptor = "[I")
	public int[] anIntArray562 = null;

	@OriginalMember(owner = "client!og", name = "h", descriptor = "I")
	public int anInt4536 = -1;

	@OriginalMember(owner = "client!og", name = "l", descriptor = "I")
	public int anInt4540 = 0;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "I")
	public int anInt4535 = -1;

	@OriginalMember(owner = "client!og", name = "i", descriptor = "I")
	public int anInt4537 = 0;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "I")
	public int anInt4533 = -1;

	@OriginalMember(owner = "client!og", name = "y", descriptor = "[I")
	public int[] anIntArray563 = null;

	@OriginalMember(owner = "client!og", name = "k", descriptor = "I")
	public int anInt4539 = -1;

	@OriginalMember(owner = "client!og", name = "F", descriptor = "I")
	public int anInt4558 = -1;

	@OriginalMember(owner = "client!og", name = "c", descriptor = "I")
	public int anInt4531 = 0;

	@OriginalMember(owner = "client!og", name = "o", descriptor = "I")
	public int anInt4543 = 0;

	@OriginalMember(owner = "client!og", name = "D", descriptor = "I")
	public int anInt4556 = -1;

	@OriginalMember(owner = "client!og", name = "I", descriptor = "I")
	public int anInt4560 = -1;

	@OriginalMember(owner = "client!og", name = "K", descriptor = "I")
	public int anInt4561 = 0;

	@OriginalMember(owner = "client!og", name = "A", descriptor = "I")
	public int anInt4553 = -1;

	@OriginalMember(owner = "client!og", name = "O", descriptor = "I")
	public int anInt4564 = -1;

	@OriginalMember(owner = "client!og", name = "v", descriptor = "I")
	public int anInt4549 = -1;

	@OriginalMember(owner = "client!og", name = "f", descriptor = "I")
	public int anInt4534 = -1;

	@OriginalMember(owner = "client!og", name = "L", descriptor = "Z")
	public boolean aBoolean339 = true;

	@OriginalMember(owner = "client!og", name = "B", descriptor = "I")
	public int anInt4554 = 0;

	@OriginalMember(owner = "client!og", name = "T", descriptor = "I")
	public int anInt4568 = -1;

	@OriginalMember(owner = "client!og", name = "M", descriptor = "I")
	public int anInt4562 = -1;

	@OriginalMember(owner = "client!og", name = "P", descriptor = "I")
	public int anInt4565 = -1;

	@OriginalMember(owner = "client!og", name = "N", descriptor = "I")
	public int anInt4563 = -1;

	@OriginalMember(owner = "client!og", name = "t", descriptor = "I")
	public int anInt4547 = -1;

	@OriginalMember(owner = "client!og", name = "H", descriptor = "I")
	public int anInt4559 = 0;

	@OriginalMember(owner = "client!og", name = "C", descriptor = "I")
	public int anInt4555 = -1;

	@OriginalMember(owner = "client!og", name = "W", descriptor = "I")
	public int anInt4570 = 0;

	@OriginalMember(owner = "client!og", name = "x", descriptor = "I")
	public int anInt4551 = -1;

	@OriginalMember(owner = "client!og", name = "r", descriptor = "I")
	public int anInt4545 = 0;

	@OriginalMember(owner = "client!og", name = "V", descriptor = "I")
	public int anInt4569 = -1;

	@OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
	public int anInt4566 = -1;

	@OriginalMember(owner = "client!og", name = "X", descriptor = "I")
	public int anInt4571 = -1;

	@OriginalMember(owner = "client!og", name = "s", descriptor = "I")
	public int anInt4546 = -1;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)I")
	public int method4009() {
		if (this.anInt4555 != -1) {
			return this.anInt4555;
		} else if (this.anIntArray563 == null) {
			return -1;
		} else {
			@Pc(23) int local23 = (int) ((double) this.anInt4542 * Math.random());
			@Pc(25) int local25;
			for (local25 = 0; local23 >= this.anIntArray562[local25]; local25++) {
				local23 -= this.anIntArray562[local25];
			}
			return this.anIntArray563[local25];
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!lk;B)V")
	public void method4011(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4240();
			if (local17 == 0) {
				return;
			}
			this.method4012(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!lk;IZ)V")
	private void method4012(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4555 = arg0.method4245();
			this.anInt4558 = arg0.method4245();
			if (this.anInt4558 == 65535) {
				this.anInt4558 = -1;
			}
			if (this.anInt4555 == 65535) {
				this.anInt4555 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt4564 = arg0.method4245();
		} else if (arg1 == 3) {
			this.anInt4569 = arg0.method4245();
		} else if (arg1 == 4) {
			this.anInt4533 = arg0.method4245();
		} else if (arg1 == 5) {
			this.anInt4546 = arg0.method4245();
		} else if (arg1 == 6) {
			this.anInt4562 = arg0.method4245();
		} else if (arg1 == 7) {
			this.anInt4530 = arg0.method4245();
		} else if (arg1 == 8) {
			this.anInt4535 = arg0.method4245();
		} else if (arg1 == 9) {
			this.anInt4566 = arg0.method4245();
		} else if (arg1 == 26) {
			this.anInt4531 = (short) (arg0.method4240() * 4);
			this.anInt4545 = (short) (arg0.method4240() * 4);
		} else {
			@Pc(83) int local83;
			@Pc(91) int local91;
			if (arg1 == 27) {
				if (this.anIntArrayArray36 == null) {
					this.anIntArrayArray36 = new int[12][];
				}
				local83 = arg0.method4240();
				this.anIntArrayArray36[local83] = new int[6];
				for (local91 = 0; local91 < 6; local91++) {
					this.anIntArrayArray36[local83][local91] = arg0.method4251();
				}
			} else if (arg1 == 28) {
				this.anIntArray564 = new int[12];
				for (local83 = 0; local83 < 12; local83++) {
					this.anIntArray564[local83] = arg0.method4240();
					if (this.anIntArray564[local83] == 255) {
						this.anIntArray564[local83] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt4537 = arg0.method4240();
			} else if (arg1 == 30) {
				this.anInt4532 = arg0.method4245();
			} else if (arg1 == 31) {
				this.anInt4543 = arg0.method4240();
			} else if (arg1 == 32) {
				this.anInt4554 = arg0.method4245();
			} else if (arg1 == 33) {
				this.anInt4559 = arg0.method4251();
			} else if (arg1 == 34) {
				this.anInt4540 = arg0.method4240();
			} else if (arg1 == 35) {
				this.anInt4561 = arg0.method4245();
			} else if (arg1 == 36) {
				this.anInt4570 = arg0.method4251();
			} else if (arg1 == 37) {
				this.anInt4539 = arg0.method4240();
			} else if (arg1 == 38) {
				this.anInt4563 = arg0.method4245();
			} else if (arg1 == 39) {
				this.anInt4529 = arg0.method4245();
			} else if (arg1 == 40) {
				this.anInt4536 = arg0.method4245();
			} else if (arg1 == 41) {
				this.anInt4553 = arg0.method4245();
			} else if (arg1 == 42) {
				this.anInt4565 = arg0.method4245();
			} else if (arg1 == 43) {
				arg0.method4245();
			} else if (arg1 == 44) {
				this.anInt4534 = arg0.method4245();
			} else if (arg1 == 45) {
				this.anInt4551 = arg0.method4245();
			} else if (arg1 == 46) {
				this.anInt4568 = arg0.method4245();
			} else if (arg1 == 47) {
				this.anInt4556 = arg0.method4245();
			} else if (arg1 == 48) {
				this.anInt4560 = arg0.method4245();
			} else if (arg1 == 49) {
				this.anInt4549 = arg0.method4245();
			} else if (arg1 == 50) {
				this.anInt4547 = arg0.method4245();
				return;
			} else if (arg1 == 51) {
				this.anInt4571 = arg0.method4245();
				return;
			} else if (arg1 == 52) {
				local83 = arg0.method4240();
				this.anIntArray563 = new int[local83];
				this.anIntArray562 = new int[local83];
				for (local91 = 0; local91 < local83; local91++) {
					this.anIntArray563[local91] = arg0.method4245();
					@Pc(364) int local364 = arg0.method4240();
					this.anIntArray562[local91] = local364;
					this.anInt4542 += local364;
				}
				return;
			} else if (arg1 == 53) {
				this.aBoolean339 = false;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(BI)Z")
	public boolean method4016(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt4555) {
			return true;
		} else {
			if (this.anIntArray563 != null) {
				for (@Pc(26) int local26 = 0; local26 < this.anIntArray563.length; local26++) {
					if (arg0 == this.anIntArray563[local26]) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
