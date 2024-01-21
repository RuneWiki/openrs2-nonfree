import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "Rb", descriptor = "Lclient!s;")
	public static Class40 aClass40_1 = new Class40(260, false);

	@OriginalMember(owner = "client!ab", name = "qb", descriptor = "I")
	private int anInt124;

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

	@OriginalMember(owner = "client!ab", name = "pb", descriptor = "I")
	private int anInt123 = -843;

	@OriginalMember(owner = "client!ab", name = "rb", descriptor = "Z")
	private boolean aBoolean21 = true;

	@OriginalMember(owner = "client!ab", name = "sb", descriptor = "I")
	private int anInt125 = -50;

	@OriginalMember(owner = "client!ab", name = "ub", descriptor = "Z")
	public boolean aBoolean22 = false;

	@OriginalMember(owner = "client!ab", name = "xb", descriptor = "[I")
	public int[] anIntArray13 = new int[12];

	@OriginalMember(owner = "client!ab", name = "yb", descriptor = "[I")
	public int[] anIntArray14 = new int[5];

	@OriginalMember(owner = "client!ab", name = "Nb", descriptor = "Z")
	public boolean aBoolean23 = false;

	@OriginalMember(owner = "client!ab", name = "Ob", descriptor = "J")
	private long aLong9 = -1L;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!lb;)V")
	public void method39(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt757 = 0;
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
					if (this.anIntArray13[local20] >= 512 && this.anIntArray13[local20] - 512 < Class15.anInt612) {
						local84 = Class15.method361(this.anIntArray13[local20] - 512).anInt641;
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
			super.anInt1005 = arg0.method482();
			if (super.anInt1005 == 65535) {
				super.anInt1005 = -1;
			}
			super.anInt1006 = arg0.method482();
			if (super.anInt1006 == 65535) {
				super.anInt1006 = -1;
			}
			super.anInt1007 = arg0.method482();
			if (super.anInt1007 == 65535) {
				super.anInt1007 = -1;
			}
			super.anInt1008 = arg0.method482();
			if (super.anInt1008 == 65535) {
				super.anInt1008 = -1;
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
			this.aString3 = Class48.method671(Class48.method668(arg0.method486((byte) 9)));
			this.anInt128 = arg0.method480();
			this.anInt129 = arg0.method482();
			this.aBoolean22 = true;
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
			signlink.reporterror("48522, " + -990 + ", " + arg0 + ", " + local334.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			if (!this.aBoolean22) {
				return null;
			}
			@Pc(10) Class1_Sub1_Sub1_Sub5 local10 = this.method40();
			if (local10 == null) {
				return null;
			}
			super.anInt1042 = local10.anInt1000;
			local10.aBoolean116 = true;
			if (this.aBoolean23) {
				return local10;
			}
			if (super.anInt1029 != -1 && super.anInt1030 != -1) {
				@Pc(39) Class33 local39 = Class33.aClass33Array1[super.anInt1029];
				@Pc(42) Class1_Sub1_Sub1_Sub5 local42 = local39.method523();
				if (local42 != null) {
					@Pc(56) Class1_Sub1_Sub1_Sub5 local56 = new Class1_Sub1_Sub1_Sub5(Class12.method306(super.anInt1030), false, 0, true, local42);
					local56.method274(0, -super.anInt1033, 0);
					local56.method268(this.anInt124);
					local56.method269(local39.aClass27_2.anIntArray225[super.anInt1030]);
					local56.anIntArrayArray9 = null;
					local56.anIntArrayArray8 = null;
					if (local39.anInt843 != 128 || local39.anInt844 != 128) {
						local56.method277(local39.anInt844, local39.anInt843, local39.anInt843);
					}
					local56.method278(local39.anInt846 + 64, local39.anInt847 + 850, -30, -50, -30, true);
					@Pc(125) Class1_Sub1_Sub1_Sub5[] local125 = new Class1_Sub1_Sub1_Sub5[] { local10, local56 };
					local10 = new Class1_Sub1_Sub1_Sub5(2, (byte) 6, local125, true);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub5_1 != null) {
				if (client.anInt283 >= this.anInt132) {
					this.aClass1_Sub1_Sub1_Sub5_1 = null;
				}
				if (client.anInt283 >= this.anInt131 && client.anInt283 < this.anInt132) {
					@Pc(154) Class1_Sub1_Sub1_Sub5 local154 = this.aClass1_Sub1_Sub1_Sub5_1;
					local154.method274(this.anInt133 - super.anInt1001, this.anInt134 - this.anInt130, this.anInt135 - super.anInt1002);
					if (super.anInt1043 == 512) {
						local154.method272();
						local154.method272();
						local154.method272();
					} else if (super.anInt1043 == 1024) {
						local154.method272();
						local154.method272();
					} else if (super.anInt1043 == 1536) {
						local154.method272();
					}
					@Pc(217) Class1_Sub1_Sub1_Sub5[] local217 = new Class1_Sub1_Sub1_Sub5[] { local10, local154 };
					local10 = new Class1_Sub1_Sub1_Sub5(2, (byte) 6, local217, true);
					if (super.anInt1043 == 512) {
						local154.method272();
					} else if (super.anInt1043 == 1024) {
						local154.method272();
						local154.method272();
					} else if (super.anInt1043 == 1536) {
						local154.method272();
						local154.method272();
						local154.method272();
					}
					local154.method274(super.anInt1001 - this.anInt133, this.anInt130 - this.anInt134, super.anInt1002 - this.anInt135);
				}
			}
			local10.aBoolean116 = true;
			return local10;
		} catch (@Pc(289) RuntimeException local289) {
			signlink.reporterror("33581, " + -59 + ", " + local289.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method40() {
		try {
			if (this.aClass13_1 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt1024 >= 0 && super.anInt1027 == 0) {
					local6 = Class27.aClass27Array1[super.anInt1024].anIntArray225[super.anInt1025];
				} else if (super.anInt1021 >= 0) {
					local6 = Class27.aClass27Array1[super.anInt1021].anIntArray225[super.anInt1022];
				}
				return this.aClass13_1.method325(-1, null, local6);
			}
			@Pc(48) long local48 = this.aLong8;
			@Pc(57) int local57 = -1;
			@Pc(59) int local59 = -1;
			@Pc(61) int local61 = -1;
			@Pc(63) int local63 = -1;
			if (super.anInt1024 >= 0 && super.anInt1027 == 0) {
				@Pc(74) Class27 local74 = Class27.aClass27Array1[super.anInt1024];
				local57 = local74.anIntArray225[super.anInt1025];
				if (super.anInt1021 >= 0 && super.anInt1021 != super.anInt1005) {
					local59 = Class27.aClass27Array1[super.anInt1021].anIntArray225[super.anInt1022];
				}
				if (local74.anInt811 >= 0) {
					local61 = local74.anInt811;
					local48 += local61 - this.anIntArray13[5] << 8;
				}
				if (local74.anInt812 >= 0) {
					local63 = local74.anInt812;
					local48 += local63 - this.anIntArray13[3] << 16;
				}
			} else if (super.anInt1021 >= 0) {
				local57 = Class27.aClass27Array1[super.anInt1021].anIntArray225[super.anInt1022];
			}
			@Pc(152) Class1_Sub1_Sub1_Sub5 local152 = (Class1_Sub1_Sub1_Sub5) aClass40_1.method591(local48);
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
					if (local165 >= 256 && local165 < 512 && !Class23.aClass23Array1[local165 - 256].method498()) {
						local156 = true;
					}
					if (local165 >= 512 && !Class15.method361(local165 - 512).method368(this.anInt126)) {
						local156 = true;
					}
				}
				if (local156) {
					if (this.aLong9 != -1L) {
						local152 = (Class1_Sub1_Sub1_Sub5) aClass40_1.method591(this.aLong9);
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
						local274 = Class23.aClass23Array1[local246 - 256].method499((byte) 5);
						if (local274 != null) {
							local235[local158++] = local274;
						}
					}
					if (local246 >= 512) {
						local274 = Class15.method361(local246 - 512).method369(this.anInt126);
						if (local274 != null) {
							local235[local158++] = local274;
						}
					}
				}
				local152 = new Class1_Sub1_Sub1_Sub5(local158, local235, (byte) 1);
				for (local246 = 0; local246 < 5; local246++) {
					if (this.anIntArray14[local246] != 0) {
						local152.method275(client.anIntArrayArray4[local246][0], client.anIntArrayArray4[local246][this.anIntArray14[local246]]);
						if (local246 == 1) {
							local152.method275(client.anIntArray79[0], client.anIntArray79[this.anIntArray14[local246]]);
						}
					}
				}
				local152.method268(this.anInt124);
				local152.method278(64, 850, -30, -50, -30, true);
				aClass40_1.method592(local152, local48, this.aBoolean21);
				this.aLong9 = local48;
			}
			if (this.aBoolean23) {
				return local152;
			}
			@Pc(381) Class1_Sub1_Sub1_Sub5 local381 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local381.method263(this.anInt123, Class12.method306(local57) & Class12.method306(local59), local152);
			if (local57 != -1 && local59 != -1) {
				local381.method270(local59, Class27.aClass27Array1[super.anInt1024].anIntArray228, local57);
			} else if (local57 != -1) {
				local381.method269(local57);
			}
			local381.method265();
			local381.anIntArrayArray9 = null;
			local381.anIntArrayArray8 = null;
			return local381;
		} catch (@Pc(430) RuntimeException local430) {
			signlink.reporterror("36583, " + -48 + ", " + local430.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method41() {
		try {
			if (!this.aBoolean22) {
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
				@Pc(75) Class1_Sub1_Sub1_Sub5[] local75 = new Class1_Sub1_Sub1_Sub5[12];
				@Pc(77) int local77 = 0;
				for (@Pc(79) int local79 = 0; local79 < 12; local79++) {
					@Pc(86) int local86 = this.anIntArray13[local79];
					@Pc(100) Class1_Sub1_Sub1_Sub5 local100;
					if (local86 >= 256 && local86 < 512) {
						local100 = Class23.aClass23Array1[local86 - 256].method501();
						if (local100 != null) {
							local75[local77++] = local100;
						}
					}
					if (local86 >= 512) {
						local100 = Class15.method361(local86 - 512).method371(this.anInt126);
						if (local100 != null) {
							local75[local77++] = local100;
						}
					}
				}
				@Pc(137) Class1_Sub1_Sub1_Sub5 local137 = new Class1_Sub1_Sub1_Sub5(local77, local75, (byte) 1);
				for (@Pc(139) int local139 = 0; local139 < 5; local139++) {
					if (this.anIntArray14[local139] != 0) {
						local137.method275(client.anIntArrayArray4[local139][0], client.anIntArrayArray4[local139][this.anIntArray14[local139]]);
						if (local139 == 1) {
							local137.method275(client.anIntArray79[0], client.anIntArray79[this.anIntArray14[local139]]);
						}
					}
				}
				return local137;
			} else {
				return this.aClass13_1.method326();
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("41817, " + false + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method680() {
		try {
			return this.aBoolean22;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("52258, " + -120 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}
}
