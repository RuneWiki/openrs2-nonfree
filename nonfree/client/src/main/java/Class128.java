import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class128 {

	@OriginalMember(owner = "client!lo", name = "K", descriptor = "[[I")
	public int[][] anIntArrayArray123;

	@OriginalMember(owner = "client!lo", name = "U", descriptor = "[I")
	public int[] anIntArray398;

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
	public int anInt3371 = 0;

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
	public int anInt3374 = -1;

	@OriginalMember(owner = "client!lo", name = "q", descriptor = "I")
	public int anInt3383 = -1;

	@OriginalMember(owner = "client!lo", name = "l", descriptor = "I")
	public int anInt3379 = -1;

	@OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
	public int anInt3378 = -1;

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "Z")
	public boolean aBoolean245 = true;

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
	public int anInt3375 = -1;

	@OriginalMember(owner = "client!lo", name = "x", descriptor = "I")
	public int anInt3390 = 0;

	@OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
	public int anInt3384 = -1;

	@OriginalMember(owner = "client!lo", name = "z", descriptor = "I")
	public int anInt3392 = 0;

	@OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
	public int anInt3385 = -1;

	@OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
	public int anInt3382 = 0;

	@OriginalMember(owner = "client!lo", name = "n", descriptor = "I")
	public int anInt3380 = 0;

	@OriginalMember(owner = "client!lo", name = "I", descriptor = "I")
	public int anInt3401 = -1;

	@OriginalMember(owner = "client!lo", name = "A", descriptor = "I")
	public int anInt3393 = -1;

	@OriginalMember(owner = "client!lo", name = "m", descriptor = "[I")
	private int[] anIntArray396 = null;

	@OriginalMember(owner = "client!lo", name = "w", descriptor = "I")
	public int anInt3389 = 0;

	@OriginalMember(owner = "client!lo", name = "G", descriptor = "I")
	public int anInt3399 = 0;

	@OriginalMember(owner = "client!lo", name = "N", descriptor = "I")
	public int anInt3404 = 0;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "[I")
	private int[] anIntArray395 = null;

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
	public int anInt3377 = 0;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
	public int anInt3372 = -1;

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
	public int anInt3376 = -1;

	@OriginalMember(owner = "client!lo", name = "u", descriptor = "I")
	public int anInt3387 = -1;

	@OriginalMember(owner = "client!lo", name = "t", descriptor = "I")
	public int anInt3386 = -1;

	@OriginalMember(owner = "client!lo", name = "J", descriptor = "I")
	public int anInt3402 = 0;

	@OriginalMember(owner = "client!lo", name = "C", descriptor = "I")
	public int anInt3395 = -1;

	@OriginalMember(owner = "client!lo", name = "O", descriptor = "I")
	public int anInt3405 = -1;

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
	public int anInt3373 = -1;

	@OriginalMember(owner = "client!lo", name = "Q", descriptor = "I")
	public int anInt3407 = -1;

	@OriginalMember(owner = "client!lo", name = "D", descriptor = "I")
	public int anInt3396 = -1;

	@OriginalMember(owner = "client!lo", name = "R", descriptor = "I")
	private int anInt3408 = 0;

	@OriginalMember(owner = "client!lo", name = "H", descriptor = "I")
	public int anInt3400 = -1;

	@OriginalMember(owner = "client!lo", name = "S", descriptor = "I")
	public int anInt3409 = -1;

	@OriginalMember(owner = "client!lo", name = "V", descriptor = "I")
	public int anInt3410 = -1;

	@OriginalMember(owner = "client!lo", name = "P", descriptor = "I")
	public int anInt3406 = -1;

	@OriginalMember(owner = "client!lo", name = "W", descriptor = "I")
	public int anInt3411 = -1;

	@OriginalMember(owner = "client!lo", name = "X", descriptor = "I")
	public int anInt3412 = -1;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)I")
	public int method3453() {
		if (this.anInt3386 != -1) {
			return this.anInt3386;
		} else if (this.anIntArray396 == null) {
			return -1;
		} else {
			@Pc(30) int local30 = (int) (Math.random() * (double) this.anInt3408);
			@Pc(32) int local32;
			for (local32 = 0; this.anIntArray395[local32] <= local30; local32++) {
				local30 -= this.anIntArray395[local32];
			}
			return this.anIntArray396[local32];
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!ec;I)V")
	public void method3455(@OriginalArg(0) Class6_Sub10 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3972();
			if (local5 == 0) {
				return;
			}
			this.method3458(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(B)V")
	public void method3456() {
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!ec;I)V")
	private void method3458(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub10 arg1) {
		if (arg0 == 1) {
			this.anInt3386 = arg1.method4021();
			this.anInt3384 = arg1.method4021();
			if (this.anInt3384 == 65535) {
				this.anInt3384 = -1;
			}
			if (this.anInt3386 == 65535) {
				this.anInt3386 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt3400 = arg1.method4021();
		} else if (arg0 == 3) {
			this.anInt3411 = arg1.method4021();
		} else if (arg0 == 4) {
			this.anInt3374 = arg1.method4021();
		} else if (arg0 == 5) {
			this.anInt3383 = arg1.method4021();
		} else if (arg0 == 6) {
			this.anInt3379 = arg1.method4021();
		} else if (arg0 == 7) {
			this.anInt3393 = arg1.method4021();
		} else if (arg0 == 8) {
			this.anInt3395 = arg1.method4021();
		} else if (arg0 == 9) {
			this.anInt3410 = arg1.method4021();
		} else if (arg0 == 26) {
			this.anInt3382 = (short) (arg1.method3972() * 4);
			this.anInt3380 = (short) (arg1.method3972() * 4);
		} else {
			@Pc(112) int local112;
			@Pc(356) int local356;
			if (arg0 == 27) {
				if (this.anIntArrayArray123 == null) {
					this.anIntArrayArray123 = new int[12][];
				}
				local112 = arg1.method3972();
				this.anIntArrayArray123[local112] = new int[6];
				for (local356 = 0; local356 < 6; local356++) {
					this.anIntArrayArray123[local112][local356] = arg1.method4022();
				}
			} else if (arg0 == 28) {
				this.anIntArray398 = new int[12];
				for (local112 = 0; local112 < 12; local112++) {
					this.anIntArray398[local112] = arg1.method3972();
					if (this.anIntArray398[local112] == 255) {
						this.anIntArray398[local112] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt3402 = arg1.method3972();
			} else if (arg0 == 30) {
				this.anInt3404 = arg1.method4021();
			} else if (arg0 == 31) {
				this.anInt3389 = arg1.method3972();
			} else if (arg0 == 32) {
				this.anInt3390 = arg1.method4021();
			} else if (arg0 == 33) {
				this.anInt3392 = arg1.method4022();
			} else if (arg0 == 34) {
				this.anInt3377 = arg1.method3972();
			} else if (arg0 == 35) {
				this.anInt3399 = arg1.method4021();
			} else if (arg0 == 36) {
				this.anInt3371 = arg1.method4022();
			} else if (arg0 == 37) {
				this.anInt3373 = arg1.method3972();
			} else if (arg0 == 38) {
				this.anInt3385 = arg1.method4021();
			} else if (arg0 == 39) {
				this.anInt3409 = arg1.method4021();
			} else if (arg0 == 40) {
				this.anInt3375 = arg1.method4021();
			} else if (arg0 == 41) {
				this.anInt3412 = arg1.method4021();
			} else if (arg0 == 42) {
				this.anInt3396 = arg1.method4021();
			} else if (arg0 == 43) {
				arg1.method4021();
			} else if (arg0 == 44) {
				this.anInt3407 = arg1.method4021();
			} else if (arg0 == 45) {
				this.anInt3372 = arg1.method4021();
			} else if (arg0 == 46) {
				this.anInt3387 = arg1.method4021();
			} else if (arg0 == 47) {
				this.anInt3405 = arg1.method4021();
			} else if (arg0 == 48) {
				this.anInt3378 = arg1.method4021();
			} else if (arg0 == 49) {
				this.anInt3406 = arg1.method4021();
			} else if (arg0 == 50) {
				this.anInt3376 = arg1.method4021();
			} else if (arg0 == 51) {
				this.anInt3401 = arg1.method4021();
			} else if (arg0 == 52) {
				local112 = arg1.method3972();
				this.anIntArray396 = new int[local112];
				this.anIntArray395 = new int[local112];
				for (local356 = 0; local356 < local112; local356++) {
					this.anIntArray396[local356] = arg1.method4021();
					@Pc(369) int local369 = arg1.method3972();
					this.anIntArray395[local356] = local369;
					this.anInt3408 += local369;
				}
			} else if (arg0 == 53) {
				this.aBoolean245 = false;
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZI)Z")
	public boolean method3459(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt3386) {
			return true;
		} else {
			if (this.anIntArray396 != null) {
				for (@Pc(34) int local34 = 0; local34 < this.anIntArray396.length; local34++) {
					if (this.anIntArray396[local34] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
