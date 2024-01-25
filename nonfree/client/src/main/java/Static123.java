import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "Lclient!sh;")
	public static Class114 aClass114_1;

	@OriginalMember(owner = "client!eda", name = "e", descriptor = "[I")
	public static int[] anIntArray129;

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "Z")
	public static boolean aBoolean200 = false;

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZLclient!ha;)V")
	public static void method2317(@OriginalArg(1) Class75 arg0) {
		for (@Pc(6) Class60_Sub4 local6 = (Class60_Sub4) Static374.aClass385_6.method8778(); local6 != null; local6 = (Class60_Sub4) Static374.aClass385_6.method8773()) {
			if (local6.aBoolean379) {
				local6.method4545(arg0);
			}
		}
	}
}
