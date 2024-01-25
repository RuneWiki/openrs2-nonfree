import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class118 {

	@OriginalMember(owner = "client!gr", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!gr", name = "I", descriptor = "[I")
	public int[] anIntArray207;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
	public int anInt3572 = -1;

	@OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
	public int anInt3580 = 0;

	@OriginalMember(owner = "client!gr", name = "q", descriptor = "I")
	public int anInt3585 = -1;

	@OriginalMember(owner = "client!gr", name = "j", descriptor = "Z")
	public boolean aBoolean250 = true;

	@OriginalMember(owner = "client!gr", name = "r", descriptor = "I")
	public int anInt3586 = 0;

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
	public int anInt3575 = -1;

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
	public int anInt3576 = 0;

	@OriginalMember(owner = "client!gr", name = "w", descriptor = "I")
	public int anInt3591 = 0;

	@OriginalMember(owner = "client!gr", name = "v", descriptor = "I")
	public int anInt3590 = -1;

	@OriginalMember(owner = "client!gr", name = "o", descriptor = "I")
	public int anInt3584 = -1;

	@OriginalMember(owner = "client!gr", name = "u", descriptor = "I")
	public int anInt3589 = -1;

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
	public int anInt3573 = 0;

	@OriginalMember(owner = "client!gr", name = "F", descriptor = "I")
	public int anInt3599 = -1;

	@OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
	public int anInt3600 = -1;

	@OriginalMember(owner = "client!gr", name = "n", descriptor = "I")
	public int anInt3583 = -1;

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
	public int anInt3578 = -1;

	@OriginalMember(owner = "client!gr", name = "H", descriptor = "I")
	public int anInt3601 = 0;

	@OriginalMember(owner = "client!gr", name = "E", descriptor = "I")
	public int anInt3598 = 0;

	@OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
	private int anInt3579 = 0;

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
	public int anInt3577 = 0;

	@OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
	public int anInt3592 = -1;

	@OriginalMember(owner = "client!gr", name = "M", descriptor = "I")
	public int anInt3604 = -1;

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
	public int anInt3581 = 0;

	@OriginalMember(owner = "client!gr", name = "P", descriptor = "I")
	public int anInt3606 = -1;

	@OriginalMember(owner = "client!gr", name = "s", descriptor = "I")
	public int anInt3587 = 0;

	@OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
	public int anInt3597 = -1;

	@OriginalMember(owner = "client!gr", name = "X", descriptor = "I")
	public int anInt3611 = -1;

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "[I")
	public int[] anIntArray206 = null;

	@OriginalMember(owner = "client!gr", name = "z", descriptor = "I")
	public int anInt3594 = -1;

	@OriginalMember(owner = "client!gr", name = "V", descriptor = "I")
	public int anInt3610 = -1;

	@OriginalMember(owner = "client!gr", name = "J", descriptor = "I")
	public int anInt3602 = -1;

	@OriginalMember(owner = "client!gr", name = "N", descriptor = "I")
	public int anInt3605 = -1;

	@OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
	public int anInt3593 = -1;

	@OriginalMember(owner = "client!gr", name = "Y", descriptor = "I")
	public int anInt3612 = -1;

	@OriginalMember(owner = "client!gr", name = "L", descriptor = "I")
	public int anInt3603 = -1;

	@OriginalMember(owner = "client!gr", name = "S", descriptor = "I")
	public int anInt3608 = 0;

	@OriginalMember(owner = "client!gr", name = "U", descriptor = "[I")
	public int[] anIntArray208 = null;

	@OriginalMember(owner = "client!gr", name = "Z", descriptor = "I")
	public int anInt3613 = -1;

	@OriginalMember(owner = "client!gr", name = "Q", descriptor = "I")
	public int anInt3607 = -1;

	@OriginalMember(owner = "client!gr", name = "bb", descriptor = "I")
	public int anInt3615 = -1;

	@OriginalMember(owner = "client!gr", name = "ab", descriptor = "I")
	public int anInt3614 = 0;

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)I")
	public int method3168() {
		if (this.anInt3613 != -1) {
			return this.anInt3613;
		} else if (this.anIntArray206 == null) {
			return -1;
		} else {
			@Pc(28) int local28 = (int) (Math.random() * (double) this.anInt3579);
			@Pc(30) int local30;
			for (local30 = 0; this.anIntArray208[local30] <= local28; local30++) {
				local28 -= this.anIntArray208[local30];
			}
			return this.anIntArray206[local30];
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!ji;II)V")
	private void method3169(@OriginalArg(0) Class6_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3613 = arg0.method6003();
			this.anInt3612 = arg0.method6003();
			if (this.anInt3612 == 65535) {
				this.anInt3612 = -1;
			}
			if (this.anInt3613 == 65535) {
				this.anInt3613 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt3590 = arg0.method6003();
		} else if (arg1 == 3) {
			this.anInt3606 = arg0.method6003();
		} else if (arg1 == 4) {
			this.anInt3610 = arg0.method6003();
		} else if (arg1 == 5) {
			this.anInt3572 = arg0.method6003();
		} else if (arg1 == 6) {
			this.anInt3607 = arg0.method6003();
		} else if (arg1 == 7) {
			this.anInt3604 = arg0.method6003();
		} else if (arg1 == 8) {
			this.anInt3575 = arg0.method6003();
		} else if (arg1 == 9) {
			this.anInt3593 = arg0.method6003();
		} else if (arg1 == 26) {
			this.anInt3601 = (short) (arg0.method6069() * 4);
			this.anInt3581 = (short) (arg0.method6069() * 4);
		} else {
			@Pc(129) int local129;
			@Pc(137) int local137;
			if (arg1 == 27) {
				if (this.anIntArrayArray20 == null) {
					this.anIntArrayArray20 = new int[12][];
				}
				local129 = arg0.method6069();
				this.anIntArrayArray20[local129] = new int[6];
				for (local137 = 0; local137 < 6; local137++) {
					this.anIntArrayArray20[local129][local137] = arg0.method6058();
				}
			} else if (arg1 == 28) {
				this.anIntArray207 = new int[12];
				for (local129 = 0; local129 < 12; local129++) {
					this.anIntArray207[local129] = arg0.method6069();
					if (this.anIntArray207[local129] == 255) {
						this.anIntArray207[local129] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt3577 = arg0.method6069();
			} else if (arg1 == 30) {
				this.anInt3576 = arg0.method6003();
			} else if (arg1 == 31) {
				this.anInt3598 = arg0.method6069();
			} else if (arg1 == 32) {
				this.anInt3614 = arg0.method6003();
			} else if (arg1 == 33) {
				this.anInt3580 = arg0.method6058();
			} else if (arg1 == 34) {
				this.anInt3573 = arg0.method6069();
			} else if (arg1 == 35) {
				this.anInt3608 = arg0.method6003();
			} else if (arg1 == 36) {
				this.anInt3586 = arg0.method6058();
			} else if (arg1 == 37) {
				this.anInt3589 = arg0.method6069();
			} else if (arg1 == 38) {
				this.anInt3615 = arg0.method6003();
			} else if (arg1 == 39) {
				this.anInt3599 = arg0.method6003();
			} else if (arg1 == 40) {
				this.anInt3583 = arg0.method6003();
			} else if (arg1 == 41) {
				this.anInt3600 = arg0.method6003();
			} else if (arg1 == 42) {
				this.anInt3611 = arg0.method6003();
			} else if (arg1 == 43) {
				this.anInt3605 = arg0.method6003();
			} else if (arg1 == 44) {
				this.anInt3592 = arg0.method6003();
			} else if (arg1 == 45) {
				this.anInt3603 = arg0.method6003();
			} else if (arg1 == 46) {
				this.anInt3602 = arg0.method6003();
			} else if (arg1 == 47) {
				this.anInt3578 = arg0.method6003();
			} else if (arg1 == 48) {
				this.anInt3584 = arg0.method6003();
			} else if (arg1 == 49) {
				this.anInt3585 = arg0.method6003();
			} else if (arg1 == 50) {
				this.anInt3594 = arg0.method6003();
			} else if (arg1 == 51) {
				this.anInt3597 = arg0.method6003();
			} else if (arg1 == 52) {
				local129 = arg0.method6069();
				this.anIntArray206 = new int[local129];
				this.anIntArray208 = new int[local129];
				for (local137 = 0; local137 < local129; local137++) {
					this.anIntArray206[local137] = arg0.method6003();
					@Pc(425) int local425 = arg0.method6069();
					this.anIntArray208[local137] = local425;
					this.anInt3579 += local425;
				}
			} else if (arg1 == 53) {
				this.aBoolean250 = false;
			} else if (arg1 == 54) {
				this.anInt3591 = arg0.method6069() << 6;
				this.anInt3587 = arg0.method6069() << 6;
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BLclient!ji;)V")
	public void method3171(@OriginalArg(1) Class6_Sub21 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6069();
			if (local13 == 0) {
				return;
			}
			this.method3169(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)Z")
	public boolean method3172(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt3613) {
			return true;
		} else {
			if (this.anIntArray206 != null) {
				for (@Pc(34) int local34 = 0; local34 < this.anIntArray206.length; local34++) {
					if (arg0 == this.anIntArray206[local34]) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
