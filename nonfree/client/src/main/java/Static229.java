import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
	public static int anInt4491;

	@OriginalMember(owner = "client!qk", name = "cb", descriptor = "Lclient!qm;")
	public static Class22_Sub3_Sub2 aClass22_Sub3_Sub2_2;

	@OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
	public static int anInt4478 = 0;

	@OriginalMember(owner = "client!qk", name = "gb", descriptor = "[I")
	public static int[] anIntArray419 = new int[4096];

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BI)V")
	public static void method3597(@OriginalArg(1) int arg0) {
		if (!Static131.aBoolean192) {
			arg0 = -1;
		}
		if (Static56.anInt1112 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(26) Class38 local26 = Static107.method1772(arg0);
			@Pc(30) Class1_Sub1_Sub3_Sub2 local30 = local26.method821();
			if (local30 == null) {
				arg0 = -1;
			} else {
				Static117.aClass117_3.method3003(new Point(local26.anInt888, local26.anInt886), local30.method3473(), local30.anInt5889, Static304.aCanvas1, local30.anInt5884);
				Static56.anInt1112 = arg0;
			}
		}
		if (arg0 == -1 && Static56.anInt1112 != -1) {
			Static117.aClass117_3.method3003(new Point(), null, -1, Static304.aCanvas1, -1);
			Static56.anInt1112 = -1;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Lclient!gb;")
	public static Class59 method3600(@OriginalArg(1) int arg0) {
		@Pc(10) Class59 local10 = (Class59) Static270.aClass169_140.method4017((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static271.aClass138_74.method3346(4, arg0);
		local10 = new Class59();
		if (local20 != null) {
			local10.method1243(arg0, new Class1_Sub14(local20));
		}
		Static270.aClass169_140.method4016(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI)I")
	public static int method3601(@OriginalArg(1) int arg0) {
		if (Static81.aClass7_2 != null) {
			Static81.aClass7_2.method105();
			Static81.aClass7_2 = null;
		}
		Static233.anInt4689++;
		if (Static233.anInt4689 > 4) {
			Static233.anInt4689 = 0;
			Static130.anInt2576 = 0;
			return arg0;
		}
		Static130.anInt2576 = 0;
		if (Static66.anInt1306 == Static122.anInt2459) {
			Static122.anInt2459 = Static215.anInt4229;
		} else {
			Static122.anInt2459 = Static66.anInt1306;
		}
		return -1;
	}
}
