import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
	public static int anInt9882;

	@OriginalMember(owner = "client!ib", name = "T", descriptor = "Lclient!fs;")
	public static Class134 aClass134_36;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLclient!cn;II)V")
	public static void method8496(@OriginalArg(1) Class73 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static199.aBoolean706) {
			@Pc(21) Class152 local21 = Static187.anInt3082 == -1 ? null : Static4.aClass355_1.method8693(Static187.anInt3082);
			if (Static81.method1252(arg0).method7127() && (Static382.anInt9821 & 0x20) != 0 && (local21 == null || arg0.method1285(Static187.anInt3082, local21.anInt3373) != local21.anInt3373)) {
				Static152.method2122(arg0.anInt1364, (long) (arg0.anInt1364 << 0 | arg0.anInt1388), false, 0L, Static211.aString54, arg0.anInt1388, false, Static352.aString75 + " -> " + arg0.aString22, Static586.anInt9800, 17, true, arg0.anInt1419);
			}
		}
		@Pc(101) String local101;
		for (@Pc(94) int local94 = 9; local94 >= 5; local94--) {
			local101 = Static111.method1604(arg0, local94);
			if (local101 != null) {
				Static152.method2122(arg0.anInt1364, (long) (arg0.anInt1388 | arg0.anInt1364 << 0), false, (long) (local94 + 1), local101, arg0.anInt1388, false, arg0.aString22, Static635.method8871(local94, arg0), 1004, true, arg0.anInt1419);
			}
		}
		local101 = Static277.method4084(arg0);
		if (local101 != null) {
			Static152.method2122(arg0.anInt1364, (long) (arg0.anInt1388 | arg0.anInt1364 << 0), false, 0L, local101, arg0.anInt1388, false, arg0.aString22, arg0.anInt1351, 46, true, arg0.anInt1419);
		}
		for (@Pc(195) int local195 = 4; local195 >= 0; local195--) {
			@Pc(204) String local204 = Static111.method1604(arg0, local195);
			if (local204 != null) {
				Static152.method2122(arg0.anInt1364, (long) (arg0.anInt1388 | arg0.anInt1364 << 0), false, (long) (local195 + 1), local204, arg0.anInt1388, false, arg0.aString22, Static635.method8871(local195, arg0), 52, true, arg0.anInt1419);
			}
		}
		if (!Static81.method1252(arg0).method7129()) {
			return;
		}
		if (arg0.aString23 == null) {
			Static152.method2122(arg0.anInt1364, (long) (arg0.anInt1364 << 0 | arg0.anInt1388), false, 0L, Static582.aClass335_11.method8349(Static323.anInt5795), arg0.anInt1388, false, "", -1, 47, true, arg0.anInt1419);
		} else {
			Static152.method2122(arg0.anInt1364, (long) (arg0.anInt1388 | arg0.anInt1364 << 0), false, 0L, arg0.aString23, arg0.anInt1388, false, "", -1, 47, true, arg0.anInt1419);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)B")
	public static byte method8513(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
