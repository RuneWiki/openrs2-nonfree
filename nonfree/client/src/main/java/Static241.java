import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!nl", name = "M", descriptor = "I")
	public static int anInt4030;

	@OriginalMember(owner = "client!nl", name = "K", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_141 = new Class48(76, 2);

	@OriginalMember(owner = "client!nl", name = "S", descriptor = "Lclient!ai;")
	public static final Class8 aClass8_1 = new Class8();

	@OriginalMember(owner = "client!nl", name = "T", descriptor = "[I")
	public static final int[] anIntArray508 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "(I)V")
	public static void method3347() {
		for (@Pc(11) Class1_Sub40 local11 = (Class1_Sub40) Static358.aClass17_66.method202(); local11 != null; local11 = (Class1_Sub40) Static358.aClass17_66.method207()) {
			if (Static130.method1903(local11.anInt5411)) {
				Static319.method4695(local11);
			}
		}
		if (Static215.anInt3678 == 1) {
			Static65.aBoolean115 = false;
			Static83.method1220(Static38.anInt737, Static56.anInt1146, Static90.anInt1655, Static265.anInt4594);
			return;
		}
		Static83.method1220(Static38.anInt737, Static56.anInt1146, Static90.anInt1655, Static265.anInt4594);
		@Pc(55) int local55 = Static102.aClass110_3.method2413(Static39.aClass169_32.method3680(Static48.anInt952));
		for (@Pc(60) Class1_Sub40 local60 = (Class1_Sub40) Static358.aClass17_66.method202(); local60 != null; local60 = (Class1_Sub40) Static358.aClass17_66.method207()) {
			@Pc(66) int local66 = Static143.method2170(local60);
			if (local55 < local66) {
				local55 = local66;
			}
		}
		Static56.anInt1146 = local55 + 8;
		Static265.anInt4594 = (Static122.aBoolean178 ? 26 : 22) + Static215.anInt3678 * 16;
	}

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "(I)Lclient!lk;")
	public static Class1_Sub24 method3349() {
		if (Static353.aClass17_25 == null || Static361.aClass186_1 == null) {
			return null;
		}
		Static361.aClass186_1.method4293(Static353.aClass17_25);
		@Pc(23) Class1_Sub24 local23 = (Class1_Sub24) Static361.aClass186_1.method4292();
		if (local23 == null) {
			return null;
		} else {
			@Pc(33) Class97 local33 = Static353.aClass249_4.method5522(local23.anInt3616);
			return local33 != null && local33.aBoolean184 && local33.method1857(Static353.anInterface4_2) ? local23 : Static192.method2745();
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)V")
	public static void method3350(@OriginalArg(1) int arg0) {
		Static346.anInt5675 = 3;
		Static134.anInt2508 = 100;
		Static355.anInt4357 = -1;
		Static276.anInt5133 = arg0;
	}
}
