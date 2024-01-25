import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!laa", name = "E", descriptor = "Lclient!qia;")
	public static Class291 aClass291_1;

	@OriginalMember(owner = "client!laa", name = "I", descriptor = "I")
	public static int anInt5267;

	@OriginalMember(owner = "client!laa", name = "N", descriptor = "Lclient!eha;")
	public static Class91 aClass91_6;

	@OriginalMember(owner = "client!laa", name = "P", descriptor = "I")
	public static int anInt5273 = -1;

	@OriginalMember(owner = "client!laa", name = "Q", descriptor = "Z")
	public static boolean aBoolean387 = true;

	@OriginalMember(owner = "client!laa", name = "d", descriptor = "(II)V")
	public static void method4722(@OriginalArg(1) int arg0) {
		@Pc(17) Class5_Sub5_Sub21 local17 = Static101.method1629(1, arg0);
		local17.method8961();
	}

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "(B)V")
	public static void method4723() {
		for (@Pc(10) Class5_Sub21 local10 = (Class5_Sub21) Static115.aClass273_5.method6577(); local10 != null; local10 = (Class5_Sub21) Static115.aClass273_5.method6589()) {
			if (local10.aBoolean186) {
				local10.aBoolean186 = false;
			} else {
				Static563.method8170(local10.anInt2436);
			}
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IZIII)V")
	public static void method4724(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static633.method8959(arg1)) {
			Static421.method6388(arg0, -1, Static519.aClass295ArrayArray2[arg1], arg3, arg2);
		}
	}
}
