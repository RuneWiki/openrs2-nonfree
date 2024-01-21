import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1464 = Static51.method932("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1462 = aClass10_1464;

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1463 = Static51.method932("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1465 = Static51.method932("null");

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1467 = Static51.method932("Connection lost)3");

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1466 = aClass10_1467;

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "[I")
	public static int[] anIntArray359 = new int[500];

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "Z")
	public static final boolean aBoolean150 = false;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!kh;)V")
	public static void method2402(@OriginalArg(1) Class29 arg0) {
		Static162.aClass29_67 = arg0;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	public static void method2403() {
		aClass10_1463 = null;
		aClass10_1465 = null;
		aClass10_1462 = null;
		anIntArray359 = null;
		aClass10_1466 = null;
		aClass10_1464 = null;
		aClass10_1467 = null;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "([Lclient!cd;I)[Lclient!cd;")
	public static Class10[] method2404(@OriginalArg(0) Class10[] arg0) {
		@Pc(13) Class10[] local13 = new Class10[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = Static3.method36(new Class10[] { Static164.method2485(local15), Static124.aClass10_1215 });
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = Static3.method36(new Class10[] { local13[local15], arg0[local15] });
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIBII)V")
	public static void method2405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub24 local8 = (Class2_Sub24) Static179.aClass18_13.method683((long) arg3);
		if (local8 == null) {
			local8 = new Class2_Sub24();
			Static179.aClass18_13.method685((long) arg3, local8);
		}
		if (local8.anIntArray396.length <= arg2) {
			@Pc(34) int[] local34 = new int[arg2 + 1];
			@Pc(39) int[] local39 = new int[arg2 + 1];
			for (@Pc(41) int local41 = 0; local41 < local8.anIntArray396.length; local41++) {
				local34[local41] = local8.anIntArray396[local41];
				local39[local41] = local8.anIntArray395[local41];
			}
			for (@Pc(67) int local67 = local8.anIntArray396.length; local67 < arg2; local67++) {
				local34[local67] = -1;
				local39[local67] = 0;
			}
			local8.anIntArray396 = local34;
			local8.anIntArray395 = local39;
		}
		local8.anIntArray396[arg2] = arg1;
		local8.anIntArray395[arg2] = arg0;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIB)V")
	public static void method2406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static102.anInt3607 == 2) {
			Static116.method1882(Static135.anInt3004 * 2, (Static65.anInt1597 - Static137.anInt3049 << 7) + Static71.anInt1706, Static154.anInt3314 + (-Static85.anInt1937 + Static28.anInt788 << 7));
			if (Static5.anInt120 > -1 && Static14.anInt386 % 20 < 10) {
				Static8.aClass2_Sub1_Sub4_Sub2Array1[0].method738(arg0 + Static5.anInt120 - 12, arg1 - -Static117.anInt2671 - 28);
			}
		}
	}
}
