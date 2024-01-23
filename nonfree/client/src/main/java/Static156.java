import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "Lclient!mi;")
	public static Class75 aClass75_16 = new Class75();

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
	public static int anInt3207 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
	public static int anInt3211 = 0;

	@OriginalMember(owner = "client!oj", name = "r", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1070 = Static186.method3527("::rebuild");

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Z")
	public static boolean method2575(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)Lclient!ei;")
	public static Class29 method2578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub11 local7 = Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass29_1;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIIIB)V")
	public static void method2583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (Static1.method31(arg4)) {
			Static214.aClass93Array2 = null;
			Static181.method2962(Static54.aClass93ArrayArray1[arg4], arg1, arg2, arg6, arg7, arg0, arg5, -1, arg3);
			if (Static214.aClass93Array2 != null) {
				Static181.method2962(Static214.aClass93Array2, Static32.anInt603, arg2, arg6, Static55.anInt1089, arg0, arg5, -1412584499, arg3);
				Static214.aClass93Array2 = null;
			}
		} else if (arg6 == -1) {
			for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
				Static98.aBooleanArray5[local19] = true;
			}
		} else {
			Static98.aBooleanArray5[arg6] = true;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method2584(@OriginalArg(1) Component arg0) {
		@Pc(5) Method local5 = Static161.aMethod2;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static32.aClass81_1);
		arg0.addFocusListener(Static32.aClass81_1);
	}
}
