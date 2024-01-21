import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!lh", name = "ab", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1173 = Static193.method3027("null");

	@OriginalMember(owner = "client!lh", name = "nb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1179 = Static193.method3027("Create a free account");

	@OriginalMember(owner = "client!lh", name = "bb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1174 = aClass70_1179;

	@OriginalMember(owner = "client!lh", name = "pb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1181 = Static193.method3027("K");

	@OriginalMember(owner = "client!lh", name = "cb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1175 = aClass70_1181;

	@OriginalMember(owner = "client!lh", name = "db", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1176 = aClass70_1181;

	@OriginalMember(owner = "client!lh", name = "eb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1177 = Static193.method3027("Lade Texturen )2 ");

	@OriginalMember(owner = "client!lh", name = "lb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1178 = Static193.method3027("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!lh", name = "mb", descriptor = "I")
	public static int anInt2459 = 0;

	@OriginalMember(owner = "client!lh", name = "ob", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1180 = Static193.method3027("Spieler");

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIII)V")
	public static void method1744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class3_Sub6 local7 = Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class83 local13 = local7.aClass83_1;
		if (local13 != null) {
			local13.anInt3362 = local13.anInt3362 * arg3 / 16;
			local13.anInt3363 = local13.anInt3363 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)V")
	public static void method1747(@OriginalArg(0) int arg0) {
		@Pc(23) Class3_Sub7 local23 = (Class3_Sub7) Static145.aClass40_10.method1029((long) arg0);
		if (local23 != null) {
			local23.method3320();
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIII)V")
	public static void method1748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) Class42[] local9 = Static192.aClass42Array1;
		while (local7 < local9.length) {
			@Pc(15) Class42 local15 = local9[local7];
			if (local15 != null && local15.anInt1605 == 2) {
				Static95.method1376((local15.anInt1601 - Static30.anInt695 << 7) + local15.anInt1603, (-Static55.anInt1184 + local15.anInt1606 << 7) + local15.anInt1599, local15.anInt1598 * 2, arg0 >> 1, arg2 >> 1);
				if (Static8.anInt191 > -1 && Static184.anInt3760 % 20 < 10) {
					Static208.aClass3_Sub3_Sub2_Sub1Array10[local15.anInt1600].method185(Static8.anInt191 + arg1 - 12, Static17.anInt363 + -28 + arg3);
				}
			}
			local7++;
		}
	}
}
