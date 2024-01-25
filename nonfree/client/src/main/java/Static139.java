import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
	public static int anInt2291 = 0;

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "F")
	public static float aFloat47 = 1.0F;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(JII)Ljava/lang/String;")
	public static String method2063(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Static625.method8337(arg0);
		@Pc(10) int local10 = Static594.aCalendar3.get(5);
		@Pc(23) int local23 = Static594.aCalendar3.get(2) + 1;
		@Pc(27) int local27 = Static594.aCalendar3.get(1);
		return Integer.toString(local10 / 10) + local10 % 10 + "/" + local23 / 10 + local23 % 10 + "/" + local27 % 100 / 10 + local27 % 10;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!vm;I)V")
	public static void method2064(@OriginalArg(1) Class378 arg0, @OriginalArg(2) int arg1) {
		if (Static515.aBoolean257) {
			arg1 = 0;
			Static515.aBoolean257 = false;
		}
		if (Static26.aClass378_1 != null && Static26.aClass378_1.method8435(arg0)) {
			return;
		}
		Static26.aClass378_1 = arg0;
		Static536.aLong269 = Static124.method1947();
		Static279.anInt4365 = arg1;
		Static598.anInt9720 = arg1;
		if (Static598.anInt9720 == 0) {
			Static273.method3808();
			return;
		}
		Static176.aClass11_1 = Static189.aClass11_2;
		Static123.anInt2147 = Static668.anInt10415;
		Static244.anInt3949 = Static325.anInt5948;
		Static211.aFloat53 = Static248.aFloat58;
		Static292.aFloat61 = Static84.aFloat31;
		Static181.aFloat51 = Static80.aFloat30;
		Static266.aFloat60 = Static560.aFloat170;
		Static177.anInt2911 = Static240.anInt3902;
		Static434.aFloat146 = Static522.aFloat163;
		Static145.aFloat48 = Static550.aFloat169;
	}
}
