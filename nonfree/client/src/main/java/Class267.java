import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class267 {

	@OriginalMember(owner = "client!pw", name = "q", descriptor = "[I")
	public static final int[] anIntArray555 = new int[128];

	@OriginalMember(owner = "client!pw", name = "j", descriptor = "[I")
	public int[] anIntArray554;

	@OriginalMember(owner = "client!pw", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!pw", name = "o", descriptor = "I")
	public int anInt7020 = 0;

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
	public int anInt7010 = -1;

	@OriginalMember(owner = "client!pw", name = "g", descriptor = "I")
	public int anInt7014 = -1;

	@OriginalMember(owner = "client!pw", name = "f", descriptor = "[I")
	public int[] anIntArray553 = null;

	@OriginalMember(owner = "client!pw", name = "i", descriptor = "I")
	public int anInt7016 = 0;

	@OriginalMember(owner = "client!pw", name = "y", descriptor = "I")
	public int anInt7028 = -1;

	@OriginalMember(owner = "client!pw", name = "h", descriptor = "I")
	public int anInt7015 = 0;

	@OriginalMember(owner = "client!pw", name = "m", descriptor = "I")
	public int anInt7018 = -1;

	@OriginalMember(owner = "client!pw", name = "E", descriptor = "I")
	public int anInt7034 = -1;

	@OriginalMember(owner = "client!pw", name = "r", descriptor = "I")
	public int anInt7022 = -1;

	@OriginalMember(owner = "client!pw", name = "H", descriptor = "I")
	public int anInt7036 = -1;

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
	public int anInt7011 = -1;

	@OriginalMember(owner = "client!pw", name = "I", descriptor = "I")
	public int anInt7037 = -1;

	@OriginalMember(owner = "client!pw", name = "A", descriptor = "I")
	public int anInt7030 = 0;

	@OriginalMember(owner = "client!pw", name = "G", descriptor = "I")
	public int anInt7035 = -1;

	@OriginalMember(owner = "client!pw", name = "B", descriptor = "I")
	public int anInt7031 = 0;

	@OriginalMember(owner = "client!pw", name = "s", descriptor = "I")
	public int anInt7023 = -1;

	@OriginalMember(owner = "client!pw", name = "L", descriptor = "I")
	public int anInt7040 = -1;

	@OriginalMember(owner = "client!pw", name = "R", descriptor = "I")
	public int anInt7046 = -1;

	@OriginalMember(owner = "client!pw", name = "u", descriptor = "I")
	public int anInt7024 = -1;

	@OriginalMember(owner = "client!pw", name = "C", descriptor = "I")
	public int anInt7032 = 0;

	@OriginalMember(owner = "client!pw", name = "D", descriptor = "I")
	public int anInt7033 = -1;

	@OriginalMember(owner = "client!pw", name = "F", descriptor = "[I")
	public int[] anIntArray556 = null;

	@OriginalMember(owner = "client!pw", name = "e", descriptor = "I")
	public int anInt7013 = -1;

	@OriginalMember(owner = "client!pw", name = "N", descriptor = "I")
	public int anInt7042 = -1;

	@OriginalMember(owner = "client!pw", name = "t", descriptor = "Z")
	public boolean aBoolean559 = true;

	@OriginalMember(owner = "client!pw", name = "J", descriptor = "I")
	public int anInt7038 = 0;

	@OriginalMember(owner = "client!pw", name = "V", descriptor = "I")
	public int anInt7050 = 0;

	@OriginalMember(owner = "client!pw", name = "U", descriptor = "I")
	public int anInt7049 = -1;

	@OriginalMember(owner = "client!pw", name = "w", descriptor = "I")
	public int anInt7026 = -1;

	@OriginalMember(owner = "client!pw", name = "T", descriptor = "I")
	public int anInt7048 = -1;

	@OriginalMember(owner = "client!pw", name = "M", descriptor = "I")
	public int anInt7041 = -1;

	@OriginalMember(owner = "client!pw", name = "n", descriptor = "I")
	public int anInt7019 = 0;

	@OriginalMember(owner = "client!pw", name = "Q", descriptor = "I")
	public int anInt7045 = -1;

	@OriginalMember(owner = "client!pw", name = "O", descriptor = "I")
	public int anInt7043 = 0;

	@OriginalMember(owner = "client!pw", name = "W", descriptor = "I")
	private int anInt7051 = 0;

	@OriginalMember(owner = "client!pw", name = "d", descriptor = "I")
	public int anInt7012 = 0;

	@OriginalMember(owner = "client!pw", name = "X", descriptor = "I")
	public int anInt7052 = -1;

	@OriginalMember(owner = "client!pw", name = "p", descriptor = "I")
	public int anInt7021 = -1;

	@OriginalMember(owner = "client!pw", name = "Y", descriptor = "I")
	public int anInt7053 = 0;

	@OriginalMember(owner = "client!pw", name = "K", descriptor = "I")
	public int anInt7039 = -1;

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray555.length; local4++) {
			anIntArray555[local4] = -1;
		}
		for (@Pc(20) int local20 = 65; local20 <= 90; local20++) {
			anIntArray555[local20] = local20 - 65;
		}
		for (@Pc(35) int local35 = 97; local35 <= 122; local35++) {
			anIntArray555[local35] = local35 - 71;
		}
		for (@Pc(50) int local50 = 48; local50 <= 57; local50++) {
			anIntArray555[local50] = local50 + 52 - 48;
		}
		anIntArray555[42] = anIntArray555[43] = 62;
		anIntArray555[45] = anIntArray555[47] = 63;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)I")
	public int method6001() {
		if (this.anInt7035 != -1) {
			return this.anInt7035;
		} else if (this.anIntArray556 == null) {
			return -1;
		} else {
			@Pc(29) int local29 = (int) ((double) this.anInt7051 * Math.random());
			@Pc(31) int local31;
			for (local31 = 0; local29 >= this.anIntArray553[local31]; local31++) {
				local29 -= this.anIntArray553[local31];
			}
			return this.anIntArray556[local31];
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(ILclient!qh;I)V")
	private void method6003(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt7035 = arg1.method3109();
			this.anInt7024 = arg1.method3109();
			if (this.anInt7035 == 65535) {
				this.anInt7035 = -1;
			}
			if (this.anInt7024 == 65535) {
				this.anInt7024 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt7013 = arg1.method3109();
		} else if (arg0 == 3) {
			this.anInt7034 = arg1.method3109();
		} else if (arg0 == 4) {
			this.anInt7010 = arg1.method3109();
		} else if (arg0 == 5) {
			this.anInt7018 = arg1.method3109();
		} else if (arg0 == 6) {
			this.anInt7022 = arg1.method3109();
		} else if (arg0 == 7) {
			this.anInt7026 = arg1.method3109();
		} else if (arg0 == 8) {
			this.anInt7037 = arg1.method3109();
		} else if (arg0 == 9) {
			this.anInt7028 = arg1.method3109();
		} else if (arg0 == 26) {
			this.anInt7031 = (short) (arg1.method3118() * 4);
			this.anInt7050 = (short) (arg1.method3118() * 4);
		} else {
			@Pc(149) int local149;
			@Pc(157) int local157;
			if (arg0 == 27) {
				if (this.anIntArrayArray53 == null) {
					this.anIntArrayArray53 = new int[12][];
				}
				local149 = arg1.method3118();
				this.anIntArrayArray53[local149] = new int[6];
				for (local157 = 0; local157 < 6; local157++) {
					this.anIntArrayArray53[local149][local157] = arg1.method3107();
				}
			} else if (arg0 == 28) {
				this.anIntArray554 = new int[12];
				for (local149 = 0; local149 < 12; local149++) {
					this.anIntArray554[local149] = arg1.method3118();
					if (this.anIntArray554[local149] == 255) {
						this.anIntArray554[local149] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt7016 = arg1.method3118();
			} else if (arg0 == 30) {
				this.anInt7020 = arg1.method3109();
			} else if (arg0 == 31) {
				this.anInt7038 = arg1.method3118();
			} else if (arg0 == 32) {
				this.anInt7030 = arg1.method3109();
			} else if (arg0 == 33) {
				this.anInt7019 = arg1.method3107();
			} else if (arg0 == 34) {
				this.anInt7012 = arg1.method3118();
			} else if (arg0 == 35) {
				this.anInt7053 = arg1.method3109();
			} else if (arg0 == 36) {
				this.anInt7032 = arg1.method3107();
			} else if (arg0 == 37) {
				this.anInt7042 = arg1.method3118();
			} else if (arg0 == 38) {
				this.anInt7040 = arg1.method3109();
			} else if (arg0 == 39) {
				this.anInt7048 = arg1.method3109();
			} else if (arg0 == 40) {
				this.anInt7049 = arg1.method3109();
			} else if (arg0 == 41) {
				this.anInt7021 = arg1.method3109();
			} else if (arg0 == 42) {
				this.anInt7041 = arg1.method3109();
			} else if (arg0 == 43) {
				this.anInt7052 = arg1.method3109();
			} else if (arg0 == 44) {
				this.anInt7045 = arg1.method3109();
			} else if (arg0 == 45) {
				this.anInt7023 = arg1.method3109();
			} else if (arg0 == 46) {
				this.anInt7046 = arg1.method3109();
			} else if (arg0 == 47) {
				this.anInt7014 = arg1.method3109();
			} else if (arg0 == 48) {
				this.anInt7036 = arg1.method3109();
			} else if (arg0 == 49) {
				this.anInt7039 = arg1.method3109();
			} else if (arg0 == 50) {
				this.anInt7033 = arg1.method3109();
			} else if (arg0 == 51) {
				this.anInt7011 = arg1.method3109();
			} else if (arg0 == 52) {
				local149 = arg1.method3118();
				this.anIntArray553 = new int[local149];
				this.anIntArray556 = new int[local149];
				for (local157 = 0; local157 < local149; local157++) {
					this.anIntArray556[local157] = arg1.method3109();
					@Pc(419) int local419 = arg1.method3118();
					this.anIntArray553[local157] = local419;
					this.anInt7051 += local419;
				}
			} else if (arg0 == 53) {
				this.aBoolean559 = false;
			} else if (arg0 == 54) {
				this.anInt7043 = arg1.method3118() << 6;
				this.anInt7015 = arg1.method3118() << 6;
			}
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(BLclient!qh;)V")
	public void method6005(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(20) int local20 = arg0.method3118();
			if (local20 == 0) {
				return;
			}
			this.method6003(local20, arg0);
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(ZI)Z")
	public boolean method6006(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt7035) {
			return true;
		} else {
			if (this.anIntArray556 != null) {
				for (@Pc(30) int local30 = 0; local30 < this.anIntArray556.length; local30++) {
					if (arg0 == this.anIntArray556[local30]) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
