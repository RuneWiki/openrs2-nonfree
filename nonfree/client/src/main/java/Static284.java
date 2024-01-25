import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!np", name = "z", descriptor = "Lclient!mn;")
	public static Class171 aClass171_67;

	@OriginalMember(owner = "client!np", name = "p", descriptor = "I")
	public static int anInt5115 = 0;

	@OriginalMember(owner = "client!np", name = "u", descriptor = "Lclient!dh;")
	public static Class52 aClass52_1 = new Class52(8);

	@OriginalMember(owner = "client!np", name = "w", descriptor = "Lclient!lm;")
	public static final Class163 aClass163_12 = new Class163(1, 17);

	@OriginalMember(owner = "client!np", name = "x", descriptor = "I")
	public static int anInt5121 = 0;

	@OriginalMember(owner = "client!np", name = "y", descriptor = "[I")
	public static final int[] anIntArray426 = new int[14];

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)V")
	public static void method4032() {
		Static170.aClass188_31.method4154();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IZI)V")
	public static void method4034(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 0) {
			Static257.aClass75_8 = Static465.method6008(Static396.anInterface7_6, Static291.aCanvas6, Static434.aClass165_Sub1_1.anInt4201 * 2, arg0, Static138.aClass194_2);
		} else {
			if (arg1) {
				Static257.aClass75_8 = Static465.method6008(Static396.anInterface7_6, Static291.aCanvas6, 0, 0, Static138.aClass194_2);
				Static257.aClass75_8.t(0);
				@Pc(48) Class15 local48 = Static457.method6198(Static336.aClass171_71, Static87.anInt1488);
				@Pc(57) Class14 local57 = Static257.aClass75_8.method5977(local48, Static470.method4237(Static446.aClass171_101, Static87.anInt1488));
				Static1.method26(true, Static420.aClass231_118.method5261(Static80.anInt6195), local57);
				Static257.aClass75_8.method5983();
				Static298.method4275();
				Static257.aClass75_8.method5989();
			}
			try {
				Static257.aClass75_8 = Static465.method6008(Static396.anInterface7_6, Static291.aCanvas6, Static434.aClass165_Sub1_1.anInt4201 * 2, arg0, Static138.aClass194_2);
				if (Static257.aClass75_8.method5969()) {
					@Pc(90) boolean local90 = true;
					try {
						local90 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(100) Throwable local100) {
					}
					@Pc(106) Class2_Sub7 local106;
					if (local90) {
						local106 = Static257.aClass75_8.method5955(146800640);
					} else {
						local106 = Static257.aClass75_8.method5955(104857600);
					}
					Static257.aClass75_8.method6013(local106);
				}
			} catch (@Pc(117) Throwable local117) {
				Static257.aClass75_8 = Static465.method6008(Static396.anInterface7_6, Static291.aCanvas6, 0, 0, Static138.aClass194_2);
				arg0 = 0;
			}
		}
		Static404.anInt2752 = arg0;
		Static227.method3106();
		if (!Static257.aClass75_8.method6003()) {
			Static7.anInt112 = 1;
		}
		Static257.aClass75_8.method5984(Static7.anInt112);
		Static257.aClass75_8.method5954(0);
		Static257.aClass75_8.ya(8);
		Static186.aClass6_2 = Static257.aClass75_8.method6014();
		Static190.aClass6_3 = Static257.aClass75_8.method6014();
		Static251.method3486();
		Static257.aClass75_8.method5949(!Static434.aClass165_Sub1_1.aBoolean294);
		if (Static257.aClass75_8.method5999()) {
			Static172.method2532(Static434.aClass165_Sub1_1.aBoolean296);
		}
		Static381.method5253(Static371.anInt6492 >> 3, Static234.anInt3949 >> 3, Static257.aClass75_8);
		Static366.method5130();
		Static214.aBoolean244 = false;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)I")
	public static int method4035(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(24) int local24 = (local13 & 0x33333333) + ((local13 & 0xCCCCCCCE) >>> 2);
		@Pc(37) int local37 = local24 + (local24 >>> 4) & 0xF0F0F0F;
		@Pc(43) int local43 = local37 + (local37 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}
}
