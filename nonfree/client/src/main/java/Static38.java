import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
	public static int anInt1150 = 78;

	@OriginalMember(owner = "client!hc", name = "z", descriptor = "Lclient!ke;")
	public static Class39 aClass39_489 = Static2.method66(" weitere Optionen");

	@OriginalMember(owner = "client!hc", name = "B", descriptor = "Lclient!ke;")
	private static Class39 aClass39_490 = Static2.method66("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!hc", name = "C", descriptor = "Lclient!ke;")
	public static Class39 aClass39_491 = Static2.method66("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
	public static int anInt1151 = 0;

	@OriginalMember(owner = "client!hc", name = "E", descriptor = "Lclient!ke;")
	public static Class39 aClass39_492 = Static2.method66(")1");

	@OriginalMember(owner = "client!hc", name = "G", descriptor = "Lclient!ke;")
	public static Class39 aClass39_493 = Static2.method66("Ausw-=hlen");

	@OriginalMember(owner = "client!hc", name = "H", descriptor = "Lclient!ke;")
	public static Class39 aClass39_494 = Static2.method66("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <ON>");

	@OriginalMember(owner = "client!hc", name = "L", descriptor = "I")
	public static int anInt1156 = -1;

	@OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
	public static int anInt1157 = 0;

	@OriginalMember(owner = "client!hc", name = "U", descriptor = "Lclient!ke;")
	private static Class39 aClass39_499 = Static2.method66("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!hc", name = "N", descriptor = "Lclient!ke;")
	public static Class39 aClass39_495 = aClass39_499;

	@OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
	public static int anInt1159 = 0;

	@OriginalMember(owner = "client!hc", name = "R", descriptor = "Lclient!ke;")
	private static Class39 aClass39_496 = Static2.method66("Please wait)3)3)3");

	@OriginalMember(owner = "client!hc", name = "S", descriptor = "Lclient!ke;")
	public static Class39 aClass39_497 = Static2.method66("(Y");

	@OriginalMember(owner = "client!hc", name = "T", descriptor = "Lclient!ke;")
	public static Class39 aClass39_498 = aClass39_490;

	@OriginalMember(owner = "client!hc", name = "V", descriptor = "Lclient!ke;")
	public static Class39 aClass39_500 = Static2.method66("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!hc", name = "X", descriptor = "Lclient!ke;")
	public static Class39 aClass39_501 = aClass39_496;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
	public static void method813() {
		for (@Pc(15) Class2_Sub3 local15 = (Class2_Sub3) Static89.aClass34_44.method872(); local15 != null; local15 = (Class2_Sub3) Static89.aClass34_44.method879()) {
			if (local15.anInt499 == -1) {
				local15.anInt494 = 0;
				Static6.method2063(local15);
			} else {
				local15.method2045();
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method814() {
		Static51.aClass51_50.method1970();
		Static67.anIntArray244 = Static106.method2031(Static67.anIntArray244);
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
	public static void method815() {
		aClass39_493 = null;
		aClass39_490 = null;
		aClass39_495 = null;
		aClass39_491 = null;
		aClass39_494 = null;
		aClass39_500 = null;
		aClass39_489 = null;
		aClass39_496 = null;
		aClass39_492 = null;
		aClass39_501 = null;
		aClass39_499 = null;
		aClass39_498 = null;
		aClass39_497 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIBI[BIIII[Lclient!ne;)V")
	public static void method816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class47[] arg8) {
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if (local7 + arg1 > 0 && arg1 + local7 < 103 && local11 + arg2 > 0 && arg2 + local11 < 103) {
					arg8[arg5].anIntArrayArray20[arg1 + local7][arg2 + local11] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(96) Class2_Sub5 local96 = new Class2_Sub5(arg3);
		for (@Pc(98) int local98 = 0; local98 < 4; local98++) {
			for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
				for (@Pc(106) int local106 = 0; local106 < 64; local106++) {
					if (arg4 == local98 && local102 >= arg6 && local102 < arg6 + 8 && arg7 <= local106 && local106 < arg7 + 8) {
						Static6.method2056(0, arg0, local96, arg5, Static12.method258(local106 & 0x7, arg0, local102 & 0x7) + arg2, arg1 + Static23.method443(arg0, local106 & 0x7, local102 & 0x7), 0);
					} else {
						Static6.method2056(0, 0, local96, 0, -1, -1, 0);
					}
				}
			}
		}
	}
}
