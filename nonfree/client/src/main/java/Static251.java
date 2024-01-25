import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!ih", name = "C", descriptor = "D")
	public static double aDouble11;

	@OriginalMember(owner = "client!ih", name = "x", descriptor = "I")
	public static final int anInt1928 = 50;

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "[I")
	public static final int[] anIntArray125 = new int[anInt1928];

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "[I")
	public static final int[] anIntArray126 = new int[anInt1928];

	@OriginalMember(owner = "client!ih", name = "t", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[anInt1928];

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "[I")
	public static final int[] anIntArray127 = new int[anInt1928];

	@OriginalMember(owner = "client!ih", name = "w", descriptor = "[I")
	public static final int[] anIntArray128 = new int[anInt1928];

	@OriginalMember(owner = "client!ih", name = "A", descriptor = "[I")
	public static final int[] anIntArray129 = new int[anInt1928];

	@OriginalMember(owner = "client!ih", name = "B", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_45 = new Class151(44, 17);

	@OriginalMember(owner = "client!ih", name = "D", descriptor = "[I")
	public static final int[] anIntArray130 = new int[anInt1928];

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IC)Z")
	public static boolean method1890(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
	public static void method1891() {
		Static532.method7158(Static124.aClass4_Sub20_4.aClass8_Sub26_1.method7943());
		@Pc(21) int local21 = (Static445.anInt6949 >> 3) + (Static611.anInt9382 >> 12);
		@Pc(29) int local29 = (Static321.anInt5000 >> 3) + (Static652.anInt10283 >> 12);
		Static296.anInt4684 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141 = 0;
		Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.method3534(8, 8);
		Static80.anIntArrayArray8 = new int[18][4];
		Static142.anIntArray366 = new int[18];
		Static311.anIntArray368 = new int[18];
		Static572.anIntArray632 = new int[18];
		Static352.aByteArrayArray21 = new byte[18][];
		Static8.aByteArrayArray1 = new byte[18][];
		Static211.anIntArray729 = new int[18];
		Static472.anIntArray505 = new int[18];
		Static315.aByteArrayArray16 = new byte[18][];
		Static661.aByteArrayArray28 = new byte[18][];
		Static146.anIntArray195 = new int[18];
		Static275.aByteArrayArray12 = new byte[18][];
		@Pc(80) int local80 = 0;
		@Pc(100) int local100;
		for (@Pc(89) int local89 = (local21 - (Static224.anInt3557 >> 4)) / 8; local89 <= (local21 + (Static224.anInt3557 >> 4)) / 8; local89++) {
			for (local100 = (local29 - (Static267.anInt4309 >> 4)) / 8; local100 <= (local29 + (Static267.anInt4309 >> 4)) / 8; local100++) {
				@Pc(108) int local108 = (local89 << 8) + local100;
				Static472.anIntArray505[local80] = local108;
				Static311.anIntArray368[local80] = Static151.aClass34_38.method1252("m" + local89 + "_" + local100);
				Static211.anIntArray729[local80] = Static151.aClass34_38.method1252("l" + local89 + "_" + local100);
				Static146.anIntArray195[local80] = Static151.aClass34_38.method1252("n" + local89 + "_" + local100);
				Static572.anIntArray632[local80] = Static151.aClass34_38.method1252("um" + local89 + "_" + local100);
				Static142.anIntArray366[local80] = Static151.aClass34_38.method1252("ul" + local89 + "_" + local100);
				if (Static146.anIntArray195[local80] == -1) {
					Static311.anIntArray368[local80] = -1;
					Static211.anIntArray729[local80] = -1;
					Static572.anIntArray632[local80] = -1;
					Static142.anIntArray366[local80] = -1;
				}
				local80++;
			}
		}
		for (local100 = local80; local100 < Static146.anIntArray195.length; local100++) {
			Static146.anIntArray195[local100] = -1;
			Static311.anIntArray368[local100] = -1;
			Static211.anIntArray729[local100] = -1;
			Static572.anIntArray632[local100] = -1;
			Static142.anIntArray366[local100] = -1;
		}
		@Pc(282) byte local282;
		if (Static656.anInt10356 == 3) {
			local282 = 4;
		} else {
			local282 = 8;
		}
		Static561.method7434(local282, false, local21, local29);
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)Z")
	public static boolean method1892() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static515.aHashtable6.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static515.aHashtable6.get(local17));
		}
		try {
			@Pc(37) Class local37 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(40) Class local40 = Class.forName("java.lang.ClassLoader");
			@Pc(44) Field local44 = local40.getDeclaredField("nativeLibraries");
			@Pc(54) Method local54 = local37.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local54.invoke(local44, Boolean.TRUE);
			try {
				local12 = Static515.aHashtable6.keys();
				while (local12.hasMoreElements()) {
					@Pc(73) String local73 = (String) local12.nextElement();
					try {
						@Pc(78) File local78 = (File) Static502.aHashtable5.get(local73);
						@Pc(83) Class local83 = (Class) Static515.aHashtable6.get(local73);
						@Pc(89) Vector local89 = (Vector) local44.get(local83.getClassLoader());
						for (@Pc(91) int local91 = 0; local91 < local89.size(); local91++) {
							try {
								@Pc(97) Object local97 = local89.elementAt(local91);
								@Pc(102) Field local102 = local97.getClass().getDeclaredField("name");
								local54.invoke(local102, Boolean.TRUE);
								try {
									@Pc(117) String local117 = (String) local102.get(local97);
									if (local117 != null && local117.equalsIgnoreCase(local78.getCanonicalPath())) {
										@Pc(129) Field local129 = local97.getClass().getDeclaredField("handle");
										@Pc(136) Method local136 = local97.getClass().getDeclaredMethod("finalize");
										local54.invoke(local129, Boolean.TRUE);
										local54.invoke(local136, Boolean.TRUE);
										try {
											local136.invoke(local97);
											local129.set(local97, Integer.valueOf(0));
											local9.remove(local73);
										} catch (@Pc(175) Throwable local175) {
										}
										local54.invoke(local136, Boolean.FALSE);
										local54.invoke(local129, Boolean.FALSE);
									}
								} catch (@Pc(197) Throwable local197) {
								}
								local54.invoke(local102, Boolean.FALSE);
							} catch (@Pc(209) Throwable local209) {
							}
						}
					} catch (@Pc(217) Throwable local217) {
					}
				}
			} catch (@Pc(223) Throwable local223) {
			}
			local54.invoke(local44, Boolean.FALSE);
		} catch (@Pc(235) Throwable local235) {
		}
		Static515.aHashtable6 = local9;
		return Static515.aHashtable6.isEmpty();
	}
}
