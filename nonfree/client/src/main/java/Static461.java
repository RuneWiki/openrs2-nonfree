import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
	public static int anInt7972 = -1;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
	public static void method7017() {
		@Pc(10) Class6_Sub50 local10;
		for (local10 = (Class6_Sub50) Static666.aClass340_75.method8124(); local10 != null; local10 = (Class6_Sub50) Static666.aClass340_75.method8134()) {
			if (local10.aBoolean702) {
				local10.method9051();
			} else {
				local10.aBoolean701 = true;
				if (local10.anInt9410 >= 0 && local10.anInt9409 >= 0 && Static29.anInt380 > local10.anInt9410 && local10.anInt9409 < Static327.anInt5650) {
					Static505.method7367(local10);
				}
			}
		}
		for (local10 = (Class6_Sub50) Static39.aClass340_2.method8124(); local10 != null; local10 = (Class6_Sub50) Static39.aClass340_2.method8134()) {
			if (local10.aBoolean702) {
				local10.method9051();
			} else {
				local10.aBoolean701 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIZIII)J")
	public static long method7018(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2) {
		Static390.aCalendar2.clear();
		Static390.aCalendar2.set(arg0, arg1, arg2, 12, 0, 0);
		return Static390.aCalendar2.getTime().getTime();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!jc;I)Lclient!bia;")
	public static Class39 method7019(@OriginalArg(0) Class6_Sub15 arg0) {
		@Pc(14) Class39 local14 = new Class39();
		local14.anInt552 = arg0.method3018();
		local14.aClass6_Sub2_Sub20_1 = Static35.aClass276_1.method6929(local14.anInt552);
		return local14;
	}
}
