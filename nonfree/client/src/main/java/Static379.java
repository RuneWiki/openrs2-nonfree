import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static379 {

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_207 = new Class194(18, 3);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBI)Z")
	public static boolean method5970(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIZII)V")
	public static void method5972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181() == 0) {
			Static412.method6389(false);
		} else {
			Static94.anInt1855 = Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181();
			Static230.method3973(0, true);
		}
		Static389.aBoolean505 = arg2;
		Static561.anInt9314 = arg1;
		Static436.anInt7572 = arg3;
		Static598.method2546(arg0);
	}
}
