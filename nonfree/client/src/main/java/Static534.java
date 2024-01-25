import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static534 {

	@OriginalMember(owner = "client!rv", name = "u", descriptor = "Lclient!cc;")
	public static Class49_Sub1 aClass49_Sub1_2;

	@OriginalMember(owner = "client!rv", name = "y", descriptor = "I")
	public static int anInt8358;

	@OriginalMember(owner = "client!rv", name = "A", descriptor = "Lclient!hh;")
	public static Class6 aClass6_34;

	@OriginalMember(owner = "client!rv", name = "o", descriptor = "Lclient!ed;")
	public static final Class93 aClass93_20 = new Class93(4, 1, 1, 1);

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IJ)V")
	public static void method6879(@OriginalArg(1) long arg0) {
		Static387.aCalendar3.setTime(new Date(arg0));
	}
}
