import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
	public static int anInt1773;

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "Lclient!dd;")
	public static Class14 aClass14_19;

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "Lclient!wd;")
	public static Class8_Sub20 aClass8_Sub20_25;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "Lclient!ic;")
	private static Class34 aClass34_818 = Static56.method816("Error loading your profile)3");

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "Lclient!ic;")
	private static Class34 aClass34_820 = Static56.method816("To play on this world move to a free area first)3");

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!ic;")
	public static Class34 aClass34_819 = aClass34_820;

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "Lclient!ic;")
	private static Class34 aClass34_827 = Static56.method816("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "Lclient!ic;")
	public static Class34 aClass34_821 = aClass34_827;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "Lclient!ic;")
	public static Class34 aClass34_822 = aClass34_818;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "Lclient!ic;")
	public static Class34 aClass34_823 = Static56.method816("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "Lclient!ic;")
	public static Class34 aClass34_824 = Static56.method816("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "Lclient!ic;")
	private static Class34 aClass34_825 = Static56.method816("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
	public static int anInt1778 = 0;

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "Lclient!ic;")
	public static Class34 aClass34_826 = Static56.method816("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
	public static int anInt1779 = 0;

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "Lclient!ic;")
	public static Class34 aClass34_828 = Static56.method816("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "Lclient!ic;")
	public static Class34 aClass34_829 = aClass34_825;

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "Lclient!ic;")
	public static Class34 aClass34_830 = Static56.method816("auf der Hautpseite)3");

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!md;ZLclient!pd;I)V")
	public static void method1083(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(2) Class61 arg1, @OriginalArg(3) int arg2) {
		@Pc(3) byte[] local3 = null;
		@Pc(9) Class49 local9 = Static127.aClass49_14;
		synchronized (Static127.aClass49_14) {
			for (@Pc(16) Class8_Sub10 local16 = (Class8_Sub10) Static127.aClass49_14.method1107(); local16 != null; local16 = (Class8_Sub10) Static127.aClass49_14.method1109()) {
				if (local16.aLong102 == (long) arg2 && local16.aClass61_2 == arg1 && local16.anInt1311 == 0) {
					local3 = local16.aByteArray17;
					break;
				}
			}
		}
		if (local3 == null) {
			@Pc(68) byte[] local68 = arg1.method1361(arg2);
			arg0.method1179(local68, true, arg1, arg2);
		} else {
			arg0.method1179(local3, true, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method1084() {
		aClass34_830 = null;
		aClass34_820 = null;
		aClass34_822 = null;
		aClass8_Sub20_25 = null;
		aClass34_819 = null;
		aClass14_19 = null;
		aClass34_828 = null;
		aClass34_824 = null;
		aClass34_818 = null;
		aClass34_825 = null;
		aClass34_823 = null;
		aClass34_826 = null;
		aClass34_829 = null;
		aClass34_827 = null;
		aClass34_821 = null;
	}
}
