import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class154 {

	@OriginalMember(owner = "client!jg", name = "G", descriptor = "[[I")
	public int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!jg", name = "T", descriptor = "[I")
	public int[] anIntArray373;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
	public int anInt4496 = -1;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
	public int anInt4499 = 0;

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
	public int anInt4512 = -1;

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
	public int anInt4509 = -1;

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
	public int anInt4504 = 0;

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
	public int anInt4508 = 0;

	@OriginalMember(owner = "client!jg", name = "v", descriptor = "[I")
	public int[] anIntArray371 = null;

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
	public int anInt4500 = -1;

	@OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
	public int anInt4524 = -1;

	@OriginalMember(owner = "client!jg", name = "F", descriptor = "[I")
	public int[] anIntArray372 = null;

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
	public int anInt4511 = -1;

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
	public int anInt4510 = 0;

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
	public int anInt4497 = -1;

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
	public int anInt4515 = -1;

	@OriginalMember(owner = "client!jg", name = "A", descriptor = "I")
	public int anInt4520 = 0;

	@OriginalMember(owner = "client!jg", name = "E", descriptor = "I")
	public int anInt4523 = -1;

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
	public int anInt4498 = 0;

	@OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
	public int anInt4516 = -1;

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
	public int anInt4514 = -1;

	@OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
	public int anInt4522 = 0;

	@OriginalMember(owner = "client!jg", name = "N", descriptor = "I")
	public int anInt4530 = 0;

	@OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
	public int anInt4527 = 0;

	@OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
	public int anInt4513 = -1;

	@OriginalMember(owner = "client!jg", name = "B", descriptor = "Z")
	public boolean aBoolean333 = true;

	@OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
	public int anInt4519 = -1;

	@OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
	private int anInt4518 = 0;

	@OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
	public int anInt4528 = 0;

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
	public int anInt4503 = -1;

	@OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
	public int anInt4526 = -1;

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
	public int anInt4506 = -1;

	@OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
	public int anInt4534 = -1;

	@OriginalMember(owner = "client!jg", name = "V", descriptor = "I")
	public int anInt4536 = -1;

	@OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
	public int anInt4531 = -1;

	@OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
	public int anInt4532 = -1;

	@OriginalMember(owner = "client!jg", name = "Y", descriptor = "I")
	public int anInt4539 = -1;

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
	public int anInt4505 = -1;

	@OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
	public int anInt4525 = -1;

	@OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
	public int anInt4533 = 0;

	@OriginalMember(owner = "client!jg", name = "X", descriptor = "I")
	public int anInt4538 = -1;

	@OriginalMember(owner = "client!jg", name = "W", descriptor = "I")
	public int anInt4537 = 0;

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
	public int anInt4507 = -1;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)I")
	public int method3825() {
		if (this.anInt4526 != -1) {
			return this.anInt4526;
		} else if (this.anIntArray372 == null) {
			return -1;
		} else {
			@Pc(28) int local28 = (int) (Math.random() * (double) this.anInt4518);
			@Pc(30) int local30;
			for (local30 = 0; local28 >= this.anIntArray371[local30]; local30++) {
				local28 -= this.anIntArray371[local30];
			}
			return this.anIntArray372[local30];
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)Z")
	public boolean method3827(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt4526 == arg0) {
			return true;
		} else {
			if (this.anIntArray372 != null) {
				for (@Pc(25) int local25 = 0; local25 < this.anIntArray372.length; local25++) {
					if (this.anIntArray372[local25] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!jr;B)V")
	public void method3829(@OriginalArg(0) Class6_Sub12 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6019();
			if (local9 == 0) {
				return;
			}
			this.method3832(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZLclient!jr;I)V")
	private void method3832(@OriginalArg(1) Class6_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4526 = arg0.method6044();
			this.anInt4534 = arg0.method6044();
			if (this.anInt4534 == 65535) {
				this.anInt4534 = -1;
			}
			if (this.anInt4526 == 65535) {
				this.anInt4526 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt4523 = arg0.method6044();
		} else if (arg1 == 3) {
			this.anInt4506 = arg0.method6044();
		} else if (arg1 == 4) {
			this.anInt4519 = arg0.method6044();
		} else if (arg1 == 5) {
			this.anInt4531 = arg0.method6044();
		} else if (arg1 == 6) {
			this.anInt4538 = arg0.method6044();
		} else if (arg1 == 7) {
			this.anInt4524 = arg0.method6044();
		} else if (arg1 == 8) {
			this.anInt4507 = arg0.method6044();
		} else if (arg1 == 9) {
			this.anInt4516 = arg0.method6044();
		} else if (arg1 == 26) {
			this.anInt4508 = (short) (arg0.method6019() * 4);
			this.anInt4530 = (short) (arg0.method6019() * 4);
		} else {
			@Pc(113) int local113;
			@Pc(121) int local121;
			if (arg1 == 27) {
				if (this.anIntArrayArray41 == null) {
					this.anIntArrayArray41 = new int[12][];
				}
				local113 = arg0.method6019();
				this.anIntArrayArray41[local113] = new int[6];
				for (local121 = 0; local121 < 6; local121++) {
					this.anIntArrayArray41[local113][local121] = arg0.method6023();
				}
			} else if (arg1 == 28) {
				this.anIntArray373 = new int[12];
				for (local113 = 0; local113 < 12; local113++) {
					this.anIntArray373[local113] = arg0.method6019();
					if (this.anIntArray373[local113] == 255) {
						this.anIntArray373[local113] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt4528 = arg0.method6019();
			} else if (arg1 == 30) {
				this.anInt4533 = arg0.method6044();
			} else if (arg1 == 31) {
				this.anInt4520 = arg0.method6019();
			} else if (arg1 == 32) {
				this.anInt4527 = arg0.method6044();
			} else if (arg1 == 33) {
				this.anInt4537 = arg0.method6023();
			} else if (arg1 == 34) {
				this.anInt4499 = arg0.method6019();
			} else if (arg1 == 35) {
				this.anInt4498 = arg0.method6044();
			} else if (arg1 == 36) {
				this.anInt4504 = arg0.method6023();
			} else if (arg1 == 37) {
				this.anInt4497 = arg0.method6019();
			} else if (arg1 == 38) {
				this.anInt4532 = arg0.method6044();
			} else if (arg1 == 39) {
				this.anInt4505 = arg0.method6044();
			} else if (arg1 == 40) {
				this.anInt4539 = arg0.method6044();
			} else if (arg1 == 41) {
				this.anInt4512 = arg0.method6044();
			} else if (arg1 == 42) {
				this.anInt4496 = arg0.method6044();
			} else if (arg1 == 43) {
				this.anInt4525 = arg0.method6044();
			} else if (arg1 == 44) {
				this.anInt4536 = arg0.method6044();
			} else if (arg1 == 45) {
				this.anInt4513 = arg0.method6044();
			} else if (arg1 == 46) {
				this.anInt4515 = arg0.method6044();
			} else if (arg1 == 47) {
				this.anInt4500 = arg0.method6044();
			} else if (arg1 == 48) {
				this.anInt4509 = arg0.method6044();
			} else if (arg1 == 49) {
				this.anInt4503 = arg0.method6044();
			} else if (arg1 == 50) {
				this.anInt4511 = arg0.method6044();
			} else if (arg1 == 51) {
				this.anInt4514 = arg0.method6044();
			} else if (arg1 == 52) {
				local113 = arg0.method6019();
				this.anIntArray371 = new int[local113];
				this.anIntArray372 = new int[local113];
				for (local121 = 0; local121 < local113; local121++) {
					this.anIntArray372[local121] = arg0.method6044();
					@Pc(374) int local374 = arg0.method6019();
					this.anIntArray371[local121] = local374;
					this.anInt4518 += local374;
				}
				return;
			} else if (arg1 == 53) {
				this.aBoolean333 = false;
				return;
			} else if (arg1 == 54) {
				this.anInt4510 = arg0.method6019() << 6;
				this.anInt4522 = arg0.method6019() << 6;
				return;
			}
		}
	}
}
