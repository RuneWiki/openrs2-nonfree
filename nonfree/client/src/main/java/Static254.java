import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
	public static int anInt4973;

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_72 = new Class45("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BII)Z")
	public static boolean method4603(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIII)I")
	public static int method4605(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg2;
		@Pc(13) int local13 = arg0 & arg2 - 1;
		@Pc(17) int local17 = arg1 / arg2;
		@Pc(23) int local23 = arg1 & arg2 - 1;
		@Pc(28) int local28 = Static525.method8026(local7, local17);
		@Pc(37) int local37 = Static525.method8026(local7 + 1, local17);
		@Pc(44) int local44 = Static525.method8026(local7, local17 + 1);
		@Pc(53) int local53 = Static525.method8026(local7 + 1, local17 + 1);
		@Pc(62) int local62 = Static532.method8102(local28, local37, arg2, local13);
		@Pc(71) int local71 = Static532.method8102(local44, local53, arg2, local13);
		return Static532.method8102(local62, local71, arg2, local23);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "([Lclient!et;IIZII)V")
	public static void method4606(@OriginalArg(0) Class91[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class91 local13 = arg0[local7];
			if (local13 != null && arg1 == local13.anInt2375) {
				Static543.method8256(local13, arg3, arg2, arg4);
				Static28.method799(local13, arg3, arg4);
				if (local13.anInt2449 > local13.anInt2446 - local13.anInt2399) {
					local13.anInt2449 = local13.anInt2446 - local13.anInt2399;
				}
				if (local13.anInt2444 - local13.anInt2378 < local13.anInt2406) {
					local13.anInt2406 = local13.anInt2444 - local13.anInt2378;
				}
				if (local13.anInt2449 < 0) {
					local13.anInt2449 = 0;
				}
				if (local13.anInt2406 < 0) {
					local13.anInt2406 = 0;
				}
				if (local13.anInt2452 == 0) {
					Static64.method1611(local13, arg2);
				}
			}
		}
	}
}
