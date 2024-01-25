import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "Z")
	public static boolean aBoolean64 = false;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BJ)V")
	public static void method624(@OriginalArg(1) long arg0) {
		@Pc(6) Class4_Sub41 local6 = Static212.method3682();
		local6.aClass4_Sub9_Sub1_3.method5961(-345277664, Static581.aClass118_8.anInt3562);
		local6.aClass4_Sub9_Sub1_3.method6008(arg0);
		local6.aClass4_Sub9_Sub1_3.method5961(-345277664, Static56.anInt953);
		Static551.method7603(local6);
		Static228.anInt4680 = 0;
		Static521.anInt8882 = -3;
		Static166.anInt3598 = 0;
		Static430.anInt7383 = 1;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!bi;Lclient!e;Ljava/awt/Canvas;I)Lclient!oa;")
	public static Class66 method625(@OriginalArg(0) int arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Interface3 arg2, @OriginalArg(3) Canvas arg3) {
		if (!Static103.method399()) {
			throw new RuntimeException("");
		} else if (Static157.method5013("jaggl")) {
			@Pc(26) OpenGL local26 = new OpenGL();
			@Pc(36) long local36 = local26.init(arg3, 8, 8, 8, 24, 0, arg0);
			if (local36 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(57) Class66_Sub1_Sub1 local57 = new Class66_Sub1_Sub1(local26, arg3, local36, arg2, arg1, arg0);
			local57.method6989();
			return local57;
		} else {
			throw new RuntimeException("");
		}
	}
}
