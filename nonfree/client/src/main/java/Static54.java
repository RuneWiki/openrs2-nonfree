import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public static void method6030() {
		if (!Static241.method4501()) {
			return;
		}
		if (Static282.aStringArray33 == null) {
			Static359.method5945();
		}
		Static287.aBoolean425 = true;
		Static221.anInt4462 = 0;
		Static162.aBooleanArray17 = new boolean[100];
		Static16.anIntArray34 = new int[100];
		Static247.anIntArray387 = new int[100];
		Static12.anIntArray25 = new int[100];
		for (@Pc(35) int local35 = 0; local35 < 100; local35++) {
			Static12.anIntArray25[local35] = (int) (Math.random() * (double) Static213.anInt4274);
			Static16.anIntArray34[local35] = (int) (Math.random() * 350.0D);
			Static247.anIntArray387[local35] = (int) (Math.random() * 102.0D);
			Static162.aBooleanArray17[local35] = Math.random() < 0.5D;
		}
		try {
			Static96.aClipboard1 = Static48.aClient2.getToolkit().getSystemClipboard();
		} catch (@Pc(79) Exception local79) {
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!fp;ILclient!ct;Lclient!ct;)V")
	public static void method6034(@OriginalArg(0) Class63 arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) Class30 arg2) {
		Static315.aClass80_15 = Static323.method4438(arg1, Static144.anInt3081);
		Static364.aClass33_4 = arg0.method4611(Static315.aClass80_15, Static382.method5434(arg2, Static144.anInt3081));
		Static91.aClass80_20 = Static323.method4438(arg1, Static31.anInt788);
		Static24.aClass33_1 = arg0.method4611(Static91.aClass80_20, Static382.method5434(arg2, Static31.anInt788));
		Static64.aClass80_17 = Static323.method4438(arg1, Static78.anInt1753);
		Static340.aClass33_3 = arg0.method4611(Static64.aClass80_17, Static382.method5434(arg2, Static78.anInt1753));
	}
}
