import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class246 {

	@OriginalMember(owner = "client!up", name = "p", descriptor = "[I")
	public int[] anIntArray500;

	@OriginalMember(owner = "client!up", name = "F", descriptor = "[[I")
	public int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!up", name = "d", descriptor = "I")
	public int anInt7296 = -1;

	@OriginalMember(owner = "client!up", name = "f", descriptor = "I")
	public int anInt7298 = 0;

	@OriginalMember(owner = "client!up", name = "e", descriptor = "I")
	public int anInt7297 = -1;

	@OriginalMember(owner = "client!up", name = "g", descriptor = "I")
	public int anInt7299 = 0;

	@OriginalMember(owner = "client!up", name = "k", descriptor = "I")
	public int anInt7303 = -1;

	@OriginalMember(owner = "client!up", name = "C", descriptor = "I")
	public int anInt7319 = -1;

	@OriginalMember(owner = "client!up", name = "c", descriptor = "I")
	public int anInt7295 = -1;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "I")
	public int anInt7293 = -1;

	@OriginalMember(owner = "client!up", name = "u", descriptor = "I")
	public int anInt7311 = -1;

	@OriginalMember(owner = "client!up", name = "b", descriptor = "I")
	public int anInt7294 = 0;

	@OriginalMember(owner = "client!up", name = "s", descriptor = "I")
	public int anInt7309 = -1;

	@OriginalMember(owner = "client!up", name = "q", descriptor = "[I")
	public int[] anIntArray501 = null;

	@OriginalMember(owner = "client!up", name = "x", descriptor = "I")
	public int anInt7314 = -1;

	@OriginalMember(owner = "client!up", name = "l", descriptor = "I")
	public int anInt7304 = -1;

	@OriginalMember(owner = "client!up", name = "r", descriptor = "I")
	public int anInt7308 = -1;

	@OriginalMember(owner = "client!up", name = "D", descriptor = "I")
	public int anInt7320 = 0;

	@OriginalMember(owner = "client!up", name = "t", descriptor = "I")
	public int anInt7310 = 0;

	@OriginalMember(owner = "client!up", name = "i", descriptor = "I")
	public int anInt7301 = 0;

	@OriginalMember(owner = "client!up", name = "j", descriptor = "I")
	public int anInt7302 = -1;

	@OriginalMember(owner = "client!up", name = "I", descriptor = "I")
	public int anInt7323 = -1;

	@OriginalMember(owner = "client!up", name = "M", descriptor = "I")
	public int anInt7327 = -1;

	@OriginalMember(owner = "client!up", name = "G", descriptor = "I")
	public int anInt7322 = -1;

	@OriginalMember(owner = "client!up", name = "T", descriptor = "I")
	public int anInt7333 = -1;

	@OriginalMember(owner = "client!up", name = "P", descriptor = "I")
	public int anInt7329 = 0;

	@OriginalMember(owner = "client!up", name = "B", descriptor = "I")
	public int anInt7318 = -1;

	@OriginalMember(owner = "client!up", name = "E", descriptor = "I")
	public int anInt7321 = 0;

	@OriginalMember(owner = "client!up", name = "y", descriptor = "I")
	public int anInt7315 = -1;

	@OriginalMember(owner = "client!up", name = "o", descriptor = "I")
	public int anInt7307 = 0;

	@OriginalMember(owner = "client!up", name = "z", descriptor = "I")
	public int anInt7316 = -1;

	@OriginalMember(owner = "client!up", name = "R", descriptor = "I")
	public int anInt7331 = -1;

	@OriginalMember(owner = "client!up", name = "X", descriptor = "I")
	public int anInt7335 = 0;

	@OriginalMember(owner = "client!up", name = "H", descriptor = "Z")
	public boolean aBoolean464 = true;

	@OriginalMember(owner = "client!up", name = "V", descriptor = "I")
	public int anInt7334 = -1;

	@OriginalMember(owner = "client!up", name = "Y", descriptor = "I")
	public int anInt7336 = -1;

	@OriginalMember(owner = "client!up", name = "W", descriptor = "[I")
	public int[] anIntArray502 = null;

	@OriginalMember(owner = "client!up", name = "w", descriptor = "I")
	private int anInt7313 = 0;

	@OriginalMember(owner = "client!up", name = "K", descriptor = "I")
	public int anInt7325 = -1;

	@OriginalMember(owner = "client!up", name = "v", descriptor = "I")
	public int anInt7312 = -1;

	@OriginalMember(owner = "client!up", name = "L", descriptor = "I")
	public int anInt7326 = 0;

	@OriginalMember(owner = "client!up", name = "A", descriptor = "I")
	public int anInt7317 = -1;

	@OriginalMember(owner = "client!up", name = "Z", descriptor = "I")
	public int anInt7337 = 0;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!ae;I)V")
	public void method6010(@OriginalArg(0) Class6_Sub1 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method6433();
			if (local15 == 0) {
				return;
			}
			this.method6013(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IILclient!ae;)V")
	private void method6013(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 1) {
			this.anInt7314 = arg1.method6485();
			this.anInt7318 = arg1.method6485();
			if (this.anInt7314 == 65535) {
				this.anInt7314 = -1;
			}
			if (this.anInt7318 == 65535) {
				this.anInt7318 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt7325 = arg1.method6485();
		} else if (arg0 == 3) {
			this.anInt7322 = arg1.method6485();
		} else if (arg0 == 4) {
			this.anInt7308 = arg1.method6485();
		} else if (arg0 == 5) {
			this.anInt7327 = arg1.method6485();
		} else if (arg0 == 6) {
			this.anInt7296 = arg1.method6485();
		} else if (arg0 == 7) {
			this.anInt7311 = arg1.method6485();
		} else if (arg0 == 8) {
			this.anInt7315 = arg1.method6485();
		} else if (arg0 == 9) {
			this.anInt7293 = arg1.method6485();
		} else if (arg0 == 26) {
			this.anInt7335 = (short) (arg1.method6433() * 4);
			this.anInt7320 = (short) (arg1.method6433() * 4);
		} else {
			@Pc(248) int local248;
			@Pc(258) int local258;
			if (arg0 == 27) {
				if (this.anIntArrayArray51 == null) {
					this.anIntArrayArray51 = new int[12][];
				}
				local248 = arg1.method6433();
				this.anIntArrayArray51[local248] = new int[6];
				for (local258 = 0; local258 < 6; local258++) {
					this.anIntArrayArray51[local248][local258] = arg1.method6428();
				}
			} else if (arg0 == 28) {
				this.anIntArray500 = new int[12];
				for (local248 = 0; local248 < 12; local248++) {
					this.anIntArray500[local248] = arg1.method6433();
					if (this.anIntArray500[local248] == 255) {
						this.anIntArray500[local248] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt7329 = arg1.method6433();
			} else if (arg0 == 30) {
				this.anInt7337 = arg1.method6485();
			} else if (arg0 == 31) {
				this.anInt7310 = arg1.method6433();
			} else if (arg0 == 32) {
				this.anInt7298 = arg1.method6485();
			} else if (arg0 == 33) {
				this.anInt7301 = arg1.method6428();
			} else if (arg0 == 34) {
				this.anInt7307 = arg1.method6433();
			} else if (arg0 == 35) {
				this.anInt7294 = arg1.method6485();
			} else if (arg0 == 36) {
				this.anInt7326 = arg1.method6428();
			} else if (arg0 == 37) {
				this.anInt7295 = arg1.method6433();
			} else if (arg0 == 38) {
				this.anInt7319 = arg1.method6485();
			} else if (arg0 == 39) {
				this.anInt7323 = arg1.method6485();
			} else if (arg0 == 40) {
				this.anInt7336 = arg1.method6485();
			} else if (arg0 == 41) {
				this.anInt7334 = arg1.method6485();
			} else if (arg0 == 42) {
				this.anInt7304 = arg1.method6485();
			} else if (arg0 == 43) {
				this.anInt7331 = arg1.method6485();
			} else if (arg0 == 44) {
				this.anInt7303 = arg1.method6485();
			} else if (arg0 == 45) {
				this.anInt7312 = arg1.method6485();
			} else if (arg0 == 46) {
				this.anInt7333 = arg1.method6485();
			} else if (arg0 == 47) {
				this.anInt7316 = arg1.method6485();
			} else if (arg0 == 48) {
				this.anInt7317 = arg1.method6485();
			} else if (arg0 == 49) {
				this.anInt7302 = arg1.method6485();
			} else if (arg0 == 50) {
				this.anInt7297 = arg1.method6485();
			} else if (arg0 == 51) {
				this.anInt7309 = arg1.method6485();
			} else if (arg0 == 52) {
				local248 = arg1.method6433();
				this.anIntArray501 = new int[local248];
				this.anIntArray502 = new int[local248];
				for (local258 = 0; local258 < local248; local258++) {
					this.anIntArray501[local258] = arg1.method6485();
					@Pc(271) int local271 = arg1.method6433();
					this.anIntArray502[local258] = local271;
					this.anInt7313 += local271;
				}
			} else if (arg0 == 53) {
				this.aBoolean464 = false;
				return;
			} else if (arg0 == 54) {
				this.anInt7299 = arg1.method6433() << 6;
				this.anInt7321 = arg1.method6433() << 6;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II)Z")
	public boolean method6014(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt7314 == arg0) {
			return true;
		} else {
			if (this.anIntArray501 != null) {
				for (@Pc(27) int local27 = 0; local27 < this.anIntArray501.length; local27++) {
					if (arg0 == this.anIntArray501[local27]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)I")
	public int method6015() {
		if (this.anInt7314 != -1) {
			return this.anInt7314;
		} else if (this.anIntArray501 == null) {
			return -1;
		} else {
			@Pc(30) int local30 = (int) (Math.random() * (double) this.anInt7313);
			@Pc(32) int local32;
			for (local32 = 0; this.anIntArray502[local32] <= local30; local32++) {
				local30 -= this.anIntArray502[local32];
			}
			return this.anIntArray501[local32];
		}
	}
}
