import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "F")
	public static float aFloat59;

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "[Lclient!un;")
	public static final Class319[] aClass319Array1 = new Class319[16];

	@OriginalMember(owner = "client!kca", name = "e", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_100 = new Class40(13, 10);

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V")
	public static void method3573() {
		if (Static146.anInt2581 == 7) {
			Static155.method2280(false);
		} else {
			Static291.aClass71_2 = Static225.aClass71_1;
			Static225.aClass71_1 = null;
			Static99.method1593(13);
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public static void method3574(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7) {
		@Pc(9) Class292 local9 = Static242.aClass292Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static242.aClass292Array1[local11] = Static242.aClass292Array1[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class292(arg2, arg6, arg7, arg5, arg4, arg1, arg0, arg3);
		} else {
			local9.method6522(arg4, arg6, arg2, arg5, arg1, arg3, arg0, arg7);
		}
		Static74.anInt1211 = Static48.anInt821;
		Static242.aClass292Array1[0] = local9;
		Static558.anInt9332++;
	}
}
