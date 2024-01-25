import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class123 {

	@OriginalMember(owner = "client!lf", name = "N", descriptor = "[I")
	public int[] anIntArray334;

	@OriginalMember(owner = "client!lf", name = "db", descriptor = "[[I")
	public int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
	public int anInt3659 = -1;

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
	public int anInt3660 = 0;

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
	public int anInt3670 = -1;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
	public int anInt3656 = -1;

	@OriginalMember(owner = "client!lf", name = "w", descriptor = "[I")
	public int[] anIntArray332 = null;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
	public int anInt3658 = -1;

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "Z")
	public boolean aBoolean343 = true;

	@OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
	public int anInt3676 = 0;

	@OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
	public int anInt3675 = -1;

	@OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
	public int anInt3679 = -1;

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
	public int anInt3665 = -1;

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "[I")
	public int[] anIntArray331 = null;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
	public int anInt3661 = 0;

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
	public int anInt3668 = -1;

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
	public int anInt3667 = -1;

	@OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
	public int anInt3692 = 0;

	@OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
	public int anInt3669 = -1;

	@OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
	public int anInt3673 = 0;

	@OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
	public int anInt3671 = 0;

	@OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
	public int anInt3678 = -1;

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
	public int anInt3664 = 0;

	@OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
	private int anInt3687 = 0;

	@OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
	public int anInt3693 = -1;

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
	public int anInt3663 = -1;

	@OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
	public int anInt3672 = -1;

	@OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
	public int anInt3686 = -1;

	@OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
	public int anInt3690 = -1;

	@OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
	public int anInt3683 = -1;

	@OriginalMember(owner = "client!lf", name = "bb", descriptor = "I")
	public int anInt3698 = -1;

	@OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
	public int anInt3694 = -1;

	@OriginalMember(owner = "client!lf", name = "cb", descriptor = "I")
	public int anInt3699 = -1;

	@OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
	public int anInt3681 = -1;

	@OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
	public int anInt3682 = -1;

	@OriginalMember(owner = "client!lf", name = "Z", descriptor = "I")
	public int anInt3696 = 0;

	@OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
	public int anInt3685 = -1;

	@OriginalMember(owner = "client!lf", name = "ab", descriptor = "I")
	public int anInt3697 = 0;

	@OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
	public int anInt3684 = 0;

	@OriginalMember(owner = "client!lf", name = "eb", descriptor = "I")
	public int anInt3700 = -1;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!bg;)V")
	public void method3391(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4532();
			if (local5 == 0) {
				return;
			}
			this.method3394(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
	public void method3392() {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)Z")
	public boolean method3393(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt3668 == arg0) {
			return true;
		} else {
			if (this.anIntArray332 != null) {
				for (@Pc(21) int local21 = 0; local21 < this.anIntArray332.length; local21++) {
					if (this.anIntArray332[local21] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!bg;BI)V")
	private void method3394(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3668 = arg0.method4556();
			this.anInt3659 = arg0.method4556();
			if (this.anInt3668 == 65535) {
				this.anInt3668 = -1;
			}
			if (this.anInt3659 == 65535) {
				this.anInt3659 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt3693 = arg0.method4556();
		} else if (arg1 == 3) {
			this.anInt3672 = arg0.method4556();
		} else if (arg1 == 4) {
			this.anInt3685 = arg0.method4556();
		} else if (arg1 == 5) {
			this.anInt3667 = arg0.method4556();
		} else if (arg1 == 6) {
			this.anInt3700 = arg0.method4556();
		} else if (arg1 == 7) {
			this.anInt3686 = arg0.method4556();
		} else if (arg1 == 8) {
			this.anInt3698 = arg0.method4556();
		} else if (arg1 == 9) {
			this.anInt3683 = arg0.method4556();
		} else if (arg1 == 26) {
			this.anInt3697 = (short) (arg0.method4532() * 4);
			this.anInt3660 = (short) (arg0.method4532() * 4);
		} else {
			@Pc(90) int local90;
			@Pc(284) int local284;
			if (arg1 == 27) {
				if (this.anIntArrayArray43 == null) {
					this.anIntArrayArray43 = new int[12][];
				}
				local90 = arg0.method4532();
				this.anIntArrayArray43[local90] = new int[6];
				for (local284 = 0; local284 < 6; local284++) {
					this.anIntArrayArray43[local90][local284] = arg0.method4551();
				}
			} else if (arg1 == 28) {
				this.anIntArray334 = new int[12];
				for (local90 = 0; local90 < 12; local90++) {
					this.anIntArray334[local90] = arg0.method4532();
					if (this.anIntArray334[local90] == 255) {
						this.anIntArray334[local90] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt3692 = arg0.method4532();
			} else if (arg1 == 30) {
				this.anInt3661 = arg0.method4556();
			} else if (arg1 == 31) {
				this.anInt3671 = arg0.method4532();
			} else if (arg1 == 32) {
				this.anInt3684 = arg0.method4556();
			} else if (arg1 == 33) {
				this.anInt3673 = arg0.method4551();
			} else if (arg1 == 34) {
				this.anInt3676 = arg0.method4532();
			} else if (arg1 == 35) {
				this.anInt3664 = arg0.method4556();
			} else if (arg1 == 36) {
				this.anInt3696 = arg0.method4551();
			} else if (arg1 == 37) {
				this.anInt3669 = arg0.method4532();
			} else if (arg1 == 38) {
				this.anInt3694 = arg0.method4556();
			} else if (arg1 == 39) {
				this.anInt3670 = arg0.method4556();
			} else if (arg1 == 40) {
				this.anInt3663 = arg0.method4556();
			} else if (arg1 == 41) {
				this.anInt3699 = arg0.method4556();
			} else if (arg1 == 42) {
				this.anInt3681 = arg0.method4556();
			} else if (arg1 == 43) {
				arg0.method4556();
			} else if (arg1 == 44) {
				this.anInt3690 = arg0.method4556();
			} else if (arg1 == 45) {
				this.anInt3658 = arg0.method4556();
			} else if (arg1 == 46) {
				this.anInt3656 = arg0.method4556();
			} else if (arg1 == 47) {
				this.anInt3675 = arg0.method4556();
			} else if (arg1 == 48) {
				this.anInt3679 = arg0.method4556();
			} else if (arg1 == 49) {
				this.anInt3678 = arg0.method4556();
			} else if (arg1 == 50) {
				this.anInt3665 = arg0.method4556();
			} else if (arg1 == 51) {
				this.anInt3682 = arg0.method4556();
			} else if (arg1 == 52) {
				local90 = arg0.method4532();
				this.anIntArray332 = new int[local90];
				this.anIntArray331 = new int[local90];
				for (local284 = 0; local284 < local90; local284++) {
					this.anIntArray332[local284] = arg0.method4556();
					@Pc(299) int local299 = arg0.method4532();
					this.anIntArray331[local284] = local299;
					this.anInt3687 += local299;
				}
			} else if (arg1 == 53) {
				this.aBoolean343 = false;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)I")
	public int method3397() {
		if (this.anInt3668 != -1) {
			return this.anInt3668;
		} else if (this.anIntArray332 == null) {
			return -1;
		} else {
			@Pc(28) int local28 = (int) ((double) this.anInt3687 * Math.random());
			@Pc(30) int local30;
			for (local30 = 0; this.anIntArray331[local30] <= local28; local30++) {
				local28 -= this.anIntArray331[local30];
			}
			return this.anIntArray332[local30];
		}
	}
}
