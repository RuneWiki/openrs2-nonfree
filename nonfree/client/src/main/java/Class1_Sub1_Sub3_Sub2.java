import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!z")
public final class Class1_Sub1_Sub3_Sub2 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!z", name = "Cb", descriptor = "Lclient!s;")
	public static Class35 aClass35_9 = new Class35((byte) 0, 200);

	@OriginalMember(owner = "client!z", name = "gb", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!z", name = "ib", descriptor = "Ljava/lang/String;")
	public String aString30;

	@OriginalMember(owner = "client!z", name = "kb", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!z", name = "lb", descriptor = "I")
	public int anInt939;

	@OriginalMember(owner = "client!z", name = "ob", descriptor = "I")
	public int anInt940;

	@OriginalMember(owner = "client!z", name = "pb", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!z", name = "qb", descriptor = "I")
	public int anInt941;

	@OriginalMember(owner = "client!z", name = "rb", descriptor = "I")
	public int anInt942;

	@OriginalMember(owner = "client!z", name = "sb", descriptor = "I")
	public int anInt943;

	@OriginalMember(owner = "client!z", name = "tb", descriptor = "I")
	public int anInt944;

	@OriginalMember(owner = "client!z", name = "ub", descriptor = "I")
	public int anInt945;

	@OriginalMember(owner = "client!z", name = "vb", descriptor = "I")
	public int anInt946;

	@OriginalMember(owner = "client!z", name = "wb", descriptor = "Lclient!eb;")
	public Class1_Sub3_Sub1 aClass1_Sub3_Sub1_11;

	@OriginalMember(owner = "client!z", name = "xb", descriptor = "I")
	public int anInt947;

	@OriginalMember(owner = "client!z", name = "yb", descriptor = "I")
	public int anInt948;

	@OriginalMember(owner = "client!z", name = "zb", descriptor = "I")
	public int anInt949;

	@OriginalMember(owner = "client!z", name = "Ab", descriptor = "I")
	public int anInt950;

	@OriginalMember(owner = "client!z", name = "hb", descriptor = "Z")
	private boolean aBoolean163 = false;

	@OriginalMember(owner = "client!z", name = "jb", descriptor = "Z")
	private boolean aBoolean164 = false;

	@OriginalMember(owner = "client!z", name = "mb", descriptor = "[I")
	private int[] anIntArray234 = new int[12];

	@OriginalMember(owner = "client!z", name = "nb", descriptor = "[I")
	private int[] anIntArray235 = new int[5];

	@OriginalMember(owner = "client!z", name = "Bb", descriptor = "Z")
	public boolean aBoolean165 = false;

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(ZLclient!kb;)V")
	public void method572(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		try {
			arg0.anInt561 = 0;
			this.anInt938 = arg0.method391();
			this.anInt939 = arg0.method391();
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
				if (local31 < 0 || local31 >= client.anIntArrayArray4[local19].length) {
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
			this.aString30 = Class40.method542(Class40.method539(arg0.method397(603)));
			this.anInt940 = arg0.method391();
			this.aBoolean164 = true;
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
			for (@Pc(243) int local243 = 0; local243 < 5; local243++) {
				this.aLong27 <<= 0x3;
				this.aLong27 += this.anIntArray235[local243];
			}
			this.aLong27 <<= 0x1;
			this.aLong27 += this.anInt938;
		} catch (@Pc(281) RuntimeException local281) {
			signlink.reporterror("66007, " + false + ", " + arg0 + ", " + local281.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(Z)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub1 method568() {
		try {
			if (!this.aBoolean164) {
				return null;
			}
			@Pc(10) Class1_Sub3_Sub1 local10 = this.method573();
			super.anInt933 = local10.anInt368;
			local10.aBoolean84 = true;
			if (this.aBoolean165) {
				return local10;
			}
			if (super.anInt920 != -1 && super.anInt921 != -1) {
				@Pc(35) Class21 local35 = Class21.aClass21Array1[super.anInt920];
				@Pc(51) Class1_Sub3_Sub1 local51 = new Class1_Sub3_Sub1(local35.method409(), true, !local35.aBoolean131, this.anInt937, false);
				local51.method236(-super.anInt924, 0, 0);
				local51.method230();
				local51.method231(local35.aClass19_1.anIntArray186[super.anInt921]);
				local51.anIntArrayArray7 = null;
				local51.anIntArrayArray6 = null;
				if (local35.anInt571 != 128 || local35.anInt572 != 128) {
					local51.method239(local35.anInt571, local35.anInt572, local35.anInt571);
				}
				local51.method240(local35.anInt574 + 64, local35.anInt575 + 850, -30, -50, -30, true);
				@Pc(119) Class1_Sub3_Sub1[] local119 = new Class1_Sub3_Sub1[] { local10, local51 };
				local10 = new Class1_Sub3_Sub1(local119, (byte) -31, 2, true);
			}
			if (this.aClass1_Sub3_Sub1_11 != null) {
				if (client.anInt266 >= this.anInt943) {
					this.aClass1_Sub3_Sub1_11 = null;
				}
				if (client.anInt266 >= this.anInt942 && client.anInt266 < this.anInt943) {
					@Pc(148) Class1_Sub3_Sub1 local148 = this.aClass1_Sub3_Sub1_11;
					local148.method236(this.anInt945 - this.anInt941, this.anInt944 - super.anInt890, this.anInt946 - super.anInt891);
					if (super.anInt934 == 512) {
						local148.method234();
						local148.method234();
						local148.method234();
					} else if (super.anInt934 == 1024) {
						local148.method234();
						local148.method234();
					} else if (super.anInt934 == 1536) {
						local148.method234();
					}
					@Pc(211) Class1_Sub3_Sub1[] local211 = new Class1_Sub3_Sub1[] { local10, local148 };
					local10 = new Class1_Sub3_Sub1(local211, (byte) -31, 2, true);
					if (super.anInt934 == 512) {
						local148.method234();
					} else if (super.anInt934 == 1024) {
						local148.method234();
						local148.method234();
					} else if (super.anInt934 == 1536) {
						local148.method234();
						local148.method234();
						local148.method234();
					}
					local148.method236(this.anInt941 - this.anInt945, super.anInt890 - this.anInt944, super.anInt891 - this.anInt946);
				}
			}
			local10.aBoolean84 = true;
			return local10;
		} catch (@Pc(286) RuntimeException local286) {
			signlink.reporterror("53201, " + true + ", " + local286.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "c", descriptor = "(Z)Lclient!eb;")
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
				if (local23.anInt546 >= 0) {
					local10 = local23.anInt546;
					local4 += local10 - this.anIntArray234[5] << 8;
				}
				if (local23.anInt547 >= 0) {
					local12 = local23.anInt547;
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
						@Pc(161) Class1_Sub3_Sub1 local161 = local155.method60(this.anInt938);
						if (local161 != null) {
							local106[local108++] = local161;
						}
					}
				}
				local101 = new Class1_Sub3_Sub1(0, local106, local108);
				for (local117 = 0; local117 < 5; local117++) {
					if (this.anIntArray235[local117] != 0) {
						local101.method237(client.anIntArrayArray4[local117][0], client.anIntArrayArray4[local117][this.anIntArray235[local117]]);
						if (local117 == 1) {
							local101.method237(client.anIntArray70[0], client.anIntArray70[this.anIntArray235[local117]]);
						}
					}
				}
				local101.method230();
				local101.method240(64, 850, -30, -50, -30, true);
				aClass35_9.method528(local4, local101);
			}
			if (this.aBoolean165) {
				return local101;
			}
			@Pc(249) Class1_Sub3_Sub1 local249 = new Class1_Sub3_Sub1(0, local101, true);
			if (local6 != -1 && local8 != -1) {
				local249.method232(local8, local6, Class19.aClass19Array1[super.anInt915].anIntArray189);
			} else if (local6 != -1) {
				local249.method231(local6);
			}
			local249.method227();
			local249.anIntArrayArray7 = null;
			local249.anIntArrayArray6 = null;
			return local249;
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("77654, " + false + ", " + local296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(I)Lclient!eb;")
	public Class1_Sub3_Sub1 method574() {
		try {
			if (!this.aBoolean164) {
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
					@Pc(49) Class1_Sub3_Sub1 local49 = Class5.method54(local20 - 512).method61(this.anInt938);
					if (local49 != null) {
						local9[local11++] = local49;
					}
				}
			}
			@Pc(67) Class1_Sub3_Sub1 local67 = new Class1_Sub3_Sub1(0, local9, local11);
			for (@Pc(69) int local69 = 0; local69 < 5; local69++) {
				if (this.anIntArray235[local69] != 0) {
					local67.method237(client.anIntArrayArray4[local69][0], client.anIntArrayArray4[local69][this.anIntArray235[local69]]);
					if (local69 == 1) {
						local67.method237(client.anIntArray70[0], client.anIntArray70[this.anIntArray235[local69]]);
					}
				}
			}
			return local67;
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("60004, " + -718 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method571() {
		try {
			return this.aBoolean164;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("46403, " + false + ", " + local17.toString());
			throw new RuntimeException();
		}
	}
}
