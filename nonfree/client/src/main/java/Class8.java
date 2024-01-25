import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class8 {

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "[I")
	public int[] anIntArray14;

	@OriginalMember(owner = "client!ai", name = "u", descriptor = "[[I")
	public int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
	public int anInt125 = 0;

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
	public int anInt129 = 0;

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
	public int anInt130 = -1;

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
	public int anInt133 = -1;

	@OriginalMember(owner = "client!ai", name = "A", descriptor = "I")
	public int anInt144 = -1;

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
	public int anInt136 = -1;

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
	public int anInt131 = -1;

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
	public int anInt135 = 0;

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
	public int anInt138 = -1;

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
	public int anInt127 = -1;

	@OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
	public int anInt143 = -1;

	@OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
	private int anInt141 = 0;

	@OriginalMember(owner = "client!ai", name = "H", descriptor = "[I")
	public int[] anIntArray15 = null;

	@OriginalMember(owner = "client!ai", name = "F", descriptor = "I")
	public int anInt148 = -1;

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
	public int anInt124 = 0;

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
	public int anInt132 = -1;

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
	public int anInt128 = -1;

	@OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
	public int anInt149 = -1;

	@OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
	public int anInt151 = -1;

	@OriginalMember(owner = "client!ai", name = "B", descriptor = "I")
	public int anInt145 = -1;

	@OriginalMember(owner = "client!ai", name = "J", descriptor = "[I")
	public int[] anIntArray16 = null;

	@OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
	public int anInt150 = -1;

	@OriginalMember(owner = "client!ai", name = "D", descriptor = "Z")
	public boolean aBoolean11 = true;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
	public int anInt120 = 0;

	@OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
	public int anInt152 = 0;

	@OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
	public int anInt140 = -1;

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
	public int anInt134 = -1;

	@OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
	public int anInt137 = -1;

	@OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
	public int anInt158 = -1;

	@OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
	public int anInt157 = -1;

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
	public int anInt121 = 0;

	@OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
	public int anInt155 = 0;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
	public int anInt122 = -1;

	@OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
	public int anInt160 = -1;

	@OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
	public int anInt153 = -1;

	@OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
	public int anInt156 = -1;

	@OriginalMember(owner = "client!ai", name = "y", descriptor = "I")
	public int anInt142 = 0;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
	public int anInt126 = 0;

	@OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
	public int anInt159 = -1;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!re;I)V")
	public void method95(@OriginalArg(0) Class1_Sub33 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5174();
			if (local13 == 0) {
				return;
			}
			this.method99(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)I")
	public int method96() {
		if (this.anInt159 != -1) {
			return this.anInt159;
		} else if (this.anIntArray16 == null) {
			return -1;
		} else {
			@Pc(28) int local28 = (int) ((double) this.anInt141 * Math.random());
			@Pc(30) int local30;
			for (local30 = 0; this.anIntArray15[local30] <= local28; local30++) {
				local28 -= this.anIntArray15[local30];
			}
			return this.anIntArray16[local30];
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)Z")
	public boolean method98(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt159) {
			return true;
		} else {
			if (this.anIntArray16 != null) {
				for (@Pc(33) int local33 = 0; local33 < this.anIntArray16.length; local33++) {
					if (this.anIntArray16[local33] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!re;IB)V")
	private void method99(@OriginalArg(0) Class1_Sub33 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt159 = arg0.method5177();
			this.anInt148 = arg0.method5177();
			if (this.anInt148 == 65535) {
				this.anInt148 = -1;
			}
			if (this.anInt159 == 65535) {
				this.anInt159 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt151 = arg0.method5177();
		} else if (arg1 == 3) {
			this.anInt137 = arg0.method5177();
		} else if (arg1 == 4) {
			this.anInt145 = arg0.method5177();
		} else if (arg1 == 5) {
			this.anInt122 = arg0.method5177();
		} else if (arg1 == 6) {
			this.anInt128 = arg0.method5177();
		} else if (arg1 == 7) {
			this.anInt138 = arg0.method5177();
		} else if (arg1 == 8) {
			this.anInt133 = arg0.method5177();
		} else if (arg1 == 9) {
			this.anInt150 = arg0.method5177();
		} else if (arg1 == 26) {
			this.anInt152 = (short) (arg0.method5174() * 4);
			this.anInt125 = (short) (arg0.method5174() * 4);
		} else {
			@Pc(86) int local86;
			@Pc(268) int local268;
			if (arg1 == 27) {
				if (this.anIntArrayArray2 == null) {
					this.anIntArrayArray2 = new int[12][];
				}
				local86 = arg0.method5174();
				this.anIntArrayArray2[local86] = new int[6];
				for (local268 = 0; local268 < 6; local268++) {
					this.anIntArrayArray2[local86][local268] = arg0.method5180();
				}
			} else if (arg1 == 28) {
				this.anIntArray14 = new int[12];
				for (local86 = 0; local86 < 12; local86++) {
					this.anIntArray14[local86] = arg0.method5174();
					if (this.anIntArray14[local86] == 255) {
						this.anIntArray14[local86] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt120 = arg0.method5174();
			} else if (arg1 == 30) {
				this.anInt155 = arg0.method5177();
			} else if (arg1 == 31) {
				this.anInt135 = arg0.method5174();
			} else if (arg1 == 32) {
				this.anInt124 = arg0.method5177();
			} else if (arg1 == 33) {
				this.anInt126 = arg0.method5180();
			} else if (arg1 == 34) {
				this.anInt142 = arg0.method5174();
			} else if (arg1 == 35) {
				this.anInt121 = arg0.method5177();
			} else if (arg1 == 36) {
				this.anInt129 = arg0.method5180();
			} else if (arg1 == 37) {
				this.anInt157 = arg0.method5174();
			} else if (arg1 == 38) {
				this.anInt149 = arg0.method5177();
			} else if (arg1 == 39) {
				this.anInt158 = arg0.method5177();
			} else if (arg1 == 40) {
				this.anInt156 = arg0.method5177();
			} else if (arg1 == 41) {
				this.anInt132 = arg0.method5177();
			} else if (arg1 == 42) {
				this.anInt160 = arg0.method5177();
			} else if (arg1 == 43) {
				this.anInt130 = arg0.method5177();
			} else if (arg1 == 44) {
				this.anInt140 = arg0.method5177();
			} else if (arg1 == 45) {
				this.anInt153 = arg0.method5177();
			} else if (arg1 == 46) {
				this.anInt127 = arg0.method5177();
			} else if (arg1 == 47) {
				this.anInt143 = arg0.method5177();
			} else if (arg1 == 48) {
				this.anInt144 = arg0.method5177();
			} else if (arg1 == 49) {
				this.anInt134 = arg0.method5177();
			} else if (arg1 == 50) {
				this.anInt131 = arg0.method5177();
			} else if (arg1 == 51) {
				this.anInt136 = arg0.method5177();
			} else if (arg1 == 52) {
				local86 = arg0.method5174();
				this.anIntArray16 = new int[local86];
				this.anIntArray15 = new int[local86];
				for (local268 = 0; local268 < local86; local268++) {
					this.anIntArray16[local268] = arg0.method5177();
					@Pc(283) int local283 = arg0.method5174();
					this.anIntArray15[local268] = local283;
					this.anInt141 += local283;
				}
			} else if (arg1 == 53) {
				this.aBoolean11 = false;
			}
		}
	}
}
