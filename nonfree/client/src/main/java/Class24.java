import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class24 {

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "[[I")
	public int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!bf", name = "X", descriptor = "[I")
	public int[] anIntArray49;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
	public int anInt649 = 0;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
	public int anInt647 = 0;

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
	public int anInt663 = -1;

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
	public int anInt656 = -1;

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
	public int anInt666 = 0;

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
	public int anInt648 = -1;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
	public int anInt650 = -1;

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "[I")
	public int[] anIntArray48 = null;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
	public int anInt651 = -1;

	@OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
	public int anInt675 = -1;

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
	public int anInt664 = 0;

	@OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
	public int anInt671 = -1;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
	public int anInt654 = 0;

	@OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
	public int anInt672 = -1;

	@OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
	public int anInt674 = 0;

	@OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
	public int anInt678 = -1;

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
	public int anInt667 = -1;

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
	public int anInt657 = 0;

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
	public int anInt660 = -1;

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
	public int anInt659 = -1;

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
	public int anInt668 = 0;

	@OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
	public int anInt676 = 0;

	@OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
	public int anInt677 = 0;

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
	public int anInt655 = -1;

	@OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
	public int anInt685 = -1;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
	public int anInt653 = -1;

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
	public int anInt661 = -1;

	@OriginalMember(owner = "client!bf", name = "M", descriptor = "I")
	public int anInt681 = -1;

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
	public int anInt665 = -1;

	@OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
	public int anInt682 = -1;

	@OriginalMember(owner = "client!bf", name = "W", descriptor = "I")
	public int anInt689 = -1;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "[I")
	public int[] anIntArray47 = null;

	@OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
	public int anInt687 = -1;

	@OriginalMember(owner = "client!bf", name = "V", descriptor = "I")
	private int anInt688 = 0;

	@OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
	public int anInt680 = -1;

	@OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
	public int anInt679 = -1;

	@OriginalMember(owner = "client!bf", name = "T", descriptor = "I")
	public int anInt686 = -1;

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
	public int anInt658 = -1;

	@OriginalMember(owner = "client!bf", name = "S", descriptor = "Z")
	public boolean aBoolean44 = true;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
	public int anInt646 = 0;

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
	public int anInt670 = 0;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)I")
	public int method709() {
		if (this.anInt675 != -1) {
			return this.anInt675;
		} else if (this.anIntArray47 == null) {
			return -1;
		} else {
			@Pc(28) int local28 = (int) (Math.random() * (double) this.anInt688);
			@Pc(30) int local30;
			for (local30 = 0; local28 >= this.anIntArray48[local30]; local30++) {
				local28 -= this.anIntArray48[local30];
			}
			return this.anIntArray47[local30];
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)Z")
	public boolean method710(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt675) {
			return true;
		} else {
			if (this.anIntArray47 != null) {
				for (@Pc(33) int local33 = 0; local33 < this.anIntArray47.length; local33++) {
					if (arg0 == this.anIntArray47[local33]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!ps;I)V")
	public void method711(@OriginalArg(0) Class2_Sub29 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5170();
			if (local11 == 0) {
				return;
			}
			this.method714(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!ps;II)V")
	private void method714(@OriginalArg(0) Class2_Sub29 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt675 = arg0.method5229();
			this.anInt687 = arg0.method5229();
			if (this.anInt687 == 65535) {
				this.anInt687 = -1;
			}
			if (this.anInt675 == 65535) {
				this.anInt675 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt665 = arg0.method5229();
		} else if (arg1 == 3) {
			this.anInt659 = arg0.method5229();
		} else if (arg1 == 4) {
			this.anInt661 = arg0.method5229();
		} else if (arg1 == 5) {
			this.anInt653 = arg0.method5229();
		} else if (arg1 == 6) {
			this.anInt667 = arg0.method5229();
		} else if (arg1 == 7) {
			this.anInt685 = arg0.method5229();
		} else if (arg1 == 8) {
			this.anInt656 = arg0.method5229();
		} else if (arg1 == 9) {
			this.anInt686 = arg0.method5229();
		} else if (arg1 == 26) {
			this.anInt649 = (short) (arg0.method5170() * 4);
			this.anInt670 = (short) (arg0.method5170() * 4);
		} else {
			@Pc(105) int local105;
			@Pc(357) int local357;
			if (arg1 == 27) {
				if (this.anIntArrayArray4 == null) {
					this.anIntArrayArray4 = new int[12][];
				}
				local105 = arg0.method5170();
				this.anIntArrayArray4[local105] = new int[6];
				for (local357 = 0; local357 < 6; local357++) {
					this.anIntArrayArray4[local105][local357] = arg0.method5231();
				}
			} else if (arg1 == 28) {
				this.anIntArray49 = new int[12];
				for (local105 = 0; local105 < 12; local105++) {
					this.anIntArray49[local105] = arg0.method5170();
					if (this.anIntArray49[local105] == 255) {
						this.anIntArray49[local105] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt646 = arg0.method5170();
			} else if (arg1 == 30) {
				this.anInt664 = arg0.method5229();
			} else if (arg1 == 31) {
				this.anInt668 = arg0.method5170();
			} else if (arg1 == 32) {
				this.anInt676 = arg0.method5229();
			} else if (arg1 == 33) {
				this.anInt647 = arg0.method5231();
			} else if (arg1 == 34) {
				this.anInt666 = arg0.method5170();
			} else if (arg1 == 35) {
				this.anInt677 = arg0.method5229();
			} else if (arg1 == 36) {
				this.anInt654 = arg0.method5231();
			} else if (arg1 == 37) {
				this.anInt655 = arg0.method5170();
			} else if (arg1 == 38) {
				this.anInt660 = arg0.method5229();
			} else if (arg1 == 39) {
				this.anInt679 = arg0.method5229();
			} else if (arg1 == 40) {
				this.anInt680 = arg0.method5229();
			} else if (arg1 == 41) {
				this.anInt648 = arg0.method5229();
			} else if (arg1 == 42) {
				this.anInt678 = arg0.method5229();
			} else if (arg1 == 43) {
				this.anInt681 = arg0.method5229();
			} else if (arg1 == 44) {
				this.anInt658 = arg0.method5229();
			} else if (arg1 == 45) {
				this.anInt651 = arg0.method5229();
			} else if (arg1 == 46) {
				this.anInt671 = arg0.method5229();
			} else if (arg1 == 47) {
				this.anInt672 = arg0.method5229();
			} else if (arg1 == 48) {
				this.anInt682 = arg0.method5229();
			} else if (arg1 == 49) {
				this.anInt689 = arg0.method5229();
			} else if (arg1 == 50) {
				this.anInt663 = arg0.method5229();
			} else if (arg1 == 51) {
				this.anInt650 = arg0.method5229();
			} else if (arg1 == 52) {
				local105 = arg0.method5170();
				this.anIntArray48 = new int[local105];
				this.anIntArray47 = new int[local105];
				for (local357 = 0; local357 < local105; local357++) {
					this.anIntArray47[local357] = arg0.method5229();
					@Pc(370) int local370 = arg0.method5170();
					this.anIntArray48[local357] = local370;
					this.anInt688 += local370;
				}
			} else if (arg1 == 53) {
				this.aBoolean44 = false;
			} else if (arg1 == 54) {
				this.anInt657 = arg0.method5170() << 6;
				this.anInt674 = arg0.method5170() << 6;
			}
		}
	}
}
