import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "[I")
	public static int[] anIntArray614;

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
	public static int anInt7704;

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "Lclient!aq;")
	public static Class17 aClass17_4;

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
	public static int anInt7696 = 0;

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
	public static int anInt7698 = -1;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILclient!kg;I)V")
	public static void method6359(@OriginalArg(1) int arg0, @OriginalArg(2) Class171 arg1, @OriginalArg(3) int arg2) {
		Static82.aClass171ArrayArray1[arg0][arg2] = arg1;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZLclient!fca;)V")
	public static void method6362(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class97 arg1) {
		@Pc(15) int local15 = arg1.anInt2307 == 0 ? arg1.anInt2340 : arg1.anInt2307;
		@Pc(27) int local27 = arg1.anInt2321 == 0 ? arg1.anInt2305 : arg1.anInt2321;
		Static266.method3780(arg1.anInt2311, local27, Static375.aClass97ArrayArray1[arg1.anInt2311 >> 16], arg0, local15);
		if (arg1.aClass97Array1 != null) {
			Static266.method3780(arg1.anInt2311, local27, arg1.aClass97Array1, arg0, local15);
		}
		@Pc(68) Class6_Sub31 local68 = (Class6_Sub31) Static564.aClass212_39.method5106((long) arg1.anInt2311);
		if (local68 != null) {
			Static286.method4060(local68.anInt4563, local27, local15, arg0);
		}
	}
}
