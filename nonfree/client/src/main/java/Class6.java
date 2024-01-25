import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class6 {

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ae", name = "G", descriptor = "[I")
	public int[] anIntArray3;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
	public int anInt36 = -1;

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
	public int anInt43 = 0;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
	public int anInt41 = -1;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
	public int anInt38 = -1;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
	public int anInt40 = -1;

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
	public int anInt52 = 0;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
	public int anInt37 = -1;

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
	public int anInt47 = -1;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
	public int anInt39 = 0;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
	public int anInt42 = -1;

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "[I")
	public int[] anIntArray2 = null;

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "Z")
	public boolean aBoolean3 = true;

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
	public int anInt55 = 0;

	@OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
	public int anInt66 = 0;

	@OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
	public int anInt63 = -1;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
	public int anInt45 = 0;

	@OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
	public int anInt62 = -1;

	@OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
	public int anInt65 = -1;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
	public int anInt50 = -1;

	@OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
	public int anInt67 = -1;

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
	public int anInt58 = -1;

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
	public int anInt53 = -1;

	@OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
	public int anInt56 = 0;

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
	public int anInt54 = -1;

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
	public int anInt57 = -1;

	@OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
	public int anInt70 = -1;

	@OriginalMember(owner = "client!ae", name = "L", descriptor = "[I")
	public int[] anIntArray4 = null;

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
	public int anInt49 = 0;

	@OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
	public int anInt73 = -1;

	@OriginalMember(owner = "client!ae", name = "K", descriptor = "I")
	public int anInt68 = 0;

	@OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
	private int anInt71 = 0;

	@OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
	public int anInt72 = 0;

	@OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
	public int anInt69 = -1;

	@OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
	public int anInt74 = -1;

	@OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
	public int anInt64 = 0;

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
	public int anInt46 = -1;

	@OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
	public int anInt76 = -1;

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
	public int anInt51 = 0;

	@OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
	public int anInt75 = -1;

	@OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
	public int anInt59 = -1;

	@OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
	public int anInt77 = -1;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!nn;I)V")
	private void method33(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt63 = arg1.method2485();
			this.anInt42 = arg1.method2485();
			if (this.anInt63 == 65535) {
				this.anInt63 = -1;
			}
			if (this.anInt42 == 65535) {
				this.anInt42 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt74 = arg1.method2485();
		} else if (arg0 == 3) {
			this.anInt54 = arg1.method2485();
		} else if (arg0 == 4) {
			this.anInt38 = arg1.method2485();
		} else if (arg0 == 5) {
			this.anInt58 = arg1.method2485();
		} else if (arg0 == 6) {
			this.anInt77 = arg1.method2485();
		} else if (arg0 == 7) {
			this.anInt65 = arg1.method2485();
		} else if (arg0 == 8) {
			this.anInt70 = arg1.method2485();
		} else if (arg0 == 9) {
			this.anInt41 = arg1.method2485();
		} else if (arg0 == 26) {
			this.anInt66 = (short) (arg1.method2502() * 4);
			this.anInt39 = (short) (arg1.method2502() * 4);
		} else {
			@Pc(137) int local137;
			@Pc(145) int local145;
			if (arg0 == 27) {
				if (this.anIntArrayArray1 == null) {
					this.anIntArrayArray1 = new int[12][];
				}
				local137 = arg1.method2502();
				this.anIntArrayArray1[local137] = new int[6];
				for (local145 = 0; local145 < 6; local145++) {
					this.anIntArrayArray1[local137][local145] = arg1.method2492();
				}
			} else if (arg0 == 28) {
				this.anIntArray3 = new int[12];
				for (local137 = 0; local137 < 12; local137++) {
					this.anIntArray3[local137] = arg1.method2502();
					if (this.anIntArray3[local137] == 255) {
						this.anIntArray3[local137] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt55 = arg1.method2502();
			} else if (arg0 == 30) {
				this.anInt45 = arg1.method2485();
			} else if (arg0 == 31) {
				this.anInt68 = arg1.method2502();
			} else if (arg0 == 32) {
				this.anInt49 = arg1.method2485();
			} else if (arg0 == 33) {
				this.anInt56 = arg1.method2492();
			} else if (arg0 == 34) {
				this.anInt43 = arg1.method2502();
			} else if (arg0 == 35) {
				this.anInt51 = arg1.method2485();
			} else if (arg0 == 36) {
				this.anInt72 = arg1.method2492();
			} else if (arg0 == 37) {
				this.anInt62 = arg1.method2502();
			} else if (arg0 == 38) {
				this.anInt59 = arg1.method2485();
			} else if (arg0 == 39) {
				this.anInt50 = arg1.method2485();
			} else if (arg0 == 40) {
				this.anInt53 = arg1.method2485();
			} else if (arg0 == 41) {
				this.anInt75 = arg1.method2485();
			} else if (arg0 == 42) {
				this.anInt76 = arg1.method2485();
			} else if (arg0 == 43) {
				this.anInt40 = arg1.method2485();
			} else if (arg0 == 44) {
				this.anInt37 = arg1.method2485();
			} else if (arg0 == 45) {
				this.anInt73 = arg1.method2485();
			} else if (arg0 == 46) {
				this.anInt47 = arg1.method2485();
			} else if (arg0 == 47) {
				this.anInt69 = arg1.method2485();
			} else if (arg0 == 48) {
				this.anInt67 = arg1.method2485();
			} else if (arg0 == 49) {
				this.anInt57 = arg1.method2485();
			} else if (arg0 == 50) {
				this.anInt36 = arg1.method2485();
			} else if (arg0 == 51) {
				this.anInt46 = arg1.method2485();
			} else if (arg0 == 52) {
				local137 = arg1.method2502();
				this.anIntArray2 = new int[local137];
				this.anIntArray4 = new int[local137];
				for (local145 = 0; local145 < local137; local145++) {
					this.anIntArray2[local145] = arg1.method2485();
					@Pc(453) int local453 = arg1.method2502();
					this.anIntArray4[local145] = local453;
					this.anInt71 += local453;
				}
			} else if (arg0 == 53) {
				this.aBoolean3 = false;
			} else if (arg0 == 54) {
				this.anInt64 = arg1.method2502() << 6;
				this.anInt52 = arg1.method2502() << 6;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!nn;)V")
	public void method34(@OriginalArg(1) Class10_Sub8 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2502();
			if (local17 == 0) {
				return;
			}
			this.method33(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)Z")
	public boolean method36(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt63) {
			return true;
		} else {
			if (this.anIntArray2 != null) {
				for (@Pc(29) int local29 = 0; local29 < this.anIntArray2.length; local29++) {
					if (this.anIntArray2[local29] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)I")
	public int method37() {
		if (this.anInt63 != -1) {
			return this.anInt63;
		} else if (this.anIntArray2 == null) {
			return -1;
		} else {
			@Pc(30) int local30 = (int) ((double) this.anInt71 * Math.random());
			@Pc(32) int local32;
			for (local32 = 0; this.anIntArray4[local32] <= local30; local32++) {
				local30 -= this.anIntArray4[local32];
			}
			return this.anIntArray2[local32];
		}
	}
}
