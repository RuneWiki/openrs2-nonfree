import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TINBLEHZ")
public final class Class2_Sub1_Sub1_Sub2_Sub1 extends Class2_Sub1_Sub1_Sub2 {

	@OriginalMember(owner = "client!TINBLEHZ", name = "zb", descriptor = "Lclient!LXKBDSHJ;")
	public static Class25 aClass25_8 = new Class25((byte) 0, 260);

	@OriginalMember(owner = "client!TINBLEHZ", name = "pb", descriptor = "I")
	public int anInt648;

	@OriginalMember(owner = "client!TINBLEHZ", name = "qb", descriptor = "I")
	public int anInt649;

	@OriginalMember(owner = "client!TINBLEHZ", name = "rb", descriptor = "I")
	public int anInt650;

	@OriginalMember(owner = "client!TINBLEHZ", name = "sb", descriptor = "I")
	public int anInt651;

	@OriginalMember(owner = "client!TINBLEHZ", name = "ub", descriptor = "I")
	public int anInt652;

	@OriginalMember(owner = "client!TINBLEHZ", name = "vb", descriptor = "I")
	public int anInt653;

	@OriginalMember(owner = "client!TINBLEHZ", name = "wb", descriptor = "I")
	private int anInt654;

	@OriginalMember(owner = "client!TINBLEHZ", name = "xb", descriptor = "I")
	public int anInt655;

	@OriginalMember(owner = "client!TINBLEHZ", name = "yb", descriptor = "J")
	private long aLong23;

	@OriginalMember(owner = "client!TINBLEHZ", name = "Ab", descriptor = "I")
	private int anInt656;

	@OriginalMember(owner = "client!TINBLEHZ", name = "Db", descriptor = "I")
	public int anInt657;

	@OriginalMember(owner = "client!TINBLEHZ", name = "Gb", descriptor = "I")
	public int anInt658;

	@OriginalMember(owner = "client!TINBLEHZ", name = "Hb", descriptor = "I")
	public int anInt659;

	@OriginalMember(owner = "client!TINBLEHZ", name = "Ib", descriptor = "I")
	public int anInt660;

	@OriginalMember(owner = "client!TINBLEHZ", name = "Jb", descriptor = "Lclient!OGORHYVW;")
	public Class2_Sub1_Sub1_Sub6 aClass2_Sub1_Sub1_Sub6_2;

	@OriginalMember(owner = "client!TINBLEHZ", name = "Kb", descriptor = "I")
	public int anInt661;

	@OriginalMember(owner = "client!TINBLEHZ", name = "Lb", descriptor = "Lclient!YXSRFNQD;")
	public Class48 aClass48_1;

	@OriginalMember(owner = "client!TINBLEHZ", name = "Nb", descriptor = "I")
	public int anInt663;

	@OriginalMember(owner = "client!TINBLEHZ", name = "Qb", descriptor = "Ljava/lang/String;")
	public String aString13;

	@OriginalMember(owner = "client!TINBLEHZ", name = "tb", descriptor = "J")
	private long aLong22 = -1L;

	@OriginalMember(owner = "client!TINBLEHZ", name = "Bb", descriptor = "[I")
	public int[] anIntArray193 = new int[5];

	@OriginalMember(owner = "client!TINBLEHZ", name = "Cb", descriptor = "Z")
	public boolean aBoolean167 = false;

	@OriginalMember(owner = "client!TINBLEHZ", name = "Eb", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!TINBLEHZ", name = "Fb", descriptor = "[I")
	public int[] anIntArray194 = new int[12];

	@OriginalMember(owner = "client!TINBLEHZ", name = "Mb", descriptor = "I")
	public int anInt662 = -1;

	@OriginalMember(owner = "client!TINBLEHZ", name = "Ob", descriptor = "I")
	public int anInt664 = -1;

	@OriginalMember(owner = "client!TINBLEHZ", name = "Pb", descriptor = "Z")
	public boolean aBoolean169 = false;

	@OriginalMember(owner = "client!TINBLEHZ", name = "a", descriptor = "(B)Lclient!OGORHYVW;")
	private Class2_Sub1_Sub1_Sub6 method475() {
		try {
			if (this.aClass48_1 != null) {
				@Pc(17) int local17 = -1;
				if (super.anInt791 >= 0 && super.anInt794 == 0) {
					local17 = Class22.aClass22Array1[super.anInt791].anIntArray92[super.anInt792];
				} else if (super.anInt797 >= 0) {
					local17 = Class22.aClass22Array1[super.anInt797].anIntArray92[super.anInt798];
				}
				return this.aClass48_1.method557(null, -1, local17);
			}
			@Pc(59) long local59 = this.aLong23;
			@Pc(61) int local61 = -1;
			@Pc(63) int local63 = -1;
			@Pc(65) int local65 = -1;
			@Pc(67) int local67 = -1;
			if (super.anInt791 >= 0 && super.anInt794 == 0) {
				@Pc(78) Class22 local78 = Class22.aClass22Array1[super.anInt791];
				local61 = local78.anIntArray92[super.anInt792];
				if (super.anInt797 >= 0 && super.anInt797 != super.anInt804) {
					local63 = Class22.aClass22Array1[super.anInt797].anIntArray92[super.anInt798];
				}
				if (local78.anInt375 >= 0) {
					local65 = local78.anInt375;
					local59 += local65 - this.anIntArray194[5] << 8;
				}
				if (local78.anInt376 >= 0) {
					local67 = local78.anInt376;
					local59 += local67 - this.anIntArray194[3] << 16;
				}
			} else if (super.anInt797 >= 0) {
				local61 = Class22.aClass22Array1[super.anInt797].anIntArray92[super.anInt798];
			}
			@Pc(156) Class2_Sub1_Sub1_Sub6 local156 = (Class2_Sub1_Sub1_Sub6) aClass25_8.method347(local59);
			@Pc(162) int local162;
			@Pc(169) int local169;
			if (local156 == null) {
				@Pc(160) boolean local160 = false;
				for (local162 = 0; local162 < 12; local162++) {
					local169 = this.anIntArray194[local162];
					if (local67 >= 0 && local162 == 3) {
						local169 = local67;
					}
					if (local65 >= 0 && local162 == 5) {
						local169 = local65;
					}
					if (local169 >= 256 && local169 < 512 && !Class27.aClass27Array1[local169 - 256].method373()) {
						local160 = true;
					}
					if (local169 >= 512 && !Class36.method434(local169 - 512).method440(this.anInt654)) {
						local160 = true;
					}
				}
				if (local160) {
					if (this.aLong22 != -1L) {
						local156 = (Class2_Sub1_Sub1_Sub6) aClass25_8.method347(this.aLong22);
					}
					if (local156 == null) {
						return null;
					}
				}
			}
			if (local156 == null) {
				@Pc(239) Class2_Sub1_Sub1_Sub6[] local239 = new Class2_Sub1_Sub1_Sub6[12];
				local162 = 0;
				@Pc(250) int local250;
				for (local169 = 0; local169 < 12; local169++) {
					local250 = this.anIntArray194[local169];
					if (local67 >= 0 && local169 == 3) {
						local250 = local67;
					}
					if (local65 >= 0 && local169 == 5) {
						local250 = local65;
					}
					@Pc(278) Class2_Sub1_Sub1_Sub6 local278;
					if (local250 >= 256 && local250 < 512) {
						local278 = Class27.aClass27Array1[local250 - 256].method374();
						if (local278 != null) {
							local239[local162++] = local278;
						}
					}
					if (local250 >= 512) {
						local278 = Class36.method434(local250 - 512).method441(121, this.anInt654);
						if (local278 != null) {
							local239[local162++] = local278;
						}
					}
				}
				local156 = new Class2_Sub1_Sub1_Sub6(local162, (byte) -112, local239);
				for (local250 = 0; local250 < 5; local250++) {
					if (this.anIntArray193[local250] != 0) {
						local156.method399(client.anIntArrayArray22[local250][0], client.anIntArrayArray22[local250][this.anIntArray193[local250]]);
						if (local250 == 1) {
							local156.method399(client.anIntArray223[0], client.anIntArray223[this.anIntArray193[local250]]);
						}
					}
				}
				local156.method392();
				local156.method402(64, 850, -30, -50, -30, true);
				aClass25_8.method348(local156, local59);
				this.aLong22 = local59;
			}
			if (this.aBoolean169) {
				return local156;
			}
			@Pc(383) Class2_Sub1_Sub1_Sub6 local383 = Class2_Sub1_Sub1_Sub6.aClass2_Sub1_Sub1_Sub6_1;
			local383.method387(local156, Class29.method419(local61) & Class29.method419(local63));
			if (local61 != -1 && local63 != -1) {
				local383.method394(Class22.aClass22Array1[super.anInt791].anIntArray95, local61, (byte) 1, local63);
			} else if (local61 != -1) {
				local383.method393((byte) 9, local61);
			}
			local383.method389();
			local383.anIntArrayArray16 = null;
			local383.anIntArrayArray15 = null;
			return local383;
		} catch (@Pc(431) RuntimeException local431) {
			signlink.reporterror("63025, " + -94 + ", " + local431.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TINBLEHZ", name = "b", descriptor = "(B)Lclient!OGORHYVW;")
	public Class2_Sub1_Sub1_Sub6 method476() {
		try {
			if (!this.aBoolean167) {
				return null;
			} else if (this.aClass48_1 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray194[local18];
					if (local25 >= 256 && local25 < 512 && !Class27.aClass27Array1[local25 - 256].method375()) {
						local16 = true;
					}
					if (local25 >= 512 && !Class36.method434(local25 - 512).method436(this.anInt654)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(66) Class2_Sub1_Sub1_Sub6[] local66 = new Class2_Sub1_Sub1_Sub6[12];
				@Pc(68) int local68 = 0;
				for (@Pc(70) int local70 = 0; local70 < 12; local70++) {
					@Pc(77) int local77 = this.anIntArray194[local70];
					@Pc(91) Class2_Sub1_Sub1_Sub6 local91;
					if (local77 >= 256 && local77 < 512) {
						local91 = Class27.aClass27Array1[local77 - 256].method376();
						if (local91 != null) {
							local66[local68++] = local91;
						}
					}
					if (local77 >= 512) {
						local91 = Class36.method434(local77 - 512).method443(this.anInt654);
						if (local91 != null) {
							local66[local68++] = local91;
						}
					}
				}
				@Pc(128) Class2_Sub1_Sub1_Sub6 local128 = new Class2_Sub1_Sub1_Sub6(local68, (byte) -112, local66);
				for (@Pc(130) int local130 = 0; local130 < 5; local130++) {
					if (this.anIntArray193[local130] != 0) {
						local128.method399(client.anIntArrayArray22[local130][0], client.anIntArrayArray22[local130][this.anIntArray193[local130]]);
						if (local130 == 1) {
							local128.method399(client.anIntArray223[0], client.anIntArray223[this.anIntArray193[local130]]);
						}
					}
				}
				return local128;
			} else {
				return this.aClass48_1.method558();
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("24679, " + 71 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TINBLEHZ", name = "a", descriptor = "(I)Lclient!OGORHYVW;")
	@Override
	protected Class2_Sub1_Sub1_Sub6 method565() {
		try {
			if (!this.aBoolean167) {
				return null;
			}
			@Pc(10) Class2_Sub1_Sub1_Sub6 local10 = this.method475();
			if (local10 == null) {
				return null;
			}
			super.anInt800 = local10.anInt767;
			local10.aBoolean129 = true;
			if (this.aBoolean169) {
				return local10;
			}
			if (super.anInt768 != -1 && super.anInt769 != -1) {
				@Pc(39) Class16 local39 = Class16.aClass16Array1[super.anInt768];
				@Pc(42) Class2_Sub1_Sub1_Sub6 local42 = local39.method151();
				if (local42 != null) {
					@Pc(56) Class2_Sub1_Sub1_Sub6 local56 = new Class2_Sub1_Sub1_Sub6(-18434, true, local42, Class29.method419(super.anInt769), false);
					local56.method398(-super.anInt772, this.anInt656, 0, 0);
					local56.method392();
					local56.method393((byte) 9, local39.aClass22_2.anIntArray92[super.anInt769]);
					local56.anIntArrayArray16 = null;
					local56.anIntArrayArray15 = null;
					if (local39.anInt241 != 128 || local39.anInt242 != 128) {
						local56.method401(local39.anInt241, local39.anInt241, local39.anInt242);
					}
					local56.method402(local39.anInt244 + 64, local39.anInt245 + 850, -30, -50, -30, true);
					@Pc(125) Class2_Sub1_Sub1_Sub6[] local125 = new Class2_Sub1_Sub1_Sub6[] { local10, local56 };
					local10 = new Class2_Sub1_Sub1_Sub6(2, true, 0, local125);
				}
			}
			if (this.aClass2_Sub1_Sub1_Sub6_2 != null) {
				if (client.anInt993 >= this.anInt653) {
					this.aClass2_Sub1_Sub1_Sub6_2 = null;
				}
				if (client.anInt993 >= this.anInt652 && client.anInt993 < this.anInt653) {
					@Pc(154) Class2_Sub1_Sub1_Sub6 local154 = this.aClass2_Sub1_Sub1_Sub6_2;
					local154.method398(this.anInt659 - this.anInt663, this.anInt656, this.anInt658 - super.anInt778, this.anInt660 - super.anInt779);
					if (super.anInt814 == 512) {
						local154.method396();
						local154.method396();
						local154.method396();
					} else if (super.anInt814 == 1024) {
						local154.method396();
						local154.method396();
					} else if (super.anInt814 == 1536) {
						local154.method396();
					}
					@Pc(218) Class2_Sub1_Sub1_Sub6[] local218 = new Class2_Sub1_Sub1_Sub6[] { local10, local154 };
					local10 = new Class2_Sub1_Sub1_Sub6(2, true, 0, local218);
					if (super.anInt814 == 512) {
						local154.method396();
					} else if (super.anInt814 == 1024) {
						local154.method396();
						local154.method396();
					} else if (super.anInt814 == 1536) {
						local154.method396();
						local154.method396();
						local154.method396();
					}
					local154.method398(this.anInt663 - this.anInt659, this.anInt656, super.anInt778 - this.anInt658, super.anInt779 - this.anInt660);
				}
			}
			local10.aBoolean129 = true;
			return local10;
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("55284, " + 0 + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TINBLEHZ", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method568(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				throw new NullPointerException();
			}
			return this.aBoolean167;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("68541, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TINBLEHZ", name = "a", descriptor = "(Lclient!TKPFKOXP;I)V")
	public void method477(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			arg0.anInt672 = 0;
			this.anInt654 = arg0.method492();
			this.anInt664 = arg0.method493();
			this.anInt662 = arg0.method493();
			this.aClass48_1 = null;
			this.anInt655 = 0;
			@Pc(29) int local29;
			@Pc(41) int local41;
			@Pc(88) int local88;
			for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
				local29 = arg0.method492();
				if (local29 == 0) {
					this.anIntArray194[local24] = 0;
				} else {
					local41 = arg0.method492();
					this.anIntArray194[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray194[0] == 65535) {
						this.aClass48_1 = Class48.method560(arg0.method494());
						break;
					}
					if (this.anIntArray194[local24] >= 512 && this.anIntArray194[local24] - 512 < Class36.anInt543) {
						local88 = Class36.method434(this.anIntArray194[local24] - 512).anInt554;
						if (local88 != 0) {
							this.anInt655 = local88;
						}
					}
				}
			}
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg0.method492();
				if (local41 < 0 || local41 >= client.anIntArrayArray22[local29].length) {
					local41 = 0;
				}
				this.anIntArray193[local29] = local41;
			}
			super.anInt804 = arg0.method494();
			if (super.anInt804 == 65535) {
				super.anInt804 = -1;
			}
			super.anInt805 = arg0.method494();
			if (super.anInt805 == 65535) {
				super.anInt805 = -1;
			}
			super.anInt773 = arg0.method494();
			if (super.anInt773 == 65535) {
				super.anInt773 = -1;
			}
			super.anInt774 = arg0.method494();
			if (super.anInt774 == 65535) {
				super.anInt774 = -1;
			}
			super.anInt775 = arg0.method494();
			if (super.anInt775 == 65535) {
				super.anInt775 = -1;
			}
			super.anInt776 = arg0.method494();
			if (super.anInt776 == 65535) {
				super.anInt776 = -1;
			}
			super.anInt803 = arg0.method494();
			if (super.anInt803 == 65535) {
				super.anInt803 = -1;
			}
			this.aString13 = Class7.method59(Class7.method56(arg0.method498()));
			this.anInt661 = arg0.method492();
			this.anInt657 = arg0.method494();
			this.aBoolean167 = true;
			this.aLong23 = 0L;
			local41 = this.anIntArray194[5];
			local88 = this.anIntArray194[9];
			this.anIntArray194[5] = local88;
			this.anIntArray194[9] = local41;
			for (@Pc(256) int local256 = 0; local256 < 12; local256++) {
				this.aLong23 <<= 0x4;
				if (this.anIntArray194[local256] >= 256) {
					this.aLong23 += this.anIntArray194[local256] - 256;
				}
			}
			if (this.anIntArray194[0] >= 256) {
				this.aLong23 += this.anIntArray194[0] - 256 >> 4;
			}
			if (this.anIntArray194[1] >= 256) {
				this.aLong23 += this.anIntArray194[1] - 256 >> 8;
			}
			this.anIntArray194[5] = local41;
			this.anIntArray194[9] = local88;
			for (@Pc(338) int local338 = 0; local338 < 5; local338++) {
				this.aLong23 <<= 0x3;
				this.aLong23 += this.anIntArray193[local338];
			}
			this.aLong23 <<= 0x1;
			this.aLong23 += this.anInt654;
		} catch (@Pc(376) RuntimeException local376) {
			signlink.reporterror("31865, " + arg0 + ", " + -43453 + ", " + local376.toString());
			throw new RuntimeException();
		}
	}
}
