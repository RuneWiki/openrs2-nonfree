import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!db", name = "c", descriptor = "Lclient!qf;")
	public static Class66 aClass66_2;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "Lclient!sg;")
	private static Class77 aClass77_362 = Static146.method2172("Please wait)3)3)3");

	@OriginalMember(owner = "client!db", name = "j", descriptor = "Lclient!sg;")
	public static Class77 aClass77_361 = aClass77_362;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "I")
	public static int anInt874 = 0;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "Lclient!sg;")
	public static Class77 aClass77_363 = Static146.method2172("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!db", name = "s", descriptor = "Lclient!sg;")
	public static Class77 aClass77_364 = Static146.method2172(")1p");

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
	public static void method608() {
		aClass77_363 = null;
		aClass77_362 = null;
		aClass66_2 = null;
		aClass77_364 = null;
		aClass77_361 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)I")
	public static int method609(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class2_Sub2_Sub3_Sub1.anIntArray52[arg0 * 1024 / arg2] >> 1;
		return (local21 * arg1 >> 16) + ((65536 - local21) * arg3 >> 16);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II[IZ)I")
	public static int method610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		return arg0 * arg2[1] + arg1 * arg2[0];
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Z")
	public static boolean method611(@OriginalArg(1) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}
}
