import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MDBQGDOL")
public final class Class1_Sub1_Sub1_Sub3_Sub2 extends Class1_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!MDBQGDOL", name = "Ib", descriptor = "Lclient!HARAZQMH;")
	public static Class15 aClass15_4 = new Class15((byte) 5, 260);

	@OriginalMember(owner = "client!MDBQGDOL", name = "qb", descriptor = "I")
	public int anInt439;

	@OriginalMember(owner = "client!MDBQGDOL", name = "rb", descriptor = "I")
	public int anInt440;

	@OriginalMember(owner = "client!MDBQGDOL", name = "tb", descriptor = "Lclient!TQRZOVPP;")
	public Class37 aClass37_2;

	@OriginalMember(owner = "client!MDBQGDOL", name = "wb", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!MDBQGDOL", name = "yb", descriptor = "I")
	private int anInt442;

	@OriginalMember(owner = "client!MDBQGDOL", name = "zb", descriptor = "I")
	public int anInt443;

	@OriginalMember(owner = "client!MDBQGDOL", name = "Ab", descriptor = "I")
	public int anInt444;

	@OriginalMember(owner = "client!MDBQGDOL", name = "Bb", descriptor = "I")
	public int anInt445;

	@OriginalMember(owner = "client!MDBQGDOL", name = "Cb", descriptor = "I")
	public int anInt446;

	@OriginalMember(owner = "client!MDBQGDOL", name = "Db", descriptor = "I")
	public int anInt447;

	@OriginalMember(owner = "client!MDBQGDOL", name = "Gb", descriptor = "I")
	public int anInt448;

	@OriginalMember(owner = "client!MDBQGDOL", name = "Hb", descriptor = "I")
	public int anInt449;

	@OriginalMember(owner = "client!MDBQGDOL", name = "Jb", descriptor = "I")
	public int anInt450;

	@OriginalMember(owner = "client!MDBQGDOL", name = "Kb", descriptor = "I")
	public int anInt451;

	@OriginalMember(owner = "client!MDBQGDOL", name = "Lb", descriptor = "I")
	public int anInt452;

	@OriginalMember(owner = "client!MDBQGDOL", name = "Mb", descriptor = "I")
	public int anInt453;

	@OriginalMember(owner = "client!MDBQGDOL", name = "Nb", descriptor = "Lclient!GCSAWSJV;")
	public Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!MDBQGDOL", name = "Tb", descriptor = "Ljava/lang/String;")
	public String aString7;

	@OriginalMember(owner = "client!MDBQGDOL", name = "sb", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!MDBQGDOL", name = "ub", descriptor = "I")
	private int anInt441 = 112;

	@OriginalMember(owner = "client!MDBQGDOL", name = "vb", descriptor = "Z")
	public boolean aBoolean89 = false;

	@OriginalMember(owner = "client!MDBQGDOL", name = "xb", descriptor = "Z")
	public boolean aBoolean90 = false;

	@OriginalMember(owner = "client!MDBQGDOL", name = "Eb", descriptor = "J")
	private long aLong15 = -1L;

	@OriginalMember(owner = "client!MDBQGDOL", name = "Fb", descriptor = "B")
	private byte aByte12 = -60;

	@OriginalMember(owner = "client!MDBQGDOL", name = "Ob", descriptor = "Z")
	private boolean aBoolean91 = true;

	@OriginalMember(owner = "client!MDBQGDOL", name = "Pb", descriptor = "I")
	public int anInt454 = -1;

	@OriginalMember(owner = "client!MDBQGDOL", name = "Qb", descriptor = "I")
	public int anInt455 = -1;

	@OriginalMember(owner = "client!MDBQGDOL", name = "Rb", descriptor = "Z")
	private boolean aBoolean92 = true;

	@OriginalMember(owner = "client!MDBQGDOL", name = "Sb", descriptor = "[I")
	public int[] anIntArray129 = new int[5];

	@OriginalMember(owner = "client!MDBQGDOL", name = "Ub", descriptor = "[I")
	public int[] anIntArray130 = new int[12];

	@OriginalMember(owner = "client!MDBQGDOL", name = "Vb", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "client!MDBQGDOL", name = "b", descriptor = "(I)Lclient!GCSAWSJV;")
	public Class1_Sub1_Sub1_Sub2 method267() {
		try {
			if (!this.aBoolean90) {
				return null;
			} else if (this.aClass37_2 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray130[local18];
					if (local25 >= 256 && local25 < 512 && !Class6.aClass6Array1[local25 - 256].method39(this.aByte12)) {
						local16 = true;
					}
					if (local25 >= 512 && !Class23.method248(local25 - 512).method249(this.aBoolean93, this.anInt442)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(68) Class1_Sub1_Sub1_Sub2[] local68 = new Class1_Sub1_Sub1_Sub2[12];
				@Pc(70) int local70 = 0;
				for (@Pc(85) int local85 = 0; local85 < 12; local85++) {
					@Pc(92) int local92 = this.anIntArray130[local85];
					@Pc(106) Class1_Sub1_Sub1_Sub2 local106;
					if (local92 >= 256 && local92 < 512) {
						local106 = Class6.aClass6Array1[local92 - 256].method40();
						if (local106 != null) {
							local68[local70++] = local106;
						}
					}
					if (local92 >= 512) {
						local106 = Class23.method248(local92 - 512).method255(this.anInt442, 349);
						if (local106 != null) {
							local68[local70++] = local106;
						}
					}
				}
				@Pc(144) Class1_Sub1_Sub1_Sub2 local144 = new Class1_Sub1_Sub1_Sub2(local68, local70, this.aBoolean91);
				for (@Pc(146) int local146 = 0; local146 < 5; local146++) {
					if (this.anIntArray129[local146] != 0) {
						local144.method157(client.anIntArrayArray22[local146][0], client.anIntArrayArray22[local146][this.anIntArray129[local146]]);
						if (local146 == 1) {
							local144.method157(client.anIntArray275[0], client.anIntArray275[this.anIntArray129[local146]]);
						}
					}
				}
				return local144;
			} else {
				return this.aClass37_2.method484();
			}
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("64317, " + 5 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MDBQGDOL", name = "b", descriptor = "(B)Lclient!GCSAWSJV;")
	private Class1_Sub1_Sub1_Sub2 method268() {
		try {
			if (this.aClass37_2 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt419 >= 0 && super.anInt422 == 0) {
					local6 = Class46.aClass46Array1[super.anInt419].anIntArray198[super.anInt420];
				} else if (super.anInt416 >= 0) {
					local6 = Class46.aClass46Array1[super.anInt416].anIntArray198[super.anInt417];
				}
				return this.aClass37_2.method486(-1, null, local6);
			}
			@Pc(48) long local48 = this.aLong14;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (super.anInt419 >= 0 && super.anInt422 == 0) {
				@Pc(67) Class46 local67 = Class46.aClass46Array1[super.anInt419];
				local50 = local67.anIntArray198[super.anInt420];
				if (super.anInt416 >= 0 && super.anInt416 != super.anInt411) {
					local52 = Class46.aClass46Array1[super.anInt416].anIntArray198[super.anInt417];
				}
				if (local67.anInt774 >= 0) {
					local54 = local67.anInt774;
					local48 += local54 - this.anIntArray130[5] << 8;
				}
				if (local67.anInt775 >= 0) {
					local56 = local67.anInt775;
					local48 += local56 - this.anIntArray130[3] << 16;
				}
			} else if (super.anInt416 >= 0) {
				local50 = Class46.aClass46Array1[super.anInt416].anIntArray198[super.anInt417];
			}
			@Pc(145) Class1_Sub1_Sub1_Sub2 local145 = (Class1_Sub1_Sub1_Sub2) aClass15_4.method182(local48);
			@Pc(151) int local151;
			@Pc(158) int local158;
			if (local145 == null) {
				@Pc(149) boolean local149 = false;
				for (local151 = 0; local151 < 12; local151++) {
					local158 = this.anIntArray130[local151];
					if (local56 >= 0 && local151 == 3) {
						local158 = local56;
					}
					if (local54 >= 0 && local151 == 5) {
						local158 = local54;
					}
					if (local158 >= 256 && local158 < 512 && !Class6.aClass6Array1[local158 - 256].method37()) {
						local149 = true;
					}
					if (local158 >= 512 && !Class23.method248(local158 - 512).method247(this.anInt442)) {
						local149 = true;
					}
				}
				if (local149) {
					if (this.aLong15 != -1L) {
						local145 = (Class1_Sub1_Sub1_Sub2) aClass15_4.method182(this.aLong15);
					}
					if (local145 == null) {
						return null;
					}
				}
			}
			if (local145 == null) {
				@Pc(228) Class1_Sub1_Sub1_Sub2[] local228 = new Class1_Sub1_Sub1_Sub2[12];
				local151 = 0;
				@Pc(239) int local239;
				for (local158 = 0; local158 < 12; local158++) {
					local239 = this.anIntArray130[local158];
					if (local56 >= 0 && local158 == 3) {
						local239 = local56;
					}
					if (local54 >= 0 && local158 == 5) {
						local239 = local54;
					}
					@Pc(267) Class1_Sub1_Sub1_Sub2 local267;
					if (local239 >= 256 && local239 < 512) {
						local267 = Class6.aClass6Array1[local239 - 256].method38();
						if (local267 != null) {
							local228[local151++] = local267;
						}
					}
					if (local239 >= 512) {
						local267 = Class23.method248(local239 - 512).method245(this.anInt442);
						if (local267 != null) {
							local228[local151++] = local267;
						}
					}
				}
				local145 = new Class1_Sub1_Sub1_Sub2(local228, local151, this.aBoolean91);
				for (local239 = 0; local239 < 5; local239++) {
					if (this.anIntArray129[local239] != 0) {
						local145.method157(client.anIntArrayArray22[local239][0], client.anIntArrayArray22[local239][this.anIntArray129[local239]]);
						if (local239 == 1) {
							local145.method157(client.anIntArray275[0], client.anIntArray275[this.anIntArray129[local239]]);
						}
					}
				}
				local145.method150();
				local145.method160(64, 850, -30, -50, -30, true);
				aClass15_4.method183(local48, local145);
				this.aLong15 = local48;
			}
			if (this.aBoolean89) {
				return local145;
			}
			@Pc(373) Class1_Sub1_Sub1_Sub2 local373 = Class1_Sub1_Sub1_Sub2.aClass1_Sub1_Sub1_Sub2_1;
			local373.method145(Class31.method388(this.aBoolean92, local50) & Class31.method388(this.aBoolean92, local52), local145, this.aBoolean88);
			if (local50 != -1 && local52 != -1) {
				local373.method152(local50, Class46.aClass46Array1[super.anInt419].anIntArray201, local52);
			} else if (local50 != -1) {
				local373.method151(local50);
			}
			local373.method147((byte) 6);
			local373.anIntArrayArray5 = null;
			local373.anIntArrayArray4 = null;
			return local373;
		} catch (@Pc(430) RuntimeException local430) {
			signlink.reporterror("58812, " + 7 + ", " + local430.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MDBQGDOL", name = "a", descriptor = "(ILclient!CMGGUSPR;)V")
	public void method269(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt78 = 0;
			this.anInt442 = arg0.method55();
			this.anInt454 = arg0.method56();
			this.anInt455 = arg0.method56();
			this.aClass37_2 = null;
			this.anInt447 = 0;
			@Pc(29) int local29;
			@Pc(41) int local41;
			@Pc(88) int local88;
			for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
				local29 = arg0.method55();
				if (local29 == 0) {
					this.anIntArray130[local24] = 0;
				} else {
					local41 = arg0.method55();
					this.anIntArray130[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray130[0] == 65535) {
						this.aClass37_2 = Class37.method483(arg0.method57());
						break;
					}
					if (this.anIntArray130[local24] >= 512 && this.anIntArray130[local24] - 512 < Class23.anInt362) {
						local88 = Class23.method248(this.anIntArray130[local24] - 512).anInt367;
						if (local88 != 0) {
							this.anInt447 = local88;
						}
					}
				}
			}
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg0.method55();
				if (local41 < 0 || local41 >= client.anIntArrayArray22[local29].length) {
					local41 = 0;
				}
				this.anIntArray129[local29] = local41;
			}
			super.anInt411 = arg0.method57();
			if (super.anInt411 == 65535) {
				super.anInt411 = -1;
			}
			super.anInt412 = arg0.method57();
			if (super.anInt412 == 65535) {
				super.anInt412 = -1;
			}
			super.anInt393 = arg0.method57();
			if (super.anInt393 == 65535) {
				super.anInt393 = -1;
			}
			super.anInt394 = arg0.method57();
			if (super.anInt394 == 65535) {
				super.anInt394 = -1;
			}
			super.anInt395 = arg0.method57();
			if (super.anInt395 == 65535) {
				super.anInt395 = -1;
			}
			super.anInt396 = arg0.method57();
			if (super.anInt396 == 65535) {
				super.anInt396 = -1;
			}
			super.anInt437 = arg0.method57();
			if (super.anInt437 == 65535) {
				super.anInt437 = -1;
			}
			this.aString7 = Class49.method572(Class49.method569(arg0.method61()));
			this.anInt450 = arg0.method55();
			this.anInt448 = arg0.method57();
			this.aBoolean90 = true;
			this.aLong14 = 0L;
			local41 = this.anIntArray130[5];
			local88 = this.anIntArray130[9];
			this.anIntArray130[5] = local88;
			this.anIntArray130[9] = local41;
			for (@Pc(245) int local245 = 0; local245 < 12; local245++) {
				this.aLong14 <<= 0x4;
				if (this.anIntArray130[local245] >= 256) {
					this.aLong14 += this.anIntArray130[local245] - 256;
				}
			}
			if (this.anIntArray130[0] >= 256) {
				this.aLong14 += this.anIntArray130[0] - 256 >> 4;
			}
			if (this.anIntArray130[1] >= 256) {
				this.aLong14 += this.anIntArray130[1] - 256 >> 8;
			}
			this.anIntArray130[5] = local41;
			this.anIntArray130[9] = local88;
			for (@Pc(333) int local333 = 0; local333 < 5; local333++) {
				this.aLong14 <<= 0x3;
				this.aLong14 += this.anIntArray129[local333];
			}
			this.aLong14 <<= 0x1;
			this.aLong14 += this.anInt442;
		} catch (@Pc(371) RuntimeException local371) {
			signlink.reporterror("5074, " + 29328 + ", " + arg0 + ", " + local371.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MDBQGDOL", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method264() {
		try {
			return this.aBoolean90;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("8951, " + 38 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MDBQGDOL", name = "a", descriptor = "(Z)Lclient!GCSAWSJV;")
	@Override
	protected Class1_Sub1_Sub1_Sub2 method555() {
		try {
			if (!this.aBoolean90) {
				return null;
			}
			@Pc(16) Class1_Sub1_Sub1_Sub2 local16 = this.method268();
			if (local16 == null) {
				return null;
			}
			super.anInt430 = local16.anInt784;
			local16.aBoolean46 = true;
			if (this.aBoolean89) {
				return local16;
			}
			if (super.anInt398 != -1 && super.anInt399 != -1) {
				@Pc(45) Class18 local45 = Class18.aClass18Array1[super.anInt398];
				@Pc(48) Class1_Sub1_Sub1_Sub2 local48 = local45.method234();
				if (local48 != null) {
					@Pc(63) Class1_Sub1_Sub1_Sub2 local63 = new Class1_Sub1_Sub1_Sub2(0, local48, true, Class31.method388(this.aBoolean92, super.anInt399), false);
					local63.method156(-super.anInt402, 0, 0);
					local63.method150();
					local63.method151(local45.aClass46_2.anIntArray198[super.anInt399]);
					local63.anIntArrayArray5 = null;
					local63.anIntArrayArray4 = null;
					if (local45.anInt317 != 128 || local45.anInt318 != 128) {
						local63.method159(local45.anInt317, local45.anInt317, local45.anInt318);
					}
					local63.method160(local45.anInt320 + 64, local45.anInt321 + 850, -30, -50, -30, true);
					@Pc(131) Class1_Sub1_Sub1_Sub2[] local131 = new Class1_Sub1_Sub1_Sub2[] { local16, local63 };
					local16 = new Class1_Sub1_Sub1_Sub2(true, local131, -4860, 2);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub2_2 != null) {
				if (client.anInt1011 >= this.anInt440) {
					this.aClass1_Sub1_Sub1_Sub2_2 = null;
				}
				if (client.anInt1011 >= this.anInt439 && client.anInt1011 < this.anInt440) {
					@Pc(160) Class1_Sub1_Sub1_Sub2 local160 = this.aClass1_Sub1_Sub1_Sub2_2;
					local160.method156(this.anInt452 - this.anInt449, this.anInt451 - super.anInt424, this.anInt453 - super.anInt425);
					if (super.anInt403 == 512) {
						local160.method154();
						local160.method154();
						local160.method154();
					} else if (super.anInt403 == 1024) {
						local160.method154();
						local160.method154();
					} else if (super.anInt403 == 1536) {
						local160.method154();
					}
					@Pc(223) Class1_Sub1_Sub1_Sub2[] local223 = new Class1_Sub1_Sub1_Sub2[] { local16, local160 };
					local16 = new Class1_Sub1_Sub1_Sub2(true, local223, -4860, 2);
					if (super.anInt403 == 512) {
						local160.method154();
					} else if (super.anInt403 == 1024) {
						local160.method154();
						local160.method154();
					} else if (super.anInt403 == 1536) {
						local160.method154();
						local160.method154();
						local160.method154();
					}
					local160.method156(this.anInt449 - this.anInt452, super.anInt424 - this.anInt451, super.anInt425 - this.anInt453);
				}
			}
			local16.aBoolean46 = true;
			return local16;
		} catch (@Pc(289) RuntimeException local289) {
			signlink.reporterror("86402, " + false + ", " + local289.toString());
			throw new RuntimeException();
		}
	}
}
