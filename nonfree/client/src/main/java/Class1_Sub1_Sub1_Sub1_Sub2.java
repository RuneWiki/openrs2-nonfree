import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "Jb", descriptor = "Lclient!t;")
	public static Class39 aClass39_1 = new Class39(false, 260);

	@OriginalMember(owner = "client!bb", name = "ob", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!bb", name = "qb", descriptor = "I")
	private int anInt183;

	@OriginalMember(owner = "client!bb", name = "rb", descriptor = "I")
	public int anInt184;

	@OriginalMember(owner = "client!bb", name = "ub", descriptor = "I")
	public int anInt185;

	@OriginalMember(owner = "client!bb", name = "vb", descriptor = "J")
	private long aLong7;

	@OriginalMember(owner = "client!bb", name = "wb", descriptor = "I")
	public int anInt186;

	@OriginalMember(owner = "client!bb", name = "xb", descriptor = "I")
	public int anInt187;

	@OriginalMember(owner = "client!bb", name = "yb", descriptor = "I")
	public int anInt188;

	@OriginalMember(owner = "client!bb", name = "zb", descriptor = "I")
	public int anInt189;

	@OriginalMember(owner = "client!bb", name = "Ab", descriptor = "I")
	public int anInt190;

	@OriginalMember(owner = "client!bb", name = "Bb", descriptor = "I")
	public int anInt191;

	@OriginalMember(owner = "client!bb", name = "Cb", descriptor = "Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 aClass1_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!bb", name = "Db", descriptor = "I")
	public int anInt192;

	@OriginalMember(owner = "client!bb", name = "Eb", descriptor = "I")
	public int anInt193;

	@OriginalMember(owner = "client!bb", name = "Fb", descriptor = "I")
	public int anInt194;

	@OriginalMember(owner = "client!bb", name = "Gb", descriptor = "I")
	public int anInt195;

	@OriginalMember(owner = "client!bb", name = "mb", descriptor = "Z")
	private boolean aBoolean13 = true;

	@OriginalMember(owner = "client!bb", name = "nb", descriptor = "I")
	private int anInt182 = 487;

	@OriginalMember(owner = "client!bb", name = "pb", descriptor = "Z")
	private boolean aBoolean14 = false;

	@OriginalMember(owner = "client!bb", name = "sb", descriptor = "[I")
	public int[] anIntArray9 = new int[12];

	@OriginalMember(owner = "client!bb", name = "tb", descriptor = "[I")
	public int[] anIntArray10 = new int[5];

	@OriginalMember(owner = "client!bb", name = "Hb", descriptor = "Z")
	public boolean aBoolean15 = false;

	@OriginalMember(owner = "client!bb", name = "Ib", descriptor = "J")
	private long aLong8 = -1L;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZLclient!mb;)V")
	public void method45(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt771 = 0;
			this.anInt183 = arg0.method467();
			this.anInt184 = arg0.method467();
			@Pc(19) int local19;
			@Pc(31) int local31;
			for (@Pc(14) int local14 = 0; local14 < 12; local14++) {
				local19 = arg0.method467();
				if (local19 == 0) {
					this.anIntArray9[local14] = 0;
				} else {
					local31 = arg0.method467();
					this.anIntArray9[local14] = (local19 << 8) + local31;
				}
			}
			for (local19 = 0; local19 < 5; local19++) {
				local31 = arg0.method467();
				if (local31 < 0 || local31 >= client.anIntArrayArray3[local19].length) {
					local31 = 0;
				}
				this.anIntArray10[local19] = local31;
			}
			super.anInt139 = arg0.method469();
			if (super.anInt139 == 65535) {
				super.anInt139 = -1;
			}
			super.anInt140 = arg0.method469();
			if (super.anInt140 == 65535) {
				super.anInt140 = -1;
			}
			super.anInt141 = arg0.method469();
			if (super.anInt141 == 65535) {
				super.anInt141 = -1;
			}
			super.anInt142 = arg0.method469();
			if (super.anInt142 == 65535) {
				super.anInt142 = -1;
			}
			super.anInt143 = arg0.method469();
			if (super.anInt143 == 65535) {
				super.anInt143 = -1;
			}
			super.anInt144 = arg0.method469();
			if (super.anInt144 == 65535) {
				super.anInt144 = -1;
			}
			super.anInt145 = arg0.method469();
			if (super.anInt145 == 65535) {
				super.anInt145 = -1;
			}
			this.aString4 = Class46.method644(Class46.method641(arg0.method473()));
			this.anInt185 = arg0.method467();
			this.aBoolean14 = true;
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
			for (@Pc(249) int local249 = 0; local249 < 5; local249++) {
				this.aLong7 <<= 0x3;
				this.aLong7 += this.anIntArray10[local249];
			}
			this.aLong7 <<= 0x1;
			this.aLong7 += this.anInt183;
		} catch (@Pc(287) RuntimeException local287) {
			signlink.reporterror("39078, " + false + ", " + arg0 + ", " + local287.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method312(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			if (!this.aBoolean14) {
				return null;
			}
			@Pc(20) Class1_Sub1_Sub1_Sub5 local20 = this.method46(this.anInt182);
			if (local20 == null) {
				return null;
			}
			super.anInt178 = local20.anInt579;
			local20.aBoolean103 = true;
			if (this.aBoolean15) {
				return local20;
			}
			if (super.anInt165 != -1 && super.anInt166 != -1) {
				@Pc(49) Class27 local49 = Class27.aClass27Array1[super.anInt165];
				@Pc(52) Class1_Sub1_Sub1_Sub5 local52 = local49.method490();
				if (local52 != null) {
					@Pc(68) Class1_Sub1_Sub1_Sub5 local68 = new Class1_Sub1_Sub1_Sub5(8, true, !local49.aBoolean166, false, local52);
					local68.method291(-super.anInt169, 0, 0);
					local68.method285();
					local68.method286(local49.aClass25_2.anIntArray215[super.anInt166]);
					local68.anIntArrayArray8 = null;
					local68.anIntArrayArray7 = null;
					if (local49.anInt812 != 128 || local49.anInt813 != 128) {
						local68.method294(local49.anInt812, local49.anInt812, local49.anInt813);
					}
					local68.method295(local49.anInt815 + 64, local49.anInt816 + 850, -30, -50, -30, true);
					@Pc(136) Class1_Sub1_Sub1_Sub5[] local136 = new Class1_Sub1_Sub1_Sub5[] { local20, local68 };
					local20 = new Class1_Sub1_Sub1_Sub5(true, 2, local136, -591);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub5_1 != null) {
				if (client.anInt320 >= this.anInt188) {
					this.aClass1_Sub1_Sub1_Sub5_1 = null;
				}
				if (client.anInt320 >= this.anInt187 && client.anInt320 < this.anInt188) {
					@Pc(165) Class1_Sub1_Sub1_Sub5 local165 = this.aClass1_Sub1_Sub1_Sub5_1;
					local165.method291(this.anInt190 - this.anInt186, this.anInt189 - super.anInt135, this.anInt191 - super.anInt136);
					if (super.anInt179 == 512) {
						local165.method289();
						local165.method289();
						local165.method289();
					} else if (super.anInt179 == 1024) {
						local165.method289();
						local165.method289();
					} else if (super.anInt179 == 1536) {
						local165.method289();
					}
					@Pc(228) Class1_Sub1_Sub1_Sub5[] local228 = new Class1_Sub1_Sub1_Sub5[] { local20, local165 };
					local20 = new Class1_Sub1_Sub1_Sub5(true, 2, local228, -591);
					if (super.anInt179 == 512) {
						local165.method289();
					} else if (super.anInt179 == 1024) {
						local165.method289();
						local165.method289();
					} else if (super.anInt179 == 1536) {
						local165.method289();
						local165.method289();
						local165.method289();
					}
					local165.method291(this.anInt186 - this.anInt190, super.anInt135 - this.anInt189, super.anInt136 - this.anInt191);
				}
			}
			local20.aBoolean103 = true;
			return local20;
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("23686, " + arg0 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)Lclient!fb;")
	private Class1_Sub1_Sub1_Sub5 method46(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) long local4 = this.aLong7;
			@Pc(6) int local6 = -1;
			@Pc(8) int local8 = -1;
			@Pc(10) int local10 = -1;
			@Pc(12) int local12 = -1;
			@Pc(16) int local16 = 63 / arg0;
			if (super.anInt160 >= 0 && super.anInt163 == 0) {
				@Pc(27) Class25 local27 = Class25.aClass25Array1[super.anInt160];
				local6 = local27.anIntArray215[super.anInt161];
				if (super.anInt157 >= 0 && super.anInt157 != super.anInt139) {
					local8 = Class25.aClass25Array1[super.anInt157].anIntArray215[super.anInt158];
				}
				if (local27.anInt781 >= 0) {
					local10 = local27.anInt781;
					local4 += local10 - this.anIntArray9[5] << 8;
				}
				if (local27.anInt782 >= 0) {
					local12 = local27.anInt782;
					local4 += local12 - this.anIntArray9[3] << 16;
				}
			} else if (super.anInt157 >= 0) {
				local6 = Class25.aClass25Array1[super.anInt157].anIntArray215[super.anInt158];
			}
			@Pc(105) Class1_Sub1_Sub1_Sub5 local105 = (Class1_Sub1_Sub1_Sub5) aClass39_1.method608(local4);
			@Pc(111) int local111;
			@Pc(118) int local118;
			if (local105 == null) {
				@Pc(109) boolean local109 = false;
				for (local111 = 0; local111 < 12; local111++) {
					local118 = this.anIntArray9[local111];
					if (local12 >= 0 && local111 == 3) {
						local118 = local12;
					}
					if (local10 >= 0 && local111 == 5) {
						local118 = local10;
					}
					if (local118 >= 256 && local118 < 512 && !Class21.aClass21Array1[local118 - 256].method426()) {
						local109 = true;
					}
					if (local118 >= 512 && !Class13.method316(local118 - 512).method323(this.anInt183, 461)) {
						local109 = true;
					}
				}
				if (local109) {
					if (this.aLong8 != -1L) {
						local105 = (Class1_Sub1_Sub1_Sub5) aClass39_1.method608(this.aLong8);
					}
					if (local105 == null) {
						return null;
					}
				}
			}
			if (local105 == null) {
				@Pc(188) Class1_Sub1_Sub1_Sub5[] local188 = new Class1_Sub1_Sub1_Sub5[12];
				local111 = 0;
				@Pc(199) int local199;
				for (local118 = 0; local118 < 12; local118++) {
					local199 = this.anIntArray9[local118];
					if (local12 >= 0 && local118 == 3) {
						local199 = local12;
					}
					if (local10 >= 0 && local118 == 5) {
						local199 = local10;
					}
					@Pc(227) Class1_Sub1_Sub1_Sub5 local227;
					if (local199 >= 256 && local199 < 512) {
						local227 = Class21.aClass21Array1[local199 - 256].method427();
						if (local227 != null) {
							local188[local111++] = local227;
						}
					}
					if (local199 >= 512) {
						local227 = Class13.method316(local199 - 512).method324(this.anInt183);
						if (local227 != null) {
							local188[local111++] = local227;
						}
					}
				}
				local105 = new Class1_Sub1_Sub1_Sub5(local111, false, local188);
				for (local199 = 0; local199 < 5; local199++) {
					if (this.anIntArray10[local199] != 0) {
						local105.method292(client.anIntArrayArray3[local199][0], client.anIntArrayArray3[local199][this.anIntArray10[local199]]);
						if (local199 == 1) {
							local105.method292(client.anIntArray42[0], client.anIntArray42[this.anIntArray10[local199]]);
						}
					}
				}
				local105.method285();
				local105.method295(64, 850, -30, -50, -30, true);
				aClass39_1.method609(local4, local105);
				this.aLong8 = local4;
			}
			if (this.aBoolean15) {
				return local105;
			}
			@Pc(332) Class1_Sub1_Sub1_Sub5 local332 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local332.method280(true, local105);
			if (local6 != -1 && local8 != -1) {
				local332.method287(365, local8, local6, Class25.aClass25Array1[super.anInt160].anIntArray218);
			} else if (local6 != -1) {
				local332.method286(local6);
			}
			local332.method282((byte) 3);
			local332.anIntArrayArray8 = null;
			local332.anIntArrayArray7 = null;
			return local332;
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("76087, " + arg0 + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method47() {
		try {
			if (!this.aBoolean14) {
				return null;
			}
			@Pc(8) boolean local8 = false;
			for (@Pc(10) int local10 = 0; local10 < 12; local10++) {
				@Pc(17) int local17 = this.anIntArray9[local10];
				if (local17 >= 256 && local17 < 512 && !Class21.aClass21Array1[local17 - 256].method428()) {
					local8 = true;
				}
				if (local17 >= 512 && !Class13.method316(local17 - 512).method325(this.anInt183)) {
					local8 = true;
				}
			}
			if (local8) {
				return null;
			}
			@Pc(58) Class1_Sub1_Sub1_Sub5[] local58 = new Class1_Sub1_Sub1_Sub5[12];
			@Pc(65) int local65 = 0;
			for (@Pc(67) int local67 = 0; local67 < 12; local67++) {
				@Pc(74) int local74 = this.anIntArray9[local67];
				@Pc(88) Class1_Sub1_Sub1_Sub5 local88;
				if (local74 >= 256 && local74 < 512) {
					local88 = Class21.aClass21Array1[local74 - 256].method429((byte) 9);
					if (local88 != null) {
						local58[local65++] = local88;
					}
				}
				if (local74 >= 512) {
					local88 = Class13.method316(local74 - 512).method326(this.anInt183);
					if (local88 != null) {
						local58[local65++] = local88;
					}
				}
			}
			@Pc(125) Class1_Sub1_Sub1_Sub5 local125 = new Class1_Sub1_Sub1_Sub5(local65, false, local58);
			for (@Pc(127) int local127 = 0; local127 < 5; local127++) {
				if (this.anIntArray10[local127] != 0) {
					local125.method292(client.anIntArrayArray3[local127][0], client.anIntArrayArray3[local127][this.anIntArray10[local127]]);
					if (local127 == 1) {
						local125.method292(client.anIntArray42[0], client.anIntArray42[this.anIntArray10[local127]]);
					}
				}
			}
			return local125;
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("57125, " + 359 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method44() {
		try {
			return this.aBoolean14;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("59090, " + 0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}
}
