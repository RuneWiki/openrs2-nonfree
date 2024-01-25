import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!gba", name = "M", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_88 = new Class160(134, 9);

	@OriginalMember(owner = "client!gba", name = "s", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!gba", name = "R", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar3 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!gba", name = "Ub", descriptor = "Lclient!fe;")
	public static final Class114 aClass114_1 = new Class114();

	@OriginalMember(owner = "client!gba", name = "Ab", descriptor = "Z")
	public static boolean aBoolean221 = false;

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IBIILclient!tea;)V")
	public static void method2668(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class14_Sub43 arg3) {
		@Pc(16) long local16 = (long) (arg1 | arg0 << 14 | arg2 << 28);
		@Pc(22) Class14_Sub25 local22 = (Class14_Sub25) Static282.aClass125_17.method2630(local16);
		if (local22 == null) {
			local22 = new Class14_Sub25();
			Static282.aClass125_17.method2626(local22, local16);
			local22.aClass32_27.method582(arg3);
			return;
		}
		@Pc(47) Class284 local47 = Static252.aClass56_1.method1052(arg3.anInt9586);
		@Pc(61) int local61 = local47.anInt7760;
		if (local47.lb == 1) {
			local61 *= arg3.anInt9585 + 1;
		}
		for (@Pc(78) Class14_Sub43 local78 = (Class14_Sub43) local22.aClass32_27.method584(); local78 != null; local78 = (Class14_Sub43) local22.aClass32_27.method577()) {
			local47 = Static252.aClass56_1.method1052(local78.anInt9586);
			@Pc(89) int local89 = local47.anInt7760;
			if (local47.lb == 1) {
				local89 *= local78.anInt9585 + 1;
			}
			if (local61 > local89) {
				Static38.method666(arg3, local78);
				return;
			}
		}
		local22.aClass32_27.method582(arg3);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lclient!qga;B)V")
	public static void method2670(@OriginalArg(0) Class299 arg0) {
		if (!Static546.aBoolean727) {
			return;
		}
		if (arg0.anObjectArray29 != null) {
			@Pc(15) Class299 local15 = Static384.method5875(Static613.anInt10111, Static254.anInt4789);
			if (local15 != null) {
				@Pc(21) Class14_Sub10 local21 = new Class14_Sub10();
				local21.aClass299_2 = arg0;
				local21.anObjectArray1 = arg0.anObjectArray29;
				local21.aClass299_1 = local15;
				Static672.method9304(local21);
			}
		}
		@Pc(48) Class14_Sub54 local48 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static297.aClass251_128);
		local48.aClass14_Sub21_Sub2_2.method7751(arg0.anInt8621);
		local48.aClass14_Sub21_Sub2_2.method7751(arg0.anInt8590);
		local48.aClass14_Sub21_Sub2_2.method7711(Static613.anInt10111);
		local48.aClass14_Sub21_Sub2_2.method7702(Static578.anInt9567);
		local48.aClass14_Sub21_Sub2_2.method7702(Static254.anInt4789);
		local48.aClass14_Sub21_Sub2_2.method7711(arg0.anInt8526);
		Static277.aClass347_2.method8308(local48);
	}
}
