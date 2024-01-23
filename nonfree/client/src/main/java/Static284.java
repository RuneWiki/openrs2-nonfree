import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
	public static int anInt5151;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
	public static int anInt5159;

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "Z")
	public static boolean aBoolean487;

	@OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
	public static int anInt5165;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "Z")
	public static boolean aBoolean486 = false;

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "Lclient!il;")
	public static Class86 aClass86_35 = new Class86(16);

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString200 = "";

	@OriginalMember(owner = "client!ui", name = "v", descriptor = "[I")
	public static int[] anIntArray565 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
	public static void method4289() {
		if (Static249.aFloat101 > Static249.aFloat100) {
			Static249.aFloat100 = (float) ((double) Static249.aFloat100 + (double) Static249.aFloat100 / 30.0D);
			if (Static249.aFloat100 > Static249.aFloat101) {
				Static249.aFloat100 = Static249.aFloat101;
			}
			Static94.method1798();
		} else if (Static249.aFloat100 > Static249.aFloat101) {
			Static249.aFloat100 = (float) ((double) Static249.aFloat100 - (double) Static249.aFloat100 / 30.0D);
			if (Static249.aFloat101 > Static249.aFloat100) {
				Static249.aFloat100 = Static249.aFloat101;
			}
			Static94.method1798();
		}
		if (Static55.anInt1176 != -1 && Static272.anInt5001 != -1) {
			@Pc(63) int local63 = Static55.anInt1176 - Static54.anInt1167;
			if (local63 < 2 || local63 > 2) {
				local63 >>= 0x4;
			}
			@Pc(82) int local82 = Static272.anInt5001 - Static175.anInt3415;
			Static54.anInt1167 += local63;
			if (local82 < 2 || local82 > 2) {
				local82 >>= 0x4;
			}
			Static175.anInt3415 -= -local82;
			if (local63 == 0 && local82 == 0) {
				Static55.anInt1176 = -1;
				Static272.anInt5001 = -1;
			}
			Static94.method1798();
		}
		if (Static145.anInt2809 <= 0) {
			Static48.anInt1079 = -1;
			Static225.anInt4217 = -1;
		} else {
			Static73.anInt1575--;
			if (Static73.anInt1575 == 0) {
				Static73.anInt1575 = 100;
				Static145.anInt2809--;
			}
		}
		if (!Static195.aBoolean339 || Static215.aClass96_18 == null) {
			return;
		}
		for (@Pc(157) Class1_Sub33 local157 = (Class1_Sub33) Static215.aClass96_18.method2340(); local157 != null; local157 = (Class1_Sub33) Static215.aClass96_18.method2342()) {
			@Pc(165) Class136 local165 = Static160.method2739(local157.aClass1_Sub5_Sub1_1.anInt359);
			if (Static226.anInt4234 == 0 && local157.method4567(Static89.anInt1899, Static14.anInt309)) {
				if (!local157.aClass1_Sub5_Sub1_1.aBoolean34) {
					local157.aClass1_Sub5_Sub1_1.aBoolean34 = true;
					Static174.method4652(local165.anInt4073, 15, local157.aClass1_Sub5_Sub1_1.anInt359);
				}
				if (local157.aClass1_Sub5_Sub1_1.aBoolean34) {
					Static174.method4652(local165.anInt4073, 17, local157.aClass1_Sub5_Sub1_1.anInt359);
				}
			} else if (local157.aClass1_Sub5_Sub1_1.aBoolean34) {
				local157.aClass1_Sub5_Sub1_1.aBoolean34 = false;
				Static174.method4652(local165.anInt4073, 16, local157.aClass1_Sub5_Sub1_1.anInt359);
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)V")
	public static void method4291() {
		Static287.anInt5199 = -1;
		Static24.anInt490 = 0;
		Static261.anInt4835 = 0;
		Static124.anInt597 = 0;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)I")
	public static int method4292(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
