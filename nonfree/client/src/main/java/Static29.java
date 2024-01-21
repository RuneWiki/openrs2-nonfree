import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
	public static final int[] anIntArray59 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_325 = Static187.method3089("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!vd;")
	public static Class92 aClass92_322 = aClass92_325;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_323 = Static187.method3089("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	public static int anInt716 = 0;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	public static int anInt717 = 0;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_324 = Static187.method3089("Enter your username (V password)3");

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
	public static boolean aBoolean48 = true;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_326 = Static187.method3089("Mitglieder)2Welt");

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_327 = aClass92_324;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	public static void method548(@OriginalArg(1) int arg0) {
		if (!Static24.method463(arg0)) {
			return;
		}
		@Pc(16) Class11[] local16 = Static194.aClass11ArrayArray1[arg0];
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class11 local24 = local16[local18];
			if (local24 != null) {
				local24.anInt276 = 0;
				local24.anInt271 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Lclient!vd;")
	public static Class92 method553(@OriginalArg(1) int arg0) {
		return Static65.aClass92Array9[arg0].method3233() <= 0 ? Static158.aClass92Array23[arg0] : Static208.method787(new Class92[] { Static158.aClass92Array23[arg0], Static89.aClass92_831, Static65.aClass92Array9[arg0] });
	}
}
