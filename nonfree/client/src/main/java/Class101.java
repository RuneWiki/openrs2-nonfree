import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class101 {

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!gt", name = "r", descriptor = "[I")
	public int[] anIntArray223;

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
	public int anInt2608 = -1;

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
	public int anInt2611 = -1;

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
	public int anInt2612 = -1;

	@OriginalMember(owner = "client!gt", name = "m", descriptor = "I")
	public int anInt2618 = 0;

	@OriginalMember(owner = "client!gt", name = "p", descriptor = "I")
	public int anInt2621 = -1;

	@OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
	public int anInt2613 = -1;

	@OriginalMember(owner = "client!gt", name = "x", descriptor = "I")
	public int anInt2628 = -1;

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
	public int anInt2614 = -1;

	@OriginalMember(owner = "client!gt", name = "l", descriptor = "I")
	public int anInt2617 = 0;

	@OriginalMember(owner = "client!gt", name = "C", descriptor = "[I")
	public int[] anIntArray224 = null;

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
	public int anInt2609 = 0;

	@OriginalMember(owner = "client!gt", name = "w", descriptor = "I")
	public int anInt2627 = -1;

	@OriginalMember(owner = "client!gt", name = "u", descriptor = "I")
	public int anInt2625 = 0;

	@OriginalMember(owner = "client!gt", name = "G", descriptor = "I")
	public int anInt2634 = 0;

	@OriginalMember(owner = "client!gt", name = "y", descriptor = "Z")
	public boolean aBoolean167 = true;

	@OriginalMember(owner = "client!gt", name = "N", descriptor = "I")
	public int anInt2640 = 0;

	@OriginalMember(owner = "client!gt", name = "z", descriptor = "I")
	public int anInt2629 = -1;

	@OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
	public int anInt2615 = -1;

	@OriginalMember(owner = "client!gt", name = "B", descriptor = "I")
	public int anInt2631 = -1;

	@OriginalMember(owner = "client!gt", name = "P", descriptor = "I")
	public int anInt2642 = -1;

	@OriginalMember(owner = "client!gt", name = "I", descriptor = "I")
	public int anInt2636 = 0;

	@OriginalMember(owner = "client!gt", name = "M", descriptor = "I")
	public int anInt2639 = -1;

	@OriginalMember(owner = "client!gt", name = "n", descriptor = "I")
	public int anInt2619 = -1;

	@OriginalMember(owner = "client!gt", name = "E", descriptor = "[I")
	public int[] anIntArray225 = null;

	@OriginalMember(owner = "client!gt", name = "S", descriptor = "I")
	public int anInt2645 = -1;

	@OriginalMember(owner = "client!gt", name = "v", descriptor = "I")
	public int anInt2626 = 0;

	@OriginalMember(owner = "client!gt", name = "R", descriptor = "I")
	public int anInt2644 = 0;

	@OriginalMember(owner = "client!gt", name = "F", descriptor = "I")
	private int anInt2633 = 0;

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
	public int anInt2610 = -1;

	@OriginalMember(owner = "client!gt", name = "s", descriptor = "I")
	public int anInt2623 = 0;

	@OriginalMember(owner = "client!gt", name = "T", descriptor = "I")
	public int anInt2646 = -1;

	@OriginalMember(owner = "client!gt", name = "W", descriptor = "I")
	public int anInt2649 = -1;

	@OriginalMember(owner = "client!gt", name = "q", descriptor = "I")
	public int anInt2622 = -1;

	@OriginalMember(owner = "client!gt", name = "V", descriptor = "I")
	public int anInt2648 = -1;

	@OriginalMember(owner = "client!gt", name = "Z", descriptor = "I")
	public int anInt2651 = -1;

	@OriginalMember(owner = "client!gt", name = "A", descriptor = "I")
	public int anInt2630 = 0;

	@OriginalMember(owner = "client!gt", name = "k", descriptor = "I")
	public int anInt2616 = -1;

	@OriginalMember(owner = "client!gt", name = "U", descriptor = "I")
	public int anInt2647 = -1;

	@OriginalMember(owner = "client!gt", name = "Q", descriptor = "I")
	public int anInt2643 = -1;

	@OriginalMember(owner = "client!gt", name = "fb", descriptor = "I")
	public int anInt2653 = 0;

	@OriginalMember(owner = "client!gt", name = "gb", descriptor = "I")
	public int anInt2654 = -1;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!hw;)V")
	public void method2202(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method6138();
			if (local16 == 0) {
				return;
			}
			this.method2209(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BI)Z")
	public boolean method2203(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt2646) {
			return true;
		} else {
			if (this.anIntArray225 != null) {
				for (@Pc(25) int local25 = 0; local25 < this.anIntArray225.length; local25++) {
					if (arg0 == this.anIntArray225[local25]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(B)I")
	public int method2207() {
		if (this.anInt2646 != -1) {
			return this.anInt2646;
		} else if (this.anIntArray225 == null) {
			return -1;
		} else {
			@Pc(21) int local21 = (int) (Math.random() * (double) this.anInt2633);
			@Pc(23) int local23;
			for (local23 = 0; this.anIntArray224[local23] <= local21; local23++) {
				local21 -= this.anIntArray224[local23];
			}
			return this.anIntArray225[local23];
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!hw;II)V")
	private void method2209(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2646 = arg0.method6148();
			this.anInt2645 = arg0.method6148();
			if (this.anInt2645 == 65535) {
				this.anInt2645 = -1;
			}
			if (this.anInt2646 == 65535) {
				this.anInt2646 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt2608 = arg0.method6148();
		} else if (arg1 == 3) {
			this.anInt2619 = arg0.method6148();
		} else if (arg1 == 4) {
			this.anInt2654 = arg0.method6148();
		} else if (arg1 == 5) {
			this.anInt2651 = arg0.method6148();
		} else if (arg1 == 6) {
			this.anInt2614 = arg0.method6148();
		} else if (arg1 == 7) {
			this.anInt2629 = arg0.method6148();
		} else if (arg1 == 8) {
			this.anInt2643 = arg0.method6148();
		} else if (arg1 == 9) {
			this.anInt2627 = arg0.method6148();
		} else if (arg1 == 26) {
			this.anInt2653 = (short) (arg0.method6138() * 4);
			this.anInt2609 = (short) (arg0.method6138() * 4);
		} else {
			@Pc(288) int local288;
			@Pc(298) int local298;
			if (arg1 == 27) {
				if (this.anIntArrayArray58 == null) {
					this.anIntArrayArray58 = new int[12][];
				}
				local288 = arg0.method6138();
				this.anIntArrayArray58[local288] = new int[6];
				for (local298 = 0; local298 < 6; local298++) {
					this.anIntArrayArray58[local288][local298] = arg0.method6149();
				}
			} else if (arg1 == 28) {
				this.anIntArray223 = new int[12];
				for (local288 = 0; local288 < 12; local288++) {
					this.anIntArray223[local288] = arg0.method6138();
					if (this.anIntArray223[local288] == 255) {
						this.anIntArray223[local288] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt2636 = arg0.method6138();
			} else if (arg1 == 30) {
				this.anInt2625 = arg0.method6148();
			} else if (arg1 == 31) {
				this.anInt2618 = arg0.method6138();
			} else if (arg1 == 32) {
				this.anInt2630 = arg0.method6148();
			} else if (arg1 == 33) {
				this.anInt2617 = arg0.method6149();
			} else if (arg1 == 34) {
				this.anInt2623 = arg0.method6138();
			} else if (arg1 == 35) {
				this.anInt2626 = arg0.method6148();
			} else if (arg1 == 36) {
				this.anInt2634 = arg0.method6149();
			} else if (arg1 == 37) {
				this.anInt2613 = arg0.method6138();
			} else if (arg1 == 38) {
				this.anInt2622 = arg0.method6148();
			} else if (arg1 == 39) {
				this.anInt2649 = arg0.method6148();
			} else if (arg1 == 40) {
				this.anInt2616 = arg0.method6148();
			} else if (arg1 == 41) {
				this.anInt2610 = arg0.method6148();
			} else if (arg1 == 42) {
				this.anInt2642 = arg0.method6148();
			} else if (arg1 == 43) {
				this.anInt2648 = arg0.method6148();
			} else if (arg1 == 44) {
				this.anInt2628 = arg0.method6148();
			} else if (arg1 == 45) {
				this.anInt2639 = arg0.method6148();
			} else if (arg1 == 46) {
				this.anInt2621 = arg0.method6148();
			} else if (arg1 == 47) {
				this.anInt2612 = arg0.method6148();
			} else if (arg1 == 48) {
				this.anInt2631 = arg0.method6148();
			} else if (arg1 == 49) {
				this.anInt2611 = arg0.method6148();
			} else if (arg1 == 50) {
				this.anInt2647 = arg0.method6148();
			} else if (arg1 == 51) {
				this.anInt2615 = arg0.method6148();
			} else if (arg1 == 52) {
				local288 = arg0.method6138();
				this.anIntArray224 = new int[local288];
				this.anIntArray225 = new int[local288];
				for (local298 = 0; local298 < local288; local298++) {
					this.anIntArray225[local298] = arg0.method6148();
					@Pc(310) int local310 = arg0.method6138();
					this.anIntArray224[local298] = local310;
					this.anInt2633 += local310;
				}
			} else if (arg1 == 53) {
				this.aBoolean167 = false;
			} else if (arg1 == 54) {
				this.anInt2644 = arg0.method6138() << 6;
				this.anInt2640 = arg0.method6138() << 6;
			}
		}
	}
}
