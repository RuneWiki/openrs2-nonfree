import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "Tb", descriptor = "Lclient!s;")
	public static Class40 aClass40_1 = new Class40(false, 260);

	@OriginalMember(owner = "client!ab", name = "tb", descriptor = "I")
	private int anInt127;

	@OriginalMember(owner = "client!ab", name = "vb", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!ab", name = "xb", descriptor = "I")
	private int anInt128;

	@OriginalMember(owner = "client!ab", name = "yb", descriptor = "I")
	public int anInt129;

	@OriginalMember(owner = "client!ab", name = "Bb", descriptor = "I")
	public int anInt130;

	@OriginalMember(owner = "client!ab", name = "Cb", descriptor = "I")
	public int anInt131;

	@OriginalMember(owner = "client!ab", name = "Db", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!ab", name = "Eb", descriptor = "I")
	public int anInt132;

	@OriginalMember(owner = "client!ab", name = "Fb", descriptor = "I")
	public int anInt133;

	@OriginalMember(owner = "client!ab", name = "Gb", descriptor = "I")
	public int anInt134;

	@OriginalMember(owner = "client!ab", name = "Hb", descriptor = "I")
	public int anInt135;

	@OriginalMember(owner = "client!ab", name = "Ib", descriptor = "I")
	public int anInt136;

	@OriginalMember(owner = "client!ab", name = "Jb", descriptor = "I")
	public int anInt137;

	@OriginalMember(owner = "client!ab", name = "Kb", descriptor = "Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 aClass1_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!ab", name = "Lb", descriptor = "I")
	public int anInt138;

	@OriginalMember(owner = "client!ab", name = "Mb", descriptor = "I")
	public int anInt139;

	@OriginalMember(owner = "client!ab", name = "Nb", descriptor = "I")
	public int anInt140;

	@OriginalMember(owner = "client!ab", name = "Ob", descriptor = "I")
	public int anInt141;

	@OriginalMember(owner = "client!ab", name = "Rb", descriptor = "Lclient!gc;")
	public Class13 aClass13_1;

	@OriginalMember(owner = "client!ab", name = "Sb", descriptor = "I")
	public int anInt142;

	@OriginalMember(owner = "client!ab", name = "ub", descriptor = "Z")
	private boolean aBoolean31 = true;

	@OriginalMember(owner = "client!ab", name = "wb", descriptor = "Z")
	public boolean aBoolean32 = false;

	@OriginalMember(owner = "client!ab", name = "zb", descriptor = "[I")
	public int[] anIntArray13 = new int[12];

	@OriginalMember(owner = "client!ab", name = "Ab", descriptor = "[I")
	public int[] anIntArray14 = new int[5];

	@OriginalMember(owner = "client!ab", name = "Pb", descriptor = "Z")
	public boolean aBoolean33 = false;

	@OriginalMember(owner = "client!ab", name = "Qb", descriptor = "J")
	private long aLong9 = -1L;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZLclient!lb;)V")
	public void method39(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt738 = 0;
			this.anInt128 = arg0.method474();
			this.anInt129 = arg0.method474();
			this.aClass13_1 = null;
			this.anInt142 = 0;
			@Pc(34) int local34;
			@Pc(46) int local46;
			@Pc(93) int local93;
			for (@Pc(29) int local29 = 0; local29 < 12; local29++) {
				local34 = arg0.method474();
				if (local34 == 0) {
					this.anIntArray13[local29] = 0;
				} else {
					local46 = arg0.method474();
					this.anIntArray13[local29] = (local34 << 8) + local46;
					if (local29 == 0 && this.anIntArray13[0] == 65535) {
						this.aClass13_1 = Class13.method321(arg0.method476());
						break;
					}
					if (this.anIntArray13[local29] >= 512 && this.anIntArray13[local29] - 512 < Class15.anInt598) {
						local93 = Class15.method358(this.anIntArray13[local29] - 512).anInt627;
						if (local93 != 0) {
							this.anInt142 = local93;
						}
					}
				}
			}
			for (local34 = 0; local34 < 5; local34++) {
				local46 = arg0.method474();
				if (local46 < 0 || local46 >= client.anIntArrayArray6[local34].length) {
					local46 = 0;
				}
				this.anIntArray14[local34] = local46;
			}
			super.anInt990 = arg0.method476();
			if (super.anInt990 == 65535) {
				super.anInt990 = -1;
			}
			super.anInt991 = arg0.method476();
			if (super.anInt991 == 65535) {
				super.anInt991 = -1;
			}
			super.anInt992 = arg0.method476();
			if (super.anInt992 == 65535) {
				super.anInt992 = -1;
			}
			super.anInt993 = arg0.method476();
			if (super.anInt993 == 65535) {
				super.anInt993 = -1;
			}
			super.anInt994 = arg0.method476();
			if (super.anInt994 == 65535) {
				super.anInt994 = -1;
			}
			super.anInt995 = arg0.method476();
			if (super.anInt995 == 65535) {
				super.anInt995 = -1;
			}
			super.anInt996 = arg0.method476();
			if (super.anInt996 == 65535) {
				super.anInt996 = -1;
			}
			this.aString3 = Class48.method665(Class48.method662(arg0.method480()));
			this.anInt130 = arg0.method474();
			this.anInt131 = arg0.method476();
			this.aBoolean32 = true;
			this.aLong8 = 0L;
			for (local46 = 0; local46 < 12; local46++) {
				this.aLong8 <<= 0x4;
				if (this.anIntArray13[local46] >= 256) {
					this.aLong8 += this.anIntArray13[local46] - 256;
				}
			}
			if (this.anIntArray13[0] >= 256) {
				this.aLong8 += this.anIntArray13[0] - 256 >> 4;
			}
			if (this.anIntArray13[1] >= 256) {
				this.aLong8 += this.anIntArray13[1] - 256 >> 8;
			}
			for (local93 = 0; local93 < 5; local93++) {
				this.aLong8 <<= 0x3;
				this.aLong8 += this.anIntArray14[local93];
			}
			this.aLong8 <<= 0x1;
			this.aLong8 += this.anInt128;
		} catch (@Pc(340) RuntimeException local340) {
			signlink.reporterror("95594, " + false + ", " + arg0 + ", " + local340.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method671() {
		try {
			if (!this.aBoolean32) {
				return null;
			}
			@Pc(19) Class1_Sub1_Sub1_Sub5 local19 = this.method40();
			if (local19 == null) {
				return null;
			}
			super.anInt1027 = local19.anInt984;
			local19.aBoolean124 = true;
			if (this.aBoolean33) {
				return local19;
			}
			if (super.anInt1014 != -1 && super.anInt1015 != -1) {
				@Pc(48) Class33 local48 = Class33.aClass33Array1[super.anInt1014];
				@Pc(51) Class1_Sub1_Sub1_Sub5 local51 = local48.method517();
				if (local51 != null) {
					@Pc(66) Class1_Sub1_Sub1_Sub5 local66 = new Class1_Sub1_Sub1_Sub5(9, false, Class12.method304(this.anInt127, super.anInt1015), true, local51);
					local66.method273(0, -super.anInt1018, 0);
					local66.method267();
					local66.method268(local48.aClass27_2.anIntArray222[super.anInt1015]);
					local66.anIntArrayArray9 = null;
					local66.anIntArrayArray8 = null;
					if (local48.anInt831 != 128 || local48.anInt832 != 128) {
						local66.method276(local48.anInt831, local48.anInt831, local48.anInt832);
					}
					local66.method277(local48.anInt834 + 64, local48.anInt835 + 850, -30, -50, -30, true);
					@Pc(134) Class1_Sub1_Sub1_Sub5[] local134 = new Class1_Sub1_Sub1_Sub5[] { local19, local66 };
					local19 = new Class1_Sub1_Sub1_Sub5(true, local134, true, 2);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub5_1 != null) {
				if (client.anInt265 >= this.anInt134) {
					this.aClass1_Sub1_Sub1_Sub5_1 = null;
				}
				if (client.anInt265 >= this.anInt133 && client.anInt265 < this.anInt134) {
					@Pc(163) Class1_Sub1_Sub1_Sub5 local163 = this.aClass1_Sub1_Sub1_Sub5_1;
					local163.method273(this.anInt135 - super.anInt986, this.anInt136 - this.anInt132, this.anInt137 - super.anInt987);
					if (super.anInt1028 == 512) {
						local163.method271();
						local163.method271();
						local163.method271();
					} else if (super.anInt1028 == 1024) {
						local163.method271();
						local163.method271();
					} else if (super.anInt1028 == 1536) {
						local163.method271();
					}
					@Pc(226) Class1_Sub1_Sub1_Sub5[] local226 = new Class1_Sub1_Sub1_Sub5[] { local19, local163 };
					local19 = new Class1_Sub1_Sub1_Sub5(true, local226, true, 2);
					if (super.anInt1028 == 512) {
						local163.method271();
					} else if (super.anInt1028 == 1024) {
						local163.method271();
						local163.method271();
					} else if (super.anInt1028 == 1536) {
						local163.method271();
						local163.method271();
						local163.method271();
					}
					local163.method273(super.anInt986 - this.anInt135, this.anInt132 - this.anInt136, super.anInt987 - this.anInt137);
				}
			}
			local19.aBoolean124 = true;
			return local19;
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("4256, " + true + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method40() {
		try {
			if (this.aClass13_1 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt1009 >= 0 && super.anInt1012 == 0) {
					local6 = Class27.aClass27Array1[super.anInt1009].anIntArray222[super.anInt1010];
				} else if (super.anInt1006 >= 0) {
					local6 = Class27.aClass27Array1[super.anInt1006].anIntArray222[super.anInt1007];
				}
				return this.aClass13_1.method323(local6, -1, null);
			}
			@Pc(48) long local48 = this.aLong8;
			@Pc(57) int local57 = -1;
			@Pc(59) int local59 = -1;
			@Pc(61) int local61 = -1;
			@Pc(63) int local63 = -1;
			if (super.anInt1009 >= 0 && super.anInt1012 == 0) {
				@Pc(74) Class27 local74 = Class27.aClass27Array1[super.anInt1009];
				local57 = local74.anIntArray222[super.anInt1010];
				if (super.anInt1006 >= 0 && super.anInt1006 != super.anInt990) {
					local59 = Class27.aClass27Array1[super.anInt1006].anIntArray222[super.anInt1007];
				}
				if (local74.anInt796 >= 0) {
					local61 = local74.anInt796;
					local48 += local61 - this.anIntArray13[5] << 8;
				}
				if (local74.anInt797 >= 0) {
					local63 = local74.anInt797;
					local48 += local63 - this.anIntArray13[3] << 16;
				}
			} else if (super.anInt1006 >= 0) {
				local57 = Class27.aClass27Array1[super.anInt1006].anIntArray222[super.anInt1007];
			}
			@Pc(152) Class1_Sub1_Sub1_Sub5 local152 = (Class1_Sub1_Sub1_Sub5) aClass40_1.method585(local48);
			@Pc(158) int local158;
			@Pc(165) int local165;
			if (local152 == null) {
				@Pc(156) boolean local156 = false;
				for (local158 = 0; local158 < 12; local158++) {
					local165 = this.anIntArray13[local158];
					if (local63 >= 0 && local158 == 3) {
						local165 = local63;
					}
					if (local61 >= 0 && local158 == 5) {
						local165 = local61;
					}
					if (local165 >= 256 && local165 < 512 && !Class23.aClass23Array1[local165 - 256].method492()) {
						local156 = true;
					}
					if (local165 >= 512 && !Class15.method358(local165 - 512).method365(this.anInt128)) {
						local156 = true;
					}
				}
				if (local156) {
					if (this.aLong9 != -1L) {
						local152 = (Class1_Sub1_Sub1_Sub5) aClass40_1.method585(this.aLong9);
					}
					if (local152 == null) {
						return null;
					}
				}
			}
			if (local152 == null) {
				@Pc(235) Class1_Sub1_Sub1_Sub5[] local235 = new Class1_Sub1_Sub1_Sub5[12];
				local158 = 0;
				@Pc(246) int local246;
				for (local165 = 0; local165 < 12; local165++) {
					local246 = this.anIntArray13[local165];
					if (local63 >= 0 && local165 == 3) {
						local246 = local63;
					}
					if (local61 >= 0 && local165 == 5) {
						local246 = local61;
					}
					@Pc(274) Class1_Sub1_Sub1_Sub5 local274;
					if (local246 >= 256 && local246 < 512) {
						local274 = Class23.aClass23Array1[local246 - 256].method493();
						if (local274 != null) {
							local235[local158++] = local274;
						}
					}
					if (local246 >= 512) {
						local274 = Class15.method358(local246 - 512).method366(this.anInt128);
						if (local274 != null) {
							local235[local158++] = local274;
						}
					}
				}
				local152 = new Class1_Sub1_Sub1_Sub5((byte) 3, local158, local235);
				for (local246 = 0; local246 < 5; local246++) {
					if (this.anIntArray14[local246] != 0) {
						local152.method274(client.anIntArrayArray6[local246][0], client.anIntArrayArray6[local246][this.anIntArray14[local246]]);
						if (local246 == 1) {
							local152.method274(client.anIntArray54[0], client.anIntArray54[this.anIntArray14[local246]]);
						}
					}
				}
				local152.method267();
				local152.method277(64, 850, -30, -50, -30, true);
				aClass40_1.method586(400, local152, local48);
				this.aLong9 = local48;
			}
			if (this.aBoolean33) {
				return local152;
			}
			@Pc(379) Class1_Sub1_Sub1_Sub5 local379 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local379.method262(local152, Class12.method304(this.anInt127, local57) & Class12.method304(this.anInt127, local59));
			if (local57 != -1 && local59 != -1) {
				local379.method269(Class27.aClass27Array1[super.anInt1009].anIntArray225, local59, local57);
			} else if (local57 != -1) {
				local379.method268(local57);
			}
			local379.method264();
			local379.anIntArrayArray9 = null;
			local379.anIntArrayArray8 = null;
			return local379;
		} catch (@Pc(429) RuntimeException local429) {
			signlink.reporterror("39610, " + 2 + ", " + local429.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method41() {
		try {
			if (!this.aBoolean32) {
				return null;
			} else if (this.aClass13_1 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray13[local18];
					if (local25 >= 256 && local25 < 512 && !Class23.aClass23Array1[local25 - 256].method494()) {
						local16 = true;
					}
					if (local25 >= 512 && !Class15.method358(local25 - 512).method367(this.anInt128)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(66) Class1_Sub1_Sub1_Sub5[] local66 = new Class1_Sub1_Sub1_Sub5[12];
				@Pc(68) int local68 = 0;
				for (@Pc(70) int local70 = 0; local70 < 12; local70++) {
					@Pc(77) int local77 = this.anIntArray13[local70];
					@Pc(91) Class1_Sub1_Sub1_Sub5 local91;
					if (local77 >= 256 && local77 < 512) {
						local91 = Class23.aClass23Array1[local77 - 256].method495();
						if (local91 != null) {
							local66[local68++] = local91;
						}
					}
					if (local77 >= 512) {
						local91 = Class15.method358(local77 - 512).method368(this.anInt128);
						if (local91 != null) {
							local66[local68++] = local91;
						}
					}
				}
				@Pc(128) Class1_Sub1_Sub1_Sub5 local128 = new Class1_Sub1_Sub1_Sub5((byte) 3, local68, local66);
				for (@Pc(130) int local130 = 0; local130 < 5; local130++) {
					if (this.anIntArray14[local130] != 0) {
						local128.method274(client.anIntArrayArray6[local130][0], client.anIntArrayArray6[local130][this.anIntArray14[local130]]);
						if (local130 == 1) {
							local128.method274(client.anIntArray54[0], client.anIntArray54[this.anIntArray14[local130]]);
						}
					}
				}
				return local128;
			} else {
				return this.aClass13_1.method324();
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("38213, " + -11764 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method675() {
		try {
			return this.aBoolean32;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("68652, " + 121 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}
}
