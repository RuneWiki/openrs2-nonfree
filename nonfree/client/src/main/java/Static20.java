import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!db", name = "fb", descriptor = "Lclient!qe;")
	public static Class5_Sub11 aClass5_Sub11_2;

	@OriginalMember(owner = "client!db", name = "ib", descriptor = "I")
	public static int anInt676;

	@OriginalMember(owner = "client!db", name = "Q", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!db", name = "S", descriptor = "[I")
	public static int[] anIntArray80 = new int[5];

	@OriginalMember(owner = "client!db", name = "U", descriptor = "Lclient!vc;")
	public static Class71 aClass71_379 = Static38.method736("Ausw-=hlen");

	@OriginalMember(owner = "client!db", name = "X", descriptor = "Z")
	public static boolean aBoolean27 = false;

	@OriginalMember(owner = "client!db", name = "ab", descriptor = "I")
	public static int anInt671 = 0;

	@OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
	public static int anInt674 = 0;

	@OriginalMember(owner = "client!db", name = "gb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_380 = Static38.method736("Lade Freunde)2Liste)3)3)3");

	@OriginalMember(owner = "client!db", name = "hb", descriptor = "I")
	public static volatile int anInt675 = 0;

	@OriginalMember(owner = "client!db", name = "kb", descriptor = "I")
	public static int anInt677 = 0;

	@OriginalMember(owner = "client!db", name = "lb", descriptor = "I")
	public static int anInt678 = 0;

	@OriginalMember(owner = "client!db", name = "mb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_381 = Static38.method736("Lade Texturen )2 ");

	@OriginalMember(owner = "client!db", name = "pb", descriptor = "Lclient!vc;")
	private static Class71 aClass71_384 = Static38.method736("This world is full)3");

	@OriginalMember(owner = "client!db", name = "nb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_382 = aClass71_384;

	@OriginalMember(owner = "client!db", name = "ob", descriptor = "Lclient!vc;")
	public static Class71 aClass71_383 = Static38.method736("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!db", name = "qb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_385 = Static38.method736("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)V")
	public static void method505() {
		Static103.method1649(0, 10, false, null);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V")
	public static void method506() {
		aClass71_383 = null;
		aClass71_385 = null;
		aCalendar1 = null;
		aClass71_379 = null;
		aClass71_380 = null;
		Class5_Sub1_Sub4.anIntArray83 = null;
		aClass71_384 = null;
		aClass71_382 = null;
		aClass71_381 = null;
		aClass5_Sub11_2 = null;
		anIntArray80 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!cf;Lclient!fc;II)V")
	public static void method507(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class24_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class5_Sub10 local7 = new Class5_Sub10();
		local7.aLong118 = arg2;
		local7.aClass14_3 = arg0;
		local7.anInt1988 = 1;
		local7.aClass24_Sub1_16 = arg1;
		@Pc(22) Class52 local22 = Static89.aClass52_11;
		synchronized (Static89.aClass52_11) {
			Static89.aClass52_11.method1362(local7);
		}
		Static5.method149();
	}
}
