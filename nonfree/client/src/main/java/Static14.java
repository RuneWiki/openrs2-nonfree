import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!cd", name = "X", descriptor = "[I")
	public static int[] anIntArray80;

	@OriginalMember(owner = "client!cd", name = "B", descriptor = "[[I")
	public static int[][] anIntArrayArray9 = new int[5][5000];

	@OriginalMember(owner = "client!cd", name = "J", descriptor = "Z")
	public static boolean aBoolean19 = false;

	@OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
	public static int anInt475 = 0;

	@OriginalMember(owner = "client!cd", name = "Q", descriptor = "Lclient!sc;")
	private static Class66 aClass66_302 = Static106.method1849("To create a new account you need to");

	@OriginalMember(owner = "client!cd", name = "O", descriptor = "Lclient!sc;")
	public static Class66 aClass66_301 = aClass66_302;

	@OriginalMember(owner = "client!cd", name = "R", descriptor = "Lclient!sc;")
	public static Class66 aClass66_303 = Static106.method1849("Angreifen");

	@OriginalMember(owner = "client!cd", name = "S", descriptor = "I")
	public static int anInt477 = 0;

	@OriginalMember(owner = "client!cd", name = "Y", descriptor = "Lclient!sc;")
	private static Class66 aClass66_305 = Static106.method1849("Examine");

	@OriginalMember(owner = "client!cd", name = "T", descriptor = "Lclient!sc;")
	public static Class66 aClass66_304 = aClass66_305;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZZI)I")
	public static int method405() {
		return Static15.anInt2943 + Static79.anInt2165;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BIIII)V")
	public static void method408(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static94.anInt2420; local3++) {
			if (arg0 < Static27.anIntArray103[local3] + Static2.anIntArray16[local3] && Static27.anIntArray103[local3] < arg1 + arg0 && Static99.anIntArray180[local3] + Static13.anIntArray76[local3] > arg3 && Static99.anIntArray180[local3] < arg2 + arg3) {
				Static128.aBooleanArray18[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V")
	public static void method409() {
		aClass66_303 = null;
		aClass66_304 = null;
		aClass66_301 = null;
		anIntArrayArray9 = null;
		aClass66_305 = null;
		anIntArray80 = null;
		aClass66_302 = null;
	}
}
