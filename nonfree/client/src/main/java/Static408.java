import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!ur", name = "q", descriptor = "Lclient!ns;")
	public static Class166 aClass166_271;

	@OriginalMember(owner = "client!ur", name = "r", descriptor = "F")
	public static float aFloat204;

	@OriginalMember(owner = "client!ur", name = "s", descriptor = "I")
	public static int anInt6971 = 0;

	@OriginalMember(owner = "client!ur", name = "t", descriptor = "Z")
	public static boolean aBoolean469 = false;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)V")
	public static void method5379(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static416.method5456(arg1, 1);
		local8.method2762();
		local8.anInt3611 = arg0;
	}
}
