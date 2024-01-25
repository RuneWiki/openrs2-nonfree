import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class140 {

	@OriginalMember(owner = "client!hk", name = "r", descriptor = "[I")
	public int[] anIntArray311;

	@OriginalMember(owner = "client!hk", name = "K", descriptor = "[[I")
	public int[][] anIntArrayArray87;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
	public int anInt3593 = -1;

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
	private int anInt3594 = 0;

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
	public int anInt3599 = 0;

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
	public int anInt3598 = -1;

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
	public int anInt3605 = -1;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
	public int anInt3600 = -1;

	@OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
	public int anInt3610 = -1;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
	public int anInt3601 = -1;

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
	public int anInt3604 = -1;

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
	public int anInt3597 = -1;

	@OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
	public int anInt3615 = -1;

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
	public int anInt3607 = 0;

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
	public int anInt3608 = 0;

	@OriginalMember(owner = "client!hk", name = "E", descriptor = "I")
	public int anInt3620 = -1;

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
	public int anInt3612 = -1;

	@OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
	public int anInt3613 = -1;

	@OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
	public int anInt3624 = 0;

	@OriginalMember(owner = "client!hk", name = "F", descriptor = "I")
	public int anInt3621 = -1;

	@OriginalMember(owner = "client!hk", name = "I", descriptor = "[I")
	public int[] anIntArray313 = null;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
	public int anInt3602 = -1;

	@OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
	public int anInt3627 = 0;

	@OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
	public int anInt3618 = 0;

	@OriginalMember(owner = "client!hk", name = "L", descriptor = "I")
	public int anInt3625 = -1;

	@OriginalMember(owner = "client!hk", name = "P", descriptor = "[I")
	public int[] anIntArray314 = null;

	@OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
	public int anInt3616 = -1;

	@OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
	public int anInt3629 = -1;

	@OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
	public int anInt3622 = -1;

	@OriginalMember(owner = "client!hk", name = "S", descriptor = "I")
	public int anInt3630 = 0;

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
	public int anInt3609 = 0;

	@OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
	public int anInt3626 = -1;

	@OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
	public int anInt3611 = 0;

	@OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
	public int anInt3628 = -1;

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
	public int anInt3596 = -1;

	@OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
	public int anInt3623 = 0;

	@OriginalMember(owner = "client!hk", name = "T", descriptor = "I")
	public int anInt3631 = -1;

	@OriginalMember(owner = "client!hk", name = "Z", descriptor = "I")
	public int anInt3637 = -1;

	@OriginalMember(owner = "client!hk", name = "W", descriptor = "I")
	public int anInt3634 = -1;

	@OriginalMember(owner = "client!hk", name = "B", descriptor = "I")
	public int anInt3617 = 0;

	@OriginalMember(owner = "client!hk", name = "Y", descriptor = "I")
	public int anInt3636 = -1;

	@OriginalMember(owner = "client!hk", name = "U", descriptor = "I")
	public int anInt3632 = 0;

	@OriginalMember(owner = "client!hk", name = "Q", descriptor = "Z")
	public boolean aBoolean271 = true;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)I")
	public int method2953() {
		if (this.anInt3613 != -1) {
			return this.anInt3613;
		} else if (this.anIntArray314 == null) {
			return -1;
		} else {
			@Pc(22) int local22 = (int) (Math.random() * (double) this.anInt3594);
			@Pc(24) int local24;
			for (local24 = 0; local22 >= this.anIntArray313[local24]; local24++) {
				local22 -= this.anIntArray313[local24];
			}
			return this.anIntArray314[local24];
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)Z")
	public boolean method2954(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt3613 == arg0) {
			return true;
		} else {
			if (this.anIntArray314 != null) {
				for (@Pc(29) int local29 = 0; local29 < this.anIntArray314.length; local29++) {
					if (arg0 == this.anIntArray314[local29]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!mo;B)V")
	private void method2955(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub35 arg1) {
		if (arg0 == 1) {
			this.anInt3613 = arg1.method5771();
			this.anInt3612 = arg1.method5771();
			if (this.anInt3613 == 65535) {
				this.anInt3613 = -1;
			}
			if (this.anInt3612 == 65535) {
				this.anInt3612 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt3593 = arg1.method5771();
		} else if (arg0 == 3) {
			this.anInt3636 = arg1.method5771();
		} else if (arg0 == 4) {
			this.anInt3602 = arg1.method5771();
		} else if (arg0 == 5) {
			this.anInt3628 = arg1.method5771();
		} else if (arg0 == 6) {
			this.anInt3597 = arg1.method5771();
		} else if (arg0 == 7) {
			this.anInt3625 = arg1.method5771();
		} else if (arg0 == 8) {
			this.anInt3616 = arg1.method5771();
		} else if (arg0 == 9) {
			this.anInt3610 = arg1.method5771();
		} else if (arg0 == 26) {
			this.anInt3607 = (short) (arg1.method5750() * 4);
			this.anInt3611 = (short) (arg1.method5750() * 4);
		} else {
			@Pc(83) int local83;
			@Pc(91) int local91;
			if (arg0 == 27) {
				if (this.anIntArrayArray87 == null) {
					this.anIntArrayArray87 = new int[12][];
				}
				local83 = arg1.method5750();
				this.anIntArrayArray87[local83] = new int[6];
				for (local91 = 0; local91 < 6; local91++) {
					this.anIntArrayArray87[local83][local91] = arg1.method5738();
				}
			} else if (arg0 == 28) {
				this.anIntArray311 = new int[12];
				for (local83 = 0; local83 < 12; local83++) {
					this.anIntArray311[local83] = arg1.method5750();
					if (this.anIntArray311[local83] == 255) {
						this.anIntArray311[local83] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt3618 = arg1.method5750();
			} else if (arg0 == 30) {
				this.anInt3608 = arg1.method5771();
			} else if (arg0 == 31) {
				this.anInt3609 = arg1.method5750();
			} else if (arg0 == 32) {
				this.anInt3623 = arg1.method5771();
			} else if (arg0 == 33) {
				this.anInt3624 = arg1.method5738();
			} else if (arg0 == 34) {
				this.anInt3630 = arg1.method5750();
			} else if (arg0 == 35) {
				this.anInt3632 = arg1.method5771();
			} else if (arg0 == 36) {
				this.anInt3599 = arg1.method5738();
			} else if (arg0 == 37) {
				this.anInt3596 = arg1.method5750();
			} else if (arg0 == 38) {
				this.anInt3598 = arg1.method5771();
			} else if (arg0 == 39) {
				this.anInt3600 = arg1.method5771();
			} else if (arg0 == 40) {
				this.anInt3604 = arg1.method5771();
			} else if (arg0 == 41) {
				this.anInt3629 = arg1.method5771();
			} else if (arg0 == 42) {
				this.anInt3626 = arg1.method5771();
			} else if (arg0 == 43) {
				this.anInt3601 = arg1.method5771();
			} else if (arg0 == 44) {
				this.anInt3620 = arg1.method5771();
			} else if (arg0 == 45) {
				this.anInt3637 = arg1.method5771();
			} else if (arg0 == 46) {
				this.anInt3631 = arg1.method5771();
			} else if (arg0 == 47) {
				this.anInt3622 = arg1.method5771();
			} else if (arg0 == 48) {
				this.anInt3634 = arg1.method5771();
			} else if (arg0 == 49) {
				this.anInt3615 = arg1.method5771();
			} else if (arg0 == 50) {
				this.anInt3621 = arg1.method5771();
			} else if (arg0 == 51) {
				this.anInt3605 = arg1.method5771();
			} else if (arg0 == 52) {
				local83 = arg1.method5750();
				this.anIntArray314 = new int[local83];
				this.anIntArray313 = new int[local83];
				for (local91 = 0; local91 < local83; local91++) {
					this.anIntArray314[local91] = arg1.method5771();
					@Pc(344) int local344 = arg1.method5750();
					this.anIntArray313[local91] = local344;
					this.anInt3594 += local344;
				}
			} else if (arg0 == 53) {
				this.aBoolean271 = false;
			} else if (arg0 == 54) {
				this.anInt3617 = arg1.method5750() << 6;
				this.anInt3627 = arg1.method5750() << 6;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!mo;I)V")
	public void method2959(@OriginalArg(0) Class1_Sub35 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5750();
			if (local14 == 0) {
				return;
			}
			this.method2955(local14, arg0);
		}
	}
}
