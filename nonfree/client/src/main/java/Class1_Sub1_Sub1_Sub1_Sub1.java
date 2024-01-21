import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "Sb", descriptor = "Lclient!s;")
	public static Class40 aClass40_1 = new Class40((byte) 8, 260);

	@OriginalMember(owner = "client!ab", name = "ub", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!ab", name = "wb", descriptor = "I")
	private int anInt127;

	@OriginalMember(owner = "client!ab", name = "xb", descriptor = "I")
	public int anInt128;

	@OriginalMember(owner = "client!ab", name = "Ab", descriptor = "I")
	public int anInt129;

	@OriginalMember(owner = "client!ab", name = "Bb", descriptor = "I")
	public int anInt130;

	@OriginalMember(owner = "client!ab", name = "Cb", descriptor = "J")
	private long aLong8;

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

	@OriginalMember(owner = "client!ab", name = "Ib", descriptor = "I")
	public int anInt136;

	@OriginalMember(owner = "client!ab", name = "Jb", descriptor = "Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 aClass1_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!ab", name = "Kb", descriptor = "I")
	public int anInt137;

	@OriginalMember(owner = "client!ab", name = "Lb", descriptor = "I")
	public int anInt138;

	@OriginalMember(owner = "client!ab", name = "Mb", descriptor = "I")
	public int anInt139;

	@OriginalMember(owner = "client!ab", name = "Nb", descriptor = "I")
	public int anInt140;

	@OriginalMember(owner = "client!ab", name = "Qb", descriptor = "Lclient!gc;")
	public Class13 aClass13_1;

	@OriginalMember(owner = "client!ab", name = "Rb", descriptor = "I")
	public int anInt141;

	@OriginalMember(owner = "client!ab", name = "qb", descriptor = "I")
	private int anInt123 = 4;

	@OriginalMember(owner = "client!ab", name = "rb", descriptor = "I")
	private int anInt124 = 6;

	@OriginalMember(owner = "client!ab", name = "sb", descriptor = "I")
	private int anInt125 = -262;

	@OriginalMember(owner = "client!ab", name = "tb", descriptor = "I")
	private int anInt126 = 7;

	@OriginalMember(owner = "client!ab", name = "vb", descriptor = "Z")
	public boolean aBoolean26 = false;

	@OriginalMember(owner = "client!ab", name = "yb", descriptor = "[I")
	public int[] anIntArray13 = new int[12];

	@OriginalMember(owner = "client!ab", name = "zb", descriptor = "[I")
	public int[] anIntArray14 = new int[5];

	@OriginalMember(owner = "client!ab", name = "Ob", descriptor = "Z")
	public boolean aBoolean27 = false;

	@OriginalMember(owner = "client!ab", name = "Pb", descriptor = "J")
	private long aLong9 = -1L;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!lb;Z)V")
	public void method39(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt742 = 0;
			this.anInt127 = arg0.method480();
			this.anInt128 = arg0.method480();
			this.aClass13_1 = null;
			this.anInt141 = 0;
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
					if (this.anIntArray13[local20] >= 512 && this.anIntArray13[local20] - 512 < Class15.anInt603) {
						local84 = Class15.method361(this.anIntArray13[local20] - 512).anInt632;
						if (local84 != 0) {
							this.anInt141 = local84;
						}
					}
				}
			}
			for (local25 = 0; local25 < 5; local25++) {
				local37 = arg0.method480();
				if (local37 < 0 || local37 >= client.anIntArrayArray5[local25].length) {
					local37 = 0;
				}
				this.anIntArray14[local25] = local37;
			}
			super.anInt985 = arg0.method482();
			if (super.anInt985 == 65535) {
				super.anInt985 = -1;
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
			this.aString3 = Class48.method671(Class48.method668(arg0.method486(this.anInt123)), 789);
			this.anInt129 = arg0.method480();
			this.anInt130 = arg0.method482();
			this.aBoolean26 = true;
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
			this.aLong8 += this.anInt127;
		} catch (@Pc(341) RuntimeException local341) {
			signlink.reporterror("8552, " + arg0 + ", " + true + ", " + local341.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			if (!this.aBoolean26) {
				return null;
			}
			@Pc(11) Class1_Sub1_Sub1_Sub5 local11 = this.method40(this.anInt125);
			if (local11 == null) {
				return null;
			}
			super.anInt1022 = local11.anInt979;
			local11.aBoolean119 = true;
			if (this.aBoolean27) {
				return local11;
			}
			if (super.anInt1009 != -1 && super.anInt1010 != -1) {
				@Pc(40) Class33 local40 = Class33.aClass33Array1[super.anInt1009];
				@Pc(43) Class1_Sub1_Sub1_Sub5 local43 = local40.method523();
				if (local43 != null) {
					@Pc(57) Class1_Sub1_Sub1_Sub5 local57 = new Class1_Sub1_Sub1_Sub5(false, true, Class12.method306(super.anInt1010), local43, 396);
					local57.method274(this.anInt124, 0, -super.anInt1013, 0);
					local57.method268();
					local57.method269(local40.aClass27_2.anIntArray225[super.anInt1010]);
					local57.anIntArrayArray9 = null;
					local57.anIntArrayArray8 = null;
					if (local40.anInt825 != 128 || local40.anInt826 != 128) {
						local57.method277(local40.anInt825, local40.anInt825, local40.anInt826);
					}
					local57.method278(local40.anInt828 + 64, local40.anInt829 + 850, -30, -50, -30, true);
					@Pc(126) Class1_Sub1_Sub1_Sub5[] local126 = new Class1_Sub1_Sub1_Sub5[] { local11, local57 };
					local11 = new Class1_Sub1_Sub1_Sub5(2, false, local126, true);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub5_1 != null) {
				if (client.anInt223 >= this.anInt133) {
					this.aClass1_Sub1_Sub1_Sub5_1 = null;
				}
				if (client.anInt223 >= this.anInt132 && client.anInt223 < this.anInt133) {
					@Pc(155) Class1_Sub1_Sub1_Sub5 local155 = this.aClass1_Sub1_Sub1_Sub5_1;
					local155.method274(this.anInt124, this.anInt136 - super.anInt982, this.anInt135 - this.anInt131, this.anInt134 - super.anInt981);
					if (super.anInt1023 == 512) {
						local155.method272();
						local155.method272();
						local155.method272();
					} else if (super.anInt1023 == 1024) {
						local155.method272();
						local155.method272();
					} else if (super.anInt1023 == 1536) {
						local155.method272();
					}
					@Pc(219) Class1_Sub1_Sub1_Sub5[] local219 = new Class1_Sub1_Sub1_Sub5[] { local11, local155 };
					local11 = new Class1_Sub1_Sub1_Sub5(2, false, local219, true);
					if (super.anInt1023 == 512) {
						local155.method272();
					} else if (super.anInt1023 == 1024) {
						local155.method272();
						local155.method272();
					} else if (super.anInt1023 == 1536) {
						local155.method272();
						local155.method272();
						local155.method272();
					}
					local155.method274(this.anInt124, super.anInt982 - this.anInt136, this.anInt131 - this.anInt135, super.anInt981 - this.anInt134);
				}
			}
			local11.aBoolean119 = true;
			return local11;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("52986, " + -67 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method40(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int local5;
			if (arg0 >= 0) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			if (this.aClass13_1 != null) {
				local5 = -1;
				if (super.anInt1004 >= 0 && super.anInt1007 == 0) {
					local5 = Class27.aClass27Array1[super.anInt1004].anIntArray225[super.anInt1005];
				} else if (super.anInt1001 >= 0) {
					local5 = Class27.aClass27Array1[super.anInt1001].anIntArray225[super.anInt1002];
				}
				return this.aClass13_1.method325(local5, null, -1);
			}
			@Pc(57) long local57 = this.aLong8;
			@Pc(59) int local59 = -1;
			@Pc(61) int local61 = -1;
			@Pc(63) int local63 = -1;
			@Pc(65) int local65 = -1;
			if (super.anInt1004 >= 0 && super.anInt1007 == 0) {
				@Pc(76) Class27 local76 = Class27.aClass27Array1[super.anInt1004];
				local59 = local76.anIntArray225[super.anInt1005];
				if (super.anInt1001 >= 0 && super.anInt1001 != super.anInt985) {
					local61 = Class27.aClass27Array1[super.anInt1001].anIntArray225[super.anInt1002];
				}
				if (local76.anInt794 >= 0) {
					local63 = local76.anInt794;
					local57 += local63 - this.anIntArray13[5] << 8;
				}
				if (local76.anInt795 >= 0) {
					local65 = local76.anInt795;
					local57 += local65 - this.anIntArray13[3] << 16;
				}
			} else if (super.anInt1001 >= 0) {
				local59 = Class27.aClass27Array1[super.anInt1001].anIntArray225[super.anInt1002];
			}
			@Pc(154) Class1_Sub1_Sub1_Sub5 local154 = (Class1_Sub1_Sub1_Sub5) aClass40_1.method591(local57);
			@Pc(160) int local160;
			@Pc(167) int local167;
			if (local154 == null) {
				@Pc(158) boolean local158 = false;
				for (local160 = 0; local160 < 12; local160++) {
					local167 = this.anIntArray13[local160];
					if (local65 >= 0 && local160 == 3) {
						local167 = local65;
					}
					if (local63 >= 0 && local160 == 5) {
						local167 = local63;
					}
					if (local167 >= 256 && local167 < 512 && !Class23.aClass23Array1[local167 - 256].method498()) {
						local158 = true;
					}
					if (local167 >= 512 && !Class15.method361(local167 - 512).method368(this.anInt127)) {
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
					if (local65 >= 0 && local167 == 3) {
						local248 = local65;
					}
					if (local63 >= 0 && local167 == 5) {
						local248 = local63;
					}
					@Pc(276) Class1_Sub1_Sub1_Sub5 local276;
					if (local248 >= 256 && local248 < 512) {
						local276 = Class23.aClass23Array1[local248 - 256].method499();
						if (local276 != null) {
							local237[local160++] = local276;
						}
					}
					if (local248 >= 512) {
						local276 = Class15.method361(local248 - 512).method369(this.anInt127);
						if (local276 != null) {
							local237[local160++] = local276;
						}
					}
				}
				local154 = new Class1_Sub1_Sub1_Sub5((byte) 2, local237, local160);
				for (local248 = 0; local248 < 5; local248++) {
					if (this.anIntArray14[local248] != 0) {
						local154.method275(client.anIntArrayArray5[local248][0], client.anIntArrayArray5[local248][this.anIntArray14[local248]]);
						if (local248 == 1) {
							local154.method275(client.anIntArray91[0], client.anIntArray91[this.anIntArray14[local248]]);
						}
					}
				}
				local154.method268();
				local154.method278(64, 850, -30, -50, -30, true);
				aClass40_1.method592(local57, local154);
				this.aLong9 = local57;
			}
			if (this.aBoolean27) {
				return local154;
			}
			@Pc(381) Class1_Sub1_Sub1_Sub5 local381 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local381.method263(Class12.method306(local59) & Class12.method306(local61), local154);
			if (local59 != -1 && local61 != -1) {
				local381.method270(Class27.aClass27Array1[super.anInt1004].anIntArray228, local61, local59);
			} else if (local59 != -1) {
				local381.method269(local59);
			}
			local381.method265(793);
			local381.anIntArrayArray9 = null;
			local381.anIntArrayArray8 = null;
			return local381;
		} catch (@Pc(429) RuntimeException local429) {
			signlink.reporterror("35186, " + arg0 + ", " + local429.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method41() {
		try {
			if (!this.aBoolean26) {
				return null;
			} else if (this.aClass13_1 == null) {
				@Pc(16) boolean local16 = false;
				if (this.anInt126 != 7) {
					throw new NullPointerException();
				}
				for (@Pc(26) int local26 = 0; local26 < 12; local26++) {
					@Pc(33) int local33 = this.anIntArray13[local26];
					if (local33 >= 256 && local33 < 512 && !Class23.aClass23Array1[local33 - 256].method500()) {
						local16 = true;
					}
					if (local33 >= 512 && !Class15.method361(local33 - 512).method370(this.anInt127)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(74) Class1_Sub1_Sub1_Sub5[] local74 = new Class1_Sub1_Sub1_Sub5[12];
				@Pc(76) int local76 = 0;
				for (@Pc(78) int local78 = 0; local78 < 12; local78++) {
					@Pc(85) int local85 = this.anIntArray13[local78];
					@Pc(99) Class1_Sub1_Sub1_Sub5 local99;
					if (local85 >= 256 && local85 < 512) {
						local99 = Class23.aClass23Array1[local85 - 256].method501();
						if (local99 != null) {
							local74[local76++] = local99;
						}
					}
					if (local85 >= 512) {
						local99 = Class15.method361(local85 - 512).method371(this.anInt127);
						if (local99 != null) {
							local74[local76++] = local99;
						}
					}
				}
				@Pc(136) Class1_Sub1_Sub1_Sub5 local136 = new Class1_Sub1_Sub1_Sub5((byte) 2, local74, local76);
				for (@Pc(138) int local138 = 0; local138 < 5; local138++) {
					if (this.anIntArray14[local138] != 0) {
						local136.method275(client.anIntArrayArray5[local138][0], client.anIntArrayArray5[local138][this.anIntArray14[local138]]);
						if (local138 == 1) {
							local136.method275(client.anIntArray91[0], client.anIntArray91[this.anIntArray14[local138]]);
						}
					}
				}
				return local136;
			} else {
				return this.aClass13_1.method326();
			}
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("42379, " + 7 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method680() {
		try {
			return this.aBoolean26;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("87353, " + false + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
