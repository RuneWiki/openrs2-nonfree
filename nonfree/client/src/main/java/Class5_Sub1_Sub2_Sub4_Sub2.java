import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QGDSNXKJ")
public final class Class5_Sub1_Sub2_Sub4_Sub2 extends Class5_Sub1_Sub2_Sub4 {

	@OriginalMember(owner = "client!QGDSNXKJ", name = "tb", descriptor = "Lclient!WIUIWDML;")
	public static Class45 aClass45_6 = new Class45(-99, 260);

	@OriginalMember(owner = "client!QGDSNXKJ", name = "rb", descriptor = "I")
	public int anInt542;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "sb", descriptor = "I")
	public int anInt543;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "vb", descriptor = "Ljava/lang/String;")
	public String aString8;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "wb", descriptor = "I")
	public int anInt544;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "xb", descriptor = "J")
	private long aLong20;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "Cb", descriptor = "I")
	private int anInt546;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "Db", descriptor = "I")
	public int anInt547;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "Eb", descriptor = "I")
	public int anInt548;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "Fb", descriptor = "I")
	public int anInt549;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "Gb", descriptor = "I")
	public int anInt550;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "Jb", descriptor = "Lclient!YIBRLAQY;")
	public Class49 aClass49_2;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "Kb", descriptor = "I")
	public int anInt553;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "Lb", descriptor = "I")
	public int anInt554;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "Mb", descriptor = "I")
	public int anInt555;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "Nb", descriptor = "Lclient!PSGMMDJS;")
	public Class5_Sub1_Sub2_Sub5 aClass5_Sub1_Sub2_Sub5_2;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "Ob", descriptor = "I")
	public int anInt556;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "Qb", descriptor = "I")
	public int anInt558;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "Tb", descriptor = "I")
	public int anInt559;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "ub", descriptor = "Z")
	public boolean aBoolean140 = false;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "yb", descriptor = "[I")
	public int[] anIntArray156 = new int[5];

	@OriginalMember(owner = "client!QGDSNXKJ", name = "zb", descriptor = "I")
	private int anInt545 = -47097;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "Ab", descriptor = "Z")
	public boolean aBoolean141 = false;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "Bb", descriptor = "J")
	private long aLong21 = -1L;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "Hb", descriptor = "I")
	private int anInt551 = 635;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "Ib", descriptor = "I")
	public int anInt552 = -1;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "Pb", descriptor = "I")
	public int anInt557 = -1;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "Rb", descriptor = "Z")
	private boolean aBoolean142 = true;

	@OriginalMember(owner = "client!QGDSNXKJ", name = "Sb", descriptor = "[I")
	public int[] anIntArray157 = new int[12];

	@OriginalMember(owner = "client!QGDSNXKJ", name = "a", descriptor = "(BLclient!PKHWFJLM;)V")
	public void method377(@OriginalArg(1) Class5_Sub1_Sub4 arg0) {
		try {
			arg0.anInt429 = 0;
			this.anInt546 = arg0.method240();
			this.anInt557 = arg0.method241();
			this.anInt552 = arg0.method241();
			this.aClass49_2 = null;
			this.anInt558 = 0;
			@Pc(39) int local39;
			@Pc(51) int local51;
			@Pc(98) int local98;
			for (@Pc(34) int local34 = 0; local34 < 12; local34++) {
				local39 = arg0.method240();
				if (local39 == 0) {
					this.anIntArray157[local34] = 0;
				} else {
					local51 = arg0.method240();
					this.anIntArray157[local34] = (local39 << 8) + local51;
					if (local34 == 0 && this.anIntArray157[0] == 65535) {
						this.aClass49_2 = Class49.method537(arg0.method242());
						break;
					}
					if (this.anIntArray157[local34] >= 512 && this.anIntArray157[local34] - 512 < Class18.anInt185) {
						local98 = Class18.method117(this.anIntArray157[local34] - 512).anInt175;
						if (local98 != 0) {
							this.anInt558 = local98;
						}
					}
				}
			}
			for (local39 = 0; local39 < 5; local39++) {
				local51 = arg0.method240();
				if (local51 < 0 || local51 >= client.anIntArrayArray25[local39].length) {
					local51 = 0;
				}
				this.anIntArray156[local39] = local51;
			}
			super.anInt494 = arg0.method242();
			if (super.anInt494 == 65535) {
				super.anInt494 = -1;
			}
			super.anInt495 = arg0.method242();
			if (super.anInt495 == 65535) {
				super.anInt495 = -1;
			}
			super.anInt538 = arg0.method242();
			if (super.anInt538 == 65535) {
				super.anInt538 = -1;
			}
			super.anInt539 = arg0.method242();
			if (super.anInt539 == 65535) {
				super.anInt539 = -1;
			}
			super.anInt540 = arg0.method242();
			if (super.anInt540 == 65535) {
				super.anInt540 = -1;
			}
			super.anInt541 = arg0.method242();
			if (super.anInt541 == 65535) {
				super.anInt541 = -1;
			}
			super.anInt500 = arg0.method242();
			if (super.anInt500 == 65535) {
				super.anInt500 = -1;
			}
			this.aString8 = Class28.method195(Class28.method192((byte) 7, arg0.method246()));
			this.anInt544 = arg0.method240();
			this.anInt559 = arg0.method242();
			this.aBoolean140 = true;
			this.aLong20 = 0L;
			for (local51 = 0; local51 < 12; local51++) {
				this.aLong20 <<= 0x4;
				if (this.anIntArray157[local51] >= 256) {
					this.aLong20 += this.anIntArray157[local51] - 256;
				}
			}
			if (this.anIntArray157[0] >= 256) {
				this.aLong20 += this.anIntArray157[0] - 256 >> 4;
			}
			if (this.anIntArray157[1] >= 256) {
				this.aLong20 += this.anIntArray157[1] - 256 >> 8;
			}
			for (local98 = 0; local98 < 5; local98++) {
				this.aLong20 <<= 0x3;
				this.aLong20 += this.anIntArray156[local98];
			}
			this.aLong20 <<= 0x1;
			this.aLong20 += this.anInt546;
		} catch (@Pc(345) RuntimeException local345) {
			signlink.reporterror("93261, " + 5 + ", " + arg0 + ", " + local345.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QGDSNXKJ", name = "a", descriptor = "(I)Lclient!PSGMMDJS;")
	@Override
	protected Class5_Sub1_Sub2_Sub5 method422() {
		try {
			if (!this.aBoolean140) {
				return null;
			}
			@Pc(10) Class5_Sub1_Sub2_Sub5 local10 = this.method378();
			if (local10 == null) {
				return null;
			}
			super.anInt522 = local10.anInt633;
			local10.aBoolean125 = true;
			if (this.aBoolean141) {
				return local10;
			}
			if (super.anInt533 != -1 && super.anInt534 != -1) {
				@Pc(50) Class20 local50 = Class20.aClass20Array1[super.anInt533];
				@Pc(53) Class5_Sub1_Sub2_Sub5 local53 = local50.method132();
				if (local53 != null) {
					@Pc(67) Class5_Sub1_Sub2_Sub5 local67 = new Class5_Sub1_Sub2_Sub5(local53, -42752, Class3.method5(super.anInt534), true, false);
					local67.method337(-super.anInt537, 0, 0);
					local67.method331();
					local67.method332(local50.aClass11_1.anIntArray25[super.anInt534]);
					local67.anIntArrayArray11 = null;
					local67.anIntArrayArray10 = null;
					if (local50.anInt209 != 128 || local50.anInt210 != 128) {
						local67.method340(local50.anInt210, local50.anInt209, local50.anInt209);
					}
					local67.method341(local50.anInt212 + 64, local50.anInt213 + 850, -30, -50, -30, true);
					@Pc(135) Class5_Sub1_Sub2_Sub5[] local135 = new Class5_Sub1_Sub2_Sub5[] { local10, local67 };
					local10 = new Class5_Sub1_Sub2_Sub5(2, local135, true, true);
				}
			}
			if (this.aClass5_Sub1_Sub2_Sub5_2 != null) {
				if (client.anInt1018 >= this.anInt543) {
					this.aClass5_Sub1_Sub2_Sub5_2 = null;
				}
				if (client.anInt1018 >= this.anInt542 && client.anInt1018 < this.anInt543) {
					@Pc(164) Class5_Sub1_Sub2_Sub5 local164 = this.aClass5_Sub1_Sub2_Sub5_2;
					local164.method337(this.anInt554 - this.anInt556, this.anInt555 - super.anInt525, this.anInt553 - super.anInt524);
					if (super.anInt532 == 512) {
						local164.method335();
						local164.method335();
						local164.method335();
					} else if (super.anInt532 == 1024) {
						local164.method335();
						local164.method335();
					} else if (super.anInt532 == 1536) {
						local164.method335();
					}
					@Pc(227) Class5_Sub1_Sub2_Sub5[] local227 = new Class5_Sub1_Sub2_Sub5[] { local10, local164 };
					local10 = new Class5_Sub1_Sub2_Sub5(2, local227, true, true);
					if (super.anInt532 == 512) {
						local164.method335();
					} else if (super.anInt532 == 1024) {
						local164.method335();
						local164.method335();
					} else if (super.anInt532 == 1536) {
						local164.method335();
						local164.method335();
						local164.method335();
					}
					local164.method337(this.anInt556 - this.anInt554, super.anInt525 - this.anInt555, super.anInt524 - this.anInt553);
				}
			}
			local10.aBoolean125 = true;
			return local10;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("81432, " + 27243 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QGDSNXKJ", name = "b", descriptor = "(I)Lclient!PSGMMDJS;")
	private Class5_Sub1_Sub2_Sub5 method378() {
		try {
			if (this.aClass49_2 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt501 >= 0 && super.anInt504 == 0) {
					local6 = Class11.aClass11Array1[super.anInt501].anIntArray25[super.anInt502];
				} else if (super.anInt527 >= 0) {
					local6 = Class11.aClass11Array1[super.anInt527].anIntArray25[super.anInt528];
				}
				return this.aClass49_2.method539(local6, -1, null, this.anInt545);
			}
			@Pc(49) long local49 = this.aLong20;
			@Pc(61) int local61 = -1;
			@Pc(63) int local63 = -1;
			@Pc(65) int local65 = -1;
			@Pc(67) int local67 = -1;
			if (super.anInt501 >= 0 && super.anInt504 == 0) {
				@Pc(78) Class11 local78 = Class11.aClass11Array1[super.anInt501];
				local61 = local78.anIntArray25[super.anInt502];
				if (super.anInt527 >= 0 && super.anInt527 != super.anInt494) {
					local63 = Class11.aClass11Array1[super.anInt527].anIntArray25[super.anInt528];
				}
				if (local78.anInt106 >= 0) {
					local65 = local78.anInt106;
					local49 += local65 - this.anIntArray157[5] << 8;
				}
				if (local78.anInt107 >= 0) {
					local67 = local78.anInt107;
					local49 += local67 - this.anIntArray157[3] << 16;
				}
			} else if (super.anInt527 >= 0) {
				local61 = Class11.aClass11Array1[super.anInt527].anIntArray25[super.anInt528];
			}
			@Pc(156) Class5_Sub1_Sub2_Sub5 local156 = (Class5_Sub1_Sub2_Sub5) aClass45_6.method477(local49);
			@Pc(162) int local162;
			@Pc(169) int local169;
			if (local156 == null) {
				@Pc(160) boolean local160 = false;
				for (local162 = 0; local162 < 12; local162++) {
					local169 = this.anIntArray157[local162];
					if (local67 >= 0 && local162 == 3) {
						local169 = local67;
					}
					if (local65 >= 0 && local162 == 5) {
						local169 = local65;
					}
					if (local169 >= 256 && local169 < 512 && !Class33.aClass33Array1[local169 - 256].method351()) {
						local160 = true;
					}
					if (local169 >= 512 && !Class18.method117(local169 - 512).method116(this.anInt546)) {
						local160 = true;
					}
				}
				if (local160) {
					if (this.aLong21 != -1L) {
						local156 = (Class5_Sub1_Sub2_Sub5) aClass45_6.method477(this.aLong21);
					}
					if (local156 == null) {
						return null;
					}
				}
			}
			if (local156 == null) {
				@Pc(239) Class5_Sub1_Sub2_Sub5[] local239 = new Class5_Sub1_Sub2_Sub5[12];
				local162 = 0;
				@Pc(250) int local250;
				for (local169 = 0; local169 < 12; local169++) {
					local250 = this.anIntArray157[local169];
					if (local67 >= 0 && local169 == 3) {
						local250 = local67;
					}
					if (local65 >= 0 && local169 == 5) {
						local250 = local65;
					}
					@Pc(278) Class5_Sub1_Sub2_Sub5 local278;
					if (local250 >= 256 && local250 < 512) {
						local278 = Class33.aClass33Array1[local250 - 256].method352();
						if (local278 != null) {
							local239[local162++] = local278;
						}
					}
					if (local250 >= 512) {
						local278 = Class18.method117(local250 - 512).method119(this.anInt546);
						if (local278 != null) {
							local239[local162++] = local278;
						}
					}
				}
				local156 = new Class5_Sub1_Sub2_Sub5(8111, local162, local239);
				for (local250 = 0; local250 < 5; local250++) {
					if (this.anIntArray156[local250] != 0) {
						local156.method338(client.anIntArrayArray25[local250][0], client.anIntArrayArray25[local250][this.anIntArray156[local250]]);
						if (local250 == 1) {
							local156.method338(client.anIntArray262[0], client.anIntArray262[this.anIntArray156[local250]]);
						}
					}
				}
				local156.method331();
				local156.method341(64, 850, -30, -50, -30, true);
				aClass45_6.method478(this.anInt551, local49, local156);
				this.aLong21 = local49;
			}
			if (this.aBoolean141) {
				return local156;
			}
			@Pc(384) Class5_Sub1_Sub2_Sub5 local384 = Class5_Sub1_Sub2_Sub5.aClass5_Sub1_Sub2_Sub5_1;
			local384.method326(local156, Class3.method5(local61) & Class3.method5(local63));
			if (local61 != -1 && local63 != -1) {
				local384.method333(Class11.aClass11Array1[super.anInt501].anIntArray28, local63, local61);
			} else if (local61 != -1) {
				local384.method332(local61);
			}
			local384.method328();
			local384.anIntArrayArray11 = null;
			local384.anIntArrayArray10 = null;
			return local384;
		} catch (@Pc(432) RuntimeException local432) {
			signlink.reporterror("2304, " + -3861 + ", " + local432.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QGDSNXKJ", name = "c", descriptor = "(B)Lclient!PSGMMDJS;")
	public Class5_Sub1_Sub2_Sub5 method379() {
		try {
			if (!this.aBoolean140) {
				return null;
			} else if (this.aClass49_2 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray157[local18];
					if (local25 >= 256 && local25 < 512 && !Class33.aClass33Array1[local25 - 256].method353()) {
						local16 = true;
					}
					if (local25 >= 512 && !Class18.method117(local25 - 512).method112(this.anInt546)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(66) Class5_Sub1_Sub2_Sub5[] local66 = new Class5_Sub1_Sub2_Sub5[12];
				@Pc(68) int local68 = 0;
				for (@Pc(70) int local70 = 0; local70 < 12; local70++) {
					@Pc(77) int local77 = this.anIntArray157[local70];
					@Pc(91) Class5_Sub1_Sub2_Sub5 local91;
					if (local77 >= 256 && local77 < 512) {
						local91 = Class33.aClass33Array1[local77 - 256].method354();
						if (local91 != null) {
							local66[local68++] = local91;
						}
					}
					if (local77 >= 512) {
						local91 = Class18.method117(local77 - 512).method123(this.anInt546);
						if (local91 != null) {
							local66[local68++] = local91;
						}
					}
				}
				@Pc(128) Class5_Sub1_Sub2_Sub5 local128 = new Class5_Sub1_Sub2_Sub5(8111, local68, local66);
				for (@Pc(130) int local130 = 0; local130 < 5; local130++) {
					if (this.anIntArray156[local130] != 0) {
						local128.method338(client.anIntArrayArray25[local130][0], client.anIntArrayArray25[local130][this.anIntArray156[local130]]);
						if (local130 == 1) {
							local128.method338(client.anIntArray262[0], client.anIntArray262[this.anIntArray156[local130]]);
						}
					}
				}
				return local128;
			} else {
				return this.aClass49_2.method540();
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("8942, " + 71 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QGDSNXKJ", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method372() {
		try {
			return this.aBoolean140;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("65386, " + 127 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}
}
