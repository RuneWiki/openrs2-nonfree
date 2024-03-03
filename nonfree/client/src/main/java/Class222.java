import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class222 {

	@OriginalMember(owner = "client!ti", name = "L", descriptor = "[B")
	public static final byte[] aByteArray92 = new byte[2048];

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "Lclient!hu;")
	public static final Class98 aClass98_57 = new Class98(200);

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "[I")
	public int[] anIntArray425;

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
	public int anInt6258 = -1;

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
	public int anInt6263 = -1;

	@OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
	private int anInt6267 = 0;

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
	public int anInt6260 = -1;

	@OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
	public int anInt6270 = -1;

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
	public int anInt6265 = -1;

	@OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
	public int anInt6266 = 0;

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
	public int anInt6261 = -1;

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
	public int anInt6254 = 0;

	@OriginalMember(owner = "client!ti", name = "E", descriptor = "I")
	public int anInt6275 = 0;

	@OriginalMember(owner = "client!ti", name = "F", descriptor = "I")
	public int anInt6276 = -1;

	@OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
	public int anInt6269 = 0;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
	public int anInt6251 = -1;

	@OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
	public int anInt6279 = -1;

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
	public int anInt6253 = -1;

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
	public int anInt6262 = -1;

	@OriginalMember(owner = "client!ti", name = "J", descriptor = "Z")
	public boolean aBoolean424 = true;

	@OriginalMember(owner = "client!ti", name = "z", descriptor = "[I")
	public int[] anIntArray426 = null;

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
	public int anInt6252 = -1;

	@OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
	public int anInt6274 = -1;

	@OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
	public int anInt6271 = 0;

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
	public int anInt6255 = -1;

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
	public int anInt6256 = -1;

	@OriginalMember(owner = "client!ti", name = "B", descriptor = "[I")
	public int[] anIntArray427 = null;

	@OriginalMember(owner = "client!ti", name = "K", descriptor = "I")
	public int anInt6280 = -1;

	@OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
	public int anInt6272 = -1;

	@OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
	public int anInt6284 = -1;

	@OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
	public int anInt6285 = -1;

	@OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
	public int anInt6268 = 0;

	@OriginalMember(owner = "client!ti", name = "T", descriptor = "I")
	public int anInt6287 = -1;

	@OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
	public int anInt6278 = 0;

	@OriginalMember(owner = "client!ti", name = "U", descriptor = "I")
	public int anInt6288 = 0;

	@OriginalMember(owner = "client!ti", name = "M", descriptor = "I")
	public int anInt6281 = -1;

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
	public int anInt6259 = -1;

	@OriginalMember(owner = "client!ti", name = "X", descriptor = "I")
	public int anInt6291 = 0;

	@OriginalMember(owner = "client!ti", name = "Y", descriptor = "I")
	public int anInt6292 = -1;

	@OriginalMember(owner = "client!ti", name = "V", descriptor = "I")
	public int anInt6289 = -1;

	@OriginalMember(owner = "client!ti", name = "W", descriptor = "I")
	public int anInt6290 = 0;

	@OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
	public int anInt6283 = -1;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!bt;I)V", line = 4)
	public void method5691(@OriginalArg(0) Class2_Sub4 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4816();
			if (local13 == 0) {
				return;
			}
			this.method5692(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!bt;I)V", line = 31)
	private void method5692(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt6279 = arg1.method4830();
			this.anInt6258 = arg1.method4830();
			if (this.anInt6279 == 65535) {
				this.anInt6279 = -1;
			}
			if (this.anInt6258 == 65535) {
				this.anInt6258 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt6253 = arg1.method4830();
		} else if (arg0 == 3) {
			this.anInt6287 = arg1.method4830();
		} else if (arg0 == 4) {
			this.anInt6272 = arg1.method4830();
		} else if (arg0 == 5) {
			this.anInt6255 = arg1.method4830();
		} else if (arg0 == 6) {
			this.anInt6251 = arg1.method4830();
		} else if (arg0 == 7) {
			this.anInt6280 = arg1.method4830();
		} else if (arg0 == 8) {
			this.anInt6259 = arg1.method4830();
		} else if (arg0 == 9) {
			this.anInt6289 = arg1.method4830();
		} else if (arg0 == 26) {
			this.anInt6275 = (short) (arg1.method4816() * 4);
			this.anInt6278 = (short) (arg1.method4816() * 4);
		} else {
			@Pc(137) int local137;
			@Pc(335) int local335;
			if (arg0 == 27) {
				if (this.anIntArrayArray53 == null) {
					this.anIntArrayArray53 = new int[12][];
				}
				local137 = arg1.method4816();
				this.anIntArrayArray53[local137] = new int[6];
				for (local335 = 0; local335 < 6; local335++) {
					this.anIntArrayArray53[local137][local335] = arg1.method4824();
				}
			} else if (arg0 == 28) {
				this.anIntArray425 = new int[12];
				for (local137 = 0; local137 < 12; local137++) {
					this.anIntArray425[local137] = arg1.method4816();
					if (this.anIntArray425[local137] == 255) {
						this.anIntArray425[local137] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt6254 = arg1.method4816();
			} else if (arg0 == 30) {
				this.anInt6288 = arg1.method4830();
			} else if (arg0 == 31) {
				this.anInt6290 = arg1.method4816();
			} else if (arg0 == 32) {
				this.anInt6266 = arg1.method4830();
			} else if (arg0 == 33) {
				this.anInt6269 = arg1.method4824();
			} else if (arg0 == 34) {
				this.anInt6291 = arg1.method4816();
			} else if (arg0 == 35) {
				this.anInt6268 = arg1.method4830();
			} else if (arg0 == 36) {
				this.anInt6271 = arg1.method4824();
			} else if (arg0 == 37) {
				this.anInt6262 = arg1.method4816();
			} else if (arg0 == 38) {
				this.anInt6274 = arg1.method4830();
			} else if (arg0 == 39) {
				this.anInt6261 = arg1.method4830();
			} else if (arg0 == 40) {
				this.anInt6281 = arg1.method4830();
			} else if (arg0 == 41) {
				this.anInt6256 = arg1.method4830();
			} else if (arg0 == 42) {
				this.anInt6284 = arg1.method4830();
			} else if (arg0 == 43) {
				this.anInt6292 = arg1.method4830();
			} else if (arg0 == 44) {
				this.anInt6276 = arg1.method4830();
			} else if (arg0 == 45) {
				this.anInt6260 = arg1.method4830();
			} else if (arg0 == 46) {
				this.anInt6285 = arg1.method4830();
			} else if (arg0 == 47) {
				this.anInt6283 = arg1.method4830();
			} else if (arg0 == 48) {
				this.anInt6252 = arg1.method4830();
			} else if (arg0 == 49) {
				this.anInt6263 = arg1.method4830();
			} else if (arg0 == 50) {
				this.anInt6265 = arg1.method4830();
			} else if (arg0 == 51) {
				this.anInt6270 = arg1.method4830();
			} else if (arg0 == 52) {
				local137 = arg1.method4816();
				this.anIntArray426 = new int[local137];
				this.anIntArray427 = new int[local137];
				for (local335 = 0; local335 < local137; local335++) {
					this.anIntArray426[local335] = arg1.method4830();
					@Pc(348) int local348 = arg1.method4816();
					this.anIntArray427[local335] = local348;
					this.anInt6267 += local348;
				}
			} else if (arg0 == 53) {
				this.aBoolean424 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)Z", line = 256)
	public boolean method5693(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt6279 == arg0) {
			return true;
		} else {
			if (this.anIntArray426 != null) {
				for (@Pc(32) int local32 = 0; local32 < this.anIntArray426.length; local32++) {
					if (arg0 == this.anIntArray426[local32]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)I", line = 553)
	public int method5697() {
		if (this.anInt6279 != -1) {
			return this.anInt6279;
		} else if (this.anIntArray426 == null) {
			return -1;
		} else {
			@Pc(28) int local28 = (int) ((double) this.anInt6267 * Math.random());
			@Pc(30) int local30;
			for (local30 = 0; local28 >= this.anIntArray427[local30]; local30++) {
				local28 -= this.anIntArray427[local30];
			}
			return this.anIntArray426[local30];
		}
	}
}
