import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray9;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
	public static int anInt5415 = 0;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar3 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
	public static int anInt5417 = 0;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZII[Lclient!wv;I)V")
	public static void method4619(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class365[] arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg3.length; local3++) {
			@Pc(9) Class365 local9 = arg3[local3];
			if (local9 != null && arg1 == local9.anInt9590) {
				Static202.method3447(local9, arg4, arg0, arg2);
				Static309.method4756(arg2, arg4, local9);
				if (local9.anInt9571 > local9.anInt9594 - local9.anInt9578) {
					local9.anInt9571 = local9.anInt9594 - local9.anInt9578;
				}
				if (local9.anInt9599 - local9.anInt9638 < local9.anInt9617) {
					local9.anInt9617 = local9.anInt9599 - local9.anInt9638;
				}
				if (local9.anInt9571 < 0) {
					local9.anInt9571 = 0;
				}
				if (local9.anInt9617 < 0) {
					local9.anInt9617 = 0;
				}
				if (local9.anInt9595 == 0) {
					Static26.method716(local9, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method4622() {
		if (Static253.aClass218_6 != Static489.aClass218_10) {
			try {
				Static602.method5582(Static550.aClient1, "tbrefresh");
			} catch (@Pc(22) Throwable local22) {
			}
		}
	}
}
