import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "[Z")
	public static boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "Lclient!wm;")
	public static Class390 aClass390_42;

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_57 = new Class359(87, -2);

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)I")
	public static int method2993(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(24) int local24 = local7 | local7 >>> 1;
		@Pc(30) int local30 = local24 | local24 >>> 2;
		@Pc(36) int local36 = local30 | local30 >>> 4;
		@Pc(42) int local42 = local36 | local36 >>> 8;
		@Pc(48) int local48 = local42 | local42 >>> 16;
		return ~local48 & arg0;
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(II)V")
	public static void method2994(@OriginalArg(0) int arg0) {
		if (Static172.aClass5_Sub50_14.aClass12_Sub23_1.method6624() == 0) {
			arg0 = -1;
		}
		if (arg0 == Static455.anInt7736) {
			return;
		}
		if (arg0 != -1) {
			@Pc(29) Class55 local29 = Static317.aClass176_2.method4509(arg0);
			@Pc(33) Class369 local33 = local29.method918();
			if (local33 == null) {
				arg0 = -1;
			} else {
				Static570.aClass268_5.method6330(Static141.aCanvas7, local33.method8542(), local33.method8539(), local33.method8537(), new Point(local29.anInt996, local29.anInt997));
				Static455.anInt7736 = arg0;
			}
		}
		if (arg0 == -1 && Static455.anInt7736 != -1) {
			Static570.aClass268_5.method6330(Static141.aCanvas7, (int[]) null, -1, -1, new Point());
			Static455.anInt7736 = -1;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIIIII)V")
	public static void method2996(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 - arg5 >= Static106.anInt2266 && arg5 + arg1 <= Static669.anInt10712 && arg0 - arg5 >= Static639.anInt10384 && arg5 + arg0 <= Static496.anInt8305) {
			Static578.method7997(arg0, arg4, arg3, arg5, arg1, arg2);
		} else {
			Static299.method4778(arg5, arg2, arg0, arg4, arg1, arg3);
		}
	}
}
