import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!de", name = "U", descriptor = "I")
	public static int anInt951;

	@OriginalMember(owner = "client!de", name = "M", descriptor = "I")
	public static int anInt944 = 0;

	@OriginalMember(owner = "client!de", name = "R", descriptor = "I")
	public static int anInt949 = 0;

	@OriginalMember(owner = "client!de", name = "S", descriptor = "Lclient!an;")
	public static Class10 aClass10_8 = new Class10();

	@OriginalMember(owner = "client!de", name = "V", descriptor = "I")
	public static int anInt952 = 0;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "(I)V")
	public static void method747() {
		if (Static25.anInt448 != -1) {
			Static159.method2494(Static25.anInt448);
		}
		for (@Pc(14) int local14 = 0; local14 < Static220.anInt4365; local14++) {
			if (Static222.aBooleanArray20[local14]) {
				Static72.aBooleanArray11[local14] = true;
			}
			Static196.aBooleanArray17[local14] = Static222.aBooleanArray20[local14];
			Static222.aBooleanArray20[local14] = false;
		}
		Static218.anInt5375 = -1;
		Static267.anInt3572 = -1;
		Static236.anInt3712 = Static104.anInt2226;
		Static276.aClass22_20 = null;
		if (Static178.aBoolean216) {
			Static272.aBoolean337 = true;
		}
		if (Static25.anInt448 != -1) {
			Static220.anInt4365 = 0;
			Static299.method4400();
		}
		if (Static178.aBoolean216) {
			Static186.method2957();
		} else {
			Static166.method2629();
		}
		Static16.anInt307 = 0;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
	public static void method748() {
		Static16.anInt311 = -1;
		Static254.anInt4785 = -3;
		Static277.anInt5177 = 1;
		Static214.anInt4266 = 0;
		Static126.aBoolean178 = false;
		Static230.anInt4510 = 0;
		Static223.anInt4427 = 0;
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(Z)V")
	public static void method749() {
		Static142.aClass4_Sub17_Sub1_3.method1905(59);
		for (@Pc(10) Class4_Sub10 local10 = (Class4_Sub10) Static227.aClass97_16.method2363(); local10 != null; local10 = (Class4_Sub10) Static227.aClass97_16.method2367()) {
			if (local10.anInt1029 == 0) {
				Static284.method4279(local10, true);
			}
		}
		if (Static32.aClass22_4 != null) {
			Static81.method3274(Static32.aClass22_4);
			Static32.aClass22_4 = null;
		}
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(Z)V")
	public static void method750() {
		aClass10_8 = null;
	}
}
