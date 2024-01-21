import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "Ob", descriptor = "Lclient!t;")
	public static Class42 aClass42_1 = new Class42(260, 0);

	@OriginalMember(owner = "client!bb", name = "tb", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!bb", name = "vb", descriptor = "I")
	private int anInt176;

	@OriginalMember(owner = "client!bb", name = "wb", descriptor = "I")
	public int anInt177;

	@OriginalMember(owner = "client!bb", name = "zb", descriptor = "I")
	public int anInt178;

	@OriginalMember(owner = "client!bb", name = "Ab", descriptor = "J")
	private long aLong9;

	@OriginalMember(owner = "client!bb", name = "Bb", descriptor = "I")
	public int anInt179;

	@OriginalMember(owner = "client!bb", name = "Cb", descriptor = "I")
	public int anInt180;

	@OriginalMember(owner = "client!bb", name = "Db", descriptor = "I")
	public int anInt181;

	@OriginalMember(owner = "client!bb", name = "Eb", descriptor = "I")
	public int anInt182;

	@OriginalMember(owner = "client!bb", name = "Fb", descriptor = "I")
	public int anInt183;

	@OriginalMember(owner = "client!bb", name = "Gb", descriptor = "I")
	public int anInt184;

	@OriginalMember(owner = "client!bb", name = "Hb", descriptor = "Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 aClass1_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!bb", name = "Ib", descriptor = "I")
	public int anInt185;

	@OriginalMember(owner = "client!bb", name = "Jb", descriptor = "I")
	public int anInt186;

	@OriginalMember(owner = "client!bb", name = "Kb", descriptor = "I")
	public int anInt187;

	@OriginalMember(owner = "client!bb", name = "Lb", descriptor = "I")
	public int anInt188;

	@OriginalMember(owner = "client!bb", name = "qb", descriptor = "B")
	private byte aByte2 = 67;

	@OriginalMember(owner = "client!bb", name = "rb", descriptor = "Z")
	private boolean aBoolean30 = true;

	@OriginalMember(owner = "client!bb", name = "sb", descriptor = "I")
	private int anInt175 = -838;

	@OriginalMember(owner = "client!bb", name = "ub", descriptor = "Z")
	public boolean aBoolean31 = false;

	@OriginalMember(owner = "client!bb", name = "xb", descriptor = "[I")
	public int[] anIntArray18 = new int[12];

	@OriginalMember(owner = "client!bb", name = "yb", descriptor = "[I")
	public int[] anIntArray19 = new int[5];

	@OriginalMember(owner = "client!bb", name = "Mb", descriptor = "Z")
	public boolean aBoolean32 = false;

	@OriginalMember(owner = "client!bb", name = "Nb", descriptor = "J")
	private long aLong10 = -1L;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLclient!mb;)V")
	public void method51(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt776 = 0;
			this.anInt176 = arg0.method498();
			this.anInt177 = arg0.method498();
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
			super.anInt132 = arg0.method500();
			if (super.anInt132 == 65535) {
				super.anInt132 = -1;
			}
			super.anInt133 = arg0.method500();
			if (super.anInt133 == 65535) {
				super.anInt133 = -1;
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
			this.aString4 = Class49.method683(Class49.method680(arg0.method504()));
			this.anInt178 = arg0.method498();
			this.aBoolean31 = true;
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
			for (@Pc(244) int local244 = 0; local244 < 5; local244++) {
				this.aLong9 <<= 0x3;
				this.aLong9 += this.anIntArray19[local244];
			}
			this.aLong9 <<= 0x1;
			this.aLong9 += this.anInt176;
		} catch (@Pc(282) RuntimeException local282) {
			signlink.reporterror("64115, " + -76 + ", " + arg0 + ", " + local282.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method316() {
		try {
			if (!this.aBoolean31) {
				return null;
			}
			@Pc(10) Class1_Sub1_Sub1_Sub5 local10 = this.method52();
			if (local10 == null) {
				return null;
			}
			super.anInt169 = local10.anInt571;
			local10.aBoolean139 = true;
			if (this.aBoolean32) {
				return local10;
			}
			if (super.anInt156 != -1 && super.anInt157 != -1) {
				@Pc(45) Class32 local45 = Class32.aClass32Array1[super.anInt156];
				@Pc(48) Class1_Sub1_Sub1_Sub5 local48 = local45.method530();
				if (local48 != null) {
					@Pc(62) Class1_Sub1_Sub1_Sub5 local62 = new Class1_Sub1_Sub1_Sub5(Class14.method328(super.anInt157), local48, true, 0, false);
					local62.method301(0, 0, -super.anInt160);
					local62.method295();
					local62.method296(local45.aClass27_2.anIntArray227[super.anInt157]);
					local62.anIntArrayArray8 = null;
					local62.anIntArrayArray7 = null;
					if (local45.anInt844 != 128 || local45.anInt845 != 128) {
						local62.method304(local45.anInt844, (byte) 9, local45.anInt844, local45.anInt845);
					}
					local62.method305(local45.anInt847 + 64, local45.anInt848 + 850, -30, -50, -30, true);
					@Pc(130) Class1_Sub1_Sub1_Sub5[] local130 = new Class1_Sub1_Sub1_Sub5[] { local10, local62 };
					local10 = new Class1_Sub1_Sub1_Sub5(local130, 2, 294, true);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub5_1 != null) {
				if (client.anInt440 >= this.anInt181) {
					this.aClass1_Sub1_Sub1_Sub5_1 = null;
				}
				if (client.anInt440 >= this.anInt180 && client.anInt440 < this.anInt181) {
					@Pc(159) Class1_Sub1_Sub1_Sub5 local159 = this.aClass1_Sub1_Sub1_Sub5_1;
					local159.method301(this.anInt182 - super.anInt128, this.anInt184 - super.anInt129, this.anInt183 - this.anInt179);
					if (super.anInt170 == 512) {
						local159.method299();
						local159.method299();
						local159.method299();
					} else if (super.anInt170 == 1024) {
						local159.method299();
						local159.method299();
					} else if (super.anInt170 == 1536) {
						local159.method299();
					}
					@Pc(222) Class1_Sub1_Sub1_Sub5[] local222 = new Class1_Sub1_Sub1_Sub5[] { local10, local159 };
					local10 = new Class1_Sub1_Sub1_Sub5(local222, 2, 294, true);
					if (super.anInt170 == 512) {
						local159.method299();
					} else if (super.anInt170 == 1024) {
						local159.method299();
						local159.method299();
					} else if (super.anInt170 == 1536) {
						local159.method299();
						local159.method299();
						local159.method299();
					}
					local159.method301(super.anInt128 - this.anInt182, super.anInt129 - this.anInt184, this.anInt179 - this.anInt183);
				}
			}
			local10.aBoolean139 = true;
			return local10;
		} catch (@Pc(288) RuntimeException local288) {
			signlink.reporterror("67017, " + -28205 + ", " + local288.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)Lclient!fb;")
	private Class1_Sub1_Sub1_Sub5 method52() {
		try {
			@Pc(16) long local16 = this.aLong9;
			@Pc(18) int local18 = -1;
			@Pc(20) int local20 = -1;
			@Pc(22) int local22 = -1;
			@Pc(24) int local24 = -1;
			if (super.anInt151 >= 0 && super.anInt154 == 0) {
				@Pc(35) Class27 local35 = Class27.aClass27Array1[super.anInt151];
				local18 = local35.anIntArray227[super.anInt152];
				if (super.anInt148 >= 0 && super.anInt148 != super.anInt132) {
					local20 = Class27.aClass27Array1[super.anInt148].anIntArray227[super.anInt149];
				}
				if (local35.anInt811 >= 0) {
					local22 = local35.anInt811;
					local16 += local22 - this.anIntArray18[5] << 8;
				}
				if (local35.anInt812 >= 0) {
					local24 = local35.anInt812;
					local16 += local24 - this.anIntArray18[3] << 16;
				}
			} else if (super.anInt148 >= 0) {
				local18 = Class27.aClass27Array1[super.anInt148].anIntArray227[super.anInt149];
			}
			@Pc(113) Class1_Sub1_Sub1_Sub5 local113 = (Class1_Sub1_Sub1_Sub5) aClass42_1.method641(local16);
			@Pc(119) int local119;
			@Pc(126) int local126;
			if (local113 == null) {
				@Pc(117) boolean local117 = false;
				for (local119 = 0; local119 < 12; local119++) {
					local126 = this.anIntArray18[local119];
					if (local24 >= 0 && local119 == 3) {
						local126 = local24;
					}
					if (local22 >= 0 && local119 == 5) {
						local126 = local22;
					}
					if (local126 >= 256 && local126 < 512 && !Class23.aClass23Array1[local126 - 256].method479((byte) 9)) {
						local117 = true;
					}
					if (local126 >= 512 && !Class15.method345(local126 - 512).method352(this.anInt176)) {
						local117 = true;
					}
				}
				if (local117) {
					if (this.aLong10 != -1L) {
						local113 = (Class1_Sub1_Sub1_Sub5) aClass42_1.method641(this.aLong10);
					}
					if (local113 == null) {
						return null;
					}
				}
			}
			if (local113 == null) {
				@Pc(196) Class1_Sub1_Sub1_Sub5[] local196 = new Class1_Sub1_Sub1_Sub5[12];
				local119 = 0;
				@Pc(207) int local207;
				for (local126 = 0; local126 < 12; local126++) {
					local207 = this.anIntArray18[local126];
					if (local24 >= 0 && local126 == 3) {
						local207 = local24;
					}
					if (local22 >= 0 && local126 == 5) {
						local207 = local22;
					}
					@Pc(235) Class1_Sub1_Sub1_Sub5 local235;
					if (local207 >= 256 && local207 < 512) {
						local235 = Class23.aClass23Array1[local207 - 256].method480();
						if (local235 != null) {
							local196[local119++] = local235;
						}
					}
					if (local207 >= 512) {
						local235 = Class15.method345(local207 - 512).method353(this.anInt176);
						if (local235 != null) {
							local196[local119++] = local235;
						}
					}
				}
				local113 = new Class1_Sub1_Sub1_Sub5(local196, local119, (byte) 2);
				for (local207 = 0; local207 < 5; local207++) {
					if (this.anIntArray19[local207] != 0) {
						local113.method302(client.anIntArrayArray3[local207][0], client.anIntArrayArray3[local207][this.anIntArray19[local207]]);
						if (local207 == 1) {
							local113.method302(client.anIntArray93[0], client.anIntArray93[this.anIntArray19[local207]]);
						}
					}
				}
				local113.method295();
				local113.method305(64, 850, -30, -50, -30, true);
				aClass42_1.method642(local113, local16, this.aByte2);
				this.aLong10 = local16;
			}
			if (this.aBoolean32) {
				return local113;
			}
			@Pc(341) Class1_Sub1_Sub1_Sub5 local341 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local341.method290(Class14.method328(local18) & Class14.method328(local20), local113);
			if (local18 != -1 && local20 != -1) {
				local341.method297((byte) 5, local20, local18, Class27.aClass27Array1[super.anInt151].anIntArray230);
			} else if (local18 != -1) {
				local341.method296(local18);
			}
			local341.method292();
			local341.anIntArrayArray8 = null;
			local341.anIntArrayArray7 = null;
			return local341;
		} catch (@Pc(389) RuntimeException local389) {
			signlink.reporterror("25803, " + -466 + ", " + local389.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method53() {
		try {
			if (!this.aBoolean31) {
				return null;
			}
			@Pc(8) boolean local8 = false;
			for (@Pc(10) int local10 = 0; local10 < 12; local10++) {
				@Pc(17) int local17 = this.anIntArray18[local10];
				if (local17 >= 256 && local17 < 512 && !Class23.aClass23Array1[local17 - 256].method481()) {
					local8 = true;
				}
				if (local17 >= 512 && !Class15.method345(local17 - 512).method354(this.anInt176)) {
					local8 = true;
				}
			}
			if (local8) {
				return null;
			}
			@Pc(58) Class1_Sub1_Sub1_Sub5[] local58 = new Class1_Sub1_Sub1_Sub5[12];
			@Pc(60) int local60 = 0;
			for (@Pc(62) int local62 = 0; local62 < 12; local62++) {
				@Pc(69) int local69 = this.anIntArray18[local62];
				@Pc(83) Class1_Sub1_Sub1_Sub5 local83;
				if (local69 >= 256 && local69 < 512) {
					local83 = Class23.aClass23Array1[local69 - 256].method482();
					if (local83 != null) {
						local58[local60++] = local83;
					}
				}
				if (local69 >= 512) {
					local83 = Class15.method345(local69 - 512).method355(this.anInt176);
					if (local83 != null) {
						local58[local60++] = local83;
					}
				}
			}
			@Pc(120) Class1_Sub1_Sub1_Sub5 local120 = new Class1_Sub1_Sub1_Sub5(local58, local60, (byte) 2);
			for (@Pc(122) int local122 = 0; local122 < 5; local122++) {
				if (this.anIntArray19[local122] != 0) {
					local120.method302(client.anIntArrayArray3[local122][0], client.anIntArrayArray3[local122][this.anIntArray19[local122]]);
					if (local122 == 1) {
						local120.method302(client.anIntArray93[0], client.anIntArray93[this.anIntArray19[local122]]);
					}
				}
			}
			return local120;
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("21530, " + 787 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method49(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			return this.aBoolean31;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("15720, " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}
}
