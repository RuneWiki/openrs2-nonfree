import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!mfa", name = "e", descriptor = "F")
	public static float aFloat84;

	@OriginalMember(owner = "client!mfa", name = "d", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_56 = new Class376(17, 7);

	@OriginalMember(owner = "client!mfa", name = "f", descriptor = "Lclient!qn;")
	public static final Class295 aClass295_2 = new Class295("WIP", 2);

	@OriginalMember(owner = "client!mfa", name = "g", descriptor = "I")
	public static int anInt4070 = 0;

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IB)V")
	public static void method3468(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub6_Sub7 local15 = Static198.method3146((long) arg0, 3);
		local15.method1709();
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(B)V")
	public static void method3470() {
		Static402.aClass3_Sub9_Sub5_2.method6732();
		Static424.aClass3_Sub9_Sub5_3 = null;
		Static548.aClass143_125 = null;
		Static54.anInt1418 = 1;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(JI)V")
	public static void method3472(@OriginalArg(0) long arg0) {
		if ((long) 0 >= arg0) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static569.method7695(arg0 - 1L);
			Static569.method7695(1L);
		} else {
			Static569.method7695(arg0);
		}
	}
}
