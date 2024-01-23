import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!rn", name = "p", descriptor = "I")
	public static int anInt4787;

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "[J")
	public static long[] aLongArray18 = new long[500];

	@OriginalMember(owner = "client!rn", name = "k", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
	public static int anInt4786 = 0;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)I")
	public static int method3890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 - 1 & arg1 >> 31;
		return ((arg1 >>> 31) + arg1) % arg0 + local7;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method3892(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BJ)V")
	public static void method3895(@OriginalArg(1) long arg0) {
		Static95.aClass2_Sub26_Sub1_1.anInt5328 = 0;
		Static95.aClass2_Sub26_Sub1_1.method4239(21);
		Static95.aClass2_Sub26_Sub1_1.method4225(arg0);
		Static134.anInt2735 = 0;
		Static217.anInt4539 = 0;
		Static184.anInt3908 = -3;
		Static260.anInt5416 = 1;
	}
}
