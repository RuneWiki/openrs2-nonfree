import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZQANNJZE")
public final class Class4_Sub1_Sub1_Sub2_Sub2 extends Class4_Sub1_Sub1_Sub2 {

	@OriginalMember(owner = "client!ZQANNJZE", name = "Gb", descriptor = "Lclient!ZYLCKQCD;")
	public static Class49 aClass49_9 = new Class49((byte) -89, 260);

	@OriginalMember(owner = "client!ZQANNJZE", name = "tb", descriptor = "I")
	private int anInt790;

	@OriginalMember(owner = "client!ZQANNJZE", name = "ub", descriptor = "I")
	public int anInt791;

	@OriginalMember(owner = "client!ZQANNJZE", name = "vb", descriptor = "I")
	public int anInt792;

	@OriginalMember(owner = "client!ZQANNJZE", name = "wb", descriptor = "I")
	public int anInt793;

	@OriginalMember(owner = "client!ZQANNJZE", name = "xb", descriptor = "Lclient!POJFANDE;")
	public Class4_Sub1_Sub1_Sub4 aClass4_Sub1_Sub1_Sub4_2;

	@OriginalMember(owner = "client!ZQANNJZE", name = "Ab", descriptor = "Lclient!WZSDIPBR;")
	public Class40 aClass40_2;

	@OriginalMember(owner = "client!ZQANNJZE", name = "Bb", descriptor = "I")
	public int anInt794;

	@OriginalMember(owner = "client!ZQANNJZE", name = "Cb", descriptor = "I")
	public int anInt795;

	@OriginalMember(owner = "client!ZQANNJZE", name = "Fb", descriptor = "J")
	private long aLong25;

	@OriginalMember(owner = "client!ZQANNJZE", name = "Hb", descriptor = "I")
	public int anInt797;

	@OriginalMember(owner = "client!ZQANNJZE", name = "Jb", descriptor = "I")
	public int anInt799;

	@OriginalMember(owner = "client!ZQANNJZE", name = "Lb", descriptor = "Ljava/lang/String;")
	public String aString15;

	@OriginalMember(owner = "client!ZQANNJZE", name = "Nb", descriptor = "I")
	public int anInt801;

	@OriginalMember(owner = "client!ZQANNJZE", name = "Ob", descriptor = "I")
	public int anInt802;

	@OriginalMember(owner = "client!ZQANNJZE", name = "Pb", descriptor = "I")
	public int anInt803;

	@OriginalMember(owner = "client!ZQANNJZE", name = "Qb", descriptor = "I")
	public int anInt804;

	@OriginalMember(owner = "client!ZQANNJZE", name = "Rb", descriptor = "I")
	public int anInt805;

	@OriginalMember(owner = "client!ZQANNJZE", name = "Ub", descriptor = "I")
	public int anInt807;

	@OriginalMember(owner = "client!ZQANNJZE", name = "qb", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!ZQANNJZE", name = "rb", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!ZQANNJZE", name = "sb", descriptor = "Z")
	public boolean aBoolean202 = false;

	@OriginalMember(owner = "client!ZQANNJZE", name = "yb", descriptor = "Z")
	private boolean aBoolean203 = true;

	@OriginalMember(owner = "client!ZQANNJZE", name = "zb", descriptor = "Z")
	public boolean aBoolean204 = false;

	@OriginalMember(owner = "client!ZQANNJZE", name = "Db", descriptor = "[I")
	public int[] anIntArray189 = new int[5];

	@OriginalMember(owner = "client!ZQANNJZE", name = "Eb", descriptor = "I")
	public int anInt796 = -1;

	@OriginalMember(owner = "client!ZQANNJZE", name = "Ib", descriptor = "I")
	private int anInt798 = -47744;

	@OriginalMember(owner = "client!ZQANNJZE", name = "Kb", descriptor = "[I")
	public int[] anIntArray190 = new int[12];

	@OriginalMember(owner = "client!ZQANNJZE", name = "Mb", descriptor = "I")
	public int anInt800 = -1;

	@OriginalMember(owner = "client!ZQANNJZE", name = "Sb", descriptor = "J")
	private long aLong26 = -1L;

	@OriginalMember(owner = "client!ZQANNJZE", name = "Tb", descriptor = "I")
	private int anInt806 = 8;

	@OriginalMember(owner = "client!ZQANNJZE", name = "a", descriptor = "(ILclient!PGNBHFUF;)V")
	public void method565(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub4 arg1) {
		try {
			arg1.anInt506 = 0;
			this.anInt790 = arg1.method355();
			this.anInt800 = arg1.method356();
			this.anInt796 = arg1.method356();
			this.aClass40_2 = null;
			this.anInt801 = 0;
			@Pc(29) int local29;
			@Pc(41) int local41;
			@Pc(88) int local88;
			for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
				local29 = arg1.method355();
				if (local29 == 0) {
					this.anIntArray190[local24] = 0;
				} else {
					local41 = arg1.method355();
					this.anIntArray190[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray190[0] == 65535) {
						this.aClass40_2 = Class40.method481(arg1.method357());
						break;
					}
					if (this.anIntArray190[local24] >= 512 && this.anIntArray190[local24] - 512 < Class17.anInt279) {
						local88 = Class17.method196(this.anIntArray190[local24] - 512).anInt280;
						if (local88 != 0) {
							this.anInt801 = local88;
						}
					}
				}
			}
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg1.method355();
				if (local41 < 0 || local41 >= client.anIntArrayArray23[local29].length) {
					local41 = 0;
				}
				this.anIntArray189[local29] = local41;
			}
			super.anInt787 = arg1.method357();
			if (super.anInt787 == 65535) {
				super.anInt787 = -1;
			}
			super.anInt788 = arg1.method357();
			if (super.anInt788 == 65535) {
				super.anInt788 = -1;
			}
			super.anInt771 = arg1.method357();
			if (super.anInt771 == 65535) {
				super.anInt771 = -1;
			}
			super.anInt772 = arg1.method357();
			if (super.anInt772 == 65535) {
				super.anInt772 = -1;
			}
			super.anInt773 = arg1.method357();
			if (arg0 < 0) {
				if (super.anInt773 == 65535) {
					super.anInt773 = -1;
				}
				super.anInt774 = arg1.method357();
				if (super.anInt774 == 65535) {
					super.anInt774 = -1;
				}
				super.anInt783 = arg1.method357();
				if (super.anInt783 == 65535) {
					super.anInt783 = -1;
				}
				this.aString15 = Class47.method554(Class47.method551(arg1.method361()));
				this.anInt799 = arg1.method355();
				this.anInt797 = arg1.method357();
				this.aBoolean204 = true;
				this.aLong25 = 0L;
				local41 = this.anIntArray190[5];
				local88 = this.anIntArray190[9];
				this.anIntArray190[5] = local88;
				this.anIntArray190[9] = local41;
				for (@Pc(250) int local250 = 0; local250 < 12; local250++) {
					this.aLong25 <<= 0x4;
					if (this.anIntArray190[local250] >= 256) {
						this.aLong25 += this.anIntArray190[local250] - 256;
					}
				}
				if (this.anIntArray190[0] >= 256) {
					this.aLong25 += this.anIntArray190[0] - 256 >> 4;
				}
				if (this.anIntArray190[1] >= 256) {
					this.aLong25 += this.anIntArray190[1] - 256 >> 8;
				}
				this.anIntArray190[5] = local41;
				this.anIntArray190[9] = local88;
				for (@Pc(332) int local332 = 0; local332 < 5; local332++) {
					this.aLong25 <<= 0x3;
					this.aLong25 += this.anIntArray189[local332];
				}
				this.aLong25 <<= 0x1;
				this.aLong25 += this.anInt790;
			}
		} catch (@Pc(370) RuntimeException local370) {
			signlink.reporterror("48806, " + arg0 + ", " + arg1 + ", " + local370.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZQANNJZE", name = "c", descriptor = "(Z)Lclient!POJFANDE;")
	private Class4_Sub1_Sub1_Sub4 method566() {
		try {
			if (this.aClass40_2 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt777 >= 0 && super.anInt780 == 0) {
					local6 = Class21.aClass21Array1[super.anInt777].anIntArray69[super.anInt778];
				} else if (super.anInt752 >= 0) {
					local6 = Class21.aClass21Array1[super.anInt752].anIntArray69[super.anInt753];
				}
				return this.aClass40_2.method483(null, local6, -1);
			}
			@Pc(48) long local48 = this.aLong25;
			@Pc(55) int local55 = -1;
			@Pc(57) int local57 = -1;
			@Pc(59) int local59 = -1;
			@Pc(61) int local61 = -1;
			if (super.anInt777 >= 0 && super.anInt780 == 0) {
				@Pc(72) Class21 local72 = Class21.aClass21Array1[super.anInt777];
				local55 = local72.anIntArray69[super.anInt778];
				if (super.anInt752 >= 0 && super.anInt752 != super.anInt787) {
					local57 = Class21.aClass21Array1[super.anInt752].anIntArray69[super.anInt753];
				}
				if (local72.anInt372 >= 0) {
					local59 = local72.anInt372;
					local48 += local59 - this.anIntArray190[5] << 8;
				}
				if (local72.anInt373 >= 0) {
					local61 = local72.anInt373;
					local48 += local61 - this.anIntArray190[3] << 16;
				}
			} else if (super.anInt752 >= 0) {
				local55 = Class21.aClass21Array1[super.anInt752].anIntArray69[super.anInt753];
			}
			@Pc(150) Class4_Sub1_Sub1_Sub4 local150 = (Class4_Sub1_Sub1_Sub4) aClass49_9.method570(local48);
			@Pc(156) int local156;
			@Pc(163) int local163;
			if (local150 == null) {
				@Pc(154) boolean local154 = false;
				for (local156 = 0; local156 < 12; local156++) {
					local163 = this.anIntArray190[local156];
					if (local61 >= 0 && local156 == 3) {
						local163 = local61;
					}
					if (local59 >= 0 && local156 == 5) {
						local163 = local59;
					}
					if (local163 >= 256 && local163 < 512 && !Class18.aClass18Array1[local163 - 256].method209()) {
						local154 = true;
					}
					if (local163 >= 512 && !Class17.method196(local163 - 512).method195(this.anInt790)) {
						local154 = true;
					}
				}
				if (local154) {
					if (this.aLong26 != -1L) {
						local150 = (Class4_Sub1_Sub1_Sub4) aClass49_9.method570(this.aLong26);
					}
					if (local150 == null) {
						return null;
					}
				}
			}
			if (local150 == null) {
				@Pc(233) Class4_Sub1_Sub1_Sub4[] local233 = new Class4_Sub1_Sub1_Sub4[12];
				local156 = 0;
				@Pc(244) int local244;
				for (local163 = 0; local163 < 12; local163++) {
					local244 = this.anIntArray190[local163];
					if (local61 >= 0 && local163 == 3) {
						local244 = local61;
					}
					if (local59 >= 0 && local163 == 5) {
						local244 = local59;
					}
					@Pc(272) Class4_Sub1_Sub1_Sub4 local272;
					if (local244 >= 256 && local244 < 512) {
						local272 = Class18.aClass18Array1[local244 - 256].method210();
						if (local272 != null) {
							local233[local156++] = local272;
						}
					}
					if (local244 >= 512) {
						local272 = Class17.method196(local244 - 512).method198(this.anInt790);
						if (local272 != null) {
							local233[local156++] = local272;
						}
					}
				}
				local150 = new Class4_Sub1_Sub1_Sub4(local156, -347, local233);
				for (local244 = 0; local244 < 5; local244++) {
					if (this.anIntArray189[local244] != 0) {
						local150.method413(client.anIntArrayArray23[local244][0], client.anIntArrayArray23[local244][this.anIntArray189[local244]]);
						if (local244 == 1) {
							local150.method413(client.anIntArray271[0], client.anIntArray271[this.anIntArray189[local244]]);
						}
					}
				}
				local150.method406();
				local150.method416(64, 850, -30, -50, -30, true);
				aClass49_9.method571(local150, this.anInt806, local48);
				this.aLong26 = local48;
			}
			if (this.aBoolean202) {
				return local150;
			}
			@Pc(378) Class4_Sub1_Sub1_Sub4 local378 = Class4_Sub1_Sub1_Sub4.aClass4_Sub1_Sub1_Sub4_1;
			local378.method401(this.aBoolean201, local150, Class16.method193(local55) & Class16.method193(local57));
			if (local55 != -1 && local57 != -1) {
				local378.method408(Class21.aClass21Array1[super.anInt777].anIntArray72, local55, local57);
			} else if (local55 != -1) {
				local378.method407(local55);
			}
			local378.method403((byte) 3);
			local378.anIntArrayArray12 = null;
			local378.anIntArrayArray11 = null;
			return local378;
		} catch (@Pc(427) RuntimeException local427) {
			signlink.reporterror("27800, " + false + ", " + local427.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZQANNJZE", name = "a", descriptor = "(Z)Lclient!POJFANDE;")
	@Override
	protected Class4_Sub1_Sub1_Sub4 method559() {
		try {
			if (!this.aBoolean204) {
				return null;
			}
			@Pc(20) Class4_Sub1_Sub1_Sub4 local20 = this.method566();
			if (local20 == null) {
				return null;
			}
			super.anInt775 = local20.anInt742;
			local20.aBoolean138 = true;
			if (this.aBoolean202) {
				return local20;
			}
			if (super.anInt759 != -1 && super.anInt760 != -1) {
				@Pc(49) Class6 local49 = Class6.aClass6Array1[super.anInt759];
				@Pc(52) Class4_Sub1_Sub1_Sub4 local52 = local49.method72();
				if (local52 != null) {
					@Pc(66) Class4_Sub1_Sub1_Sub4 local66 = new Class4_Sub1_Sub1_Sub4(Class16.method193(super.anInt760), true, false, -785, local52);
					local66.method412(-super.anInt763, 0, 0);
					local66.method406();
					local66.method407(local49.aClass21_1.anIntArray69[super.anInt760]);
					local66.anIntArrayArray12 = null;
					local66.anIntArrayArray11 = null;
					if (local49.anInt34 != 128 || local49.anInt35 != 128) {
						local66.method415(local49.anInt35, local49.anInt34, local49.anInt34);
					}
					local66.method416(local49.anInt37 + 64, local49.anInt38 + 850, -30, -50, -30, true);
					@Pc(134) Class4_Sub1_Sub1_Sub4[] local134 = new Class4_Sub1_Sub1_Sub4[] { local20, local66 };
					local20 = new Class4_Sub1_Sub1_Sub4(true, local134, 2, true);
				}
			}
			if (this.aClass4_Sub1_Sub1_Sub4_2 != null) {
				if (client.anInt1054 >= this.anInt795) {
					this.aClass4_Sub1_Sub1_Sub4_2 = null;
				}
				if (client.anInt1054 >= this.anInt794 && client.anInt1054 < this.anInt795) {
					@Pc(163) Class4_Sub1_Sub1_Sub4 local163 = this.aClass4_Sub1_Sub1_Sub4_2;
					local163.method412(this.anInt792 - this.anInt807, this.anInt791 - super.anInt764, this.anInt793 - super.anInt765);
					if (super.anInt768 == 512) {
						local163.method410();
						local163.method410();
						local163.method410();
					} else if (super.anInt768 == 1024) {
						local163.method410();
						local163.method410();
					} else if (super.anInt768 == 1536) {
						local163.method410();
					}
					@Pc(226) Class4_Sub1_Sub1_Sub4[] local226 = new Class4_Sub1_Sub1_Sub4[] { local20, local163 };
					local20 = new Class4_Sub1_Sub1_Sub4(true, local226, 2, true);
					if (super.anInt768 == 512) {
						local163.method410();
					} else if (super.anInt768 == 1024) {
						local163.method410();
						local163.method410();
					} else if (super.anInt768 == 1536) {
						local163.method410();
						local163.method410();
						local163.method410();
					}
					local163.method412(this.anInt807 - this.anInt792, super.anInt764 - this.anInt791, super.anInt765 - this.anInt793);
				}
			}
			local20.aBoolean138 = true;
			return local20;
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("48899, " + true + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZQANNJZE", name = "a", descriptor = "(I)Lclient!POJFANDE;")
	public Class4_Sub1_Sub1_Sub4 method567() {
		try {
			if (!this.aBoolean204) {
				return null;
			} else if (this.aClass40_2 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray190[local18];
					if (local25 >= 256 && local25 < 512 && !Class18.aClass18Array1[local25 - 256].method211()) {
						local16 = true;
					}
					if (local25 >= 512 && !Class17.method196(local25 - 512).method202(this.anInt790)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(66) Class4_Sub1_Sub1_Sub4[] local66 = new Class4_Sub1_Sub1_Sub4[12];
				@Pc(68) int local68 = 0;
				for (@Pc(70) int local70 = 0; local70 < 12; local70++) {
					@Pc(77) int local77 = this.anIntArray190[local70];
					@Pc(91) Class4_Sub1_Sub1_Sub4 local91;
					if (local77 >= 256 && local77 < 512) {
						local91 = Class18.aClass18Array1[local77 - 256].method212();
						if (local91 != null) {
							local66[local68++] = local91;
						}
					}
					if (local77 >= 512) {
						local91 = Class17.method196(local77 - 512).method206(this.anInt790);
						if (local91 != null) {
							local66[local68++] = local91;
						}
					}
				}
				@Pc(137) Class4_Sub1_Sub1_Sub4 local137 = new Class4_Sub1_Sub1_Sub4(local68, -347, local66);
				for (@Pc(139) int local139 = 0; local139 < 5; local139++) {
					if (this.anIntArray189[local139] != 0) {
						local137.method413(client.anIntArrayArray23[local139][0], client.anIntArrayArray23[local139][this.anIntArray189[local139]]);
						if (local139 == 1) {
							local137.method413(client.anIntArray271[0], client.anIntArray271[this.anIntArray189[local139]]);
						}
					}
				}
				return local137;
			} else {
				return this.aClass40_2.method484();
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("91080, " + 0 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZQANNJZE", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method562() {
		try {
			return this.aBoolean204;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("39425, " + 15 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}
}
