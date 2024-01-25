import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class173 {

	@OriginalMember(owner = "client!nq", name = "i", descriptor = "[I")
	public int[] anIntArray379;

	@OriginalMember(owner = "client!nq", name = "L", descriptor = "[[I")
	public int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "I")
	public int anInt4454 = -1;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
	public int anInt4449 = -1;

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "I")
	private int anInt4455 = 0;

	@OriginalMember(owner = "client!nq", name = "m", descriptor = "I")
	public int anInt4459 = -1;

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
	public int anInt4453 = 0;

	@OriginalMember(owner = "client!nq", name = "s", descriptor = "I")
	public int anInt4465 = -1;

	@OriginalMember(owner = "client!nq", name = "q", descriptor = "I")
	public int anInt4463 = -1;

	@OriginalMember(owner = "client!nq", name = "o", descriptor = "I")
	public int anInt4461 = 0;

	@OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
	public int anInt4458 = -1;

	@OriginalMember(owner = "client!nq", name = "k", descriptor = "[I")
	public int[] anIntArray380 = null;

	@OriginalMember(owner = "client!nq", name = "y", descriptor = "I")
	public int anInt4470 = 0;

	@OriginalMember(owner = "client!nq", name = "t", descriptor = "I")
	public int anInt4466 = 0;

	@OriginalMember(owner = "client!nq", name = "C", descriptor = "I")
	public int anInt4474 = 0;

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "I")
	public int anInt4456 = 0;

	@OriginalMember(owner = "client!nq", name = "E", descriptor = "I")
	public int anInt4476 = -1;

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "I")
	public int anInt4452 = -1;

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
	public int anInt4450 = -1;

	@OriginalMember(owner = "client!nq", name = "n", descriptor = "I")
	public int anInt4460 = -1;

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
	public int anInt4451 = 0;

	@OriginalMember(owner = "client!nq", name = "x", descriptor = "I")
	public int anInt4469 = 0;

	@OriginalMember(owner = "client!nq", name = "A", descriptor = "I")
	public int anInt4472 = -1;

	@OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
	public int anInt4464 = 0;

	@OriginalMember(owner = "client!nq", name = "M", descriptor = "I")
	public int anInt4482 = -1;

	@OriginalMember(owner = "client!nq", name = "R", descriptor = "I")
	public int anInt4486 = 0;

	@OriginalMember(owner = "client!nq", name = "P", descriptor = "I")
	public int anInt4484 = 0;

	@OriginalMember(owner = "client!nq", name = "D", descriptor = "I")
	public int anInt4475 = -1;

	@OriginalMember(owner = "client!nq", name = "z", descriptor = "I")
	public int anInt4471 = -1;

	@OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
	public int anInt4473 = 0;

	@OriginalMember(owner = "client!nq", name = "w", descriptor = "I")
	public int anInt4468 = -1;

	@OriginalMember(owner = "client!nq", name = "H", descriptor = "I")
	public int anInt4479 = -1;

	@OriginalMember(owner = "client!nq", name = "T", descriptor = "Z")
	public boolean aBoolean318 = true;

	@OriginalMember(owner = "client!nq", name = "Q", descriptor = "I")
	public int anInt4485 = -1;

	@OriginalMember(owner = "client!nq", name = "S", descriptor = "I")
	public int anInt4487 = -1;

	@OriginalMember(owner = "client!nq", name = "p", descriptor = "I")
	public int anInt4462 = -1;

	@OriginalMember(owner = "client!nq", name = "W", descriptor = "I")
	public int anInt4490 = -1;

	@OriginalMember(owner = "client!nq", name = "U", descriptor = "I")
	public int anInt4488 = -1;

	@OriginalMember(owner = "client!nq", name = "F", descriptor = "I")
	public int anInt4477 = -1;

	@OriginalMember(owner = "client!nq", name = "X", descriptor = "I")
	public int anInt4491 = -1;

	@OriginalMember(owner = "client!nq", name = "N", descriptor = "[I")
	public int[] anIntArray381 = null;

	@OriginalMember(owner = "client!nq", name = "V", descriptor = "I")
	public int anInt4489 = -1;

	@OriginalMember(owner = "client!nq", name = "O", descriptor = "I")
	public int anInt4483 = -1;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BLclient!sv;)V")
	public void method3665(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(19) int local19 = arg0.method3580();
			if (local19 == 0) {
				return;
			}
			this.method3667(arg0, local19);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IB)Z")
	public boolean method3666(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt4490 == arg0) {
			return true;
		} else {
			if (this.anIntArray381 != null) {
				for (@Pc(26) int local26 = 0; local26 < this.anIntArray381.length; local26++) {
					if (arg0 == this.anIntArray381[local26]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!sv;II)V")
	private void method3667(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4490 = arg0.method3555();
			this.anInt4482 = arg0.method3555();
			if (this.anInt4482 == 65535) {
				this.anInt4482 = -1;
			}
			if (this.anInt4490 == 65535) {
				this.anInt4490 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt4488 = arg0.method3555();
		} else if (arg1 == 3) {
			this.anInt4472 = arg0.method3555();
		} else if (arg1 == 4) {
			this.anInt4454 = arg0.method3555();
		} else if (arg1 == 5) {
			this.anInt4476 = arg0.method3555();
		} else if (arg1 == 6) {
			this.anInt4463 = arg0.method3555();
		} else if (arg1 == 7) {
			this.anInt4485 = arg0.method3555();
		} else if (arg1 == 8) {
			this.anInt4460 = arg0.method3555();
		} else if (arg1 == 9) {
			this.anInt4459 = arg0.method3555();
		} else if (arg1 == 26) {
			this.anInt4461 = (short) (arg0.method3580() * 4);
			this.anInt4451 = (short) (arg0.method3580() * 4);
		} else {
			@Pc(87) int local87;
			@Pc(95) int local95;
			if (arg1 == 27) {
				if (this.anIntArrayArray32 == null) {
					this.anIntArrayArray32 = new int[12][];
				}
				local87 = arg0.method3580();
				this.anIntArrayArray32[local87] = new int[6];
				for (local95 = 0; local95 < 6; local95++) {
					this.anIntArrayArray32[local87][local95] = arg0.method3558();
				}
			} else if (arg1 == 28) {
				this.anIntArray379 = new int[12];
				for (local87 = 0; local87 < 12; local87++) {
					this.anIntArray379[local87] = arg0.method3580();
					if (this.anIntArray379[local87] == 255) {
						this.anIntArray379[local87] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt4464 = arg0.method3580();
			} else if (arg1 == 30) {
				this.anInt4486 = arg0.method3555();
			} else if (arg1 == 31) {
				this.anInt4473 = arg0.method3580();
			} else if (arg1 == 32) {
				this.anInt4484 = arg0.method3555();
			} else if (arg1 == 33) {
				this.anInt4466 = arg0.method3558();
			} else if (arg1 == 34) {
				this.anInt4470 = arg0.method3580();
			} else if (arg1 == 35) {
				this.anInt4456 = arg0.method3555();
			} else if (arg1 == 36) {
				this.anInt4453 = arg0.method3558();
			} else if (arg1 == 37) {
				this.anInt4479 = arg0.method3580();
			} else if (arg1 == 38) {
				this.anInt4458 = arg0.method3555();
			} else if (arg1 == 39) {
				this.anInt4450 = arg0.method3555();
			} else if (arg1 == 40) {
				this.anInt4465 = arg0.method3555();
			} else if (arg1 == 41) {
				this.anInt4449 = arg0.method3555();
			} else if (arg1 == 42) {
				this.anInt4483 = arg0.method3555();
			} else if (arg1 == 43) {
				this.anInt4487 = arg0.method3555();
			} else if (arg1 == 44) {
				this.anInt4489 = arg0.method3555();
			} else if (arg1 == 45) {
				this.anInt4471 = arg0.method3555();
			} else if (arg1 == 46) {
				this.anInt4462 = arg0.method3555();
			} else if (arg1 == 47) {
				this.anInt4477 = arg0.method3555();
			} else if (arg1 == 48) {
				this.anInt4491 = arg0.method3555();
			} else if (arg1 == 49) {
				this.anInt4475 = arg0.method3555();
			} else if (arg1 == 50) {
				this.anInt4468 = arg0.method3555();
			} else if (arg1 == 51) {
				this.anInt4452 = arg0.method3555();
			} else if (arg1 == 52) {
				local87 = arg0.method3580();
				this.anIntArray380 = new int[local87];
				this.anIntArray381 = new int[local87];
				for (local95 = 0; local95 < local87; local95++) {
					this.anIntArray381[local95] = arg0.method3555();
					@Pc(375) int local375 = arg0.method3580();
					this.anIntArray380[local95] = local375;
					this.anInt4455 += local375;
				}
			} else if (arg1 == 53) {
				this.aBoolean318 = false;
			} else if (arg1 == 54) {
				this.anInt4469 = arg0.method3580() << 6;
				this.anInt4474 = arg0.method3580() << 6;
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)I")
	public int method3669() {
		if (this.anInt4490 != -1) {
			return this.anInt4490;
		} else if (this.anIntArray381 == null) {
			return -1;
		} else {
			@Pc(27) int local27 = (int) ((double) this.anInt4455 * Math.random());
			@Pc(29) int local29;
			for (local29 = 0; this.anIntArray380[local29] <= local27; local29++) {
				local27 -= this.anIntArray380[local29];
			}
			return this.anIntArray381[local29];
		}
	}
}
