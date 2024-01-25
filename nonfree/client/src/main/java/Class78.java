import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class78 {

	@OriginalMember(owner = "client!fh", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!fh", name = "G", descriptor = "[I")
	public int[] anIntArray158;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
	public int anInt2256 = -1;

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
	public int anInt2268 = -1;

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
	public int anInt2267 = -1;

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
	public int anInt2260 = -1;

	@OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
	public int anInt2281 = 0;

	@OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
	public int anInt2275 = -1;

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
	public int anInt2273 = -1;

	@OriginalMember(owner = "client!fh", name = "C", descriptor = "I")
	public int anInt2282 = 0;

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "Z")
	public boolean aBoolean123 = true;

	@OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
	public int anInt2276 = 0;

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
	public int anInt2272 = -1;

	@OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
	public int anInt2288 = -1;

	@OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
	public int anInt2283 = -1;

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
	public int anInt2259 = -1;

	@OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
	public int anInt2285 = 0;

	@OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
	public int anInt2289 = -1;

	@OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
	public int anInt2284 = -1;

	@OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
	public int anInt2277 = -1;

	@OriginalMember(owner = "client!fh", name = "H", descriptor = "I")
	public int anInt2286 = -1;

	@OriginalMember(owner = "client!fh", name = "P", descriptor = "I")
	public int anInt2293 = -1;

	@OriginalMember(owner = "client!fh", name = "V", descriptor = "I")
	public int anInt2296 = -1;

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
	public int anInt2257 = 0;

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
	public int anInt2274 = -1;

	@OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
	public int anInt2279 = 0;

	@OriginalMember(owner = "client!fh", name = "T", descriptor = "I")
	public int anInt2294 = -1;

	@OriginalMember(owner = "client!fh", name = "Y", descriptor = "I")
	public int anInt2298 = -1;

	@OriginalMember(owner = "client!fh", name = "X", descriptor = "I")
	public int anInt2297 = -1;

	@OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
	public int anInt2280 = -1;

	@OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
	public int anInt2271 = 0;

	@OriginalMember(owner = "client!fh", name = "W", descriptor = "[I")
	public int[] anIntArray160 = null;

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
	public int anInt2262 = 0;

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
	public int anInt2263 = -1;

	@OriginalMember(owner = "client!fh", name = "U", descriptor = "I")
	public int anInt2295 = 0;

	@OriginalMember(owner = "client!fh", name = "ab", descriptor = "I")
	public int anInt2300 = 0;

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
	public int anInt2265 = -1;

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
	public int anInt2264 = -1;

	@OriginalMember(owner = "client!fh", name = "R", descriptor = "[I")
	public int[] anIntArray159 = null;

	@OriginalMember(owner = "client!fh", name = "J", descriptor = "I")
	public int anInt2287 = 0;

	@OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
	public int anInt2290 = 0;

	@OriginalMember(owner = "client!fh", name = "N", descriptor = "I")
	public int anInt2291 = -1;

	@OriginalMember(owner = "client!fh", name = "bb", descriptor = "I")
	private int anInt2301 = 0;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!gk;II)V")
	private void method1921(@OriginalArg(0) Class7_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2267 = arg0.method3943();
			this.anInt2259 = arg0.method3943();
			if (this.anInt2259 == 65535) {
				this.anInt2259 = -1;
			}
			if (this.anInt2267 == 65535) {
				this.anInt2267 = -1;
				return;
			}
		} else if (arg1 == 2) {
			this.anInt2273 = arg0.method3943();
		} else if (arg1 == 3) {
			this.anInt2268 = arg0.method3943();
			return;
		} else if (arg1 == 4) {
			this.anInt2296 = arg0.method3943();
			return;
		} else if (arg1 == 5) {
			this.anInt2272 = arg0.method3943();
			return;
		} else if (arg1 == 6) {
			this.anInt2289 = arg0.method3943();
			return;
		} else if (arg1 == 7) {
			this.anInt2291 = arg0.method3943();
			return;
		} else if (arg1 == 8) {
			this.anInt2274 = arg0.method3943();
			return;
		} else if (arg1 == 9) {
			this.anInt2263 = arg0.method3943();
			return;
		} else if (arg1 == 26) {
			this.anInt2287 = (short) (arg0.method3981() * 4);
			this.anInt2295 = (short) (arg0.method3981() * 4);
			return;
		} else {
			@Pc(100) int local100;
			@Pc(108) int local108;
			if (arg1 == 27) {
				if (this.anIntArrayArray15 == null) {
					this.anIntArrayArray15 = new int[12][];
				}
				local100 = arg0.method3981();
				this.anIntArrayArray15[local100] = new int[6];
				for (local108 = 0; local108 < 6; local108++) {
					this.anIntArrayArray15[local100][local108] = arg0.method3961();
				}
				return;
			}
			if (arg1 == 28) {
				this.anIntArray158 = new int[12];
				for (local100 = 0; local100 < 12; local100++) {
					this.anIntArray158[local100] = arg0.method3981();
					if (this.anIntArray158[local100] == 255) {
						this.anIntArray158[local100] = -1;
					}
				}
				return;
			}
			if (arg1 != 29) {
				if (arg1 == 30) {
					this.anInt2290 = arg0.method3943();
					return;
				}
				if (arg1 == 31) {
					this.anInt2279 = arg0.method3981();
					return;
				}
				if (arg1 == 32) {
					this.anInt2281 = arg0.method3943();
					return;
				}
				if (arg1 != 33) {
					if (arg1 == 34) {
						this.anInt2276 = arg0.method3981();
						return;
					}
					if (arg1 != 35) {
						if (arg1 == 36) {
							this.anInt2300 = arg0.method3961();
							return;
						}
						if (arg1 != 37) {
							if (arg1 == 38) {
								this.anInt2298 = arg0.method3943();
								return;
							}
							if (arg1 == 39) {
								this.anInt2280 = arg0.method3943();
								return;
							}
							if (arg1 == 40) {
								this.anInt2283 = arg0.method3943();
								return;
							}
							if (arg1 == 41) {
								this.anInt2294 = arg0.method3943();
								return;
							}
							if (arg1 == 42) {
								this.anInt2260 = arg0.method3943();
								return;
							}
							if (arg1 != 43) {
								if (arg1 == 44) {
									this.anInt2286 = arg0.method3943();
									return;
								}
								if (arg1 == 45) {
									this.anInt2293 = arg0.method3943();
									return;
								}
								if (arg1 == 46) {
									this.anInt2297 = arg0.method3943();
									return;
								}
								if (arg1 != 47) {
									if (arg1 == 48) {
										this.anInt2256 = arg0.method3943();
										return;
									}
									if (arg1 == 49) {
										this.anInt2288 = arg0.method3943();
										return;
									}
									if (arg1 == 50) {
										this.anInt2275 = arg0.method3943();
										return;
									}
									if (arg1 == 51) {
										this.anInt2277 = arg0.method3943();
									} else if (arg1 == 52) {
										local100 = arg0.method3981();
										this.anIntArray159 = new int[local100];
										this.anIntArray160 = new int[local100];
										for (local108 = 0; local108 < local100; local108++) {
											this.anIntArray160[local108] = arg0.method3943();
											@Pc(347) int local347 = arg0.method3981();
											this.anIntArray159[local108] = local347;
											this.anInt2301 += local347;
										}
										return;
									} else if (arg1 == 53) {
										this.aBoolean123 = false;
										return;
									} else if (arg1 == 54) {
										this.anInt2262 = arg0.method3981() << 6;
										this.anInt2282 = arg0.method3981() << 6;
										return;
									}
									return;
								}
								this.anInt2265 = arg0.method3943();
								return;
							}
							this.anInt2264 = arg0.method3943();
							return;
						}
						this.anInt2284 = arg0.method3981();
						return;
					}
					this.anInt2257 = arg0.method3943();
					return;
				}
				this.anInt2285 = arg0.method3961();
				return;
			}
			this.anInt2271 = arg0.method3981();
			return;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)Z")
	public boolean method1922(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt2267) {
			return true;
		} else {
			if (this.anIntArray160 != null) {
				for (@Pc(22) int local22 = 0; local22 < this.anIntArray160.length; local22++) {
					if (this.anIntArray160[local22] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!gk;)V")
	public void method1924(@OriginalArg(1) Class7_Sub14 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3981();
			if (local15 == 0) {
				return;
			}
			this.method1921(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)I")
	public int method1925() {
		if (this.anInt2267 != -1) {
			return this.anInt2267;
		} else if (this.anIntArray160 == null) {
			return -1;
		} else {
			@Pc(22) int local22 = (int) ((double) this.anInt2301 * Math.random());
			@Pc(24) int local24;
			for (local24 = 0; local22 >= this.anIntArray159[local24]; local24++) {
				local22 -= this.anIntArray159[local24];
			}
			return this.anIntArray160[local24];
		}
	}
}
