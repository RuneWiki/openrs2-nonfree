import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "Lclient!tj;")
	public static Class193 aClass193_22;

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "Lclient!t;")
	public static Class189 aClass189_1;

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
	public static int anInt1928 = 0;

	@OriginalMember(owner = "client!ej", name = "l", descriptor = "[I")
	public static final int[] anIntArray111 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
	public static void method1745() {
		if (!Static344.aBoolean219) {
			return;
		}
		@Pc(16) Class21 local16 = Static156.method4515(Static255.anInt5164, Static82.anInt2376);
		if (local16 != null && local16.anObjectArray29 != null) {
			@Pc(25) Class4_Sub34 local25 = new Class4_Sub34();
			local25.aClass21_12 = local16;
			local25.anObjectArray34 = local16.anObjectArray29;
			Static164.method3189(local25);
		}
		Static209.anInt4333 = -1;
		Static273.anInt5438 = -1;
		Static344.aBoolean219 = false;
		Static349.method5536(local16);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
	public static void method1746() {
		for (@Pc(3) int local3 = -1; local3 < Static289.anInt5643; local3++) {
			@Pc(11) int local11;
			if (local3 == -1) {
				local11 = 2047;
			} else {
				local11 = Static333.anIntArray494[local3];
			}
			@Pc(21) Class8_Sub1_Sub2_Sub1 local21 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local11];
			if (local21 != null) {
				Static325.method5274(local21.method4349(), local21);
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)V")
	public static void method1747(@OriginalArg(0) int arg0) {
		if (!Static335.aBoolean468) {
			arg0 = -1;
		}
		if (arg0 == Static284.anInt5597) {
			return;
		}
		if (arg0 != -1) {
			@Pc(28) Class24 local28 = Static318.method5245(arg0);
			@Pc(32) Class110 local32 = local28.method567();
			if (local32 == null) {
				arg0 = -1;
			} else {
				Static1.aClass134_7.method3758(new Point(local28.anInt814, local28.anInt811), local32.method3087(), Static300.aCanvas5, local32.method3096(), local32.method3093());
				Static284.anInt5597 = arg0;
			}
		}
		if (arg0 == -1 && Static284.anInt5597 != -1) {
			Static1.aClass134_7.method3758(new Point(), -1, Static300.aCanvas5, null, -1);
			Static284.anInt5597 = -1;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILclient!qr;IILclient!vq;III)V")
	public static void method1749(@OriginalArg(1) Class170 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class47 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) Interface7 local5 = null;
		if (arg2 == 0) {
			local5 = (Interface7) Static354.method5631(arg5, arg4, arg6);
		}
		if (arg2 == 1) {
			local5 = (Interface7) Static43.method852(arg5, arg4, arg6);
		}
		if (arg2 == 2) {
			local5 = (Interface7) Static347.method5528(arg5, arg4, arg6, mb.class);
		}
		if (arg2 == 3) {
			local5 = (Interface7) Static172.method3324(arg5, arg4, arg6);
		}
		if (local5 == null) {
			return;
		}
		@Pc(61) int local61 = local5.method5589();
		@Pc(65) int local65 = local5.method5590();
		@Pc(73) Class18 local73 = Static113.method2380(local5.method5594());
		if (local73.method409()) {
			Static204.method3849(arg5, local73, arg4, arg6);
		}
		if (local5.method5592()) {
			local5.method5593(arg3);
		}
		if (arg2 != 0) {
			if (arg2 == 1) {
				Static132.method2837(arg5, arg4, arg6);
				return;
			}
			if (arg2 == 2) {
				Static28.method5497(arg5, arg4, arg6, mb.class);
				if (local73.anInt526 == 0 || local73.anInt532 + arg4 >= Static350.anInt6637 || local73.anInt532 + arg6 >= Static105.anInt2647 || Static350.anInt6637 <= arg4 + local73.anInt529 || arg6 + local73.anInt529 >= Static105.anInt2647) {
					return;
				}
				arg0.method4589(arg4, local65, local73.anInt529, arg6, local73.aBoolean38, !local73.aBoolean46, local73.anInt532);
			} else if (arg2 == 3) {
				Static249.method4398(arg5, arg4, arg6);
				if (local73.anInt526 == 1) {
					arg0.method4601(arg6, arg4);
					return;
				}
			}
			return;
		}
		Static64.method1351(arg5, arg4, arg6);
		if (local73.anInt526 != 0) {
			arg0.method4598(local73.aBoolean38, arg6, local65, arg4, local61, !local73.aBoolean46);
			return;
		}
	}
}
