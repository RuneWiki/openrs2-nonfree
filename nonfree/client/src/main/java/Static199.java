import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!u", name = "h", descriptor = "I")
	public static int anInt4490;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Lclient!qe;")
	public static Class78 aClass78_788 = method3560("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Lclient!qe;")
	public static Class78 aClass78_789 = method3560("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!u", name = "g", descriptor = "Lclient!qe;")
	public static Class78 aClass78_790 = method3560(" )2>");

	@OriginalMember(owner = "client!u", name = "i", descriptor = "J")
	public static volatile long aLong162 = 0L;

	@OriginalMember(owner = "client!u", name = "j", descriptor = "I")
	public static volatile int anInt4491 = 0;

	@OriginalMember(owner = "client!u", name = "m", descriptor = "Lclient!qe;")
	public static Class78 aClass78_791 = method3560(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
	public static void method3558() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < Static78.anInt1716; local1++) {
			for (local4 = 0; local4 < Static173.anInt3981; local4++) {
				for (local7 = 0; local7 < Static159.anInt4174; local7++) {
					Static226.aClass2_Sub12ArrayArrayArray3[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static74.anInt1594; local4++) {
			for (local7 = 0; local7 < Static74.anIntArray271[local4]; local7++) {
				Static74.aClass1ArrayArray1[local4][local7] = null;
			}
			Static74.anIntArray271[local4] = 0;
		}
		for (local7 = 0; local7 < Static49.anInt897; local7++) {
			Static38.aClass100Array2[local7] = null;
		}
		Static49.anInt897 = 0;
		for (@Pc(69) int local69 = 0; local69 < Static18.aClass100Array1.length; local69++) {
			Static18.aClass100Array1[local69] = null;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!qe;")
	public static Class78 method3560(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = 0;
		@Pc(16) byte[] local16 = arg0.getBytes();
		@Pc(19) int local19 = local16.length;
		@Pc(23) Class78 local23 = new Class78();
		local23.aByteArray48 = new byte[local19];
		while (local13 < local19) {
			@Pc(35) int local35 = local16[local13++] & 0xFF;
			if (local35 <= 45 && local35 >= 40) {
				if (local13 >= local19) {
					break;
				}
				@Pc(68) int local68 = local16[local13++] & 0xFF;
				local23.aByteArray48[local23.anInt3831++] = (byte) (local68 + (local35 - 40) * 43 - 48);
			} else if (local35 != 0) {
				local23.aByteArray48[local23.anInt3831++] = (byte) local35;
			}
		}
		local23.method3002();
		return local23.method3039();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!mj;ZIIILclient!gd;)V")
	public static void method3561(@OriginalArg(0) int arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2_Sub3_Sub8 arg5) {
		if (arg5 == null) {
			return;
		}
		@Pc(18) int local18 = arg3 * arg3 + arg2 * arg2;
		@Pc(25) int local25 = Static140.anInt3197 + Static90.anInt2013 & 0x7FF;
		@Pc(37) int local37 = Math.max(arg1.anInt3021 / 2, arg1.anInt3040 / 2) + 10;
		if (local37 * local37 < local18) {
			return;
		}
		@Pc(51) int local51 = Class77.anIntArray632[local25];
		@Pc(55) int local55 = Class77.anIntArray631[local25];
		@Pc(63) int local63 = local55 * 256 / (Static62.anInt1225 + 256);
		@Pc(71) int local71 = local51 * 256 / (Static62.anInt1225 + 256);
		@Pc(81) int local81 = arg3 * local63 + arg2 * local71 >> 16;
		@Pc(92) int local92 = arg3 * local71 - arg2 * local63 >> 16;
		((Class2_Sub3_Sub8_Sub1) arg5).method2271(arg1.anInt3021 / 2 + arg4 + local81 - arg5.anInt2850 / 2, -(arg5.anInt2844 / 2) + arg1.anInt3040 / 2 + (arg0 - local92), arg1.anIntArray491, arg1.anIntArray494);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)V")
	public static void method3562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static8.anInt262 == 1) {
			Static221.aClass2_Sub3_Sub8Array12[Static2.anInt42 / 100].method2262(Static206.anInt4570 - 8, Static46.anInt847 + -8);
		}
		if (Static8.anInt262 == 2) {
			Static221.aClass2_Sub3_Sub8Array12[Static2.anInt42 / 100 + 4].method2262(Static206.anInt4570 - 8, Static46.anInt847 + -8);
		}
		Static9.method191();
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
	public static void method3564() {
		for (@Pc(7) int local7 = 0; local7 < Static125.anInt1641; local7++) {
			@Pc(13) int local13 = Static156.anIntArray598[local7];
			@Pc(17) Class5_Sub2_Sub1 local17 = Static95.aClass5_Sub2_Sub1Array1[local13];
			@Pc(21) int local21 = Static139.aClass2_Sub23_Sub1_4.method2122();
			@Pc(37) int local37;
			if ((local21 & 0x10) != 0) {
				local17.anInt1857 = Static139.aClass2_Sub23_Sub1_4.method2092();
				local37 = Static139.aClass2_Sub23_Sub1_4.method2131();
				local17.anInt1874 = 0;
				local17.anInt1843 = 0;
				if (local17.anInt1857 == 65535) {
					local17.anInt1857 = -1;
				}
				local17.anInt1875 = local37 >> 16;
				local17.anInt1819 = Static123.anInt2808 + (local37 & 0xFFFF);
				if (Static123.anInt2808 < local17.anInt1819) {
					local17.anInt1843 = -1;
				}
			}
			if ((local21 & 0x20) != 0) {
				local17.anInt1841 = Static139.aClass2_Sub23_Sub1_4.method2130();
				if (local17.anInt1841 == 65535) {
					local17.anInt1841 = -1;
				}
			}
			if ((local21 & 0x40) != 0) {
				local17.aClass78_422 = Static139.aClass2_Sub23_Sub1_4.method2115();
				local17.anInt1845 = 100;
			}
			@Pc(121) int local121;
			if ((local21 & 0x8) != 0) {
				local37 = Static139.aClass2_Sub23_Sub1_4.method2142();
				local121 = Static139.aClass2_Sub23_Sub1_4.method2122();
				local17.method1484(local121, local37, Static123.anInt2808);
			}
			if ((local21 & 0x2) != 0) {
				if (local17.aClass2_Sub3_Sub9_1.method1062()) {
					Static67.method664(local17);
				}
				local17.aClass2_Sub3_Sub9_1 = Static35.method432(Static139.aClass2_Sub23_Sub1_4.method2095());
				local17.anInt1880 = local17.aClass2_Sub3_Sub9_1.anInt1289;
				local17.anInt1855 = local17.aClass2_Sub3_Sub9_1.anInt1266;
				local17.anInt1847 = local17.aClass2_Sub3_Sub9_1.anInt1297;
				local17.anInt1832 = local17.aClass2_Sub3_Sub9_1.anInt1284;
				local17.anInt1851 = local17.aClass2_Sub3_Sub9_1.anInt1281;
				local17.anInt1866 = local17.aClass2_Sub3_Sub9_1.anInt1283;
				local17.anInt1879 = local17.aClass2_Sub3_Sub9_1.anInt1268;
				local17.anInt1863 = local17.aClass2_Sub3_Sub9_1.anInt1287;
				local17.anInt1840 = local17.aClass2_Sub3_Sub9_1.anInt1270;
				if (local17.aClass2_Sub3_Sub9_1.method1062()) {
					Static162.method2923(local17.anIntArray333[0], local17, null, Static137.anInt3136, null, local17.anIntArray334[0], 0);
				}
			}
			if ((local21 & 0x1) != 0) {
				local17.anInt1865 = Static139.aClass2_Sub23_Sub1_4.method2095();
				local17.anInt1836 = Static139.aClass2_Sub23_Sub1_4.method2095();
			}
			if ((local21 & 0x4) != 0) {
				local37 = Static139.aClass2_Sub23_Sub1_4.method2126();
				local121 = Static139.aClass2_Sub23_Sub1_4.method2107();
				local17.method1484(local121, local37, Static123.anInt2808);
				local17.anInt1850 = Static123.anInt2808 + 300;
				local17.anInt1858 = Static139.aClass2_Sub23_Sub1_4.method2126();
			}
			if ((local21 & 0x80) != 0) {
				local37 = Static139.aClass2_Sub23_Sub1_4.method2095();
				local121 = Static139.aClass2_Sub23_Sub1_4.method2107();
				if (local37 == 65535) {
					local37 = -1;
				}
				Static79.method1336(local121, local17, local37);
			}
		}
	}
}
