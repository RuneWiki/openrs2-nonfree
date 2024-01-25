import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ar", name = "r", descriptor = "I")
	public static int anInt296;

	@OriginalMember(owner = "client!ar", name = "E", descriptor = "Lclient!tq;")
	public static Class164 aClass164_1;

	@OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
	public static int anInt306;

	@OriginalMember(owner = "client!ar", name = "o", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_6 = new Class211(6, 8);

	@OriginalMember(owner = "client!ar", name = "F", descriptor = "Lclient!tl;")
	public static final Class227 aClass227_2 = new Class227(4);

	@OriginalMember(owner = "client!ar", name = "G", descriptor = "Z")
	public static boolean aBoolean28 = false;

	@OriginalMember(owner = "client!ar", name = "P", descriptor = "[I")
	public static final int[] anIntArray31 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < 1 || arg0 < 1 || arg3 > Static92.anInt1675 - 2 || arg0 > Static262.anInt6340 - 2) {
			return;
		}
		if (!Static188.aClass135_Sub1_1.method2747(Static25.anInt394) && !Static96.method1396(Static35.anInt678, arg3, arg0, arg4)) {
			return;
		}
		if (Static25.aClass132ArrayArrayArray1 == null) {
			return;
		}
		Static48.aClass115_Sub1_2.method2463(Static66.aClass164_2, arg3, arg4, arg0, arg5, Static257.aClass222Array1[arg4]);
		if (arg1 < 0) {
			return;
		}
		@Pc(65) boolean local65 = Static188.aClass135_Sub1_1.aBoolean326;
		Static188.aClass135_Sub1_1.aBoolean326 = true;
		@Pc(70) int local70 = arg4;
		if (arg4 < 3 && Static180.method2598(arg0, arg3)) {
			local70 = arg4 + 1;
		}
		Static48.aClass115_Sub1_2.method2461(arg2, arg1, Static257.aClass222Array1[arg4], arg6, arg7, local70, Static66.aClass164_2, arg0, arg3, arg4);
		Static188.aClass135_Sub1_1.aBoolean326 = local65;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!sk;I)I")
	public static int method191(@OriginalArg(0) Class25_Sub1_Sub1 arg0) {
		if (arg0.anInt2341 == 0) {
			return 0;
		}
		@Pc(47) int local47;
		@Pc(54) int local54;
		if (arg0.anInt2353 != -1) {
			@Pc(17) Class25_Sub1_Sub1 local17 = null;
			if (arg0.anInt2353 < 32768) {
				local17 = Static171.aClass25_Sub1_Sub1_Sub2Array1[arg0.anInt2353];
			} else if (arg0.anInt2353 >= 32768) {
				local17 = Static225.aClass25_Sub1_Sub1_Sub1Array3[arg0.anInt2353 - 32768];
			}
			if (local17 != null) {
				local47 = arg0.anInt6080 - local17.anInt6080;
				local54 = arg0.anInt6077 - local17.anInt6077;
				if (local47 != 0 || local54 != 0) {
					arg0.method1889((int) (Math.atan2((double) local47, (double) local54) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class25_Sub1_Sub1_Sub1) {
			@Pc(148) Class25_Sub1_Sub1_Sub1 local148 = (Class25_Sub1_Sub1_Sub1) arg0;
			if (local148.anInt579 != -1 && (local148.anInt2381 == 0 || local148.anInt2380 > 0)) {
				local148.method1889(local148.anInt579);
				local148.anInt579 = -1;
			}
		} else if (arg0 instanceof Class25_Sub1_Sub1_Sub2) {
			@Pc(83) Class25_Sub1_Sub1_Sub2 local83 = (Class25_Sub1_Sub1_Sub2) arg0;
			if (local83.anInt2396 != -1 && (local83.anInt2381 == 0 || local83.anInt2380 > 0)) {
				local47 = local83.anInt6080 - (local83.anInt2396 - Static256.anInt4410 - Static256.anInt4410) * 64;
				local54 = local83.anInt6077 - (local83.anInt2391 - Static293.anInt5053 - Static293.anInt5053) * 64;
				if (local47 != 0 || local54 != 0) {
					local83.method1889((int) (Math.atan2((double) local47, (double) local54) * 2607.5945876176133D) & 0x3FFF);
				}
				local83.anInt2396 = -1;
			}
		}
		return arg0.method1878();
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(CILjava/lang/String;)I")
	public static int method193(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			if (arg1.charAt(local17) == arg0) {
				local7++;
			}
		}
		return local7;
	}
}
