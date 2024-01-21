import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DLZHLHNK")
public final class Class1_Sub1_Sub2_Sub1_Sub2 extends Class1_Sub1_Sub2_Sub1 {

	@OriginalMember(owner = "client!DLZHLHNK", name = "zb", descriptor = "Lclient!GCPOSBWX;")
	public static Class13 aClass13_4 = new Class13(false, 260);

	@OriginalMember(owner = "client!DLZHLHNK", name = "tb", descriptor = "Lclient!CKDEJADD;")
	public Class6 aClass6_2;

	@OriginalMember(owner = "client!DLZHLHNK", name = "wb", descriptor = "I")
	public int anInt275;

	@OriginalMember(owner = "client!DLZHLHNK", name = "xb", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!DLZHLHNK", name = "yb", descriptor = "Ljava/lang/String;")
	public String aString6;

	@OriginalMember(owner = "client!DLZHLHNK", name = "Ab", descriptor = "I")
	public int anInt277;

	@OriginalMember(owner = "client!DLZHLHNK", name = "Bb", descriptor = "I")
	public int anInt278;

	@OriginalMember(owner = "client!DLZHLHNK", name = "Cb", descriptor = "I")
	public int anInt279;

	@OriginalMember(owner = "client!DLZHLHNK", name = "Db", descriptor = "I")
	public int anInt280;

	@OriginalMember(owner = "client!DLZHLHNK", name = "Eb", descriptor = "I")
	public int anInt281;

	@OriginalMember(owner = "client!DLZHLHNK", name = "Gb", descriptor = "I")
	public int anInt282;

	@OriginalMember(owner = "client!DLZHLHNK", name = "Hb", descriptor = "I")
	public int anInt283;

	@OriginalMember(owner = "client!DLZHLHNK", name = "Ib", descriptor = "I")
	public int anInt284;

	@OriginalMember(owner = "client!DLZHLHNK", name = "Jb", descriptor = "Lclient!ZKARKDQW;")
	public Class1_Sub1_Sub2_Sub6 aClass1_Sub1_Sub2_Sub6_1;

	@OriginalMember(owner = "client!DLZHLHNK", name = "Nb", descriptor = "J")
	private long aLong11;

	@OriginalMember(owner = "client!DLZHLHNK", name = "Ob", descriptor = "I")
	public int anInt286;

	@OriginalMember(owner = "client!DLZHLHNK", name = "Pb", descriptor = "I")
	public int anInt287;

	@OriginalMember(owner = "client!DLZHLHNK", name = "Qb", descriptor = "I")
	public int anInt288;

	@OriginalMember(owner = "client!DLZHLHNK", name = "Rb", descriptor = "I")
	public int anInt289;

	@OriginalMember(owner = "client!DLZHLHNK", name = "Sb", descriptor = "I")
	public int anInt290;

	@OriginalMember(owner = "client!DLZHLHNK", name = "sb", descriptor = "J")
	private long aLong10 = -1L;

	@OriginalMember(owner = "client!DLZHLHNK", name = "ub", descriptor = "Z")
	public boolean aBoolean57 = false;

	@OriginalMember(owner = "client!DLZHLHNK", name = "vb", descriptor = "[I")
	public int[] anIntArray50 = new int[5];

	@OriginalMember(owner = "client!DLZHLHNK", name = "Fb", descriptor = "Z")
	public boolean aBoolean58 = false;

	@OriginalMember(owner = "client!DLZHLHNK", name = "Kb", descriptor = "I")
	private int anInt285 = 9;

	@OriginalMember(owner = "client!DLZHLHNK", name = "Lb", descriptor = "Z")
	private boolean aBoolean59 = true;

	@OriginalMember(owner = "client!DLZHLHNK", name = "Mb", descriptor = "[I")
	public int[] anIntArray51 = new int[12];

	@OriginalMember(owner = "client!DLZHLHNK", name = "a", descriptor = "(I)Lclient!ZKARKDQW;")
	@Override
	protected Class1_Sub1_Sub2_Sub6 method529() {
		try {
			if (!this.aBoolean58) {
				return null;
			}
			@Pc(21) Class1_Sub1_Sub2_Sub6 local21 = this.method134();
			if (local21 == null) {
				return null;
			}
			super.anInt230 = local21.anInt790;
			local21.aBoolean211 = true;
			if (this.aBoolean57) {
				return local21;
			}
			if (super.anInt239 != -1 && super.anInt240 != -1) {
				@Pc(50) Class25 local50 = Class25.aClass25Array1[super.anInt239];
				@Pc(53) Class1_Sub1_Sub2_Sub6 local53 = local50.method309();
				if (local53 != null) {
					@Pc(67) Class1_Sub1_Sub2_Sub6 local67 = new Class1_Sub1_Sub2_Sub6(9, true, Class37.method456(super.anInt240), false, local53);
					local67.method547(0, -super.anInt243, 0);
					local67.method541();
					local67.method542(local50.aClass22_1.anIntArray76[super.anInt240]);
					local67.anIntArrayArray19 = null;
					local67.anIntArrayArray18 = null;
					if (local50.anInt488 != 128 || local50.anInt489 != 128) {
						local67.method550(local50.anInt488, local50.anInt488, this.anInt285, local50.anInt489);
					}
					local67.method551(local50.anInt491 + 64, local50.anInt492 + 850, -30, -50, -30, true);
					@Pc(136) Class1_Sub1_Sub2_Sub6[] local136 = new Class1_Sub1_Sub2_Sub6[] { local21, local67 };
					local21 = new Class1_Sub1_Sub2_Sub6(2, -819, true, local136);
				}
			}
			if (this.aClass1_Sub1_Sub2_Sub6_1 != null) {
				if (client.anInt995 >= this.anInt280) {
					this.aClass1_Sub1_Sub2_Sub6_1 = null;
				}
				if (client.anInt995 >= this.anInt279 && client.anInt995 < this.anInt280) {
					@Pc(165) Class1_Sub1_Sub2_Sub6 local165 = this.aClass1_Sub1_Sub2_Sub6_1;
					local165.method547(this.anInt282 - super.anInt268, this.anInt283 - this.anInt281, this.anInt284 - super.anInt269);
					if (super.anInt232 == 512) {
						local165.method545();
						local165.method545();
						local165.method545();
					} else if (super.anInt232 == 1024) {
						local165.method545();
						local165.method545();
					} else if (super.anInt232 == 1536) {
						local165.method545();
					}
					@Pc(228) Class1_Sub1_Sub2_Sub6[] local228 = new Class1_Sub1_Sub2_Sub6[] { local21, local165 };
					local21 = new Class1_Sub1_Sub2_Sub6(2, -819, true, local228);
					if (super.anInt232 == 512) {
						local165.method545();
					} else if (super.anInt232 == 1024) {
						local165.method545();
						local165.method545();
					} else if (super.anInt232 == 1536) {
						local165.method545();
						local165.method545();
						local165.method545();
					}
					local165.method547(super.anInt268 - this.anInt282, this.anInt281 - this.anInt283, super.anInt269 - this.anInt284);
				}
			}
			local21.aBoolean211 = true;
			return local21;
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("59276, " + 4016 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DLZHLHNK", name = "a", descriptor = "(ILclient!MBMGIXGO;)V")
	public void method133(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt468 = 0;
			this.anInt276 = arg0.method268();
			this.anInt278 = arg0.method268();
			this.aClass6_2 = null;
			this.anInt275 = 0;
			@Pc(28) int local28;
			@Pc(40) int local40;
			@Pc(87) int local87;
			for (@Pc(23) int local23 = 0; local23 < 12; local23++) {
				local28 = arg0.method268();
				if (local28 == 0) {
					this.anIntArray51[local23] = 0;
				} else {
					local40 = arg0.method268();
					this.anIntArray51[local23] = (local28 << 8) + local40;
					if (local23 == 0 && this.anIntArray51[0] == 65535) {
						this.aClass6_2 = Class6.method29(arg0.method270());
						break;
					}
					if (this.anIntArray51[local23] >= 512 && this.anIntArray51[local23] - 512 < Class9.anInt221) {
						local87 = Class9.method118(this.anIntArray51[local23] - 512).anInt220;
						if (local87 != 0) {
							this.anInt275 = local87;
						}
					}
				}
			}
			for (local28 = 0; local28 < 5; local28++) {
				local40 = arg0.method268();
				if (local40 < 0 || local40 >= client.anIntArrayArray25[local28].length) {
					local40 = 0;
				}
				this.anIntArray50[local28] = local40;
			}
			super.anInt233 = arg0.method270();
			if (super.anInt233 == 65535) {
				super.anInt233 = -1;
			}
			super.anInt234 = arg0.method270();
			if (super.anInt234 == 65535) {
				super.anInt234 = -1;
			}
			super.anInt271 = arg0.method270();
			if (super.anInt271 == 65535) {
				super.anInt271 = -1;
			}
			super.anInt272 = arg0.method270();
			if (super.anInt272 == 65535) {
				super.anInt272 = -1;
			}
			super.anInt273 = arg0.method270();
			if (super.anInt273 == 65535) {
				super.anInt273 = -1;
			}
			super.anInt274 = arg0.method270();
			if (super.anInt274 == 65535) {
				super.anInt274 = -1;
			}
			super.anInt229 = arg0.method270();
			if (super.anInt229 == 65535) {
				super.anInt229 = -1;
			}
			this.aString6 = Class50.method563(Class50.method560(arg0.method274()));
			this.anInt277 = arg0.method268();
			this.anInt290 = arg0.method270();
			this.aBoolean58 = true;
			this.aLong11 = 0L;
			for (local40 = 0; local40 < 12; local40++) {
				this.aLong11 <<= 0x4;
				if (this.anIntArray51[local40] >= 256) {
					this.aLong11 += this.anIntArray51[local40] - 256;
				}
			}
			if (this.anIntArray51[0] >= 256) {
				this.aLong11 += this.anIntArray51[0] - 256 >> 4;
			}
			if (this.anIntArray51[1] >= 256) {
				this.aLong11 += this.anIntArray51[1] - 256 >> 8;
			}
			for (local87 = 0; local87 < 5; local87++) {
				this.aLong11 <<= 0x3;
				this.aLong11 += this.anIntArray50[local87];
			}
			this.aLong11 <<= 0x1;
			this.aLong11 += this.anInt276;
		} catch (@Pc(334) RuntimeException local334) {
			signlink.reporterror("28951, " + 0 + ", " + arg0 + ", " + local334.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DLZHLHNK", name = "b", descriptor = "(I)Lclient!ZKARKDQW;")
	private Class1_Sub1_Sub2_Sub6 method134() {
		try {
			if (this.aClass6_2 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt245 >= 0 && super.anInt248 == 0) {
					local6 = Class22.aClass22Array1[super.anInt245].anIntArray76[super.anInt246];
				} else if (super.anInt236 >= 0) {
					local6 = Class22.aClass22Array1[super.anInt236].anIntArray76[super.anInt237];
				}
				return this.aClass6_2.method34(-1, local6, null);
			}
			@Pc(48) long local48 = this.aLong11;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (super.anInt245 >= 0 && super.anInt248 == 0) {
				@Pc(67) Class22 local67 = Class22.aClass22Array1[super.anInt245];
				local50 = local67.anIntArray76[super.anInt246];
				if (super.anInt236 >= 0 && super.anInt236 != super.anInt233) {
					local52 = Class22.aClass22Array1[super.anInt236].anIntArray76[super.anInt237];
				}
				if (local67.anInt436 >= 0) {
					local54 = local67.anInt436;
					local48 += local54 - this.anIntArray51[5] << 8;
				}
				if (local67.anInt437 >= 0) {
					local56 = local67.anInt437;
					local48 += local56 - this.anIntArray51[3] << 16;
				}
			} else if (super.anInt236 >= 0) {
				local50 = Class22.aClass22Array1[super.anInt236].anIntArray76[super.anInt237];
			}
			@Pc(145) Class1_Sub1_Sub2_Sub6 local145 = (Class1_Sub1_Sub2_Sub6) aClass13_4.method176(local48);
			@Pc(160) int local160;
			@Pc(167) int local167;
			if (local145 == null) {
				@Pc(158) boolean local158 = false;
				for (local160 = 0; local160 < 12; local160++) {
					local167 = this.anIntArray51[local160];
					if (local56 >= 0 && local160 == 3) {
						local167 = local56;
					}
					if (local54 >= 0 && local160 == 5) {
						local167 = local54;
					}
					if (local167 >= 256 && local167 < 512 && !Class39.aClass39Array1[local167 - 256].method467((byte) 2)) {
						local158 = true;
					}
					if (local167 >= 512 && !Class9.method118(local167 - 512).method115(this.anInt276)) {
						local158 = true;
					}
				}
				if (local158) {
					if (this.aLong10 != -1L) {
						local145 = (Class1_Sub1_Sub2_Sub6) aClass13_4.method176(this.aLong10);
					}
					if (local145 == null) {
						return null;
					}
				}
			}
			if (local145 == null) {
				@Pc(237) Class1_Sub1_Sub2_Sub6[] local237 = new Class1_Sub1_Sub2_Sub6[12];
				local160 = 0;
				@Pc(248) int local248;
				for (local167 = 0; local167 < 12; local167++) {
					local248 = this.anIntArray51[local167];
					if (local56 >= 0 && local167 == 3) {
						local248 = local56;
					}
					if (local54 >= 0 && local167 == 5) {
						local248 = local54;
					}
					@Pc(276) Class1_Sub1_Sub2_Sub6 local276;
					if (local248 >= 256 && local248 < 512) {
						local276 = Class39.aClass39Array1[local248 - 256].method468();
						if (local276 != null) {
							local237[local160++] = local276;
						}
					}
					if (local248 >= 512) {
						local276 = Class9.method118(local248 - 512).method116(this.anInt276);
						if (local276 != null) {
							local237[local160++] = local276;
						}
					}
				}
				local145 = new Class1_Sub1_Sub2_Sub6(local160, local237, -38);
				for (local248 = 0; local248 < 5; local248++) {
					if (this.anIntArray50[local248] != 0) {
						local145.method548(client.anIntArrayArray25[local248][0], client.anIntArrayArray25[local248][this.anIntArray50[local248]]);
						if (local248 == 1) {
							local145.method548(client.anIntArray262[0], client.anIntArray262[this.anIntArray50[local248]]);
						}
					}
				}
				local145.method541();
				local145.method551(64, 850, -30, -50, -30, true);
				aClass13_4.method177(local145, local48);
				this.aLong10 = local48;
			}
			if (this.aBoolean57) {
				return local145;
			}
			@Pc(381) Class1_Sub1_Sub2_Sub6 local381 = Class1_Sub1_Sub2_Sub6.aClass1_Sub1_Sub2_Sub6_2;
			local381.method536(local145, Class37.method456(local50) & Class37.method456(local52));
			if (local50 != -1 && local52 != -1) {
				local381.method543(Class22.aClass22Array1[super.anInt245].anIntArray79, local52, local50);
			} else if (local50 != -1) {
				local381.method542(local50);
			}
			local381.method538();
			local381.anIntArrayArray19 = null;
			local381.anIntArrayArray18 = null;
			return local381;
		} catch (@Pc(429) RuntimeException local429) {
			signlink.reporterror("88397, " + 0 + ", " + local429.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DLZHLHNK", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method132(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				throw new NullPointerException();
			}
			return this.aBoolean58;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("88114, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DLZHLHNK", name = "a", descriptor = "(B)Lclient!ZKARKDQW;")
	public Class1_Sub1_Sub2_Sub6 method135() {
		try {
			if (!this.aBoolean58) {
				return null;
			} else if (this.aClass6_2 == null) {
				@Pc(22) boolean local22 = false;
				for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
					@Pc(31) int local31 = this.anIntArray51[local24];
					if (local31 >= 256 && local31 < 512 && !Class39.aClass39Array1[local31 - 256].method469()) {
						local22 = true;
					}
					if (local31 >= 512 && !Class9.method118(local31 - 512).method112(this.anInt276)) {
						local22 = true;
					}
				}
				if (local22) {
					return null;
				}
				@Pc(72) Class1_Sub1_Sub2_Sub6[] local72 = new Class1_Sub1_Sub2_Sub6[12];
				@Pc(74) int local74 = 0;
				for (@Pc(76) int local76 = 0; local76 < 12; local76++) {
					@Pc(83) int local83 = this.anIntArray51[local76];
					@Pc(97) Class1_Sub1_Sub2_Sub6 local97;
					if (local83 >= 256 && local83 < 512) {
						local97 = Class39.aClass39Array1[local83 - 256].method470();
						if (local97 != null) {
							local72[local74++] = local97;
						}
					}
					if (local83 >= 512) {
						local97 = Class9.method118(local83 - 512).method114(this.anInt276);
						if (local97 != null) {
							local72[local74++] = local97;
						}
					}
				}
				@Pc(134) Class1_Sub1_Sub2_Sub6 local134 = new Class1_Sub1_Sub2_Sub6(local74, local72, -38);
				for (@Pc(136) int local136 = 0; local136 < 5; local136++) {
					if (this.anIntArray50[local136] != 0) {
						local134.method548(client.anIntArrayArray25[local136][0], client.anIntArrayArray25[local136][this.anIntArray50[local136]]);
						if (local136 == 1) {
							local134.method548(client.anIntArray262[0], client.anIntArray262[this.anIntArray50[local136]]);
						}
					}
				}
				return local134;
			} else {
				return this.aClass6_2.method30();
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("26259, " + -41 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}
}
