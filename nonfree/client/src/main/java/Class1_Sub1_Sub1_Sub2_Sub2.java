import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OTTYZSZE")
public final class Class1_Sub1_Sub1_Sub2_Sub2 extends Class1_Sub1_Sub1_Sub2 {

	@OriginalMember(owner = "client!OTTYZSZE", name = "Hb", descriptor = "Lclient!JLTMYUOM;")
	public static Class18 aClass18_4 = new Class18(true, 260);

	@OriginalMember(owner = "client!OTTYZSZE", name = "rb", descriptor = "I")
	public int anInt568;

	@OriginalMember(owner = "client!OTTYZSZE", name = "sb", descriptor = "I")
	public int anInt569;

	@OriginalMember(owner = "client!OTTYZSZE", name = "tb", descriptor = "I")
	public int anInt570;

	@OriginalMember(owner = "client!OTTYZSZE", name = "ub", descriptor = "I")
	public int anInt571;

	@OriginalMember(owner = "client!OTTYZSZE", name = "vb", descriptor = "I")
	public int anInt572;

	@OriginalMember(owner = "client!OTTYZSZE", name = "wb", descriptor = "Lclient!FUTAQMCE;")
	public Class1_Sub1_Sub1_Sub3 aClass1_Sub1_Sub1_Sub3_2;

	@OriginalMember(owner = "client!OTTYZSZE", name = "xb", descriptor = "Lclient!NHTDEVDA;")
	public Class27 aClass27_2;

	@OriginalMember(owner = "client!OTTYZSZE", name = "yb", descriptor = "I")
	public int anInt573;

	@OriginalMember(owner = "client!OTTYZSZE", name = "Ab", descriptor = "I")
	public int anInt574;

	@OriginalMember(owner = "client!OTTYZSZE", name = "Eb", descriptor = "I")
	private int anInt576;

	@OriginalMember(owner = "client!OTTYZSZE", name = "Fb", descriptor = "I")
	private int anInt577;

	@OriginalMember(owner = "client!OTTYZSZE", name = "Gb", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!OTTYZSZE", name = "Ib", descriptor = "Ljava/lang/String;")
	public String aString8;

	@OriginalMember(owner = "client!OTTYZSZE", name = "Mb", descriptor = "I")
	public int anInt578;

	@OriginalMember(owner = "client!OTTYZSZE", name = "Nb", descriptor = "I")
	public int anInt579;

	@OriginalMember(owner = "client!OTTYZSZE", name = "Ob", descriptor = "I")
	public int anInt580;

	@OriginalMember(owner = "client!OTTYZSZE", name = "Pb", descriptor = "I")
	public int anInt581;

	@OriginalMember(owner = "client!OTTYZSZE", name = "Qb", descriptor = "I")
	public int anInt582;

	@OriginalMember(owner = "client!OTTYZSZE", name = "Rb", descriptor = "I")
	public int anInt583;

	@OriginalMember(owner = "client!OTTYZSZE", name = "Tb", descriptor = "I")
	public int anInt584;

	@OriginalMember(owner = "client!OTTYZSZE", name = "zb", descriptor = "J")
	private long aLong17 = -1L;

	@OriginalMember(owner = "client!OTTYZSZE", name = "Bb", descriptor = "[I")
	public int[] anIntArray145 = new int[12];

	@OriginalMember(owner = "client!OTTYZSZE", name = "Cb", descriptor = "Z")
	public boolean aBoolean110 = false;

	@OriginalMember(owner = "client!OTTYZSZE", name = "Db", descriptor = "I")
	private int anInt575 = -39282;

	@OriginalMember(owner = "client!OTTYZSZE", name = "Jb", descriptor = "Z")
	public boolean aBoolean111 = false;

	@OriginalMember(owner = "client!OTTYZSZE", name = "Kb", descriptor = "[I")
	public int[] anIntArray146 = new int[5];

	@OriginalMember(owner = "client!OTTYZSZE", name = "Lb", descriptor = "B")
	private byte aByte24 = 87;

	@OriginalMember(owner = "client!OTTYZSZE", name = "Sb", descriptor = "Z")
	private boolean aBoolean112 = false;

	@OriginalMember(owner = "client!OTTYZSZE", name = "Ub", descriptor = "I")
	private int anInt585 = 6;

	@OriginalMember(owner = "client!OTTYZSZE", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method322() {
		try {
			return this.aBoolean111;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("52539, " + 6 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OTTYZSZE", name = "d", descriptor = "(I)Lclient!FUTAQMCE;")
	private Class1_Sub1_Sub1_Sub3 method325(@OriginalArg(0) int arg0) {
		try {
			if (this.aClass27_2 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt546 >= 0 && super.anInt549 == 0) {
					local6 = Class16.aClass16Array1[super.anInt546].anIntArray78[super.anInt547];
				} else if (super.anInt542 >= 0) {
					local6 = Class16.aClass16Array1[super.anInt542].anIntArray78[super.anInt543];
				}
				return this.aClass27_2.method293(null, -1, local6);
			}
			@Pc(48) long local48 = this.aLong18;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (super.anInt546 >= 0 && super.anInt549 == 0) {
				@Pc(67) Class16 local67 = Class16.aClass16Array1[super.anInt546];
				local50 = local67.anIntArray78[super.anInt547];
				if (super.anInt542 >= 0 && super.anInt542 != super.anInt529) {
					local52 = Class16.aClass16Array1[super.anInt542].anIntArray78[super.anInt543];
				}
				if (local67.anInt336 >= 0) {
					local54 = local67.anInt336;
					local48 += local54 - this.anIntArray145[5] << 8;
				}
				if (local67.anInt337 >= 0) {
					local56 = local67.anInt337;
					local48 += local56 - this.anIntArray145[3] << 16;
				}
			} else if (super.anInt542 >= 0) {
				local50 = Class16.aClass16Array1[super.anInt542].anIntArray78[super.anInt543];
			}
			@Pc(145) Class1_Sub1_Sub1_Sub3 local145 = (Class1_Sub1_Sub1_Sub3) aClass18_4.method216(local48);
			@Pc(151) int local151;
			@Pc(158) int local158;
			if (local145 == null) {
				@Pc(149) boolean local149 = false;
				for (local151 = 0; local151 < 12; local151++) {
					local158 = this.anIntArray145[local151];
					if (local56 >= 0 && local151 == 3) {
						local158 = local56;
					}
					if (local54 >= 0 && local151 == 5) {
						local158 = local54;
					}
					if (local158 >= 256 && local158 < 512 && !Class32.aClass32Array1[local158 - 256].method312()) {
						local149 = true;
					}
					if (local158 >= 512 && !Class5.method23(local158 - 512).method19((byte) 4, this.anInt577)) {
						local149 = true;
					}
				}
				if (local149) {
					if (this.aLong17 != -1L) {
						local145 = (Class1_Sub1_Sub1_Sub3) aClass18_4.method216(this.aLong17);
					}
					if (local145 == null) {
						return null;
					}
				}
			}
			if (local145 == null) {
				@Pc(228) Class1_Sub1_Sub1_Sub3[] local228 = new Class1_Sub1_Sub1_Sub3[12];
				local151 = 0;
				@Pc(239) int local239;
				for (local158 = 0; local158 < 12; local158++) {
					local239 = this.anIntArray145[local158];
					if (local56 >= 0 && local158 == 3) {
						local239 = local56;
					}
					if (local54 >= 0 && local158 == 5) {
						local239 = local54;
					}
					@Pc(267) Class1_Sub1_Sub1_Sub3 local267;
					if (local239 >= 256 && local239 < 512) {
						local267 = Class32.aClass32Array1[local239 - 256].method313(893);
						if (local267 != null) {
							local228[local151++] = local267;
						}
					}
					if (local239 >= 512) {
						local267 = Class5.method23(local239 - 512).method17(this.anInt577);
						if (local267 != null) {
							local228[local151++] = local267;
						}
					}
				}
				local145 = new Class1_Sub1_Sub1_Sub3(local151, 221, local228);
				for (local239 = 0; local239 < 5; local239++) {
					if (this.anIntArray146[local239] != 0) {
						local145.method196(client.anIntArrayArray25[local239][0], client.anIntArrayArray25[local239][this.anIntArray146[local239]]);
						if (local239 == 1) {
							local145.method196(client.anIntArray262[0], client.anIntArray262[this.anIntArray146[local239]]);
						}
					}
				}
				local145.method189(284);
				local145.method199(64, 850, -30, -50, -30, true);
				aClass18_4.method217(local48, local145);
				this.aLong17 = local48;
			}
			if (this.aBoolean110) {
				return local145;
			}
			@Pc(372) Class1_Sub1_Sub1_Sub3 local372 = Class1_Sub1_Sub1_Sub3.aClass1_Sub1_Sub1_Sub3_1;
			@Pc(376) boolean local376 = false;
			local372.method184(Class40.method367(local50) & Class40.method367(local52), this.anInt576, local145);
			if (local50 != -1 && local52 != -1) {
				local372.method191(Class16.aClass16Array1[super.anInt546].anIntArray81, local50, local52);
			} else if (local50 != -1) {
				local372.method190(local50);
			}
			local372.method186();
			local372.anIntArrayArray7 = null;
			local372.anIntArrayArray6 = null;
			return local372;
		} catch (@Pc(425) RuntimeException local425) {
			signlink.reporterror("50659, " + arg0 + ", " + local425.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OTTYZSZE", name = "a", descriptor = "(ZLclient!XJCNBMKS;)V")
	public void method326(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.anInt806 = 0;
			this.anInt577 = arg1.method498();
			this.anInt584 = arg1.method498();
			this.aClass27_2 = null;
			this.anInt574 = 0;
			@Pc(25) int local25;
			@Pc(37) int local37;
			@Pc(84) int local84;
			for (@Pc(20) int local20 = 0; local20 < 12; local20++) {
				local25 = arg1.method498();
				if (local25 == 0) {
					this.anIntArray145[local20] = 0;
				} else {
					local37 = arg1.method498();
					this.anIntArray145[local20] = (local25 << 8) + local37;
					if (local20 == 0 && this.anIntArray145[0] == 65535) {
						this.aClass27_2 = Class27.method294(arg1.method500());
						break;
					}
					if (this.anIntArray145[local20] >= 512 && this.anIntArray145[local20] - 512 < Class5.anInt39) {
						local84 = Class5.method23(this.anIntArray145[local20] - 512).anInt56;
						if (local84 != 0) {
							this.anInt574 = local84;
						}
					}
				}
			}
			for (local25 = 0; local25 < 5; local25++) {
				local37 = arg1.method498();
				if (local37 < 0 || local37 >= client.anIntArrayArray25[local25].length) {
					local37 = 0;
				}
				this.anIntArray146[local25] = local37;
			}
			super.anInt529 = arg1.method500();
			if (super.anInt529 == 65535) {
				super.anInt529 = -1;
			}
			super.anInt530 = arg1.method500();
			if (super.anInt530 == 65535) {
				super.anInt530 = -1;
			}
			super.anInt559 = arg1.method500();
			if (super.anInt559 == 65535) {
				super.anInt559 = -1;
			}
			super.anInt560 = arg1.method500();
			if (super.anInt560 == 65535) {
				super.anInt560 = -1;
			}
			super.anInt561 = arg1.method500();
			if (super.anInt561 == 65535) {
				super.anInt561 = -1;
			}
			super.anInt562 = arg1.method500();
			if (super.anInt562 == 65535) {
				super.anInt562 = -1;
			}
			super.anInt523 = arg1.method500();
			if (super.anInt523 == 65535) {
				super.anInt523 = -1;
			}
			this.aString8 = Class44.method452(Class44.method449(arg1.method504(), (byte) 7));
			this.anInt573 = arg1.method498();
			this.anInt582 = arg1.method500();
			this.aBoolean111 = true;
			this.aLong18 = 0L;
			if (!arg0) {
				this.aBoolean112 = !this.aBoolean112;
			}
			for (local37 = 0; local37 < 12; local37++) {
				this.aLong18 <<= 0x4;
				if (this.anIntArray145[local37] >= 256) {
					this.aLong18 += this.anIntArray145[local37] - 256;
				}
			}
			if (this.anIntArray145[0] >= 256) {
				this.aLong18 += this.anIntArray145[0] - 256 >> 4;
			}
			if (this.anIntArray145[1] >= 256) {
				this.aLong18 += this.anIntArray145[1] - 256 >> 8;
			}
			for (local84 = 0; local84 < 5; local84++) {
				this.aLong18 <<= 0x3;
				this.aLong18 += this.anIntArray146[local84];
			}
			this.aLong18 <<= 0x1;
			this.aLong18 += this.anInt577;
		} catch (@Pc(341) RuntimeException local341) {
			signlink.reporterror("77732, " + arg0 + ", " + arg1 + ", " + local341.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OTTYZSZE", name = "a", descriptor = "(Z)Lclient!FUTAQMCE;")
	public Class1_Sub1_Sub1_Sub3 method327() {
		try {
			if (!this.aBoolean111) {
				return null;
			} else if (this.aClass27_2 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
					@Pc(31) int local31 = this.anIntArray145[local24];
					if (local31 >= 256 && local31 < 512 && !Class32.aClass32Array1[local31 - 256].method314()) {
						local16 = true;
					}
					if (local31 >= 512 && !Class5.method23(local31 - 512).method26(this.anInt577, 190)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(72) Class1_Sub1_Sub1_Sub3[] local72 = new Class1_Sub1_Sub1_Sub3[12];
				@Pc(74) int local74 = 0;
				for (@Pc(76) int local76 = 0; local76 < 12; local76++) {
					@Pc(83) int local83 = this.anIntArray145[local76];
					@Pc(98) Class1_Sub1_Sub1_Sub3 local98;
					if (local83 >= 256 && local83 < 512) {
						local98 = Class32.aClass32Array1[local83 - 256].method315(this.aByte24);
						if (local98 != null) {
							local72[local74++] = local98;
						}
					}
					if (local83 >= 512) {
						local98 = Class5.method23(local83 - 512).method21(this.anInt577, this.anInt585);
						if (local98 != null) {
							local72[local74++] = local98;
						}
					}
				}
				@Pc(136) Class1_Sub1_Sub1_Sub3 local136 = new Class1_Sub1_Sub1_Sub3(local74, 221, local72);
				for (@Pc(138) int local138 = 0; local138 < 5; local138++) {
					if (this.anIntArray146[local138] != 0) {
						local136.method196(client.anIntArrayArray25[local138][0], client.anIntArrayArray25[local138][this.anIntArray146[local138]]);
						if (local138 == 1) {
							local136.method196(client.anIntArray262[0], client.anIntArray262[this.anIntArray146[local138]]);
						}
					}
				}
				return local136;
			} else {
				return this.aClass27_2.method292();
			}
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("62786, " + true + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OTTYZSZE", name = "a", descriptor = "(I)Lclient!FUTAQMCE;")
	@Override
	protected Class1_Sub1_Sub1_Sub3 method341() {
		try {
			if (!this.aBoolean111) {
				return null;
			}
			@Pc(10) Class1_Sub1_Sub1_Sub3 local10 = this.method325(291);
			if (local10 == null) {
				return null;
			}
			super.anInt554 = local10.anInt597;
			local10.aBoolean70 = true;
			if (this.aBoolean110) {
				return local10;
			}
			if (super.anInt524 != -1 && super.anInt525 != -1) {
				@Pc(39) Class48 local39 = Class48.aClass48Array1[super.anInt524];
				@Pc(42) Class1_Sub1_Sub1_Sub3 local42 = local39.method481();
				if (local42 != null) {
					@Pc(56) Class1_Sub1_Sub1_Sub3 local56 = new Class1_Sub1_Sub1_Sub3(local42, false, (byte) 2, true, Class40.method367(super.anInt525));
					local56.method195(0, -super.anInt528, 292, 0);
					local56.method189(284);
					local56.method190(local39.aClass16_2.anIntArray78[super.anInt525]);
					local56.anIntArrayArray7 = null;
					local56.anIntArrayArray6 = null;
					if (local39.anInt785 != 128 || local39.anInt786 != 128) {
						local56.method198(local39.anInt785, local39.anInt786, local39.anInt785);
					}
					local56.method199(local39.anInt788 + 64, local39.anInt789 + 850, -30, -50, -30, true);
					@Pc(124) Class1_Sub1_Sub1_Sub3[] local124 = new Class1_Sub1_Sub1_Sub3[] { local10, local56 };
					local10 = new Class1_Sub1_Sub1_Sub3(2, false, local124, true);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub3_2 != null) {
				if (client.anInt987 >= this.anInt569) {
					this.aClass1_Sub1_Sub1_Sub3_2 = null;
				}
				if (client.anInt987 >= this.anInt568 && client.anInt987 < this.anInt569) {
					@Pc(153) Class1_Sub1_Sub1_Sub3 local153 = this.aClass1_Sub1_Sub1_Sub3_2;
					local153.method195(this.anInt572 - super.anInt565, this.anInt571 - this.anInt583, 292, this.anInt570 - super.anInt564);
					if (super.anInt545 == 512) {
						local153.method193();
						local153.method193();
						local153.method193();
					} else if (super.anInt545 == 1024) {
						local153.method193();
						local153.method193();
					} else if (super.anInt545 == 1536) {
						local153.method193();
					}
					@Pc(216) Class1_Sub1_Sub1_Sub3[] local216 = new Class1_Sub1_Sub1_Sub3[] { local10, local153 };
					local10 = new Class1_Sub1_Sub1_Sub3(2, false, local216, true);
					if (super.anInt545 == 512) {
						local153.method193();
					} else if (super.anInt545 == 1024) {
						local153.method193();
						local153.method193();
					} else if (super.anInt545 == 1536) {
						local153.method193();
						local153.method193();
						local153.method193();
					}
					local153.method195(super.anInt565 - this.anInt572, this.anInt583 - this.anInt571, 292, super.anInt564 - this.anInt570);
				}
			}
			local10.aBoolean70 = true;
			if (this.anInt575 != -39282) {
				for (@Pc(285) int local285 = 1; local285 > 0; local285++) {
				}
			}
			return local10;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("82921, " + -39282 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}
}
