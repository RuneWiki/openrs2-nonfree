import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!z")
public final class Class1_Sub1_Sub3_Sub2 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!z", name = "Eb", descriptor = "Lclient!s;")
	public static Class35 aClass35_9 = new Class35(17295, 200);

	@OriginalMember(owner = "client!z", name = "kb", descriptor = "Ljava/lang/String;")
	public String aString30;

	@OriginalMember(owner = "client!z", name = "mb", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!z", name = "nb", descriptor = "I")
	public int anInt922;

	@OriginalMember(owner = "client!z", name = "qb", descriptor = "I")
	public int anInt923;

	@OriginalMember(owner = "client!z", name = "rb", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!z", name = "sb", descriptor = "I")
	public int anInt924;

	@OriginalMember(owner = "client!z", name = "tb", descriptor = "I")
	public int anInt925;

	@OriginalMember(owner = "client!z", name = "ub", descriptor = "I")
	public int anInt926;

	@OriginalMember(owner = "client!z", name = "vb", descriptor = "I")
	public int anInt927;

	@OriginalMember(owner = "client!z", name = "wb", descriptor = "I")
	public int anInt928;

	@OriginalMember(owner = "client!z", name = "xb", descriptor = "I")
	public int anInt929;

	@OriginalMember(owner = "client!z", name = "yb", descriptor = "Lclient!eb;")
	public Class1_Sub3_Sub1 aClass1_Sub3_Sub1_11;

	@OriginalMember(owner = "client!z", name = "zb", descriptor = "I")
	public int anInt930;

	@OriginalMember(owner = "client!z", name = "Ab", descriptor = "I")
	public int anInt931;

	@OriginalMember(owner = "client!z", name = "Bb", descriptor = "I")
	public int anInt932;

	@OriginalMember(owner = "client!z", name = "Cb", descriptor = "I")
	public int anInt933;

	@OriginalMember(owner = "client!z", name = "ib", descriptor = "I")
	private int anInt920 = 265;

	@OriginalMember(owner = "client!z", name = "jb", descriptor = "Z")
	private boolean aBoolean189 = true;

	@OriginalMember(owner = "client!z", name = "lb", descriptor = "Z")
	private boolean aBoolean190 = false;

	@OriginalMember(owner = "client!z", name = "ob", descriptor = "[I")
	private int[] anIntArray234 = new int[12];

	@OriginalMember(owner = "client!z", name = "pb", descriptor = "[I")
	private int[] anIntArray235 = new int[5];

	@OriginalMember(owner = "client!z", name = "Db", descriptor = "Z")
	public boolean aBoolean191 = false;

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(ILclient!kb;)V")
	public void method552(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			arg1.anInt539 = 0;
			this.anInt921 = arg1.method372();
			this.anInt922 = arg1.method372();
			@Pc(19) int local19;
			@Pc(31) int local31;
			for (@Pc(14) int local14 = 0; local14 < 12; local14++) {
				local19 = arg1.method372();
				if (local19 == 0) {
					this.anIntArray234[local14] = 0;
				} else {
					local31 = arg1.method372();
					this.anIntArray234[local14] = (local19 << 8) + local31;
				}
			}
			@Pc(48) boolean local48 = false;
			for (local19 = 0; local19 < 5; local19++) {
				local31 = arg1.method372();
				if (local31 < 0 || local31 >= client.anIntArrayArray2[local19].length) {
					local31 = 0;
				}
				this.anIntArray235[local19] = local31;
			}
			super.anInt877 = arg1.method374();
			if (super.anInt877 == 65535) {
				super.anInt877 = -1;
			}
			super.anInt878 = arg1.method374();
			if (super.anInt878 == 65535) {
				super.anInt878 = -1;
			}
			super.anInt879 = arg1.method374();
			if (super.anInt879 == 65535) {
				super.anInt879 = -1;
			}
			super.anInt880 = arg1.method374();
			if (super.anInt880 == 65535) {
				super.anInt880 = -1;
			}
			super.anInt881 = arg1.method374();
			if (super.anInt881 == 65535) {
				super.anInt881 = -1;
			}
			super.anInt882 = arg1.method374();
			if (super.anInt882 == 65535) {
				super.anInt882 = -1;
			}
			super.anInt883 = arg1.method374();
			if (super.anInt883 == 65535) {
				super.anInt883 = -1;
			}
			this.aString30 = Class40.method522(Class40.method519(arg1.method378()));
			this.anInt923 = arg1.method372();
			this.aBoolean190 = true;
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
			for (@Pc(244) int local244 = 0; local244 < 5; local244++) {
				this.aLong27 <<= 0x3;
				this.aLong27 += this.anIntArray235[local244];
			}
			this.aLong27 <<= 0x1;
			this.aLong27 += this.anInt921;
		} catch (@Pc(282) RuntimeException local282) {
			signlink.reporterror("16797, " + arg0 + ", " + arg1 + ", " + local282.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub1 method548() {
		try {
			if (!this.aBoolean190) {
				return null;
			}
			@Pc(11) Class1_Sub3_Sub1 local11 = this.method553(this.aBoolean189);
			super.anInt916 = local11.anInt348;
			local11.aBoolean90 = true;
			if (this.aBoolean191) {
				return local11;
			}
			if (super.anInt903 != -1 && super.anInt904 != -1) {
				@Pc(50) Class21 local50 = Class21.aClass21Array1[super.anInt903];
				@Pc(65) Class1_Sub3_Sub1 local65 = new Class1_Sub3_Sub1(false, (byte) 8, true, !local50.aBoolean148, local50.method390());
				local65.method224(-super.anInt907, 0, 0);
				local65.method218();
				local65.method219(local50.aClass19_1.anIntArray186[super.anInt904]);
				local65.anIntArrayArray7 = null;
				local65.anIntArrayArray6 = null;
				if (local50.anInt548 != 128 || local50.anInt549 != 128) {
					local65.method227(local50.anInt549, local50.anInt548, local50.anInt548);
				}
				local65.method228(local50.anInt551 + 64, local50.anInt552 + 850, -30, -50, -30, true);
				@Pc(133) Class1_Sub3_Sub1[] local133 = new Class1_Sub3_Sub1[] { local11, local65 };
				local11 = new Class1_Sub3_Sub1(local133, 2, 0, true);
			}
			if (this.aClass1_Sub3_Sub1_11 != null) {
				if (client.anInt295 >= this.anInt926) {
					this.aClass1_Sub3_Sub1_11 = null;
				}
				if (client.anInt295 >= this.anInt925 && client.anInt295 < this.anInt926) {
					@Pc(162) Class1_Sub3_Sub1 local162 = this.aClass1_Sub3_Sub1_11;
					local162.method224(this.anInt928 - this.anInt924, this.anInt929 - super.anInt874, this.anInt927 - super.anInt873);
					if (super.anInt917 == 512) {
						local162.method222((byte) 4);
						local162.method222((byte) 4);
						local162.method222((byte) 4);
					} else if (super.anInt917 == 1024) {
						local162.method222((byte) 4);
						local162.method222((byte) 4);
					} else if (super.anInt917 == 1536) {
						local162.method222((byte) 4);
					}
					@Pc(225) Class1_Sub3_Sub1[] local225 = new Class1_Sub3_Sub1[] { local11, local162 };
					local11 = new Class1_Sub3_Sub1(local225, 2, 0, true);
					if (super.anInt917 == 512) {
						local162.method222((byte) 4);
					} else if (super.anInt917 == 1024) {
						local162.method222((byte) 4);
						local162.method222((byte) 4);
					} else if (super.anInt917 == 1536) {
						local162.method222((byte) 4);
						local162.method222((byte) 4);
						local162.method222((byte) 4);
					}
					local162.method224(this.anInt924 - this.anInt928, super.anInt874 - this.anInt929, super.anInt873 - this.anInt927);
				}
			}
			local11.aBoolean90 = true;
			return local11;
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("27335, " + 7 + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "b", descriptor = "(Z)Lclient!eb;")
	private Class1_Sub3_Sub1 method553(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(4) long local4 = this.aLong27;
			@Pc(6) int local6 = -1;
			@Pc(8) int local8 = -1;
			@Pc(10) int local10 = -1;
			@Pc(12) int local12 = -1;
			if (super.anInt898 >= 0 && super.anInt901 == 0) {
				@Pc(23) Class19 local23 = Class19.aClass19Array1[super.anInt898];
				local6 = local23.anIntArray186[super.anInt899];
				if (super.anInt895 >= 0 && super.anInt895 != super.anInt877) {
					local8 = Class19.aClass19Array1[super.anInt895].anIntArray186[super.anInt896];
				}
				if (local23.anInt524 >= 0) {
					local10 = local23.anInt524;
					local4 += local10 - this.anIntArray234[5] << 8;
				}
				if (local23.anInt525 >= 0) {
					local12 = local23.anInt525;
					local4 += local12 - this.anIntArray234[3] << 16;
				}
			} else if (super.anInt895 >= 0) {
				local6 = Class19.aClass19Array1[super.anInt895].anIntArray186[super.anInt896];
			}
			@Pc(101) Class1_Sub3_Sub1 local101 = (Class1_Sub3_Sub1) aClass35_9.method507(local4);
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
						local106[local108++] = Class13.aClass13Array1[local117 - 256].method293();
					}
					if (local117 >= 512) {
						@Pc(155) Class5 local155 = Class5.method54(local117 - 512);
						@Pc(161) Class1_Sub3_Sub1 local161 = local155.method60(this.anInt921, (byte) 5);
						if (local161 != null) {
							local106[local108++] = local161;
						}
					}
				}
				local101 = new Class1_Sub3_Sub1(16925, local108, local106);
				for (local117 = 0; local117 < 5; local117++) {
					if (this.anIntArray235[local117] != 0) {
						local101.method225(client.anIntArrayArray2[local117][0], client.anIntArrayArray2[local117][this.anIntArray235[local117]]);
						if (local117 == 1) {
							local101.method225(client.anIntArray50[0], client.anIntArray50[this.anIntArray235[local117]]);
						}
					}
				}
				local101.method218();
				local101.method228(64, 850, -30, -50, -30, true);
				aClass35_9.method508(local4, local101, (byte) 3);
			}
			if (this.aBoolean191) {
				return local101;
			}
			@Pc(249) Class1_Sub3_Sub1 local249 = new Class1_Sub3_Sub1(16925, true, local101);
			if (!arg0) {
				for (local108 = 1; local108 > 0; local108++) {
				}
			}
			if (local6 != -1 && local8 != -1) {
				local249.method220(local8, Class19.aClass19Array1[super.anInt898].anIntArray189, local6);
			} else if (local6 != -1) {
				local249.method219(local6);
			}
			local249.method215();
			local249.anIntArrayArray7 = null;
			local249.anIntArrayArray6 = null;
			return local249;
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("20025, " + arg0 + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "b", descriptor = "(I)Lclient!eb;")
	public Class1_Sub3_Sub1 method554() {
		try {
			if (!this.aBoolean190) {
				return null;
			}
			@Pc(19) Class1_Sub3_Sub1[] local19 = new Class1_Sub3_Sub1[12];
			@Pc(21) int local21 = 0;
			for (@Pc(23) int local23 = 0; local23 < 12; local23++) {
				@Pc(30) int local30 = this.anIntArray234[local23];
				if (local30 >= 256 && local30 < 512) {
					local19[local21++] = Class13.aClass13Array1[local30 - 256].method294();
				}
				if (local30 >= 512) {
					@Pc(59) Class1_Sub3_Sub1 local59 = Class5.method54(local30 - 512).method61(this.anInt921);
					if (local59 != null) {
						local19[local21++] = local59;
					}
				}
			}
			@Pc(77) Class1_Sub3_Sub1 local77 = new Class1_Sub3_Sub1(16925, local21, local19);
			for (@Pc(79) int local79 = 0; local79 < 5; local79++) {
				if (this.anIntArray235[local79] != 0) {
					local77.method225(client.anIntArrayArray2[local79][0], client.anIntArrayArray2[local79][this.anIntArray235[local79]]);
					if (local79 == 1) {
						local77.method225(client.anIntArray50[0], client.anIntArray50[this.anIntArray235[local79]]);
					}
				}
			}
			return local77;
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("7337, " + -13298 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method551() {
		try {
			return this.aBoolean190;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("29360, " + false + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
