import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "Tb", descriptor = "Lclient!s;")
	public static Class40 aClass40_1 = new Class40(260, (byte) 1);

	@OriginalMember(owner = "client!ab", name = "vb", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!ab", name = "xb", descriptor = "I")
	private int anInt119;

	@OriginalMember(owner = "client!ab", name = "yb", descriptor = "I")
	public int anInt120;

	@OriginalMember(owner = "client!ab", name = "Bb", descriptor = "I")
	public int anInt121;

	@OriginalMember(owner = "client!ab", name = "Cb", descriptor = "I")
	public int anInt122;

	@OriginalMember(owner = "client!ab", name = "Db", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!ab", name = "Eb", descriptor = "I")
	public int anInt123;

	@OriginalMember(owner = "client!ab", name = "Fb", descriptor = "I")
	public int anInt124;

	@OriginalMember(owner = "client!ab", name = "Gb", descriptor = "I")
	public int anInt125;

	@OriginalMember(owner = "client!ab", name = "Hb", descriptor = "I")
	public int anInt126;

	@OriginalMember(owner = "client!ab", name = "Ib", descriptor = "I")
	public int anInt127;

	@OriginalMember(owner = "client!ab", name = "Jb", descriptor = "I")
	public int anInt128;

	@OriginalMember(owner = "client!ab", name = "Kb", descriptor = "Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 aClass1_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!ab", name = "Lb", descriptor = "I")
	public int anInt129;

	@OriginalMember(owner = "client!ab", name = "Mb", descriptor = "I")
	public int anInt130;

	@OriginalMember(owner = "client!ab", name = "Nb", descriptor = "I")
	public int anInt131;

	@OriginalMember(owner = "client!ab", name = "Ob", descriptor = "I")
	public int anInt132;

	@OriginalMember(owner = "client!ab", name = "Rb", descriptor = "Lclient!gc;")
	public Class13 aClass13_1;

	@OriginalMember(owner = "client!ab", name = "Sb", descriptor = "I")
	public int anInt133;

	@OriginalMember(owner = "client!ab", name = "qb", descriptor = "Z")
	private boolean aBoolean29 = false;

	@OriginalMember(owner = "client!ab", name = "rb", descriptor = "I")
	private int anInt118 = 77;

	@OriginalMember(owner = "client!ab", name = "sb", descriptor = "B")
	private byte aByte1 = 1;

	@OriginalMember(owner = "client!ab", name = "tb", descriptor = "Z")
	private boolean aBoolean30 = false;

	@OriginalMember(owner = "client!ab", name = "ub", descriptor = "B")
	private byte aByte2 = 121;

	@OriginalMember(owner = "client!ab", name = "wb", descriptor = "Z")
	public boolean aBoolean31 = false;

	@OriginalMember(owner = "client!ab", name = "zb", descriptor = "[I")
	public int[] anIntArray13 = new int[12];

	@OriginalMember(owner = "client!ab", name = "Ab", descriptor = "[I")
	public int[] anIntArray14 = new int[5];

	@OriginalMember(owner = "client!ab", name = "Pb", descriptor = "Z")
	public boolean aBoolean32 = false;

	@OriginalMember(owner = "client!ab", name = "Qb", descriptor = "J")
	private long aLong9 = -1L;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!lb;)V")
	public void method39(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt720 = 0;
			this.anInt119 = arg0.method480();
			this.anInt120 = arg0.method480();
			this.aClass13_1 = null;
			this.anInt133 = 0;
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
					if (this.anIntArray13[local20] >= 512 && this.anIntArray13[local20] - 512 < Class15.anInt572) {
						local84 = Class15.method361(this.anIntArray13[local20] - 512).anInt601;
						if (local84 != 0) {
							this.anInt133 = local84;
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
			super.anInt966 = arg0.method482();
			if (super.anInt966 == 65535) {
				super.anInt966 = -1;
			}
			super.anInt967 = arg0.method482();
			if (super.anInt967 == 65535) {
				super.anInt967 = -1;
			}
			super.anInt968 = arg0.method482();
			if (super.anInt968 == 65535) {
				super.anInt968 = -1;
			}
			super.anInt969 = arg0.method482();
			if (super.anInt969 == 65535) {
				super.anInt969 = -1;
			}
			super.anInt970 = arg0.method482();
			if (super.anInt970 == 65535) {
				super.anInt970 = -1;
			}
			super.anInt971 = arg0.method482();
			if (super.anInt971 == 65535) {
				super.anInt971 = -1;
			}
			super.anInt972 = arg0.method482();
			if (super.anInt972 == 65535) {
				super.anInt972 = -1;
			}
			this.aString3 = Class48.method671(Class48.method668(arg0.method486()));
			this.anInt121 = arg0.method480();
			this.anInt122 = arg0.method482();
			this.aBoolean31 = true;
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
			this.aLong8 += this.anInt119;
		} catch (@Pc(334) RuntimeException local334) {
			signlink.reporterror("78760, " + 0 + ", " + arg0 + ", " + local334.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			if (!this.aBoolean31) {
				return null;
			}
			@Pc(10) Class1_Sub1_Sub1_Sub5 local10 = this.method40();
			if (local10 == null) {
				return null;
			}
			super.anInt1003 = local10.anInt961;
			local10.aBoolean123 = true;
			if (this.aBoolean32) {
				return local10;
			}
			if (super.anInt990 != -1 && super.anInt991 != -1) {
				@Pc(39) Class33 local39 = Class33.aClass33Array1[super.anInt990];
				@Pc(42) Class1_Sub1_Sub1_Sub5 local42 = local39.method523();
				if (local42 != null) {
					@Pc(56) Class1_Sub1_Sub1_Sub5 local56 = new Class1_Sub1_Sub1_Sub5(false, 201, local42, Class12.method306(super.anInt991), true);
					local56.method274(0, -super.anInt994, 0);
					local56.method268();
					local56.method269(local39.aClass27_2.anIntArray225[super.anInt991]);
					local56.anIntArrayArray9 = null;
					local56.anIntArrayArray8 = null;
					if (local39.anInt806 != 128 || local39.anInt807 != 128) {
						local56.method277(local39.anInt806, local39.anInt807, local39.anInt806);
					}
					local56.method278(local39.anInt809 + 64, local39.anInt810 + 850, -30, -50, -30, true);
					@Pc(124) Class1_Sub1_Sub1_Sub5[] local124 = new Class1_Sub1_Sub1_Sub5[] { local10, local56 };
					local10 = new Class1_Sub1_Sub1_Sub5((byte) 60, local124, true, 2);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub5_1 != null) {
				if (client.anInt239 >= this.anInt125) {
					this.aClass1_Sub1_Sub1_Sub5_1 = null;
				}
				if (client.anInt239 >= this.anInt124 && client.anInt239 < this.anInt125) {
					@Pc(153) Class1_Sub1_Sub1_Sub5 local153 = this.aClass1_Sub1_Sub1_Sub5_1;
					local153.method274(this.anInt128 - super.anInt963, this.anInt127 - this.anInt123, this.anInt126 - super.anInt962);
					if (super.anInt1004 == 512) {
						local153.method272();
						local153.method272();
						local153.method272();
					} else if (super.anInt1004 == 1024) {
						local153.method272();
						local153.method272();
					} else if (super.anInt1004 == 1536) {
						local153.method272();
					}
					@Pc(216) Class1_Sub1_Sub1_Sub5[] local216 = new Class1_Sub1_Sub1_Sub5[] { local10, local153 };
					local10 = new Class1_Sub1_Sub1_Sub5((byte) 60, local216, true, 2);
					if (super.anInt1004 == 512) {
						local153.method272();
					} else if (super.anInt1004 == 1024) {
						local153.method272();
						local153.method272();
					} else if (super.anInt1004 == 1536) {
						local153.method272();
						local153.method272();
						local153.method272();
					}
					local153.method274(super.anInt963 - this.anInt128, this.anInt123 - this.anInt127, super.anInt962 - this.anInt126);
				}
			}
			local10.aBoolean123 = true;
			return local10;
		} catch (@Pc(288) RuntimeException local288) {
			signlink.reporterror("33235, " + true + ", " + local288.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method40() {
		try {
			if (this.aClass13_1 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt985 >= 0 && super.anInt988 == 0) {
					local6 = Class27.aClass27Array1[super.anInt985].anIntArray225[super.anInt986];
				} else if (super.anInt982 >= 0) {
					local6 = Class27.aClass27Array1[super.anInt982].anIntArray225[super.anInt983];
				}
				return this.aClass13_1.method325(-1, local6, null);
			}
			@Pc(48) long local48 = this.aLong8;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (super.anInt985 >= 0 && super.anInt988 == 0) {
				@Pc(73) Class27 local73 = Class27.aClass27Array1[super.anInt985];
				local50 = local73.anIntArray225[super.anInt986];
				if (super.anInt982 >= 0 && super.anInt982 != super.anInt966) {
					local52 = Class27.aClass27Array1[super.anInt982].anIntArray225[super.anInt983];
				}
				if (local73.anInt774 >= 0) {
					local54 = local73.anInt774;
					local48 += local54 - this.anIntArray13[5] << 8;
				}
				if (local73.anInt775 >= 0) {
					local56 = local73.anInt775;
					local48 += local56 - this.anIntArray13[3] << 16;
				}
			} else if (super.anInt982 >= 0) {
				local50 = Class27.aClass27Array1[super.anInt982].anIntArray225[super.anInt983];
			}
			@Pc(151) Class1_Sub1_Sub1_Sub5 local151 = (Class1_Sub1_Sub1_Sub5) aClass40_1.method591(local48);
			@Pc(157) int local157;
			@Pc(164) int local164;
			if (local151 == null) {
				@Pc(155) boolean local155 = false;
				for (local157 = 0; local157 < 12; local157++) {
					local164 = this.anIntArray13[local157];
					if (local56 >= 0 && local157 == 3) {
						local164 = local56;
					}
					if (local54 >= 0 && local157 == 5) {
						local164 = local54;
					}
					if (local164 >= 256 && local164 < 512 && !Class23.aClass23Array1[local164 - 256].method498(this.anInt118)) {
						local155 = true;
					}
					if (local164 >= 512 && !Class15.method361(local164 - 512).method368(this.anInt119, this.aBoolean30)) {
						local155 = true;
					}
				}
				if (local155) {
					if (this.aLong9 != -1L) {
						local151 = (Class1_Sub1_Sub1_Sub5) aClass40_1.method591(this.aLong9);
					}
					if (local151 == null) {
						return null;
					}
				}
			}
			if (local151 == null) {
				@Pc(236) Class1_Sub1_Sub1_Sub5[] local236 = new Class1_Sub1_Sub1_Sub5[12];
				local157 = 0;
				@Pc(247) int local247;
				for (local164 = 0; local164 < 12; local164++) {
					local247 = this.anIntArray13[local164];
					if (local56 >= 0 && local164 == 3) {
						local247 = local56;
					}
					if (local54 >= 0 && local164 == 5) {
						local247 = local54;
					}
					@Pc(276) Class1_Sub1_Sub1_Sub5 local276;
					if (local247 >= 256 && local247 < 512) {
						local276 = Class23.aClass23Array1[local247 - 256].method499(this.aByte1);
						if (local276 != null) {
							local236[local157++] = local276;
						}
					}
					if (local247 >= 512) {
						local276 = Class15.method361(local247 - 512).method369(this.anInt119);
						if (local276 != null) {
							local236[local157++] = local276;
						}
					}
				}
				local151 = new Class1_Sub1_Sub1_Sub5(local236, local157, false);
				for (local247 = 0; local247 < 5; local247++) {
					if (this.anIntArray14[local247] != 0) {
						local151.method275(client.anIntArrayArray3[local247][0], client.anIntArrayArray3[local247][this.anIntArray14[local247]]);
						if (local247 == 1) {
							local151.method275(client.anIntArray67[0], client.anIntArray67[this.anIntArray14[local247]]);
						}
					}
				}
				local151.method268();
				local151.method278(64, 850, -30, -50, -30, true);
				aClass40_1.method592(local151, local48);
				this.aLong9 = local48;
			}
			if (this.aBoolean32) {
				return local151;
			}
			@Pc(381) Class1_Sub1_Sub1_Sub5 local381 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local381.method263((byte) 9, local151, Class12.method306(local50) & Class12.method306(local52));
			if (local50 != -1 && local52 != -1) {
				local381.method270(Class27.aClass27Array1[super.anInt985].anIntArray228, local52, local50, this.aBoolean29);
			} else if (local50 != -1) {
				local381.method269(local50);
			}
			local381.method265();
			local381.anIntArrayArray9 = null;
			local381.anIntArrayArray8 = null;
			return local381;
		} catch (@Pc(430) RuntimeException local430) {
			signlink.reporterror("89630, " + -314 + ", " + local430.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method41() {
		try {
			if (!this.aBoolean31) {
				return null;
			} else if (this.aClass13_1 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray13[local18];
					if (local25 >= 256 && local25 < 512 && !Class23.aClass23Array1[local25 - 256].method500()) {
						local16 = true;
					}
					if (local25 >= 512 && !Class15.method361(local25 - 512).method370(this.anInt119)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(73) Class1_Sub1_Sub1_Sub5[] local73 = new Class1_Sub1_Sub1_Sub5[12];
				@Pc(75) int local75 = 0;
				for (@Pc(77) int local77 = 0; local77 < 12; local77++) {
					@Pc(84) int local84 = this.anIntArray13[local77];
					@Pc(98) Class1_Sub1_Sub1_Sub5 local98;
					if (local84 >= 256 && local84 < 512) {
						local98 = Class23.aClass23Array1[local84 - 256].method501();
						if (local98 != null) {
							local73[local75++] = local98;
						}
					}
					if (local84 >= 512) {
						local98 = Class15.method361(local84 - 512).method371(this.aByte2, this.anInt119);
						if (local98 != null) {
							local73[local75++] = local98;
						}
					}
				}
				@Pc(136) Class1_Sub1_Sub1_Sub5 local136 = new Class1_Sub1_Sub1_Sub5(local73, local75, false);
				for (@Pc(138) int local138 = 0; local138 < 5; local138++) {
					if (this.anIntArray14[local138] != 0) {
						local136.method275(client.anIntArrayArray3[local138][0], client.anIntArrayArray3[local138][this.anIntArray14[local138]]);
						if (local138 == 1) {
							local136.method275(client.anIntArray67[0], client.anIntArray67[this.anIntArray14[local138]]);
						}
					}
				}
				return local136;
			} else {
				return this.aClass13_1.method326();
			}
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("19059, " + -92 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method680() {
		try {
			return this.aBoolean31;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("46168, " + 8 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}
}
