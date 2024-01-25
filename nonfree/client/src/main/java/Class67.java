import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class67 {

	@OriginalMember(owner = "client!g", name = "N", descriptor = "[I")
	public int[] anIntArray166;

	@OriginalMember(owner = "client!g", name = "Y", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "I")
	public int anInt2101 = -1;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "I")
	public int anInt2104 = -1;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	public int anInt2098 = -1;

	@OriginalMember(owner = "client!g", name = "q", descriptor = "I")
	public int anInt2111 = 0;

	@OriginalMember(owner = "client!g", name = "t", descriptor = "I")
	public int anInt2113 = -1;

	@OriginalMember(owner = "client!g", name = "p", descriptor = "I")
	public int anInt2110 = -1;

	@OriginalMember(owner = "client!g", name = "B", descriptor = "I")
	public int anInt2121 = 0;

	@OriginalMember(owner = "client!g", name = "C", descriptor = "I")
	public int anInt2122 = -1;

	@OriginalMember(owner = "client!g", name = "y", descriptor = "I")
	public int anInt2118 = 0;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "I")
	public int anInt2097 = -1;

	@OriginalMember(owner = "client!g", name = "E", descriptor = "I")
	public int anInt2123 = 0;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "I")
	public int anInt2099 = -1;

	@OriginalMember(owner = "client!g", name = "j", descriptor = "I")
	public int anInt2105 = -1;

	@OriginalMember(owner = "client!g", name = "D", descriptor = "Z")
	public boolean aBoolean148 = true;

	@OriginalMember(owner = "client!g", name = "x", descriptor = "I")
	private int anInt2117 = 0;

	@OriginalMember(owner = "client!g", name = "F", descriptor = "I")
	public int anInt2124 = -1;

	@OriginalMember(owner = "client!g", name = "w", descriptor = "I")
	public int anInt2116 = 0;

	@OriginalMember(owner = "client!g", name = "M", descriptor = "I")
	public int anInt2131 = 0;

	@OriginalMember(owner = "client!g", name = "o", descriptor = "I")
	public int anInt2109 = -1;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "I")
	public int anInt2100 = -1;

	@OriginalMember(owner = "client!g", name = "J", descriptor = "I")
	public int anInt2128 = 0;

	@OriginalMember(owner = "client!g", name = "L", descriptor = "I")
	public int anInt2130 = -1;

	@OriginalMember(owner = "client!g", name = "K", descriptor = "I")
	public int anInt2129 = -1;

	@OriginalMember(owner = "client!g", name = "v", descriptor = "I")
	public int anInt2115 = -1;

	@OriginalMember(owner = "client!g", name = "S", descriptor = "I")
	public int anInt2136 = 0;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "[I")
	public int[] anIntArray165 = null;

	@OriginalMember(owner = "client!g", name = "A", descriptor = "I")
	public int anInt2120 = -1;

	@OriginalMember(owner = "client!g", name = "T", descriptor = "I")
	public int anInt2137 = -1;

	@OriginalMember(owner = "client!g", name = "Q", descriptor = "I")
	public int anInt2134 = -1;

	@OriginalMember(owner = "client!g", name = "u", descriptor = "I")
	public int anInt2114 = -1;

	@OriginalMember(owner = "client!g", name = "W", descriptor = "[I")
	public int[] anIntArray167 = null;

	@OriginalMember(owner = "client!g", name = "r", descriptor = "I")
	public int anInt2112 = -1;

	@OriginalMember(owner = "client!g", name = "U", descriptor = "I")
	public int anInt2138 = -1;

	@OriginalMember(owner = "client!g", name = "P", descriptor = "I")
	public int anInt2133 = -1;

	@OriginalMember(owner = "client!g", name = "G", descriptor = "I")
	public int anInt2125 = 0;

	@OriginalMember(owner = "client!g", name = "X", descriptor = "I")
	public int anInt2140 = 0;

	@OriginalMember(owner = "client!g", name = "R", descriptor = "I")
	public int anInt2135 = -1;

	@OriginalMember(owner = "client!g", name = "bb", descriptor = "I")
	public int anInt2143 = -1;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	public void method2059() {
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!at;B)V")
	public void method2061(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2132();
			if (local5 == 0) {
				return;
			}
			this.method2065(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Z")
	public boolean method2064(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt2130 == arg0) {
			return true;
		} else {
			if (this.anIntArray167 != null) {
				for (@Pc(28) int local28 = 0; local28 < this.anIntArray167.length; local28++) {
					if (this.anIntArray167[local28] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IILclient!at;)V")
	private void method2065(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt2130 = arg1.method2161();
			this.anInt2129 = arg1.method2161();
			if (this.anInt2130 == 65535) {
				this.anInt2130 = -1;
			}
			if (this.anInt2129 == 65535) {
				this.anInt2129 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt2114 = arg1.method2161();
		} else if (arg0 == 3) {
			this.anInt2109 = arg1.method2161();
		} else if (arg0 == 4) {
			this.anInt2115 = arg1.method2161();
		} else if (arg0 == 5) {
			this.anInt2113 = arg1.method2161();
		} else if (arg0 == 6) {
			this.anInt2097 = arg1.method2161();
		} else if (arg0 == 7) {
			this.anInt2099 = arg1.method2161();
		} else if (arg0 == 8) {
			this.anInt2143 = arg1.method2161();
		} else if (arg0 == 9) {
			this.anInt2110 = arg1.method2161();
		} else if (arg0 == 26) {
			this.anInt2121 = (short) (arg1.method2132() * 4);
			this.anInt2118 = (short) (arg1.method2132() * 4);
		} else {
			@Pc(300) int local300;
			@Pc(310) int local310;
			if (arg0 == 27) {
				if (this.anIntArrayArray18 == null) {
					this.anIntArrayArray18 = new int[12][];
				}
				local300 = arg1.method2132();
				this.anIntArrayArray18[local300] = new int[6];
				for (local310 = 0; local310 < 6; local310++) {
					this.anIntArrayArray18[local300][local310] = arg1.method2141();
				}
			} else if (arg0 == 28) {
				this.anIntArray166 = new int[12];
				for (local300 = 0; local300 < 12; local300++) {
					this.anIntArray166[local300] = arg1.method2132();
					if (this.anIntArray166[local300] == 255) {
						this.anIntArray166[local300] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt2123 = arg1.method2132();
			} else if (arg0 == 30) {
				this.anInt2116 = arg1.method2161();
			} else if (arg0 == 31) {
				this.anInt2128 = arg1.method2132();
			} else if (arg0 == 32) {
				this.anInt2136 = arg1.method2161();
			} else if (arg0 == 33) {
				this.anInt2131 = arg1.method2141();
			} else if (arg0 == 34) {
				this.anInt2111 = arg1.method2132();
			} else if (arg0 == 35) {
				this.anInt2140 = arg1.method2161();
			} else if (arg0 == 36) {
				this.anInt2125 = arg1.method2141();
			} else if (arg0 == 37) {
				this.anInt2100 = arg1.method2132();
			} else if (arg0 == 38) {
				this.anInt2112 = arg1.method2161();
			} else if (arg0 == 39) {
				this.anInt2134 = arg1.method2161();
			} else if (arg0 == 40) {
				this.anInt2120 = arg1.method2161();
			} else if (arg0 == 41) {
				this.anInt2098 = arg1.method2161();
			} else if (arg0 == 42) {
				this.anInt2137 = arg1.method2161();
			} else if (arg0 == 43) {
				arg1.method2161();
			} else if (arg0 == 44) {
				this.anInt2105 = arg1.method2161();
			} else if (arg0 == 45) {
				this.anInt2138 = arg1.method2161();
			} else if (arg0 == 46) {
				this.anInt2104 = arg1.method2161();
			} else if (arg0 == 47) {
				this.anInt2135 = arg1.method2161();
			} else if (arg0 == 48) {
				this.anInt2101 = arg1.method2161();
			} else if (arg0 == 49) {
				this.anInt2124 = arg1.method2161();
			} else if (arg0 == 50) {
				this.anInt2122 = arg1.method2161();
			} else if (arg0 == 51) {
				this.anInt2133 = arg1.method2161();
			} else if (arg0 == 52) {
				local300 = arg1.method2132();
				this.anIntArray165 = new int[local300];
				this.anIntArray167 = new int[local300];
				for (local310 = 0; local310 < local300; local310++) {
					this.anIntArray167[local310] = arg1.method2161();
					@Pc(325) int local325 = arg1.method2132();
					this.anIntArray165[local310] = local325;
					this.anInt2117 += local325;
				}
			} else if (arg0 == 53) {
				this.aBoolean148 = false;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)I")
	public int method2068() {
		if (this.anInt2130 != -1) {
			return this.anInt2130;
		} else if (this.anIntArray167 == null) {
			return -1;
		} else {
			@Pc(28) int local28 = (int) (Math.random() * (double) this.anInt2117);
			@Pc(30) int local30;
			for (local30 = 0; local28 >= this.anIntArray165[local30]; local30++) {
				local28 -= this.anIntArray165[local30];
			}
			return this.anIntArray167[local30];
		}
	}
}
