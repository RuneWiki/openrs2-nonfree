import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SJUCHLXH")
public final class Class3_Sub1_Sub2_Sub1_Sub2 extends Class3_Sub1_Sub2_Sub1 {

	@OriginalMember(owner = "client!SJUCHLXH", name = "Cb", descriptor = "Lclient!WMYPWVZI;")
	public static Class43 aClass43_8 = new Class43(260, 267);

	@OriginalMember(owner = "client!SJUCHLXH", name = "vb", descriptor = "I")
	public int anInt574;

	@OriginalMember(owner = "client!SJUCHLXH", name = "wb", descriptor = "I")
	public int anInt575;

	@OriginalMember(owner = "client!SJUCHLXH", name = "xb", descriptor = "I")
	public int anInt576;

	@OriginalMember(owner = "client!SJUCHLXH", name = "zb", descriptor = "I")
	public int anInt577;

	@OriginalMember(owner = "client!SJUCHLXH", name = "Db", descriptor = "Lclient!WHKCNEXD;")
	public Class42 aClass42_2;

	@OriginalMember(owner = "client!SJUCHLXH", name = "Eb", descriptor = "I")
	public int anInt578;

	@OriginalMember(owner = "client!SJUCHLXH", name = "Fb", descriptor = "I")
	public int anInt579;

	@OriginalMember(owner = "client!SJUCHLXH", name = "Gb", descriptor = "I")
	public int anInt580;

	@OriginalMember(owner = "client!SJUCHLXH", name = "Hb", descriptor = "I")
	public int anInt581;

	@OriginalMember(owner = "client!SJUCHLXH", name = "Ib", descriptor = "I")
	public int anInt582;

	@OriginalMember(owner = "client!SJUCHLXH", name = "Jb", descriptor = "Ljava/lang/String;")
	public String aString13;

	@OriginalMember(owner = "client!SJUCHLXH", name = "Lb", descriptor = "I")
	private int anInt583;

	@OriginalMember(owner = "client!SJUCHLXH", name = "Nb", descriptor = "I")
	public int anInt585;

	@OriginalMember(owner = "client!SJUCHLXH", name = "Ob", descriptor = "I")
	public int anInt586;

	@OriginalMember(owner = "client!SJUCHLXH", name = "Pb", descriptor = "I")
	public int anInt587;

	@OriginalMember(owner = "client!SJUCHLXH", name = "Qb", descriptor = "Lclient!YABPKWWG;")
	public Class3_Sub1_Sub2_Sub6 aClass3_Sub1_Sub2_Sub6_1;

	@OriginalMember(owner = "client!SJUCHLXH", name = "Rb", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!SJUCHLXH", name = "Tb", descriptor = "I")
	public int anInt588;

	@OriginalMember(owner = "client!SJUCHLXH", name = "Ub", descriptor = "I")
	private int anInt589;

	@OriginalMember(owner = "client!SJUCHLXH", name = "Vb", descriptor = "I")
	public int anInt590;

	@OriginalMember(owner = "client!SJUCHLXH", name = "sb", descriptor = "I")
	private int anInt573 = 25292;

	@OriginalMember(owner = "client!SJUCHLXH", name = "tb", descriptor = "[I")
	public int[] anIntArray117 = new int[12];

	@OriginalMember(owner = "client!SJUCHLXH", name = "ub", descriptor = "Z")
	public boolean aBoolean176 = false;

	@OriginalMember(owner = "client!SJUCHLXH", name = "yb", descriptor = "Z")
	public boolean aBoolean177 = false;

	@OriginalMember(owner = "client!SJUCHLXH", name = "Ab", descriptor = "Z")
	private boolean aBoolean178 = true;

	@OriginalMember(owner = "client!SJUCHLXH", name = "Bb", descriptor = "B")
	private byte aByte15 = 1;

	@OriginalMember(owner = "client!SJUCHLXH", name = "Kb", descriptor = "J")
	private long aLong17 = -1L;

	@OriginalMember(owner = "client!SJUCHLXH", name = "Mb", descriptor = "I")
	private int anInt584 = 3;

	@OriginalMember(owner = "client!SJUCHLXH", name = "Sb", descriptor = "[I")
	public int[] anIntArray118 = new int[5];

	@OriginalMember(owner = "client!SJUCHLXH", name = "a", descriptor = "(ILclient!IMUIZRAF;)V")
	public void method388(@OriginalArg(1) Class3_Sub1_Sub3 arg0) {
		try {
			arg0.anInt243 = 0;
			this.anInt583 = arg0.method146();
			this.anInt577 = arg0.method146();
			this.aClass42_2 = null;
			this.anInt574 = 0;
			@Pc(25) int local25;
			@Pc(37) int local37;
			@Pc(84) int local84;
			for (@Pc(20) int local20 = 0; local20 < 12; local20++) {
				local25 = arg0.method146();
				if (local25 == 0) {
					this.anIntArray117[local20] = 0;
				} else {
					local37 = arg0.method146();
					this.anIntArray117[local20] = (local25 << 8) + local37;
					if (local20 == 0 && this.anIntArray117[0] == 65535) {
						this.aClass42_2 = Class42.method481(arg0.method148());
						break;
					}
					if (this.anIntArray117[local20] >= 512 && this.anIntArray117[local20] - 512 < Class34.anInt452) {
						local84 = Class34.method361(this.anIntArray117[local20] - 512).anInt453;
						if (local84 != 0) {
							this.anInt574 = local84;
						}
					}
				}
			}
			for (local25 = 0; local25 < 5; local25++) {
				local37 = arg0.method146();
				if (local37 < 0 || local37 >= client.anIntArrayArray22[local25].length) {
					local37 = 0;
				}
				this.anIntArray118[local25] = local37;
			}
			super.anInt567 = arg0.method148();
			if (super.anInt567 == 65535) {
				super.anInt567 = -1;
			}
			super.anInt568 = arg0.method148();
			if (super.anInt568 == 65535) {
				super.anInt568 = -1;
			}
			super.anInt553 = arg0.method148();
			if (super.anInt553 == 65535) {
				super.anInt553 = -1;
			}
			super.anInt554 = arg0.method148();
			if (super.anInt554 == 65535) {
				super.anInt554 = -1;
			}
			super.anInt555 = arg0.method148();
			if (super.anInt555 == 65535) {
				super.anInt555 = -1;
			}
			super.anInt556 = arg0.method148();
			if (super.anInt556 == 65535) {
				super.anInt556 = -1;
			}
			super.anInt566 = arg0.method148();
			if (super.anInt566 == 65535) {
				super.anInt566 = -1;
			}
			this.aString13 = Class23.method230(Class23.method227(arg0.method152()));
			this.anInt582 = arg0.method146();
			this.anInt590 = arg0.method148();
			this.aBoolean176 = true;
			this.aLong18 = 0L;
			for (local37 = 0; local37 < 12; local37++) {
				this.aLong18 <<= 0x4;
				if (this.anIntArray117[local37] >= 256) {
					this.aLong18 += this.anIntArray117[local37] - 256;
				}
			}
			if (this.anIntArray117[0] >= 256) {
				this.aLong18 += this.anIntArray117[0] - 256 >> 4;
			}
			if (this.anIntArray117[1] >= 256) {
				this.aLong18 += this.anIntArray117[1] - 256 >> 8;
			}
			for (local84 = 0; local84 < 5; local84++) {
				this.aLong18 <<= 0x3;
				this.aLong18 += this.anIntArray118[local84];
			}
			this.aLong18 <<= 0x1;
			this.aLong18 += this.anInt583;
		} catch (@Pc(340) RuntimeException local340) {
			signlink.reporterror("98709, " + 457 + ", " + arg0 + ", " + local340.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SJUCHLXH", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method387() {
		try {
			return this.aBoolean176;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("25001, " + 0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SJUCHLXH", name = "a", descriptor = "(B)Lclient!YABPKWWG;")
	public Class3_Sub1_Sub2_Sub6 method389() {
		try {
			if (!this.aBoolean176) {
				return null;
			} else if (this.aClass42_2 == null) {
				@Pc(16) boolean local16 = false;
				@Pc(22) int local22;
				if (this.aByte15 != 1) {
					for (local22 = 1; local22 > 0; local22++) {
					}
				}
				for (local22 = 0; local22 < 12; local22++) {
					@Pc(36) int local36 = this.anIntArray117[local22];
					if (local36 >= 256 && local36 < 512 && !Class4.aClass4Array1[local36 - 256].method63(this.anInt573)) {
						local16 = true;
					}
					if (local36 >= 512 && !Class34.method361(local36 - 512).method360(this.anInt583)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(78) Class3_Sub1_Sub2_Sub6[] local78 = new Class3_Sub1_Sub2_Sub6[12];
				@Pc(80) int local80 = 0;
				for (@Pc(82) int local82 = 0; local82 < 12; local82++) {
					@Pc(89) int local89 = this.anIntArray117[local82];
					@Pc(104) Class3_Sub1_Sub2_Sub6 local104;
					if (local89 >= 256 && local89 < 512) {
						local104 = Class4.aClass4Array1[local89 - 256].method64(this.anInt584);
						if (local104 != null) {
							local78[local80++] = local104;
						}
					}
					if (local89 >= 512) {
						local104 = Class34.method361(local89 - 512).method358(this.anInt583);
						if (local104 != null) {
							local78[local80++] = local104;
						}
					}
				}
				@Pc(141) Class3_Sub1_Sub2_Sub6 local141 = new Class3_Sub1_Sub2_Sub6(local78, true, local80);
				for (@Pc(143) int local143 = 0; local143 < 5; local143++) {
					if (this.anIntArray118[local143] != 0) {
						local141.method524(client.anIntArrayArray22[local143][0], client.anIntArrayArray22[local143][this.anIntArray118[local143]]);
						if (local143 == 1) {
							local141.method524(client.anIntArray252[0], client.anIntArray252[this.anIntArray118[local143]]);
						}
					}
				}
				return local141;
			} else {
				return this.aClass42_2.method482();
			}
		} catch (@Pc(186) RuntimeException local186) {
			signlink.reporterror("57156, " + 1 + ", " + local186.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SJUCHLXH", name = "a", descriptor = "(Z)Lclient!YABPKWWG;")
	@Override
	protected Class3_Sub1_Sub2_Sub6 method505() {
		try {
			if (!this.aBoolean176) {
				return null;
			}
			@Pc(10) Class3_Sub1_Sub2_Sub6 local10 = this.method390();
			if (local10 == null) {
				return null;
			}
			super.anInt539 = local10.anInt732;
			local10.aBoolean227 = true;
			if (this.aBoolean177) {
				return local10;
			}
			if (super.anInt561 != -1 && super.anInt562 != -1) {
				@Pc(48) Class7 local48 = Class7.aClass7Array1[super.anInt561];
				@Pc(51) Class3_Sub1_Sub2_Sub6 local51 = local48.method69();
				if (local51 != null) {
					@Pc(65) Class3_Sub1_Sub2_Sub6 local65 = new Class3_Sub1_Sub2_Sub6(660, local51, Class15.method125(super.anInt562), true, false);
					local65.method523(0, 0, -super.anInt565);
					local65.method517();
					local65.method518(598, local48.aClass49_1.anIntArray206[super.anInt562]);
					local65.anIntArrayArray18 = null;
					local65.anIntArrayArray17 = null;
					if (local48.anInt124 != 128 || local48.anInt125 != 128) {
						local65.method526(local48.anInt125, local48.anInt124, local48.anInt124);
					}
					local65.method527(local48.anInt127 + 64, local48.anInt128 + 850, -30, -50, -30, true);
					@Pc(133) Class3_Sub1_Sub2_Sub6[] local133 = new Class3_Sub1_Sub2_Sub6[] { local10, local65 };
					local10 = new Class3_Sub1_Sub2_Sub6(2, local133, 0, true);
				}
			}
			if (this.aClass3_Sub1_Sub2_Sub6_1 != null) {
				if (client.anInt1054 >= this.anInt576) {
					this.aClass3_Sub1_Sub2_Sub6_1 = null;
				}
				if (client.anInt1054 >= this.anInt575 && client.anInt1054 < this.anInt576) {
					@Pc(162) Class3_Sub1_Sub2_Sub6 local162 = this.aClass3_Sub1_Sub2_Sub6_1;
					local162.method523(this.anInt587 - super.anInt534, this.anInt585 - super.anInt533, this.anInt586 - this.anInt588);
					if (super.anInt572 == 512) {
						local162.method521();
						local162.method521();
						local162.method521();
					} else if (super.anInt572 == 1024) {
						local162.method521();
						local162.method521();
					} else if (super.anInt572 == 1536) {
						local162.method521();
					}
					@Pc(225) Class3_Sub1_Sub2_Sub6[] local225 = new Class3_Sub1_Sub2_Sub6[] { local10, local162 };
					local10 = new Class3_Sub1_Sub2_Sub6(2, local225, 0, true);
					if (super.anInt572 == 512) {
						local162.method521();
					} else if (super.anInt572 == 1024) {
						local162.method521();
						local162.method521();
					} else if (super.anInt572 == 1536) {
						local162.method521();
						local162.method521();
						local162.method521();
					}
					local162.method523(super.anInt534 - this.anInt587, super.anInt533 - this.anInt585, this.anInt588 - this.anInt586);
				}
			}
			local10.aBoolean227 = true;
			return local10;
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("63538, " + true + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SJUCHLXH", name = "c", descriptor = "(I)Lclient!YABPKWWG;")
	private Class3_Sub1_Sub2_Sub6 method390() {
		try {
			if (this.aClass42_2 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt526 >= 0 && super.anInt529 == 0) {
					local6 = Class49.aClass49Array1[super.anInt526].anIntArray206[super.anInt527];
				} else if (super.anInt549 >= 0) {
					local6 = Class49.aClass49Array1[super.anInt549].anIntArray206[super.anInt550];
				}
				return this.aClass42_2.method480(null, local6, -1);
			}
			@Pc(48) long local48 = this.aLong18;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (super.anInt526 >= 0 && super.anInt529 == 0) {
				@Pc(67) Class49 local67 = Class49.aClass49Array1[super.anInt526];
				local50 = local67.anIntArray206[super.anInt527];
				if (super.anInt549 >= 0 && super.anInt549 != super.anInt567) {
					local52 = Class49.aClass49Array1[super.anInt549].anIntArray206[super.anInt550];
				}
				if (local67.anInt789 >= 0) {
					local54 = local67.anInt789;
					local48 += local54 - this.anIntArray117[5] << 8;
				}
				if (local67.anInt790 >= 0) {
					local56 = local67.anInt790;
					local48 += local56 - this.anIntArray117[3] << 16;
				}
			} else if (super.anInt549 >= 0) {
				local50 = Class49.aClass49Array1[super.anInt549].anIntArray206[super.anInt550];
			}
			@Pc(145) Class3_Sub1_Sub2_Sub6 local145 = (Class3_Sub1_Sub2_Sub6) aClass43_8.method484(local48);
			@Pc(160) int local160;
			@Pc(167) int local167;
			if (local145 == null) {
				@Pc(158) boolean local158 = false;
				for (local160 = 0; local160 < 12; local160++) {
					local167 = this.anIntArray117[local160];
					if (local56 >= 0 && local160 == 3) {
						local167 = local56;
					}
					if (local54 >= 0 && local160 == 5) {
						local167 = local54;
					}
					if (local167 >= 256 && local167 < 512 && !Class4.aClass4Array1[local167 - 256].method61(989)) {
						local158 = true;
					}
					if (local167 >= 512 && !Class34.method361(local167 - 512).method363(this.anInt583)) {
						local158 = true;
					}
				}
				if (local158) {
					if (this.aLong17 != -1L) {
						local145 = (Class3_Sub1_Sub2_Sub6) aClass43_8.method484(this.aLong17);
					}
					if (local145 == null) {
						return null;
					}
				}
			}
			if (local145 == null) {
				@Pc(237) Class3_Sub1_Sub2_Sub6[] local237 = new Class3_Sub1_Sub2_Sub6[12];
				local160 = 0;
				@Pc(248) int local248;
				for (local167 = 0; local167 < 12; local167++) {
					local248 = this.anIntArray117[local167];
					if (local56 >= 0 && local167 == 3) {
						local248 = local56;
					}
					if (local54 >= 0 && local167 == 5) {
						local248 = local54;
					}
					@Pc(276) Class3_Sub1_Sub2_Sub6 local276;
					if (local248 >= 256 && local248 < 512) {
						local276 = Class4.aClass4Array1[local248 - 256].method62();
						if (local276 != null) {
							local237[local160++] = local276;
						}
					}
					if (local248 >= 512) {
						local276 = Class34.method361(local248 - 512).method366(this.anInt589, this.anInt583);
						if (local276 != null) {
							local237[local160++] = local276;
						}
					}
				}
				local145 = new Class3_Sub1_Sub2_Sub6(local237, true, local160);
				for (local248 = 0; local248 < 5; local248++) {
					if (this.anIntArray118[local248] != 0) {
						local145.method524(client.anIntArrayArray22[local248][0], client.anIntArrayArray22[local248][this.anIntArray118[local248]]);
						if (local248 == 1) {
							local145.method524(client.anIntArray252[0], client.anIntArray252[this.anIntArray118[local248]]);
						}
					}
				}
				local145.method517();
				local145.method527(64, 850, -30, -50, -30, true);
				aClass43_8.method485(local48, local145);
				this.aLong17 = local48;
			}
			if (this.aBoolean177) {
				return local145;
			}
			@Pc(382) Class3_Sub1_Sub2_Sub6 local382 = Class3_Sub1_Sub2_Sub6.aClass3_Sub1_Sub2_Sub6_2;
			local382.method512(local145, Class15.method125(local50) & Class15.method125(local52));
			if (local50 != -1 && local52 != -1) {
				local382.method519(Class49.aClass49Array1[super.anInt526].anIntArray209, local52, local50);
			} else if (local50 != -1) {
				local382.method518(598, local50);
			}
			local382.method514();
			local382.anIntArrayArray18 = null;
			local382.anIntArrayArray17 = null;
			return local382;
		} catch (@Pc(430) RuntimeException local430) {
			signlink.reporterror("6536, " + 0 + ", " + local430.toString());
			throw new RuntimeException();
		}
	}
}
