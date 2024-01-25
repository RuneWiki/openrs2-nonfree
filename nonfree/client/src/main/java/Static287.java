import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "Lclient!fga;")
	public static Class99 aClass99_1;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
	public static int anInt5975;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "Lclient!nga;")
	public static final Class220 aClass220_5 = new Class220();

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_97 = new Class73(53, -1);

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ji;B)V")
	public static void method4978(@OriginalArg(0) Class6_Sub8 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static359.aClass240_3 != null) {
			@Pc(23) int local23;
			try {
				Static359.aClass240_3.method6272(0L);
				Static359.aClass240_3.method6268(local8);
				for (local23 = 0; local23 < 24 && local8[local23] == 0; local23++) {
				}
				if (local23 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(46) Exception local46) {
				for (local23 = 0; local23 < 24; local23++) {
					local8[local23] = -1;
				}
			}
		}
		arg0.method8234(local8, 24, 0);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V")
	public static void method4983(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class6_Sub17 local17 = Static330.method7824(Static19.aClass185_8, Static569.aClass134_2);
		local17.aClass6_Sub8_Sub1_2.method8199(arg0);
		local17.aClass6_Sub8_Sub1_2.method8262(arg1);
		Static452.method6867(local17);
	}
}
