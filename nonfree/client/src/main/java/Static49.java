import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
	public static int anInt962;

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
	public static int anInt965 = -1;

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "F")
	public static float aFloat32 = 0.0F;

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
	public static int anInt970 = 0;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method907(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static133.aClass54_1);
		arg0.removeMouseMotionListener(Static133.aClass54_1);
		arg0.removeFocusListener(Static133.aClass54_1);
		Static51.anInt1019 = 0;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILclient!nk;Lclient!nk;Lclient!nk;Lclient!nk;)V")
	public static void method908(@OriginalArg(1) Class121 arg0, @OriginalArg(2) Class121 arg1, @OriginalArg(3) Class121 arg2, @OriginalArg(4) Class121 arg3) {
		Static36.aClass121_21 = arg2;
		Static41.aClass121_24 = arg1;
		Static218.aClass121_37 = arg3;
		Static263.aClass121_117 = arg0;
		Static274.aClass66ArrayArray1 = new Class66[Static263.aClass121_117.method3137()][];
		Static83.aBooleanArray5 = new boolean[Static263.aClass121_117.method3137()];
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)Lclient!lk;")
	public static Class102 method909(@OriginalArg(0) int arg0) {
		@Pc(10) Class102 local10 = (Class102) Static160.aClass187_85.method4527((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(34) byte[] local34 = Static175.aClass121_83.method3115(Static130.method2233(arg0), Static204.method3263(arg0));
		local10 = new Class102();
		local10.anInt3174 = arg0;
		if (local34 != null) {
			local10.method2781(new Class1_Sub14(local34));
		}
		local10.method2779();
		if (local10.anInt3224 != -1) {
			local10.method2784(method909(local10.anInt3224), method909(local10.anInt3213));
		}
		if (local10.anInt3207 != -1) {
			local10.method2790(method909(local10.anInt3207), method909(local10.anInt3203));
		}
		if (!Static92.aBoolean375 && local10.aBoolean219) {
			local10.anInt3222 = 0;
			local10.aStringArray24 = Static92.aStringArray40;
			local10.aStringArray23 = Static232.aStringArray31;
			local10.aBoolean218 = false;
			local10.aString181 = Static290.aString310;
		}
		Static160.aClass187_85.method4524((long) arg0, local10);
		return local10;
	}
}
