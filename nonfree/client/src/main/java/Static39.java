import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "I")
	public static int anInt536;

	@OriginalMember(owner = "client!bga", name = "e", descriptor = "I")
	public static int anInt538;

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "Lclient!ej;")
	public static final Class89 aClass89_1 = new Class89();

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!fa;B)Lclient!r;")
	public static Class44 method490(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface11 arg1) {
		return new l(arg0, arg1);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IIIIIIII)V")
	public static void method491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg1 < 0 || arg2 < 0 || Static428.anInt8046 - 1 <= arg1 || Static119.anInt2717 - 1 <= arg2) {
			return;
		}
		if (Static60.aClass53ArrayArrayArray1 == null) {
			return;
		}
		@Pc(37) Interface19 local37;
		if (arg5 == 0) {
			local37 = (Interface19) Static353.method5714(arg4, arg1, arg2);
			@Pc(43) Interface19 local43 = (Interface19) Static281.method4859(arg4, arg1, arg2);
			if (local37 != null && arg6 != 2) {
				if (local37 instanceof Class1_Sub4_Sub5_Sub1) {
					((Class1_Sub4_Sub5_Sub1) local37).aClass208_3.method5249(arg3);
				} else {
					Static433.method6765(local37.method7827(), arg5, arg6, arg2, arg3, arg1, arg4, arg0);
				}
			}
			if (local43 != null) {
				if (!(local43 instanceof Class1_Sub4_Sub5_Sub1)) {
					Static433.method6765(local43.method7827(), arg5, arg6, arg2, arg3, arg1, arg4, arg0);
					return;
				}
				((Class1_Sub4_Sub5_Sub1) local43).aClass208_3.method5249(arg3);
				return;
			}
			return;
		}
		if (arg5 != 1) {
			if (arg5 == 2) {
				local37 = (Interface19) Static397.method6277(arg4, arg1, arg2, pn.class);
				if (local37 == null) {
					return;
				}
				if (arg6 == 11) {
					arg6 = 10;
				}
				if (!(local37 instanceof Class1_Sub4_Sub2_Sub4)) {
					Static433.method6765(local37.method7827(), arg5, arg6, arg2, arg3, arg1, arg4, arg0);
					return;
				}
				((Class1_Sub4_Sub2_Sub4) local37).aClass208_4.method5249(arg3);
			} else if (arg5 == 3) {
				local37 = (Interface19) Static460.method7015(arg4, arg1, arg2);
				if (local37 != null) {
					if (!(local37 instanceof Class1_Sub4_Sub4_Sub2)) {
						Static433.method6765(local37.method7827(), arg5, arg6, arg2, arg3, arg1, arg4, arg0);
						return;
					}
					((Class1_Sub4_Sub4_Sub2) local37).aClass208_2.method5249(arg3);
					return;
				}
			}
			return;
		}
		local37 = (Interface19) Static135.method2682(arg4, arg1, arg2);
		if (local37 == null) {
			return;
		}
		if (local37 instanceof Class1_Sub4_Sub1_Sub1) {
			((Class1_Sub4_Sub1_Sub1) local37).aClass208_1.method5249(arg3);
			return;
		}
		@Pc(210) int local210 = local37.method7827();
		if (arg6 != 4 && arg6 != 5) {
			if (arg6 == 6) {
				Static433.method6765(local210, arg5, 4, arg2, arg3, arg1, arg4, arg0 + 4);
			} else if (arg6 == 7) {
				Static433.method6765(local210, arg5, 4, arg2, arg3, arg1, arg4, (arg0 + 2 & 0x3) + 4);
				return;
			} else if (arg6 == 8) {
				Static433.method6765(local210, arg5, 4, arg2, arg3, arg1, arg4, arg0 + 4);
				Static433.method6765(local210, arg5, 4, arg2, arg3, arg1, arg4, (arg0 + 2 & 0x3) + 4);
				return;
			}
			return;
		}
		Static433.method6765(local210, arg5, 4, arg2, arg3, arg1, arg4, arg0);
		return;
	}
}
