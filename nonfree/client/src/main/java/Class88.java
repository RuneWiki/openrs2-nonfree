import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class88 {

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "[I")
	public int[] anIntArray220;

	@OriginalMember(owner = "client!hl", name = "z", descriptor = "[[I")
	public int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
	public int anInt2273 = 0;

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
	public int anInt2276 = -1;

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
	public int anInt2282 = 0;

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
	public int anInt2279 = -1;

	@OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
	public int anInt2287 = -1;

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
	public int anInt2280 = -1;

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
	public int anInt2272 = -1;

	@OriginalMember(owner = "client!hl", name = "E", descriptor = "I")
	public int anInt2296 = -1;

	@OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
	public int anInt2286 = -1;

	@OriginalMember(owner = "client!hl", name = "y", descriptor = "I")
	private int anInt2291 = 0;

	@OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
	public int anInt2288 = -1;

	@OriginalMember(owner = "client!hl", name = "w", descriptor = "I")
	public int anInt2289 = 0;

	@OriginalMember(owner = "client!hl", name = "F", descriptor = "I")
	public int anInt2297 = -1;

	@OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
	public int anInt2284 = -1;

	@OriginalMember(owner = "client!hl", name = "I", descriptor = "I")
	public int anInt2300 = 0;

	@OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
	public int anInt2302 = 0;

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
	public int anInt2274 = 0;

	@OriginalMember(owner = "client!hl", name = "N", descriptor = "I")
	public int anInt2305 = -1;

	@OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
	public int anInt2301 = -1;

	@OriginalMember(owner = "client!hl", name = "B", descriptor = "I")
	public int anInt2293 = 0;

	@OriginalMember(owner = "client!hl", name = "H", descriptor = "I")
	public int anInt2299 = -1;

	@OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
	public int anInt2303 = -1;

	@OriginalMember(owner = "client!hl", name = "M", descriptor = "I")
	public int anInt2304 = 0;

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
	public int anInt2271 = -1;

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
	public int anInt2275 = -1;

	@OriginalMember(owner = "client!hl", name = "S", descriptor = "I")
	public int anInt2309 = -1;

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
	public int anInt2281 = -1;

	@OriginalMember(owner = "client!hl", name = "x", descriptor = "I")
	public int anInt2290 = -1;

	@OriginalMember(owner = "client!hl", name = "R", descriptor = "I")
	public int anInt2308 = -1;

	@OriginalMember(owner = "client!hl", name = "X", descriptor = "[I")
	public int[] anIntArray223 = null;

	@OriginalMember(owner = "client!hl", name = "V", descriptor = "[I")
	public int[] anIntArray222 = null;

	@OriginalMember(owner = "client!hl", name = "P", descriptor = "I")
	public int anInt2307 = -1;

	@OriginalMember(owner = "client!hl", name = "U", descriptor = "I")
	public int anInt2311 = -1;

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
	public int anInt2278 = -1;

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
	public int anInt2283 = 0;

	@OriginalMember(owner = "client!hl", name = "Q", descriptor = "Z")
	public boolean aBoolean173 = true;

	@OriginalMember(owner = "client!hl", name = "Y", descriptor = "I")
	public int anInt2313 = 0;

	@OriginalMember(owner = "client!hl", name = "Z", descriptor = "I")
	public int anInt2314 = -1;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!rg;)V")
	public void method2140(@OriginalArg(1) Class5_Sub12 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method5115();
			if (local3 == 0) {
				return;
			}
			this.method2141(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBLclient!rg;)V")
	private void method2141(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt2296 = arg1.method5106();
			this.anInt2287 = arg1.method5106();
			if (this.anInt2296 == 65535) {
				this.anInt2296 = -1;
			}
			if (this.anInt2287 == 65535) {
				this.anInt2287 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt2276 = arg1.method5106();
		} else if (arg0 == 3) {
			this.anInt2308 = arg1.method5106();
		} else if (arg0 == 4) {
			this.anInt2305 = arg1.method5106();
		} else if (arg0 == 5) {
			this.anInt2314 = arg1.method5106();
		} else if (arg0 == 6) {
			this.anInt2272 = arg1.method5106();
		} else if (arg0 == 7) {
			this.anInt2286 = arg1.method5106();
		} else if (arg0 == 8) {
			this.anInt2275 = arg1.method5106();
		} else if (arg0 == 9) {
			this.anInt2290 = arg1.method5106();
		} else if (arg0 == 26) {
			this.anInt2302 = (short) (arg1.method5115() * 4);
			this.anInt2273 = (short) (arg1.method5115() * 4);
		} else {
			@Pc(102) int local102;
			@Pc(110) int local110;
			if (arg0 == 27) {
				if (this.anIntArrayArray41 == null) {
					this.anIntArrayArray41 = new int[12][];
				}
				local102 = arg1.method5115();
				this.anIntArrayArray41[local102] = new int[6];
				for (local110 = 0; local110 < 6; local110++) {
					this.anIntArrayArray41[local102][local110] = arg1.method5066();
				}
			} else if (arg0 == 28) {
				this.anIntArray220 = new int[12];
				for (local102 = 0; local102 < 12; local102++) {
					this.anIntArray220[local102] = arg1.method5115();
					if (this.anIntArray220[local102] == 255) {
						this.anIntArray220[local102] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt2283 = arg1.method5115();
			} else if (arg0 == 30) {
				this.anInt2300 = arg1.method5106();
			} else if (arg0 == 31) {
				this.anInt2304 = arg1.method5115();
			} else if (arg0 == 32) {
				this.anInt2293 = arg1.method5106();
			} else if (arg0 == 33) {
				this.anInt2282 = arg1.method5066();
			} else if (arg0 == 34) {
				this.anInt2274 = arg1.method5115();
			} else if (arg0 == 35) {
				this.anInt2289 = arg1.method5106();
			} else if (arg0 == 36) {
				this.anInt2313 = arg1.method5066();
			} else if (arg0 == 37) {
				this.anInt2303 = arg1.method5115();
			} else if (arg0 == 38) {
				this.anInt2284 = arg1.method5106();
			} else if (arg0 == 39) {
				this.anInt2271 = arg1.method5106();
			} else if (arg0 == 40) {
				this.anInt2297 = arg1.method5106();
			} else if (arg0 == 41) {
				this.anInt2288 = arg1.method5106();
			} else if (arg0 == 42) {
				this.anInt2281 = arg1.method5106();
			} else if (arg0 == 43) {
				arg1.method5106();
			} else if (arg0 == 44) {
				this.anInt2278 = arg1.method5106();
			} else if (arg0 == 45) {
				this.anInt2307 = arg1.method5106();
			} else if (arg0 == 46) {
				this.anInt2280 = arg1.method5106();
			} else if (arg0 == 47) {
				this.anInt2309 = arg1.method5106();
			} else if (arg0 == 48) {
				this.anInt2279 = arg1.method5106();
			} else if (arg0 == 49) {
				this.anInt2301 = arg1.method5106();
			} else if (arg0 == 50) {
				this.anInt2311 = arg1.method5106();
			} else if (arg0 == 51) {
				this.anInt2299 = arg1.method5106();
			} else if (arg0 == 52) {
				local102 = arg1.method5115();
				this.anIntArray223 = new int[local102];
				this.anIntArray222 = new int[local102];
				for (local110 = 0; local110 < local102; local110++) {
					this.anIntArray222[local110] = arg1.method5106();
					@Pc(320) int local320 = arg1.method5115();
					this.anIntArray223[local110] = local320;
					this.anInt2291 += local320;
				}
			} else if (arg0 == 53) {
				this.aBoolean173 = false;
			}
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB)Z")
	public boolean method2143(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt2296) {
			return true;
		} else {
			if (this.anIntArray222 != null) {
				for (@Pc(26) int local26 = 0; local26 < this.anIntArray222.length; local26++) {
					if (this.anIntArray222[local26] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)I")
	public int method2144() {
		if (this.anInt2296 != -1) {
			return this.anInt2296;
		} else if (this.anIntArray222 == null) {
			return -1;
		} else {
			@Pc(25) int local25 = (int) (Math.random() * (double) this.anInt2291);
			@Pc(27) int local27;
			for (local27 = 0; this.anIntArray223[local27] <= local25; local27++) {
				local25 -= this.anIntArray223[local27];
			}
			return this.anIntArray222[local27];
		}
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V")
	public void method2145() {
	}
}
