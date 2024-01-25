import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!av", name = "c", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_29 = new Class123(74, -2);

	@OriginalMember(owner = "client!av", name = "l", descriptor = "Z")
	public static boolean aBoolean26 = false;

	@OriginalMember(owner = "client!av", name = "m", descriptor = "[I")
	public static final int[] anIntArray21 = new int[13];

	@OriginalMember(owner = "client!av", name = "n", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_7 = new Class267("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IIIBII)V")
	public static void method493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static291.aClass28_Sub1_1.anInt1042 != 0 && arg3 != 0 && Static415.anInt7434 < 50 && arg1 != -1) {
			Static302.aClass241Array1[Static415.anInt7434++] = new Class241((byte) 1, arg1, arg3, arg4, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class101 local7 = Static409.aClass101ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class145 local13 = local7.aClass145_1; local13 != null; local13 = local13.aClass145_2) {
			@Pc(17) Class3_Sub2 local17 = local13.aClass3_Sub2_2;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort101 == arg1 && local17.aShort102 == arg2) {
				Static384.method5696(local17);
				return;
			}
		}
	}
}
