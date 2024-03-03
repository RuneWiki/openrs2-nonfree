import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class164 {

	@OriginalMember(owner = "client!np", name = "a", descriptor = "I")
	private int anInt4397;

	@OriginalMember(owner = "client!np", name = "d", descriptor = "I")
	private int anInt4400;

	@OriginalMember(owner = "client!np", name = "h", descriptor = "Lclient!ki;")
	public Class125 aClass125_2;

	@OriginalMember(owner = "client!np", name = "j", descriptor = "[I")
	public int[] anIntArray290;

	@OriginalMember(owner = "client!np", name = "n", descriptor = "I")
	public int anInt4407;

	@OriginalMember(owner = "client!np", name = "r", descriptor = "I")
	public int anInt4410;

	@OriginalMember(owner = "client!np", name = "t", descriptor = "Lclient!ad;")
	private Class4 aClass4_89;

	@OriginalMember(owner = "client!np", name = "x", descriptor = "Ljava/lang/String;")
	public String aString48;

	@OriginalMember(owner = "client!np", name = "y", descriptor = "I")
	public int anInt4415;

	@OriginalMember(owner = "client!np", name = "E", descriptor = "I")
	private int anInt4420;

	@OriginalMember(owner = "client!np", name = "H", descriptor = "I")
	public int anInt4423;

	@OriginalMember(owner = "client!np", name = "I", descriptor = "I")
	public int anInt4424;

	@OriginalMember(owner = "client!np", name = "N", descriptor = "Ljava/lang/String;")
	public String aString49;

	@OriginalMember(owner = "client!np", name = "Q", descriptor = "I")
	public int anInt4430;

	@OriginalMember(owner = "client!np", name = "S", descriptor = "I")
	private int anInt4432;

	@OriginalMember(owner = "client!np", name = "c", descriptor = "I")
	public int anInt4399 = -1;

	@OriginalMember(owner = "client!np", name = "s", descriptor = "I")
	public int anInt4411 = 0;

	@OriginalMember(owner = "client!np", name = "i", descriptor = "I")
	private int anInt4403 = -1;

	@OriginalMember(owner = "client!np", name = "e", descriptor = "Z")
	public boolean aBoolean302 = true;

	@OriginalMember(owner = "client!np", name = "u", descriptor = "I")
	public int anInt4412 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!np", name = "q", descriptor = "Z")
	public boolean aBoolean303 = true;

	@OriginalMember(owner = "client!np", name = "m", descriptor = "I")
	private int anInt4406 = -1;

	@OriginalMember(owner = "client!np", name = "v", descriptor = "I")
	public int anInt4413 = -1;

	@OriginalMember(owner = "client!np", name = "A", descriptor = "I")
	public int anInt4417 = -1;

	@OriginalMember(owner = "client!np", name = "C", descriptor = "Z")
	public boolean aBoolean304 = false;

	@OriginalMember(owner = "client!np", name = "J", descriptor = "I")
	public int anInt4425 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!np", name = "L", descriptor = "I")
	private int anInt4426 = -1;

	@OriginalMember(owner = "client!np", name = "k", descriptor = "I")
	private int anInt4404 = -1;

	@OriginalMember(owner = "client!np", name = "K", descriptor = "Z")
	public boolean aBoolean305 = true;

	@OriginalMember(owner = "client!np", name = "O", descriptor = "I")
	private int anInt4428 = -1;

	@OriginalMember(owner = "client!np", name = "M", descriptor = "I")
	public int anInt4427 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!np", name = "F", descriptor = "I")
	public int anInt4421 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!np", name = "R", descriptor = "I")
	public int anInt4431 = -1;

	@OriginalMember(owner = "client!np", name = "T", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray41 = new String[5];

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!wl;B)Z", line = 22)
	public boolean method4181(@OriginalArg(0) Interface11 arg0) {
		@Pc(16) int local16;
		if (this.anInt4403 == -1) {
			if (this.anInt4426 == -1) {
				return true;
			}
			local16 = arg0.method5779(this.anInt4426);
		} else {
			local16 = arg0.method5778(this.anInt4403);
		}
		if (local16 < this.anInt4400 || local16 > this.anInt4397) {
			return false;
		}
		@Pc(57) int local57;
		if (this.anInt4404 == -1) {
			if (this.anInt4428 == -1) {
				return true;
			}
			local57 = arg0.method5779(this.anInt4428);
		} else {
			local57 = arg0.method5778(this.anInt4404);
		}
		return this.anInt4420 <= local57 && this.anInt4432 >= local57;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BLclient!bt;)V", line = 104)
	public void method4183(@OriginalArg(1) Class2_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4816();
			if (local5 == 0) {
				return;
			}
			this.method4187(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BLclient!wm;)Lclient!jd;", line = 131)
	public Class13 method4184(@OriginalArg(1) Class19 arg0) {
		@Pc(28) Class13 local28 = (Class13) this.aClass125_2.aClass98_27.method2614((long) (this.anInt4406 | 0x20000 | arg0.anInt2833 << 29));
		if (local28 != null) {
			return local28;
		}
		this.aClass125_2.aClass197_50.method5088(this.anInt4406);
		@Pc(48) Class48 local48 = Static372.method1684(this.aClass125_2.aClass197_50, this.anInt4406, 0);
		if (local48 != null) {
			local28 = arg0.method2893(local48);
			this.aClass125_2.aClass98_27.method2626((long) (this.anInt4406 | 0x20000 | arg0.anInt2833 << 29), local28);
		}
		return local28;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BILjava/lang/String;)Ljava/lang/String;", line = 326)
	public String method4186(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass4_89 == null) {
			return arg1;
		} else {
			@Pc(22) Class2_Sub40 local22 = (Class2_Sub40) this.aClass4_89.method90((long) arg0);
			return local22 == null ? arg1 : local22.aString65;
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IILclient!bt;)V", line = 356)
	private void method4187(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt4413 = arg1.method4830();
		} else if (arg0 == 2) {
			this.anInt4431 = arg1.method4830();
		} else if (arg0 == 3) {
			this.aString48 = arg1.method4810();
		} else if (arg0 == 4) {
			this.anInt4424 = arg1.method4834();
		} else if (arg0 == 5) {
			this.anInt4399 = arg1.method4834();
		} else if (arg0 == 6) {
			this.anInt4411 = arg1.method4816();
		} else {
			@Pc(57) int local57;
			if (arg0 == 7) {
				local57 = arg1.method4816();
				if ((local57 & 0x1) == 0) {
					this.aBoolean305 = false;
				}
				if ((local57 & 0x2) == 2) {
					this.aBoolean304 = true;
				}
			} else if (arg0 == 8) {
				this.aBoolean303 = arg1.method4816() == 1;
			} else if (arg0 == 9) {
				this.anInt4426 = arg1.method4830();
				if (this.anInt4426 == 65535) {
					this.anInt4426 = -1;
				}
				this.anInt4403 = arg1.method4830();
				if (this.anInt4403 == 65535) {
					this.anInt4403 = -1;
				}
				this.anInt4400 = arg1.method4837();
				this.anInt4397 = arg1.method4837();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray41[arg0 - 10] = arg1.method4810();
			} else {
				@Pc(196) int local196;
				if (arg0 == 15) {
					local57 = arg1.method4816();
					this.anIntArray290 = new int[local57 * 2];
					for (local196 = 0; local196 < local57 * 2; local196++) {
						this.anIntArray290[local196] = arg1.method4824();
					}
					this.anInt4415 = arg1.method4837();
					this.anInt4407 = arg1.method4837();
				} else if (arg0 == 16) {
					this.aBoolean302 = false;
				} else if (arg0 == 17) {
					this.aString49 = arg1.method4810();
				} else if (arg0 == 18) {
					this.anInt4406 = arg1.method4830();
				} else if (arg0 == 19) {
					this.anInt4417 = arg1.method4830();
				} else if (arg0 == 20) {
					this.anInt4428 = arg1.method4830();
					if (this.anInt4428 == 65535) {
						this.anInt4428 = -1;
					}
					this.anInt4404 = arg1.method4830();
					if (this.anInt4404 == 65535) {
						this.anInt4404 = -1;
					}
					this.anInt4420 = arg1.method4837();
					this.anInt4432 = arg1.method4837();
				} else if (arg0 == 21) {
					this.anInt4410 = arg1.method4837();
				} else if (arg0 == 22) {
					this.anInt4430 = arg1.method4837();
				} else if (arg0 == 249) {
					local57 = arg1.method4816();
					if (this.aClass4_89 == null) {
						local196 = Static152.method2978(local57);
						this.aClass4_89 = new Class4(local196);
					}
					for (local196 = 0; local196 < local57; local196++) {
						@Pc(215) boolean local215 = arg1.method4816() == 1;
						@Pc(219) int local219 = arg1.method4834();
						@Pc(228) Class2 local228;
						if (local215) {
							local228 = new Class2_Sub40(arg1.method4810());
						} else {
							local228 = new Class2_Sub39(arg1.method4837());
						}
						this.aClass4_89.method87(local228, (long) local219);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V", line = 523)
	public void method4188() {
		if (this.anIntArray290 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray290.length; local19 += 2) {
			if (this.anIntArray290[local19] < this.anInt4427) {
				this.anInt4427 = this.anIntArray290[local19];
			} else if (this.anIntArray290[local19] > this.anInt4412) {
				this.anInt4412 = this.anIntArray290[local19];
			}
			if (this.anIntArray290[local19 + 1] < this.anInt4425) {
				this.anInt4425 = this.anIntArray290[local19 + 1];
			} else if (this.anIntArray290[local19 + 1] > this.anInt4421) {
				this.anInt4421 = this.anIntArray290[local19 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIZ)I", line = 561)
	public int method4189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass4_89 == null) {
			return arg0;
		} else {
			@Pc(25) Class2_Sub39 local25 = (Class2_Sub39) this.aClass4_89.method90((long) arg1);
			return local25 == null ? arg0 : local25.anInt6805;
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!wm;ZZ)Lclient!jd;", line = 608)
	public Class13 method4190(@OriginalArg(0) Class19 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) int local17 = arg1 ? this.anInt4431 : this.anInt4413;
		@Pc(24) int local24 = local17 | arg0.anInt2833 << 29;
		@Pc(33) Class13 local33 = (Class13) this.aClass125_2.aClass98_27.method2614((long) local24);
		if (local33 != null) {
			return local33;
		} else if (this.aClass125_2.aClass197_50.method5088(local17)) {
			@Pc(53) Class48 local53 = Static372.method1684(this.aClass125_2.aClass197_50, local17, 0);
			if (local53 != null) {
				local33 = arg0.method2893(local53);
				this.aClass125_2.aClass98_27.method2626((long) local24, local33);
			}
			return local33;
		} else {
			return null;
		}
	}
}
