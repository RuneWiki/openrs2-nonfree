import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "[I")
	public static int[] anIntArray399;

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "Lclient!ga;")
	public static Class29 aClass29_3;

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "Lclient!sg;")
	private static Class77 aClass77_974 = Static146.method2172(" has logged out)3");

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "Lclient!sg;")
	public static Class77 aClass77_972 = aClass77_974;

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray19 = new int[5][5000];

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "Lclient!sg;")
	public static Class77 aClass77_973 = Static146.method2172("leuchten2:");

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "Lclient!ua;")
	public static Class82 aClass82_41 = new Class82(64);

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "Lclient!sg;")
	public static Class77 aClass77_975 = Static146.method2172("<col=ffff00>");

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
	public static int anInt2501 = 0;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIZ)V")
	public static void method1793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int[] local4 = new int[4];
		local4[0] = arg1;
		@Pc(20) int[] local20 = new int[4];
		local20[0] = arg0;
		@Pc(26) int local26 = 1;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			if (Static106.anIntArray410[local28] != arg1) {
				local4[local26] = Static106.anIntArray410[local28];
				local20[local26] = Static100.anIntArray102[local28];
				local26++;
			}
		}
		Static106.anIntArray410 = local4;
		Static100.anIntArray102 = local20;
		Static136.method2284(Static140.aClass84Array1, 0, Static100.anIntArray102, Static140.aClass84Array1.length - 1, Static106.anIntArray410);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
	public static void method1794() {
		aClass77_973 = null;
		aByteArrayArrayArray4 = null;
		aClass77_972 = null;
		aClass82_41 = null;
		anIntArrayArray19 = null;
		aClass29_3 = null;
		aClass77_974 = null;
		aClass77_975 = null;
		anIntArray399 = null;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)J")
	public static synchronized long method1795() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static87.aLong78 > local5) {
			Static167.aLong120 += Static87.aLong78 - local5;
		}
		Static87.aLong78 = local5;
		return local5 + Static167.aLong120;
	}
}
