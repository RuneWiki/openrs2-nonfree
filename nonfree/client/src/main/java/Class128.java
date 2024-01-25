import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class128 {

	@OriginalMember(owner = "client!lk", name = "G", descriptor = "[[I")
	public int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!lk", name = "P", descriptor = "[I")
	public int[] anIntArray324;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
	public int anInt3716 = -1;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
	private int anInt3717 = 0;

	@OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
	public int anInt3731 = -1;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
	public int anInt3718 = -1;

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "[I")
	public int[] anIntArray323 = null;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
	public int anInt3719 = -1;

	@OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
	public int anInt3729 = -1;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
	public int anInt3725 = -1;

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
	public int anInt3721 = 0;

	@OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
	public int anInt3743 = -1;

	@OriginalMember(owner = "client!lk", name = "B", descriptor = "I")
	public int anInt3739 = -1;

	@OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
	public int anInt3733 = -1;

	@OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
	public int anInt3734 = 0;

	@OriginalMember(owner = "client!lk", name = "y", descriptor = "I")
	public int anInt3738 = 0;

	@OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
	public int anInt3727 = -1;

	@OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
	public int anInt3737 = -1;

	@OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
	public int anInt3724 = -1;

	@OriginalMember(owner = "client!lk", name = "J", descriptor = "I")
	public int anInt3746 = 0;

	@OriginalMember(owner = "client!lk", name = "I", descriptor = "I")
	public int anInt3745 = -1;

	@OriginalMember(owner = "client!lk", name = "M", descriptor = "I")
	public int anInt3749 = -1;

	@OriginalMember(owner = "client!lk", name = "Q", descriptor = "I")
	public int anInt3751 = -1;

	@OriginalMember(owner = "client!lk", name = "N", descriptor = "Z")
	public boolean aBoolean238 = true;

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
	public int anInt3732 = -1;

	@OriginalMember(owner = "client!lk", name = "O", descriptor = "I")
	public int anInt3750 = 0;

	@OriginalMember(owner = "client!lk", name = "R", descriptor = "I")
	public int anInt3752 = -1;

	@OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
	public int anInt3735 = -1;

	@OriginalMember(owner = "client!lk", name = "U", descriptor = "I")
	public int anInt3754 = -1;

	@OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
	public int anInt3741 = -1;

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
	public int anInt3726 = 0;

	@OriginalMember(owner = "client!lk", name = "Z", descriptor = "I")
	public int anInt3758 = -1;

	@OriginalMember(owner = "client!lk", name = "V", descriptor = "I")
	public int anInt3755 = 0;

	@OriginalMember(owner = "client!lk", name = "cb", descriptor = "[I")
	public int[] anIntArray326 = null;

	@OriginalMember(owner = "client!lk", name = "ab", descriptor = "I")
	public int anInt3759 = 0;

	@OriginalMember(owner = "client!lk", name = "bb", descriptor = "I")
	public int anInt3760 = -1;

	@OriginalMember(owner = "client!lk", name = "T", descriptor = "I")
	public int anInt3753 = 0;

	@OriginalMember(owner = "client!lk", name = "W", descriptor = "I")
	public int anInt3756 = 0;

	@OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
	public int anInt3736 = -1;

	@OriginalMember(owner = "client!lk", name = "db", descriptor = "I")
	public int anInt3761 = -1;

	static {
		new Class178(64);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
	public void method3499() {
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLclient!jg;)V")
	public void method3501(@OriginalArg(1) Class14_Sub4 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2548();
			if (local9 == 0) {
				return;
			}
			this.method3503(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!jg;B)V")
	private void method3503(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt3724 = arg1.method2498();
			this.anInt3758 = arg1.method2498();
			if (this.anInt3758 == 65535) {
				this.anInt3758 = -1;
			}
			if (this.anInt3724 == 65535) {
				this.anInt3724 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt3754 = arg1.method2498();
		} else if (arg0 == 3) {
			this.anInt3718 = arg1.method2498();
		} else if (arg0 == 4) {
			this.anInt3741 = arg1.method2498();
		} else if (arg0 == 5) {
			this.anInt3749 = arg1.method2498();
		} else if (arg0 == 6) {
			this.anInt3760 = arg1.method2498();
		} else if (arg0 == 7) {
			this.anInt3725 = arg1.method2498();
		} else if (arg0 == 8) {
			this.anInt3743 = arg1.method2498();
		} else if (arg0 == 9) {
			this.anInt3733 = arg1.method2498();
		} else if (arg0 == 26) {
			this.anInt3746 = (short) (arg1.method2548() * 4);
			this.anInt3734 = (short) (arg1.method2548() * 4);
		} else {
			@Pc(104) int local104;
			@Pc(333) int local333;
			if (arg0 == 27) {
				if (this.anIntArrayArray57 == null) {
					this.anIntArrayArray57 = new int[12][];
				}
				local104 = arg1.method2548();
				this.anIntArrayArray57[local104] = new int[6];
				for (local333 = 0; local333 < 6; local333++) {
					this.anIntArrayArray57[local104][local333] = arg1.method2502();
				}
			} else if (arg0 == 28) {
				this.anIntArray324 = new int[12];
				for (local104 = 0; local104 < 12; local104++) {
					this.anIntArray324[local104] = arg1.method2548();
					if (this.anIntArray324[local104] == 255) {
						this.anIntArray324[local104] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt3726 = arg1.method2548();
			} else if (arg0 == 30) {
				this.anInt3753 = arg1.method2498();
			} else if (arg0 == 31) {
				this.anInt3738 = arg1.method2548();
			} else if (arg0 == 32) {
				this.anInt3755 = arg1.method2498();
			} else if (arg0 == 33) {
				this.anInt3756 = arg1.method2502();
			} else if (arg0 == 34) {
				this.anInt3721 = arg1.method2548();
			} else if (arg0 == 35) {
				this.anInt3750 = arg1.method2498();
			} else if (arg0 == 36) {
				this.anInt3759 = arg1.method2502();
			} else if (arg0 == 37) {
				this.anInt3739 = arg1.method2548();
			} else if (arg0 == 38) {
				this.anInt3736 = arg1.method2498();
			} else if (arg0 == 39) {
				this.anInt3716 = arg1.method2498();
			} else if (arg0 == 40) {
				this.anInt3745 = arg1.method2498();
			} else if (arg0 == 41) {
				this.anInt3731 = arg1.method2498();
			} else if (arg0 == 42) {
				this.anInt3737 = arg1.method2498();
			} else if (arg0 == 43) {
				arg1.method2498();
			} else if (arg0 == 44) {
				this.anInt3752 = arg1.method2498();
			} else if (arg0 == 45) {
				this.anInt3761 = arg1.method2498();
			} else if (arg0 == 46) {
				this.anInt3735 = arg1.method2498();
			} else if (arg0 == 47) {
				this.anInt3729 = arg1.method2498();
			} else if (arg0 == 48) {
				this.anInt3751 = arg1.method2498();
			} else if (arg0 == 49) {
				this.anInt3719 = arg1.method2498();
			} else if (arg0 == 50) {
				this.anInt3732 = arg1.method2498();
			} else if (arg0 == 51) {
				this.anInt3727 = arg1.method2498();
			} else if (arg0 == 52) {
				local104 = arg1.method2548();
				this.anIntArray323 = new int[local104];
				this.anIntArray326 = new int[local104];
				for (local333 = 0; local333 < local104; local333++) {
					this.anIntArray326[local333] = arg1.method2498();
					@Pc(346) int local346 = arg1.method2548();
					this.anIntArray323[local333] = local346;
					this.anInt3717 += local346;
				}
			} else if (arg0 == 53) {
				this.aBoolean238 = false;
			}
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)Z")
	public boolean method3504(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt3724 == arg0) {
			return true;
		} else {
			if (this.anIntArray326 != null) {
				for (@Pc(23) int local23 = 0; local23 < this.anIntArray326.length; local23++) {
					if (this.anIntArray326[local23] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)I")
	public int method3508() {
		if (this.anInt3724 != -1) {
			return this.anInt3724;
		} else if (this.anIntArray326 == null) {
			return -1;
		} else {
			@Pc(26) int local26 = (int) ((double) this.anInt3717 * Math.random());
			@Pc(28) int local28;
			for (local28 = 0; local26 >= this.anIntArray323[local28]; local28++) {
				local26 -= this.anIntArray323[local28];
			}
			return this.anIntArray326[local28];
		}
	}
}
