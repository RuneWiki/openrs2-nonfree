import java.awt.Canvas;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "Z")
	public static boolean aBoolean40;

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
	public static int anInt802;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!hu;IIILjava/awt/Canvas;Lclient!m;)Lclient!qa;")
	public static Class30 method630(@OriginalArg(0) Class114 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) Interface10 arg4) {
		return new Class30_Sub1(arg1, arg3, arg4, arg2, arg0);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lclient!an;")
	public static Class12 method631(@OriginalArg(0) Component arg0) {
		return new Class12_Sub1(arg0, true);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
	public static void method634() {
		Static321.method4406(25);
		Static17.method402();
		System.gc();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)V")
	public static void method636(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class31 local17 = Static446.aClass31ArrayArray1[arg1][arg2];
		Static121.method1868(local17 == null ? Static74.aClass31_1 : local17, arg0);
	}
}
