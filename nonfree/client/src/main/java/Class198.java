import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class198 {

	@OriginalMember(owner = "client!jo", name = "K", descriptor = "I")
	private int anInt5124;

	@OriginalMember(owner = "client!jo", name = "w", descriptor = "I")
	private int anInt5128;

	@OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
	public int anInt5129;

	@OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
	public int anInt5130;

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "[I")
	public int[] anIntArray375;

	@OriginalMember(owner = "client!jo", name = "X", descriptor = "Lclient!qn;")
	private Class313 aClass313_22;

	@OriginalMember(owner = "client!jo", name = "F", descriptor = "I")
	public int anInt5132;

	@OriginalMember(owner = "client!jo", name = "Y", descriptor = "I")
	private int anInt5134;

	@OriginalMember(owner = "client!jo", name = "H", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!jo", name = "Z", descriptor = "[I")
	public int[] anIntArray376;

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "I")
	private int anInt5143;

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
	public int anInt5144;

	@OriginalMember(owner = "client!jo", name = "x", descriptor = "Lclient!ff;")
	public Class111 aClass111_4;

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
	public int anInt5147;

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
	public int anInt5151;

	@OriginalMember(owner = "client!jo", name = "O", descriptor = "Ljava/lang/String;")
	public String aString62;

	@OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
	public int anInt5155;

	@OriginalMember(owner = "client!jo", name = "C", descriptor = "Ljava/lang/String;")
	public String aString63;

	@OriginalMember(owner = "client!jo", name = "Q", descriptor = "I")
	public int anInt5131 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jo", name = "B", descriptor = "I")
	public int anInt5126 = 0;

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
	public int anInt5135 = -1;

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
	public int anInt5125 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!jo", name = "R", descriptor = "I")
	public int anInt5142 = -1;

	@OriginalMember(owner = "client!jo", name = "o", descriptor = "Z")
	public boolean aBoolean336 = true;

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "Z")
	public boolean aBoolean337 = true;

	@OriginalMember(owner = "client!jo", name = "I", descriptor = "I")
	public int anInt5123 = -1;

	@OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
	private int anInt5120 = -1;

	@OriginalMember(owner = "client!jo", name = "N", descriptor = "I")
	public int anInt5140 = -1;

	@OriginalMember(owner = "client!jo", name = "y", descriptor = "I")
	public int anInt5150 = -1;

	@OriginalMember(owner = "client!jo", name = "J", descriptor = "I")
	public int anInt5146 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
	private int anInt5137 = -1;

	@OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
	private int anInt5136 = -1;

	@OriginalMember(owner = "client!jo", name = "G", descriptor = "I")
	private int anInt5133 = -1;

	@OriginalMember(owner = "client!jo", name = "D", descriptor = "I")
	public int anInt5152 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jo", name = "v", descriptor = "I")
	private int anInt5153 = -1;

	@OriginalMember(owner = "client!jo", name = "j", descriptor = "Z")
	public boolean aBoolean338 = false;

	@OriginalMember(owner = "client!jo", name = "V", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray21 = new String[5];

	@OriginalMember(owner = "client!jo", name = "W", descriptor = "I")
	public int anInt5138 = -1;

	@OriginalMember(owner = "client!jo", name = "S", descriptor = "Z")
	public boolean aBoolean339 = true;

	@OriginalMember(owner = "client!jo", name = "z", descriptor = "I")
	public int anInt5156 = -1;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!ll;B)Z")
	public boolean method4667(@OriginalArg(0) Interface12 arg0) {
		@Pc(16) int local16;
		if (this.anInt5133 == -1) {
			if (this.anInt5120 == -1) {
				return true;
			}
			local16 = arg0.method6960(this.anInt5120);
		} else {
			local16 = arg0.method6961(this.anInt5133);
		}
		if (this.anInt5124 > local16 || this.anInt5143 < local16) {
			return false;
		}
		@Pc(68) int local68;
		if (this.anInt5136 == -1) {
			if (this.anInt5153 == -1) {
				return true;
			}
			local68 = arg0.method6960(this.anInt5153);
		} else {
			local68 = arg0.method6961(this.anInt5136);
		}
		return local68 >= this.anInt5134 && local68 <= this.anInt5128;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!ika;I)V")
	public void method4669(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2048(255);
			if (local5 == 0) {
				return;
			}
			this.method4672(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method4670(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass313_22 == null) {
			return arg0;
		} else {
			@Pc(19) Class3_Sub40 local19 = (Class3_Sub40) this.aClass313_22.method7104((long) arg1);
			return local19 == null ? arg0 : local19.aString78;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!ha;)Lclient!kw;")
	public Class178 method4671(@OriginalArg(1) Class22 arg0) {
		@Pc(20) Class178 local20 = (Class178) this.aClass111_4.aClass307_42.method7002((long) (arg0.anInt11007 << 29 | this.anInt5137 | 0x20000));
		if (local20 != null) {
			return local20;
		}
		this.aClass111_4.aClass182_44.method3964(this.anInt5137);
		@Pc(47) Class361 local47 = Static735.method8269(this.aClass111_4.aClass182_44, this.anInt5137, 0);
		if (local47 != null) {
			local20 = arg0.method9363(local47, true);
			this.aClass111_4.aClass307_42.method7000(local20, (long) (this.anInt5137 | 0x20000 | arg0.anInt11007 << 29));
		}
		return local20;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!ika;II)V")
	private void method4672(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5156 = arg0.method2028(-14795);
		} else if (arg1 == 2) {
			this.anInt5140 = arg0.method2028(-14795);
		} else if (arg1 == 3) {
			this.aString62 = arg0.method2014();
		} else if (arg1 == 4) {
			this.anInt5147 = arg0.method2061();
		} else if (arg1 == 5) {
			this.anInt5142 = arg0.method2061();
		} else if (arg1 == 6) {
			this.anInt5126 = arg0.method2048(255);
		} else {
			@Pc(290) int local290;
			if (arg1 == 7) {
				local290 = arg0.method2048(255);
				if ((local290 & 0x2) == 2) {
					this.aBoolean338 = true;
				}
				if ((local290 & 0x1) == 0) {
					this.aBoolean339 = false;
				}
			} else if (arg1 == 8) {
				this.aBoolean337 = arg0.method2048(255) == 1;
			} else if (arg1 == 9) {
				this.anInt5120 = arg0.method2028(-14795);
				if (this.anInt5120 == 65535) {
					this.anInt5120 = -1;
				}
				this.anInt5133 = arg0.method2028(-14795);
				if (this.anInt5133 == 65535) {
					this.anInt5133 = -1;
				}
				this.anInt5124 = arg0.method2036();
				this.anInt5143 = arg0.method2036();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray21[arg1 - 10] = arg0.method2014();
			} else {
				@Pc(297) int local297;
				@Pc(323) int local323;
				if (arg1 == 15) {
					local290 = arg0.method2048(255);
					this.anIntArray376 = new int[local290 * 2];
					for (local297 = 0; local297 < local290 * 2; local297++) {
						this.anIntArray376[local297] = arg0.method2017();
					}
					this.anInt5155 = arg0.method2036();
					@Pc(466) int local466 = arg0.method2048(255);
					this.anIntArray375 = new int[local466];
					for (local323 = 0; local323 < this.anIntArray375.length; local323++) {
						this.anIntArray375[local323] = arg0.method2036();
					}
					this.aByteArray47 = new byte[local290];
					for (@Pc(501) int local501 = 0; local501 < local290; local501++) {
						this.aByteArray47[local501] = arg0.method2022();
					}
				} else if (arg1 == 16) {
					this.aBoolean336 = false;
				} else if (arg1 == 17) {
					this.aString63 = arg0.method2014();
				} else if (arg1 == 18) {
					this.anInt5137 = arg0.method2028(-14795);
				} else if (arg1 == 19) {
					this.anInt5135 = arg0.method2028(-14795);
				} else if (arg1 == 20) {
					this.anInt5153 = arg0.method2028(-14795);
					if (this.anInt5153 == 65535) {
						this.anInt5153 = -1;
					}
					this.anInt5136 = arg0.method2028(-14795);
					if (this.anInt5136 == 65535) {
						this.anInt5136 = -1;
					}
					this.anInt5134 = arg0.method2036();
					this.anInt5128 = arg0.method2036();
				} else if (arg1 == 21) {
					this.anInt5144 = arg0.method2036();
				} else if (arg1 == 22) {
					this.anInt5132 = arg0.method2036();
				} else if (arg1 == 23) {
					this.anInt5123 = arg0.method2048(255);
					this.anInt5150 = arg0.method2048(255);
					this.anInt5138 = arg0.method2048(255);
				} else if (arg1 == 24) {
					this.anInt5129 = arg0.method2017();
					this.anInt5130 = arg0.method2017();
				} else if (arg1 == 249) {
					local290 = arg0.method2048(255);
					if (this.aClass313_22 == null) {
						local297 = Static92.method1941(local290);
						this.aClass313_22 = new Class313(local297);
					}
					for (local297 = 0; local297 < local290; local297++) {
						@Pc(319) boolean local319 = arg0.method2048(255) == 1;
						local323 = arg0.method2061();
						@Pc(332) Class3 local332;
						if (local319) {
							local332 = new Class3_Sub40(arg0.method2014());
						} else {
							local332 = new Class3_Sub44(arg0.method2036());
						}
						this.aClass313_22.method7107((long) local323, local332);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	public void method4673() {
		if (this.anIntArray376 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray376.length; local10 += 2) {
			if (this.anIntArray376[local10] < this.anInt5125) {
				this.anInt5125 = this.anIntArray376[local10];
			} else if (this.anIntArray376[local10] > this.anInt5152) {
				this.anInt5152 = this.anIntArray376[local10];
			}
			if (this.anInt5146 > this.anIntArray376[local10 + 1]) {
				this.anInt5146 = this.anIntArray376[local10 + 1];
			} else if (this.anIntArray376[local10 + 1] > this.anInt5131) {
				this.anInt5131 = this.anIntArray376[local10 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!ha;ZI)Lclient!kw;")
	public Class178 method4675(@OriginalArg(0) Class22 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(18) int local18 = arg1 ? this.anInt5140 : this.anInt5156;
		@Pc(25) int local25 = local18 | arg0.anInt11007 << 29;
		@Pc(34) Class178 local34 = (Class178) this.aClass111_4.aClass307_42.method7002((long) local25);
		if (local34 != null) {
			return local34;
		} else if (this.aClass111_4.aClass182_44.method3964(local18)) {
			@Pc(56) Class361 local56 = Static735.method8269(this.aClass111_4.aClass182_44, local18, 0);
			if (local56 != null) {
				local34 = arg0.method9363(local56, true);
				this.aClass111_4.aClass307_42.method7000(local34, (long) local25);
			}
			return local34;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)I")
	public int method4676(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass313_22 == null) {
			return arg0;
		} else {
			@Pc(17) Class3_Sub44 local17 = (Class3_Sub44) this.aClass313_22.method7104((long) arg1);
			return local17 == null ? arg0 : local17.anInt7298;
		}
	}
}
