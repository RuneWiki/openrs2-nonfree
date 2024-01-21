import java.io.IOException;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!eh", name = "R", descriptor = "I")
	public static int anInt1116;

	@OriginalMember(owner = "client!eh", name = "gb", descriptor = "[S")
	public static short[] aShortArray13;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_345 = Static181.method2795(")1p");

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
	public static int anInt1093 = 0;

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_346 = Static181.method2795("Take");

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_347 = Static181.method2795("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!eh", name = "p", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_348 = Static181.method2795(" ");

	@OriginalMember(owner = "client!eh", name = "w", descriptor = "Lclient!qe;")
	public static Class83 aClass83_349 = aClass83_346;

	@OriginalMember(owner = "client!eh", name = "S", descriptor = "I")
	public static volatile int anInt1117 = -1;

	@OriginalMember(owner = "client!eh", name = "bb", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!eh", name = "fb", descriptor = "I")
	public static int anInt1125 = 10;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)V")
	public static void method855(@OriginalArg(0) boolean arg0) {
		if (Static74.aClass25_4 == null) {
			return;
		}
		try {
			@Pc(11) Class2_Sub3 local11 = new Class2_Sub3(4);
			local11.method247(arg0 ? 2 : 3);
			local11.method231(0);
			Static74.aClass25_4.method800(local11.aByteArray2, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				Static74.aClass25_4.method796();
			} catch (@Pc(43) Exception local43) {
			}
			Static74.aClass25_4 = null;
			Static167.anInt3455++;
		}
	}
}
