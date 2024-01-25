import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "Lclient!ra;")
	public static Class170 aClass170_114;

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
	public static int anInt6151;

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString353;

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "Lclient!ra;")
	public static Class170 aClass170_115;

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
	public static int anInt6153 = 0;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B[I[Ljava/lang/Object;)V")
	public static void method5467(@OriginalArg(1) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static133.method5810(arg1, arg0.length - 1, 0, arg0);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(JI)V")
	public static void method5470(@OriginalArg(0) long arg0) {
		if (Static130.aClass3Array2 != null) {
			if (Static215.anInt4279 == 1 || Static215.anInt4279 == 5) {
				Static323.method5435(arg0);
			} else if (Static215.anInt4279 == 2) {
				Static175.method3302();
			} else if (Static215.anInt4279 == 4) {
				Static353.method5823(arg0);
			} else {
				Static286.method4901();
			}
		}
		Static101.method2033(Static15.aClass59_1, (long) Static180.anInt3606);
		if (Static207.anInt4106 != -1) {
			Static194.method3497(Static207.anInt4106);
		}
		for (@Pc(54) int local54 = 0; local54 < Static169.anInt3450; local54++) {
			if (Static293.aBooleanArray25[local54]) {
				Static39.aBooleanArray3[local54] = true;
			}
			Static177.aBooleanArray9[local54] = Static293.aBooleanArray25[local54];
			Static293.aBooleanArray25[local54] = false;
		}
		Static8.anInt251 = Static180.anInt3606;
		if (Static15.aClass59_1.method4862()) {
			Static256.aBoolean382 = true;
		}
		Static84.aClass96_7 = null;
		if (Static207.anInt4106 != -1) {
			Static169.anInt3450 = 0;
			Static316.method5383();
		}
		Static15.aClass59_1.method4810();
		Static102.method2055(Static15.aClass59_1);
		@Pc(108) int local108 = Static348.method5750();
		if (local108 == -1) {
			local108 = Static112.anInt2425;
		}
		Static103.method2061(local108);
		Static287.method4909(Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5773, Static346.anInt6449, Static156.anInt3123, Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5769);
		Static346.anInt6449 = 0;
	}
}
