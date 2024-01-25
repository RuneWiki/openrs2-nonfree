import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "Lclient!kha;")
	public static Class181 aClass181_101;

	@OriginalMember(owner = "client!rr", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString98;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method7251(@OriginalArg(0) String arg0) {
		Static97.method2492("", "", 4, "", 0, arg0);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIII)V")
	public static void method7253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 * Static552.aClass3_Sub48_30.aClass23_Sub8_1.method3378() >> 8;
		if (local12 == 0 || arg0 == -1) {
			return;
		}
		if (!Static48.aBoolean89 && Static148.anInt3680 != -1 && Static161.method3405() && !Static209.method4116()) {
			Static408.aClass3_Sub7_Sub5_3 = Static454.method6844();
			@Pc(45) Class3_Sub7_Sub5 local45 = Static644.method8652(Static408.aClass3_Sub7_Sub5_3);
			Static460.method6909(local45);
		}
		Static195.method6190(Static474.aClass181_98, local12, arg0);
		Static314.method5350(-1, 255);
		Static48.aBoolean89 = true;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "()V")
	public static void method7256() {
		for (@Pc(1) int local1 = 0; local1 < Static443.aClass249Array1.length; local1++) {
			Static443.aClass249Array1[local1].method6426();
		}
		Static443.aClass249Array1 = null;
	}
}
