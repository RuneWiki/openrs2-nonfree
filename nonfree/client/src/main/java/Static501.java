import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!sv", name = "n", descriptor = "I")
	public static int anInt8647;

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "I")
	public static int anInt8648;

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "Lclient!de;")
	public static final Class3_Sub11 aClass3_Sub11_1 = new Class3_Sub11(0, 0);

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "[I")
	public static int[] anIntArray518 = new int[1];

	@OriginalMember(owner = "client!sv", name = "r", descriptor = "I")
	public static int anInt8649 = 0;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIZZ[Lclient!pca;)V")
	public static void method6727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) Class251[] arg4) {
		for (@Pc(5) int local5 = 0; local5 < arg4.length; local5++) {
			@Pc(13) Class251 local13 = arg4[local5];
			if (local13 != null && arg2 == local13.anInt7280) {
				Static97.method2031(local13, arg3, arg1, arg0);
				Static586.method7969(arg1, arg0, local13);
				if (local13.anInt7234 - local13.anInt7285 < local13.anInt7274) {
					local13.anInt7274 = local13.anInt7234 - local13.anInt7285;
				}
				if (local13.anInt7202 - local13.anInt7215 < local13.anInt7275) {
					local13.anInt7275 = local13.anInt7202 - local13.anInt7215;
				}
				if (local13.anInt7274 < 0) {
					local13.anInt7274 = 0;
				}
				if (local13.anInt7275 < 0) {
					local13.anInt7275 = 0;
				}
				if (local13.anInt7231 == 0) {
					Static479.method6546(local13, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
	public static void method6728() {
		Static161.anInt3613 = 0;
		Static260.aClass244_40.method5581();
		Static289.aBoolean370 = false;
	}
}
