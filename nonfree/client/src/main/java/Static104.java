import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static104 {

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
	public static int anInt2212 = -2;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString74 = "red:";

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)V")
	public static void method1982(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static220.method3565();
		} else if (arg0 == 2) {
			Static186.method3145();
		} else if (arg0 == 3) {
			Static46.method876();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!nm;II)Lclient!lj;")
	public static Class1_Sub5_Sub6 method1983(@OriginalArg(1) Class119 arg0, @OriginalArg(2) int arg1) {
		return Static114.method2083(arg1, arg0, 0) ? Static175.method2998() : null;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!nm;)V")
	public static void method1984(@OriginalArg(1) Class119 arg0) {
		Static107.aClass119_41 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static188.anInt3598 <= arg3 && arg0 <= Static289.anInt5245 && arg1 >= Static231.anInt4333 && Static218.anInt4086 >= arg5) {
			Static213.method4576(arg3, arg2, arg0, arg4, arg6, arg5, arg1);
		} else {
			Static207.method4484(arg3, arg1, arg2, arg6, arg4, arg0, arg5);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)I")
	public static int method1986(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V")
	public static void method1987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static284.anInt5151 = Static54.aClass43ArrayArray1[arg0][arg1].anInt1334;
		Static219.anInt4096 = Static54.aClass43ArrayArray1[arg0][arg1].anInt1340;
		Static44.anInt1026 = Static54.aClass43ArrayArray1[arg0][arg1].anInt1331;
		Static65.method1146((float) Static284.anInt5151, (float) Static219.anInt4096, (float) Static44.anInt1026);
	}
}
