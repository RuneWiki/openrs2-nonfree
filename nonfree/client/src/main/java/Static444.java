import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!so", name = "a", descriptor = "I")
	public static int anInt7507;

	@OriginalMember(owner = "client!so", name = "b", descriptor = "I")
	public static int anInt7508;

	@OriginalMember(owner = "client!so", name = "d", descriptor = "[J")
	public static final long[] aLongArray14 = new long[32];

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)Z")
	public static boolean method6414(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class1_Sub50 local8 = (Class1_Sub50) Static475.aClass38_69.method1419(); local8 != null; local8 = (Class1_Sub50) Static475.aClass38_69.method1415()) {
			if (Static270.method4524(local8.anInt8983) && (long) arg0 == local8.aLong236) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!lu;B)V")
	public static void method6416(@OriginalArg(0) Class186 arg0) {
		Static192.aClass1_Sub13_Sub2_1.method3083(arg0.method4851());
	}
}
