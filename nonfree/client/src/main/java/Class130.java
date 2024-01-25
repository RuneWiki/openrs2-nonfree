import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class130 {

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "[[I")
	public int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!gu", name = "i", descriptor = "[I")
	public int[] anIntArray367;

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
	public int anInt3783 = -1;

	@OriginalMember(owner = "client!gu", name = "p", descriptor = "I")
	private int anInt3793 = 0;

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
	public int anInt3788 = 0;

	@OriginalMember(owner = "client!gu", name = "u", descriptor = "I")
	public int anInt3798 = -1;

	@OriginalMember(owner = "client!gu", name = "q", descriptor = "I")
	public int anInt3794 = 0;

	@OriginalMember(owner = "client!gu", name = "t", descriptor = "I")
	public int anInt3797 = -1;

	@OriginalMember(owner = "client!gu", name = "s", descriptor = "I")
	public int anInt3796 = 0;

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
	public int anInt3792 = 0;

	@OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
	public int anInt3789 = -1;

	@OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
	public int anInt3791 = 0;

	@OriginalMember(owner = "client!gu", name = "v", descriptor = "[I")
	public int[] anIntArray368 = null;

	@OriginalMember(owner = "client!gu", name = "C", descriptor = "I")
	public int anInt3804 = -1;

	@OriginalMember(owner = "client!gu", name = "F", descriptor = "I")
	public int anInt3807 = 0;

	@OriginalMember(owner = "client!gu", name = "w", descriptor = "I")
	public int anInt3799 = 0;

	@OriginalMember(owner = "client!gu", name = "M", descriptor = "I")
	public int anInt3813 = -1;

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
	public int anInt3784 = 0;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
	public int anInt3782 = -1;

	@OriginalMember(owner = "client!gu", name = "N", descriptor = "I")
	public int anInt3814 = -1;

	@OriginalMember(owner = "client!gu", name = "x", descriptor = "I")
	public int anInt3800 = 0;

	@OriginalMember(owner = "client!gu", name = "D", descriptor = "I")
	public int anInt3805 = -1;

	@OriginalMember(owner = "client!gu", name = "I", descriptor = "I")
	public int anInt3810 = -1;

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "I")
	public int anInt3787 = 0;

	@OriginalMember(owner = "client!gu", name = "O", descriptor = "I")
	public int anInt3815 = -1;

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
	public int anInt3786 = -1;

	@OriginalMember(owner = "client!gu", name = "y", descriptor = "I")
	public int anInt3801 = -1;

	@OriginalMember(owner = "client!gu", name = "H", descriptor = "I")
	public int anInt3809 = -1;

	@OriginalMember(owner = "client!gu", name = "B", descriptor = "I")
	public int anInt3803 = -1;

	@OriginalMember(owner = "client!gu", name = "E", descriptor = "I")
	public int anInt3806 = -1;

	@OriginalMember(owner = "client!gu", name = "L", descriptor = "[I")
	public int[] anIntArray369 = null;

	@OriginalMember(owner = "client!gu", name = "S", descriptor = "I")
	public int anInt3819 = 0;

	@OriginalMember(owner = "client!gu", name = "r", descriptor = "I")
	public int anInt3795 = -1;

	@OriginalMember(owner = "client!gu", name = "G", descriptor = "I")
	public int anInt3808 = -1;

	@OriginalMember(owner = "client!gu", name = "W", descriptor = "I")
	public int anInt3822 = -1;

	@OriginalMember(owner = "client!gu", name = "K", descriptor = "I")
	public int anInt3812 = -1;

	@OriginalMember(owner = "client!gu", name = "T", descriptor = "I")
	public int anInt3820 = -1;

	@OriginalMember(owner = "client!gu", name = "R", descriptor = "I")
	public int anInt3818 = -1;

	@OriginalMember(owner = "client!gu", name = "Q", descriptor = "I")
	public int anInt3817 = -1;

	@OriginalMember(owner = "client!gu", name = "U", descriptor = "I")
	public int anInt3821 = -1;

	@OriginalMember(owner = "client!gu", name = "Y", descriptor = "I")
	public int anInt3824 = -1;

	@OriginalMember(owner = "client!gu", name = "V", descriptor = "Z")
	public boolean aBoolean297 = true;

	@OriginalMember(owner = "client!gu", name = "X", descriptor = "I")
	public int anInt3823 = 0;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!eh;)V")
	public void method3355(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6015();
			if (local9 == 0) {
				return;
			}
			this.method3358(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)I")
	public int method3356() {
		if (this.anInt3818 != -1) {
			return this.anInt3818;
		} else if (this.anIntArray369 == null) {
			return -1;
		} else {
			@Pc(31) int local31 = (int) (Math.random() * (double) this.anInt3793);
			@Pc(33) int local33;
			for (local33 = 0; this.anIntArray368[local33] <= local31; local33++) {
				local31 -= this.anIntArray368[local33];
			}
			return this.anIntArray369[local33];
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)Z")
	public boolean method3357(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt3818) {
			return true;
		} else {
			if (this.anIntArray369 != null) {
				for (@Pc(30) int local30 = 0; local30 < this.anIntArray369.length; local30++) {
					if (arg0 == this.anIntArray369[local30]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!eh;B)V")
	private void method3358(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt3818 = arg1.method5982();
			this.anInt3822 = arg1.method5982();
			if (this.anInt3818 == 65535) {
				this.anInt3818 = -1;
			}
			if (this.anInt3822 == 65535) {
				this.anInt3822 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt3797 = arg1.method5982();
		} else if (arg0 == 3) {
			this.anInt3795 = arg1.method5982();
		} else if (arg0 == 4) {
			this.anInt3803 = arg1.method5982();
		} else if (arg0 == 5) {
			this.anInt3798 = arg1.method5982();
		} else if (arg0 == 6) {
			this.anInt3824 = arg1.method5982();
		} else if (arg0 == 7) {
			this.anInt3782 = arg1.method5982();
		} else if (arg0 == 8) {
			this.anInt3789 = arg1.method5982();
		} else if (arg0 == 9) {
			this.anInt3813 = arg1.method5982();
		} else if (arg0 == 26) {
			this.anInt3823 = (short) (arg1.method6015() * 4);
			this.anInt3787 = (short) (arg1.method6015() * 4);
		} else {
			@Pc(138) int local138;
			@Pc(146) int local146;
			if (arg0 == 27) {
				if (this.anIntArrayArray47 == null) {
					this.anIntArrayArray47 = new int[12][];
				}
				local138 = arg1.method6015();
				this.anIntArrayArray47[local138] = new int[6];
				for (local146 = 0; local146 < 6; local146++) {
					this.anIntArrayArray47[local138][local146] = arg1.method6003();
				}
			} else if (arg0 == 28) {
				this.anIntArray367 = new int[12];
				for (local138 = 0; local138 < 12; local138++) {
					this.anIntArray367[local138] = arg1.method6015();
					if (this.anIntArray367[local138] == 255) {
						this.anIntArray367[local138] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt3788 = arg1.method6015();
			} else if (arg0 == 30) {
				this.anInt3794 = arg1.method5982();
			} else if (arg0 == 31) {
				this.anInt3819 = arg1.method6015();
			} else if (arg0 == 32) {
				this.anInt3792 = arg1.method5982();
			} else if (arg0 == 33) {
				this.anInt3784 = arg1.method6003();
			} else if (arg0 == 34) {
				this.anInt3799 = arg1.method6015();
			} else if (arg0 == 35) {
				this.anInt3791 = arg1.method5982();
			} else if (arg0 == 36) {
				this.anInt3796 = arg1.method6003();
			} else if (arg0 == 37) {
				this.anInt3809 = arg1.method6015();
			} else if (arg0 == 38) {
				this.anInt3786 = arg1.method5982();
			} else if (arg0 == 39) {
				this.anInt3810 = arg1.method5982();
			} else if (arg0 == 40) {
				this.anInt3806 = arg1.method5982();
			} else if (arg0 == 41) {
				this.anInt3815 = arg1.method5982();
			} else if (arg0 == 42) {
				this.anInt3820 = arg1.method5982();
			} else if (arg0 == 43) {
				this.anInt3821 = arg1.method5982();
			} else if (arg0 == 44) {
				this.anInt3808 = arg1.method5982();
			} else if (arg0 == 45) {
				this.anInt3812 = arg1.method5982();
			} else if (arg0 == 46) {
				this.anInt3814 = arg1.method5982();
			} else if (arg0 == 47) {
				this.anInt3801 = arg1.method5982();
			} else if (arg0 == 48) {
				this.anInt3805 = arg1.method5982();
			} else if (arg0 == 49) {
				this.anInt3804 = arg1.method5982();
			} else if (arg0 == 50) {
				this.anInt3817 = arg1.method5982();
			} else if (arg0 == 51) {
				this.anInt3783 = arg1.method5982();
			} else if (arg0 == 52) {
				local138 = arg1.method6015();
				this.anIntArray368 = new int[local138];
				this.anIntArray369 = new int[local138];
				for (local146 = 0; local146 < local138; local146++) {
					this.anIntArray369[local146] = arg1.method5982();
					@Pc(405) int local405 = arg1.method6015();
					this.anIntArray368[local146] = local405;
					this.anInt3793 += local405;
				}
			} else if (arg0 == 53) {
				this.aBoolean297 = false;
			} else if (arg0 == 54) {
				this.anInt3800 = arg1.method6015() << 6;
				this.anInt3807 = arg1.method6015() << 6;
			}
		}
	}
}
