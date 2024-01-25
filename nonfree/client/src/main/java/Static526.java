import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!uaa", name = "e", descriptor = "I")
	public static int anInt8654;

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "I")
	public static int anInt8653 = 0;

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "Z")
	public static boolean aBoolean668 = false;

	@OriginalMember(owner = "client!uaa", name = "h", descriptor = "I")
	public static int anInt8657 = -1;

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZIII)Lclient!tba;")
	public static Class2_Sub42 method7220(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class2_Sub42 local5 = null;
		if (arg2 == 0) {
			local5 = Static249.method3910(Static307.aClass286_102, Static400.aClass145_2);
		}
		if (arg2 == 1) {
			local5 = Static249.method3910(Static15.aClass286_7, Static400.aClass145_2);
		}
		local5.aClass2_Sub15_Sub2_2.method4329(Static35.anInt906 + arg0);
		local5.aClass2_Sub15_Sub2_2.method4342(Static529.aClass177_10.method4001(82) ? 1 : 0);
		local5.aClass2_Sub15_Sub2_2.method4330(arg1 + Static130.anInt5246);
		Static413.aBoolean554 = false;
		anInt8657 = arg1;
		Static29.anInt761 = arg0;
		Static203.method3300();
		return local5;
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)V")
	public static void method7223() {
		Static413.aClient1.method1069();
		Static393.method5764();
		Static329.aClass363_162 = null;
		Static94.anInt1996 = 0;
		Static183.anInt3799 = 0;
		Static261.aClass363_230 = null;
		Static359.aClass363_174 = null;
		Static133.aClass2_Sub15_Sub2_1.anInt5241 = 0;
		Static230.method3607();
		Static452.aString72 = null;
		Static138.anInt2888 = 0;
		Static584.anInt9522 = 0;
		Static451.anInt487 = 0;
		Static350.aClass150Array1 = null;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZLclient!efa;)V")
	public static void method7229(@OriginalArg(1) Class92 arg0) {
		Static99.aClass92_1 = arg0;
	}
}
