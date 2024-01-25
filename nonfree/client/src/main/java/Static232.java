import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "[Lclient!o;")
	public static Class80[] aClass80Array13;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
	public static int anInt4730;

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "Lclient!client;")
	public static client aClient5;

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "Z")
	public static boolean aBoolean319 = false;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIZ)V")
	public static void method3818(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 0) {
			Static412.aClass50_8 = Static461.method5836(Static171.aClass159_1, arg0, Static412.aCanvas7, Static361.aClass85_Sub1_1.anInt2486 * 2, Static413.anInterface7_7);
		} else {
			if (arg1) {
				Static412.aClass50_8 = Static461.method5836(Static171.aClass159_1, 0, Static412.aCanvas7, 0, Static413.anInterface7_7);
				Static412.aClass50_8.t(0);
				@Pc(44) Class79 local44 = Static378.method5102(Static95.anInt1954, Static326.aClass187_99);
				@Pc(53) Class57 local53 = Static412.aClass50_8.method5846(local44, Static463.method1664(Static21.aClass187_8, Static95.anInt1954));
				Static77.method1475(true, local53, Static5.aClass182_1.method4155(Static191.anInt3842));
				Static412.aClass50_8.method5821();
				Static130.method2274();
				Static412.aClass50_8.method5815();
			}
			try {
				Static412.aClass50_8 = Static461.method5836(Static171.aClass159_1, arg0, Static412.aCanvas7, Static361.aClass85_Sub1_1.anInt2486 * 2, Static413.anInterface7_7);
				if (Static412.aClass50_8.method5881()) {
					@Pc(86) boolean local86 = true;
					try {
						local86 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(98) Throwable local98) {
					}
					@Pc(104) Class10_Sub29 local104;
					if (local86) {
						local104 = Static412.aClass50_8.method5852(146800640);
					} else {
						local104 = Static412.aClass50_8.method5852(104857600);
					}
					Static412.aClass50_8.method5879(local104);
				}
			} catch (@Pc(115) Throwable local115) {
				arg0 = 0;
				Static412.aClass50_8 = Static461.method5836(Static171.aClass159_1, 0, Static412.aCanvas7, 0, Static413.anInterface7_7);
			}
		}
		Static423.anInt7114 = arg0;
		Static19.method278();
		if (!Static412.aClass50_8.method5876()) {
			Static29.anInt497 = 1;
		}
		Static412.aClass50_8.method5817(Static29.anInt497);
		Static412.aClass50_8.method5832(0);
		Static412.aClass50_8.ya(8);
		Static342.aClass34_4 = Static412.aClass50_8.method5829();
		Static259.aClass34_6 = Static412.aClass50_8.method5829();
		Static159.method2689();
		Static412.aClass50_8.method5866(!Static361.aClass85_Sub1_1.aBoolean179);
		if (Static412.aClass50_8.method5850()) {
			Static407.method5369(Static361.aClass85_Sub1_1.aBoolean166);
		}
		Static198.method3141(Static17.anInt315 >> 3, Static412.aClass50_8, Static2.anInt7 >> 3);
		Static343.method4653();
		Static419.aBoolean463 = false;
	}
}
