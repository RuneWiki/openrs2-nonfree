import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!un", name = "c", descriptor = "I")
	public static int anInt6740;

	@OriginalMember(owner = "client!un", name = "d", descriptor = "[[Lclient!mk;")
	public static Class159[][] aClass159ArrayArray1;

	@OriginalMember(owner = "client!un", name = "f", descriptor = "Lclient!dk;")
	public static Class54 aClass54_110;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "I")
	public static int anInt6738 = 0;

	@OriginalMember(owner = "client!un", name = "e", descriptor = "I")
	public static int anInt6741 = 0;

	@OriginalMember(owner = "client!un", name = "h", descriptor = "[I")
	public static final int[] anIntArray562 = new int[1];

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
	public static void method5208() {
		Static330.anInt5583 = 0;
		@Pc(12) int local12 = Static275.anInt4506 + (Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833 >> 7);
		@Pc(19) int local19 = (Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835 >> 7) + Static209.anInt3497;
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static330.anInt5583 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static330.anInt5583 = 1;
		}
		if (Static330.anInt5583 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static330.anInt5583 = 0;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!at;B)V")
	public static void method5210(@OriginalArg(0) Class16 arg0) {
		if (!Static215.aBoolean217) {
			return;
		}
		if (arg0.anObjectArray23 != null) {
			@Pc(26) Class16 local26 = Static4.method73(Static368.anInt6200, Static368.anInt6201);
			if (local26 != null) {
				@Pc(32) Class2_Sub44 local32 = new Class2_Sub44();
				local32.aClass16_21 = local26;
				local32.anObjectArray36 = arg0.anObjectArray23;
				local32.aClass16_20 = arg0;
				Static191.method2562(local32);
			}
		}
		Static29.method451(Static423.aClass102_208);
		Static456.aClass2_Sub13_Sub2_2.method3569(arg0.anInt293);
		Static456.aClass2_Sub13_Sub2_2.method3568(arg0.anInt301);
		Static456.aClass2_Sub13_Sub2_2.method3542(Static279.anInt6428);
		Static456.aClass2_Sub13_Sub2_2.method3542(Static368.anInt6201);
		Static456.aClass2_Sub13_Sub2_2.method3568(arg0.anInt320);
		Static456.aClass2_Sub13_Sub2_2.method3584(Static368.anInt6200);
	}
}
