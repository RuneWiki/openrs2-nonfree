import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!wf", name = "Eb", descriptor = "[Lclient!cq;")
	public static Class8[] aClass8Array15;

	@OriginalMember(owner = "client!wf", name = "Hb", descriptor = "Lclient!lm;")
	public static Class134 aClass134_146;

	@OriginalMember(owner = "client!wf", name = "Qb", descriptor = "Lclient!lm;")
	public static Class134 aClass134_147;

	@OriginalMember(owner = "client!wf", name = "yb", descriptor = "Ljava/lang/String;")
	public static final String aString270 = "flash3:";

	@OriginalMember(owner = "client!wf", name = "Kb", descriptor = "I")
	public static int anInt6649 = 0;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!wm;B)V")
	public static void method5753(@OriginalArg(0) Class10_Sub1_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt4054 == Static282.anInt3516 || arg0.anInt4026 == -1 || arg0.anInt4062 != 0) {
			local5 = true;
		} else {
			@Pc(33) Class177 local33 = Static354.method5863(arg0.anInt4026);
			if (local33.aBoolean450 || local33.anIntArray528[arg0.lb] < arg0.anInt4027 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(57) int local57 = arg0.anInt4054 - arg0.anInt4073;
			@Pc(62) int local62 = Static282.anInt3516 - arg0.anInt4073;
			@Pc(74) int local74 = arg0.anInt4040 * 128 + arg0.method3402() * 64;
			@Pc(86) int local86 = arg0.anInt4022 * 128 + arg0.method3402() * 64;
			@Pc(97) int local97 = arg0.anInt4057 * 128 + arg0.method3402() * 64;
			@Pc(109) int local109 = arg0.anInt4008 * 128 + arg0.method3402() * 64;
			arg0.anInt6726 = (local62 * local109 + local86 * (local57 - local62)) / local57;
			arg0.anInt6728 = (local62 * local97 + (local57 - local62) * local74) / local57;
		}
		arg0.anInt4081 = 0;
		if (arg0.anInt4031 == 0) {
			arg0.method3415(8192);
		}
		if (arg0.anInt4031 == 1) {
			arg0.method3415(12288);
		}
		if (arg0.anInt4031 == 2) {
			arg0.method3415(0);
		}
		if (arg0.anInt4031 == 3) {
			arg0.method3415(4096);
		}
	}

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "(B)V")
	public static void method5754() {
		Static340.method5639(Static157.aClass163_11);
		Static143.anInt2978++;
		if (Static152.aBoolean242 && Static144.aBoolean232) {
			@Pc(32) int local32 = Static208.anInt4358;
			local32 -= Static144.anInt3020;
			@Pc(38) int local38 = Static28.anInt538;
			if (Static10.anInt164 > local32) {
				local32 = Static10.anInt164;
			}
			local38 -= Static171.anInt3616;
			if (Static47.anInt1203 > local38) {
				local38 = Static47.anInt1203;
			}
			if (Static10.anInt164 + Static177.aClass163_12.anInt4991 < Static157.aClass163_11.anInt4991 + local32) {
				local32 = Static177.aClass163_12.anInt4991 + Static10.anInt164 - Static157.aClass163_11.anInt4991;
			}
			if (Static47.anInt1203 + Static177.aClass163_12.anInt4935 < local38 - -Static157.aClass163_11.anInt4935) {
				local38 = Static47.anInt1203 + Static177.aClass163_12.anInt4935 - Static157.aClass163_11.anInt4935;
			}
			@Pc(107) int local107 = local32 - Static332.anInt6454;
			@Pc(112) int local112 = local38 - Static289.anInt5794;
			@Pc(115) int local115 = Static157.aClass163_11.anInt4986;
			if (Static157.aClass163_11.anInt5003 < Static143.anInt2978 && (local115 < local107 || local107 < -local115 || local112 > local115 || -local115 > local112)) {
				Static14.aBoolean20 = true;
			}
			@Pc(151) int local151 = local32 + Static177.aClass163_12.anInt4971 - Static10.anInt164;
			@Pc(159) int local159 = Static177.aClass163_12.anInt4985 + local38 - Static47.anInt1203;
			@Pc(168) Class1_Sub8 local168;
			if (Static157.aClass163_11.anObjectArray6 != null && Static14.aBoolean20) {
				local168 = new Class1_Sub8();
				local168.aClass163_3 = Static157.aClass163_11;
				local168.anInt1157 = local151;
				local168.anObjectArray1 = Static157.aClass163_11.anObjectArray6;
				local168.anInt1147 = local159;
				Static122.method1972(local168);
			}
			if (Static9.anInt116 == 0) {
				if (Static14.aBoolean20) {
					if (Static157.aClass163_11.anObjectArray21 != null) {
						local168 = new Class1_Sub8();
						local168.anInt1157 = local151;
						local168.anInt1147 = local159;
						local168.aClass163_2 = Static269.aClass163_17;
						local168.aClass163_3 = Static157.aClass163_11;
						local168.anObjectArray1 = Static157.aClass163_11.anObjectArray21;
						Static122.method1972(local168);
					}
					if (Static269.aClass163_17 != null && Static40.method845(Static157.aClass163_11) != null) {
						Static246.method4479(Static269.aClass163_17.anInt4923, Static157.aClass163_11.anInt4947, Static269.aClass163_17.anInt4947, Static157.aClass163_11.anInt4923);
					}
				} else if ((Static120.anInt2335 == 1 || Static82.method1316()) && Static61.anInt1413 > 2) {
					Static55.method1101(2);
				} else if (Static325.method2372()) {
					Static55.method1101(1);
				}
				Static157.aClass163_11 = null;
			}
		} else if (Static143.anInt2978 > 1) {
			Static157.aClass163_11 = null;
		}
	}

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "(I)V")
	public static void method5760() {
		@Pc(5) byte local5 = 0;
		if (Static50.aBoolean83) {
			local5 = 55;
		}
		Static313.method5367(local5);
		Static169.method2991(local5);
		Static323.method5833(local5);
		Static212.method3946(local5);
		Static163.method2864(local5);
		Static213.method3954(local5);
		Static46.method933(local5);
		Static11.method5111(local5);
		Static79.method5813(local5);
		if (Static261.anInt5376 == 10) {
			Static16.method298(28);
		} else if (Static261.anInt5376 == 30) {
			Static16.method298(25);
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!ii;BLclient!rc;)I")
	public static int method5761(@OriginalArg(0) Class105 arg0, @OriginalArg(2) Class175 arg1) {
		if (arg1.anInt5273 != -1) {
			return arg1.anInt5273;
		}
		if (arg1.anInt5275 != -1) {
			@Pc(23) Class116 local23 = Static71.anInterface2_1.method951(arg0.method4259() ? arg1.anInt5275 : arg1.anInt5265);
			if (!local23.aBoolean217) {
				return local23.aShort56;
			}
		}
		return arg1.anInt5263;
	}

	@OriginalMember(owner = "client!wf", name = "y", descriptor = "(I)V")
	public static void method5762() {
		if (Static290.aBoolean485 && Static112.aBooleanArray11[81] && Static61.anInt1413 > 2) {
			Static50.method1011((Class1_Sub12) Static58.aClass14_4.aClass1_17.aClass1_248.aClass1_248);
		} else {
			Static50.method1011((Class1_Sub12) Static58.aClass14_4.aClass1_17.aClass1_248);
		}
	}

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "(B)V")
	public static void method5765() {
		Static245.aClass37_20.method919();
	}

	@OriginalMember(owner = "client!wf", name = "z", descriptor = "(I)V")
	public static void method5768() {
		if (Static173.aBoolean280) {
			return;
		}
		Static158.method2802(Static321.aClass83ArrayArrayArray2);
		if (Static298.aClass83ArrayArrayArray1 != null) {
			Static158.method2802(Static298.aClass83ArrayArrayArray1);
		}
		Static173.aBoolean280 = true;
	}
}
