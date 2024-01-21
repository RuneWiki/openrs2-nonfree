import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZATRZGAA")
public final class Class2_Sub1_Sub2_Sub3_Sub2 extends Class2_Sub1_Sub2_Sub3 {

	@OriginalMember(owner = "client!ZATRZGAA", name = "Bb", descriptor = "Lclient!BVBRKPZH;")
	public static Class4 aClass4_8 = new Class4(-21657, 260);

	@OriginalMember(owner = "client!ZATRZGAA", name = "tb", descriptor = "I")
	public int anInt705;

	@OriginalMember(owner = "client!ZATRZGAA", name = "ub", descriptor = "I")
	public int anInt706;

	@OriginalMember(owner = "client!ZATRZGAA", name = "vb", descriptor = "I")
	public int anInt707;

	@OriginalMember(owner = "client!ZATRZGAA", name = "wb", descriptor = "I")
	public int anInt708;

	@OriginalMember(owner = "client!ZATRZGAA", name = "xb", descriptor = "I")
	public int anInt709;

	@OriginalMember(owner = "client!ZATRZGAA", name = "yb", descriptor = "I")
	public int anInt710;

	@OriginalMember(owner = "client!ZATRZGAA", name = "zb", descriptor = "Lclient!ZLQCXMFK;")
	public Class46 aClass46_2;

	@OriginalMember(owner = "client!ZATRZGAA", name = "Cb", descriptor = "I")
	public int anInt711;

	@OriginalMember(owner = "client!ZATRZGAA", name = "Db", descriptor = "I")
	public int anInt712;

	@OriginalMember(owner = "client!ZATRZGAA", name = "Eb", descriptor = "I")
	public int anInt713;

	@OriginalMember(owner = "client!ZATRZGAA", name = "Fb", descriptor = "I")
	public int anInt714;

	@OriginalMember(owner = "client!ZATRZGAA", name = "Hb", descriptor = "I")
	public int anInt715;

	@OriginalMember(owner = "client!ZATRZGAA", name = "Ib", descriptor = "I")
	public int anInt716;

	@OriginalMember(owner = "client!ZATRZGAA", name = "Jb", descriptor = "I")
	public int anInt717;

	@OriginalMember(owner = "client!ZATRZGAA", name = "Kb", descriptor = "Lclient!IEHKDFMR;")
	public Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!ZATRZGAA", name = "Nb", descriptor = "J")
	private long aLong25;

	@OriginalMember(owner = "client!ZATRZGAA", name = "Pb", descriptor = "I")
	private int anInt720;

	@OriginalMember(owner = "client!ZATRZGAA", name = "Sb", descriptor = "Ljava/lang/String;")
	public String aString15;

	@OriginalMember(owner = "client!ZATRZGAA", name = "Vb", descriptor = "I")
	private int anInt723;

	@OriginalMember(owner = "client!ZATRZGAA", name = "sb", descriptor = "[I")
	public int[] anIntArray185 = new int[12];

	@OriginalMember(owner = "client!ZATRZGAA", name = "Ab", descriptor = "B")
	private byte aByte25 = 0;

	@OriginalMember(owner = "client!ZATRZGAA", name = "Gb", descriptor = "J")
	private long aLong24 = -1L;

	@OriginalMember(owner = "client!ZATRZGAA", name = "Lb", descriptor = "I")
	private int anInt718 = 8;

	@OriginalMember(owner = "client!ZATRZGAA", name = "Mb", descriptor = "[I")
	public int[] anIntArray186 = new int[5];

	@OriginalMember(owner = "client!ZATRZGAA", name = "Ob", descriptor = "I")
	public int anInt719 = -1;

	@OriginalMember(owner = "client!ZATRZGAA", name = "Qb", descriptor = "I")
	private int anInt721 = 2040;

	@OriginalMember(owner = "client!ZATRZGAA", name = "Rb", descriptor = "Z")
	public boolean aBoolean218 = false;

	@OriginalMember(owner = "client!ZATRZGAA", name = "Tb", descriptor = "I")
	public int anInt722 = -1;

	@OriginalMember(owner = "client!ZATRZGAA", name = "Ub", descriptor = "Z")
	public boolean aBoolean219 = false;

	@OriginalMember(owner = "client!ZATRZGAA", name = "a", descriptor = "(I)Lclient!IEHKDFMR;")
	@Override
	protected Class2_Sub1_Sub2_Sub2 method469() {
		try {
			if (!this.aBoolean219) {
				return null;
			}
			@Pc(10) Class2_Sub1_Sub2_Sub2 local10 = this.method477();
			if (local10 == null) {
				return null;
			}
			super.anInt656 = local10.anInt655;
			local10.aBoolean80 = true;
			if (this.aBoolean218) {
				return local10;
			}
			if (super.anInt663 != -1 && super.anInt664 != -1) {
				@Pc(45) Class33 local45 = Class33.aClass33Array1[super.anInt663];
				@Pc(48) Class2_Sub1_Sub2_Sub2 local48 = local45.method318();
				if (local48 != null) {
					@Pc(63) Class2_Sub1_Sub2_Sub2 local63 = new Class2_Sub1_Sub2_Sub2(false, (byte) 1, Class26.method223(this.aByte25, super.anInt664), local48, true);
					local63.method164(0, 0, -super.anInt667);
					local63.method158();
					local63.method159((byte) 9, local45.aClass39_2.anIntArray166[super.anInt664]);
					local63.anIntArrayArray8 = null;
					local63.anIntArrayArray7 = null;
					if (local45.anInt477 != 128 || local45.anInt478 != 128) {
						local63.method167(local45.anInt477, local45.anInt478, local45.anInt477);
					}
					local63.method168(local45.anInt480 + 64, local45.anInt481 + 850, -30, -50, -30, true);
					@Pc(131) Class2_Sub1_Sub2_Sub2[] local131 = new Class2_Sub1_Sub2_Sub2[] { local10, local63 };
					local10 = new Class2_Sub1_Sub2_Sub2((byte) -29, true, 2, local131);
				}
			}
			if (this.aClass2_Sub1_Sub2_Sub2_2 != null) {
				if (client.anInt856 >= this.anInt712) {
					this.aClass2_Sub1_Sub2_Sub2_2 = null;
				}
				if (client.anInt856 >= this.anInt711 && client.anInt856 < this.anInt712) {
					@Pc(160) Class2_Sub1_Sub2_Sub2 local160 = this.aClass2_Sub1_Sub2_Sub2_2;
					local160.method164(this.anInt715 - super.anInt679, this.anInt717 - super.anInt680, this.anInt716 - this.anInt713);
					if (super.anInt675 == 512) {
						local160.method162();
						local160.method162();
						local160.method162();
					} else if (super.anInt675 == 1024) {
						local160.method162();
						local160.method162();
					} else if (super.anInt675 == 1536) {
						local160.method162();
					}
					@Pc(223) Class2_Sub1_Sub2_Sub2[] local223 = new Class2_Sub1_Sub2_Sub2[] { local10, local160 };
					local10 = new Class2_Sub1_Sub2_Sub2((byte) -29, true, 2, local223);
					if (super.anInt675 == 512) {
						local160.method162();
					} else if (super.anInt675 == 1024) {
						local160.method162();
						local160.method162();
					} else if (super.anInt675 == 1536) {
						local160.method162();
						local160.method162();
						local160.method162();
					}
					local160.method164(super.anInt679 - this.anInt715, super.anInt680 - this.anInt717, this.anInt713 - this.anInt716);
				}
			}
			local10.aBoolean80 = true;
			return local10;
		} catch (@Pc(289) RuntimeException local289) {
			signlink.reporterror("47325, " + 0 + ", " + local289.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZATRZGAA", name = "c", descriptor = "(I)Lclient!IEHKDFMR;")
	public Class2_Sub1_Sub2_Sub2 method475() {
		try {
			if (!this.aBoolean219) {
				return null;
			} else if (this.aClass46_2 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray185[local18];
					if (local25 >= 256 && local25 < 512 && !Class30.aClass30Array1[local25 - 256].method290()) {
						local16 = true;
					}
					if (local25 >= 512 && !Class38.method391(local25 - 512).method393(this.anInt720)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(66) Class2_Sub1_Sub2_Sub2[] local66 = new Class2_Sub1_Sub2_Sub2[12];
				@Pc(68) int local68 = 0;
				for (@Pc(76) int local76 = 0; local76 < 12; local76++) {
					@Pc(83) int local83 = this.anIntArray185[local76];
					@Pc(97) Class2_Sub1_Sub2_Sub2 local97;
					if (local83 >= 256 && local83 < 512) {
						local97 = Class30.aClass30Array1[local83 - 256].method291();
						if (local97 != null) {
							local66[local68++] = local97;
						}
					}
					if (local83 >= 512) {
						local97 = Class38.method391(local83 - 512).method396(this.anInt720);
						if (local97 != null) {
							local66[local68++] = local97;
						}
					}
				}
				@Pc(135) Class2_Sub1_Sub2_Sub2 local135 = new Class2_Sub1_Sub2_Sub2(local66, this.anInt718, local68);
				for (@Pc(137) int local137 = 0; local137 < 5; local137++) {
					if (this.anIntArray186[local137] != 0) {
						local135.method165(client.anIntArrayArray22[local137][0], client.anIntArrayArray22[local137][this.anIntArray186[local137]]);
						if (local137 == 1) {
							local135.method165(client.anIntArray257[0], client.anIntArray257[this.anIntArray186[local137]]);
						}
					}
				}
				return local135;
			} else {
				return this.aClass46_2.method478();
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("6709, " + -383 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZATRZGAA", name = "a", descriptor = "(Lclient!EMWAMCXW;I)V")
	public void method476(@OriginalArg(0) Class2_Sub1_Sub3 arg0) {
		try {
			arg0.anInt136 = 0;
			this.anInt720 = arg0.method97();
			this.anInt722 = arg0.method98();
			this.anInt719 = arg0.method98();
			this.aClass46_2 = null;
			this.anInt710 = 0;
			@Pc(29) int local29;
			@Pc(41) int local41;
			@Pc(88) int local88;
			for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
				local29 = arg0.method97();
				if (local29 == 0) {
					this.anIntArray185[local24] = 0;
				} else {
					local41 = arg0.method97();
					this.anIntArray185[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray185[0] == 65535) {
						this.aClass46_2 = Class46.method480(arg0.method99());
						break;
					}
					if (this.anIntArray185[local24] >= 512 && this.anIntArray185[local24] - 512 < Class38.anInt580) {
						local88 = Class38.method391(this.anIntArray185[local24] - 512).anInt582;
						if (local88 != 0) {
							this.anInt710 = local88;
						}
					}
				}
			}
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg0.method97();
				if (local41 < 0 || local41 >= client.anIntArrayArray22[local29].length) {
					local41 = 0;
				}
				this.anIntArray186[local29] = local41;
			}
			super.anInt661 = arg0.method99();
			if (super.anInt661 == 65535) {
				super.anInt661 = -1;
			}
			super.anInt662 = arg0.method99();
			if (super.anInt662 == 65535) {
				super.anInt662 = -1;
			}
			super.anInt657 = arg0.method99();
			if (super.anInt657 == 65535) {
				super.anInt657 = -1;
			}
			super.anInt658 = arg0.method99();
			if (super.anInt658 == 65535) {
				super.anInt658 = -1;
			}
			super.anInt659 = arg0.method99();
			if (super.anInt659 == 65535) {
				super.anInt659 = -1;
			}
			super.anInt660 = arg0.method99();
			if (super.anInt660 == 65535) {
				super.anInt660 = -1;
			}
			super.anInt677 = arg0.method99();
			if (super.anInt677 == 65535) {
				super.anInt677 = -1;
			}
			this.aString15 = Class40.method409(Class40.method406(arg0.method103()));
			this.anInt714 = arg0.method97();
			this.anInt709 = arg0.method99();
			this.aBoolean219 = true;
			this.aLong25 = 0L;
			local41 = this.anIntArray185[5];
			local88 = this.anIntArray185[9];
			this.anIntArray185[5] = local88;
			this.anIntArray185[9] = local41;
			for (@Pc(249) int local249 = 0; local249 < 12; local249++) {
				this.aLong25 <<= 0x4;
				if (this.anIntArray185[local249] >= 256) {
					this.aLong25 += this.anIntArray185[local249] - 256;
				}
			}
			if (this.anIntArray185[0] >= 256) {
				this.aLong25 += this.anIntArray185[0] - 256 >> 4;
			}
			if (this.anIntArray185[1] >= 256) {
				this.aLong25 += this.anIntArray185[1] - 256 >> 8;
			}
			this.anIntArray185[5] = local41;
			this.anIntArray185[9] = local88;
			for (@Pc(331) int local331 = 0; local331 < 5; local331++) {
				this.aLong25 <<= 0x3;
				this.aLong25 += this.anIntArray186[local331];
			}
			this.aLong25 <<= 0x1;
			this.aLong25 += this.anInt720;
		} catch (@Pc(369) RuntimeException local369) {
			signlink.reporterror("40166, " + arg0 + ", " + 5696 + ", " + local369.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZATRZGAA", name = "d", descriptor = "(I)Lclient!IEHKDFMR;")
	private Class2_Sub1_Sub2_Sub2 method477() {
		try {
			if (this.aClass46_2 != null) {
				@Pc(12) int local12 = -1;
				if (super.anInt684 >= 0 && super.anInt687 == 0) {
					local12 = Class39.aClass39Array1[super.anInt684].anIntArray166[super.anInt685];
				} else if (super.anInt693 >= 0) {
					local12 = Class39.aClass39Array1[super.anInt693].anIntArray166[super.anInt694];
				}
				return this.aClass46_2.method483(-1, null, local12);
			}
			@Pc(54) long local54 = this.aLong25;
			@Pc(56) int local56 = -1;
			@Pc(58) int local58 = -1;
			@Pc(60) int local60 = -1;
			@Pc(62) int local62 = -1;
			if (super.anInt684 >= 0 && super.anInt687 == 0) {
				@Pc(73) Class39 local73 = Class39.aClass39Array1[super.anInt684];
				local56 = local73.anIntArray166[super.anInt685];
				if (super.anInt693 >= 0 && super.anInt693 != super.anInt661) {
					local58 = Class39.aClass39Array1[super.anInt693].anIntArray166[super.anInt694];
				}
				if (local73.anInt588 >= 0) {
					local60 = local73.anInt588;
					local54 += local60 - this.anIntArray185[5] << 8;
				}
				if (local73.anInt589 >= 0) {
					local62 = local73.anInt589;
					local54 += local62 - this.anIntArray185[3] << 16;
				}
			} else if (super.anInt693 >= 0) {
				local56 = Class39.aClass39Array1[super.anInt693].anIntArray166[super.anInt694];
			}
			@Pc(151) Class2_Sub1_Sub2_Sub2 local151 = (Class2_Sub1_Sub2_Sub2) aClass4_8.method37(local54);
			@Pc(157) int local157;
			@Pc(164) int local164;
			if (local151 == null) {
				@Pc(155) boolean local155 = false;
				for (local157 = 0; local157 < 12; local157++) {
					local164 = this.anIntArray185[local157];
					if (local62 >= 0 && local157 == 3) {
						local164 = local62;
					}
					if (local60 >= 0 && local157 == 5) {
						local164 = local60;
					}
					if (local164 >= 256 && local164 < 512 && !Class30.aClass30Array1[local164 - 256].method288()) {
						local155 = true;
					}
					if (local164 >= 512 && !Class38.method391(local164 - 512).method389(this.anInt720)) {
						local155 = true;
					}
				}
				if (local155) {
					if (this.aLong24 != -1L) {
						local151 = (Class2_Sub1_Sub2_Sub2) aClass4_8.method37(this.aLong24);
					}
					if (local151 == null) {
						return null;
					}
				}
			}
			if (local151 == null) {
				@Pc(234) Class2_Sub1_Sub2_Sub2[] local234 = new Class2_Sub1_Sub2_Sub2[12];
				local157 = 0;
				@Pc(245) int local245;
				for (local164 = 0; local164 < 12; local164++) {
					local245 = this.anIntArray185[local164];
					if (local62 >= 0 && local164 == 3) {
						local245 = local62;
					}
					if (local60 >= 0 && local164 == 5) {
						local245 = local60;
					}
					@Pc(273) Class2_Sub1_Sub2_Sub2 local273;
					if (local245 >= 256 && local245 < 512) {
						local273 = Class30.aClass30Array1[local245 - 256].method289();
						if (local273 != null) {
							local234[local157++] = local273;
						}
					}
					if (local245 >= 512) {
						local273 = Class38.method391(local245 - 512).method394(this.anInt720, this.anInt723);
						if (local273 != null) {
							local234[local157++] = local273;
						}
					}
				}
				local151 = new Class2_Sub1_Sub2_Sub2(local234, this.anInt718, local157);
				for (local245 = 0; local245 < 5; local245++) {
					if (this.anIntArray186[local245] != 0) {
						local151.method165(client.anIntArrayArray22[local245][0], client.anIntArrayArray22[local245][this.anIntArray186[local245]]);
						if (local245 == 1) {
							local151.method165(client.anIntArray257[0], client.anIntArray257[this.anIntArray186[local245]]);
						}
					}
				}
				local151.method158();
				local151.method168(64, 850, -30, -50, -30, true);
				aClass4_8.method38(local54, local151);
				this.aLong24 = local54;
			}
			if (this.aBoolean218) {
				return local151;
			}
			@Pc(380) Class2_Sub1_Sub2_Sub2 local380 = Class2_Sub1_Sub2_Sub2.aClass2_Sub1_Sub2_Sub2_1;
			local380.method153(Class26.method223(this.aByte25, local56) & Class26.method223(this.aByte25, local58), local151);
			if (local56 != -1 && local58 != -1) {
				local380.method160(local56, local58, Class39.aClass39Array1[super.anInt684].anIntArray169);
			} else if (local56 != -1) {
				local380.method159((byte) 9, local56);
			}
			local380.method155(this.anInt721);
			local380.anIntArrayArray8 = null;
			local380.anIntArrayArray7 = null;
			return local380;
		} catch (@Pc(431) RuntimeException local431) {
			signlink.reporterror("97912, " + 0 + ", " + local431.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZATRZGAA", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method473() {
		try {
			return this.aBoolean219;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("65474, " + false + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
