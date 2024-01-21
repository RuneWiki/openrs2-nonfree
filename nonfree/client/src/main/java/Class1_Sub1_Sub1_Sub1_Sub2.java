import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "Pb", descriptor = "Lclient!t;")
	public static Class42 aClass42_1 = new Class42(0, 260);

	@OriginalMember(owner = "client!bb", name = "ub", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!bb", name = "wb", descriptor = "I")
	private int anInt181;

	@OriginalMember(owner = "client!bb", name = "xb", descriptor = "I")
	public int anInt182;

	@OriginalMember(owner = "client!bb", name = "Ab", descriptor = "I")
	public int anInt183;

	@OriginalMember(owner = "client!bb", name = "Bb", descriptor = "J")
	private long aLong9;

	@OriginalMember(owner = "client!bb", name = "Cb", descriptor = "I")
	public int anInt184;

	@OriginalMember(owner = "client!bb", name = "Db", descriptor = "I")
	public int anInt185;

	@OriginalMember(owner = "client!bb", name = "Eb", descriptor = "I")
	public int anInt186;

	@OriginalMember(owner = "client!bb", name = "Fb", descriptor = "I")
	public int anInt187;

	@OriginalMember(owner = "client!bb", name = "Gb", descriptor = "I")
	public int anInt188;

	@OriginalMember(owner = "client!bb", name = "Hb", descriptor = "I")
	public int anInt189;

	@OriginalMember(owner = "client!bb", name = "Ib", descriptor = "Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 aClass1_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!bb", name = "Jb", descriptor = "I")
	public int anInt190;

	@OriginalMember(owner = "client!bb", name = "Kb", descriptor = "I")
	public int anInt191;

	@OriginalMember(owner = "client!bb", name = "Lb", descriptor = "I")
	public int anInt192;

	@OriginalMember(owner = "client!bb", name = "Mb", descriptor = "I")
	public int anInt193;

	@OriginalMember(owner = "client!bb", name = "rb", descriptor = "B")
	private byte aByte8 = 0;

	@OriginalMember(owner = "client!bb", name = "sb", descriptor = "Z")
	private boolean aBoolean27 = true;

	@OriginalMember(owner = "client!bb", name = "tb", descriptor = "I")
	private int anInt180 = 6;

	@OriginalMember(owner = "client!bb", name = "vb", descriptor = "Z")
	public boolean aBoolean28 = false;

	@OriginalMember(owner = "client!bb", name = "yb", descriptor = "[I")
	public int[] anIntArray18 = new int[12];

	@OriginalMember(owner = "client!bb", name = "zb", descriptor = "[I")
	public int[] anIntArray19 = new int[5];

	@OriginalMember(owner = "client!bb", name = "Nb", descriptor = "Z")
	public boolean aBoolean29 = false;

	@OriginalMember(owner = "client!bb", name = "Ob", descriptor = "J")
	private long aLong10 = -1L;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!mb;I)V")
	public void method51(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt796 = 0;
			this.anInt181 = arg0.method498();
			this.anInt182 = arg0.method498();
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
				if (local31 < 0 || local31 >= client.anIntArrayArray4[local19].length) {
					local31 = 0;
				}
				this.anIntArray19[local19] = local31;
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
			super.anInt141 = arg0.method500();
			if (super.anInt141 == 65535) {
				super.anInt141 = -1;
			}
			super.anInt142 = arg0.method500();
			if (super.anInt142 == 65535) {
				super.anInt142 = -1;
			}
			super.anInt143 = arg0.method500();
			if (super.anInt143 == 65535) {
				super.anInt143 = -1;
			}
			super.anInt144 = arg0.method500();
			if (super.anInt144 == 65535) {
				super.anInt144 = -1;
			}
			this.aString4 = Class49.method683(Class49.method680(arg0.method504()));
			this.anInt183 = arg0.method498();
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
			this.aLong9 += this.anInt181;
		} catch (@Pc(281) RuntimeException local281) {
			signlink.reporterror("6729, " + arg0 + ", " + 0 + ", " + local281.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method316(@OriginalArg(0) byte arg0) {
		try {
			if (!this.aBoolean28) {
				return null;
			}
			@Pc(10) Class1_Sub1_Sub1_Sub5 local10 = this.method52();
			if (local10 == null) {
				return null;
			}
			super.anInt175 = local10.anInt581;
			local10.aBoolean131 = true;
			if (this.aBoolean29) {
				return local10;
			}
			if (super.anInt162 != -1 && super.anInt163 != -1) {
				@Pc(46) Class32 local46 = Class32.aClass32Array1[super.anInt162];
				@Pc(49) Class1_Sub1_Sub1_Sub5 local49 = local46.method530();
				if (local49 != null) {
					@Pc(63) Class1_Sub1_Sub1_Sub5 local63 = new Class1_Sub1_Sub1_Sub5(Class14.method328((byte) 7, super.anInt163), false, true, true, local49);
					local63.method301(0, 0, -super.anInt166);
					local63.method295();
					local63.method296(this.aByte8, local46.aClass27_2.anIntArray227[super.anInt163]);
					local63.anIntArrayArray8 = null;
					local63.anIntArrayArray7 = null;
					if (local46.anInt869 != 128 || local46.anInt870 != 128) {
						local63.method304(local46.anInt869, local46.anInt870, local46.anInt869);
					}
					local63.method305(local46.anInt872 + 64, local46.anInt873 + 850, -30, -50, -30, true);
					@Pc(132) Class1_Sub1_Sub1_Sub5[] local132 = new Class1_Sub1_Sub1_Sub5[] { local10, local63 };
					local10 = new Class1_Sub1_Sub1_Sub5(local132, true, 2, 0);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub5_1 != null) {
				if (client.anInt268 >= this.anInt186) {
					this.aClass1_Sub1_Sub1_Sub5_1 = null;
				}
				if (client.anInt268 >= this.anInt185 && client.anInt268 < this.anInt186) {
					@Pc(161) Class1_Sub1_Sub1_Sub5 local161 = this.aClass1_Sub1_Sub1_Sub5_1;
					local161.method301(this.anInt189 - super.anInt135, this.anInt187 - super.anInt134, this.anInt188 - this.anInt184);
					if (super.anInt176 == 512) {
						local161.method299();
						local161.method299();
						local161.method299();
					} else if (super.anInt176 == 1024) {
						local161.method299();
						local161.method299();
					} else if (super.anInt176 == 1536) {
						local161.method299();
					}
					@Pc(224) Class1_Sub1_Sub1_Sub5[] local224 = new Class1_Sub1_Sub1_Sub5[] { local10, local161 };
					local10 = new Class1_Sub1_Sub1_Sub5(local224, true, 2, 0);
					if (super.anInt176 == 512) {
						local161.method299();
					} else if (super.anInt176 == 1024) {
						local161.method299();
						local161.method299();
					} else if (super.anInt176 == 1536) {
						local161.method299();
						local161.method299();
						local161.method299();
					}
					local161.method301(super.anInt135 - this.anInt189, super.anInt134 - this.anInt187, this.anInt184 - this.anInt188);
				}
			}
			local10.aBoolean131 = true;
			return local10;
		} catch (@Pc(290) RuntimeException local290) {
			signlink.reporterror("58969, " + 8 + ", " + local290.toString());
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
			if (super.anInt157 >= 0 && super.anInt160 == 0) {
				@Pc(23) Class27 local23 = Class27.aClass27Array1[super.anInt157];
				local6 = local23.anIntArray227[super.anInt158];
				if (super.anInt154 >= 0 && super.anInt154 != super.anInt138) {
					local8 = Class27.aClass27Array1[super.anInt154].anIntArray227[super.anInt155];
				}
				if (local23.anInt833 >= 0) {
					local10 = local23.anInt833;
					local4 += local10 - this.anIntArray18[5] << 8;
				}
				if (local23.anInt834 >= 0) {
					local12 = local23.anInt834;
					local4 += local12 - this.anIntArray18[3] << 16;
				}
			} else if (super.anInt154 >= 0) {
				local6 = Class27.aClass27Array1[super.anInt154].anIntArray227[super.anInt155];
			}
			@Pc(101) Class1_Sub1_Sub1_Sub5 local101 = (Class1_Sub1_Sub1_Sub5) aClass42_1.method641(local4);
			@Pc(107) int local107;
			@Pc(114) int local114;
			if (local101 == null) {
				@Pc(105) boolean local105 = false;
				for (local107 = 0; local107 < 12; local107++) {
					local114 = this.anIntArray18[local107];
					if (local12 >= 0 && local107 == 3) {
						local114 = local12;
					}
					if (local10 >= 0 && local107 == 5) {
						local114 = local10;
					}
					if (local114 >= 256 && local114 < 512 && !Class23.aClass23Array1[local114 - 256].method479((byte) 7)) {
						local105 = true;
					}
					if (local114 >= 512 && !Class15.method345(local114 - 512).method352(this.anInt181)) {
						local105 = true;
					}
				}
				if (local105) {
					if (this.aLong10 != -1L) {
						local101 = (Class1_Sub1_Sub1_Sub5) aClass42_1.method641(this.aLong10);
					}
					if (local101 == null) {
						return null;
					}
				}
			}
			if (local101 == null) {
				@Pc(184) Class1_Sub1_Sub1_Sub5[] local184 = new Class1_Sub1_Sub1_Sub5[12];
				local107 = 0;
				@Pc(195) int local195;
				for (local114 = 0; local114 < 12; local114++) {
					local195 = this.anIntArray18[local114];
					if (local12 >= 0 && local114 == 3) {
						local195 = local12;
					}
					if (local10 >= 0 && local114 == 5) {
						local195 = local10;
					}
					@Pc(223) Class1_Sub1_Sub1_Sub5 local223;
					if (local195 >= 256 && local195 < 512) {
						local223 = Class23.aClass23Array1[local195 - 256].method480();
						if (local223 != null) {
							local184[local107++] = local223;
						}
					}
					if (local195 >= 512) {
						local223 = Class15.method345(local195 - 512).method353(this.anInt180, this.anInt181);
						if (local223 != null) {
							local184[local107++] = local223;
						}
					}
				}
				local101 = new Class1_Sub1_Sub1_Sub5(local107, local184, -38792);
				for (local195 = 0; local195 < 5; local195++) {
					if (this.anIntArray19[local195] != 0) {
						local101.method302(client.anIntArrayArray4[local195][0], client.anIntArrayArray4[local195][this.anIntArray19[local195]]);
						if (local195 == 1) {
							local101.method302(client.anIntArray39[0], client.anIntArray39[this.anIntArray19[local195]]);
						}
					}
				}
				local101.method295();
				local101.method305(64, 850, -30, -50, -30, true);
				aClass42_1.method642(local4, local101);
				this.aLong10 = local4;
			}
			if (this.aBoolean29) {
				return local101;
			}
			@Pc(329) Class1_Sub1_Sub1_Sub5 local329 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local329.method290(Class14.method328((byte) 7, local6) & Class14.method328((byte) 7, local8), local101);
			if (local6 != -1 && local8 != -1) {
				local329.method297(local8, Class27.aClass27Array1[super.anInt157].anIntArray230, local6);
			} else if (local6 != -1) {
				local329.method296(this.aByte8, local6);
			}
			local329.method292();
			local329.anIntArrayArray8 = null;
			local329.anIntArrayArray7 = null;
			return local329;
		} catch (@Pc(383) RuntimeException local383) {
			signlink.reporterror("65033, " + 372 + ", " + local383.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method53() {
		try {
			if (!this.aBoolean28) {
				return null;
			}
			@Pc(18) boolean local18 = false;
			for (@Pc(20) int local20 = 0; local20 < 12; local20++) {
				@Pc(27) int local27 = this.anIntArray18[local20];
				if (local27 >= 256 && local27 < 512 && !Class23.aClass23Array1[local27 - 256].method481()) {
					local18 = true;
				}
				if (local27 >= 512 && !Class15.method345(local27 - 512).method354(this.anInt181)) {
					local18 = true;
				}
			}
			if (local18) {
				return null;
			}
			@Pc(68) Class1_Sub1_Sub1_Sub5[] local68 = new Class1_Sub1_Sub1_Sub5[12];
			@Pc(70) int local70 = 0;
			for (@Pc(72) int local72 = 0; local72 < 12; local72++) {
				@Pc(79) int local79 = this.anIntArray18[local72];
				@Pc(93) Class1_Sub1_Sub1_Sub5 local93;
				if (local79 >= 256 && local79 < 512) {
					local93 = Class23.aClass23Array1[local79 - 256].method482();
					if (local93 != null) {
						local68[local70++] = local93;
					}
				}
				if (local79 >= 512) {
					local93 = Class15.method345(local79 - 512).method355(this.anInt181);
					if (local93 != null) {
						local68[local70++] = local93;
					}
				}
			}
			@Pc(130) Class1_Sub1_Sub1_Sub5 local130 = new Class1_Sub1_Sub1_Sub5(local70, local68, -38792);
			for (@Pc(132) int local132 = 0; local132 < 5; local132++) {
				if (this.anIntArray19[local132] != 0) {
					local130.method302(client.anIntArrayArray4[local132][0], client.anIntArrayArray4[local132][this.anIntArray19[local132]]);
					if (local132 == 1) {
						local130.method302(client.anIntArray39[0], client.anIntArray39[this.anIntArray19[local132]]);
					}
				}
			}
			return local130;
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("81653, " + true + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method49() {
		try {
			return this.aBoolean28;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("38807, " + -42790 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}
}
