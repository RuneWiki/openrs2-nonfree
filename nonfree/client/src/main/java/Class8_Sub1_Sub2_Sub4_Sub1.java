import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PASMQFXV")
public final class Class8_Sub1_Sub2_Sub4_Sub1 extends Class8_Sub1_Sub2_Sub4 {

	@OriginalMember(owner = "client!PASMQFXV", name = "Rb", descriptor = "Lclient!HGKRJZKS;")
	public static Class18 aClass18_4 = new Class18(0, 260);

	@OriginalMember(owner = "client!PASMQFXV", name = "pb", descriptor = "Ljava/lang/String;")
	public String aString8;

	@OriginalMember(owner = "client!PASMQFXV", name = "qb", descriptor = "I")
	public int anInt517;

	@OriginalMember(owner = "client!PASMQFXV", name = "rb", descriptor = "J")
	private long aLong21;

	@OriginalMember(owner = "client!PASMQFXV", name = "ub", descriptor = "I")
	public int anInt519;

	@OriginalMember(owner = "client!PASMQFXV", name = "vb", descriptor = "I")
	public int anInt520;

	@OriginalMember(owner = "client!PASMQFXV", name = "wb", descriptor = "I")
	public int anInt521;

	@OriginalMember(owner = "client!PASMQFXV", name = "xb", descriptor = "I")
	public int anInt522;

	@OriginalMember(owner = "client!PASMQFXV", name = "yb", descriptor = "I")
	public int anInt523;

	@OriginalMember(owner = "client!PASMQFXV", name = "Bb", descriptor = "I")
	public int anInt524;

	@OriginalMember(owner = "client!PASMQFXV", name = "Cb", descriptor = "I")
	private int anInt525;

	@OriginalMember(owner = "client!PASMQFXV", name = "Fb", descriptor = "Lclient!LPTCUHOU;")
	public Class26 aClass26_1;

	@OriginalMember(owner = "client!PASMQFXV", name = "Gb", descriptor = "I")
	public int anInt526;

	@OriginalMember(owner = "client!PASMQFXV", name = "Hb", descriptor = "I")
	public int anInt527;

	@OriginalMember(owner = "client!PASMQFXV", name = "Ib", descriptor = "I")
	public int anInt528;

	@OriginalMember(owner = "client!PASMQFXV", name = "Jb", descriptor = "I")
	public int anInt529;

	@OriginalMember(owner = "client!PASMQFXV", name = "Kb", descriptor = "I")
	public int anInt530;

	@OriginalMember(owner = "client!PASMQFXV", name = "Lb", descriptor = "Lclient!VHYCWIPJ;")
	public Class8_Sub1_Sub2_Sub5 aClass8_Sub1_Sub2_Sub5_1;

	@OriginalMember(owner = "client!PASMQFXV", name = "Pb", descriptor = "I")
	public int anInt531;

	@OriginalMember(owner = "client!PASMQFXV", name = "Qb", descriptor = "I")
	public int anInt532;

	@OriginalMember(owner = "client!PASMQFXV", name = "sb", descriptor = "I")
	private int anInt518 = -938;

	@OriginalMember(owner = "client!PASMQFXV", name = "tb", descriptor = "[I")
	public int[] anIntArray75 = new int[12];

	@OriginalMember(owner = "client!PASMQFXV", name = "zb", descriptor = "Z")
	private boolean aBoolean118 = false;

	@OriginalMember(owner = "client!PASMQFXV", name = "Ab", descriptor = "Z")
	public boolean aBoolean119 = false;

	@OriginalMember(owner = "client!PASMQFXV", name = "Db", descriptor = "B")
	private byte aByte21 = 1;

	@OriginalMember(owner = "client!PASMQFXV", name = "Eb", descriptor = "J")
	private long aLong22 = -1L;

	@OriginalMember(owner = "client!PASMQFXV", name = "Mb", descriptor = "Z")
	public boolean aBoolean120 = false;

	@OriginalMember(owner = "client!PASMQFXV", name = "Nb", descriptor = "[I")
	public int[] anIntArray76 = new int[5];

	@OriginalMember(owner = "client!PASMQFXV", name = "Ob", descriptor = "B")
	private byte aByte22 = 2;

	@OriginalMember(owner = "client!PASMQFXV", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method378(@OriginalArg(0) byte arg0) {
		try {
			return this.aBoolean119;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("28914, " + 4 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PASMQFXV", name = "a", descriptor = "(I)Lclient!VHYCWIPJ;")
	@Override
	protected Class8_Sub1_Sub2_Sub5 method557() {
		try {
			if (!this.aBoolean119) {
				return null;
			}
			@Pc(10) Class8_Sub1_Sub2_Sub5 local10 = this.method370();
			if (local10 == null) {
				return null;
			}
			super.anInt544 = local10.anInt788;
			local10.aBoolean160 = true;
			if (this.aBoolean120) {
				return local10;
			}
			if (super.anInt551 != -1 && super.anInt552 != -1) {
				@Pc(39) Class44 local39 = Class44.aClass44Array1[super.anInt551];
				@Pc(42) Class8_Sub1_Sub2_Sub5 local42 = local39.method551();
				if (local42 != null) {
					@Pc(57) Class8_Sub1_Sub2_Sub5 local57 = new Class8_Sub1_Sub2_Sub5((byte) 9, Class35.method448(super.anInt552, this.aByte21), true, false, local42);
					local57.method476(0, 0, -super.anInt555);
					local57.method470();
					local57.method471(local39.aClass40_1.anIntArray159[super.anInt552]);
					local57.anIntArrayArray16 = null;
					local57.anIntArrayArray15 = null;
					if (local39.anInt780 != 128 || local39.anInt781 != 128) {
						local57.method479(this.aBoolean118, local39.anInt780, local39.anInt780, local39.anInt781);
					}
					local57.method480(local39.anInt783 + 64, local39.anInt784 + 850, -30, -50, -30, true);
					@Pc(126) Class8_Sub1_Sub2_Sub5[] local126 = new Class8_Sub1_Sub2_Sub5[] { local10, local57 };
					local10 = new Class8_Sub1_Sub2_Sub5(2, true, 7, local126);
				}
			}
			if (this.aClass8_Sub1_Sub2_Sub5_1 != null) {
				if (client.anInt927 >= this.anInt527) {
					this.aClass8_Sub1_Sub2_Sub5_1 = null;
				}
				if (client.anInt927 >= this.anInt526 && client.anInt927 < this.anInt527) {
					@Pc(155) Class8_Sub1_Sub2_Sub5 local155 = this.aClass8_Sub1_Sub2_Sub5_1;
					local155.method476(this.anInt530 - super.anInt563, this.anInt528 - super.anInt562, this.anInt529 - this.anInt531);
					if (super.anInt559 == 512) {
						local155.method474();
						local155.method474();
						local155.method474();
					} else if (super.anInt559 == 1024) {
						local155.method474();
						local155.method474();
					} else if (super.anInt559 == 1536) {
						local155.method474();
					}
					@Pc(218) Class8_Sub1_Sub2_Sub5[] local218 = new Class8_Sub1_Sub2_Sub5[] { local10, local155 };
					local10 = new Class8_Sub1_Sub2_Sub5(2, true, 7, local218);
					if (super.anInt559 == 512) {
						local155.method474();
					} else if (super.anInt559 == 1024) {
						local155.method474();
						local155.method474();
					} else if (super.anInt559 == 1536) {
						local155.method474();
						local155.method474();
						local155.method474();
					}
					local155.method476(super.anInt563 - this.anInt530, super.anInt562 - this.anInt528, this.anInt531 - this.anInt529);
				}
			}
			local10.aBoolean160 = true;
			return local10;
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("80027, " + -650 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PASMQFXV", name = "a", descriptor = "(ILclient!GLMIQHJI;)V")
	public void method368(@OriginalArg(1) Class8_Sub1_Sub3 arg0) {
		try {
			arg0.anInt253 = 0;
			this.anInt525 = arg0.method165();
			this.anInt524 = arg0.method165();
			this.aClass26_1 = null;
			this.anInt523 = 0;
			@Pc(25) int local25;
			@Pc(37) int local37;
			@Pc(84) int local84;
			for (@Pc(20) int local20 = 0; local20 < 12; local20++) {
				local25 = arg0.method165();
				if (local25 == 0) {
					this.anIntArray75[local20] = 0;
				} else {
					local37 = arg0.method165();
					this.anIntArray75[local20] = (local25 << 8) + local37;
					if (local20 == 0 && this.anIntArray75[0] == 65535) {
						this.aClass26_1 = Class26.method320(arg0.method167());
						break;
					}
					if (this.anIntArray75[local20] >= 512 && this.anIntArray75[local20] - 512 < Class2.anInt4) {
						local84 = Class2.method4(this.anIntArray75[local20] - 512).anInt30;
						if (local84 != 0) {
							this.anInt523 = local84;
						}
					}
				}
			}
			for (local25 = 0; local25 < 5; local25++) {
				local37 = arg0.method165();
				if (local37 < 0 || local37 >= client.anIntArrayArray25[local25].length) {
					local37 = 0;
				}
				this.anIntArray76[local25] = local37;
			}
			super.anInt546 = arg0.method167();
			if (super.anInt546 == 65535) {
				super.anInt546 = -1;
			}
			super.anInt547 = arg0.method167();
			if (super.anInt547 == 65535) {
				super.anInt547 = -1;
			}
			super.anInt572 = arg0.method167();
			if (super.anInt572 == 65535) {
				super.anInt572 = -1;
			}
			super.anInt573 = arg0.method167();
			if (super.anInt573 == 65535) {
				super.anInt573 = -1;
			}
			super.anInt574 = arg0.method167();
			if (super.anInt574 == 65535) {
				super.anInt574 = -1;
			}
			super.anInt575 = arg0.method167();
			if (super.anInt575 == 65535) {
				super.anInt575 = -1;
			}
			super.anInt576 = arg0.method167();
			if (super.anInt576 == 65535) {
				super.anInt576 = -1;
			}
			this.aString8 = Class48.method563(Class48.method560(arg0.method171()));
			this.anInt532 = arg0.method165();
			this.anInt517 = arg0.method167();
			this.aBoolean119 = true;
			this.aLong21 = 0L;
			for (local37 = 0; local37 < 12; local37++) {
				this.aLong21 <<= 0x4;
				if (this.anIntArray75[local37] >= 256) {
					this.aLong21 += this.anIntArray75[local37] - 256;
				}
			}
			if (this.anIntArray75[0] >= 256) {
				this.aLong21 += this.anIntArray75[0] - 256 >> 4;
			}
			if (this.anIntArray75[1] >= 256) {
				this.aLong21 += this.anIntArray75[1] - 256 >> 8;
			}
			for (local84 = 0; local84 < 5; local84++) {
				this.aLong21 <<= 0x3;
				this.aLong21 += this.anIntArray76[local84];
			}
			this.aLong21 <<= 0x1;
			this.aLong21 += this.anInt525;
		} catch (@Pc(340) RuntimeException local340) {
			signlink.reporterror("44453, " + 0 + ", " + arg0 + ", " + local340.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PASMQFXV", name = "b", descriptor = "(I)Lclient!VHYCWIPJ;")
	public Class8_Sub1_Sub2_Sub5 method369() {
		try {
			if (!this.aBoolean119) {
				return null;
			} else if (this.aClass26_1 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray75[local18];
					if (local25 >= 256 && local25 < 512 && !Class14.aClass14Array1[local25 - 256].method144()) {
						local16 = true;
					}
					if (local25 >= 512 && !Class2.method4(local25 - 512).method8(this.anInt525)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(66) Class8_Sub1_Sub2_Sub5[] local66 = new Class8_Sub1_Sub2_Sub5[12];
				@Pc(75) int local75 = 0;
				for (@Pc(77) int local77 = 0; local77 < 12; local77++) {
					@Pc(84) int local84 = this.anIntArray75[local77];
					@Pc(98) Class8_Sub1_Sub2_Sub5 local98;
					if (local84 >= 256 && local84 < 512) {
						local98 = Class14.aClass14Array1[local84 - 256].method145();
						if (local98 != null) {
							local66[local75++] = local98;
						}
					}
					if (local84 >= 512) {
						local98 = Class2.method4(local84 - 512).method9(this.anInt525);
						if (local98 != null) {
							local66[local75++] = local98;
						}
					}
				}
				@Pc(135) Class8_Sub1_Sub2_Sub5 local135 = new Class8_Sub1_Sub2_Sub5(local75, local66, -11616);
				for (@Pc(137) int local137 = 0; local137 < 5; local137++) {
					if (this.anIntArray76[local137] != 0) {
						local135.method477(client.anIntArrayArray25[local137][0], client.anIntArrayArray25[local137][this.anIntArray76[local137]]);
						if (local137 == 1) {
							local135.method477(client.anIntArray222[0], client.anIntArray222[this.anIntArray76[local137]]);
						}
					}
				}
				return local135;
			} else {
				return this.aClass26_1.method318();
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("83512, " + -23473 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PASMQFXV", name = "c", descriptor = "(I)Lclient!VHYCWIPJ;")
	private Class8_Sub1_Sub2_Sub5 method370() {
		try {
			if (this.aClass26_1 != null) {
				@Pc(18) int local18 = -1;
				if (super.anInt578 >= 0 && super.anInt581 == 0) {
					local18 = Class40.aClass40Array1[super.anInt578].anIntArray159[super.anInt579];
				} else if (super.anInt587 >= 0) {
					local18 = Class40.aClass40Array1[super.anInt587].anIntArray159[super.anInt588];
				}
				return this.aClass26_1.method322(null, -1, local18);
			}
			@Pc(60) long local60 = this.aLong21;
			@Pc(62) int local62 = -1;
			@Pc(64) int local64 = -1;
			@Pc(66) int local66 = -1;
			@Pc(68) int local68 = -1;
			if (super.anInt578 >= 0 && super.anInt581 == 0) {
				@Pc(79) Class40 local79 = Class40.aClass40Array1[super.anInt578];
				local62 = local79.anIntArray159[super.anInt579];
				if (super.anInt587 >= 0 && super.anInt587 != super.anInt546) {
					local64 = Class40.aClass40Array1[super.anInt587].anIntArray159[super.anInt588];
				}
				if (local79.anInt756 >= 0) {
					local66 = local79.anInt756;
					local60 += local66 - this.anIntArray75[5] << 8;
				}
				if (local79.anInt757 >= 0) {
					local68 = local79.anInt757;
					local60 += local68 - this.anIntArray75[3] << 16;
				}
			} else if (super.anInt587 >= 0) {
				local62 = Class40.aClass40Array1[super.anInt587].anIntArray159[super.anInt588];
			}
			@Pc(157) Class8_Sub1_Sub2_Sub5 local157 = (Class8_Sub1_Sub2_Sub5) aClass18_4.method207(local60);
			@Pc(163) int local163;
			@Pc(170) int local170;
			if (local157 == null) {
				@Pc(161) boolean local161 = false;
				for (local163 = 0; local163 < 12; local163++) {
					local170 = this.anIntArray75[local163];
					if (local68 >= 0 && local163 == 3) {
						local170 = local68;
					}
					if (local66 >= 0 && local163 == 5) {
						local170 = local66;
					}
					if (local170 >= 256 && local170 < 512 && !Class14.aClass14Array1[local170 - 256].method142(this.aByte22)) {
						local161 = true;
					}
					if (local170 >= 512 && !Class2.method4(local170 - 512).method10(this.anInt525)) {
						local161 = true;
					}
				}
				if (local161) {
					if (this.aLong22 != -1L) {
						local157 = (Class8_Sub1_Sub2_Sub5) aClass18_4.method207(this.aLong22);
					}
					if (local157 == null) {
						return null;
					}
				}
			}
			if (local157 == null) {
				@Pc(241) Class8_Sub1_Sub2_Sub5[] local241 = new Class8_Sub1_Sub2_Sub5[12];
				local163 = 0;
				@Pc(252) int local252;
				for (local170 = 0; local170 < 12; local170++) {
					local252 = this.anIntArray75[local170];
					if (local68 >= 0 && local170 == 3) {
						local252 = local68;
					}
					if (local66 >= 0 && local170 == 5) {
						local252 = local66;
					}
					@Pc(280) Class8_Sub1_Sub2_Sub5 local280;
					if (local252 >= 256 && local252 < 512) {
						local280 = Class14.aClass14Array1[local252 - 256].method143();
						if (local280 != null) {
							local241[local163++] = local280;
						}
					}
					if (local252 >= 512) {
						local280 = Class2.method4(local252 - 512).method2(this.anInt525);
						if (local280 != null) {
							local241[local163++] = local280;
						}
					}
				}
				local157 = new Class8_Sub1_Sub2_Sub5(local163, local241, -11616);
				for (local252 = 0; local252 < 5; local252++) {
					if (this.anIntArray76[local252] != 0) {
						local157.method477(client.anIntArrayArray25[local252][0], client.anIntArrayArray25[local252][this.anIntArray76[local252]]);
						if (local252 == 1) {
							local157.method477(client.anIntArray222[0], client.anIntArray222[this.anIntArray76[local252]]);
						}
					}
				}
				local157.method470();
				local157.method480(64, 850, -30, -50, -30, true);
				aClass18_4.method208(local60, local157);
				this.aLong22 = local60;
			}
			if (this.aBoolean120) {
				return local157;
			}
			@Pc(385) Class8_Sub1_Sub2_Sub5 local385 = Class8_Sub1_Sub2_Sub5.aClass8_Sub1_Sub2_Sub5_2;
			local385.method465(local157, Class35.method448(local62, this.aByte21) & Class35.method448(local64, this.aByte21));
			if (local62 != -1 && local64 != -1) {
				local385.method472(local62, Class40.aClass40Array1[super.anInt578].anIntArray162, local64);
			} else if (local62 != -1) {
				local385.method471(local62);
			}
			local385.method467();
			local385.anIntArrayArray16 = null;
			local385.anIntArrayArray15 = null;
			return local385;
		} catch (@Pc(435) RuntimeException local435) {
			signlink.reporterror("77159, " + -938 + ", " + local435.toString());
			throw new RuntimeException();
		}
	}
}
