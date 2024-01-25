import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
	public static int anInt7026;

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
	public static int anInt7029;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "Lclient!ab;")
	public static final Class3_Sub1 aClass3_Sub1_1 = new Class3_Sub1(0, 0);

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)Z")
	public static boolean method5896(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZIJ)Ljava/lang/String;")
	public static String method5898(@OriginalArg(0) int arg0, @OriginalArg(3) long arg1) {
		Static207.method3080(arg1);
		@Pc(17) Calendar local17 = Static321.aCalendar11;
		@Pc(21) int local21 = local17.get(5);
		@Pc(27) int local27 = local17.get(2) + 1;
		@Pc(31) int local31 = local17.get(1);
		@Pc(35) int local35 = local17.get(11);
		@Pc(46) int local46 = local17.get(12);
		return Integer.toString(local21 / 10) + local21 % 10 + "/" + local27 / 10 + local27 % 10 + "/" + local31 % 100 / 10 + local31 % 10 + " " + local35 / 10 + local35 % 10 + ":" + local46 / 10 + local46 % 10;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Lclient!fw;")
	public static Class123 method5899() {
		try {
			return (Class123) Class.forName("mo").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return new Class123_Sub1();
		}
	}
}
