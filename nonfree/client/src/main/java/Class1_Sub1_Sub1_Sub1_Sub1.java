import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "Rb", descriptor = "Lclient!s;")
	public static Class40 aClass40_1 = new Class40(-739, 260);

	@OriginalMember(owner = "client!ab", name = "tb", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!ab", name = "vb", descriptor = "I")
	private int anInt126;

	@OriginalMember(owner = "client!ab", name = "wb", descriptor = "I")
	public int anInt127;

	@OriginalMember(owner = "client!ab", name = "zb", descriptor = "I")
	public int anInt128;

	@OriginalMember(owner = "client!ab", name = "Ab", descriptor = "I")
	public int anInt129;

	@OriginalMember(owner = "client!ab", name = "Bb", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!ab", name = "Cb", descriptor = "I")
	public int anInt130;

	@OriginalMember(owner = "client!ab", name = "Db", descriptor = "I")
	public int anInt131;

	@OriginalMember(owner = "client!ab", name = "Eb", descriptor = "I")
	public int anInt132;

	@OriginalMember(owner = "client!ab", name = "Fb", descriptor = "I")
	public int anInt133;

	@OriginalMember(owner = "client!ab", name = "Gb", descriptor = "I")
	public int anInt134;

	@OriginalMember(owner = "client!ab", name = "Hb", descriptor = "I")
	public int anInt135;

	@OriginalMember(owner = "client!ab", name = "Ib", descriptor = "Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 aClass1_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!ab", name = "Jb", descriptor = "I")
	public int anInt136;

	@OriginalMember(owner = "client!ab", name = "Kb", descriptor = "I")
	public int anInt137;

	@OriginalMember(owner = "client!ab", name = "Lb", descriptor = "I")
	public int anInt138;

	@OriginalMember(owner = "client!ab", name = "Mb", descriptor = "I")
	public int anInt139;

	@OriginalMember(owner = "client!ab", name = "Pb", descriptor = "Lclient!gc;")
	public Class13 aClass13_1;

	@OriginalMember(owner = "client!ab", name = "Qb", descriptor = "I")
	public int anInt140;

	@OriginalMember(owner = "client!ab", name = "rb", descriptor = "Z")
	private boolean aBoolean23 = true;

	@OriginalMember(owner = "client!ab", name = "sb", descriptor = "B")
	private byte aByte3 = -84;

	@OriginalMember(owner = "client!ab", name = "ub", descriptor = "Z")
	public boolean aBoolean24 = false;

	@OriginalMember(owner = "client!ab", name = "xb", descriptor = "[I")
	public int[] anIntArray13 = new int[12];

	@OriginalMember(owner = "client!ab", name = "yb", descriptor = "[I")
	public int[] anIntArray14 = new int[5];

	@OriginalMember(owner = "client!ab", name = "Nb", descriptor = "Z")
	public boolean aBoolean25 = false;

	@OriginalMember(owner = "client!ab", name = "Ob", descriptor = "J")
	private long aLong9 = -1L;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!lb;)V")
	public void method39(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt742 = 0;
			this.anInt126 = arg0.method480();
			this.anInt127 = arg0.method480();
			this.aClass13_1 = null;
			this.anInt140 = 0;
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
					if (this.anIntArray13[local20] >= 512 && this.anIntArray13[local20] - 512 < Class15.anInt601) {
						local84 = Class15.method361(this.anIntArray13[local20] - 512).anInt630;
						if (local84 != 0) {
							this.anInt140 = local84;
						}
					}
				}
			}
			for (local25 = 0; local25 < 5; local25++) {
				local37 = arg0.method480();
				if (local37 < 0 || local37 >= client.anIntArrayArray3[local25].length) {
					local37 = 0;
				}
				this.anIntArray14[local25] = local37;
			}
			super.anInt992 = arg0.method482();
			if (super.anInt992 == 65535) {
				super.anInt992 = -1;
			}
			super.anInt993 = arg0.method482();
			if (super.anInt993 == 65535) {
				super.anInt993 = -1;
			}
			super.anInt994 = arg0.method482();
			if (super.anInt994 == 65535) {
				super.anInt994 = -1;
			}
			super.anInt995 = arg0.method482();
			if (super.anInt995 == 65535) {
				super.anInt995 = -1;
			}
			super.anInt996 = arg0.method482();
			if (super.anInt996 == 65535) {
				super.anInt996 = -1;
			}
			super.anInt997 = arg0.method482();
			if (super.anInt997 == 65535) {
				super.anInt997 = -1;
			}
			super.anInt998 = arg0.method482();
			if (super.anInt998 == 65535) {
				super.anInt998 = -1;
			}
			this.aString3 = Class48.method671(943, Class48.method668(arg0.method486()));
			this.anInt128 = arg0.method480();
			this.anInt129 = arg0.method482();
			this.aBoolean24 = true;
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
			this.aLong8 += this.anInt126;
		} catch (@Pc(333) RuntimeException local333) {
			signlink.reporterror("45462, " + 627 + ", " + arg0 + ", " + local333.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			if (!this.aBoolean24) {
				return null;
			}
			@Pc(10) Class1_Sub1_Sub1_Sub5 local10 = this.method40();
			if (local10 == null) {
				return null;
			}
			super.anInt1029 = local10.anInt986;
			local10.aBoolean114 = true;
			if (this.aBoolean25) {
				return local10;
			}
			if (super.anInt1016 != -1 && super.anInt1017 != -1) {
				@Pc(47) Class33 local47 = Class33.aClass33Array1[super.anInt1016];
				@Pc(50) Class1_Sub1_Sub1_Sub5 local50 = local47.method523();
				if (local50 != null) {
					@Pc(64) Class1_Sub1_Sub1_Sub5 local64 = new Class1_Sub1_Sub1_Sub5(Class12.method306(super.anInt1017), false, true, local50, 0);
					local64.method274(-super.anInt1020, 0, 0);
					local64.method268();
					local64.method269(local47.aClass27_2.anIntArray225[super.anInt1017]);
					local64.anIntArrayArray9 = null;
					local64.anIntArrayArray8 = null;
					if (local47.anInt830 != 128 || local47.anInt831 != 128) {
						local64.method277(local47.anInt830, local47.anInt830, local47.anInt831);
					}
					local64.method278(local47.anInt833 + 64, local47.anInt834 + 850, -30, -50, -30, true);
					@Pc(132) Class1_Sub1_Sub1_Sub5[] local132 = new Class1_Sub1_Sub1_Sub5[] { local10, local64 };
					local10 = new Class1_Sub1_Sub1_Sub5(2, local132, (byte) 80, true);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub5_1 != null) {
				if (client.anInt297 >= this.anInt132) {
					this.aClass1_Sub1_Sub1_Sub5_1 = null;
				}
				if (client.anInt297 >= this.anInt131 && client.anInt297 < this.anInt132) {
					@Pc(161) Class1_Sub1_Sub1_Sub5 local161 = this.aClass1_Sub1_Sub1_Sub5_1;
					local161.method274(this.anInt134 - this.anInt130, this.anInt135 - super.anInt989, this.anInt133 - super.anInt988);
					if (super.anInt1030 == 512) {
						local161.method272();
						local161.method272();
						local161.method272();
					} else if (super.anInt1030 == 1024) {
						local161.method272();
						local161.method272();
					} else if (super.anInt1030 == 1536) {
						local161.method272();
					}
					@Pc(224) Class1_Sub1_Sub1_Sub5[] local224 = new Class1_Sub1_Sub1_Sub5[] { local10, local161 };
					local10 = new Class1_Sub1_Sub1_Sub5(2, local224, (byte) 80, true);
					if (super.anInt1030 == 512) {
						local161.method272();
					} else if (super.anInt1030 == 1024) {
						local161.method272();
						local161.method272();
					} else if (super.anInt1030 == 1536) {
						local161.method272();
						local161.method272();
						local161.method272();
					}
					local161.method274(this.anInt130 - this.anInt134, super.anInt989 - this.anInt135, super.anInt988 - this.anInt133);
				}
			}
			local10.aBoolean114 = true;
			return local10;
		} catch (@Pc(290) RuntimeException local290) {
			signlink.reporterror("35011, " + -20 + ", " + local290.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method40() {
		try {
			if (this.aClass13_1 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt1011 >= 0 && super.anInt1014 == 0) {
					local6 = Class27.aClass27Array1[super.anInt1011].anIntArray225[super.anInt1012];
				} else if (super.anInt1008 >= 0) {
					local6 = Class27.aClass27Array1[super.anInt1008].anIntArray225[super.anInt1009];
				}
				return this.aClass13_1.method325(-1, null, local6);
			}
			@Pc(48) long local48 = this.aLong8;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (super.anInt1011 >= 0 && super.anInt1014 == 0) {
				@Pc(76) Class27 local76 = Class27.aClass27Array1[super.anInt1011];
				local50 = local76.anIntArray225[super.anInt1012];
				if (super.anInt1008 >= 0 && super.anInt1008 != super.anInt992) {
					local52 = Class27.aClass27Array1[super.anInt1008].anIntArray225[super.anInt1009];
				}
				if (local76.anInt797 >= 0) {
					local54 = local76.anInt797;
					local48 += local54 - this.anIntArray13[5] << 8;
				}
				if (local76.anInt798 >= 0) {
					local56 = local76.anInt798;
					local48 += local56 - this.anIntArray13[3] << 16;
				}
			} else if (super.anInt1008 >= 0) {
				local50 = Class27.aClass27Array1[super.anInt1008].anIntArray225[super.anInt1009];
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
					if (local167 >= 512 && !Class15.method361(local167 - 512).method368(this.anInt126)) {
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
						local276 = Class15.method361(local248 - 512).method369(this.anInt126);
						if (local276 != null) {
							local237[local160++] = local276;
						}
					}
				}
				local154 = new Class1_Sub1_Sub1_Sub5(local160, -314, local237);
				for (local248 = 0; local248 < 5; local248++) {
					if (this.anIntArray14[local248] != 0) {
						local154.method275(client.anIntArrayArray3[local248][0], client.anIntArrayArray3[local248][this.anIntArray14[local248]]);
						if (local248 == 1) {
							local154.method275(client.anIntArray58[0], client.anIntArray58[this.anIntArray14[local248]]);
						}
					}
				}
				local154.method268();
				local154.method278(64, 850, -30, -50, -30, true);
				aClass40_1.method592(local48, local154);
				this.aLong9 = local48;
			}
			if (this.aBoolean25) {
				return local154;
			}
			@Pc(381) Class1_Sub1_Sub1_Sub5 local381 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local381.method263(local154, Class12.method306(local50) & Class12.method306(local52));
			if (local50 != -1 && local52 != -1) {
				local381.method270(local52, local50, Class27.aClass27Array1[super.anInt1011].anIntArray228);
			} else if (local50 != -1) {
				local381.method269(local50);
			}
			local381.method265();
			local381.anIntArrayArray9 = null;
			local381.anIntArrayArray8 = null;
			return local381;
		} catch (@Pc(429) RuntimeException local429) {
			signlink.reporterror("31078, " + false + ", " + local429.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method41(@OriginalArg(0) int arg0) {
		try {
			if (!this.aBoolean24) {
				return null;
			} else if (this.aClass13_1 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray13[local18];
					if (local25 >= 256 && local25 < 512 && !Class23.aClass23Array1[local25 - 256].method500()) {
						local16 = true;
					}
					if (local25 >= 512 && !Class15.method361(local25 - 512).method370(this.anInt126)) {
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
						local91 = Class15.method361(local77 - 512).method371(this.anInt126);
						if (local91 != null) {
							local66[local68++] = local91;
						}
					}
				}
				@Pc(128) Class1_Sub1_Sub1_Sub5 local128 = new Class1_Sub1_Sub1_Sub5(local68, -314, local66);
				for (@Pc(130) int local130 = 0; local130 < 5; local130++) {
					if (this.anIntArray14[local130] != 0) {
						local128.method275(client.anIntArrayArray3[local130][0], client.anIntArrayArray3[local130][this.anIntArray14[local130]]);
						if (local130 == 1) {
							local128.method275(client.anIntArray58[0], client.anIntArray58[this.anIntArray14[local130]]);
						}
					}
				}
				if (arg0 != 0) {
					this.aBoolean23 = !this.aBoolean23;
				}
				return local128;
			} else {
				return this.aClass13_1.method326();
			}
		} catch (@Pc(183) RuntimeException local183) {
			signlink.reporterror("75918, " + arg0 + ", " + local183.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method680() {
		try {
			if (this.aByte3 != -84) {
				this.aBoolean23 = !this.aBoolean23;
			}
			return this.aBoolean24;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("31032, " + -84 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}
}
