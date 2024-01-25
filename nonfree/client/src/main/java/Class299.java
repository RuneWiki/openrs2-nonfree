import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public final class Class299 {

	@OriginalMember(owner = "client!uw", name = "t", descriptor = "[I")
	public int[] anIntArray772;

	@OriginalMember(owner = "client!uw", name = "V", descriptor = "[[I")
	public int[][] anIntArrayArray116;

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "I")
	public int anInt8812 = -1;

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "Z")
	public boolean aBoolean667 = true;

	@OriginalMember(owner = "client!uw", name = "n", descriptor = "I")
	public int anInt8821 = -1;

	@OriginalMember(owner = "client!uw", name = "q", descriptor = "I")
	public int anInt8823 = 0;

	@OriginalMember(owner = "client!uw", name = "j", descriptor = "I")
	public int anInt8817 = -1;

	@OriginalMember(owner = "client!uw", name = "p", descriptor = "I")
	public int anInt8822 = 0;

	@OriginalMember(owner = "client!uw", name = "i", descriptor = "I")
	public int anInt8816 = -1;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "I")
	public int anInt8811 = -1;

	@OriginalMember(owner = "client!uw", name = "l", descriptor = "I")
	public int anInt8819 = 0;

	@OriginalMember(owner = "client!uw", name = "m", descriptor = "I")
	public int anInt8820 = 0;

	@OriginalMember(owner = "client!uw", name = "H", descriptor = "I")
	public int anInt8839 = 0;

	@OriginalMember(owner = "client!uw", name = "h", descriptor = "I")
	public int anInt8815 = 0;

	@OriginalMember(owner = "client!uw", name = "z", descriptor = "I")
	public int anInt8831 = -1;

	@OriginalMember(owner = "client!uw", name = "w", descriptor = "I")
	public int anInt8828 = -1;

	@OriginalMember(owner = "client!uw", name = "g", descriptor = "I")
	public int anInt8814 = -1;

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
	public int anInt8813 = -1;

	@OriginalMember(owner = "client!uw", name = "x", descriptor = "I")
	public int anInt8829 = 0;

	@OriginalMember(owner = "client!uw", name = "A", descriptor = "I")
	public int anInt8832 = 0;

	@OriginalMember(owner = "client!uw", name = "M", descriptor = "I")
	public int anInt8844 = -1;

	@OriginalMember(owner = "client!uw", name = "J", descriptor = "I")
	public int anInt8841 = -1;

	@OriginalMember(owner = "client!uw", name = "u", descriptor = "I")
	public int anInt8826 = -1;

	@OriginalMember(owner = "client!uw", name = "v", descriptor = "I")
	public int anInt8827 = -1;

	@OriginalMember(owner = "client!uw", name = "k", descriptor = "I")
	public int anInt8818 = -1;

	@OriginalMember(owner = "client!uw", name = "D", descriptor = "I")
	public int anInt8835 = -1;

	@OriginalMember(owner = "client!uw", name = "G", descriptor = "I")
	public int anInt8838 = 0;

	@OriginalMember(owner = "client!uw", name = "o", descriptor = "[I")
	public int[] anIntArray771 = null;

	@OriginalMember(owner = "client!uw", name = "C", descriptor = "I")
	public int anInt8834 = -1;

	@OriginalMember(owner = "client!uw", name = "F", descriptor = "I")
	public int anInt8837 = -1;

	@OriginalMember(owner = "client!uw", name = "y", descriptor = "I")
	public int anInt8830 = -1;

	@OriginalMember(owner = "client!uw", name = "B", descriptor = "I")
	public int anInt8833 = -1;

	@OriginalMember(owner = "client!uw", name = "L", descriptor = "I")
	public int anInt8843 = -1;

	@OriginalMember(owner = "client!uw", name = "s", descriptor = "I")
	public int anInt8825 = -1;

	@OriginalMember(owner = "client!uw", name = "R", descriptor = "I")
	public int anInt8848 = 0;

	@OriginalMember(owner = "client!uw", name = "S", descriptor = "[I")
	public int[] anIntArray773 = null;

	@OriginalMember(owner = "client!uw", name = "T", descriptor = "I")
	public int anInt8849 = -1;

	@OriginalMember(owner = "client!uw", name = "r", descriptor = "I")
	public int anInt8824 = -1;

	@OriginalMember(owner = "client!uw", name = "X", descriptor = "I")
	private int anInt8851 = 0;

	@OriginalMember(owner = "client!uw", name = "O", descriptor = "I")
	public int anInt8846 = 0;

	@OriginalMember(owner = "client!uw", name = "Q", descriptor = "I")
	public int anInt8847 = 0;

	@OriginalMember(owner = "client!uw", name = "I", descriptor = "I")
	public int anInt8840 = -1;

	@OriginalMember(owner = "client!uw", name = "Y", descriptor = "I")
	public int anInt8852 = -1;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILclient!os;)V")
	public void method7699(@OriginalArg(1) Class1_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4487();
			if (local5 == 0) {
				return;
			}
			this.method7700(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!os;IB)V")
	private void method7700(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt8833 = arg0.method4494();
			this.anInt8841 = arg0.method4494();
			if (this.anInt8833 == 65535) {
				this.anInt8833 = -1;
			}
			if (this.anInt8841 == 65535) {
				this.anInt8841 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt8826 = arg0.method4494();
		} else if (arg1 == 3) {
			this.anInt8844 = arg0.method4494();
		} else if (arg1 == 4) {
			this.anInt8818 = arg0.method4494();
		} else if (arg1 == 5) {
			this.anInt8827 = arg0.method4494();
		} else if (arg1 == 6) {
			this.anInt8814 = arg0.method4494();
		} else if (arg1 == 7) {
			this.anInt8834 = arg0.method4494();
		} else if (arg1 == 8) {
			this.anInt8843 = arg0.method4494();
		} else if (arg1 == 9) {
			this.anInt8817 = arg0.method4494();
		} else if (arg1 == 26) {
			this.anInt8820 = (short) (arg0.method4487() * 4);
			this.anInt8815 = (short) (arg0.method4487() * 4);
		} else {
			@Pc(132) int local132;
			@Pc(140) int local140;
			if (arg1 == 27) {
				if (this.anIntArrayArray116 == null) {
					this.anIntArrayArray116 = new int[12][];
				}
				local132 = arg0.method4487();
				this.anIntArrayArray116[local132] = new int[6];
				for (local140 = 0; local140 < 6; local140++) {
					this.anIntArrayArray116[local132][local140] = arg0.method4447();
				}
			} else if (arg1 == 28) {
				this.anIntArray772 = new int[12];
				for (local132 = 0; local132 < 12; local132++) {
					this.anIntArray772[local132] = arg0.method4487();
					if (this.anIntArray772[local132] == 255) {
						this.anIntArray772[local132] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt8823 = arg0.method4487();
			} else if (arg1 == 30) {
				this.anInt8846 = arg0.method4494();
			} else if (arg1 == 31) {
				this.anInt8829 = arg0.method4487();
			} else if (arg1 == 32) {
				this.anInt8832 = arg0.method4494();
			} else if (arg1 == 33) {
				this.anInt8822 = arg0.method4447();
			} else if (arg1 == 34) {
				this.anInt8839 = arg0.method4487();
			} else if (arg1 == 35) {
				this.anInt8847 = arg0.method4494();
			} else if (arg1 == 36) {
				this.anInt8838 = arg0.method4447();
			} else if (arg1 == 37) {
				this.anInt8811 = arg0.method4487();
			} else if (arg1 == 38) {
				this.anInt8831 = arg0.method4494();
			} else if (arg1 == 39) {
				this.anInt8840 = arg0.method4494();
			} else if (arg1 == 40) {
				this.anInt8828 = arg0.method4494();
			} else if (arg1 == 41) {
				this.anInt8830 = arg0.method4494();
			} else if (arg1 == 42) {
				this.anInt8816 = arg0.method4494();
			} else if (arg1 == 43) {
				this.anInt8824 = arg0.method4494();
			} else if (arg1 == 44) {
				this.anInt8849 = arg0.method4494();
			} else if (arg1 == 45) {
				this.anInt8837 = arg0.method4494();
			} else if (arg1 == 46) {
				this.anInt8825 = arg0.method4494();
			} else if (arg1 == 47) {
				this.anInt8852 = arg0.method4494();
			} else if (arg1 == 48) {
				this.anInt8813 = arg0.method4494();
			} else if (arg1 == 49) {
				this.anInt8812 = arg0.method4494();
			} else if (arg1 == 50) {
				this.anInt8835 = arg0.method4494();
			} else if (arg1 == 51) {
				this.anInt8821 = arg0.method4494();
			} else if (arg1 == 52) {
				local132 = arg0.method4487();
				this.anIntArray771 = new int[local132];
				this.anIntArray773 = new int[local132];
				for (local140 = 0; local140 < local132; local140++) {
					this.anIntArray773[local140] = arg0.method4494();
					@Pc(403) int local403 = arg0.method4487();
					this.anIntArray771[local140] = local403;
					this.anInt8851 += local403;
				}
			} else if (arg1 == 53) {
				this.aBoolean667 = false;
			} else if (arg1 == 54) {
				this.anInt8819 = arg0.method4487() << 6;
				this.anInt8848 = arg0.method4487() << 6;
			}
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(II)Z")
	public boolean method7701(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt8833) {
			return true;
		} else {
			if (this.anIntArray773 != null) {
				for (@Pc(27) int local27 = 0; local27 < this.anIntArray773.length; local27++) {
					if (arg0 == this.anIntArray773[local27]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)I")
	public int method7702() {
		if (this.anInt8833 != -1) {
			return this.anInt8833;
		} else if (this.anIntArray773 == null) {
			return -1;
		} else {
			@Pc(30) int local30 = (int) ((double) this.anInt8851 * Math.random());
			@Pc(32) int local32;
			for (local32 = 0; local30 >= this.anIntArray771[local32]; local32++) {
				local30 -= this.anIntArray771[local32];
			}
			return this.anIntArray773[local32];
		}
	}
}
