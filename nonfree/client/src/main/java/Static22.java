import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!am", name = "c", descriptor = "Lclient!gj;")
	public static Class143 aClass143_6;

	@OriginalMember(owner = "client!am", name = "e", descriptor = "I")
	public static int anInt704;

	@OriginalMember(owner = "client!am", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!am", name = "i", descriptor = "I")
	public static int anInt708 = 0;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!tc;IIII)Z")
	public static boolean method743(@OriginalArg(0) Class23_Sub2_Sub5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static44.aBoolean107 || !Static262.aBoolean400) {
			return false;
		} else if (Static594.anInt9366 < 100) {
			return false;
		} else if (Static213.method3374(arg3, arg1, arg2)) {
			@Pc(26) int local26 = arg1 << Static436.anInt7634;
			@Pc(30) int local30 = arg2 << Static436.anInt7634;
			@Pc(40) int local40 = Static343.aClass104Array2[arg3].method8279(arg2, arg1) - 1;
			@Pc(47) int local47 = local40 + arg0.method8601();
			if (arg0.aShort111 == 1) {
				if (!Static301.method4655(Static10.anInt118 + local30, local26, local30, local30, local26, local40, local47, local47, local26)) {
					return false;
				} else if (Static301.method4655(local30 + Static10.anInt118, local26, local30, local30 + Static10.anInt118, local26, local40, local47, local40, local26)) {
					Static77.anInt1743++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort111 == 2) {
				if (!Static301.method4655(local30 + Static10.anInt118, local26, Static10.anInt118 + local30, local30 + Static10.anInt118, local26, local40, local47, local47, Static10.anInt118 + local26)) {
					return false;
				} else if (Static301.method4655(Static10.anInt118 + local30, local26, local30 + Static10.anInt118, Static10.anInt118 + local30, local26 + Static10.anInt118, local40, local40, local47, Static10.anInt118 + local26)) {
					Static77.anInt1743++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort111 == 4) {
				if (!Static301.method4655(local30 + Static10.anInt118, Static10.anInt118 + local26, local30, local30, local26 + Static10.anInt118, local40, local47, local47, local26 + Static10.anInt118)) {
					return false;
				} else if (Static301.method4655(local30 + Static10.anInt118, local26 + Static10.anInt118, local30, local30 + Static10.anInt118, Static10.anInt118 + local26, local40, local47, local40, Static10.anInt118 + local26)) {
					Static77.anInt1743++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort111 == 8) {
				if (!Static301.method4655(local30, local26, local30, local30, local26, local40, local47, local47, local26 + Static10.anInt118)) {
					return false;
				} else if (Static301.method4655(local30, local26, local30, local30, Static10.anInt118 + local26, local40, local40, local47, local26 + Static10.anInt118)) {
					Static77.anInt1743++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort111 == 16) {
				if (Static57.method6339(Static589.anInt9316, local47, Static589.anInt9316, Static589.anInt9316 + local30, local26, local40)) {
					Static77.anInt1743++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort111 == 32) {
				if (Static57.method6339(Static589.anInt9316, local47, Static589.anInt9316, local30 + Static589.anInt9316, local26 - -Static589.anInt9316, local40)) {
					Static77.anInt1743++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort111 == 64) {
				if (Static57.method6339(Static589.anInt9316, local47, Static589.anInt9316, local30, Static589.anInt9316 + local26, local40)) {
					Static77.anInt1743++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort111 != 128) {
				return true;
			} else if (Static57.method6339(Static589.anInt9316, local47, Static589.anInt9316, local30, local26, local40)) {
				Static77.anInt1743++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(FFFB)F")
	public static float method744(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg2 + arg0 * (arg1 - arg2);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BZZ)V")
	public static void method745(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static134.anInt2493--;
			if (Static134.anInt2493 == 0) {
				Static274.anIntArray337 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static455.anInt7813--;
		if (Static455.anInt7813 == 0) {
			Static422.anIntArray448 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/io/File;IZ)V")
	public static void method746(@OriginalArg(0) File arg0) {
		if (Static197.anObject8 == null) {
			Static525.method7360();
		}
		try {
			@Pc(19) Class local19 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(40) Method local40 = local19.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local40.invoke(Static197.anObject8, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(60) Exception local60) {
			System.out.println("HeapDump error:");
			local60.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
	public static void method747() {
		Static67.aClass3_Sub17_Sub2_4.method4906();
		@Pc(17) int local17 = Static67.aClass3_Sub17_Sub2_4.method4905(8);
		@Pc(26) int local26;
		if (Static308.anInt5687 > local17) {
			for (local26 = local17; local26 < Static308.anInt5687; local26++) {
				Static238.anIntArray290[Static9.anInt110++] = Static390.anIntArray424[local26];
			}
		}
		if (Static308.anInt5687 < local17) {
			throw new RuntimeException("gnpov1");
		}
		Static308.anInt5687 = 0;
		for (local26 = 0; local26 < local17; local26++) {
			@Pc(64) int local64 = Static390.anIntArray424[local26];
			@Pc(72) Class23_Sub2_Sub1_Sub2_Sub2 local72 = ((Class3_Sub11) Static500.aClass62_40.method1682((long) local64)).aClass23_Sub2_Sub1_Sub2_Sub2_1;
			@Pc(77) int local77 = Static67.aClass3_Sub17_Sub2_4.method4905(1);
			if (local77 == 0) {
				Static390.anIntArray424[Static308.anInt5687++] = local64;
				local72.anInt10155 = Static76.anInt1726;
			} else {
				@Pc(100) int local100 = Static67.aClass3_Sub17_Sub2_4.method4905(2);
				if (local100 == 0) {
					Static390.anIntArray424[Static308.anInt5687++] = local64;
					local72.anInt10155 = Static76.anInt1726;
					Static256.anIntArray321[Static344.anInt6196++] = local64;
				} else {
					@Pc(144) int local144;
					@Pc(154) int local154;
					if (local100 == 1) {
						Static390.anIntArray424[Static308.anInt5687++] = local64;
						local72.anInt10155 = Static76.anInt1726;
						local144 = Static67.aClass3_Sub17_Sub2_4.method4905(3);
						local72.method8633(1, local144);
						local154 = Static67.aClass3_Sub17_Sub2_4.method4905(1);
						if (local154 == 1) {
							Static256.anIntArray321[Static344.anInt6196++] = local64;
						}
					} else if (local100 == 2) {
						Static390.anIntArray424[Static308.anInt5687++] = local64;
						local72.anInt10155 = Static76.anInt1726;
						if (Static67.aClass3_Sub17_Sub2_4.method4905(1) == 1) {
							local144 = Static67.aClass3_Sub17_Sub2_4.method4905(3);
							local72.method8633(2, local144);
							local154 = Static67.aClass3_Sub17_Sub2_4.method4905(3);
							local72.method8633(2, local154);
						} else {
							local144 = Static67.aClass3_Sub17_Sub2_4.method4905(3);
							local72.method8633(0, local144);
						}
						local144 = Static67.aClass3_Sub17_Sub2_4.method4905(1);
						if (local144 == 1) {
							Static256.anIntArray321[Static344.anInt6196++] = local64;
						}
					} else if (local100 == 3) {
						Static238.anIntArray290[Static9.anInt110++] = local64;
					}
				}
			}
		}
	}
}
