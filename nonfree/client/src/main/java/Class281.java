import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class281 {

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "[[I")
	public int[][] anIntArrayArray67;

	@OriginalMember(owner = "client!ti", name = "M", descriptor = "[I")
	public int[] anIntArray631;

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
	public int anInt8096 = -1;

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
	public int anInt8100 = 0;

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
	public int anInt8094 = 0;

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
	public int anInt8093 = -1;

	@OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
	public int anInt8107 = -1;

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
	public int anInt8095 = 0;

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
	public int anInt8104 = 0;

	@OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
	public int anInt8113 = -1;

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
	public int anInt8099 = -1;

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
	public int anInt8102 = -1;

	@OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
	public int anInt8110 = -1;

	@OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
	public int anInt8112 = -1;

	@OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
	public int anInt8116 = -1;

	@OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
	public int anInt8115 = 0;

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
	public int anInt8101 = -1;

	@OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
	public int anInt8118 = -1;

	@OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
	public int anInt8121 = -1;

	@OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
	public int anInt8109 = 0;

	@OriginalMember(owner = "client!ti", name = "J", descriptor = "[I")
	public int[] anIntArray630 = null;

	@OriginalMember(owner = "client!ti", name = "K", descriptor = "I")
	public int anInt8123 = -1;

	@OriginalMember(owner = "client!ti", name = "I", descriptor = "[I")
	public int[] anIntArray629 = null;

	@OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
	public int anInt8126 = -1;

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
	public int anInt8106 = -1;

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
	public int anInt8098 = -1;

	@OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
	public int anInt8130 = -1;

	@OriginalMember(owner = "client!ti", name = "L", descriptor = "I")
	public int anInt8124 = -1;

	@OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
	public int anInt8114 = -1;

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
	public int anInt8092 = -1;

	@OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
	public int anInt8117 = -1;

	@OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
	public int anInt8108 = 0;

	@OriginalMember(owner = "client!ti", name = "V", descriptor = "I")
	public int anInt8133 = -1;

	@OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
	private int anInt8129 = 0;

	@OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
	public int anInt8122 = -1;

	@OriginalMember(owner = "client!ti", name = "U", descriptor = "I")
	public int anInt8132 = -1;

	@OriginalMember(owner = "client!ti", name = "E", descriptor = "I")
	public int anInt8119 = 0;

	@OriginalMember(owner = "client!ti", name = "W", descriptor = "I")
	public int anInt8134 = -1;

	@OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
	public int anInt8128 = 0;

	@OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
	public int anInt8127 = 0;

	@OriginalMember(owner = "client!ti", name = "X", descriptor = "Z")
	public boolean aBoolean576 = true;

	@OriginalMember(owner = "client!ti", name = "N", descriptor = "I")
	public int anInt8125 = 0;

	@OriginalMember(owner = "client!ti", name = "T", descriptor = "I")
	public int anInt8131 = 0;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)I")
	public int method6588() {
		if (this.anInt8112 != -1) {
			return this.anInt8112;
		} else if (this.anIntArray629 == null) {
			return -1;
		} else {
			@Pc(22) int local22 = (int) (Math.random() * (double) this.anInt8129);
			@Pc(24) int local24;
			for (local24 = 0; local22 >= this.anIntArray630[local24]; local24++) {
				local22 -= this.anIntArray630[local24];
			}
			return this.anIntArray629[local24];
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB)Z")
	public boolean method6590(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt8112) {
			return true;
		} else {
			if (this.anIntArray629 != null) {
				for (@Pc(31) int local31 = 0; local31 < this.anIntArray629.length; local31++) {
					if (this.anIntArray629[local31] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!co;I)V")
	private void method6591(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt8112 = arg1.method4227();
			this.anInt8134 = arg1.method4227();
			if (this.anInt8134 == 65535) {
				this.anInt8134 = -1;
			}
			if (this.anInt8112 == 65535) {
				this.anInt8112 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt8124 = arg1.method4227();
		} else if (arg0 == 3) {
			this.anInt8099 = arg1.method4227();
		} else if (arg0 == 4) {
			this.anInt8098 = arg1.method4227();
		} else if (arg0 == 5) {
			this.anInt8116 = arg1.method4227();
		} else if (arg0 == 6) {
			this.anInt8093 = arg1.method4227();
		} else if (arg0 == 7) {
			this.anInt8117 = arg1.method4227();
		} else if (arg0 == 8) {
			this.anInt8121 = arg1.method4227();
		} else if (arg0 == 9) {
			this.anInt8113 = arg1.method4227();
		} else if (arg0 == 26) {
			this.anInt8108 = (short) (arg1.method4220() * 4);
			this.anInt8128 = (short) (arg1.method4220() * 4);
		} else {
			@Pc(78) int local78;
			@Pc(86) int local86;
			if (arg0 == 27) {
				if (this.anIntArrayArray67 == null) {
					this.anIntArrayArray67 = new int[12][];
				}
				local78 = arg1.method4220();
				this.anIntArrayArray67[local78] = new int[6];
				for (local86 = 0; local86 < 6; local86++) {
					this.anIntArrayArray67[local78][local86] = arg1.method4212();
				}
			} else if (arg0 == 28) {
				this.anIntArray631 = new int[12];
				for (local78 = 0; local78 < 12; local78++) {
					this.anIntArray631[local78] = arg1.method4220();
					if (this.anIntArray631[local78] == 255) {
						this.anIntArray631[local78] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt8100 = arg1.method4220();
			} else if (arg0 == 30) {
				this.anInt8131 = arg1.method4227();
			} else if (arg0 == 31) {
				this.anInt8109 = arg1.method4220();
			} else if (arg0 == 32) {
				this.anInt8127 = arg1.method4227();
			} else if (arg0 == 33) {
				this.anInt8095 = arg1.method4212();
			} else if (arg0 == 34) {
				this.anInt8119 = arg1.method4220();
			} else if (arg0 == 35) {
				this.anInt8094 = arg1.method4227();
			} else if (arg0 == 36) {
				this.anInt8115 = arg1.method4212();
			} else if (arg0 == 37) {
				this.anInt8130 = arg1.method4220();
			} else if (arg0 == 38) {
				this.anInt8122 = arg1.method4227();
			} else if (arg0 == 39) {
				this.anInt8123 = arg1.method4227();
			} else if (arg0 == 40) {
				this.anInt8126 = arg1.method4227();
			} else if (arg0 == 41) {
				this.anInt8106 = arg1.method4227();
			} else if (arg0 == 42) {
				this.anInt8133 = arg1.method4227();
			} else if (arg0 == 43) {
				this.anInt8101 = arg1.method4227();
			} else if (arg0 == 44) {
				this.anInt8110 = arg1.method4227();
			} else if (arg0 == 45) {
				this.anInt8092 = arg1.method4227();
			} else if (arg0 == 46) {
				this.anInt8096 = arg1.method4227();
			} else if (arg0 == 47) {
				this.anInt8118 = arg1.method4227();
			} else if (arg0 == 48) {
				this.anInt8107 = arg1.method4227();
			} else if (arg0 == 49) {
				this.anInt8132 = arg1.method4227();
			} else if (arg0 == 50) {
				this.anInt8102 = arg1.method4227();
			} else if (arg0 == 51) {
				this.anInt8114 = arg1.method4227();
			} else if (arg0 == 52) {
				local78 = arg1.method4220();
				this.anIntArray630 = new int[local78];
				this.anIntArray629 = new int[local78];
				for (local86 = 0; local86 < local78; local86++) {
					this.anIntArray629[local86] = arg1.method4227();
					@Pc(380) int local380 = arg1.method4220();
					this.anIntArray630[local86] = local380;
					this.anInt8129 += local380;
				}
			} else if (arg0 == 53) {
				this.aBoolean576 = false;
			} else if (arg0 == 54) {
				this.anInt8104 = arg1.method4220() << 6;
				this.anInt8125 = arg1.method4220() << 6;
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!co;)V")
	public void method6594(@OriginalArg(1) Class5_Sub3 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4220();
			if (local11 == 0) {
				return;
			}
			this.method6591(local11, arg0);
		}
	}
}
