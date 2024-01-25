import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!tl", name = "F", descriptor = "[Lclient!s;")
	public static Class35[] aClass35Array3;

	@OriginalMember(owner = "client!tl", name = "J", descriptor = "I")
	public static int anInt9464;

	@OriginalMember(owner = "client!tl", name = "x", descriptor = "Lclient!qj;")
	public static final Class295 aClass295_66 = new Class295(32);

	@OriginalMember(owner = "client!tl", name = "G", descriptor = "Lclient!qw;")
	public static final Class302 aClass302_69 = new Class302();

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
	public static void method7717() {
		if (Static566.aClass92_6.aBoolean170) {
			Static525.anInt8303 = 96;
			return;
		}
		try {
			@Pc(27) Method local27 = Runtime.class.getMethod("maxMemory");
			if (local27 != null) {
				try {
					@Pc(31) Runtime local31 = Runtime.getRuntime();
					@Pc(37) Long local37 = (Long) local27.invoke(local31, (Object[]) null);
					Static525.anInt8303 = (int) (local37 / 1048576L) + 1;
				} catch (@Pc(47) Throwable local47) {
				}
			}
		} catch (@Pc(49) Exception local49) {
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V")
	public static void method7718(@OriginalArg(1) int arg0) {
		Static180.anInt3304 = arg0;
		Static375.aClass295_50.method6464();
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
	public static void method7723() {
		Static548.aClient1.method1357();
		Static516.method6719();
		Static78.aClass171_15 = null;
		Static103.aClass171_19 = null;
		Static226.anInt3963 = 0;
		Static268.aClass171_64 = null;
		Static493.anInt7808 = 0;
		Static459.aClass3_Sub4_Sub1_1.anInt9739 = 0;
		Static238.method5015();
		Static603.aClass24Array1 = null;
		Static465.aClass342_3 = null;
		Static390.anInt6507 = 0;
		Static345.anInt5912 = 0;
		Static234.aClass342_1 = null;
		Static20.aString7 = null;
		Static63.anInt1316 = 0;
	}
}
