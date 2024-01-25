import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class128 {

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "Ljava/lang/String;")
	public String aString36;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "[I")
	public int[] anIntArray259;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Ljava/lang/String;")
	public String aString37;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
	public int anInt3471;

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
	private int anInt3474;

	@OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
	private int anInt3483;

	@OriginalMember(owner = "client!jd", name = "C", descriptor = "Lclient!qi;")
	private Class208 aClass208_20;

	@OriginalMember(owner = "client!jd", name = "F", descriptor = "Lclient!ce;")
	public Class36 aClass36_1;

	@OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
	public int anInt3490;

	@OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
	public int anInt3491;

	@OriginalMember(owner = "client!jd", name = "I", descriptor = "I")
	public int anInt3492;

	@OriginalMember(owner = "client!jd", name = "K", descriptor = "I")
	private int anInt3494;

	@OriginalMember(owner = "client!jd", name = "L", descriptor = "I")
	public int anInt3495;

	@OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
	public int anInt3498;

	@OriginalMember(owner = "client!jd", name = "R", descriptor = "I")
	private int anInt3499;

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "Z")
	public boolean aBoolean337 = true;

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray23 = new String[5];

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "Z")
	public boolean aBoolean336 = true;

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
	private int anInt3473 = -1;

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "Z")
	public boolean aBoolean338 = true;

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
	public int anInt3476 = -1;

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
	private int anInt3485 = -1;

	@OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
	public int anInt3487 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
	public int anInt3482 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
	public int anInt3481 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
	private int anInt3489 = -1;

	@OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
	private int anInt3488 = -1;

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
	private int anInt3479 = -1;

	@OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
	public int anInt3480 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
	public int anInt3486 = -1;

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
	public int anInt3484 = -1;

	@OriginalMember(owner = "client!jd", name = "J", descriptor = "I")
	public int anInt3493 = 0;

	@OriginalMember(owner = "client!jd", name = "O", descriptor = "Z")
	public boolean aBoolean339 = false;

	@OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
	public int anInt3497 = -1;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!wm;ZI)V")
	private void method2735(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3486 = arg0.method2896();
		} else if (arg1 == 2) {
			this.anInt3476 = arg0.method2896();
		} else if (arg1 == 3) {
			this.aString36 = arg0.method2914();
		} else if (arg1 == 4) {
			this.anInt3492 = arg0.method2881();
		} else if (arg1 == 5) {
			this.anInt3497 = arg0.method2881();
		} else if (arg1 == 6) {
			this.anInt3493 = arg0.method2915();
		} else {
			@Pc(60) int local60;
			if (arg1 == 7) {
				local60 = arg0.method2915();
				if ((local60 & 0x1) == 0) {
					this.aBoolean337 = false;
				}
				if ((local60 & 0x2) == 2) {
					this.aBoolean339 = true;
					return;
				}
			} else if (arg1 == 8) {
				this.aBoolean338 = arg0.method2915() == 1;
				return;
			} else if (arg1 == 9) {
				this.anInt3485 = arg0.method2896();
				if (this.anInt3485 == 65535) {
					this.anInt3485 = -1;
				}
				this.anInt3488 = arg0.method2896();
				if (this.anInt3488 == 65535) {
					this.anInt3488 = -1;
				}
				this.anInt3499 = arg0.method2877();
				this.anInt3483 = arg0.method2877();
				return;
			} else if (arg1 < 10 || arg1 > 14) {
				@Pc(199) int local199;
				if (arg1 != 15) {
					if (arg1 != 16) {
						if (arg1 != 17) {
							if (arg1 != 18) {
								if (arg1 != 19) {
									if (arg1 != 20) {
										if (arg1 != 21) {
											if (arg1 == 22) {
												this.anInt3495 = arg0.method2877();
											} else if (arg1 == 249) {
												local60 = arg0.method2915();
												if (this.aClass208_20 == null) {
													local199 = Static191.method2764(local60);
													this.aClass208_20 = new Class208(local199);
												}
												for (local199 = 0; local199 < local60; local199++) {
													@Pc(220) boolean local220 = arg0.method2915() == 1;
													@Pc(224) int local224 = arg0.method2881();
													@Pc(233) Class1 local233;
													if (local220) {
														local233 = new Class1_Sub25(arg0.method2914());
													} else {
														local233 = new Class1_Sub18(arg0.method2877());
													}
													this.aClass208_20.method4413((long) local224, local233);
												}
												return;
											}
											return;
										}
										this.anInt3490 = arg0.method2877();
										return;
									}
									this.anInt3479 = arg0.method2896();
									if (this.anInt3479 == 65535) {
										this.anInt3479 = -1;
									}
									this.anInt3489 = arg0.method2896();
									if (this.anInt3489 == 65535) {
										this.anInt3489 = -1;
									}
									this.anInt3474 = arg0.method2877();
									this.anInt3494 = arg0.method2877();
									return;
								}
								this.anInt3484 = arg0.method2896();
								return;
							}
							this.anInt3473 = arg0.method2896();
							return;
						}
						this.aString37 = arg0.method2914();
						return;
					}
					this.aBoolean336 = false;
					return;
				}
				local60 = arg0.method2915();
				this.anIntArray259 = new int[local60 * 2];
				for (local199 = 0; local199 < local60 * 2; local199++) {
					this.anIntArray259[local199] = arg0.method2929();
				}
				this.anInt3471 = arg0.method2877();
				this.anInt3491 = arg0.method2877();
			} else {
				this.aStringArray23[arg1 - 10] = arg0.method2914();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method2736(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass208_20 == null) {
			return arg0;
		} else {
			@Pc(21) Class1_Sub25 local21 = (Class1_Sub25) this.aClass208_20.method4405((long) arg1);
			return local21 == null ? arg0 : local21.aString39;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZLclient!vk;)Z")
	public boolean method2737(@OriginalArg(1) Interface12 arg0) {
		@Pc(21) int local21;
		if (this.anInt3488 == -1) {
			if (this.anInt3485 == -1) {
				return true;
			}
			local21 = arg0.method31(this.anInt3485);
		} else {
			local21 = arg0.method30(this.anInt3488);
		}
		if (this.anInt3499 > local21 || this.anInt3483 < local21) {
			return false;
		}
		@Pc(70) int local70;
		if (this.anInt3489 == -1) {
			if (this.anInt3479 == -1) {
				return true;
			}
			local70 = arg0.method31(this.anInt3479);
		} else {
			local70 = arg0.method30(this.anInt3489);
		}
		return this.anInt3474 <= local70 && local70 <= this.anInt3494;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZZLclient!za;)Lclient!o;")
	public Class85 method2738(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class117 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt3476 : this.anInt3486;
		@Pc(24) int local24 = arg1.anInt7048 << 29 | local11;
		@Pc(33) Class85 local33 = (Class85) this.aClass36_1.aClass77_10.method1387((long) local24);
		if (local33 != null) {
			return local33;
		} else if (this.aClass36_1.aClass185_10.method4000(local11)) {
			@Pc(53) Class52 local53 = Static467.method891(this.aClass36_1.aClass185_10, local11, 0);
			if (local53 != null) {
				local33 = arg1.method5707(local53);
				this.aClass36_1.aClass77_10.method1396(local33, (long) local24);
			}
			return local33;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!wm;)V")
	public void method2739(@OriginalArg(1) Class1_Sub19 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2915();
			if (local5 == 0) {
				return;
			}
			this.method2735(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!za;Z)Lclient!o;")
	public Class85 method2740(@OriginalArg(0) Class117 arg0) {
		@Pc(20) Class85 local20 = (Class85) this.aClass36_1.aClass77_10.method1387((long) (arg0.anInt7048 << 29 | 0x20000 | this.anInt3473));
		if (local20 != null) {
			return local20;
		}
		this.aClass36_1.aClass185_10.method4000(this.anInt3473);
		@Pc(49) Class52 local49 = Static467.method891(this.aClass36_1.aClass185_10, this.anInt3473, 0);
		if (local49 != null) {
			local20 = arg0.method5707(local49);
			this.aClass36_1.aClass77_10.method1396(local20, (long) (this.anInt3473 | 0x20000 | arg0.anInt7048 << 29));
		}
		return local20;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)I")
	public int method2742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass208_20 == null) {
			return arg1;
		} else {
			@Pc(21) Class1_Sub18 local21 = (Class1_Sub18) this.aClass208_20.method4405((long) arg0);
			return local21 == null ? arg1 : local21.anInt2354;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public void method2743() {
		if (this.anIntArray259 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray259.length; local17 += 2) {
			if (this.anInt3480 > this.anIntArray259[local17]) {
				this.anInt3480 = this.anIntArray259[local17];
			} else if (this.anIntArray259[local17] > this.anInt3481) {
				this.anInt3481 = this.anIntArray259[local17];
			}
			if (this.anIntArray259[local17 + 1] < this.anInt3487) {
				this.anInt3487 = this.anIntArray259[local17 + 1];
			} else if (this.anIntArray259[local17 + 1] > this.anInt3482) {
				this.anInt3482 = this.anIntArray259[local17 + 1];
			}
		}
	}
}
