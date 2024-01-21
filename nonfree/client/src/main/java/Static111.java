import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "Lclient!kh;")
	public static Class29 aClass29_49;

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "[I")
	public static int[] anIntArray258;

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "Lclient!kh;")
	public static Class29 aClass29_50;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1095 = Static51.method932("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
	public static int anInt2515 = 0;

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1096 = Static51.method932("::noclip");

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
	public static int anInt2519 = 0;

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1097 = Static51.method932("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!nh", name = "o", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1098 = null;

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "[I")
	public static int[] anIntArray259 = new int[32];

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
	public static int anInt2520 = 0;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIBLclient!kh;)Z")
	public static boolean method1762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class29 arg2) {
		@Pc(5) byte[] local5 = arg2.method1030(arg1, arg0);
		if (local5 == null) {
			return false;
		} else {
			Static155.method2393(local5);
			return true;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
	public static void method1763() {
		aCalendar1 = null;
		anIntArray259 = null;
		aClass10_1095 = null;
		aClass10_1096 = null;
		aClass29_49 = null;
		aClass10_1098 = null;
		anIntArray258 = null;
		aClass10_1097 = null;
		aClass29_50 = null;
	}
}
