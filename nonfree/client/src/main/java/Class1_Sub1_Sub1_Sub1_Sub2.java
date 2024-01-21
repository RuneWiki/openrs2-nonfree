import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "Lb", descriptor = "Lclient!t;")
	public static Class39 aClass39_1 = new Class39(5, 260);

	@OriginalMember(owner = "client!bb", name = "nb", descriptor = "I")
	private int anInt175;

	@OriginalMember(owner = "client!bb", name = "qb", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!bb", name = "sb", descriptor = "I")
	private int anInt178;

	@OriginalMember(owner = "client!bb", name = "tb", descriptor = "I")
	public int anInt179;

	@OriginalMember(owner = "client!bb", name = "wb", descriptor = "I")
	public int anInt180;

	@OriginalMember(owner = "client!bb", name = "xb", descriptor = "J")
	private long aLong7;

	@OriginalMember(owner = "client!bb", name = "yb", descriptor = "I")
	public int anInt181;

	@OriginalMember(owner = "client!bb", name = "zb", descriptor = "I")
	public int anInt182;

	@OriginalMember(owner = "client!bb", name = "Ab", descriptor = "I")
	public int anInt183;

	@OriginalMember(owner = "client!bb", name = "Bb", descriptor = "I")
	public int anInt184;

	@OriginalMember(owner = "client!bb", name = "Cb", descriptor = "I")
	public int anInt185;

	@OriginalMember(owner = "client!bb", name = "Db", descriptor = "I")
	public int anInt186;

	@OriginalMember(owner = "client!bb", name = "Eb", descriptor = "Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 aClass1_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!bb", name = "Fb", descriptor = "I")
	public int anInt187;

	@OriginalMember(owner = "client!bb", name = "Gb", descriptor = "I")
	public int anInt188;

	@OriginalMember(owner = "client!bb", name = "Hb", descriptor = "I")
	public int anInt189;

	@OriginalMember(owner = "client!bb", name = "Ib", descriptor = "I")
	public int anInt190;

	@OriginalMember(owner = "client!bb", name = "ob", descriptor = "I")
	private int anInt176 = -45277;

	@OriginalMember(owner = "client!bb", name = "pb", descriptor = "I")
	private int anInt177 = -884;

	@OriginalMember(owner = "client!bb", name = "rb", descriptor = "Z")
	private boolean aBoolean21 = false;

	@OriginalMember(owner = "client!bb", name = "ub", descriptor = "[I")
	public int[] anIntArray9 = new int[12];

	@OriginalMember(owner = "client!bb", name = "vb", descriptor = "[I")
	public int[] anIntArray10 = new int[5];

	@OriginalMember(owner = "client!bb", name = "Jb", descriptor = "Z")
	public boolean aBoolean22 = false;

	@OriginalMember(owner = "client!bb", name = "Kb", descriptor = "J")
	private long aLong8 = -1L;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!mb;I)V")
	public void method45(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt777 = 0;
			this.anInt178 = arg0.method468();
			this.anInt179 = arg0.method468();
			@Pc(19) int local19;
			@Pc(31) int local31;
			for (@Pc(14) int local14 = 0; local14 < 12; local14++) {
				local19 = arg0.method468();
				if (local19 == 0) {
					this.anIntArray9[local14] = 0;
				} else {
					local31 = arg0.method468();
					this.anIntArray9[local14] = (local19 << 8) + local31;
				}
			}
			for (local19 = 0; local19 < 5; local19++) {
				local31 = arg0.method468();
				if (local31 < 0 || local31 >= client.anIntArrayArray3[local19].length) {
					local31 = 0;
				}
				this.anIntArray10[local19] = local31;
			}
			super.anInt132 = arg0.method470();
			if (super.anInt132 == 65535) {
				super.anInt132 = -1;
			}
			super.anInt133 = arg0.method470();
			if (super.anInt133 == 65535) {
				super.anInt133 = -1;
			}
			super.anInt134 = arg0.method470();
			if (super.anInt134 == 65535) {
				super.anInt134 = -1;
			}
			super.anInt135 = arg0.method470();
			if (super.anInt135 == 65535) {
				super.anInt135 = -1;
			}
			super.anInt136 = arg0.method470();
			if (super.anInt136 == 65535) {
				super.anInt136 = -1;
			}
			super.anInt137 = arg0.method470();
			if (super.anInt137 == 65535) {
				super.anInt137 = -1;
			}
			super.anInt138 = arg0.method470();
			if (super.anInt138 == 65535) {
				super.anInt138 = -1;
			}
			this.aString4 = Class46.method649(Class46.method646(arg0.method474(408)));
			this.anInt180 = arg0.method468();
			this.aBoolean21 = true;
			this.aLong7 = 0L;
			for (local31 = 0; local31 < 12; local31++) {
				this.aLong7 <<= 0x4;
				if (this.anIntArray9[local31] >= 256) {
					this.aLong7 += this.anIntArray9[local31] - 256;
				}
			}
			if (this.anIntArray9[0] >= 256) {
				this.aLong7 += this.anIntArray9[0] - 256 >> 4;
			}
			if (this.anIntArray9[1] >= 256) {
				this.aLong7 += this.anIntArray9[1] - 256 >> 8;
			}
			for (@Pc(243) int local243 = 0; local243 < 5; local243++) {
				this.aLong7 <<= 0x3;
				this.aLong7 += this.anIntArray10[local243];
			}
			this.aLong7 <<= 0x1;
			this.aLong7 += this.anInt178;
		} catch (@Pc(281) RuntimeException local281) {
			signlink.reporterror("29191, " + arg0 + ", " + -58 + ", " + local281.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method313() {
		try {
			if (!this.aBoolean21) {
				return null;
			}
			@Pc(10) Class1_Sub1_Sub1_Sub5 local10 = this.method46();
			if (local10 == null) {
				return null;
			}
			super.anInt171 = local10.anInt579;
			local10.aBoolean111 = true;
			if (this.aBoolean22) {
				return local10;
			}
			if (super.anInt158 != -1 && super.anInt159 != -1) {
				@Pc(48) Class27 local48 = Class27.aClass27Array1[super.anInt158];
				@Pc(51) Class1_Sub1_Sub1_Sub5 local51 = local48.method491();
				if (local51 != null) {
					@Pc(67) Class1_Sub1_Sub1_Sub5 local67 = new Class1_Sub1_Sub1_Sub5(-435, true, false, local51, !local48.aBoolean168);
					local67.method292(-super.anInt162, this.anInt176, 0, 0);
					local67.method286();
					local67.method287(local48.aClass25_2.anIntArray215[super.anInt159]);
					local67.anIntArrayArray8 = null;
					local67.anIntArrayArray7 = null;
					if (local48.anInt819 != 128 || local48.anInt820 != 128) {
						local67.method295(local48.anInt820, local48.anInt819, local48.anInt819);
					}
					local67.method296(local48.anInt822 + 64, local48.anInt823 + 850, -30, -50, -30, true);
					@Pc(136) Class1_Sub1_Sub1_Sub5[] local136 = new Class1_Sub1_Sub1_Sub5[] { local10, local67 };
					local10 = new Class1_Sub1_Sub1_Sub5(local136, 2, true, this.anInt175);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub5_1 != null) {
				if (client.anInt363 >= this.anInt183) {
					this.aClass1_Sub1_Sub1_Sub5_1 = null;
				}
				if (client.anInt363 >= this.anInt182 && client.anInt363 < this.anInt183) {
					@Pc(166) Class1_Sub1_Sub1_Sub5 local166 = this.aClass1_Sub1_Sub1_Sub5_1;
					local166.method292(this.anInt185 - this.anInt181, this.anInt176, this.anInt184 - super.anInt128, this.anInt186 - super.anInt129);
					if (super.anInt172 == 512) {
						local166.method290();
						local166.method290();
						local166.method290();
					} else if (super.anInt172 == 1024) {
						local166.method290();
						local166.method290();
					} else if (super.anInt172 == 1536) {
						local166.method290();
					}
					@Pc(230) Class1_Sub1_Sub1_Sub5[] local230 = new Class1_Sub1_Sub1_Sub5[] { local10, local166 };
					local10 = new Class1_Sub1_Sub1_Sub5(local230, 2, true, this.anInt175);
					if (super.anInt172 == 512) {
						local166.method290();
					} else if (super.anInt172 == 1024) {
						local166.method290();
						local166.method290();
					} else if (super.anInt172 == 1536) {
						local166.method290();
						local166.method290();
						local166.method290();
					}
					local166.method292(this.anInt181 - this.anInt185, this.anInt176, super.anInt128 - this.anInt184, super.anInt129 - this.anInt186);
				}
			}
			local10.aBoolean111 = true;
			return local10;
		} catch (@Pc(298) RuntimeException local298) {
			signlink.reporterror("10561, " + false + ", " + local298.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)Lclient!fb;")
	private Class1_Sub1_Sub1_Sub5 method46() {
		try {
			@Pc(4) long local4 = this.aLong7;
			@Pc(6) int local6 = -1;
			@Pc(8) int local8 = -1;
			@Pc(10) int local10 = -1;
			@Pc(12) int local12 = -1;
			if (super.anInt153 >= 0 && super.anInt156 == 0) {
				@Pc(30) Class25 local30 = Class25.aClass25Array1[super.anInt153];
				local6 = local30.anIntArray215[super.anInt154];
				if (super.anInt150 >= 0 && super.anInt150 != super.anInt132) {
					local8 = Class25.aClass25Array1[super.anInt150].anIntArray215[super.anInt151];
				}
				if (local30.anInt788 >= 0) {
					local10 = local30.anInt788;
					local4 += local10 - this.anIntArray9[5] << 8;
				}
				if (local30.anInt789 >= 0) {
					local12 = local30.anInt789;
					local4 += local12 - this.anIntArray9[3] << 16;
				}
			} else if (super.anInt150 >= 0) {
				local6 = Class25.aClass25Array1[super.anInt150].anIntArray215[super.anInt151];
			}
			@Pc(108) Class1_Sub1_Sub1_Sub5 local108 = (Class1_Sub1_Sub1_Sub5) aClass39_1.method609(local4);
			@Pc(114) int local114;
			@Pc(121) int local121;
			if (local108 == null) {
				@Pc(112) boolean local112 = false;
				for (local114 = 0; local114 < 12; local114++) {
					local121 = this.anIntArray9[local114];
					if (local12 >= 0 && local114 == 3) {
						local121 = local12;
					}
					if (local10 >= 0 && local114 == 5) {
						local121 = local10;
					}
					if (local121 >= 256 && local121 < 512 && !Class21.aClass21Array1[local121 - 256].method427()) {
						local112 = true;
					}
					if (local121 >= 512 && !Class13.method317(local121 - 512).method324(this.anInt178)) {
						local112 = true;
					}
				}
				if (local112) {
					if (this.aLong8 != -1L) {
						local108 = (Class1_Sub1_Sub1_Sub5) aClass39_1.method609(this.aLong8);
					}
					if (local108 == null) {
						return null;
					}
				}
			}
			if (local108 == null) {
				@Pc(191) Class1_Sub1_Sub1_Sub5[] local191 = new Class1_Sub1_Sub1_Sub5[12];
				local114 = 0;
				@Pc(202) int local202;
				for (local121 = 0; local121 < 12; local121++) {
					local202 = this.anIntArray9[local121];
					if (local12 >= 0 && local121 == 3) {
						local202 = local12;
					}
					if (local10 >= 0 && local121 == 5) {
						local202 = local10;
					}
					@Pc(230) Class1_Sub1_Sub1_Sub5 local230;
					if (local202 >= 256 && local202 < 512) {
						local230 = Class21.aClass21Array1[local202 - 256].method428(208);
						if (local230 != null) {
							local191[local114++] = local230;
						}
					}
					if (local202 >= 512) {
						local230 = Class13.method317(local202 - 512).method325(this.anInt178);
						if (local230 != null) {
							local191[local114++] = local230;
						}
					}
				}
				local108 = new Class1_Sub1_Sub1_Sub5(local114, local191, (byte) 4);
				for (local202 = 0; local202 < 5; local202++) {
					if (this.anIntArray10[local202] != 0) {
						local108.method293(client.anIntArrayArray3[local202][0], client.anIntArrayArray3[local202][this.anIntArray10[local202]]);
						if (local202 == 1) {
							local108.method293(client.anIntArray58[0], client.anIntArray58[this.anIntArray10[local202]]);
						}
					}
				}
				local108.method286();
				local108.method296(64, 850, -30, -50, -30, true);
				aClass39_1.method610(local108, local4);
				this.aLong8 = local4;
			}
			if (this.aBoolean22) {
				return local108;
			}
			@Pc(335) Class1_Sub1_Sub1_Sub5 local335 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local335.method281(local108, true);
			if (local6 != -1 && local8 != -1) {
				local335.method288(local8, local6, Class25.aClass25Array1[super.anInt153].anIntArray218);
			} else if (local6 != -1) {
				local335.method287(local6);
			}
			local335.method283();
			local335.anIntArrayArray8 = null;
			local335.anIntArrayArray7 = null;
			return local335;
		} catch (@Pc(377) RuntimeException local377) {
			signlink.reporterror("66156, " + 7 + ", " + local377.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method47() {
		try {
			if (!this.aBoolean21) {
				return null;
			}
			@Pc(8) boolean local8 = false;
			for (@Pc(19) int local19 = 0; local19 < 12; local19++) {
				@Pc(26) int local26 = this.anIntArray9[local19];
				if (local26 >= 256 && local26 < 512 && !Class21.aClass21Array1[local26 - 256].method429(this.anInt177)) {
					local8 = true;
				}
				if (local26 >= 512 && !Class13.method317(local26 - 512).method326(this.anInt178)) {
					local8 = true;
				}
			}
			if (local8) {
				return null;
			}
			@Pc(68) Class1_Sub1_Sub1_Sub5[] local68 = new Class1_Sub1_Sub1_Sub5[12];
			@Pc(70) int local70 = 0;
			for (@Pc(72) int local72 = 0; local72 < 12; local72++) {
				@Pc(79) int local79 = this.anIntArray9[local72];
				@Pc(93) Class1_Sub1_Sub1_Sub5 local93;
				if (local79 >= 256 && local79 < 512) {
					local93 = Class21.aClass21Array1[local79 - 256].method430();
					if (local93 != null) {
						local68[local70++] = local93;
					}
				}
				if (local79 >= 512) {
					local93 = Class13.method317(local79 - 512).method327(this.anInt178);
					if (local93 != null) {
						local68[local70++] = local93;
					}
				}
			}
			@Pc(130) Class1_Sub1_Sub1_Sub5 local130 = new Class1_Sub1_Sub1_Sub5(local70, local68, (byte) 4);
			for (@Pc(132) int local132 = 0; local132 < 5; local132++) {
				if (this.anIntArray10[local132] != 0) {
					local130.method293(client.anIntArrayArray3[local132][0], client.anIntArrayArray3[local132][this.anIntArray10[local132]]);
					if (local132 == 1) {
						local130.method293(client.anIntArray58[0], client.anIntArray58[this.anIntArray10[local132]]);
					}
				}
			}
			return local130;
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("29899, " + true + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method44() {
		try {
			return this.aBoolean21;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("42849, " + -27441 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}
}
