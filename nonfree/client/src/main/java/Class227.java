import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class227 {

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "[[I")
	public int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!ug", name = "I", descriptor = "[I")
	public int[] anIntArray546;

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
	public int anInt6432 = -1;

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
	public int anInt6423 = 0;

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "Z")
	public boolean aBoolean464 = true;

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
	public int anInt6437 = -1;

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
	public int anInt6434 = 0;

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
	public int anInt6431 = -1;

	@OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
	public int anInt6441 = -1;

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "[I")
	public int[] anIntArray545 = null;

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
	public int anInt6424 = -1;

	@OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
	public int anInt6451 = -1;

	@OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
	public int anInt6453 = -1;

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "[I")
	public int[] anIntArray544 = null;

	@OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
	public int anInt6452 = 0;

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
	public int anInt6429 = 0;

	@OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
	public int anInt6455 = -1;

	@OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
	public int anInt6454 = 0;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
	public int anInt6422 = -1;

	@OriginalMember(owner = "client!ug", name = "R", descriptor = "I")
	public int anInt6459 = -1;

	@OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
	public int anInt6443 = -1;

	@OriginalMember(owner = "client!ug", name = "T", descriptor = "I")
	public int anInt6461 = -1;

	@OriginalMember(owner = "client!ug", name = "S", descriptor = "I")
	public int anInt6460 = -1;

	@OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
	public int anInt6447 = 0;

	@OriginalMember(owner = "client!ug", name = "V", descriptor = "I")
	public int anInt6463 = -1;

	@OriginalMember(owner = "client!ug", name = "W", descriptor = "I")
	public int anInt6464 = -1;

	@OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
	public int anInt6444 = 0;

	@OriginalMember(owner = "client!ug", name = "P", descriptor = "I")
	public int anInt6457 = -1;

	@OriginalMember(owner = "client!ug", name = "U", descriptor = "I")
	public int anInt6462 = -1;

	@OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
	public int anInt6449 = -1;

	@OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
	private int anInt6445 = 0;

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
	public int anInt6426 = -1;

	@OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
	public int anInt6439 = -1;

	@OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
	public int anInt6456 = -1;

	@OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
	public int anInt6440 = -1;

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
	public int anInt6435 = -1;

	@OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
	public int anInt6448 = 0;

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
	public int anInt6427 = 0;

	@OriginalMember(owner = "client!ug", name = "Y", descriptor = "I")
	public int anInt6466 = -1;

	@OriginalMember(owner = "client!ug", name = "Q", descriptor = "I")
	public int anInt6458 = 0;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)I")
	public int method5576() {
		if (this.anInt6426 != -1) {
			return this.anInt6426;
		} else if (this.anIntArray545 == null) {
			return -1;
		} else {
			@Pc(29) int local29 = (int) (Math.random() * (double) this.anInt6445);
			@Pc(31) int local31;
			for (local31 = 0; this.anIntArray544[local31] <= local29; local31++) {
				local29 -= this.anIntArray544[local31];
			}
			return this.anIntArray545[local31];
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!vt;I)V")
	public void method5578(@OriginalArg(0) Class2_Sub24 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5732();
			if (local11 == 0) {
				return;
			}
			this.method5585(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)Z")
	public boolean method5584(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt6426 == arg0) {
			return true;
		} else {
			if (this.anIntArray545 != null) {
				for (@Pc(25) int local25 = 0; local25 < this.anIntArray545.length; local25++) {
					if (this.anIntArray545[local25] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!vt;B)V")
	private void method5585(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub24 arg1) {
		if (arg0 == 1) {
			this.anInt6426 = arg1.method5753();
			this.anInt6460 = arg1.method5753();
			if (this.anInt6460 == 65535) {
				this.anInt6460 = -1;
			}
			if (this.anInt6426 == 65535) {
				this.anInt6426 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt6437 = arg1.method5753();
		} else if (arg0 == 3) {
			this.anInt6453 = arg1.method5753();
		} else if (arg0 == 4) {
			this.anInt6457 = arg1.method5753();
		} else if (arg0 == 5) {
			this.anInt6431 = arg1.method5753();
		} else if (arg0 == 6) {
			this.anInt6455 = arg1.method5753();
		} else if (arg0 == 7) {
			this.anInt6462 = arg1.method5753();
		} else if (arg0 == 8) {
			this.anInt6435 = arg1.method5753();
		} else if (arg0 == 9) {
			this.anInt6459 = arg1.method5753();
		} else if (arg0 == 26) {
			this.anInt6427 = (short) (arg1.method5732() * 4);
			this.anInt6454 = (short) (arg1.method5732() * 4);
		} else {
			@Pc(67) int local67;
			@Pc(75) int local75;
			if (arg0 == 27) {
				if (this.anIntArrayArray56 == null) {
					this.anIntArrayArray56 = new int[12][];
				}
				local67 = arg1.method5732();
				this.anIntArrayArray56[local67] = new int[6];
				for (local75 = 0; local75 < 6; local75++) {
					this.anIntArrayArray56[local67][local75] = arg1.method5743();
				}
			} else if (arg0 == 28) {
				this.anIntArray546 = new int[12];
				for (local67 = 0; local67 < 12; local67++) {
					this.anIntArray546[local67] = arg1.method5732();
					if (this.anIntArray546[local67] == 255) {
						this.anIntArray546[local67] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt6444 = arg1.method5732();
			} else if (arg0 == 30) {
				this.anInt6434 = arg1.method5753();
			} else if (arg0 == 31) {
				this.anInt6452 = arg1.method5732();
			} else if (arg0 == 32) {
				this.anInt6423 = arg1.method5753();
			} else if (arg0 == 33) {
				this.anInt6448 = arg1.method5743();
			} else if (arg0 == 34) {
				this.anInt6447 = arg1.method5732();
			} else if (arg0 == 35) {
				this.anInt6429 = arg1.method5753();
			} else if (arg0 == 36) {
				this.anInt6458 = arg1.method5743();
			} else if (arg0 == 37) {
				this.anInt6466 = arg1.method5732();
			} else if (arg0 == 38) {
				this.anInt6456 = arg1.method5753();
			} else if (arg0 == 39) {
				this.anInt6463 = arg1.method5753();
			} else if (arg0 == 40) {
				this.anInt6443 = arg1.method5753();
			} else if (arg0 == 41) {
				this.anInt6451 = arg1.method5753();
			} else if (arg0 == 42) {
				this.anInt6424 = arg1.method5753();
			} else if (arg0 == 43) {
				arg1.method5753();
			} else if (arg0 == 44) {
				this.anInt6441 = arg1.method5753();
			} else if (arg0 == 45) {
				this.anInt6432 = arg1.method5753();
			} else if (arg0 == 46) {
				this.anInt6440 = arg1.method5753();
			} else if (arg0 == 47) {
				this.anInt6464 = arg1.method5753();
			} else if (arg0 == 48) {
				this.anInt6439 = arg1.method5753();
			} else if (arg0 == 49) {
				this.anInt6461 = arg1.method5753();
			} else if (arg0 == 50) {
				this.anInt6449 = arg1.method5753();
			} else if (arg0 == 51) {
				this.anInt6422 = arg1.method5753();
			} else if (arg0 == 52) {
				local67 = arg1.method5732();
				this.anIntArray544 = new int[local67];
				this.anIntArray545 = new int[local67];
				for (local75 = 0; local75 < local67; local75++) {
					this.anIntArray545[local75] = arg1.method5753();
					@Pc(328) int local328 = arg1.method5732();
					this.anIntArray544[local75] = local328;
					this.anInt6445 += local328;
				}
			} else if (arg0 == 53) {
				this.aBoolean464 = false;
				return;
			}
		}
	}
}
