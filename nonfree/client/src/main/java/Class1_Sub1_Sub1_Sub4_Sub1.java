import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KVXZMJHR")
public final class Class1_Sub1_Sub1_Sub4_Sub1 extends Class1_Sub1_Sub1_Sub4 {

	@OriginalMember(owner = "client!KVXZMJHR", name = "Ib", descriptor = "Lclient!EQSIBNHW;")
	public static Class7 aClass7_1 = new Class7(260, 451);

	@OriginalMember(owner = "client!KVXZMJHR", name = "rb", descriptor = "I")
	public int anInt322;

	@OriginalMember(owner = "client!KVXZMJHR", name = "sb", descriptor = "I")
	public int anInt323;

	@OriginalMember(owner = "client!KVXZMJHR", name = "tb", descriptor = "I")
	public int anInt324;

	@OriginalMember(owner = "client!KVXZMJHR", name = "ub", descriptor = "I")
	public int anInt325;

	@OriginalMember(owner = "client!KVXZMJHR", name = "vb", descriptor = "Lclient!IYSWJGDE;")
	public Class1_Sub1_Sub1_Sub3 aClass1_Sub1_Sub1_Sub3_2;

	@OriginalMember(owner = "client!KVXZMJHR", name = "wb", descriptor = "Lclient!PIPBZEOV;")
	public Class29 aClass29_1;

	@OriginalMember(owner = "client!KVXZMJHR", name = "Ab", descriptor = "I")
	public int anInt328;

	@OriginalMember(owner = "client!KVXZMJHR", name = "Cb", descriptor = "I")
	public int anInt330;

	@OriginalMember(owner = "client!KVXZMJHR", name = "Eb", descriptor = "Ljava/lang/String;")
	public String aString7;

	@OriginalMember(owner = "client!KVXZMJHR", name = "Fb", descriptor = "J")
	private long aLong13;

	@OriginalMember(owner = "client!KVXZMJHR", name = "Gb", descriptor = "I")
	public int anInt331;

	@OriginalMember(owner = "client!KVXZMJHR", name = "Jb", descriptor = "I")
	public int anInt332;

	@OriginalMember(owner = "client!KVXZMJHR", name = "Kb", descriptor = "I")
	public int anInt333;

	@OriginalMember(owner = "client!KVXZMJHR", name = "Mb", descriptor = "I")
	public int anInt334;

	@OriginalMember(owner = "client!KVXZMJHR", name = "Nb", descriptor = "I")
	public int anInt335;

	@OriginalMember(owner = "client!KVXZMJHR", name = "Ob", descriptor = "I")
	public int anInt336;

	@OriginalMember(owner = "client!KVXZMJHR", name = "Pb", descriptor = "I")
	public int anInt337;

	@OriginalMember(owner = "client!KVXZMJHR", name = "Qb", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!KVXZMJHR", name = "qb", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!KVXZMJHR", name = "xb", descriptor = "I")
	public int anInt326 = -1;

	@OriginalMember(owner = "client!KVXZMJHR", name = "yb", descriptor = "I")
	private int anInt327 = -22770;

	@OriginalMember(owner = "client!KVXZMJHR", name = "zb", descriptor = "J")
	private long aLong12 = -1L;

	@OriginalMember(owner = "client!KVXZMJHR", name = "Bb", descriptor = "I")
	public int anInt329 = -1;

	@OriginalMember(owner = "client!KVXZMJHR", name = "Db", descriptor = "Z")
	public boolean aBoolean64 = false;

	@OriginalMember(owner = "client!KVXZMJHR", name = "Hb", descriptor = "Z")
	public boolean aBoolean65 = false;

	@OriginalMember(owner = "client!KVXZMJHR", name = "Lb", descriptor = "[I")
	public int[] anIntArray113 = new int[12];

	@OriginalMember(owner = "client!KVXZMJHR", name = "Rb", descriptor = "[I")
	public int[] anIntArray114 = new int[5];

	@OriginalMember(owner = "client!KVXZMJHR", name = "b", descriptor = "(I)Lclient!IYSWJGDE;")
	public Class1_Sub1_Sub1_Sub3 method213() {
		try {
			if (!this.aBoolean65) {
				return null;
			} else if (this.aClass29_1 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray113[local18];
					if (local25 >= 256 && local25 < 512 && !Class37.aClass37Array1[local25 - 256].method444()) {
						local16 = true;
					}
					if (local25 >= 512 && !Class39.method488(local25 - 512).method493(this.anInt338)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(66) Class1_Sub1_Sub1_Sub3[] local66 = new Class1_Sub1_Sub1_Sub3[12];
				@Pc(74) int local74 = 0;
				for (@Pc(76) int local76 = 0; local76 < 12; local76++) {
					@Pc(83) int local83 = this.anIntArray113[local76];
					@Pc(97) Class1_Sub1_Sub1_Sub3 local97;
					if (local83 >= 256 && local83 < 512) {
						local97 = Class37.aClass37Array1[local83 - 256].method445();
						if (local97 != null) {
							local66[local74++] = local97;
						}
					}
					if (local83 >= 512) {
						local97 = Class39.method488(local83 - 512).method491(this.anInt338, (byte) 3);
						if (local97 != null) {
							local66[local74++] = local97;
						}
					}
				}
				@Pc(134) Class1_Sub1_Sub1_Sub3 local134 = new Class1_Sub1_Sub1_Sub3((byte) 9, local74, local66);
				for (@Pc(136) int local136 = 0; local136 < 5; local136++) {
					if (this.anIntArray114[local136] != 0) {
						local134.method161(client.anIntArrayArray24[local136][0], client.anIntArrayArray24[local136][this.anIntArray114[local136]]);
						if (local136 == 1) {
							local134.method161(client.anIntArray261[0], client.anIntArray261[this.anIntArray114[local136]]);
						}
					}
				}
				return local134;
			} else {
				return this.aClass29_1.method327();
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("96449, " + 0 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KVXZMJHR", name = "c", descriptor = "(I)Lclient!IYSWJGDE;")
	private Class1_Sub1_Sub1_Sub3 method214() {
		try {
			if (this.aClass29_1 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt491 >= 0 && super.anInt494 == 0) {
					local6 = Class19.aClass19Array1[super.anInt491].anIntArray99[super.anInt492];
				} else if (super.anInt472 >= 0) {
					local6 = Class19.aClass19Array1[super.anInt472].anIntArray99[super.anInt473];
				}
				return this.aClass29_1.method329(this.anInt327, null, local6, -1);
			}
			@Pc(49) long local49 = this.aLong13;
			@Pc(58) int local58 = -1;
			@Pc(60) int local60 = -1;
			@Pc(62) int local62 = -1;
			@Pc(64) int local64 = -1;
			if (super.anInt491 >= 0 && super.anInt494 == 0) {
				@Pc(75) Class19 local75 = Class19.aClass19Array1[super.anInt491];
				local58 = local75.anIntArray99[super.anInt492];
				if (super.anInt472 >= 0 && super.anInt472 != super.anInt453) {
					local60 = Class19.aClass19Array1[super.anInt472].anIntArray99[super.anInt473];
				}
				if (local75.anInt214 >= 0) {
					local62 = local75.anInt214;
					local49 += local62 - this.anIntArray113[5] << 8;
				}
				if (local75.anInt215 >= 0) {
					local64 = local75.anInt215;
					local49 += local64 - this.anIntArray113[3] << 16;
				}
			} else if (super.anInt472 >= 0) {
				local58 = Class19.aClass19Array1[super.anInt472].anIntArray99[super.anInt473];
			}
			@Pc(153) Class1_Sub1_Sub1_Sub3 local153 = (Class1_Sub1_Sub1_Sub3) aClass7_1.method40(local49);
			@Pc(159) int local159;
			@Pc(166) int local166;
			if (local153 == null) {
				@Pc(157) boolean local157 = false;
				for (local159 = 0; local159 < 12; local159++) {
					local166 = this.anIntArray113[local159];
					if (local64 >= 0 && local159 == 3) {
						local166 = local64;
					}
					if (local62 >= 0 && local159 == 5) {
						local166 = local62;
					}
					if (local166 >= 256 && local166 < 512 && !Class37.aClass37Array1[local166 - 256].method442()) {
						local157 = true;
					}
					if (local166 >= 512 && !Class39.method488(local166 - 512).method496(this.anInt338)) {
						local157 = true;
					}
				}
				if (local157) {
					if (this.aLong12 != -1L) {
						local153 = (Class1_Sub1_Sub1_Sub3) aClass7_1.method40(this.aLong12);
					}
					if (local153 == null) {
						return null;
					}
				}
			}
			if (local153 == null) {
				@Pc(236) Class1_Sub1_Sub1_Sub3[] local236 = new Class1_Sub1_Sub1_Sub3[12];
				local159 = 0;
				@Pc(247) int local247;
				for (local166 = 0; local166 < 12; local166++) {
					local247 = this.anIntArray113[local166];
					if (local64 >= 0 && local166 == 3) {
						local247 = local64;
					}
					if (local62 >= 0 && local166 == 5) {
						local247 = local62;
					}
					@Pc(275) Class1_Sub1_Sub1_Sub3 local275;
					if (local247 >= 256 && local247 < 512) {
						local275 = Class37.aClass37Array1[local247 - 256].method443();
						if (local275 != null) {
							local236[local159++] = local275;
						}
					}
					if (local247 >= 512) {
						local275 = Class39.method488(local247 - 512).method486((byte) 3, this.anInt338);
						if (local275 != null) {
							local236[local159++] = local275;
						}
					}
				}
				local153 = new Class1_Sub1_Sub1_Sub3((byte) 9, local159, local236);
				for (local247 = 0; local247 < 5; local247++) {
					if (this.anIntArray114[local247] != 0) {
						local153.method161(client.anIntArrayArray24[local247][0], client.anIntArrayArray24[local247][this.anIntArray114[local247]]);
						if (local247 == 1) {
							local153.method161(client.anIntArray261[0], client.anIntArray261[this.anIntArray114[local247]]);
						}
					}
				}
				local153.method154();
				local153.method164(64, 850, -30, -50, -30, true);
				aClass7_1.method41(825, local49, local153);
				this.aLong12 = local49;
			}
			if (this.aBoolean64) {
				return local153;
			}
			@Pc(380) Class1_Sub1_Sub1_Sub3 local380 = Class1_Sub1_Sub1_Sub3.aClass1_Sub1_Sub1_Sub3_1;
			local380.method149(Class30.method334(local58) & Class30.method334(local60), local153);
			if (local58 != -1 && local60 != -1) {
				local380.method156(local60, local58, Class19.aClass19Array1[super.anInt491].anIntArray102, (byte) 8);
			} else if (local58 != -1) {
				local380.method155(local58);
			}
			local380.method151();
			local380.anIntArrayArray8 = null;
			local380.anIntArrayArray7 = null;
			return local380;
		} catch (@Pc(428) RuntimeException local428) {
			signlink.reporterror("86400, " + -37900 + ", " + local428.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KVXZMJHR", name = "a", descriptor = "(ILclient!SVWJKJVI;)V")
	public void method215(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		try {
			arg0.anInt624 = 0;
			this.anInt338 = arg0.method405();
			this.anInt326 = arg0.method406();
			this.anInt329 = arg0.method406();
			this.aClass29_1 = null;
			this.anInt322 = 0;
			@Pc(29) int local29;
			@Pc(41) int local41;
			@Pc(88) int local88;
			for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
				local29 = arg0.method405();
				if (local29 == 0) {
					this.anIntArray113[local24] = 0;
				} else {
					local41 = arg0.method405();
					this.anIntArray113[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray113[0] == 65535) {
						this.aClass29_1 = Class29.method326(arg0.method407());
						break;
					}
					if (this.anIntArray113[local24] >= 512 && this.anIntArray113[local24] - 512 < Class39.anInt652) {
						local88 = Class39.method488(this.anIntArray113[local24] - 512).anInt661;
						if (local88 != 0) {
							this.anInt322 = local88;
						}
					}
				}
			}
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg0.method405();
				if (local41 < 0 || local41 >= client.anIntArrayArray24[local29].length) {
					local41 = 0;
				}
				this.anIntArray114[local29] = local41;
			}
			super.anInt453 = arg0.method407();
			if (super.anInt453 == 65535) {
				super.anInt453 = -1;
			}
			super.anInt454 = arg0.method407();
			if (super.anInt454 == 65535) {
				super.anInt454 = -1;
			}
			super.anInt487 = arg0.method407();
			if (super.anInt487 == 65535) {
				super.anInt487 = -1;
			}
			super.anInt488 = arg0.method407();
			if (super.anInt488 == 65535) {
				super.anInt488 = -1;
			}
			super.anInt489 = arg0.method407();
			if (super.anInt489 == 65535) {
				super.anInt489 = -1;
			}
			super.anInt490 = arg0.method407();
			if (super.anInt490 == 65535) {
				super.anInt490 = -1;
			}
			super.anInt498 = arg0.method407();
			if (super.anInt498 == 65535) {
				super.anInt498 = -1;
			}
			this.aString7 = Class2.method18(Class2.method15(357, arg0.method411()));
			this.anInt330 = arg0.method405();
			this.anInt331 = arg0.method407();
			this.aBoolean65 = true;
			this.aLong13 = 0L;
			local41 = this.anIntArray113[5];
			local88 = this.anIntArray113[9];
			this.anIntArray113[5] = local88;
			this.anIntArray113[9] = local41;
			for (@Pc(248) int local248 = 0; local248 < 12; local248++) {
				this.aLong13 <<= 0x4;
				if (this.anIntArray113[local248] >= 256) {
					this.aLong13 += this.anIntArray113[local248] - 256;
				}
			}
			if (this.anIntArray113[0] >= 256) {
				this.aLong13 += this.anIntArray113[0] - 256 >> 4;
			}
			if (this.anIntArray113[1] >= 256) {
				this.aLong13 += this.anIntArray113[1] - 256 >> 8;
			}
			this.anIntArray113[5] = local41;
			this.anIntArray113[9] = local88;
			for (@Pc(330) int local330 = 0; local330 < 5; local330++) {
				this.aLong13 <<= 0x3;
				this.aLong13 += this.anIntArray114[local330];
			}
			this.aLong13 <<= 0x1;
			this.aLong13 += this.anInt338;
		} catch (@Pc(368) RuntimeException local368) {
			signlink.reporterror("30099, " + 0 + ", " + arg0 + ", " + local368.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KVXZMJHR", name = "a", descriptor = "(Z)Lclient!IYSWJGDE;")
	@Override
	protected Class1_Sub1_Sub1_Sub3 method513() {
		try {
			if (!this.aBoolean65) {
				return null;
			}
			@Pc(10) Class1_Sub1_Sub1_Sub3 local10 = this.method214();
			if (local10 == null) {
				return null;
			}
			super.anInt452 = local10.anInt724;
			local10.aBoolean42 = true;
			if (this.aBoolean64) {
				return local10;
			}
			if (super.anInt479 != -1 && super.anInt480 != -1) {
				@Pc(39) Class34 local39 = Class34.aClass34Array1[super.anInt479];
				@Pc(42) Class1_Sub1_Sub1_Sub3 local42 = local39.method390();
				if (local42 != null) {
					@Pc(56) Class1_Sub1_Sub1_Sub3 local56 = new Class1_Sub1_Sub1_Sub3(Class30.method334(super.anInt480), local42, 946, true, false);
					local56.method160(-super.anInt483, 0, 600, 0);
					local56.method154();
					local56.method155(local39.aClass19_2.anIntArray99[super.anInt480]);
					local56.anIntArrayArray8 = null;
					local56.anIntArrayArray7 = null;
					if (local39.anInt584 != 128 || local39.anInt585 != 128) {
						local56.method163(local39.anInt584, local39.anInt584, local39.anInt585);
					}
					local56.method164(local39.anInt587 + 64, local39.anInt588 + 850, -30, -50, -30, true);
					@Pc(124) Class1_Sub1_Sub1_Sub3[] local124 = new Class1_Sub1_Sub1_Sub3[] { local10, local56 };
					local10 = new Class1_Sub1_Sub1_Sub3(local124, 2, true, (byte) 2);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub3_2 != null) {
				if (client.anInt953 >= this.anInt333) {
					this.aClass1_Sub1_Sub1_Sub3_2 = null;
				}
				if (client.anInt953 >= this.anInt332 && client.anInt953 < this.anInt333) {
					@Pc(153) Class1_Sub1_Sub1_Sub3 local153 = this.aClass1_Sub1_Sub1_Sub3_2;
					local153.method160(this.anInt324 - this.anInt328, this.anInt325 - super.anInt459, 600, this.anInt323 - super.anInt458);
					if (super.anInt451 == 512) {
						local153.method158();
						local153.method158();
						local153.method158();
					} else if (super.anInt451 == 1024) {
						local153.method158();
						local153.method158();
					} else if (super.anInt451 == 1536) {
						local153.method158();
					}
					@Pc(216) Class1_Sub1_Sub1_Sub3[] local216 = new Class1_Sub1_Sub1_Sub3[] { local10, local153 };
					local10 = new Class1_Sub1_Sub1_Sub3(local216, 2, true, (byte) 2);
					if (super.anInt451 == 512) {
						local153.method158();
					} else if (super.anInt451 == 1024) {
						local153.method158();
						local153.method158();
					} else if (super.anInt451 == 1536) {
						local153.method158();
						local153.method158();
						local153.method158();
					}
					local153.method160(this.anInt328 - this.anInt324, super.anInt459 - this.anInt325, 600, super.anInt458 - this.anInt323);
				}
			}
			local10.aBoolean42 = true;
			return local10;
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("47977, " + true + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KVXZMJHR", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method311() {
		try {
			return this.aBoolean65;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("11618, " + 5 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}
}
