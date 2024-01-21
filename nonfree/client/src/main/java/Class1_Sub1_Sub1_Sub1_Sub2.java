import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FHQGDDHF")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!FHQGDDHF", name = "Pb", descriptor = "Lclient!LSQNLJTA;")
	public static Class29 aClass29_2 = new Class29(260, (byte) 17);

	@OriginalMember(owner = "client!FHQGDDHF", name = "rb", descriptor = "I")
	public int anInt342;

	@OriginalMember(owner = "client!FHQGDDHF", name = "sb", descriptor = "I")
	private int anInt343;

	@OriginalMember(owner = "client!FHQGDDHF", name = "tb", descriptor = "I")
	public int anInt344;

	@OriginalMember(owner = "client!FHQGDDHF", name = "ub", descriptor = "I")
	public int anInt345;

	@OriginalMember(owner = "client!FHQGDDHF", name = "vb", descriptor = "I")
	public int anInt346;

	@OriginalMember(owner = "client!FHQGDDHF", name = "wb", descriptor = "I")
	public int anInt347;

	@OriginalMember(owner = "client!FHQGDDHF", name = "xb", descriptor = "Lclient!LFTMDGKK;")
	public Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!FHQGDDHF", name = "yb", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!FHQGDDHF", name = "Cb", descriptor = "I")
	public int anInt348;

	@OriginalMember(owner = "client!FHQGDDHF", name = "Db", descriptor = "I")
	public int anInt349;

	@OriginalMember(owner = "client!FHQGDDHF", name = "Eb", descriptor = "I")
	public int anInt350;

	@OriginalMember(owner = "client!FHQGDDHF", name = "Fb", descriptor = "I")
	public int anInt351;

	@OriginalMember(owner = "client!FHQGDDHF", name = "Gb", descriptor = "I")
	public int anInt352;

	@OriginalMember(owner = "client!FHQGDDHF", name = "Hb", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!FHQGDDHF", name = "Ib", descriptor = "I")
	public int anInt353;

	@OriginalMember(owner = "client!FHQGDDHF", name = "Kb", descriptor = "I")
	public int anInt354;

	@OriginalMember(owner = "client!FHQGDDHF", name = "Lb", descriptor = "I")
	public int anInt355;

	@OriginalMember(owner = "client!FHQGDDHF", name = "Nb", descriptor = "Lclient!OMIIKHIV;")
	public Class31 aClass31_2;

	@OriginalMember(owner = "client!FHQGDDHF", name = "Ob", descriptor = "I")
	public int anInt356;

	@OriginalMember(owner = "client!FHQGDDHF", name = "zb", descriptor = "Z")
	public boolean aBoolean90 = false;

	@OriginalMember(owner = "client!FHQGDDHF", name = "Ab", descriptor = "Z")
	private boolean aBoolean91 = false;

	@OriginalMember(owner = "client!FHQGDDHF", name = "Bb", descriptor = "J")
	private long aLong15 = -1L;

	@OriginalMember(owner = "client!FHQGDDHF", name = "Jb", descriptor = "[I")
	public int[] anIntArray53 = new int[5];

	@OriginalMember(owner = "client!FHQGDDHF", name = "Mb", descriptor = "[I")
	public int[] anIntArray54 = new int[12];

	@OriginalMember(owner = "client!FHQGDDHF", name = "Qb", descriptor = "Z")
	public boolean aBoolean92 = false;

	@OriginalMember(owner = "client!FHQGDDHF", name = "c", descriptor = "(Z)Lclient!LFTMDGKK;")
	public Class1_Sub1_Sub1_Sub4 method249() {
		try {
			if (!this.aBoolean92) {
				return null;
			} else if (this.aClass31_2 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray54[local18];
					if (local25 >= 256 && local25 < 512 && !Class35.aClass35Array1[local25 - 256].method423()) {
						local16 = true;
					}
					if (local25 >= 512 && !Class23.method286(local25 - 512).method284(this.anInt343)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(66) Class1_Sub1_Sub1_Sub4[] local66 = new Class1_Sub1_Sub1_Sub4[12];
				@Pc(74) int local74 = 0;
				for (@Pc(76) int local76 = 0; local76 < 12; local76++) {
					@Pc(83) int local83 = this.anIntArray54[local76];
					@Pc(97) Class1_Sub1_Sub1_Sub4 local97;
					if (local83 >= 256 && local83 < 512) {
						local97 = Class35.aClass35Array1[local83 - 256].method424();
						if (local97 != null) {
							local66[local74++] = local97;
						}
					}
					if (local83 >= 512) {
						local97 = Class23.method286(local83 - 512).method282(this.anInt343);
						if (local97 != null) {
							local66[local74++] = local97;
						}
					}
				}
				@Pc(134) Class1_Sub1_Sub1_Sub4 local134 = new Class1_Sub1_Sub1_Sub4(local74, 698, local66);
				for (@Pc(136) int local136 = 0; local136 < 5; local136++) {
					if (this.anIntArray53[local136] != 0) {
						local134.method316(client.anIntArrayArray23[local136][0], client.anIntArrayArray23[local136][this.anIntArray53[local136]]);
						if (local136 == 1) {
							local134.method316(client.anIntArray237[0], client.anIntArray237[this.anIntArray53[local136]]);
						}
					}
				}
				return local134;
			} else {
				return this.aClass31_2.method405();
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("39606, " + true + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FHQGDDHF", name = "d", descriptor = "(Z)Lclient!LFTMDGKK;")
	private Class1_Sub1_Sub1_Sub4 method250() {
		try {
			if (this.aClass31_2 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt332 >= 0 && super.anInt335 == 0) {
					local6 = Class21.aClass21Array1[super.anInt332].anIntArray68[super.anInt333];
				} else if (super.anInt339 >= 0) {
					local6 = Class21.aClass21Array1[super.anInt339].anIntArray68[super.anInt340];
				}
				return this.aClass31_2.method401(null, -1, local6);
			}
			@Pc(48) long local48 = this.aLong16;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (super.anInt332 >= 0 && super.anInt335 == 0) {
				@Pc(67) Class21 local67 = Class21.aClass21Array1[super.anInt332];
				local50 = local67.anIntArray68[super.anInt333];
				if (super.anInt339 >= 0 && super.anInt339 != super.anInt327) {
					local52 = Class21.aClass21Array1[super.anInt339].anIntArray68[super.anInt340];
				}
				if (local67.anInt393 >= 0) {
					local54 = local67.anInt393;
					local48 += local54 - this.anIntArray54[5] << 8;
				}
				if (local67.anInt394 >= 0) {
					local56 = local67.anInt394;
					local48 += local56 - this.anIntArray54[3] << 16;
				}
			} else if (super.anInt339 >= 0) {
				local50 = Class21.aClass21Array1[super.anInt339].anIntArray68[super.anInt340];
			}
			@Pc(145) Class1_Sub1_Sub1_Sub4 local145 = (Class1_Sub1_Sub1_Sub4) aClass29_2.method334(local48);
			@Pc(151) int local151;
			@Pc(158) int local158;
			if (local145 == null) {
				@Pc(149) boolean local149 = false;
				for (local151 = 0; local151 < 12; local151++) {
					local158 = this.anIntArray54[local151];
					if (local56 >= 0 && local151 == 3) {
						local158 = local56;
					}
					if (local54 >= 0 && local151 == 5) {
						local158 = local54;
					}
					if (local158 >= 256 && local158 < 512 && !Class35.aClass35Array1[local158 - 256].method421(506)) {
						local149 = true;
					}
					if (local158 >= 512 && !Class23.method286(local158 - 512).method292(this.anInt343)) {
						local149 = true;
					}
				}
				if (local149) {
					if (this.aLong15 != -1L) {
						local145 = (Class1_Sub1_Sub1_Sub4) aClass29_2.method334(this.aLong15);
					}
					if (local145 == null) {
						return null;
					}
				}
			}
			if (local145 == null) {
				@Pc(228) Class1_Sub1_Sub1_Sub4[] local228 = new Class1_Sub1_Sub1_Sub4[12];
				local151 = 0;
				@Pc(239) int local239;
				for (local158 = 0; local158 < 12; local158++) {
					local239 = this.anIntArray54[local158];
					if (local56 >= 0 && local158 == 3) {
						local239 = local56;
					}
					if (local54 >= 0 && local158 == 5) {
						local239 = local54;
					}
					@Pc(267) Class1_Sub1_Sub1_Sub4 local267;
					if (local239 >= 256 && local239 < 512) {
						local267 = Class35.aClass35Array1[local239 - 256].method422();
						if (local267 != null) {
							local228[local151++] = local267;
						}
					}
					if (local239 >= 512) {
						local267 = Class23.method286(local239 - 512).method288(this.anInt343);
						if (local267 != null) {
							local228[local151++] = local267;
						}
					}
				}
				local145 = new Class1_Sub1_Sub1_Sub4(local151, 698, local228);
				for (local239 = 0; local239 < 5; local239++) {
					if (this.anIntArray53[local239] != 0) {
						local145.method316(client.anIntArrayArray23[local239][0], client.anIntArrayArray23[local239][this.anIntArray53[local239]]);
						if (local239 == 1) {
							local145.method316(client.anIntArray237[0], client.anIntArray237[this.anIntArray53[local239]]);
						}
					}
				}
				local145.method309();
				local145.method319(64, 850, -30, -50, -30, true);
				aClass29_2.method335(local145, local48);
				this.aLong15 = local48;
			}
			if (this.aBoolean90) {
				return local145;
			}
			@Pc(372) Class1_Sub1_Sub1_Sub4 local372 = Class1_Sub1_Sub1_Sub4.aClass1_Sub1_Sub1_Sub4_2;
			local372.method304(local145, Class6.method44(local50) & Class6.method44(local52));
			if (local50 != -1 && local52 != -1) {
				local372.method311(Class21.aClass21Array1[super.anInt332].anIntArray71, local52, local50);
			} else if (local50 != -1) {
				local372.method310(local50);
			}
			local372.method306();
			local372.anIntArrayArray9 = null;
			local372.anIntArrayArray8 = null;
			return local372;
		} catch (@Pc(426) RuntimeException local426) {
			signlink.reporterror("92826, " + true + ", " + local426.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FHQGDDHF", name = "a", descriptor = "(Lclient!CFARFRSG;I)V")
	public void method251(@OriginalArg(0) Class1_Sub1_Sub2 arg0) {
		try {
			arg0.anInt153 = 0;
			this.anInt343 = arg0.method59();
			this.anInt353 = arg0.method59();
			this.aClass31_2 = null;
			this.anInt356 = 0;
			@Pc(25) int local25;
			@Pc(37) int local37;
			@Pc(84) int local84;
			for (@Pc(20) int local20 = 0; local20 < 12; local20++) {
				local25 = arg0.method59();
				if (local25 == 0) {
					this.anIntArray54[local20] = 0;
				} else {
					local37 = arg0.method59();
					this.anIntArray54[local20] = (local25 << 8) + local37;
					if (local20 == 0 && this.anIntArray54[0] == 65535) {
						this.aClass31_2 = Class31.method400(arg0.method61());
						break;
					}
					if (this.anIntArray54[local20] >= 512 && this.anIntArray54[local20] - 512 < Class23.anInt440) {
						local84 = Class23.method286(this.anIntArray54[local20] - 512).anInt438;
						if (local84 != 0) {
							this.anInt356 = local84;
						}
					}
				}
			}
			for (local25 = 0; local25 < 5; local25++) {
				local37 = arg0.method59();
				if (local37 < 0 || local37 >= client.anIntArrayArray23[local25].length) {
					local37 = 0;
				}
				this.anIntArray53[local25] = local37;
			}
			super.anInt327 = arg0.method61();
			if (super.anInt327 == 65535) {
				super.anInt327 = -1;
			}
			super.anInt328 = arg0.method61();
			if (super.anInt328 == 65535) {
				super.anInt328 = -1;
			}
			super.anInt305 = arg0.method61();
			if (super.anInt305 == 65535) {
				super.anInt305 = -1;
			}
			super.anInt306 = arg0.method61();
			if (super.anInt306 == 65535) {
				super.anInt306 = -1;
			}
			super.anInt307 = arg0.method61();
			if (super.anInt307 == 65535) {
				super.anInt307 = -1;
			}
			super.anInt308 = arg0.method61();
			if (super.anInt308 == 65535) {
				super.anInt308 = -1;
			}
			super.anInt309 = arg0.method61();
			if (super.anInt309 == 65535) {
				super.anInt309 = -1;
			}
			this.aString5 = Class49.method567(Class49.method564(arg0.method65()));
			this.anInt342 = arg0.method59();
			this.anInt344 = arg0.method61();
			this.aBoolean92 = true;
			this.aLong16 = 0L;
			for (local37 = 0; local37 < 12; local37++) {
				this.aLong16 <<= 0x4;
				if (this.anIntArray54[local37] >= 256) {
					this.aLong16 += this.anIntArray54[local37] - 256;
				}
			}
			if (this.anIntArray54[0] >= 256) {
				this.aLong16 += this.anIntArray54[0] - 256 >> 4;
			}
			if (this.anIntArray54[1] >= 256) {
				this.aLong16 += this.anIntArray54[1] - 256 >> 8;
			}
			for (local84 = 0; local84 < 5; local84++) {
				this.aLong16 <<= 0x3;
				this.aLong16 += this.anIntArray53[local84];
			}
			this.aLong16 <<= 0x1;
			this.aLong16 += this.anInt343;
		} catch (@Pc(334) RuntimeException local334) {
			signlink.reporterror("63217, " + arg0 + ", " + -54 + ", " + local334.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FHQGDDHF", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method247() {
		try {
			return this.aBoolean92;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("90724, " + false + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FHQGDDHF", name = "a", descriptor = "(I)Lclient!LFTMDGKK;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method448() {
		try {
			if (!this.aBoolean92) {
				return null;
			}
			@Pc(16) Class1_Sub1_Sub1_Sub4 local16 = this.method250();
			if (local16 == null) {
				return null;
			}
			super.anInt325 = local16.anInt670;
			local16.aBoolean111 = true;
			if (this.aBoolean90) {
				return local16;
			}
			if (super.anInt296 != -1 && super.anInt297 != -1) {
				@Pc(45) Class4 local45 = Class4.aClass4Array1[super.anInt296];
				@Pc(48) Class1_Sub1_Sub1_Sub4 local48 = local45.method34();
				if (local48 != null) {
					@Pc(62) Class1_Sub1_Sub1_Sub4 local62 = new Class1_Sub1_Sub1_Sub4(Class6.method44(super.anInt297), true, local48, false, false);
					local62.method315(-super.anInt300, 0, 0);
					local62.method309();
					local62.method310(local45.aClass21_1.anIntArray68[super.anInt297]);
					local62.anIntArrayArray9 = null;
					local62.anIntArrayArray8 = null;
					if (local45.anInt118 != 128 || local45.anInt119 != 128) {
						local62.method318(local45.anInt119, local45.anInt118, local45.anInt118);
					}
					local62.method319(local45.anInt121 + 64, local45.anInt122 + 850, -30, -50, -30, true);
					@Pc(130) Class1_Sub1_Sub1_Sub4[] local130 = new Class1_Sub1_Sub1_Sub4[] { local16, local62 };
					local16 = new Class1_Sub1_Sub1_Sub4(true, local130, false, 2);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub4_1 != null) {
				if (client.anInt903 >= this.anInt355) {
					this.aClass1_Sub1_Sub1_Sub4_1 = null;
				}
				if (client.anInt903 >= this.anInt354 && client.anInt903 < this.anInt355) {
					@Pc(159) Class1_Sub1_Sub1_Sub4 local159 = this.aClass1_Sub1_Sub1_Sub4_1;
					local159.method315(this.anInt346 - this.anInt352, this.anInt345 - super.anInt319, this.anInt347 - super.anInt320);
					if (super.anInt324 == 512) {
						local159.method313();
						local159.method313();
						local159.method313();
					} else if (super.anInt324 == 1024) {
						local159.method313();
						local159.method313();
					} else if (super.anInt324 == 1536) {
						local159.method313();
					}
					@Pc(222) Class1_Sub1_Sub1_Sub4[] local222 = new Class1_Sub1_Sub1_Sub4[] { local16, local159 };
					local16 = new Class1_Sub1_Sub1_Sub4(true, local222, false, 2);
					if (super.anInt324 == 512) {
						local159.method313();
					} else if (super.anInt324 == 1024) {
						local159.method313();
						local159.method313();
					} else if (super.anInt324 == 1536) {
						local159.method313();
						local159.method313();
						local159.method313();
					}
					local159.method315(this.anInt352 - this.anInt346, super.anInt319 - this.anInt345, super.anInt320 - this.anInt347);
				}
			}
			local16.aBoolean111 = true;
			return local16;
		} catch (@Pc(288) RuntimeException local288) {
			signlink.reporterror("24948, " + 0 + ", " + local288.toString());
			throw new RuntimeException();
		}
	}
}
