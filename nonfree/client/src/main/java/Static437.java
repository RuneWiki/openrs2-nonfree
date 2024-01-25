import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
	public static int anInt8362 = 0;

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString173 = "";

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "Z")
	public static boolean aBoolean597 = false;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
	public static void method6477() {
		if (Static372.aClass366_5.aBoolean720) {
			Static503.anInt9410 = 96;
			return;
		}
		try {
			@Pc(37) Method local37 = Runtime.class.getMethod("maxMemory");
			if (local37 != null) {
				try {
					@Pc(41) Runtime local41 = Runtime.getRuntime();
					@Pc(47) Long local47 = (Long) local37.invoke(local41, (Object[]) null);
					Static503.anInt9410 = (int) (local47 / 1048576L) + 1;
				} catch (@Pc(57) Throwable local57) {
				}
			}
		} catch (@Pc(59) Exception local59) {
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IJIIZBLjava/lang/String;ILjava/lang/String;ZI)V")
	public static void method6478(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		if (!Static117.aBoolean207 && Static384.anInt7556 < 500) {
			@Pc(16) int local16 = arg9 == -1 ? Static117.anInt2703 : arg9;
			@Pc(30) Class4_Sub36 local30 = new Class4_Sub36(arg5, arg7, local16, arg6, arg2, arg1, arg0, arg3, arg4, arg8);
			Static593.aClass22_65.method894(local30);
			Static384.anInt7556++;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method6479(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < Static270.anInt5671; local18++) {
			if (arg0.equalsIgnoreCase(Static94.aStringArray7[local18])) {
				return local18;
			}
		}
		return -1;
	}
}
