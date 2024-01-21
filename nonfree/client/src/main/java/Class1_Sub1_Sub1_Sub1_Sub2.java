import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "Ob", descriptor = "Lclient!t;")
	public static Class40 aClass40_1 = new Class40(260, (byte) 3);

	@OriginalMember(owner = "client!bb", name = "sb", descriptor = "I")
	private int anInt174;

	@OriginalMember(owner = "client!bb", name = "tb", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!bb", name = "vb", descriptor = "I")
	private int anInt175;

	@OriginalMember(owner = "client!bb", name = "wb", descriptor = "I")
	public int anInt176;

	@OriginalMember(owner = "client!bb", name = "zb", descriptor = "I")
	public int anInt177;

	@OriginalMember(owner = "client!bb", name = "Ab", descriptor = "J")
	private long aLong9;

	@OriginalMember(owner = "client!bb", name = "Bb", descriptor = "I")
	public int anInt178;

	@OriginalMember(owner = "client!bb", name = "Cb", descriptor = "I")
	public int anInt179;

	@OriginalMember(owner = "client!bb", name = "Db", descriptor = "I")
	public int anInt180;

	@OriginalMember(owner = "client!bb", name = "Eb", descriptor = "I")
	public int anInt181;

	@OriginalMember(owner = "client!bb", name = "Fb", descriptor = "I")
	public int anInt182;

	@OriginalMember(owner = "client!bb", name = "Gb", descriptor = "I")
	public int anInt183;

	@OriginalMember(owner = "client!bb", name = "Hb", descriptor = "Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 aClass1_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!bb", name = "Ib", descriptor = "I")
	public int anInt184;

	@OriginalMember(owner = "client!bb", name = "Jb", descriptor = "I")
	public int anInt185;

	@OriginalMember(owner = "client!bb", name = "Kb", descriptor = "I")
	public int anInt186;

	@OriginalMember(owner = "client!bb", name = "Lb", descriptor = "I")
	public int anInt187;

	@OriginalMember(owner = "client!bb", name = "pb", descriptor = "Z")
	private boolean aBoolean26 = true;

	@OriginalMember(owner = "client!bb", name = "qb", descriptor = "B")
	private byte aByte3 = 86;

	@OriginalMember(owner = "client!bb", name = "rb", descriptor = "Z")
	private boolean aBoolean27 = true;

	@OriginalMember(owner = "client!bb", name = "ub", descriptor = "Z")
	public boolean aBoolean28 = false;

	@OriginalMember(owner = "client!bb", name = "xb", descriptor = "[I")
	public int[] anIntArray18 = new int[12];

	@OriginalMember(owner = "client!bb", name = "yb", descriptor = "[I")
	public int[] anIntArray19 = new int[5];

	@OriginalMember(owner = "client!bb", name = "Mb", descriptor = "Z")
	public boolean aBoolean29 = false;

	@OriginalMember(owner = "client!bb", name = "Nb", descriptor = "J")
	private long aLong10 = -1L;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!mb;I)V")
	public void method51(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			arg0.anInt778 = 0;
			this.anInt175 = arg0.method496();
			this.anInt176 = arg0.method496();
			@Pc(19) int local19;
			@Pc(31) int local31;
			for (@Pc(14) int local14 = 0; local14 < 12; local14++) {
				local19 = arg0.method496();
				if (local19 == 0) {
					this.anIntArray18[local14] = 0;
				} else {
					local31 = arg0.method496();
					this.anIntArray18[local14] = (local19 << 8) + local31;
				}
			}
			for (local19 = 0; local19 < 5; local19++) {
				local31 = arg0.method496();
				if (local31 < 0 || local31 >= client.anIntArrayArray3[local19].length) {
					local31 = 0;
				}
				this.anIntArray19[local19] = local31;
			}
			if (arg1 == 0) {
				super.anInt132 = arg0.method498();
				if (super.anInt132 == 65535) {
					super.anInt132 = -1;
				}
				super.anInt133 = arg0.method498();
				if (super.anInt133 == 65535) {
					super.anInt133 = -1;
				}
				super.anInt134 = arg0.method498();
				if (super.anInt134 == 65535) {
					super.anInt134 = -1;
				}
				super.anInt135 = arg0.method498();
				if (super.anInt135 == 65535) {
					super.anInt135 = -1;
				}
				super.anInt136 = arg0.method498();
				if (super.anInt136 == 65535) {
					super.anInt136 = -1;
				}
				super.anInt137 = arg0.method498();
				if (super.anInt137 == 65535) {
					super.anInt137 = -1;
				}
				super.anInt138 = arg0.method498();
				if (super.anInt138 == 65535) {
					super.anInt138 = -1;
				}
				this.aString4 = Class47.method679(Class47.method676(arg0.method502()));
				this.anInt177 = arg0.method496();
				this.aBoolean28 = true;
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
				this.aLong9 += this.anInt175;
			}
		} catch (@Pc(281) RuntimeException local281) {
			signlink.reporterror("14057, " + arg0 + ", " + arg1 + ", " + local281.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method315() {
		try {
			if (!this.aBoolean28) {
				return null;
			}
			@Pc(11) Class1_Sub1_Sub1_Sub5 local11 = this.method52(this.aBoolean27);
			if (local11 == null) {
				return null;
			}
			super.anInt169 = local11.anInt571;
			local11.aBoolean122 = true;
			if (this.aBoolean29) {
				return local11;
			}
			if (super.anInt156 != -1 && super.anInt157 != -1) {
				@Pc(40) Class29 local40 = Class29.aClass29Array1[super.anInt156];
				@Pc(43) Class1_Sub1_Sub1_Sub5 local43 = local40.method520();
				if (local43 != null) {
					@Pc(59) Class1_Sub1_Sub1_Sub5 local59 = new Class1_Sub1_Sub1_Sub5(true, local43, false, true, !local40.aBoolean187);
					local59.method300(0, 0, -super.anInt160);
					local59.method294(this.aByte3);
					local59.method295(local40.aClass27_2.anIntArray226[super.anInt157]);
					local59.anIntArrayArray8 = null;
					local59.anIntArrayArray7 = null;
					if (local40.anInt843 != 128 || local40.anInt844 != 128) {
						local59.method303(local40.anInt843, local40.anInt843, local40.anInt844);
					}
					local59.method304(local40.anInt846 + 64, local40.anInt847 + 850, -30, -50, -30, true);
					@Pc(128) Class1_Sub1_Sub1_Sub5[] local128 = new Class1_Sub1_Sub1_Sub5[] { local11, local59 };
					local11 = new Class1_Sub1_Sub1_Sub5((byte) 22, 2, true, local128);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub5_1 != null) {
				if (client.anInt367 >= this.anInt180) {
					this.aClass1_Sub1_Sub1_Sub5_1 = null;
				}
				if (client.anInt367 >= this.anInt179 && client.anInt367 < this.anInt180) {
					@Pc(157) Class1_Sub1_Sub1_Sub5 local157 = this.aClass1_Sub1_Sub1_Sub5_1;
					local157.method300(this.anInt181 - super.anInt128, this.anInt183 - super.anInt129, this.anInt182 - this.anInt178);
					if (super.anInt170 == 512) {
						local157.method298();
						local157.method298();
						local157.method298();
					} else if (super.anInt170 == 1024) {
						local157.method298();
						local157.method298();
					} else if (super.anInt170 == 1536) {
						local157.method298();
					}
					@Pc(220) Class1_Sub1_Sub1_Sub5[] local220 = new Class1_Sub1_Sub1_Sub5[] { local11, local157 };
					local11 = new Class1_Sub1_Sub1_Sub5((byte) 22, 2, true, local220);
					if (super.anInt170 == 512) {
						local157.method298();
					} else if (super.anInt170 == 1024) {
						local157.method298();
						local157.method298();
					} else if (super.anInt170 == 1536) {
						local157.method298();
						local157.method298();
						local157.method298();
					}
					local157.method300(super.anInt128 - this.anInt181, super.anInt129 - this.anInt183, this.anInt178 - this.anInt182);
				}
			}
			local11.aBoolean122 = true;
			return local11;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("21395, " + -13634 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)Lclient!fb;")
	private Class1_Sub1_Sub1_Sub5 method52(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(4) long local4 = this.aLong9;
			@Pc(6) int local6 = -1;
			@Pc(8) int local8 = -1;
			@Pc(10) int local10 = -1;
			@Pc(12) int local12 = -1;
			if (super.anInt151 >= 0 && super.anInt154 == 0) {
				@Pc(23) Class27 local23 = Class27.aClass27Array1[super.anInt151];
				local6 = local23.anIntArray226[super.anInt152];
				if (super.anInt148 >= 0 && super.anInt148 != super.anInt132) {
					local8 = Class27.aClass27Array1[super.anInt148].anIntArray226[super.anInt149];
				}
				if (local23.anInt815 >= 0) {
					local10 = local23.anInt815;
					local4 += local10 - this.anIntArray18[5] << 8;
				}
				if (local23.anInt816 >= 0) {
					local12 = local23.anInt816;
					local4 += local12 - this.anIntArray18[3] << 16;
				}
			} else if (super.anInt148 >= 0) {
				local6 = Class27.aClass27Array1[super.anInt148].anIntArray226[super.anInt149];
			}
			@Pc(101) Class1_Sub1_Sub1_Sub5 local101 = (Class1_Sub1_Sub1_Sub5) aClass40_1.method637(local4);
			if (!arg0) {
				this.aBoolean26 = !this.aBoolean26;
			}
			@Pc(117) int local117;
			@Pc(124) int local124;
			if (local101 == null) {
				@Pc(115) boolean local115 = false;
				for (local117 = 0; local117 < 12; local117++) {
					local124 = this.anIntArray18[local117];
					if (local12 >= 0 && local117 == 3) {
						local124 = local12;
					}
					if (local10 >= 0 && local117 == 5) {
						local124 = local10;
					}
					if (local124 >= 256 && local124 < 512 && !Class23.aClass23Array1[local124 - 256].method477()) {
						local115 = true;
					}
					if (local124 >= 512 && !Class15.method343(local124 - 512).method350(this.anInt175)) {
						local115 = true;
					}
				}
				if (local115) {
					if (this.aLong10 != -1L) {
						local101 = (Class1_Sub1_Sub1_Sub5) aClass40_1.method637(this.aLong10);
					}
					if (local101 == null) {
						return null;
					}
				}
			}
			if (local101 == null) {
				@Pc(194) Class1_Sub1_Sub1_Sub5[] local194 = new Class1_Sub1_Sub1_Sub5[12];
				local117 = 0;
				@Pc(205) int local205;
				for (local124 = 0; local124 < 12; local124++) {
					local205 = this.anIntArray18[local124];
					if (local12 >= 0 && local124 == 3) {
						local205 = local12;
					}
					if (local10 >= 0 && local124 == 5) {
						local205 = local10;
					}
					@Pc(233) Class1_Sub1_Sub1_Sub5 local233;
					if (local205 >= 256 && local205 < 512) {
						local233 = Class23.aClass23Array1[local205 - 256].method478();
						if (local233 != null) {
							local194[local117++] = local233;
						}
					}
					if (local205 >= 512) {
						local233 = Class15.method343(local205 - 512).method351(this.anInt175);
						if (local233 != null) {
							local194[local117++] = local233;
						}
					}
				}
				local101 = new Class1_Sub1_Sub1_Sub5(false, local194, local117);
				for (local205 = 0; local205 < 5; local205++) {
					if (this.anIntArray19[local205] != 0) {
						local101.method301(client.anIntArrayArray3[local205][0], client.anIntArrayArray3[local205][this.anIntArray19[local205]]);
						if (local205 == 1) {
							local101.method301(client.anIntArray46[0], client.anIntArray46[this.anIntArray19[local205]]);
						}
					}
				}
				local101.method294(this.aByte3);
				local101.method304(64, 850, -30, -50, -30, true);
				aClass40_1.method638(local101, local4);
				this.aLong10 = local4;
			}
			if (this.aBoolean29) {
				return local101;
			}
			@Pc(339) Class1_Sub1_Sub1_Sub5 local339 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local339.method289(local101, true);
			if (local6 != -1 && local8 != -1) {
				local339.method296(Class27.aClass27Array1[super.anInt151].anIntArray229, local8, local6);
			} else if (local6 != -1) {
				local339.method295(local6);
			}
			local339.method291();
			local339.anIntArrayArray8 = null;
			local339.anIntArrayArray7 = null;
			return local339;
		} catch (@Pc(381) RuntimeException local381) {
			signlink.reporterror("15075, " + arg0 + ", " + local381.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method53() {
		try {
			if (!this.aBoolean28) {
				return null;
			}
			@Pc(8) boolean local8 = false;
			for (@Pc(10) int local10 = 0; local10 < 12; local10++) {
				@Pc(17) int local17 = this.anIntArray18[local10];
				if (local17 >= 256 && local17 < 512 && !Class23.aClass23Array1[local17 - 256].method479()) {
					local8 = true;
				}
				if (local17 >= 512 && !Class15.method343(local17 - 512).method352(this.anInt175, 740)) {
					local8 = true;
				}
			}
			if (local8) {
				return null;
			}
			@Pc(58) Class1_Sub1_Sub1_Sub5[] local58 = new Class1_Sub1_Sub1_Sub5[12];
			@Pc(69) int local69 = 0;
			for (@Pc(71) int local71 = 0; local71 < 12; local71++) {
				@Pc(78) int local78 = this.anIntArray18[local71];
				@Pc(92) Class1_Sub1_Sub1_Sub5 local92;
				if (local78 >= 256 && local78 < 512) {
					local92 = Class23.aClass23Array1[local78 - 256].method480();
					if (local92 != null) {
						local58[local69++] = local92;
					}
				}
				if (local78 >= 512) {
					local92 = Class15.method343(local78 - 512).method353(this.anInt175);
					if (local92 != null) {
						local58[local69++] = local92;
					}
				}
			}
			@Pc(129) Class1_Sub1_Sub1_Sub5 local129 = new Class1_Sub1_Sub1_Sub5(false, local58, local69);
			for (@Pc(131) int local131 = 0; local131 < 5; local131++) {
				if (this.anIntArray19[local131] != 0) {
					local129.method301(client.anIntArrayArray3[local131][0], client.anIntArrayArray3[local131][this.anIntArray19[local131]]);
					if (local131 == 1) {
						local129.method301(client.anIntArray46[0], client.anIntArray46[this.anIntArray19[local131]]);
					}
				}
			}
			return local129;
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("54522, " + 0 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method49(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 5) {
				this.anInt174 = -252;
			}
			return this.aBoolean28;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("48148, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
