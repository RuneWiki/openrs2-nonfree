import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class97 {

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
	public int anInt2265;

	@OriginalMember(owner = "client!gu", name = "i", descriptor = "Lclient!fa;")
	private Class77 aClass77_16;

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
	public int anInt2272;

	@OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
	public int anInt2275;

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
	private int anInt2276;

	@OriginalMember(owner = "client!gu", name = "q", descriptor = "I")
	public int anInt2278;

	@OriginalMember(owner = "client!gu", name = "t", descriptor = "I")
	private int anInt2280;

	@OriginalMember(owner = "client!gu", name = "x", descriptor = "I")
	public int anInt2284;

	@OriginalMember(owner = "client!gu", name = "A", descriptor = "I")
	private int anInt2287;

	@OriginalMember(owner = "client!gu", name = "B", descriptor = "[I")
	public int[] anIntArray289;

	@OriginalMember(owner = "client!gu", name = "D", descriptor = "Lclient!wn;")
	public Class249 aClass249_2;

	@OriginalMember(owner = "client!gu", name = "K", descriptor = "Ljava/lang/String;")
	public String aString21;

	@OriginalMember(owner = "client!gu", name = "O", descriptor = "I")
	private int anInt2296;

	@OriginalMember(owner = "client!gu", name = "T", descriptor = "Ljava/lang/String;")
	public String aString22;

	@OriginalMember(owner = "client!gu", name = "V", descriptor = "I")
	public int anInt2299;

	@OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
	private int anInt2274 = -1;

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
	public int anInt2268 = -1;

	@OriginalMember(owner = "client!gu", name = "r", descriptor = "Z")
	public boolean aBoolean182 = false;

	@OriginalMember(owner = "client!gu", name = "E", descriptor = "I")
	public int anInt2289 = -1;

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
	public int anInt2267 = -1;

	@OriginalMember(owner = "client!gu", name = "u", descriptor = "I")
	public int anInt2281 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gu", name = "v", descriptor = "I")
	private int anInt2282 = -1;

	@OriginalMember(owner = "client!gu", name = "Q", descriptor = "Z")
	public boolean aBoolean183 = true;

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
	public int anInt2266 = 0;

	@OriginalMember(owner = "client!gu", name = "z", descriptor = "I")
	private int anInt2286 = -1;

	@OriginalMember(owner = "client!gu", name = "J", descriptor = "I")
	public int anInt2293 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gu", name = "I", descriptor = "I")
	public int anInt2292 = -1;

	@OriginalMember(owner = "client!gu", name = "P", descriptor = "I")
	private int anInt2297 = -1;

	@OriginalMember(owner = "client!gu", name = "M", descriptor = "I")
	public int anInt2295 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gu", name = "R", descriptor = "Z")
	public boolean aBoolean184 = true;

	@OriginalMember(owner = "client!gu", name = "U", descriptor = "I")
	public int anInt2298 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gu", name = "S", descriptor = "Z")
	public boolean aBoolean185 = true;

	@OriginalMember(owner = "client!gu", name = "N", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray34 = new String[5];

	@OriginalMember(owner = "client!gu", name = "W", descriptor = "I")
	private int anInt2300 = -1;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!tq;)Lclient!dp;")
	public Class51 method1851(@OriginalArg(1) Class164 arg0) {
		@Pc(20) Class51 local20 = (Class51) this.aClass249_2.aClass227_56.method4863((long) (this.anInt2286 | 0x20000 | arg0.anInt6163 << 29));
		if (local20 != null) {
			return local20;
		}
		this.aClass249_2.aClass230_91.method4966(this.anInt2286);
		@Pc(40) Class80 local40 = Static397.method1423(this.aClass249_2.aClass230_91, this.anInt2286, 0);
		if (local40 != null) {
			local20 = arg0.method5360(local40);
			this.aClass249_2.aClass227_56.method4865(local20, (long) (this.anInt2286 | 0x20000 | arg0.anInt6163 << 29));
		}
		return local20;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZII)I")
	public int method1852(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass77_16 == null) {
			return arg0;
		} else {
			@Pc(16) Class1_Sub30 local16 = (Class1_Sub30) this.aClass77_16.method1368((long) arg1);
			return local16 == null ? arg0 : local16.anInt3799;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!re;I)V")
	private void method1854(@OriginalArg(1) Class1_Sub33 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2268 = arg0.method5177();
		} else if (arg1 == 2) {
			this.anInt2289 = arg0.method5177();
		} else if (arg1 == 3) {
			this.aString22 = arg0.method5128();
		} else if (arg1 == 4) {
			this.anInt2299 = arg0.method5159();
		} else if (arg1 == 5) {
			this.anInt2267 = arg0.method5159();
		} else if (arg1 == 6) {
			this.anInt2266 = arg0.method5174();
		} else {
			@Pc(123) int local123;
			if (arg1 == 7) {
				local123 = arg0.method5174();
				if ((local123 & 0x1) == 0) {
					this.aBoolean185 = false;
				}
				if ((local123 & 0x2) == 2) {
					this.aBoolean182 = true;
				}
			} else if (arg1 == 8) {
				this.aBoolean183 = arg0.method5174() == 1;
			} else if (arg1 == 9) {
				this.anInt2300 = arg0.method5177();
				if (this.anInt2300 == 65535) {
					this.anInt2300 = -1;
				}
				this.anInt2274 = arg0.method5177();
				if (this.anInt2274 == 65535) {
					this.anInt2274 = -1;
				}
				this.anInt2276 = arg0.method5150();
				this.anInt2280 = arg0.method5150();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray34[arg1 - 10] = arg0.method5128();
			} else {
				@Pc(131) int local131;
				if (arg1 == 15) {
					local123 = arg0.method5174();
					this.anIntArray289 = new int[local123 * 2];
					for (local131 = 0; local131 < local123 * 2; local131++) {
						this.anIntArray289[local131] = arg0.method5180();
					}
					this.anInt2265 = arg0.method5150();
					this.anInt2272 = arg0.method5150();
				} else if (arg1 == 16) {
					this.aBoolean184 = false;
				} else if (arg1 == 17) {
					this.aString21 = arg0.method5128();
				} else if (arg1 == 18) {
					this.anInt2286 = arg0.method5177();
				} else if (arg1 == 19) {
					this.anInt2292 = arg0.method5177();
				} else if (arg1 == 20) {
					this.anInt2282 = arg0.method5177();
					if (this.anInt2282 == 65535) {
						this.anInt2282 = -1;
					}
					this.anInt2297 = arg0.method5177();
					if (this.anInt2297 == 65535) {
						this.anInt2297 = -1;
					}
					this.anInt2287 = arg0.method5150();
					this.anInt2296 = arg0.method5150();
				} else if (arg1 == 21) {
					this.anInt2275 = arg0.method5150();
				} else if (arg1 == 22) {
					this.anInt2278 = arg0.method5150();
				} else if (arg1 == 249) {
					local123 = arg0.method5174();
					if (this.aClass77_16 == null) {
						local131 = Static183.method1325(local123);
						this.aClass77_16 = new Class77(local131);
					}
					for (local131 = 0; local131 < local123; local131++) {
						@Pc(244) boolean local244 = arg0.method5174() == 1;
						@Pc(248) int local248 = arg0.method5159();
						@Pc(257) Class1 local257;
						if (local244) {
							local257 = new Class1_Sub8(arg0.method5128());
						} else {
							local257 = new Class1_Sub30(arg0.method5150());
						}
						this.aClass77_16.method1370((long) local248, local257);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V")
	public void method1855() {
		if (this.anIntArray289 == null) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray289.length; local14 += 2) {
			if (this.anIntArray289[local14] < this.anInt2295) {
				this.anInt2295 = this.anIntArray289[local14];
			} else if (this.anIntArray289[local14] > this.anInt2293) {
				this.anInt2293 = this.anIntArray289[local14];
			}
			if (this.anInt2281 > this.anIntArray289[local14 + 1]) {
				this.anInt2281 = this.anIntArray289[local14 + 1];
			} else if (this.anIntArray289[local14 + 1] > this.anInt2298) {
				this.anInt2298 = this.anIntArray289[local14 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZLclient!tq;B)Lclient!dp;")
	public Class51 method1856(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class164 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt2289 : this.anInt2268;
		@Pc(24) int local24 = arg1.anInt6163 << 29 | local11;
		@Pc(33) Class51 local33 = (Class51) this.aClass249_2.aClass227_56.method4863((long) local24);
		if (local33 != null) {
			return local33;
		} else if (this.aClass249_2.aClass230_91.method4966(local11)) {
			@Pc(53) Class80 local53 = Static397.method1423(this.aClass249_2.aClass230_91, local11, 0);
			if (local53 != null) {
				local33 = arg1.method5360(local53);
				this.aClass249_2.aClass227_56.method4865(local33, (long) local24);
			}
			return local33;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!g;)Z")
	public boolean method1857(@OriginalArg(1) Interface4 arg0) {
		@Pc(22) int local22;
		if (this.anInt2274 == -1) {
			if (this.anInt2300 == -1) {
				return true;
			}
			local22 = arg0.method1333(this.anInt2300);
		} else {
			local22 = arg0.method1332(this.anInt2274);
		}
		if (this.anInt2276 > local22 || local22 > this.anInt2280) {
			return false;
		}
		@Pc(58) int local58;
		if (this.anInt2297 == -1) {
			if (this.anInt2282 == -1) {
				return true;
			}
			local58 = arg0.method1333(this.anInt2282);
		} else {
			local58 = arg0.method1332(this.anInt2297);
		}
		return local58 >= this.anInt2287 && this.anInt2296 >= local58;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!re;I)V")
	public void method1858(@OriginalArg(0) Class1_Sub33 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5174();
			if (local15 == 0) {
				return;
			}
			this.method1854(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method1861(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass77_16 == null) {
			return arg0;
		} else {
			@Pc(23) Class1_Sub8 local23 = (Class1_Sub8) this.aClass77_16.method1368((long) arg1);
			return local23 == null ? arg0 : local23.aString9;
		}
	}
}
