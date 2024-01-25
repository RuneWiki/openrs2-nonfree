import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static432 {

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "Lclient!pda;")
	public static Class51 aClass51_9;

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "Lclient!iea;")
	public static Class31 aClass31_24;

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "Lclient!iea;")
	public static Class31 aClass31_25;

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
	public static int anInt7146 = -1;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!rea;II)V")
	public static void method6265(@OriginalArg(0) Class299 arg0, @OriginalArg(1) int arg1) {
		if (Static86.aBoolean183) {
			Static86.aBoolean183 = false;
			arg1 = 0;
		}
		if (Static64.aClass299_1 != null && Static64.aClass299_1.method6913(arg0)) {
			return;
		}
		Static64.aClass299_1 = arg0;
		Static308.aLong140 = Static48.method1203();
		Static176.anInt3533 = arg1;
		Static413.anInt6939 = arg1;
		if (Static413.anInt6939 == 0) {
			Static524.method7274();
			return;
		}
		Static645.aFloat211 = Static346.aFloat112;
		Static32.aFloat8 = Static413.aFloat123;
		Static286.aFloat109 = Static63.aFloat33;
		Static197.aFloat80 = Static364.aFloat117;
		Static272.anInt5077 = Static578.anInt9443;
		Static137.anInt2917 = Static532.anInt8558;
		Static505.aClass49_3 = Static554.aClass49_4;
		Static85.aFloat53 = Static19.aFloat1;
		Static245.anInt4754 = Static185.anInt3702;
		Static31.aFloat7 = Static39.aFloat9;
	}
}
