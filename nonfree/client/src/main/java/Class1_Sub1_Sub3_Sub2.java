import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!z")
public final class Class1_Sub1_Sub3_Sub2 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!z", name = "Bb", descriptor = "Lclient!s;")
	public static Class35 aClass35_9 = new Class35(200, (byte) 4);

	@OriginalMember(owner = "client!z", name = "fb", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!z", name = "hb", descriptor = "Ljava/lang/String;")
	public String aString30;

	@OriginalMember(owner = "client!z", name = "jb", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!z", name = "kb", descriptor = "I")
	public int anInt945;

	@OriginalMember(owner = "client!z", name = "nb", descriptor = "I")
	public int anInt946;

	@OriginalMember(owner = "client!z", name = "ob", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!z", name = "pb", descriptor = "I")
	public int anInt947;

	@OriginalMember(owner = "client!z", name = "qb", descriptor = "I")
	public int anInt948;

	@OriginalMember(owner = "client!z", name = "rb", descriptor = "I")
	public int anInt949;

	@OriginalMember(owner = "client!z", name = "sb", descriptor = "I")
	public int anInt950;

	@OriginalMember(owner = "client!z", name = "tb", descriptor = "I")
	public int anInt951;

	@OriginalMember(owner = "client!z", name = "ub", descriptor = "I")
	public int anInt952;

	@OriginalMember(owner = "client!z", name = "vb", descriptor = "Lclient!eb;")
	public Class1_Sub3_Sub1 aClass1_Sub3_Sub1_11;

	@OriginalMember(owner = "client!z", name = "wb", descriptor = "I")
	public int anInt953;

	@OriginalMember(owner = "client!z", name = "xb", descriptor = "I")
	public int anInt954;

	@OriginalMember(owner = "client!z", name = "yb", descriptor = "I")
	public int anInt955;

	@OriginalMember(owner = "client!z", name = "zb", descriptor = "I")
	public int anInt956;

	@OriginalMember(owner = "client!z", name = "gb", descriptor = "Z")
	private boolean aBoolean168 = true;

	@OriginalMember(owner = "client!z", name = "ib", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "client!z", name = "lb", descriptor = "[I")
	private int[] anIntArray234 = new int[12];

	@OriginalMember(owner = "client!z", name = "mb", descriptor = "[I")
	private int[] anIntArray235 = new int[5];

	@OriginalMember(owner = "client!z", name = "Ab", descriptor = "Z")
	public boolean aBoolean170 = false;

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(BLclient!kb;)V")
	public void method564(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			arg1.anInt566 = 0;
			this.anInt944 = arg1.method383();
			this.anInt945 = arg1.method383();
			@Pc(19) int local19;
			@Pc(31) int local31;
			for (@Pc(14) int local14 = 0; local14 < 12; local14++) {
				local19 = arg1.method383();
				if (local19 == 0) {
					this.anIntArray234[local14] = 0;
				} else {
					local31 = arg1.method383();
					this.anIntArray234[local14] = (local19 << 8) + local31;
				}
			}
			for (local19 = 0; local19 < 5; local19++) {
				local31 = arg1.method383();
				if (local31 < 0 || local31 >= client.anIntArrayArray5[local19].length) {
					local31 = 0;
				}
				this.anIntArray235[local19] = local31;
			}
			super.anInt900 = arg1.method385();
			if (super.anInt900 == 65535) {
				super.anInt900 = -1;
			}
			super.anInt901 = arg1.method385();
			if (super.anInt901 == 65535) {
				super.anInt901 = -1;
			}
			super.anInt902 = arg1.method385();
			@Pc(101) boolean local101 = false;
			if (super.anInt902 == 65535) {
				super.anInt902 = -1;
			}
			super.anInt903 = arg1.method385();
			if (super.anInt903 == 65535) {
				super.anInt903 = -1;
			}
			super.anInt904 = arg1.method385();
			if (super.anInt904 == 65535) {
				super.anInt904 = -1;
			}
			super.anInt905 = arg1.method385();
			if (super.anInt905 == 65535) {
				super.anInt905 = -1;
			}
			super.anInt906 = arg1.method385();
			if (super.anInt906 == 65535) {
				super.anInt906 = -1;
			}
			this.aString30 = Class40.method534(Class40.method531(arg1.method389()));
			this.anInt946 = arg1.method383();
			this.aBoolean169 = true;
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
			for (@Pc(250) int local250 = 0; local250 < 5; local250++) {
				this.aLong27 <<= 0x3;
				this.aLong27 += this.anIntArray235[local250];
			}
			this.aLong27 <<= 0x1;
			this.aLong27 += this.anInt944;
		} catch (@Pc(288) RuntimeException local288) {
			signlink.reporterror("66156, " + arg0 + ", " + arg1 + ", " + local288.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub1 method560(@OriginalArg(0) int arg0) {
		try {
			if (!this.aBoolean169) {
				return null;
			}
			@Pc(10) Class1_Sub3_Sub1 local10 = this.method565();
			super.anInt939 = local10.anInt365;
			local10.aBoolean81 = true;
			if (this.aBoolean170) {
				return local10;
			}
			if (super.anInt926 != -1 && super.anInt927 != -1) {
				@Pc(35) Class21 local35 = Class21.aClass21Array1[super.anInt926];
				@Pc(50) Class1_Sub3_Sub1 local50 = new Class1_Sub3_Sub1(!local35.aBoolean133, false, false, local35.method401(), true);
				local50.method235(0, -super.anInt930, 0);
				local50.method229();
				local50.method230(local35.aClass19_1.anIntArray186[super.anInt927]);
				local50.anIntArrayArray7 = null;
				local50.anIntArrayArray6 = null;
				if (local35.anInt576 != 128 || local35.anInt577 != 128) {
					local50.method238(local35.anInt576, local35.anInt576, local35.anInt577);
				}
				local50.method239(local35.anInt579 + 64, local35.anInt580 + 850, -30, -50, -30, true);
				@Pc(118) Class1_Sub3_Sub1[] local118 = new Class1_Sub3_Sub1[] { local10, local50 };
				local10 = new Class1_Sub3_Sub1(982, 2, true, local118);
			}
			if (this.aClass1_Sub3_Sub1_11 != null) {
				if (client.anInt239 >= this.anInt949) {
					this.aClass1_Sub3_Sub1_11 = null;
				}
				if (client.anInt239 >= this.anInt948 && client.anInt239 < this.anInt949) {
					@Pc(147) Class1_Sub3_Sub1 local147 = this.aClass1_Sub3_Sub1_11;
					local147.method235(this.anInt950 - super.anInt896, this.anInt951 - this.anInt947, this.anInt952 - super.anInt897);
					if (super.anInt940 == 512) {
						local147.method233(855);
						local147.method233(855);
						local147.method233(855);
					} else if (super.anInt940 == 1024) {
						local147.method233(855);
						local147.method233(855);
					} else if (super.anInt940 == 1536) {
						local147.method233(855);
					}
					@Pc(210) Class1_Sub3_Sub1[] local210 = new Class1_Sub3_Sub1[] { local10, local147 };
					local10 = new Class1_Sub3_Sub1(982, 2, true, local210);
					if (super.anInt940 == 512) {
						local147.method233(855);
					} else if (super.anInt940 == 1024) {
						local147.method233(855);
						local147.method233(855);
					} else if (super.anInt940 == 1536) {
						local147.method233(855);
						local147.method233(855);
						local147.method233(855);
					}
					local147.method235(super.anInt896 - this.anInt950, this.anInt947 - this.anInt951, super.anInt897 - this.anInt952);
				}
			}
			local10.aBoolean81 = true;
			if (arg0 != 1) {
				for (@Pc(278) int local278 = 1; local278 > 0; local278++) {
				}
			}
			return local10;
		} catch (@Pc(286) RuntimeException local286) {
			signlink.reporterror("88909, " + arg0 + ", " + local286.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "b", descriptor = "(Z)Lclient!eb;")
	private Class1_Sub3_Sub1 method565() {
		try {
			@Pc(4) long local4 = this.aLong27;
			@Pc(6) int local6 = -1;
			@Pc(8) int local8 = -1;
			@Pc(10) int local10 = -1;
			@Pc(12) int local12 = -1;
			if (super.anInt921 >= 0 && super.anInt924 == 0) {
				@Pc(23) Class19 local23 = Class19.aClass19Array1[super.anInt921];
				local6 = local23.anIntArray186[super.anInt922];
				if (super.anInt918 >= 0 && super.anInt918 != super.anInt900) {
					local8 = Class19.aClass19Array1[super.anInt918].anIntArray186[super.anInt919];
				}
				if (local23.anInt549 >= 0) {
					local10 = local23.anInt549;
					local4 += local10 - this.anIntArray234[5] << 8;
				}
				if (local23.anInt550 >= 0) {
					local12 = local23.anInt550;
					local4 += local12 - this.anIntArray234[3] << 16;
				}
			} else if (super.anInt918 >= 0) {
				local6 = Class19.aClass19Array1[super.anInt918].anIntArray186[super.anInt919];
			}
			@Pc(101) Class1_Sub3_Sub1 local101 = (Class1_Sub3_Sub1) aClass35_9.method519(local4);
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
						local106[local108++] = Class13.aClass13Array1[local117 - 256].method304();
					}
					if (local117 >= 512) {
						@Pc(155) Class5 local155 = Class5.method54(local117 - 512);
						@Pc(161) Class1_Sub3_Sub1 local161 = local155.method60(this.anInt944);
						if (local161 != null) {
							local106[local108++] = local161;
						}
					}
				}
				local101 = new Class1_Sub3_Sub1(6, local108, local106);
				for (local117 = 0; local117 < 5; local117++) {
					if (this.anIntArray235[local117] != 0) {
						local101.method236(client.anIntArrayArray5[local117][0], client.anIntArrayArray5[local117][this.anIntArray235[local117]]);
						if (local117 == 1) {
							local101.method236(client.anIntArray54[0], client.anIntArray54[this.anIntArray235[local117]]);
						}
					}
				}
				local101.method229();
				local101.method239(64, 850, -30, -50, -30, true);
				aClass35_9.method520(local4, local101);
			}
			if (this.aBoolean170) {
				return local101;
			}
			@Pc(249) Class1_Sub3_Sub1 local249 = new Class1_Sub3_Sub1(6, true, local101);
			if (local6 != -1 && local8 != -1) {
				local249.method231(Class19.aClass19Array1[super.anInt921].anIntArray189, local8, local6);
			} else if (local6 != -1) {
				local249.method230(local6);
			}
			local249.method226(983);
			local249.anIntArrayArray7 = null;
			local249.anIntArrayArray6 = null;
			return local249;
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("83069, " + false + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "b", descriptor = "(I)Lclient!eb;")
	public Class1_Sub3_Sub1 method566() {
		try {
			if (!this.aBoolean169) {
				return null;
			}
			@Pc(9) Class1_Sub3_Sub1[] local9 = new Class1_Sub3_Sub1[12];
			@Pc(11) int local11 = 0;
			for (@Pc(13) int local13 = 0; local13 < 12; local13++) {
				@Pc(20) int local20 = this.anIntArray234[local13];
				if (local20 >= 256 && local20 < 512) {
					local9[local11++] = Class13.aClass13Array1[local20 - 256].method305();
				}
				if (local20 >= 512) {
					@Pc(49) Class1_Sub3_Sub1 local49 = Class5.method54(local20 - 512).method61(this.anInt944, 264);
					if (local49 != null) {
						local9[local11++] = local49;
					}
				}
			}
			@Pc(77) Class1_Sub3_Sub1 local77 = new Class1_Sub3_Sub1(6, local11, local9);
			for (@Pc(79) int local79 = 0; local79 < 5; local79++) {
				if (this.anIntArray235[local79] != 0) {
					local77.method236(client.anIntArrayArray5[local79][0], client.anIntArrayArray5[local79][this.anIntArray235[local79]]);
					if (local79 == 1) {
						local77.method236(client.anIntArray54[0], client.anIntArray54[this.anIntArray235[local79]]);
					}
				}
			}
			return local77;
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("18685, " + 2 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method563() {
		try {
			return this.aBoolean169;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("96422, " + true + ", " + local17.toString());
			throw new RuntimeException();
		}
	}
}
