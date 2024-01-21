import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TPTANZXN")
public final class Class6_Sub1_Sub2_Sub4_Sub2 extends Class6_Sub1_Sub2_Sub4 {

	@OriginalMember(owner = "client!TPTANZXN", name = "Nb", descriptor = "Lclient!YITKGHWB;")
	public static Class46 aClass46_9 = new Class46(260, (byte) 6);

	@OriginalMember(owner = "client!TPTANZXN", name = "sb", descriptor = "I")
	public int anInt616;

	@OriginalMember(owner = "client!TPTANZXN", name = "tb", descriptor = "I")
	public int anInt617;

	@OriginalMember(owner = "client!TPTANZXN", name = "ub", descriptor = "I")
	public int anInt618;

	@OriginalMember(owner = "client!TPTANZXN", name = "vb", descriptor = "I")
	public int anInt619;

	@OriginalMember(owner = "client!TPTANZXN", name = "wb", descriptor = "I")
	private int anInt620;

	@OriginalMember(owner = "client!TPTANZXN", name = "yb", descriptor = "I")
	public int anInt621;

	@OriginalMember(owner = "client!TPTANZXN", name = "zb", descriptor = "I")
	public int anInt622;

	@OriginalMember(owner = "client!TPTANZXN", name = "Ab", descriptor = "I")
	public int anInt623;

	@OriginalMember(owner = "client!TPTANZXN", name = "Db", descriptor = "Lclient!JRELGTVY;")
	public Class20 aClass20_2;

	@OriginalMember(owner = "client!TPTANZXN", name = "Eb", descriptor = "I")
	private int anInt624;

	@OriginalMember(owner = "client!TPTANZXN", name = "Gb", descriptor = "I")
	public int anInt625;

	@OriginalMember(owner = "client!TPTANZXN", name = "Hb", descriptor = "I")
	public int anInt626;

	@OriginalMember(owner = "client!TPTANZXN", name = "Ib", descriptor = "I")
	public int anInt627;

	@OriginalMember(owner = "client!TPTANZXN", name = "Jb", descriptor = "Lclient!FLXAIVEA;")
	public Class6_Sub1_Sub2_Sub2 aClass6_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!TPTANZXN", name = "Kb", descriptor = "I")
	public int anInt628;

	@OriginalMember(owner = "client!TPTANZXN", name = "Pb", descriptor = "J")
	private long aLong21;

	@OriginalMember(owner = "client!TPTANZXN", name = "Rb", descriptor = "I")
	public int anInt631;

	@OriginalMember(owner = "client!TPTANZXN", name = "Tb", descriptor = "I")
	public int anInt632;

	@OriginalMember(owner = "client!TPTANZXN", name = "Vb", descriptor = "Ljava/lang/String;")
	public String aString16;

	@OriginalMember(owner = "client!TPTANZXN", name = "rb", descriptor = "I")
	private int anInt615 = 6;

	@OriginalMember(owner = "client!TPTANZXN", name = "xb", descriptor = "[I")
	public int[] anIntArray171 = new int[12];

	@OriginalMember(owner = "client!TPTANZXN", name = "Bb", descriptor = "Z")
	public boolean aBoolean145 = false;

	@OriginalMember(owner = "client!TPTANZXN", name = "Cb", descriptor = "Z")
	private boolean aBoolean146 = false;

	@OriginalMember(owner = "client!TPTANZXN", name = "Fb", descriptor = "J")
	private long aLong20 = -1L;

	@OriginalMember(owner = "client!TPTANZXN", name = "Lb", descriptor = "B")
	private byte aByte41 = 2;

	@OriginalMember(owner = "client!TPTANZXN", name = "Mb", descriptor = "I")
	public int anInt629 = -1;

	@OriginalMember(owner = "client!TPTANZXN", name = "Ob", descriptor = "I")
	public int anInt630 = -1;

	@OriginalMember(owner = "client!TPTANZXN", name = "Qb", descriptor = "B")
	private byte aByte42 = -72;

	@OriginalMember(owner = "client!TPTANZXN", name = "Sb", descriptor = "Z")
	public boolean aBoolean147 = false;

	@OriginalMember(owner = "client!TPTANZXN", name = "Ub", descriptor = "[I")
	public int[] anIntArray172 = new int[5];

	@OriginalMember(owner = "client!TPTANZXN", name = "a", descriptor = "(Lclient!PQBRPYKE;I)V")
	public void method382(@OriginalArg(0) Class6_Sub1_Sub4 arg0) {
		try {
			arg0.anInt390 = 0;
			this.anInt624 = arg0.method239();
			this.anInt629 = arg0.method240();
			this.anInt630 = arg0.method240();
			this.aClass20_2 = null;
			this.anInt631 = 0;
			@Pc(29) int local29;
			@Pc(41) int local41;
			@Pc(88) int local88;
			for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
				local29 = arg0.method239();
				if (local29 == 0) {
					this.anIntArray171[local24] = 0;
				} else {
					local41 = arg0.method239();
					this.anIntArray171[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray171[0] == 65535) {
						this.aClass20_2 = Class20.method150(arg0.method241());
						break;
					}
					if (this.anIntArray171[local24] >= 512 && this.anIntArray171[local24] - 512 < Class35.anInt552) {
						local88 = Class35.method370(this.anIntArray171[local24] - 512).anInt563;
						if (local88 != 0) {
							this.anInt631 = local88;
						}
					}
				}
			}
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg0.method239();
				if (local41 < 0 || local41 >= client.anIntArrayArray25[local29].length) {
					local41 = 0;
				}
				this.anIntArray172[local29] = local41;
			}
			super.anInt599 = arg0.method241();
			if (super.anInt599 == 65535) {
				super.anInt599 = -1;
			}
			super.anInt600 = arg0.method241();
			if (super.anInt600 == 65535) {
				super.anInt600 = -1;
			}
			super.anInt579 = arg0.method241();
			if (super.anInt579 == 65535) {
				super.anInt579 = -1;
			}
			super.anInt580 = arg0.method241();
			if (super.anInt580 == 65535) {
				super.anInt580 = -1;
			}
			super.anInt581 = arg0.method241();
			if (super.anInt581 == 65535) {
				super.anInt581 = -1;
			}
			super.anInt582 = arg0.method241();
			if (super.anInt582 == 65535) {
				super.anInt582 = -1;
			}
			super.anInt614 = arg0.method241();
			if (super.anInt614 == 65535) {
				super.anInt614 = -1;
			}
			this.aString16 = Class41.method485(Class41.method482(arg0.method245(), (byte) 7));
			this.anInt628 = arg0.method239();
			this.anInt623 = arg0.method241();
			this.aBoolean145 = true;
			this.aLong21 = 0L;
			local41 = this.anIntArray171[5];
			local88 = this.anIntArray171[9];
			this.anIntArray171[5] = local88;
			this.anIntArray171[9] = local41;
			for (@Pc(248) int local248 = 0; local248 < 12; local248++) {
				this.aLong21 <<= 0x4;
				if (this.anIntArray171[local248] >= 256) {
					this.aLong21 += (long) (this.anIntArray171[local248] - 256);
				}
			}
			if (this.anIntArray171[0] >= 256) {
				this.aLong21 += (long) (this.anIntArray171[0] - 256 >> 4);
			}
			if (this.anIntArray171[1] >= 256) {
				this.aLong21 += (long) (this.anIntArray171[1] - 256 >> 8);
			}
			this.anIntArray171[5] = local41;
			this.anIntArray171[9] = local88;
			for (@Pc(330) int local330 = 0; local330 < 5; local330++) {
				this.aLong21 <<= 0x3;
				this.aLong21 += (long) this.anIntArray172[local330];
			}
			this.aLong21 <<= 0x1;
			this.aLong21 += (long) this.anInt624;
		} catch (@Pc(368) RuntimeException local368) {
			signlink.reporterror("11874, " + arg0 + ", " + 0 + ", " + local368.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPTANZXN", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method381() {
		try {
			return this.aBoolean145;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("11952, " + -40574 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPTANZXN", name = "c", descriptor = "(I)Lclient!FLXAIVEA;")
	private Class6_Sub1_Sub2_Sub2 method383() {
		try {
			if (this.aClass20_2 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt609 >= 0 && super.anInt612 == 0) {
					local6 = Class2.aClass2Array1[super.anInt609].anIntArray10[super.anInt610];
				} else if (super.anInt587 >= 0) {
					local6 = Class2.aClass2Array1[super.anInt587].anIntArray10[super.anInt588];
				}
				return this.aClass20_2.method151((int[]) null, -1, local6);
			}
			@Pc(48) long local48 = this.aLong21;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (super.anInt609 >= 0 && super.anInt612 == 0) {
				@Pc(67) Class2 local67 = Class2.aClass2Array1[super.anInt609];
				local50 = local67.anIntArray10[super.anInt610];
				if (super.anInt587 >= 0 && super.anInt587 != super.anInt599) {
					local52 = Class2.aClass2Array1[super.anInt587].anIntArray10[super.anInt588];
				}
				if (local67.anInt43 >= 0) {
					local54 = local67.anInt43;
					local48 += (long) (local54 - this.anIntArray171[5] << 8);
				}
				if (local67.anInt44 >= 0) {
					local56 = local67.anInt44;
					local48 += (long) (local56 - this.anIntArray171[3] << 16);
				}
			} else if (super.anInt587 >= 0) {
				local50 = Class2.aClass2Array1[super.anInt587].anIntArray10[super.anInt588];
			}
			@Pc(145) Class6_Sub1_Sub2_Sub2 local145 = (Class6_Sub1_Sub2_Sub2) aClass46_9.method529(local48);
			@Pc(157) int local157;
			@Pc(164) int local164;
			if (local145 == null) {
				@Pc(155) boolean local155 = false;
				for (local157 = 0; local157 < 12; local157++) {
					local164 = this.anIntArray171[local157];
					if (local56 >= 0 && local157 == 3) {
						local164 = local56;
					}
					if (local54 >= 0 && local157 == 5) {
						local164 = local54;
					}
					if (local164 >= 256 && local164 < 512 && !Class48.aClass48Array1[local164 - 256].method538()) {
						local155 = true;
					}
					if (local164 >= 512 && !Class35.method370(local164 - 512).method369(this.anInt624)) {
						local155 = true;
					}
				}
				if (local155) {
					if (this.aLong20 != -1L) {
						local145 = (Class6_Sub1_Sub2_Sub2) aClass46_9.method529(this.aLong20);
					}
					if (local145 == null) {
						return null;
					}
				}
			}
			if (local145 == null) {
				@Pc(234) Class6_Sub1_Sub2_Sub2[] local234 = new Class6_Sub1_Sub2_Sub2[12];
				local157 = 0;
				@Pc(245) int local245;
				for (local164 = 0; local164 < 12; local164++) {
					local245 = this.anIntArray171[local164];
					if (local56 >= 0 && local164 == 3) {
						local245 = local56;
					}
					if (local54 >= 0 && local164 == 5) {
						local245 = local54;
					}
					@Pc(274) Class6_Sub1_Sub2_Sub2 local274;
					if (local245 >= 256 && local245 < 512) {
						local274 = Class48.aClass48Array1[local245 - 256].method539(this.anInt615);
						if (local274 != null) {
							local234[local157++] = local274;
						}
					}
					if (local245 >= 512) {
						local274 = Class35.method370(local245 - 512).method364(this.anInt624);
						if (local274 != null) {
							local234[local157++] = local274;
						}
					}
				}
				local145 = new Class6_Sub1_Sub2_Sub2(local157, local234, this.aByte42);
				for (local245 = 0; local245 < 5; local245++) {
					if (this.anIntArray172[local245] != 0) {
						local145.method100(client.anIntArrayArray25[local245][0], client.anIntArrayArray25[local245][this.anIntArray172[local245]]);
						if (local245 == 1) {
							local145.method100(client.anIntArray271[0], client.anIntArray271[this.anIntArray172[local245]]);
						}
					}
				}
				local145.method93();
				local145.method103(64, 850, -30, -50, -30, true);
				aClass46_9.method530(local145, local48);
				this.aLong20 = local48;
			}
			if (this.aBoolean147) {
				return local145;
			}
			@Pc(380) Class6_Sub1_Sub2_Sub2 local380 = Class6_Sub1_Sub2_Sub2.aClass6_Sub1_Sub2_Sub2_1;
			local380.method88(Class27.method185(local50) & Class27.method185(local52), local145);
			if (local50 != -1 && local52 != -1) {
				local380.method95(local52, local50, Class2.aClass2Array1[super.anInt609].anIntArray13);
			} else if (local50 != -1) {
				local380.method94(local50);
			}
			local380.method90();
			local380.anIntArrayArray5 = null;
			local380.anIntArrayArray4 = null;
			return local380;
		} catch (@Pc(428) RuntimeException local428) {
			signlink.reporterror("63708, " + 507 + ", " + local428.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPTANZXN", name = "d", descriptor = "(I)Lclient!FLXAIVEA;")
	public Class6_Sub1_Sub2_Sub2 method384() {
		try {
			if (!this.aBoolean145) {
				return null;
			} else if (this.aClass20_2 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
					@Pc(31) int local31 = this.anIntArray171[local24];
					if (local31 >= 256 && local31 < 512 && !Class48.aClass48Array1[local31 - 256].method540()) {
						local16 = true;
					}
					if (local31 >= 512 && !Class35.method370(local31 - 512).method367(this.anInt624)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(72) Class6_Sub1_Sub2_Sub2[] local72 = new Class6_Sub1_Sub2_Sub2[12];
				@Pc(74) int local74 = 0;
				for (@Pc(76) int local76 = 0; local76 < 12; local76++) {
					@Pc(83) int local83 = this.anIntArray171[local76];
					@Pc(97) Class6_Sub1_Sub2_Sub2 local97;
					if (local83 >= 256 && local83 < 512) {
						local97 = Class48.aClass48Array1[local83 - 256].method541();
						if (local97 != null) {
							local72[local74++] = local97;
						}
					}
					if (local83 >= 512) {
						local97 = Class35.method370(local83 - 512).method361(this.anInt624, 400);
						if (local97 != null) {
							local72[local74++] = local97;
						}
					}
				}
				@Pc(135) Class6_Sub1_Sub2_Sub2 local135 = new Class6_Sub1_Sub2_Sub2(local74, local72, this.aByte42);
				for (@Pc(137) int local137 = 0; local137 < 5; local137++) {
					if (this.anIntArray172[local137] != 0) {
						local135.method100(client.anIntArrayArray25[local137][0], client.anIntArrayArray25[local137][this.anIntArray172[local137]]);
						if (local137 == 1) {
							local135.method100(client.anIntArray271[0], client.anIntArray271[this.anIntArray172[local137]]);
						}
					}
				}
				return local135;
			} else {
				return this.aClass20_2.method152();
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("60793, " + 0 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPTANZXN", name = "a", descriptor = "(B)Lclient!FLXAIVEA;")
	@Override
	protected Class6_Sub1_Sub2_Sub2 method522(@OriginalArg(0) byte arg0) {
		try {
			if (!this.aBoolean145) {
				return null;
			}
			@Pc(10) Class6_Sub1_Sub2_Sub2 local10 = this.method383();
			if (local10 == null) {
				return null;
			}
			super.anInt605 = local10.anInt738;
			local10.aBoolean56 = true;
			if (this.aBoolean147) {
				return local10;
			}
			if (super.anInt592 != -1 && super.anInt593 != -1) {
				@Pc(39) Class28 local39 = Class28.aClass28Array1[super.anInt592];
				@Pc(42) Class6_Sub1_Sub2_Sub2 local42 = local39.method188();
				if (local42 != null) {
					@Pc(56) Class6_Sub1_Sub2_Sub2 local56 = new Class6_Sub1_Sub2_Sub2(local42, Class27.method185(super.anInt593), true, (byte) 8, false);
					local56.method99(0, -super.anInt596, 0);
					local56.method93();
					local56.method94(local39.aClass2_2.anIntArray10[super.anInt593]);
					local56.anIntArrayArray5 = null;
					local56.anIntArrayArray4 = null;
					if (local39.anInt351 != 128 || local39.anInt352 != 128) {
						local56.method102(local39.anInt351, local39.anInt351, local39.anInt352);
					}
					local56.method103(64 + local39.anInt354, 850 + local39.anInt355, -30, -50, -30, true);
					@Pc(124) Class6_Sub1_Sub2_Sub2[] local124 = new Class6_Sub1_Sub2_Sub2[] { local10, local56 };
					local10 = new Class6_Sub1_Sub2_Sub2(2, 0, true, local124);
				}
			}
			if (this.aClass6_Sub1_Sub2_Sub2_2 != null) {
				if (client.anInt1041 >= this.anInt622) {
					this.aClass6_Sub1_Sub2_Sub2_2 = null;
				}
				if (client.anInt1041 >= this.anInt621 && client.anInt1041 < this.anInt622) {
					@Pc(153) Class6_Sub1_Sub2_Sub2 local153 = this.aClass6_Sub1_Sub2_Sub2_2;
					local153.method99(this.anInt627 - super.anInt584, this.anInt626 - this.anInt632, this.anInt625 - super.anInt583);
					if (super.anInt578 == 512) {
						local153.method97();
						local153.method97();
						local153.method97();
					} else if (super.anInt578 == 1024) {
						local153.method97();
						local153.method97();
					} else if (super.anInt578 == 1536) {
						local153.method97();
					}
					@Pc(216) Class6_Sub1_Sub2_Sub2[] local216 = new Class6_Sub1_Sub2_Sub2[] { local10, local153 };
					local10 = new Class6_Sub1_Sub2_Sub2(2, 0, true, local216);
					if (super.anInt578 == 512) {
						local153.method97();
					} else if (super.anInt578 == 1024) {
						local153.method97();
						local153.method97();
					} else if (super.anInt578 == 1536) {
						local153.method97();
						local153.method97();
						local153.method97();
					}
					local153.method99(super.anInt584 - this.anInt627, this.anInt632 - this.anInt626, super.anInt583 - this.anInt625);
				}
			}
			local10.aBoolean56 = true;
			if (2 == this.aByte41) {
				@Pc(285) boolean local285 = false;
			} else {
				this.aBoolean146 = !this.aBoolean146;
			}
			return local10;
		} catch (@Pc(298) RuntimeException local298) {
			signlink.reporterror("41667, " + arg0 + ", " + local298.toString());
			throw new RuntimeException();
		}
	}
}
