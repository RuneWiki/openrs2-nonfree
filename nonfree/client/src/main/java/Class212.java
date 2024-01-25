import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class212 {

	@OriginalMember(owner = "client!qv", name = "k", descriptor = "[I")
	public int[] anIntArray586;

	@OriginalMember(owner = "client!qv", name = "Q", descriptor = "[[I")
	public int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!qv", name = "h", descriptor = "I")
	public int anInt6251 = -1;

	@OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
	public int anInt6249 = 0;

	@OriginalMember(owner = "client!qv", name = "j", descriptor = "I")
	public int anInt6253 = -1;

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
	public int anInt6247 = -1;

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
	public int anInt6246 = -1;

	@OriginalMember(owner = "client!qv", name = "w", descriptor = "I")
	public int anInt6264 = 0;

	@OriginalMember(owner = "client!qv", name = "p", descriptor = "I")
	public int anInt6258 = 0;

	@OriginalMember(owner = "client!qv", name = "C", descriptor = "I")
	public int anInt6270 = -1;

	@OriginalMember(owner = "client!qv", name = "l", descriptor = "I")
	public int anInt6254 = -1;

	@OriginalMember(owner = "client!qv", name = "n", descriptor = "I")
	public int anInt6256 = 0;

	@OriginalMember(owner = "client!qv", name = "t", descriptor = "Z")
	public boolean aBoolean398 = true;

	@OriginalMember(owner = "client!qv", name = "m", descriptor = "I")
	public int anInt6255 = 0;

	@OriginalMember(owner = "client!qv", name = "x", descriptor = "I")
	public int anInt6265 = -1;

	@OriginalMember(owner = "client!qv", name = "q", descriptor = "I")
	public int anInt6259 = -1;

	@OriginalMember(owner = "client!qv", name = "r", descriptor = "I")
	public int anInt6260 = -1;

	@OriginalMember(owner = "client!qv", name = "B", descriptor = "I")
	public int anInt6269 = 0;

	@OriginalMember(owner = "client!qv", name = "z", descriptor = "I")
	public int anInt6267 = -1;

	@OriginalMember(owner = "client!qv", name = "L", descriptor = "I")
	public int anInt6278 = -1;

	@OriginalMember(owner = "client!qv", name = "I", descriptor = "[I")
	public int[] anIntArray587 = null;

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
	public int anInt6250 = -1;

	@OriginalMember(owner = "client!qv", name = "E", descriptor = "I")
	public int anInt6272 = 0;

	@OriginalMember(owner = "client!qv", name = "J", descriptor = "I")
	public int anInt6276 = -1;

	@OriginalMember(owner = "client!qv", name = "M", descriptor = "I")
	public int anInt6279 = 0;

	@OriginalMember(owner = "client!qv", name = "P", descriptor = "I")
	public int anInt6282 = -1;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
	public int anInt6245 = -1;

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
	public int anInt6248 = -1;

	@OriginalMember(owner = "client!qv", name = "V", descriptor = "I")
	public int anInt6286 = 0;

	@OriginalMember(owner = "client!qv", name = "v", descriptor = "I")
	public int anInt6263 = -1;

	@OriginalMember(owner = "client!qv", name = "N", descriptor = "I")
	public int anInt6280 = -1;

	@OriginalMember(owner = "client!qv", name = "X", descriptor = "I")
	public int anInt6287 = -1;

	@OriginalMember(owner = "client!qv", name = "R", descriptor = "I")
	public int anInt6283 = -1;

	@OriginalMember(owner = "client!qv", name = "u", descriptor = "I")
	private int anInt6262 = 0;

	@OriginalMember(owner = "client!qv", name = "H", descriptor = "I")
	public int anInt6275 = -1;

	@OriginalMember(owner = "client!qv", name = "U", descriptor = "[I")
	public int[] anIntArray588 = null;

	@OriginalMember(owner = "client!qv", name = "Z", descriptor = "I")
	public int anInt6289 = 0;

	@OriginalMember(owner = "client!qv", name = "o", descriptor = "I")
	public int anInt6257 = -1;

	@OriginalMember(owner = "client!qv", name = "A", descriptor = "I")
	public int anInt6268 = 0;

	@OriginalMember(owner = "client!qv", name = "fb", descriptor = "I")
	public int anInt6295 = 0;

	@OriginalMember(owner = "client!qv", name = "Y", descriptor = "I")
	public int anInt6288 = -1;

	@OriginalMember(owner = "client!qv", name = "bb", descriptor = "I")
	public int anInt6291 = -1;

	@OriginalMember(owner = "client!qv", name = "db", descriptor = "I")
	public int anInt6293 = -1;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILclient!ia;B)V")
	private void method4806(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt6263 = arg1.method1177();
			this.anInt6282 = arg1.method1177();
			if (this.anInt6282 == 65535) {
				this.anInt6282 = -1;
			}
			if (this.anInt6263 == 65535) {
				this.anInt6263 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt6275 = arg1.method1177();
		} else if (arg0 == 3) {
			this.anInt6259 = arg1.method1177();
		} else if (arg0 == 4) {
			this.anInt6245 = arg1.method1177();
		} else if (arg0 == 5) {
			this.anInt6280 = arg1.method1177();
		} else if (arg0 == 6) {
			this.anInt6253 = arg1.method1177();
		} else if (arg0 == 7) {
			this.anInt6267 = arg1.method1177();
		} else if (arg0 == 8) {
			this.anInt6278 = arg1.method1177();
		} else if (arg0 == 9) {
			this.anInt6291 = arg1.method1177();
		} else if (arg0 == 26) {
			this.anInt6249 = (short) (arg1.method1171() * 4);
			this.anInt6264 = (short) (arg1.method1171() * 4);
		} else {
			@Pc(100) int local100;
			@Pc(108) int local108;
			if (arg0 == 27) {
				if (this.anIntArrayArray49 == null) {
					this.anIntArrayArray49 = new int[12][];
				}
				local100 = arg1.method1171();
				this.anIntArrayArray49[local100] = new int[6];
				for (local108 = 0; local108 < 6; local108++) {
					this.anIntArrayArray49[local100][local108] = arg1.method1215();
				}
			} else if (arg0 == 28) {
				this.anIntArray586 = new int[12];
				for (local100 = 0; local100 < 12; local100++) {
					this.anIntArray586[local100] = arg1.method1171();
					if (this.anIntArray586[local100] == 255) {
						this.anIntArray586[local100] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt6269 = arg1.method1171();
			} else if (arg0 == 30) {
				this.anInt6258 = arg1.method1177();
			} else if (arg0 == 31) {
				this.anInt6272 = arg1.method1171();
			} else if (arg0 == 32) {
				this.anInt6279 = arg1.method1177();
			} else if (arg0 == 33) {
				this.anInt6268 = arg1.method1215();
			} else if (arg0 == 34) {
				this.anInt6256 = arg1.method1171();
			} else if (arg0 == 35) {
				this.anInt6255 = arg1.method1177();
			} else if (arg0 == 36) {
				this.anInt6286 = arg1.method1215();
			} else if (arg0 == 37) {
				this.anInt6265 = arg1.method1171();
			} else if (arg0 == 38) {
				this.anInt6257 = arg1.method1177();
			} else if (arg0 == 39) {
				this.anInt6288 = arg1.method1177();
			} else if (arg0 == 40) {
				this.anInt6248 = arg1.method1177();
			} else if (arg0 == 41) {
				this.anInt6260 = arg1.method1177();
			} else if (arg0 == 42) {
				this.anInt6287 = arg1.method1177();
			} else if (arg0 == 43) {
				this.anInt6283 = arg1.method1177();
			} else if (arg0 == 44) {
				this.anInt6247 = arg1.method1177();
			} else if (arg0 == 45) {
				this.anInt6246 = arg1.method1177();
			} else if (arg0 == 46) {
				this.anInt6276 = arg1.method1177();
			} else if (arg0 == 47) {
				this.anInt6254 = arg1.method1177();
			} else if (arg0 == 48) {
				this.anInt6251 = arg1.method1177();
			} else if (arg0 == 49) {
				this.anInt6293 = arg1.method1177();
			} else if (arg0 == 50) {
				this.anInt6250 = arg1.method1177();
			} else if (arg0 == 51) {
				this.anInt6270 = arg1.method1177();
			} else if (arg0 == 52) {
				local100 = arg1.method1171();
				this.anIntArray588 = new int[local100];
				this.anIntArray587 = new int[local100];
				for (local108 = 0; local108 < local100; local108++) {
					this.anIntArray588[local108] = arg1.method1177();
					@Pc(376) int local376 = arg1.method1171();
					this.anIntArray587[local108] = local376;
					this.anInt6262 += local376;
				}
			} else if (arg0 == 53) {
				this.aBoolean398 = false;
			} else if (arg0 == 54) {
				this.anInt6289 = arg1.method1171() << 6;
				this.anInt6295 = arg1.method1171() << 6;
			}
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)I")
	public int method4811() {
		if (this.anInt6263 != -1) {
			return this.anInt6263;
		} else if (this.anIntArray588 == null) {
			return -1;
		} else {
			@Pc(28) int local28 = (int) ((double) this.anInt6262 * Math.random());
			@Pc(30) int local30;
			for (local30 = 0; local28 >= this.anIntArray587[local30]; local30++) {
				local28 -= this.anIntArray587[local30];
			}
			return this.anIntArray588[local30];
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IB)Z")
	public boolean method4812(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt6263) {
			return true;
		} else {
			if (this.anIntArray588 != null) {
				for (@Pc(30) int local30 = 0; local30 < this.anIntArray588.length; local30++) {
					if (arg0 == this.anIntArray588[local30]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILclient!ia;)V")
	public void method4814(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1171();
			if (local3 == 0) {
				return;
			}
			this.method4806(local3, arg0);
		}
	}
}
