import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray82;

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_83 = new Class119(4);

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "Z")
	public static boolean aBoolean237 = false;

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "Lclient!wq;")
	public static final Class216 aClass216_26 = new Class216();

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
	public static void method2618() {
		if (Static268.anInt5456 == 2) {
			Static339.anInt6736 = 96;
			return;
		}
		try {
			@Pc(17) Method local17 = Runtime.class.getMethod("maxMemory");
			if (local17 != null) {
				try {
					@Pc(21) Runtime local21 = Runtime.getRuntime();
					@Pc(27) Long local27 = (Long) local17.invoke(local21, (Object[]) null);
					Static339.anInt6736 = (int) (local27 / 1048576L) + 1;
				} catch (@Pc(37) Throwable local37) {
				}
			}
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZB)V")
	public static void method2619(@OriginalArg(0) boolean arg0) {
		Static166.method3083();
		if (Static263.anInt5396 != 30 && Static263.anInt5396 != 25) {
			return;
		}
		Static114.anInt6589++;
		if (Static114.anInt6589 < 50 && !arg0) {
			return;
		}
		Static114.anInt6589 = 0;
		if (!Static210.aBoolean362 && Static157.aClass173_1 != null) {
			Static74.aClass2_Sub10_Sub1_2.method2049(243);
			try {
				Static157.aClass173_1.method5021(Static74.aClass2_Sub10_Sub1_2.anInt4807, Static74.aClass2_Sub10_Sub1_2.aByteArray57);
				Static74.aClass2_Sub10_Sub1_2.anInt4807 = 0;
			} catch (@Pc(51) IOException local51) {
				Static210.aBoolean362 = true;
			}
		}
		Static166.method3083();
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IBLjava/lang/String;)I")
	public static int method2621(@OriginalArg(2) String arg0) {
		return Static162.method3044(16, arg0);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)V")
	public static void method2622(@OriginalArg(0) int arg0) {
		Static47.anInt1032 = arg0;
		@Pc(7) Class119 local7 = Static218.aClass119_129;
		synchronized (Static218.aClass119_129) {
			Static218.aClass119_129.method3304();
		}
	}
}
