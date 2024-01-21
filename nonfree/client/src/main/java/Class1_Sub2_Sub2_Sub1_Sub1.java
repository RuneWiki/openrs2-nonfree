import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CQCDOTXO")
public final class Class1_Sub2_Sub2_Sub1_Sub1 extends Class1_Sub2_Sub2_Sub1 {

	@OriginalMember(owner = "client!CQCDOTXO", name = "vb", descriptor = "Lclient!NVDACYAH;")
	public static Class30 aClass30_1 = new Class30(false, 260);

	@OriginalMember(owner = "client!CQCDOTXO", name = "qb", descriptor = "I")
	public int anInt172;

	@OriginalMember(owner = "client!CQCDOTXO", name = "rb", descriptor = "I")
	public int anInt173;

	@OriginalMember(owner = "client!CQCDOTXO", name = "sb", descriptor = "I")
	public int anInt174;

	@OriginalMember(owner = "client!CQCDOTXO", name = "tb", descriptor = "I")
	public int anInt175;

	@OriginalMember(owner = "client!CQCDOTXO", name = "ub", descriptor = "I")
	public int anInt176;

	@OriginalMember(owner = "client!CQCDOTXO", name = "Ab", descriptor = "I")
	private int anInt179;

	@OriginalMember(owner = "client!CQCDOTXO", name = "Bb", descriptor = "I")
	public int anInt180;

	@OriginalMember(owner = "client!CQCDOTXO", name = "Db", descriptor = "I")
	public int anInt181;

	@OriginalMember(owner = "client!CQCDOTXO", name = "Eb", descriptor = "I")
	public int anInt182;

	@OriginalMember(owner = "client!CQCDOTXO", name = "Fb", descriptor = "I")
	public int anInt183;

	@OriginalMember(owner = "client!CQCDOTXO", name = "Gb", descriptor = "I")
	public int anInt184;

	@OriginalMember(owner = "client!CQCDOTXO", name = "Hb", descriptor = "Lclient!IRLTEWJP;")
	public Class1_Sub2_Sub2_Sub3 aClass1_Sub2_Sub2_Sub3_1;

	@OriginalMember(owner = "client!CQCDOTXO", name = "Ib", descriptor = "J")
	private long aLong11;

	@OriginalMember(owner = "client!CQCDOTXO", name = "Jb", descriptor = "I")
	public int anInt185;

	@OriginalMember(owner = "client!CQCDOTXO", name = "Kb", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!CQCDOTXO", name = "Ob", descriptor = "Lclient!PFWIJTDA;")
	public Class34 aClass34_1;

	@OriginalMember(owner = "client!CQCDOTXO", name = "Pb", descriptor = "I")
	public int anInt187;

	@OriginalMember(owner = "client!CQCDOTXO", name = "Qb", descriptor = "I")
	public int anInt188;

	@OriginalMember(owner = "client!CQCDOTXO", name = "nb", descriptor = "I")
	public int anInt170 = -1;

	@OriginalMember(owner = "client!CQCDOTXO", name = "ob", descriptor = "I")
	public int anInt171 = -1;

	@OriginalMember(owner = "client!CQCDOTXO", name = "pb", descriptor = "B")
	private byte aByte7 = -8;

	@OriginalMember(owner = "client!CQCDOTXO", name = "wb", descriptor = "[I")
	public int[] anIntArray18 = new int[12];

	@OriginalMember(owner = "client!CQCDOTXO", name = "xb", descriptor = "I")
	private int anInt177 = -549;

	@OriginalMember(owner = "client!CQCDOTXO", name = "yb", descriptor = "I")
	private int anInt178 = 111;

	@OriginalMember(owner = "client!CQCDOTXO", name = "zb", descriptor = "Z")
	public boolean aBoolean26 = false;

	@OriginalMember(owner = "client!CQCDOTXO", name = "Cb", descriptor = "Z")
	public boolean aBoolean27 = false;

	@OriginalMember(owner = "client!CQCDOTXO", name = "Lb", descriptor = "J")
	private long aLong12 = -1L;

	@OriginalMember(owner = "client!CQCDOTXO", name = "Mb", descriptor = "[I")
	public int[] anIntArray19 = new int[5];

	@OriginalMember(owner = "client!CQCDOTXO", name = "Nb", descriptor = "I")
	private int anInt186 = 766;

	@OriginalMember(owner = "client!CQCDOTXO", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method568() {
		try {
			return this.aBoolean26;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("53097, " + 5 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CQCDOTXO", name = "c", descriptor = "(I)Lclient!IRLTEWJP;")
	private Class1_Sub2_Sub2_Sub3 method80() {
		try {
			if (this.aClass34_1 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt764 >= 0 && super.anInt767 == 0) {
					local6 = Class36.aClass36Array1[super.anInt764].anIntArray131[super.anInt765];
				} else if (super.anInt744 >= 0) {
					local6 = Class36.aClass36Array1[super.anInt744].anIntArray131[super.anInt745];
				}
				return this.aClass34_1.method360(null, -1, local6, 670);
			}
			@Pc(48) long local48 = this.aLong11;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (super.anInt764 >= 0 && super.anInt767 == 0) {
				@Pc(67) Class36 local67 = Class36.aClass36Array1[super.anInt764];
				local50 = local67.anIntArray131[super.anInt765];
				if (super.anInt744 >= 0 && super.anInt744 != super.anInt786) {
					local52 = Class36.aClass36Array1[super.anInt744].anIntArray131[super.anInt745];
				}
				if (local67.anInt535 >= 0) {
					local54 = local67.anInt535;
					local48 += local54 - this.anIntArray18[5] << 8;
				}
				if (local67.anInt536 >= 0) {
					local56 = local67.anInt536;
					local48 += local56 - this.anIntArray18[3] << 16;
				}
			} else if (super.anInt744 >= 0) {
				local50 = Class36.aClass36Array1[super.anInt744].anIntArray131[super.anInt745];
			}
			@Pc(145) Class1_Sub2_Sub2_Sub3 local145 = (Class1_Sub2_Sub2_Sub3) aClass30_1.method348(local48);
			@Pc(157) int local157;
			@Pc(164) int local164;
			if (local145 == null) {
				@Pc(155) boolean local155 = false;
				for (local157 = 0; local157 < 12; local157++) {
					local164 = this.anIntArray18[local157];
					if (local56 >= 0 && local157 == 3) {
						local164 = local56;
					}
					if (local54 >= 0 && local157 == 5) {
						local164 = local54;
					}
					if (local164 >= 256 && local164 < 512 && !Class35.aClass35Array1[local164 - 256].method366()) {
						local155 = true;
					}
					if (local164 >= 512 && !Class38.method409(local164 - 512).method401(this.anInt179)) {
						local155 = true;
					}
				}
				if (local155) {
					if (this.aLong12 != -1L) {
						local145 = (Class1_Sub2_Sub2_Sub3) aClass30_1.method348(this.aLong12);
					}
					if (local145 == null) {
						return null;
					}
				}
			}
			if (local145 == null) {
				@Pc(234) Class1_Sub2_Sub2_Sub3[] local234 = new Class1_Sub2_Sub2_Sub3[12];
				local157 = 0;
				@Pc(245) int local245;
				for (local164 = 0; local164 < 12; local164++) {
					local245 = this.anIntArray18[local164];
					if (local56 >= 0 && local164 == 3) {
						local245 = local56;
					}
					if (local54 >= 0 && local164 == 5) {
						local245 = local54;
					}
					@Pc(273) Class1_Sub2_Sub2_Sub3 local273;
					if (local245 >= 256 && local245 < 512) {
						local273 = Class35.aClass35Array1[local245 - 256].method367();
						if (local273 != null) {
							local234[local157++] = local273;
						}
					}
					if (local245 >= 512) {
						local273 = Class38.method409(local245 - 512).method404(this.anInt179);
						if (local273 != null) {
							local234[local157++] = local273;
						}
					}
				}
				local145 = new Class1_Sub2_Sub2_Sub3(local157, 473, local234);
				for (local245 = 0; local245 < 5; local245++) {
					if (this.anIntArray19[local245] != 0) {
						local145.method210(client.anIntArrayArray23[local245][0], client.anIntArrayArray23[local245][this.anIntArray19[local245]]);
						if (local245 == 1) {
							local145.method210(client.anIntArray239[0], client.anIntArray239[this.anIntArray19[local245]]);
						}
					}
				}
				local145.method203();
				local145.method213(64, 850, -30, -50, -30, true);
				aClass30_1.method349(local48, local145);
				this.aLong12 = local48;
			}
			if (this.aBoolean27) {
				return local145;
			}
			@Pc(378) Class1_Sub2_Sub2_Sub3 local378 = Class1_Sub2_Sub2_Sub3.aClass1_Sub2_Sub2_Sub3_2;
			local378.method198(this.anInt186, local145, Class11.method123(local50) & Class11.method123(local52));
			if (local50 != -1 && local52 != -1) {
				local378.method205(local50, Class36.aClass36Array1[super.anInt764].anIntArray134, local52);
			} else if (local50 != -1) {
				local378.method204(local50);
			}
			local378.method200();
			local378.anIntArrayArray11 = null;
			local378.anIntArrayArray10 = null;
			return local378;
		} catch (@Pc(427) RuntimeException local427) {
			signlink.reporterror("69620, " + -390 + ", " + local427.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CQCDOTXO", name = "a", descriptor = "(I)Lclient!IRLTEWJP;")
	@Override
	protected Class1_Sub2_Sub2_Sub3 method574() {
		try {
			if (!this.aBoolean26) {
				return null;
			}
			@Pc(19) Class1_Sub2_Sub2_Sub3 local19 = this.method80();
			if (local19 == null) {
				return null;
			}
			super.anInt756 = local19.anInt791;
			local19.aBoolean69 = true;
			if (this.aBoolean27) {
				return local19;
			}
			if (super.anInt780 != -1 && super.anInt781 != -1) {
				@Pc(48) Class33 local48 = Class33.aClass33Array1[super.anInt780];
				@Pc(51) Class1_Sub2_Sub2_Sub3 local51 = local48.method355();
				if (local51 != null) {
					@Pc(65) Class1_Sub2_Sub2_Sub3 local65 = new Class1_Sub2_Sub2_Sub3(local51, false, 0, Class11.method123(super.anInt781), true);
					local65.method209(0, 0, -super.anInt784);
					local65.method203();
					local65.method204(local48.aClass36_1.anIntArray131[super.anInt781]);
					local65.anIntArrayArray11 = null;
					local65.anIntArrayArray10 = null;
					if (local48.anInt501 != 128 || local48.anInt502 != 128) {
						local65.method212(local48.anInt501, this.aByte7, local48.anInt502, local48.anInt501);
					}
					local65.method213(local48.anInt504 + 64, local48.anInt505 + 850, -30, -50, -30, true);
					@Pc(134) Class1_Sub2_Sub2_Sub3[] local134 = new Class1_Sub2_Sub2_Sub3[] { local19, local65 };
					local19 = new Class1_Sub2_Sub2_Sub3(true, 2, 163, local134);
				}
			}
			if (this.aClass1_Sub2_Sub2_Sub3_1 != null) {
				if (client.anInt1045 >= this.anInt188) {
					this.aClass1_Sub2_Sub2_Sub3_1 = null;
				}
				if (client.anInt1045 >= this.anInt187 && client.anInt1045 < this.anInt188) {
					@Pc(163) Class1_Sub2_Sub2_Sub3 local163 = this.aClass1_Sub2_Sub2_Sub3_1;
					local163.method209(this.anInt182 - super.anInt776, this.anInt184 - super.anInt777, this.anInt183 - this.anInt181);
					if (super.anInt779 == 512) {
						local163.method207((byte) 4);
						local163.method207((byte) 4);
						local163.method207((byte) 4);
					} else if (super.anInt779 == 1024) {
						local163.method207((byte) 4);
						local163.method207((byte) 4);
					} else if (super.anInt779 == 1536) {
						local163.method207((byte) 4);
					}
					@Pc(226) Class1_Sub2_Sub2_Sub3[] local226 = new Class1_Sub2_Sub2_Sub3[] { local19, local163 };
					local19 = new Class1_Sub2_Sub2_Sub3(true, 2, 163, local226);
					if (super.anInt779 == 512) {
						local163.method207((byte) 4);
					} else if (super.anInt779 == 1024) {
						local163.method207((byte) 4);
						local163.method207((byte) 4);
					} else if (super.anInt779 == 1536) {
						local163.method207((byte) 4);
						local163.method207((byte) 4);
						local163.method207((byte) 4);
					}
					local163.method209(super.anInt776 - this.anInt182, super.anInt777 - this.anInt184, this.anInt181 - this.anInt183);
				}
			}
			local19.aBoolean69 = true;
			return local19;
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("19425, " + -840 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CQCDOTXO", name = "b", descriptor = "(B)Lclient!IRLTEWJP;")
	public Class1_Sub2_Sub2_Sub3 method81() {
		try {
			if (!this.aBoolean26) {
				return null;
			} else if (this.aClass34_1 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray18[local18];
					if (local25 >= 256 && local25 < 512 && !Class35.aClass35Array1[local25 - 256].method368()) {
						local16 = true;
					}
					if (local25 >= 512 && !Class38.method409(local25 - 512).method406(this.anInt179)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(72) Class1_Sub2_Sub2_Sub3[] local72 = new Class1_Sub2_Sub2_Sub3[12];
				@Pc(74) int local74 = 0;
				for (@Pc(76) int local76 = 0; local76 < 12; local76++) {
					@Pc(83) int local83 = this.anIntArray18[local76];
					@Pc(97) Class1_Sub2_Sub2_Sub3 local97;
					if (local83 >= 256 && local83 < 512) {
						local97 = Class35.aClass35Array1[local83 - 256].method369(758);
						if (local97 != null) {
							local72[local74++] = local97;
						}
					}
					if (local83 >= 512) {
						local97 = Class38.method409(local83 - 512).method405(this.anInt179);
						if (local97 != null) {
							local72[local74++] = local97;
						}
					}
				}
				@Pc(134) Class1_Sub2_Sub2_Sub3 local134 = new Class1_Sub2_Sub2_Sub3(local74, 473, local72);
				for (@Pc(136) int local136 = 0; local136 < 5; local136++) {
					if (this.anIntArray19[local136] != 0) {
						local134.method210(client.anIntArrayArray23[local136][0], client.anIntArrayArray23[local136][this.anIntArray19[local136]]);
						if (local136 == 1) {
							local134.method210(client.anIntArray239[0], client.anIntArray239[this.anIntArray19[local136]]);
						}
					}
				}
				return local134;
			} else {
				return this.aClass34_1.method356();
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("67479, " + -106 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CQCDOTXO", name = "a", descriptor = "(ILclient!MNKDCXXG;)V")
	public void method82(@OriginalArg(1) Class1_Sub2_Sub3 arg0) {
		try {
			arg0.anInt474 = 0;
			this.anInt179 = arg0.method307();
			this.anInt170 = arg0.method308();
			this.anInt171 = arg0.method308();
			this.aClass34_1 = null;
			this.anInt176 = 0;
			@Pc(29) int local29;
			@Pc(41) int local41;
			@Pc(88) int local88;
			for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
				local29 = arg0.method307();
				if (local29 == 0) {
					this.anIntArray18[local24] = 0;
				} else {
					local41 = arg0.method307();
					this.anIntArray18[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray18[0] == 65535) {
						this.aClass34_1 = Class34.method362(arg0.method309());
						break;
					}
					if (this.anIntArray18[local24] >= 512 && this.anIntArray18[local24] - 512 < Class38.anInt572) {
						local88 = Class38.method409(this.anIntArray18[local24] - 512).anInt583;
						if (local88 != 0) {
							this.anInt176 = local88;
						}
					}
				}
			}
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg0.method307();
				if (local41 < 0 || local41 >= client.anIntArrayArray23[local29].length) {
					local41 = 0;
				}
				this.anIntArray19[local29] = local41;
			}
			super.anInt786 = arg0.method309();
			if (super.anInt786 == 65535) {
				super.anInt786 = -1;
			}
			super.anInt787 = arg0.method309();
			if (super.anInt787 == 65535) {
				super.anInt787 = -1;
			}
			super.anInt758 = arg0.method309();
			if (super.anInt758 == 65535) {
				super.anInt758 = -1;
			}
			super.anInt759 = arg0.method309();
			if (super.anInt759 == 65535) {
				super.anInt759 = -1;
			}
			super.anInt760 = arg0.method309();
			if (super.anInt760 == 65535) {
				super.anInt760 = -1;
			}
			super.anInt761 = arg0.method309();
			if (super.anInt761 == 65535) {
				super.anInt761 = -1;
			}
			super.anInt757 = arg0.method309();
			if (super.anInt757 == 65535) {
				super.anInt757 = -1;
			}
			this.aString3 = Class40.method417(Class40.method414(arg0.method313()));
			this.anInt180 = arg0.method307();
			this.anInt185 = arg0.method309();
			this.aBoolean26 = true;
			this.aLong11 = 0L;
			local41 = this.anIntArray18[5];
			local88 = this.anIntArray18[9];
			this.anIntArray18[5] = local88;
			this.anIntArray18[9] = local41;
			for (@Pc(252) int local252 = 0; local252 < 12; local252++) {
				this.aLong11 <<= 0x4;
				if (this.anIntArray18[local252] >= 256) {
					this.aLong11 += this.anIntArray18[local252] - 256;
				}
			}
			if (this.anIntArray18[0] >= 256) {
				this.aLong11 += this.anIntArray18[0] - 256 >> 4;
			}
			if (this.anIntArray18[1] >= 256) {
				this.aLong11 += this.anIntArray18[1] - 256 >> 8;
			}
			this.anIntArray18[5] = local41;
			this.anIntArray18[9] = local88;
			for (@Pc(334) int local334 = 0; local334 < 5; local334++) {
				this.aLong11 <<= 0x3;
				this.aLong11 += this.anIntArray19[local334];
			}
			this.aLong11 <<= 0x1;
			this.aLong11 += this.anInt179;
		} catch (@Pc(372) RuntimeException local372) {
			signlink.reporterror("70494, " + -802 + ", " + arg0 + ", " + local372.toString());
			throw new RuntimeException();
		}
	}
}
