import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static230 {

	@OriginalMember(owner = "client!io", name = "f", descriptor = "I")
	public static int anInt4670 = 0;

	@OriginalMember(owner = "client!io", name = "i", descriptor = "I")
	public static int anInt4673 = 0;

	@OriginalMember(owner = "client!io", name = "r", descriptor = "I")
	public static int anInt4679 = 0;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(III)Z")
	public static boolean method3739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static584.method7945(arg0, arg1) | Static310.method4645(arg1, arg0) | Static370.method5107(arg1, arg0)) & Static160.method2925(arg0, arg1);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)V")
	public static void method3740() {
		Static527.aClass342_205.method7697(50);
		Static472.aClass342_164.method7697(50);
		Static294.aClass342_114.method7697(50);
		Static465.aClass342_160.method7697(50);
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V")
	public static void method3741() {
		Static533.anIntArray536 = Static91.method1976(0.4F);
	}
}
