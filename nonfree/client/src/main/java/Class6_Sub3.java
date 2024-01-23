import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "[S")
	public short[] aShortArray26;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "[Lclient!pm;")
	public Class134[] aClass134Array1;

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "[I")
	public int[] anIntArray209;

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "[S")
	public short[] aShortArray27;

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "[Lclient!ba;")
	public Class12[] aClass12Array1;

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "S")
	private short aShort13;

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "S")
	public short aShort14;

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "[[I")
	public int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "[I")
	public int[] anIntArray210;

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!gd", name = "A", descriptor = "[I")
	public int[] anIntArray211;

	@OriginalMember(owner = "client!gd", name = "C", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!gd", name = "D", descriptor = "[I")
	public int[] anIntArray213;

	@OriginalMember(owner = "client!gd", name = "E", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!gd", name = "H", descriptor = "S")
	private short aShort15;

	@OriginalMember(owner = "client!gd", name = "I", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!gd", name = "J", descriptor = "S")
	private short aShort17;

	@OriginalMember(owner = "client!gd", name = "L", descriptor = "[S")
	public short[] aShortArray30;

	@OriginalMember(owner = "client!gd", name = "M", descriptor = "[S")
	public short[] aShortArray31;

	@OriginalMember(owner = "client!gd", name = "N", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!gd", name = "P", descriptor = "I")
	public int anInt1643;

	@OriginalMember(owner = "client!gd", name = "Q", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!gd", name = "R", descriptor = "[I")
	public int[] anIntArray215;

	@OriginalMember(owner = "client!gd", name = "S", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!gd", name = "U", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!gd", name = "V", descriptor = "S")
	public short aShort18;

	@OriginalMember(owner = "client!gd", name = "W", descriptor = "[[I")
	public int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!gd", name = "X", descriptor = "[I")
	public int[] anIntArray216;

	@OriginalMember(owner = "client!gd", name = "Y", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!gd", name = "Z", descriptor = "[S")
	public short[] aShortArray32;

	@OriginalMember(owner = "client!gd", name = "ab", descriptor = "[S")
	public short[] aShortArray33;

	@OriginalMember(owner = "client!gd", name = "bb", descriptor = "[I")
	public int[] anIntArray217;

	@OriginalMember(owner = "client!gd", name = "db", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!gd", name = "eb", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!gd", name = "fb", descriptor = "[I")
	public int[] anIntArray219;

	@OriginalMember(owner = "client!gd", name = "gb", descriptor = "[S")
	public short[] aShortArray34;

	@OriginalMember(owner = "client!gd", name = "hb", descriptor = "[S")
	public short[] aShortArray35;

	@OriginalMember(owner = "client!gd", name = "ib", descriptor = "[Lclient!ba;")
	public Class12[] aClass12Array2;

	@OriginalMember(owner = "client!gd", name = "jb", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
	public int anInt1640 = 0;

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "B")
	public byte aByte8 = 0;

	@OriginalMember(owner = "client!gd", name = "G", descriptor = "Z")
	private boolean aBoolean123 = false;

	@OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
	public int anInt1642 = 0;

	@OriginalMember(owner = "client!gd", name = "T", descriptor = "I")
	public int anInt1644 = 0;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
	private Class6_Sub3() {
	}

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "([B)V")
	public Class6_Sub3(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1414(arg0);
		} else {
			this.method1423(arg0);
		}
	}

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(III)V")
	public Class6_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray216 = new int[arg0];
		this.anIntArray209 = new int[arg0];
		this.anIntArray217 = new int[arg0];
		this.anIntArray219 = new int[arg0];
		this.anIntArray211 = new int[arg1];
		this.anIntArray213 = new int[arg1];
		this.anIntArray215 = new int[arg1];
		this.aByteArray34 = new byte[arg1];
		this.aByteArray28 = new byte[arg1];
		this.aByteArray32 = new byte[arg1];
		this.aShortArray34 = new short[arg1];
		this.aShortArray32 = new short[arg1];
		this.aByteArray27 = new byte[arg1];
		this.anIntArray210 = new int[arg1];
	}

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "([Lclient!gd;I)V")
	public Class6_Sub3(@OriginalArg(0) Class6_Sub3[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		this.anInt1644 = 0;
		this.anInt1640 = 0;
		this.anInt1643 = 0;
		this.aByte8 = -1;
		@Pc(46) int local46;
		for (local46 = 0; local46 < arg1; local46++) {
			@Pc(53) Class6_Sub3 local53 = arg0[local46];
			if (local53 != null) {
				this.anInt1644 += local53.anInt1644;
				this.anInt1640 += local53.anInt1640;
				this.anInt1643 += local53.anInt1643;
				if (local53.aByteArray28 == null) {
					if (this.aByte8 == -1) {
						this.aByte8 = local53.aByte8;
					}
					if (this.aByte8 != local53.aByte8) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local53.aByteArray34 != null;
				local22 |= local53.aByteArray32 != null;
				local24 |= local53.anIntArray210 != null;
				local26 |= local53.aShortArray32 != null;
				local28 |= local53.aByteArray27 != null;
			}
		}
		this.anIntArray216 = new int[this.anInt1644];
		this.anIntArray209 = new int[this.anInt1644];
		this.anIntArray217 = new int[this.anInt1644];
		this.anIntArray219 = new int[this.anInt1644];
		this.aShortArray28 = new short[this.anInt1644];
		this.anIntArray211 = new int[this.anInt1640];
		this.anIntArray213 = new int[this.anInt1640];
		this.anIntArray215 = new int[this.anInt1640];
		if (local18) {
			this.aByteArray34 = new byte[this.anInt1640];
		}
		if (local20) {
			this.aByteArray28 = new byte[this.anInt1640];
		}
		if (local22) {
			this.aByteArray32 = new byte[this.anInt1640];
		}
		if (local24) {
			this.anIntArray210 = new int[this.anInt1640];
		}
		if (local26) {
			this.aShortArray32 = new short[this.anInt1640];
		}
		if (local28) {
			this.aByteArray27 = new byte[this.anInt1640];
		}
		this.aShortArray34 = new short[this.anInt1640];
		this.aShortArray26 = new short[this.anInt1640];
		if (this.anInt1643 > 0) {
			this.aByteArray33 = new byte[this.anInt1643];
			this.aShortArray27 = new short[this.anInt1643];
			this.aShortArray33 = new short[this.anInt1643];
			this.aShortArray29 = new short[this.anInt1643];
			this.aShortArray31 = new short[this.anInt1643];
			this.aShortArray30 = new short[this.anInt1643];
			this.aShortArray35 = new short[this.anInt1643];
			this.aByteArray29 = new byte[this.anInt1643];
			this.aByteArray30 = new byte[this.anInt1643];
			this.aByteArray31 = new byte[this.anInt1643];
			this.aByteArray25 = new byte[this.anInt1643];
			this.aByteArray26 = new byte[this.anInt1643];
		}
		this.anInt1644 = 0;
		this.anInt1640 = 0;
		this.anInt1643 = 0;
		@Pc(330) Class6_Sub3 local330;
		for (local46 = 0; local46 < arg1; local46++) {
			@Pc(326) short local326 = (short) (0x1 << local46);
			local330 = arg0[local46];
			if (local330 != null) {
				for (@Pc(334) int local334 = 0; local334 < local330.anInt1640; local334++) {
					if (local18 && local330.aByteArray34 != null) {
						this.aByteArray34[this.anInt1640] = local330.aByteArray34[local334];
					}
					if (local20) {
						if (local330.aByteArray28 == null) {
							this.aByteArray28[this.anInt1640] = local330.aByte8;
						} else {
							this.aByteArray28[this.anInt1640] = local330.aByteArray28[local334];
						}
					}
					if (local22 && local330.aByteArray32 != null) {
						this.aByteArray32[this.anInt1640] = local330.aByteArray32[local334];
					}
					if (local24 && local330.anIntArray210 != null) {
						this.anIntArray210[this.anInt1640] = local330.anIntArray210[local334];
					}
					if (local26) {
						if (local330.aShortArray32 == null) {
							this.aShortArray32[this.anInt1640] = -1;
						} else {
							this.aShortArray32[this.anInt1640] = local330.aShortArray32[local334];
						}
					}
					this.aShortArray34[this.anInt1640] = local330.aShortArray34[local334];
					this.aShortArray26[this.anInt1640] = local326;
					this.anIntArray211[this.anInt1640] = this.method1433(local330, local330.anIntArray211[local334], local326);
					this.anIntArray213[this.anInt1640] = this.method1433(local330, local330.anIntArray213[local334], local326);
					this.anIntArray215[this.anInt1640] = this.method1433(local330, local330.anIntArray215[local334], local326);
					this.anInt1640++;
				}
			}
		}
		local46 = 0;
		this.anInt1642 = this.anInt1644;
		for (@Pc(495) int local495 = 0; local495 < arg1; local495++) {
			local330 = arg0[local495];
			@Pc(507) short local507 = (short) (0x1 << local495);
			if (local330 != null) {
				@Pc(511) int local511;
				for (local511 = 0; local511 < local330.anInt1640; local511++) {
					if (local28) {
						this.aByteArray27[local46++] = (byte) (local330.aByteArray27 == null || local330.aByteArray27[local511] == -1 ? -1 : local330.aByteArray27[local511] + this.anInt1643);
					}
				}
				for (local511 = 0; local511 < local330.anInt1643; local511++) {
					@Pc(560) byte local560 = this.aByteArray33[this.anInt1643] = local330.aByteArray33[local511];
					if (local560 == 0) {
						this.aShortArray27[this.anInt1643] = (short) this.method1433(local330, local330.aShortArray27[local511], local507);
						this.aShortArray33[this.anInt1643] = (short) this.method1433(local330, local330.aShortArray33[local511], local507);
						this.aShortArray29[this.anInt1643] = (short) this.method1433(local330, local330.aShortArray29[local511], local507);
					}
					if (local560 >= 1 && local560 <= 3) {
						this.aShortArray27[this.anInt1643] = local330.aShortArray27[local511];
						this.aShortArray33[this.anInt1643] = local330.aShortArray33[local511];
						this.aShortArray29[this.anInt1643] = local330.aShortArray29[local511];
						this.aShortArray31[this.anInt1643] = local330.aShortArray31[local511];
						this.aShortArray30[this.anInt1643] = local330.aShortArray30[local511];
						this.aShortArray35[this.anInt1643] = local330.aShortArray35[local511];
						this.aByteArray29[this.anInt1643] = local330.aByteArray29[local511];
						this.aByteArray30[this.anInt1643] = local330.aByteArray30[local511];
						this.aByteArray31[this.anInt1643] = local330.aByteArray31[local511];
					}
					if (local560 == 2) {
						this.aByteArray25[this.anInt1643] = local330.aByteArray25[local511];
						this.aByteArray26[this.anInt1643] = local330.aByteArray26[local511];
					}
					this.anInt1643++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!gd;ZZZZ)V")
	public Class6_Sub3(@OriginalArg(0) Class6_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1644 = arg0.anInt1644;
		this.anInt1642 = arg0.anInt1642;
		this.anInt1640 = arg0.anInt1640;
		this.anInt1643 = arg0.anInt1643;
		@Pc(64) int local64;
		if (arg1) {
			this.anIntArray216 = arg0.anIntArray216;
			this.anIntArray209 = arg0.anIntArray209;
			this.anIntArray217 = arg0.anIntArray217;
		} else {
			this.anIntArray216 = new int[this.anInt1644];
			this.anIntArray209 = new int[this.anInt1644];
			this.anIntArray217 = new int[this.anInt1644];
			for (local64 = 0; local64 < this.anInt1644; local64++) {
				this.anIntArray216[local64] = arg0.anIntArray216[local64];
				this.anIntArray209[local64] = arg0.anIntArray209[local64];
				this.anIntArray217[local64] = arg0.anIntArray217[local64];
			}
		}
		if (arg2) {
			this.aShortArray34 = arg0.aShortArray34;
		} else {
			this.aShortArray34 = new short[this.anInt1640];
			for (local64 = 0; local64 < this.anInt1640; local64++) {
				this.aShortArray34[local64] = arg0.aShortArray34[local64];
			}
		}
		if (arg3 || arg0.aShortArray32 == null) {
			this.aShortArray32 = arg0.aShortArray32;
		} else {
			this.aShortArray32 = new short[this.anInt1640];
			for (local64 = 0; local64 < this.anInt1640; local64++) {
				this.aShortArray32[local64] = arg0.aShortArray32[local64];
			}
		}
		this.aByteArray32 = arg0.aByteArray32;
		this.anIntArray211 = arg0.anIntArray211;
		this.anIntArray213 = arg0.anIntArray213;
		this.anIntArray215 = arg0.anIntArray215;
		this.aByteArray34 = arg0.aByteArray34;
		this.aByteArray28 = arg0.aByteArray28;
		this.aByteArray27 = arg0.aByteArray27;
		this.aByte8 = arg0.aByte8;
		this.aByteArray33 = arg0.aByteArray33;
		this.aShortArray27 = arg0.aShortArray27;
		this.aShortArray33 = arg0.aShortArray33;
		this.aShortArray29 = arg0.aShortArray29;
		this.aShortArray31 = arg0.aShortArray31;
		this.aShortArray30 = arg0.aShortArray30;
		this.aShortArray35 = arg0.aShortArray35;
		this.aByteArray29 = arg0.aByteArray29;
		this.aByteArray30 = arg0.aByteArray30;
		this.aByteArray31 = arg0.aByteArray31;
		this.aByteArray25 = arg0.aByteArray25;
		this.aByteArray26 = arg0.aByteArray26;
		this.anIntArray219 = arg0.anIntArray219;
		this.anIntArray210 = arg0.anIntArray210;
		this.anIntArrayArray15 = arg0.anIntArrayArray15;
		this.anIntArrayArray14 = arg0.anIntArrayArray14;
		this.aClass12Array1 = arg0.aClass12Array1;
		this.aClass134Array1 = arg0.aClass134Array1;
		this.aClass12Array2 = arg0.aClass12Array2;
		this.aShort14 = arg0.aShort14;
		this.aShort18 = arg0.aShort18;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([B)V")
	private void method1414(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub18 local4 = new Class1_Sub18(arg0);
		@Pc(9) Class1_Sub18 local9 = new Class1_Sub18(arg0);
		@Pc(14) Class1_Sub18 local14 = new Class1_Sub18(arg0);
		@Pc(19) Class1_Sub18 local19 = new Class1_Sub18(arg0);
		@Pc(24) Class1_Sub18 local24 = new Class1_Sub18(arg0);
		@Pc(29) Class1_Sub18 local29 = new Class1_Sub18(arg0);
		@Pc(34) Class1_Sub18 local34 = new Class1_Sub18(arg0);
		local4.anInt3911 = arg0.length - 23;
		@Pc(44) int local44 = local4.method3107();
		@Pc(48) int local48 = local4.method3107();
		@Pc(52) int local52 = local4.method3122();
		@Pc(56) int local56 = local4.method3122();
		@Pc(65) boolean local65 = (local56 & 0x1) == 1;
		@Pc(74) boolean local74 = (local56 & 0x2) == 2;
		@Pc(78) int local78 = local4.method3122();
		@Pc(82) int local82 = local4.method3122();
		@Pc(86) int local86 = local4.method3122();
		@Pc(90) int local90 = local4.method3122();
		@Pc(94) int local94 = local4.method3122();
		@Pc(98) int local98 = local4.method3107();
		@Pc(102) int local102 = local4.method3107();
		@Pc(106) int local106 = local4.method3107();
		@Pc(110) int local110 = local4.method3107();
		@Pc(114) int local114 = local4.method3107();
		@Pc(116) int local116 = 0;
		@Pc(118) int local118 = 0;
		@Pc(120) int local120 = 0;
		@Pc(131) int local131;
		if (local52 > 0) {
			this.aByteArray33 = new byte[local52];
			local4.anInt3911 = 0;
			for (local131 = 0; local131 < local52; local131++) {
				@Pc(143) byte local143 = this.aByteArray33[local131] = local4.method3082();
				if (local143 == 0) {
					local116++;
				}
				if (local143 >= 1 && local143 <= 3) {
					local118++;
				}
				if (local143 == 2) {
					local120++;
				}
			}
		}
		local131 = local52 + local44;
		@Pc(169) int local169 = local131;
		if (local65) {
			local131 += local48;
		}
		@Pc(177) int local177 = local131;
		local131 += local48;
		@Pc(183) int local183 = local131;
		if (local78 == 255) {
			local131 += local48;
		}
		@Pc(192) int local192 = local131;
		if (local86 == 1) {
			local131 += local48;
		}
		@Pc(201) int local201 = local131;
		if (local94 == 1) {
			local131 += local44;
		}
		@Pc(210) int local210 = local131;
		if (local82 == 1) {
			local131 += local48;
		}
		@Pc(219) int local219 = local131;
		local131 += local110;
		@Pc(225) int local225 = local131;
		if (local90 == 1) {
			local131 += local48 * 2;
		}
		@Pc(236) int local236 = local131;
		local131 += local114;
		@Pc(242) int local242 = local131;
		local131 += local48 * 2;
		@Pc(250) int local250 = local131;
		local131 += local98;
		@Pc(256) int local256 = local131;
		local131 += local102;
		@Pc(262) int local262 = local131;
		local131 += local106;
		@Pc(268) int local268 = local131;
		local131 += local116 * 6;
		@Pc(276) int local276 = local131;
		local131 += local118 * 6;
		@Pc(284) int local284 = local131;
		local131 += local118 * 6;
		@Pc(292) int local292 = local131;
		local131 += local118;
		@Pc(298) int local298 = local131;
		local131 += local118;
		@Pc(304) int local304 = local131;
		local131 += local118 + local120 * 2;
		this.anInt1644 = local44;
		this.anInt1640 = local48;
		this.anInt1643 = local52;
		this.anIntArray216 = new int[local44];
		this.anIntArray209 = new int[local44];
		this.anIntArray217 = new int[local44];
		this.anIntArray211 = new int[local48];
		this.anIntArray213 = new int[local48];
		this.anIntArray215 = new int[local48];
		if (local94 == 1) {
			this.anIntArray219 = new int[local44];
		}
		if (local65) {
			this.aByteArray34 = new byte[local48];
		}
		if (local78 == 255) {
			this.aByteArray28 = new byte[local48];
		} else {
			this.aByte8 = (byte) local78;
		}
		if (local82 == 1) {
			this.aByteArray32 = new byte[local48];
		}
		if (local86 == 1) {
			this.anIntArray210 = new int[local48];
		}
		if (local90 == 1) {
			this.aShortArray32 = new short[local48];
		}
		if (local90 == 1 && local52 > 0) {
			this.aByteArray27 = new byte[local48];
		}
		this.aShortArray34 = new short[local48];
		if (local52 > 0) {
			this.aShortArray27 = new short[local52];
			this.aShortArray33 = new short[local52];
			this.aShortArray29 = new short[local52];
			if (local118 > 0) {
				this.aShortArray31 = new short[local118];
				this.aShortArray30 = new short[local118];
				this.aShortArray35 = new short[local118];
				this.aByteArray29 = new byte[local118];
				this.aByteArray30 = new byte[local118];
				this.aByteArray31 = new byte[local118];
			}
			if (local120 > 0) {
				this.aByteArray25 = new byte[local120];
				this.aByteArray26 = new byte[local120];
			}
		}
		local4.anInt3911 = local52;
		local9.anInt3911 = local250;
		local14.anInt3911 = local256;
		local19.anInt3911 = local262;
		local24.anInt3911 = local201;
		@Pc(473) int local473 = 0;
		@Pc(475) int local475 = 0;
		@Pc(477) int local477 = 0;
		@Pc(479) int local479;
		@Pc(486) int local486;
		@Pc(488) int local488;
		@Pc(498) int local498;
		@Pc(508) int local508;
		for (local479 = 0; local479 < local44; local479++) {
			local486 = local4.method3122();
			local488 = 0;
			if ((local486 & 0x1) != 0) {
				local488 = local9.method3081();
			}
			local498 = 0;
			if ((local486 & 0x2) != 0) {
				local498 = local14.method3081();
			}
			local508 = 0;
			if ((local486 & 0x4) != 0) {
				local508 = local19.method3081();
			}
			this.anIntArray216[local479] = local473 + local488;
			this.anIntArray209[local479] = local475 + local498;
			this.anIntArray217[local479] = local477 + local508;
			local473 = this.anIntArray216[local479];
			local475 = this.anIntArray209[local479];
			local477 = this.anIntArray217[local479];
			if (local94 == 1) {
				this.anIntArray219[local479] = local24.method3122();
			}
		}
		local4.anInt3911 = local242;
		local9.anInt3911 = local169;
		local14.anInt3911 = local183;
		local19.anInt3911 = local210;
		local24.anInt3911 = local192;
		local29.anInt3911 = local225;
		local34.anInt3911 = local236;
		for (local479 = 0; local479 < local48; local479++) {
			this.aShortArray34[local479] = (short) local4.method3107();
			if (local65) {
				this.aByteArray34[local479] = local9.method3082();
			}
			if (local78 == 255) {
				this.aByteArray28[local479] = local14.method3082();
			}
			if (local82 == 1) {
				this.aByteArray32[local479] = local19.method3082();
			}
			if (local86 == 1) {
				this.anIntArray210[local479] = local24.method3122();
			}
			if (local90 == 1) {
				this.aShortArray32[local479] = (short) (local29.method3107() - 1);
			}
			if (this.aByteArray27 != null) {
				if (this.aShortArray32[local479] == -1) {
					this.aByteArray27[local479] = -1;
				} else {
					this.aByteArray27[local479] = (byte) (local34.method3122() - 1);
				}
			}
		}
		this.anInt1642 = -1;
		local4.anInt3911 = local219;
		local9.anInt3911 = local177;
		local479 = 0;
		local486 = 0;
		local488 = 0;
		local498 = 0;
		@Pc(703) int local703;
		for (local508 = 0; local508 < local48; local508++) {
			local703 = local9.method3122();
			if (local703 == 1) {
				local479 = local4.method3081() + local498;
				local486 = local4.method3081() + local479;
				local488 = local4.method3081() + local486;
				local498 = local488;
				this.anIntArray211[local508] = local479;
				this.anIntArray213[local508] = local486;
				this.anIntArray215[local508] = local488;
				if (local479 > this.anInt1642) {
					this.anInt1642 = local479;
				}
				if (local486 > this.anInt1642) {
					this.anInt1642 = local486;
				}
				if (local488 > this.anInt1642) {
					this.anInt1642 = local488;
				}
			}
			if (local703 == 2) {
				local486 = local488;
				local488 = local4.method3081() + local498;
				local498 = local488;
				this.anIntArray211[local508] = local479;
				this.anIntArray213[local508] = local486;
				this.anIntArray215[local508] = local488;
				if (local488 > this.anInt1642) {
					this.anInt1642 = local488;
				}
			}
			if (local703 == 3) {
				local479 = local488;
				local488 = local4.method3081() + local498;
				local498 = local488;
				this.anIntArray211[local508] = local479;
				this.anIntArray213[local508] = local486;
				this.anIntArray215[local508] = local488;
				if (local488 > this.anInt1642) {
					this.anInt1642 = local488;
				}
			}
			if (local703 == 4) {
				@Pc(841) int local841 = local479;
				local479 = local486;
				local486 = local841;
				local488 = local4.method3081() + local498;
				local498 = local488;
				this.anIntArray211[local508] = local479;
				this.anIntArray213[local508] = local841;
				this.anIntArray215[local508] = local488;
				if (local488 > this.anInt1642) {
					this.anInt1642 = local488;
				}
			}
		}
		this.anInt1642++;
		local4.anInt3911 = local268;
		local9.anInt3911 = local276;
		local14.anInt3911 = local284;
		local19.anInt3911 = local292;
		local24.anInt3911 = local298;
		local29.anInt3911 = local304;
		for (local508 = 0; local508 < local52; local508++) {
			local703 = this.aByteArray33[local508] & 0xFF;
			if (local703 == 0) {
				this.aShortArray27[local508] = (short) local4.method3107();
				this.aShortArray33[local508] = (short) local4.method3107();
				this.aShortArray29[local508] = (short) local4.method3107();
			}
			if (local703 == 1) {
				this.aShortArray27[local508] = (short) local9.method3107();
				this.aShortArray33[local508] = (short) local9.method3107();
				this.aShortArray29[local508] = (short) local9.method3107();
				this.aShortArray31[local508] = (short) local14.method3107();
				this.aShortArray30[local508] = (short) local14.method3107();
				this.aShortArray35[local508] = (short) local14.method3107();
				this.aByteArray29[local508] = local19.method3082();
				this.aByteArray30[local508] = local24.method3082();
				this.aByteArray31[local508] = local29.method3082();
			}
			if (local703 == 2) {
				this.aShortArray27[local508] = (short) local9.method3107();
				this.aShortArray33[local508] = (short) local9.method3107();
				this.aShortArray29[local508] = (short) local9.method3107();
				this.aShortArray31[local508] = (short) local14.method3107();
				this.aShortArray30[local508] = (short) local14.method3107();
				this.aShortArray35[local508] = (short) local14.method3107();
				this.aByteArray29[local508] = local19.method3082();
				this.aByteArray30[local508] = local24.method3082();
				this.aByteArray31[local508] = local29.method3082();
				this.aByteArray25[local508] = local29.method3082();
				this.aByteArray26[local508] = local29.method3082();
			}
			if (local703 == 3) {
				this.aShortArray27[local508] = (short) local9.method3107();
				this.aShortArray33[local508] = (short) local9.method3107();
				this.aShortArray29[local508] = (short) local9.method3107();
				this.aShortArray31[local508] = (short) local14.method3107();
				this.aShortArray30[local508] = (short) local14.method3107();
				this.aShortArray35[local508] = (short) local14.method3107();
				this.aByteArray29[local508] = local19.method3082();
				this.aByteArray30[local508] = local24.method3082();
				this.aByteArray31[local508] = local29.method3082();
			}
		}
		if (!local74) {
			return;
		}
		local4.anInt3911 = local131;
		local508 = local4.method3122();
		if (local508 > 0) {
			local4.anInt3911 += local508 * 4;
		}
		local703 = local4.method3122();
		if (local703 > 0) {
			local4.anInt3911 += local703 * 4;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([[IIIIII)V")
	private void method1415(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static85.method1431(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static85.method1431(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static85.method1431(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static85.method1431(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		if (arg5 != 0) {
			@Pc(120) int local120 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
			if (local120 != 0) {
				this.method1429(local120);
			}
		}
		if (arg4 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
			if (local140 != 0) {
				this.method1443(local140);
			}
		}
		@Pc(149) int local149 = local24 + local77;
		if (local42 + local60 < local149) {
			local149 = local42 + local60;
		}
		local149 = (local149 >> 1) - arg2;
		if (local149 != 0) {
			this.method1427(0, local149, 0);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "()V")
	public void method1417() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1644; local1++) {
			this.anIntArray216[local1] = -this.anIntArray216[local1];
			this.anIntArray217[local1] = -this.anIntArray217[local1];
		}
		this.method1419();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Lclient!j;")
	@Override
	public Class6 method3834() {
		return this.method1425(this.aShort14, this.aShort18, -50, -10, -50);
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(III)V")
	public void method1418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1644; local1++) {
			this.anIntArray216[local1] = this.anIntArray216[local1] * arg0 / 128;
			this.anIntArray209[local1] = this.anIntArray209[local1] * arg1 / 128;
			this.anIntArray217[local1] = this.anIntArray217[local1] * arg2 / 128;
		}
		this.method1419();
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "()V")
	private void method1419() {
		this.aClass12Array1 = null;
		this.aClass12Array2 = null;
		this.aClass134Array1 = null;
		this.aBoolean123 = false;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(III)I")
	public int method1420(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1644; local1++) {
			if (this.anIntArray216[local1] == arg0 && this.anIntArray209[local1] == 0 && this.anIntArray217[local1] == arg1) {
				return local1;
			}
		}
		this.anIntArray216[this.anInt1644] = arg0;
		this.anIntArray209[this.anInt1644] = 0;
		this.anIntArray217[this.anInt1644] = arg1;
		this.anInt1642 = ++this.anInt1644;
		return this.anInt1644 - 1;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(SS)V")
	public void method1421(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray32 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt1640; local5++) {
			if (this.aShortArray32[local5] == arg0) {
				this.aShortArray32[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "()V")
	public void method1422() {
		this.anIntArray219 = null;
		this.anIntArray210 = null;
		this.anIntArrayArray15 = null;
		this.anIntArrayArray14 = null;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "([B)V")
	private void method1423(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class1_Sub18 local8 = new Class1_Sub18(arg0);
		@Pc(13) Class1_Sub18 local13 = new Class1_Sub18(arg0);
		@Pc(18) Class1_Sub18 local18 = new Class1_Sub18(arg0);
		@Pc(23) Class1_Sub18 local23 = new Class1_Sub18(arg0);
		@Pc(28) Class1_Sub18 local28 = new Class1_Sub18(arg0);
		local8.anInt3911 = arg0.length - 18;
		@Pc(38) int local38 = local8.method3107();
		@Pc(42) int local42 = local8.method3107();
		@Pc(46) int local46 = local8.method3122();
		@Pc(50) int local50 = local8.method3122();
		@Pc(54) int local54 = local8.method3122();
		@Pc(58) int local58 = local8.method3122();
		@Pc(62) int local62 = local8.method3122();
		@Pc(66) int local66 = local8.method3122();
		@Pc(70) int local70 = local8.method3107();
		@Pc(74) int local74 = local8.method3107();
		@Pc(78) int local78 = local8.method3107();
		@Pc(82) int local82 = local8.method3107();
		@Pc(90) int local90 = local38;
		@Pc(92) int local92 = local90;
		local90 += local42;
		@Pc(98) int local98 = local90;
		if (local54 == 255) {
			local90 += local42;
		}
		@Pc(107) int local107 = local90;
		if (local62 == 1) {
			local90 += local42;
		}
		@Pc(116) int local116 = local90;
		if (local50 == 1) {
			local90 += local42;
		}
		@Pc(125) int local125 = local90;
		if (local66 == 1) {
			local90 += local38;
		}
		@Pc(134) int local134 = local90;
		if (local58 == 1) {
			local90 += local42;
		}
		@Pc(143) int local143 = local90;
		local90 += local82;
		@Pc(149) int local149 = local90;
		local90 += local42 * 2;
		@Pc(157) int local157 = local90;
		local90 += local46 * 6;
		@Pc(165) int local165 = local90;
		local90 += local70;
		@Pc(171) int local171 = local90;
		local90 += local74;
		this.anInt1644 = local38;
		this.anInt1640 = local42;
		this.anInt1643 = local46;
		this.anIntArray216 = new int[local38];
		this.anIntArray209 = new int[local38];
		this.anIntArray217 = new int[local38];
		this.anIntArray211 = new int[local42];
		this.anIntArray213 = new int[local42];
		this.anIntArray215 = new int[local42];
		if (local46 > 0) {
			this.aByteArray33 = new byte[local46];
			this.aShortArray27 = new short[local46];
			this.aShortArray33 = new short[local46];
			this.aShortArray29 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray219 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray34 = new byte[local42];
			this.aByteArray27 = new byte[local42];
			this.aShortArray32 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray28 = new byte[local42];
		} else {
			this.aByte8 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray32 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray210 = new int[local42];
		}
		this.aShortArray34 = new short[local42];
		local8.anInt3911 = 0;
		local13.anInt3911 = local165;
		local18.anInt3911 = local171;
		local23.anInt3911 = local90;
		local28.anInt3911 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(307) int local307;
		@Pc(314) int local314;
		@Pc(316) int local316;
		@Pc(326) int local326;
		@Pc(336) int local336;
		for (local307 = 0; local307 < local38; local307++) {
			local314 = local8.method3122();
			local316 = 0;
			if ((local314 & 0x1) != 0) {
				local316 = local13.method3081();
			}
			local326 = 0;
			if ((local314 & 0x2) != 0) {
				local326 = local18.method3081();
			}
			local336 = 0;
			if ((local314 & 0x4) != 0) {
				local336 = local23.method3081();
			}
			this.anIntArray216[local307] = local301 + local316;
			this.anIntArray209[local307] = local303 + local326;
			this.anIntArray217[local307] = local305 + local336;
			local301 = this.anIntArray216[local307];
			local303 = this.anIntArray209[local307];
			local305 = this.anIntArray217[local307];
			if (local66 == 1) {
				this.anIntArray219[local307] = local28.method3122();
			}
		}
		local8.anInt3911 = local149;
		local13.anInt3911 = local116;
		local18.anInt3911 = local98;
		local23.anInt3911 = local134;
		local28.anInt3911 = local107;
		for (local307 = 0; local307 < local42; local307++) {
			this.aShortArray34[local307] = (short) local8.method3107();
			if (local50 == 1) {
				local314 = local13.method3122();
				if ((local314 & 0x1) == 1) {
					this.aByteArray34[local307] = 1;
					local1 = true;
				} else {
					this.aByteArray34[local307] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray27[local307] = (byte) (local314 >> 2);
					this.aShortArray32[local307] = this.aShortArray34[local307];
					this.aShortArray34[local307] = 127;
					if (this.aShortArray32[local307] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray27[local307] = -1;
					this.aShortArray32[local307] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray28[local307] = local18.method3082();
			}
			if (local58 == 1) {
				this.aByteArray32[local307] = local23.method3082();
			}
			if (local62 == 1) {
				this.anIntArray210[local307] = local28.method3122();
			}
		}
		this.anInt1642 = -1;
		local8.anInt3911 = local143;
		local13.anInt3911 = local92;
		local307 = 0;
		local314 = 0;
		local316 = 0;
		local326 = 0;
		@Pc(548) int local548;
		@Pc(686) int local686;
		for (local336 = 0; local336 < local42; local336++) {
			local548 = local13.method3122();
			if (local548 == 1) {
				local307 = local8.method3081() + local326;
				local314 = local8.method3081() + local307;
				local316 = local8.method3081() + local314;
				local326 = local316;
				this.anIntArray211[local336] = local307;
				this.anIntArray213[local336] = local314;
				this.anIntArray215[local336] = local316;
				if (local307 > this.anInt1642) {
					this.anInt1642 = local307;
				}
				if (local314 > this.anInt1642) {
					this.anInt1642 = local314;
				}
				if (local316 > this.anInt1642) {
					this.anInt1642 = local316;
				}
			}
			if (local548 == 2) {
				local314 = local316;
				local316 = local8.method3081() + local326;
				local326 = local316;
				this.anIntArray211[local336] = local307;
				this.anIntArray213[local336] = local314;
				this.anIntArray215[local336] = local316;
				if (local316 > this.anInt1642) {
					this.anInt1642 = local316;
				}
			}
			if (local548 == 3) {
				local307 = local316;
				local316 = local8.method3081() + local326;
				local326 = local316;
				this.anIntArray211[local336] = local307;
				this.anIntArray213[local336] = local314;
				this.anIntArray215[local336] = local316;
				if (local316 > this.anInt1642) {
					this.anInt1642 = local316;
				}
			}
			if (local548 == 4) {
				local686 = local307;
				local307 = local314;
				local314 = local686;
				local316 = local8.method3081() + local326;
				local326 = local316;
				this.anIntArray211[local336] = local307;
				this.anIntArray213[local336] = local686;
				this.anIntArray215[local336] = local316;
				if (local316 > this.anInt1642) {
					this.anInt1642 = local316;
				}
			}
		}
		this.anInt1642++;
		local8.anInt3911 = local157;
		for (local336 = 0; local336 < local46; local336++) {
			this.aByteArray33[local336] = 0;
			this.aShortArray27[local336] = (short) local8.method3107();
			this.aShortArray33[local336] = (short) local8.method3107();
			this.aShortArray29[local336] = (short) local8.method3107();
		}
		if (this.aByteArray27 != null) {
			@Pc(772) boolean local772 = false;
			for (local548 = 0; local548 < local42; local548++) {
				local686 = this.aByteArray27[local548] & 0xFF;
				if (local686 != 255) {
					if ((this.aShortArray27[local686] & 0xFFFF) == this.anIntArray211[local548] && (this.aShortArray33[local686] & 0xFFFF) == this.anIntArray213[local548] && (this.aShortArray29[local686] & 0xFFFF) == this.anIntArray215[local548]) {
						this.aByteArray27[local548] = -1;
					} else {
						local772 = true;
					}
				}
			}
			if (!local772) {
				this.aByteArray27 = null;
			}
		}
		if (!local3) {
			this.aShortArray32 = null;
		}
		if (!local1) {
			this.aByteArray34 = null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(SS)V")
	public void method1424(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1640; local1++) {
			if (this.aShortArray34[local1] == arg0) {
				this.aShortArray34[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(IIIII)Lclient!ei;")
	public Class6_Sub2 method1425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static240.aBoolean369) {
			@Pc(9) Class6_Sub2_Sub2 local9 = new Class6_Sub2_Sub2(this, arg0, arg1, true);
			local9.method2117();
			return local9;
		} else {
			return new Class6_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "()V")
	public void method1426() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1644; local1++) {
			@Pc(10) int local10 = this.anIntArray216[local1];
			this.anIntArray216[local1] = this.anIntArray217[local1];
			this.anIntArray217[local1] = -local10;
		}
		this.method1419();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "()I")
	@Override
	public int method3833() {
		if (!this.aBoolean123) {
			this.method1442();
		}
		return this.aShort13;
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(III)V")
	public void method1427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1644; local1++) {
			this.anIntArray216[local1] += arg0;
			this.anIntArray209[local1] += arg1;
			this.anIntArray217[local1] += arg2;
		}
		this.method1419();
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "()Z")
	@Override
	public boolean method3835() {
		return true;
	}

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "()V")
	public void method1428() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(22) int local22;
		@Pc(9) int local9;
		@Pc(18) int local18;
		if (this.anIntArray219 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt1644; local9++) {
				local18 = this.anIntArray219[local9];
				local22 = local5[local18]++;
				if (local18 > local7) {
					local7 = local18;
				}
			}
			this.anIntArrayArray15 = new int[local7 + 1][];
			for (local9 = 0; local9 <= local7; local9++) {
				this.anIntArrayArray15[local9] = new int[local5[local9]];
				local5[local9] = 0;
			}
			local9 = 0;
			while (local9 < this.anInt1644) {
				local18 = this.anIntArray219[local9];
				this.anIntArrayArray15[local18][local5[local18]++] = local9++;
			}
			this.anIntArray219 = null;
		}
		if (this.anIntArray210 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt1640; local9++) {
			local18 = this.anIntArray210[local9];
			local22 = local5[local18]++;
			if (local18 > local7) {
				local7 = local18;
			}
		}
		this.anIntArrayArray14 = new int[local7 + 1][];
		for (local9 = 0; local9 <= local7; local9++) {
			this.anIntArrayArray14[local9] = new int[local5[local9]];
			local5[local9] = 0;
		}
		local9 = 0;
		while (local9 < this.anInt1640) {
			local18 = this.anIntArray210[local9];
			this.anIntArrayArray14[local18][local5[local18]++] = local9++;
		}
		this.anIntArray210 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIIIIJILclient!pe;)V")
	@Override
	public void method3838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class91_Sub1 arg10) {
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	private void method1429(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static85.anIntArray212[arg0];
		@Pc(7) int local7 = Static85.anIntArray208[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1644; local9++) {
			@Pc(29) int local29 = this.anIntArray209[local9] * local7 - this.anIntArray217[local9] * local3 >> 16;
			this.anIntArray217[local9] = this.anIntArray209[local9] * local3 + this.anIntArray217[local9] * local7 >> 16;
			this.anIntArray209[local9] = local29;
		}
		this.method1419();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!gd;")
	public Class6_Sub3 method1430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method1442();
		@Pc(6) int local6 = arg4 + this.aShort20;
		@Pc(11) int local11 = arg4 + this.aShort16;
		@Pc(16) int local16 = arg6 + this.aShort19;
		@Pc(21) int local21 = arg6 + this.aShort17;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local6 < 0 || local11 + 128 >> 7 >= arg2.length || local16 < 0 || local21 + 128 >> 7 >= arg2[0].length)) {
			return this;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return this;
			}
			if (local6 < 0 || local11 + 128 >> 7 >= arg3.length || local16 < 0 || local21 + 128 >> 7 >= arg3[0].length) {
				return this;
			}
		} else {
			local6 >>= 0x7;
			local11 = local11 + 127 >> 7;
			local16 >>= 0x7;
			local21 = local21 + 127 >> 7;
			if (arg2[local6][local16] == arg5 && arg2[local11][local16] == arg5 && arg2[local6][local21] == arg5 && arg2[local11][local21] == arg5) {
				return this;
			}
		}
		@Pc(147) Class6_Sub3 local147 = new Class6_Sub3();
		local147.anInt1644 = this.anInt1644;
		local147.anInt1642 = this.anInt1642;
		local147.anInt1640 = this.anInt1640;
		local147.anInt1643 = this.anInt1643;
		local147.anIntArray211 = this.anIntArray211;
		local147.anIntArray213 = this.anIntArray213;
		local147.anIntArray215 = this.anIntArray215;
		local147.aByteArray34 = this.aByteArray34;
		local147.aByteArray28 = this.aByteArray28;
		local147.aByteArray32 = this.aByteArray32;
		local147.aByteArray27 = this.aByteArray27;
		local147.aShortArray34 = this.aShortArray34;
		local147.aShortArray32 = this.aShortArray32;
		local147.aByte8 = this.aByte8;
		local147.aByteArray33 = this.aByteArray33;
		local147.aShortArray27 = this.aShortArray27;
		local147.aShortArray33 = this.aShortArray33;
		local147.aShortArray29 = this.aShortArray29;
		local147.aShortArray31 = this.aShortArray31;
		local147.aShortArray30 = this.aShortArray30;
		local147.aShortArray35 = this.aShortArray35;
		local147.aByteArray29 = this.aByteArray29;
		local147.aByteArray30 = this.aByteArray30;
		local147.aByteArray31 = this.aByteArray31;
		local147.aByteArray25 = this.aByteArray25;
		local147.aByteArray26 = this.aByteArray26;
		local147.anIntArray219 = this.anIntArray219;
		local147.anIntArray210 = this.anIntArray210;
		local147.anIntArrayArray15 = this.anIntArrayArray15;
		local147.anIntArrayArray14 = this.anIntArrayArray14;
		local147.aShort14 = this.aShort14;
		local147.aShort18 = this.aShort18;
		local147.aClass12Array1 = this.aClass12Array1;
		local147.aClass134Array1 = this.aClass134Array1;
		local147.aClass12Array2 = this.aClass12Array2;
		if (arg0 == 3) {
			local147.anIntArray216 = Static188.method2836(this.anIntArray216);
			local147.anIntArray209 = Static188.method2836(this.anIntArray209);
			local147.anIntArray217 = Static188.method2836(this.anIntArray217);
		} else {
			local147.anIntArray216 = this.anIntArray216;
			local147.anIntArray209 = new int[local147.anInt1644];
			local147.anIntArray217 = this.anIntArray217;
		}
		@Pc(330) int local330;
		@Pc(341) int local341;
		@Pc(348) int local348;
		@Pc(352) int local352;
		@Pc(356) int local356;
		@Pc(360) int local360;
		@Pc(364) int local364;
		@Pc(386) int local386;
		@Pc(412) int local412;
		@Pc(424) int local424;
		if (arg0 == 1) {
			for (local330 = 0; local330 < local147.anInt1642; local330++) {
				local341 = this.anIntArray216[local330] + arg4;
				local348 = this.anIntArray217[local330] + arg6;
				local352 = local341 & 0x7F;
				local356 = local348 & 0x7F;
				local360 = local341 >> 7;
				local364 = local348 >> 7;
				local386 = arg2[local360][local364] * (128 - local352) + arg2[local360 + 1][local364] * local352 >> 7;
				local412 = arg2[local360][local364 + 1] * (128 - local352) + arg2[local360 + 1][local364 + 1] * local352 >> 7;
				local424 = local386 * (128 - local356) + local412 * local356 >> 7;
				local147.anIntArray209[local330] = this.anIntArray209[local330] + local424 - arg5;
			}
			for (local330 = local147.anInt1642; local330 < local147.anInt1644; local330++) {
				local341 = this.anIntArray216[local330] + arg4;
				local348 = this.anIntArray217[local330] + arg6;
				local352 = local341 & 0x7F;
				local356 = local348 & 0x7F;
				local360 = local341 >> 7;
				local364 = local348 >> 7;
				if (local360 >= 0 && local360 < arg2.length - 1 && local364 >= 0 && local364 < arg2[0].length - 1) {
					local386 = arg2[local360][local364] * (128 - local352) + arg2[local360 + 1][local364] * local352 >> 7;
					local412 = arg2[local360][local364 + 1] * (128 - local352) + arg2[local360 + 1][local364 + 1] * local352 >> 7;
					local424 = local386 * (128 - local356) + local412 * local356 >> 7;
					local147.anIntArray209[local330] = this.anIntArray209[local330] + local424 - arg5;
				}
			}
		} else {
			@Pc(681) int local681;
			if (arg0 == 2) {
				for (local330 = 0; local330 < local147.anInt1642; local330++) {
					local341 = (this.anIntArray209[local330] << 16) / this.aShort13;
					if (local341 < arg1) {
						local348 = this.anIntArray216[local330] + arg4;
						local352 = this.anIntArray217[local330] + arg6;
						local356 = local348 & 0x7F;
						local360 = local352 & 0x7F;
						local364 = local348 >> 7;
						local386 = local352 >> 7;
						local412 = arg2[local364][local386] * (128 - local356) + arg2[local364 + 1][local386] * local356 >> 7;
						local424 = arg2[local364][local386 + 1] * (128 - local356) + arg2[local364 + 1][local386 + 1] * local356 >> 7;
						local681 = local412 * (128 - local360) + local424 * local360 >> 7;
						local147.anIntArray209[local330] = this.anIntArray209[local330] + (local681 - arg5) * (arg1 - local341) / arg1;
					} else {
						local147.anIntArray209[local330] = this.anIntArray209[local330];
					}
				}
				for (local330 = local147.anInt1642; local330 < local147.anInt1644; local330++) {
					local341 = (this.anIntArray209[local330] << 16) / this.aShort13;
					if (local341 < arg1) {
						local348 = this.anIntArray216[local330] + arg4;
						local352 = this.anIntArray217[local330] + arg6;
						local356 = local348 & 0x7F;
						local360 = local352 & 0x7F;
						local364 = local348 >> 7;
						local386 = local352 >> 7;
						if (local364 >= 0 && local364 < arg2.length - 1 && local386 >= 0 && local386 < arg2[0].length - 1) {
							local412 = arg2[local364][local386] * (128 - local356) + arg2[local364 + 1][local386] * local356 >> 7;
							local424 = arg2[local364][local386 + 1] * (128 - local356) + arg2[local364 + 1][local386 + 1] * local356 >> 7;
							local681 = local412 * (128 - local360) + local424 * local360 >> 7;
							local147.anIntArray209[local330] = this.anIntArray209[local330] + (local681 - arg5) * (arg1 - local341) / arg1;
						}
					} else {
						local147.anIntArray209[local330] = this.anIntArray209[local330];
					}
				}
			} else if (arg0 == 3) {
				local330 = (arg1 & 0xFF) * 4;
				local341 = (arg1 >> 8 & 0xFF) * 4;
				local147.method1415(arg2, arg4, arg5, arg6, local330, local341);
			} else if (arg0 == 4) {
				local330 = this.aShort15 - this.aShort13;
				for (local341 = 0; local341 < this.anInt1642; local341++) {
					local348 = this.anIntArray216[local341] + arg4;
					local352 = this.anIntArray217[local341] + arg6;
					local356 = local348 & 0x7F;
					local360 = local352 & 0x7F;
					local364 = local348 >> 7;
					local386 = local352 >> 7;
					local412 = arg3[local364][local386] * (128 - local356) + arg3[local364 + 1][local386] * local356 >> 7;
					local424 = arg3[local364][local386 + 1] * (128 - local356) + arg3[local364 + 1][local386 + 1] * local356 >> 7;
					local681 = local412 * (128 - local360) + local424 * local360 >> 7;
					local147.anIntArray209[local341] = this.anIntArray209[local341] + local681 + local330 - arg5;
				}
				for (local341 = local147.anInt1642; local341 < local147.anInt1644; local341++) {
					local348 = this.anIntArray216[local341] + arg4;
					local352 = this.anIntArray217[local341] + arg6;
					local356 = local348 & 0x7F;
					local360 = local352 & 0x7F;
					local364 = local348 >> 7;
					local386 = local352 >> 7;
					if (local364 >= 0 && local364 < arg3.length - 1 && local386 >= 0 && local386 < arg3[0].length - 1) {
						local412 = arg3[local364][local386] * (128 - local356) + arg3[local364 + 1][local386] * local356 >> 7;
						local424 = arg3[local364][local386 + 1] * (128 - local356) + arg3[local364 + 1][local386 + 1] * local356 >> 7;
						local681 = local412 * (128 - local360) + local424 * local360 >> 7;
						local147.anIntArray209[local341] = this.anIntArray209[local341] + local681 + local330 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local330 = this.aShort15 - this.aShort13;
				@Pc(1314) int local1314;
				@Pc(1318) int local1318;
				for (local341 = 0; local341 < this.anInt1642; local341++) {
					local348 = this.anIntArray216[local341] + arg4;
					local352 = this.anIntArray217[local341] + arg6;
					local356 = local348 & 0x7F;
					local360 = local352 & 0x7F;
					local364 = local348 >> 7;
					local386 = local352 >> 7;
					local412 = arg2[local364][local386] * (128 - local356) + arg2[local364 + 1][local386] * local356 >> 7;
					local424 = arg2[local364][local386 + 1] * (128 - local356) + arg2[local364 + 1][local386 + 1] * local356 >> 7;
					local681 = local412 * (128 - local360) + local424 * local360 >> 7;
					local412 = arg3[local364][local386] * (128 - local356) + arg3[local364 + 1][local386] * local356 >> 7;
					local424 = arg3[local364][local386 + 1] * (128 - local356) + arg3[local364 + 1][local386 + 1] * local356 >> 7;
					local1314 = local412 * (128 - local360) + local424 * local360 >> 7;
					local1318 = local681 - local1314;
					local147.anIntArray209[local341] = ((this.anIntArray209[local341] << 8) / local330 * local1318 >> 8) - (arg5 - local681);
				}
				for (local341 = local147.anInt1642; local341 < local147.anInt1644; local341++) {
					local348 = this.anIntArray216[local341] + arg4;
					local352 = this.anIntArray217[local341] + arg6;
					local356 = local348 & 0x7F;
					local360 = local352 & 0x7F;
					local364 = local348 >> 7;
					local386 = local352 >> 7;
					if (local364 >= 0 && local364 < arg2.length - 1 && local364 < arg3.length - 1 && local386 >= 0 && local386 < arg2[0].length - 1 && local386 < arg3[0].length - 1) {
						local412 = arg2[local364][local386] * (128 - local356) + arg2[local364 + 1][local386] * local356 >> 7;
						local424 = arg2[local364][local386 + 1] * (128 - local356) + arg2[local364 + 1][local386 + 1] * local356 >> 7;
						local681 = local412 * (128 - local360) + local424 * local360 >> 7;
						local412 = arg3[local364][local386] * (128 - local356) + arg3[local364 + 1][local386] * local356 >> 7;
						local424 = arg3[local364][local386 + 1] * (128 - local356) + arg3[local364 + 1][local386 + 1] * local356 >> 7;
						local1314 = local412 * (128 - local360) + local424 * local360 >> 7;
						local1318 = local681 - local1314;
						local147.anIntArray209[local341] = ((this.anIntArray209[local341] << 8) / local330 * local1318 >> 8) - (arg5 - local681);
					}
				}
			}
		}
		this.aBoolean123 = false;
		return local147;
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(III)V")
	public void method1432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		@Pc(11) int local11;
		@Pc(31) int local31;
		if (arg2 != 0) {
			local5 = Static85.anIntArray212[arg2];
			local9 = Static85.anIntArray208[arg2];
			for (local11 = 0; local11 < this.anInt1644; local11++) {
				local31 = this.anIntArray209[local11] * local5 + this.anIntArray216[local11] * local9 >> 16;
				this.anIntArray209[local11] = this.anIntArray209[local11] * local9 - this.anIntArray216[local11] * local5 >> 16;
				this.anIntArray216[local11] = local31;
			}
		}
		if (arg0 != 0) {
			local5 = Static85.anIntArray212[arg0];
			local9 = Static85.anIntArray208[arg0];
			for (local11 = 0; local11 < this.anInt1644; local11++) {
				local31 = this.anIntArray209[local11] * local9 - this.anIntArray217[local11] * local5 >> 16;
				this.anIntArray217[local11] = this.anIntArray209[local11] * local5 + this.anIntArray217[local11] * local9 >> 16;
				this.anIntArray209[local11] = local31;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local5 = Static85.anIntArray212[arg1];
		local9 = Static85.anIntArray208[arg1];
		for (local11 = 0; local11 < this.anInt1644; local11++) {
			local31 = this.anIntArray217[local11] * local5 + this.anIntArray216[local11] * local9 >> 16;
			this.anIntArray217[local11] = this.anIntArray217[local11] * local9 - this.anIntArray216[local11] * local5 >> 16;
			this.anIntArray216[local11] = local31;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!gd;IS)I")
	private int method1433(@OriginalArg(0) Class6_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		@Pc(4) int local4 = arg0.anIntArray216[arg1];
		@Pc(9) int local9 = arg0.anIntArray209[arg1];
		@Pc(14) int local14 = arg0.anIntArray217[arg1];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1644; local16++) {
			if (local4 == this.anIntArray216[local16] && local9 == this.anIntArray209[local16] && local14 == this.anIntArray217[local16]) {
				this.aShortArray28[local16] |= arg2;
				return local16;
			}
		}
		this.anIntArray216[this.anInt1644] = local4;
		this.anIntArray209[this.anInt1644] = local9;
		this.anIntArray217[this.anInt1644] = local14;
		this.aShortArray28[this.anInt1644] = arg2;
		if (arg0.anIntArray219 != null) {
			this.anIntArray219[this.anInt1644] = arg0.anIntArray219[arg1];
		}
		return this.anInt1644++;
	}

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "()V")
	public void method1435() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt1644; local1++) {
			this.anIntArray217[local1] = -this.anIntArray217[local1];
		}
		for (local1 = 0; local1 < this.anInt1640; local1++) {
			@Pc(27) int local27 = this.anIntArray211[local1];
			this.anIntArray211[local1] = this.anIntArray215[local1];
			this.anIntArray215[local1] = local27;
		}
		this.method1419();
	}

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "()V")
	public void method1436() {
		if (this.aClass12Array1 != null) {
			return;
		}
		this.aClass12Array1 = new Class12[this.anInt1642];
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt1642; local10++) {
			this.aClass12Array1[local10] = new Class12();
		}
		for (local10 = 0; local10 < this.anInt1640; local10++) {
			@Pc(34) int local34 = this.anIntArray211[local10];
			@Pc(39) int local39 = this.anIntArray213[local10];
			@Pc(44) int local44 = this.anIntArray215[local10];
			@Pc(54) int local54 = this.anIntArray216[local39] - this.anIntArray216[local34];
			@Pc(64) int local64 = this.anIntArray209[local39] - this.anIntArray209[local34];
			@Pc(74) int local74 = this.anIntArray217[local39] - this.anIntArray217[local34];
			@Pc(84) int local84 = this.anIntArray216[local44] - this.anIntArray216[local34];
			@Pc(94) int local94 = this.anIntArray209[local44] - this.anIntArray209[local34];
			@Pc(104) int local104 = this.anIntArray217[local44] - this.anIntArray217[local34];
			@Pc(112) int local112 = local64 * local104 - local94 * local74;
			@Pc(120) int local120 = local74 * local84 - local104 * local54;
			@Pc(128) int local128;
			for (local128 = local54 * local94 - local84 * local64; local112 > 8192 || local120 > 8192 || local128 > 8192 || local112 < -8192 || local120 < -8192 || local128 < -8192; local128 >>= 0x1) {
				local112 >>= 0x1;
				local120 >>= 0x1;
			}
			@Pc(174) int local174 = (int) Math.sqrt((double) (local112 * local112 + local120 * local120 + local128 * local128));
			if (local174 <= 0) {
				local174 = 1;
			}
			local112 = local112 * 256 / local174;
			local120 = local120 * 256 / local174;
			local128 = local128 * 256 / local174;
			@Pc(201) byte local201;
			if (this.aByteArray34 == null) {
				local201 = 0;
			} else {
				local201 = this.aByteArray34[local10];
			}
			if (local201 == 0) {
				@Pc(214) Class12 local214 = this.aClass12Array1[local34];
				local214.anInt422 += local112;
				local214.anInt419 += local120;
				local214.anInt421 += local128;
				local214.anInt423++;
				@Pc(243) Class12 local243 = this.aClass12Array1[local39];
				local243.anInt422 += local112;
				local243.anInt419 += local120;
				local243.anInt421 += local128;
				local243.anInt423++;
				@Pc(272) Class12 local272 = this.aClass12Array1[local44];
				local272.anInt422 += local112;
				local272.anInt419 += local120;
				local272.anInt421 += local128;
				local272.anInt423++;
			} else if (local201 == 1) {
				if (this.aClass134Array1 == null) {
					this.aClass134Array1 = new Class134[this.anInt1640];
				}
				@Pc(317) Class134 local317 = this.aClass134Array1[local10] = new Class134();
				local317.anInt4124 = local112;
				local317.anInt4119 = local120;
				local317.anInt4121 = local128;
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public void method1437() {
		@Pc(3) int local3 = Static85.anIntArray212[256];
		@Pc(7) int local7 = Static85.anIntArray208[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1644; local9++) {
			@Pc(29) int local29 = this.anIntArray217[local9] * local3 + this.anIntArray216[local9] * local7 >> 16;
			this.anIntArray217[local9] = this.anIntArray217[local9] * local7 - this.anIntArray216[local9] * local3 >> 16;
			this.anIntArray216[local9] = local29;
		}
		this.method1419();
	}

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "()Lclient!gd;")
	public Class6_Sub3 method1438() {
		@Pc(3) Class6_Sub3 local3 = new Class6_Sub3();
		if (this.aByteArray34 != null) {
			local3.aByteArray34 = new byte[this.anInt1640];
			for (@Pc(13) int local13 = 0; local13 < this.anInt1640; local13++) {
				local3.aByteArray34[local13] = this.aByteArray34[local13];
			}
		}
		local3.anInt1644 = this.anInt1644;
		local3.anInt1642 = this.anInt1642;
		local3.anInt1640 = this.anInt1640;
		local3.anInt1643 = this.anInt1643;
		local3.anIntArray216 = this.anIntArray216;
		local3.anIntArray209 = this.anIntArray209;
		local3.anIntArray217 = this.anIntArray217;
		local3.anIntArray211 = this.anIntArray211;
		local3.anIntArray213 = this.anIntArray213;
		local3.anIntArray215 = this.anIntArray215;
		local3.aByteArray28 = this.aByteArray28;
		local3.aByteArray32 = this.aByteArray32;
		local3.aByteArray27 = this.aByteArray27;
		local3.aShortArray34 = this.aShortArray34;
		local3.aShortArray32 = this.aShortArray32;
		local3.aByte8 = this.aByte8;
		local3.aByteArray33 = this.aByteArray33;
		local3.aShortArray27 = this.aShortArray27;
		local3.aShortArray33 = this.aShortArray33;
		local3.aShortArray29 = this.aShortArray29;
		local3.aShortArray31 = this.aShortArray31;
		local3.aShortArray30 = this.aShortArray30;
		local3.aShortArray35 = this.aShortArray35;
		local3.aByteArray29 = this.aByteArray29;
		local3.aByteArray30 = this.aByteArray30;
		local3.aByteArray31 = this.aByteArray31;
		local3.aByteArray25 = this.aByteArray25;
		local3.aByteArray26 = this.aByteArray26;
		local3.anIntArray219 = this.anIntArray219;
		local3.anIntArray210 = this.anIntArray210;
		local3.anIntArrayArray15 = this.anIntArrayArray15;
		local3.anIntArrayArray14 = this.anIntArrayArray14;
		local3.aClass12Array1 = this.aClass12Array1;
		local3.aClass134Array1 = this.aClass134Array1;
		local3.aShort14 = this.aShort14;
		local3.aShort18 = this.aShort18;
		return local3;
	}

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "()V")
	public void method1439() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1644; local1++) {
			@Pc(10) int local10 = this.anIntArray217[local1];
			this.anIntArray217[local1] = this.anIntArray216[local1];
			this.anIntArray216[local1] = -local10;
		}
		this.method1419();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIBSB)I")
	public int method1440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) byte arg4) {
		this.anIntArray211[this.anInt1640] = arg0;
		this.anIntArray213[this.anInt1640] = arg1;
		this.anIntArray215[this.anInt1640] = arg2;
		this.aByteArray34[this.anInt1640] = 1;
		this.aByteArray27[this.anInt1640] = -1;
		this.aShortArray34[this.anInt1640] = arg3;
		this.aShortArray32[this.anInt1640] = -1;
		this.aByteArray32[this.anInt1640] = arg4;
		return this.anInt1640++;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(IIIII)Lclient!c;")
	public Class6_Sub2_Sub1 method1441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class6_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!j;IIIZ)V")
	@Override
	public void method3840(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class6_Sub3 local2 = (Class6_Sub3) arg0;
		local2.method1442();
		local2.method1436();
		Static85.anInt1641++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray216;
		@Pc(18) int local18 = local2.anInt1642;
		@Pc(20) int local20;
		for (local20 = 0; local20 < this.anInt1642; local20++) {
			@Pc(29) Class12 local29 = this.aClass12Array1[local20];
			if (local29.anInt423 != 0) {
				@Pc(40) int local40 = this.anIntArray209[local20] - arg2;
				if (local40 >= local2.aShort13 && local40 <= local2.aShort15) {
					@Pc(56) int local56 = this.anIntArray216[local20] - arg1;
					if (local56 >= local2.aShort20 && local56 <= local2.aShort16) {
						@Pc(72) int local72 = this.anIntArray217[local20] - arg3;
						if (local72 >= local2.aShort19 && local72 <= local2.aShort17) {
							for (@Pc(83) int local83 = 0; local83 < local18; local83++) {
								@Pc(91) Class12 local91 = local2.aClass12Array1[local83];
								if (local56 == local15[local83] && local72 == local2.anIntArray217[local83] && local40 == local2.anIntArray209[local83] && local91.anInt423 != 0) {
									if (this.aClass12Array2 == null) {
										this.aClass12Array2 = new Class12[this.anInt1642];
									}
									if (local2.aClass12Array2 == null) {
										local2.aClass12Array2 = new Class12[local18];
									}
									@Pc(131) Class12 local131 = this.aClass12Array2[local20];
									if (local131 == null) {
										local131 = this.aClass12Array2[local20] = new Class12(local29);
									}
									@Pc(148) Class12 local148 = local2.aClass12Array2[local83];
									if (local148 == null) {
										local148 = local2.aClass12Array2[local83] = new Class12(local91);
									}
									local131.anInt422 += local91.anInt422;
									local131.anInt419 += local91.anInt419;
									local131.anInt421 += local91.anInt421;
									local131.anInt423 += local91.anInt423;
									local148.anInt422 += local29.anInt422;
									local148.anInt419 += local29.anInt419;
									local148.anInt421 += local29.anInt421;
									local148.anInt423 += local29.anInt423;
									local12++;
									Static85.anIntArray214[local20] = Static85.anInt1641;
									Static85.anIntArray218[local83] = Static85.anInt1641;
								}
							}
						}
					}
				}
			}
		}
		if (local12 < 3 || !arg4) {
			return;
		}
		for (local20 = 0; local20 < this.anInt1640; local20++) {
			if (Static85.anIntArray214[this.anIntArray211[local20]] == Static85.anInt1641 && Static85.anIntArray214[this.anIntArray213[local20]] == Static85.anInt1641 && Static85.anIntArray214[this.anIntArray215[local20]] == Static85.anInt1641) {
				if (this.aByteArray34 == null) {
					this.aByteArray34 = new byte[this.anInt1640];
				}
				this.aByteArray34[local20] = 2;
			}
		}
		for (local20 = 0; local20 < local2.anInt1640; local20++) {
			if (Static85.anIntArray218[local2.anIntArray211[local20]] == Static85.anInt1641 && Static85.anIntArray218[local2.anIntArray213[local20]] == Static85.anInt1641 && Static85.anIntArray218[local2.anIntArray215[local20]] == Static85.anInt1641) {
				if (local2.aByteArray34 == null) {
					local2.aByteArray34 = new byte[local2.anInt1640];
				}
				local2.aByteArray34[local20] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "()V")
	private void method1442() {
		if (this.aBoolean123) {
			return;
		}
		this.aBoolean123 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt1642; local20++) {
			@Pc(29) int local29 = this.anIntArray216[local20];
			@Pc(34) int local34 = this.anIntArray209[local20];
			@Pc(39) int local39 = this.anIntArray217[local20];
			if (local29 < local8) {
				local8 = local29;
			}
			if (local29 > local14) {
				local14 = local29;
			}
			if (local34 < local10) {
				local10 = local34;
			}
			if (local34 > local16) {
				local16 = local34;
			}
			if (local39 < local12) {
				local12 = local39;
			}
			if (local39 > local18) {
				local18 = local39;
			}
		}
		this.aShort20 = (short) local8;
		this.aShort16 = (short) local14;
		this.aShort13 = (short) local10;
		this.aShort15 = (short) local16;
		this.aShort19 = (short) local12;
		this.aShort17 = (short) local18;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
	private void method1443(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static85.anIntArray212[arg0];
		@Pc(7) int local7 = Static85.anIntArray208[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1644; local9++) {
			@Pc(29) int local29 = this.anIntArray209[local9] * local3 + this.anIntArray216[local9] * local7 >> 16;
			this.anIntArray209[local9] = this.anIntArray209[local9] * local7 - this.anIntArray216[local9] * local3 >> 16;
			this.anIntArray216[local9] = local29;
		}
		this.method1419();
	}
}
