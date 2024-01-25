import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!fj", name = "p", descriptor = "Lclient!vg;")
	public static Class354 aClass354_1;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "[F")
	public static final float[] aFloatArray33 = new float[16];

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!ha;Lclient!kba;II)V")
	public static void method3112(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Class163 arg1) {
		Static15.aClass163_8.method4970();
		if (Static69.aBoolean186) {
			return;
		}
		for (@Pc(16) Class6_Sub48 local16 = (Class6_Sub48) arg1.method4966(); local16 != null; local16 = (Class6_Sub48) arg1.method4965()) {
			@Pc(26) Class36 local26 = Static491.aClass345_4.method8044(local16.anInt9722);
			if (Static160.method3124(local26)) {
				@Pc(38) boolean local38 = Static457.method6897(local26, local16, arg0);
				if (local38) {
					Static186.method3464(arg0, local16, local26);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZIIIIII)V")
	public static void method3113(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static87.aClass6_Sub33_6.aClass14_Sub22_3.method7288() != 0 && arg2 != 0 && Static530.anInt9223 < 50 && arg5 != -1) {
			Static433.aClass343Array1[Static530.anInt9223++] = new Class343((byte) 2, arg5, arg2, arg1, arg3, arg4, arg0, (Class9_Sub4) null);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BLclient!em;)Ljava/lang/String;")
	public static String method3114(@OriginalArg(1) Class6_Sub5_Sub9 arg0) {
		if (arg0.aString24 == null || arg0.aString24.length() == 0) {
			return arg0.aString25 == null || arg0.aString25.length() <= 0 ? arg0.aString26 : arg0.aString26 + Static536.aClass316_34.method7577(Static638.anInt10709) + arg0.aString25;
		} else if (arg0.aString25 == null || arg0.aString25.length() <= 0) {
			return arg0.aString26 + Static536.aClass316_34.method7577(Static638.anInt10709) + arg0.aString24;
		} else {
			return arg0.aString26 + Static536.aClass316_34.method7577(Static638.anInt10709) + arg0.aString25 + Static536.aClass316_34.method7577(Static638.anInt10709) + arg0.aString24;
		}
	}
}
