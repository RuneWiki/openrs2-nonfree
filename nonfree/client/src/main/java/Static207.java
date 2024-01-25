import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!mr", name = "ab", descriptor = "Lclient!gs;")
	public static Class7_Sub1_Sub10 aClass7_Sub1_Sub10_3;

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString269 = "Continue";

	@OriginalMember(owner = "client!mr", name = "y", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!mr", name = "db", descriptor = "I")
	public static int anInt4143 = 0;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!ap;I)Lclient!nl;")
	public static Class7_Sub4 method3670(@OriginalArg(0) Class7_Sub3 arg0) {
		arg0.method2772();
		@Pc(19) int local19 = arg0.method2772();
		@Pc(23) Class7_Sub4 local23 = Static114.method2185(local19);
		local23.anInt6627 = arg0.method2772();
		@Pc(32) int local32 = arg0.method2772();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			@Pc(39) int local39 = arg0.method2772();
			local23.method5636(arg0, local39);
		}
		local23.method5635();
		return local23;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)Lclient!qa;")
	public static Class34 method3673() {
		try {
			return new Class34_Sub1();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class34) Class.forName("Class34_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(14) Throwable local14) {
				return new Class34_Sub3();
			}
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIZ)V")
	public static void method3675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0];
		@Pc(20) int local20 = Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0];
		if (Static345.anInt6530 == 1) {
			if (!Static104.method2059(false, 0, arg1, 0, local15, local20, 1, -2, 1, arg0)) {
				Static104.method2059(false, 0, arg1, 0, local15, local20, 1, -3, 1, arg0);
			}
		} else if (!Static104.method2059(false, 0, arg1, 0, local15, local20, 1, -3, 1, arg0)) {
			Static104.method2059(false, 0, arg1, 0, local15, local20, 1, -2, 1, arg0);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIII)V")
	public static void method3678(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(9) Class14 local9 = Static321.aClass14ArrayArray1[arg0][arg1];
		Static184.method3377(local9 == null ? Static339.aClass14_2 : local9, 5000);
	}
}
