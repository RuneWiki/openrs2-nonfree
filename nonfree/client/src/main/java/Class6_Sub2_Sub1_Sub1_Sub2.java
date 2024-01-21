import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XVMRCEYW")
public final class Class6_Sub2_Sub1_Sub1_Sub2 extends Class6_Sub2_Sub1_Sub1 {

	@OriginalMember(owner = "client!XVMRCEYW", name = "Hb", descriptor = "Lclient!ULDYKUPK;")
	public static Class42 aClass42_9 = new Class42(260, 0);

	@OriginalMember(owner = "client!XVMRCEYW", name = "ub", descriptor = "I")
	public int anInt723;

	@OriginalMember(owner = "client!XVMRCEYW", name = "vb", descriptor = "I")
	private int anInt724;

	@OriginalMember(owner = "client!XVMRCEYW", name = "xb", descriptor = "I")
	public int anInt725;

	@OriginalMember(owner = "client!XVMRCEYW", name = "yb", descriptor = "I")
	public int anInt726;

	@OriginalMember(owner = "client!XVMRCEYW", name = "zb", descriptor = "I")
	public int anInt727;

	@OriginalMember(owner = "client!XVMRCEYW", name = "Ab", descriptor = "Lclient!JUQSYEMB;")
	public Class6_Sub2_Sub1_Sub3 aClass6_Sub2_Sub1_Sub3_2;

	@OriginalMember(owner = "client!XVMRCEYW", name = "Bb", descriptor = "Lclient!APPQAEOL;")
	public Class2 aClass2_2;

	@OriginalMember(owner = "client!XVMRCEYW", name = "Db", descriptor = "J")
	private long aLong23;

	@OriginalMember(owner = "client!XVMRCEYW", name = "Eb", descriptor = "I")
	public int anInt729;

	@OriginalMember(owner = "client!XVMRCEYW", name = "Fb", descriptor = "I")
	public int anInt730;

	@OriginalMember(owner = "client!XVMRCEYW", name = "Ib", descriptor = "I")
	public int anInt731;

	@OriginalMember(owner = "client!XVMRCEYW", name = "Jb", descriptor = "I")
	public int anInt732;

	@OriginalMember(owner = "client!XVMRCEYW", name = "Kb", descriptor = "I")
	public int anInt733;

	@OriginalMember(owner = "client!XVMRCEYW", name = "Lb", descriptor = "I")
	public int anInt734;

	@OriginalMember(owner = "client!XVMRCEYW", name = "Nb", descriptor = "I")
	public int anInt735;

	@OriginalMember(owner = "client!XVMRCEYW", name = "Pb", descriptor = "Ljava/lang/String;")
	public String aString16;

	@OriginalMember(owner = "client!XVMRCEYW", name = "Qb", descriptor = "I")
	public int anInt737;

	@OriginalMember(owner = "client!XVMRCEYW", name = "Tb", descriptor = "I")
	private int anInt739;

	@OriginalMember(owner = "client!XVMRCEYW", name = "Vb", descriptor = "I")
	public int anInt740;

	@OriginalMember(owner = "client!XVMRCEYW", name = "wb", descriptor = "Z")
	public boolean aBoolean207 = false;

	@OriginalMember(owner = "client!XVMRCEYW", name = "Cb", descriptor = "I")
	private int anInt728 = -479;

	@OriginalMember(owner = "client!XVMRCEYW", name = "Gb", descriptor = "[I")
	public int[] anIntArray187 = new int[12];

	@OriginalMember(owner = "client!XVMRCEYW", name = "Mb", descriptor = "J")
	private long aLong24 = -1L;

	@OriginalMember(owner = "client!XVMRCEYW", name = "Ob", descriptor = "I")
	public int anInt736 = -1;

	@OriginalMember(owner = "client!XVMRCEYW", name = "Rb", descriptor = "[I")
	public int[] anIntArray188 = new int[5];

	@OriginalMember(owner = "client!XVMRCEYW", name = "Sb", descriptor = "I")
	public int anInt738 = -1;

	@OriginalMember(owner = "client!XVMRCEYW", name = "Ub", descriptor = "Z")
	public boolean aBoolean208 = false;

	@OriginalMember(owner = "client!XVMRCEYW", name = "a", descriptor = "(Lclient!NQUAUMDT;Z)V")
	public void method511(@OriginalArg(0) Class6_Sub2_Sub3 arg0) {
		try {
			arg0.anInt404 = 0;
			this.anInt739 = arg0.method262();
			this.anInt738 = arg0.method263();
			this.anInt736 = arg0.method263();
			this.aClass2_2 = null;
			this.anInt740 = 0;
			@Pc(34) int local34;
			@Pc(46) int local46;
			@Pc(93) int local93;
			for (@Pc(29) int local29 = 0; local29 < 12; local29++) {
				local34 = arg0.method262();
				if (local34 == 0) {
					this.anIntArray187[local29] = 0;
				} else {
					local46 = arg0.method262();
					this.anIntArray187[local29] = (local34 << 8) + local46;
					if (local29 == 0 && this.anIntArray187[0] == 65535) {
						this.aClass2_2 = Class2.method10(arg0.method264());
						break;
					}
					if (this.anIntArray187[local29] >= 512 && this.anIntArray187[local29] - 512 < Class43.anInt560) {
						local93 = Class43.method464(this.anIntArray187[local29] - 512).anInt571;
						if (local93 != 0) {
							this.anInt740 = local93;
						}
					}
				}
			}
			for (local34 = 0; local34 < 5; local34++) {
				local46 = arg0.method262();
				if (local46 < 0 || local46 >= client.anIntArrayArray22[local34].length) {
					local46 = 0;
				}
				this.anIntArray188[local34] = local46;
			}
			super.anInt712 = arg0.method264();
			if (super.anInt712 == 65535) {
				super.anInt712 = -1;
			}
			super.anInt713 = arg0.method264();
			if (super.anInt713 == 65535) {
				super.anInt713 = -1;
			}
			super.anInt691 = arg0.method264();
			if (super.anInt691 == 65535) {
				super.anInt691 = -1;
			}
			super.anInt692 = arg0.method264();
			if (super.anInt692 == 65535) {
				super.anInt692 = -1;
			}
			super.anInt693 = arg0.method264();
			if (super.anInt693 == 65535) {
				super.anInt693 = -1;
			}
			super.anInt694 = arg0.method264();
			if (super.anInt694 == 65535) {
				super.anInt694 = -1;
			}
			super.anInt709 = arg0.method264();
			if (super.anInt709 == 65535) {
				super.anInt709 = -1;
			}
			this.aString16 = Class39.method363(Class39.method360(arg0.method268()));
			this.anInt737 = arg0.method262();
			this.anInt735 = arg0.method264();
			this.aBoolean207 = true;
			this.aLong23 = 0L;
			local46 = this.anIntArray187[5];
			local93 = this.anIntArray187[9];
			this.anIntArray187[5] = local93;
			this.anIntArray187[9] = local46;
			for (@Pc(250) int local250 = 0; local250 < 12; local250++) {
				this.aLong23 <<= 0x4;
				if (this.anIntArray187[local250] >= 256) {
					this.aLong23 += this.anIntArray187[local250] - 256;
				}
			}
			if (this.anIntArray187[0] >= 256) {
				this.aLong23 += this.anIntArray187[0] - 256 >> 4;
			}
			if (this.anIntArray187[1] >= 256) {
				this.aLong23 += this.anIntArray187[1] - 256 >> 8;
			}
			this.anIntArray187[5] = local46;
			this.anIntArray187[9] = local93;
			for (@Pc(332) int local332 = 0; local332 < 5; local332++) {
				this.aLong23 <<= 0x3;
				this.aLong23 += this.anIntArray188[local332];
			}
			this.aLong23 <<= 0x1;
			this.aLong23 += this.anInt739;
		} catch (@Pc(370) RuntimeException local370) {
			signlink.reporterror("42351, " + arg0 + ", " + true + ", " + local370.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XVMRCEYW", name = "c", descriptor = "(I)Lclient!JUQSYEMB;")
	public Class6_Sub2_Sub1_Sub3 method512() {
		try {
			if (!this.aBoolean207) {
				return null;
			} else if (this.aClass2_2 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray187[local18];
					if (local25 >= 256 && local25 < 512 && !Class40.aClass40Array1[local25 - 256].method399()) {
						local16 = true;
					}
					if (local25 >= 512 && !Class43.method464(local25 - 512).method460(this.anInt739)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(66) Class6_Sub2_Sub1_Sub3[] local66 = new Class6_Sub2_Sub1_Sub3[12];
				@Pc(68) int local68 = 0;
				for (@Pc(70) int local70 = 0; local70 < 12; local70++) {
					@Pc(77) int local77 = this.anIntArray187[local70];
					@Pc(91) Class6_Sub2_Sub1_Sub3 local91;
					if (local77 >= 256 && local77 < 512) {
						local91 = Class40.aClass40Array1[local77 - 256].method400((byte) 1);
						if (local91 != null) {
							local66[local68++] = local91;
						}
					}
					if (local77 >= 512) {
						local91 = Class43.method464(local77 - 512).method457(this.anInt739);
						if (local91 != null) {
							local66[local68++] = local91;
						}
					}
				}
				@Pc(128) Class6_Sub2_Sub1_Sub3 local128 = new Class6_Sub2_Sub1_Sub3(local68, 6, local66);
				for (@Pc(136) int local136 = 0; local136 < 5; local136++) {
					if (this.anIntArray188[local136] != 0) {
						local128.method147(client.anIntArrayArray22[local136][0], client.anIntArrayArray22[local136][this.anIntArray188[local136]]);
						if (local136 == 1) {
							local128.method147(client.anIntArray259[0], client.anIntArray259[this.anIntArray188[local136]]);
						}
					}
				}
				return local128;
			} else {
				return this.aClass2_2.method12();
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("16331, " + 31580 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XVMRCEYW", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method510() {
		try {
			return this.aBoolean207;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("82127, " + 9382 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XVMRCEYW", name = "a", descriptor = "(I)Lclient!JUQSYEMB;")
	@Override
	protected Class6_Sub2_Sub1_Sub3 method529(@OriginalArg(0) int arg0) {
		try {
			if (!this.aBoolean207) {
				return null;
			}
			@Pc(10) Class6_Sub2_Sub1_Sub3 local10 = this.method513();
			if (local10 == null) {
				return null;
			}
			super.anInt696 = local10.anInt776;
			@Pc(22) boolean local22 = false;
			local10.aBoolean84 = true;
			if (this.aBoolean208) {
				return local10;
			}
			if (super.anInt686 != -1 && super.anInt687 != -1) {
				@Pc(43) Class31 local43 = Class31.aClass31Array1[super.anInt686];
				@Pc(46) Class6_Sub2_Sub1_Sub3 local46 = local43.method337();
				if (local46 != null) {
					@Pc(60) Class6_Sub2_Sub1_Sub3 local60 = new Class6_Sub2_Sub1_Sub3(false, true, (byte) 119, local46, Class48.method536(super.anInt687));
					local60.method146(0, 0, -super.anInt690);
					local60.method140();
					local60.method141(local43.aClass21_2.anIntArray108[super.anInt687]);
					local60.anIntArrayArray5 = null;
					local60.anIntArrayArray4 = null;
					if (local43.anInt430 != 128 || local43.anInt431 != 128) {
						local60.method149(local43.anInt430, local43.anInt431, local43.anInt430, this.anInt728);
					}
					local60.method150(local43.anInt433 + 64, local43.anInt434 + 850, -30, -50, -30, true);
					@Pc(129) Class6_Sub2_Sub1_Sub3[] local129 = new Class6_Sub2_Sub1_Sub3[] { local10, local60 };
					local10 = new Class6_Sub2_Sub1_Sub3(true, local129, -889, 2);
				}
			}
			if (this.aClass6_Sub2_Sub1_Sub3_2 != null) {
				if (client.anInt1077 >= this.anInt730) {
					this.aClass6_Sub2_Sub1_Sub3_2 = null;
				}
				if (client.anInt1077 >= this.anInt729 && client.anInt1077 < this.anInt730) {
					@Pc(158) Class6_Sub2_Sub1_Sub3 local158 = this.aClass6_Sub2_Sub1_Sub3_2;
					local158.method146(this.anInt727 - super.anInt700, this.anInt725 - super.anInt699, this.anInt726 - this.anInt723);
					if (super.anInt698 == 512) {
						local158.method144();
						local158.method144();
						local158.method144();
					} else if (super.anInt698 == 1024) {
						local158.method144();
						local158.method144();
					} else if (super.anInt698 == 1536) {
						local158.method144();
					}
					@Pc(221) Class6_Sub2_Sub1_Sub3[] local221 = new Class6_Sub2_Sub1_Sub3[] { local10, local158 };
					local10 = new Class6_Sub2_Sub1_Sub3(true, local221, -889, 2);
					if (super.anInt698 == 512) {
						local158.method144();
					} else if (super.anInt698 == 1024) {
						local158.method144();
						local158.method144();
					} else if (super.anInt698 == 1536) {
						local158.method144();
						local158.method144();
						local158.method144();
					}
					local158.method146(super.anInt700 - this.anInt727, super.anInt699 - this.anInt725, this.anInt723 - this.anInt726);
				}
			}
			local10.aBoolean84 = true;
			return local10;
		} catch (@Pc(287) RuntimeException local287) {
			signlink.reporterror("26568, " + arg0 + ", " + local287.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XVMRCEYW", name = "d", descriptor = "(I)Lclient!JUQSYEMB;")
	private Class6_Sub2_Sub1_Sub3 method513() {
		try {
			if (this.aClass2_2 != null) {
				@Pc(12) int local12 = -1;
				if (super.anInt702 >= 0 && super.anInt705 == 0) {
					local12 = Class21.aClass21Array1[super.anInt702].anIntArray108[super.anInt703];
				} else if (super.anInt681 >= 0) {
					local12 = Class21.aClass21Array1[super.anInt681].anIntArray108[super.anInt682];
				}
				return this.aClass2_2.method7(-1, null, local12);
			}
			@Pc(54) long local54 = this.aLong23;
			@Pc(56) int local56 = -1;
			@Pc(58) int local58 = -1;
			@Pc(60) int local60 = -1;
			@Pc(62) int local62 = -1;
			if (super.anInt702 >= 0 && super.anInt705 == 0) {
				@Pc(73) Class21 local73 = Class21.aClass21Array1[super.anInt702];
				local56 = local73.anIntArray108[super.anInt703];
				if (super.anInt681 >= 0 && super.anInt681 != super.anInt712) {
					local58 = Class21.aClass21Array1[super.anInt681].anIntArray108[super.anInt682];
				}
				if (local73.anInt347 >= 0) {
					local60 = local73.anInt347;
					local54 += local60 - this.anIntArray187[5] << 8;
				}
				if (local73.anInt348 >= 0) {
					local62 = local73.anInt348;
					local54 += local62 - this.anIntArray187[3] << 16;
				}
			} else if (super.anInt681 >= 0) {
				local56 = Class21.aClass21Array1[super.anInt681].anIntArray108[super.anInt682];
			}
			@Pc(151) Class6_Sub2_Sub1_Sub3 local151 = (Class6_Sub2_Sub1_Sub3) aClass42_9.method453(local54);
			@Pc(157) int local157;
			@Pc(164) int local164;
			if (local151 == null) {
				@Pc(155) boolean local155 = false;
				for (local157 = 0; local157 < 12; local157++) {
					local164 = this.anIntArray187[local157];
					if (local62 >= 0 && local157 == 3) {
						local164 = local62;
					}
					if (local60 >= 0 && local157 == 5) {
						local164 = local60;
					}
					if (local164 >= 256 && local164 < 512 && !Class40.aClass40Array1[local164 - 256].method397()) {
						local155 = true;
					}
					if (local164 >= 512 && !Class43.method464(local164 - 512).method466(this.anInt739)) {
						local155 = true;
					}
				}
				if (local155) {
					if (this.aLong24 != -1L) {
						local151 = (Class6_Sub2_Sub1_Sub3) aClass42_9.method453(this.aLong24);
					}
					if (local151 == null) {
						return null;
					}
				}
			}
			if (local151 == null) {
				@Pc(234) Class6_Sub2_Sub1_Sub3[] local234 = new Class6_Sub2_Sub1_Sub3[12];
				local157 = 0;
				@Pc(245) int local245;
				for (local164 = 0; local164 < 12; local164++) {
					local245 = this.anIntArray187[local164];
					if (local62 >= 0 && local164 == 3) {
						local245 = local62;
					}
					if (local60 >= 0 && local164 == 5) {
						local245 = local60;
					}
					@Pc(273) Class6_Sub2_Sub1_Sub3 local273;
					if (local245 >= 256 && local245 < 512) {
						local273 = Class40.aClass40Array1[local245 - 256].method398();
						if (local273 != null) {
							local234[local157++] = local273;
						}
					}
					if (local245 >= 512) {
						local273 = Class43.method464(local245 - 512).method461(this.anInt739);
						if (local273 != null) {
							local234[local157++] = local273;
						}
					}
				}
				local151 = new Class6_Sub2_Sub1_Sub3(local157, 6, local234);
				for (local245 = 0; local245 < 5; local245++) {
					if (this.anIntArray188[local245] != 0) {
						local151.method147(client.anIntArrayArray22[local245][0], client.anIntArrayArray22[local245][this.anIntArray188[local245]]);
						if (local245 == 1) {
							local151.method147(client.anIntArray259[0], client.anIntArray259[this.anIntArray188[local245]]);
						}
					}
				}
				local151.method140();
				local151.method150(64, 850, -30, -50, -30, true);
				aClass42_9.method454(local54, local151);
				this.aLong24 = local54;
			}
			if (this.aBoolean208) {
				return local151;
			}
			@Pc(378) Class6_Sub2_Sub1_Sub3 local378 = Class6_Sub2_Sub1_Sub3.aClass6_Sub2_Sub1_Sub3_1;
			local378.method135(Class48.method536(local56) & Class48.method536(local58), local151);
			if (local56 != -1 && local58 != -1) {
				local378.method142(local56, local58, Class21.aClass21Array1[super.anInt702].anIntArray111);
			} else if (local56 != -1) {
				local378.method141(local56);
			}
			local378.method137();
			local378.anIntArrayArray5 = null;
			local378.anIntArrayArray4 = null;
			return local378;
		} catch (@Pc(426) RuntimeException local426) {
			signlink.reporterror("97322, " + 484 + ", " + local426.toString());
			throw new RuntimeException();
		}
	}
}
