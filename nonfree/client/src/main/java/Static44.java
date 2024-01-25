import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "B")
	public static byte aByte11;

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "Z")
	public static boolean aBoolean32 = false;

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
	public static int anInt579 = -1;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZLclient!r;Lclient!oe;I)V")
	public static void method527(@OriginalArg(2) Class44 arg0, @OriginalArg(3) Class244 arg1) {
		Static264.aClass244_39.method5962();
		if (Static267.aBoolean377) {
			return;
		}
		for (@Pc(20) Class4_Sub17 local20 = (Class4_Sub17) arg1.method5963(); local20 != null; local20 = (Class4_Sub17) arg1.method5965()) {
			@Pc(28) Class338 local28 = Static455.aClass142_2.method3366(local20.anInt2866);
			if (Static333.method5935(local28)) {
				@Pc(40) boolean local40 = Static12.method178(local28, arg0, local20);
				if (local40) {
					Static79.method1261(local20, arg0, local28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
	public static void method528() {
		Static518.anInt9302 = 0;
		Static180.anInt3623 = 0;
		Static343.anInt6653 = 0;
		Static281.anInt5748 = Static279.anInt5708;
		Static430.aClass314Array3 = new Class314[1000];
		Static195.anInt3778 = 0;
		Static300.anIntArrayArrayArray13 = new int[Static345.anInt6662][Static182.anInt3633 + 1][Static253.anInt4651 + 1];
		Static70.aClass314Array2 = new Class314[500];
		Static8.aClass314Array1 = new Class314[500];
		Static402.aBoolean525 = false;
		Static485.aClass314Array4 = new Class314[2000];
		Static211.anInt3940 = Static279.anInt5708;
		if (Static468.aClass44_7 instanceof l) {
			Static368.aBoolean505 = false;
		} else {
			Static368.aBoolean505 = true;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IBI)V")
	public static void method529(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static438.aClass92_4 == Static264.aClass92_3) {
			if (Static398.method6283(0, arg1, 0, -2, false, 1, arg0, 1)) {
				return;
			}
			Static398.method6283(0, arg1, 0, -3, false, 1, arg0, 1);
		} else if (Static398.method6283(0, arg1, 0, -3, false, 1, arg0, 1)) {
			return;
		} else {
			Static398.method6283(0, arg1, 0, -2, false, 1, arg0, 1);
		}
	}
}
