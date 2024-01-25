import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class70 {

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "Lclient!bc;")
	private Class25 aClass25_11;

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "[I")
	public int[] anIntArray119;

	@OriginalMember(owner = "client!dt", name = "h", descriptor = "I")
	private int anInt2372;

	@OriginalMember(owner = "client!dt", name = "i", descriptor = "I")
	public int anInt2373;

	@OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
	public int anInt2374;

	@OriginalMember(owner = "client!dt", name = "m", descriptor = "I")
	private int anInt2376;

	@OriginalMember(owner = "client!dt", name = "v", descriptor = "I")
	private int anInt2384;

	@OriginalMember(owner = "client!dt", name = "w", descriptor = "I")
	private int anInt2385;

	@OriginalMember(owner = "client!dt", name = "x", descriptor = "Lclient!aj;")
	public Class10 aClass10_3;

	@OriginalMember(owner = "client!dt", name = "y", descriptor = "I")
	public int anInt2386;

	@OriginalMember(owner = "client!dt", name = "I", descriptor = "I")
	public int anInt2394;

	@OriginalMember(owner = "client!dt", name = "J", descriptor = "Ljava/lang/String;")
	public String aString29;

	@OriginalMember(owner = "client!dt", name = "K", descriptor = "I")
	public int anInt2395;

	@OriginalMember(owner = "client!dt", name = "N", descriptor = "Ljava/lang/String;")
	public String aString30;

	@OriginalMember(owner = "client!dt", name = "T", descriptor = "I")
	public int anInt2401;

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "I")
	private int anInt2370 = -1;

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
	public int anInt2371 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!dt", name = "q", descriptor = "I")
	public int anInt2380 = -1;

	@OriginalMember(owner = "client!dt", name = "k", descriptor = "Z")
	public boolean aBoolean182 = true;

	@OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
	private int anInt2375 = -1;

	@OriginalMember(owner = "client!dt", name = "z", descriptor = "I")
	private int anInt2387 = -1;

	@OriginalMember(owner = "client!dt", name = "B", descriptor = "I")
	public int anInt2389 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!dt", name = "t", descriptor = "I")
	public int anInt2382 = 0;

	@OriginalMember(owner = "client!dt", name = "s", descriptor = "Z")
	public boolean aBoolean183 = true;

	@OriginalMember(owner = "client!dt", name = "G", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray11 = new String[5];

	@OriginalMember(owner = "client!dt", name = "D", descriptor = "I")
	public int anInt2390 = -1;

	@OriginalMember(owner = "client!dt", name = "F", descriptor = "I")
	private int anInt2392 = -1;

	@OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
	public int anInt2378 = -1;

	@OriginalMember(owner = "client!dt", name = "O", descriptor = "Z")
	public boolean aBoolean185 = false;

	@OriginalMember(owner = "client!dt", name = "P", descriptor = "I")
	private int anInt2397 = -1;

	@OriginalMember(owner = "client!dt", name = "S", descriptor = "I")
	public int anInt2400 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!dt", name = "H", descriptor = "I")
	public int anInt2393 = -1;

	@OriginalMember(owner = "client!dt", name = "M", descriptor = "Z")
	public boolean aBoolean184 = true;

	@OriginalMember(owner = "client!dt", name = "A", descriptor = "I")
	public int anInt2388 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;")
	public String method2131(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass25_11 == null) {
			return arg1;
		} else {
			@Pc(24) Class3_Sub31 local24 = (Class3_Sub31) this.aClass25_11.method946((long) arg0);
			return local24 == null ? arg1 : local24.aString63;
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!se;B)Z")
	public boolean method2132(@OriginalArg(0) Interface15 arg0) {
		@Pc(17) int local17;
		if (this.anInt2392 == -1) {
			if (this.anInt2375 == -1) {
				return true;
			}
			local17 = arg0.method7757(this.anInt2375);
		} else {
			local17 = arg0.method7756(this.anInt2392);
		}
		if (local17 < this.anInt2384 || local17 > this.anInt2385) {
			return false;
		}
		@Pc(56) int local56;
		if (this.anInt2370 == -1) {
			if (this.anInt2397 == -1) {
				return true;
			}
			local56 = arg0.method7757(this.anInt2397);
		} else {
			local56 = arg0.method7756(this.anInt2370);
		}
		return this.anInt2376 <= local56 && local56 <= this.anInt2372;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IBI)I")
	public int method2133(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass25_11 == null) {
			return arg1;
		} else {
			@Pc(21) Class3_Sub48 local21 = (Class3_Sub48) this.aClass25_11.method946((long) arg0);
			return local21 == null ? arg1 : local21.anInt9989;
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BLclient!oa;)Lclient!xa;")
	public Class37 method2134(@OriginalArg(1) Class15 arg0) {
		@Pc(28) Class37 local28 = (Class37) this.aClass10_3.aClass211_5.method5534((long) (this.anInt2387 | 0x20000 | arg0.anInt6343 << 29));
		if (local28 != null) {
			return local28;
		}
		this.aClass10_3.aClass254_5.method6417(this.anInt2387);
		@Pc(48) Class20 local48 = Static599.method814(this.aClass10_3.aClass254_5, this.anInt2387, 0);
		if (local48 != null) {
			local28 = arg0.method5275(local48, true);
			this.aClass10_3.aClass211_5.method5529((long) (this.anInt2387 | 0x20000 | arg0.anInt6343 << 29), local28);
		}
		return local28;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
	public void method2135() {
		if (this.anIntArray119 == null) {
			return;
		}
		for (@Pc(8) int local8 = 0; local8 < this.anIntArray119.length; local8 += 2) {
			if (this.anInt2371 > this.anIntArray119[local8]) {
				this.anInt2371 = this.anIntArray119[local8];
			} else if (this.anInt2389 < this.anIntArray119[local8]) {
				this.anInt2389 = this.anIntArray119[local8];
			}
			if (this.anInt2388 > this.anIntArray119[local8 + 1]) {
				this.anInt2388 = this.anIntArray119[local8 + 1];
			} else if (this.anIntArray119[local8 + 1] > this.anInt2400) {
				this.anInt2400 = this.anIntArray119[local8 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!fd;I)V")
	private void method2138(@OriginalArg(1) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2378 = arg0.method6535();
		} else if (arg1 == 2) {
			this.anInt2380 = arg0.method6535();
		} else if (arg1 == 3) {
			this.aString30 = arg0.method6536();
		} else if (arg1 == 4) {
			this.anInt2395 = arg0.method6506();
		} else if (arg1 == 5) {
			this.anInt2393 = arg0.method6506();
		} else if (arg1 == 6) {
			this.anInt2382 = arg0.method6538();
		} else {
			@Pc(72) int local72;
			if (arg1 == 7) {
				local72 = arg0.method6538();
				if ((local72 & 0x1) == 0) {
					this.aBoolean184 = false;
				}
				if ((local72 & 0x2) == 2) {
					this.aBoolean185 = true;
				}
			} else if (arg1 == 8) {
				this.aBoolean183 = arg0.method6538() == 1;
			} else if (arg1 == 9) {
				this.anInt2375 = arg0.method6535();
				if (this.anInt2375 == 65535) {
					this.anInt2375 = -1;
				}
				this.anInt2392 = arg0.method6535();
				if (this.anInt2392 == 65535) {
					this.anInt2392 = -1;
				}
				this.anInt2384 = arg0.method6497();
				this.anInt2385 = arg0.method6497();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray11[arg1 - 10] = arg0.method6536();
			} else {
				@Pc(80) int local80;
				if (arg1 == 15) {
					local72 = arg0.method6538();
					this.anIntArray119 = new int[local72 * 2];
					for (local80 = 0; local80 < local72 * 2; local80++) {
						this.anIntArray119[local80] = arg0.method6525();
					}
					this.anInt2394 = arg0.method6497();
					this.anInt2386 = arg0.method6497();
				} else if (arg1 == 16) {
					this.aBoolean182 = false;
				} else if (arg1 == 17) {
					this.aString29 = arg0.method6536();
				} else if (arg1 == 18) {
					this.anInt2387 = arg0.method6535();
				} else if (arg1 == 19) {
					this.anInt2390 = arg0.method6535();
				} else if (arg1 == 20) {
					this.anInt2397 = arg0.method6535();
					if (this.anInt2397 == 65535) {
						this.anInt2397 = -1;
					}
					this.anInt2370 = arg0.method6535();
					if (this.anInt2370 == 65535) {
						this.anInt2370 = -1;
					}
					this.anInt2376 = arg0.method6497();
					this.anInt2372 = arg0.method6497();
				} else if (arg1 == 21) {
					this.anInt2374 = arg0.method6497();
				} else if (arg1 == 22) {
					this.anInt2401 = arg0.method6497();
				} else if (arg1 == 249) {
					local72 = arg0.method6538();
					if (this.aClass25_11 == null) {
						local80 = Static178.method3152(local72);
						this.aClass25_11 = new Class25(local80);
					}
					for (local80 = 0; local80 < local72; local80++) {
						@Pc(219) boolean local219 = arg0.method6538() == 1;
						@Pc(223) int local223 = arg0.method6506();
						@Pc(232) Class3 local232;
						if (local219) {
							local232 = new Class3_Sub31(arg0.method6536());
						} else {
							local232 = new Class3_Sub48(arg0.method6497());
						}
						this.aClass25_11.method945(local232, (long) local223);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZLclient!fd;)V")
	public void method2139(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method6538();
			if (local3 == 0) {
				return;
			}
			this.method2138(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!oa;Z)Lclient!xa;")
	public Class37 method2140(@OriginalArg(1) Class15 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) int local16 = arg1 ? this.anInt2380 : this.anInt2378;
		@Pc(23) int local23 = local16 | arg0.anInt6343 << 29;
		@Pc(32) Class37 local32 = (Class37) this.aClass10_3.aClass211_5.method5534((long) local23);
		if (local32 != null) {
			return local32;
		} else if (this.aClass10_3.aClass254_5.method6417(local16)) {
			@Pc(52) Class20 local52 = Static599.method814(this.aClass10_3.aClass254_5, local16, 0);
			if (local52 != null) {
				local32 = arg0.method5275(local52, true);
				this.aClass10_3.aClass211_5.method5529((long) local23, local32);
			}
			return local32;
		} else {
			return null;
		}
	}
}
