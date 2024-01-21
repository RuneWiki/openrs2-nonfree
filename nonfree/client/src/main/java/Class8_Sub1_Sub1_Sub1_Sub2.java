import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VJDNWPCM")
public final class Class8_Sub1_Sub1_Sub1_Sub2 extends Class8_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!VJDNWPCM", name = "Pb", descriptor = "Lclient!QASTZCLF;")
	public static Class33 aClass33_9 = new Class33(260, false);

	@OriginalMember(owner = "client!VJDNWPCM", name = "rb", descriptor = "J")
	private long aLong23;

	@OriginalMember(owner = "client!VJDNWPCM", name = "ub", descriptor = "I")
	public int anInt734;

	@OriginalMember(owner = "client!VJDNWPCM", name = "vb", descriptor = "I")
	public int anInt735;

	@OriginalMember(owner = "client!VJDNWPCM", name = "wb", descriptor = "I")
	public int anInt736;

	@OriginalMember(owner = "client!VJDNWPCM", name = "xb", descriptor = "I")
	public int anInt737;

	@OriginalMember(owner = "client!VJDNWPCM", name = "yb", descriptor = "I")
	public int anInt738;

	@OriginalMember(owner = "client!VJDNWPCM", name = "zb", descriptor = "I")
	public int anInt739;

	@OriginalMember(owner = "client!VJDNWPCM", name = "Ab", descriptor = "Lclient!NIJEYEOX;")
	public Class26 aClass26_2;

	@OriginalMember(owner = "client!VJDNWPCM", name = "Db", descriptor = "Ljava/lang/String;")
	public String aString15;

	@OriginalMember(owner = "client!VJDNWPCM", name = "Fb", descriptor = "I")
	public int anInt740;

	@OriginalMember(owner = "client!VJDNWPCM", name = "Gb", descriptor = "I")
	public int anInt741;

	@OriginalMember(owner = "client!VJDNWPCM", name = "Hb", descriptor = "I")
	public int anInt742;

	@OriginalMember(owner = "client!VJDNWPCM", name = "Ib", descriptor = "Lclient!JJMVUSJJ;")
	public Class8_Sub1_Sub1_Sub5 aClass8_Sub1_Sub1_Sub5_2;

	@OriginalMember(owner = "client!VJDNWPCM", name = "Jb", descriptor = "I")
	public int anInt743;

	@OriginalMember(owner = "client!VJDNWPCM", name = "Kb", descriptor = "I")
	private int anInt744;

	@OriginalMember(owner = "client!VJDNWPCM", name = "Nb", descriptor = "I")
	public int anInt745;

	@OriginalMember(owner = "client!VJDNWPCM", name = "Rb", descriptor = "I")
	public int anInt748;

	@OriginalMember(owner = "client!VJDNWPCM", name = "Sb", descriptor = "I")
	public int anInt749;

	@OriginalMember(owner = "client!VJDNWPCM", name = "sb", descriptor = "I")
	private int anInt733 = 38776;

	@OriginalMember(owner = "client!VJDNWPCM", name = "tb", descriptor = "J")
	private long aLong24 = -1L;

	@OriginalMember(owner = "client!VJDNWPCM", name = "Bb", descriptor = "Z")
	public boolean aBoolean161 = false;

	@OriginalMember(owner = "client!VJDNWPCM", name = "Cb", descriptor = "[I")
	public int[] anIntArray188 = new int[12];

	@OriginalMember(owner = "client!VJDNWPCM", name = "Eb", descriptor = "[I")
	public int[] anIntArray189 = new int[5];

	@OriginalMember(owner = "client!VJDNWPCM", name = "Lb", descriptor = "Z")
	public boolean aBoolean162 = false;

	@OriginalMember(owner = "client!VJDNWPCM", name = "Mb", descriptor = "Z")
	private boolean aBoolean163 = false;

	@OriginalMember(owner = "client!VJDNWPCM", name = "Ob", descriptor = "I")
	public int anInt746 = -1;

	@OriginalMember(owner = "client!VJDNWPCM", name = "Qb", descriptor = "I")
	public int anInt747 = -1;

	@OriginalMember(owner = "client!VJDNWPCM", name = "a", descriptor = "(B)Lclient!JJMVUSJJ;")
	@Override
	protected Class8_Sub1_Sub1_Sub5 method533(@OriginalArg(0) byte arg0) {
		try {
			if (!this.aBoolean161) {
				return null;
			}
			@Pc(10) Class8_Sub1_Sub1_Sub5 local10 = this.method477();
			if (local10 == null) {
				return null;
			}
			super.anInt710 = local10.anInt786;
			local10.aBoolean69 = true;
			if (this.aBoolean162) {
				return local10;
			}
			if (super.anInt701 != -1 && super.anInt702 != -1) {
				@Pc(49) Class12 local49 = Class12.aClass12Array1[super.anInt701];
				@Pc(52) Class8_Sub1_Sub1_Sub5 local52 = local49.method75();
				if (local52 != null) {
					@Pc(66) Class8_Sub1_Sub1_Sub5 local66 = new Class8_Sub1_Sub1_Sub5(true, Class29.method309(super.anInt702), false, 9, local52);
					local66.method223(0, 161, -super.anInt705, 0);
					local66.method217(979);
					local66.method218(local49.aClass46_1.anIntArray194[super.anInt702]);
					local66.anIntArrayArray8 = null;
					local66.anIntArrayArray7 = null;
					if (local49.anInt104 != 128 || local49.anInt105 != 128) {
						local66.method226(local49.anInt105, local49.anInt104, local49.anInt104);
					}
					local66.method227(local49.anInt107 + 64, local49.anInt108 + 850, -30, -50, -30, true);
					@Pc(134) Class8_Sub1_Sub1_Sub5[] local134 = new Class8_Sub1_Sub1_Sub5[] { local10, local66 };
					local10 = new Class8_Sub1_Sub1_Sub5(local134, 976, 2, true);
				}
			}
			if (this.aClass8_Sub1_Sub1_Sub5_2 != null) {
				if (client.anInt983 >= this.anInt749) {
					this.aClass8_Sub1_Sub1_Sub5_2 = null;
				}
				if (client.anInt983 >= this.anInt748 && client.anInt983 < this.anInt749) {
					@Pc(163) Class8_Sub1_Sub1_Sub5 local163 = this.aClass8_Sub1_Sub1_Sub5_2;
					local163.method223(this.anInt740 - super.anInt716, 161, this.anInt741 - this.anInt734, this.anInt742 - super.anInt717);
					if (super.anInt700 == 512) {
						local163.method221((byte) 3);
						local163.method221((byte) 3);
						local163.method221((byte) 3);
					} else if (super.anInt700 == 1024) {
						local163.method221((byte) 3);
						local163.method221((byte) 3);
					} else if (super.anInt700 == 1536) {
						local163.method221((byte) 3);
					}
					@Pc(226) Class8_Sub1_Sub1_Sub5[] local226 = new Class8_Sub1_Sub1_Sub5[] { local10, local163 };
					local10 = new Class8_Sub1_Sub1_Sub5(local226, 976, 2, true);
					if (super.anInt700 == 512) {
						local163.method221((byte) 3);
					} else if (super.anInt700 == 1024) {
						local163.method221((byte) 3);
						local163.method221((byte) 3);
					} else if (super.anInt700 == 1536) {
						local163.method221((byte) 3);
						local163.method221((byte) 3);
						local163.method221((byte) 3);
					}
					local163.method223(super.anInt716 - this.anInt740, 161, this.anInt734 - this.anInt741, super.anInt717 - this.anInt742);
				}
			}
			local10.aBoolean69 = true;
			return local10;
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("83706, " + 7 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VJDNWPCM", name = "b", descriptor = "(I)Lclient!JJMVUSJJ;")
	public Class8_Sub1_Sub1_Sub5 method476() {
		try {
			if (!this.aBoolean161) {
				return null;
			} else if (this.aClass26_2 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray188[local18];
					if (local25 >= 256 && local25 < 512 && !Class44.aClass44Array1[local25 - 256].method483(364)) {
						local16 = true;
					}
					if (local25 >= 512 && !Class19.method191(local25 - 512).method200(this.aBoolean163, this.anInt744)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(67) Class8_Sub1_Sub1_Sub5[] local67 = new Class8_Sub1_Sub1_Sub5[12];
				@Pc(69) int local69 = 0;
				for (@Pc(71) int local71 = 0; local71 < 12; local71++) {
					@Pc(78) int local78 = this.anIntArray188[local71];
					@Pc(92) Class8_Sub1_Sub1_Sub5 local92;
					if (local78 >= 256 && local78 < 512) {
						local92 = Class44.aClass44Array1[local78 - 256].method484();
						if (local92 != null) {
							local67[local69++] = local92;
						}
					}
					if (local78 >= 512) {
						local92 = Class19.method191(local78 - 512).method196(this.anInt744);
						if (local92 != null) {
							local67[local69++] = local92;
						}
					}
				}
				@Pc(129) Class8_Sub1_Sub1_Sub5 local129 = new Class8_Sub1_Sub1_Sub5(local67, local69, -41715);
				for (@Pc(142) int local142 = 0; local142 < 5; local142++) {
					if (this.anIntArray189[local142] != 0) {
						local129.method224(client.anIntArrayArray23[local142][0], client.anIntArrayArray23[local142][this.anIntArray189[local142]]);
						if (local142 == 1) {
							local129.method224(client.anIntArray250[0], client.anIntArray250[this.anIntArray189[local142]]);
						}
					}
				}
				return local129;
			} else {
				return this.aClass26_2.method291();
			}
		} catch (@Pc(185) RuntimeException local185) {
			signlink.reporterror("38220, " + 7442 + ", " + local185.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VJDNWPCM", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method474(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				throw new NullPointerException();
			}
			return this.aBoolean161;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("34354, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VJDNWPCM", name = "c", descriptor = "(I)Lclient!JJMVUSJJ;")
	private Class8_Sub1_Sub1_Sub5 method477() {
		try {
			if (this.aClass26_2 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt711 >= 0 && super.anInt714 == 0) {
					local6 = Class46.aClass46Array1[super.anInt711].anIntArray194[super.anInt712];
				} else if (super.anInt727 >= 0) {
					local6 = Class46.aClass46Array1[super.anInt727].anIntArray194[super.anInt728];
				}
				return this.aClass26_2.method295(local6, -1, null);
			}
			@Pc(48) long local48 = this.aLong23;
			@Pc(56) int local56 = -1;
			@Pc(58) int local58 = -1;
			@Pc(60) int local60 = -1;
			@Pc(62) int local62 = -1;
			if (super.anInt711 >= 0 && super.anInt714 == 0) {
				@Pc(73) Class46 local73 = Class46.aClass46Array1[super.anInt711];
				local56 = local73.anIntArray194[super.anInt712];
				if (super.anInt727 >= 0 && super.anInt727 != super.anInt706) {
					local58 = Class46.aClass46Array1[super.anInt727].anIntArray194[super.anInt728];
				}
				if (local73.anInt762 >= 0) {
					local60 = local73.anInt762;
					local48 += local60 - this.anIntArray188[5] << 8;
				}
				if (local73.anInt763 >= 0) {
					local62 = local73.anInt763;
					local48 += local62 - this.anIntArray188[3] << 16;
				}
			} else if (super.anInt727 >= 0) {
				local56 = Class46.aClass46Array1[super.anInt727].anIntArray194[super.anInt728];
			}
			@Pc(151) Class8_Sub1_Sub1_Sub5 local151 = (Class8_Sub1_Sub1_Sub5) aClass33_9.method367(local48);
			@Pc(157) int local157;
			@Pc(164) int local164;
			if (local151 == null) {
				@Pc(155) boolean local155 = false;
				for (local157 = 0; local157 < 12; local157++) {
					local164 = this.anIntArray188[local157];
					if (local62 >= 0 && local157 == 3) {
						local164 = local62;
					}
					if (local60 >= 0 && local157 == 5) {
						local164 = local60;
					}
					if (local164 >= 256 && local164 < 512 && !Class44.aClass44Array1[local164 - 256].method481()) {
						local155 = true;
					}
					if (local164 >= 512 && !Class19.method191(local164 - 512).method192(this.anInt744)) {
						local155 = true;
					}
				}
				if (local155) {
					if (this.aLong24 != -1L) {
						local151 = (Class8_Sub1_Sub1_Sub5) aClass33_9.method367(this.aLong24);
					}
					if (local151 == null) {
						return null;
					}
				}
			}
			if (local151 == null) {
				@Pc(234) Class8_Sub1_Sub1_Sub5[] local234 = new Class8_Sub1_Sub1_Sub5[12];
				local157 = 0;
				@Pc(245) int local245;
				for (local164 = 0; local164 < 12; local164++) {
					local245 = this.anIntArray188[local164];
					if (local62 >= 0 && local164 == 3) {
						local245 = local62;
					}
					if (local60 >= 0 && local164 == 5) {
						local245 = local60;
					}
					@Pc(273) Class8_Sub1_Sub1_Sub5 local273;
					if (local245 >= 256 && local245 < 512) {
						local273 = Class44.aClass44Array1[local245 - 256].method482();
						if (local273 != null) {
							local234[local157++] = local273;
						}
					}
					if (local245 >= 512) {
						local273 = Class19.method191(local245 - 512).method195(this.anInt744);
						if (local273 != null) {
							local234[local157++] = local273;
						}
					}
				}
				local151 = new Class8_Sub1_Sub1_Sub5(local234, local157, -41715);
				for (local245 = 0; local245 < 5; local245++) {
					if (this.anIntArray189[local245] != 0) {
						local151.method224(client.anIntArrayArray23[local245][0], client.anIntArrayArray23[local245][this.anIntArray189[local245]]);
						if (local245 == 1) {
							local151.method224(client.anIntArray250[0], client.anIntArray250[this.anIntArray189[local245]]);
						}
					}
				}
				local151.method217(979);
				local151.method227(64, 850, -30, -50, -30, true);
				aClass33_9.method368(local151, local48);
				this.aLong24 = local48;
			}
			if (this.aBoolean162) {
				return local151;
			}
			@Pc(378) Class8_Sub1_Sub1_Sub5 local378 = Class8_Sub1_Sub1_Sub5.aClass8_Sub1_Sub1_Sub5_1;
			local378.method212(local151, this.anInt733, Class29.method309(local56) & Class29.method309(local58));
			if (local56 != -1 && local58 != -1) {
				local378.method219(local58, Class46.aClass46Array1[super.anInt711].anIntArray197, local56);
			} else if (local56 != -1) {
				local378.method218(local56);
			}
			local378.method214();
			local378.anIntArrayArray8 = null;
			local378.anIntArrayArray7 = null;
			return local378;
		} catch (@Pc(427) RuntimeException local427) {
			signlink.reporterror("45030, " + 0 + ", " + local427.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VJDNWPCM", name = "a", descriptor = "(ZLclient!IUVBENCV;)V")
	public void method478(@OriginalArg(1) Class8_Sub1_Sub3 arg0) {
		try {
			arg0.anInt239 = 0;
			this.anInt744 = arg0.method152();
			this.anInt746 = arg0.method153();
			this.anInt747 = arg0.method153();
			this.aClass26_2 = null;
			this.anInt745 = 0;
			@Pc(29) int local29;
			@Pc(41) int local41;
			@Pc(88) int local88;
			for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
				local29 = arg0.method152();
				if (local29 == 0) {
					this.anIntArray188[local24] = 0;
				} else {
					local41 = arg0.method152();
					this.anIntArray188[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray188[0] == 65535) {
						this.aClass26_2 = Class26.method290(arg0.method154());
						break;
					}
					if (this.anIntArray188[local24] >= 512 && this.anIntArray188[local24] - 512 < Class19.anInt247) {
						local88 = Class19.method191(this.anIntArray188[local24] - 512).anInt261;
						if (local88 != 0) {
							this.anInt745 = local88;
						}
					}
				}
			}
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg0.method152();
				if (local41 < 0 || local41 >= client.anIntArrayArray23[local29].length) {
					local41 = 0;
				}
				this.anIntArray189[local29] = local41;
			}
			super.anInt706 = arg0.method154();
			if (super.anInt706 == 65535) {
				super.anInt706 = -1;
			}
			super.anInt707 = arg0.method154();
			if (super.anInt707 == 65535) {
				super.anInt707 = -1;
			}
			super.anInt696 = arg0.method154();
			if (super.anInt696 == 65535) {
				super.anInt696 = -1;
			}
			super.anInt697 = arg0.method154();
			if (super.anInt697 == 65535) {
				super.anInt697 = -1;
			}
			super.anInt698 = arg0.method154();
			if (super.anInt698 == 65535) {
				super.anInt698 = -1;
			}
			super.anInt699 = arg0.method154();
			if (super.anInt699 == 65535) {
				super.anInt699 = -1;
			}
			super.anInt731 = arg0.method154();
			if (super.anInt731 == 65535) {
				super.anInt731 = -1;
			}
			this.aString15 = Class36.method385(839, Class36.method382((byte) 3, arg0.method158()));
			this.anInt743 = arg0.method152();
			this.anInt739 = arg0.method154();
			this.aBoolean161 = true;
			this.aLong23 = 0L;
			local41 = this.anIntArray188[5];
			local88 = this.anIntArray188[9];
			this.anIntArray188[5] = local88;
			this.anIntArray188[9] = local41;
			for (@Pc(248) int local248 = 0; local248 < 12; local248++) {
				this.aLong23 <<= 0x4;
				if (this.anIntArray188[local248] >= 256) {
					this.aLong23 += this.anIntArray188[local248] - 256;
				}
			}
			if (this.anIntArray188[0] >= 256) {
				this.aLong23 += this.anIntArray188[0] - 256 >> 4;
			}
			if (this.anIntArray188[1] >= 256) {
				this.aLong23 += this.anIntArray188[1] - 256 >> 8;
			}
			this.anIntArray188[5] = local41;
			this.anIntArray188[9] = local88;
			for (@Pc(330) int local330 = 0; local330 < 5; local330++) {
				this.aLong23 <<= 0x3;
				this.aLong23 += this.anIntArray189[local330];
			}
			this.aLong23 <<= 0x1;
			this.aLong23 += this.anInt744;
		} catch (@Pc(368) RuntimeException local368) {
			signlink.reporterror("1946, " + false + ", " + arg0 + ", " + local368.toString());
			throw new RuntimeException();
		}
	}
}
