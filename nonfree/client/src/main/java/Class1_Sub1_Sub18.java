import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wa", name = "X", descriptor = "I")
	public int anInt3027;

	@OriginalMember(owner = "client!wa", name = "kb", descriptor = "[I")
	public int[] anIntArray474;

	@OriginalMember(owner = "client!wa", name = "ob", descriptor = "[I")
	private int[] anIntArray475;

	@OriginalMember(owner = "client!wa", name = "Fb", descriptor = "[I")
	private int[] anIntArray476;

	@OriginalMember(owner = "client!wa", name = "Lb", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!wa", name = "Sb", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!wa", name = "Wb", descriptor = "[I")
	public int[] anIntArray477;

	@OriginalMember(owner = "client!wa", name = "R", descriptor = "I")
	private int anInt3025 = 0;

	@OriginalMember(owner = "client!wa", name = "ab", descriptor = "I")
	public int anInt3029 = 1;

	@OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
	private int anInt3026 = 128;

	@OriginalMember(owner = "client!wa", name = "nb", descriptor = "I")
	private int anInt3037 = -1;

	@OriginalMember(owner = "client!wa", name = "fb", descriptor = "I")
	public int anInt3033 = 2;

	@OriginalMember(owner = "client!wa", name = "Bb", descriptor = "I")
	public int anInt3045 = 0;

	@OriginalMember(owner = "client!wa", name = "ib", descriptor = "I")
	public int anInt3034 = 0;

	@OriginalMember(owner = "client!wa", name = "Jb", descriptor = "Z")
	public boolean aBoolean248 = false;

	@OriginalMember(owner = "client!wa", name = "mb", descriptor = "[Lclient!kd;")
	public final Class39[] aClass39Array30 = new Class39[5];

	@OriginalMember(owner = "client!wa", name = "Cb", descriptor = "I")
	private int anInt3046 = 128;

	@OriginalMember(owner = "client!wa", name = "db", descriptor = "Z")
	public boolean aBoolean243 = true;

	@OriginalMember(owner = "client!wa", name = "pb", descriptor = "Z")
	public boolean aBoolean245 = false;

	@OriginalMember(owner = "client!wa", name = "wb", descriptor = "I")
	public int anInt3041 = -1;

	@OriginalMember(owner = "client!wa", name = "jb", descriptor = "I")
	private int anInt3035 = 0;

	@OriginalMember(owner = "client!wa", name = "bb", descriptor = "I")
	private int anInt3030 = 0;

	@OriginalMember(owner = "client!wa", name = "Z", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!wa", name = "Ab", descriptor = "I")
	public int anInt3044 = 0;

	@OriginalMember(owner = "client!wa", name = "yb", descriptor = "I")
	private int anInt3042 = 0;

	@OriginalMember(owner = "client!wa", name = "hb", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!wa", name = "Db", descriptor = "I")
	public int anInt3047 = 0;

	@OriginalMember(owner = "client!wa", name = "Rb", descriptor = "I")
	public int anInt3055 = -1;

	@OriginalMember(owner = "client!wa", name = "vb", descriptor = "Z")
	public boolean aBoolean246 = false;

	@OriginalMember(owner = "client!wa", name = "zb", descriptor = "I")
	public int anInt3043 = -1;

	@OriginalMember(owner = "client!wa", name = "Pb", descriptor = "I")
	private int anInt3054 = -1;

	@OriginalMember(owner = "client!wa", name = "Kb", descriptor = "I")
	public int anInt3051 = -1;

	@OriginalMember(owner = "client!wa", name = "Vb", descriptor = "I")
	public int anInt3057 = 16;

	@OriginalMember(owner = "client!wa", name = "bc", descriptor = "I")
	public int anInt3060 = -1;

	@OriginalMember(owner = "client!wa", name = "Zb", descriptor = "I")
	public int anInt3059 = -1;

	@OriginalMember(owner = "client!wa", name = "dc", descriptor = "I")
	private int anInt3061 = 128;

	@OriginalMember(owner = "client!wa", name = "cc", descriptor = "Z")
	public boolean aBoolean250 = true;

	@OriginalMember(owner = "client!wa", name = "fc", descriptor = "I")
	private int anInt3063 = 0;

	@OriginalMember(owner = "client!wa", name = "rb", descriptor = "I")
	public int anInt3039 = 1;

	@OriginalMember(owner = "client!wa", name = "Yb", descriptor = "Lclient!kd;")
	public Class39 aClass39_1515 = Static26.aClass39_435;

	@OriginalMember(owner = "client!wa", name = "hc", descriptor = "Z")
	public boolean aBoolean251 = false;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIII)Lclient!na;")
	public Class1_Sub1_Sub2_Sub7 method2111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(23) long local23;
		if (this.anIntArray475 == null) {
			local23 = arg2 + (this.anInt3027 << 10);
		} else {
			local23 = (this.anInt3027 << 10) + (arg5 << 3) + arg2;
		}
		@Pc(39) Class1_Sub1_Sub2_Sub7 local39 = (Class1_Sub1_Sub2_Sub7) Static69.aClass33_24.method1038(local23);
		if (local39 == null) {
			@Pc(47) Class1_Sub1_Sub2_Sub5 local47 = this.method2119(arg2, arg5);
			if (local47 == null) {
				return null;
			}
			local39 = local47.method1101(this.anInt3042 + 64, this.anInt3025 * 5 + 768, -50, -10, -50);
			Static69.aClass33_24.method1042(local39, local23);
		}
		if (this.aBoolean248) {
			local39 = local39.method1375(arg0, arg3, arg4, arg1, true);
		}
		return local39;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!qc;I)V")
	public void method2112(@OriginalArg(0) Class1_Sub18 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2169();
			if (local5 == 0) {
				return;
			}
			this.method2113(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZLclient!qc;I)V")
	private void method2113(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8;
		@Pc(28) int local28;
		if (arg1 == 1) {
			local8 = arg0.method2169();
			if (local8 > 0) {
				if (this.anIntArray476 == null || Static86.aBoolean172) {
					this.anIntArray475 = new int[local8];
					this.anIntArray476 = new int[local8];
					for (local28 = 0; local28 < local8; local28++) {
						this.anIntArray476[local28] = arg0.method2156();
						this.anIntArray475[local28] = arg0.method2169();
					}
				} else {
					arg0.anInt3078 += local8 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass39_1515 = arg0.method2139();
		} else if (arg1 == 5) {
			local8 = arg0.method2169();
			if (local8 > 0) {
				if (this.anIntArray476 == null || Static86.aBoolean172) {
					this.anIntArray476 = new int[local8];
					this.anIntArray475 = null;
					for (local28 = 0; local28 < local8; local28++) {
						this.anIntArray476[local28] = arg0.method2156();
					}
				} else {
					arg0.anInt3078 += local8 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.anInt3039 = arg0.method2169();
		} else if (arg1 == 15) {
			this.anInt3029 = arg0.method2169();
		} else if (arg1 == 17) {
			this.aBoolean243 = false;
			this.anInt3033 = 0;
		} else if (arg1 == 18) {
			this.aBoolean243 = false;
		} else if (arg1 == 19) {
			this.anInt3060 = arg0.method2169();
		} else if (arg1 == 21) {
			this.aBoolean248 = true;
		} else if (arg1 == 22) {
			this.aBoolean242 = true;
		} else if (arg1 == 23) {
			this.aBoolean245 = true;
		} else if (arg1 == 24) {
			this.anInt3059 = arg0.method2156();
			if (this.anInt3059 == 65535) {
				this.anInt3059 = -1;
			}
		} else if (arg1 == 27) {
			this.anInt3033 = 1;
		} else if (arg1 == 28) {
			this.anInt3057 = arg0.method2169();
		} else if (arg1 == 29) {
			this.anInt3042 = arg0.method2178();
		} else if (arg1 == 39) {
			this.anInt3025 = arg0.method2178() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass39Array30[arg1 - 30] = arg0.method2139();
			if (this.aClass39Array30[arg1 - 30].method1158(Static79.aClass39_1228)) {
				this.aClass39Array30[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local8 = arg0.method2169();
			this.aShortArray14 = new short[local8];
			this.aShortArray13 = new short[local8];
			for (local28 = 0; local28 < local8; local28++) {
				this.aShortArray13[local28] = (short) arg0.method2156();
				this.aShortArray14[local28] = (short) arg0.method2156();
			}
		} else if (arg1 == 60) {
			this.anInt3051 = arg0.method2156();
		} else if (arg1 == 62) {
			this.aBoolean244 = true;
		} else if (arg1 == 64) {
			this.aBoolean250 = false;
		} else if (arg1 == 65) {
			this.anInt3061 = arg0.method2156();
		} else if (arg1 == 66) {
			this.anInt3046 = arg0.method2156();
		} else if (arg1 == 67) {
			this.anInt3026 = arg0.method2156();
		} else if (arg1 == 68) {
			this.anInt3055 = arg0.method2156();
		} else if (arg1 == 69) {
			this.anInt3047 = arg0.method2169();
		} else if (arg1 == 70) {
			this.anInt3035 = arg0.method2157();
		} else if (arg1 == 71) {
			this.anInt3063 = arg0.method2157();
		} else if (arg1 == 72) {
			this.anInt3030 = arg0.method2157();
		} else if (arg1 == 73) {
			this.aBoolean251 = true;
		} else if (arg1 == 74) {
			this.aBoolean246 = true;
		} else if (arg1 == 75) {
			this.anInt3041 = arg0.method2169();
		} else if (arg1 == 77) {
			this.anInt3037 = arg0.method2156();
			if (this.anInt3037 == 65535) {
				this.anInt3037 = -1;
			}
			this.anInt3054 = arg0.method2156();
			if (this.anInt3054 == 65535) {
				this.anInt3054 = -1;
			}
			local8 = arg0.method2169();
			this.anIntArray477 = new int[local8 + 1];
			for (local28 = 0; local28 <= local8; local28++) {
				this.anIntArray477[local28] = arg0.method2156();
				if (this.anIntArray477[local28] == 65535) {
					this.anIntArray477[local28] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.anInt3043 = arg0.method2156();
			this.anInt3045 = arg0.method2169();
		} else if (arg1 == 79) {
			this.anInt3044 = arg0.method2156();
			this.anInt3034 = arg0.method2156();
			this.anInt3045 = arg0.method2169();
			local8 = arg0.method2169();
			this.anIntArray474 = new int[local8];
			for (local28 = 0; local28 < local8; local28++) {
				this.anIntArray474[local28] = arg0.method2156();
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(B)Z")
	public boolean method2115() {
		if (this.anIntArray477 == null) {
			return this.anInt3043 != -1 || this.anIntArray474 != null;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anIntArray477.length; local27++) {
			if (this.anIntArray477[local27] != -1) {
				@Pc(44) Class1_Sub1_Sub18 local44 = Static104.method1862(this.anIntArray477[local27]);
				if (local44.anInt3043 != -1 || local44.anIntArray474 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(B)V")
	public void method2116() {
		if (this.anInt3060 == -1) {
			this.anInt3060 = 0;
			if (this.anIntArray476 != null && (this.anIntArray475 == null || this.anIntArray475[0] == 10)) {
				this.anInt3060 = 1;
			}
			for (@Pc(29) int local29 = 0; local29 < 5; local29++) {
				if (this.aClass39Array30[local29] != null) {
					this.anInt3060 = 1;
				}
			}
		}
		if (this.anInt3041 == -1) {
			this.anInt3041 = this.anInt3033 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)Lclient!je;")
	private Class1_Sub1_Sub2_Sub5 method2119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class1_Sub1_Sub2_Sub5 local15 = null;
		@Pc(22) int local22;
		@Pc(65) int local65;
		@Pc(122) boolean local122;
		@Pc(134) int local134;
		if (this.anIntArray475 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.anIntArray476 == null) {
				return null;
			}
			local122 = arg0 > 3 ^ this.aBoolean244;
			local22 = this.anIntArray476.length;
			for (local65 = 0; local65 < local22; local65++) {
				local134 = this.anIntArray476[local65];
				if (local122) {
					local134 += 65536;
				}
				local15 = (Class1_Sub1_Sub2_Sub5) Static97.aClass33_43.method1038((long) local134);
				if (local15 == null) {
					local15 = Static60.method1097(Static51.aClass62_13, local134 & 0xFFFF);
					if (local15 == null) {
						return null;
					}
					if (local122) {
						local15.method1093();
					}
					Static97.aClass33_43.method1042(local15, (long) local134);
				}
				if (local22 > 1) {
					Static56.aClass1_Sub1_Sub2_Sub5Array1[local65] = local15;
				}
			}
			if (local22 > 1) {
				local15 = new Class1_Sub1_Sub2_Sub5(Static56.aClass1_Sub1_Sub2_Sub5Array1, local22);
			}
		} else {
			@Pc(20) int local20 = -1;
			for (local22 = 0; local22 < this.anIntArray475.length; local22++) {
				if (arg1 == this.anIntArray475[local22]) {
					local20 = local22;
					break;
				}
			}
			if (local20 == -1) {
				return null;
			}
			@Pc(60) boolean local60 = arg0 > 3 ^ this.aBoolean244;
			local65 = this.anIntArray476[local20];
			if (local60) {
				local65 += 65536;
			}
			local15 = (Class1_Sub1_Sub2_Sub5) Static97.aClass33_43.method1038((long) local65);
			if (local15 == null) {
				local15 = Static60.method1097(Static51.aClass62_13, local65 & 0xFFFF);
				if (local15 == null) {
					return null;
				}
				if (local60) {
					local15.method1093();
				}
				Static97.aClass33_43.method1042(local15, (long) local65);
			}
		}
		if (this.anInt3061 == 128 && this.anInt3046 == 128 && this.anInt3026 == 128) {
			local122 = false;
		} else {
			local122 = true;
		}
		@Pc(230) boolean local230;
		if (this.anInt3035 == 0 && this.anInt3063 == 0 && this.anInt3030 == 0) {
			local230 = false;
		} else {
			local230 = true;
		}
		@Pc(258) Class1_Sub1_Sub2_Sub5 local258 = new Class1_Sub1_Sub2_Sub5(local15, arg0 == 0 && !local122 && !local230, this.aShortArray13 == null, true);
		@Pc(262) int local262 = arg0 & 0x3;
		if (local262 == 1) {
			local258.method1095();
		} else if (local262 == 2) {
			local258.method1090();
		} else if (local262 == 3) {
			local258.method1091();
		}
		if (this.aShortArray13 != null) {
			for (local134 = 0; local134 < this.aShortArray13.length; local134++) {
				local258.method1104(this.aShortArray13[local134], this.aShortArray14[local134]);
			}
		}
		if (local122) {
			local258.method1100(this.anInt3061, this.anInt3046, this.anInt3026);
		}
		if (local230) {
			local258.method1092(this.anInt3035, this.anInt3063, this.anInt3030);
		}
		return local258;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)Z")
	public boolean method2120(@OriginalArg(0) int arg0) {
		if (this.anIntArray475 != null) {
			for (@Pc(66) int local66 = 0; local66 < this.anIntArray475.length; local66++) {
				if (arg0 == this.anIntArray475[local66]) {
					return Static51.aClass62_13.method2019(this.anIntArray476[local66] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray476 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(35) boolean local35 = true;
			for (@Pc(37) int local37 = 0; local37 < this.anIntArray476.length; local37++) {
				local35 &= Static51.aClass62_13.method2019(this.anIntArray476[local37] & 0xFFFF, 0);
			}
			return local35;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZIIIIII)Lclient!cc;")
	public Class1_Sub1_Sub2 method2121(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) long local16;
		if (this.anIntArray475 == null) {
			local16 = arg3 + (this.anInt3027 << 10);
		} else {
			local16 = arg3 + (arg1 << 3) + (this.anInt3027 << 10);
		}
		@Pc(41) Class1_Sub1_Sub2 local41 = (Class1_Sub1_Sub2) Static33.aClass33_12.method1038(local16);
		if (local41 == null) {
			@Pc(49) Class1_Sub1_Sub2_Sub5 local49 = this.method2119(arg3, arg1);
			if (local49 == null) {
				return null;
			}
			if (this.aBoolean242) {
				local49.aShort2 = (short) (this.anInt3025 * 5 + 768);
				local49.aShort1 = (short) (this.anInt3042 + 64);
				local49.method1087();
				local41 = local49;
			} else {
				local41 = local49.method1101(this.anInt3042 + 64, this.anInt3025 * 5 + 768, -50, -10, -50);
			}
			Static33.aClass33_12.method1042(local41, local16);
		}
		if (this.aBoolean242) {
			local41 = ((Class1_Sub1_Sub2_Sub5) local41).method1096();
		}
		if (this.aBoolean248) {
			if (local41 instanceof Class1_Sub1_Sub2_Sub7) {
				local41 = ((Class1_Sub1_Sub2_Sub7) local41).method1375(arg2, arg0, arg5, arg4, true);
			} else if (local41 instanceof Class1_Sub1_Sub2_Sub5) {
				local41 = ((Class1_Sub1_Sub2_Sub5) local41).method1099(arg2, arg0, arg5, arg4);
			}
		}
		return local41;
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)Z")
	public boolean method2123() {
		if (this.anIntArray476 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray476.length; local20++) {
			local12 &= Static51.aClass62_13.method2019(this.anIntArray476[local20] & 0xFFFF, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIILclient!f;III)Lclient!na;")
	public Class1_Sub1_Sub2_Sub7 method2125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub1_Sub7 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) long local16;
		if (this.anIntArray475 == null) {
			local16 = arg3 + (this.anInt3027 << 10);
		} else {
			local16 = (this.anInt3027 << 10) + (arg4 << 3) + arg3;
		}
		@Pc(36) Class1_Sub1_Sub2_Sub7 local36 = (Class1_Sub1_Sub2_Sub7) Static69.aClass33_24.method1038(local16);
		if (local36 == null) {
			@Pc(44) Class1_Sub1_Sub2_Sub5 local44 = this.method2119(arg3, arg4);
			if (local44 == null) {
				return null;
			}
			local36 = local44.method1101(this.anInt3042 + 64, 768 - -(this.anInt3025 * 5), -50, -10, -50);
			Static69.aClass33_24.method1042(local36, local16);
		}
		if (arg5 == null && !this.aBoolean248) {
			return local36;
		}
		if (arg5 == null) {
			local36 = local36.method1380(true);
		} else {
			local36 = arg5.method632(arg3, arg7, local36);
		}
		if (this.aBoolean248) {
			local36.method1375(arg1, arg2, arg0, arg6, false);
		}
		return local36;
	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(B)Lclient!wa;")
	public Class1_Sub1_Sub18 method2126() {
		@Pc(11) int local11 = -1;
		if (this.anInt3037 != -1) {
			local11 = Static18.method360(this.anInt3037);
		} else if (this.anInt3054 != -1) {
			local11 = Static44.anIntArray175[this.anInt3054];
		}
		return local11 < 0 || this.anIntArray477.length <= local11 || this.anIntArray477[local11] == -1 ? null : Static104.method1862(this.anIntArray477[local11]);
	}
}
