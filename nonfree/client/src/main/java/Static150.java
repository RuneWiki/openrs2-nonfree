import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!le", name = "d", descriptor = "Lclient!km;")
	public static Class91 aClass91_118;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "Lclient!km;")
	public static Class91 aClass91_119;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "I")
	public static int anInt3231 = 0;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "S")
	public static short aShort26 = 320;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString187 = "glow3:";

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)V")
	public static void method2613(@OriginalArg(0) int arg0) {
		Static134.anInt2945--;
		if (Static134.anInt2945 == arg0) {
			return;
		}
		Static304.method2611(Static92.aStringArray26, arg0 + 1, Static92.aStringArray26, arg0, Static134.anInt2945 - arg0);
		Static304.method2611(Static266.aStringArray50, arg0 + 1, Static266.aStringArray50, arg0, Static134.anInt2945 - arg0);
		Static304.method2606(Static20.anIntArray44, arg0 + 1, Static20.anIntArray44, arg0, Static134.anInt2945 - arg0);
		Static304.method2604(Static61.aShortArray23, arg0 + 1, Static61.aShortArray23, arg0, Static134.anInt2945 - arg0);
		Static304.method2608(Static152.aLongArray7, arg0 + 1, Static152.aLongArray7, arg0, Static134.anInt2945 - arg0);
		Static304.method2606(Static219.anIntArray387, arg0 + 1, Static219.anIntArray387, arg0, Static134.anInt2945 - arg0);
		Static304.method2606(Static164.anIntArray311, arg0 + 1, Static164.anIntArray311, arg0, Static134.anInt2945 - arg0);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIB)I")
	public static int method2614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(17) int local17 = 65536 - Class68.anIntArray226[arg0 * 1024 / arg2] >> 1;
		return (local17 * arg1 >> 16) + ((65536 - local17) * arg3 >> 16);
	}
}
