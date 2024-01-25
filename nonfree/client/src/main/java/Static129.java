import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!gh", name = "I", descriptor = "Lclient!dc;")
	public static final Class44 aClass44_13 = new Class44(64);

	@OriginalMember(owner = "client!gh", name = "L", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_140 = new Class123(72, -2);

	@OriginalMember(owner = "client!gh", name = "N", descriptor = "Z")
	public static final boolean aBoolean182 = false;

	@OriginalMember(owner = "client!gh", name = "O", descriptor = "I")
	public static int anInt2771 = -2;

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V")
	public static void method2308() {
		Static315.anIntArray368 = Static120.method2813(0.4F);
	}

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "(I)V")
	public static void method2309() {
		for (@Pc(7) int local7 = 0; local7 < Static136.anInt2887; local7++) {
			@Pc(13) int local13 = Static66.anIntArray102[local7];
			@Pc(17) Class3_Sub2_Sub1_Sub1 local17 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local13];
			if (local17 != null) {
				Static295.method4600(local17, local17.aClass48_1.anInt1752);
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method2310(@OriginalArg(0) long arg0) {
		Static104.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static104.aCalendar1.get(7);
		@Pc(17) int local17 = Static104.aCalendar1.get(5);
		@Pc(21) int local21 = Static104.aCalendar1.get(2);
		@Pc(25) int local25 = Static104.aCalendar1.get(1);
		@Pc(29) int local29 = Static104.aCalendar1.get(11);
		@Pc(33) int local33 = Static104.aCalendar1.get(12);
		@Pc(37) int local37 = Static104.aCalendar1.get(13);
		return Static343.aStringArray34[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static373.aStringArray39[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local37 / 10 + local37 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!so;I)V")
	public static void method2312(@OriginalArg(0) Class3_Sub2_Sub1_Sub2 arg0) {
		@Pc(11) Class6_Sub19 local11 = (Class6_Sub19) Static418.aClass74_32.method1883((long) arg0.anInt6602);
		if (local11 == null) {
			Static160.method2662(arg0.aByte103, 0, null, null, arg0.anIntArray458[0], arg0, arg0.anIntArray459[0]);
		} else {
			local11.method2972();
		}
	}
}
