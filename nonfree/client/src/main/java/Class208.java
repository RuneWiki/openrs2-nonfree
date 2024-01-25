import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class208 {

	@OriginalMember(owner = "client!qk", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!qk", name = "J", descriptor = "[I")
	public int[] anIntArray491;

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
	public int anInt5556 = -1;

	@OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
	public int anInt5560 = -1;

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
	public int anInt5558 = -1;

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
	public int anInt5561 = 0;

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
	private int anInt5554 = 0;

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
	public int anInt5559 = 0;

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
	public int anInt5555 = -1;

	@OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
	public int anInt5567 = 0;

	@OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
	public int anInt5574 = -1;

	@OriginalMember(owner = "client!qk", name = "z", descriptor = "I")
	public int anInt5575 = -1;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
	public int anInt5553 = 0;

	@OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
	public int anInt5572 = -1;

	@OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
	public int anInt5571 = -1;

	@OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
	public int anInt5577 = 0;

	@OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
	public int anInt5562 = -1;

	@OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
	public int anInt5564 = 0;

	@OriginalMember(owner = "client!qk", name = "w", descriptor = "Z")
	public boolean aBoolean380 = true;

	@OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
	public int anInt5573 = -1;

	@OriginalMember(owner = "client!qk", name = "I", descriptor = "I")
	public int anInt5582 = -1;

	@OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
	public int anInt5580 = -1;

	@OriginalMember(owner = "client!qk", name = "H", descriptor = "I")
	public int anInt5581 = -1;

	@OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
	public int anInt5576 = 0;

	@OriginalMember(owner = "client!qk", name = "E", descriptor = "I")
	public int anInt5579 = 0;

	@OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
	public int anInt5568 = -1;

	@OriginalMember(owner = "client!qk", name = "N", descriptor = "I")
	public int anInt5586 = -1;

	@OriginalMember(owner = "client!qk", name = "D", descriptor = "[I")
	public int[] anIntArray489 = null;

	@OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
	public int anInt5565 = -1;

	@OriginalMember(owner = "client!qk", name = "M", descriptor = "I")
	public int anInt5585 = -1;

	@OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
	public int anInt5570 = -1;

	@OriginalMember(owner = "client!qk", name = "O", descriptor = "I")
	public int anInt5587 = 0;

	@OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
	public int anInt5566 = -1;

	@OriginalMember(owner = "client!qk", name = "K", descriptor = "I")
	public int anInt5583 = -1;

	@OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
	public int anInt5589 = 0;

	@OriginalMember(owner = "client!qk", name = "G", descriptor = "[I")
	public int[] anIntArray490 = null;

	@OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
	public int anInt5590 = -1;

	@OriginalMember(owner = "client!qk", name = "Z", descriptor = "I")
	public int anInt5594 = 0;

	@OriginalMember(owner = "client!qk", name = "P", descriptor = "I")
	public int anInt5588 = -1;

	@OriginalMember(owner = "client!qk", name = "X", descriptor = "I")
	public int anInt5592 = 0;

	@OriginalMember(owner = "client!qk", name = "ab", descriptor = "I")
	public int anInt5595 = -1;

	@OriginalMember(owner = "client!qk", name = "Y", descriptor = "I")
	public int anInt5593 = -1;

	@OriginalMember(owner = "client!qk", name = "bb", descriptor = "I")
	public int anInt5596 = -1;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)Z")
	public boolean method4709(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt5580) {
			return true;
		} else {
			if (this.anIntArray489 != null) {
				for (@Pc(34) int local34 = 0; local34 < this.anIntArray489.length; local34++) {
					if (arg0 == this.anIntArray489[local34]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!ha;II)V")
	private void method4710(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5580 = arg0.method3108();
			this.anInt5586 = arg0.method3108();
			if (this.anInt5586 == 65535) {
				this.anInt5586 = -1;
			}
			if (this.anInt5580 == 65535) {
				this.anInt5580 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt5588 = arg0.method3108();
		} else if (arg1 == 3) {
			this.anInt5571 = arg0.method3108();
		} else if (arg1 == 4) {
			this.anInt5573 = arg0.method3108();
		} else if (arg1 == 5) {
			this.anInt5585 = arg0.method3108();
		} else if (arg1 == 6) {
			this.anInt5574 = arg0.method3108();
		} else if (arg1 == 7) {
			this.anInt5595 = arg0.method3108();
		} else if (arg1 == 8) {
			this.anInt5555 = arg0.method3108();
		} else if (arg1 == 9) {
			this.anInt5570 = arg0.method3108();
		} else if (arg1 == 26) {
			this.anInt5577 = (short) (arg0.method3111() * 4);
			this.anInt5579 = (short) (arg0.method3111() * 4);
		} else {
			@Pc(96) int local96;
			@Pc(104) int local104;
			if (arg1 == 27) {
				if (this.anIntArrayArray48 == null) {
					this.anIntArrayArray48 = new int[12][];
				}
				local96 = arg0.method3111();
				this.anIntArrayArray48[local96] = new int[6];
				for (local104 = 0; local104 < 6; local104++) {
					this.anIntArrayArray48[local96][local104] = arg0.method3103();
				}
			} else if (arg1 == 28) {
				this.anIntArray491 = new int[12];
				for (local96 = 0; local96 < 12; local96++) {
					this.anIntArray491[local96] = arg0.method3111();
					if (this.anIntArray491[local96] == 255) {
						this.anIntArray491[local96] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt5576 = arg0.method3111();
			} else if (arg1 == 30) {
				this.anInt5567 = arg0.method3108();
			} else if (arg1 == 31) {
				this.anInt5561 = arg0.method3111();
			} else if (arg1 == 32) {
				this.anInt5587 = arg0.method3108();
			} else if (arg1 == 33) {
				this.anInt5559 = arg0.method3103();
			} else if (arg1 == 34) {
				this.anInt5553 = arg0.method3111();
			} else if (arg1 == 35) {
				this.anInt5564 = arg0.method3108();
			} else if (arg1 == 36) {
				this.anInt5592 = arg0.method3103();
			} else if (arg1 == 37) {
				this.anInt5556 = arg0.method3111();
			} else if (arg1 == 38) {
				this.anInt5558 = arg0.method3108();
			} else if (arg1 == 39) {
				this.anInt5560 = arg0.method3108();
			} else if (arg1 == 40) {
				this.anInt5566 = arg0.method3108();
			} else if (arg1 == 41) {
				this.anInt5590 = arg0.method3108();
			} else if (arg1 == 42) {
				this.anInt5596 = arg0.method3108();
			} else if (arg1 == 43) {
				this.anInt5572 = arg0.method3108();
			} else if (arg1 == 44) {
				this.anInt5565 = arg0.method3108();
			} else if (arg1 == 45) {
				this.anInt5568 = arg0.method3108();
			} else if (arg1 == 46) {
				this.anInt5582 = arg0.method3108();
			} else if (arg1 == 47) {
				this.anInt5562 = arg0.method3108();
			} else if (arg1 == 48) {
				this.anInt5583 = arg0.method3108();
			} else if (arg1 == 49) {
				this.anInt5581 = arg0.method3108();
			} else if (arg1 == 50) {
				this.anInt5593 = arg0.method3108();
			} else if (arg1 == 51) {
				this.anInt5575 = arg0.method3108();
			} else if (arg1 == 52) {
				local96 = arg0.method3111();
				this.anIntArray490 = new int[local96];
				this.anIntArray489 = new int[local96];
				for (local104 = 0; local104 < local96; local104++) {
					this.anIntArray489[local104] = arg0.method3108();
					@Pc(400) int local400 = arg0.method3111();
					this.anIntArray490[local104] = local400;
					this.anInt5554 += local400;
				}
			} else if (arg1 == 53) {
				this.aBoolean380 = false;
				return;
			} else if (arg1 == 54) {
				this.anInt5589 = arg0.method3111() << 6;
				this.anInt5594 = arg0.method3111() << 6;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)I")
	public int method4712() {
		if (this.anInt5580 != -1) {
			return this.anInt5580;
		} else if (this.anIntArray489 == null) {
			return -1;
		} else {
			@Pc(28) int local28 = (int) ((double) this.anInt5554 * Math.random());
			@Pc(30) int local30;
			for (local30 = 0; this.anIntArray490[local30] <= local28; local30++) {
				local28 -= this.anIntArray490[local30];
			}
			return this.anIntArray489[local30];
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!ha;B)V")
	public void method4713(@OriginalArg(0) Class6_Sub15 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3111();
			if (local11 == 0) {
				return;
			}
			this.method4710(arg0, local11);
		}
	}
}
