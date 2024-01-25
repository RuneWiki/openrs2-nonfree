import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class59 {

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "[I")
	public int[] anIntArray75;

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "[I")
	public int[] anIntArray76;

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "[I")
	public int[] anIntArray77;

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "[S")
	public short[] aShortArray10;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "[I")
	public int[] anIntArray78;

	@OriginalMember(owner = "client!cr", name = "m", descriptor = "[S")
	public short[] aShortArray11;

	@OriginalMember(owner = "client!cr", name = "n", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!cr", name = "o", descriptor = "[I")
	public int[] anIntArray79;

	@OriginalMember(owner = "client!cr", name = "p", descriptor = "[S")
	public short[] aShortArray12;

	@OriginalMember(owner = "client!cr", name = "q", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!cr", name = "r", descriptor = "[I")
	public int[] anIntArray80;

	@OriginalMember(owner = "client!cr", name = "s", descriptor = "[S")
	public short[] aShortArray13;

	@OriginalMember(owner = "client!cr", name = "t", descriptor = "[I")
	public int[] anIntArray81;

	@OriginalMember(owner = "client!cr", name = "v", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!cr", name = "z", descriptor = "[S")
	public short[] aShortArray14;

	@OriginalMember(owner = "client!cr", name = "B", descriptor = "[Lclient!cea;")
	public Class52[] aClass52Array1;

	@OriginalMember(owner = "client!cr", name = "C", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!cr", name = "D", descriptor = "[S")
	public short[] aShortArray15;

	@OriginalMember(owner = "client!cr", name = "E", descriptor = "[S")
	public short[] aShortArray16;

	@OriginalMember(owner = "client!cr", name = "F", descriptor = "[Lclient!kw;")
	public Class190[] aClass190Array1;

	@OriginalMember(owner = "client!cr", name = "L", descriptor = "[S")
	public short[] aShortArray17;

	@OriginalMember(owner = "client!cr", name = "Q", descriptor = "[I")
	public int[] anIntArray82;

	@OriginalMember(owner = "client!cr", name = "S", descriptor = "[I")
	public int[] anIntArray83;

	@OriginalMember(owner = "client!cr", name = "T", descriptor = "[I")
	public int[] anIntArray84;

	@OriginalMember(owner = "client!cr", name = "U", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!cr", name = "W", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!cr", name = "X", descriptor = "[S")
	public short[] aShortArray18;

	@OriginalMember(owner = "client!cr", name = "ab", descriptor = "[I")
	public int[] anIntArray85;

	@OriginalMember(owner = "client!cr", name = "db", descriptor = "[S")
	public short[] aShortArray19;

	@OriginalMember(owner = "client!cr", name = "fb", descriptor = "[Lclient!hfa;")
	public Class138[] aClass138Array1;

	@OriginalMember(owner = "client!cr", name = "w", descriptor = "I")
	public int anInt1895 = 12;

	@OriginalMember(owner = "client!cr", name = "K", descriptor = "I")
	public int anInt1902 = 0;

	@OriginalMember(owner = "client!cr", name = "N", descriptor = "I")
	public int anInt1904 = 0;

	@OriginalMember(owner = "client!cr", name = "cb", descriptor = "I")
	public int anInt1912 = 0;

	@OriginalMember(owner = "client!cr", name = "H", descriptor = "I")
	public int anInt1899 = 0;

	@OriginalMember(owner = "client!cr", name = "x", descriptor = "B")
	public byte aByte25 = 0;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
	private Class59() {
	}

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "([B)V")
	public Class59(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1579(arg0);
		} else {
			this.method1594(arg0);
		}
	}

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(III)V")
	public Class59(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray13 = new byte[arg1];
		this.anIntArray84 = new int[arg0];
		if (arg2 > 0) {
			this.anIntArray85 = new int[arg2];
			this.anIntArray79 = new int[arg2];
			this.anIntArray82 = new int[arg2];
			this.aByteArray11 = new byte[arg2];
			this.anIntArray77 = new int[arg2];
			this.aByteArray7 = new byte[arg2];
			this.anIntArray81 = new int[arg2];
			this.aShortArray17 = new short[arg2];
			this.anIntArray83 = new int[arg2];
			this.aShortArray13 = new short[arg2];
			this.aShortArray12 = new short[arg2];
			this.aByteArray9 = new byte[arg2];
		}
		this.aShortArray14 = new short[arg1];
		this.aByteArray10 = new byte[arg1];
		this.anIntArray76 = new int[arg0];
		this.aShortArray11 = new short[arg1];
		this.aShortArray19 = new short[arg1];
		this.anIntArray80 = new int[arg1];
		this.aByteArray12 = new byte[arg1];
		this.aByteArray8 = new byte[arg1];
		this.anIntArray75 = new int[arg0];
		this.anIntArray78 = new int[arg0];
		this.aShortArray18 = new short[arg1];
		this.aShortArray15 = new short[arg1];
	}

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "([Lclient!cr;I)V")
	public Class59(@OriginalArg(0) Class59[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1899 = 0;
		this.anInt1904 = 0;
		this.anInt1912 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte25 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class59 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt1899 += local59.anInt1899;
				this.anInt1912 += local59.anInt1912;
				this.anInt1904 += local59.anInt1904;
				if (local59.aClass138Array1 != null) {
					local36 += local59.aClass138Array1.length;
				}
				local38 |= local59.aByteArray10 != null;
				if (local59.aClass190Array1 != null) {
					local32 += local59.aClass190Array1.length;
				}
				if (local59.aClass52Array1 != null) {
					local34 += local59.aClass52Array1.length;
				}
				local51 |= local59.anIntArray80 != null;
				if (local59.aByteArray8 == null) {
					if (this.aByte25 == -1) {
						this.aByte25 = local59.aByte25;
					}
					if (this.aByte25 != local59.aByte25) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local46 |= local59.aShortArray11 != null;
				local42 |= local59.aByteArray12 != null;
				local44 |= local59.aByteArray13 != null;
			}
		}
		this.aShortArray19 = new short[this.anInt1912];
		if (local46) {
			this.aShortArray11 = new short[this.anInt1912];
		}
		if (local42) {
			this.aByteArray12 = new byte[this.anInt1912];
		}
		if (local51) {
			this.anIntArray80 = new int[this.anInt1912];
		}
		this.anIntArray75 = new int[this.anInt1904];
		this.aShortArray10 = new short[this.anInt1912];
		if (local38) {
			this.aByteArray10 = new byte[this.anInt1912];
		}
		this.aShortArray15 = new short[this.anInt1912];
		this.anIntArray84 = new int[this.anInt1904];
		if (local36 > 0) {
			this.aClass138Array1 = new Class138[local36];
		}
		this.aShortArray14 = new short[this.anInt1912];
		this.aShortArray18 = new short[this.anInt1912];
		if (local44) {
			this.aByteArray13 = new byte[this.anInt1912];
		}
		if (local32 > 0) {
			this.aClass190Array1 = new Class190[local32];
		}
		if (local40) {
			this.aByteArray8 = new byte[this.anInt1912];
		}
		if (this.anInt1899 > 0) {
			this.anIntArray79 = new int[this.anInt1899];
			this.aShortArray17 = new short[this.anInt1899];
			this.anIntArray82 = new int[this.anInt1899];
			this.aByteArray9 = new byte[this.anInt1899];
			this.aShortArray13 = new short[this.anInt1899];
			this.anIntArray85 = new int[this.anInt1899];
			this.aByteArray7 = new byte[this.anInt1899];
			this.anIntArray81 = new int[this.anInt1899];
			this.anIntArray83 = new int[this.anInt1899];
			this.aByteArray11 = new byte[this.anInt1899];
			this.aShortArray12 = new short[this.anInt1899];
			this.anIntArray77 = new int[this.anInt1899];
		}
		this.aShortArray16 = new short[this.anInt1904];
		this.anIntArray78 = new int[this.anInt1904];
		this.anIntArray76 = new int[this.anInt1904];
		if (local34 > 0) {
			this.aClass52Array1 = new Class52[local34];
		}
		local36 = 0;
		this.anInt1912 = 0;
		local32 = 0;
		this.anInt1904 = 0;
		this.anInt1899 = 0;
		local34 = 0;
		@Pc(613) int local613;
		@Pc(624) int local624;
		for (@Pc(380) int local380 = 0; local380 < arg1; local380++) {
			@Pc(387) short local387 = (short) (0x1 << local380);
			@Pc(391) Class59 local391 = arg0[local380];
			if (local391 != null) {
				@Pc(398) int local398;
				if (local391.aClass138Array1 != null) {
					for (local398 = 0; local398 < local391.aClass138Array1.length; local398++) {
						@Pc(405) Class138 local405 = local391.aClass138Array1[local398];
						this.aClass138Array1[local36++] = local405.method3093(local405.anInt3902 + this.anInt1912);
					}
				}
				for (local398 = 0; local398 < local391.anInt1912; local398++) {
					if (local38 && local391.aByteArray10 != null) {
						this.aByteArray10[this.anInt1912] = local391.aByteArray10[local398];
					}
					if (local40) {
						if (local391.aByteArray8 == null) {
							this.aByteArray8[this.anInt1912] = local391.aByte25;
						} else {
							this.aByteArray8[this.anInt1912] = local391.aByteArray8[local398];
						}
					}
					if (local42 && local391.aByteArray12 != null) {
						this.aByteArray12[this.anInt1912] = local391.aByteArray12[local398];
					}
					if (local46) {
						if (local391.aShortArray11 == null) {
							this.aShortArray11[this.anInt1912] = -1;
						} else {
							this.aShortArray11[this.anInt1912] = local391.aShortArray11[local398];
						}
					}
					if (local51) {
						if (local391.anIntArray80 == null) {
							this.anIntArray80[this.anInt1912] = -1;
						} else {
							this.anIntArray80[this.anInt1912] = local391.anIntArray80[local398];
						}
					}
					this.aShortArray19[this.anInt1912] = (short) this.method1578(local391.aShortArray19[local398], local391, local387);
					this.aShortArray18[this.anInt1912] = (short) this.method1578(local391.aShortArray18[local398], local391, local387);
					this.aShortArray15[this.anInt1912] = (short) this.method1578(local391.aShortArray15[local398], local391, local387);
					this.aShortArray10[this.anInt1912] = local387;
					this.aShortArray14[this.anInt1912] = local391.aShortArray14[local398];
					this.anInt1912++;
				}
				@Pc(600) int local600;
				if (local391.aClass190Array1 != null) {
					for (local600 = 0; local600 < local391.aClass190Array1.length; local600++) {
						local613 = this.method1578(local391.aClass190Array1[local600].anInt5819, local391, local387);
						local624 = this.method1578(local391.aClass190Array1[local600].anInt5824, local391, local387);
						@Pc(635) int local635 = this.method1578(local391.aClass190Array1[local600].anInt5816, local391, local387);
						this.aClass190Array1[local32] = local391.aClass190Array1[local600].method4494(local613, local624, local635);
						local32++;
					}
				}
				if (local391.aClass52Array1 != null) {
					for (local600 = 0; local600 < local391.aClass52Array1.length; local600++) {
						local613 = this.method1578(local391.aClass52Array1[local600].anInt1626, local391, local387);
						this.aClass52Array1[local34] = local391.aClass52Array1[local600].method1376(local613);
						local34++;
					}
				}
			}
		}
		@Pc(709) int local709 = 0;
		this.anInt1902 = this.anInt1904;
		for (@Pc(715) int local715 = 0; local715 < arg1; local715++) {
			@Pc(722) short local722 = (short) (0x1 << local715);
			@Pc(726) Class59 local726 = arg0[local715];
			if (local726 != null) {
				for (local613 = 0; local613 < local726.anInt1912; local613++) {
					if (local44) {
						this.aByteArray13[local709++] = (byte) (local726.aByteArray13 == null || local726.aByteArray13[local613] == -1 ? -1 : local726.aByteArray13[local613] + this.anInt1899);
					}
				}
				for (local624 = 0; local624 < local726.anInt1899; local624++) {
					@Pc(782) byte local782 = this.aByteArray9[this.anInt1899] = local726.aByteArray9[local624];
					if (local782 == 0) {
						this.aShortArray13[this.anInt1899] = (short) this.method1578(local726.aShortArray13[local624], local726, local722);
						this.aShortArray12[this.anInt1899] = (short) this.method1578(local726.aShortArray12[local624], local726, local722);
						this.aShortArray17[this.anInt1899] = (short) this.method1578(local726.aShortArray17[local624], local726, local722);
					}
					if (local782 >= 1 && local782 <= 3) {
						this.aShortArray13[this.anInt1899] = local726.aShortArray13[local624];
						this.aShortArray12[this.anInt1899] = local726.aShortArray12[local624];
						this.aShortArray17[this.anInt1899] = local726.aShortArray17[local624];
						this.anIntArray82[this.anInt1899] = local726.anIntArray82[local624];
						this.anIntArray79[this.anInt1899] = local726.anIntArray79[local624];
						this.anIntArray85[this.anInt1899] = local726.anIntArray85[local624];
						this.aByteArray11[this.anInt1899] = local726.aByteArray11[local624];
						this.aByteArray7[this.anInt1899] = local726.aByteArray7[local624];
						this.anIntArray81[this.anInt1899] = local726.anIntArray81[local624];
					}
					if (local782 == 2) {
						this.anIntArray77[this.anInt1899] = local726.anIntArray77[local624];
						this.anIntArray83[this.anInt1899] = local726.anIntArray83[local624];
					}
					this.anInt1899++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)[[I")
	public int[][] method1577() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass138Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass138Array1[local12].anInt3905;
			if (local20 >= 0) {
				if (local20 > local10) {
					local10 = local20;
				}
				@Pc(34) int local34 = local8[local20]++;
			}
		}
		@Pc(48) int[][] local48 = new int[local10 + 1][];
		for (@Pc(50) int local50 = 0; local50 <= local10; local50++) {
			local48[local50] = new int[local8[local50]];
			local8[local50] = 0;
		}
		for (@Pc(69) int local69 = 0; local69 < this.aClass138Array1.length; local69++) {
			@Pc(77) int local77 = this.aClass138Array1[local69].anInt3905;
			if (local77 >= 0) {
				local48[local77][local8[local77]++] = local69;
			}
		}
		return local48;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!cr;SB)I")
	private int method1578(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) short arg2) {
		@Pc(10) int local10 = arg1.anIntArray78[arg0];
		@Pc(15) int local15 = arg1.anIntArray75[arg0];
		@Pc(20) int local20 = arg1.anIntArray84[arg0];
		for (@Pc(22) int local22 = 0; local22 < this.anInt1904; local22++) {
			if (local10 == this.anIntArray78[local22] && local15 == this.anIntArray75[local22] && this.anIntArray84[local22] == local20) {
				this.aShortArray16[local22] |= arg2;
				return local22;
			}
		}
		this.anIntArray78[this.anInt1904] = local10;
		this.anIntArray75[this.anInt1904] = local15;
		this.anIntArray84[this.anInt1904] = local20;
		this.aShortArray16[this.anInt1904] = arg2;
		this.anIntArray76[this.anInt1904] = arg1.anIntArray76 == null ? -1 : arg1.anIntArray76[arg0];
		return this.anInt1904++;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B[B)V")
	private void method1579(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class4_Sub13 local10 = new Class4_Sub13(arg0);
		@Pc(15) Class4_Sub13 local15 = new Class4_Sub13(arg0);
		@Pc(20) Class4_Sub13 local20 = new Class4_Sub13(arg0);
		@Pc(25) Class4_Sub13 local25 = new Class4_Sub13(arg0);
		@Pc(30) Class4_Sub13 local30 = new Class4_Sub13(arg0);
		@Pc(35) Class4_Sub13 local35 = new Class4_Sub13(arg0);
		@Pc(40) Class4_Sub13 local40 = new Class4_Sub13(arg0);
		local10.anInt9170 = arg0.length - 23;
		this.anInt1904 = local10.method7054();
		this.anInt1912 = local10.method7054();
		this.anInt1899 = local10.method7004();
		@Pc(65) int local65 = local10.method7004();
		@Pc(74) boolean local74 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(94) boolean local94 = (local65 & 0x4) == 4;
		@Pc(103) boolean local103 = (local65 & 0x8) == 8;
		if (local103) {
			local10.anInt9170 -= 7;
			this.anInt1895 = local10.method7004();
			local10.anInt9170 += 6;
		}
		@Pc(126) int local126 = local10.method7004();
		@Pc(130) int local130 = local10.method7004();
		@Pc(134) int local134 = local10.method7004();
		@Pc(138) int local138 = local10.method7004();
		@Pc(142) int local142 = local10.method7004();
		@Pc(146) int local146 = local10.method7054();
		@Pc(150) int local150 = local10.method7054();
		@Pc(154) int local154 = local10.method7054();
		@Pc(158) int local158 = local10.method7054();
		@Pc(162) int local162 = local10.method7054();
		@Pc(164) int local164 = 0;
		@Pc(166) int local166 = 0;
		@Pc(168) int local168 = 0;
		@Pc(181) int local181;
		if (this.anInt1899 > 0) {
			this.aByteArray9 = new byte[this.anInt1899];
			local10.anInt9170 = 0;
			for (local181 = 0; local181 < this.anInt1899; local181++) {
				@Pc(192) byte local192 = this.aByteArray9[local181] = local10.method7011();
				if (local192 == 2) {
					local168++;
				}
				if (local192 == 0) {
					local164++;
				}
				if (local192 >= 1 && local192 <= 3) {
					local166++;
				}
			}
		}
		local181 = this.anInt1899;
		@Pc(218) int local218 = local181;
		local181 += this.anInt1904;
		@Pc(225) int local225 = local181;
		if (local74) {
			local181 += this.anInt1912;
		}
		@Pc(234) int local234 = local181;
		local181 += this.anInt1912;
		@Pc(241) int local241 = local181;
		if (local126 == 255) {
			local181 += this.anInt1912;
		}
		@Pc(253) int local253 = local181;
		if (local134 == 1) {
			local181 += this.anInt1912;
		}
		@Pc(263) int local263 = local181;
		if (local142 == 1) {
			local181 += this.anInt1904;
		}
		@Pc(275) int local275 = local181;
		if (local130 == 1) {
			local181 += this.anInt1912;
		}
		@Pc(287) int local287 = local181;
		local181 += local158;
		@Pc(293) int local293 = local181;
		if (local138 == 1) {
			local181 += this.anInt1912 * 2;
		}
		@Pc(307) int local307 = local181;
		local181 += local162;
		@Pc(313) int local313 = local181;
		local181 += this.anInt1912 * 2;
		@Pc(322) int local322 = local181;
		local181 += local146;
		@Pc(328) int local328 = local181;
		local181 += local150;
		@Pc(334) int local334 = local181;
		local181 += local154;
		@Pc(340) int local340 = local181;
		local181 += local164 * 6;
		@Pc(348) int local348 = local181;
		local181 += local166 * 6;
		@Pc(356) byte local356 = 6;
		if (this.anInt1895 == 14) {
			local356 = 7;
		} else if (this.anInt1895 >= 15) {
			local356 = 9;
		}
		@Pc(372) int local372 = local181;
		local181 += local356 * local166;
		@Pc(380) int local380 = local181;
		local181 += local166;
		@Pc(386) int local386 = local181;
		local181 += local166;
		@Pc(392) int local392 = local181;
		local181 += local166 + local168 * 2;
		local10.anInt9170 = local218;
		this.anIntArray78 = new int[this.anInt1904];
		if (local142 == 1) {
			this.anIntArray76 = new int[this.anInt1904];
		}
		if (local134 == 1) {
			this.anIntArray80 = new int[this.anInt1912];
		}
		if (local138 == 1 && this.anInt1899 > 0) {
			this.aByteArray13 = new byte[this.anInt1912];
		}
		this.anIntArray75 = new int[this.anInt1904];
		this.anIntArray84 = new int[this.anInt1904];
		this.aShortArray19 = new short[this.anInt1912];
		if (this.anInt1899 > 0) {
			this.aShortArray13 = new short[this.anInt1899];
			this.aShortArray12 = new short[this.anInt1899];
			if (local168 > 0) {
				this.anIntArray77 = new int[local168];
				this.anIntArray83 = new int[local168];
			}
			this.aShortArray17 = new short[this.anInt1899];
			if (local166 > 0) {
				this.anIntArray85 = new int[local166];
				this.anIntArray81 = new int[local166];
				this.aByteArray7 = new byte[local166];
				this.anIntArray82 = new int[local166];
				this.anIntArray79 = new int[local166];
				this.aByteArray11 = new byte[local166];
			}
		}
		this.aShortArray14 = new short[this.anInt1912];
		if (local74) {
			this.aByteArray10 = new byte[this.anInt1912];
		}
		this.aShortArray15 = new short[this.anInt1912];
		if (local138 == 1) {
			this.aShortArray11 = new short[this.anInt1912];
		}
		if (local126 == 255) {
			this.aByteArray8 = new byte[this.anInt1912];
		} else {
			this.aByte25 = (byte) local126;
		}
		this.aShortArray18 = new short[this.anInt1912];
		if (local130 == 1) {
			this.aByteArray12 = new byte[this.anInt1912];
		}
		local15.anInt9170 = local322;
		local20.anInt9170 = local328;
		local25.anInt9170 = local334;
		local30.anInt9170 = local263;
		@Pc(579) int local579 = 0;
		@Pc(581) int local581 = 0;
		@Pc(583) int local583 = 0;
		@Pc(591) int local591;
		for (@Pc(585) int local585 = 0; local585 < this.anInt1904; local585++) {
			local591 = local10.method7004();
			@Pc(593) int local593 = 0;
			if ((local591 & 0x1) != 0) {
				local593 = local15.method7017();
			}
			@Pc(606) int local606 = 0;
			if ((local591 & 0x2) != 0) {
				local606 = local20.method7017();
			}
			@Pc(616) int local616 = 0;
			if ((local591 & 0x4) != 0) {
				local616 = local25.method7017();
			}
			this.anIntArray78[local585] = local579 + local593;
			this.anIntArray75[local585] = local581 + local606;
			this.anIntArray84[local585] = local583 + local616;
			local579 = this.anIntArray78[local585];
			local581 = this.anIntArray75[local585];
			local583 = this.anIntArray84[local585];
			if (local142 == 1) {
				this.anIntArray76[local585] = local30.method7004();
			}
		}
		local10.anInt9170 = local313;
		local15.anInt9170 = local225;
		local20.anInt9170 = local241;
		local25.anInt9170 = local275;
		local30.anInt9170 = local253;
		local35.anInt9170 = local293;
		local40.anInt9170 = local307;
		for (local591 = 0; local591 < this.anInt1912; local591++) {
			this.aShortArray14[local591] = (short) local10.method7054();
			if (local74) {
				this.aByteArray10[local591] = local15.method7011();
			}
			if (local126 == 255) {
				this.aByteArray8[local591] = local20.method7011();
			}
			if (local130 == 1) {
				this.aByteArray12[local591] = local25.method7011();
			}
			if (local134 == 1) {
				this.anIntArray80[local591] = local30.method7004();
			}
			if (local138 == 1) {
				this.aShortArray11[local591] = (short) (local35.method7054() - 1);
			}
			if (this.aByteArray13 != null) {
				if (this.aShortArray11[local591] == -1) {
					this.aByteArray13[local591] = -1;
				} else {
					this.aByteArray13[local591] = (byte) (local40.method7004() - 1);
				}
			}
		}
		this.anInt1902 = -1;
		local10.anInt9170 = local287;
		local15.anInt9170 = local234;
		@Pc(812) short local812 = 0;
		@Pc(814) short local814 = 0;
		@Pc(816) short local816 = 0;
		@Pc(818) short local818 = 0;
		@Pc(826) int local826;
		for (@Pc(820) int local820 = 0; local820 < this.anInt1912; local820++) {
			local826 = local15.method7004();
			if (local826 == 1) {
				local812 = (short) (local818 + local10.method7017());
				local814 = (short) (local10.method7017() + local812);
				local816 = (short) (local10.method7017() + local814);
				local818 = local816;
				this.aShortArray19[local820] = local812;
				this.aShortArray18[local820] = local814;
				this.aShortArray15[local820] = local816;
				if (local812 > this.anInt1902) {
					this.anInt1902 = local812;
				}
				if (this.anInt1902 < local814) {
					this.anInt1902 = local814;
				}
				if (this.anInt1902 < local816) {
					this.anInt1902 = local816;
				}
			}
			if (local826 == 2) {
				local814 = local816;
				local816 = (short) (local10.method7017() + local818);
				local818 = local816;
				this.aShortArray19[local820] = local812;
				this.aShortArray18[local820] = local814;
				this.aShortArray15[local820] = local816;
				if (local816 > this.anInt1902) {
					this.anInt1902 = local816;
				}
			}
			if (local826 == 3) {
				local812 = local816;
				local816 = (short) (local818 + local10.method7017());
				this.aShortArray19[local820] = local812;
				local818 = local816;
				this.aShortArray18[local820] = local814;
				this.aShortArray15[local820] = local816;
				if (this.anInt1902 < local816) {
					this.anInt1902 = local816;
				}
			}
			if (local826 == 4) {
				@Pc(985) short local985 = local812;
				local812 = local814;
				local816 = (short) (local10.method7017() + local818);
				local814 = local985;
				this.aShortArray19[local820] = local812;
				local818 = local816;
				this.aShortArray18[local820] = local985;
				this.aShortArray15[local820] = local816;
				if (local816 > this.anInt1902) {
					this.anInt1902 = local816;
				}
			}
		}
		this.anInt1902++;
		local10.anInt9170 = local340;
		local15.anInt9170 = local348;
		local20.anInt9170 = local372;
		local25.anInt9170 = local380;
		local30.anInt9170 = local386;
		local35.anInt9170 = local392;
		@Pc(1070) int local1070;
		for (local826 = 0; local826 < this.anInt1899; local826++) {
			local1070 = this.aByteArray9[local826] & 0xFF;
			if (local1070 == 0) {
				this.aShortArray13[local826] = (short) local10.method7054();
				this.aShortArray12[local826] = (short) local10.method7054();
				this.aShortArray17[local826] = (short) local10.method7054();
			}
			if (local1070 == 1) {
				this.aShortArray13[local826] = (short) local15.method7054();
				this.aShortArray12[local826] = (short) local15.method7054();
				this.aShortArray17[local826] = (short) local15.method7054();
				if (this.anInt1895 < 15) {
					this.anIntArray82[local826] = local20.method7054();
					if (this.anInt1895 >= 14) {
						this.anIntArray79[local826] = local20.method7013();
					} else {
						this.anIntArray79[local826] = local20.method7054();
					}
					this.anIntArray85[local826] = local20.method7054();
				} else {
					this.anIntArray82[local826] = local20.method7013();
					this.anIntArray79[local826] = local20.method7013();
					this.anIntArray85[local826] = local20.method7013();
				}
				this.aByteArray11[local826] = local25.method7011();
				this.aByteArray7[local826] = local30.method7011();
				this.anIntArray81[local826] = local35.method7011();
			}
			if (local1070 == 2) {
				this.aShortArray13[local826] = (short) local15.method7054();
				this.aShortArray12[local826] = (short) local15.method7054();
				this.aShortArray17[local826] = (short) local15.method7054();
				if (this.anInt1895 < 15) {
					this.anIntArray82[local826] = local20.method7054();
					if (this.anInt1895 >= 14) {
						this.anIntArray79[local826] = local20.method7013();
					} else {
						this.anIntArray79[local826] = local20.method7054();
					}
					this.anIntArray85[local826] = local20.method7054();
				} else {
					this.anIntArray82[local826] = local20.method7013();
					this.anIntArray79[local826] = local20.method7013();
					this.anIntArray85[local826] = local20.method7013();
				}
				this.aByteArray11[local826] = local25.method7011();
				this.aByteArray7[local826] = local30.method7011();
				this.anIntArray81[local826] = local35.method7011();
				this.anIntArray77[local826] = local35.method7011();
				this.anIntArray83[local826] = local35.method7011();
			}
			if (local1070 == 3) {
				this.aShortArray13[local826] = (short) local15.method7054();
				this.aShortArray12[local826] = (short) local15.method7054();
				this.aShortArray17[local826] = (short) local15.method7054();
				if (this.anInt1895 >= 15) {
					this.anIntArray82[local826] = local20.method7013();
					this.anIntArray79[local826] = local20.method7013();
					this.anIntArray85[local826] = local20.method7013();
				} else {
					this.anIntArray82[local826] = local20.method7054();
					if (this.anInt1895 < 14) {
						this.anIntArray79[local826] = local20.method7054();
					} else {
						this.anIntArray79[local826] = local20.method7013();
					}
					this.anIntArray85[local826] = local20.method7054();
				}
				this.aByteArray11[local826] = local25.method7011();
				this.aByteArray7[local826] = local30.method7011();
				this.anIntArray81[local826] = local35.method7011();
			}
		}
		local10.anInt9170 = local181;
		@Pc(1469) int local1469;
		@Pc(1475) int local1475;
		@Pc(1479) int local1479;
		@Pc(1546) int local1546;
		if (local85) {
			local1070 = local10.method7004();
			if (local1070 > 0) {
				this.aClass190Array1 = new Class190[local1070];
				for (local1469 = 0; local1469 < local1070; local1469++) {
					local1475 = local10.method7054();
					local1479 = local10.method7054();
					@Pc(1485) byte local1485;
					if (local126 == 255) {
						local1485 = this.aByteArray8[local1479];
					} else {
						local1485 = (byte) local126;
					}
					this.aClass190Array1[local1469] = new Class190(local1475, this.aShortArray19[local1479], this.aShortArray18[local1479], this.aShortArray15[local1479], local1485);
				}
			}
			local1469 = local10.method7004();
			if (local1469 > 0) {
				this.aClass52Array1 = new Class52[local1469];
				for (local1475 = 0; local1475 < local1469; local1475++) {
					local1479 = local10.method7054();
					local1546 = local10.method7054();
					this.aClass52Array1[local1475] = new Class52(local1479, local1546);
				}
			}
		}
		if (!local94) {
			return;
		}
		local1070 = local10.method7004();
		if (local1070 <= 0) {
			return;
		}
		this.aClass138Array1 = new Class138[local1070];
		for (local1469 = 0; local1469 < local1070; local1469++) {
			local1475 = local10.method7054();
			local1479 = local10.method7054();
			local1546 = local10.method7004();
			@Pc(1591) byte local1591 = local10.method7011();
			this.aClass138Array1[local1469] = new Class138(local1475, local1479, local1546, local1591);
		}
		return;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BSBSSSBBSS)B")
	public byte method1580() {
		if (this.anInt1899 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray9[this.anInt1899] = 3;
		this.aShortArray13[this.anInt1899] = 0;
		this.aShortArray12[this.anInt1899] = 32767;
		this.aShortArray17[this.anInt1899] = 0;
		this.anIntArray82[this.anInt1899] = 1024;
		this.anIntArray79[this.anInt1899] = 1024;
		this.anIntArray85[this.anInt1899] = 1024;
		this.aByteArray11[this.anInt1899] = 0;
		this.aByteArray7[this.anInt1899] = 0;
		this.anIntArray81[this.anInt1899] = 0;
		return (byte) this.anInt1899++;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(SBS)V")
	public void method1581(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1912; local1++) {
			if (arg0 == this.aShortArray14[local1]) {
				this.aShortArray14[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IZ)[[I")
	public int[][] method1582(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt1904 : this.anInt1902;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray76[local20];
			if (local27 >= 0) {
				if (local10 < local27) {
					local10 = local27;
				}
				@Pc(45) int local45 = local8[local27]++;
			}
		}
		@Pc(57) int[][] local57 = new int[local10 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local10; local59++) {
			local57[local59] = new int[local8[local59]];
			local8[local59] = 0;
		}
		for (@Pc(78) int local78 = 0; local78 < local18; local78++) {
			@Pc(85) int local85 = this.anIntArray76[local78];
			if (local85 >= 0) {
				local57[local85][local8[local85]++] = local78;
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BIII)V")
	public void method1585(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1904; local7++) {
			this.anIntArray78[local7] += arg2;
			this.anIntArray75[local7] += arg0;
			this.anIntArray84[local7] += arg1;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZSS)V")
	public void method1586(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray11 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt1912; local11++) {
			if (arg0 == this.aShortArray11[local11]) {
				this.aShortArray11[local11] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)V")
	public void method1588() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt1904; local11++) {
			this.anIntArray78[local11] <<= 0x2;
			this.anIntArray75[local11] <<= 0x2;
			this.anIntArray84[local11] <<= 0x2;
		}
		if (this.anInt1899 <= 0 || this.anIntArray82 == null) {
			return;
		}
		for (@Pc(57) int local57 = 0; local57 < this.anIntArray82.length; local57++) {
			this.anIntArray82[local57] <<= 0x2;
			this.anIntArray79[local57] <<= 0x2;
			if (this.aByteArray9[local57] != 1) {
				this.anIntArray85[local57] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIBISBBSI)I")
	public int method1589(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) short arg6, @OriginalArg(8) int arg7) {
		this.aShortArray19[this.anInt1912] = (short) arg7;
		this.aShortArray18[this.anInt1912] = (short) arg2;
		this.aShortArray15[this.anInt1912] = (short) arg0;
		this.aByteArray10[this.anInt1912] = arg1;
		this.aByteArray13[this.anInt1912] = arg4;
		this.aShortArray14[this.anInt1912] = arg3;
		this.aByteArray12[this.anInt1912] = arg5;
		this.aShortArray11[this.anInt1912] = arg6;
		return this.anInt1912++;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIII)V")
	public void method1590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(34) int local34;
		if (arg0 != 0) {
			local10 = Class262.anIntArray420[arg0];
			local14 = Class262.anIntArray421[arg0];
			for (local16 = 0; local16 < this.anInt1904; local16++) {
				local34 = this.anIntArray78[local16] * local14 + this.anIntArray75[local16] * local10 >> 14;
				this.anIntArray75[local16] = this.anIntArray75[local16] * local14 - this.anIntArray78[local16] * local10 >> 14;
				this.anIntArray78[local16] = local34;
			}
		}
		if (arg1 != 0) {
			local10 = Class262.anIntArray420[arg1];
			local14 = Class262.anIntArray421[arg1];
			for (local16 = 0; local16 < this.anInt1904; local16++) {
				local34 = this.anIntArray75[local16] * local14 - local10 * this.anIntArray84[local16] >> 14;
				this.anIntArray84[local16] = local10 * this.anIntArray75[local16] + this.anIntArray84[local16] * local14 >> 14;
				this.anIntArray75[local16] = local34;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local10 = Class262.anIntArray420[arg2];
		local14 = Class262.anIntArray421[arg2];
		for (local16 = 0; local16 < this.anInt1904; local16++) {
			local34 = local14 * this.anIntArray78[local16] + local10 * this.anIntArray84[local16] >> 14;
			this.anIntArray84[local16] = this.anIntArray84[local16] * local14 - this.anIntArray78[local16] * local10 >> 14;
			this.anIntArray78[local16] = local34;
		}
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(BIII)I")
	public int method1592(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1904; local7++) {
			if (arg2 == this.anIntArray78[local7] && arg0 == this.anIntArray75[local7] && arg1 == this.anIntArray84[local7]) {
				return local7;
			}
		}
		this.anIntArray78[this.anInt1904] = arg2;
		this.anIntArray75[this.anInt1904] = arg0;
		this.anIntArray84[this.anInt1904] = arg1;
		this.anInt1902 = this.anInt1904 + 1;
		return this.anInt1904++;
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)[[I")
	public int[][] method1593() {
		@Pc(13) int[] local13 = new int[256];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt1912; local17++) {
			@Pc(24) int local24 = this.anIntArray80[local17];
			if (local24 >= 0) {
				if (local15 < local24) {
					local15 = local24;
				}
				@Pc(35) int local35 = local13[local24]++;
			}
		}
		@Pc(52) int[][] local52 = new int[local15 + 1][];
		for (@Pc(54) int local54 = 0; local54 <= local15; local54++) {
			local52[local54] = new int[local13[local54]];
			local13[local54] = 0;
		}
		for (@Pc(77) int local77 = 0; local77 < this.anInt1912; local77++) {
			@Pc(84) int local84 = this.anIntArray80[local77];
			if (local84 >= 0) {
				local52[local84][local13[local84]++] = local77;
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "([BZ)V")
	private void method1594(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class4_Sub13 local14 = new Class4_Sub13(arg0);
		@Pc(19) Class4_Sub13 local19 = new Class4_Sub13(arg0);
		@Pc(24) Class4_Sub13 local24 = new Class4_Sub13(arg0);
		@Pc(29) Class4_Sub13 local29 = new Class4_Sub13(arg0);
		@Pc(34) Class4_Sub13 local34 = new Class4_Sub13(arg0);
		local14.anInt9170 = arg0.length - 18;
		this.anInt1904 = local14.method7054();
		this.anInt1912 = local14.method7054();
		this.anInt1899 = local14.method7004();
		@Pc(59) int local59 = local14.method7004();
		@Pc(63) int local63 = local14.method7004();
		@Pc(67) int local67 = local14.method7004();
		@Pc(71) int local71 = local14.method7004();
		@Pc(75) int local75 = local14.method7004();
		@Pc(79) int local79 = local14.method7054();
		@Pc(83) int local83 = local14.method7054();
		@Pc(87) int local87 = local14.method7054();
		@Pc(91) int local91 = local14.method7054();
		@Pc(100) int local100 = this.anInt1904;
		@Pc(102) int local102 = local100;
		local100 += this.anInt1912;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt1912;
		}
		@Pc(119) int local119 = local100;
		if (local71 == 1) {
			local100 += this.anInt1912;
		}
		@Pc(137) int local137 = local100;
		if (local59 == 1) {
			local100 += this.anInt1912;
		}
		@Pc(147) int local147 = local100;
		if (local75 == 1) {
			local100 += this.anInt1904;
		}
		@Pc(157) int local157 = local100;
		if (local67 == 1) {
			local100 += this.anInt1912;
		}
		@Pc(167) int local167 = local100;
		local100 += local91;
		@Pc(173) int local173 = local100;
		local100 += this.anInt1912 * 2;
		@Pc(182) int local182 = local100;
		local100 += this.anInt1899 * 6;
		@Pc(191) int local191 = local100;
		local100 += local79;
		@Pc(197) int local197 = local100;
		local100 += local83;
		if (this.anInt1899 > 0) {
			this.aShortArray17 = new short[this.anInt1899];
			this.aShortArray13 = new short[this.anInt1899];
			this.aByteArray9 = new byte[this.anInt1899];
			this.aShortArray12 = new short[this.anInt1899];
		}
		this.anIntArray78 = new int[this.anInt1904];
		this.aShortArray18 = new short[this.anInt1912];
		this.aShortArray15 = new short[this.anInt1912];
		if (local59 == 1) {
			this.aByteArray13 = new byte[this.anInt1912];
			this.aByteArray10 = new byte[this.anInt1912];
			this.aShortArray11 = new short[this.anInt1912];
		}
		if (local75 == 1) {
			this.anIntArray76 = new int[this.anInt1904];
		}
		if (local67 == 1) {
			this.aByteArray12 = new byte[this.anInt1912];
		}
		if (local71 == 1) {
			this.anIntArray80 = new int[this.anInt1912];
		}
		this.anIntArray84 = new int[this.anInt1904];
		if (local63 == 255) {
			this.aByteArray8 = new byte[this.anInt1912];
		} else {
			this.aByte25 = (byte) local63;
		}
		this.aShortArray14 = new short[this.anInt1912];
		local14.anInt9170 = 0;
		this.anIntArray75 = new int[this.anInt1904];
		this.aShortArray19 = new short[this.anInt1912];
		local19.anInt9170 = local191;
		local24.anInt9170 = local197;
		local29.anInt9170 = local100;
		local34.anInt9170 = local147;
		@Pc(340) int local340 = 0;
		@Pc(342) int local342 = 0;
		@Pc(344) int local344 = 0;
		@Pc(352) int local352;
		@Pc(354) int local354;
		for (@Pc(346) int local346 = 0; local346 < this.anInt1904; local346++) {
			local352 = local14.method7004();
			local354 = 0;
			if ((local352 & 0x1) != 0) {
				local354 = local19.method7017();
			}
			@Pc(364) int local364 = 0;
			if ((local352 & 0x2) != 0) {
				local364 = local24.method7017();
			}
			@Pc(377) int local377 = 0;
			if ((local352 & 0x4) != 0) {
				local377 = local29.method7017();
			}
			this.anIntArray78[local346] = local354 + local340;
			this.anIntArray75[local346] = local364 + local342;
			this.anIntArray84[local346] = local377 + local344;
			local344 = this.anIntArray84[local346];
			local340 = this.anIntArray78[local346];
			local342 = this.anIntArray75[local346];
			if (local75 == 1) {
				this.anIntArray76[local346] = local34.method7004();
			}
		}
		local14.anInt9170 = local173;
		local19.anInt9170 = local137;
		local24.anInt9170 = local109;
		local29.anInt9170 = local157;
		local34.anInt9170 = local119;
		for (local352 = 0; local352 < this.anInt1912; local352++) {
			this.aShortArray14[local352] = (short) local14.method7054();
			if (local59 == 1) {
				local354 = local19.method7004();
				if ((local354 & 0x1) == 1) {
					this.aByteArray10[local352] = 1;
					local7 = true;
				} else {
					this.aByteArray10[local352] = 0;
				}
				if ((local354 & 0x2) == 2) {
					this.aByteArray13[local352] = (byte) (local354 >> 2);
					this.aShortArray11[local352] = this.aShortArray14[local352];
					this.aShortArray14[local352] = 127;
					if (this.aShortArray11[local352] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray13[local352] = -1;
					this.aShortArray11[local352] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray8[local352] = local24.method7011();
			}
			if (local67 == 1) {
				this.aByteArray12[local352] = local29.method7011();
			}
			if (local71 == 1) {
				this.anIntArray80[local352] = local34.method7004();
			}
		}
		this.anInt1902 = -1;
		local14.anInt9170 = local167;
		local19.anInt9170 = local102;
		@Pc(593) short local593 = 0;
		@Pc(595) short local595 = 0;
		@Pc(597) short local597 = 0;
		@Pc(599) short local599 = 0;
		@Pc(607) int local607;
		for (@Pc(601) int local601 = 0; local601 < this.anInt1912; local601++) {
			local607 = local19.method7004();
			if (local607 == 1) {
				local593 = (short) (local14.method7017() + local599);
				local595 = (short) (local14.method7017() + local593);
				local597 = (short) (local595 + local14.method7017());
				local599 = local597;
				this.aShortArray19[local601] = local593;
				this.aShortArray18[local601] = local595;
				this.aShortArray15[local601] = local597;
				if (this.anInt1902 < local593) {
					this.anInt1902 = local593;
				}
				if (local595 > this.anInt1902) {
					this.anInt1902 = local595;
				}
				if (this.anInt1902 < local597) {
					this.anInt1902 = local597;
				}
			}
			if (local607 == 2) {
				local595 = local597;
				local597 = (short) (local599 + local14.method7017());
				this.aShortArray19[local601] = local593;
				local599 = local597;
				this.aShortArray18[local601] = local595;
				this.aShortArray15[local601] = local597;
				if (this.anInt1902 < local597) {
					this.anInt1902 = local597;
				}
			}
			if (local607 == 3) {
				local593 = local597;
				local597 = (short) (local14.method7017() + local599);
				this.aShortArray19[local601] = local593;
				local599 = local597;
				this.aShortArray18[local601] = local595;
				this.aShortArray15[local601] = local597;
				if (this.anInt1902 < local597) {
					this.anInt1902 = local597;
				}
			}
			if (local607 == 4) {
				@Pc(760) short local760 = local593;
				local593 = local595;
				local597 = (short) (local14.method7017() + local599);
				local595 = local760;
				local599 = local597;
				this.aShortArray19[local601] = local593;
				this.aShortArray18[local601] = local760;
				this.aShortArray15[local601] = local597;
				if (local597 > this.anInt1902) {
					this.anInt1902 = local597;
				}
			}
		}
		this.anInt1902++;
		local14.anInt9170 = local182;
		for (local607 = 0; local607 < this.anInt1899; local607++) {
			this.aByteArray9[local607] = 0;
			this.aShortArray13[local607] = (short) local14.method7054();
			this.aShortArray12[local607] = (short) local14.method7054();
			this.aShortArray17[local607] = (short) local14.method7054();
		}
		if (this.aByteArray13 != null) {
			@Pc(864) boolean local864 = false;
			for (@Pc(866) int local866 = 0; local866 < this.anInt1912; local866++) {
				@Pc(875) int local875 = this.aByteArray13[local866] & 0xFF;
				if (local875 != 255) {
					if (this.aShortArray19[local866] == (this.aShortArray13[local875] & 0xFFFF) && (this.aShortArray12[local875] & 0xFFFF) == this.aShortArray18[local866] && this.aShortArray15[local866] == (this.aShortArray17[local875] & 0xFFFF)) {
						this.aByteArray13[local866] = -1;
					} else {
						local864 = true;
					}
				}
			}
			if (!local864) {
				this.aByteArray13 = null;
			}
		}
		if (!local7) {
			this.aByteArray10 = null;
		}
		if (!local9) {
			this.aShortArray11 = null;
		}
	}
}
