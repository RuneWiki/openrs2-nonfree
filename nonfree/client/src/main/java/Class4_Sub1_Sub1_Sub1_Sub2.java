import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QAJCAYDZ")
public final class Class4_Sub1_Sub1_Sub1_Sub2 extends Class4_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!QAJCAYDZ", name = "Gb", descriptor = "Lclient!AKUDQPZE;")
	public static Class1 aClass1_6 = new Class1((byte) 8, 260);

	@OriginalMember(owner = "client!QAJCAYDZ", name = "sb", descriptor = "I")
	public int anInt674;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "tb", descriptor = "I")
	public int anInt675;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "ub", descriptor = "I")
	public int anInt676;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "vb", descriptor = "I")
	public int anInt677;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "Bb", descriptor = "J")
	private long aLong22;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "Db", descriptor = "I")
	public int anInt681;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "Eb", descriptor = "I")
	public int anInt682;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "Hb", descriptor = "I")
	public int anInt683;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "Ib", descriptor = "I")
	public int anInt684;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "Jb", descriptor = "I")
	public int anInt685;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "Kb", descriptor = "Lclient!IGXVZOHI;")
	public Class4_Sub1_Sub1_Sub3 aClass4_Sub1_Sub1_Sub3_2;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "Mb", descriptor = "I")
	public int anInt686;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "Nb", descriptor = "I")
	public int anInt687;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "Ob", descriptor = "Ljava/lang/String;")
	public String aString15;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "Rb", descriptor = "Lclient!AUWOQLEO;")
	public Class2 aClass2_2;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "Sb", descriptor = "I")
	private int anInt688;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "Tb", descriptor = "I")
	public int anInt689;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "Ub", descriptor = "I")
	public int anInt690;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "wb", descriptor = "B")
	private byte aByte24 = 5;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "xb", descriptor = "I")
	private int anInt678 = 5131;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "yb", descriptor = "J")
	private long aLong21 = -1L;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "zb", descriptor = "I")
	public int anInt679 = -1;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "Ab", descriptor = "I")
	public int anInt680 = -1;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "Cb", descriptor = "Z")
	private boolean aBoolean176 = true;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "Fb", descriptor = "Z")
	public boolean aBoolean177 = false;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "Lb", descriptor = "[I")
	public int[] anIntArray161 = new int[12];

	@OriginalMember(owner = "client!QAJCAYDZ", name = "Pb", descriptor = "[I")
	public int[] anIntArray162 = new int[5];

	@OriginalMember(owner = "client!QAJCAYDZ", name = "Qb", descriptor = "Z")
	public boolean aBoolean178 = false;

	@OriginalMember(owner = "client!QAJCAYDZ", name = "c", descriptor = "(I)Lclient!IGXVZOHI;")
	public Class4_Sub1_Sub1_Sub3 method474(@OriginalArg(0) int arg0) {
		try {
			if (!this.aBoolean177) {
				return null;
			} else if (this.aClass2_2 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray161[local18];
					if (local25 >= 256 && local25 < 512 && !Class50.aClass50Array1[local25 - 256].method571()) {
						local16 = true;
					}
					if (local25 >= 512 && !Class44.method536(local25 - 512).method540(this.anInt688)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(66) Class4_Sub1_Sub1_Sub3[] local66 = new Class4_Sub1_Sub1_Sub3[12];
				@Pc(68) int local68 = 0;
				for (@Pc(70) int local70 = 0; local70 < 12; local70++) {
					@Pc(77) int local77 = this.anIntArray161[local70];
					@Pc(91) Class4_Sub1_Sub1_Sub3 local91;
					if (local77 >= 256 && local77 < 512) {
						local91 = Class50.aClass50Array1[local77 - 256].method572();
						if (local91 != null) {
							local66[local68++] = local91;
						}
					}
					if (local77 >= 512) {
						local91 = Class44.method536(local77 - 512).method538(this.anInt688);
						if (local91 != null) {
							local66[local68++] = local91;
						}
					}
				}
				@Pc(128) Class4_Sub1_Sub1_Sub3 local128 = new Class4_Sub1_Sub1_Sub3(true, local68, local66);
				if (arg0 != 130) {
					throw new NullPointerException();
				}
				for (@Pc(137) int local137 = 0; local137 < 5; local137++) {
					if (this.anIntArray162[local137] != 0) {
						local128.method297(client.anIntArrayArray25[local137][0], client.anIntArrayArray25[local137][this.anIntArray162[local137]]);
						if (local137 == 1) {
							local128.method297(client.anIntArray267[0], client.anIntArray267[this.anIntArray162[local137]]);
						}
					}
				}
				return local128;
			} else {
				return this.aClass2_2.method11((byte) 5);
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("84443, " + arg0 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QAJCAYDZ", name = "a", descriptor = "(I)Lclient!IGXVZOHI;")
	@Override
	protected Class4_Sub1_Sub1_Sub3 method531() {
		try {
			if (!this.aBoolean177) {
				return null;
			}
			@Pc(10) Class4_Sub1_Sub1_Sub3 local10 = this.method475((byte) 5);
			if (local10 == null) {
				return null;
			}
			super.anInt642 = local10.anInt760;
			local10.aBoolean120 = true;
			if (this.aBoolean178) {
				return local10;
			}
			if (super.anInt669 != -1 && super.anInt670 != -1) {
				@Pc(46) Class42 local46 = Class42.aClass42Array1[super.anInt669];
				@Pc(49) Class4_Sub1_Sub1_Sub3 local49 = local46.method527();
				if (local49 != null) {
					@Pc(64) Class4_Sub1_Sub1_Sub3 local64 = new Class4_Sub1_Sub1_Sub3(true, local49, false, Class22.method274(super.anInt670, this.anInt678), (byte) 1);
					local64.method296(0, 0, -super.anInt673);
					local64.method290();
					local64.method291(local46.aClass5_1.anIntArray7[super.anInt670]);
					local64.anIntArrayArray5 = null;
					local64.anIntArrayArray4 = null;
					if (local46.anInt751 != 128 || local46.anInt752 != 128) {
						local64.method299(local46.anInt751, local46.anInt752, local46.anInt751);
					}
					local64.method300(local46.anInt754 + 64, local46.anInt755 + 850, -30, -50, -30, true);
					@Pc(132) Class4_Sub1_Sub1_Sub3[] local132 = new Class4_Sub1_Sub1_Sub3[] { local10, local64 };
					local10 = new Class4_Sub1_Sub1_Sub3(2, local132, true, (byte) 63);
				}
			}
			if (this.aClass4_Sub1_Sub1_Sub3_2 != null) {
				if (client.anInt866 >= this.anInt682) {
					this.aClass4_Sub1_Sub1_Sub3_2 = null;
				}
				if (client.anInt866 >= this.anInt681 && client.anInt866 < this.anInt682) {
					@Pc(161) Class4_Sub1_Sub1_Sub3 local161 = this.aClass4_Sub1_Sub1_Sub3_2;
					local161.method296(this.anInt683 - super.anInt648, this.anInt685 - super.anInt649, this.anInt684 - this.anInt687);
					if (super.anInt647 == 512) {
						local161.method294(262);
						local161.method294(262);
						local161.method294(262);
					} else if (super.anInt647 == 1024) {
						local161.method294(262);
						local161.method294(262);
					} else if (super.anInt647 == 1536) {
						local161.method294(262);
					}
					@Pc(224) Class4_Sub1_Sub1_Sub3[] local224 = new Class4_Sub1_Sub1_Sub3[] { local10, local161 };
					local10 = new Class4_Sub1_Sub1_Sub3(2, local224, true, (byte) 63);
					if (super.anInt647 == 512) {
						local161.method294(262);
					} else if (super.anInt647 == 1024) {
						local161.method294(262);
						local161.method294(262);
					} else if (super.anInt647 == 1536) {
						local161.method294(262);
						local161.method294(262);
						local161.method294(262);
					}
					local161.method296(super.anInt648 - this.anInt683, super.anInt649 - this.anInt685, this.anInt687 - this.anInt684);
				}
			}
			local10.aBoolean120 = true;
			return local10;
		} catch (@Pc(290) RuntimeException local290) {
			signlink.reporterror("28276, " + 47492 + ", " + local290.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QAJCAYDZ", name = "a", descriptor = "(B)Lclient!IGXVZOHI;")
	private Class4_Sub1_Sub1_Sub3 method475(@OriginalArg(0) byte arg0) {
		try {
			if (this.aClass2_2 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt626 >= 0 && super.anInt629 == 0) {
					local6 = Class5.aClass5Array1[super.anInt626].anIntArray7[super.anInt627];
				} else if (super.anInt664 >= 0) {
					local6 = Class5.aClass5Array1[super.anInt664].anIntArray7[super.anInt665];
				}
				return this.aClass2_2.method7(-1, local6, null);
			}
			@Pc(48) long local48 = this.aLong22;
			@Pc(53) boolean local53 = false;
			@Pc(61) int local61 = -1;
			@Pc(63) int local63 = -1;
			@Pc(65) int local65 = -1;
			@Pc(67) int local67 = -1;
			if (super.anInt626 >= 0 && super.anInt629 == 0) {
				@Pc(78) Class5 local78 = Class5.aClass5Array1[super.anInt626];
				local61 = local78.anIntArray7[super.anInt627];
				if (super.anInt664 >= 0 && super.anInt664 != super.anInt645) {
					local63 = Class5.aClass5Array1[super.anInt664].anIntArray7[super.anInt665];
				}
				if (local78.anInt42 >= 0) {
					local65 = local78.anInt42;
					local48 += local65 - this.anIntArray161[5] << 8;
				}
				if (local78.anInt43 >= 0) {
					local67 = local78.anInt43;
					local48 += local67 - this.anIntArray161[3] << 16;
				}
			} else if (super.anInt664 >= 0) {
				local61 = Class5.aClass5Array1[super.anInt664].anIntArray7[super.anInt665];
			}
			@Pc(156) Class4_Sub1_Sub1_Sub3 local156 = (Class4_Sub1_Sub1_Sub3) aClass1_6.method1(local48);
			@Pc(162) int local162;
			@Pc(169) int local169;
			if (local156 == null) {
				@Pc(160) boolean local160 = false;
				for (local162 = 0; local162 < 12; local162++) {
					local169 = this.anIntArray161[local162];
					if (local67 >= 0 && local162 == 3) {
						local169 = local67;
					}
					if (local65 >= 0 && local162 == 5) {
						local169 = local65;
					}
					if (local169 >= 256 && local169 < 512 && !Class50.aClass50Array1[local169 - 256].method569()) {
						local160 = true;
					}
					if (local169 >= 512 && !Class44.method536(local169 - 512).method535(this.anInt688)) {
						local160 = true;
					}
				}
				if (local160) {
					if (this.aLong21 != -1L) {
						local156 = (Class4_Sub1_Sub1_Sub3) aClass1_6.method1(this.aLong21);
					}
					if (local156 == null) {
						return null;
					}
				}
			}
			if (local156 == null) {
				@Pc(239) Class4_Sub1_Sub1_Sub3[] local239 = new Class4_Sub1_Sub1_Sub3[12];
				local162 = 0;
				@Pc(250) int local250;
				for (local169 = 0; local169 < 12; local169++) {
					local250 = this.anIntArray161[local169];
					if (local67 >= 0 && local169 == 3) {
						local250 = local67;
					}
					if (local65 >= 0 && local169 == 5) {
						local250 = local65;
					}
					@Pc(279) Class4_Sub1_Sub1_Sub3 local279;
					if (local250 >= 256 && local250 < 512) {
						local279 = Class50.aClass50Array1[local250 - 256].method570(this.aByte24);
						if (local279 != null) {
							local239[local162++] = local279;
						}
					}
					if (local250 >= 512) {
						local279 = Class44.method536(local250 - 512).method545(this.anInt688);
						if (local279 != null) {
							local239[local162++] = local279;
						}
					}
				}
				local156 = new Class4_Sub1_Sub1_Sub3(true, local162, local239);
				for (local250 = 0; local250 < 5; local250++) {
					if (this.anIntArray162[local250] != 0) {
						local156.method297(client.anIntArrayArray25[local250][0], client.anIntArrayArray25[local250][this.anIntArray162[local250]]);
						if (local250 == 1) {
							local156.method297(client.anIntArray267[0], client.anIntArray267[this.anIntArray162[local250]]);
						}
					}
				}
				local156.method290();
				local156.method300(64, 850, -30, -50, -30, true);
				aClass1_6.method2(local156, local48);
				this.aLong21 = local48;
			}
			if (this.aBoolean178) {
				return local156;
			}
			@Pc(384) Class4_Sub1_Sub1_Sub3 local384 = Class4_Sub1_Sub1_Sub3.aClass4_Sub1_Sub1_Sub3_1;
			local384.method285(local156, Class22.method274(local61, this.anInt678) & Class22.method274(local63, this.anInt678));
			if (local61 != -1 && local63 != -1) {
				local384.method292(Class5.aClass5Array1[super.anInt626].anIntArray10, local63, local61);
			} else if (local61 != -1) {
				local384.method291(local61);
			}
			local384.method287(856);
			local384.anIntArrayArray5 = null;
			local384.anIntArrayArray4 = null;
			return local384;
		} catch (@Pc(434) RuntimeException local434) {
			signlink.reporterror("37925, " + arg0 + ", " + local434.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QAJCAYDZ", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method469() {
		try {
			return this.aBoolean177;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("30091, " + true + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QAJCAYDZ", name = "a", descriptor = "(Lclient!EGCCHUZS;I)V")
	public void method476(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			arg0.anInt242 = 0;
			this.anInt688 = arg0.method167();
			this.anInt679 = arg0.method168();
			this.anInt680 = arg0.method168();
			this.aClass2_2 = null;
			this.anInt690 = 0;
			@Pc(29) int local29;
			@Pc(41) int local41;
			@Pc(88) int local88;
			for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
				local29 = arg0.method167();
				if (local29 == 0) {
					this.anIntArray161[local24] = 0;
				} else {
					local41 = arg0.method167();
					this.anIntArray161[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray161[0] == 65535) {
						this.aClass2_2 = Class2.method9(arg0.method169());
						break;
					}
					if (this.anIntArray161[local24] >= 512 && this.anIntArray161[local24] - 512 < Class44.anInt779) {
						local88 = Class44.method536(this.anIntArray161[local24] - 512).anInt777;
						if (local88 != 0) {
							this.anInt690 = local88;
						}
					}
				}
			}
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg0.method167();
				if (local41 < 0 || local41 >= client.anIntArrayArray25[local29].length) {
					local41 = 0;
				}
				this.anIntArray162[local29] = local41;
			}
			super.anInt645 = arg0.method169();
			if (super.anInt645 == 65535) {
				super.anInt645 = -1;
			}
			super.anInt646 = arg0.method169();
			if (super.anInt646 == 65535) {
				super.anInt646 = -1;
			}
			super.anInt632 = arg0.method169();
			if (super.anInt632 == 65535) {
				super.anInt632 = -1;
			}
			super.anInt633 = arg0.method169();
			if (super.anInt633 == 65535) {
				super.anInt633 = -1;
			}
			super.anInt634 = arg0.method169();
			if (super.anInt634 == 65535) {
				super.anInt634 = -1;
			}
			super.anInt635 = arg0.method169();
			@Pc(186) boolean local186 = false;
			if (super.anInt635 == 65535) {
				super.anInt635 = -1;
			}
			super.anInt659 = arg0.method169();
			if (super.anInt659 == 65535) {
				super.anInt659 = -1;
			}
			this.aString15 = Class46.method554(Class46.method551(arg0.method173()));
			this.anInt689 = arg0.method167();
			this.anInt686 = arg0.method169();
			this.aBoolean177 = true;
			this.aLong22 = 0L;
			for (local41 = 0; local41 < 12; local41++) {
				this.aLong22 <<= 0x4;
				if (this.anIntArray161[local41] >= 256) {
					this.aLong22 += this.anIntArray161[local41] - 256;
				}
			}
			if (this.anIntArray161[0] >= 256) {
				this.aLong22 += this.anIntArray161[0] - 256 >> 4;
			}
			if (this.anIntArray161[1] >= 256) {
				this.aLong22 += this.anIntArray161[1] - 256 >> 8;
			}
			for (local88 = 0; local88 < 5; local88++) {
				this.aLong22 <<= 0x3;
				this.aLong22 += this.anIntArray162[local88];
			}
			this.aLong22 <<= 0x1;
			this.aLong22 += this.anInt688;
		} catch (@Pc(339) RuntimeException local339) {
			signlink.reporterror("47270, " + arg0 + ", " + arg1 + ", " + local339.toString());
			throw new RuntimeException();
		}
	}
}
