import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qca")
public final class Class269 {

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "Lclient!sga;")
	private Class307 aClass307_39;

	@OriginalMember(owner = "client!qca", name = "d", descriptor = "I")
	public int anInt8141;

	@OriginalMember(owner = "client!qca", name = "e", descriptor = "I")
	public int anInt8142;

	@OriginalMember(owner = "client!qca", name = "g", descriptor = "I")
	private int anInt8144;

	@OriginalMember(owner = "client!qca", name = "s", descriptor = "I")
	public int anInt8156;

	@OriginalMember(owner = "client!qca", name = "t", descriptor = "Ljava/lang/String;")
	public String aString90;

	@OriginalMember(owner = "client!qca", name = "z", descriptor = "[B")
	public byte[] aByteArray87;

	@OriginalMember(owner = "client!qca", name = "D", descriptor = "I")
	public int anInt8162;

	@OriginalMember(owner = "client!qca", name = "G", descriptor = "I")
	private int anInt8165;

	@OriginalMember(owner = "client!qca", name = "I", descriptor = "[I")
	public int[] anIntArray511;

	@OriginalMember(owner = "client!qca", name = "J", descriptor = "Lclient!go;")
	public Class115 aClass115_4;

	@OriginalMember(owner = "client!qca", name = "K", descriptor = "I")
	public int anInt8166;

	@OriginalMember(owner = "client!qca", name = "P", descriptor = "I")
	private int anInt8170;

	@OriginalMember(owner = "client!qca", name = "Q", descriptor = "I")
	public int anInt8171;

	@OriginalMember(owner = "client!qca", name = "T", descriptor = "Ljava/lang/String;")
	public String aString91;

	@OriginalMember(owner = "client!qca", name = "U", descriptor = "I")
	public int anInt8173;

	@OriginalMember(owner = "client!qca", name = "X", descriptor = "[I")
	public int[] anIntArray512;

	@OriginalMember(owner = "client!qca", name = "ab", descriptor = "I")
	private int anInt8176;

	@OriginalMember(owner = "client!qca", name = "l", descriptor = "I")
	public int anInt8149 = -1;

	@OriginalMember(owner = "client!qca", name = "f", descriptor = "I")
	public int anInt8143 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qca", name = "o", descriptor = "I")
	public int anInt8152 = -1;

	@OriginalMember(owner = "client!qca", name = "m", descriptor = "I")
	public int anInt8150 = -1;

	@OriginalMember(owner = "client!qca", name = "C", descriptor = "I")
	public int anInt8161 = -1;

	@OriginalMember(owner = "client!qca", name = "w", descriptor = "I")
	private int anInt8158 = -1;

	@OriginalMember(owner = "client!qca", name = "c", descriptor = "Z")
	public boolean aBoolean692 = true;

	@OriginalMember(owner = "client!qca", name = "H", descriptor = "Z")
	public boolean aBoolean693 = false;

	@OriginalMember(owner = "client!qca", name = "p", descriptor = "I")
	public int anInt8153 = -1;

	@OriginalMember(owner = "client!qca", name = "n", descriptor = "I")
	public int anInt8151 = -1;

	@OriginalMember(owner = "client!qca", name = "F", descriptor = "I")
	public int anInt8164 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qca", name = "O", descriptor = "I")
	public int anInt8169 = -1;

	@OriginalMember(owner = "client!qca", name = "j", descriptor = "I")
	public int anInt8147 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qca", name = "R", descriptor = "I")
	public int anInt8172 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qca", name = "V", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray31 = new String[5];

	@OriginalMember(owner = "client!qca", name = "N", descriptor = "Z")
	public boolean aBoolean694 = true;

	@OriginalMember(owner = "client!qca", name = "W", descriptor = "Z")
	public boolean aBoolean695 = true;

	@OriginalMember(owner = "client!qca", name = "x", descriptor = "I")
	private int anInt8159 = -1;

	@OriginalMember(owner = "client!qca", name = "Y", descriptor = "I")
	private int anInt8174 = -1;

	@OriginalMember(owner = "client!qca", name = "q", descriptor = "I")
	private int anInt8154 = -1;

	@OriginalMember(owner = "client!qca", name = "k", descriptor = "I")
	public int anInt8148 = 0;

	@OriginalMember(owner = "client!qca", name = "Z", descriptor = "I")
	private int anInt8175 = -1;

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(ILclient!tn;I)V")
	private void method6792(@OriginalArg(1) Class3_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8151 = arg0.method8414();
		} else if (arg1 == 2) {
			this.anInt8169 = arg0.method8414();
		} else if (arg1 == 3) {
			this.aString90 = arg0.method8413();
		} else if (arg1 == 4) {
			this.anInt8166 = arg0.method8421();
		} else if (arg1 == 5) {
			this.anInt8153 = arg0.method8421();
		} else if (arg1 == 6) {
			this.anInt8148 = arg0.method8401();
			return;
		} else {
			@Pc(179) int local179;
			if (arg1 != 7) {
				if (arg1 == 8) {
					this.aBoolean695 = arg0.method8401() == 1;
					return;
				}
				if (arg1 == 9) {
					this.anInt8154 = arg0.method8414();
					if (this.anInt8154 == 65535) {
						this.anInt8154 = -1;
					}
					this.anInt8175 = arg0.method8414();
					if (this.anInt8175 == 65535) {
						this.anInt8175 = -1;
					}
					this.anInt8144 = arg0.method8402();
					this.anInt8165 = arg0.method8402();
					return;
				}
				if (arg1 >= 10 && arg1 <= 14) {
					this.aStringArray31[arg1 - 10] = arg0.method8413();
					return;
				}
				@Pc(186) int local186;
				@Pc(211) int local211;
				if (arg1 != 15) {
					if (arg1 == 16) {
						this.aBoolean692 = false;
						return;
					}
					if (arg1 == 17) {
						this.aString91 = arg0.method8413();
						return;
					}
					if (arg1 != 18) {
						if (arg1 != 19) {
							if (arg1 == 20) {
								this.anInt8174 = arg0.method8414();
								if (this.anInt8174 == 65535) {
									this.anInt8174 = -1;
								}
								this.anInt8158 = arg0.method8414();
								if (this.anInt8158 == 65535) {
									this.anInt8158 = -1;
								}
								this.anInt8176 = arg0.method8402();
								this.anInt8170 = arg0.method8402();
							} else if (arg1 == 21) {
								this.anInt8142 = arg0.method8402();
								return;
							} else if (arg1 == 22) {
								this.anInt8141 = arg0.method8402();
								return;
							} else if (arg1 == 23) {
								this.anInt8150 = arg0.method8401();
								this.anInt8152 = arg0.method8401();
								this.anInt8149 = arg0.method8401();
								return;
							} else if (arg1 == 24) {
								this.anInt8162 = arg0.method8444();
								this.anInt8171 = arg0.method8444();
								return;
							} else if (arg1 == 249) {
								local179 = arg0.method8401();
								if (this.aClass307_39 == null) {
									local186 = Static95.method2482(local179);
									this.aClass307_39 = new Class307(local186);
								}
								for (local186 = 0; local186 < local179; local186++) {
									@Pc(207) boolean local207 = arg0.method8401() == 1;
									local211 = arg0.method8421();
									@Pc(220) Class3 local220;
									if (local207) {
										local220 = new Class3_Sub44(arg0.method8413());
									} else {
										local220 = new Class3_Sub8(arg0.method8402());
									}
									this.aClass307_39.method7425((long) local211, local220);
								}
								return;
							}
							return;
						}
						this.anInt8161 = arg0.method8414();
						return;
					}
					this.anInt8159 = arg0.method8414();
					return;
				}
				local179 = arg0.method8401();
				this.anIntArray511 = new int[local179 * 2];
				for (local186 = 0; local186 < local179 * 2; local186++) {
					this.anIntArray511[local186] = arg0.method8444();
				}
				this.anInt8156 = arg0.method8402();
				@Pc(334) int local334 = arg0.method8401();
				this.anIntArray512 = new int[local334];
				for (local211 = 0; local211 < this.anIntArray512.length; local211++) {
					this.anIntArray512[local211] = arg0.method8402();
				}
				this.aByteArray87 = new byte[local179];
				for (@Pc(361) int local361 = 0; local361 < local179; local361++) {
					this.aByteArray87[local361] = arg0.method8440();
				}
				return;
			}
			local179 = arg0.method8401();
			if ((local179 & 0x1) == 0) {
				this.aBoolean694 = false;
			}
			if ((local179 & 0x2) == 2) {
				this.aBoolean693 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(ZLclient!tn;)V")
	public void method6793(@OriginalArg(1) Class3_Sub15 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method8401();
			if (local15 == 0) {
				return;
			}
			this.method6792(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method6794(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass307_39 == null) {
			return arg1;
		} else {
			@Pc(21) Class3_Sub44 local21 = (Class3_Sub44) this.aClass307_39.method7424((long) arg0);
			return local21 == null ? arg1 : local21.aString102;
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(ZLclient!dk;)Z")
	public boolean method6796(@OriginalArg(1) Interface6 arg0) {
		@Pc(25) int local25;
		if (this.anInt8175 == -1) {
			if (this.anInt8154 == -1) {
				return true;
			}
			local25 = arg0.method4928(this.anInt8154);
		} else {
			local25 = arg0.method4927(this.anInt8175);
		}
		if (this.anInt8144 > local25 || this.anInt8165 < local25) {
			return false;
		}
		@Pc(75) int local75;
		if (this.anInt8158 == -1) {
			if (this.anInt8174 == -1) {
				return true;
			}
			local75 = arg0.method4928(this.anInt8174);
		} else {
			local75 = arg0.method4927(this.anInt8158);
		}
		return this.anInt8176 <= local75 && this.anInt8170 >= local75;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lclient!ha;B)Lclient!ac;")
	public Class5 method6797(@OriginalArg(0) Class33 arg0) {
		@Pc(20) Class5 local20 = (Class5) this.aClass115_4.aClass112_22.method3640((long) (arg0.anInt7410 << 29 | 0x20000 | this.anInt8159));
		if (local20 != null) {
			return local20;
		}
		this.aClass115_4.aClass181_39.method5040(this.anInt8159);
		@Pc(46) Class28 local46 = Static649.method613(this.aClass115_4.aClass181_39, this.anInt8159, 0);
		if (local46 != null) {
			local20 = arg0.method6161(local46, true);
			this.aClass115_4.aClass112_22.method3636((long) (this.anInt8159 | 0x20000 | arg0.anInt7410 << 29), local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(ZLclient!ha;I)Lclient!ac;")
	public Class5 method6798(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class33 arg1) {
		@Pc(18) int local18 = arg0 ? this.anInt8169 : this.anInt8151;
		@Pc(25) int local25 = arg1.anInt7410 << 29 | local18;
		@Pc(34) Class5 local34 = (Class5) this.aClass115_4.aClass112_22.method3640((long) local25);
		if (local34 != null) {
			return local34;
		} else if (this.aClass115_4.aClass181_39.method5040(local18)) {
			@Pc(54) Class28 local54 = Static649.method613(this.aClass115_4.aClass181_39, local18, 0);
			if (local54 != null) {
				local34 = arg1.method6161(local54, true);
				this.aClass115_4.aClass112_22.method3636((long) local25, local34);
			}
			return local34;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(III)I")
	public int method6799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass307_39 == null) {
			return arg0;
		} else {
			@Pc(16) Class3_Sub8 local16 = (Class3_Sub8) this.aClass307_39.method7424((long) arg1);
			return local16 == null ? arg0 : local16.anInt706;
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Z)V")
	public void method6800() {
		if (this.anIntArray511 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray511.length; local6 += 2) {
			if (this.anIntArray511[local6] < this.anInt8143) {
				this.anInt8143 = this.anIntArray511[local6];
			} else if (this.anIntArray511[local6] > this.anInt8172) {
				this.anInt8172 = this.anIntArray511[local6];
			}
			if (this.anInt8164 > this.anIntArray511[local6 + 1]) {
				this.anInt8164 = this.anIntArray511[local6 + 1];
			} else if (this.anInt8147 < this.anIntArray511[local6 + 1]) {
				this.anInt8147 = this.anIntArray511[local6 + 1];
			}
		}
	}
}
