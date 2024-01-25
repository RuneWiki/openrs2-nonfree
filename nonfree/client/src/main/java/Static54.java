import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cca", name = "ab", descriptor = "I")
	public static int anInt1389;

	@OriginalMember(owner = "client!cca", name = "M", descriptor = "[J")
	public static final long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(ZII)Z")
	public static boolean method1451(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(BI)V")
	public static void method1452(@OriginalArg(1) int arg0) {
		if (!Static286.aClass1_Sub15_Sub1_1.aBoolean535) {
			arg0 = -1;
		}
		if (Static450.anInt7887 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(28) Class285 local28 = Static440.aClass273_1.method6999(arg0);
			@Pc(32) Class70 local32 = local28.method7402();
			if (local32 == null) {
				arg0 = -1;
			} else {
				Static473.aClass229_14.method6074(local32.method1924(), local32.method1919(), Static312.aCanvas12, new Point(local28.anInt8473, local28.anInt8471), local32.method1926());
				Static450.anInt7887 = arg0;
			}
		}
		if (arg0 == -1 && Static450.anInt7887 != -1) {
			Static473.aClass229_14.method6074(-1, -1, Static312.aCanvas12, new Point(), null);
			Static450.anInt7887 = -1;
		}
	}
}
