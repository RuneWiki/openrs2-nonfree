import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
	public static int anInt6211;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "Lclient!am;")
	public static Class11 aClass11_138;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
	public static void method5197() {
		if (Static14.aBoolean19) {
			return;
		}
		Static195.method3536(Static342.aClass57ArrayArrayArray3);
		if (Static237.aClass57ArrayArrayArray2 != null) {
			Static195.method3536(Static237.aClass57ArrayArrayArray2);
		}
		Static14.aBoolean19 = true;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIBIIII)I")
	public static int method5198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg3 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(19) int local19 = arg4;
			arg4 = arg0;
			arg0 = local19;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg5;
		} else if (local3 == 2) {
			return 8 - arg4 - arg1;
		} else {
			return 7 + 1 - arg5 - arg0;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)Lclient!ml;")
	public static Class4_Sub1_Sub13 method5199(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub1_Sub13 local12 = (Class4_Sub1_Sub13) Static205.aClass15_8.method356((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27 = Static54.aClass11_21.method288(0, arg0);
		if (local27 == null || local27.length <= 1) {
			return null;
		} else {
			local12 = Static116.method860(local27);
			Static205.aClass15_8.method352((long) arg0, local12);
			return local12;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIIIIIZIZ)Z")
	public static boolean method5200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		@Pc(29) int local29 = Static13.method308(arg0, Static15.anIntArray46, arg6, arg7, Static345.aClass174Array1[Static279.anInt5645], arg4, arg8, arg9, arg1, arg3, Static110.aClass2_Sub2_Sub1_Sub1_1.method5425(), arg2, arg5, Static163.anIntArray316);
		if (local29 < 1) {
			return false;
		}
		Static321.anInt6340 = Static163.anIntArray316[local29 - 1];
		Static219.anInt4563 = Static15.anIntArray46[local29 - 1];
		Static165.aBoolean283 = false;
		Static100.method1855();
		return true;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIII)V")
	public static void method5202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static2.anInt5069; local3++) {
			@Pc(9) Rectangle local9 = Class2.aRectangleArray21[local3];
			if (local9.width + local9.x > arg3 && local9.x < arg0 + arg3 && arg2 < local9.height + local9.y && local9.y < arg1 + arg2) {
				Static128.aBooleanArray19[local3] = true;
			}
		}
	}
}
