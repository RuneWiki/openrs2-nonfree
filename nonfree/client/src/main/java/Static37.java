import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "Z")
	public static boolean aBoolean52;

	@OriginalMember(owner = "client!ci", name = "v", descriptor = "[I")
	public static int[] anIntArray118;

	@OriginalMember(owner = "client!ci", name = "t", descriptor = "I")
	public static int anInt766 = -1;

	@OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
	public static int anInt767 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)V")
	public static void method813(@OriginalArg(0) int arg0) {
		if (arg0 == Static74.anInt4013) {
			return;
		}
		Static392.anInt6751 = Static307.anInt5484 = Static176.anIntArray347[arg0];
		Static304.aClass82_4.method4524(50, (int) ((double) Static392.anInt6751 * 34.46D));
		Static32.anIntArrayArrayArray14 = new int[4][Static392.anInt6751 >> 3][Static307.anInt5484 >> 3];
		Static240.anIntArrayArray28 = new int[Static392.anInt6751][Static307.anInt5484];
		Static280.anIntArrayArray41 = new int[Static392.anInt6751][Static307.anInt5484];
		for (@Pc(47) int local47 = 0; local47 < 4; local47++) {
			Static190.aClass239Array1[local47] = Static84.method1486(Static392.anInt6751, Static307.anInt5484);
		}
		Static75.aByteArrayArrayArray5 = new byte[4][Static392.anInt6751][Static307.anInt5484];
		Static222.method3738(Static307.anInt5484, Static392.anInt6751);
		Static159.method2668(Static304.aClass82_4, Static392.anInt6751 >> 3, Static307.anInt5484 >> 3);
		Static74.anInt4013 = arg0;
	}

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V")
	public static void method814() {
		@Pc(3) Class56[] local3 = Class107.aClass56Array1;
		synchronized (Class107.aClass56Array1) {
			for (@Pc(7) int local7 = 0; local7 < Class107.aClass56Array1.length; local7++) {
				Class107.aClass56Array1[local7] = new Class56();
				Static357.anIntArray128[local7] = 0;
			}
		}
	}
}
