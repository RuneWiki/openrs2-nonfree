import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "Lclient!la;")
	public static Class136 aClass136_17;

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
	public static int anInt820;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
	public static int anInt814 = 0;

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "J")
	public static long aLong31 = 0L;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public static void method876() {
		if (!Static20.method5174()) {
			return;
		}
		if (Static363.aStringArray39 == null) {
			Static255.method3578();
		}
		Static360.aBoolean422 = true;
		Static189.anInt3452 = 0;
		try {
			Static249.aClipboard1 = Static382.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(20) Exception local20) {
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIB)I")
	public static int method878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(20) int local20 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local20;
		}
		return arg0;
	}
}
