import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class137 {

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
	public int anInt4310;

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "Ljava/lang/String;")
	public String aString46;

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "Lclient!tq;")
	private Class305 aClass305_21;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
	private int anInt4311;

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "Lclient!br;")
	public Class42 aClass42_4;

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "Ljava/lang/String;")
	public String aString47;

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
	public int anInt4314;

	@OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
	public int anInt4320;

	@OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
	private int anInt4321;

	@OriginalMember(owner = "client!hk", name = "F", descriptor = "I")
	private int anInt4327;

	@OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
	public int anInt4329;

	@OriginalMember(owner = "client!hk", name = "I", descriptor = "[I")
	public int[] anIntArray278;

	@OriginalMember(owner = "client!hk", name = "L", descriptor = "I")
	private int anInt4332;

	@OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
	public int anInt4333;

	@OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
	public int anInt4335;

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
	public int anInt4307 = -1;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
	private int anInt4306 = -1;

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
	public int anInt4318 = -1;

	@OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
	private int anInt4319 = -1;

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "Z")
	public boolean aBoolean351 = false;

	@OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
	private int anInt4323 = -1;

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
	public int anInt4315 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
	public int anInt4309 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!hk", name = "D", descriptor = "I")
	public int anInt4326 = -1;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
	private int anInt4312 = -1;

	@OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
	public int anInt4328 = -1;

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
	public int anInt4313 = 0;

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray23 = new String[5];

	@OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
	public int anInt4325 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!hk", name = "E", descriptor = "Z")
	public boolean aBoolean352 = true;

	@OriginalMember(owner = "client!hk", name = "O", descriptor = "Z")
	public boolean aBoolean353 = true;

	@OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
	public int anInt4337 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "Z")
	public boolean aBoolean350 = true;

	@OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
	private int anInt4331 = -1;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method3763(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass305_21 == null) {
			return arg1;
		} else {
			@Pc(24) Class6_Sub30 local24 = (Class6_Sub30) this.aClass305_21.method7447((long) arg0);
			return local24 == null ? arg1 : local24.aString55;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZLclient!oa;B)Lclient!xa;")
	public Class66 method3764(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class9 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt4307 : this.anInt4328;
		@Pc(18) int local18 = local11 | arg1.anInt6348 << 29;
		@Pc(27) Class66 local27 = (Class66) this.aClass42_4.aClass245_14.method6082((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass42_4.aClass168_18.method4427(local11)) {
			@Pc(52) Class1 local52 = Static583.method55(this.aClass42_4.aClass168_18, local11, 0);
			if (local52 != null) {
				local27 = arg1.method5412(local52);
				this.aClass42_4.aClass245_14.method6075(local27, (long) local18);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZLclient!oba;)Z")
	public boolean method3765(@OriginalArg(1) Interface15 arg0) {
		@Pc(28) int local28;
		if (this.anInt4323 == -1) {
			if (this.anInt4312 == -1) {
				return true;
			}
			local28 = arg0.method5829(this.anInt4312);
		} else {
			local28 = arg0.method5828(this.anInt4323);
		}
		if (this.anInt4311 > local28 || local28 > this.anInt4321) {
			return false;
		}
		@Pc(59) int local59;
		if (this.anInt4331 == -1) {
			if (this.anInt4306 == -1) {
				return true;
			}
			local59 = arg0.method5829(this.anInt4306);
		} else {
			local59 = arg0.method5828(this.anInt4331);
		}
		return this.anInt4332 <= local59 && local59 <= this.anInt4327;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!oa;B)Lclient!xa;")
	public Class66 method3767(@OriginalArg(0) Class9 arg0) {
		@Pc(20) Class66 local20 = (Class66) this.aClass42_4.aClass245_14.method6082((long) (arg0.anInt6348 << 29 | this.anInt4319 | 0x20000));
		if (local20 != null) {
			return local20;
		}
		this.aClass42_4.aClass168_18.method4427(this.anInt4319);
		@Pc(49) Class1 local49 = Static583.method55(this.aClass42_4.aClass168_18, this.anInt4319, 0);
		if (local49 != null) {
			local20 = arg0.method5412(local49);
			this.aClass42_4.aClass245_14.method6075(local20, (long) (this.anInt4319 | 0x20000 | arg0.anInt6348 << 29));
		}
		return local20;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!iaa;ZI)V")
	private void method3768(@OriginalArg(0) Class6_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4328 = arg0.method4999();
		} else if (arg1 == 2) {
			this.anInt4307 = arg0.method4999();
		} else if (arg1 == 3) {
			this.aString46 = arg0.method4941();
		} else if (arg1 == 4) {
			this.anInt4314 = arg0.method4949();
		} else if (arg1 == 5) {
			this.anInt4318 = arg0.method4949();
		} else if (arg1 == 6) {
			this.anInt4313 = arg0.method4966();
		} else {
			@Pc(55) int local55;
			if (arg1 == 7) {
				local55 = arg0.method4966();
				if ((local55 & 0x1) == 0) {
					this.aBoolean350 = false;
				}
				if ((local55 & 0x2) == 2) {
					this.aBoolean351 = true;
				}
			} else if (arg1 == 8) {
				this.aBoolean352 = arg0.method4966() == 1;
			} else if (arg1 == 9) {
				this.anInt4312 = arg0.method4999();
				if (this.anInt4312 == 65535) {
					this.anInt4312 = -1;
				}
				this.anInt4323 = arg0.method4999();
				if (this.anInt4323 == 65535) {
					this.anInt4323 = -1;
				}
				this.anInt4311 = arg0.method5000();
				this.anInt4321 = arg0.method5000();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray23[arg1 - 10] = arg0.method4941();
			} else {
				@Pc(256) int local256;
				if (arg1 == 15) {
					local55 = arg0.method4966();
					this.anIntArray278 = new int[local55 * 2];
					for (local256 = 0; local256 < local55 * 2; local256++) {
						this.anIntArray278[local256] = arg0.method4974();
					}
					this.anInt4310 = arg0.method5000();
					this.anInt4329 = arg0.method5000();
				} else if (arg1 == 16) {
					this.aBoolean353 = false;
				} else if (arg1 == 17) {
					this.aString47 = arg0.method4941();
				} else if (arg1 == 18) {
					this.anInt4319 = arg0.method4999();
				} else if (arg1 == 19) {
					this.anInt4326 = arg0.method4999();
				} else if (arg1 == 20) {
					this.anInt4306 = arg0.method4999();
					if (this.anInt4306 == 65535) {
						this.anInt4306 = -1;
					}
					this.anInt4331 = arg0.method4999();
					if (this.anInt4331 == 65535) {
						this.anInt4331 = -1;
					}
					this.anInt4332 = arg0.method5000();
					this.anInt4327 = arg0.method5000();
				} else if (arg1 == 21) {
					this.anInt4335 = arg0.method5000();
				} else if (arg1 == 22) {
					this.anInt4320 = arg0.method5000();
				} else if (arg1 == 249) {
					local55 = arg0.method4966();
					if (this.aClass305_21 == null) {
						local256 = Static247.method4363(local55);
						this.aClass305_21 = new Class305(local256);
					}
					for (local256 = 0; local256 < local55; local256++) {
						@Pc(275) boolean local275 = arg0.method4966() == 1;
						@Pc(279) int local279 = arg0.method4949();
						@Pc(288) Class6 local288;
						if (local275) {
							local288 = new Class6_Sub30(arg0.method4941());
						} else {
							local288 = new Class6_Sub24(arg0.method5000());
						}
						this.aClass305_21.method7448((long) local279, local288);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZLclient!iaa;)V")
	public void method3769(@OriginalArg(1) Class6_Sub26 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4966();
			if (local9 == 0) {
				return;
			}
			this.method3768(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
	public void method3770() {
		if (this.anIntArray278 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray278.length; local6 += 2) {
			if (this.anInt4315 > this.anIntArray278[local6]) {
				this.anInt4315 = this.anIntArray278[local6];
			} else if (this.anInt4325 < this.anIntArray278[local6]) {
				this.anInt4325 = this.anIntArray278[local6];
			}
			if (this.anIntArray278[local6 + 1] < this.anInt4309) {
				this.anInt4309 = this.anIntArray278[local6 + 1];
			} else if (this.anInt4337 < this.anIntArray278[local6 + 1]) {
				this.anInt4337 = this.anIntArray278[local6 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)I")
	public int method3772(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass305_21 == null) {
			return arg0;
		} else {
			@Pc(16) Class6_Sub24 local16 = (Class6_Sub24) this.aClass305_21.method7447((long) arg1);
			return local16 == null ? arg0 : local16.anInt4156;
		}
	}
}
