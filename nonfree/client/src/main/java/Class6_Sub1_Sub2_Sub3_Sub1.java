import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IGCQCHAY")
public final class Class6_Sub1_Sub2_Sub3_Sub1 extends Class6_Sub1_Sub2_Sub3 {

	@OriginalMember(owner = "client!IGCQCHAY", name = "Rb", descriptor = "Lclient!QXKQGEKL;")
	public static Class36 aClass36_4 = new Class36(260, 5);

	@OriginalMember(owner = "client!IGCQCHAY", name = "ub", descriptor = "I")
	public int anInt286;

	@OriginalMember(owner = "client!IGCQCHAY", name = "vb", descriptor = "I")
	public int anInt287;

	@OriginalMember(owner = "client!IGCQCHAY", name = "wb", descriptor = "I")
	public int anInt288;

	@OriginalMember(owner = "client!IGCQCHAY", name = "xb", descriptor = "I")
	public int anInt289;

	@OriginalMember(owner = "client!IGCQCHAY", name = "yb", descriptor = "I")
	public int anInt290;

	@OriginalMember(owner = "client!IGCQCHAY", name = "zb", descriptor = "Lclient!NGYJLUVS;")
	public Class6_Sub1_Sub2_Sub5 aClass6_Sub1_Sub2_Sub5_1;

	@OriginalMember(owner = "client!IGCQCHAY", name = "Db", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!IGCQCHAY", name = "Eb", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!IGCQCHAY", name = "Fb", descriptor = "I")
	public int anInt294;

	@OriginalMember(owner = "client!IGCQCHAY", name = "Gb", descriptor = "I")
	public int anInt295;

	@OriginalMember(owner = "client!IGCQCHAY", name = "Hb", descriptor = "I")
	public int anInt296;

	@OriginalMember(owner = "client!IGCQCHAY", name = "Ib", descriptor = "I")
	public int anInt297;

	@OriginalMember(owner = "client!IGCQCHAY", name = "Jb", descriptor = "I")
	public int anInt298;

	@OriginalMember(owner = "client!IGCQCHAY", name = "Kb", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!IGCQCHAY", name = "Mb", descriptor = "Lclient!XDDMQHDR;")
	public Class47 aClass47_1;

	@OriginalMember(owner = "client!IGCQCHAY", name = "Ob", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!IGCQCHAY", name = "Pb", descriptor = "I")
	public int anInt299;

	@OriginalMember(owner = "client!IGCQCHAY", name = "Sb", descriptor = "I")
	public int anInt300;

	@OriginalMember(owner = "client!IGCQCHAY", name = "Xb", descriptor = "I")
	private int anInt304;

	@OriginalMember(owner = "client!IGCQCHAY", name = "Yb", descriptor = "I")
	public int anInt305;

	@OriginalMember(owner = "client!IGCQCHAY", name = "Ab", descriptor = "I")
	private int anInt291 = 42698;

	@OriginalMember(owner = "client!IGCQCHAY", name = "Bb", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!IGCQCHAY", name = "Cb", descriptor = "[I")
	public int[] anIntArray54 = new int[5];

	@OriginalMember(owner = "client!IGCQCHAY", name = "Lb", descriptor = "Z")
	public boolean aBoolean73 = false;

	@OriginalMember(owner = "client!IGCQCHAY", name = "Nb", descriptor = "Z")
	public boolean aBoolean74 = false;

	@OriginalMember(owner = "client!IGCQCHAY", name = "Qb", descriptor = "[I")
	public int[] anIntArray55 = new int[12];

	@OriginalMember(owner = "client!IGCQCHAY", name = "Tb", descriptor = "J")
	private long aLong13 = -1L;

	@OriginalMember(owner = "client!IGCQCHAY", name = "Ub", descriptor = "I")
	public int anInt301 = -1;

	@OriginalMember(owner = "client!IGCQCHAY", name = "Vb", descriptor = "I")
	public int anInt302 = -1;

	@OriginalMember(owner = "client!IGCQCHAY", name = "Wb", descriptor = "I")
	private int anInt303 = 8;

	@OriginalMember(owner = "client!IGCQCHAY", name = "a", descriptor = "(ZLclient!RGCGKKUR;)V")
	public void method142(@OriginalArg(1) Class6_Sub1_Sub4 arg0) {
		try {
			arg0.anInt704 = 0;
			this.anInt293 = arg0.method411();
			this.anInt302 = arg0.method412();
			this.anInt301 = arg0.method412();
			this.aClass47_1 = null;
			this.anInt298 = 0;
			@Pc(29) int local29;
			@Pc(41) int local41;
			@Pc(88) int local88;
			for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
				local29 = arg0.method411();
				if (local29 == 0) {
					this.anIntArray55[local24] = 0;
				} else {
					local41 = arg0.method411();
					this.anIntArray55[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray55[0] == 65535) {
						this.aClass47_1 = Class47.method542(arg0.method413());
						break;
					}
					if (this.anIntArray55[local24] >= 512 && this.anIntArray55[local24] - 512 < Class4.anInt31) {
						local88 = Class4.method22(this.anIntArray55[local24] - 512).anInt32;
						if (local88 != 0) {
							this.anInt298 = local88;
						}
					}
				}
			}
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg0.method411();
				if (local41 < 0 || local41 >= client.anIntArrayArray24[local29].length) {
					local41 = 0;
				}
				this.anIntArray54[local29] = local41;
			}
			super.anInt551 = arg0.method413();
			if (super.anInt551 == 65535) {
				super.anInt551 = -1;
			}
			super.anInt552 = arg0.method413();
			if (super.anInt552 == 65535) {
				super.anInt552 = -1;
			}
			super.anInt555 = arg0.method413();
			if (super.anInt555 == 65535) {
				super.anInt555 = -1;
			}
			super.anInt556 = arg0.method413();
			if (super.anInt556 == 65535) {
				super.anInt556 = -1;
			}
			super.anInt557 = arg0.method413();
			if (super.anInt557 == 65535) {
				super.anInt557 = -1;
			}
			super.anInt558 = arg0.method413();
			if (super.anInt558 == 65535) {
				super.anInt558 = -1;
			}
			super.anInt522 = arg0.method413();
			if (super.anInt522 == 65535) {
				super.anInt522 = -1;
			}
			this.aString5 = Class38.method457(Class38.method454(arg0.method417()));
			this.anInt305 = arg0.method411();
			this.anInt299 = arg0.method413();
			this.aBoolean73 = true;
			this.aLong12 = 0L;
			local41 = this.anIntArray55[5];
			local88 = this.anIntArray55[9];
			this.anIntArray55[5] = local88;
			this.anIntArray55[9] = local41;
			for (@Pc(254) int local254 = 0; local254 < 12; local254++) {
				this.aLong12 <<= 0x4;
				if (this.anIntArray55[local254] >= 256) {
					this.aLong12 += this.anIntArray55[local254] - 256;
				}
			}
			if (this.anIntArray55[0] >= 256) {
				this.aLong12 += this.anIntArray55[0] - 256 >> 4;
			}
			if (this.anIntArray55[1] >= 256) {
				this.aLong12 += this.anIntArray55[1] - 256 >> 8;
			}
			this.anIntArray55[5] = local41;
			this.anIntArray55[9] = local88;
			for (@Pc(336) int local336 = 0; local336 < 5; local336++) {
				this.aLong12 <<= 0x3;
				this.aLong12 += this.anIntArray54[local336];
			}
			this.aLong12 <<= 0x1;
			this.aLong12 += this.anInt293;
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("55513, " + false + ", " + arg0 + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IGCQCHAY", name = "c", descriptor = "(I)Lclient!NGYJLUVS;")
	private Class6_Sub1_Sub2_Sub5 method143() {
		try {
			if (this.aClass47_1 != null) {
				@Pc(16) int local16 = -1;
				if (super.anInt529 >= 0 && super.anInt532 == 0) {
					local16 = Class21.aClass21Array1[super.anInt529].anIntArray64[super.anInt530];
				} else if (super.anInt538 >= 0) {
					local16 = Class21.aClass21Array1[super.anInt538].anIntArray64[super.anInt539];
				}
				return this.aClass47_1.method541(-1, local16, this.anInt303, null);
			}
			@Pc(59) long local59 = this.aLong12;
			@Pc(61) int local61 = -1;
			@Pc(63) int local63 = -1;
			@Pc(65) int local65 = -1;
			@Pc(67) int local67 = -1;
			if (super.anInt529 >= 0 && super.anInt532 == 0) {
				@Pc(78) Class21 local78 = Class21.aClass21Array1[super.anInt529];
				local61 = local78.anIntArray64[super.anInt530];
				if (super.anInt538 >= 0 && super.anInt538 != super.anInt551) {
					local63 = Class21.aClass21Array1[super.anInt538].anIntArray64[super.anInt539];
				}
				if (local78.anInt346 >= 0) {
					local65 = local78.anInt346;
					local59 += local65 - this.anIntArray55[5] << 8;
				}
				if (local78.anInt347 >= 0) {
					local67 = local78.anInt347;
					local59 += local67 - this.anIntArray55[3] << 16;
				}
			} else if (super.anInt538 >= 0) {
				local61 = Class21.aClass21Array1[super.anInt538].anIntArray64[super.anInt539];
			}
			@Pc(156) Class6_Sub1_Sub2_Sub5 local156 = (Class6_Sub1_Sub2_Sub5) aClass36_4.method394(local59);
			@Pc(162) int local162;
			@Pc(169) int local169;
			if (local156 == null) {
				@Pc(160) boolean local160 = false;
				for (local162 = 0; local162 < 12; local162++) {
					local169 = this.anIntArray55[local162];
					if (local67 >= 0 && local162 == 3) {
						local169 = local67;
					}
					if (local65 >= 0 && local162 == 5) {
						local169 = local65;
					}
					if (local169 >= 256 && local169 < 512 && !Class16.aClass16Array1[local169 - 256].method147()) {
						local160 = true;
					}
					if (local169 >= 512 && !Class4.method22(local169 - 512).method18(this.anInt293)) {
						local160 = true;
					}
				}
				if (local160) {
					if (this.aLong13 != -1L) {
						local156 = (Class6_Sub1_Sub2_Sub5) aClass36_4.method394(this.aLong13);
					}
					if (local156 == null) {
						return null;
					}
				}
			}
			if (local156 == null) {
				@Pc(239) Class6_Sub1_Sub2_Sub5[] local239 = new Class6_Sub1_Sub2_Sub5[12];
				local162 = 0;
				@Pc(250) int local250;
				for (local169 = 0; local169 < 12; local169++) {
					local250 = this.anIntArray55[local169];
					if (local67 >= 0 && local169 == 3) {
						local250 = local67;
					}
					if (local65 >= 0 && local169 == 5) {
						local250 = local65;
					}
					@Pc(278) Class6_Sub1_Sub2_Sub5 local278;
					if (local250 >= 256 && local250 < 512) {
						local278 = Class16.aClass16Array1[local250 - 256].method148();
						if (local278 != null) {
							local239[local162++] = local278;
						}
					}
					if (local250 >= 512) {
						local278 = Class4.method22(local250 - 512).method20(this.anInt293);
						if (local278 != null) {
							local239[local162++] = local278;
						}
					}
				}
				local156 = new Class6_Sub1_Sub2_Sub5(183, local239, local162);
				for (local250 = 0; local250 < 5; local250++) {
					if (this.anIntArray54[local250] != 0) {
						local156.method242(client.anIntArrayArray24[local250][0], client.anIntArrayArray24[local250][this.anIntArray54[local250]]);
						if (local250 == 1) {
							local156.method242(client.anIntArray275[0], client.anIntArray275[this.anIntArray54[local250]]);
						}
					}
				}
				local156.method235();
				local156.method245(64, 850, -30, -50, -30, true);
				aClass36_4.method395(local59, local156);
				this.aLong13 = local59;
			}
			if (this.aBoolean74) {
				return local156;
			}
			@Pc(383) Class6_Sub1_Sub2_Sub5 local383 = Class6_Sub1_Sub2_Sub5.aClass6_Sub1_Sub2_Sub5_2;
			local383.method230(Class34.method378(local61) & Class34.method378(local63), local156);
			if (local61 != -1 && local63 != -1) {
				local383.method237(local63, this.anInt291, local61, Class21.aClass21Array1[super.anInt529].anIntArray67);
			} else if (local61 != -1) {
				local383.method236(local61);
			}
			local383.method232(this.aBoolean72);
			local383.anIntArrayArray9 = null;
			local383.anIntArrayArray8 = null;
			return local383;
		} catch (@Pc(433) RuntimeException local433) {
			signlink.reporterror("34317, " + 4245 + ", " + local433.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IGCQCHAY", name = "d", descriptor = "(I)Lclient!NGYJLUVS;")
	public Class6_Sub1_Sub2_Sub5 method144() {
		try {
			if (!this.aBoolean73) {
				return null;
			} else if (this.aClass47_1 == null) {
				@Pc(17) boolean local17 = false;
				for (@Pc(19) int local19 = 0; local19 < 12; local19++) {
					@Pc(26) int local26 = this.anIntArray55[local19];
					if (local26 >= 256 && local26 < 512 && !Class16.aClass16Array1[local26 - 256].method149()) {
						local17 = true;
					}
					if (local26 >= 512 && !Class4.method22(local26 - 512).method21(this.anInt293)) {
						local17 = true;
					}
				}
				if (local17) {
					return null;
				}
				@Pc(67) Class6_Sub1_Sub2_Sub5[] local67 = new Class6_Sub1_Sub2_Sub5[12];
				@Pc(69) int local69 = 0;
				for (@Pc(76) int local76 = 0; local76 < 12; local76++) {
					@Pc(83) int local83 = this.anIntArray55[local76];
					@Pc(97) Class6_Sub1_Sub2_Sub5 local97;
					if (local83 >= 256 && local83 < 512) {
						local97 = Class16.aClass16Array1[local83 - 256].method150();
						if (local97 != null) {
							local67[local69++] = local97;
						}
					}
					if (local83 >= 512) {
						local97 = Class4.method22(local83 - 512).method24(this.anInt293);
						if (local97 != null) {
							local67[local69++] = local97;
						}
					}
				}
				@Pc(134) Class6_Sub1_Sub2_Sub5 local134 = new Class6_Sub1_Sub2_Sub5(183, local67, local69);
				for (@Pc(136) int local136 = 0; local136 < 5; local136++) {
					if (this.anIntArray54[local136] != 0) {
						local134.method242(client.anIntArrayArray24[local136][0], client.anIntArrayArray24[local136][this.anIntArray54[local136]]);
						if (local136 == 1) {
							local134.method242(client.anIntArray275[0], client.anIntArray275[this.anIntArray54[local136]]);
						}
					}
				}
				return local134;
			} else {
				return this.aClass47_1.method544(this.anInt304);
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("43987, " + 0 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IGCQCHAY", name = "a", descriptor = "(I)Lclient!NGYJLUVS;")
	@Override
	protected Class6_Sub1_Sub2_Sub5 method382() {
		try {
			if (!this.aBoolean73) {
				return null;
			}
			@Pc(10) Class6_Sub1_Sub2_Sub5 local10 = this.method143();
			if (local10 == null) {
				return null;
			}
			super.anInt524 = local10.anInt640;
			local10.aBoolean118 = true;
			if (this.aBoolean74) {
				return local10;
			}
			if (super.anInt516 != -1 && super.anInt517 != -1) {
				@Pc(45) Class12 local45 = Class12.aClass12Array1[super.anInt516];
				@Pc(48) Class6_Sub1_Sub2_Sub5 local48 = local45.method101();
				if (local48 != null) {
					@Pc(62) Class6_Sub1_Sub2_Sub5 local62 = new Class6_Sub1_Sub2_Sub5(Class34.method378(super.anInt517), true, true, local48, false);
					local62.method241(0, -super.anInt520, 0);
					local62.method235();
					local62.method236(local45.aClass21_1.anIntArray64[super.anInt517]);
					local62.anIntArrayArray9 = null;
					local62.anIntArrayArray8 = null;
					if (local45.anInt131 != 128 || local45.anInt132 != 128) {
						local62.method244(local45.anInt131, local45.anInt131, local45.anInt132);
					}
					local62.method245(local45.anInt134 + 64, local45.anInt135 + 850, -30, -50, -30, true);
					@Pc(130) Class6_Sub1_Sub2_Sub5[] local130 = new Class6_Sub1_Sub2_Sub5[] { local10, local62 };
					local10 = new Class6_Sub1_Sub2_Sub5(-426, 2, true, local130);
				}
			}
			if (this.aClass6_Sub1_Sub2_Sub5_1 != null) {
				if (client.anInt936 >= this.anInt287) {
					this.aClass6_Sub1_Sub2_Sub5_1 = null;
				}
				if (client.anInt936 >= this.anInt286 && client.anInt936 < this.anInt287) {
					@Pc(159) Class6_Sub1_Sub2_Sub5 local159 = this.aClass6_Sub1_Sub2_Sub5_1;
					local159.method241(this.anInt288 - super.anInt535, this.anInt289 - this.anInt300, this.anInt290 - super.anInt536);
					if (super.anInt541 == 512) {
						local159.method239();
						local159.method239();
						local159.method239();
					} else if (super.anInt541 == 1024) {
						local159.method239();
						local159.method239();
					} else if (super.anInt541 == 1536) {
						local159.method239();
					}
					@Pc(222) Class6_Sub1_Sub2_Sub5[] local222 = new Class6_Sub1_Sub2_Sub5[] { local10, local159 };
					local10 = new Class6_Sub1_Sub2_Sub5(-426, 2, true, local222);
					if (super.anInt541 == 512) {
						local159.method239();
					} else if (super.anInt541 == 1024) {
						local159.method239();
						local159.method239();
					} else if (super.anInt541 == 1536) {
						local159.method239();
						local159.method239();
						local159.method239();
					}
					local159.method241(super.anInt535 - this.anInt288, this.anInt300 - this.anInt289, super.anInt536 - this.anInt290);
				}
			}
			local10.aBoolean118 = true;
			return local10;
		} catch (@Pc(288) RuntimeException local288) {
			signlink.reporterror("51419, " + -12617 + ", " + local288.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IGCQCHAY", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method306() {
		try {
			return this.aBoolean73;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("93549, " + true + ", " + local12.toString());
			throw new RuntimeException();
		}
	}
}
