import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!z")
public final class Class1_Sub1_Sub3_Sub2 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!z", name = "Gb", descriptor = "Lclient!s;")
	public static Class35 aClass35_9 = new Class35(2, 200);

	@OriginalMember(owner = "client!z", name = "ib", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!z", name = "mb", descriptor = "Ljava/lang/String;")
	public String aString30;

	@OriginalMember(owner = "client!z", name = "ob", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!z", name = "pb", descriptor = "I")
	public int anInt932;

	@OriginalMember(owner = "client!z", name = "sb", descriptor = "I")
	public int anInt933;

	@OriginalMember(owner = "client!z", name = "tb", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!z", name = "ub", descriptor = "I")
	public int anInt934;

	@OriginalMember(owner = "client!z", name = "vb", descriptor = "I")
	public int anInt935;

	@OriginalMember(owner = "client!z", name = "wb", descriptor = "I")
	public int anInt936;

	@OriginalMember(owner = "client!z", name = "xb", descriptor = "I")
	public int anInt937;

	@OriginalMember(owner = "client!z", name = "yb", descriptor = "I")
	public int anInt938;

	@OriginalMember(owner = "client!z", name = "zb", descriptor = "I")
	public int anInt939;

	@OriginalMember(owner = "client!z", name = "Ab", descriptor = "Lclient!eb;")
	public Class1_Sub3_Sub1 aClass1_Sub3_Sub1_11;

	@OriginalMember(owner = "client!z", name = "Bb", descriptor = "I")
	public int anInt940;

	@OriginalMember(owner = "client!z", name = "Cb", descriptor = "I")
	public int anInt941;

	@OriginalMember(owner = "client!z", name = "Db", descriptor = "I")
	public int anInt942;

	@OriginalMember(owner = "client!z", name = "Eb", descriptor = "I")
	public int anInt943;

	@OriginalMember(owner = "client!z", name = "hb", descriptor = "Z")
	private boolean aBoolean187 = false;

	@OriginalMember(owner = "client!z", name = "jb", descriptor = "I")
	private int anInt929 = 33182;

	@OriginalMember(owner = "client!z", name = "kb", descriptor = "I")
	private int anInt930 = 5;

	@OriginalMember(owner = "client!z", name = "lb", descriptor = "Z")
	private boolean aBoolean188 = true;

	@OriginalMember(owner = "client!z", name = "nb", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "client!z", name = "qb", descriptor = "[I")
	private int[] anIntArray234 = new int[12];

	@OriginalMember(owner = "client!z", name = "rb", descriptor = "[I")
	private int[] anIntArray235 = new int[5];

	@OriginalMember(owner = "client!z", name = "Fb", descriptor = "Z")
	public boolean aBoolean190 = false;

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(ILclient!kb;)V")
	public void method564(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		try {
			arg0.anInt548 = 0;
			this.anInt931 = arg0.method383();
			this.anInt932 = arg0.method383();
			@Pc(26) int local26;
			@Pc(38) int local38;
			for (@Pc(21) int local21 = 0; local21 < 12; local21++) {
				local26 = arg0.method383();
				if (local26 == 0) {
					this.anIntArray234[local21] = 0;
				} else {
					local38 = arg0.method383();
					this.anIntArray234[local21] = (local26 << 8) + local38;
				}
			}
			for (local26 = 0; local26 < 5; local26++) {
				local38 = arg0.method383();
				if (local38 < 0 || local38 >= client.anIntArrayArray4[local26].length) {
					local38 = 0;
				}
				this.anIntArray235[local26] = local38;
			}
			super.anInt885 = arg0.method385();
			if (super.anInt885 == 65535) {
				super.anInt885 = -1;
			}
			super.anInt886 = arg0.method385();
			if (super.anInt886 == 65535) {
				super.anInt886 = -1;
			}
			super.anInt887 = arg0.method385();
			if (super.anInt887 == 65535) {
				super.anInt887 = -1;
			}
			super.anInt888 = arg0.method385();
			if (super.anInt888 == 65535) {
				super.anInt888 = -1;
			}
			super.anInt889 = arg0.method385();
			if (super.anInt889 == 65535) {
				super.anInt889 = -1;
			}
			super.anInt890 = arg0.method385();
			if (super.anInt890 == 65535) {
				super.anInt890 = -1;
			}
			super.anInt891 = arg0.method385();
			if (super.anInt891 == 65535) {
				super.anInt891 = -1;
			}
			this.aString30 = Class40.method534(Class40.method531(arg0.method389()));
			this.anInt933 = arg0.method383();
			this.aBoolean189 = true;
			this.aLong27 = 0L;
			for (local38 = 0; local38 < 12; local38++) {
				this.aLong27 <<= 0x4;
				if (this.anIntArray234[local38] >= 256) {
					this.aLong27 += this.anIntArray234[local38] - 256;
				}
			}
			if (this.anIntArray234[0] >= 256) {
				this.aLong27 += this.anIntArray234[0] - 256 >> 4;
			}
			if (this.anIntArray234[1] >= 256) {
				this.aLong27 += this.anIntArray234[1] - 256 >> 8;
			}
			for (@Pc(247) int local247 = 0; local247 < 5; local247++) {
				this.aLong27 <<= 0x3;
				this.aLong27 += this.anIntArray235[local247];
			}
			this.aLong27 <<= 0x1;
			this.aLong27 += this.anInt931;
		} catch (@Pc(285) RuntimeException local285) {
			signlink.reporterror("3407, " + -176 + ", " + arg0 + ", " + local285.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub1 method560(@OriginalArg(0) int arg0) {
		try {
			if (!this.aBoolean189) {
				return null;
			}
			@Pc(11) Class1_Sub3_Sub1 local11 = this.method565(this.aBoolean188);
			super.anInt924 = local11.anInt362;
			if (arg0 <= 0) {
				for (@Pc(19) int local19 = 1; local19 > 0; local19++) {
				}
			}
			local11.aBoolean88 = true;
			if (this.aBoolean190) {
				return local11;
			}
			if (super.anInt911 != -1 && super.anInt912 != -1) {
				@Pc(45) Class21 local45 = Class21.aClass21Array1[super.anInt911];
				@Pc(60) Class1_Sub3_Sub1 local60 = new Class1_Sub3_Sub1(364, local45.method401(), !local45.aBoolean143, false, true);
				local60.method235(0, this.anInt928, 0, -super.anInt915);
				local60.method229(797);
				local60.method230(local45.aClass19_1.anIntArray186[super.anInt912]);
				local60.anIntArrayArray7 = null;
				local60.anIntArrayArray6 = null;
				if (local45.anInt557 != 128 || local45.anInt558 != 128) {
					local60.method238(local45.anInt558, local45.anInt557, local45.anInt557);
				}
				local60.method239(local45.anInt560 + 64, local45.anInt561 + 850, -30, -50, -30, true);
				@Pc(129) Class1_Sub3_Sub1[] local129 = new Class1_Sub3_Sub1[] { local11, local60 };
				local11 = new Class1_Sub3_Sub1(2, local129, false, true);
			}
			if (this.aClass1_Sub3_Sub1_11 != null) {
				if (client.anInt332 >= this.anInt936) {
					this.aClass1_Sub3_Sub1_11 = null;
				}
				if (client.anInt332 >= this.anInt935 && client.anInt332 < this.anInt936) {
					@Pc(158) Class1_Sub3_Sub1 local158 = this.aClass1_Sub3_Sub1_11;
					local158.method235(this.anInt939 - super.anInt882, this.anInt928, this.anInt937 - super.anInt881, this.anInt938 - this.anInt934);
					if (super.anInt925 == 512) {
						local158.method233();
						local158.method233();
						local158.method233();
					} else if (super.anInt925 == 1024) {
						local158.method233();
						local158.method233();
					} else if (super.anInt925 == 1536) {
						local158.method233();
					}
					@Pc(222) Class1_Sub3_Sub1[] local222 = new Class1_Sub3_Sub1[] { local11, local158 };
					local11 = new Class1_Sub3_Sub1(2, local222, false, true);
					if (super.anInt925 == 512) {
						local158.method233();
					} else if (super.anInt925 == 1024) {
						local158.method233();
						local158.method233();
					} else if (super.anInt925 == 1536) {
						local158.method233();
						local158.method233();
						local158.method233();
					}
					local158.method235(super.anInt882 - this.anInt939, this.anInt928, super.anInt881 - this.anInt937, this.anInt934 - this.anInt938);
				}
			}
			local11.aBoolean88 = true;
			return local11;
		} catch (@Pc(289) RuntimeException local289) {
			signlink.reporterror("60969, " + arg0 + ", " + local289.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(Z)Lclient!eb;")
	private Class1_Sub3_Sub1 method565(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(4) long local4 = this.aLong27;
			@Pc(6) int local6 = -1;
			@Pc(8) int local8 = -1;
			@Pc(10) int local10 = -1;
			@Pc(12) int local12 = -1;
			if (super.anInt906 >= 0 && super.anInt909 == 0) {
				@Pc(23) Class19 local23 = Class19.aClass19Array1[super.anInt906];
				local6 = local23.anIntArray186[super.anInt907];
				if (super.anInt903 >= 0 && super.anInt903 != super.anInt885) {
					local8 = Class19.aClass19Array1[super.anInt903].anIntArray186[super.anInt904];
				}
				if (local23.anInt533 >= 0) {
					local10 = local23.anInt533;
					local4 += local10 - this.anIntArray234[5] << 8;
				}
				if (local23.anInt534 >= 0) {
					local12 = local23.anInt534;
					local4 += local12 - this.anIntArray234[3] << 16;
				}
			} else if (super.anInt903 >= 0) {
				local6 = Class19.aClass19Array1[super.anInt903].anIntArray186[super.anInt904];
			}
			@Pc(101) Class1_Sub3_Sub1 local101 = (Class1_Sub3_Sub1) aClass35_9.method519(local4);
			@Pc(108) int local108;
			if (local101 == null) {
				@Pc(106) Class1_Sub3_Sub1[] local106 = new Class1_Sub3_Sub1[12];
				local108 = 0;
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
						local106[local108++] = Class13.aClass13Array1[local117 - 256].method304();
					}
					if (local117 >= 512) {
						@Pc(155) Class5 local155 = Class5.method54(local117 - 512);
						@Pc(161) Class1_Sub3_Sub1 local161 = local155.method60(124, this.anInt931);
						if (local161 != null) {
							local106[local108++] = local161;
						}
					}
				}
				local101 = new Class1_Sub3_Sub1(20363, local106, local108);
				for (local117 = 0; local117 < 5; local117++) {
					if (this.anIntArray235[local117] != 0) {
						local101.method236(client.anIntArrayArray4[local117][0], client.anIntArrayArray4[local117][this.anIntArray235[local117]]);
						if (local117 == 1) {
							local101.method236(client.anIntArray62[0], client.anIntArray62[this.anIntArray235[local117]]);
						}
					}
				}
				local101.method229(797);
				local101.method239(64, 850, -30, -50, -30, true);
				aClass35_9.method520(local101, local4);
			}
			if (this.aBoolean190) {
				return local101;
			}
			@Pc(249) Class1_Sub3_Sub1 local249 = new Class1_Sub3_Sub1(20363, local101, true);
			if (!arg0) {
				for (local108 = 1; local108 > 0; local108++) {
				}
			}
			if (local6 != -1 && local8 != -1) {
				local249.method231(local8, local6, Class19.aClass19Array1[super.anInt906].anIntArray189);
			} else if (local6 != -1) {
				local249.method230(local6);
			}
			local249.method226(this.aBoolean187);
			local249.anIntArrayArray7 = null;
			local249.anIntArrayArray6 = null;
			return local249;
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("85126, " + arg0 + ", " + local296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "b", descriptor = "(Z)Lclient!eb;")
	public Class1_Sub3_Sub1 method566() {
		try {
			if (!this.aBoolean189) {
				return null;
			}
			@Pc(19) Class1_Sub3_Sub1[] local19 = new Class1_Sub3_Sub1[12];
			@Pc(21) int local21 = 0;
			for (@Pc(23) int local23 = 0; local23 < 12; local23++) {
				@Pc(30) int local30 = this.anIntArray234[local23];
				if (local30 >= 256 && local30 < 512) {
					local19[local21++] = Class13.aClass13Array1[local30 - 256].method305(509);
				}
				if (local30 >= 512) {
					@Pc(60) Class1_Sub3_Sub1 local60 = Class5.method54(local30 - 512).method61(this.anInt929, this.anInt931);
					if (local60 != null) {
						local19[local21++] = local60;
					}
				}
			}
			@Pc(78) Class1_Sub3_Sub1 local78 = new Class1_Sub3_Sub1(20363, local19, local21);
			for (@Pc(80) int local80 = 0; local80 < 5; local80++) {
				if (this.anIntArray235[local80] != 0) {
					local78.method236(client.anIntArrayArray4[local80][0], client.anIntArrayArray4[local80][this.anIntArray235[local80]]);
					if (local80 == 1) {
						local78.method236(client.anIntArray62[0], client.anIntArray62[this.anIntArray235[local80]]);
					}
				}
			}
			return local78;
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("7685, " + true + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method563(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				throw new NullPointerException();
			}
			return this.aBoolean189;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("50314, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
