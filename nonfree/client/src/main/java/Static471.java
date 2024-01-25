import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "[I")
	public static final int[] anIntArray523 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!qp", name = "r", descriptor = "[I")
	public static final int[] anIntArray524 = new int[3];

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(BLjava/lang/String;ZLjava/lang/String;)V")
	public static void method7101(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		Static446.aString85 = arg2;
		Static336.aString67 = arg0;
		Static269.aBoolean326 = arg1;
		if (!Static269.aBoolean326 && (Static336.aString67.equals("") || Static446.aString85.equals(""))) {
			Static329.method5383(3);
			return;
		}
		Static137.aBoolean215 = false;
		if (Static435.anInt7845 != 1) {
			Static36.anInt1187 = -1;
			Static416.anInt7573 = 0;
		}
		Static329.method5383(-3);
		Static251.anInt4607 = 1;
		Static51.anInt1427 = 0;
		Static547.anInt1286 = 0;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(B)V")
	public static void method7103() {
		if (Static205.aClass138_2.aBoolean278) {
			Static131.anInt2701 = 96;
			return;
		}
		try {
			@Pc(30) Method local30 = Runtime.class.getMethod("maxMemory");
			if (local30 != null) {
				try {
					@Pc(34) Runtime local34 = Runtime.getRuntime();
					@Pc(40) Long local40 = (Long) local30.invoke(local34, (Object[]) null);
					Static131.anInt2701 = (int) (local40 / 1048576L) + 1;
				} catch (@Pc(50) Throwable local50) {
				}
			}
		} catch (@Pc(52) Exception local52) {
		}
	}
}
