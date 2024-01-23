import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!si", name = "R", descriptor = "Lclient!oe;")
	public static Class72 aClass72_263;

	@OriginalMember(owner = "client!si", name = "W", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!si", name = "T", descriptor = "[Lclient!ub;")
	public static Class99[] aClass99Array1 = new Class99[27];

	@OriginalMember(owner = "client!si", name = "Y", descriptor = "Lclient!qe;")
	private static Class78 aClass78_745 = Static199.method3560("glow1:");

	@OriginalMember(owner = "client!si", name = "X", descriptor = "Lclient!qe;")
	public static Class78 aClass78_744 = aClass78_745;

	@OriginalMember(owner = "client!si", name = "ab", descriptor = "Lclient!qe;")
	public static Class78 aClass78_746 = aClass78_745;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(II)I")
	public static int method3480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!t;I[B)V")
	public static void method3481(@OriginalArg(0) int arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(3) Class2_Sub16 local3 = new Class2_Sub16();
		local3.aClass88_1 = arg1;
		local3.aByteArray22 = arg2;
		local3.anInt1364 = 0;
		local3.aLong188 = arg0;
		@Pc(22) Class44 local22 = Static202.aClass44_57;
		synchronized (Static202.aClass44_57) {
			Static202.aClass44_57.method1355(local3);
		}
		Static183.method3365();
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(IB)Lclient!bc;")
	public static Class2_Sub2 method3482(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class2_Sub2_Sub16();
		} else if (arg0 == 1) {
			return new Class2_Sub2_Sub17();
		} else if (arg0 == 2) {
			return new Class2_Sub2_Sub25();
		} else if (arg0 == 3) {
			return new Class2_Sub2_Sub38();
		} else if (arg0 == 4) {
			return new Class2_Sub2_Sub19();
		} else if (arg0 == 5) {
			return new Class2_Sub2_Sub21();
		} else if (arg0 == 6) {
			return new Class2_Sub2_Sub15();
		} else if (arg0 == 7) {
			return new Class2_Sub2_Sub28();
		} else if (arg0 == 8) {
			return new Class2_Sub2_Sub23();
		} else if (arg0 == 9) {
			return new Class2_Sub2_Sub7();
		} else if (arg0 == 10) {
			return new Class2_Sub2_Sub11();
		} else if (arg0 == 11) {
			return new Class2_Sub2_Sub6();
		} else if (arg0 == 12) {
			return new Class2_Sub2_Sub39();
		} else if (arg0 == 13) {
			return new Class2_Sub2_Sub35();
		} else if (arg0 == 14) {
			return new Class2_Sub2_Sub29();
		} else if (arg0 == 15) {
			return new Class2_Sub2_Sub9();
		} else if (arg0 == 16) {
			return new Class2_Sub2_Sub33();
		} else if (arg0 == 17) {
			return new Class2_Sub2_Sub4();
		} else if (arg0 == 18) {
			return new Class2_Sub2_Sub26_Sub1();
		} else if (arg0 == 19) {
			return new Class2_Sub2_Sub22();
		} else if (arg0 == 20) {
			return new Class2_Sub2_Sub5();
		} else if (arg0 == 21) {
			return new Class2_Sub2_Sub27();
		} else if (arg0 == 22) {
			return new Class2_Sub2_Sub36();
		} else if (arg0 == 23) {
			return new Class2_Sub2_Sub14();
		} else if (arg0 == 24) {
			return new Class2_Sub2_Sub37();
		} else if (arg0 == 25) {
			return new Class2_Sub2_Sub8();
		} else if (arg0 == 26) {
			return new Class2_Sub2_Sub1();
		} else if (arg0 == 27) {
			return new Class2_Sub2_Sub34();
		} else if (arg0 == 28) {
			return new Class2_Sub2_Sub12();
		} else if (arg0 == 29) {
			return new Class2_Sub2_Sub30();
		} else if (arg0 == 30) {
			return new Class2_Sub2_Sub18();
		} else if (arg0 == 31) {
			return new Class2_Sub2_Sub3();
		} else if (arg0 == 32) {
			return new Class2_Sub2_Sub13();
		} else if (arg0 == 33) {
			return new Class2_Sub2_Sub32();
		} else if (arg0 == 34) {
			return new Class2_Sub2_Sub24();
		} else if (arg0 == 35) {
			return new Class2_Sub2_Sub10();
		} else if (arg0 == 36) {
			return new Class2_Sub2_Sub31();
		} else if (arg0 == 37) {
			return new Class2_Sub2_Sub20();
		} else if (arg0 == 38) {
			return new Class2_Sub2_Sub2();
		} else if (arg0 == 39) {
			return new Class2_Sub2_Sub26();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BIII)I")
	public static int method3484(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!si", name = "d", descriptor = "(III)J")
	public static long method3485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub12 local7 = Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt775; local13++) {
			@Pc(19) Class100 local19 = local7.aClass100Array3[local13];
			if ((local19.aLong169 >> 29 & 0x3L) == 2L && local19.anInt4529 == arg1 && local19.anInt4517 == arg2) {
				return local19.aLong169;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IJSILclient!qe;Lclient!qe;B)V")
	public static void method3487(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class78 arg4, @OriginalArg(5) Class78 arg5) {
		if (Static202.aBoolean194 || Static138.anInt3182 >= 500) {
			return;
		}
		Static32.aClass78Array30[Static138.anInt3182] = arg5;
		Static57.aClass78Array6[Static138.anInt3182] = arg4;
		Static79.aShortArray53[Static138.anInt3182] = arg2;
		Static14.aLongArray8[Static138.anInt3182] = arg1;
		Static117.anIntArray450[Static138.anInt3182] = arg0;
		Static120.anIntArray460[Static138.anInt3182] = arg3;
		Static138.anInt3182++;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!hh;)V")
	public static void method3488(@OriginalArg(1) Class5_Sub2_Sub2 arg0) {
		@Pc(12) Class2_Sub14 local12 = (Class2_Sub14) Static113.aClass103_15.method3659(arg0.aClass78_423.method3016());
		if (local12 == null) {
			return;
		}
		if (local12.aClass2_Sub21_Sub4_2 != null) {
			Static23.aClass2_Sub21_Sub3_1.method3390(local12.aClass2_Sub21_Sub4_2);
			local12.aClass2_Sub21_Sub4_2 = null;
		}
		local12.method3986();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!qe;BLclient!qe;IILclient!qe;)V")
	public static void method3489(@OriginalArg(0) Class78 arg0, @OriginalArg(2) Class78 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class78 arg4) {
		for (@Pc(5) int local5 = 99; local5 > 0; local5--) {
			Static37.anIntArray107[local5] = Static37.anIntArray107[local5 - 1];
			Static185.aClass78Array32[local5] = Static185.aClass78Array32[local5 - 1];
			Static155.aClass78Array26[local5] = Static155.aClass78Array26[local5 - 1];
			Static45.aClass78Array7[local5] = Static45.aClass78Array7[local5 - 1];
			Static75.anIntArray276[local5] = Static75.anIntArray276[local5 - 1];
		}
		Static185.aClass78Array32[0] = arg0;
		Static224.anInt4848++;
		Static129.anInt2901 = Static133.anInt3087;
		Static155.aClass78Array26[0] = arg4;
		Static37.anIntArray107[0] = arg2;
		Static75.anIntArray276[0] = arg3;
		Static45.aClass78Array7[0] = arg1;
	}
}
