import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "Nb", descriptor = "Lclient!t;")
	public static Class42 aClass42_1 = new Class42(0, 260);

	@OriginalMember(owner = "client!bb", name = "sb", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!bb", name = "ub", descriptor = "I")
	private int anInt178;

	@OriginalMember(owner = "client!bb", name = "vb", descriptor = "I")
	public int anInt179;

	@OriginalMember(owner = "client!bb", name = "yb", descriptor = "I")
	public int anInt180;

	@OriginalMember(owner = "client!bb", name = "zb", descriptor = "J")
	private long aLong9;

	@OriginalMember(owner = "client!bb", name = "Ab", descriptor = "I")
	public int anInt181;

	@OriginalMember(owner = "client!bb", name = "Bb", descriptor = "I")
	public int anInt182;

	@OriginalMember(owner = "client!bb", name = "Cb", descriptor = "I")
	public int anInt183;

	@OriginalMember(owner = "client!bb", name = "Db", descriptor = "I")
	public int anInt184;

	@OriginalMember(owner = "client!bb", name = "Eb", descriptor = "I")
	public int anInt185;

	@OriginalMember(owner = "client!bb", name = "Fb", descriptor = "I")
	public int anInt186;

	@OriginalMember(owner = "client!bb", name = "Gb", descriptor = "Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 aClass1_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!bb", name = "Hb", descriptor = "I")
	public int anInt187;

	@OriginalMember(owner = "client!bb", name = "Ib", descriptor = "I")
	public int anInt188;

	@OriginalMember(owner = "client!bb", name = "Jb", descriptor = "I")
	public int anInt189;

	@OriginalMember(owner = "client!bb", name = "Kb", descriptor = "I")
	public int anInt190;

	@OriginalMember(owner = "client!bb", name = "qb", descriptor = "I")
	private int anInt176 = 650;

	@OriginalMember(owner = "client!bb", name = "rb", descriptor = "I")
	private int anInt177 = 48629;

	@OriginalMember(owner = "client!bb", name = "tb", descriptor = "Z")
	public boolean aBoolean27 = false;

	@OriginalMember(owner = "client!bb", name = "wb", descriptor = "[I")
	public int[] anIntArray18 = new int[12];

	@OriginalMember(owner = "client!bb", name = "xb", descriptor = "[I")
	public int[] anIntArray19 = new int[5];

	@OriginalMember(owner = "client!bb", name = "Lb", descriptor = "Z")
	public boolean aBoolean28 = false;

	@OriginalMember(owner = "client!bb", name = "Mb", descriptor = "J")
	private long aLong10 = -1L;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!mb;Z)V")
	public void method51(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		try {
			arg0.anInt768 = 0;
			this.anInt178 = arg0.method498();
			this.anInt179 = arg0.method498();
			@Pc(19) int local19;
			@Pc(31) int local31;
			for (@Pc(14) int local14 = 0; local14 < 12; local14++) {
				local19 = arg0.method498();
				if (local19 == 0) {
					this.anIntArray18[local14] = 0;
				} else {
					local31 = arg0.method498();
					this.anIntArray18[local14] = (local19 << 8) + local31;
				}
			}
			for (local19 = 0; local19 < 5; local19++) {
				local31 = arg0.method498();
				if (local31 < 0 || local31 >= client.anIntArrayArray3[local19].length) {
					local31 = 0;
				}
				this.anIntArray19[local19] = local31;
			}
			super.anInt134 = arg0.method500();
			if (super.anInt134 == 65535) {
				super.anInt134 = -1;
			}
			super.anInt135 = arg0.method500();
			if (super.anInt135 == 65535) {
				super.anInt135 = -1;
			}
			super.anInt136 = arg0.method500();
			if (super.anInt136 == 65535) {
				super.anInt136 = -1;
			}
			super.anInt137 = arg0.method500();
			if (super.anInt137 == 65535) {
				super.anInt137 = -1;
			}
			super.anInt138 = arg0.method500();
			if (super.anInt138 == 65535) {
				super.anInt138 = -1;
			}
			super.anInt139 = arg0.method500();
			if (super.anInt139 == 65535) {
				super.anInt139 = -1;
			}
			super.anInt140 = arg0.method500();
			if (super.anInt140 == 65535) {
				super.anInt140 = -1;
			}
			this.aString4 = Class49.method683(Class49.method680(arg0.method504()));
			this.anInt180 = arg0.method498();
			if (arg1) {
				this.aBoolean27 = true;
				this.aLong9 = 0L;
				for (local31 = 0; local31 < 12; local31++) {
					this.aLong9 <<= 0x4;
					if (this.anIntArray18[local31] >= 256) {
						this.aLong9 += this.anIntArray18[local31] - 256;
					}
				}
				if (this.anIntArray18[0] >= 256) {
					this.aLong9 += this.anIntArray18[0] - 256 >> 4;
				}
				if (this.anIntArray18[1] >= 256) {
					this.aLong9 += this.anIntArray18[1] - 256 >> 8;
				}
				for (@Pc(243) int local243 = 0; local243 < 5; local243++) {
					this.aLong9 <<= 0x3;
					this.aLong9 += this.anIntArray19[local243];
				}
				this.aLong9 <<= 0x1;
				this.aLong9 += this.anInt178;
			}
		} catch (@Pc(281) RuntimeException local281) {
			signlink.reporterror("28653, " + arg0 + ", " + arg1 + ", " + local281.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method316(@OriginalArg(0) int arg0) {
		try {
			if (!this.aBoolean27) {
				return null;
			}
			@Pc(10) Class1_Sub1_Sub1_Sub5 local10 = this.method52();
			@Pc(14) boolean local14 = false;
			if (local10 == null) {
				return null;
			}
			super.anInt171 = local10.anInt560;
			local10.aBoolean130 = true;
			if (this.aBoolean28) {
				return local10;
			}
			if (super.anInt158 != -1 && super.anInt159 != -1) {
				@Pc(43) Class32 local43 = Class32.aClass32Array1[super.anInt158];
				@Pc(46) Class1_Sub1_Sub1_Sub5 local46 = local43.method530();
				if (local46 != null) {
					@Pc(60) Class1_Sub1_Sub1_Sub5 local60 = new Class1_Sub1_Sub1_Sub5(23727, Class14.method328(super.anInt159), true, local46, false);
					local60.method301(0, -super.anInt162, 0);
					local60.method295();
					local60.method296(local43.aClass27_2.anIntArray227[super.anInt159]);
					local60.anIntArrayArray8 = null;
					local60.anIntArrayArray7 = null;
					if (local43.anInt838 != 128 || local43.anInt839 != 128) {
						local60.method304(local43.anInt838, local43.anInt839, local43.anInt838);
					}
					local60.method305(local43.anInt841 + 64, local43.anInt842 + 850, -30, -50, -30, true);
					@Pc(128) Class1_Sub1_Sub1_Sub5[] local128 = new Class1_Sub1_Sub1_Sub5[] { local10, local60 };
					local10 = new Class1_Sub1_Sub1_Sub5(2, 962, local128, true);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub5_1 != null) {
				if (client.anInt446 >= this.anInt183) {
					this.aClass1_Sub1_Sub1_Sub5_1 = null;
				}
				if (client.anInt446 >= this.anInt182 && client.anInt446 < this.anInt183) {
					@Pc(157) Class1_Sub1_Sub1_Sub5 local157 = this.aClass1_Sub1_Sub1_Sub5_1;
					local157.method301(this.anInt184 - super.anInt130, this.anInt185 - this.anInt181, this.anInt186 - super.anInt131);
					if (super.anInt172 == 512) {
						local157.method299((byte) 4);
						local157.method299((byte) 4);
						local157.method299((byte) 4);
					} else if (super.anInt172 == 1024) {
						local157.method299((byte) 4);
						local157.method299((byte) 4);
					} else if (super.anInt172 == 1536) {
						local157.method299((byte) 4);
					}
					@Pc(220) Class1_Sub1_Sub1_Sub5[] local220 = new Class1_Sub1_Sub1_Sub5[] { local10, local157 };
					local10 = new Class1_Sub1_Sub1_Sub5(2, 962, local220, true);
					if (super.anInt172 == 512) {
						local157.method299((byte) 4);
					} else if (super.anInt172 == 1024) {
						local157.method299((byte) 4);
						local157.method299((byte) 4);
					} else if (super.anInt172 == 1536) {
						local157.method299((byte) 4);
						local157.method299((byte) 4);
						local157.method299((byte) 4);
					}
					local157.method301(super.anInt130 - this.anInt184, this.anInt181 - this.anInt185, super.anInt131 - this.anInt186);
				}
			}
			local10.aBoolean130 = true;
			return local10;
		} catch (@Pc(286) RuntimeException local286) {
			signlink.reporterror("35722, " + arg0 + ", " + local286.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)Lclient!fb;")
	private Class1_Sub1_Sub1_Sub5 method52() {
		try {
			@Pc(4) long local4 = this.aLong9;
			@Pc(6) int local6 = -1;
			@Pc(8) int local8 = -1;
			@Pc(10) int local10 = -1;
			@Pc(12) int local12 = -1;
			if (super.anInt153 >= 0 && super.anInt156 == 0) {
				@Pc(32) Class27 local32 = Class27.aClass27Array1[super.anInt153];
				local6 = local32.anIntArray227[super.anInt154];
				if (super.anInt150 >= 0 && super.anInt150 != super.anInt134) {
					local8 = Class27.aClass27Array1[super.anInt150].anIntArray227[super.anInt151];
				}
				if (local32.anInt803 >= 0) {
					local10 = local32.anInt803;
					local4 += local10 - this.anIntArray18[5] << 8;
				}
				if (local32.anInt804 >= 0) {
					local12 = local32.anInt804;
					local4 += local12 - this.anIntArray18[3] << 16;
				}
			} else if (super.anInt150 >= 0) {
				local6 = Class27.aClass27Array1[super.anInt150].anIntArray227[super.anInt151];
			}
			@Pc(110) Class1_Sub1_Sub1_Sub5 local110 = (Class1_Sub1_Sub1_Sub5) aClass42_1.method641(local4);
			@Pc(116) int local116;
			@Pc(123) int local123;
			if (local110 == null) {
				@Pc(114) boolean local114 = false;
				for (local116 = 0; local116 < 12; local116++) {
					local123 = this.anIntArray18[local116];
					if (local12 >= 0 && local116 == 3) {
						local123 = local12;
					}
					if (local10 >= 0 && local116 == 5) {
						local123 = local10;
					}
					if (local123 >= 256 && local123 < 512 && !Class23.aClass23Array1[local123 - 256].method479()) {
						local114 = true;
					}
					if (local123 >= 512 && !Class15.method345(local123 - 512).method352(this.anInt178)) {
						local114 = true;
					}
				}
				if (local114) {
					if (this.aLong10 != -1L) {
						local110 = (Class1_Sub1_Sub1_Sub5) aClass42_1.method641(this.aLong10);
					}
					if (local110 == null) {
						return null;
					}
				}
			}
			if (local110 == null) {
				@Pc(193) Class1_Sub1_Sub1_Sub5[] local193 = new Class1_Sub1_Sub1_Sub5[12];
				local116 = 0;
				@Pc(204) int local204;
				for (local123 = 0; local123 < 12; local123++) {
					local204 = this.anIntArray18[local123];
					if (local12 >= 0 && local123 == 3) {
						local204 = local12;
					}
					if (local10 >= 0 && local123 == 5) {
						local204 = local10;
					}
					@Pc(232) Class1_Sub1_Sub1_Sub5 local232;
					if (local204 >= 256 && local204 < 512) {
						local232 = Class23.aClass23Array1[local204 - 256].method480();
						if (local232 != null) {
							local193[local116++] = local232;
						}
					}
					if (local204 >= 512) {
						local232 = Class15.method345(local204 - 512).method353(this.anInt178);
						if (local232 != null) {
							local193[local116++] = local232;
						}
					}
				}
				local110 = new Class1_Sub1_Sub1_Sub5((byte) 1, local116, local193);
				for (local204 = 0; local204 < 5; local204++) {
					if (this.anIntArray19[local204] != 0) {
						local110.method302(client.anIntArrayArray3[local204][0], client.anIntArrayArray3[local204][this.anIntArray19[local204]]);
						if (local204 == 1) {
							local110.method302(client.anIntArray87[0], client.anIntArray87[this.anIntArray19[local204]]);
						}
					}
				}
				local110.method295();
				local110.method305(64, 850, -30, -50, -30, true);
				aClass42_1.method642(local4, local110);
				this.aLong10 = local4;
			}
			if (this.aBoolean28) {
				return local110;
			}
			@Pc(337) Class1_Sub1_Sub1_Sub5 local337 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local337.method290(local110, Class14.method328(local6) & Class14.method328(local8));
			if (local6 != -1 && local8 != -1) {
				local337.method297(Class27.aClass27Array1[super.anInt153].anIntArray230, local8, local6);
			} else if (local6 != -1) {
				local337.method296(local6);
			}
			local337.method292();
			local337.anIntArrayArray8 = null;
			local337.anIntArrayArray7 = null;
			return local337;
		} catch (@Pc(385) RuntimeException local385) {
			signlink.reporterror("74087, " + 0 + ", " + local385.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method53() {
		try {
			if (!this.aBoolean27) {
				return null;
			}
			@Pc(8) boolean local8 = false;
			for (@Pc(10) int local10 = 0; local10 < 12; local10++) {
				@Pc(17) int local17 = this.anIntArray18[local10];
				if (local17 >= 256 && local17 < 512 && !Class23.aClass23Array1[local17 - 256].method481(423)) {
					local8 = true;
				}
				if (local17 >= 512 && !Class15.method345(local17 - 512).method354(this.anInt178, (byte) 4)) {
					local8 = true;
				}
			}
			if (local8) {
				return null;
			}
			@Pc(58) Class1_Sub1_Sub1_Sub5[] local58 = new Class1_Sub1_Sub1_Sub5[12];
			if (this.anInt177 != 48629) {
				this.anInt176 = 156;
			}
			@Pc(67) int local67 = 0;
			for (@Pc(69) int local69 = 0; local69 < 12; local69++) {
				@Pc(76) int local76 = this.anIntArray18[local69];
				@Pc(90) Class1_Sub1_Sub1_Sub5 local90;
				if (local76 >= 256 && local76 < 512) {
					local90 = Class23.aClass23Array1[local76 - 256].method482();
					if (local90 != null) {
						local58[local67++] = local90;
					}
				}
				if (local76 >= 512) {
					local90 = Class15.method345(local76 - 512).method355(this.anInt178);
					if (local90 != null) {
						local58[local67++] = local90;
					}
				}
			}
			@Pc(127) Class1_Sub1_Sub1_Sub5 local127 = new Class1_Sub1_Sub1_Sub5((byte) 1, local67, local58);
			for (@Pc(129) int local129 = 0; local129 < 5; local129++) {
				if (this.anIntArray19[local129] != 0) {
					local127.method302(client.anIntArrayArray3[local129][0], client.anIntArrayArray3[local129][this.anIntArray19[local129]]);
					if (local129 == 1) {
						local127.method302(client.anIntArray87[0], client.anIntArray87[this.anIntArray19[local129]]);
					}
				}
			}
			return local127;
		} catch (@Pc(172) RuntimeException local172) {
			signlink.reporterror("14781, " + 48629 + ", " + local172.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method49() {
		try {
			return this.aBoolean27;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("8274, " + false + ", " + local16.toString());
			throw new RuntimeException();
		}
	}
}
