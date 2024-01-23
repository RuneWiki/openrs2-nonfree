import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "Z")
	public static boolean aBoolean279 = false;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "Lclient!lc;")
	public static Class79 aClass79_38 = new Class79(2);

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
	public static int anInt5460 = -1;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
	public static int anInt5461 = 0;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!se;I)V")
	public static void method4146(@OriginalArg(0) Class122 arg0) {
		if (Static263.anInt5531 == arg0.anInt4697) {
			Static198.aBooleanArray19[arg0.anInt4671] = true;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
	public static void method4147(@OriginalArg(0) int arg0) {
		if (Static261.anIntArray467 == null || arg0 > Static261.anIntArray467.length) {
			Static261.anIntArray467 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I[B)V")
	public static void method4148(@OriginalArg(1) byte[] arg0) {
		@Pc(6) Class1_Sub13 local6 = new Class1_Sub13(arg0);
		local6.anInt2395 = arg0.length - 2;
		Static75.anInt2041 = local6.method1764();
		Static11.aByteArrayArray1 = new byte[Static75.anInt2041][];
		Static74.aBooleanArray4 = new boolean[Static75.anInt2041];
		Static202.anIntArray345 = new int[Static75.anInt2041];
		Static147.aByteArrayArray7 = new byte[Static75.anInt2041][];
		Static218.anIntArray382 = new int[Static75.anInt2041];
		Static233.anIntArray438 = new int[Static75.anInt2041];
		Static79.anIntArray165 = new int[Static75.anInt2041];
		local6.anInt2395 = arg0.length - Static75.anInt2041 * 8 - 7;
		Static24.anInt806 = local6.method1764();
		Static240.anInt5164 = local6.method1764();
		@Pc(68) int local68 = (local6.method1772() & 0xFF) + 1;
		for (@Pc(70) int local70 = 0; local70 < Static75.anInt2041; local70++) {
			Static202.anIntArray345[local70] = local6.method1764();
		}
		for (@Pc(92) int local92 = 0; local92 < Static75.anInt2041; local92++) {
			Static79.anIntArray165[local92] = local6.method1764();
		}
		for (@Pc(110) int local110 = 0; local110 < Static75.anInt2041; local110++) {
			Static218.anIntArray382[local110] = local6.method1764();
		}
		for (@Pc(128) int local128 = 0; local128 < Static75.anInt2041; local128++) {
			Static233.anIntArray438[local128] = local6.method1764();
		}
		local6.anInt2395 = arg0.length - Static75.anInt2041 * 8 - (local68 + -1) * 3 - 7;
		Static102.anIntArray201 = new int[local68];
		for (@Pc(162) int local162 = 1; local162 < local68; local162++) {
			Static102.anIntArray201[local162] = local6.method1773();
			if (Static102.anIntArray201[local162] == 0) {
				Static102.anIntArray201[local162] = 1;
			}
		}
		local6.anInt2395 = 0;
		for (@Pc(194) int local194 = 0; local194 < Static75.anInt2041; local194++) {
			@Pc(200) int local200 = Static218.anIntArray382[local194];
			@Pc(204) int local204 = Static233.anIntArray438[local194];
			@Pc(208) int local208 = local204 * local200;
			@Pc(210) boolean local210 = false;
			@Pc(213) byte[] local213 = new byte[local208];
			@Pc(216) byte[] local216 = new byte[local208];
			Static11.aByteArrayArray1[local194] = local213;
			Static147.aByteArrayArray7[local194] = local216;
			@Pc(228) int local228 = local6.method1772();
			@Pc(237) int local237;
			@Pc(241) int local241;
			if ((local228 & 0x1) == 0) {
				for (local237 = 0; local237 < local208; local237++) {
					local213[local237] = local6.method1756();
				}
				if ((local228 & 0x2) != 0) {
					for (local241 = 0; local241 < local208; local241++) {
						@Pc(349) byte local349 = local216[local241] = local6.method1756();
						local210 |= local349 != -1;
					}
				}
			} else {
				local237 = 0;
				label87: while (true) {
					if (local237 >= local200) {
						if ((local228 & 0x2) == 0) {
							break;
						}
						local241 = 0;
						while (true) {
							if (local200 <= local241) {
								break label87;
							}
							for (@Pc(278) int local278 = 0; local278 < local204; local278++) {
								@Pc(292) byte local292 = local216[local200 * local278 + local241] = local6.method1756();
								local210 |= local292 != -1;
							}
							local241++;
						}
					}
					for (local241 = 0; local241 < local204; local241++) {
						local213[local241 * local200 + local237] = local6.method1756();
					}
					local237++;
				}
			}
			Static74.aBooleanArray4[local194] = local210;
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
	public static void method4149() {
		if (Static117.anInt3043 == 0) {
			return;
		}
		try {
			if (++Static52.anInt1463 > 2000) {
				if (Static34.aClass109_2 != null) {
					Static34.aClass109_2.method3141();
					Static34.aClass109_2 = null;
				}
				if (Static170.anInt3979 >= 1) {
					Static117.anInt3043 = 0;
					Static243.anInt5242 = -5;
					return;
				}
				if (Static45.anInt1360 == Static8.anInt151) {
					Static45.anInt1360 = Static79.anInt2161;
				} else {
					Static45.anInt1360 = Static8.anInt151;
				}
				Static52.anInt1463 = 0;
				Static170.anInt3979++;
				Static117.anInt3043 = 1;
			}
			if (Static117.anInt3043 == 1) {
				Static152.aClass145_6 = Static38.aClass28_1.method718(Static45.anInt1360, Static70.aString115);
				Static117.anInt3043 = 2;
			}
			@Pc(117) int local117;
			if (Static117.anInt3043 == 2) {
				if (Static152.aClass145_6.anInt5354 == 2) {
					throw new IOException();
				}
				if (Static152.aClass145_6.anInt5354 != 1) {
					return;
				}
				Static34.aClass109_2 = new Class109((Socket) Static152.aClass145_6.anObject7, Static38.aClass28_1);
				Static152.aClass145_6 = null;
				Static34.aClass109_2.method3150(Static171.aClass1_Sub13_Sub1_3.aByteArray29, Static171.aClass1_Sub13_Sub1_3.anInt2395);
				if (Static90.aClass55_1 != null) {
					Static90.aClass55_1.method3217();
				}
				if (Static239.aClass55_2 != null) {
					Static239.aClass55_2.method3217();
				}
				local117 = Static34.aClass109_2.method3142();
				if (Static90.aClass55_1 != null) {
					Static90.aClass55_1.method3217();
				}
				if (Static239.aClass55_2 != null) {
					Static239.aClass55_2.method3217();
				}
				if (local117 != 21) {
					Static243.anInt5242 = local117;
					Static117.anInt3043 = 0;
					Static34.aClass109_2.method3141();
					Static34.aClass109_2 = null;
					return;
				}
				Static117.anInt3043 = 3;
			}
			if (Static117.anInt3043 == 3) {
				if (Static34.aClass109_2.method3143() < 1) {
					return;
				}
				Static59.aStringArray9 = new String[Static34.aClass109_2.method3142()];
				Static117.anInt3043 = 4;
			}
			if (Static117.anInt3043 == 4 && Static34.aClass109_2.method3143() >= Static59.aStringArray9.length * 8) {
				Static58.aClass1_Sub13_Sub1_1.anInt2395 = 0;
				Static34.aClass109_2.method3146(Static59.aStringArray9.length * 8, Static58.aClass1_Sub13_Sub1_1.aByteArray29, 0);
				for (local117 = 0; local117 < Static59.aStringArray9.length; local117++) {
					Static59.aStringArray9[local117] = Static251.method4070(Static58.aClass1_Sub13_Sub1_1.method1810());
				}
				Static243.anInt5242 = 21;
				Static117.anInt3043 = 0;
				Static34.aClass109_2.method3141();
				Static34.aClass109_2 = null;
			}
		} catch (@Pc(221) IOException local221) {
			if (Static34.aClass109_2 != null) {
				Static34.aClass109_2.method3141();
				Static34.aClass109_2 = null;
			}
			if (Static170.anInt3979 < 1) {
				Static52.anInt1463 = 0;
				if (Static8.anInt151 == Static45.anInt1360) {
					Static45.anInt1360 = Static79.anInt2161;
				} else {
					Static45.anInt1360 = Static8.anInt151;
				}
				Static117.anInt3043 = 1;
				Static170.anInt3979++;
			} else {
				Static117.anInt3043 = 0;
				Static243.anInt5242 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBIIIZIIII)V")
	public static void method4150(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(4) int local4 = arg2 - arg1;
		@Pc(27) int local27 = arg0 - arg5;
		@Pc(36) int local36 = (arg7 - arg3 << 16) / local4;
		@Pc(45) int local45 = (arg8 - arg6 << 16) / local27;
		Static150.method2865(arg2, local45, arg5, arg4, arg3, arg0, arg6, local36, arg1);
	}
}
