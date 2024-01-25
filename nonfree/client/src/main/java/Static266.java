import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static266 {

	@OriginalMember(owner = "client!kaa", name = "q", descriptor = "F")
	public static float aFloat126;

	@OriginalMember(owner = "client!kaa", name = "s", descriptor = "Lclient!fo;")
	public static Class112 aClass112_7;

	@OriginalMember(owner = "client!kaa", name = "l", descriptor = "J")
	public static long aLong115 = -1L;

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(B)V")
	public static void method3708() {
		if (Static570.aBoolean772) {
			return;
		}
		if (Static257.aClass2_Sub35_Sub1_1.aBoolean638) {
			Static541.aFloat128 = (int) Static541.aFloat128 + 47 & 0xFFFFFFF0;
		} else {
			Static452.aFloat192 += (12.0F - Static452.aFloat192) / 2.0F;
		}
		Static570.aBoolean772 = true;
		Static122.aBoolean139 = true;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IZ)I")
	public static int method3709(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V")
	public static void method3710() {
		Static84.aClass2_Sub3_Sub2_7.method2057();
		Static467.aClass229_108 = null;
		Static488.aClass2_Sub3_Sub2_5 = null;
		Static25.anInt442 = 1;
	}
}
