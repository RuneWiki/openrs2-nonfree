import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MTFZASIN")
public final class Class5_Sub1_Sub1_Sub3_Sub2 extends Class5_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!MTFZASIN", name = "Nb", descriptor = "Lclient!DMOAMUBS;")
	public static Class12 aClass12_7 = new Class12(260, true);

	@OriginalMember(owner = "client!MTFZASIN", name = "rb", descriptor = "I")
	public int anInt509;

	@OriginalMember(owner = "client!MTFZASIN", name = "sb", descriptor = "I")
	public int anInt510;

	@OriginalMember(owner = "client!MTFZASIN", name = "ub", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!MTFZASIN", name = "xb", descriptor = "I")
	private int anInt512;

	@OriginalMember(owner = "client!MTFZASIN", name = "yb", descriptor = "Lclient!KFUEEJVZ;")
	public Class24 aClass24_2;

	@OriginalMember(owner = "client!MTFZASIN", name = "Ab", descriptor = "I")
	public int anInt513;

	@OriginalMember(owner = "client!MTFZASIN", name = "Bb", descriptor = "I")
	public int anInt514;

	@OriginalMember(owner = "client!MTFZASIN", name = "Cb", descriptor = "I")
	public int anInt515;

	@OriginalMember(owner = "client!MTFZASIN", name = "Db", descriptor = "I")
	public int anInt516;

	@OriginalMember(owner = "client!MTFZASIN", name = "Eb", descriptor = "I")
	public int anInt517;

	@OriginalMember(owner = "client!MTFZASIN", name = "Gb", descriptor = "I")
	public int anInt519;

	@OriginalMember(owner = "client!MTFZASIN", name = "Ib", descriptor = "I")
	public int anInt520;

	@OriginalMember(owner = "client!MTFZASIN", name = "Jb", descriptor = "I")
	public int anInt521;

	@OriginalMember(owner = "client!MTFZASIN", name = "Kb", descriptor = "I")
	public int anInt522;

	@OriginalMember(owner = "client!MTFZASIN", name = "Lb", descriptor = "Lclient!VYUQHOMO;")
	public Class5_Sub1_Sub1_Sub6 aClass5_Sub1_Sub1_Sub6_1;

	@OriginalMember(owner = "client!MTFZASIN", name = "Ob", descriptor = "I")
	private int anInt523;

	@OriginalMember(owner = "client!MTFZASIN", name = "Pb", descriptor = "Ljava/lang/String;")
	public String aString10;

	@OriginalMember(owner = "client!MTFZASIN", name = "Sb", descriptor = "I")
	public int anInt525;

	@OriginalMember(owner = "client!MTFZASIN", name = "Tb", descriptor = "I")
	public int anInt526;

	@OriginalMember(owner = "client!MTFZASIN", name = "tb", descriptor = "I")
	private int anInt511 = 2;

	@OriginalMember(owner = "client!MTFZASIN", name = "vb", descriptor = "[I")
	public int[] anIntArray106 = new int[5];

	@OriginalMember(owner = "client!MTFZASIN", name = "wb", descriptor = "B")
	private byte aByte19 = 23;

	@OriginalMember(owner = "client!MTFZASIN", name = "zb", descriptor = "Z")
	public boolean aBoolean140 = false;

	@OriginalMember(owner = "client!MTFZASIN", name = "Fb", descriptor = "I")
	private int anInt518 = 831;

	@OriginalMember(owner = "client!MTFZASIN", name = "Hb", descriptor = "Z")
	public boolean aBoolean141 = false;

	@OriginalMember(owner = "client!MTFZASIN", name = "Mb", descriptor = "[I")
	public int[] anIntArray107 = new int[12];

	@OriginalMember(owner = "client!MTFZASIN", name = "Qb", descriptor = "I")
	private int anInt524 = 4006;

	@OriginalMember(owner = "client!MTFZASIN", name = "Rb", descriptor = "J")
	private long aLong19 = -1L;

	@OriginalMember(owner = "client!MTFZASIN", name = "Ub", descriptor = "I")
	public int anInt527 = -1;

	@OriginalMember(owner = "client!MTFZASIN", name = "Vb", descriptor = "I")
	public int anInt528 = -1;

	@OriginalMember(owner = "client!MTFZASIN", name = "b", descriptor = "(Z)Lclient!VYUQHOMO;")
	private Class5_Sub1_Sub1_Sub6 method240() {
		try {
			if (this.aClass24_2 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt463 >= 0 && super.anInt466 == 0) {
					local6 = Class32.aClass32Array1[super.anInt463].anIntArray96[super.anInt464];
				} else if (super.anInt493 >= 0) {
					local6 = Class32.aClass32Array1[super.anInt493].anIntArray96[super.anInt494];
				}
				return this.aClass24_2.method157(local6, null, -1);
			}
			@Pc(48) long local48 = this.aLong18;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (super.anInt463 >= 0 && super.anInt466 == 0) {
				@Pc(67) Class32 local67 = Class32.aClass32Array1[super.anInt463];
				local50 = local67.anIntArray96[super.anInt464];
				if (super.anInt493 >= 0 && super.anInt493 != super.anInt506) {
					local52 = Class32.aClass32Array1[super.anInt493].anIntArray96[super.anInt494];
				}
				if (local67.anInt444 >= 0) {
					local54 = local67.anInt444;
					local48 += local54 - this.anIntArray107[5] << 8;
				}
				if (local67.anInt445 >= 0) {
					local56 = local67.anInt445;
					local48 += local56 - this.anIntArray107[3] << 16;
				}
			} else if (super.anInt493 >= 0) {
				local50 = Class32.aClass32Array1[super.anInt493].anIntArray96[super.anInt494];
			}
			@Pc(145) Class5_Sub1_Sub1_Sub6 local145 = (Class5_Sub1_Sub1_Sub6) aClass12_7.method78(local48);
			@Pc(156) int local156;
			@Pc(163) int local163;
			if (local145 == null) {
				@Pc(154) boolean local154 = false;
				for (local156 = 0; local156 < 12; local156++) {
					local163 = this.anIntArray107[local156];
					if (local56 >= 0 && local156 == 3) {
						local163 = local56;
					}
					if (local54 >= 0 && local156 == 5) {
						local163 = local54;
					}
					if (local163 >= 256 && local163 < 512 && !Class7.aClass7Array1[local163 - 256].method29(this.anInt523)) {
						local154 = true;
					}
					if (local163 >= 512 && !Class17.method130(local163 - 512).method121(this.anInt512)) {
						local154 = true;
					}
				}
				if (local154) {
					if (this.aLong19 != -1L) {
						local145 = (Class5_Sub1_Sub1_Sub6) aClass12_7.method78(this.aLong19);
					}
					if (local145 == null) {
						return null;
					}
				}
			}
			if (local145 == null) {
				@Pc(234) Class5_Sub1_Sub1_Sub6[] local234 = new Class5_Sub1_Sub1_Sub6[12];
				local156 = 0;
				@Pc(245) int local245;
				for (local163 = 0; local163 < 12; local163++) {
					local245 = this.anIntArray107[local163];
					if (local56 >= 0 && local163 == 3) {
						local245 = local56;
					}
					if (local54 >= 0 && local163 == 5) {
						local245 = local54;
					}
					@Pc(273) Class5_Sub1_Sub1_Sub6 local273;
					if (local245 >= 256 && local245 < 512) {
						local273 = Class7.aClass7Array1[local245 - 256].method30((byte) 7);
						if (local273 != null) {
							local234[local156++] = local273;
						}
					}
					if (local245 >= 512) {
						local273 = Class17.method130(local245 - 512).method127(this.anInt512);
						if (local273 != null) {
							local234[local156++] = local273;
						}
					}
				}
				local145 = new Class5_Sub1_Sub1_Sub6(local234, this.anInt524, local156);
				for (local245 = 0; local245 < 5; local245++) {
					if (this.anIntArray106[local245] != 0) {
						local145.method391(client.anIntArrayArray22[local245][0], client.anIntArrayArray22[local245][this.anIntArray106[local245]]);
						if (local245 == 1) {
							local145.method391(client.anIntArray240[0], client.anIntArray240[this.anIntArray106[local245]]);
						}
					}
				}
				local145.method384();
				local145.method394(64, 850, -30, -50, -30, true);
				aClass12_7.method79(local48, local145);
				this.aLong19 = local48;
			}
			if (this.aBoolean141) {
				return local145;
			}
			@Pc(379) Class5_Sub1_Sub1_Sub6 local379 = Class5_Sub1_Sub1_Sub6.aClass5_Sub1_Sub1_Sub6_2;
			local379.method379(local145, Class2.method11(local50) & Class2.method11(local52));
			if (local50 != -1 && local52 != -1) {
				local379.method386(Class32.aClass32Array1[super.anInt463].anIntArray99, local52, local50);
			} else if (local50 != -1) {
				local379.method385(local50);
			}
			local379.method381();
			local379.anIntArrayArray13 = null;
			local379.anIntArrayArray12 = null;
			return local379;
		} catch (@Pc(427) RuntimeException local427) {
			signlink.reporterror("50330, " + true + ", " + local427.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MTFZASIN", name = "a", descriptor = "(BLclient!XGRGMPUQ;)V")
	public void method241(@OriginalArg(1) Class5_Sub1_Sub4 arg0) {
		try {
			arg0.anInt755 = 0;
			this.anInt512 = arg0.method437();
			this.anInt528 = arg0.method438();
			this.anInt527 = arg0.method438();
			this.aClass24_2 = null;
			this.anInt509 = 0;
			@Pc(29) int local29;
			@Pc(41) int local41;
			@Pc(88) int local88;
			for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
				local29 = arg0.method437();
				if (local29 == 0) {
					this.anIntArray107[local24] = 0;
				} else {
					local41 = arg0.method437();
					this.anIntArray107[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray107[0] == 65535) {
						this.aClass24_2 = Class24.method160(arg0.method439());
						break;
					}
					if (this.anIntArray107[local24] >= 512 && this.anIntArray107[local24] - 512 < Class17.anInt255) {
						local88 = Class17.method130(this.anIntArray107[local24] - 512).anInt263;
						if (local88 != 0) {
							this.anInt509 = local88;
						}
					}
				}
			}
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg0.method437();
				if (local41 < 0 || local41 >= client.anIntArrayArray22[local29].length) {
					local41 = 0;
				}
				this.anIntArray106[local29] = local41;
			}
			super.anInt506 = arg0.method439();
			if (super.anInt506 == 65535) {
				super.anInt506 = -1;
			}
			super.anInt507 = arg0.method439();
			if (super.anInt507 == 65535) {
				super.anInt507 = -1;
			}
			super.anInt473 = arg0.method439();
			if (super.anInt473 == 65535) {
				super.anInt473 = -1;
			}
			super.anInt474 = arg0.method439();
			if (super.anInt474 == 65535) {
				super.anInt474 = -1;
			}
			super.anInt475 = arg0.method439();
			if (super.anInt475 == 65535) {
				super.anInt475 = -1;
			}
			super.anInt476 = arg0.method439();
			if (super.anInt476 == 65535) {
				super.anInt476 = -1;
			}
			super.anInt505 = arg0.method439();
			if (super.anInt505 == 65535) {
				super.anInt505 = -1;
			}
			this.aString10 = Class11.method51(Class11.method48(this.anInt511, arg0.method443()));
			this.anInt517 = arg0.method437();
			this.anInt510 = arg0.method439();
			this.aBoolean140 = true;
			this.aLong18 = 0L;
			for (local41 = 0; local41 < 12; local41++) {
				this.aLong18 <<= 0x4;
				if (this.anIntArray107[local41] >= 256) {
					this.aLong18 += this.anIntArray107[local41] - 256;
				}
			}
			if (this.anIntArray107[0] >= 256) {
				this.aLong18 += this.anIntArray107[0] - 256 >> 4;
			}
			if (this.anIntArray107[1] >= 256) {
				this.aLong18 += this.anIntArray107[1] - 256 >> 8;
			}
			for (local88 = 0; local88 < 5; local88++) {
				this.aLong18 <<= 0x3;
				this.aLong18 += this.anIntArray106[local88];
			}
			this.aLong18 <<= 0x1;
			this.aLong18 += this.anInt512;
		} catch (@Pc(340) RuntimeException local340) {
			signlink.reporterror("45055, " + -104 + ", " + arg0 + ", " + local340.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MTFZASIN", name = "a", descriptor = "(I)Lclient!VYUQHOMO;")
	@Override
	protected Class5_Sub1_Sub1_Sub6 method372(@OriginalArg(0) int arg0) {
		try {
			if (!this.aBoolean140) {
				return null;
			}
			@Pc(10) Class5_Sub1_Sub1_Sub6 local10 = this.method240();
			if (local10 == null) {
				return null;
			}
			super.anInt508 = local10.anInt679;
			@Pc(22) boolean local22 = false;
			local10.aBoolean197 = true;
			if (this.aBoolean141) {
				return local10;
			}
			if (super.anInt487 != -1 && super.anInt488 != -1) {
				@Pc(43) Class6 local43 = Class6.aClass6Array1[super.anInt487];
				@Pc(46) Class5_Sub1_Sub1_Sub6 local46 = local43.method26();
				if (local46 != null) {
					@Pc(61) Class5_Sub1_Sub1_Sub6 local61 = new Class5_Sub1_Sub1_Sub6(true, Class2.method11(super.anInt488), local46, this.aByte19, false);
					local61.method390(0, -super.anInt491, 0);
					local61.method384();
					local61.method385(local43.aClass32_2.anIntArray96[super.anInt488]);
					local61.anIntArrayArray13 = null;
					local61.anIntArrayArray12 = null;
					if (local43.anInt32 != 128 || local43.anInt33 != 128) {
						local61.method393(local43.anInt32, local43.anInt33, local43.anInt32);
					}
					local61.method394(local43.anInt35 + 64, local43.anInt36 + 850, -30, -50, -30, true);
					@Pc(129) Class5_Sub1_Sub1_Sub6[] local129 = new Class5_Sub1_Sub1_Sub6[] { local10, local61 };
					local10 = new Class5_Sub1_Sub1_Sub6(true, 2, 20, local129);
				}
			}
			if (this.aClass5_Sub1_Sub1_Sub6_1 != null) {
				if (client.anInt1022 >= this.anInt526) {
					this.aClass5_Sub1_Sub1_Sub6_1 = null;
				}
				if (client.anInt1022 >= this.anInt525 && client.anInt1022 < this.anInt526) {
					@Pc(158) Class5_Sub1_Sub1_Sub6 local158 = this.aClass5_Sub1_Sub1_Sub6_1;
					local158.method390(this.anInt522 - super.anInt502, this.anInt521 - this.anInt519, this.anInt520 - super.anInt501);
					if (super.anInt486 == 512) {
						local158.method388();
						local158.method388();
						local158.method388();
					} else if (super.anInt486 == 1024) {
						local158.method388();
						local158.method388();
					} else if (super.anInt486 == 1536) {
						local158.method388();
					}
					@Pc(221) Class5_Sub1_Sub1_Sub6[] local221 = new Class5_Sub1_Sub1_Sub6[] { local10, local158 };
					local10 = new Class5_Sub1_Sub1_Sub6(true, 2, 20, local221);
					if (super.anInt486 == 512) {
						local158.method388();
					} else if (super.anInt486 == 1024) {
						local158.method388();
						local158.method388();
					} else if (super.anInt486 == 1536) {
						local158.method388();
						local158.method388();
						local158.method388();
					}
					local158.method390(super.anInt502 - this.anInt522, this.anInt519 - this.anInt521, super.anInt501 - this.anInt520);
				}
			}
			local10.aBoolean197 = true;
			return local10;
		} catch (@Pc(287) RuntimeException local287) {
			signlink.reporterror("69007, " + arg0 + ", " + local287.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MTFZASIN", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method236() {
		try {
			return this.aBoolean140;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("76178, " + -22030 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MTFZASIN", name = "a", descriptor = "(B)Lclient!VYUQHOMO;")
	public Class5_Sub1_Sub1_Sub6 method242(@OriginalArg(0) byte arg0) {
		try {
			if (!this.aBoolean140) {
				return null;
			} else if (this.aClass24_2 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray107[local18];
					if (local25 >= 256 && local25 < 512 && !Class7.aClass7Array1[local25 - 256].method31()) {
						local16 = true;
					}
					if (local25 >= 512 && !Class17.method130(local25 - 512).method124(this.anInt512)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(66) Class5_Sub1_Sub1_Sub6[] local66 = new Class5_Sub1_Sub1_Sub6[12];
				@Pc(68) int local68 = 0;
				for (@Pc(70) int local70 = 0; local70 < 12; local70++) {
					@Pc(77) int local77 = this.anIntArray107[local70];
					@Pc(91) Class5_Sub1_Sub1_Sub6 local91;
					if (local77 >= 256 && local77 < 512) {
						local91 = Class7.aClass7Array1[local77 - 256].method32();
						if (local91 != null) {
							local66[local68++] = local91;
						}
					}
					if (local77 >= 512) {
						local91 = Class17.method130(local77 - 512).method126(this.anInt512);
						if (local91 != null) {
							local66[local68++] = local91;
						}
					}
				}
				@Pc(129) Class5_Sub1_Sub1_Sub6 local129 = new Class5_Sub1_Sub1_Sub6(local66, this.anInt524, local68);
				@Pc(134) boolean local134 = false;
				for (@Pc(142) int local142 = 0; local142 < 5; local142++) {
					if (this.anIntArray106[local142] != 0) {
						local129.method391(client.anIntArrayArray22[local142][0], client.anIntArrayArray22[local142][this.anIntArray106[local142]]);
						if (local142 == 1) {
							local129.method391(client.anIntArray240[0], client.anIntArray240[this.anIntArray106[local142]]);
						}
					}
				}
				return local129;
			} else {
				return this.aClass24_2.method156();
			}
		} catch (@Pc(185) RuntimeException local185) {
			signlink.reporterror("44108, " + arg0 + ", " + local185.toString());
			throw new RuntimeException();
		}
	}
}
