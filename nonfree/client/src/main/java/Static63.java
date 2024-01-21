import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "Lclient!c;")
	public static Class6_Sub3 aClass6_Sub3_1;

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "Lclient!rc;")
	public static Class55 aClass55_747 = Static34.method846("Freunde");

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
	public static int anInt1887 = 0;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "Lclient!rc;")
	private static Class55 aClass55_749 = Static34.method846("Click to continue");

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Lclient!rc;")
	public static Class55 aClass55_748 = aClass55_749;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
	public static int anInt1889 = 0;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
	public static int anInt1890 = 0;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "Lclient!rc;")
	public static Class55 aClass55_750 = Static34.method846("@cr1@");

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "[I")
	public static int[] anIntArray184 = new int[5];

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "Lclient!rc;")
	public static Class55 aClass55_751 = Static34.method846("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "Lclient!rc;")
	public static Class55 aClass55_752 = Static34.method846("mapedge");

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "[B")
	public static byte[] aByteArray9 = new byte[520];

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "Lclient!rc;")
	public static Class55 aClass55_753 = Static34.method846("Side panel redrawn");

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "Z")
	public static boolean aBoolean89 = false;

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "Lclient!rc;")
	public static Class55 aClass55_754 = Static34.method846("::noclip");

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public static void method1318() {
		if (Static92.anInt2560 != 0 || Static85.anInt2400 != 1) {
			return;
		}
		@Pc(18) int local18 = Static23.anInt1030 - 5 - 4;
		@Pc(24) int local24 = Static68.anInt2013 - 550 - 25;
		if (local24 < 0 || local18 < 0 || local24 >= 146 || local18 >= 151) {
			return;
		}
		local24 -= 73;
		local18 -= 75;
		@Pc(48) int local48 = Static14.anInt811 + Static8.anInt383 & 0x7FF;
		@Pc(52) int local52 = Class6_Sub2_Sub2_Sub3.anIntArray77[local48];
		@Pc(56) int local56 = Class6_Sub2_Sub2_Sub3.anIntArray73[local48];
		@Pc(64) int local64 = (Static27.anInt1352 + 256) * local56 >> 8;
		@Pc(72) int local72 = (Static27.anInt1352 + 256) * local52 >> 8;
		@Pc(82) int local82 = local64 * local24 + local72 * local18 >> 11;
		@Pc(89) int local89 = local82 + Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2710 >> 7;
		@Pc(100) int local100 = local64 * local18 - local24 * local72 >> 11;
		@Pc(108) int local108 = Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2744 - local100 >> 7;
		@Pc(128) boolean local128 = Static75.method1436(local108, 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], true, 0, 0, 0, 1, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 0, local89);
		if (!local128) {
			return;
		}
		Static51.aClass6_Sub1_Sub1_3.method1501(local24);
		Static51.aClass6_Sub1_Sub1_3.method1501(local18);
		Static51.aClass6_Sub1_Sub1_3.method1512(Static14.anInt811);
		Static51.aClass6_Sub1_Sub1_3.method1501(57);
		Static51.aClass6_Sub1_Sub1_3.method1501(Static8.anInt383);
		Static51.aClass6_Sub1_Sub1_3.method1501(Static27.anInt1352);
		Static51.aClass6_Sub1_Sub1_3.method1501(89);
		Static51.aClass6_Sub1_Sub1_3.method1512(Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2710);
		Static51.aClass6_Sub1_Sub1_3.method1512(Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2744);
		Static51.aClass6_Sub1_Sub1_3.method1501(Static79.anInt2290);
		Static51.aClass6_Sub1_Sub1_3.method1501(63);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
	public static void method1319() {
		aClass55_752 = null;
		aClass6_Sub3_1 = null;
		aClass55_754 = null;
		aClass55_749 = null;
		aByteArray9 = null;
		aClass55_751 = null;
		aClass55_750 = null;
		aClass55_747 = null;
		aClass55_753 = null;
		anIntArray184 = null;
		aClass55_748 = null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Lclient!rc;")
	public static Class55 method1320(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static58.method1196(arg0) : Static114.aClass55_1378;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public static void method1321() {
		for (@Pc(6) Class6_Sub9 local6 = (Class6_Sub9) Static89.aClass3_5.method31(); local6 != null; local6 = (Class6_Sub9) Static89.aClass3_5.method26()) {
			if (local6.aClass6_Sub2_Sub15_1 != null) {
				local6.method1335();
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI[Lclient!te;IIIII)Lclient!te;")
	public static Class6_Sub2_Sub14 method1322(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class6_Sub2_Sub14[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == null) {
			return null;
		}
		@Pc(11) Class6_Sub2_Sub14 local11 = null;
		for (@Pc(18) int local18 = 0; local18 < arg1.length; local18++) {
			@Pc(23) Class6_Sub2_Sub14 local23 = arg1[local18];
			if (local23 != null && arg5 == local23.anInt2880) {
				@Pc(36) int local36 = local23.anInt2889 + arg4;
				@Pc(42) int local42 = local23.anInt2918 + arg2;
				if (arg3 >= local36 && arg6 >= local42 && local23.anInt2914 + local36 > arg3 && local23.anInt2875 + local42 > arg6 && !local23.aBoolean139) {
					if (local23.anInt2920 < 0 && arg0 || local23.anInt2920 >= 0 && !arg0) {
						local11 = local23;
					}
					if (local23.anInt2890 == 0) {
						@Pc(121) Class6_Sub2_Sub14 local121 = method1322(arg0, arg1, local23.anInt2918 - local23.anInt2905, arg3, local23.anInt2889 - local23.anInt2879, local23.anInt2920, arg6);
						if (local121 != null) {
							local11 = local121;
						}
						if (arg0 && local23.aClass6_Sub2_Sub14Array1 != null) {
							@Pc(152) Class6_Sub2_Sub14 local152 = method1322(arg0, local23.aClass6_Sub2_Sub14Array1, local23.anInt2918 - local23.anInt2905, arg3, local23.anInt2889 - local23.anInt2879, local23.anInt2920, arg6);
							if (local152 != null) {
								local11 = local152;
							}
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!pe;I)V")
	public static void method1323(@OriginalArg(1) Class6_Sub1_Sub1 arg0) {
		while (true) {
			@Pc(15) Class6_Sub5 local15 = (Class6_Sub5) Static103.aClass3_9.method31();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt929; local22++) {
				if (local15.aClass25Array1[local22] != null) {
					if (local15.aClass25Array1[local22].anInt1212 == 2) {
						local15.anIntArray58[local22] = -5;
					}
					if (local15.aClass25Array1[local22].anInt1212 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass25Array2[local22] != null) {
					if (local15.aClass25Array2[local22].anInt1212 == 2) {
						local15.anIntArray58[local22] = -6;
					}
					if (local15.aClass25Array2[local22].anInt1212 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method1515(224);
			arg0.method1501(0);
			@Pc(104) int local104 = arg0.anInt2209;
			arg0.method1499(local15.anInt927);
			for (@Pc(111) int local111 = 0; local111 < local15.anInt929; local111++) {
				if (local15.anIntArray58[local111] == 0) {
					try {
						@Pc(135) int local135 = local15.anIntArray56[local111];
						@Pc(152) Field local152;
						@Pc(180) int local180;
						if (local135 == 0) {
							local152 = (Field) local15.aClass25Array1[local111].anObject3;
							local180 = local152.getInt(null);
							arg0.method1501(0);
							arg0.method1499(local180);
						} else if (local135 == 1) {
							local152 = (Field) local15.aClass25Array1[local111].anObject3;
							local152.setInt(null, local15.anIntArray55[local111]);
							arg0.method1501(0);
						} else if (local135 == 2) {
							local152 = (Field) local15.aClass25Array1[local111].anObject3;
							local180 = local152.getModifiers();
							arg0.method1501(0);
							arg0.method1499(local180);
						}
						@Pc(224) Method local224;
						if (local135 == 3) {
							local224 = (Method) local15.aClass25Array2[local111].anObject3;
							@Pc(249) byte[][] local249 = local15.aByteArrayArrayArray5[local111];
							@Pc(253) Object[] local253 = new Object[local249.length];
							for (@Pc(255) int local255 = 0; local255 < local249.length; local255++) {
								@Pc(267) ObjectInputStream local267 = new ObjectInputStream(new ByteArrayInputStream(local249[local255]));
								local253[local255] = local267.readObject();
							}
							@Pc(282) Object local282 = local224.invoke(null, local253);
							if (local282 == null) {
								arg0.method1501(0);
							} else if (local282 instanceof Number) {
								arg0.method1501(1);
								arg0.method1463(((Number) local282).longValue());
							} else if (local282 instanceof Class55) {
								arg0.method1501(2);
								arg0.method1493((Class55) local282);
							} else {
								arg0.method1501(4);
							}
						} else if (local135 == 4) {
							local224 = (Method) local15.aClass25Array2[local111].anObject3;
							local180 = local224.getModifiers();
							arg0.method1501(0);
							arg0.method1499(local180);
						}
					} catch (@Pc(327) ClassNotFoundException local327) {
						arg0.method1501(-10);
					} catch (@Pc(333) InvalidClassException local333) {
						arg0.method1501(-11);
					} catch (@Pc(339) StreamCorruptedException local339) {
						arg0.method1501(-12);
					} catch (@Pc(345) OptionalDataException local345) {
						arg0.method1501(-13);
					} catch (@Pc(351) IllegalAccessException local351) {
						arg0.method1501(-14);
					} catch (@Pc(357) IllegalArgumentException local357) {
						arg0.method1501(-15);
					} catch (@Pc(363) InvocationTargetException local363) {
						arg0.method1501(-16);
					} catch (@Pc(369) SecurityException local369) {
						arg0.method1501(-17);
					} catch (@Pc(375) IOException local375) {
						arg0.method1501(-18);
					} catch (@Pc(381) NullPointerException local381) {
						arg0.method1501(-19);
					} catch (@Pc(387) Exception local387) {
						arg0.method1501(-20);
					} catch (@Pc(393) Throwable local393) {
						arg0.method1501(-21);
					}
				} else {
					arg0.method1501(local15.anIntArray58[local111]);
				}
			}
			arg0.method1460(local104);
			arg0.method1506(arg0.anInt2209 - local104);
			local15.method2083();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIII)V")
	public static void method1324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = 2048 - arg2 & 0x7FF;
		@Pc(16) int local16 = 2048 - arg5 & 0x7FF;
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = arg1;
		@Pc(26) int local26 = 0;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(47) int local47;
		if (local5 != 0) {
			local32 = Static42.anIntArray117[local5];
			local36 = Static42.anIntArray124[local5];
			local47 = local36 * 0 - local32 * arg1 >> 16;
			local24 = local32 * 0 + arg1 * local36 >> 16;
			local22 = local47;
		}
		if (local16 != 0) {
			local32 = Static42.anIntArray117[local16];
			local36 = Static42.anIntArray124[local16];
			local47 = local24 * local32 + local36 * 0 >> 16;
			local24 = local36 * local24 - local32 * 0 >> 16;
			local26 = local47;
		}
		Static61.anInt1876 = arg0 - local24;
		Static94.anInt2650 = arg4 - local26;
		Static81.anInt2299 = arg2;
		Static7.anInt291 = arg3 - local22;
		Static3.anInt27 = arg5;
	}
}
