import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "Ljava/lang/Object;")
	public static Object anObject15;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "Lclient!qga;")
	public static Class282 aClass282_1;

	@OriginalMember(owner = "client!lo", name = "n", descriptor = "Lclient!sea;")
	public static Class308 aClass308_109;

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "J")
	public static long aLong137 = 0L;

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "Lclient!go;")
	public static final Class121 aClass121_8 = new Class121(2, 4, 4, 0);

	@OriginalMember(owner = "client!lo", name = "p", descriptor = "Lclient!rg;")
	public static final Class295 aClass295_4 = new Class295(14, 7);

	@OriginalMember(owner = "client!lo", name = "q", descriptor = "Z")
	public static boolean aBoolean438 = false;

	@OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
	public static int anInt5647 = 0;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)V")
	public static void method4596(@OriginalArg(1) int arg0) {
		Static307.anInt7603 = arg0;
		Static133.anInt2648 = 2;
		if (Static213.aString42 == null) {
			Static501.method7054(35);
		} else {
			@Pc(24) Class1_Sub3 local24 = new Class1_Sub3(Static594.method7983(Static550.method7498(Static213.aString42)));
			@Pc(28) long local28 = local24.method7949();
			Static73.aLong42 = local24.method7949();
			Static181.method2849(Static56.method961(local28), true, "");
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZZII)I")
	public static int method4597(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class1_Sub45 local13 = Static365.method5366(arg1, arg0);
		if (local13 == null) {
			return -1;
		} else if (arg2 >= 0 && local13.anIntArray521.length > arg2) {
			return local13.anIntArray521[arg2];
		} else {
			return -1;
		}
	}
}
