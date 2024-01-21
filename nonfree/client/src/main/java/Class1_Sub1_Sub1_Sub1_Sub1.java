import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "Ub", descriptor = "Lclient!s;")
	public static Class40 aClass40_1 = new Class40((byte) 113, 260);

	@OriginalMember(owner = "client!ab", name = "wb", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!ab", name = "yb", descriptor = "I")
	private int anInt134;

	@OriginalMember(owner = "client!ab", name = "zb", descriptor = "I")
	public int anInt135;

	@OriginalMember(owner = "client!ab", name = "Cb", descriptor = "I")
	public int anInt136;

	@OriginalMember(owner = "client!ab", name = "Db", descriptor = "I")
	public int anInt137;

	@OriginalMember(owner = "client!ab", name = "Eb", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!ab", name = "Fb", descriptor = "I")
	public int anInt138;

	@OriginalMember(owner = "client!ab", name = "Gb", descriptor = "I")
	public int anInt139;

	@OriginalMember(owner = "client!ab", name = "Hb", descriptor = "I")
	public int anInt140;

	@OriginalMember(owner = "client!ab", name = "Ib", descriptor = "I")
	public int anInt141;

	@OriginalMember(owner = "client!ab", name = "Jb", descriptor = "I")
	public int anInt142;

	@OriginalMember(owner = "client!ab", name = "Kb", descriptor = "I")
	public int anInt143;

	@OriginalMember(owner = "client!ab", name = "Lb", descriptor = "Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 aClass1_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!ab", name = "Mb", descriptor = "I")
	public int anInt144;

	@OriginalMember(owner = "client!ab", name = "Nb", descriptor = "I")
	public int anInt145;

	@OriginalMember(owner = "client!ab", name = "Ob", descriptor = "I")
	public int anInt146;

	@OriginalMember(owner = "client!ab", name = "Pb", descriptor = "I")
	public int anInt147;

	@OriginalMember(owner = "client!ab", name = "Sb", descriptor = "Lclient!gc;")
	public Class13 aClass13_1;

	@OriginalMember(owner = "client!ab", name = "Tb", descriptor = "I")
	public int anInt148;

	@OriginalMember(owner = "client!ab", name = "tb", descriptor = "I")
	private int anInt132 = 31696;

	@OriginalMember(owner = "client!ab", name = "ub", descriptor = "Z")
	private boolean aBoolean28 = true;

	@OriginalMember(owner = "client!ab", name = "vb", descriptor = "I")
	private int anInt133 = -148;

	@OriginalMember(owner = "client!ab", name = "xb", descriptor = "Z")
	public boolean aBoolean29 = false;

	@OriginalMember(owner = "client!ab", name = "Ab", descriptor = "[I")
	public int[] anIntArray13 = new int[12];

	@OriginalMember(owner = "client!ab", name = "Bb", descriptor = "[I")
	public int[] anIntArray14 = new int[5];

	@OriginalMember(owner = "client!ab", name = "Qb", descriptor = "Z")
	public boolean aBoolean30 = false;

	@OriginalMember(owner = "client!ab", name = "Rb", descriptor = "J")
	private long aLong9 = -1L;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!lb;)V")
	public void method39(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt751 = 0;
			this.anInt134 = arg0.method480();
			this.anInt135 = arg0.method480();
			this.aClass13_1 = null;
			this.anInt148 = 0;
			@Pc(25) int local25;
			@Pc(37) int local37;
			@Pc(84) int local84;
			for (@Pc(20) int local20 = 0; local20 < 12; local20++) {
				local25 = arg0.method480();
				if (local25 == 0) {
					this.anIntArray13[local20] = 0;
				} else {
					local37 = arg0.method480();
					this.anIntArray13[local20] = (local25 << 8) + local37;
					if (local20 == 0 && this.anIntArray13[0] == 65535) {
						this.aClass13_1 = Class13.method323(arg0.method482());
						break;
					}
					if (this.anIntArray13[local20] >= 512 && this.anIntArray13[local20] - 512 < Class15.anInt615) {
						local84 = Class15.method361(this.anIntArray13[local20] - 512).anInt644;
						if (local84 != 0) {
							this.anInt148 = local84;
						}
					}
				}
			}
			for (local25 = 0; local25 < 5; local25++) {
				local37 = arg0.method480();
				if (local37 < 0 || local37 >= client.anIntArrayArray4[local25].length) {
					local37 = 0;
				}
				this.anIntArray14[local25] = local37;
			}
			super.anInt1009 = arg0.method482();
			if (super.anInt1009 == 65535) {
				super.anInt1009 = -1;
			}
			super.anInt1010 = arg0.method482();
			if (super.anInt1010 == 65535) {
				super.anInt1010 = -1;
			}
			super.anInt1011 = arg0.method482();
			if (super.anInt1011 == 65535) {
				super.anInt1011 = -1;
			}
			super.anInt1012 = arg0.method482();
			if (super.anInt1012 == 65535) {
				super.anInt1012 = -1;
			}
			super.anInt1013 = arg0.method482();
			if (super.anInt1013 == 65535) {
				super.anInt1013 = -1;
			}
			super.anInt1014 = arg0.method482();
			if (super.anInt1014 == 65535) {
				super.anInt1014 = -1;
			}
			super.anInt1015 = arg0.method482();
			if (super.anInt1015 == 65535) {
				super.anInt1015 = -1;
			}
			this.aString3 = Class48.method671(Class48.method668(this.anInt132, arg0.method486()));
			this.anInt136 = arg0.method480();
			this.anInt137 = arg0.method482();
			this.aBoolean29 = true;
			this.aLong8 = 0L;
			for (local37 = 0; local37 < 12; local37++) {
				this.aLong8 <<= 0x4;
				if (this.anIntArray13[local37] >= 256) {
					this.aLong8 += this.anIntArray13[local37] - 256;
				}
			}
			if (this.anIntArray13[0] >= 256) {
				this.aLong8 += this.anIntArray13[0] - 256 >> 4;
			}
			if (this.anIntArray13[1] >= 256) {
				this.aLong8 += this.anIntArray13[1] - 256 >> 8;
			}
			for (local84 = 0; local84 < 5; local84++) {
				this.aLong8 <<= 0x3;
				this.aLong8 += this.anIntArray14[local84];
			}
			this.aLong8 <<= 0x1;
			this.aLong8 += this.anInt134;
		} catch (@Pc(335) RuntimeException local335) {
			signlink.reporterror("5143, " + 0 + ", " + arg0 + ", " + local335.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676(@OriginalArg(0) int arg0) {
		try {
			if (!this.aBoolean29) {
				return null;
			}
			@Pc(11) Class1_Sub1_Sub1_Sub5 local11 = this.method40(this.anInt133);
			if (local11 == null) {
				return null;
			}
			super.anInt1046 = local11.anInt1003;
			if (arg0 != 0) {
				throw new NullPointerException();
			}
			local11.aBoolean122 = true;
			if (this.aBoolean30) {
				return local11;
			}
			if (super.anInt1033 != -1 && super.anInt1034 != -1) {
				@Pc(46) Class33 local46 = Class33.aClass33Array1[super.anInt1033];
				@Pc(49) Class1_Sub1_Sub1_Sub5 local49 = local46.method523();
				if (local49 != null) {
					@Pc(63) Class1_Sub1_Sub1_Sub5 local63 = new Class1_Sub1_Sub1_Sub5(local49, true, false, Class12.method306(super.anInt1034), 0);
					local63.method274(-super.anInt1037, 0, 0);
					local63.method268();
					local63.method269(428, local46.aClass27_2.anIntArray225[super.anInt1034]);
					local63.anIntArrayArray9 = null;
					local63.anIntArrayArray8 = null;
					if (local46.anInt844 != 128 || local46.anInt845 != 128) {
						local63.method277((byte) 4, local46.anInt845, local46.anInt844, local46.anInt844);
					}
					local63.method278(local46.anInt847 + 64, local46.anInt848 + 850, -30, -50, -30, true);
					@Pc(131) Class1_Sub1_Sub1_Sub5[] local131 = new Class1_Sub1_Sub1_Sub5[] { local11, local63 };
					local11 = new Class1_Sub1_Sub1_Sub5(true, local131, (byte) 4, 2);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub5_1 != null) {
				if (client.anInt248 >= this.anInt140) {
					this.aClass1_Sub1_Sub1_Sub5_1 = null;
				}
				if (client.anInt248 >= this.anInt139 && client.anInt248 < this.anInt140) {
					@Pc(160) Class1_Sub1_Sub1_Sub5 local160 = this.aClass1_Sub1_Sub1_Sub5_1;
					local160.method274(this.anInt142 - this.anInt138, this.anInt143 - super.anInt1006, this.anInt141 - super.anInt1005);
					if (super.anInt1047 == 512) {
						local160.method272();
						local160.method272();
						local160.method272();
					} else if (super.anInt1047 == 1024) {
						local160.method272();
						local160.method272();
					} else if (super.anInt1047 == 1536) {
						local160.method272();
					}
					@Pc(223) Class1_Sub1_Sub1_Sub5[] local223 = new Class1_Sub1_Sub1_Sub5[] { local11, local160 };
					local11 = new Class1_Sub1_Sub1_Sub5(true, local223, (byte) 4, 2);
					if (super.anInt1047 == 512) {
						local160.method272();
					} else if (super.anInt1047 == 1024) {
						local160.method272();
						local160.method272();
					} else if (super.anInt1047 == 1536) {
						local160.method272();
						local160.method272();
						local160.method272();
					}
					local160.method274(this.anInt138 - this.anInt142, super.anInt1006 - this.anInt143, super.anInt1005 - this.anInt141);
				}
			}
			local11.aBoolean122 = true;
			return local11;
		} catch (@Pc(289) RuntimeException local289) {
			signlink.reporterror("8199, " + arg0 + ", " + local289.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method40(@OriginalArg(0) int arg0) {
		try {
			if (this.aClass13_1 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt1028 >= 0 && super.anInt1031 == 0) {
					local6 = Class27.aClass27Array1[super.anInt1028].anIntArray225[super.anInt1029];
				} else if (super.anInt1025 >= 0) {
					local6 = Class27.aClass27Array1[super.anInt1025].anIntArray225[super.anInt1026];
				}
				return this.aClass13_1.method325(local6, 175, -1, null);
			}
			@Pc(48) long local48 = this.aLong8;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (arg0 >= 0) {
				for (@Pc(60) int local60 = 1; local60 > 0; local60++) {
				}
			}
			if (super.anInt1028 >= 0 && super.anInt1031 == 0) {
				@Pc(76) Class27 local76 = Class27.aClass27Array1[super.anInt1028];
				local50 = local76.anIntArray225[super.anInt1029];
				if (super.anInt1025 >= 0 && super.anInt1025 != super.anInt1009) {
					local52 = Class27.aClass27Array1[super.anInt1025].anIntArray225[super.anInt1026];
				}
				if (local76.anInt810 >= 0) {
					local54 = local76.anInt810;
					local48 += local54 - this.anIntArray13[5] << 8;
				}
				if (local76.anInt811 >= 0) {
					local56 = local76.anInt811;
					local48 += local56 - this.anIntArray13[3] << 16;
				}
			} else if (super.anInt1025 >= 0) {
				local50 = Class27.aClass27Array1[super.anInt1025].anIntArray225[super.anInt1026];
			}
			@Pc(154) Class1_Sub1_Sub1_Sub5 local154 = (Class1_Sub1_Sub1_Sub5) aClass40_1.method591(local48);
			@Pc(160) int local160;
			@Pc(167) int local167;
			if (local154 == null) {
				@Pc(158) boolean local158 = false;
				for (local160 = 0; local160 < 12; local160++) {
					local167 = this.anIntArray13[local160];
					if (local56 >= 0 && local160 == 3) {
						local167 = local56;
					}
					if (local54 >= 0 && local160 == 5) {
						local167 = local54;
					}
					if (local167 >= 256 && local167 < 512 && !Class23.aClass23Array1[local167 - 256].method498()) {
						local158 = true;
					}
					if (local167 >= 512 && !Class15.method361(local167 - 512).method368(this.anInt134)) {
						local158 = true;
					}
				}
				if (local158) {
					if (this.aLong9 != -1L) {
						local154 = (Class1_Sub1_Sub1_Sub5) aClass40_1.method591(this.aLong9);
					}
					if (local154 == null) {
						return null;
					}
				}
			}
			if (local154 == null) {
				@Pc(237) Class1_Sub1_Sub1_Sub5[] local237 = new Class1_Sub1_Sub1_Sub5[12];
				local160 = 0;
				@Pc(248) int local248;
				for (local167 = 0; local167 < 12; local167++) {
					local248 = this.anIntArray13[local167];
					if (local56 >= 0 && local167 == 3) {
						local248 = local56;
					}
					if (local54 >= 0 && local167 == 5) {
						local248 = local54;
					}
					@Pc(276) Class1_Sub1_Sub1_Sub5 local276;
					if (local248 >= 256 && local248 < 512) {
						local276 = Class23.aClass23Array1[local248 - 256].method499();
						if (local276 != null) {
							local237[local160++] = local276;
						}
					}
					if (local248 >= 512) {
						local276 = Class15.method361(local248 - 512).method369(this.anInt134);
						if (local276 != null) {
							local237[local160++] = local276;
						}
					}
				}
				local154 = new Class1_Sub1_Sub1_Sub5(local160, -550, local237);
				for (local248 = 0; local248 < 5; local248++) {
					if (this.anIntArray14[local248] != 0) {
						local154.method275(client.anIntArrayArray4[local248][0], client.anIntArrayArray4[local248][this.anIntArray14[local248]]);
						if (local248 == 1) {
							local154.method275(client.anIntArray40[0], client.anIntArray40[this.anIntArray14[local248]]);
						}
					}
				}
				local154.method268();
				local154.method278(64, 850, -30, -50, -30, true);
				aClass40_1.method592(local48, local154);
				this.aLong9 = local48;
			}
			if (this.aBoolean30) {
				return local154;
			}
			@Pc(381) Class1_Sub1_Sub1_Sub5 local381 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local381.method263(Class12.method306(local50) & Class12.method306(local52), local154, 471);
			if (local50 != -1 && local52 != -1) {
				local381.method270(local52, Class27.aClass27Array1[super.anInt1028].anIntArray228, local50);
			} else if (local50 != -1) {
				local381.method269(428, local50);
			}
			local381.method265();
			local381.anIntArrayArray9 = null;
			local381.anIntArrayArray8 = null;
			return local381;
		} catch (@Pc(429) RuntimeException local429) {
			signlink.reporterror("58813, " + arg0 + ", " + local429.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method41() {
		try {
			if (!this.aBoolean29) {
				return null;
			} else if (this.aClass13_1 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray13[local18];
					if (local25 >= 256 && local25 < 512 && !Class23.aClass23Array1[local25 - 256].method500()) {
						local16 = true;
					}
					if (local25 >= 512 && !Class15.method361(local25 - 512).method370(this.anInt134)) {
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
						local91 = Class23.aClass23Array1[local77 - 256].method501();
						if (local91 != null) {
							local66[local68++] = local91;
						}
					}
					if (local77 >= 512) {
						local91 = Class15.method361(local77 - 512).method371(this.anInt134);
						if (local91 != null) {
							local66[local68++] = local91;
						}
					}
				}
				@Pc(128) Class1_Sub1_Sub1_Sub5 local128 = new Class1_Sub1_Sub1_Sub5(local68, -550, local66);
				for (@Pc(130) int local130 = 0; local130 < 5; local130++) {
					if (this.anIntArray14[local130] != 0) {
						local128.method275(client.anIntArrayArray4[local130][0], client.anIntArrayArray4[local130][this.anIntArray14[local130]]);
						if (local130 == 1) {
							local128.method275(client.anIntArray40[0], client.anIntArray40[this.anIntArray14[local130]]);
						}
					}
				}
				return local128;
			} else {
				return this.aClass13_1.method326();
			}
		} catch (@Pc(183) RuntimeException local183) {
			signlink.reporterror("11453, " + true + ", " + local183.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method680() {
		try {
			return this.aBoolean29;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("21809, " + false + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
