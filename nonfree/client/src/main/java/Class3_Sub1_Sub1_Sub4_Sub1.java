import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HDYGEGXY")
public final class Class3_Sub1_Sub1_Sub4_Sub1 extends Class3_Sub1_Sub1_Sub4 {

	@OriginalMember(owner = "client!HDYGEGXY", name = "xb", descriptor = "Lclient!ZPNSJLZE;")
	public static Class49 aClass49_3 = new Class49(260, false);

	@OriginalMember(owner = "client!HDYGEGXY", name = "sb", descriptor = "I")
	public int anInt288;

	@OriginalMember(owner = "client!HDYGEGXY", name = "ub", descriptor = "I")
	private int anInt289;

	@OriginalMember(owner = "client!HDYGEGXY", name = "wb", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!HDYGEGXY", name = "yb", descriptor = "I")
	public int anInt292;

	@OriginalMember(owner = "client!HDYGEGXY", name = "zb", descriptor = "I")
	public int anInt293;

	@OriginalMember(owner = "client!HDYGEGXY", name = "Ab", descriptor = "Lclient!GALAVQEJ;")
	public Class7 aClass7_1;

	@OriginalMember(owner = "client!HDYGEGXY", name = "Cb", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!HDYGEGXY", name = "Db", descriptor = "I")
	private int anInt294;

	@OriginalMember(owner = "client!HDYGEGXY", name = "Eb", descriptor = "I")
	public int anInt295;

	@OriginalMember(owner = "client!HDYGEGXY", name = "Gb", descriptor = "I")
	public int anInt296;

	@OriginalMember(owner = "client!HDYGEGXY", name = "Hb", descriptor = "I")
	public int anInt297;

	@OriginalMember(owner = "client!HDYGEGXY", name = "Ib", descriptor = "I")
	public int anInt298;

	@OriginalMember(owner = "client!HDYGEGXY", name = "Jb", descriptor = "I")
	public int anInt299;

	@OriginalMember(owner = "client!HDYGEGXY", name = "Kb", descriptor = "Lclient!CSGBDGDY;")
	public Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!HDYGEGXY", name = "Mb", descriptor = "I")
	public int anInt300;

	@OriginalMember(owner = "client!HDYGEGXY", name = "Pb", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!HDYGEGXY", name = "Qb", descriptor = "I")
	public int anInt302;

	@OriginalMember(owner = "client!HDYGEGXY", name = "Rb", descriptor = "I")
	public int anInt303;

	@OriginalMember(owner = "client!HDYGEGXY", name = "Sb", descriptor = "I")
	public int anInt304;

	@OriginalMember(owner = "client!HDYGEGXY", name = "Tb", descriptor = "I")
	public int anInt305;

	@OriginalMember(owner = "client!HDYGEGXY", name = "rb", descriptor = "[I")
	public int[] anIntArray82 = new int[5];

	@OriginalMember(owner = "client!HDYGEGXY", name = "tb", descriptor = "Z")
	public boolean aBoolean72 = false;

	@OriginalMember(owner = "client!HDYGEGXY", name = "vb", descriptor = "I")
	public int anInt290 = -1;

	@OriginalMember(owner = "client!HDYGEGXY", name = "Bb", descriptor = "[I")
	public int[] anIntArray83 = new int[12];

	@OriginalMember(owner = "client!HDYGEGXY", name = "Fb", descriptor = "Z")
	private boolean aBoolean73 = true;

	@OriginalMember(owner = "client!HDYGEGXY", name = "Lb", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!HDYGEGXY", name = "Nb", descriptor = "I")
	public int anInt301 = -1;

	@OriginalMember(owner = "client!HDYGEGXY", name = "Ob", descriptor = "Z")
	public boolean aBoolean75 = false;

	@OriginalMember(owner = "client!HDYGEGXY", name = "Ub", descriptor = "J")
	private long aLong16 = -1L;

	@OriginalMember(owner = "client!HDYGEGXY", name = "Vb", descriptor = "Z")
	private boolean aBoolean76 = true;

	@OriginalMember(owner = "client!HDYGEGXY", name = "c", descriptor = "(I)Lclient!CSGBDGDY;")
	private Class3_Sub1_Sub1_Sub1 method175(@OriginalArg(0) int arg0) {
		try {
			if (this.aClass7_1 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt743 >= 0 && super.anInt746 == 0) {
					local6 = Class31.aClass31Array1[super.anInt743].anIntArray126[super.anInt744];
				} else if (super.anInt711 >= 0) {
					local6 = Class31.aClass31Array1[super.anInt711].anIntArray126[super.anInt712];
				}
				return this.aClass7_1.method85(426, local6, (int[]) null, -1);
			}
			@Pc(48) long local48 = this.aLong15;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (arg0 != 0) {
				throw new NullPointerException();
			}
			if (super.anInt743 >= 0 && super.anInt746 == 0) {
				@Pc(73) Class31 local73 = Class31.aClass31Array1[super.anInt743];
				local50 = local73.anIntArray126[super.anInt744];
				if (super.anInt711 >= 0 && super.anInt711 != super.anInt752) {
					local52 = Class31.aClass31Array1[super.anInt711].anIntArray126[super.anInt712];
				}
				if (local73.anInt484 >= 0) {
					local54 = local73.anInt484;
					local48 += (long) (local54 - this.anIntArray83[5] << 8);
				}
				if (local73.anInt485 >= 0) {
					local56 = local73.anInt485;
					local48 += (long) (local56 - this.anIntArray83[3] << 16);
				}
			} else if (super.anInt711 >= 0) {
				local50 = Class31.aClass31Array1[super.anInt711].anIntArray126[super.anInt712];
			}
			@Pc(151) Class3_Sub1_Sub1_Sub1 local151 = (Class3_Sub1_Sub1_Sub1) aClass49_3.method542(local48);
			@Pc(157) int local157;
			@Pc(164) int local164;
			if (local151 == null) {
				@Pc(155) boolean local155 = false;
				for (local157 = 0; local157 < 12; local157++) {
					local164 = this.anIntArray83[local157];
					if (local56 >= 0 && local157 == 3) {
						local164 = local56;
					}
					if (local54 >= 0 && local157 == 5) {
						local164 = local54;
					}
					if (local164 >= 256 && local164 < 512 && !Class34.aClass34Array1[local164 - 256].method350()) {
						local155 = true;
					}
					if (local164 >= 512 && !Class12.method179(local164 - 512).method186(this.anInt289)) {
						local155 = true;
					}
				}
				if (local155) {
					if (this.aLong16 != -1L) {
						local151 = (Class3_Sub1_Sub1_Sub1) aClass49_3.method542(this.aLong16);
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
					local245 = this.anIntArray83[local164];
					if (local56 >= 0 && local164 == 3) {
						local245 = local56;
					}
					if (local54 >= 0 && local164 == 5) {
						local245 = local54;
					}
					@Pc(273) Class3_Sub1_Sub1_Sub1 local273;
					if (local245 >= 256 && local245 < 512) {
						local273 = Class34.aClass34Array1[local245 - 256].method351(201);
						if (local273 != null) {
							local234[local157++] = local273;
						}
					}
					if (local245 >= 512) {
						local273 = Class12.method179(local245 - 512).method187(this.aBoolean73, this.anInt289);
						if (local273 != null) {
							local234[local157++] = local273;
						}
					}
				}
				local151 = new Class3_Sub1_Sub1_Sub1(local157, -39808, local234);
				for (local245 = 0; local245 < 5; local245++) {
					if (this.anIntArray82[local245] != 0) {
						local151.method47(client.anIntArrayArray23[local245][0], client.anIntArrayArray23[local245][this.anIntArray82[local245]]);
						if (local245 == 1) {
							local151.method47(client.anIntArray243[0], client.anIntArray243[this.anIntArray82[local245]]);
						}
					}
				}
				local151.method40();
				local151.method50(64, 850, -30, -50, -30, true);
				aClass49_3.method543(local151, this.anInt291, local48);
				this.aLong16 = local48;
			}
			if (this.aBoolean72) {
				return local151;
			}
			@Pc(380) Class3_Sub1_Sub1_Sub1 local380 = Class3_Sub1_Sub1_Sub1.aClass3_Sub1_Sub1_Sub1_1;
			local380.method35(local151, Class18.method210(local50) & Class18.method210(local52));
			if (local50 != -1 && local52 != -1) {
				local380.method42(local50, Class31.aClass31Array1[super.anInt743].anIntArray129, local52);
			} else if (local50 != -1) {
				local380.method41(local50);
			}
			local380.method37();
			local380.anIntArrayArray2 = null;
			local380.anIntArrayArray1 = null;
			return local380;
		} catch (@Pc(428) RuntimeException local428) {
			signlink.reporterror("71332, " + arg0 + ", " + local428.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HDYGEGXY", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method536(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			return this.aBoolean75;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("7549, " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HDYGEGXY", name = "a", descriptor = "(Z)Lclient!CSGBDGDY;")
	@Override
	protected Class3_Sub1_Sub1_Sub1 method535() {
		try {
			if (!this.aBoolean75) {
				return null;
			}
			@Pc(11) Class3_Sub1_Sub1_Sub1 local11 = this.method175(this.anInt294);
			if (local11 == null) {
				return null;
			}
			super.anInt758 = local11.anInt709;
			local11.aBoolean19 = true;
			if (this.aBoolean72) {
				return local11;
			}
			if (super.anInt714 != -1 && super.anInt715 != -1) {
				@Pc(40) Class6 local40 = Class6.aClass6Array1[super.anInt714];
				@Pc(43) Class3_Sub1_Sub1_Sub1 local43 = local40.method82();
				if (local43 != null) {
					@Pc(57) Class3_Sub1_Sub1_Sub1 local57 = new Class3_Sub1_Sub1_Sub1(true, Class18.method210(super.anInt715), local43, false, (byte) -45);
					local57.method46(-super.anInt718, 0, 0);
					local57.method40();
					local57.method41(local40.aClass31_2.anIntArray126[super.anInt715]);
					local57.anIntArrayArray2 = null;
					local57.anIntArrayArray1 = null;
					if (local40.anInt121 != 128 || local40.anInt122 != 128) {
						local57.method49(local40.anInt121, local40.anInt122, local40.anInt121);
					}
					local57.method50(local40.anInt124 + 64, 850 + local40.anInt125, -30, -50, -30, true);
					@Pc(125) Class3_Sub1_Sub1_Sub1[] local125 = new Class3_Sub1_Sub1_Sub1[] { local11, local57 };
					local11 = new Class3_Sub1_Sub1_Sub1(true, 2, local125, true);
				}
			}
			if (this.aClass3_Sub1_Sub1_Sub1_2 != null) {
				if (client.anInt1050 >= this.anInt293) {
					this.aClass3_Sub1_Sub1_Sub1_2 = null;
				}
				if (client.anInt1050 >= this.anInt292 && client.anInt1050 < this.anInt293) {
					@Pc(154) Class3_Sub1_Sub1_Sub1 local154 = this.aClass3_Sub1_Sub1_Sub1_2;
					local154.method46(this.anInt298 - this.anInt296, this.anInt297 - super.anInt754, this.anInt299 - super.anInt755);
					if (super.anInt737 == 512) {
						local154.method44();
						local154.method44();
						local154.method44();
					} else if (super.anInt737 == 1024) {
						local154.method44();
						local154.method44();
					} else if (super.anInt737 == 1536) {
						local154.method44();
					}
					@Pc(217) Class3_Sub1_Sub1_Sub1[] local217 = new Class3_Sub1_Sub1_Sub1[] { local11, local154 };
					local11 = new Class3_Sub1_Sub1_Sub1(true, 2, local217, true);
					if (super.anInt737 == 512) {
						local154.method44();
					} else if (super.anInt737 == 1024) {
						local154.method44();
						local154.method44();
					} else if (super.anInt737 == 1536) {
						local154.method44();
						local154.method44();
						local154.method44();
					}
					local154.method46(this.anInt296 - this.anInt298, super.anInt754 - this.anInt297, super.anInt755 - this.anInt299);
				}
			}
			local11.aBoolean19 = true;
			return local11;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("50526, " + true + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HDYGEGXY", name = "d", descriptor = "(I)Lclient!CSGBDGDY;")
	public Class3_Sub1_Sub1_Sub1 method176() {
		try {
			if (!this.aBoolean75) {
				return null;
			} else if (this.aClass7_1 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(29) int local29 = 0; local29 < 12; local29++) {
					@Pc(36) int local36 = this.anIntArray83[local29];
					if (local36 >= 256 && local36 < 512 && !Class34.aClass34Array1[local36 - 256].method352()) {
						local16 = true;
					}
					if (local36 >= 512 && !Class12.method179(local36 - 512).method184(this.anInt289, (byte) 7)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(77) Class3_Sub1_Sub1_Sub1[] local77 = new Class3_Sub1_Sub1_Sub1[12];
				@Pc(79) int local79 = 0;
				for (@Pc(81) int local81 = 0; local81 < 12; local81++) {
					@Pc(88) int local88 = this.anIntArray83[local81];
					@Pc(102) Class3_Sub1_Sub1_Sub1 local102;
					if (local88 >= 256 && local88 < 512) {
						local102 = Class34.aClass34Array1[local88 - 256].method353();
						if (local102 != null) {
							local77[local79++] = local102;
						}
					}
					if (local88 >= 512) {
						local102 = Class12.method179(local88 - 512).method185(this.anInt289);
						if (local102 != null) {
							local77[local79++] = local102;
						}
					}
				}
				@Pc(139) Class3_Sub1_Sub1_Sub1 local139 = new Class3_Sub1_Sub1_Sub1(local79, -39808, local77);
				for (@Pc(141) int local141 = 0; local141 < 5; local141++) {
					if (this.anIntArray82[local141] != 0) {
						local139.method47(client.anIntArrayArray23[local141][0], client.anIntArrayArray23[local141][this.anIntArray82[local141]]);
						if (local141 == 1) {
							local139.method47(client.anIntArray243[0], client.anIntArray243[this.anIntArray82[local141]]);
						}
					}
				}
				return local139;
			} else {
				return this.aClass7_1.method84();
			}
		} catch (@Pc(184) RuntimeException local184) {
			signlink.reporterror("30766, " + -14221 + ", " + local184.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HDYGEGXY", name = "a", descriptor = "(Lclient!NHEPCMLW;Z)V")
	public void method177(@OriginalArg(0) Class3_Sub1_Sub3 arg0) {
		try {
			arg0.anInt441 = 0;
			this.anInt289 = arg0.method274();
			this.anInt301 = arg0.method275();
			this.anInt290 = arg0.method275();
			this.aClass7_1 = null;
			this.anInt300 = 0;
			@Pc(38) int local38;
			@Pc(50) int local50;
			@Pc(97) int local97;
			for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
				local38 = arg0.method274();
				if (local38 == 0) {
					this.anIntArray83[local33] = 0;
				} else {
					local50 = arg0.method274();
					this.anIntArray83[local33] = (local38 << 8) + local50;
					if (local33 == 0 && this.anIntArray83[0] == 65535) {
						this.aClass7_1 = Class7.method83(arg0.method276());
						break;
					}
					if (this.anIntArray83[local33] >= 512 && this.anIntArray83[local33] - 512 < Class12.anInt327) {
						local97 = Class12.method179(this.anIntArray83[local33] - 512).anInt332;
						if (local97 != 0) {
							this.anInt300 = local97;
						}
					}
				}
			}
			for (local38 = 0; local38 < 5; local38++) {
				local50 = arg0.method274();
				if (local50 < 0 || local50 >= client.anIntArrayArray23[local38].length) {
					local50 = 0;
				}
				this.anIntArray82[local38] = local50;
			}
			super.anInt752 = arg0.method276();
			if (super.anInt752 == 65535) {
				super.anInt752 = -1;
			}
			super.anInt753 = arg0.method276();
			if (super.anInt753 == 65535) {
				super.anInt753 = -1;
			}
			super.anInt748 = arg0.method276();
			if (super.anInt748 == 65535) {
				super.anInt748 = -1;
			}
			super.anInt749 = arg0.method276();
			if (super.anInt749 == 65535) {
				super.anInt749 = -1;
			}
			super.anInt750 = arg0.method276();
			if (super.anInt750 == 65535) {
				super.anInt750 = -1;
			}
			super.anInt751 = arg0.method276();
			if (super.anInt751 == 65535) {
				super.anInt751 = -1;
			}
			super.anInt738 = arg0.method276();
			if (super.anInt738 == 65535) {
				super.anInt738 = -1;
			}
			this.aString4 = Class38.method439(Class38.method436(arg0.method280()));
			this.anInt295 = arg0.method274();
			this.anInt288 = arg0.method276();
			this.aBoolean75 = true;
			this.aLong15 = 0L;
			for (local50 = 0; local50 < 12; local50++) {
				this.aLong15 <<= 0x4;
				if (this.anIntArray83[local50] >= 256) {
					this.aLong15 += (long) (this.anIntArray83[local50] - 256);
				}
			}
			if (this.anIntArray83[0] >= 256) {
				this.aLong15 += (long) (this.anIntArray83[0] - 256 >> 4);
			}
			if (this.anIntArray83[1] >= 256) {
				this.aLong15 += (long) (this.anIntArray83[1] - 256 >> 8);
			}
			for (local97 = 0; local97 < 5; local97++) {
				this.aLong15 <<= 0x3;
				this.aLong15 += (long) this.anIntArray82[local97];
			}
			this.aLong15 <<= 0x1;
			this.aLong15 += (long) this.anInt289;
		} catch (@Pc(344) RuntimeException local344) {
			signlink.reporterror("44734, " + arg0 + ", " + true + ", " + local344.toString());
			throw new RuntimeException();
		}
	}
}
