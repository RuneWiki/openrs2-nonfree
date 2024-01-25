import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class133 {

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "[[I")
	public int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "[I")
	public int[] anIntArray216;

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
	public int anInt3509 = -1;

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
	public int anInt3508 = 0;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
	public int anInt3507 = -1;

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
	public int anInt3513 = -1;

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
	public int anInt3520 = -1;

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
	public int anInt3517 = -1;

	@OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
	public int anInt3528 = 0;

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
	public int anInt3510 = -1;

	@OriginalMember(owner = "client!ka", name = "A", descriptor = "I")
	public int anInt3529 = -1;

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "I")
	public int anInt3527 = -1;

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
	public int anInt3521 = 0;

	@OriginalMember(owner = "client!ka", name = "w", descriptor = "I")
	public int anInt3525 = -1;

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
	public int anInt3512 = -1;

	@OriginalMember(owner = "client!ka", name = "J", descriptor = "I")
	public int anInt3536 = -1;

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
	public int anInt3523 = 0;

	@OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
	public int anInt3524 = -1;

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "[I")
	public int[] anIntArray214 = null;

	@OriginalMember(owner = "client!ka", name = "E", descriptor = "I")
	public int anInt3532 = -1;

	@OriginalMember(owner = "client!ka", name = "D", descriptor = "[I")
	public int[] anIntArray215 = null;

	@OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
	public int anInt3540 = 0;

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
	public int anInt3522 = 0;

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
	public int anInt3518 = -1;

	@OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
	public int anInt3537 = 0;

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
	public int anInt3515 = -1;

	@OriginalMember(owner = "client!ka", name = "S", descriptor = "I")
	public int anInt3542 = -1;

	@OriginalMember(owner = "client!ka", name = "T", descriptor = "I")
	public int anInt3543 = -1;

	@OriginalMember(owner = "client!ka", name = "U", descriptor = "I")
	public int anInt3544 = -1;

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
	private int anInt3519 = 0;

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
	public int anInt3539 = -1;

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
	public int anInt3514 = -1;

	@OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
	public int anInt3541 = -1;

	@OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
	public int anInt3526 = -1;

	@OriginalMember(owner = "client!ka", name = "N", descriptor = "I")
	public int anInt3538 = 0;

	@OriginalMember(owner = "client!ka", name = "X", descriptor = "I")
	public int anInt3546 = -1;

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "I")
	public int anInt3534 = 0;

	@OriginalMember(owner = "client!ka", name = "ab", descriptor = "Z")
	public boolean aBoolean229 = true;

	@OriginalMember(owner = "client!ka", name = "B", descriptor = "I")
	public int anInt3530 = 0;

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
	public int anInt3511 = -1;

	@OriginalMember(owner = "client!ka", name = "bb", descriptor = "I")
	public int anInt3548 = -1;

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "I")
	public int anInt3545 = 0;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
	public int anInt3506 = 0;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)I")
	public int method2804() {
		if (this.anInt3525 != -1) {
			return this.anInt3525;
		} else if (this.anIntArray214 == null) {
			return -1;
		} else {
			@Pc(30) int local30 = (int) ((double) this.anInt3519 * Math.random());
			@Pc(32) int local32;
			for (local32 = 0; this.anIntArray215[local32] <= local30; local32++) {
				local30 -= this.anIntArray215[local32];
			}
			return this.anIntArray214[local32];
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!fh;II)V")
	private void method2806(@OriginalArg(0) Class5_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt3525 = arg0.method5598();
			this.anInt3511 = arg0.method5598();
			if (this.anInt3511 == 65535) {
				this.anInt3511 = -1;
			}
			if (this.anInt3525 == 65535) {
				this.anInt3525 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt3507 = arg0.method5598();
		} else if (arg1 == 3) {
			this.anInt3542 = arg0.method5598();
		} else if (arg1 == 4) {
			this.anInt3532 = arg0.method5598();
		} else if (arg1 == 5) {
			this.anInt3513 = arg0.method5598();
		} else if (arg1 == 6) {
			this.anInt3510 = arg0.method5598();
		} else if (arg1 == 7) {
			this.anInt3515 = arg0.method5598();
		} else if (arg1 == 8) {
			this.anInt3544 = arg0.method5598();
		} else if (arg1 == 9) {
			this.anInt3526 = arg0.method5598();
		} else if (arg1 == 26) {
			this.anInt3538 = (short) (arg0.method5539() * 4);
			this.anInt3530 = (short) (arg0.method5539() * 4);
		} else {
			@Pc(90) int local90;
			@Pc(98) int local98;
			if (arg1 == 27) {
				if (this.anIntArrayArray25 == null) {
					this.anIntArrayArray25 = new int[12][];
				}
				local90 = arg0.method5539();
				this.anIntArrayArray25[local90] = new int[6];
				for (local98 = 0; local98 < 6; local98++) {
					this.anIntArrayArray25[local90][local98] = arg0.method5586();
				}
			} else if (arg1 == 28) {
				this.anIntArray216 = new int[12];
				for (local90 = 0; local90 < 12; local90++) {
					this.anIntArray216[local90] = arg0.method5539();
					if (this.anIntArray216[local90] == 255) {
						this.anIntArray216[local90] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt3545 = arg0.method5539();
			} else if (arg1 == 30) {
				this.anInt3537 = arg0.method5598();
			} else if (arg1 == 31) {
				this.anInt3521 = arg0.method5539();
			} else if (arg1 == 32) {
				this.anInt3522 = arg0.method5598();
			} else if (arg1 == 33) {
				this.anInt3534 = arg0.method5586();
			} else if (arg1 == 34) {
				this.anInt3528 = arg0.method5539();
			} else if (arg1 == 35) {
				this.anInt3506 = arg0.method5598();
			} else if (arg1 == 36) {
				this.anInt3508 = arg0.method5586();
			} else if (arg1 == 37) {
				this.anInt3514 = arg0.method5539();
			} else if (arg1 == 38) {
				this.anInt3548 = arg0.method5598();
			} else if (arg1 == 39) {
				this.anInt3529 = arg0.method5598();
			} else if (arg1 == 40) {
				this.anInt3509 = arg0.method5598();
			} else if (arg1 == 41) {
				this.anInt3543 = arg0.method5598();
			} else if (arg1 == 42) {
				this.anInt3536 = arg0.method5598();
			} else if (arg1 == 43) {
				this.anInt3520 = arg0.method5598();
			} else if (arg1 == 44) {
				this.anInt3546 = arg0.method5598();
			} else if (arg1 == 45) {
				this.anInt3512 = arg0.method5598();
			} else if (arg1 == 46) {
				this.anInt3518 = arg0.method5598();
			} else if (arg1 == 47) {
				this.anInt3541 = arg0.method5598();
			} else if (arg1 == 48) {
				this.anInt3527 = arg0.method5598();
			} else if (arg1 == 49) {
				this.anInt3517 = arg0.method5598();
			} else if (arg1 == 50) {
				this.anInt3539 = arg0.method5598();
			} else if (arg1 == 51) {
				this.anInt3524 = arg0.method5598();
			} else if (arg1 == 52) {
				local90 = arg0.method5539();
				this.anIntArray215 = new int[local90];
				this.anIntArray214 = new int[local90];
				for (local98 = 0; local98 < local90; local98++) {
					this.anIntArray214[local98] = arg0.method5598();
					@Pc(335) int local335 = arg0.method5539();
					this.anIntArray215[local98] = local335;
					this.anInt3519 += local335;
				}
			} else if (arg1 == 53) {
				this.aBoolean229 = false;
				return;
			} else if (arg1 == 54) {
				this.anInt3523 = arg0.method5539() << 6;
				this.anInt3540 = arg0.method5539() << 6;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!fh;I)V")
	public void method2807(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5539();
			if (local5 == 0) {
				return;
			}
			this.method2806(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Z")
	public boolean method2808(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt3525 == arg0) {
			return true;
		} else {
			if (this.anIntArray214 != null) {
				for (@Pc(27) int local27 = 0; local27 < this.anIntArray214.length; local27++) {
					if (this.anIntArray214[local27] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
