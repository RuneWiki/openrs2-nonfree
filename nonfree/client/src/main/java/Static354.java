import java.math.BigInteger;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!lba", name = "g", descriptor = "I")
	public static int anInt5659;

	@OriginalMember(owner = "client!lba", name = "o", descriptor = "Z")
	public static boolean aBoolean482;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger13 = new BigInteger("a24b92615afebaf288daf7daec7bf8dd829307bfa116ab863bfea9195d1580051e3dc355cb34a3a6e06aadf4ffab75fd121f02b4eb380d12d30014a6f6d3e8b3", 16);

	@OriginalMember(owner = "client!lba", name = "n", descriptor = "Lclient!lba;")
	public static final Class218 aClass218_25 = new Class218(16);

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method5090(@OriginalArg(1) long arg0) {
		Static151.aCalendar5.setTime(new Date(arg0));
		@Pc(13) int local13 = Static151.aCalendar5.get(7);
		@Pc(17) int local17 = Static151.aCalendar5.get(5);
		@Pc(21) int local21 = Static151.aCalendar5.get(2);
		@Pc(25) int local25 = Static151.aCalendar5.get(1);
		@Pc(29) int local29 = Static151.aCalendar5.get(11);
		@Pc(40) int local40 = Static151.aCalendar5.get(12);
		@Pc(44) int local44 = Static151.aCalendar5.get(13);
		return Static11.aStringArray1[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static420.aStringArray26[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local40 / 10 + local40 % 10 + ":" + local44 / 10 + local44 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Z)V")
	public static void method5098() {
		Static371.anInt5924 = -1;
		Static392.anInt6487 = -1;
		Static238.anInt3745 = 0;
	}
}
