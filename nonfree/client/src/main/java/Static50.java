import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!caa", name = "G", descriptor = "Lclient!pl;")
	public static Class259 aClass259_26;

	@OriginalMember(owner = "client!caa", name = "I", descriptor = "I")
	public static int anInt1258;

	@OriginalMember(owner = "client!caa", name = "C", descriptor = "Lclient!ae;")
	public static final Class8 aClass8_4 = new Class8();

	@OriginalMember(owner = "client!caa", name = "F", descriptor = "Lclient!lt;")
	public static final Class213 aClass213_1 = new Class213();

	@OriginalMember(owner = "client!caa", name = "H", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_17 = new Class286(57, 8);

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIIII)V")
	public static void method894(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static364.anInt6471 == 1) {
			Static52.aClass39Array2[Static516.anInt8581 / 100].method7851(Static210.anInt4044 - 8, Static148.anInt3055 + -8);
		}
		if (Static364.anInt6471 == 2) {
			Static52.aClass39Array2[Static516.anInt8581 / 100 + 4].method7851(Static210.anInt4044 - 8, Static148.anInt3055 - 8);
		}
		Static76.method1194();
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(ILclient!qi;BI)V")
	public static void method897(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1_Sub1_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static598.method1134(local6, 0, local6.length, arg2);
		Static316.method4922(arg0, local6, arg1);
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIIBI)V")
	public static void method898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(5) int local5 = 0; local5 < Static451.anInt488; local5++) {
			@Pc(13) Rectangle local13 = Class230.aRectangleArray1[local5];
			if (local13.width + local13.x > arg3 && local13.x < arg3 + arg0 && arg1 < local13.height + local13.y && local13.y < arg2 + arg1) {
				Static295.aBooleanArray36[local5] = true;
			}
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lclient!rca;B)I")
	public static int method899(@OriginalArg(0) Class280 arg0) {
		if (Static286.aClass280_3 == arg0) {
			return 9216;
		} else if (Static512.aClass280_4 == arg0) {
			return 34065;
		} else if (Static267.aClass280_2 == arg0) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
