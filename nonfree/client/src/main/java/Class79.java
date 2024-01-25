import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class79 {

	@OriginalMember(owner = "client!g", name = "D", descriptor = "[I")
	public int[] anIntArray324;

	@OriginalMember(owner = "client!g", name = "M", descriptor = "[[I")
	public int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "[I")
	private int[] anIntArray322 = null;

	@OriginalMember(owner = "client!g", name = "m", descriptor = "I")
	public int anInt2361 = -1;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "I")
	public int anInt2359 = -1;

	@OriginalMember(owner = "client!g", name = "o", descriptor = "I")
	public int anInt2363 = -1;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	public int anInt2352 = -1;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "I")
	public int anInt2353 = -1;

	@OriginalMember(owner = "client!g", name = "r", descriptor = "[I")
	private int[] anIntArray323 = null;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "I")
	public int anInt2360 = 0;

	@OriginalMember(owner = "client!g", name = "t", descriptor = "I")
	public int anInt2367 = -1;

	@OriginalMember(owner = "client!g", name = "u", descriptor = "I")
	public int anInt2368 = -1;

	@OriginalMember(owner = "client!g", name = "A", descriptor = "I")
	public int anInt2374 = -1;

	@OriginalMember(owner = "client!g", name = "w", descriptor = "I")
	public int anInt2370 = -1;

	@OriginalMember(owner = "client!g", name = "x", descriptor = "I")
	public int anInt2371 = 0;

	@OriginalMember(owner = "client!g", name = "z", descriptor = "I")
	public int anInt2373 = -1;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "I")
	public int anInt2355 = 0;

	@OriginalMember(owner = "client!g", name = "C", descriptor = "I")
	public int anInt2376 = -1;

	@OriginalMember(owner = "client!g", name = "q", descriptor = "I")
	public int anInt2365 = -1;

	@OriginalMember(owner = "client!g", name = "v", descriptor = "I")
	public int anInt2369 = 0;

	@OriginalMember(owner = "client!g", name = "s", descriptor = "I")
	public int anInt2366 = 0;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "I")
	public int anInt2357 = -1;

	@OriginalMember(owner = "client!g", name = "p", descriptor = "I")
	public int anInt2364 = 0;

	@OriginalMember(owner = "client!g", name = "K", descriptor = "I")
	public int anInt2382 = -1;

	@OriginalMember(owner = "client!g", name = "E", descriptor = "I")
	public int anInt2377 = -1;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	public int anInt2354 = -1;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "I")
	public int anInt2351 = -1;

	@OriginalMember(owner = "client!g", name = "N", descriptor = "Z")
	public boolean aBoolean163 = true;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "I")
	public int anInt2358 = 0;

	@OriginalMember(owner = "client!g", name = "y", descriptor = "I")
	public int anInt2372 = -1;

	@OriginalMember(owner = "client!g", name = "L", descriptor = "I")
	private int anInt2383 = 0;

	@OriginalMember(owner = "client!g", name = "I", descriptor = "I")
	public int anInt2380 = -1;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "I")
	public int anInt2356 = -1;

	@OriginalMember(owner = "client!g", name = "S", descriptor = "I")
	public int anInt2387 = 0;

	@OriginalMember(owner = "client!g", name = "O", descriptor = "I")
	public int anInt2384 = -1;

	@OriginalMember(owner = "client!g", name = "R", descriptor = "I")
	public int anInt2386 = 0;

	@OriginalMember(owner = "client!g", name = "G", descriptor = "I")
	public int anInt2378 = -1;

	@OriginalMember(owner = "client!g", name = "V", descriptor = "I")
	public int anInt2390 = -1;

	@OriginalMember(owner = "client!g", name = "X", descriptor = "I")
	public int anInt2392 = 0;

	@OriginalMember(owner = "client!g", name = "Q", descriptor = "I")
	public int anInt2385 = -1;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public void method1979() {
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!ap;I)V")
	public void method1980(@OriginalArg(0) Class7_Sub3 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2772();
			if (local7 == 0) {
				return;
			}
			this.method1981(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLclient!ap;I)V")
	private void method1981(@OriginalArg(1) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2373 = arg0.method2764();
			this.anInt2352 = arg0.method2764();
			if (this.anInt2352 == 65535) {
				this.anInt2352 = -1;
			}
			if (this.anInt2373 == 65535) {
				this.anInt2373 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt2374 = arg0.method2764();
		} else if (arg1 == 3) {
			this.anInt2356 = arg0.method2764();
		} else if (arg1 == 4) {
			this.anInt2390 = arg0.method2764();
		} else if (arg1 == 5) {
			this.anInt2372 = arg0.method2764();
		} else if (arg1 == 6) {
			this.anInt2385 = arg0.method2764();
		} else if (arg1 == 7) {
			this.anInt2351 = arg0.method2764();
		} else if (arg1 == 8) {
			this.anInt2357 = arg0.method2764();
		} else if (arg1 == 9) {
			this.anInt2376 = arg0.method2764();
		} else if (arg1 == 26) {
			this.anInt2392 = (short) (arg0.method2772() * 4);
			this.anInt2366 = (short) (arg0.method2772() * 4);
		} else {
			@Pc(125) int local125;
			@Pc(321) int local321;
			if (arg1 == 27) {
				if (this.anIntArrayArray21 == null) {
					this.anIntArrayArray21 = new int[12][];
				}
				local125 = arg0.method2772();
				this.anIntArrayArray21[local125] = new int[6];
				for (local321 = 0; local321 < 6; local321++) {
					this.anIntArrayArray21[local125][local321] = arg0.method2744();
				}
			} else if (arg1 == 28) {
				this.anIntArray324 = new int[12];
				for (local125 = 0; local125 < 12; local125++) {
					this.anIntArray324[local125] = arg0.method2772();
					if (this.anIntArray324[local125] == 255) {
						this.anIntArray324[local125] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt2369 = arg0.method2772();
			} else if (arg1 == 30) {
				this.anInt2358 = arg0.method2764();
			} else if (arg1 == 31) {
				this.anInt2364 = arg0.method2772();
			} else if (arg1 == 32) {
				this.anInt2371 = arg0.method2764();
			} else if (arg1 == 33) {
				this.anInt2386 = arg0.method2744();
			} else if (arg1 == 34) {
				this.anInt2360 = arg0.method2772();
			} else if (arg1 == 35) {
				this.anInt2387 = arg0.method2764();
			} else if (arg1 == 36) {
				this.anInt2355 = arg0.method2744();
			} else if (arg1 == 37) {
				this.anInt2359 = arg0.method2772();
			} else if (arg1 == 38) {
				this.anInt2354 = arg0.method2764();
			} else if (arg1 == 39) {
				this.anInt2382 = arg0.method2764();
			} else if (arg1 == 40) {
				this.anInt2353 = arg0.method2764();
			} else if (arg1 == 41) {
				this.anInt2370 = arg0.method2764();
			} else if (arg1 == 42) {
				this.anInt2368 = arg0.method2764();
			} else if (arg1 == 43) {
				arg0.method2764();
			} else if (arg1 == 44) {
				this.anInt2361 = arg0.method2764();
			} else if (arg1 == 45) {
				this.anInt2367 = arg0.method2764();
			} else if (arg1 == 46) {
				this.anInt2384 = arg0.method2764();
			} else if (arg1 == 47) {
				this.anInt2365 = arg0.method2764();
			} else if (arg1 == 48) {
				this.anInt2377 = arg0.method2764();
			} else if (arg1 == 49) {
				this.anInt2380 = arg0.method2764();
			} else if (arg1 == 50) {
				this.anInt2378 = arg0.method2764();
			} else if (arg1 == 51) {
				this.anInt2363 = arg0.method2764();
			} else if (arg1 == 52) {
				local125 = arg0.method2772();
				this.anIntArray323 = new int[local125];
				this.anIntArray322 = new int[local125];
				for (local321 = 0; local321 < local125; local321++) {
					this.anIntArray322[local321] = arg0.method2764();
					@Pc(333) int local333 = arg0.method2772();
					this.anIntArray323[local321] = local333;
					this.anInt2383 += local333;
				}
			} else if (arg1 == 53) {
				this.aBoolean163 = false;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Z")
	public boolean method1984(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt2373) {
			return true;
		} else {
			if (this.anIntArray322 != null) {
				for (@Pc(26) int local26 = 0; local26 < this.anIntArray322.length; local26++) {
					if (this.anIntArray322[local26] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)I")
	public int method1986() {
		if (this.anInt2373 != -1) {
			return this.anInt2373;
		} else if (this.anIntArray322 == null) {
			return -1;
		} else {
			@Pc(20) int local20 = (int) ((double) this.anInt2383 * Math.random());
			@Pc(22) int local22;
			for (local22 = 0; this.anIntArray323[local22] <= local20; local22++) {
				local20 -= this.anIntArray323[local22];
			}
			return this.anIntArray322[local22];
		}
	}
}
