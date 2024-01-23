import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!od", name = "d", descriptor = "I")
	public static int anInt4269;

	@OriginalMember(owner = "client!od", name = "g", descriptor = "Lclient!df;")
	public static Class1_Sub3_Sub5 aClass1_Sub3_Sub5_3;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "I")
	public static int anInt4268 = -1;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
	public static void method3120() {
		while (true) {
			if (Static140.aClass1_Sub14_Sub1_2.method2253(Static188.anInt4164) >= 27) {
				@Pc(21) int local21 = Static140.aClass1_Sub14_Sub1_2.method2251(15);
				if (local21 != 32767) {
					@Pc(28) boolean local28 = false;
					if (Static105.aClass2_Sub4_Sub1Array1[local21] == null) {
						Static105.aClass2_Sub4_Sub1Array1[local21] = new Class2_Sub4_Sub1();
						local28 = true;
					}
					@Pc(45) Class2_Sub4_Sub1 local45 = Static105.aClass2_Sub4_Sub1Array1[local21];
					Static100.anIntArray224[Static147.anInt3287++] = local21;
					local45.anInt2824 = Static133.anInt3061;
					if (local45.aClass145_1 != null && local45.aClass145_1.method3714()) {
						Static75.method1317(local45);
					}
					@Pc(75) int local75 = Static37.anIntArray119[Static140.aClass1_Sub14_Sub1_2.method2251(3)];
					if (local28) {
						local45.anInt2823 = local45.anInt2766 = local75;
					}
					local45.method1239(Static197.method3172(Static140.aClass1_Sub14_Sub1_2.method2251(14)));
					@Pc(98) int local98 = Static140.aClass1_Sub14_Sub1_2.method2251(5);
					if (local98 > 15) {
						local98 -= 32;
					}
					@Pc(107) int local107 = Static140.aClass1_Sub14_Sub1_2.method2251(5);
					@Pc(112) int local112 = Static140.aClass1_Sub14_Sub1_2.method2251(1);
					if (local107 > 15) {
						local107 -= 32;
					}
					if (local112 == 1) {
						Static100.anIntArray223[Static242.anInt5012++] = local21;
					}
					@Pc(134) int local134 = Static140.aClass1_Sub14_Sub1_2.method2251(1);
					local45.method2089(local45.aClass145_1.anInt4909);
					local45.anInt2832 = local45.aClass145_1.anInt4933;
					local45.anInt2797 = local45.aClass145_1.anInt4926;
					if (local45.anInt2797 == 0) {
						local45.anInt2766 = 0;
					}
					local45.method2087(local134 == 1, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0] + local107, local45.method2088(), local98 + Static56.aClass2_Sub4_Sub2_1.anIntArray286[0]);
					if (local45.aClass145_1.method3714()) {
						Static124.method2029(0, local45, 0, Static185.anInt4085, local45.anIntArray283[0], null, null, local45.anIntArray286[0]);
					}
					continue;
				}
			}
			Static140.aClass1_Sub14_Sub1_2.method2256();
			return;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)I")
	public static int method3122(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0) {
			return arg1;
		} else {
			@Pc(19) int local19 = 128 - arg2;
			@Pc(37) int local37 = (arg1 >>> 7 & 0x1FE01FE) * local19 + arg2 * (arg0 >>> 7 & 0x1FE01FE) & 0xFF00FF00;
			@Pc(51) int local51 = (arg1 & 0xFF00FF) * local19 + (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00;
			return (local51 >> 7) + local37;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIZLclient!tf;I)Lclient!ml;")
	public static Class1_Sub3_Sub13 method3123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class167 arg4, @OriginalArg(6) int arg5) {
		@Pc(28) int local28 = (arg2 << 19) + (arg3 ? 65536 : 0) + arg0 + (arg5 << 17);
		@Pc(38) long local38 = (long) local28 * 3849834839L + (long) arg1 * 3147483667L;
		@Pc(44) Class1_Sub3_Sub13 local44 = (Class1_Sub3_Sub13) Static22.aClass89_4.method2268(local38);
		if (local44 != null) {
			return local44;
		}
		Static237.aBoolean308 = false;
		local44 = Static256.method3954(arg5, false, arg0, arg3, arg2, false, arg4, arg1);
		if (local44 != null && !Static237.aBoolean308) {
			Static22.aClass89_4.method2272(local38, local44);
		}
		return local44;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)Z")
	public static boolean method3124() {
		if (Static109.aBoolean152) {
			try {
				Static317.method295(Static142.aClass112_2.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(19) Throwable local19) {
			}
		}
		return false;
	}
}
