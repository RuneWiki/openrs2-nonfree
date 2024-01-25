import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class Class105 {

	@OriginalMember(owner = "client!faa", name = "Y", descriptor = "Ljava/lang/String;")
	public String aString57;

	@OriginalMember(owner = "client!faa", name = "n", descriptor = "I")
	public int anInt3076;

	@OriginalMember(owner = "client!faa", name = "x", descriptor = "I")
	public int anInt3078;

	@OriginalMember(owner = "client!faa", name = "Q", descriptor = "I")
	private int anInt3081;

	@OriginalMember(owner = "client!faa", name = "V", descriptor = "I")
	public int anInt3083;

	@OriginalMember(owner = "client!faa", name = "g", descriptor = "Lclient!ema;")
	public Class98 aClass98_1;

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "[I")
	public int[] anIntArray150;

	@OriginalMember(owner = "client!faa", name = "v", descriptor = "I")
	private int anInt3085;

	@OriginalMember(owner = "client!faa", name = "k", descriptor = "I")
	public int anInt3088;

	@OriginalMember(owner = "client!faa", name = "B", descriptor = "Ljava/lang/String;")
	public String aString58;

	@OriginalMember(owner = "client!faa", name = "E", descriptor = "I")
	private int anInt3096;

	@OriginalMember(owner = "client!faa", name = "r", descriptor = "[I")
	public int[] anIntArray151;

	@OriginalMember(owner = "client!faa", name = "w", descriptor = "I")
	private int anInt3104;

	@OriginalMember(owner = "client!faa", name = "G", descriptor = "I")
	public int anInt3106;

	@OriginalMember(owner = "client!faa", name = "S", descriptor = "[B")
	public byte[] aByteArray15;

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "I")
	public int anInt3108;

	@OriginalMember(owner = "client!faa", name = "C", descriptor = "I")
	public int anInt3110;

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "Lclient!gn;")
	private Class136 aClass136_18;

	@OriginalMember(owner = "client!faa", name = "e", descriptor = "I")
	public int anInt3073 = -1;

	@OriginalMember(owner = "client!faa", name = "X", descriptor = "Z")
	public boolean aBoolean250 = true;

	@OriginalMember(owner = "client!faa", name = "W", descriptor = "I")
	private int anInt3077 = -1;

	@OriginalMember(owner = "client!faa", name = "z", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray10 = new String[5];

	@OriginalMember(owner = "client!faa", name = "l", descriptor = "I")
	public int anInt3092 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!faa", name = "H", descriptor = "I")
	private int anInt3091 = -1;

	@OriginalMember(owner = "client!faa", name = "u", descriptor = "I")
	public int anInt3095 = -1;

	@OriginalMember(owner = "client!faa", name = "s", descriptor = "I")
	public int anInt3089 = -1;

	@OriginalMember(owner = "client!faa", name = "I", descriptor = "I")
	private int anInt3099 = -1;

	@OriginalMember(owner = "client!faa", name = "A", descriptor = "I")
	public int anInt3098 = -1;

	@OriginalMember(owner = "client!faa", name = "f", descriptor = "I")
	public int anInt3102 = -1;

	@OriginalMember(owner = "client!faa", name = "o", descriptor = "Z")
	public boolean aBoolean253 = false;

	@OriginalMember(owner = "client!faa", name = "j", descriptor = "I")
	public int anInt3103 = -1;

	@OriginalMember(owner = "client!faa", name = "Z", descriptor = "I")
	private int anInt3080 = -1;

	@OriginalMember(owner = "client!faa", name = "T", descriptor = "I")
	public int anInt3082 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!faa", name = "O", descriptor = "Z")
	public boolean aBoolean251 = true;

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "Z")
	public boolean aBoolean252 = true;

	@OriginalMember(owner = "client!faa", name = "R", descriptor = "I")
	public int anInt3101 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!faa", name = "P", descriptor = "I")
	public int anInt3086 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!faa", name = "L", descriptor = "I")
	private int anInt3094 = -1;

	@OriginalMember(owner = "client!faa", name = "t", descriptor = "I")
	public int anInt3075 = -1;

	@OriginalMember(owner = "client!faa", name = "U", descriptor = "I")
	public int anInt3109 = 0;

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lclient!ha;ZB)Lclient!bka;")
	public Class9 method2653(@OriginalArg(0) Class67 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int local12 = arg1 ? this.anInt3102 : this.anInt3103;
		@Pc(19) int local19 = local12 | arg0.anInt9130 << 29;
		@Pc(28) Class9 local28 = (Class9) this.aClass98_1.aClass338_10.method8049((long) local19);
		if (local28 != null) {
			return local28;
		} else if (this.aClass98_1.aClass221_41.method5068(local12)) {
			@Pc(58) Class194 local58 = Static728.method4757(this.aClass98_1.aClass221_41, local12, 0);
			if (local58 != null) {
				local28 = arg0.method7659(local58, true);
				this.aClass98_1.aClass338_10.method8044((long) local19, local28);
			}
			return local28;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IBLclient!rba;)V")
	private void method2654(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub28 arg1) {
		if (arg0 == 1) {
			this.anInt3103 = arg1.method5272();
		} else if (arg0 == 2) {
			this.anInt3102 = arg1.method5272();
		} else if (arg0 == 3) {
			this.aString57 = arg1.method5295();
		} else if (arg0 == 4) {
			this.anInt3076 = arg1.method5307();
		} else if (arg0 == 5) {
			this.anInt3075 = arg1.method5307();
		} else if (arg0 == 6) {
			this.anInt3109 = arg1.method5322(-37);
		} else {
			@Pc(71) int local71;
			if (arg0 == 7) {
				local71 = arg1.method5322(-41);
				if ((local71 & 0x1) == 0) {
					this.aBoolean250 = false;
				}
				if ((local71 & 0x2) == 2) {
					this.aBoolean253 = true;
				}
			} else if (arg0 == 8) {
				this.aBoolean252 = arg1.method5322(-45) == 1;
			} else if (arg0 == 9) {
				this.anInt3077 = arg1.method5272();
				if (this.anInt3077 == 65535) {
					this.anInt3077 = -1;
				}
				this.anInt3094 = arg1.method5272();
				if (this.anInt3094 == 65535) {
					this.anInt3094 = -1;
				}
				this.anInt3104 = arg1.method5312();
				this.anInt3081 = arg1.method5312();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray10[arg0 - 10] = arg1.method5295();
			} else {
				@Pc(211) int local211;
				@Pc(243) int local243;
				if (arg0 == 15) {
					local71 = arg1.method5322(-81);
					this.anIntArray150 = new int[local71 * 2];
					for (local211 = 0; local211 < local71 * 2; local211++) {
						this.anIntArray150[local211] = arg1.method5281();
					}
					this.anInt3110 = arg1.method5312();
					@Pc(237) int local237 = arg1.method5322(-81);
					this.anIntArray151 = new int[local237];
					for (local243 = 0; local243 < this.anIntArray151.length; local243++) {
						this.anIntArray151[local243] = arg1.method5312();
					}
					this.aByteArray15 = new byte[local71];
					for (@Pc(272) int local272 = 0; local272 < local71; local272++) {
						this.aByteArray15[local272] = arg1.method5288();
					}
				} else if (arg0 == 16) {
					this.aBoolean251 = false;
				} else if (arg0 == 17) {
					this.aString58 = arg1.method5295();
				} else if (arg0 == 18) {
					this.anInt3080 = arg1.method5272();
				} else if (arg0 == 19) {
					this.anInt3089 = arg1.method5272();
				} else if (arg0 == 20) {
					this.anInt3091 = arg1.method5272();
					if (this.anInt3091 == 65535) {
						this.anInt3091 = -1;
					}
					this.anInt3099 = arg1.method5272();
					if (this.anInt3099 == 65535) {
						this.anInt3099 = -1;
					}
					this.anInt3096 = arg1.method5312();
					this.anInt3085 = arg1.method5312();
				} else if (arg0 == 21) {
					this.anInt3083 = arg1.method5312();
				} else if (arg0 == 22) {
					this.anInt3106 = arg1.method5312();
				} else if (arg0 == 23) {
					this.anInt3098 = arg1.method5322(-73);
					this.anInt3095 = arg1.method5322(-18);
					this.anInt3073 = arg1.method5322(-42);
				} else if (arg0 == 24) {
					this.anInt3078 = arg1.method5281();
					this.anInt3108 = arg1.method5281();
				} else if (arg0 == 249) {
					local71 = arg1.method5322(-59);
					if (this.aClass136_18 == null) {
						local211 = Static60.method735(local71);
						this.aClass136_18 = new Class136(local211);
					}
					for (local211 = 0; local211 < local71; local211++) {
						@Pc(411) boolean local411 = arg1.method5322(-60) == 1;
						local243 = arg1.method5307();
						@Pc(424) Class3 local424;
						if (local411) {
							local424 = new Class3_Sub30(arg1.method5295());
						} else {
							local424 = new Class3_Sub42(arg1.method5312());
						}
						this.aClass136_18.method3508((long) local243, local424);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lclient!iia;I)Z")
	public boolean method2655(@OriginalArg(0) Interface10 arg0) {
		@Pc(15) int local15;
		if (this.anInt3094 == -1) {
			if (this.anInt3077 == -1) {
				return true;
			}
			local15 = arg0.method8659(this.anInt3077);
		} else {
			local15 = arg0.method8660(this.anInt3094);
		}
		if (this.anInt3104 > local15 || local15 > this.anInt3081) {
			return false;
		}
		@Pc(61) int local61;
		if (this.anInt3099 == -1) {
			if (this.anInt3091 == -1) {
				return true;
			}
			local61 = arg0.method8659(this.anInt3091);
		} else {
			local61 = arg0.method8660(this.anInt3099);
		}
		return local61 >= this.anInt3096 && this.anInt3085 >= local61;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lclient!ha;I)Lclient!bka;")
	public Class9 method2656(@OriginalArg(0) Class67 arg0) {
		@Pc(26) Class9 local26 = (Class9) this.aClass98_1.aClass338_10.method8049((long) (arg0.anInt9130 << 29 | 0x20000 | this.anInt3080));
		if (local26 != null) {
			return local26;
		}
		this.aClass98_1.aClass221_41.method5068(this.anInt3080);
		@Pc(47) Class194 local47 = Static728.method4757(this.aClass98_1.aClass221_41, this.anInt3080, 0);
		if (local47 != null) {
			local26 = arg0.method7659(local47, true);
			this.aClass98_1.aClass338_10.method8044((long) (arg0.anInt9130 << 29 | this.anInt3080 | 0x20000), local26);
		}
		return local26;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)V")
	public void method2657() {
		if (this.anIntArray150 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray150.length; local6 += 2) {
			if (this.anIntArray150[local6] < this.anInt3082) {
				this.anInt3082 = this.anIntArray150[local6];
			} else if (this.anInt3092 < this.anIntArray150[local6]) {
				this.anInt3092 = this.anIntArray150[local6];
			}
			if (this.anInt3101 > this.anIntArray150[local6 + 1]) {
				this.anInt3101 = this.anIntArray150[local6 + 1];
			} else if (this.anInt3086 < this.anIntArray150[local6 + 1]) {
				this.anInt3086 = this.anIntArray150[local6 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(ILclient!rba;)V")
	public void method2659(@OriginalArg(1) Class3_Sub28 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5322(-113);
			if (local5 == 0) {
				return;
			}
			this.method2654(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(BII)I")
	public int method2660(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass136_18 == null) {
			return arg1;
		} else {
			@Pc(17) Class3_Sub42 local17 = (Class3_Sub42) this.aClass136_18.method3503((long) arg0);
			return local17 == null ? arg1 : local17.anInt8429;
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(ZILjava/lang/String;)Ljava/lang/String;")
	public String method2661(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass136_18 == null) {
			return arg1;
		} else {
			@Pc(17) Class3_Sub30 local17 = (Class3_Sub30) this.aClass136_18.method3503((long) arg0);
			return local17 == null ? arg1 : local17.aString89;
		}
	}
}
