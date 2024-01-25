import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!rq", name = "q", descriptor = "I")
	public static int anInt5510 = -1;

	@OriginalMember(owner = "client!rq", name = "w", descriptor = "Z")
	public static boolean aBoolean345 = false;

	@OriginalMember(owner = "client!rq", name = "z", descriptor = "Lclient!sj;")
	public static Class181 aClass181_45 = null;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(BI)V")
	public static void method4628(@OriginalArg(1) int arg0) {
		Static340.method5565();
		Static16.method393();
		Static67.method1071(arg0, true);
		Static127.method2205(Static212.aClass122_2, Static86.aClass100_86, Static317.aClass100_112);
		Static286.method4927(Static317.aClass100_112, Static212.aClass122_2);
		Static248.method4184(Static153.aClass57Array10);
		Static236.method4020();
		Static203.method3543();
		if (Static266.anInt5370 == 10) {
			Static68.method1088(false);
		} else if (Static266.anInt5370 == 30) {
			Static353.method5714(25);
		} else if (Static266.anInt5370 == 5) {
			Static5.method90(Static212.aClass122_2, Static317.aClass100_112);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method4629(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static308.aClass156_1);
		arg0.removeFocusListener(Static308.aClass156_1);
		Static203.anInt4174 = -1;
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(BI)V")
	public static void method4630(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub7_Sub11 local12 = Static116.method2029(arg0, 6);
		local12.method2502();
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIZI)V")
	public static void method4631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 < arg3) {
			Static162.method1731(arg3, Static196.anIntArrayArray37[arg2], arg0, arg1);
		} else {
			Static162.method1731(arg0, Static196.anIntArrayArray37[arg2], arg3, arg1);
		}
	}
}
