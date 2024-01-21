import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "Rb", descriptor = "Lclient!s;")
	public static Class40 aClass40_1 = new Class40(260, true);

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

	@OriginalMember(owner = "client!ab", name = "qb", descriptor = "I")
	private int anInt125 = 16935;

	@OriginalMember(owner = "client!ab", name = "rb", descriptor = "Z")
	private boolean aBoolean22 = true;

	@OriginalMember(owner = "client!ab", name = "sb", descriptor = "Z")
	private boolean aBoolean23 = false;

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

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!lb;Z)V")
	public void method39(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt733 = 0;
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
					if (this.anIntArray13[local20] >= 512 && this.anIntArray13[local20] - 512 < Class15.anInt591) {
						local84 = Class15.method361(this.anIntArray13[local20] - 512).anInt620;
						if (local84 != 0) {
							this.anInt140 = local84;
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
			super.anInt986 = arg0.method482();
			if (super.anInt986 == 65535) {
				super.anInt986 = -1;
			}
			super.anInt987 = arg0.method482();
			if (super.anInt987 == 65535) {
				super.anInt987 = -1;
			}
			super.anInt988 = arg0.method482();
			if (super.anInt988 == 65535) {
				super.anInt988 = -1;
			}
			super.anInt989 = arg0.method482();
			if (super.anInt989 == 65535) {
				super.anInt989 = -1;
			}
			super.anInt990 = arg0.method482();
			if (super.anInt990 == 65535) {
				super.anInt990 = -1;
			}
			super.anInt991 = arg0.method482();
			if (super.anInt991 == 65535) {
				super.anInt991 = -1;
			}
			super.anInt992 = arg0.method482();
			if (super.anInt992 == 65535) {
				super.anInt992 = -1;
			}
			this.aString3 = Class48.method671(Class48.method668(arg0.method486()));
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
		} catch (@Pc(334) RuntimeException local334) {
			signlink.reporterror("120, " + arg0 + ", " + true + ", " + local334.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)Lclient!eb;")
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
			super.anInt1023 = local10.anInt980;
			local10.aBoolean128 = true;
			if (this.aBoolean25) {
				return local10;
			}
			if (super.anInt1010 != -1 && super.anInt1011 != -1) {
				@Pc(48) Class33 local48 = Class33.aClass33Array1[super.anInt1010];
				@Pc(51) Class1_Sub1_Sub1_Sub5 local51 = local48.method523();
				if (local51 != null) {
					@Pc(65) Class1_Sub1_Sub1_Sub5 local65 = new Class1_Sub1_Sub1_Sub5(false, local51, true, (byte) 119, Class12.method306(super.anInt1011, (byte) 7));
					local65.method274(0, 0, -super.anInt1014);
					local65.method268();
					local65.method269(local48.aClass27_2.anIntArray225[super.anInt1011]);
					local65.anIntArrayArray9 = null;
					local65.anIntArrayArray8 = null;
					if (local48.anInt820 != 128 || local48.anInt821 != 128) {
						local65.method277(local48.anInt820, local48.anInt820, local48.anInt821);
					}
					local65.method278(local48.anInt823 + 64, local48.anInt824 + 850, -30, -50, -30, true);
					@Pc(133) Class1_Sub1_Sub1_Sub5[] local133 = new Class1_Sub1_Sub1_Sub5[] { local10, local65 };
					local10 = new Class1_Sub1_Sub1_Sub5(local133, true, 2, true);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub5_1 != null) {
				if (client.anInt236 >= this.anInt132) {
					this.aClass1_Sub1_Sub1_Sub5_1 = null;
				}
				if (client.anInt236 >= this.anInt131 && client.anInt236 < this.anInt132) {
					@Pc(162) Class1_Sub1_Sub1_Sub5 local162 = this.aClass1_Sub1_Sub1_Sub5_1;
					local162.method274(this.anInt133 - super.anInt982, this.anInt135 - super.anInt983, this.anInt134 - this.anInt130);
					if (super.anInt1024 == 512) {
						local162.method272();
						local162.method272();
						local162.method272();
					} else if (super.anInt1024 == 1024) {
						local162.method272();
						local162.method272();
					} else if (super.anInt1024 == 1536) {
						local162.method272();
					}
					@Pc(225) Class1_Sub1_Sub1_Sub5[] local225 = new Class1_Sub1_Sub1_Sub5[] { local10, local162 };
					local10 = new Class1_Sub1_Sub1_Sub5(local225, true, 2, true);
					if (super.anInt1024 == 512) {
						local162.method272();
					} else if (super.anInt1024 == 1024) {
						local162.method272();
						local162.method272();
					} else if (super.anInt1024 == 1536) {
						local162.method272();
						local162.method272();
						local162.method272();
					}
					local162.method274(super.anInt982 - this.anInt133, super.anInt983 - this.anInt135, this.anInt130 - this.anInt134);
				}
			}
			local10.aBoolean128 = true;
			return local10;
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("6211, " + true + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method40() {
		try {
			if (this.aClass13_1 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt1005 >= 0 && super.anInt1008 == 0) {
					local6 = Class27.aClass27Array1[super.anInt1005].anIntArray225[super.anInt1006];
				} else if (super.anInt1002 >= 0) {
					local6 = Class27.aClass27Array1[super.anInt1002].anIntArray225[super.anInt1003];
				}
				return this.aClass13_1.method325((byte) 3, -1, local6, null);
			}
			@Pc(48) long local48 = this.aLong8;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (super.anInt1005 >= 0 && super.anInt1008 == 0) {
				@Pc(67) Class27 local67 = Class27.aClass27Array1[super.anInt1005];
				local50 = local67.anIntArray225[super.anInt1006];
				if (super.anInt1002 >= 0 && super.anInt1002 != super.anInt986) {
					local52 = Class27.aClass27Array1[super.anInt1002].anIntArray225[super.anInt1003];
				}
				if (local67.anInt788 >= 0) {
					local54 = local67.anInt788;
					local48 += local54 - this.anIntArray13[5] << 8;
				}
				if (local67.anInt789 >= 0) {
					local56 = local67.anInt789;
					local48 += local56 - this.anIntArray13[3] << 16;
				}
			} else if (super.anInt1002 >= 0) {
				local50 = Class27.aClass27Array1[super.anInt1002].anIntArray225[super.anInt1003];
			}
			@Pc(145) Class1_Sub1_Sub1_Sub5 local145 = (Class1_Sub1_Sub1_Sub5) aClass40_1.method591(local48);
			@Pc(151) int local151;
			@Pc(158) int local158;
			if (local145 == null) {
				@Pc(149) boolean local149 = false;
				for (local151 = 0; local151 < 12; local151++) {
					local158 = this.anIntArray13[local151];
					if (local56 >= 0 && local151 == 3) {
						local158 = local56;
					}
					if (local54 >= 0 && local151 == 5) {
						local158 = local54;
					}
					if (local158 >= 256 && local158 < 512 && !Class23.aClass23Array1[local158 - 256].method498()) {
						local149 = true;
					}
					if (local158 >= 512 && !Class15.method361(local158 - 512).method368(this.anInt126)) {
						local149 = true;
					}
				}
				if (local149) {
					if (this.aLong9 != -1L) {
						local145 = (Class1_Sub1_Sub1_Sub5) aClass40_1.method591(this.aLong9);
					}
					if (local145 == null) {
						return null;
					}
				}
			}
			if (local145 == null) {
				@Pc(228) Class1_Sub1_Sub1_Sub5[] local228 = new Class1_Sub1_Sub1_Sub5[12];
				local151 = 0;
				@Pc(239) int local239;
				for (local158 = 0; local158 < 12; local158++) {
					local239 = this.anIntArray13[local158];
					if (local56 >= 0 && local158 == 3) {
						local239 = local56;
					}
					if (local54 >= 0 && local158 == 5) {
						local239 = local54;
					}
					@Pc(267) Class1_Sub1_Sub1_Sub5 local267;
					if (local239 >= 256 && local239 < 512) {
						local267 = Class23.aClass23Array1[local239 - 256].method499((byte) 3);
						if (local267 != null) {
							local228[local151++] = local267;
						}
					}
					if (local239 >= 512) {
						local267 = Class15.method361(local239 - 512).method369(this.anInt126);
						if (local267 != null) {
							local228[local151++] = local267;
						}
					}
				}
				local145 = new Class1_Sub1_Sub1_Sub5(local228, this.anInt125, local151);
				for (local239 = 0; local239 < 5; local239++) {
					if (this.anIntArray14[local239] != 0) {
						local145.method275(client.anIntArrayArray4[local239][0], client.anIntArrayArray4[local239][this.anIntArray14[local239]]);
						if (local239 == 1) {
							local145.method275(client.anIntArray63[0], client.anIntArray63[this.anIntArray14[local239]]);
						}
					}
				}
				local145.method268();
				local145.method278(64, 850, -30, -50, -30, true);
				aClass40_1.method592(local48, local145);
				this.aLong9 = local48;
			}
			if (this.aBoolean25) {
				return local145;
			}
			@Pc(373) Class1_Sub1_Sub1_Sub5 local373 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local373.method263(local145, Class12.method306(local50, (byte) 7) & Class12.method306(local52, (byte) 7));
			if (local50 != -1 && local52 != -1) {
				local373.method270(local50, local52, Class27.aClass27Array1[super.anInt1005].anIntArray228);
			} else if (local50 != -1) {
				local373.method269(local50);
			}
			local373.method265();
			local373.anIntArrayArray9 = null;
			local373.anIntArrayArray8 = null;
			return local373;
		} catch (@Pc(432) RuntimeException local432) {
			signlink.reporterror("56971, " + 10728 + ", " + local432.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method41() {
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
					if (local25 >= 512 && !Class15.method361(local25 - 512).method370(this.aBoolean23, this.anInt126)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(67) Class1_Sub1_Sub1_Sub5[] local67 = new Class1_Sub1_Sub1_Sub5[12];
				@Pc(69) int local69 = 0;
				for (@Pc(71) int local71 = 0; local71 < 12; local71++) {
					@Pc(78) int local78 = this.anIntArray13[local71];
					@Pc(92) Class1_Sub1_Sub1_Sub5 local92;
					if (local78 >= 256 && local78 < 512) {
						local92 = Class23.aClass23Array1[local78 - 256].method501();
						if (local92 != null) {
							local67[local69++] = local92;
						}
					}
					if (local78 >= 512) {
						local92 = Class15.method361(local78 - 512).method371(this.anInt126);
						if (local92 != null) {
							local67[local69++] = local92;
						}
					}
				}
				@Pc(140) Class1_Sub1_Sub1_Sub5 local140 = new Class1_Sub1_Sub1_Sub5(local67, this.anInt125, local69);
				for (@Pc(142) int local142 = 0; local142 < 5; local142++) {
					if (this.anIntArray14[local142] != 0) {
						local140.method275(client.anIntArrayArray4[local142][0], client.anIntArrayArray4[local142][this.anIntArray14[local142]]);
						if (local142 == 1) {
							local140.method275(client.anIntArray63[0], client.anIntArray63[this.anIntArray14[local142]]);
						}
					}
				}
				return local140;
			} else {
				return this.aClass13_1.method326((byte) 7);
			}
		} catch (@Pc(185) RuntimeException local185) {
			signlink.reporterror("17445, " + -32683 + ", " + local185.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method680(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				this.anInt125 = -492;
			}
			return this.aBoolean24;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("36159, " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}
}
