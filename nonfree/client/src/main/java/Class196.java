import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class196 {

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
	private int anInt4995;

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
	public int anInt4997;

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
	public int anInt4998;

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "[I")
	public int[] anIntArray558;

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "Ljava/lang/String;")
	public String aString53;

	@OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
	private int anInt5006;

	@OriginalMember(owner = "client!qo", name = "u", descriptor = "Lclient!cp;")
	private Class44 aClass44_29;

	@OriginalMember(owner = "client!qo", name = "w", descriptor = "Lclient!qm;")
	public Class195 aClass195_3;

	@OriginalMember(owner = "client!qo", name = "x", descriptor = "I")
	private int anInt5008;

	@OriginalMember(owner = "client!qo", name = "z", descriptor = "I")
	public int anInt5010;

	@OriginalMember(owner = "client!qo", name = "B", descriptor = "I")
	public int anInt5012;

	@OriginalMember(owner = "client!qo", name = "D", descriptor = "Ljava/lang/String;")
	public String aString54;

	@OriginalMember(owner = "client!qo", name = "F", descriptor = "I")
	private int anInt5015;

	@OriginalMember(owner = "client!qo", name = "I", descriptor = "I")
	public int anInt5017;

	@OriginalMember(owner = "client!qo", name = "Q", descriptor = "I")
	public int anInt5023;

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray34 = new String[5];

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "Z")
	public boolean aBoolean394 = true;

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
	public int anInt4994 = -1;

	@OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
	public int anInt5001 = -1;

	@OriginalMember(owner = "client!qo", name = "i", descriptor = "Z")
	public boolean aBoolean395 = true;

	@OriginalMember(owner = "client!qo", name = "E", descriptor = "I")
	public int anInt5014 = -1;

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
	public int anInt5004 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qo", name = "C", descriptor = "I")
	private int anInt5013 = -1;

	@OriginalMember(owner = "client!qo", name = "H", descriptor = "I")
	private int anInt5016 = -1;

	@OriginalMember(owner = "client!qo", name = "y", descriptor = "I")
	private int anInt5009 = -1;

	@OriginalMember(owner = "client!qo", name = "N", descriptor = "I")
	public int anInt5021 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qo", name = "G", descriptor = "Z")
	public boolean aBoolean396 = true;

	@OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
	public int anInt5005 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qo", name = "P", descriptor = "Z")
	public boolean aBoolean398 = false;

	@OriginalMember(owner = "client!qo", name = "A", descriptor = "I")
	public int anInt5011 = 0;

	@OriginalMember(owner = "client!qo", name = "T", descriptor = "I")
	private int anInt5025 = -1;

	@OriginalMember(owner = "client!qo", name = "O", descriptor = "I")
	public int anInt5022 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qo", name = "L", descriptor = "I")
	private int anInt5019 = -1;

	@OriginalMember(owner = "client!qo", name = "U", descriptor = "I")
	public int anInt5026 = -1;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!np;)Lclient!tr;")
	public Class110 method4501(@OriginalArg(1) Class155 arg0) {
		@Pc(20) Class110 local20 = (Class110) this.aClass195_3.aClass139_60.method3076((long) (this.anInt5016 | 0x20000 | arg0.anInt5461 << 29));
		if (local20 != null) {
			return local20;
		}
		this.aClass195_3.aClass20_68.method226(this.anInt5016);
		@Pc(48) Class127 local48 = Static402.method2800(this.aClass195_3.aClass20_68, this.anInt5016, 0);
		if (local48 != null) {
			local20 = arg0.method4869(local48);
			this.aClass195_3.aClass139_60.method3070(local20, (long) (arg0.anInt5461 << 29 | 0x20000 | this.anInt5016));
		}
		return local20;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)I")
	public int method4502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass44_29 == null) {
			return arg0;
		} else {
			@Pc(24) Class3_Sub28 local24 = (Class3_Sub28) this.aClass44_29.method942((long) arg1);
			return local24 == null ? arg0 : local24.anInt3982;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!rp;I)V")
	private void method4503(@OriginalArg(1) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4994 = arg0.method2767();
		} else if (arg1 == 2) {
			this.anInt5026 = arg0.method2767();
		} else if (arg1 == 3) {
			this.aString53 = arg0.method2788();
		} else if (arg1 == 4) {
			this.anInt5012 = arg0.method2786();
		} else if (arg1 == 5) {
			this.anInt5014 = arg0.method2786();
		} else if (arg1 == 6) {
			this.anInt5011 = arg0.method2739();
		} else {
			@Pc(125) int local125;
			if (arg1 == 7) {
				local125 = arg0.method2739();
				if ((local125 & 0x2) == 2) {
					this.aBoolean398 = true;
				}
				if ((local125 & 0x1) == 0) {
					this.aBoolean394 = false;
				}
			} else if (arg1 == 8) {
				this.aBoolean395 = arg0.method2739() == 1;
			} else if (arg1 == 9) {
				this.anInt5013 = arg0.method2767();
				if (this.anInt5013 == 65535) {
					this.anInt5013 = -1;
				}
				this.anInt5009 = arg0.method2767();
				if (this.anInt5009 == 65535) {
					this.anInt5009 = -1;
				}
				this.anInt4995 = arg0.method2726();
				this.anInt5008 = arg0.method2726();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray34[arg1 - 10] = arg0.method2788();
			} else {
				@Pc(133) int local133;
				if (arg1 == 15) {
					local125 = arg0.method2739();
					this.anIntArray558 = new int[local125 * 2];
					for (local133 = 0; local133 < local125 * 2; local133++) {
						this.anIntArray558[local133] = arg0.method2740();
					}
					this.anInt5017 = arg0.method2726();
					this.anInt4998 = arg0.method2726();
				} else if (arg1 == 16) {
					this.aBoolean396 = false;
				} else if (arg1 == 17) {
					this.aString54 = arg0.method2788();
				} else if (arg1 == 18) {
					this.anInt5016 = arg0.method2767();
				} else if (arg1 == 19) {
					this.anInt5001 = arg0.method2767();
				} else if (arg1 == 20) {
					this.anInt5019 = arg0.method2767();
					if (this.anInt5019 == 65535) {
						this.anInt5019 = -1;
					}
					this.anInt5025 = arg0.method2767();
					if (this.anInt5025 == 65535) {
						this.anInt5025 = -1;
					}
					this.anInt5006 = arg0.method2726();
					this.anInt5015 = arg0.method2726();
				} else if (arg1 == 21) {
					this.anInt5010 = arg0.method2726();
				} else if (arg1 == 22) {
					this.anInt4997 = arg0.method2726();
				} else if (arg1 == 249) {
					local125 = arg0.method2739();
					if (this.aClass44_29 == null) {
						local133 = Static304.method2746(local125);
						this.aClass44_29 = new Class44(local133);
					}
					for (local133 = 0; local133 < local125; local133++) {
						@Pc(256) boolean local256 = arg0.method2739() == 1;
						@Pc(260) int local260 = arg0.method2786();
						@Pc(269) Class3 local269;
						if (local256) {
							local269 = new Class3_Sub20(arg0.method2788());
						} else {
							local269 = new Class3_Sub28(arg0.method2726());
						}
						this.aClass44_29.method948((long) local260, local269);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BLclient!qt;)Z")
	public boolean method4505(@OriginalArg(1) Interface9 arg0) {
		@Pc(16) int local16;
		if (this.anInt5009 == -1) {
			if (this.anInt5013 == -1) {
				return true;
			}
			local16 = arg0.method2397(this.anInt5013);
		} else {
			local16 = arg0.method2398(this.anInt5009);
		}
		if (this.anInt4995 > local16 || local16 > this.anInt5008) {
			return false;
		}
		@Pc(69) int local69;
		if (this.anInt5025 == -1) {
			if (this.anInt5019 == -1) {
				return true;
			}
			local69 = arg0.method2397(this.anInt5019);
		} else {
			local69 = arg0.method2398(this.anInt5025);
		}
		return local69 >= this.anInt5006 && local69 <= this.anInt5015;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!rp;B)V")
	public void method4506(@OriginalArg(0) Class3_Sub5 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2739();
			if (local15 == 0) {
				return;
			}
			this.method4503(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BLjava/lang/String;I)Ljava/lang/String;")
	public String method4507(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass44_29 == null) {
			return arg0;
		} else {
			@Pc(21) Class3_Sub20 local21 = (Class3_Sub20) this.aClass44_29.method942((long) arg1);
			return local21 == null ? arg0 : local21.aString28;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZLclient!np;)Lclient!tr;")
	public Class110 method4508(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class155 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt5026 : this.anInt4994;
		@Pc(18) int local18 = local11 | arg1.anInt5461 << 29;
		@Pc(29) Class110 local29 = (Class110) this.aClass195_3.aClass139_60.method3076((long) local18);
		if (local29 != null) {
			return local29;
		} else if (this.aClass195_3.aClass20_68.method226(local11)) {
			@Pc(51) Class127 local51 = Static402.method2800(this.aClass195_3.aClass20_68, local11, 0);
			if (local51 != null) {
				local29 = arg1.method4869(local51);
				this.aClass195_3.aClass139_60.method3070(local29, (long) local18);
			}
			return local29;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
	public void method4511() {
		if (this.anIntArray558 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray558.length; local6 += 2) {
			if (this.anInt5005 > this.anIntArray558[local6]) {
				this.anInt5005 = this.anIntArray558[local6];
			} else if (this.anInt5022 < this.anIntArray558[local6]) {
				this.anInt5022 = this.anIntArray558[local6];
			}
			if (this.anInt5021 > this.anIntArray558[local6 + 1]) {
				this.anInt5021 = this.anIntArray558[local6 + 1];
			} else if (this.anIntArray558[local6 + 1] > this.anInt5004) {
				this.anInt5004 = this.anIntArray558[local6 + 1];
			}
		}
	}
}
