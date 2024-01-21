import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1204 = Static81.method1507("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
	public static int anInt4176 = 0;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
	public static int anInt4177 = 0;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "[[S")
	public static final short[][] aShortArrayArray40 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
	public static int anInt4178 = 0;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
	public static int anInt4179 = -1;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1205 = Static81.method1507("Registrierter Benutzer");

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1206 = Static81.method1507("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1207 = aClass24_1206;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
	public static void method3228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static65.aBoolean84 = true;
		Static41.anInt1353 = arg0;
		Static191.anInt4295 = arg1;
		Static94.anInt2171 = arg2;
		Static28.anInt730 = -1;
		Static137.anInt3092 = -1;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Lclient!vc;")
	public static Class98 method3229(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static4.aClass98ArrayArray3[local7] == null || Static4.aClass98ArrayArray3[local7][local11] == null) {
			@Pc(25) boolean local25 = Static110.method1903(local7);
			if (!local25) {
				return null;
			}
		}
		return Static4.aClass98ArrayArray3[local7][local11];
	}
}
