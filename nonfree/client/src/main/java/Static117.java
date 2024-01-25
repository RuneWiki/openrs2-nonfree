import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static117 {

	@OriginalMember(owner = "client!fh", name = "T", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar4 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!fh", name = "ub", descriptor = "Lclient!d;")
	public static final Class44 aClass44_67 = new Class44(8);

	@OriginalMember(owner = "client!fh", name = "Cb", descriptor = "[I")
	public static final int[] anIntArray478 = new int[32];

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIZILclient!um;)V")
	public static void method5579(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(6) Class243 arg2) {
		Static223.anInt3720 = 1;
		Static216.anInt3609 = arg1;
		Static340.anInt5517 = 2;
		Static178.anInt5791 = arg0;
		Static215.anInt3592 = 0;
		Static151.aBoolean499 = false;
		Static199.aClass243_113 = arg2;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5581(@OriginalArg(1) String arg0) {
		System.exit(1);
	}
}
