import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static230 {

	@OriginalMember(owner = "client!on", name = "b", descriptor = "Lclient!qm;")
	public static Class174 aClass174_8;

	@OriginalMember(owner = "client!on", name = "c", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_74 = new Class217(52, 8);

	@OriginalMember(owner = "client!on", name = "d", descriptor = "[J")
	public static final long[] aLongArray4 = new long[32];

	@OriginalMember(owner = "client!on", name = "g", descriptor = "I")
	public static int anInt1972 = 0;

	@OriginalMember(owner = "client!on", name = "h", descriptor = "Z")
	public static boolean aBoolean143 = true;

	@OriginalMember(owner = "client!on", name = "i", descriptor = "Lclient!il;")
	public static final Class93 aClass93_10 = new Class93(1, 15);

	@OriginalMember(owner = "client!on", name = "j", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_70 = new Class106("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!on", name = "k", descriptor = "Z")
	public static boolean aBoolean144 = false;

	@OriginalMember(owner = "client!on", name = "l", descriptor = "I")
	public static int anInt1973 = 500;

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(II)I")
	public static int method1864(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(III)I")
	public static int method1866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static236.anIntArray381[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V")
	public static void method1869() {
		if (Static150.method4956() || Static284.anInt6477 == Static75.anInt3288) {
			Static49.method1167(Static9.aClass63_1);
			if (Static132.anInt2868 != Static284.anInt6477) {
				Static113.method2410();
			}
		} else {
			Static231.method4294(false, false, Static171.anInt3574, Static145.anInt3091);
		}
	}
}
