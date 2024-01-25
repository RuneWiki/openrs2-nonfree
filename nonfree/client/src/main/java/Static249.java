import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!pl", name = "z", descriptor = "Z")
	public static boolean aBoolean518;

	@OriginalMember(owner = "client!pl", name = "A", descriptor = "I")
	public static int anInt6207;

	@OriginalMember(owner = "client!pl", name = "C", descriptor = "I")
	public static int anInt6209;

	@OriginalMember(owner = "client!pl", name = "x", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_133 = new Class85("K", "T", "K", "K");

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILclient!ij;)V")
	public static void method5570(@OriginalArg(1) Class93 arg0) {
		Static310.aClass93_126 = arg0;
	}

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "(B)V")
	public static void method5572() {
		if (!Static148.method2694()) {
			return;
		}
		if (Static17.aStringArray4 == null) {
			Static177.method3183();
		}
		Static207.aBooleanArray16 = new boolean[100];
		Static54.anInt1001 = 0;
		Static183.anIntArray365 = new int[100];
		Static186.aBoolean286 = true;
		Static192.anIntArray382 = new int[100];
		Static125.anIntArray239 = new int[100];
		for (@Pc(34) int local34 = 0; local34 < 100; local34++) {
			Static125.anIntArray239[local34] = (int) ((double) Static168.anInt3376 * Math.random());
			Static183.anIntArray365[local34] = (int) (Math.random() * 350.0D);
			Static192.anIntArray382[local34] = (int) (Math.random() * 102.0D);
			Static207.aBooleanArray16[local34] = Math.random() < 0.5D;
		}
		try {
			Static11.aClipboard1 = Static138.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(78) Exception local78) {
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILclient!ij;Lclient!ea;)V")
	public static void method5573(@OriginalArg(1) Class93 arg0, @OriginalArg(2) Class55 arg1) {
		if (Static346.aBoolean579) {
			return;
		}
		arg1.method5226(0);
		Static354.aClass95_18 = arg1.method5229(Static363.method2677(arg0, Static176.anInt3500));
		Static354.aClass95_18.method5491((Static168.anInt3376 - Static354.aClass95_18.method5507()) / 2, (Static256.anInt5066 - Static354.aClass95_18.method5494()) / 2);
		Static223.aClass95_10 = arg1.method5229(Static363.method2677(arg0, Static46.anInt863));
		Static223.aClass95_10.method5491((Static168.anInt3376 - Static223.aClass95_10.method5507()) / 2, 18);
		Static346.aBoolean579 = true;
	}
}
