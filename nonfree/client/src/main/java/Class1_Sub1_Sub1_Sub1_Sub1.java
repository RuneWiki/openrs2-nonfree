import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AHUILQJH")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!AHUILQJH", name = "qb", descriptor = "Lclient!CZWVRQJW;")
	public static Class4 aClass4_1 = new Class4(false, 260);

	@OriginalMember(owner = "client!AHUILQJH", name = "ub", descriptor = "I")
	public int anInt105;

	@OriginalMember(owner = "client!AHUILQJH", name = "vb", descriptor = "I")
	public int anInt106;

	@OriginalMember(owner = "client!AHUILQJH", name = "wb", descriptor = "I")
	public int anInt107;

	@OriginalMember(owner = "client!AHUILQJH", name = "xb", descriptor = "Lclient!HEQROJXW;")
	public Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!AHUILQJH", name = "zb", descriptor = "I")
	public int anInt109;

	@OriginalMember(owner = "client!AHUILQJH", name = "Ab", descriptor = "I")
	public int anInt110;

	@OriginalMember(owner = "client!AHUILQJH", name = "Bb", descriptor = "I")
	public int anInt111;

	@OriginalMember(owner = "client!AHUILQJH", name = "Cb", descriptor = "I")
	public int anInt112;

	@OriginalMember(owner = "client!AHUILQJH", name = "Eb", descriptor = "I")
	public int anInt113;

	@OriginalMember(owner = "client!AHUILQJH", name = "Ib", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!AHUILQJH", name = "Jb", descriptor = "Lclient!ZNUYRYPY;")
	public Class49 aClass49_1;

	@OriginalMember(owner = "client!AHUILQJH", name = "Kb", descriptor = "I")
	public int anInt115;

	@OriginalMember(owner = "client!AHUILQJH", name = "Lb", descriptor = "J")
	private long aLong7;

	@OriginalMember(owner = "client!AHUILQJH", name = "Mb", descriptor = "I")
	public int anInt116;

	@OriginalMember(owner = "client!AHUILQJH", name = "Nb", descriptor = "I")
	public int anInt117;

	@OriginalMember(owner = "client!AHUILQJH", name = "Ob", descriptor = "I")
	public int anInt118;

	@OriginalMember(owner = "client!AHUILQJH", name = "Pb", descriptor = "I")
	public int anInt119;

	@OriginalMember(owner = "client!AHUILQJH", name = "Qb", descriptor = "I")
	private int anInt120;

	@OriginalMember(owner = "client!AHUILQJH", name = "Rb", descriptor = "I")
	public int anInt121;

	@OriginalMember(owner = "client!AHUILQJH", name = "rb", descriptor = "Z")
	private boolean aBoolean17 = true;

	@OriginalMember(owner = "client!AHUILQJH", name = "sb", descriptor = "J")
	private long aLong6 = -1L;

	@OriginalMember(owner = "client!AHUILQJH", name = "tb", descriptor = "[I")
	public int[] anIntArray11 = new int[5];

	@OriginalMember(owner = "client!AHUILQJH", name = "yb", descriptor = "I")
	private int anInt108 = 3;

	@OriginalMember(owner = "client!AHUILQJH", name = "Db", descriptor = "Z")
	public boolean aBoolean18 = false;

	@OriginalMember(owner = "client!AHUILQJH", name = "Fb", descriptor = "[I")
	public int[] anIntArray12 = new int[12];

	@OriginalMember(owner = "client!AHUILQJH", name = "Gb", descriptor = "Z")
	public boolean aBoolean19 = false;

	@OriginalMember(owner = "client!AHUILQJH", name = "Hb", descriptor = "I")
	private int anInt114 = 9;

	@OriginalMember(owner = "client!AHUILQJH", name = "a", descriptor = "(I)Lclient!HEQROJXW;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method547() {
		try {
			if (!this.aBoolean19) {
				return null;
			}
			@Pc(10) Class1_Sub1_Sub1_Sub4 local10 = this.method26();
			if (local10 == null) {
				return null;
			}
			super.anInt632 = local10.anInt788;
			local10.aBoolean97 = true;
			if (this.aBoolean18) {
				return local10;
			}
			if (super.anInt634 != -1 && super.anInt635 != -1) {
				@Pc(49) Class38 local49 = Class38.aClass38Array1[super.anInt634];
				@Pc(52) Class1_Sub1_Sub1_Sub4 local52 = local49.method513();
				if (local52 != null) {
					@Pc(66) Class1_Sub1_Sub1_Sub4 local66 = new Class1_Sub1_Sub1_Sub4(-167, false, true, Class37.method510(super.anInt635), local52);
					local66.method283(-super.anInt638, 0, 0);
					local66.method277();
					local66.method278(local49.aClass46_2.anIntArray196[super.anInt635]);
					local66.anIntArrayArray12 = null;
					local66.anIntArrayArray11 = null;
					if (local49.anInt680 != 128 || local49.anInt681 != 128) {
						local66.method286(local49.anInt681, local49.anInt680, local49.anInt680);
					}
					local66.method287(local49.anInt683 + 64, local49.anInt684 + 850, -30, -50, -30, true);
					@Pc(134) Class1_Sub1_Sub1_Sub4[] local134 = new Class1_Sub1_Sub1_Sub4[] { local10, local66 };
					local10 = new Class1_Sub1_Sub1_Sub4(true, 2, local134, true);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub4_1 != null) {
				if (client.anInt931 >= this.anInt110) {
					this.aClass1_Sub1_Sub1_Sub4_1 = null;
				}
				if (client.anInt931 >= this.anInt109 && client.anInt931 < this.anInt110) {
					@Pc(163) Class1_Sub1_Sub1_Sub4 local163 = this.aClass1_Sub1_Sub1_Sub4_1;
					local163.method283(this.anInt106 - this.anInt113, this.anInt107 - super.anInt621, this.anInt105 - super.anInt620);
					if (super.anInt658 == 512) {
						local163.method281();
						local163.method281();
						local163.method281();
					} else if (super.anInt658 == 1024) {
						local163.method281();
						local163.method281();
					} else if (super.anInt658 == 1536) {
						local163.method281();
					}
					@Pc(226) Class1_Sub1_Sub1_Sub4[] local226 = new Class1_Sub1_Sub1_Sub4[] { local10, local163 };
					local10 = new Class1_Sub1_Sub1_Sub4(true, 2, local226, true);
					if (super.anInt658 == 512) {
						local163.method281();
					} else if (super.anInt658 == 1024) {
						local163.method281();
						local163.method281();
					} else if (super.anInt658 == 1536) {
						local163.method281();
						local163.method281();
						local163.method281();
					}
					local163.method283(this.anInt113 - this.anInt106, super.anInt621 - this.anInt107, super.anInt620 - this.anInt105);
				}
			}
			local10.aBoolean97 = true;
			return local10;
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("71988, " + 8 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AHUILQJH", name = "a", descriptor = "(B)Lclient!HEQROJXW;")
	private Class1_Sub1_Sub1_Sub4 method26() {
		try {
			if (this.aClass49_1 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt659 >= 0 && super.anInt662 == 0) {
					local6 = Class46.aClass46Array1[super.anInt659].anIntArray196[super.anInt660];
				} else if (super.anInt624 >= 0) {
					local6 = Class46.aClass46Array1[super.anInt624].anIntArray196[super.anInt625];
				}
				return this.aClass49_1.method562(null, -1, local6);
			}
			@Pc(48) long local48 = this.aLong7;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (super.anInt659 >= 0 && super.anInt662 == 0) {
				@Pc(67) Class46 local67 = Class46.aClass46Array1[super.anInt659];
				local50 = local67.anIntArray196[super.anInt660];
				if (super.anInt624 >= 0 && super.anInt624 != super.anInt630) {
					local52 = Class46.aClass46Array1[super.anInt624].anIntArray196[super.anInt625];
				}
				if (local67.anInt778 >= 0) {
					local54 = local67.anInt778;
					local48 += local54 - this.anIntArray12[5] << 8;
				}
				if (local67.anInt779 >= 0) {
					local56 = local67.anInt779;
					local48 += local56 - this.anIntArray12[3] << 16;
				}
			} else if (super.anInt624 >= 0) {
				local50 = Class46.aClass46Array1[super.anInt624].anIntArray196[super.anInt625];
			}
			@Pc(145) Class1_Sub1_Sub1_Sub4 local145 = (Class1_Sub1_Sub1_Sub4) aClass4_1.method33(local48);
			@Pc(157) int local157;
			@Pc(164) int local164;
			if (local145 == null) {
				@Pc(155) boolean local155 = false;
				for (local157 = 0; local157 < 12; local157++) {
					local164 = this.anIntArray12[local157];
					if (local56 >= 0 && local157 == 3) {
						local164 = local56;
					}
					if (local54 >= 0 && local157 == 5) {
						local164 = local54;
					}
					if (local164 >= 256 && local164 < 512 && !Class47.aClass47Array1[local164 - 256].method550()) {
						local155 = true;
					}
					if (local164 >= 512 && !Class21.method335(local164 - 512).method341(this.anInt120)) {
						local155 = true;
					}
				}
				if (local155) {
					if (this.aLong6 != -1L) {
						local145 = (Class1_Sub1_Sub1_Sub4) aClass4_1.method33(this.aLong6);
					}
					if (local145 == null) {
						return null;
					}
				}
			}
			if (local145 == null) {
				@Pc(234) Class1_Sub1_Sub1_Sub4[] local234 = new Class1_Sub1_Sub1_Sub4[12];
				local157 = 0;
				@Pc(245) int local245;
				for (local164 = 0; local164 < 12; local164++) {
					local245 = this.anIntArray12[local164];
					if (local56 >= 0 && local164 == 3) {
						local245 = local56;
					}
					if (local54 >= 0 && local164 == 5) {
						local245 = local54;
					}
					@Pc(273) Class1_Sub1_Sub1_Sub4 local273;
					if (local245 >= 256 && local245 < 512) {
						local273 = Class47.aClass47Array1[local245 - 256].method551(173);
						if (local273 != null) {
							local234[local157++] = local273;
						}
					}
					if (local245 >= 512) {
						local273 = Class21.method335(local245 - 512).method331(this.anInt120);
						if (local273 != null) {
							local234[local157++] = local273;
						}
					}
				}
				local145 = new Class1_Sub1_Sub1_Sub4((byte) 6, local157, local234);
				for (local245 = 0; local245 < 5; local245++) {
					if (this.anIntArray11[local245] != 0) {
						local145.method284(client.anIntArrayArray23[local245][0], client.anIntArrayArray23[local245][this.anIntArray11[local245]]);
						if (local245 == 1) {
							local145.method284(client.anIntArray263[0], client.anIntArray263[this.anIntArray11[local245]]);
						}
					}
				}
				local145.method277();
				local145.method287(64, 850, -30, -50, -30, true);
				aClass4_1.method34(local145, local48);
				this.aLong6 = local48;
			}
			if (this.aBoolean18) {
				return local145;
			}
			@Pc(378) Class1_Sub1_Sub1_Sub4 local378 = Class1_Sub1_Sub1_Sub4.aClass1_Sub1_Sub1_Sub4_2;
			local378.method272(Class37.method510(local50) & Class37.method510(local52), local145);
			if (local50 != -1 && local52 != -1) {
				local378.method279(local50, Class46.aClass46Array1[super.anInt659].anIntArray199, local52);
			} else if (local50 != -1) {
				local378.method278(local50);
			}
			local378.method274();
			local378.anIntArrayArray12 = null;
			local378.anIntArrayArray11 = null;
			return local378;
		} catch (@Pc(426) RuntimeException local426) {
			signlink.reporterror("71564, " + 6 + ", " + local426.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AHUILQJH", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method498() {
		try {
			return this.aBoolean19;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("68868, " + false + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AHUILQJH", name = "a", descriptor = "(Lclient!LDILQFVA;I)V")
	public void method27(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt443 = 0;
			this.anInt120 = arg0.method359();
			this.anInt115 = arg0.method359();
			this.aClass49_1 = null;
			this.anInt112 = 0;
			@Pc(25) int local25;
			@Pc(37) int local37;
			@Pc(84) int local84;
			for (@Pc(20) int local20 = 0; local20 < 12; local20++) {
				local25 = arg0.method359();
				if (local25 == 0) {
					this.anIntArray12[local20] = 0;
				} else {
					local37 = arg0.method359();
					this.anIntArray12[local20] = (local25 << 8) + local37;
					if (local20 == 0 && this.anIntArray12[0] == 65535) {
						this.aClass49_1 = Class49.method565(arg0.method361());
						break;
					}
					if (this.anIntArray12[local20] >= 512 && this.anIntArray12[local20] - 512 < Class21.anInt398) {
						local84 = Class21.method335(this.anIntArray12[local20] - 512).anInt413;
						if (local84 != 0) {
							this.anInt112 = local84;
						}
					}
				}
			}
			for (local25 = 0; local25 < 5; local25++) {
				local37 = arg0.method359();
				if (local37 < 0 || local37 >= client.anIntArrayArray23[local25].length) {
					local37 = 0;
				}
				this.anIntArray11[local25] = local37;
			}
			super.anInt630 = arg0.method361();
			if (super.anInt630 == 65535) {
				super.anInt630 = -1;
			}
			super.anInt631 = arg0.method361();
			if (super.anInt631 == 65535) {
				super.anInt631 = -1;
			}
			super.anInt648 = arg0.method361();
			if (super.anInt648 == 65535) {
				super.anInt648 = -1;
			}
			super.anInt649 = arg0.method361();
			if (super.anInt649 == 65535) {
				super.anInt649 = -1;
			}
			super.anInt650 = arg0.method361();
			if (super.anInt650 == 65535) {
				super.anInt650 = -1;
			}
			super.anInt651 = arg0.method361();
			if (super.anInt651 == 65535) {
				super.anInt651 = -1;
			}
			super.anInt652 = arg0.method361();
			if (super.anInt652 == 65535) {
				super.anInt652 = -1;
			}
			this.aString3 = Class15.method198(Class15.method195(arg0.method365()));
			this.anInt111 = arg0.method359();
			this.anInt121 = arg0.method361();
			this.aBoolean19 = true;
			this.aLong7 = 0L;
			for (local37 = 0; local37 < 12; local37++) {
				this.aLong7 <<= 0x4;
				if (this.anIntArray12[local37] >= 256) {
					this.aLong7 += this.anIntArray12[local37] - 256;
				}
			}
			if (this.anIntArray12[0] >= 256) {
				this.aLong7 += this.anIntArray12[0] - 256 >> 4;
			}
			if (this.anIntArray12[1] >= 256) {
				this.aLong7 += this.anIntArray12[1] - 256 >> 8;
			}
			for (local84 = 0; local84 < 5; local84++) {
				this.aLong7 <<= 0x3;
				this.aLong7 += this.anIntArray11[local84];
			}
			this.aLong7 <<= 0x1;
			this.aLong7 += this.anInt120;
		} catch (@Pc(340) RuntimeException local340) {
			signlink.reporterror("29898, " + arg0 + ", " + 8 + ", " + local340.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AHUILQJH", name = "b", descriptor = "(B)Lclient!HEQROJXW;")
	public Class1_Sub1_Sub1_Sub4 method28() {
		try {
			if (!this.aBoolean19) {
				return null;
			} else if (this.aClass49_1 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray12[local18];
					if (local25 >= 256 && local25 < 512 && !Class47.aClass47Array1[local25 - 256].method552()) {
						local16 = true;
					}
					if (local25 >= 512 && !Class21.method335(local25 - 512).method340(this.anInt120)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(73) Class1_Sub1_Sub1_Sub4[] local73 = new Class1_Sub1_Sub1_Sub4[12];
				@Pc(75) int local75 = 0;
				for (@Pc(77) int local77 = 0; local77 < 12; local77++) {
					@Pc(84) int local84 = this.anIntArray12[local77];
					@Pc(98) Class1_Sub1_Sub1_Sub4 local98;
					if (local84 >= 256 && local84 < 512) {
						local98 = Class47.aClass47Array1[local84 - 256].method553();
						if (local98 != null) {
							local73[local75++] = local98;
						}
					}
					if (local84 >= 512) {
						local98 = Class21.method335(local84 - 512).method333(this.anInt120);
						if (local98 != null) {
							local73[local75++] = local98;
						}
					}
				}
				@Pc(135) Class1_Sub1_Sub1_Sub4 local135 = new Class1_Sub1_Sub1_Sub4((byte) 6, local75, local73);
				for (@Pc(137) int local137 = 0; local137 < 5; local137++) {
					if (this.anIntArray11[local137] != 0) {
						local135.method284(client.anIntArrayArray23[local137][0], client.anIntArrayArray23[local137][this.anIntArray11[local137]]);
						if (local137 == 1) {
							local135.method284(client.anIntArray263[0], client.anIntArray263[this.anIntArray11[local137]]);
						}
					}
				}
				return local135;
			} else {
				return this.aClass49_1.method566();
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("2693, " + -114 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}
}
