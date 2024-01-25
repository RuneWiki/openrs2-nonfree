import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static175 {

	@OriginalMember(owner = "client!gn", name = "K", descriptor = "Z")
	public static boolean aBoolean272 = false;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZIZ)V")
	public static void method3038(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Static209.anInt8184 = 3;
		Static490.anInt7979 = arg1;
		Static19.method419(Static338.aClass65_2.anInt2279, Static338.aClass65_2.aString31);
		if (arg0) {
			Static536.method7048(false, "", "");
		} else {
			Static405.method5875();
			Static536.method7048(false, Static113.aString36, Static546.aString119);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)[Lclient!sc;")
	public static Class300[] method3039() {
		return new Class300[] { Static120.aClass300_3, Static196.aClass300_9, Static15.aClass300_2 };
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIILclient!da;Lclient!bm;I)V")
	public static void method3040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class57 arg2, @OriginalArg(4) Class29 arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			arg3.method771(arg2.KA(), arg2.H(), arg0, arg4, arg1, arg2.J(), arg2.OA(), arg2.za(), arg2.l(), arg2.K());
		}
	}
}
