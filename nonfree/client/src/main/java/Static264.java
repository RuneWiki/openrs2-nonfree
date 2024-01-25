import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!ie", name = "X", descriptor = "Lclient!vd;")
	public static final Class378 aClass378_3 = new Class378(64);

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(ZI)V")
	public static void method3744(@OriginalArg(0) boolean arg0) {
		@Pc(7) Class221[] local7 = Static487.aClass221Array1;
		for (@Pc(16) int local16 = 0; local16 < local7.length; local16++) {
			@Pc(22) Class221 local22 = local7[local16];
			local22.method5170();
		}
		Static154.method2202();
		Static248.method3462();
		Static506.method7169();
		for (@Pc(37) int local37 = 0; local37 < 4; local37++) {
			Static626.aClass226Array1[local37].method5280();
		}
		Static529.method7451(false);
		System.gc();
		Static418.method6114();
		Static717.anInt10936 = -1;
		Static366.aBoolean494 = false;
		Static321.method4455(3712);
		Static436.method6343(true);
		Static629.method8513();
		Static85.method1268();
		Static425.method6179();
		if (arg0) {
			Static261.method9374(-100, 13);
			return;
		}
		Static261.method9374(-106, 3);
		try {
			Static736.method7134(Static214.anApplet1, "loggedout");
		} catch (@Pc(97) Throwable local97) {
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)Lclient!ji;")
	public static Class197 method3745(@OriginalArg(1) int arg0) {
		@Pc(8) Class197[] local8 = Static375.method5330();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (arg0 == local8[local10].anInt4601) {
				return local8[local10];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)I")
	public static int method3746(@OriginalArg(0) boolean arg0) {
		if (Static167.anIntArray217 == null) {
			return 0;
		} else if (arg0 || Static497.aClass173Array1 == null) {
			@Pc(33) int local33 = 0;
			for (@Pc(35) int local35 = 0; local35 < Static167.anIntArray217.length; local35++) {
				@Pc(43) int local43 = Static167.anIntArray217[local35];
				if (Static695.aClass254_165.method6072(local43)) {
					local33++;
				}
				if (Static246.aClass254_84.method6072(local43)) {
					local33++;
				}
			}
			return local33;
		} else {
			return Static167.anIntArray217.length * 2;
		}
	}
}
