import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZGNGQRPJ")
public final class Class10_Sub1_Sub2_Sub3_Sub2 extends Class10_Sub1_Sub2_Sub3 {

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "Ib", descriptor = "Lclient!RHNYLZZL;")
	public static Class34 aClass34_9 = new Class34(260, -572);

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "qb", descriptor = "I")
	public int anInt762;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "rb", descriptor = "I")
	public int anInt763;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "sb", descriptor = "I")
	public int anInt764;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "tb", descriptor = "Lclient!LZYQDKJV;")
	public Class10_Sub1_Sub2_Sub4 aClass10_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "xb", descriptor = "I")
	public int anInt766;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "yb", descriptor = "Ljava/lang/String;")
	public String aString14;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "Ab", descriptor = "I")
	public int anInt767;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "Bb", descriptor = "J")
	private long aLong25;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "Cb", descriptor = "I")
	private int anInt768;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "Eb", descriptor = "Lclient!SLDUQHOR;")
	public Class38 aClass38_2;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "Gb", descriptor = "I")
	public int anInt770;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "Lb", descriptor = "I")
	public int anInt771;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "Mb", descriptor = "I")
	public int anInt772;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "Nb", descriptor = "I")
	public int anInt773;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "Pb", descriptor = "I")
	public int anInt774;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "Qb", descriptor = "I")
	public int anInt775;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "Rb", descriptor = "I")
	public int anInt776;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "Sb", descriptor = "I")
	public int anInt777;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "ub", descriptor = "Z")
	private boolean aBoolean197 = false;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "vb", descriptor = "I")
	public int anInt765 = -1;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "wb", descriptor = "J")
	private long aLong24 = -1L;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "zb", descriptor = "[I")
	public int[] anIntArray198 = new int[12];

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "Db", descriptor = "I")
	public int anInt769 = -1;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "Fb", descriptor = "Z")
	public boolean aBoolean198 = false;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "Hb", descriptor = "[I")
	public int[] anIntArray199 = new int[5];

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "Jb", descriptor = "Z")
	private boolean aBoolean199 = true;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "Kb", descriptor = "Z")
	public boolean aBoolean200 = false;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "Ob", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "Tb", descriptor = "I")
	private int anInt778 = 932;

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "a", descriptor = "(Z)Lclient!LZYQDKJV;")
	public Class10_Sub1_Sub2_Sub4 method543() {
		try {
			if (!this.aBoolean198) {
				return null;
			} else if (this.aClass38_2 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray198[local18];
					if (local25 >= 256 && local25 < 512 && !Class49.aClass49Array1[local25 - 256].method550()) {
						local16 = true;
					}
					if (local25 >= 512 && !Class17.method104(local25 - 512).method103(this.anInt768)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(66) Class10_Sub1_Sub2_Sub4[] local66 = new Class10_Sub1_Sub2_Sub4[12];
				@Pc(68) int local68 = 0;
				for (@Pc(70) int local70 = 0; local70 < 12; local70++) {
					@Pc(77) int local77 = this.anIntArray198[local70];
					@Pc(92) Class10_Sub1_Sub2_Sub4 local92;
					if (local77 >= 256 && local77 < 512) {
						local92 = Class49.aClass49Array1[local77 - 256].method551(this.aBoolean197);
						if (local92 != null) {
							local66[local68++] = local92;
						}
					}
					if (local77 >= 512) {
						local92 = Class17.method104(local77 - 512).method111(this.anInt768);
						if (local92 != null) {
							local66[local68++] = local92;
						}
					}
				}
				@Pc(129) Class10_Sub1_Sub2_Sub4 local129 = new Class10_Sub1_Sub2_Sub4(local68, local66, (byte) -89);
				for (@Pc(137) int local137 = 0; local137 < 5; local137++) {
					if (this.anIntArray199[local137] != 0) {
						local129.method285(client.anIntArrayArray24[local137][0], client.anIntArrayArray24[local137][this.anIntArray199[local137]]);
						if (local137 == 1) {
							local129.method285(client.anIntArray266[0], client.anIntArray266[this.anIntArray199[local137]]);
						}
					}
				}
				return local129;
			} else {
				return this.aClass38_2.method402();
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("51603, " + true + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "b", descriptor = "(B)Lclient!LZYQDKJV;")
	private Class10_Sub1_Sub2_Sub4 method544() {
		try {
			if (this.aClass38_2 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt753 >= 0 && super.anInt756 == 0) {
					local6 = Class15.aClass15Array1[super.anInt753].anIntArray47[super.anInt754];
				} else if (super.anInt719 >= 0) {
					local6 = Class15.aClass15Array1[super.anInt719].anIntArray47[super.anInt720];
				}
				return this.aClass38_2.method405(local6, -1, null);
			}
			@Pc(48) long local48 = this.aLong25;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (super.anInt753 >= 0 && super.anInt756 == 0) {
				@Pc(78) Class15 local78 = Class15.aClass15Array1[super.anInt753];
				local50 = local78.anIntArray47[super.anInt754];
				if (super.anInt719 >= 0 && super.anInt719 != super.anInt760) {
					local52 = Class15.aClass15Array1[super.anInt719].anIntArray47[super.anInt720];
				}
				if (local78.anInt155 >= 0) {
					local54 = local78.anInt155;
					local48 += local54 - this.anIntArray198[5] << 8;
				}
				if (local78.anInt156 >= 0) {
					local56 = local78.anInt156;
					local48 += local56 - this.anIntArray198[3] << 16;
				}
			} else if (super.anInt719 >= 0) {
				local50 = Class15.aClass15Array1[super.anInt719].anIntArray47[super.anInt720];
			}
			@Pc(156) Class10_Sub1_Sub2_Sub4 local156 = (Class10_Sub1_Sub2_Sub4) aClass34_9.method387(local48);
			@Pc(162) int local162;
			@Pc(169) int local169;
			if (local156 == null) {
				@Pc(160) boolean local160 = false;
				for (local162 = 0; local162 < 12; local162++) {
					local169 = this.anIntArray198[local162];
					if (local56 >= 0 && local162 == 3) {
						local169 = local56;
					}
					if (local54 >= 0 && local162 == 5) {
						local169 = local54;
					}
					if (local169 >= 256 && local169 < 512 && !Class49.aClass49Array1[local169 - 256].method548(256)) {
						local160 = true;
					}
					if (local169 >= 512 && !Class17.method104(local169 - 512).method108(this.anInt768)) {
						local160 = true;
					}
				}
				if (local160) {
					if (this.aLong24 != -1L) {
						local156 = (Class10_Sub1_Sub2_Sub4) aClass34_9.method387(this.aLong24);
					}
					if (local156 == null) {
						return null;
					}
				}
			}
			if (local156 == null) {
				@Pc(239) Class10_Sub1_Sub2_Sub4[] local239 = new Class10_Sub1_Sub2_Sub4[12];
				local162 = 0;
				@Pc(250) int local250;
				for (local169 = 0; local169 < 12; local169++) {
					local250 = this.anIntArray198[local169];
					if (local56 >= 0 && local169 == 3) {
						local250 = local56;
					}
					if (local54 >= 0 && local169 == 5) {
						local250 = local54;
					}
					@Pc(278) Class10_Sub1_Sub2_Sub4 local278;
					if (local250 >= 256 && local250 < 512) {
						local278 = Class49.aClass49Array1[local250 - 256].method549();
						if (local278 != null) {
							local239[local162++] = local278;
						}
					}
					if (local250 >= 512) {
						local278 = Class17.method104(local250 - 512).method105(this.anInt768);
						if (local278 != null) {
							local239[local162++] = local278;
						}
					}
				}
				local156 = new Class10_Sub1_Sub2_Sub4(local162, local239, (byte) -89);
				for (local250 = 0; local250 < 5; local250++) {
					if (this.anIntArray199[local250] != 0) {
						local156.method285(client.anIntArrayArray24[local250][0], client.anIntArrayArray24[local250][this.anIntArray199[local250]]);
						if (local250 == 1) {
							local156.method285(client.anIntArray266[0], client.anIntArray266[this.anIntArray199[local250]]);
						}
					}
				}
				local156.method278();
				local156.method288(64, 850, -30, -50, -30, true);
				aClass34_9.method388(local156, local48);
				this.aLong24 = local48;
			}
			if (this.aBoolean200) {
				return local156;
			}
			@Pc(383) Class10_Sub1_Sub2_Sub4 local383 = Class10_Sub1_Sub2_Sub4.aClass10_Sub1_Sub2_Sub4_1;
			local383.method273(Class22.method169(this.aBoolean199, local50) & Class22.method169(this.aBoolean199, local52), local156);
			if (local50 != -1 && local52 != -1) {
				local383.method280(local52, local50, Class15.aClass15Array1[super.anInt753].anIntArray50);
			} else if (local50 != -1) {
				local383.method279(local50, (byte) 6);
			}
			local383.method275(this.anInt778);
			local383.anIntArrayArray11 = null;
			local383.anIntArrayArray10 = null;
			return local383;
		} catch (@Pc(434) RuntimeException local434) {
			signlink.reporterror("95366, " + 122 + ", " + local434.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method539() {
		try {
			return this.aBoolean198;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("13217, " + 0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "a", descriptor = "(B)Lclient!LZYQDKJV;")
	@Override
	protected Class10_Sub1_Sub2_Sub4 method537(@OriginalArg(0) byte arg0) {
		try {
			if (!this.aBoolean198) {
				return null;
			}
			@Pc(10) Class10_Sub1_Sub2_Sub4 local10 = this.method544();
			if (local10 == null) {
				return null;
			}
			super.anInt723 = local10.anInt713;
			local10.aBoolean106 = true;
			if (this.aBoolean200) {
				return local10;
			}
			if (super.anInt743 != -1 && super.anInt744 != -1) {
				@Pc(39) Class28 local39 = Class28.aClass28Array1[super.anInt743];
				@Pc(42) Class10_Sub1_Sub2_Sub4 local42 = local39.method352();
				if (local42 != null) {
					@Pc(57) Class10_Sub1_Sub2_Sub4 local57 = new Class10_Sub1_Sub2_Sub4(false, false, true, local42, Class22.method169(this.aBoolean199, super.anInt744));
					local57.method284(0, 0, -super.anInt747);
					local57.method278();
					local57.method279(local39.aClass15_1.anIntArray47[super.anInt744], (byte) 6);
					local57.anIntArrayArray11 = null;
					local57.anIntArrayArray10 = null;
					if (local39.anInt438 != 128 || local39.anInt439 != 128) {
						local57.method287(local39.anInt439, local39.anInt438, local39.anInt438);
					}
					local57.method288(local39.anInt441 + 64, local39.anInt442 + 850, -30, -50, -30, true);
					@Pc(125) Class10_Sub1_Sub2_Sub4[] local125 = new Class10_Sub1_Sub2_Sub4[] { local10, local57 };
					local10 = new Class10_Sub1_Sub2_Sub4(2, true, 0, local125);
				}
			}
			if (this.aClass10_Sub1_Sub2_Sub4_2 != null) {
				if (client.anInt1050 >= this.anInt772) {
					this.aClass10_Sub1_Sub2_Sub4_2 = null;
				}
				if (client.anInt1050 >= this.anInt771 && client.anInt1050 < this.anInt772) {
					@Pc(154) Class10_Sub1_Sub2_Sub4 local154 = this.aClass10_Sub1_Sub2_Sub4_2;
					local154.method284(this.anInt762 - super.anInt739, this.anInt764 - super.anInt740, this.anInt763 - this.anInt766);
					if (super.anInt717 == 512) {
						local154.method282();
						local154.method282();
						local154.method282();
					} else if (super.anInt717 == 1024) {
						local154.method282();
						local154.method282();
					} else if (super.anInt717 == 1536) {
						local154.method282();
					}
					@Pc(217) Class10_Sub1_Sub2_Sub4[] local217 = new Class10_Sub1_Sub2_Sub4[] { local10, local154 };
					local10 = new Class10_Sub1_Sub2_Sub4(2, true, 0, local217);
					if (super.anInt717 == 512) {
						local154.method282();
					} else if (super.anInt717 == 1024) {
						local154.method282();
						local154.method282();
					} else if (super.anInt717 == 1536) {
						local154.method282();
						local154.method282();
						local154.method282();
					}
					local154.method284(super.anInt739 - this.anInt762, super.anInt740 - this.anInt764, this.anInt766 - this.anInt763);
				}
			}
			local10.aBoolean106 = true;
			if (arg0 == 3) {
				@Pc(285) boolean local285 = false;
			} else {
				this.aBoolean201 = !this.aBoolean201;
			}
			return local10;
		} catch (@Pc(298) RuntimeException local298) {
			signlink.reporterror("65126, " + arg0 + ", " + local298.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGNGQRPJ", name = "a", descriptor = "(Lclient!MFMVIYHT;I)V")
	public void method545(@OriginalArg(0) Class10_Sub1_Sub3 arg0) {
		try {
			arg0.anInt428 = 0;
			this.anInt768 = arg0.method311();
			this.anInt769 = arg0.method312();
			this.anInt765 = arg0.method312();
			this.aClass38_2 = null;
			this.anInt773 = 0;
			@Pc(29) int local29;
			@Pc(41) int local41;
			@Pc(88) int local88;
			for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
				local29 = arg0.method311();
				if (local29 == 0) {
					this.anIntArray198[local24] = 0;
				} else {
					local41 = arg0.method311();
					this.anIntArray198[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray198[0] == 65535) {
						this.aClass38_2 = Class38.method407(arg0.method313());
						break;
					}
					if (this.anIntArray198[local24] >= 512 && this.anIntArray198[local24] - 512 < Class17.anInt179) {
						local88 = Class17.method104(this.anIntArray198[local24] - 512).anInt176;
						if (local88 != 0) {
							this.anInt773 = local88;
						}
					}
				}
			}
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg0.method311();
				if (local41 < 0 || local41 >= client.anIntArrayArray24[local29].length) {
					local41 = 0;
				}
				this.anIntArray199[local29] = local41;
			}
			super.anInt760 = arg0.method313();
			if (super.anInt760 == 65535) {
				super.anInt760 = -1;
			}
			super.anInt761 = arg0.method313();
			if (super.anInt761 == 65535) {
				super.anInt761 = -1;
			}
			super.anInt748 = arg0.method313();
			if (super.anInt748 == 65535) {
				super.anInt748 = -1;
			}
			super.anInt749 = arg0.method313();
			if (super.anInt749 == 65535) {
				super.anInt749 = -1;
			}
			super.anInt750 = arg0.method313();
			if (super.anInt750 == 65535) {
				super.anInt750 = -1;
			}
			super.anInt751 = arg0.method313();
			if (super.anInt751 == 65535) {
				super.anInt751 = -1;
			}
			super.anInt758 = arg0.method313();
			if (super.anInt758 == 65535) {
				super.anInt758 = -1;
			}
			this.aString14 = Class26.method252(Class26.method249(arg0.method317()), (byte) 7);
			this.anInt767 = arg0.method311();
			this.anInt770 = arg0.method313();
			this.aBoolean198 = true;
			this.aLong25 = 0L;
			local41 = this.anIntArray198[5];
			local88 = this.anIntArray198[9];
			this.anIntArray198[5] = local88;
			this.anIntArray198[9] = local41;
			for (@Pc(248) int local248 = 0; local248 < 12; local248++) {
				this.aLong25 <<= 0x4;
				if (this.anIntArray198[local248] >= 256) {
					this.aLong25 += this.anIntArray198[local248] - 256;
				}
			}
			if (this.anIntArray198[0] >= 256) {
				this.aLong25 += this.anIntArray198[0] - 256 >> 4;
			}
			if (this.anIntArray198[1] >= 256) {
				this.aLong25 += this.anIntArray198[1] - 256 >> 8;
			}
			this.anIntArray198[5] = local41;
			this.anIntArray198[9] = local88;
			for (@Pc(330) int local330 = 0; local330 < 5; local330++) {
				this.aLong25 <<= 0x3;
				this.aLong25 += this.anIntArray199[local330];
			}
			this.aLong25 <<= 0x1;
			this.aLong25 += this.anInt768;
		} catch (@Pc(368) RuntimeException local368) {
			signlink.reporterror("13892, " + arg0 + ", " + 0 + ", " + local368.toString());
			throw new RuntimeException();
		}
	}
}
