import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
	public static int anInt2140;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
	public static int anInt2141;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Lclient!ig;")
	public static final Class47 aClass47_14 = new Class47(64);

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_947 = Static187.method3089("Please reload this page)3");

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Lclient!vd;")
	public static Class92 aClass92_946 = aClass92_947;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_948 = Static187.method3089("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_949 = Static187.method3089("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_950 = Static187.method3089("scrollbar");

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!vd;IILclient!vd;ILclient!vd;)V")
	public static void method1498(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class92 arg3, @OriginalArg(5) Class92 arg4) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static71.anIntArray128[local7] = Static71.anIntArray128[local7 - 1];
			Static189.aClass92Array27[local7] = Static189.aClass92Array27[local7 - 1];
			Static111.aClass92Array17[local7] = Static111.aClass92Array17[local7 - 1];
			Static82.aClass92Array14[local7] = Static82.aClass92Array14[local7 - 1];
			Static172.anIntArray313[local7] = Static172.anIntArray313[local7 - 1];
		}
		Static71.anIntArray128[0] = arg1;
		Static189.aClass92Array27[0] = arg4;
		Static62.anInt1475 = Static25.anInt588;
		Static172.anIntArray313[0] = arg2;
		Static111.aClass92Array17[0] = arg3;
		Static9.anInt3166++;
		Static82.aClass92Array14[0] = arg0;
	}
}
