import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class236 {

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!ti", name = "w", descriptor = "[I")
	public int[] anIntArray433;

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
	public int anInt6446 = -1;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
	public int anInt6441 = -1;

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "Z")
	public boolean aBoolean708 = true;

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
	public int anInt6455 = -1;

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
	public int anInt6447 = -1;

	@OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
	public int anInt6461 = -1;

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
	public int anInt6448 = -1;

	@OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
	private int anInt6459 = 0;

	@OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
	public int anInt6464 = 0;

	@OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
	public int anInt6456 = 0;

	@OriginalMember(owner = "client!ti", name = "F", descriptor = "I")
	public int anInt6466 = -1;

	@OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
	public int anInt6458 = -1;

	@OriginalMember(owner = "client!ti", name = "L", descriptor = "I")
	public int anInt6470 = -1;

	@OriginalMember(owner = "client!ti", name = "J", descriptor = "[I")
	public int[] anIntArray435 = null;

	@OriginalMember(owner = "client!ti", name = "E", descriptor = "[I")
	public int[] anIntArray434 = null;

	@OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
	public int anInt6474 = -1;

	@OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
	public int anInt6467 = -1;

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
	public int anInt6450 = 0;

	@OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
	public int anInt6468 = -1;

	@OriginalMember(owner = "client!ti", name = "N", descriptor = "I")
	public int anInt6472 = 0;

	@OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
	public int anInt6462 = -1;

	@OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
	public int anInt6463 = -1;

	@OriginalMember(owner = "client!ti", name = "M", descriptor = "I")
	public int anInt6471 = 0;

	@OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
	public int anInt6476 = 0;

	@OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
	public int anInt6457 = -1;

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
	public int anInt6453 = 0;

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
	public int anInt6442 = 0;

	@OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
	public int anInt6473 = -1;

	@OriginalMember(owner = "client!ti", name = "U", descriptor = "I")
	public int anInt6479 = -1;

	@OriginalMember(owner = "client!ti", name = "K", descriptor = "I")
	public int anInt6469 = 0;

	@OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
	public int anInt6477 = -1;

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
	public int anInt6454 = -1;

	@OriginalMember(owner = "client!ti", name = "V", descriptor = "I")
	public int anInt6480 = -1;

	@OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
	public int anInt6460 = 0;

	@OriginalMember(owner = "client!ti", name = "T", descriptor = "I")
	public int anInt6478 = -1;

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
	public int anInt6443 = -1;

	@OriginalMember(owner = "client!ti", name = "X", descriptor = "I")
	public int anInt6482 = 0;

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
	public int anInt6444 = -1;

	@OriginalMember(owner = "client!ti", name = "W", descriptor = "I")
	public int anInt6481 = 0;

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
	public int anInt6452 = -1;

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
	public int anInt6451 = -1;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)Z")
	public boolean method5071(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt6444 == arg0) {
			return true;
		} else {
			if (this.anIntArray435 != null) {
				for (@Pc(27) int local27 = 0; local27 < this.anIntArray435.length; local27++) {
					if (this.anIntArray435[local27] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!ug;)V")
	public void method5072(@OriginalArg(1) Class1_Sub28 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5337();
			if (local14 == 0) {
				return;
			}
			this.method5074(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!ug;B)V")
	private void method5074(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub28 arg1) {
		if (arg0 == 1) {
			this.anInt6444 = arg1.method5335();
			this.anInt6447 = arg1.method5335();
			if (this.anInt6444 == 65535) {
				this.anInt6444 = -1;
			}
			if (this.anInt6447 == 65535) {
				this.anInt6447 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt6470 = arg1.method5335();
		} else if (arg0 == 3) {
			this.anInt6454 = arg1.method5335();
		} else if (arg0 == 4) {
			this.anInt6466 = arg1.method5335();
		} else if (arg0 == 5) {
			this.anInt6441 = arg1.method5335();
		} else if (arg0 == 6) {
			this.anInt6463 = arg1.method5335();
		} else if (arg0 == 7) {
			this.anInt6458 = arg1.method5335();
		} else if (arg0 == 8) {
			this.anInt6452 = arg1.method5335();
		} else if (arg0 == 9) {
			this.anInt6477 = arg1.method5335();
		} else if (arg0 == 26) {
			this.anInt6460 = (short) (arg1.method5337() * 4);
			this.anInt6482 = (short) (arg1.method5337() * 4);
		} else {
			@Pc(269) int local269;
			@Pc(279) int local279;
			if (arg0 == 27) {
				if (this.anIntArrayArray60 == null) {
					this.anIntArrayArray60 = new int[12][];
				}
				local269 = arg1.method5337();
				this.anIntArrayArray60[local269] = new int[6];
				for (local279 = 0; local279 < 6; local279++) {
					this.anIntArrayArray60[local269][local279] = arg1.method5382();
				}
			} else if (arg0 == 28) {
				this.anIntArray433 = new int[12];
				for (local269 = 0; local269 < 12; local269++) {
					this.anIntArray433[local269] = arg1.method5337();
					if (this.anIntArray433[local269] == 255) {
						this.anIntArray433[local269] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt6456 = arg1.method5337();
			} else if (arg0 == 30) {
				this.anInt6450 = arg1.method5335();
			} else if (arg0 == 31) {
				this.anInt6464 = arg1.method5337();
			} else if (arg0 == 32) {
				this.anInt6472 = arg1.method5335();
			} else if (arg0 == 33) {
				this.anInt6476 = arg1.method5382();
			} else if (arg0 == 34) {
				this.anInt6442 = arg1.method5337();
			} else if (arg0 == 35) {
				this.anInt6453 = arg1.method5335();
			} else if (arg0 == 36) {
				this.anInt6481 = arg1.method5382();
			} else if (arg0 == 37) {
				this.anInt6473 = arg1.method5337();
			} else if (arg0 == 38) {
				this.anInt6479 = arg1.method5335();
			} else if (arg0 == 39) {
				this.anInt6480 = arg1.method5335();
			} else if (arg0 == 40) {
				this.anInt6443 = arg1.method5335();
			} else if (arg0 == 41) {
				this.anInt6478 = arg1.method5335();
			} else if (arg0 == 42) {
				this.anInt6461 = arg1.method5335();
			} else if (arg0 == 43) {
				this.anInt6468 = arg1.method5335();
			} else if (arg0 == 44) {
				this.anInt6457 = arg1.method5335();
			} else if (arg0 == 45) {
				this.anInt6446 = arg1.method5335();
			} else if (arg0 == 46) {
				this.anInt6451 = arg1.method5335();
			} else if (arg0 == 47) {
				this.anInt6455 = arg1.method5335();
			} else if (arg0 == 48) {
				this.anInt6462 = arg1.method5335();
			} else if (arg0 == 49) {
				this.anInt6474 = arg1.method5335();
			} else if (arg0 == 50) {
				this.anInt6448 = arg1.method5335();
			} else if (arg0 == 51) {
				this.anInt6467 = arg1.method5335();
			} else if (arg0 == 52) {
				local269 = arg1.method5337();
				this.anIntArray435 = new int[local269];
				this.anIntArray434 = new int[local269];
				for (local279 = 0; local279 < local269; local279++) {
					this.anIntArray435[local279] = arg1.method5335();
					@Pc(292) int local292 = arg1.method5337();
					this.anIntArray434[local279] = local292;
					this.anInt6459 += local292;
				}
			} else if (arg0 == 53) {
				this.aBoolean708 = false;
			} else if (arg0 == 54) {
				this.anInt6471 = arg1.method5337() << 6;
				this.anInt6469 = arg1.method5337() << 6;
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)I")
	public int method5075() {
		if (this.anInt6444 != -1) {
			return this.anInt6444;
		} else if (this.anIntArray435 == null) {
			return -1;
		} else {
			@Pc(28) int local28 = (int) ((double) this.anInt6459 * Math.random());
			@Pc(30) int local30;
			for (local30 = 0; this.anIntArray434[local30] <= local28; local30++) {
				local28 -= this.anIntArray434[local30];
			}
			return this.anIntArray435[local30];
		}
	}
}
