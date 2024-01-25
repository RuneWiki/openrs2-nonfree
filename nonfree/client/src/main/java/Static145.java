import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
	public static int anInt3090;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "J")
	public static long aLong109;

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
	public static int anInt3091;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_102 = new Class217(60, 12);

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
	public static final int anInt3088 = 1337;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZIIIIIIIII)V")
	public static void method2865(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 >= Static93.anInt5014 && arg5 <= Static122.anInt1360 && Static93.anInt5014 <= arg1 && Static122.anInt1360 >= arg1 && arg3 >= Static93.anInt5014 && Static122.anInt1360 >= arg3 && Static93.anInt5014 <= arg8 && Static122.anInt1360 >= arg8 && arg6 >= Static131.anInt2843 && arg6 <= Static38.anInt945 && arg7 >= Static131.anInt2843 && Static38.anInt945 >= arg7 && Static131.anInt2843 <= arg4 && Static38.anInt945 >= arg4 && Static131.anInt2843 <= arg2 && arg2 <= Static38.anInt945) {
			Static80.method1711(arg4, arg1, arg5, arg3, arg7, arg6, arg8, arg0, arg2);
		} else {
			Static93.method4579(arg2, arg4, arg8, arg5, arg0, arg7, arg6, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public static void method2866() {
		Static339.aClass1_Sub7_Sub2_4.anInt2219 = 0;
		Static197.aClass217_134 = null;
		Static206.aClass217_177 = null;
		Static293.aClass217_165 = null;
		Static366.anInt7026 = 0;
		Static133.anInt2883 = 0;
		Static16.anInt401 = 0;
		Static180.aClass1_Sub7_Sub2_2.anInt2219 = 0;
		Static341.aClass217_202 = null;
		Static31.method821();
		Static66.method1509();
		for (@Pc(36) int local36 = 0; local36 < 2048; local36++) {
			Static275.aClass11_Sub2_Sub6_Sub1Array1[local36] = null;
		}
		Static191.aClass11_Sub2_Sub6_Sub1_4 = null;
		for (@Pc(52) int local52 = 0; local52 < Static231.aClass11_Sub2_Sub6_Sub2Array1.length; local52++) {
			@Pc(58) Class11_Sub2_Sub6_Sub2 local58 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local52];
			if (local58 != null) {
				local58.anInt6736 = -1;
			}
		}
		Static177.method3441();
		Static50.anInt1273 = 1;
		Static44.method1064(30);
		for (@Pc(77) int local77 = 0; local77 < 100; local77++) {
			Static207.aBooleanArray21[local77] = true;
		}
		Static330.method5563();
		Static285.aClass1_Sub12_2 = null;
		Static153.aLong113 = 0L;
	}
}
