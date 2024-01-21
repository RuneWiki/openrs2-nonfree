import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KZCOXKKW")
public final class Class2_Sub1_Sub3_Sub1_Sub1 extends Class2_Sub1_Sub3_Sub1 {

	@OriginalMember(owner = "client!KZCOXKKW", name = "wb", descriptor = "Lclient!BMKJVFXV;")
	public static Class5 aClass5_1 = new Class5(688, 260);

	@OriginalMember(owner = "client!KZCOXKKW", name = "ub", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!KZCOXKKW", name = "vb", descriptor = "I")
	public int anInt349;

	@OriginalMember(owner = "client!KZCOXKKW", name = "zb", descriptor = "I")
	public int anInt351;

	@OriginalMember(owner = "client!KZCOXKKW", name = "Ab", descriptor = "Lclient!YSYPMZMO;")
	public Class48 aClass48_1;

	@OriginalMember(owner = "client!KZCOXKKW", name = "Bb", descriptor = "I")
	private int anInt352;

	@OriginalMember(owner = "client!KZCOXKKW", name = "Db", descriptor = "I")
	private int anInt354;

	@OriginalMember(owner = "client!KZCOXKKW", name = "Fb", descriptor = "I")
	public int anInt355;

	@OriginalMember(owner = "client!KZCOXKKW", name = "Hb", descriptor = "I")
	private int anInt356;

	@OriginalMember(owner = "client!KZCOXKKW", name = "Jb", descriptor = "I")
	public int anInt357;

	@OriginalMember(owner = "client!KZCOXKKW", name = "Kb", descriptor = "I")
	public int anInt358;

	@OriginalMember(owner = "client!KZCOXKKW", name = "Lb", descriptor = "I")
	public int anInt359;

	@OriginalMember(owner = "client!KZCOXKKW", name = "Mb", descriptor = "I")
	public int anInt360;

	@OriginalMember(owner = "client!KZCOXKKW", name = "Nb", descriptor = "I")
	public int anInt361;

	@OriginalMember(owner = "client!KZCOXKKW", name = "Pb", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!KZCOXKKW", name = "Qb", descriptor = "I")
	public int anInt363;

	@OriginalMember(owner = "client!KZCOXKKW", name = "Rb", descriptor = "I")
	public int anInt364;

	@OriginalMember(owner = "client!KZCOXKKW", name = "Sb", descriptor = "I")
	public int anInt365;

	@OriginalMember(owner = "client!KZCOXKKW", name = "Tb", descriptor = "I")
	public int anInt366;

	@OriginalMember(owner = "client!KZCOXKKW", name = "Ub", descriptor = "I")
	public int anInt367;

	@OriginalMember(owner = "client!KZCOXKKW", name = "Vb", descriptor = "Lclient!RMLAXPMV;")
	public Class2_Sub1_Sub3_Sub4 aClass2_Sub1_Sub3_Sub4_1;

	@OriginalMember(owner = "client!KZCOXKKW", name = "rb", descriptor = "Z")
	public boolean aBoolean115 = false;

	@OriginalMember(owner = "client!KZCOXKKW", name = "sb", descriptor = "I")
	public int anInt348 = -1;

	@OriginalMember(owner = "client!KZCOXKKW", name = "tb", descriptor = "[I")
	public int[] anIntArray75 = new int[12];

	@OriginalMember(owner = "client!KZCOXKKW", name = "xb", descriptor = "I")
	public int anInt350 = -1;

	@OriginalMember(owner = "client!KZCOXKKW", name = "yb", descriptor = "[I")
	public int[] anIntArray76 = new int[5];

	@OriginalMember(owner = "client!KZCOXKKW", name = "Cb", descriptor = "I")
	private int anInt353 = 8;

	@OriginalMember(owner = "client!KZCOXKKW", name = "Eb", descriptor = "J")
	private long aLong14 = -1L;

	@OriginalMember(owner = "client!KZCOXKKW", name = "Gb", descriptor = "B")
	private byte aByte30 = -108;

	@OriginalMember(owner = "client!KZCOXKKW", name = "Ib", descriptor = "Z")
	private boolean aBoolean116 = false;

	@OriginalMember(owner = "client!KZCOXKKW", name = "Ob", descriptor = "I")
	private int anInt362 = 978;

	@OriginalMember(owner = "client!KZCOXKKW", name = "Wb", descriptor = "Z")
	public boolean aBoolean117 = false;

	@OriginalMember(owner = "client!KZCOXKKW", name = "b", descriptor = "(I)Lclient!RMLAXPMV;")
	public Class2_Sub1_Sub3_Sub4 method301() {
		try {
			if (!this.aBoolean115) {
				return null;
			} else if (this.aClass48_1 == null) {
				@Pc(17) boolean local17 = false;
				for (@Pc(19) int local19 = 0; local19 < 12; local19++) {
					@Pc(26) int local26 = this.anIntArray75[local19];
					if (local26 >= 256 && local26 < 512 && !Class14.aClass14Array1[local26 - 256].method222()) {
						local17 = true;
					}
					if (local26 >= 512 && !Class32.method412(local26 - 512).method406(this.anInt354)) {
						local17 = true;
					}
				}
				if (local17) {
					return null;
				}
				@Pc(67) Class2_Sub1_Sub3_Sub4[] local67 = new Class2_Sub1_Sub3_Sub4[12];
				@Pc(69) int local69 = 0;
				for (@Pc(71) int local71 = 0; local71 < 12; local71++) {
					@Pc(78) int local78 = this.anIntArray75[local71];
					@Pc(92) Class2_Sub1_Sub3_Sub4 local92;
					if (local78 >= 256 && local78 < 512) {
						local92 = Class14.aClass14Array1[local78 - 256].method223();
						if (local92 != null) {
							local67[local69++] = local92;
						}
					}
					if (local78 >= 512) {
						local92 = Class32.method412(local78 - 512).method414(this.anInt354);
						if (local92 != null) {
							local67[local69++] = local92;
						}
					}
				}
				@Pc(138) Class2_Sub1_Sub3_Sub4 local138 = new Class2_Sub1_Sub3_Sub4(local69, local67, 118);
				for (@Pc(140) int local140 = 0; local140 < 5; local140++) {
					if (this.anIntArray76[local140] != 0) {
						local138.method445(client.anIntArrayArray23[local140][0], client.anIntArrayArray23[local140][this.anIntArray76[local140]]);
						if (local140 == 1) {
							local138.method445(client.anIntArray266[0], client.anIntArray266[this.anIntArray76[local140]]);
						}
					}
				}
				return local138;
			} else {
				return this.aClass48_1.method571(this.anInt353);
			}
		} catch (@Pc(183) RuntimeException local183) {
			signlink.reporterror("43293, " + 304 + ", " + local183.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KZCOXKKW", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method492() {
		try {
			return this.aBoolean115;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("37272, " + 39489 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KZCOXKKW", name = "a", descriptor = "(B)Lclient!RMLAXPMV;")
	@Override
	protected Class2_Sub1_Sub3_Sub4 method489(@OriginalArg(0) byte arg0) {
		try {
			if (!this.aBoolean115) {
				return null;
			}
			@Pc(10) Class2_Sub1_Sub3_Sub4 local10 = this.method302();
			if (local10 == null) {
				return null;
			}
			super.anInt686 = local10.anInt658;
			local10.aBoolean167 = true;
			if (this.aBoolean117) {
				return local10;
			}
			if (super.anInt698 != -1 && super.anInt699 != -1) {
				@Pc(39) Class27 local39 = Class27.aClass27Array1[super.anInt698];
				@Pc(42) Class2_Sub1_Sub3_Sub4 local42 = local39.method316();
				if (local42 != null) {
					@Pc(56) Class2_Sub1_Sub3_Sub4 local56 = new Class2_Sub1_Sub3_Sub4(local42, Class45.method557(super.anInt699), true, false, true);
					local56.method444(0, 0, -super.anInt702);
					local56.method438();
					local56.method439(local39.aClass22_1.anIntArray64[super.anInt699]);
					local56.anIntArrayArray16 = null;
					local56.anIntArrayArray15 = null;
					if (local39.anInt400 != 128 || local39.anInt401 != 128) {
						local56.method447(local39.anInt401, local39.anInt400, local39.anInt400, this.anInt356);
					}
					local56.method448(local39.anInt403 + 64, local39.anInt404 + 850, -30, -50, -30, true);
					@Pc(125) Class2_Sub1_Sub3_Sub4[] local125 = new Class2_Sub1_Sub3_Sub4[] { local10, local56 };
					local10 = new Class2_Sub1_Sub3_Sub4(2, true, 18217, local125);
				}
			}
			if (this.aClass2_Sub1_Sub3_Sub4_1 != null) {
				if (client.anInt970 >= this.anInt364) {
					this.aClass2_Sub1_Sub3_Sub4_1 = null;
				}
				if (client.anInt970 >= this.anInt363 && client.anInt970 < this.anInt364) {
					@Pc(154) Class2_Sub1_Sub3_Sub4 local154 = this.aClass2_Sub1_Sub3_Sub4_1;
					local154.method444(this.anInt367 - super.anInt681, this.anInt365 - super.anInt680, this.anInt366 - this.anInt349);
					if (super.anInt691 == 512) {
						local154.method442();
						local154.method442();
						local154.method442();
					} else if (super.anInt691 == 1024) {
						local154.method442();
						local154.method442();
					} else if (super.anInt691 == 1536) {
						local154.method442();
					}
					@Pc(217) Class2_Sub1_Sub3_Sub4[] local217 = new Class2_Sub1_Sub3_Sub4[] { local10, local154 };
					local10 = new Class2_Sub1_Sub3_Sub4(2, true, 18217, local217);
					if (super.anInt691 == 512) {
						local154.method442();
					} else if (super.anInt691 == 1024) {
						local154.method442();
						local154.method442();
					} else if (super.anInt691 == 1536) {
						local154.method442();
						local154.method442();
						local154.method442();
					}
					local154.method444(super.anInt681 - this.anInt367, super.anInt680 - this.anInt365, this.anInt349 - this.anInt366);
				}
			}
			local10.aBoolean167 = true;
			if (arg0 != 3) {
				this.anInt352 = -12;
			}
			return local10;
		} catch (@Pc(289) RuntimeException local289) {
			signlink.reporterror("7493, " + arg0 + ", " + local289.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KZCOXKKW", name = "c", descriptor = "(I)Lclient!RMLAXPMV;")
	private Class2_Sub1_Sub3_Sub4 method302() {
		try {
			if (this.aClass48_1 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt674 >= 0 && super.anInt677 == 0) {
					local6 = Class22.aClass22Array1[super.anInt674].anIntArray64[super.anInt675];
				} else if (super.anInt693 >= 0) {
					local6 = Class22.aClass22Array1[super.anInt693].anIntArray64[super.anInt694];
				}
				return this.aClass48_1.method564(null, local6, -1);
			}
			@Pc(48) long local48 = this.aLong15;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (super.anInt674 >= 0 && super.anInt677 == 0) {
				@Pc(67) Class22 local67 = Class22.aClass22Array1[super.anInt674];
				local50 = local67.anIntArray64[super.anInt675];
				if (super.anInt693 >= 0 && super.anInt693 != super.anInt672) {
					local52 = Class22.aClass22Array1[super.anInt693].anIntArray64[super.anInt694];
				}
				if (local67.anInt265 >= 0) {
					local54 = local67.anInt265;
					local48 += local54 - this.anIntArray75[5] << 8;
				}
				if (local67.anInt266 >= 0) {
					local56 = local67.anInt266;
					local48 += local56 - this.anIntArray75[3] << 16;
				}
			} else if (super.anInt693 >= 0) {
				local50 = Class22.aClass22Array1[super.anInt693].anIntArray64[super.anInt694];
			}
			@Pc(145) Class2_Sub1_Sub3_Sub4 local145 = (Class2_Sub1_Sub3_Sub4) aClass5_1.method77(local48);
			@Pc(159) int local159;
			@Pc(166) int local166;
			if (local145 == null) {
				@Pc(157) boolean local157 = false;
				for (local159 = 0; local159 < 12; local159++) {
					local166 = this.anIntArray75[local159];
					if (local56 >= 0 && local159 == 3) {
						local166 = local56;
					}
					if (local54 >= 0 && local159 == 5) {
						local166 = local54;
					}
					if (local166 >= 256 && local166 < 512 && !Class14.aClass14Array1[local166 - 256].method220()) {
						local157 = true;
					}
					if (local166 >= 512 && !Class32.method412(local166 - 512).method411(this.anInt354)) {
						local157 = true;
					}
				}
				if (local157) {
					if (this.aLong14 != -1L) {
						local145 = (Class2_Sub1_Sub3_Sub4) aClass5_1.method77(this.aLong14);
					}
					if (local145 == null) {
						return null;
					}
				}
			}
			if (local145 == null) {
				@Pc(236) Class2_Sub1_Sub3_Sub4[] local236 = new Class2_Sub1_Sub3_Sub4[12];
				local159 = 0;
				@Pc(247) int local247;
				for (local166 = 0; local166 < 12; local166++) {
					local247 = this.anIntArray75[local166];
					if (local56 >= 0 && local166 == 3) {
						local247 = local56;
					}
					if (local54 >= 0 && local166 == 5) {
						local247 = local54;
					}
					@Pc(275) Class2_Sub1_Sub3_Sub4 local275;
					if (local247 >= 256 && local247 < 512) {
						local275 = Class14.aClass14Array1[local247 - 256].method221();
						if (local275 != null) {
							local236[local159++] = local275;
						}
					}
					if (local247 >= 512) {
						local275 = Class32.method412(local247 - 512).method410(this.anInt354, this.anInt362);
						if (local275 != null) {
							local236[local159++] = local275;
						}
					}
				}
				local145 = new Class2_Sub1_Sub3_Sub4(local159, local236, 118);
				for (local247 = 0; local247 < 5; local247++) {
					if (this.anIntArray76[local247] != 0) {
						local145.method445(client.anIntArrayArray23[local247][0], client.anIntArrayArray23[local247][this.anIntArray76[local247]]);
						if (local247 == 1) {
							local145.method445(client.anIntArray266[0], client.anIntArray266[this.anIntArray76[local247]]);
						}
					}
				}
				local145.method438();
				local145.method448(64, 850, -30, -50, -30, true);
				aClass5_1.method78(local48, local145, this.aByte30);
				this.aLong14 = local48;
			}
			if (this.aBoolean117) {
				return local145;
			}
			@Pc(382) Class2_Sub1_Sub3_Sub4 local382 = Class2_Sub1_Sub3_Sub4.aClass2_Sub1_Sub3_Sub4_2;
			local382.method433(Class45.method557(local50) & Class45.method557(local52), local145);
			if (local50 != -1 && local52 != -1) {
				local382.method440(local52, local50, Class22.aClass22Array1[super.anInt674].anIntArray67);
			} else if (local50 != -1) {
				local382.method439(local50);
			}
			local382.method435();
			local382.anIntArrayArray16 = null;
			local382.anIntArrayArray15 = null;
			return local382;
		} catch (@Pc(430) RuntimeException local430) {
			signlink.reporterror("26667, " + -291 + ", " + local430.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KZCOXKKW", name = "a", descriptor = "(ZLclient!BSNPYLEV;)V")
	public void method303(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		try {
			arg0.anInt81 = 0;
			this.anInt354 = arg0.method94();
			this.anInt350 = arg0.method95();
			this.anInt348 = arg0.method95();
			this.aClass48_1 = null;
			this.anInt351 = 0;
			@Pc(29) int local29;
			@Pc(41) int local41;
			@Pc(88) int local88;
			for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
				local29 = arg0.method94();
				if (local29 == 0) {
					this.anIntArray75[local24] = 0;
				} else {
					local41 = arg0.method94();
					this.anIntArray75[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray75[0] == 65535) {
						this.aClass48_1 = Class48.method568(arg0.method96());
						break;
					}
					if (this.anIntArray75[local24] >= 512 && this.anIntArray75[local24] - 512 < Class32.anInt522) {
						local88 = Class32.method412(this.anIntArray75[local24] - 512).anInt526;
						if (local88 != 0) {
							this.anInt351 = local88;
						}
					}
				}
			}
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg0.method94();
				if (local41 < 0 || local41 >= client.anIntArrayArray23[local29].length) {
					local41 = 0;
				}
				this.anIntArray76[local29] = local41;
			}
			super.anInt672 = arg0.method96();
			if (super.anInt672 == 65535) {
				super.anInt672 = -1;
			}
			super.anInt673 = arg0.method96();
			if (super.anInt673 == 65535) {
				super.anInt673 = -1;
			}
			super.anInt660 = arg0.method96();
			if (super.anInt660 == 65535) {
				super.anInt660 = -1;
			}
			super.anInt661 = arg0.method96();
			if (super.anInt661 == 65535) {
				super.anInt661 = -1;
			}
			super.anInt662 = arg0.method96();
			if (super.anInt662 == 65535) {
				super.anInt662 = -1;
			}
			super.anInt663 = arg0.method96();
			if (super.anInt663 == 65535) {
				super.anInt663 = -1;
			}
			super.anInt697 = arg0.method96();
			if (super.anInt697 == 65535) {
				super.anInt697 = -1;
			}
			this.aString5 = Class34.method482(Class34.method479(arg0.method100()));
			this.anInt355 = arg0.method94();
			this.anInt361 = arg0.method96();
			this.aBoolean115 = true;
			this.aLong15 = 0L;
			local41 = this.anIntArray75[5];
			local88 = this.anIntArray75[9];
			this.anIntArray75[5] = local88;
			this.anIntArray75[9] = local41;
			for (@Pc(255) int local255 = 0; local255 < 12; local255++) {
				this.aLong15 <<= 0x4;
				if (this.anIntArray75[local255] >= 256) {
					this.aLong15 += this.anIntArray75[local255] - 256;
				}
			}
			if (this.anIntArray75[0] >= 256) {
				this.aLong15 += this.anIntArray75[0] - 256 >> 4;
			}
			if (this.anIntArray75[1] >= 256) {
				this.aLong15 += this.anIntArray75[1] - 256 >> 8;
			}
			this.anIntArray75[5] = local41;
			this.anIntArray75[9] = local88;
			for (@Pc(337) int local337 = 0; local337 < 5; local337++) {
				this.aLong15 <<= 0x3;
				this.aLong15 += this.anIntArray76[local337];
			}
			this.aLong15 <<= 0x1;
			this.aLong15 += this.anInt354;
		} catch (@Pc(375) RuntimeException local375) {
			signlink.reporterror("52757, " + false + ", " + arg0 + ", " + local375.toString());
			throw new RuntimeException();
		}
	}
}
