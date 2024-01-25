import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class105 {

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
	public int anInt3382;

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "Ljava/lang/String;")
	public String aString34;

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
	public int anInt3387;

	@OriginalMember(owner = "client!fo", name = "m", descriptor = "I")
	public int anInt3390;

	@OriginalMember(owner = "client!fo", name = "v", descriptor = "[I")
	public int[] anIntArray205;

	@OriginalMember(owner = "client!fo", name = "w", descriptor = "I")
	public int anInt3398;

	@OriginalMember(owner = "client!fo", name = "y", descriptor = "Lclient!uaa;")
	public Class337 aClass337_1;

	@OriginalMember(owner = "client!fo", name = "A", descriptor = "Ljava/lang/String;")
	public String aString35;

	@OriginalMember(owner = "client!fo", name = "C", descriptor = "I")
	private int anInt3402;

	@OriginalMember(owner = "client!fo", name = "D", descriptor = "I")
	private int anInt3403;

	@OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
	public int anInt3404;

	@OriginalMember(owner = "client!fo", name = "L", descriptor = "I")
	private int anInt3409;

	@OriginalMember(owner = "client!fo", name = "O", descriptor = "I")
	public int anInt3411;

	@OriginalMember(owner = "client!fo", name = "P", descriptor = "I")
	public int anInt3412;

	@OriginalMember(owner = "client!fo", name = "R", descriptor = "Lclient!he;")
	private Class128 aClass128_10;

	@OriginalMember(owner = "client!fo", name = "S", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!fo", name = "V", descriptor = "I")
	private int anInt3416;

	@OriginalMember(owner = "client!fo", name = "Y", descriptor = "[I")
	public int[] anIntArray206;

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "Z")
	public boolean aBoolean243 = true;

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
	public int anInt3386 = -1;

	@OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
	public int anInt3388 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
	public int anInt3381 = -1;

	@OriginalMember(owner = "client!fo", name = "o", descriptor = "I")
	public int anInt3392 = -1;

	@OriginalMember(owner = "client!fo", name = "q", descriptor = "I")
	private int anInt3394 = -1;

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
	public int anInt3385 = -1;

	@OriginalMember(owner = "client!fo", name = "M", descriptor = "I")
	private int anInt3410 = -1;

	@OriginalMember(owner = "client!fo", name = "t", descriptor = "I")
	public int anInt3396 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
	private int anInt3383 = -1;

	@OriginalMember(owner = "client!fo", name = "l", descriptor = "Z")
	public boolean aBoolean244 = true;

	@OriginalMember(owner = "client!fo", name = "I", descriptor = "Z")
	public boolean aBoolean245 = false;

	@OriginalMember(owner = "client!fo", name = "G", descriptor = "I")
	public int anInt3406 = -1;

	@OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
	private int anInt3407 = -1;

	@OriginalMember(owner = "client!fo", name = "s", descriptor = "I")
	public int anInt3395 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fo", name = "U", descriptor = "I")
	public int anInt3415 = -1;

	@OriginalMember(owner = "client!fo", name = "T", descriptor = "I")
	public int anInt3414 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fo", name = "W", descriptor = "I")
	private int anInt3417 = -1;

	@OriginalMember(owner = "client!fo", name = "Q", descriptor = "I")
	public int anInt3413 = -1;

	@OriginalMember(owner = "client!fo", name = "N", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray29 = new String[5];

	@OriginalMember(owner = "client!fo", name = "X", descriptor = "Z")
	public boolean aBoolean246 = true;

	@OriginalMember(owner = "client!fo", name = "Z", descriptor = "I")
	public int anInt3418 = 0;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!ha;ZB)Lclient!pga;")
	public Class32 method3034(@OriginalArg(0) Class100 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt3415 : this.anInt3413;
		@Pc(18) int local18 = local11 | arg0.anInt10378 << 29;
		@Pc(27) Class32 local27 = (Class32) this.aClass337_1.aClass166_60.method4805((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass337_1.aClass353_120.method8401(local11)) {
			@Pc(55) Class98 local55 = Static651.method2404(this.aClass337_1.aClass353_120, local11, 0);
			if (local55 != null) {
				local27 = arg0.method8773(local55, true);
				this.aClass337_1.aClass166_60.method4803(local27, (long) local18);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V")
	public void method3035() {
		if (this.anIntArray205 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray205.length; local6 += 2) {
			if (this.anIntArray205[local6] < this.anInt3396) {
				this.anInt3396 = this.anIntArray205[local6];
			} else if (this.anIntArray205[local6] > this.anInt3388) {
				this.anInt3388 = this.anIntArray205[local6];
			}
			if (this.anInt3395 > this.anIntArray205[local6 + 1]) {
				this.anInt3395 = this.anIntArray205[local6 + 1];
			} else if (this.anIntArray205[local6 + 1] > this.anInt3414) {
				this.anInt3414 = this.anIntArray205[local6 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZII)I")
	public int method3036(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass128_10 == null) {
			return arg0;
		} else {
			@Pc(16) Class6_Sub48 local16 = (Class6_Sub48) this.aClass128_10.method3560((long) arg1);
			return local16 == null ? arg0 : local16.anInt9611;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!rg;)V")
	public void method3038(@OriginalArg(1) Class6_Sub40 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method8604();
			if (local11 == 0) {
				return;
			}
			this.method3041(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!ha;B)Lclient!pga;")
	public Class32 method3040(@OriginalArg(0) Class100 arg0) {
		@Pc(25) Class32 local25 = (Class32) this.aClass337_1.aClass166_60.method4805((long) (this.anInt3417 | 0x20000 | arg0.anInt10378 << 29));
		if (local25 != null) {
			return local25;
		}
		this.aClass337_1.aClass353_120.method8401(this.anInt3417);
		@Pc(45) Class98 local45 = Static651.method2404(this.aClass337_1.aClass353_120, this.anInt3417, 0);
		if (local45 != null) {
			local25 = arg0.method8773(local45, true);
			this.aClass337_1.aClass166_60.method4803(local25, (long) (this.anInt3417 | 0x20000 | arg0.anInt10378 << 29));
		}
		return local25;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!rg;I)V")
	private void method3041(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub40 arg1) {
		if (arg0 == 1) {
			this.anInt3413 = arg1.method8571();
		} else if (arg0 == 2) {
			this.anInt3415 = arg1.method8571();
		} else if (arg0 == 3) {
			this.aString35 = arg1.method8611();
		} else if (arg0 == 4) {
			this.anInt3404 = arg1.method8606();
		} else if (arg0 == 5) {
			this.anInt3385 = arg1.method8606();
		} else if (arg0 == 6) {
			this.anInt3418 = arg1.method8604();
		} else {
			@Pc(112) int local112;
			if (arg0 == 7) {
				local112 = arg1.method8604();
				if ((local112 & 0x1) == 0) {
					this.aBoolean246 = false;
				}
				if ((local112 & 0x2) == 2) {
					this.aBoolean245 = true;
				}
			} else if (arg0 == 8) {
				this.aBoolean243 = arg1.method8604() == 1;
			} else if (arg0 == 9) {
				this.anInt3407 = arg1.method8571();
				if (this.anInt3407 == 65535) {
					this.anInt3407 = -1;
				}
				this.anInt3410 = arg1.method8571();
				if (this.anInt3410 == 65535) {
					this.anInt3410 = -1;
				}
				this.anInt3416 = arg1.method8579();
				this.anInt3403 = arg1.method8579();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray29[arg0 - 10] = arg1.method8611();
			} else {
				@Pc(120) int local120;
				@Pc(152) int local152;
				if (arg0 == 15) {
					local112 = arg1.method8604();
					this.anIntArray205 = new int[local112 * 2];
					for (local120 = 0; local120 < local112 * 2; local120++) {
						this.anIntArray205[local120] = arg1.method8615();
					}
					this.anInt3382 = arg1.method8579();
					@Pc(146) int local146 = arg1.method8604();
					this.anIntArray206 = new int[local146];
					for (local152 = 0; local152 < this.anIntArray206.length; local152++) {
						this.anIntArray206[local152] = arg1.method8579();
					}
					this.aByteArray46 = new byte[local112];
					for (@Pc(173) int local173 = 0; local173 < local112; local173++) {
						this.aByteArray46[local173] = arg1.method8602();
					}
				} else if (arg0 == 16) {
					this.aBoolean244 = false;
				} else if (arg0 == 17) {
					this.aString34 = arg1.method8611();
				} else if (arg0 == 18) {
					this.anInt3417 = arg1.method8571();
				} else if (arg0 == 19) {
					this.anInt3392 = arg1.method8571();
				} else if (arg0 == 20) {
					this.anInt3383 = arg1.method8571();
					if (this.anInt3383 == 65535) {
						this.anInt3383 = -1;
					}
					this.anInt3394 = arg1.method8571();
					if (this.anInt3394 == 65535) {
						this.anInt3394 = -1;
					}
					this.anInt3409 = arg1.method8579();
					this.anInt3402 = arg1.method8579();
				} else if (arg0 == 21) {
					this.anInt3387 = arg1.method8579();
				} else if (arg0 == 22) {
					this.anInt3390 = arg1.method8579();
				} else if (arg0 == 23) {
					this.anInt3381 = arg1.method8604();
					this.anInt3386 = arg1.method8604();
					this.anInt3406 = arg1.method8604();
				} else if (arg0 == 24) {
					this.anInt3398 = arg1.method8615();
					this.anInt3411 = arg1.method8615();
				} else if (arg0 == 249) {
					local112 = arg1.method8604();
					if (this.aClass128_10 == null) {
						local120 = Static567.method8129(local112);
						this.aClass128_10 = new Class128(local120);
					}
					for (local120 = 0; local120 < local112; local120++) {
						@Pc(310) boolean local310 = arg1.method8604() == 1;
						local152 = arg1.method8606();
						@Pc(323) Class6 local323;
						if (local310) {
							local323 = new Class6_Sub18(arg1.method8611());
						} else {
							local323 = new Class6_Sub48(arg1.method8579());
						}
						this.aClass128_10.method3551((long) local152, local323);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!vi;I)Z")
	public boolean method3042(@OriginalArg(0) Interface25 arg0) {
		@Pc(22) int local22;
		if (this.anInt3410 == -1) {
			if (this.anInt3407 == -1) {
				return true;
			}
			local22 = arg0.method7412(this.anInt3407);
		} else {
			local22 = arg0.method7411(this.anInt3410);
		}
		if (local22 < this.anInt3416 || this.anInt3403 < local22) {
			return false;
		}
		@Pc(67) int local67;
		if (this.anInt3394 == -1) {
			if (this.anInt3383 == -1) {
				return true;
			}
			local67 = arg0.method7412(this.anInt3383);
		} else {
			local67 = arg0.method7411(this.anInt3394);
		}
		return this.anInt3409 <= local67 && this.anInt3402 >= local67;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method3043(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass128_10 == null) {
			return arg1;
		} else {
			@Pc(24) Class6_Sub18 local24 = (Class6_Sub18) this.aClass128_10.method3560((long) arg0);
			return local24 == null ? arg1 : local24.aString33;
		}
	}
}
