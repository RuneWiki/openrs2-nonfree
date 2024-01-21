import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BSQIIHOT")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!BSQIIHOT", name = "rb", descriptor = "Lclient!WUMSOEQS;")
	public static Class46 aClass46_3 = new Class46((byte) 5, 260);

	@OriginalMember(owner = "client!BSQIIHOT", name = "sb", descriptor = "I")
	public int anInt242;

	@OriginalMember(owner = "client!BSQIIHOT", name = "ub", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!BSQIIHOT", name = "wb", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!BSQIIHOT", name = "yb", descriptor = "J")
	private long aLong10;

	@OriginalMember(owner = "client!BSQIIHOT", name = "Bb", descriptor = "I")
	public int anInt245;

	@OriginalMember(owner = "client!BSQIIHOT", name = "Db", descriptor = "I")
	public int anInt246;

	@OriginalMember(owner = "client!BSQIIHOT", name = "Eb", descriptor = "I")
	public int anInt247;

	@OriginalMember(owner = "client!BSQIIHOT", name = "Fb", descriptor = "I")
	public int anInt248;

	@OriginalMember(owner = "client!BSQIIHOT", name = "Gb", descriptor = "Lclient!PDVZPZLT;")
	public Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!BSQIIHOT", name = "Hb", descriptor = "I")
	public int anInt249;

	@OriginalMember(owner = "client!BSQIIHOT", name = "Ib", descriptor = "I")
	public int anInt250;

	@OriginalMember(owner = "client!BSQIIHOT", name = "Kb", descriptor = "I")
	public int anInt251;

	@OriginalMember(owner = "client!BSQIIHOT", name = "Mb", descriptor = "I")
	public int anInt253;

	@OriginalMember(owner = "client!BSQIIHOT", name = "Nb", descriptor = "I")
	public int anInt254;

	@OriginalMember(owner = "client!BSQIIHOT", name = "Ob", descriptor = "I")
	public int anInt255;

	@OriginalMember(owner = "client!BSQIIHOT", name = "Pb", descriptor = "I")
	public int anInt256;

	@OriginalMember(owner = "client!BSQIIHOT", name = "Qb", descriptor = "I")
	public int anInt257;

	@OriginalMember(owner = "client!BSQIIHOT", name = "Sb", descriptor = "Lclient!LQFHJGYA;")
	public Class21 aClass21_2;

	@OriginalMember(owner = "client!BSQIIHOT", name = "pb", descriptor = "I")
	public int anInt241 = -1;

	@OriginalMember(owner = "client!BSQIIHOT", name = "qb", descriptor = "Z")
	public boolean aBoolean34 = false;

	@OriginalMember(owner = "client!BSQIIHOT", name = "tb", descriptor = "Z")
	public boolean aBoolean35 = false;

	@OriginalMember(owner = "client!BSQIIHOT", name = "vb", descriptor = "[I")
	public int[] anIntArray30 = new int[12];

	@OriginalMember(owner = "client!BSQIIHOT", name = "xb", descriptor = "[I")
	public int[] anIntArray31 = new int[5];

	@OriginalMember(owner = "client!BSQIIHOT", name = "zb", descriptor = "Z")
	private boolean aBoolean36 = true;

	@OriginalMember(owner = "client!BSQIIHOT", name = "Ab", descriptor = "I")
	public int anInt244 = -1;

	@OriginalMember(owner = "client!BSQIIHOT", name = "Cb", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!BSQIIHOT", name = "Jb", descriptor = "J")
	private long aLong11 = -1L;

	@OriginalMember(owner = "client!BSQIIHOT", name = "Lb", descriptor = "I")
	private int anInt252 = 587;

	@OriginalMember(owner = "client!BSQIIHOT", name = "Rb", descriptor = "I")
	private int anInt258 = 503;

	@OriginalMember(owner = "client!BSQIIHOT", name = "a", descriptor = "(Z)Lclient!PDVZPZLT;")
	private Class1_Sub1_Sub1_Sub4 method114() {
		try {
			if (this.aClass21_2 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt226 >= 0 && super.anInt229 == 0) {
					local6 = Class19.aClass19Array1[super.anInt226].anIntArray82[super.anInt227];
				} else if (super.anInt237 >= 0) {
					local6 = Class19.aClass19Array1[super.anInt237].anIntArray82[super.anInt238];
				}
				return this.aClass21_2.method252(null, local6, -1);
			}
			@Pc(48) long local48 = this.aLong10;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (super.anInt226 >= 0 && super.anInt229 == 0) {
				@Pc(67) Class19 local67 = Class19.aClass19Array1[super.anInt226];
				local50 = local67.anIntArray82[super.anInt227];
				if (super.anInt237 >= 0 && super.anInt237 != super.anInt235) {
					local52 = Class19.aClass19Array1[super.anInt237].anIntArray82[super.anInt238];
				}
				if (local67.anInt414 >= 0) {
					local54 = local67.anInt414;
					local48 += local54 - this.anIntArray30[5] << 8;
				}
				if (local67.anInt415 >= 0) {
					local56 = local67.anInt415;
					local48 += local56 - this.anIntArray30[3] << 16;
				}
			} else if (super.anInt237 >= 0) {
				local50 = Class19.aClass19Array1[super.anInt237].anIntArray82[super.anInt238];
			}
			@Pc(145) Class1_Sub1_Sub1_Sub4 local145 = (Class1_Sub1_Sub1_Sub4) aClass46_3.method557(local48);
			@Pc(151) int local151;
			@Pc(158) int local158;
			if (local145 == null) {
				@Pc(149) boolean local149 = false;
				for (local151 = 0; local151 < 12; local151++) {
					local158 = this.anIntArray30[local151];
					if (local56 >= 0 && local151 == 3) {
						local158 = local56;
					}
					if (local54 >= 0 && local151 == 5) {
						local158 = local54;
					}
					if (local158 >= 256 && local158 < 512 && !Class24.aClass24Array1[local158 - 256].method272()) {
						local149 = true;
					}
					if (local158 >= 512 && !Class3.method34(local158 - 512).method38(this.anInt243)) {
						local149 = true;
					}
				}
				if (local149) {
					if (this.aLong11 != -1L) {
						local145 = (Class1_Sub1_Sub1_Sub4) aClass46_3.method557(this.aLong11);
					}
					if (local145 == null) {
						return null;
					}
				}
			}
			if (local145 == null) {
				@Pc(228) Class1_Sub1_Sub1_Sub4[] local228 = new Class1_Sub1_Sub1_Sub4[12];
				local151 = 0;
				@Pc(239) int local239;
				for (local158 = 0; local158 < 12; local158++) {
					local239 = this.anIntArray30[local158];
					if (local56 >= 0 && local158 == 3) {
						local239 = local56;
					}
					if (local54 >= 0 && local158 == 5) {
						local239 = local54;
					}
					@Pc(267) Class1_Sub1_Sub1_Sub4 local267;
					if (local239 >= 256 && local239 < 512) {
						local267 = Class24.aClass24Array1[local239 - 256].method273();
						if (local267 != null) {
							local228[local151++] = local267;
						}
					}
					if (local239 >= 512) {
						local267 = Class3.method34(local239 - 512).method29(this.anInt243);
						if (local267 != null) {
							local228[local151++] = local267;
						}
					}
				}
				local145 = new Class1_Sub1_Sub1_Sub4(local228, local151, 0);
				for (local239 = 0; local239 < 5; local239++) {
					if (this.anIntArray31[local239] != 0) {
						local145.method377(client.anIntArrayArray24[local239][0], client.anIntArrayArray24[local239][this.anIntArray31[local239]]);
						if (local239 == 1) {
							local145.method377(client.anIntArray250[0], client.anIntArray250[this.anIntArray31[local239]]);
						}
					}
				}
				local145.method370();
				local145.method380(64, 850, -30, -50, -30, true);
				aClass46_3.method558(local48, local145);
				this.aLong11 = local48;
			}
			if (this.aBoolean35) {
				return local145;
			}
			@Pc(372) Class1_Sub1_Sub1_Sub4 local372 = Class1_Sub1_Sub1_Sub4.aClass1_Sub1_Sub1_Sub4_2;
			local372.method365(Class49.method573(local50) & Class49.method573(local52), local145);
			if (local50 != -1 && local52 != -1) {
				local372.method372(local50, local52, Class19.aClass19Array1[super.anInt226].anIntArray85);
			} else if (local50 != -1) {
				local372.method371(local50);
			}
			local372.method367();
			local372.anIntArrayArray12 = null;
			local372.anIntArrayArray11 = null;
			return local372;
		} catch (@Pc(430) RuntimeException local430) {
			signlink.reporterror("53174, " + false + ", " + local430.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSQIIHOT", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method112(@OriginalArg(0) byte arg0) {
		try {
			return this.aBoolean34;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("24675, " + 9 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSQIIHOT", name = "a", descriptor = "(I)Lclient!PDVZPZLT;")
	public Class1_Sub1_Sub1_Sub4 method115() {
		try {
			if (!this.aBoolean34) {
				return null;
			} else if (this.aClass21_2 == null) {
				@Pc(17) boolean local17 = false;
				for (@Pc(19) int local19 = 0; local19 < 12; local19++) {
					@Pc(26) int local26 = this.anIntArray30[local19];
					if (local26 >= 256 && local26 < 512 && !Class24.aClass24Array1[local26 - 256].method274(319)) {
						local17 = true;
					}
					if (local26 >= 512 && !Class3.method34(local26 - 512).method39(this.anInt243, this.anInt258)) {
						local17 = true;
					}
				}
				if (local17) {
					return null;
				}
				@Pc(68) Class1_Sub1_Sub1_Sub4[] local68 = new Class1_Sub1_Sub1_Sub4[12];
				@Pc(70) int local70 = 0;
				for (@Pc(72) int local72 = 0; local72 < 12; local72++) {
					@Pc(79) int local79 = this.anIntArray30[local72];
					@Pc(93) Class1_Sub1_Sub1_Sub4 local93;
					if (local79 >= 256 && local79 < 512) {
						local93 = Class24.aClass24Array1[local79 - 256].method275();
						if (local93 != null) {
							local68[local70++] = local93;
						}
					}
					if (local79 >= 512) {
						local93 = Class3.method34(local79 - 512).method32(this.anInt243);
						if (local93 != null) {
							local68[local70++] = local93;
						}
					}
				}
				@Pc(137) Class1_Sub1_Sub1_Sub4 local137 = new Class1_Sub1_Sub1_Sub4(local68, local70, 0);
				for (@Pc(139) int local139 = 0; local139 < 5; local139++) {
					if (this.anIntArray31[local139] != 0) {
						local137.method377(client.anIntArrayArray24[local139][0], client.anIntArrayArray24[local139][this.anIntArray31[local139]]);
						if (local139 == 1) {
							local137.method377(client.anIntArray250[0], client.anIntArray250[this.anIntArray31[local139]]);
						}
					}
				}
				return local137;
			} else {
				return this.aClass21_2.method256(this.anInt252);
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("83177, " + 38010 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSQIIHOT", name = "a", descriptor = "(Lclient!MVHXDWGI;I)V")
	public void method116(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		try {
			arg0.anInt529 = 0;
			this.anInt243 = arg0.method294();
			this.anInt241 = arg0.method295();
			this.anInt244 = arg0.method295();
			this.aClass21_2 = null;
			this.anInt245 = 0;
			@Pc(29) int local29;
			@Pc(41) int local41;
			@Pc(88) int local88;
			for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
				local29 = arg0.method294();
				if (local29 == 0) {
					this.anIntArray30[local24] = 0;
				} else {
					local41 = arg0.method294();
					this.anIntArray30[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray30[0] == 65535) {
						this.aClass21_2 = Class21.method250(arg0.method296());
						break;
					}
					if (this.anIntArray30[local24] >= 512 && this.anIntArray30[local24] - 512 < Class3.anInt134) {
						local88 = Class3.method34(this.anIntArray30[local24] - 512).anInt135;
						if (local88 != 0) {
							this.anInt245 = local88;
						}
					}
				}
			}
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg0.method294();
				if (local41 < 0 || local41 >= client.anIntArrayArray24[local29].length) {
					local41 = 0;
				}
				this.anIntArray31[local29] = local41;
			}
			super.anInt235 = arg0.method296();
			if (super.anInt235 == 65535) {
				super.anInt235 = -1;
			}
			super.anInt236 = arg0.method296();
			if (super.anInt236 == 65535) {
				super.anInt236 = -1;
			}
			super.anInt212 = arg0.method296();
			if (super.anInt212 == 65535) {
				super.anInt212 = -1;
			}
			super.anInt213 = arg0.method296();
			if (super.anInt213 == 65535) {
				super.anInt213 = -1;
			}
			super.anInt214 = arg0.method296();
			if (super.anInt214 == 65535) {
				super.anInt214 = -1;
			}
			super.anInt215 = arg0.method296();
			if (super.anInt215 == 65535) {
				super.anInt215 = -1;
			}
			super.anInt222 = arg0.method296();
			if (super.anInt222 == 65535) {
				super.anInt222 = -1;
			}
			this.aString5 = Class41.method508(Class41.method505(arg0.method300()));
			this.anInt251 = arg0.method294();
			this.anInt253 = arg0.method296();
			this.aBoolean34 = true;
			this.aLong10 = 0L;
			local41 = this.anIntArray30[5];
			local88 = this.anIntArray30[9];
			this.anIntArray30[5] = local88;
			this.anIntArray30[9] = local41;
			for (@Pc(249) int local249 = 0; local249 < 12; local249++) {
				this.aLong10 <<= 0x4;
				if (this.anIntArray30[local249] >= 256) {
					this.aLong10 += this.anIntArray30[local249] - 256;
				}
			}
			if (this.anIntArray30[0] >= 256) {
				this.aLong10 += this.anIntArray30[0] - 256 >> 4;
			}
			if (this.anIntArray30[1] >= 256) {
				this.aLong10 += this.anIntArray30[1] - 256 >> 8;
			}
			this.anIntArray30[5] = local41;
			this.anIntArray30[9] = local88;
			for (@Pc(331) int local331 = 0; local331 < 5; local331++) {
				this.aLong10 <<= 0x3;
				this.aLong10 += this.anIntArray31[local331];
			}
			this.aLong10 <<= 0x1;
			this.aLong10 += this.anInt243;
		} catch (@Pc(369) RuntimeException local369) {
			signlink.reporterror("46942, " + arg0 + ", " + -46903 + ", " + local369.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSQIIHOT", name = "a", descriptor = "(B)Lclient!PDVZPZLT;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method497(@OriginalArg(0) byte arg0) {
		try {
			if (!this.aBoolean34) {
				return null;
			}
			@Pc(10) Class1_Sub1_Sub1_Sub4 local10 = this.method114();
			if (local10 == null) {
				return null;
			}
			super.anInt194 = local10.anInt706;
			local10.aBoolean125 = true;
			if (this.aBoolean35) {
				return local10;
			}
			if (super.anInt199 != -1 && super.anInt200 != -1) {
				@Pc(39) Class25 local39 = Class25.aClass25Array1[super.anInt199];
				@Pc(42) Class1_Sub1_Sub1_Sub4 local42 = local39.method278();
				if (local42 != null) {
					@Pc(56) Class1_Sub1_Sub1_Sub4 local56 = new Class1_Sub1_Sub1_Sub4(local42, true, Class49.method573(super.anInt200), 0, false);
					local56.method376(0, -super.anInt203, 0);
					local56.method370();
					local56.method371(local39.aClass19_1.anIntArray82[super.anInt200]);
					local56.anIntArrayArray12 = null;
					local56.anIntArrayArray11 = null;
					if (local39.anInt473 != 128 || local39.anInt474 != 128) {
						local56.method379(local39.anInt473, local39.anInt474, local39.anInt473);
					}
					local56.method380(local39.anInt476 + 64, local39.anInt477 + 850, -30, -50, -30, true);
					@Pc(124) Class1_Sub1_Sub1_Sub4[] local124 = new Class1_Sub1_Sub1_Sub4[] { local10, local56 };
					local10 = new Class1_Sub1_Sub1_Sub4(7, local124, true, 2);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub4_1 != null) {
				if (client.anInt1007 >= this.anInt250) {
					this.aClass1_Sub1_Sub1_Sub4_1 = null;
				}
				if (client.anInt1007 >= this.anInt249 && client.anInt1007 < this.anInt250) {
					@Pc(153) Class1_Sub1_Sub1_Sub4 local153 = this.aClass1_Sub1_Sub1_Sub4_1;
					local153.method376(this.anInt248 - super.anInt232, this.anInt247 - this.anInt242, this.anInt246 - super.anInt231);
					if (super.anInt221 == 512) {
						local153.method374();
						local153.method374();
						local153.method374();
					} else if (super.anInt221 == 1024) {
						local153.method374();
						local153.method374();
					} else if (super.anInt221 == 1536) {
						local153.method374();
					}
					@Pc(216) Class1_Sub1_Sub1_Sub4[] local216 = new Class1_Sub1_Sub1_Sub4[] { local10, local153 };
					local10 = new Class1_Sub1_Sub1_Sub4(7, local216, true, 2);
					if (super.anInt221 == 512) {
						local153.method374();
					} else if (super.anInt221 == 1024) {
						local153.method374();
						local153.method374();
					} else if (super.anInt221 == 1536) {
						local153.method374();
						local153.method374();
						local153.method374();
					}
					local153.method376(super.anInt232 - this.anInt248, this.anInt242 - this.anInt247, super.anInt231 - this.anInt246);
				}
			}
			local10.aBoolean125 = true;
			return local10;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("57086, " + 6 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}
}
