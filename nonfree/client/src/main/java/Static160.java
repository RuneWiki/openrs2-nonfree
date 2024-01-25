import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static160 {

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
	public static int anInt2499;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
	public static final int anInt2497 = 0;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "Z")
	public static boolean aBoolean177 = true;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_29 = new Class154(82, 7);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZBI)V")
	public static void method2138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static226.anInt3318 == 0) {
			Static169.method2209(false);
		} else {
			Static506.anInt8082 = Static226.anInt3318;
			Static368.method6714(0);
		}
		Static567.anInt7430 = arg0;
		Static148.aBoolean166 = arg2;
		Static452.anInt7233 = arg3;
		Static476.method6118(arg1);
	}
}
