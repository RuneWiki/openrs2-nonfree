import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IOPHRJNF")
public final class Class2_Sub1_Sub1_Sub1_Sub2 extends Class2_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!IOPHRJNF", name = "sb", descriptor = "Lclient!RYXFUVWJ;")
	public static Class31 aClass31_4 = new Class31(260, -268);

	@OriginalMember(owner = "client!IOPHRJNF", name = "rb", descriptor = "I")
	public int anInt358;

	@OriginalMember(owner = "client!IOPHRJNF", name = "tb", descriptor = "I")
	public int anInt359;

	@OriginalMember(owner = "client!IOPHRJNF", name = "vb", descriptor = "I")
	public int anInt361;

	@OriginalMember(owner = "client!IOPHRJNF", name = "xb", descriptor = "I")
	public int anInt363;

	@OriginalMember(owner = "client!IOPHRJNF", name = "yb", descriptor = "I")
	public int anInt364;

	@OriginalMember(owner = "client!IOPHRJNF", name = "zb", descriptor = "I")
	public int anInt365;

	@OriginalMember(owner = "client!IOPHRJNF", name = "Ab", descriptor = "Lclient!XBVYIDUH;")
	public Class2_Sub1_Sub1_Sub6 aClass2_Sub1_Sub1_Sub6_1;

	@OriginalMember(owner = "client!IOPHRJNF", name = "Fb", descriptor = "Lclient!SHKUIFHF;")
	public Class32 aClass32_2;

	@OriginalMember(owner = "client!IOPHRJNF", name = "Gb", descriptor = "J")
	private long aLong13;

	@OriginalMember(owner = "client!IOPHRJNF", name = "Hb", descriptor = "I")
	public int anInt367;

	@OriginalMember(owner = "client!IOPHRJNF", name = "Ib", descriptor = "I")
	public int anInt368;

	@OriginalMember(owner = "client!IOPHRJNF", name = "Jb", descriptor = "I")
	public int anInt369;

	@OriginalMember(owner = "client!IOPHRJNF", name = "Kb", descriptor = "I")
	public int anInt370;

	@OriginalMember(owner = "client!IOPHRJNF", name = "Nb", descriptor = "I")
	private int anInt371;

	@OriginalMember(owner = "client!IOPHRJNF", name = "Ob", descriptor = "I")
	public int anInt372;

	@OriginalMember(owner = "client!IOPHRJNF", name = "Pb", descriptor = "I")
	public int anInt373;

	@OriginalMember(owner = "client!IOPHRJNF", name = "Rb", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "client!IOPHRJNF", name = "Sb", descriptor = "I")
	private int anInt374;

	@OriginalMember(owner = "client!IOPHRJNF", name = "Ub", descriptor = "I")
	public int anInt376;

	@OriginalMember(owner = "client!IOPHRJNF", name = "ub", descriptor = "I")
	public int anInt360 = -1;

	@OriginalMember(owner = "client!IOPHRJNF", name = "wb", descriptor = "I")
	private int anInt362 = 122;

	@OriginalMember(owner = "client!IOPHRJNF", name = "Bb", descriptor = "B")
	private byte aByte18 = 7;

	@OriginalMember(owner = "client!IOPHRJNF", name = "Cb", descriptor = "I")
	public int anInt366 = -1;

	@OriginalMember(owner = "client!IOPHRJNF", name = "Db", descriptor = "[I")
	public int[] anIntArray59 = new int[12];

	@OriginalMember(owner = "client!IOPHRJNF", name = "Eb", descriptor = "J")
	private long aLong12 = -1L;

	@OriginalMember(owner = "client!IOPHRJNF", name = "Lb", descriptor = "Z")
	public boolean aBoolean83 = false;

	@OriginalMember(owner = "client!IOPHRJNF", name = "Mb", descriptor = "[I")
	public int[] anIntArray60 = new int[5];

	@OriginalMember(owner = "client!IOPHRJNF", name = "Qb", descriptor = "Z")
	public boolean aBoolean84 = false;

	@OriginalMember(owner = "client!IOPHRJNF", name = "Tb", descriptor = "I")
	private int anInt375 = -347;

	@OriginalMember(owner = "client!IOPHRJNF", name = "b", descriptor = "(Z)Lclient!XBVYIDUH;")
	private Class2_Sub1_Sub1_Sub6 method222() {
		try {
			if (this.aClass32_2 != null) {
				@Pc(11) int local11 = -1;
				if (super.anInt316 >= 0 && super.anInt319 == 0) {
					local11 = Class33.aClass33Array1[super.anInt316].anIntArray115[super.anInt317];
				} else if (super.anInt324 >= 0) {
					local11 = Class33.aClass33Array1[super.anInt324].anIntArray115[super.anInt325];
				}
				return this.aClass32_2.method456(-1, local11, null);
			}
			@Pc(53) long local53 = this.aLong13;
			@Pc(55) int local55 = -1;
			@Pc(57) int local57 = -1;
			@Pc(59) int local59 = -1;
			@Pc(61) int local61 = -1;
			if (super.anInt316 >= 0 && super.anInt319 == 0) {
				@Pc(72) Class33 local72 = Class33.aClass33Array1[super.anInt316];
				local55 = local72.anIntArray115[super.anInt317];
				if (super.anInt324 >= 0 && super.anInt324 != super.anInt309) {
					local57 = Class33.aClass33Array1[super.anInt324].anIntArray115[super.anInt325];
				}
				if (local72.anInt651 >= 0) {
					local59 = local72.anInt651;
					local53 += local59 - this.anIntArray59[5] << 8;
				}
				if (local72.anInt652 >= 0) {
					local61 = local72.anInt652;
					local53 += local61 - this.anIntArray59[3] << 16;
				}
			} else if (super.anInt324 >= 0) {
				local55 = Class33.aClass33Array1[super.anInt324].anIntArray115[super.anInt325];
			}
			@Pc(150) Class2_Sub1_Sub1_Sub6 local150 = (Class2_Sub1_Sub1_Sub6) aClass31_4.method449(local53);
			@Pc(156) int local156;
			@Pc(163) int local163;
			if (local150 == null) {
				@Pc(154) boolean local154 = false;
				for (local156 = 0; local156 < 12; local156++) {
					local163 = this.anIntArray59[local156];
					if (local61 >= 0 && local156 == 3) {
						local163 = local61;
					}
					if (local59 >= 0 && local156 == 5) {
						local163 = local59;
					}
					if (local163 >= 256 && local163 < 512 && !Class25.aClass25Array1[local163 - 256].method289()) {
						local154 = true;
					}
					if (local163 >= 512 && !Class28.method410(local163 - 512).method414(this.anInt374)) {
						local154 = true;
					}
				}
				if (local154) {
					if (this.aLong12 != -1L) {
						local150 = (Class2_Sub1_Sub1_Sub6) aClass31_4.method449(this.aLong12);
					}
					if (local150 == null) {
						return null;
					}
				}
			}
			if (local150 == null) {
				@Pc(233) Class2_Sub1_Sub1_Sub6[] local233 = new Class2_Sub1_Sub1_Sub6[12];
				local156 = 0;
				@Pc(244) int local244;
				for (local163 = 0; local163 < 12; local163++) {
					local244 = this.anIntArray59[local163];
					if (local61 >= 0 && local163 == 3) {
						local244 = local61;
					}
					if (local59 >= 0 && local163 == 5) {
						local244 = local59;
					}
					@Pc(272) Class2_Sub1_Sub1_Sub6 local272;
					if (local244 >= 256 && local244 < 512) {
						local272 = Class25.aClass25Array1[local244 - 256].method290();
						if (local272 != null) {
							local233[local156++] = local272;
						}
					}
					if (local244 >= 512) {
						local272 = Class28.method410(local244 - 512).method404(this.anInt374);
						if (local272 != null) {
							local233[local156++] = local272;
						}
					}
				}
				local150 = new Class2_Sub1_Sub1_Sub6(local233, 273, local156);
				for (local244 = 0; local244 < 5; local244++) {
					if (this.anIntArray60[local244] != 0) {
						local150.method526(client.anIntArrayArray25[local244][0], client.anIntArrayArray25[local244][this.anIntArray60[local244]]);
						if (local244 == 1) {
							local150.method526(client.anIntArray234[0], client.anIntArray234[this.anIntArray60[local244]]);
						}
					}
				}
				local150.method519();
				local150.method529(64, 850, -30, -50, -30, true);
				aClass31_4.method450(local150, local53);
				this.aLong12 = local53;
			}
			if (this.aBoolean83) {
				return local150;
			}
			@Pc(377) Class2_Sub1_Sub1_Sub6 local377 = Class2_Sub1_Sub1_Sub6.aClass2_Sub1_Sub1_Sub6_2;
			local377.method514(local150, Class4.method168(this.aByte18, local55) & Class4.method168(this.aByte18, local57));
			if (local55 != -1 && local57 != -1) {
				local377.method521(local57, local55, Class33.aClass33Array1[super.anInt316].anIntArray118);
			} else if (local55 != -1) {
				local377.method520(local55);
			}
			local377.method516();
			local377.anIntArrayArray17 = null;
			local377.anIntArrayArray16 = null;
			return local377;
		} catch (@Pc(427) RuntimeException local427) {
			signlink.reporterror("75786, " + true + ", " + local427.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IOPHRJNF", name = "a", descriptor = "(B)Lclient!XBVYIDUH;")
	@Override
	protected Class2_Sub1_Sub1_Sub6 method507(@OriginalArg(0) byte arg0) {
		try {
			if (!this.aBoolean84) {
				return null;
			}
			@Pc(10) Class2_Sub1_Sub1_Sub6 local10 = this.method222();
			if (local10 == null) {
				return null;
			}
			super.anInt356 = local10.anInt754;
			@Pc(23) boolean local23 = false;
			local10.aBoolean189 = true;
			if (this.aBoolean83) {
				return local10;
			}
			if (super.anInt332 != -1 && super.anInt333 != -1) {
				@Pc(50) Class6 local50 = Class6.aClass6Array1[super.anInt332];
				@Pc(53) Class2_Sub1_Sub1_Sub6 local53 = local50.method194();
				if (local53 != null) {
					@Pc(68) Class2_Sub1_Sub1_Sub6 local68 = new Class2_Sub1_Sub1_Sub6(Class4.method168(this.aByte18, super.anInt333), (byte) 9, true, false, local53);
					local68.method525(0, 0, -super.anInt336);
					local68.method519();
					local68.method520(local50.aClass33_1.anIntArray115[super.anInt333]);
					local68.anIntArrayArray17 = null;
					local68.anIntArrayArray16 = null;
					if (local50.anInt189 != 128 || local50.anInt190 != 128) {
						local68.method528(local50.anInt190, local50.anInt189, local50.anInt189);
					}
					local68.method529(local50.anInt192 + 64, local50.anInt193 + 850, -30, -50, -30, true);
					@Pc(136) Class2_Sub1_Sub1_Sub6[] local136 = new Class2_Sub1_Sub1_Sub6[] { local10, local68 };
					local10 = new Class2_Sub1_Sub1_Sub6(true, 2, local136, false);
				}
			}
			if (this.aClass2_Sub1_Sub1_Sub6_1 != null) {
				if (client.anInt1013 >= this.anInt373) {
					this.aClass2_Sub1_Sub1_Sub6_1 = null;
				}
				if (client.anInt1013 >= this.anInt372 && client.anInt1013 < this.anInt373) {
					@Pc(165) Class2_Sub1_Sub1_Sub6 local165 = this.aClass2_Sub1_Sub1_Sub6_1;
					local165.method525(this.anInt365 - super.anInt329, this.anInt363 - super.anInt328, this.anInt364 - this.anInt359);
					if (super.anInt346 == 512) {
						local165.method523();
						local165.method523();
						local165.method523();
					} else if (super.anInt346 == 1024) {
						local165.method523();
						local165.method523();
					} else if (super.anInt346 == 1536) {
						local165.method523();
					}
					@Pc(228) Class2_Sub1_Sub1_Sub6[] local228 = new Class2_Sub1_Sub1_Sub6[] { local10, local165 };
					local10 = new Class2_Sub1_Sub1_Sub6(true, 2, local228, false);
					if (super.anInt346 == 512) {
						local165.method523();
					} else if (super.anInt346 == 1024) {
						local165.method523();
						local165.method523();
					} else if (super.anInt346 == 1536) {
						local165.method523();
						local165.method523();
						local165.method523();
					}
					local165.method525(super.anInt329 - this.anInt365, super.anInt328 - this.anInt363, this.anInt359 - this.anInt364);
				}
			}
			local10.aBoolean189 = true;
			return local10;
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("13544, " + arg0 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IOPHRJNF", name = "c", descriptor = "(Z)Lclient!XBVYIDUH;")
	public Class2_Sub1_Sub1_Sub6 method223() {
		try {
			if (!this.aBoolean84) {
				return null;
			} else if (this.aClass32_2 == null) {
				@Pc(25) boolean local25 = false;
				for (@Pc(27) int local27 = 0; local27 < 12; local27++) {
					@Pc(34) int local34 = this.anIntArray59[local27];
					if (local34 >= 256 && local34 < 512 && !Class25.aClass25Array1[local34 - 256].method291()) {
						local25 = true;
					}
					if (local34 >= 512 && !Class28.method410(local34 - 512).method409((byte) 2, this.anInt374)) {
						local25 = true;
					}
				}
				if (local25) {
					return null;
				}
				@Pc(75) Class2_Sub1_Sub1_Sub6[] local75 = new Class2_Sub1_Sub1_Sub6[12];
				@Pc(77) int local77 = 0;
				for (@Pc(79) int local79 = 0; local79 < 12; local79++) {
					@Pc(86) int local86 = this.anIntArray59[local79];
					@Pc(101) Class2_Sub1_Sub1_Sub6 local101;
					if (local86 >= 256 && local86 < 512) {
						local101 = Class25.aClass25Array1[local86 - 256].method292(this.anInt371);
						if (local101 != null) {
							local75[local77++] = local101;
						}
					}
					if (local86 >= 512) {
						local101 = Class28.method410(local86 - 512).method402(this.anInt374);
						if (local101 != null) {
							local75[local77++] = local101;
						}
					}
				}
				@Pc(138) Class2_Sub1_Sub1_Sub6 local138 = new Class2_Sub1_Sub1_Sub6(local75, 273, local77);
				for (@Pc(140) int local140 = 0; local140 < 5; local140++) {
					if (this.anIntArray60[local140] != 0) {
						local138.method526(client.anIntArrayArray25[local140][0], client.anIntArrayArray25[local140][this.anIntArray60[local140]]);
						if (local140 == 1) {
							local138.method526(client.anIntArray234[0], client.anIntArray234[this.anIntArray60[local140]]);
						}
					}
				}
				return local138;
			} else {
				return this.aClass32_2.method453();
			}
		} catch (@Pc(183) RuntimeException local183) {
			signlink.reporterror("84465, " + true + ", " + local183.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IOPHRJNF", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method221(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			return this.aBoolean84;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("76645, " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IOPHRJNF", name = "a", descriptor = "(BLclient!BFQIDHPO;)V")
	public void method224(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		try {
			arg0.anInt123 = 0;
			this.anInt374 = arg0.method79();
			this.anInt360 = arg0.method80();
			this.anInt366 = arg0.method80();
			this.aClass32_2 = null;
			this.anInt358 = 0;
			@Pc(33) int local33;
			@Pc(45) int local45;
			@Pc(92) int local92;
			for (@Pc(28) int local28 = 0; local28 < 12; local28++) {
				local33 = arg0.method79();
				if (local33 == 0) {
					this.anIntArray59[local28] = 0;
				} else {
					local45 = arg0.method79();
					this.anIntArray59[local28] = (local33 << 8) + local45;
					if (local28 == 0 && this.anIntArray59[0] == 65535) {
						this.aClass32_2 = Class32.method455(arg0.method81());
						break;
					}
					if (this.anIntArray59[local28] >= 512 && this.anIntArray59[local28] - 512 < Class28.anInt598) {
						local92 = Class28.method410(this.anIntArray59[local28] - 512).anInt586;
						if (local92 != 0) {
							this.anInt358 = local92;
						}
					}
				}
			}
			for (local33 = 0; local33 < 5; local33++) {
				local45 = arg0.method79();
				if (local45 < 0 || local45 >= client.anIntArrayArray25[local33].length) {
					local45 = 0;
				}
				this.anIntArray60[local33] = local45;
			}
			super.anInt309 = arg0.method81();
			if (super.anInt309 == 65535) {
				super.anInt309 = -1;
			}
			super.anInt310 = arg0.method81();
			if (super.anInt310 == 65535) {
				super.anInt310 = -1;
			}
			super.anInt311 = arg0.method81();
			if (super.anInt311 == 65535) {
				super.anInt311 = -1;
			}
			super.anInt312 = arg0.method81();
			if (super.anInt312 == 65535) {
				super.anInt312 = -1;
			}
			super.anInt313 = arg0.method81();
			if (super.anInt313 == 65535) {
				super.anInt313 = -1;
			}
			super.anInt314 = arg0.method81();
			if (super.anInt314 == 65535) {
				super.anInt314 = -1;
			}
			super.anInt348 = arg0.method81();
			if (super.anInt348 == 65535) {
				super.anInt348 = -1;
			}
			this.aString11 = Class19.method235(Class19.method232(arg0.method85()));
			this.anInt376 = arg0.method79();
			this.anInt361 = arg0.method81();
			this.aBoolean84 = true;
			this.aLong13 = 0L;
			local45 = this.anIntArray59[5];
			local92 = this.anIntArray59[9];
			this.anIntArray59[5] = local92;
			this.anIntArray59[9] = local45;
			for (@Pc(249) int local249 = 0; local249 < 12; local249++) {
				this.aLong13 <<= 0x4;
				if (this.anIntArray59[local249] >= 256) {
					this.aLong13 += this.anIntArray59[local249] - 256;
				}
			}
			if (this.anIntArray59[0] >= 256) {
				this.aLong13 += this.anIntArray59[0] - 256 >> 4;
			}
			if (this.anIntArray59[1] >= 256) {
				this.aLong13 += this.anIntArray59[1] - 256 >> 8;
			}
			this.anIntArray59[5] = local45;
			this.anIntArray59[9] = local92;
			for (@Pc(331) int local331 = 0; local331 < 5; local331++) {
				this.aLong13 <<= 0x3;
				this.aLong13 += this.anIntArray60[local331];
			}
			this.aLong13 <<= 0x1;
			this.aLong13 += this.anInt374;
		} catch (@Pc(369) RuntimeException local369) {
			signlink.reporterror("5642, " + 5 + ", " + arg0 + ", " + local369.toString());
			throw new RuntimeException();
		}
	}
}
