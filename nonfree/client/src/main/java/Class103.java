import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class103 {

	@OriginalMember(owner = "client!ie", name = "z", descriptor = "[[I")
	public int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!ie", name = "W", descriptor = "[I")
	public int[] anIntArray581;

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
	public int anInt2812 = -1;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
	public int anInt2807 = -1;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
	public int anInt2814 = -1;

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
	public int anInt2819 = -1;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
	public int anInt2813 = -1;

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
	public int anInt2818 = -1;

	@OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
	public int anInt2829 = -1;

	@OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
	public int anInt2827 = -1;

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
	public int anInt2821 = -1;

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
	public int anInt2825 = -1;

	@OriginalMember(owner = "client!ie", name = "H", descriptor = "[I")
	public int[] anIntArray579 = null;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
	public int anInt2809 = -1;

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
	public int anInt2824 = -1;

	@OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
	public int anInt2826 = -1;

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
	public int anInt2810 = 0;

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
	public int anInt2823 = 0;

	@OriginalMember(owner = "client!ie", name = "G", descriptor = "I")
	public int anInt2836 = -1;

	@OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
	public int anInt2833 = -1;

	@OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
	public int anInt2830 = 0;

	@OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
	public int anInt2832 = -1;

	@OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
	public int anInt2828 = -1;

	@OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
	private int anInt2840 = 0;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
	public int anInt2820 = -1;

	@OriginalMember(owner = "client!ie", name = "O", descriptor = "Z")
	public boolean aBoolean212 = true;

	@OriginalMember(owner = "client!ie", name = "F", descriptor = "I")
	public int anInt2835 = -1;

	@OriginalMember(owner = "client!ie", name = "I", descriptor = "I")
	public int anInt2837 = 0;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
	public int anInt2808 = -1;

	@OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
	public int anInt2841 = -1;

	@OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
	public int anInt2838 = 0;

	@OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
	public int anInt2844 = 0;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
	public int anInt2816 = -1;

	@OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
	public int anInt2842 = 0;

	@OriginalMember(owner = "client!ie", name = "P", descriptor = "[I")
	public int[] anIntArray580 = null;

	@OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
	public int anInt2831 = -1;

	@OriginalMember(owner = "client!ie", name = "U", descriptor = "I")
	public int anInt2846 = 0;

	@OriginalMember(owner = "client!ie", name = "V", descriptor = "I")
	public int anInt2847 = 0;

	@OriginalMember(owner = "client!ie", name = "X", descriptor = "I")
	public int anInt2848 = -1;

	@OriginalMember(owner = "client!ie", name = "T", descriptor = "I")
	public int anInt2845 = 0;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLclient!kk;)V")
	public void method2669(@OriginalArg(1) Class2_Sub16 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5350();
			if (local15 == 0) {
				return;
			}
			this.method2671(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILclient!kk;)V")
	private void method2671(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub16 arg1) {
		if (arg0 == 1) {
			this.anInt2825 = arg1.method5312();
			this.anInt2816 = arg1.method5312();
			if (this.anInt2816 == 65535) {
				this.anInt2816 = -1;
			}
			if (this.anInt2825 == 65535) {
				this.anInt2825 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt2836 = arg1.method5312();
		} else if (arg0 == 3) {
			this.anInt2820 = arg1.method5312();
		} else if (arg0 == 4) {
			this.anInt2826 = arg1.method5312();
		} else if (arg0 == 5) {
			this.anInt2813 = arg1.method5312();
		} else if (arg0 == 6) {
			this.anInt2819 = arg1.method5312();
		} else if (arg0 == 7) {
			this.anInt2824 = arg1.method5312();
		} else if (arg0 == 8) {
			this.anInt2828 = arg1.method5312();
		} else if (arg0 == 9) {
			this.anInt2827 = arg1.method5312();
		} else if (arg0 == 26) {
			this.anInt2846 = (short) (arg1.method5350() * 4);
			this.anInt2810 = (short) (arg1.method5350() * 4);
		} else {
			@Pc(74) int local74;
			@Pc(82) int local82;
			if (arg0 == 27) {
				if (this.anIntArrayArray24 == null) {
					this.anIntArrayArray24 = new int[12][];
				}
				local74 = arg1.method5350();
				this.anIntArrayArray24[local74] = new int[6];
				for (local82 = 0; local82 < 6; local82++) {
					this.anIntArrayArray24[local74][local82] = arg1.method5341();
				}
			} else if (arg0 == 28) {
				this.anIntArray581 = new int[12];
				for (local74 = 0; local74 < 12; local74++) {
					this.anIntArray581[local74] = arg1.method5350();
					if (this.anIntArray581[local74] == 255) {
						this.anIntArray581[local74] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt2844 = arg1.method5350();
			} else if (arg0 == 30) {
				this.anInt2830 = arg1.method5312();
			} else if (arg0 == 31) {
				this.anInt2838 = arg1.method5350();
			} else if (arg0 == 32) {
				this.anInt2847 = arg1.method5312();
			} else if (arg0 == 33) {
				this.anInt2837 = arg1.method5341();
			} else if (arg0 == 34) {
				this.anInt2842 = arg1.method5350();
			} else if (arg0 == 35) {
				this.anInt2845 = arg1.method5312();
			} else if (arg0 == 36) {
				this.anInt2823 = arg1.method5341();
			} else if (arg0 == 37) {
				this.anInt2818 = arg1.method5350();
			} else if (arg0 == 38) {
				this.anInt2812 = arg1.method5312();
			} else if (arg0 == 39) {
				this.anInt2833 = arg1.method5312();
			} else if (arg0 == 40) {
				this.anInt2848 = arg1.method5312();
			} else if (arg0 == 41) {
				this.anInt2841 = arg1.method5312();
			} else if (arg0 == 42) {
				this.anInt2808 = arg1.method5312();
			} else if (arg0 == 43) {
				arg1.method5312();
			} else if (arg0 == 44) {
				this.anInt2829 = arg1.method5312();
			} else if (arg0 == 45) {
				this.anInt2807 = arg1.method5312();
			} else if (arg0 == 46) {
				this.anInt2832 = arg1.method5312();
			} else if (arg0 == 47) {
				this.anInt2814 = arg1.method5312();
			} else if (arg0 == 48) {
				this.anInt2809 = arg1.method5312();
			} else if (arg0 == 49) {
				this.anInt2821 = arg1.method5312();
			} else if (arg0 == 50) {
				this.anInt2835 = arg1.method5312();
				return;
			} else if (arg0 == 51) {
				this.anInt2831 = arg1.method5312();
				return;
			} else if (arg0 == 52) {
				local74 = arg1.method5350();
				this.anIntArray579 = new int[local74];
				this.anIntArray580 = new int[local74];
				for (local82 = 0; local82 < local74; local82++) {
					this.anIntArray579[local82] = arg1.method5312();
					@Pc(322) int local322 = arg1.method5350();
					this.anIntArray580[local82] = local322;
					this.anInt2840 += local322;
				}
				return;
			} else if (arg0 == 53) {
				this.aBoolean212 = false;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)Z")
	public boolean method2673(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt2825) {
			return true;
		} else {
			if (this.anIntArray579 != null) {
				for (@Pc(31) int local31 = 0; local31 < this.anIntArray579.length; local31++) {
					if (this.anIntArray579[local31] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)I")
	public int method2674() {
		if (this.anInt2825 != -1) {
			return this.anInt2825;
		} else if (this.anIntArray579 == null) {
			return -1;
		} else {
			@Pc(31) int local31 = (int) (Math.random() * (double) this.anInt2840);
			@Pc(33) int local33;
			for (local33 = 0; local31 >= this.anIntArray580[local33]; local33++) {
				local31 -= this.anIntArray580[local33];
			}
			return this.anIntArray579[local33];
		}
	}
}
