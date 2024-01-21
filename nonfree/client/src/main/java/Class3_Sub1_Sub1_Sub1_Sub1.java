import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EJJAKGTE")
public final class Class3_Sub1_Sub1_Sub1_Sub1 extends Class3_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!EJJAKGTE", name = "Hb", descriptor = "Lclient!VNWSQIXW;")
	public static Class35 aClass35_3 = new Class35(260, (byte) 8);

	@OriginalMember(owner = "client!EJJAKGTE", name = "qb", descriptor = "I")
	public int anInt172;

	@OriginalMember(owner = "client!EJJAKGTE", name = "tb", descriptor = "Lclient!DDJHHGTJ;")
	public Class5 aClass5_1;

	@OriginalMember(owner = "client!EJJAKGTE", name = "ub", descriptor = "I")
	private int anInt173;

	@OriginalMember(owner = "client!EJJAKGTE", name = "wb", descriptor = "I")
	public int anInt174;

	@OriginalMember(owner = "client!EJJAKGTE", name = "yb", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!EJJAKGTE", name = "Cb", descriptor = "I")
	public int anInt177;

	@OriginalMember(owner = "client!EJJAKGTE", name = "Db", descriptor = "I")
	public int anInt178;

	@OriginalMember(owner = "client!EJJAKGTE", name = "Eb", descriptor = "I")
	public int anInt179;

	@OriginalMember(owner = "client!EJJAKGTE", name = "Fb", descriptor = "Lclient!OQIGXOFQ;")
	public Class3_Sub1_Sub1_Sub3 aClass3_Sub1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!EJJAKGTE", name = "Ib", descriptor = "I")
	public int anInt180;

	@OriginalMember(owner = "client!EJJAKGTE", name = "Jb", descriptor = "I")
	public int anInt181;

	@OriginalMember(owner = "client!EJJAKGTE", name = "Kb", descriptor = "I")
	public int anInt182;

	@OriginalMember(owner = "client!EJJAKGTE", name = "Lb", descriptor = "I")
	public int anInt183;

	@OriginalMember(owner = "client!EJJAKGTE", name = "Nb", descriptor = "I")
	public int anInt185;

	@OriginalMember(owner = "client!EJJAKGTE", name = "Ob", descriptor = "I")
	public int anInt186;

	@OriginalMember(owner = "client!EJJAKGTE", name = "Qb", descriptor = "I")
	public int anInt188;

	@OriginalMember(owner = "client!EJJAKGTE", name = "Rb", descriptor = "J")
	private long aLong10;

	@OriginalMember(owner = "client!EJJAKGTE", name = "Tb", descriptor = "I")
	public int anInt189;

	@OriginalMember(owner = "client!EJJAKGTE", name = "Wb", descriptor = "I")
	private int anInt191;

	@OriginalMember(owner = "client!EJJAKGTE", name = "rb", descriptor = "B")
	private byte aByte4 = 3;

	@OriginalMember(owner = "client!EJJAKGTE", name = "sb", descriptor = "[I")
	public int[] anIntArray25 = new int[12];

	@OriginalMember(owner = "client!EJJAKGTE", name = "vb", descriptor = "Z")
	private boolean aBoolean25 = true;

	@OriginalMember(owner = "client!EJJAKGTE", name = "xb", descriptor = "I")
	public int anInt175 = -1;

	@OriginalMember(owner = "client!EJJAKGTE", name = "zb", descriptor = "J")
	private long aLong9 = -1L;

	@OriginalMember(owner = "client!EJJAKGTE", name = "Ab", descriptor = "[I")
	public int[] anIntArray26 = new int[5];

	@OriginalMember(owner = "client!EJJAKGTE", name = "Bb", descriptor = "I")
	private int anInt176 = -64;

	@OriginalMember(owner = "client!EJJAKGTE", name = "Gb", descriptor = "Z")
	public boolean aBoolean26 = false;

	@OriginalMember(owner = "client!EJJAKGTE", name = "Mb", descriptor = "I")
	public int anInt184 = -1;

	@OriginalMember(owner = "client!EJJAKGTE", name = "Pb", descriptor = "I")
	private int anInt187 = -261;

	@OriginalMember(owner = "client!EJJAKGTE", name = "Sb", descriptor = "Z")
	public boolean aBoolean27 = false;

	@OriginalMember(owner = "client!EJJAKGTE", name = "Ub", descriptor = "Z")
	private boolean aBoolean28 = false;

	@OriginalMember(owner = "client!EJJAKGTE", name = "Vb", descriptor = "I")
	private int anInt190 = 1;

	@OriginalMember(owner = "client!EJJAKGTE", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method214() {
		try {
			return this.aBoolean27;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("49652, " + -528 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EJJAKGTE", name = "a", descriptor = "(B)Lclient!OQIGXOFQ;")
	private Class3_Sub1_Sub1_Sub3 method55() {
		try {
			if (this.aClass5_1 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt375 >= 0 && super.anInt378 == 0) {
					local6 = Class39.aClass39Array1[super.anInt375].anIntArray183[super.anInt376];
				} else if (super.anInt371 >= 0) {
					local6 = Class39.aClass39Array1[super.anInt371].anIntArray183[super.anInt372];
				}
				return this.aClass5_1.method20(null, local6, -1);
			}
			@Pc(48) long local48 = this.aLong10;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (super.anInt375 >= 0 && super.anInt378 == 0) {
				@Pc(67) Class39 local67 = Class39.aClass39Array1[super.anInt375];
				local50 = local67.anIntArray183[super.anInt376];
				if (super.anInt371 >= 0 && super.anInt371 != super.anInt404) {
					local52 = Class39.aClass39Array1[super.anInt371].anIntArray183[super.anInt372];
				}
				if (local67.anInt726 >= 0) {
					local54 = local67.anInt726;
					local48 += local54 - this.anIntArray25[5] << 8;
				}
				if (local67.anInt727 >= 0) {
					local56 = local67.anInt727;
					local48 += local56 - this.anIntArray25[3] << 16;
				}
			} else if (super.anInt371 >= 0) {
				local50 = Class39.aClass39Array1[super.anInt371].anIntArray183[super.anInt372];
			}
			@Pc(145) Class3_Sub1_Sub1_Sub3 local145 = (Class3_Sub1_Sub1_Sub3) aClass35_3.method474(local48);
			@Pc(151) int local151;
			@Pc(158) int local158;
			if (local145 == null) {
				@Pc(149) boolean local149 = false;
				for (local151 = 0; local151 < 12; local151++) {
					local158 = this.anIntArray25[local151];
					if (local56 >= 0 && local151 == 3) {
						local158 = local56;
					}
					if (local54 >= 0 && local151 == 5) {
						local158 = local54;
					}
					if (local158 >= 256 && local158 < 512 && !Class10.aClass10Array1[local158 - 256].method70()) {
						local149 = true;
					}
					if (local158 >= 512 && !Class50.method562(local158 - 512).method571(this.anInt191)) {
						local149 = true;
					}
				}
				if (local149) {
					if (this.aLong9 != -1L) {
						local145 = (Class3_Sub1_Sub1_Sub3) aClass35_3.method474(this.aLong9);
					}
					if (local145 == null) {
						return null;
					}
				}
			}
			if (local145 == null) {
				@Pc(228) Class3_Sub1_Sub1_Sub3[] local228 = new Class3_Sub1_Sub1_Sub3[12];
				local151 = 0;
				@Pc(239) int local239;
				for (local158 = 0; local158 < 12; local158++) {
					local239 = this.anIntArray25[local158];
					if (local56 >= 0 && local158 == 3) {
						local239 = local56;
					}
					if (local54 >= 0 && local158 == 5) {
						local239 = local54;
					}
					@Pc(267) Class3_Sub1_Sub1_Sub3 local267;
					if (local239 >= 256 && local239 < 512) {
						local267 = Class10.aClass10Array1[local239 - 256].method71();
						if (local267 != null) {
							local228[local151++] = local267;
						}
					}
					if (local239 >= 512) {
						local267 = Class50.method562(local239 - 512).method561(this.anInt191);
						if (local267 != null) {
							local228[local151++] = local267;
						}
					}
				}
				local145 = new Class3_Sub1_Sub1_Sub3(local151, -537, local228);
				for (local239 = 0; local239 < 5; local239++) {
					if (this.anIntArray26[local239] != 0) {
						local145.method335(client.anIntArrayArray25[local239][0], client.anIntArrayArray25[local239][this.anIntArray26[local239]]);
						if (local239 == 1) {
							local145.method335(client.anIntArray264[0], client.anIntArray264[this.anIntArray26[local239]]);
						}
					}
				}
				local145.method328();
				local145.method338(64, 850, -30, -50, -30, true);
				aClass35_3.method475(local48, local145);
				this.aLong9 = local48;
			}
			if (this.aBoolean26) {
				return local145;
			}
			@Pc(372) Class3_Sub1_Sub1_Sub3 local372 = Class3_Sub1_Sub1_Sub3.aClass3_Sub1_Sub1_Sub3_2;
			local372.method323(local145, Class47.method554(local50) & Class47.method554(local52));
			if (local50 != -1 && local52 != -1) {
				local372.method330(local50, Class39.aClass39Array1[super.anInt375].anIntArray186, local52);
			} else if (local50 != -1) {
				local372.method329(local50);
			}
			local372.method325(this.anInt173);
			local372.anIntArrayArray9 = null;
			local372.anIntArrayArray8 = null;
			return local372;
		} catch (@Pc(427) RuntimeException local427) {
			signlink.reporterror("34043, " + 38 + ", " + local427.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EJJAKGTE", name = "a", descriptor = "(Z)Lclient!OQIGXOFQ;")
	@Override
	protected Class3_Sub1_Sub1_Sub3 method506() {
		try {
			if (!this.aBoolean27) {
				return null;
			}
			@Pc(10) Class3_Sub1_Sub1_Sub3 local10 = this.method55();
			if (local10 == null) {
				return null;
			}
			super.anInt393 = local10.anInt743;
			local10.aBoolean124 = true;
			if (this.aBoolean26) {
				return local10;
			}
			if (super.anInt395 != -1 && super.anInt396 != -1) {
				@Pc(44) Class2 local44 = Class2.aClass2Array1[super.anInt395];
				@Pc(47) Class3_Sub1_Sub1_Sub3 local47 = local44.method18();
				if (local47 != null) {
					@Pc(61) Class3_Sub1_Sub1_Sub3 local61 = new Class3_Sub1_Sub1_Sub3(Class47.method554(super.anInt396), local47, -575, false, true);
					local61.method334(168, 0, -super.anInt399, 0);
					local61.method328();
					local61.method329(local44.aClass39_1.anIntArray183[super.anInt396]);
					local61.anIntArrayArray9 = null;
					local61.anIntArrayArray8 = null;
					if (local44.anInt29 != 128 || local44.anInt30 != 128) {
						local61.method337(local44.anInt30, local44.anInt29, local44.anInt29);
					}
					local61.method338(local44.anInt32 + 64, local44.anInt33 + 850, -30, -50, -30, true);
					@Pc(129) Class3_Sub1_Sub1_Sub3[] local129 = new Class3_Sub1_Sub1_Sub3[] { local10, local61 };
					local10 = new Class3_Sub1_Sub1_Sub3(true, this.anInt176, local129, 2);
				}
			}
			if (this.aClass3_Sub1_Sub1_Sub3_1 != null) {
				if (client.anInt1003 >= this.anInt186) {
					this.aClass3_Sub1_Sub1_Sub3_1 = null;
				}
				if (client.anInt1003 >= this.anInt185 && client.anInt1003 < this.anInt186) {
					@Pc(159) Class3_Sub1_Sub1_Sub3 local159 = this.aClass3_Sub1_Sub1_Sub3_1;
					local159.method334(168, this.anInt177 - super.anInt380, this.anInt178 - this.anInt189, this.anInt179 - super.anInt381);
					if (super.anInt390 == 512) {
						local159.method332();
						local159.method332();
						local159.method332();
					} else if (super.anInt390 == 1024) {
						local159.method332();
						local159.method332();
					} else if (super.anInt390 == 1536) {
						local159.method332();
					}
					@Pc(222) Class3_Sub1_Sub1_Sub3[] local222 = new Class3_Sub1_Sub1_Sub3[] { local10, local159 };
					local10 = new Class3_Sub1_Sub1_Sub3(true, this.anInt176, local222, 2);
					if (super.anInt390 == 512) {
						local159.method332();
					} else if (super.anInt390 == 1024) {
						local159.method332();
						local159.method332();
					} else if (super.anInt390 == 1536) {
						local159.method332();
						local159.method332();
						local159.method332();
					}
					local159.method334(168, super.anInt380 - this.anInt177, this.anInt189 - this.anInt178, super.anInt381 - this.anInt179);
				}
			}
			local10.aBoolean124 = true;
			return local10;
		} catch (@Pc(289) RuntimeException local289) {
			signlink.reporterror("17053, " + false + ", " + local289.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EJJAKGTE", name = "b", descriptor = "(Z)Lclient!OQIGXOFQ;")
	public Class3_Sub1_Sub1_Sub3 method56(@OriginalArg(0) boolean arg0) {
		try {
			if (!this.aBoolean27) {
				return null;
			} else if (this.aClass5_1 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray25[local18];
					if (local25 >= 256 && local25 < 512 && !Class10.aClass10Array1[local25 - 256].method72(516)) {
						local16 = true;
					}
					if (local25 >= 512 && !Class50.method562(local25 - 512).method566(this.anInt191, this.anInt187)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(67) Class3_Sub1_Sub1_Sub3[] local67 = new Class3_Sub1_Sub1_Sub3[12];
				@Pc(69) int local69 = 0;
				for (@Pc(71) int local71 = 0; local71 < 12; local71++) {
					@Pc(78) int local78 = this.anIntArray25[local71];
					@Pc(93) Class3_Sub1_Sub1_Sub3 local93;
					if (local78 >= 256 && local78 < 512) {
						local93 = Class10.aClass10Array1[local78 - 256].method73(this.aBoolean25);
						if (local93 != null) {
							local67[local69++] = local93;
						}
					}
					if (local78 >= 512) {
						local93 = Class50.method562(local78 - 512).method570(this.anInt191);
						if (local93 != null) {
							local67[local69++] = local93;
						}
					}
				}
				@Pc(130) Class3_Sub1_Sub1_Sub3 local130 = new Class3_Sub1_Sub1_Sub3(local69, -537, local67);
				@Pc(134) int local134;
				if (arg0) {
					for (local134 = 1; local134 > 0; local134++) {
					}
				}
				for (local134 = 0; local134 < 5; local134++) {
					if (this.anIntArray26[local134] != 0) {
						local130.method335(client.anIntArrayArray25[local134][0], client.anIntArrayArray25[local134][this.anIntArray26[local134]]);
						if (local134 == 1) {
							local130.method335(client.anIntArray264[0], client.anIntArray264[this.anIntArray26[local134]]);
						}
					}
				}
				return local130;
			} else {
				return this.aClass5_1.method25();
			}
		} catch (@Pc(184) RuntimeException local184) {
			signlink.reporterror("1040, " + arg0 + ", " + local184.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EJJAKGTE", name = "a", descriptor = "(ILclient!GHHPHSRU;)V")
	public void method57(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub2 arg1) {
		try {
			arg1.anInt257 = 0;
			this.anInt191 = arg1.method89();
			this.anInt184 = arg1.method90();
			this.anInt175 = arg1.method90();
			this.aClass5_1 = null;
			this.anInt174 = 0;
			@Pc(29) int local29;
			@Pc(41) int local41;
			@Pc(88) int local88;
			for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
				local29 = arg1.method89();
				if (local29 == 0) {
					this.anIntArray25[local24] = 0;
				} else {
					local41 = arg1.method89();
					this.anIntArray25[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray25[0] == 65535) {
						this.aClass5_1 = Class5.method24(arg1.method91());
						break;
					}
					if (this.anIntArray25[local24] >= 512 && this.anIntArray25[local24] - 512 < Class50.anInt795) {
						local88 = Class50.method562(this.anIntArray25[local24] - 512).anInt810;
						if (local88 != 0) {
							this.anInt174 = local88;
						}
					}
				}
			}
			@Pc(101) boolean local101 = false;
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg1.method89();
				if (local41 < 0 || local41 >= client.anIntArrayArray25[local29].length) {
					local41 = 0;
				}
				this.anIntArray26[local29] = local41;
			}
			super.anInt404 = arg1.method91();
			if (super.anInt404 == 65535) {
				super.anInt404 = -1;
			}
			super.anInt405 = arg1.method91();
			if (super.anInt405 == 65535) {
				super.anInt405 = -1;
			}
			super.anInt412 = arg1.method91();
			if (super.anInt412 == 65535) {
				super.anInt412 = -1;
			}
			super.anInt413 = arg1.method91();
			if (super.anInt413 == 65535) {
				super.anInt413 = -1;
			}
			super.anInt414 = arg1.method91();
			if (super.anInt414 == 65535) {
				super.anInt414 = -1;
			}
			super.anInt415 = arg1.method91();
			if (super.anInt415 == 65535) {
				super.anInt415 = -1;
			}
			super.anInt374 = arg1.method91();
			if (super.anInt374 == 65535) {
				super.anInt374 = -1;
			}
			this.aString4 = Class36.method481(Class36.method478(arg1.method95(this.aByte4), 622));
			this.anInt188 = arg1.method89();
			this.anInt172 = arg1.method91();
			this.aBoolean27 = true;
			this.aLong10 = 0L;
			for (local41 = 0; local41 < 12; local41++) {
				this.aLong10 <<= 0x4;
				if (this.anIntArray25[local41] >= 256) {
					this.aLong10 += this.anIntArray25[local41] - 256;
				}
			}
			if (this.anIntArray25[0] >= 256) {
				this.aLong10 += this.anIntArray25[0] - 256 >> 4;
			}
			if (this.anIntArray25[1] >= 256) {
				this.aLong10 += this.anIntArray25[1] - 256 >> 8;
			}
			for (local88 = 0; local88 < 5; local88++) {
				this.aLong10 <<= 0x3;
				this.aLong10 += this.anIntArray26[local88];
			}
			this.aLong10 <<= 0x1;
			this.aLong10 += this.anInt191;
		} catch (@Pc(340) RuntimeException local340) {
			signlink.reporterror("69696, " + arg0 + ", " + arg1 + ", " + local340.toString());
			throw new RuntimeException();
		}
	}
}
