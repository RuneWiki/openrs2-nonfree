import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!rr", name = "y", descriptor = "Lclient!bi;")
	public static Class25 aClass25_154;

	@OriginalMember(owner = "client!rr", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString66 = null;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZLclient!gi;Lclient!za;)V")
	public static void method5045(@OriginalArg(1) Class93 arg0, @OriginalArg(2) Class75 arg1) {
		@Pc(36) boolean local36 = Static413.aClass271_2.method6190(arg0.anInt2506 | 0xFF000000, arg1, arg0.anInt2434, arg0.anInt2488, arg0.anInt2432, arg0.aBoolean154 ? Static127.aClass11_Sub5_Sub2_Sub1_2.aClass26_1 : null, arg0.anInt2466) == null;
		if (local36) {
			Static336.aClass181_31.method3973(new Class2_Sub25(arg0.anInt2488, arg0.anInt2466, arg0.anInt2432, arg0.anInt2506 | 0xFF000000, arg0.anInt2434, arg0.aBoolean154));
			Static383.method5263(arg0);
		}
	}
}
