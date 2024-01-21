import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FVFJZZXQ")
public final class Class1_Sub1_Sub2_Sub2_Sub1 extends Class1_Sub1_Sub2_Sub2 {

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Rb", descriptor = "Lclient!OOTLZHQB;")
	public static Class30 aClass30_1 = new Class30(260, 9);

	@OriginalMember(owner = "client!FVFJZZXQ", name = "rb", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "tb", descriptor = "I")
	public int anInt248;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "vb", descriptor = "I")
	public int anInt249;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "yb", descriptor = "Lclient!RBTWCHLG;")
	public Class39 aClass39_1;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "zb", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Bb", descriptor = "I")
	public int anInt250;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Cb", descriptor = "I")
	public int anInt251;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Db", descriptor = "I")
	public int anInt252;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Eb", descriptor = "I")
	public int anInt253;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Fb", descriptor = "Lclient!RTQSBWRH;")
	public Class1_Sub1_Sub2_Sub6 aClass1_Sub1_Sub2_Sub6_1;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Hb", descriptor = "I")
	public int anInt254;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Kb", descriptor = "I")
	public int anInt257;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Lb", descriptor = "I")
	public int anInt258;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Nb", descriptor = "I")
	public int anInt260;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Ob", descriptor = "I")
	public int anInt261;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Pb", descriptor = "I")
	public int anInt262;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Qb", descriptor = "I")
	public int anInt263;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Sb", descriptor = "I")
	private int anInt264;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Wb", descriptor = "I")
	private int anInt265;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Xb", descriptor = "I")
	public int anInt266;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "sb", descriptor = "J")
	private long aLong13 = -1L;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "ub", descriptor = "Z")
	public boolean aBoolean55 = false;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "wb", descriptor = "[I")
	public int[] anIntArray44 = new int[12];

	@OriginalMember(owner = "client!FVFJZZXQ", name = "xb", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Ab", descriptor = "B")
	private byte aByte13 = 1;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Gb", descriptor = "B")
	private byte aByte14 = 18;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Ib", descriptor = "I")
	private int anInt255 = 4;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Jb", descriptor = "I")
	private int anInt256 = 693;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Mb", descriptor = "I")
	private int anInt259 = -374;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Tb", descriptor = "Z")
	private boolean aBoolean57 = true;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Ub", descriptor = "Z")
	public boolean aBoolean58 = false;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Vb", descriptor = "[I")
	public int[] anIntArray45 = new int[5];

	@OriginalMember(owner = "client!FVFJZZXQ", name = "Yb", descriptor = "I")
	private int anInt267 = 21057;

	@OriginalMember(owner = "client!FVFJZZXQ", name = "a", descriptor = "(Lclient!JHKSAGUC;I)V")
	public void method166(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt352 = 0;
			this.anInt265 = arg0.method238();
			this.anInt249 = arg0.method238();
			this.aClass39_1 = null;
			this.anInt254 = 0;
			@Pc(34) int local34;
			@Pc(46) int local46;
			@Pc(93) int local93;
			for (@Pc(29) int local29 = 0; local29 < 12; local29++) {
				local34 = arg0.method238();
				if (local34 == 0) {
					this.anIntArray44[local29] = 0;
				} else {
					local46 = arg0.method238();
					this.anIntArray44[local29] = (local34 << 8) + local46;
					if (local29 == 0 && this.anIntArray44[0] == 65535) {
						this.aClass39_1 = Class39.method406(arg0.method240());
						break;
					}
					if (this.anIntArray44[local29] >= 512 && this.anIntArray44[local29] - 512 < Class27.anInt437) {
						local93 = Class27.method308(this.anIntArray44[local29] - 512).anInt444;
						if (local93 != 0) {
							this.anInt254 = local93;
						}
					}
				}
			}
			for (local34 = 0; local34 < 5; local34++) {
				local46 = arg0.method238();
				if (local46 < 0 || local46 >= client.anIntArrayArray22[local34].length) {
					local46 = 0;
				}
				this.anIntArray45[local34] = local46;
			}
			super.anInt485 = arg0.method240();
			if (super.anInt485 == 65535) {
				super.anInt485 = -1;
			}
			super.anInt486 = arg0.method240();
			if (super.anInt486 == 65535) {
				super.anInt486 = -1;
			}
			super.anInt515 = arg0.method240();
			if (super.anInt515 == 65535) {
				super.anInt515 = -1;
			}
			super.anInt516 = arg0.method240();
			if (super.anInt516 == 65535) {
				super.anInt516 = -1;
			}
			super.anInt517 = arg0.method240();
			if (super.anInt517 == 65535) {
				super.anInt517 = -1;
			}
			super.anInt518 = arg0.method240();
			if (super.anInt518 == 65535) {
				super.anInt518 = -1;
			}
			super.anInt506 = arg0.method240();
			if (super.anInt506 == 65535) {
				super.anInt506 = -1;
			}
			this.aString5 = Class49.method542(Class49.method539(arg0.method244()));
			this.anInt266 = arg0.method238();
			this.anInt248 = arg0.method240();
			this.aBoolean55 = true;
			this.aLong14 = 0L;
			for (local46 = 0; local46 < 12; local46++) {
				this.aLong14 <<= 0x4;
				if (this.anIntArray44[local46] >= 256) {
					this.aLong14 += this.anIntArray44[local46] - 256;
				}
			}
			if (this.anIntArray44[0] >= 256) {
				this.aLong14 += this.anIntArray44[0] - 256 >> 4;
			}
			if (this.anIntArray44[1] >= 256) {
				this.aLong14 += this.anIntArray44[1] - 256 >> 8;
			}
			for (local93 = 0; local93 < 5; local93++) {
				this.aLong14 <<= 0x3;
				this.aLong14 += this.anIntArray45[local93];
			}
			this.aLong14 <<= 0x1;
			this.aLong14 += this.anInt265;
		} catch (@Pc(340) RuntimeException local340) {
			signlink.reporterror("69236, " + arg0 + ", " + 809 + ", " + local340.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FVFJZZXQ", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method323() {
		try {
			return this.aBoolean55;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("23430, " + true + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FVFJZZXQ", name = "a", descriptor = "(I)Lclient!RTQSBWRH;")
	@Override
	protected Class1_Sub1_Sub2_Sub6 method410() {
		try {
			if (!this.aBoolean55) {
				return null;
			}
			@Pc(22) Class1_Sub1_Sub2_Sub6 local22 = this.method168();
			if (local22 == null) {
				return null;
			}
			super.anInt503 = local22.anInt603;
			local22.aBoolean130 = true;
			if (this.aBoolean58) {
				return local22;
			}
			if (super.anInt470 != -1 && super.anInt471 != -1) {
				@Pc(51) Class44 local51 = Class44.aClass44Array1[super.anInt470];
				@Pc(54) Class1_Sub1_Sub2_Sub6 local54 = local51.method463();
				if (local54 != null) {
					@Pc(68) Class1_Sub1_Sub2_Sub6 local68 = new Class1_Sub1_Sub2_Sub6(true, -28456, Class13.method147(super.anInt471), local54, false);
					local68.method428(-super.anInt474, 0, 0);
					local68.method422(this.anInt259);
					local68.method423(local51.aClass23_2.anIntArray76[super.anInt471], this.aByte13);
					local68.anIntArrayArray11 = null;
					local68.anIntArrayArray10 = null;
					if (local51.anInt726 != 128 || local51.anInt727 != 128) {
						local68.method431(local51.anInt727, local51.anInt726, local51.anInt726);
					}
					local68.method432(local51.anInt729 + 64, local51.anInt730 + 850, -30, -50, -30, true);
					@Pc(138) Class1_Sub1_Sub2_Sub6[] local138 = new Class1_Sub1_Sub2_Sub6[] { local22, local68 };
					local22 = new Class1_Sub1_Sub2_Sub6((byte) 1, local138, true, 2);
				}
			}
			if (this.aClass1_Sub1_Sub2_Sub6_1 != null) {
				if (client.anInt907 >= this.anInt258) {
					this.aClass1_Sub1_Sub2_Sub6_1 = null;
				}
				if (client.anInt907 >= this.anInt257 && client.anInt907 < this.anInt258) {
					@Pc(167) Class1_Sub1_Sub2_Sub6 local167 = this.aClass1_Sub1_Sub2_Sub6_1;
					local167.method428(this.anInt252 - this.anInt250, this.anInt251 - super.anInt497, this.anInt253 - super.anInt498);
					if (super.anInt475 == 512) {
						local167.method426((byte) 8);
						local167.method426((byte) 8);
						local167.method426((byte) 8);
					} else if (super.anInt475 == 1024) {
						local167.method426((byte) 8);
						local167.method426((byte) 8);
					} else if (super.anInt475 == 1536) {
						local167.method426((byte) 8);
					}
					@Pc(230) Class1_Sub1_Sub2_Sub6[] local230 = new Class1_Sub1_Sub2_Sub6[] { local22, local167 };
					local22 = new Class1_Sub1_Sub2_Sub6((byte) 1, local230, true, 2);
					if (super.anInt475 == 512) {
						local167.method426((byte) 8);
					} else if (super.anInt475 == 1024) {
						local167.method426((byte) 8);
						local167.method426((byte) 8);
					} else if (super.anInt475 == 1536) {
						local167.method426((byte) 8);
						local167.method426((byte) 8);
						local167.method426((byte) 8);
					}
					local167.method428(this.anInt250 - this.anInt252, super.anInt497 - this.anInt251, super.anInt498 - this.anInt253);
				}
			}
			local22.aBoolean130 = true;
			return local22;
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("77891, " + -704 + ", " + local296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FVFJZZXQ", name = "c", descriptor = "(I)Lclient!RTQSBWRH;")
	public Class1_Sub1_Sub2_Sub6 method167(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			if (!this.aBoolean55) {
				return null;
			} else if (this.aClass39_1 == null) {
				@Pc(20) boolean local20 = false;
				for (@Pc(22) int local22 = 0; local22 < 12; local22++) {
					@Pc(29) int local29 = this.anIntArray44[local22];
					if (local29 >= 256 && local29 < 512 && !Class8.aClass8Array1[local29 - 256].method135()) {
						local20 = true;
					}
					if (local29 >= 512 && !Class27.method308(local29 - 512).method306(this.anInt265, this.anInt255)) {
						local20 = true;
					}
				}
				if (local20) {
					return null;
				}
				@Pc(71) Class1_Sub1_Sub2_Sub6[] local71 = new Class1_Sub1_Sub2_Sub6[12];
				@Pc(73) int local73 = 0;
				for (@Pc(75) int local75 = 0; local75 < 12; local75++) {
					@Pc(82) int local82 = this.anIntArray44[local75];
					@Pc(96) Class1_Sub1_Sub2_Sub6 local96;
					if (local82 >= 256 && local82 < 512) {
						local96 = Class8.aClass8Array1[local82 - 256].method136();
						if (local96 != null) {
							local71[local73++] = local96;
						}
					}
					if (local82 >= 512) {
						local96 = Class27.method308(local82 - 512).method311(this.anInt265);
						if (local96 != null) {
							local71[local73++] = local96;
						}
					}
				}
				@Pc(134) Class1_Sub1_Sub2_Sub6 local134 = new Class1_Sub1_Sub2_Sub6(local73, local71, this.anInt264);
				for (@Pc(136) int local136 = 0; local136 < 5; local136++) {
					if (this.anIntArray45[local136] != 0) {
						local134.method429(client.anIntArrayArray22[local136][0], client.anIntArrayArray22[local136][this.anIntArray45[local136]]);
						if (local136 == 1) {
							local134.method429(client.anIntArray254[0], client.anIntArray254[this.anIntArray45[local136]]);
						}
					}
				}
				return local134;
			} else {
				return this.aClass39_1.method404();
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("55083, " + arg0 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FVFJZZXQ", name = "d", descriptor = "(I)Lclient!RTQSBWRH;")
	private Class1_Sub1_Sub2_Sub6 method168() {
		try {
			if (this.aClass39_1 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt510 >= 0 && super.anInt513 == 0) {
					local6 = Class23.aClass23Array1[super.anInt510].anIntArray76[super.anInt511];
				} else if (super.anInt490 >= 0) {
					local6 = Class23.aClass23Array1[super.anInt490].anIntArray76[super.anInt491];
				}
				return this.aClass39_1.method400(null, -1, local6);
			}
			@Pc(48) long local48 = this.aLong14;
			@Pc(56) int local56 = -1;
			@Pc(58) int local58 = -1;
			@Pc(60) int local60 = -1;
			@Pc(62) int local62 = -1;
			if (super.anInt510 >= 0 && super.anInt513 == 0) {
				@Pc(73) Class23 local73 = Class23.aClass23Array1[super.anInt510];
				local56 = local73.anIntArray76[super.anInt511];
				if (super.anInt490 >= 0 && super.anInt490 != super.anInt485) {
					local58 = Class23.aClass23Array1[super.anInt490].anIntArray76[super.anInt491];
				}
				if (local73.anInt390 >= 0) {
					local60 = local73.anInt390;
					local48 += local60 - this.anIntArray44[5] << 8;
				}
				if (local73.anInt391 >= 0) {
					local62 = local73.anInt391;
					local48 += local62 - this.anIntArray44[3] << 16;
				}
			} else if (super.anInt490 >= 0) {
				local56 = Class23.aClass23Array1[super.anInt490].anIntArray76[super.anInt491];
			}
			@Pc(151) Class1_Sub1_Sub2_Sub6 local151 = (Class1_Sub1_Sub2_Sub6) aClass30_1.method329(local48);
			@Pc(157) int local157;
			@Pc(164) int local164;
			if (local151 == null) {
				@Pc(155) boolean local155 = false;
				for (local157 = 0; local157 < 12; local157++) {
					local164 = this.anIntArray44[local157];
					if (local62 >= 0 && local157 == 3) {
						local164 = local62;
					}
					if (local60 >= 0 && local157 == 5) {
						local164 = local60;
					}
					if (local164 >= 256 && local164 < 512 && !Class8.aClass8Array1[local164 - 256].method133()) {
						local155 = true;
					}
					if (local164 >= 512 && !Class27.method308(local164 - 512).method312(this.anInt265)) {
						local155 = true;
					}
				}
				if (local155) {
					if (this.aLong13 != -1L) {
						local151 = (Class1_Sub1_Sub2_Sub6) aClass30_1.method329(this.aLong13);
					}
					if (local151 == null) {
						return null;
					}
				}
			}
			if (local151 == null) {
				@Pc(234) Class1_Sub1_Sub2_Sub6[] local234 = new Class1_Sub1_Sub2_Sub6[12];
				local157 = 0;
				@Pc(245) int local245;
				for (local164 = 0; local164 < 12; local164++) {
					local245 = this.anIntArray44[local164];
					if (local62 >= 0 && local164 == 3) {
						local245 = local62;
					}
					if (local60 >= 0 && local164 == 5) {
						local245 = local60;
					}
					@Pc(273) Class1_Sub1_Sub2_Sub6 local273;
					if (local245 >= 256 && local245 < 512) {
						local273 = Class8.aClass8Array1[local245 - 256].method134();
						if (local273 != null) {
							local234[local157++] = local273;
						}
					}
					if (local245 >= 512) {
						local273 = Class27.method308(local245 - 512).method304(this.anInt265);
						if (local273 != null) {
							local234[local157++] = local273;
						}
					}
				}
				local151 = new Class1_Sub1_Sub2_Sub6(local157, local234, this.anInt264);
				for (local245 = 0; local245 < 5; local245++) {
					if (this.anIntArray45[local245] != 0) {
						local151.method429(client.anIntArrayArray22[local245][0], client.anIntArrayArray22[local245][this.anIntArray45[local245]]);
						if (local245 == 1) {
							local151.method429(client.anIntArray254[0], client.anIntArray254[this.anIntArray45[local245]]);
						}
					}
				}
				local151.method422(this.anInt259);
				local151.method432(64, 850, -30, -50, -30, true);
				aClass30_1.method330(local48, local151, (byte) 8);
				this.aLong13 = local48;
			}
			if (this.aBoolean58) {
				return local151;
			}
			@Pc(380) Class1_Sub1_Sub2_Sub6 local380 = Class1_Sub1_Sub2_Sub6.aClass1_Sub1_Sub2_Sub6_2;
			local380.method417(Class13.method147(local56) & Class13.method147(local58), this.anInt256, local151);
			if (local56 != -1 && local58 != -1) {
				local380.method424(Class23.aClass23Array1[super.anInt510].anIntArray79, local58, this.aByte14, local56);
			} else if (local56 != -1) {
				local380.method423(local56, this.aByte13);
			}
			local380.method419();
			local380.anIntArrayArray11 = null;
			local380.anIntArrayArray10 = null;
			return local380;
		} catch (@Pc(431) RuntimeException local431) {
			signlink.reporterror("75309, " + -4952 + ", " + local431.toString());
			throw new RuntimeException();
		}
	}
}
