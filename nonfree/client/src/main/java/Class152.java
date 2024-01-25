import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class152 {

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
	public int anInt4319;

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
	public int anInt4327;

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
	public int anInt4329;

	@OriginalMember(owner = "client!mk", name = "s", descriptor = "Ljava/lang/String;")
	public String aString49;

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
	private int anInt4335;

	@OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
	public int anInt4336;

	@OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
	private int anInt4337;

	@OriginalMember(owner = "client!mk", name = "A", descriptor = "Lclient!dg;")
	public Class45 aClass45_4;

	@OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
	private int anInt4341;

	@OriginalMember(owner = "client!mk", name = "F", descriptor = "I")
	public int anInt4343;

	@OriginalMember(owner = "client!mk", name = "I", descriptor = "I")
	private int anInt4345;

	@OriginalMember(owner = "client!mk", name = "L", descriptor = "Lclient!lp;")
	private Class140 aClass140_27;

	@OriginalMember(owner = "client!mk", name = "M", descriptor = "Ljava/lang/String;")
	public String aString50;

	@OriginalMember(owner = "client!mk", name = "Q", descriptor = "I")
	public int anInt4349;

	@OriginalMember(owner = "client!mk", name = "T", descriptor = "[I")
	public int[] anIntArray285;

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
	public int anInt4320 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "Z")
	public boolean aBoolean314 = true;

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
	public int anInt4321 = -1;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
	private int anInt4318 = -1;

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
	private int anInt4331 = -1;

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
	public int anInt4332 = 0;

	@OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
	private int anInt4333 = -1;

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
	private int anInt4326 = -1;

	@OriginalMember(owner = "client!mk", name = "B", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray28 = new String[5];

	@OriginalMember(owner = "client!mk", name = "G", descriptor = "I")
	public int anInt4344 = -1;

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
	public int anInt4338 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!mk", name = "y", descriptor = "Z")
	public boolean aBoolean316 = true;

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
	public int anInt4325 = -1;

	@OriginalMember(owner = "client!mk", name = "K", descriptor = "I")
	public int anInt4346 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!mk", name = "R", descriptor = "I")
	private int anInt4350 = -1;

	@OriginalMember(owner = "client!mk", name = "w", descriptor = "Z")
	public boolean aBoolean315 = false;

	@OriginalMember(owner = "client!mk", name = "N", descriptor = "I")
	public int anInt4347 = -1;

	@OriginalMember(owner = "client!mk", name = "J", descriptor = "Z")
	public boolean aBoolean317 = true;

	@OriginalMember(owner = "client!mk", name = "P", descriptor = "I")
	public int anInt4348 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method3606(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass140_27 == null) {
			return arg0;
		} else {
			@Pc(16) Class3_Sub35 local16 = (Class3_Sub35) this.aClass140_27.method3490((long) arg1);
			return local16 == null ? arg0 : local16.aString52;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
	public void method3607() {
		if (this.anIntArray285 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray285.length; local6 += 2) {
			if (this.anIntArray285[local6] < this.anInt4338) {
				this.anInt4338 = this.anIntArray285[local6];
			} else if (this.anIntArray285[local6] > this.anInt4320) {
				this.anInt4320 = this.anIntArray285[local6];
			}
			if (this.anInt4346 > this.anIntArray285[local6 + 1]) {
				this.anInt4346 = this.anIntArray285[local6 + 1];
			} else if (this.anInt4348 < this.anIntArray285[local6 + 1]) {
				this.anInt4348 = this.anIntArray285[local6 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!kd;B)Z")
	public boolean method3608(@OriginalArg(0) Interface6 arg0) {
		@Pc(24) int local24;
		if (this.anInt4331 == -1) {
			if (this.anInt4318 == -1) {
				return true;
			}
			local24 = arg0.method1268(this.anInt4318);
		} else {
			local24 = arg0.method1267(this.anInt4331);
		}
		if (local24 < this.anInt4337 || this.anInt4335 < local24) {
			return false;
		}
		@Pc(66) int local66;
		if (this.anInt4350 == -1) {
			if (this.anInt4333 == -1) {
				return true;
			}
			local66 = arg0.method1268(this.anInt4333);
		} else {
			local66 = arg0.method1267(this.anInt4350);
		}
		return local66 >= this.anInt4345 && this.anInt4341 >= local66;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZILclient!qa;)Lclient!aa;")
	public Class2 method3609(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class167 arg1) {
		@Pc(19) int local19 = arg0 ? this.anInt4344 : this.anInt4321;
		@Pc(26) int local26 = arg1.anInt7365 << 29 | local19;
		@Pc(35) Class2 local35 = (Class2) this.aClass45_4.aClass268_10.method6166((long) local26);
		if (local35 != null) {
			return local35;
		} else if (this.aClass45_4.aClass250_20.method5813(local19)) {
			@Pc(55) Class154 local55 = Static467.method3619(this.aClass45_4.aClass250_20, local19, 0);
			if (local55 != null) {
				local35 = arg1.method5993(local55);
				this.aClass45_4.aClass268_10.method6164(local35, (long) local26);
			}
			return local35;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)I")
	public int method3610(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass140_27 == null) {
			return arg1;
		} else {
			@Pc(16) Class3_Sub30 local16 = (Class3_Sub30) this.aClass140_27.method3490((long) arg0);
			return local16 == null ? arg1 : local16.anInt3957;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILclient!qa;)Lclient!aa;")
	public Class2 method3612(@OriginalArg(1) Class167 arg0) {
		@Pc(20) Class2 local20 = (Class2) this.aClass45_4.aClass268_10.method6166((long) (arg0.anInt7365 << 29 | this.anInt4326 | 0x20000));
		if (local20 != null) {
			return local20;
		}
		this.aClass45_4.aClass250_20.method5813(this.anInt4326);
		@Pc(40) Class154 local40 = Static467.method3619(this.aClass45_4.aClass250_20, this.anInt4326, 0);
		if (local40 != null) {
			local20 = arg0.method5993(local40);
			this.aClass45_4.aClass268_10.method6164(local20, (long) (arg0.anInt7365 << 29 | this.anInt4326 | 0x20000));
		}
		return local20;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!nj;I)V")
	public void method3613(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method4096();
			if (local12 == 0) {
				return;
			}
			this.method3614(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILclient!nj;I)V")
	private void method3614(@OriginalArg(1) Class3_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4321 = arg0.method4083();
		} else if (arg1 == 2) {
			this.anInt4344 = arg0.method4083();
		} else if (arg1 == 3) {
			this.aString49 = arg0.method4073();
		} else if (arg1 == 4) {
			this.anInt4336 = arg0.method4099();
		} else if (arg1 == 5) {
			this.anInt4325 = arg0.method4099();
		} else if (arg1 == 6) {
			this.anInt4332 = arg0.method4096();
		} else {
			@Pc(42) int local42;
			if (arg1 == 7) {
				local42 = arg0.method4096();
				if ((local42 & 0x1) == 0) {
					this.aBoolean316 = false;
				}
				if ((local42 & 0x2) == 2) {
					this.aBoolean315 = true;
					return;
				}
			} else if (arg1 == 8) {
				this.aBoolean314 = arg0.method4096() == 1;
			} else if (arg1 == 9) {
				this.anInt4318 = arg0.method4083();
				if (this.anInt4318 == 65535) {
					this.anInt4318 = -1;
				}
				this.anInt4331 = arg0.method4083();
				if (this.anInt4331 == 65535) {
					this.anInt4331 = -1;
				}
				this.anInt4337 = arg0.method4108();
				this.anInt4335 = arg0.method4108();
				return;
			} else if (arg1 < 10 || arg1 > 14) {
				@Pc(126) int local126;
				if (arg1 != 15) {
					if (arg1 == 16) {
						this.aBoolean317 = false;
						return;
					}
					if (arg1 == 17) {
						this.aString50 = arg0.method4073();
						return;
					}
					if (arg1 == 18) {
						this.anInt4326 = arg0.method4083();
						return;
					}
					if (arg1 == 19) {
						this.anInt4347 = arg0.method4083();
						return;
					}
					if (arg1 == 20) {
						this.anInt4333 = arg0.method4083();
						if (this.anInt4333 == 65535) {
							this.anInt4333 = -1;
						}
						this.anInt4350 = arg0.method4083();
						if (this.anInt4350 == 65535) {
							this.anInt4350 = -1;
						}
						this.anInt4345 = arg0.method4108();
						this.anInt4341 = arg0.method4108();
						return;
					}
					if (arg1 == 21) {
						this.anInt4329 = arg0.method4108();
						return;
					}
					if (arg1 == 22) {
						this.anInt4319 = arg0.method4108();
					} else if (arg1 == 249) {
						local42 = arg0.method4096();
						if (this.aClass140_27 == null) {
							local126 = Static342.method4774(local42);
							this.aClass140_27 = new Class140(local126);
						}
						for (local126 = 0; local126 < local42; local126++) {
							@Pc(283) boolean local283 = arg0.method4096() == 1;
							@Pc(289) int local289 = arg0.method4099();
							@Pc(298) Class3 local298;
							if (local283) {
								local298 = new Class3_Sub35(arg0.method4073());
							} else {
								local298 = new Class3_Sub30(arg0.method4108());
							}
							this.aClass140_27.method3494((long) local289, local298);
						}
						return;
					}
					return;
				}
				local42 = arg0.method4096();
				this.anIntArray285 = new int[local42 * 2];
				for (local126 = 0; local126 < local42 * 2; local126++) {
					this.anIntArray285[local126] = arg0.method4065();
				}
				this.anInt4327 = arg0.method4108();
				this.anInt4349 = arg0.method4108();
				return;
			} else {
				this.aStringArray28[arg1 - 10] = arg0.method4073();
				return;
			}
		}
	}
}
