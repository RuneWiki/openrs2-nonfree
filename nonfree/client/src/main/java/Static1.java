import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "c", descriptor = "I")
	public static int anInt3;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIII)V")
	public static void method1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static280.anInt212 <= arg0 - arg2 && Static346.anInt6607 >= arg0 + arg2 && arg1 - arg2 >= Static240.anInt4829 && arg1 + arg2 <= Static166.anInt3315) {
			Static242.method4803(arg1, arg3, arg0, arg2);
		} else {
			Static282.method4707(arg3, arg1, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public static void method3() {
		Static236.anInt4752 = -1;
		Static203.anInt4155 = 0;
		Static99.anInt820 = 0;
		Static243.anInt6755 = -3;
		Static314.aBoolean140 = false;
		Static106.anInt1979 = 0;
		Static262.anInt5359 = 1;
	}
}
