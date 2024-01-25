import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!j", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray45;

	@OriginalMember(owner = "client!j", name = "n", descriptor = "F")
	public static float aFloat259;

	@OriginalMember(owner = "client!j", name = "j", descriptor = "I")
	public static int anInt9588 = 0;

	@OriginalMember(owner = "client!j", name = "l", descriptor = "I")
	public static int anInt9590 = 0;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	public static void method7693() {
		Static15.aClass162_1.method6819(Static159.aFloat58, Static57.aFloat26, Static87.aFloat260);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BIIII)V")
	public static void method7694(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static130.anInt2131 && arg2 <= Static89.anInt1576) {
			@Pc(19) int local19 = Static290.method4092(Static48.anInt898, arg3, Static275.anInt4756);
			@Pc(25) int local25 = Static290.method4092(Static48.anInt898, arg1, Static275.anInt4756);
			Static101.method1526(arg2, local25, arg0, local19);
		}
	}
}
