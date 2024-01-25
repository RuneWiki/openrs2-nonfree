import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!maa")
public final class Class182 {

	@OriginalMember(owner = "client!maa", name = "c", descriptor = "I")
	private int anInt5321;

	@OriginalMember(owner = "client!maa", name = "e", descriptor = "I")
	private int anInt5323;

	@OriginalMember(owner = "client!maa", name = "f", descriptor = "I")
	private int anInt5324;

	@OriginalMember(owner = "client!maa", name = "h", descriptor = "I")
	public int anInt5325;

	@OriginalMember(owner = "client!maa", name = "i", descriptor = "Lclient!ica;")
	private Class127 aClass127_33;

	@OriginalMember(owner = "client!maa", name = "k", descriptor = "[I")
	public int[] anIntArray468;

	@OriginalMember(owner = "client!maa", name = "n", descriptor = "Lclient!dj;")
	public Class56 aClass56_3;

	@OriginalMember(owner = "client!maa", name = "o", descriptor = "I")
	public int anInt5329;

	@OriginalMember(owner = "client!maa", name = "q", descriptor = "Ljava/lang/String;")
	public String aString118;

	@OriginalMember(owner = "client!maa", name = "z", descriptor = "I")
	public int anInt5337;

	@OriginalMember(owner = "client!maa", name = "F", descriptor = "I")
	public int anInt5341;

	@OriginalMember(owner = "client!maa", name = "J", descriptor = "I")
	private int anInt5344;

	@OriginalMember(owner = "client!maa", name = "Q", descriptor = "I")
	public int anInt5349;

	@OriginalMember(owner = "client!maa", name = "T", descriptor = "I")
	public int anInt5351;

	@OriginalMember(owner = "client!maa", name = "U", descriptor = "Ljava/lang/String;")
	public String aString119;

	@OriginalMember(owner = "client!maa", name = "j", descriptor = "I")
	public int anInt5326 = 0;

	@OriginalMember(owner = "client!maa", name = "l", descriptor = "I")
	public int anInt5327 = -1;

	@OriginalMember(owner = "client!maa", name = "p", descriptor = "I")
	private int anInt5330 = -1;

	@OriginalMember(owner = "client!maa", name = "m", descriptor = "I")
	public int anInt5328 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!maa", name = "r", descriptor = "I")
	public int anInt5331 = -1;

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "I")
	private int anInt5319 = -1;

	@OriginalMember(owner = "client!maa", name = "s", descriptor = "Z")
	public boolean aBoolean396 = true;

	@OriginalMember(owner = "client!maa", name = "G", descriptor = "Z")
	public boolean aBoolean398 = true;

	@OriginalMember(owner = "client!maa", name = "d", descriptor = "I")
	public int anInt5322 = -1;

	@OriginalMember(owner = "client!maa", name = "D", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray29 = new String[5];

	@OriginalMember(owner = "client!maa", name = "M", descriptor = "I")
	private int anInt5346 = -1;

	@OriginalMember(owner = "client!maa", name = "y", descriptor = "I")
	private int anInt5336 = -1;

	@OriginalMember(owner = "client!maa", name = "P", descriptor = "I")
	public int anInt5348 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!maa", name = "R", descriptor = "Z")
	public boolean aBoolean399 = true;

	@OriginalMember(owner = "client!maa", name = "E", descriptor = "I")
	public int anInt5340 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!maa", name = "A", descriptor = "Z")
	public boolean aBoolean397 = false;

	@OriginalMember(owner = "client!maa", name = "V", descriptor = "I")
	private int anInt5352 = -1;

	@OriginalMember(owner = "client!maa", name = "S", descriptor = "I")
	public int anInt5350 = -1;

	@OriginalMember(owner = "client!maa", name = "N", descriptor = "I")
	public int anInt5347 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(Z)V")
	public void method4595() {
		if (this.anIntArray468 == null) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray468.length; local14 += 2) {
			if (this.anInt5328 > this.anIntArray468[local14]) {
				this.anInt5328 = this.anIntArray468[local14];
			} else if (this.anIntArray468[local14] > this.anInt5340) {
				this.anInt5340 = this.anIntArray468[local14];
			}
			if (this.anInt5348 > this.anIntArray468[local14 + 1]) {
				this.anInt5348 = this.anIntArray468[local14 + 1];
			} else if (this.anIntArray468[local14 + 1] > this.anInt5347) {
				this.anInt5347 = this.anIntArray468[local14 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(III)I")
	public int method4596(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass127_33 == null) {
			return arg1;
		} else {
			@Pc(16) Class2_Sub32 local16 = (Class2_Sub32) this.aClass127_33.method3205((long) arg0);
			return local16 == null ? arg1 : local16.anInt5391;
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method4597(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass127_33 == null) {
			return arg1;
		} else {
			@Pc(16) Class2_Sub43 local16 = (Class2_Sub43) this.aClass127_33.method3205((long) arg0);
			return local16 == null ? arg1 : local16.aString166;
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(BLclient!bc;)Z")
	public boolean method4598(@OriginalArg(1) Interface2 arg0) {
		@Pc(20) int local20;
		if (this.anInt5352 == -1) {
			if (this.anInt5346 == -1) {
				return true;
			}
			local20 = arg0.method7514(this.anInt5346);
		} else {
			local20 = arg0.method7513(this.anInt5352);
		}
		if (this.anInt5344 > local20 || local20 > this.anInt5324) {
			return false;
		}
		@Pc(66) int local66;
		if (this.anInt5336 == -1) {
			if (this.anInt5330 == -1) {
				return true;
			}
			local66 = arg0.method7514(this.anInt5330);
		} else {
			local66 = arg0.method7513(this.anInt5336);
		}
		return this.anInt5321 <= local66 && local66 <= this.anInt5323;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(BLclient!ps;I)V")
	private void method4600(@OriginalArg(1) Class2_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5350 = arg0.method5229();
		} else if (arg1 == 2) {
			this.anInt5331 = arg0.method5229();
		} else if (arg1 == 3) {
			this.aString118 = arg0.method5194();
		} else if (arg1 == 4) {
			this.anInt5351 = arg0.method5210();
		} else if (arg1 == 5) {
			this.anInt5327 = arg0.method5210();
		} else if (arg1 == 6) {
			this.anInt5326 = arg0.method5170();
		} else {
			@Pc(48) int local48;
			if (arg1 == 7) {
				local48 = arg0.method5170();
				if ((local48 & 0x2) == 2) {
					this.aBoolean397 = true;
				}
				if ((local48 & 0x1) == 0) {
					this.aBoolean399 = false;
				}
			} else if (arg1 == 8) {
				this.aBoolean398 = arg0.method5170() == 1;
			} else if (arg1 == 9) {
				this.anInt5346 = arg0.method5229();
				if (this.anInt5346 == 65535) {
					this.anInt5346 = -1;
				}
				this.anInt5352 = arg0.method5229();
				if (this.anInt5352 == 65535) {
					this.anInt5352 = -1;
				}
				this.anInt5344 = arg0.method5198();
				this.anInt5324 = arg0.method5198();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray29[arg1 - 10] = arg0.method5194();
			} else {
				@Pc(141) int local141;
				if (arg1 == 15) {
					local48 = arg0.method5170();
					this.anIntArray468 = new int[local48 * 2];
					for (local141 = 0; local141 < local48 * 2; local141++) {
						this.anIntArray468[local141] = arg0.method5231();
					}
					this.anInt5325 = arg0.method5198();
					this.anInt5341 = arg0.method5198();
				} else if (arg1 == 16) {
					this.aBoolean396 = false;
				} else if (arg1 == 17) {
					this.aString119 = arg0.method5194();
				} else if (arg1 == 18) {
					this.anInt5319 = arg0.method5229();
				} else if (arg1 == 19) {
					this.anInt5322 = arg0.method5229();
				} else if (arg1 == 20) {
					this.anInt5330 = arg0.method5229();
					if (this.anInt5330 == 65535) {
						this.anInt5330 = -1;
					}
					this.anInt5336 = arg0.method5229();
					if (this.anInt5336 == 65535) {
						this.anInt5336 = -1;
					}
					this.anInt5321 = arg0.method5198();
					this.anInt5323 = arg0.method5198();
				} else if (arg1 == 21) {
					this.anInt5329 = arg0.method5198();
				} else if (arg1 == 22) {
					this.anInt5337 = arg0.method5198();
				} else if (arg1 == 249) {
					local48 = arg0.method5170();
					if (this.aClass127_33 == null) {
						local141 = Static131.method2413(local48);
						this.aClass127_33 = new Class127(local141);
					}
					for (local141 = 0; local141 < local48; local141++) {
						@Pc(291) boolean local291 = arg0.method5170() == 1;
						@Pc(295) int local295 = arg0.method5210();
						@Pc(304) Class2 local304;
						if (local291) {
							local304 = new Class2_Sub43(arg0.method5194());
						} else {
							local304 = new Class2_Sub32(arg0.method5198());
						}
						this.aClass127_33.method3213(local304, (long) local295);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(BLclient!ps;)V")
	public void method4601(@OriginalArg(1) Class2_Sub29 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5170();
			if (local5 == 0) {
				return;
			}
			this.method4600(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(ILclient!qa;)Lclient!ha;")
	public Class35 method4603(@OriginalArg(1) Class39 arg0) {
		@Pc(20) Class35 local20 = (Class35) this.aClass56_3.aClass231_16.method6228((long) (arg0.anInt7092 << 29 | 0x20000 | this.anInt5319));
		if (local20 != null) {
			return local20;
		}
		this.aClass56_3.aClass53_26.method1621(this.anInt5319);
		@Pc(48) Class241 local48 = Static558.method6373(this.aClass56_3.aClass53_26, this.anInt5319, 0);
		if (local48 != null) {
			local20 = arg0.method6018(local48);
			this.aClass56_3.aClass231_16.method6232(local20, (long) (this.anInt5319 | 0x20000 | arg0.anInt7092 << 29));
		}
		return local20;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(Lclient!qa;ZB)Lclient!ha;")
	public Class35 method4604(@OriginalArg(0) Class39 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt5331 : this.anInt5350;
		@Pc(18) int local18 = local11 | arg0.anInt7092 << 29;
		@Pc(33) Class35 local33 = (Class35) this.aClass56_3.aClass231_16.method6228((long) local18);
		if (local33 != null) {
			return local33;
		} else if (this.aClass56_3.aClass53_26.method1621(local11)) {
			@Pc(55) Class241 local55 = Static558.method6373(this.aClass56_3.aClass53_26, local11, 0);
			if (local55 != null) {
				local33 = arg0.method6018(local55);
				this.aClass56_3.aClass231_16.method6232(local33, (long) local18);
			}
			return local33;
		} else {
			return null;
		}
	}
}
