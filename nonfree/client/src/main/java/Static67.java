import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!dr", name = "q", descriptor = "Lclient!iq;")
	public static Class104 aClass104_109;

	@OriginalMember(owner = "client!dr", name = "r", descriptor = "Lclient!tm;")
	public static Class193 aClass193_5;

	@OriginalMember(owner = "client!dr", name = "s", descriptor = "Lclient!wl;")
	public static Class221 aClass221_143;

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "Z")
	public static boolean aBoolean359 = false;

	@OriginalMember(owner = "client!dr", name = "l", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_127 = new Class157(2, 7);

	@OriginalMember(owner = "client!dr", name = "t", descriptor = "[[I")
	public static final int[][] anIntArrayArray38 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IB[Lclient!fh;)V")
	public static void method3654(@OriginalArg(0) int arg0, @OriginalArg(2) Class68[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class68 local9 = arg1[local3];
			if (local9 != null && local9.anInt1830 == arg0 && !Static46.method877(local9)) {
				if (local9.anInt1871 == 0) {
					method3654(local9.anInt1857, arg1);
					if (local9.aClass68Array1 != null) {
						method3654(local9.anInt1857, local9.aClass68Array1);
					}
					@Pc(46) Class2_Sub40 local46 = (Class2_Sub40) Static303.aClass41_32.method902((long) local9.anInt1857);
					if (local46 != null) {
						Static94.method1859(local46.anInt6092);
					}
				}
				if (local9.anInt1871 == 6 && local9.anInt1880 != -1) {
					@Pc(66) Class84 local66 = Static91.method1822(local9.anInt1880);
					if (local66 != null) {
						local9.anInt1838 += Static170.anInt5086;
						while (local9.anInt1838 > local66.anIntArray198[local9.anInt1899]) {
							local9.anInt1838 -= local66.anIntArray198[local9.anInt1899];
							local9.anInt1899++;
							if (local9.anInt1899 >= local66.anIntArray197.length) {
								local9.anInt1899 -= local66.anInt2452;
								if (local9.anInt1899 < 0 || local9.anInt1899 >= local66.anIntArray197.length) {
									local9.anInt1899 = 0;
								}
							}
							local9.anInt1906 = local9.anInt1899 + 1;
							if (local9.anInt1906 >= local66.anIntArray197.length) {
								local9.anInt1906 -= local66.anInt2452;
								if (local9.anInt1906 < 0 || local66.anIntArray197.length <= local9.anInt1906) {
									local9.anInt1906 = -1;
								}
							}
							Static114.method2241(local9);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(III)V")
	public static void method3658(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub9_Sub4 local13 = Static98.method1971(14, arg1);
		local13.method1801();
		local13.anInt1723 = arg0;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
	public static void method3687() {
		@Pc(13) Class107 local13 = Static300.aClass107_49;
		synchronized (Static300.aClass107_49) {
			Static300.aClass107_49.method3015();
		}
		local13 = Static58.aClass107_7;
		synchronized (Static58.aClass107_7) {
			Static58.aClass107_7.method3015();
		}
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(II)I")
	public static int method3688(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/String;BILjava/lang/String;Ljava/lang/String;)V")
	public static void method3711(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4) {
		Static113.method2231(arg3, arg2, arg1, arg4, -1, null, arg0);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZLjava/awt/Canvas;Lclient!sc;ILclient!ec;I)Lclient!dr;")
	public static synchronized Class37 method3720(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Class179 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface3 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			if (!Static26.aBooleanArray11[local9]) {
				local7 = local9;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(56) Class37 local56;
		if (arg4 == 0) {
			local56 = Static330.method5388(arg3, local7, arg0);
		} else if (arg4 == 1) {
			local56 = Static299.method5042(local7, arg2, arg0, arg1, arg3);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static26.aBooleanArray11[local7] = true;
		return local56;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method3724(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static221.anInt4878 >= 100) {
			Static225.method4191(Static81.aClass140_35.method4155(Static239.anInt2803));
			return;
		}
		@Pc(24) String local24 = Static343.method3354(arg0);
		if (local24 == null) {
			return;
		}
		@Pc(69) String local69;
		for (@Pc(29) int local29 = 0; local29 < Static221.anInt4878; local29++) {
			@Pc(37) String local37 = Static343.method3354(Static363.aStringArray44[local29]);
			if (local37 != null && local37.equals(local24)) {
				Static225.method4191(arg0 + Static263.aClass140_130.method4155(Static239.anInt2803));
				return;
			}
			if (Static213.aStringArray31[local29] != null) {
				local69 = Static343.method3354(Static213.aStringArray31[local29]);
				if (local69 != null && local69.equals(local24)) {
					Static225.method4191(arg0 + Static263.aClass140_130.method4155(Static239.anInt2803));
					return;
				}
			}
		}
		for (@Pc(101) int local101 = 0; local101 < Static209.anInt6939; local101++) {
			local69 = Static343.method3354(Static190.aStringArray42[local101]);
			if (local69 != null && local69.equals(local24)) {
				Static225.method4191(Static68.aClass140_27.method4155(Static239.anInt2803) + arg0 + Static148.aClass140_74.method4155(Static239.anInt2803));
				return;
			}
			if (Static287.aStringArray38[local101] != null) {
				@Pc(146) String local146 = Static343.method3354(Static287.aStringArray38[local101]);
				if (local146 != null && local146.equals(local24)) {
					Static225.method4191(Static68.aClass140_27.method4155(Static239.anInt2803) + arg0 + Static148.aClass140_74.method4155(Static239.anInt2803));
					return;
				}
			}
		}
		if (Static343.method3354(Static177.aClass1_Sub2_Sub3_Sub1_1.aString34).equals(local24)) {
			Static225.method4191(Static116.aClass140_62.method4155(Static239.anInt2803));
		} else {
			Static300.method5057(Static255.aClass157_161);
			Static197.aClass2_Sub12_Sub2_2.method3147(Static217.method4134(arg0) + 1);
			Static197.aClass2_Sub12_Sub2_2.method3156(arg0);
			Static197.aClass2_Sub12_Sub2_2.method3147(arg1 ? 1 : 0);
		}
	}
}
