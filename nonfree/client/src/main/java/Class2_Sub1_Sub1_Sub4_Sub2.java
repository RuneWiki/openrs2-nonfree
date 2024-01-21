import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SOKVSBIO")
public final class Class2_Sub1_Sub1_Sub4_Sub2 extends Class2_Sub1_Sub1_Sub4 {

	@OriginalMember(owner = "client!SOKVSBIO", name = "xb", descriptor = "Lclient!THJKANXW;")
	public static Class36 aClass36_6 = new Class36(260, false);

	@OriginalMember(owner = "client!SOKVSBIO", name = "pb", descriptor = "J")
	private long aLong19;

	@OriginalMember(owner = "client!SOKVSBIO", name = "qb", descriptor = "I")
	public int anInt581;

	@OriginalMember(owner = "client!SOKVSBIO", name = "tb", descriptor = "I")
	public int anInt582;

	@OriginalMember(owner = "client!SOKVSBIO", name = "ub", descriptor = "I")
	public int anInt583;

	@OriginalMember(owner = "client!SOKVSBIO", name = "vb", descriptor = "I")
	public int anInt584;

	@OriginalMember(owner = "client!SOKVSBIO", name = "wb", descriptor = "Lclient!CYPZUKMB;")
	public Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!SOKVSBIO", name = "zb", descriptor = "I")
	private int anInt586;

	@OriginalMember(owner = "client!SOKVSBIO", name = "Ab", descriptor = "I")
	public int anInt587;

	@OriginalMember(owner = "client!SOKVSBIO", name = "Bb", descriptor = "I")
	public int anInt588;

	@OriginalMember(owner = "client!SOKVSBIO", name = "Cb", descriptor = "I")
	public int anInt589;

	@OriginalMember(owner = "client!SOKVSBIO", name = "Fb", descriptor = "Ljava/lang/String;")
	public String aString14;

	@OriginalMember(owner = "client!SOKVSBIO", name = "Gb", descriptor = "I")
	public int anInt590;

	@OriginalMember(owner = "client!SOKVSBIO", name = "Hb", descriptor = "Lclient!YGGALXYD;")
	public Class45 aClass45_2;

	@OriginalMember(owner = "client!SOKVSBIO", name = "Ib", descriptor = "I")
	public int anInt591;

	@OriginalMember(owner = "client!SOKVSBIO", name = "Jb", descriptor = "I")
	public int anInt592;

	@OriginalMember(owner = "client!SOKVSBIO", name = "Kb", descriptor = "I")
	public int anInt593;

	@OriginalMember(owner = "client!SOKVSBIO", name = "Lb", descriptor = "I")
	public int anInt594;

	@OriginalMember(owner = "client!SOKVSBIO", name = "Mb", descriptor = "I")
	public int anInt595;

	@OriginalMember(owner = "client!SOKVSBIO", name = "ob", descriptor = "Z")
	public boolean aBoolean143 = false;

	@OriginalMember(owner = "client!SOKVSBIO", name = "rb", descriptor = "Z")
	public boolean aBoolean144 = false;

	@OriginalMember(owner = "client!SOKVSBIO", name = "sb", descriptor = "[I")
	public int[] anIntArray148 = new int[12];

	@OriginalMember(owner = "client!SOKVSBIO", name = "yb", descriptor = "I")
	public int anInt585 = -1;

	@OriginalMember(owner = "client!SOKVSBIO", name = "Db", descriptor = "[I")
	public int[] anIntArray149 = new int[5];

	@OriginalMember(owner = "client!SOKVSBIO", name = "Eb", descriptor = "J")
	private long aLong20 = -1L;

	@OriginalMember(owner = "client!SOKVSBIO", name = "Nb", descriptor = "I")
	public int anInt596 = -1;

	@OriginalMember(owner = "client!SOKVSBIO", name = "Ob", descriptor = "I")
	private int anInt597 = 224;

	@OriginalMember(owner = "client!SOKVSBIO", name = "a", descriptor = "(Lclient!LBBVYYXO;I)V")
	public void method449(@OriginalArg(0) Class2_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			arg0.anInt283 = 0;
			this.anInt586 = arg0.method267();
			this.anInt596 = arg0.method268();
			this.anInt585 = arg0.method268();
			this.aClass45_2 = null;
			this.anInt590 = 0;
			@Pc(29) int local29;
			@Pc(41) int local41;
			@Pc(88) int local88;
			for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
				local29 = arg0.method267();
				if (local29 == 0) {
					this.anIntArray148[local24] = 0;
				} else {
					local41 = arg0.method267();
					this.anIntArray148[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray148[0] == 65535) {
						this.aClass45_2 = Class45.method516(arg0.method269());
						break;
					}
					if (this.anIntArray148[local24] >= 512 && this.anIntArray148[local24] - 512 < Class41.anInt647) {
						local88 = Class41.method495(this.anIntArray148[local24] - 512).anInt641;
						if (local88 != 0) {
							this.anInt590 = local88;
						}
					}
				}
			}
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg0.method267();
				if (local41 < 0 || local41 >= client.anIntArrayArray23[local29].length) {
					local41 = 0;
				}
				this.anIntArray149[local29] = local41;
			}
			super.anInt549 = arg0.method269();
			if (super.anInt549 == 65535) {
				super.anInt549 = -1;
			}
			super.anInt550 = arg0.method269();
			if (super.anInt550 == 65535) {
				super.anInt550 = -1;
			}
			super.anInt545 = arg0.method269();
			if (super.anInt545 == 65535) {
				super.anInt545 = -1;
			}
			super.anInt546 = arg0.method269();
			if (super.anInt546 == 65535) {
				super.anInt546 = -1;
			}
			super.anInt547 = arg0.method269();
			if (super.anInt547 == 65535) {
				super.anInt547 = -1;
			}
			super.anInt548 = arg0.method269();
			if (super.anInt548 == 65535) {
				super.anInt548 = -1;
			}
			super.anInt559 = arg0.method269();
			if (super.anInt559 == 65535) {
				super.anInt559 = -1;
			}
			this.aString14 = Class28.method350(Class28.method347(arg0.method273()));
			this.anInt581 = arg0.method267();
			this.anInt595 = arg0.method269();
			this.aBoolean143 = true;
			this.aLong19 = 0L;
			local41 = this.anIntArray148[5];
			local88 = this.anIntArray148[9];
			this.anIntArray148[5] = local88;
			this.anIntArray148[9] = local41;
			for (@Pc(245) int local245 = 0; local245 < 12; local245++) {
				this.aLong19 <<= 0x4;
				if (this.anIntArray148[local245] >= 256) {
					this.aLong19 += this.anIntArray148[local245] - 256;
				}
			}
			if (this.anIntArray148[0] >= 256) {
				this.aLong19 += this.anIntArray148[0] - 256 >> 4;
			}
			if (this.anIntArray148[1] >= 256) {
				this.aLong19 += this.anIntArray148[1] - 256 >> 8;
			}
			this.anIntArray148[5] = local41;
			if (arg1 > 0) {
				this.anIntArray148[9] = local88;
				for (@Pc(330) int local330 = 0; local330 < 5; local330++) {
					this.aLong19 <<= 0x3;
					this.aLong19 += this.anIntArray149[local330];
				}
				this.aLong19 <<= 0x1;
				this.aLong19 += this.anInt586;
			}
		} catch (@Pc(368) RuntimeException local368) {
			signlink.reporterror("13769, " + arg0 + ", " + arg1 + ", " + local368.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SOKVSBIO", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method446() {
		try {
			return this.aBoolean143;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("52998, " + 21781 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SOKVSBIO", name = "a", descriptor = "(Z)Lclient!CYPZUKMB;")
	private Class2_Sub1_Sub1_Sub2 method450() {
		try {
			if (this.aClass45_2 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt573 >= 0 && super.anInt576 == 0) {
					local6 = Class10.aClass10Array1[super.anInt573].anIntArray68[super.anInt574];
				} else if (super.anInt562 >= 0) {
					local6 = Class10.aClass10Array1[super.anInt562].anIntArray68[super.anInt563];
				}
				return this.aClass45_2.method510(-1, local6, null);
			}
			@Pc(48) long local48 = this.aLong19;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (super.anInt573 >= 0 && super.anInt576 == 0) {
				@Pc(67) Class10 local67 = Class10.aClass10Array1[super.anInt573];
				local50 = local67.anIntArray68[super.anInt574];
				if (super.anInt562 >= 0 && super.anInt562 != super.anInt549) {
					local52 = Class10.aClass10Array1[super.anInt562].anIntArray68[super.anInt563];
				}
				if (local67.anInt201 >= 0) {
					local54 = local67.anInt201;
					local48 += local54 - this.anIntArray148[5] << 8;
				}
				if (local67.anInt202 >= 0) {
					local56 = local67.anInt202;
					local48 += local56 - this.anIntArray148[3] << 16;
				}
			} else if (super.anInt562 >= 0) {
				local50 = Class10.aClass10Array1[super.anInt562].anIntArray68[super.anInt563];
			}
			@Pc(145) Class2_Sub1_Sub1_Sub2 local145 = (Class2_Sub1_Sub1_Sub2) aClass36_6.method456(local48);
			@Pc(151) int local151;
			@Pc(158) int local158;
			if (local145 == null) {
				@Pc(149) boolean local149 = false;
				for (local151 = 0; local151 < 12; local151++) {
					local158 = this.anIntArray148[local151];
					if (local56 >= 0 && local151 == 3) {
						local158 = local56;
					}
					if (local54 >= 0 && local151 == 5) {
						local158 = local54;
					}
					if (local158 >= 256 && local158 < 512 && !Class6.aClass6Array1[local158 - 256].method79()) {
						local149 = true;
					}
					if (local158 >= 512 && !Class41.method495(local158 - 512).method491(976, this.anInt586)) {
						local149 = true;
					}
				}
				if (local149) {
					if (this.aLong20 != -1L) {
						local145 = (Class2_Sub1_Sub1_Sub2) aClass36_6.method456(this.aLong20);
					}
					if (local145 == null) {
						return null;
					}
				}
			}
			if (local145 == null) {
				@Pc(228) Class2_Sub1_Sub1_Sub2[] local228 = new Class2_Sub1_Sub1_Sub2[12];
				local151 = 0;
				@Pc(239) int local239;
				for (local158 = 0; local158 < 12; local158++) {
					local239 = this.anIntArray148[local158];
					if (local56 >= 0 && local158 == 3) {
						local239 = local56;
					}
					if (local54 >= 0 && local158 == 5) {
						local239 = local54;
					}
					@Pc(267) Class2_Sub1_Sub1_Sub2 local267;
					if (local239 >= 256 && local239 < 512) {
						local267 = Class6.aClass6Array1[local239 - 256].method80();
						if (local267 != null) {
							local228[local151++] = local267;
						}
					}
					if (local239 >= 512) {
						local267 = Class41.method495(local239 - 512).method500(this.anInt586);
						if (local267 != null) {
							local228[local151++] = local267;
						}
					}
				}
				local145 = new Class2_Sub1_Sub1_Sub2(local228, 3, local151);
				for (local239 = 0; local239 < 5; local239++) {
					if (this.anIntArray149[local239] != 0) {
						local145.method105(client.anIntArrayArray23[local239][0], client.anIntArrayArray23[local239][this.anIntArray149[local239]]);
						if (local239 == 1) {
							local145.method105(client.anIntArray240[0], client.anIntArray240[this.anIntArray149[local239]]);
						}
					}
				}
				local145.method98();
				local145.method108(64, 850, -30, -50, -30, true);
				aClass36_6.method457(local48, local145);
				this.aLong20 = local48;
			}
			if (this.aBoolean144) {
				return local145;
			}
			@Pc(372) Class2_Sub1_Sub1_Sub2 local372 = Class2_Sub1_Sub1_Sub2.aClass2_Sub1_Sub1_Sub2_1;
			local372.method93(Class32.method374(local50) & Class32.method374(local52), local145);
			if (local50 != -1 && local52 != -1) {
				local372.method100(local50, local52, Class10.aClass10Array1[super.anInt573].anIntArray71);
			} else if (local50 != -1) {
				local372.method99(257, local50);
			}
			local372.method95();
			local372.anIntArrayArray6 = null;
			local372.anIntArrayArray5 = null;
			return local372;
		} catch (@Pc(426) RuntimeException local426) {
			signlink.reporterror("83390, " + true + ", " + local426.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SOKVSBIO", name = "b", descriptor = "(Z)Lclient!CYPZUKMB;")
	public Class2_Sub1_Sub1_Sub2 method451() {
		try {
			if (!this.aBoolean143) {
				return null;
			} else if (this.aClass45_2 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray148[local18];
					if (local25 >= 256 && local25 < 512 && !Class6.aClass6Array1[local25 - 256].method81()) {
						local16 = true;
					}
					if (local25 >= 512 && !Class41.method495(local25 - 512).method502(this.anInt586)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(66) Class2_Sub1_Sub1_Sub2[] local66 = new Class2_Sub1_Sub1_Sub2[12];
				@Pc(73) int local73 = 0;
				for (@Pc(75) int local75 = 0; local75 < 12; local75++) {
					@Pc(82) int local82 = this.anIntArray148[local75];
					@Pc(96) Class2_Sub1_Sub1_Sub2 local96;
					if (local82 >= 256 && local82 < 512) {
						local96 = Class6.aClass6Array1[local82 - 256].method82(709);
						if (local96 != null) {
							local66[local73++] = local96;
						}
					}
					if (local82 >= 512) {
						local96 = Class41.method495(local82 - 512).method490((byte) 9, this.anInt586);
						if (local96 != null) {
							local66[local73++] = local96;
						}
					}
				}
				@Pc(133) Class2_Sub1_Sub1_Sub2 local133 = new Class2_Sub1_Sub1_Sub2(local66, 3, local73);
				for (@Pc(135) int local135 = 0; local135 < 5; local135++) {
					if (this.anIntArray149[local135] != 0) {
						local133.method105(client.anIntArrayArray23[local135][0], client.anIntArrayArray23[local135][this.anIntArray149[local135]]);
						if (local135 == 1) {
							local133.method105(client.anIntArray240[0], client.anIntArray240[this.anIntArray149[local135]]);
						}
					}
				}
				return local133;
			} else {
				return this.aClass45_2.method512();
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("63286, " + true + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SOKVSBIO", name = "a", descriptor = "(B)Lclient!CYPZUKMB;")
	@Override
	protected Class2_Sub1_Sub1_Sub2 method455() {
		try {
			if (!this.aBoolean143) {
				return null;
			}
			@Pc(10) Class2_Sub1_Sub1_Sub2 local10 = this.method450();
			if (local10 == null) {
				return null;
			}
			super.anInt554 = local10.anInt599;
			local10.aBoolean33 = true;
			if (this.aBoolean144) {
				return local10;
			}
			if (super.anInt535 != -1 && super.anInt536 != -1) {
				@Pc(39) Class4 local39 = Class4.aClass4Array1[super.anInt535];
				@Pc(42) Class2_Sub1_Sub1_Sub2 local42 = local39.method19();
				if (local42 != null) {
					@Pc(56) Class2_Sub1_Sub1_Sub2 local56 = new Class2_Sub1_Sub1_Sub2(Class32.method374(super.anInt536), local42, false, false, true);
					local56.method104(0, -super.anInt539, 0);
					local56.method98();
					local56.method99(257, local39.aClass10_1.anIntArray68[super.anInt536]);
					local56.anIntArrayArray6 = null;
					local56.anIntArrayArray5 = null;
					if (local39.anInt44 != 128 || local39.anInt45 != 128) {
						local56.method107(local39.anInt44, local39.anInt45, local39.anInt44);
					}
					local56.method108(local39.anInt47 + 64, local39.anInt48 + 850, -30, -50, -30, true);
					@Pc(124) Class2_Sub1_Sub1_Sub2[] local124 = new Class2_Sub1_Sub1_Sub2[] { local10, local56 };
					local10 = new Class2_Sub1_Sub1_Sub2(153, true, 2, local124);
				}
			}
			if (this.aClass2_Sub1_Sub1_Sub2_2 != null) {
				if (client.anInt878 >= this.anInt589) {
					this.aClass2_Sub1_Sub1_Sub2_2 = null;
				}
				if (client.anInt878 >= this.anInt588 && client.anInt878 < this.anInt589) {
					@Pc(153) Class2_Sub1_Sub1_Sub2 local153 = this.aClass2_Sub1_Sub1_Sub2_2;
					local153.method104(this.anInt582 - super.anInt541, this.anInt583 - this.anInt587, this.anInt584 - super.anInt542);
					if (super.anInt551 == 512) {
						local153.method102();
						local153.method102();
						local153.method102();
					} else if (super.anInt551 == 1024) {
						local153.method102();
						local153.method102();
					} else if (super.anInt551 == 1536) {
						local153.method102();
					}
					@Pc(216) Class2_Sub1_Sub1_Sub2[] local216 = new Class2_Sub1_Sub1_Sub2[] { local10, local153 };
					local10 = new Class2_Sub1_Sub1_Sub2(153, true, 2, local216);
					if (super.anInt551 == 512) {
						local153.method102();
					} else if (super.anInt551 == 1024) {
						local153.method102();
						local153.method102();
					} else if (super.anInt551 == 1536) {
						local153.method102();
						local153.method102();
						local153.method102();
					}
					local153.method104(super.anInt541 - this.anInt582, this.anInt587 - this.anInt583, super.anInt542 - this.anInt584);
				}
			}
			local10.aBoolean33 = true;
			return local10;
		} catch (@Pc(289) RuntimeException local289) {
			signlink.reporterror("39618, " + -99 + ", " + local289.toString());
			throw new RuntimeException();
		}
	}
}
