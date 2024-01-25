import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class262 {

	@OriginalMember(owner = "client!or", name = "a", descriptor = "Ljava/lang/String;")
	public String aString72;

	@OriginalMember(owner = "client!or", name = "b", descriptor = "I")
	public int anInt7610;

	@OriginalMember(owner = "client!or", name = "c", descriptor = "I")
	private int anInt7611;

	@OriginalMember(owner = "client!or", name = "d", descriptor = "Lclient!tga;")
	private Class335 aClass335_39;

	@OriginalMember(owner = "client!or", name = "e", descriptor = "I")
	public int anInt7612;

	@OriginalMember(owner = "client!or", name = "i", descriptor = "I")
	public int anInt7614;

	@OriginalMember(owner = "client!or", name = "n", descriptor = "Ljava/lang/String;")
	public String aString73;

	@OriginalMember(owner = "client!or", name = "o", descriptor = "I")
	private int anInt7618;

	@OriginalMember(owner = "client!or", name = "p", descriptor = "I")
	public int anInt7619;

	@OriginalMember(owner = "client!or", name = "q", descriptor = "[I")
	public int[] anIntArray426;

	@OriginalMember(owner = "client!or", name = "t", descriptor = "I")
	private int anInt7622;

	@OriginalMember(owner = "client!or", name = "z", descriptor = "[I")
	public int[] anIntArray427;

	@OriginalMember(owner = "client!or", name = "F", descriptor = "I")
	public int anInt7631;

	@OriginalMember(owner = "client!or", name = "I", descriptor = "I")
	private int anInt7634;

	@OriginalMember(owner = "client!or", name = "M", descriptor = "[B")
	public byte[] aByteArray76;

	@OriginalMember(owner = "client!or", name = "O", descriptor = "Lclient!lha;")
	public Class218 aClass218_4;

	@OriginalMember(owner = "client!or", name = "T", descriptor = "I")
	public int anInt7641;

	@OriginalMember(owner = "client!or", name = "Y", descriptor = "I")
	public int anInt7645;

	@OriginalMember(owner = "client!or", name = "r", descriptor = "I")
	public int anInt7620 = -1;

	@OriginalMember(owner = "client!or", name = "j", descriptor = "I")
	public int anInt7615 = -1;

	@OriginalMember(owner = "client!or", name = "f", descriptor = "Z")
	public boolean aBoolean557 = true;

	@OriginalMember(owner = "client!or", name = "s", descriptor = "I")
	public int anInt7621 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!or", name = "x", descriptor = "I")
	public int anInt7625 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!or", name = "C", descriptor = "I")
	public int anInt7628 = -1;

	@OriginalMember(owner = "client!or", name = "w", descriptor = "I")
	public int anInt7624 = -1;

	@OriginalMember(owner = "client!or", name = "m", descriptor = "I")
	private int anInt7617 = -1;

	@OriginalMember(owner = "client!or", name = "H", descriptor = "I")
	private int anInt7633 = -1;

	@OriginalMember(owner = "client!or", name = "l", descriptor = "Z")
	public boolean aBoolean558 = true;

	@OriginalMember(owner = "client!or", name = "k", descriptor = "I")
	public int anInt7616 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!or", name = "K", descriptor = "I")
	private int anInt7636 = -1;

	@OriginalMember(owner = "client!or", name = "v", descriptor = "I")
	public int anInt7623 = 0;

	@OriginalMember(owner = "client!or", name = "Q", descriptor = "I")
	public int anInt7639 = -1;

	@OriginalMember(owner = "client!or", name = "U", descriptor = "I")
	public int anInt7642 = -1;

	@OriginalMember(owner = "client!or", name = "P", descriptor = "I")
	private int anInt7638 = -1;

	@OriginalMember(owner = "client!or", name = "L", descriptor = "Z")
	public boolean aBoolean560 = false;

	@OriginalMember(owner = "client!or", name = "S", descriptor = "Z")
	public boolean aBoolean561 = true;

	@OriginalMember(owner = "client!or", name = "V", descriptor = "I")
	public int anInt7643 = -1;

	@OriginalMember(owner = "client!or", name = "W", descriptor = "I")
	public int anInt7644 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!or", name = "u", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray28 = new String[5];

	@OriginalMember(owner = "client!or", name = "E", descriptor = "I")
	private int anInt7630 = -1;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BILclient!rv;)V")
	private void method6485(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt7628 = arg1.method3698();
		} else if (arg0 == 2) {
			this.anInt7620 = arg1.method3698();
		} else if (arg0 == 3) {
			this.aString72 = arg1.method3661();
		} else if (arg0 == 4) {
			this.anInt7619 = arg1.method3633();
		} else if (arg0 == 5) {
			this.anInt7639 = arg1.method3633();
		} else if (arg0 == 6) {
			this.anInt7623 = arg1.method3642();
		} else {
			@Pc(66) int local66;
			if (arg0 == 7) {
				local66 = arg1.method3642();
				if ((local66 & 0x2) == 2) {
					this.aBoolean560 = true;
				}
				if ((local66 & 0x1) == 0) {
					this.aBoolean558 = false;
					return;
				}
			} else if (arg0 == 8) {
				this.aBoolean561 = arg1.method3642() == 1;
			} else if (arg0 == 9) {
				this.anInt7630 = arg1.method3698();
				if (this.anInt7630 == 65535) {
					this.anInt7630 = -1;
				}
				this.anInt7617 = arg1.method3698();
				if (this.anInt7617 == 65535) {
					this.anInt7617 = -1;
				}
				this.anInt7611 = arg1.method3671();
				this.anInt7618 = arg1.method3671();
				return;
			} else if (arg0 < 10 || arg0 > 14) {
				@Pc(120) int local120;
				@Pc(149) int local149;
				if (arg0 != 15) {
					if (arg0 == 16) {
						this.aBoolean557 = false;
						return;
					}
					if (arg0 != 17) {
						if (arg0 != 18) {
							if (arg0 != 19) {
								if (arg0 != 20) {
									if (arg0 != 21) {
										if (arg0 != 22) {
											if (arg0 == 23) {
												this.anInt7624 = arg1.method3642();
												this.anInt7642 = arg1.method3642();
												this.anInt7643 = arg1.method3642();
											} else if (arg0 == 24) {
												this.anInt7612 = arg1.method3638();
												this.anInt7614 = arg1.method3638();
												return;
											} else if (arg0 == 249) {
												local66 = arg1.method3642();
												if (this.aClass335_39 == null) {
													local120 = Static209.method2991(local66);
													this.aClass335_39 = new Class335(local120);
												}
												for (local120 = 0; local120 < local66; local120++) {
													@Pc(268) boolean local268 = arg1.method3642() == 1;
													local149 = arg1.method3633();
													@Pc(281) Class5 local281;
													if (local268) {
														local281 = new Class5_Sub44(arg1.method3661());
													} else {
														local281 = new Class5_Sub43(arg1.method3671());
													}
													this.aClass335_39.method7770((long) local149, local281);
												}
												return;
											}
											return;
										}
										this.anInt7645 = arg1.method3671();
										return;
									}
									this.anInt7631 = arg1.method3671();
									return;
								}
								this.anInt7633 = arg1.method3698();
								if (this.anInt7633 == 65535) {
									this.anInt7633 = -1;
								}
								this.anInt7636 = arg1.method3698();
								if (this.anInt7636 == 65535) {
									this.anInt7636 = -1;
								}
								this.anInt7622 = arg1.method3671();
								this.anInt7634 = arg1.method3671();
								return;
							}
							this.anInt7615 = arg1.method3698();
							return;
						}
						this.anInt7638 = arg1.method3698();
						return;
					}
					this.aString73 = arg1.method3661();
					return;
				}
				local66 = arg1.method3642();
				this.anIntArray427 = new int[local66 * 2];
				for (local120 = 0; local120 < local66 * 2; local120++) {
					this.anIntArray427[local120] = arg1.method3638();
				}
				this.anInt7610 = arg1.method3671();
				@Pc(143) int local143 = arg1.method3642();
				this.anIntArray426 = new int[local143];
				for (local149 = 0; local149 < this.anIntArray426.length; local149++) {
					this.anIntArray426[local149] = arg1.method3671();
				}
				this.aByteArray76 = new byte[local66];
				for (@Pc(169) int local169 = 0; local169 < local66; local169++) {
					this.aByteArray76[local169] = arg1.method3677();
				}
				return;
			} else {
				this.aStringArray28[arg0 - 10] = arg1.method3661();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
	public String method6486(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass335_39 == null) {
			return arg0;
		} else {
			@Pc(21) Class5_Sub44 local21 = (Class5_Sub44) this.aClass335_39.method7766((long) arg1);
			return local21 == null ? arg0 : local21.aString83;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!ha;I)Lclient!qda;")
	public Class59 method6487(@OriginalArg(0) Class143 arg0) {
		@Pc(20) Class59 local20 = (Class59) this.aClass218_4.aClass265_33.method6577((long) (arg0.anInt7197 << 29 | 0x20000 | this.anInt7638));
		if (local20 != null) {
			return local20;
		}
		this.aClass218_4.aClass50_97.method897(this.anInt7638);
		@Pc(40) Class301 local40 = Static684.method7228(this.aClass218_4.aClass50_97, this.anInt7638, 0);
		if (local40 != null) {
			local20 = arg0.method6247(local40, true);
			this.aClass218_4.aClass265_33.method6566(local20, (long) (arg0.anInt7197 << 29 | this.anInt7638 | 0x20000));
		}
		return local20;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!rv;B)V")
	public void method6488(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3642();
			if (local13 == 0) {
				return;
			}
			this.method6485(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!ha;ZI)Lclient!qda;")
	public Class59 method6489(@OriginalArg(0) Class143 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt7620 : this.anInt7628;
		@Pc(18) int local18 = local11 | arg0.anInt7197 << 29;
		@Pc(27) Class59 local27 = (Class59) this.aClass218_4.aClass265_33.method6577((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass218_4.aClass50_97.method897(local11)) {
			@Pc(47) Class301 local47 = Static684.method7228(this.aClass218_4.aClass50_97, local11, 0);
			if (local47 != null) {
				local27 = arg0.method6247(local47, true);
				this.aClass218_4.aClass265_33.method6566(local27, (long) local18);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!qi;I)Z")
	public boolean method6490(@OriginalArg(0) Interface23 arg0) {
		@Pc(15) int local15;
		if (this.anInt7617 == -1) {
			if (this.anInt7630 == -1) {
				return true;
			}
			local15 = arg0.method1213(this.anInt7630);
		} else {
			local15 = arg0.method1214(this.anInt7617);
		}
		if (this.anInt7611 > local15 || this.anInt7618 < local15) {
			return false;
		}
		@Pc(61) int local61;
		if (this.anInt7636 == -1) {
			if (this.anInt7633 == -1) {
				return true;
			}
			local61 = arg0.method1213(this.anInt7633);
		} else {
			local61 = arg0.method1214(this.anInt7636);
		}
		return this.anInt7622 <= local61 && this.anInt7634 >= local61;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(III)I")
	public int method6491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass335_39 == null) {
			return arg0;
		} else {
			@Pc(25) Class5_Sub43 local25 = (Class5_Sub43) this.aClass335_39.method7766((long) arg1);
			return local25 == null ? arg0 : local25.anInt7821;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
	public void method6493() {
		if (this.anIntArray427 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray427.length; local17 += 2) {
			if (this.anInt7621 > this.anIntArray427[local17]) {
				this.anInt7621 = this.anIntArray427[local17];
			} else if (this.anInt7625 < this.anIntArray427[local17]) {
				this.anInt7625 = this.anIntArray427[local17];
			}
			if (this.anIntArray427[local17 + 1] < this.anInt7644) {
				this.anInt7644 = this.anIntArray427[local17 + 1];
			} else if (this.anInt7616 < this.anIntArray427[local17 + 1]) {
				this.anInt7616 = this.anIntArray427[local17 + 1];
			}
		}
	}
}
