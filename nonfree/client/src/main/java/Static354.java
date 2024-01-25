import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "Lclient!eaa;")
	public static Class2_Sub22 aClass2_Sub22_1;

	@OriginalMember(owner = "client!ls", name = "j", descriptor = "Lclient!br;")
	public static Class40 aClass40_2;

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
	public static int anInt6800 = 0;

	@OriginalMember(owner = "client!ls", name = "k", descriptor = "Lclient!in;")
	public static final Class169 aClass169_169 = new Class169(49, -1);

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZII)Z")
	public static boolean method6090(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIJZ)Ljava/lang/String;")
	public static String method6093(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		Static110.method9641(arg1);
		@Pc(10) Calendar local10 = Static550.aCalendar1;
		@Pc(21) int local21 = local10.get(5);
		@Pc(27) int local27 = local10.get(2) + 1;
		@Pc(31) int local31 = local10.get(1);
		@Pc(35) int local35 = local10.get(11);
		@Pc(44) int local44 = local10.get(12);
		return Integer.toString(local21 / 10) + local21 % 10 + "/" + local27 / 10 + local27 % 10 + "/" + local31 % 100 / 10 + local31 % 10 + " " + local35 / 10 + local35 % 10 + ":" + local44 / 10 + local44 % 10;
	}
}
