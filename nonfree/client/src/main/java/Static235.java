import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
	public static int anInt4338 = 0;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIB)V")
	public static void method3933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class3_Sub11_Sub4 local14 = Static583.method8201(18, (long) arg0 << 32 | (long) arg2);
		local14.method2195();
		local14.anInt2400 = arg1;
		local14.anInt2394 = arg3;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZIZLjava/lang/String;Lclient!qn;)V")
	public static void method3934(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class291 arg3) {
		Static449.method6563(arg1, arg3, "openjs", arg2, arg0);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)Z")
	public static boolean method3935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(21) Class277 local21 = Static652.aClass267_4.method6682(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local21.method6817(arg1);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIZ)V")
	public static void method3936(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static643.method8930();
		Static94.aLong53 = 0L;
		@Pc(15) int local15 = Static673.method9353();
		if (arg1 == 3 || local15 == 3) {
			arg3 = true;
		}
		if (!Static674.aClass13_22.method8481()) {
			arg3 = true;
		}
		Static660.method9134(local15, arg3, arg0, arg1, arg2);
	}
}
