import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!z")
public final class Class1_Sub1_Sub3_Sub2 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!z", name = "Gb", descriptor = "Lclient!s;")
	public static Class35 aClass35_9 = new Class35(-24, 200);

	@OriginalMember(owner = "client!z", name = "ib", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!z", name = "kb", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!z", name = "mb", descriptor = "Ljava/lang/String;")
	public String aString30;

	@OriginalMember(owner = "client!z", name = "ob", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!z", name = "pb", descriptor = "I")
	public int anInt941;

	@OriginalMember(owner = "client!z", name = "sb", descriptor = "I")
	public int anInt942;

	@OriginalMember(owner = "client!z", name = "tb", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!z", name = "ub", descriptor = "I")
	public int anInt943;

	@OriginalMember(owner = "client!z", name = "vb", descriptor = "I")
	public int anInt944;

	@OriginalMember(owner = "client!z", name = "wb", descriptor = "I")
	public int anInt945;

	@OriginalMember(owner = "client!z", name = "xb", descriptor = "I")
	public int anInt946;

	@OriginalMember(owner = "client!z", name = "yb", descriptor = "I")
	public int anInt947;

	@OriginalMember(owner = "client!z", name = "zb", descriptor = "I")
	public int anInt948;

	@OriginalMember(owner = "client!z", name = "Ab", descriptor = "Lclient!eb;")
	public Class1_Sub3_Sub1 aClass1_Sub3_Sub1_11;

	@OriginalMember(owner = "client!z", name = "Bb", descriptor = "I")
	public int anInt949;

	@OriginalMember(owner = "client!z", name = "Cb", descriptor = "I")
	public int anInt950;

	@OriginalMember(owner = "client!z", name = "Db", descriptor = "I")
	public int anInt951;

	@OriginalMember(owner = "client!z", name = "Eb", descriptor = "I")
	public int anInt952;

	@OriginalMember(owner = "client!z", name = "hb", descriptor = "I")
	private int anInt937 = 19303;

	@OriginalMember(owner = "client!z", name = "jb", descriptor = "Z")
	private boolean aBoolean160 = true;

	@OriginalMember(owner = "client!z", name = "lb", descriptor = "B")
	private byte aByte45 = 7;

	@OriginalMember(owner = "client!z", name = "nb", descriptor = "Z")
	private boolean aBoolean161 = false;

	@OriginalMember(owner = "client!z", name = "qb", descriptor = "[I")
	private int[] anIntArray234 = new int[12];

	@OriginalMember(owner = "client!z", name = "rb", descriptor = "[I")
	private int[] anIntArray235 = new int[5];

	@OriginalMember(owner = "client!z", name = "Fb", descriptor = "Z")
	public boolean aBoolean162 = false;

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(Lclient!kb;B)V")
	public void method572(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) byte arg1) {
		try {
			arg0.anInt554 = 0;
			this.anInt940 = arg0.method391();
			this.anInt941 = arg0.method391();
			@Pc(19) int local19;
			@Pc(31) int local31;
			for (@Pc(14) int local14 = 0; local14 < 12; local14++) {
				local19 = arg0.method391();
				if (local19 == 0) {
					this.anIntArray234[local14] = 0;
				} else {
					local31 = arg0.method391();
					this.anIntArray234[local14] = (local19 << 8) + local31;
				}
			}
			for (local19 = 0; local19 < 5; local19++) {
				local31 = arg0.method391();
				if (local31 < 0 || local31 >= client.anIntArrayArray2[local19].length) {
					local31 = 0;
				}
				this.anIntArray235[local19] = local31;
			}
			super.anInt894 = arg0.method393();
			if (super.anInt894 == 65535) {
				super.anInt894 = -1;
			}
			super.anInt895 = arg0.method393();
			if (super.anInt895 == 65535) {
				super.anInt895 = -1;
			}
			super.anInt896 = arg0.method393();
			if (super.anInt896 == 65535) {
				super.anInt896 = -1;
			}
			super.anInt897 = arg0.method393();
			if (super.anInt897 == 65535) {
				super.anInt897 = -1;
			}
			super.anInt898 = arg0.method393();
			if (super.anInt898 == 65535) {
				super.anInt898 = -1;
			}
			super.anInt899 = arg0.method393();
			if (super.anInt899 == 65535) {
				super.anInt899 = -1;
			}
			super.anInt900 = arg0.method393();
			if (super.anInt900 == 65535) {
				super.anInt900 = -1;
			}
			this.aString30 = Class40.method542(Class40.method539(arg0.method397((byte) 2)));
			this.anInt942 = arg0.method391();
			this.aBoolean161 = true;
			this.aLong27 = 0L;
			for (local31 = 0; local31 < 12; local31++) {
				this.aLong27 <<= 0x4;
				if (this.anIntArray234[local31] >= 256) {
					this.aLong27 += this.anIntArray234[local31] - 256;
				}
			}
			if (this.anIntArray234[0] >= 256) {
				this.aLong27 += this.anIntArray234[0] - 256 >> 4;
			}
			if (this.anIntArray234[1] >= 256) {
				this.aLong27 += this.anIntArray234[1] - 256 >> 8;
			}
			for (@Pc(240) int local240 = 0; local240 < 5; local240++) {
				this.aLong27 <<= 0x3;
				this.aLong27 += this.anIntArray235[local240];
			}
			this.aLong27 <<= 0x1;
			this.aLong27 += this.anInt940;
			@Pc(281) boolean local281 = false;
		} catch (@Pc(284) RuntimeException local284) {
			signlink.reporterror("26558, " + arg0 + ", " + arg1 + ", " + local284.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub1 method568() {
		try {
			if (this.anInt938 > 0 || this.anInt938 < 0) {
				this.aBoolean160 = !this.aBoolean160;
			}
			if (!this.aBoolean161) {
				return null;
			}
			@Pc(26) Class1_Sub3_Sub1 local26 = this.method573();
			super.anInt933 = local26.anInt366;
			local26.aBoolean84 = true;
			if (this.aBoolean162) {
				return local26;
			}
			if (super.anInt920 != -1 && super.anInt921 != -1) {
				@Pc(51) Class21 local51 = Class21.aClass21Array1[super.anInt920];
				@Pc(66) Class1_Sub3_Sub1 local66 = new Class1_Sub3_Sub1(!local51.aBoolean132, (byte) 70, true, local51.method409(), false);
				local66.method236(0, -super.anInt924, (byte) 1, 0);
				local66.method230();
				local66.method231(local51.aClass19_1.anIntArray186[super.anInt921]);
				local66.anIntArrayArray7 = null;
				local66.anIntArrayArray6 = null;
				if (local51.anInt564 != 128 || local51.anInt565 != 128) {
					local66.method239(local51.anInt565, local51.anInt564, local51.anInt564);
				}
				local66.method240(local51.anInt567 + 64, local51.anInt568 + 850, -30, -50, -30, true);
				@Pc(134) Class1_Sub3_Sub1[] local134 = new Class1_Sub3_Sub1[] { local26, local66 };
				local26 = new Class1_Sub3_Sub1((byte) -80, true, local134, 2);
			}
			if (this.aClass1_Sub3_Sub1_11 != null) {
				if (client.anInt280 >= this.anInt945) {
					this.aClass1_Sub3_Sub1_11 = null;
				}
				if (client.anInt280 >= this.anInt944 && client.anInt280 < this.anInt945) {
					@Pc(163) Class1_Sub3_Sub1 local163 = this.aClass1_Sub3_Sub1_11;
					local163.method236(this.anInt948 - super.anInt891, this.anInt947 - this.anInt943, (byte) 1, this.anInt946 - super.anInt890);
					if (super.anInt934 == 512) {
						local163.method234(this.anInt937);
						local163.method234(this.anInt937);
						local163.method234(this.anInt937);
					} else if (super.anInt934 == 1024) {
						local163.method234(this.anInt937);
						local163.method234(this.anInt937);
					} else if (super.anInt934 == 1536) {
						local163.method234(this.anInt937);
					}
					@Pc(232) Class1_Sub3_Sub1[] local232 = new Class1_Sub3_Sub1[] { local26, local163 };
					local26 = new Class1_Sub3_Sub1((byte) -80, true, local232, 2);
					if (super.anInt934 == 512) {
						local163.method234(this.anInt937);
					} else if (super.anInt934 == 1024) {
						local163.method234(this.anInt937);
						local163.method234(this.anInt937);
					} else if (super.anInt934 == 1536) {
						local163.method234(this.anInt937);
						local163.method234(this.anInt937);
						local163.method234(this.anInt937);
					}
					local163.method236(super.anInt891 - this.anInt948, this.anInt943 - this.anInt947, (byte) 1, super.anInt890 - this.anInt946);
				}
			}
			local26.aBoolean84 = true;
			return local26;
		} catch (@Pc(304) RuntimeException local304) {
			signlink.reporterror("52577, " + 0 + ", " + local304.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "c", descriptor = "(I)Lclient!eb;")
	private Class1_Sub3_Sub1 method573() {
		try {
			@Pc(4) long local4 = this.aLong27;
			@Pc(6) int local6 = -1;
			@Pc(8) int local8 = -1;
			@Pc(10) int local10 = -1;
			@Pc(12) int local12 = -1;
			if (super.anInt915 >= 0 && super.anInt918 == 0) {
				@Pc(23) Class19 local23 = Class19.aClass19Array1[super.anInt915];
				local6 = local23.anIntArray186[super.anInt916];
				if (super.anInt912 >= 0 && super.anInt912 != super.anInt894) {
					local8 = Class19.aClass19Array1[super.anInt912].anIntArray186[super.anInt913];
				}
				if (local23.anInt541 >= 0) {
					local10 = local23.anInt541;
					local4 += local10 - this.anIntArray234[5] << 8;
				}
				if (local23.anInt542 >= 0) {
					local12 = local23.anInt542;
					local4 += local12 - this.anIntArray234[3] << 16;
				}
			} else if (super.anInt912 >= 0) {
				local6 = Class19.aClass19Array1[super.anInt912].anIntArray186[super.anInt913];
			}
			@Pc(101) Class1_Sub3_Sub1 local101 = (Class1_Sub3_Sub1) aClass35_9.method527(local4);
			if (local101 == null) {
				@Pc(106) Class1_Sub3_Sub1[] local106 = new Class1_Sub3_Sub1[12];
				@Pc(108) int local108 = 0;
				@Pc(117) int local117;
				for (@Pc(110) int local110 = 0; local110 < 12; local110++) {
					local117 = this.anIntArray234[local110];
					if (local12 >= 0 && local110 == 3) {
						local117 = local12;
					}
					if (local10 >= 0 && local110 == 5) {
						local117 = local10;
					}
					if (local117 >= 256 && local117 < 512) {
						local106[local108++] = Class13.aClass13Array1[local117 - 256].method306();
					}
					if (local117 >= 512) {
						@Pc(155) Class5 local155 = Class5.method54(local117 - 512);
						@Pc(162) Class1_Sub3_Sub1 local162 = local155.method60(this.anInt940, this.anInt939);
						if (local162 != null) {
							local106[local108++] = local162;
						}
					}
				}
				local101 = new Class1_Sub3_Sub1(-406, local106, local108);
				for (local117 = 0; local117 < 5; local117++) {
					if (this.anIntArray235[local117] != 0) {
						local101.method237(client.anIntArrayArray2[local117][0], client.anIntArrayArray2[local117][this.anIntArray235[local117]]);
						if (local117 == 1) {
							local101.method237(client.anIntArray84[0], client.anIntArray84[this.anIntArray235[local117]]);
						}
					}
				}
				local101.method230();
				local101.method240(64, 850, -30, -50, -30, true);
				aClass35_9.method528(local101, local4);
			}
			if (this.aBoolean162) {
				return local101;
			}
			@Pc(250) Class1_Sub3_Sub1 local250 = new Class1_Sub3_Sub1(-406, local101, true);
			if (local6 != -1 && local8 != -1) {
				local250.method232(local6, local8, Class19.aClass19Array1[super.anInt915].anIntArray189);
			} else if (local6 != -1) {
				local250.method231(local6);
			}
			local250.method227();
			local250.anIntArrayArray7 = null;
			local250.anIntArrayArray6 = null;
			return local250;
		} catch (@Pc(298) RuntimeException local298) {
			signlink.reporterror("61302, " + -300 + ", " + local298.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(B)Lclient!eb;")
	public Class1_Sub3_Sub1 method574(@OriginalArg(0) byte arg0) {
		try {
			if (!this.aBoolean161) {
				return null;
			}
			@Pc(9) Class1_Sub3_Sub1[] local9 = new Class1_Sub3_Sub1[12];
			@Pc(11) int local11 = 0;
			for (@Pc(13) int local13 = 0; local13 < 12; local13++) {
				@Pc(20) int local20 = this.anIntArray234[local13];
				if (local20 >= 256 && local20 < 512) {
					local9[local11++] = Class13.aClass13Array1[local20 - 256].method307();
				}
				if (local20 >= 512) {
					@Pc(49) Class1_Sub3_Sub1 local49 = Class5.method54(local20 - 512).method61(199, this.anInt940);
					if (local49 != null) {
						local9[local11++] = local49;
					}
				}
			}
			@Pc(67) Class1_Sub3_Sub1 local67 = new Class1_Sub3_Sub1(-406, local9, local11);
			@Pc(77) int local77;
			if (arg0 == this.aByte45) {
				@Pc(73) boolean local73 = false;
			} else {
				for (local77 = 1; local77 > 0; local77++) {
				}
			}
			for (local77 = 0; local77 < 5; local77++) {
				if (this.anIntArray235[local77] != 0) {
					local67.method237(client.anIntArrayArray2[local77][0], client.anIntArrayArray2[local77][this.anIntArray235[local77]]);
					if (local77 == 1) {
						local67.method237(client.anIntArray84[0], client.anIntArray84[this.anIntArray235[local77]]);
					}
				}
			}
			return local67;
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("3275, " + arg0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method571() {
		try {
			return this.aBoolean161;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("34224, " + 574 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
