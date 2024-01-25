import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class100 {

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "[I")
	public static final int[] anIntArray206 = new int[16384];

	@OriginalMember(owner = "client!gp", name = "P", descriptor = "[I")
	public static final int[] anIntArray208 = new int[16384];

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
	public int anInt2459;

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
	private int anInt2460;

	@OriginalMember(owner = "client!gp", name = "j", descriptor = "[I")
	public int[] anIntArray207;

	@OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
	public int anInt2462;

	@OriginalMember(owner = "client!gp", name = "l", descriptor = "Ljava/lang/String;")
	public String aString14;

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
	public int anInt2464;

	@OriginalMember(owner = "client!gp", name = "o", descriptor = "Ljava/lang/String;")
	public String aString15;

	@OriginalMember(owner = "client!gp", name = "r", descriptor = "Lclient!tb;")
	public Class235 aClass235_2;

	@OriginalMember(owner = "client!gp", name = "z", descriptor = "I")
	public int anInt2470;

	@OriginalMember(owner = "client!gp", name = "E", descriptor = "I")
	private int anInt2474;

	@OriginalMember(owner = "client!gp", name = "J", descriptor = "Lclient!ek;")
	private Class67 aClass67_12;

	@OriginalMember(owner = "client!gp", name = "M", descriptor = "I")
	public int anInt2481;

	@OriginalMember(owner = "client!gp", name = "N", descriptor = "I")
	private int anInt2482;

	@OriginalMember(owner = "client!gp", name = "R", descriptor = "I")
	private int anInt2485;

	@OriginalMember(owner = "client!gp", name = "T", descriptor = "I")
	public int anInt2487;

	@OriginalMember(owner = "client!gp", name = "i", descriptor = "I")
	public int anInt2461 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gp", name = "y", descriptor = "I")
	private int anInt2469 = -1;

	@OriginalMember(owner = "client!gp", name = "t", descriptor = "I")
	public int anInt2467 = -1;

	@OriginalMember(owner = "client!gp", name = "w", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray22 = new String[5];

	@OriginalMember(owner = "client!gp", name = "v", descriptor = "Z")
	public boolean aBoolean162 = true;

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
	public int anInt2456 = -1;

	@OriginalMember(owner = "client!gp", name = "B", descriptor = "Z")
	public boolean aBoolean163 = true;

	@OriginalMember(owner = "client!gp", name = "u", descriptor = "Z")
	public boolean aBoolean161 = false;

	@OriginalMember(owner = "client!gp", name = "A", descriptor = "I")
	private int anInt2471 = -1;

	@OriginalMember(owner = "client!gp", name = "q", descriptor = "I")
	public int anInt2465 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gp", name = "D", descriptor = "I")
	private int anInt2473 = -1;

	@OriginalMember(owner = "client!gp", name = "C", descriptor = "I")
	public int anInt2472 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gp", name = "K", descriptor = "I")
	private int anInt2479 = -1;

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "Z")
	public boolean aBoolean160 = true;

	@OriginalMember(owner = "client!gp", name = "H", descriptor = "I")
	public int anInt2477 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gp", name = "L", descriptor = "I")
	private int anInt2480 = -1;

	@OriginalMember(owner = "client!gp", name = "O", descriptor = "I")
	public int anInt2483 = -1;

	@OriginalMember(owner = "client!gp", name = "U", descriptor = "I")
	public int anInt2488 = -1;

	@OriginalMember(owner = "client!gp", name = "S", descriptor = "I")
	public int anInt2486 = 0;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray206[local9] = (int) (Math.sin(local7 * (double) local9) * 32768.0D);
			anIntArray208[local9] = (int) (Math.cos((double) local9 * local7) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IZLclient!ya;)Lclient!l;")
	public Class95 method1953(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class135 arg1) {
		@Pc(17) int local17 = arg0 ? this.anInt2467 : this.anInt2483;
		@Pc(24) int local24 = arg1.anInt6589 << 29 | local17;
		@Pc(33) Class95 local33 = (Class95) this.aClass235_2.aClass137_52.method2744((long) local24);
		if (local33 != null) {
			return local33;
		} else if (this.aClass235_2.aClass211_82.method4382(local17)) {
			@Pc(53) Class216 local53 = Static465.method4465(this.aClass235_2.aClass211_82, local17, 0);
			if (local53 != null) {
				local33 = arg1.method5379(local53);
				this.aClass235_2.aClass137_52.method2732((long) local24, local33);
			}
			return local33;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!fh;ZI)V")
	private void method1954(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2483 = arg0.method5028();
		} else if (arg1 == 2) {
			this.anInt2467 = arg0.method5028();
		} else if (arg1 == 3) {
			this.aString15 = arg0.method5038();
		} else if (arg1 == 4) {
			this.anInt2462 = arg0.method5008();
		} else if (arg1 == 5) {
			this.anInt2456 = arg0.method5008();
		} else if (arg1 == 6) {
			this.anInt2486 = arg0.method5007();
		} else {
			@Pc(62) int local62;
			if (arg1 == 7) {
				local62 = arg0.method5007();
				if ((local62 & 0x1) == 0) {
					this.aBoolean163 = false;
				}
				if ((local62 & 0x2) == 2) {
					this.aBoolean161 = true;
					return;
				}
			} else if (arg1 == 8) {
				this.aBoolean160 = arg0.method5007() == 1;
				return;
			} else if (arg1 == 9) {
				this.anInt2473 = arg0.method5028();
				if (this.anInt2473 == 65535) {
					this.anInt2473 = -1;
				}
				this.anInt2480 = arg0.method5028();
				if (this.anInt2480 == 65535) {
					this.anInt2480 = -1;
				}
				this.anInt2485 = arg0.method4997();
				this.anInt2474 = arg0.method4997();
			} else if (arg1 < 10 || arg1 > 14) {
				@Pc(216) int local216;
				if (arg1 != 15) {
					if (arg1 == 16) {
						this.aBoolean162 = false;
						return;
					}
					if (arg1 != 17) {
						if (arg1 != 18) {
							if (arg1 != 19) {
								if (arg1 == 20) {
									this.anInt2479 = arg0.method5028();
									if (this.anInt2479 == 65535) {
										this.anInt2479 = -1;
									}
									this.anInt2469 = arg0.method5028();
									if (this.anInt2469 == 65535) {
										this.anInt2469 = -1;
									}
									this.anInt2460 = arg0.method4997();
									this.anInt2482 = arg0.method4997();
									return;
								}
								if (arg1 == 21) {
									this.anInt2464 = arg0.method4997();
								} else if (arg1 == 22) {
									this.anInt2470 = arg0.method4997();
									return;
								} else if (arg1 == 249) {
									local62 = arg0.method5007();
									if (this.aClass67_12 == null) {
										local216 = Static171.method2382(local62);
										this.aClass67_12 = new Class67(local216);
									}
									for (local216 = 0; local216 < local62; local216++) {
										@Pc(235) boolean local235 = arg0.method5007() == 1;
										@Pc(239) int local239 = arg0.method5008();
										@Pc(248) Class4 local248;
										if (local235) {
											local248 = new Class4_Sub38(arg0.method5038());
										} else {
											local248 = new Class4_Sub24(arg0.method4997());
										}
										this.aClass67_12.method1426(local248, (long) local239);
									}
									return;
								}
								return;
							}
							this.anInt2488 = arg0.method5028();
							return;
						}
						this.anInt2471 = arg0.method5028();
						return;
					}
					this.aString14 = arg0.method5038();
					return;
				}
				local62 = arg0.method5007();
				this.anIntArray207 = new int[local62 * 2];
				for (local216 = 0; local216 < local62 * 2; local216++) {
					this.anIntArray207[local216] = arg0.method5061();
				}
				this.anInt2481 = arg0.method4997();
				this.anInt2459 = arg0.method4997();
				return;
			} else {
				this.aStringArray22[arg1 - 10] = arg0.method5038();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!fh;I)V")
	public void method1956(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5007();
			if (local9 == 0) {
				return;
			}
			this.method1954(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)I")
	public int method1959(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass67_12 == null) {
			return arg0;
		} else {
			@Pc(16) Class4_Sub24 local16 = (Class4_Sub24) this.aClass67_12.method1429((long) arg1);
			return local16 == null ? arg0 : local16.anInt4057;
		}
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V")
	public void method1960() {
		if (this.anIntArray207 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray207.length; local6 += 2) {
			if (this.anIntArray207[local6] < this.anInt2461) {
				this.anInt2461 = this.anIntArray207[local6];
			} else if (this.anIntArray207[local6] > this.anInt2477) {
				this.anInt2477 = this.anIntArray207[local6];
			}
			if (this.anIntArray207[local6 + 1] < this.anInt2465) {
				this.anInt2465 = this.anIntArray207[local6 + 1];
			} else if (this.anInt2472 < this.anIntArray207[local6 + 1]) {
				this.anInt2472 = this.anIntArray207[local6 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/String;BI)Ljava/lang/String;")
	public String method1961(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass67_12 == null) {
			return arg0;
		} else {
			@Pc(16) Class4_Sub38 local16 = (Class4_Sub38) this.aClass67_12.method1429((long) arg1);
			return local16 == null ? arg0 : local16.aString65;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!vg;I)Z")
	public boolean method1962(@OriginalArg(0) Interface12 arg0) {
		@Pc(15) int local15;
		if (this.anInt2480 == -1) {
			if (this.anInt2473 == -1) {
				return true;
			}
			local15 = arg0.method1660(this.anInt2473);
		} else {
			local15 = arg0.method1659(this.anInt2480);
		}
		if (this.anInt2485 > local15 || local15 > this.anInt2474) {
			return false;
		}
		@Pc(62) int local62;
		if (this.anInt2469 == -1) {
			if (this.anInt2479 == -1) {
				return true;
			}
			local62 = arg0.method1660(this.anInt2479);
		} else {
			local62 = arg0.method1659(this.anInt2469);
		}
		return local62 >= this.anInt2460 && local62 <= this.anInt2482;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!ya;Z)Lclient!l;")
	public Class95 method1963(@OriginalArg(0) Class135 arg0) {
		@Pc(20) Class95 local20 = (Class95) this.aClass235_2.aClass137_52.method2744((long) (arg0.anInt6589 << 29 | 0x20000 | this.anInt2471));
		if (local20 != null) {
			return local20;
		}
		this.aClass235_2.aClass211_82.method4382(this.anInt2471);
		@Pc(40) Class216 local40 = Static465.method4465(this.aClass235_2.aClass211_82, this.anInt2471, 0);
		if (local40 != null) {
			local20 = arg0.method5379(local40);
			this.aClass235_2.aClass137_52.method2732((long) (arg0.anInt6589 << 29 | this.anInt2471 | 0x20000), local20);
		}
		return local20;
	}
}
