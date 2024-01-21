import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "[I")
	public static int[] anIntArray226;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "[Lclient!tg;")
	public static Class1_Sub1_Sub12_Sub4[] aClass1_Sub1_Sub12_Sub4Array5;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public static void method1103() {
		anIntArray226 = null;
		aClass1_Sub1_Sub12_Sub4Array5 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public static void method1104() {
		Static25.aClass1_Sub8_Sub1_1.method919(190);
		Static25.aClass1_Sub8_Sub1_1.method873(0L);
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)Z")
	public static boolean method1105() {
		@Pc(5) Class35 local5 = Static129.aClass35_1;
		synchronized (Static129.aClass35_1) {
			if (Static91.anInt2415 == Static7.anInt324) {
				return false;
			} else {
				Static102.anInt2582 = Static160.anIntArray540[Static7.anInt324];
				Static105.anInt2704 = Static98.anIntArray311[Static7.anInt324];
				Static7.anInt324 = Static7.anInt324 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)I")
	public static int method1106(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub21 local10 = (Class1_Sub21) Static82.aClass10_6.method256((long) arg1);
		if (local10 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local10.anIntArray513.length) {
			return local10.anIntArray513[arg0];
		} else {
			return -1;
		}
	}
}
