import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
	public static int anInt5827;

	@OriginalMember(owner = "client!ta", name = "O", descriptor = "Z")
	public static boolean aBoolean485 = false;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IJLclient!ii;)V")
	public static void method5074(@OriginalArg(1) long arg0, @OriginalArg(2) Class105 arg1) {
		Static230.anInt4803 = Static189.anInt6108;
		Static214.anInt4557 = 0;
		Static189.anInt6108 = 0;
		@Pc(14) long local14 = Static292.method5114();
		for (@Pc(21) Class7_Sub7 local21 = (Class7_Sub7) Static116.aClass122_2.method2626(); local21 != null; local21 = (Class7_Sub7) Static116.aClass122_2.method2630()) {
			if (local21.method2825(arg1, arg0)) {
				Static214.anInt4557++;
			}
		}
		if (Static308.aBoolean498 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static116.aClass122_2.method2622() + ", running: " + Static214.anInt4557 + ". Particles: " + Static189.anInt6108 + ". Time taken: " + (Static292.method5114() - local14) + "ms");
		}
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)Lclient!ni;")
	public static Class1_Sub29 method5075() {
		if (Static150.aClass14_10 == null || Static276.aClass137_1 == null) {
			return null;
		}
		Static276.aClass137_1.method3160(Static150.aClass14_10);
		@Pc(23) Class1_Sub29 local23 = (Class1_Sub29) Static276.aClass137_1.method3157();
		if (local23 == null) {
			return null;
		} else {
			@Pc(32) Class74 local32 = Static298.method5215(local23.anInt4242);
			return local32 != null && local32.aBoolean121 && local32.method1448() ? local23 : Static87.method1399();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ds;Lclient!ds;I)V")
	public static void method5076(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(1) Class1_Sub2 arg1) {
		if (arg0.aClass1_Sub2_61 != null) {
			arg0.method5784();
		}
		arg0.aClass1_Sub2_62 = arg1.aClass1_Sub2_62;
		arg0.aClass1_Sub2_61 = arg1;
		arg0.aClass1_Sub2_61.aClass1_Sub2_62 = arg0;
		arg0.aClass1_Sub2_62.aClass1_Sub2_61 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method5077(@OriginalArg(0) long arg0) {
		Static6.aCalendar12.setTime(new Date(arg0));
		@Pc(13) int local13 = Static6.aCalendar12.get(7);
		@Pc(22) int local22 = Static6.aCalendar12.get(5);
		@Pc(26) int local26 = Static6.aCalendar12.get(2);
		@Pc(30) int local30 = Static6.aCalendar12.get(1);
		@Pc(34) int local34 = Static6.aCalendar12.get(11);
		@Pc(38) int local38 = Static6.aCalendar12.get(12);
		@Pc(42) int local42 = Static6.aCalendar12.get(13);
		return Static91.aStringArray13[local13 - 1] + ", " + local22 / 10 + local22 % 10 + "-" + Static96.aStringArray16[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}
}
