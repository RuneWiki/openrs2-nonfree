import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MVRUIIXW")
public final class Class2_Sub1_Sub3_Sub2_Sub2 extends Class2_Sub1_Sub3_Sub2 {

	@OriginalMember(owner = "client!MVRUIIXW", name = "zb", descriptor = "Lclient!ACKKZISC;")
	public static Class1 aClass1_4 = new Class1(false, 260);

	@OriginalMember(owner = "client!MVRUIIXW", name = "ob", descriptor = "I")
	public int anInt423;

	@OriginalMember(owner = "client!MVRUIIXW", name = "pb", descriptor = "I")
	public int anInt424;

	@OriginalMember(owner = "client!MVRUIIXW", name = "qb", descriptor = "I")
	public int anInt425;

	@OriginalMember(owner = "client!MVRUIIXW", name = "rb", descriptor = "I")
	public int anInt426;

	@OriginalMember(owner = "client!MVRUIIXW", name = "sb", descriptor = "Lclient!WRJMHIDY;")
	public Class2_Sub1_Sub3_Sub5 aClass2_Sub1_Sub3_Sub5_1;

	@OriginalMember(owner = "client!MVRUIIXW", name = "ub", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "client!MVRUIIXW", name = "wb", descriptor = "I")
	private int anInt427;

	@OriginalMember(owner = "client!MVRUIIXW", name = "yb", descriptor = "I")
	private int anInt429;

	@OriginalMember(owner = "client!MVRUIIXW", name = "Cb", descriptor = "I")
	public int anInt430;

	@OriginalMember(owner = "client!MVRUIIXW", name = "Db", descriptor = "I")
	public int anInt431;

	@OriginalMember(owner = "client!MVRUIIXW", name = "Eb", descriptor = "I")
	public int anInt432;

	@OriginalMember(owner = "client!MVRUIIXW", name = "Fb", descriptor = "I")
	public int anInt433;

	@OriginalMember(owner = "client!MVRUIIXW", name = "Lb", descriptor = "I")
	public int anInt437;

	@OriginalMember(owner = "client!MVRUIIXW", name = "Mb", descriptor = "I")
	public int anInt438;

	@OriginalMember(owner = "client!MVRUIIXW", name = "Nb", descriptor = "I")
	public int anInt439;

	@OriginalMember(owner = "client!MVRUIIXW", name = "Ob", descriptor = "I")
	public int anInt440;

	@OriginalMember(owner = "client!MVRUIIXW", name = "Pb", descriptor = "Lclient!EKQCVRVG;")
	public Class10 aClass10_2;

	@OriginalMember(owner = "client!MVRUIIXW", name = "Sb", descriptor = "I")
	public int anInt441;

	@OriginalMember(owner = "client!MVRUIIXW", name = "Tb", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!MVRUIIXW", name = "tb", descriptor = "Z")
	public boolean aBoolean104 = false;

	@OriginalMember(owner = "client!MVRUIIXW", name = "vb", descriptor = "Z")
	private boolean aBoolean105 = true;

	@OriginalMember(owner = "client!MVRUIIXW", name = "xb", descriptor = "I")
	private int anInt428 = -289;

	@OriginalMember(owner = "client!MVRUIIXW", name = "Ab", descriptor = "J")
	private long aLong17 = -1L;

	@OriginalMember(owner = "client!MVRUIIXW", name = "Bb", descriptor = "Z")
	private boolean aBoolean106 = true;

	@OriginalMember(owner = "client!MVRUIIXW", name = "Gb", descriptor = "I")
	private int anInt434 = 5;

	@OriginalMember(owner = "client!MVRUIIXW", name = "Hb", descriptor = "[I")
	public int[] anIntArray95 = new int[5];

	@OriginalMember(owner = "client!MVRUIIXW", name = "Ib", descriptor = "I")
	public int anInt435 = -1;

	@OriginalMember(owner = "client!MVRUIIXW", name = "Jb", descriptor = "Z")
	private boolean aBoolean107 = true;

	@OriginalMember(owner = "client!MVRUIIXW", name = "Kb", descriptor = "I")
	public int anInt436 = -1;

	@OriginalMember(owner = "client!MVRUIIXW", name = "Qb", descriptor = "Z")
	public boolean aBoolean108 = false;

	@OriginalMember(owner = "client!MVRUIIXW", name = "Rb", descriptor = "[I")
	public int[] anIntArray96 = new int[12];

	@OriginalMember(owner = "client!MVRUIIXW", name = "Ub", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!MVRUIIXW", name = "Vb", descriptor = "Z")
	private boolean aBoolean110 = true;

	@OriginalMember(owner = "client!MVRUIIXW", name = "b", descriptor = "(I)Lclient!WRJMHIDY;")
	public Class2_Sub1_Sub3_Sub5 method252() {
		try {
			if (!this.aBoolean108) {
				return null;
			} else if (this.aClass10_2 == null) {
				@Pc(28) boolean local28 = false;
				for (@Pc(30) int local30 = 0; local30 < 12; local30++) {
					@Pc(37) int local37 = this.anIntArray96[local30];
					if (local37 >= 256 && local37 < 512 && !Class24.aClass24Array1[local37 - 256].method241()) {
						local28 = true;
					}
					if (local37 >= 512 && !Class34.method385(local37 - 512).method389(this.anInt427)) {
						local28 = true;
					}
				}
				if (local28) {
					return null;
				}
				@Pc(78) Class2_Sub1_Sub3_Sub5[] local78 = new Class2_Sub1_Sub3_Sub5[12];
				@Pc(80) int local80 = 0;
				for (@Pc(82) int local82 = 0; local82 < 12; local82++) {
					@Pc(89) int local89 = this.anIntArray96[local82];
					@Pc(103) Class2_Sub1_Sub3_Sub5 local103;
					if (local89 >= 256 && local89 < 512) {
						local103 = Class24.aClass24Array1[local89 - 256].method242();
						if (local103 != null) {
							local78[local80++] = local103;
						}
					}
					if (local89 >= 512) {
						local103 = Class34.method385(local89 - 512).method380(this.anInt427);
						if (local103 != null) {
							local78[local80++] = local103;
						}
					}
				}
				@Pc(141) Class2_Sub1_Sub3_Sub5 local141 = new Class2_Sub1_Sub3_Sub5(local78, local80, this.aBoolean107);
				for (@Pc(143) int local143 = 0; local143 < 5; local143++) {
					if (this.anIntArray95[local143] != 0) {
						local141.method437(client.anIntArrayArray23[local143][0], client.anIntArrayArray23[local143][this.anIntArray95[local143]]);
						if (local143 == 1) {
							local141.method437(client.anIntArray274[0], client.anIntArray274[this.anIntArray95[local143]]);
						}
					}
				}
				return local141;
			} else {
				return this.aClass10_2.method106();
			}
		} catch (@Pc(186) RuntimeException local186) {
			signlink.reporterror("78401, " + -289 + ", " + local186.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVRUIIXW", name = "a", descriptor = "(Z)Lclient!WRJMHIDY;")
	@Override
	protected Class2_Sub1_Sub3_Sub5 method510() {
		try {
			if (!this.aBoolean108) {
				return null;
			}
			@Pc(10) Class2_Sub1_Sub3_Sub5 local10 = this.method253();
			if (local10 == null) {
				return null;
			}
			super.anInt406 = local10.anInt730;
			local10.aBoolean184 = true;
			if (this.aBoolean104) {
				return local10;
			}
			if (super.anInt411 != -1 && super.anInt412 != -1) {
				@Pc(45) Class37 local45 = Class37.aClass37Array1[super.anInt411];
				@Pc(48) Class2_Sub1_Sub3_Sub5 local48 = local45.method397();
				if (local48 != null) {
					@Pc(62) Class2_Sub1_Sub3_Sub5 local62 = new Class2_Sub1_Sub3_Sub5(local48, true, false, Class31.method295(super.anInt412, (byte) 6), (byte) 0);
					local62.method436(0, 0, -super.anInt415);
					local62.method430();
					local62.method431(local45.aClass23_2.anIntArray82[super.anInt412]);
					local62.anIntArrayArray12 = null;
					local62.anIntArrayArray11 = null;
					if (local45.anInt620 != 128 || local45.anInt621 != 128) {
						local62.method439(this.aBoolean110, local45.anInt620, local45.anInt620, local45.anInt621);
					}
					local62.method440(local45.anInt623 + 64, local45.anInt624 + 850, -30, -50, -30, true);
					@Pc(131) Class2_Sub1_Sub3_Sub5[] local131 = new Class2_Sub1_Sub3_Sub5[] { local10, local62 };
					local10 = new Class2_Sub1_Sub3_Sub5(-8047, true, 2, local131);
				}
			}
			if (this.aClass2_Sub1_Sub3_Sub5_1 != null) {
				if (client.anInt943 >= this.anInt440) {
					this.aClass2_Sub1_Sub3_Sub5_1 = null;
				}
				if (client.anInt943 >= this.anInt439 && client.anInt943 < this.anInt440) {
					@Pc(160) Class2_Sub1_Sub3_Sub5 local160 = this.aClass2_Sub1_Sub3_Sub5_1;
					local160.method436(this.anInt426 - super.anInt386, this.anInt424 - super.anInt385, this.anInt425 - this.anInt441);
					if (super.anInt417 == 512) {
						local160.method434();
						local160.method434();
						local160.method434();
					} else if (super.anInt417 == 1024) {
						local160.method434();
						local160.method434();
					} else if (super.anInt417 == 1536) {
						local160.method434();
					}
					@Pc(223) Class2_Sub1_Sub3_Sub5[] local223 = new Class2_Sub1_Sub3_Sub5[] { local10, local160 };
					local10 = new Class2_Sub1_Sub3_Sub5(-8047, true, 2, local223);
					if (super.anInt417 == 512) {
						local160.method434();
					} else if (super.anInt417 == 1024) {
						local160.method434();
						local160.method434();
					} else if (super.anInt417 == 1536) {
						local160.method434();
						local160.method434();
						local160.method434();
					}
					local160.method436(super.anInt386 - this.anInt426, super.anInt385 - this.anInt424, this.anInt441 - this.anInt425);
				}
			}
			local10.aBoolean184 = true;
			return local10;
		} catch (@Pc(289) RuntimeException local289) {
			signlink.reporterror("57523, " + false + ", " + local289.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVRUIIXW", name = "b", descriptor = "(Z)Lclient!WRJMHIDY;")
	private Class2_Sub1_Sub3_Sub5 method253() {
		try {
			if (this.aClass10_2 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt418 >= 0 && super.anInt421 == 0) {
					local6 = Class23.aClass23Array1[super.anInt418].anIntArray82[super.anInt419];
				} else if (super.anInt407 >= 0) {
					local6 = Class23.aClass23Array1[super.anInt407].anIntArray82[super.anInt408];
				}
				return this.aClass10_2.method104(local6, -1, null);
			}
			@Pc(48) long local48 = this.aLong18;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (super.anInt418 >= 0 && super.anInt421 == 0) {
				@Pc(73) Class23 local73 = Class23.aClass23Array1[super.anInt418];
				local50 = local73.anIntArray82[super.anInt419];
				if (super.anInt407 >= 0 && super.anInt407 != super.anInt391) {
					local52 = Class23.aClass23Array1[super.anInt407].anIntArray82[super.anInt408];
				}
				if (local73.anInt361 >= 0) {
					local54 = local73.anInt361;
					local48 += local54 - this.anIntArray96[5] << 8;
				}
				if (local73.anInt362 >= 0) {
					local56 = local73.anInt362;
					local48 += local56 - this.anIntArray96[3] << 16;
				}
			} else if (super.anInt407 >= 0) {
				local50 = Class23.aClass23Array1[super.anInt407].anIntArray82[super.anInt408];
			}
			@Pc(151) Class2_Sub1_Sub3_Sub5 local151 = (Class2_Sub1_Sub3_Sub5) aClass1_4.method1(local48);
			@Pc(157) int local157;
			@Pc(164) int local164;
			if (local151 == null) {
				@Pc(155) boolean local155 = false;
				for (local157 = 0; local157 < 12; local157++) {
					local164 = this.anIntArray96[local157];
					if (local56 >= 0 && local157 == 3) {
						local164 = local56;
					}
					if (local54 >= 0 && local157 == 5) {
						local164 = local54;
					}
					if (local164 >= 256 && local164 < 512 && !Class24.aClass24Array1[local164 - 256].method239(this.anInt434)) {
						local155 = true;
					}
					if (local164 >= 512 && !Class34.method385(local164 - 512).method383(this.anInt427)) {
						local155 = true;
					}
				}
				if (local155) {
					if (this.aLong17 != -1L) {
						local151 = (Class2_Sub1_Sub3_Sub5) aClass1_4.method1(this.aLong17);
					}
					if (local151 == null) {
						return null;
					}
				}
			}
			if (local151 == null) {
				@Pc(235) Class2_Sub1_Sub3_Sub5[] local235 = new Class2_Sub1_Sub3_Sub5[12];
				local157 = 0;
				@Pc(246) int local246;
				for (local164 = 0; local164 < 12; local164++) {
					local246 = this.anIntArray96[local164];
					if (local56 >= 0 && local164 == 3) {
						local246 = local56;
					}
					if (local54 >= 0 && local164 == 5) {
						local246 = local54;
					}
					@Pc(275) Class2_Sub1_Sub3_Sub5 local275;
					if (local246 >= 256 && local246 < 512) {
						local275 = Class24.aClass24Array1[local246 - 256].method240(this.aBoolean109);
						if (local275 != null) {
							local235[local157++] = local275;
						}
					}
					if (local246 >= 512) {
						local275 = Class34.method385(local246 - 512).method390(this.anInt427);
						if (local275 != null) {
							local235[local157++] = local275;
						}
					}
				}
				local151 = new Class2_Sub1_Sub3_Sub5(local235, local157, this.aBoolean107);
				for (local246 = 0; local246 < 5; local246++) {
					if (this.anIntArray95[local246] != 0) {
						local151.method437(client.anIntArrayArray23[local246][0], client.anIntArrayArray23[local246][this.anIntArray95[local246]]);
						if (local246 == 1) {
							local151.method437(client.anIntArray274[0], client.anIntArray274[this.anIntArray95[local246]]);
						}
					}
				}
				local151.method430();
				local151.method440(64, 850, -30, -50, -30, true);
				aClass1_4.method2(this.anInt429, local48, local151);
				this.aLong17 = local48;
			}
			if (this.aBoolean104) {
				return local151;
			}
			@Pc(382) Class2_Sub1_Sub3_Sub5 local382 = Class2_Sub1_Sub3_Sub5.aClass2_Sub1_Sub3_Sub5_2;
			local382.method425(Class31.method295(local50, (byte) 6) & Class31.method295(local52, (byte) 6), local151);
			if (local50 != -1 && local52 != -1) {
				local382.method432(local50, Class23.aClass23Array1[super.anInt418].anIntArray85, local52);
			} else if (local50 != -1) {
				local382.method431(local50);
			}
			local382.method427();
			local382.anIntArrayArray12 = null;
			local382.anIntArrayArray11 = null;
			return local382;
		} catch (@Pc(430) RuntimeException local430) {
			signlink.reporterror("66611, " + true + ", " + local430.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVRUIIXW", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method249() {
		try {
			return this.aBoolean108;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("71761, " + 43 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVRUIIXW", name = "a", descriptor = "(Lclient!RSWRPCHR;Z)V")
	public void method254(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		try {
			arg0.anInt556 = 0;
			this.anInt427 = arg0.method340();
			this.anInt435 = arg0.method341();
			if (arg1) {
				this.anInt436 = arg0.method341();
				this.aClass10_2 = null;
				this.anInt437 = 0;
				@Pc(32) int local32;
				@Pc(44) int local44;
				@Pc(91) int local91;
				for (@Pc(27) int local27 = 0; local27 < 12; local27++) {
					local32 = arg0.method340();
					if (local32 == 0) {
						this.anIntArray96[local27] = 0;
					} else {
						local44 = arg0.method340();
						this.anIntArray96[local27] = (local32 << 8) + local44;
						if (local27 == 0 && this.anIntArray96[0] == 65535) {
							this.aClass10_2 = Class10.method105(arg0.method342());
							break;
						}
						if (this.anIntArray96[local27] >= 512 && this.anIntArray96[local27] - 512 < Class34.anInt579) {
							local91 = Class34.method385(this.anIntArray96[local27] - 512).anInt592;
							if (local91 != 0) {
								this.anInt437 = local91;
							}
						}
					}
				}
				for (local32 = 0; local32 < 5; local32++) {
					local44 = arg0.method340();
					if (local44 < 0 || local44 >= client.anIntArrayArray23[local32].length) {
						local44 = 0;
					}
					this.anIntArray95[local32] = local44;
				}
				super.anInt391 = arg0.method342();
				if (super.anInt391 == 65535) {
					super.anInt391 = -1;
				}
				super.anInt392 = arg0.method342();
				if (super.anInt392 == 65535) {
					super.anInt392 = -1;
				}
				super.anInt400 = arg0.method342();
				if (super.anInt400 == 65535) {
					super.anInt400 = -1;
				}
				super.anInt401 = arg0.method342();
				if (super.anInt401 == 65535) {
					super.anInt401 = -1;
				}
				super.anInt402 = arg0.method342();
				if (super.anInt402 == 65535) {
					super.anInt402 = -1;
				}
				super.anInt403 = arg0.method342();
				if (super.anInt403 == 65535) {
					super.anInt403 = -1;
				}
				super.anInt389 = arg0.method342();
				if (super.anInt389 == 65535) {
					super.anInt389 = -1;
				}
				this.aString11 = Class7.method57(Class7.method54(arg0.method346()));
				this.anInt438 = arg0.method340();
				this.anInt423 = arg0.method342();
				this.aBoolean108 = true;
				this.aLong18 = 0L;
				local44 = this.anIntArray96[5];
				local91 = this.anIntArray96[9];
				this.anIntArray96[5] = local91;
				this.anIntArray96[9] = local44;
				for (@Pc(248) int local248 = 0; local248 < 12; local248++) {
					this.aLong18 <<= 0x4;
					if (this.anIntArray96[local248] >= 256) {
						this.aLong18 += this.anIntArray96[local248] - 256;
					}
				}
				if (this.anIntArray96[0] >= 256) {
					this.aLong18 += this.anIntArray96[0] - 256 >> 4;
				}
				if (this.anIntArray96[1] >= 256) {
					this.aLong18 += this.anIntArray96[1] - 256 >> 8;
				}
				this.anIntArray96[5] = local44;
				this.anIntArray96[9] = local91;
				for (@Pc(330) int local330 = 0; local330 < 5; local330++) {
					this.aLong18 <<= 0x3;
					this.aLong18 += this.anIntArray95[local330];
				}
				this.aLong18 <<= 0x1;
				this.aLong18 += this.anInt427;
			}
		} catch (@Pc(368) RuntimeException local368) {
			signlink.reporterror("16682, " + arg0 + ", " + arg1 + ", " + local368.toString());
			throw new RuntimeException();
		}
	}
}
