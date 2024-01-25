import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class105 {

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
	public int anInt3321;

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
	private int anInt3324;

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "[I")
	public int[] anIntArray234;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "Lclient!os;")
	public Class248 aClass248_1;

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "Ljava/lang/String;")
	public String aString34;

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
	public int anInt3331;

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
	public int anInt3332;

	@OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
	private int anInt3338;

	@OriginalMember(owner = "client!fd", name = "B", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!fd", name = "D", descriptor = "[I")
	public int[] anIntArray236;

	@OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
	public int anInt3344;

	@OriginalMember(owner = "client!fd", name = "L", descriptor = "Ljava/lang/String;")
	public String aString35;

	@OriginalMember(owner = "client!fd", name = "M", descriptor = "Lclient!mp;")
	private Class222 aClass222_10;

	@OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
	public int anInt3346;

	@OriginalMember(owner = "client!fd", name = "P", descriptor = "I")
	public int anInt3347;

	@OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
	private int anInt3348;

	@OriginalMember(owner = "client!fd", name = "S", descriptor = "I")
	public int anInt3350;

	@OriginalMember(owner = "client!fd", name = "Y", descriptor = "I")
	private int anInt3355;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "Z")
	public boolean aBoolean280 = false;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
	public int anInt3320 = -1;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray8 = new String[5];

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
	public int anInt3327 = -1;

	@OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
	public int anInt3339 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
	private int anInt3343 = -1;

	@OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
	private int anInt3341 = -1;

	@OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
	public int anInt3342 = -1;

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
	public int anInt3334 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "Z")
	public boolean aBoolean281 = true;

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
	public int anInt3322 = -1;

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
	public int anInt3335 = -1;

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
	public int anInt3323 = -1;

	@OriginalMember(owner = "client!fd", name = "G", descriptor = "Z")
	public boolean aBoolean283 = true;

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
	private int anInt3330 = -1;

	@OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
	public int anInt3345 = -1;

	@OriginalMember(owner = "client!fd", name = "T", descriptor = "I")
	private int anInt3351 = -1;

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
	public int anInt3336 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fd", name = "U", descriptor = "I")
	public int anInt3352 = 0;

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
	public int anInt3329 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
	private int anInt3319 = -1;

	@OriginalMember(owner = "client!fd", name = "E", descriptor = "Z")
	public boolean aBoolean282 = true;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZILclient!ha;)Lclient!kr;")
	public Class20 method2787(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class87 arg1) {
		@Pc(17) int local17 = arg0 ? this.anInt3342 : this.anInt3335;
		@Pc(24) int local24 = local17 | arg1.anInt9444 << 29;
		@Pc(33) Class20 local33 = (Class20) this.aClass248_1.aClass233_35.method5669((long) local24);
		if (local33 != null) {
			return local33;
		} else if (this.aClass248_1.aClass97_104.method2564(local17)) {
			@Pc(53) Class120 local53 = Static647.method3070(this.aClass248_1.aClass97_104, local17, 0);
			if (local53 != null) {
				local33 = arg1.method7969(local53, true);
				this.aClass248_1.aClass233_35.method5662(local33, (long) local24);
			}
			return local33;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!ud;I)V")
	private void method2788(@OriginalArg(1) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3335 = arg0.method6884();
		} else if (arg1 == 2) {
			this.anInt3342 = arg0.method6884();
		} else if (arg1 == 3) {
			this.aString34 = arg0.method6903();
		} else if (arg1 == 4) {
			this.anInt3347 = arg0.method6870();
		} else if (arg1 == 5) {
			this.anInt3327 = arg0.method6870();
		} else if (arg1 == 6) {
			this.anInt3352 = arg0.method6904();
		} else {
			@Pc(62) int local62;
			if (arg1 == 7) {
				local62 = arg0.method6904();
				if ((local62 & 0x1) == 0) {
					this.aBoolean283 = false;
				}
				if ((local62 & 0x2) == 2) {
					this.aBoolean280 = true;
				}
			} else if (arg1 == 8) {
				this.aBoolean282 = arg0.method6904() == 1;
			} else if (arg1 == 9) {
				this.anInt3343 = arg0.method6884();
				if (this.anInt3343 == 65535) {
					this.anInt3343 = -1;
				}
				this.anInt3330 = arg0.method6884();
				if (this.anInt3330 == 65535) {
					this.anInt3330 = -1;
				}
				this.anInt3348 = arg0.method6865();
				this.anInt3338 = arg0.method6865();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray8[arg1 - 10] = arg0.method6903();
			} else {
				@Pc(233) int local233;
				@Pc(259) int local259;
				if (arg1 == 15) {
					local62 = arg0.method6904();
					this.anIntArray236 = new int[local62 * 2];
					for (local233 = 0; local233 < local62 * 2; local233++) {
						this.anIntArray236[local233] = arg0.method6856();
					}
					this.anInt3332 = arg0.method6865();
					@Pc(357) int local357 = arg0.method6904();
					this.anIntArray234 = new int[local357];
					for (local259 = 0; local259 < this.anIntArray234.length; local259++) {
						this.anIntArray234[local259] = arg0.method6865();
					}
					this.aByteArray32 = new byte[local62];
					for (@Pc(383) int local383 = 0; local383 < local62; local383++) {
						this.aByteArray32[local383] = arg0.method6908();
					}
				} else if (arg1 == 16) {
					this.aBoolean281 = false;
				} else if (arg1 == 17) {
					this.aString35 = arg0.method6903();
				} else if (arg1 == 18) {
					this.anInt3351 = arg0.method6884();
				} else if (arg1 == 19) {
					this.anInt3320 = arg0.method6884();
				} else if (arg1 == 20) {
					this.anInt3319 = arg0.method6884();
					if (this.anInt3319 == 65535) {
						this.anInt3319 = -1;
					}
					this.anInt3341 = arg0.method6884();
					if (this.anInt3341 == 65535) {
						this.anInt3341 = -1;
					}
					this.anInt3324 = arg0.method6865();
					this.anInt3355 = arg0.method6865();
				} else if (arg1 == 21) {
					this.anInt3321 = arg0.method6865();
				} else if (arg1 == 22) {
					this.anInt3346 = arg0.method6865();
				} else if (arg1 == 23) {
					this.anInt3323 = arg0.method6904();
					this.anInt3345 = arg0.method6904();
					this.anInt3322 = arg0.method6904();
				} else if (arg1 == 24) {
					this.anInt3350 = arg0.method6856();
					this.anInt3331 = arg0.method6856();
				} else if (arg1 == 249) {
					local62 = arg0.method6904();
					if (this.aClass222_10 == null) {
						local233 = Static347.method5404(local62);
						this.aClass222_10 = new Class222(local233);
					}
					for (local233 = 0; local233 < local62; local233++) {
						@Pc(255) boolean local255 = arg0.method6904() == 1;
						local259 = arg0.method6870();
						@Pc(268) Class2 local268;
						if (local255) {
							local268 = new Class2_Sub38(arg0.method6903());
						} else {
							local268 = new Class2_Sub15(arg0.method6865());
						}
						this.aClass222_10.method5476(local268, (long) local259);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method2789(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass222_10 == null) {
			return arg1;
		} else {
			@Pc(16) Class2_Sub38 local16 = (Class2_Sub38) this.aClass222_10.method5468((long) arg0);
			return local16 == null ? arg1 : local16.aString68;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIB)I")
	public int method2790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass222_10 == null) {
			return arg0;
		} else {
			@Pc(21) Class2_Sub15 local21 = (Class2_Sub15) this.aClass222_10.method5468((long) arg1);
			return local21 == null ? arg0 : local21.anInt1789;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!cp;I)Z")
	public boolean method2791(@OriginalArg(0) Interface5 arg0) {
		@Pc(13) int local13;
		if (this.anInt3330 == -1) {
			if (this.anInt3343 == -1) {
				return true;
			}
			local13 = arg0.method4743(this.anInt3343);
		} else {
			local13 = arg0.method4744(this.anInt3330);
		}
		if (this.anInt3348 > local13 || local13 > this.anInt3338) {
			return false;
		}
		@Pc(64) int local64;
		if (this.anInt3341 == -1) {
			if (this.anInt3319 == -1) {
				return true;
			}
			local64 = arg0.method4743(this.anInt3319);
		} else {
			local64 = arg0.method4744(this.anInt3341);
		}
		return this.anInt3324 <= local64 && local64 <= this.anInt3355;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
	public void method2792() {
		if (this.anIntArray236 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < this.anIntArray236.length; local4 += 2) {
			if (this.anIntArray236[local4] < this.anInt3336) {
				this.anInt3336 = this.anIntArray236[local4];
			} else if (this.anInt3339 < this.anIntArray236[local4]) {
				this.anInt3339 = this.anIntArray236[local4];
			}
			if (this.anInt3329 > this.anIntArray236[local4 + 1]) {
				this.anInt3329 = this.anIntArray236[local4 + 1];
			} else if (this.anInt3334 < this.anIntArray236[local4 + 1]) {
				this.anInt3334 = this.anIntArray236[local4 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!ud;I)V")
	public void method2793(@OriginalArg(0) Class2_Sub34 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method6904();
			if (local7 == 0) {
				return;
			}
			this.method2788(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!ha;B)Lclient!kr;")
	public Class20 method2794(@OriginalArg(0) Class87 arg0) {
		@Pc(20) Class20 local20 = (Class20) this.aClass248_1.aClass233_35.method5669((long) (arg0.anInt9444 << 29 | 0x20000 | this.anInt3351));
		if (local20 != null) {
			return local20;
		}
		this.aClass248_1.aClass97_104.method2564(this.anInt3351);
		@Pc(40) Class120 local40 = Static647.method3070(this.aClass248_1.aClass97_104, this.anInt3351, 0);
		if (local40 != null) {
			local20 = arg0.method7969(local40, true);
			this.aClass248_1.aClass233_35.method5662(local20, (long) (arg0.anInt9444 << 29 | this.anInt3351 | 0x20000));
		}
		return local20;
	}
}
