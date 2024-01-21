import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CHKMTWJC")
public final class Class3_Sub1_Sub1_Sub2_Sub1 extends Class3_Sub1_Sub1_Sub2 {

	@OriginalMember(owner = "client!CHKMTWJC", name = "sb", descriptor = "Lclient!UECXVCCS;")
	public static Class36 aClass36_1 = new Class36(260, (byte) -2);

	@OriginalMember(owner = "client!CHKMTWJC", name = "ub", descriptor = "I")
	public int anInt140;

	@OriginalMember(owner = "client!CHKMTWJC", name = "zb", descriptor = "I")
	public int anInt142;

	@OriginalMember(owner = "client!CHKMTWJC", name = "Db", descriptor = "Lclient!VWKJSKWX;")
	public Class40 aClass40_1;

	@OriginalMember(owner = "client!CHKMTWJC", name = "Eb", descriptor = "I")
	public int anInt143;

	@OriginalMember(owner = "client!CHKMTWJC", name = "Fb", descriptor = "I")
	public int anInt144;

	@OriginalMember(owner = "client!CHKMTWJC", name = "Gb", descriptor = "I")
	public int anInt145;

	@OriginalMember(owner = "client!CHKMTWJC", name = "Hb", descriptor = "I")
	public int anInt146;

	@OriginalMember(owner = "client!CHKMTWJC", name = "Ib", descriptor = "I")
	public int anInt147;

	@OriginalMember(owner = "client!CHKMTWJC", name = "Lb", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!CHKMTWJC", name = "Mb", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!CHKMTWJC", name = "Nb", descriptor = "I")
	public int anInt148;

	@OriginalMember(owner = "client!CHKMTWJC", name = "Ob", descriptor = "I")
	private int anInt149;

	@OriginalMember(owner = "client!CHKMTWJC", name = "Pb", descriptor = "I")
	public int anInt150;

	@OriginalMember(owner = "client!CHKMTWJC", name = "Qb", descriptor = "I")
	public int anInt151;

	@OriginalMember(owner = "client!CHKMTWJC", name = "Rb", descriptor = "I")
	public int anInt152;

	@OriginalMember(owner = "client!CHKMTWJC", name = "Sb", descriptor = "I")
	public int anInt153;

	@OriginalMember(owner = "client!CHKMTWJC", name = "Tb", descriptor = "I")
	public int anInt154;

	@OriginalMember(owner = "client!CHKMTWJC", name = "Ub", descriptor = "Lclient!CADBNSXE;")
	public Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!CHKMTWJC", name = "rb", descriptor = "Z")
	private boolean aBoolean27 = false;

	@OriginalMember(owner = "client!CHKMTWJC", name = "tb", descriptor = "I")
	public int anInt139 = -1;

	@OriginalMember(owner = "client!CHKMTWJC", name = "vb", descriptor = "I")
	public int anInt141 = -1;

	@OriginalMember(owner = "client!CHKMTWJC", name = "wb", descriptor = "Z")
	public boolean aBoolean28 = false;

	@OriginalMember(owner = "client!CHKMTWJC", name = "xb", descriptor = "[I")
	public int[] anIntArray54 = new int[12];

	@OriginalMember(owner = "client!CHKMTWJC", name = "yb", descriptor = "Z")
	private boolean aBoolean29 = true;

	@OriginalMember(owner = "client!CHKMTWJC", name = "Ab", descriptor = "J")
	private long aLong7 = -1L;

	@OriginalMember(owner = "client!CHKMTWJC", name = "Bb", descriptor = "[I")
	public int[] anIntArray55 = new int[5];

	@OriginalMember(owner = "client!CHKMTWJC", name = "Cb", descriptor = "Z")
	public boolean aBoolean30 = false;

	@OriginalMember(owner = "client!CHKMTWJC", name = "Jb", descriptor = "Z")
	private boolean aBoolean31 = false;

	@OriginalMember(owner = "client!CHKMTWJC", name = "Kb", descriptor = "B")
	private byte aByte2 = 1;

	@OriginalMember(owner = "client!CHKMTWJC", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method157() {
		try {
			return this.aBoolean28;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("17213, " + false + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CHKMTWJC", name = "c", descriptor = "(I)Lclient!CADBNSXE;")
	public Class3_Sub1_Sub1_Sub1 method66() {
		try {
			if (!this.aBoolean28) {
				return null;
			} else if (this.aClass40_1 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray54[local18];
					if (local25 >= 256 && local25 < 512 && !Class20.aClass20Array1[local25 - 256].method246(369)) {
						local16 = true;
					}
					if (local25 >= 512 && !Class25.method347(local25 - 512).method344(this.anInt149)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(66) Class3_Sub1_Sub1_Sub1[] local66 = new Class3_Sub1_Sub1_Sub1[12];
				@Pc(68) int local68 = 0;
				for (@Pc(70) int local70 = 0; local70 < 12; local70++) {
					@Pc(77) int local77 = this.anIntArray54[local70];
					@Pc(91) Class3_Sub1_Sub1_Sub1 local91;
					if (local77 >= 256 && local77 < 512) {
						local91 = Class20.aClass20Array1[local77 - 256].method247((byte) 9);
						if (local91 != null) {
							local66[local68++] = local91;
						}
					}
					if (local77 >= 512) {
						local91 = Class25.method347(local77 - 512).method339(this.anInt149);
						if (local91 != null) {
							local66[local68++] = local91;
						}
					}
				}
				@Pc(134) Class3_Sub1_Sub1_Sub1 local134 = new Class3_Sub1_Sub1_Sub1(local66, local68, 337);
				for (@Pc(136) int local136 = 0; local136 < 5; local136++) {
					if (this.anIntArray55[local136] != 0) {
						local134.method36(client.anIntArrayArray24[local136][0], client.anIntArrayArray24[local136][this.anIntArray55[local136]]);
						if (local136 == 1) {
							local134.method36(client.anIntArray243[0], client.anIntArray243[this.anIntArray55[local136]]);
						}
					}
				}
				return local134;
			} else {
				return this.aClass40_1.method538();
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("45541, " + 858 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CHKMTWJC", name = "a", descriptor = "(I)Lclient!CADBNSXE;")
	@Override
	protected Class3_Sub1_Sub1_Sub1 method562(@OriginalArg(0) int arg0) {
		try {
			if (!this.aBoolean28) {
				return null;
			}
			@Pc(11) Class3_Sub1_Sub1_Sub1 local11 = this.method67(this.aBoolean31);
			if (local11 == null) {
				return null;
			}
			super.anInt361 = local11.anInt799;
			if (arg0 >= 0) {
				throw new NullPointerException();
			}
			local11.aBoolean15 = true;
			if (this.aBoolean30) {
				return local11;
			}
			if (super.anInt315 != -1 && super.anInt316 != -1) {
				@Pc(46) Class44 local46 = Class44.aClass44Array1[super.anInt315];
				@Pc(49) Class3_Sub1_Sub1_Sub1 local49 = local46.method552();
				if (local49 != null) {
					@Pc(64) Class3_Sub1_Sub1_Sub1 local64 = new Class3_Sub1_Sub1_Sub1(false, Class7.method94(super.anInt316), local49, this.aByte2, true);
					local64.method35(-super.anInt319, 0, 0);
					local64.method29();
					local64.method30(local46.aClass38_2.anIntArray191[super.anInt316]);
					local64.anIntArrayArray3 = null;
					local64.anIntArrayArray2 = null;
					if (local46.anInt764 != 128 || local46.anInt765 != 128) {
						local64.method38(local46.anInt764, local46.anInt765, local46.anInt764);
					}
					local64.method39(local46.anInt767 + 64, local46.anInt768 + 850, -30, -50, -30, true);
					@Pc(132) Class3_Sub1_Sub1_Sub1[] local132 = new Class3_Sub1_Sub1_Sub1[] { local11, local64 };
					local11 = new Class3_Sub1_Sub1_Sub1(true, 6, local132, 2);
				}
			}
			if (this.aClass3_Sub1_Sub1_Sub1_2 != null) {
				if (client.anInt1000 >= this.anInt151) {
					this.aClass3_Sub1_Sub1_Sub1_2 = null;
				}
				if (client.anInt1000 >= this.anInt150 && client.anInt1000 < this.anInt151) {
					@Pc(161) Class3_Sub1_Sub1_Sub1 local161 = this.aClass3_Sub1_Sub1_Sub1_2;
					local161.method35(this.anInt153 - this.anInt140, this.anInt154 - super.anInt331, this.anInt152 - super.anInt330);
					if (super.anInt336 == 512) {
						local161.method33();
						local161.method33();
						local161.method33();
					} else if (super.anInt336 == 1024) {
						local161.method33();
						local161.method33();
					} else if (super.anInt336 == 1536) {
						local161.method33();
					}
					@Pc(224) Class3_Sub1_Sub1_Sub1[] local224 = new Class3_Sub1_Sub1_Sub1[] { local11, local161 };
					local11 = new Class3_Sub1_Sub1_Sub1(true, 6, local224, 2);
					if (super.anInt336 == 512) {
						local161.method33();
					} else if (super.anInt336 == 1024) {
						local161.method33();
						local161.method33();
					} else if (super.anInt336 == 1536) {
						local161.method33();
						local161.method33();
						local161.method33();
					}
					local161.method35(this.anInt140 - this.anInt153, super.anInt331 - this.anInt154, super.anInt330 - this.anInt152);
				}
			}
			local11.aBoolean15 = true;
			return local11;
		} catch (@Pc(290) RuntimeException local290) {
			signlink.reporterror("92692, " + arg0 + ", " + local290.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CHKMTWJC", name = "b", descriptor = "(Z)Lclient!CADBNSXE;")
	private Class3_Sub1_Sub1_Sub1 method67(@OriginalArg(0) boolean arg0) {
		try {
			if (this.aClass40_1 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt356 >= 0 && super.anInt359 == 0) {
					local6 = Class38.aClass38Array1[super.anInt356].anIntArray191[super.anInt357];
				} else if (super.anInt333 >= 0) {
					local6 = Class38.aClass38Array1[super.anInt333].anIntArray191[super.anInt334];
				}
				return this.aClass40_1.method535(119, -1, local6, null);
			}
			@Pc(48) long local48 = this.aLong8;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (arg0) {
				throw new NullPointerException();
			}
			if (super.anInt356 >= 0 && super.anInt359 == 0) {
				@Pc(73) Class38 local73 = Class38.aClass38Array1[super.anInt356];
				local50 = local73.anIntArray191[super.anInt357];
				if (super.anInt333 >= 0 && super.anInt333 != super.anInt327) {
					local52 = Class38.aClass38Array1[super.anInt333].anIntArray191[super.anInt334];
				}
				if (local73.anInt710 >= 0) {
					local54 = local73.anInt710;
					local48 += local54 - this.anIntArray54[5] << 8;
				}
				if (local73.anInt711 >= 0) {
					local56 = local73.anInt711;
					local48 += local56 - this.anIntArray54[3] << 16;
				}
			} else if (super.anInt333 >= 0) {
				local50 = Class38.aClass38Array1[super.anInt333].anIntArray191[super.anInt334];
			}
			@Pc(151) Class3_Sub1_Sub1_Sub1 local151 = (Class3_Sub1_Sub1_Sub1) aClass36_1.method513(local48);
			@Pc(157) int local157;
			@Pc(164) int local164;
			if (local151 == null) {
				@Pc(155) boolean local155 = false;
				for (local157 = 0; local157 < 12; local157++) {
					local164 = this.anIntArray54[local157];
					if (local56 >= 0 && local157 == 3) {
						local164 = local56;
					}
					if (local54 >= 0 && local157 == 5) {
						local164 = local54;
					}
					if (local164 >= 256 && local164 < 512 && !Class20.aClass20Array1[local164 - 256].method244()) {
						local155 = true;
					}
					if (local164 >= 512 && !Class25.method347(local164 - 512).method338(this.anInt149)) {
						local155 = true;
					}
				}
				if (local155) {
					if (this.aLong7 != -1L) {
						local151 = (Class3_Sub1_Sub1_Sub1) aClass36_1.method513(this.aLong7);
					}
					if (local151 == null) {
						return null;
					}
				}
			}
			if (local151 == null) {
				@Pc(234) Class3_Sub1_Sub1_Sub1[] local234 = new Class3_Sub1_Sub1_Sub1[12];
				local157 = 0;
				@Pc(245) int local245;
				for (local164 = 0; local164 < 12; local164++) {
					local245 = this.anIntArray54[local164];
					if (local56 >= 0 && local164 == 3) {
						local245 = local56;
					}
					if (local54 >= 0 && local164 == 5) {
						local245 = local54;
					}
					@Pc(273) Class3_Sub1_Sub1_Sub1 local273;
					if (local245 >= 256 && local245 < 512) {
						local273 = Class20.aClass20Array1[local245 - 256].method245();
						if (local273 != null) {
							local234[local157++] = local273;
						}
					}
					if (local245 >= 512) {
						local273 = Class25.method347(local245 - 512).method340(this.anInt149);
						if (local273 != null) {
							local234[local157++] = local273;
						}
					}
				}
				local151 = new Class3_Sub1_Sub1_Sub1(local234, local157, 337);
				for (local245 = 0; local245 < 5; local245++) {
					if (this.anIntArray55[local245] != 0) {
						local151.method36(client.anIntArrayArray24[local245][0], client.anIntArrayArray24[local245][this.anIntArray55[local245]]);
						if (local245 == 1) {
							local151.method36(client.anIntArray243[0], client.anIntArray243[this.anIntArray55[local245]]);
						}
					}
				}
				local151.method29();
				local151.method39(64, 850, -30, -50, -30, true);
				aClass36_1.method514(local151, local48);
				this.aLong7 = local48;
			}
			if (this.aBoolean30) {
				return local151;
			}
			@Pc(378) Class3_Sub1_Sub1_Sub1 local378 = Class3_Sub1_Sub1_Sub1.aClass3_Sub1_Sub1_Sub1_1;
			local378.method24(local151, Class7.method94(local50) & Class7.method94(local52));
			if (local50 != -1 && local52 != -1) {
				local378.method31(local50, local52, (byte) 4, Class38.aClass38Array1[super.anInt356].anIntArray194);
			} else if (local50 != -1) {
				local378.method30(local50);
			}
			local378.method26();
			local378.anIntArrayArray3 = null;
			local378.anIntArrayArray2 = null;
			return local378;
		} catch (@Pc(426) RuntimeException local426) {
			signlink.reporterror("54401, " + arg0 + ", " + local426.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CHKMTWJC", name = "a", descriptor = "(BLclient!MLYYHULT;)V")
	public void method68(@OriginalArg(1) Class3_Sub1_Sub2 arg0) {
		try {
			arg0.anInt429 = 0;
			this.anInt149 = arg0.method200();
			this.anInt141 = arg0.method201();
			this.anInt139 = arg0.method201();
			this.aClass40_1 = null;
			this.anInt147 = 0;
			@Pc(29) int local29;
			@Pc(41) int local41;
			@Pc(88) int local88;
			for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
				local29 = arg0.method200();
				if (local29 == 0) {
					this.anIntArray54[local24] = 0;
				} else {
					local41 = arg0.method200();
					this.anIntArray54[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray54[0] == 65535) {
						this.aClass40_1 = Class40.method537(arg0.method202());
						break;
					}
					if (this.anIntArray54[local24] >= 512 && this.anIntArray54[local24] - 512 < Class25.anInt513) {
						local88 = Class25.method347(this.anIntArray54[local24] - 512).anInt510;
						if (local88 != 0) {
							this.anInt147 = local88;
						}
					}
				}
			}
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg0.method200();
				if (local41 < 0 || local41 >= client.anIntArrayArray24[local29].length) {
					local41 = 0;
				}
				this.anIntArray55[local29] = local41;
			}
			super.anInt327 = arg0.method202();
			if (super.anInt327 == 65535) {
				super.anInt327 = -1;
			}
			super.anInt328 = arg0.method202();
			if (super.anInt328 == 65535) {
				super.anInt328 = -1;
			}
			super.anInt337 = arg0.method202();
			if (super.anInt337 == 65535) {
				super.anInt337 = -1;
			}
			super.anInt338 = arg0.method202();
			if (super.anInt338 == 65535) {
				super.anInt338 = -1;
			}
			super.anInt339 = arg0.method202();
			if (super.anInt339 == 65535) {
				super.anInt339 = -1;
			}
			super.anInt340 = arg0.method202();
			if (super.anInt340 == 65535) {
				super.anInt340 = -1;
			}
			super.anInt355 = arg0.method202();
			if (super.anInt355 == 65535) {
				super.anInt355 = -1;
			}
			this.aString3 = Class43.method548(Class43.method545(arg0.method206((byte) 2)));
			this.anInt148 = arg0.method200();
			this.anInt142 = arg0.method202();
			this.aBoolean28 = true;
			this.aLong8 = 0L;
			local41 = this.anIntArray54[5];
			local88 = this.anIntArray54[9];
			this.anIntArray54[5] = local88;
			this.anIntArray54[9] = local41;
			for (@Pc(256) int local256 = 0; local256 < 12; local256++) {
				this.aLong8 <<= 0x4;
				if (this.anIntArray54[local256] >= 256) {
					this.aLong8 += this.anIntArray54[local256] - 256;
				}
			}
			if (this.anIntArray54[0] >= 256) {
				this.aLong8 += this.anIntArray54[0] - 256 >> 4;
			}
			if (this.anIntArray54[1] >= 256) {
				this.aLong8 += this.anIntArray54[1] - 256 >> 8;
			}
			this.anIntArray54[5] = local41;
			this.anIntArray54[9] = local88;
			for (@Pc(338) int local338 = 0; local338 < 5; local338++) {
				this.aLong8 <<= 0x3;
				this.aLong8 += this.anIntArray55[local338];
			}
			this.aLong8 <<= 0x1;
			this.aLong8 += this.anInt149;
		} catch (@Pc(376) RuntimeException local376) {
			signlink.reporterror("63773, " + 121 + ", " + arg0 + ", " + local376.toString());
			throw new RuntimeException();
		}
	}
}
