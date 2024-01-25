import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class255 {

	@OriginalMember(owner = "client!rn", name = "P", descriptor = "[I")
	public int[] anIntArray574;

	@OriginalMember(owner = "client!rn", name = "W", descriptor = "[[I")
	public int[][] anIntArrayArray71;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
	public int anInt7255 = -1;

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
	public int anInt7266 = 0;

	@OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
	public int anInt7269 = -1;

	@OriginalMember(owner = "client!rn", name = "u", descriptor = "I")
	public int anInt7275 = 0;

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
	public int anInt7258 = -1;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
	public int anInt7261 = -1;

	@OriginalMember(owner = "client!rn", name = "p", descriptor = "I")
	public int anInt7270 = -1;

	@OriginalMember(owner = "client!rn", name = "C", descriptor = "I")
	public int anInt7282 = 0;

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
	public int anInt7256 = -1;

	@OriginalMember(owner = "client!rn", name = "r", descriptor = "I")
	public int anInt7272 = -1;

	@OriginalMember(owner = "client!rn", name = "B", descriptor = "I")
	public int anInt7281 = -1;

	@OriginalMember(owner = "client!rn", name = "D", descriptor = "I")
	public int anInt7283 = -1;

	@OriginalMember(owner = "client!rn", name = "q", descriptor = "I")
	public int anInt7271 = 0;

	@OriginalMember(owner = "client!rn", name = "y", descriptor = "I")
	public int anInt7278 = -1;

	@OriginalMember(owner = "client!rn", name = "w", descriptor = "Z")
	public boolean aBoolean480 = true;

	@OriginalMember(owner = "client!rn", name = "J", descriptor = "I")
	public int anInt7288 = -1;

	@OriginalMember(owner = "client!rn", name = "M", descriptor = "I")
	public int anInt7291 = -1;

	@OriginalMember(owner = "client!rn", name = "L", descriptor = "I")
	public int anInt7290 = 0;

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
	public int anInt7259 = -1;

	@OriginalMember(owner = "client!rn", name = "E", descriptor = "I")
	public int anInt7284 = -1;

	@OriginalMember(owner = "client!rn", name = "s", descriptor = "I")
	public int anInt7273 = -1;

	@OriginalMember(owner = "client!rn", name = "N", descriptor = "[I")
	public int[] anIntArray573 = null;

	@OriginalMember(owner = "client!rn", name = "v", descriptor = "I")
	public int anInt7276 = -1;

	@OriginalMember(owner = "client!rn", name = "F", descriptor = "I")
	public int anInt7285 = 0;

	@OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
	public int anInt7268 = -1;

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
	public int anInt7263 = -1;

	@OriginalMember(owner = "client!rn", name = "T", descriptor = "I")
	public int anInt7295 = 0;

	@OriginalMember(owner = "client!rn", name = "Q", descriptor = "I")
	public int anInt7293 = 0;

	@OriginalMember(owner = "client!rn", name = "G", descriptor = "[I")
	public int[] anIntArray572 = null;

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
	public int anInt7260 = -1;

	@OriginalMember(owner = "client!rn", name = "R", descriptor = "I")
	public int anInt7294 = 0;

	@OriginalMember(owner = "client!rn", name = "K", descriptor = "I")
	public int anInt7289 = 0;

	@OriginalMember(owner = "client!rn", name = "V", descriptor = "I")
	public int anInt7297 = 0;

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
	public int anInt7262 = -1;

	@OriginalMember(owner = "client!rn", name = "I", descriptor = "I")
	public int anInt7287 = -1;

	@OriginalMember(owner = "client!rn", name = "Z", descriptor = "I")
	public int anInt7300 = -1;

	@OriginalMember(owner = "client!rn", name = "Y", descriptor = "I")
	public int anInt7299 = -1;

	@OriginalMember(owner = "client!rn", name = "t", descriptor = "I")
	public int anInt7274 = -1;

	@OriginalMember(owner = "client!rn", name = "O", descriptor = "I")
	public int anInt7292 = 0;

	@OriginalMember(owner = "client!rn", name = "ab", descriptor = "I")
	private int anInt7301 = 0;

	@OriginalMember(owner = "client!rn", name = "U", descriptor = "I")
	public int anInt7296 = -1;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)Z")
	public boolean method6213(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt7258 == arg0) {
			return true;
		} else {
			if (this.anIntArray573 != null) {
				for (@Pc(24) int local24 = 0; local24 < this.anIntArray573.length; local24++) {
					if (this.anIntArray573[local24] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILclient!gw;)V")
	public void method6215(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method3043();
			if (local12 == 0) {
				return;
			}
			this.method6219(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)I")
	public int method6216() {
		if (this.anInt7258 != -1) {
			return this.anInt7258;
		} else if (this.anIntArray573 == null) {
			return -1;
		} else {
			@Pc(26) int local26 = (int) ((double) this.anInt7301 * Math.random());
			@Pc(28) int local28;
			for (local28 = 0; this.anIntArray572[local28] <= local26; local28++) {
				local26 -= this.anIntArray572[local28];
			}
			return this.anIntArray573[local28];
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!gw;II)V")
	private void method6219(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt7258 = arg0.method3056();
			this.anInt7263 = arg0.method3056();
			if (this.anInt7258 == 65535) {
				this.anInt7258 = -1;
			}
			if (this.anInt7263 == 65535) {
				this.anInt7263 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt7288 = arg0.method3056();
		} else if (arg1 == 3) {
			this.anInt7270 = arg0.method3056();
		} else if (arg1 == 4) {
			this.anInt7268 = arg0.method3056();
		} else if (arg1 == 5) {
			this.anInt7287 = arg0.method3056();
		} else if (arg1 == 6) {
			this.anInt7262 = arg0.method3056();
		} else if (arg1 == 7) {
			this.anInt7278 = arg0.method3056();
		} else if (arg1 == 8) {
			this.anInt7300 = arg0.method3056();
		} else if (arg1 == 9) {
			this.anInt7259 = arg0.method3056();
		} else if (arg1 == 26) {
			this.anInt7295 = (short) (arg0.method3043() * 4);
			this.anInt7266 = (short) (arg0.method3043() * 4);
		} else {
			@Pc(85) int local85;
			@Pc(93) int local93;
			if (arg1 == 27) {
				if (this.anIntArrayArray71 == null) {
					this.anIntArrayArray71 = new int[12][];
				}
				local85 = arg0.method3043();
				this.anIntArrayArray71[local85] = new int[6];
				for (local93 = 0; local93 < 6; local93++) {
					this.anIntArrayArray71[local85][local93] = arg0.method3058();
				}
			} else if (arg1 == 28) {
				this.anIntArray574 = new int[12];
				for (local85 = 0; local85 < 12; local85++) {
					this.anIntArray574[local85] = arg0.method3043();
					if (this.anIntArray574[local85] == 255) {
						this.anIntArray574[local85] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt7297 = arg0.method3043();
			} else if (arg1 == 30) {
				this.anInt7290 = arg0.method3056();
			} else if (arg1 == 31) {
				this.anInt7285 = arg0.method3043();
			} else if (arg1 == 32) {
				this.anInt7289 = arg0.method3056();
			} else if (arg1 == 33) {
				this.anInt7292 = arg0.method3058();
			} else if (arg1 == 34) {
				this.anInt7293 = arg0.method3043();
			} else if (arg1 == 35) {
				this.anInt7282 = arg0.method3056();
			} else if (arg1 == 36) {
				this.anInt7294 = arg0.method3058();
			} else if (arg1 == 37) {
				this.anInt7281 = arg0.method3043();
			} else if (arg1 == 38) {
				this.anInt7284 = arg0.method3056();
			} else if (arg1 == 39) {
				this.anInt7261 = arg0.method3056();
			} else if (arg1 == 40) {
				this.anInt7276 = arg0.method3056();
			} else if (arg1 == 41) {
				this.anInt7256 = arg0.method3056();
			} else if (arg1 == 42) {
				this.anInt7255 = arg0.method3056();
			} else if (arg1 == 43) {
				this.anInt7269 = arg0.method3056();
			} else if (arg1 == 44) {
				this.anInt7260 = arg0.method3056();
			} else if (arg1 == 45) {
				this.anInt7296 = arg0.method3056();
			} else if (arg1 == 46) {
				this.anInt7272 = arg0.method3056();
			} else if (arg1 == 47) {
				this.anInt7299 = arg0.method3056();
			} else if (arg1 == 48) {
				this.anInt7273 = arg0.method3056();
			} else if (arg1 == 49) {
				this.anInt7291 = arg0.method3056();
			} else if (arg1 == 50) {
				this.anInt7274 = arg0.method3056();
			} else if (arg1 == 51) {
				this.anInt7283 = arg0.method3056();
			} else if (arg1 == 52) {
				local85 = arg0.method3043();
				this.anIntArray573 = new int[local85];
				this.anIntArray572 = new int[local85];
				for (local93 = 0; local93 < local85; local93++) {
					this.anIntArray573[local93] = arg0.method3056();
					@Pc(384) int local384 = arg0.method3043();
					this.anIntArray572[local93] = local384;
					this.anInt7301 += local384;
				}
			} else if (arg1 == 53) {
				this.aBoolean480 = false;
			} else if (arg1 == 54) {
				this.anInt7275 = arg0.method3043() << 6;
				this.anInt7271 = arg0.method3043() << 6;
			}
		}
	}
}
