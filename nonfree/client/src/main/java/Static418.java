import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "Z")
	public static boolean aBoolean509 = false;

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
	public static int anInt7398 = 0;

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_162 = new Class40(19, 0);

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "()V")
	public static void method6130() {
		Static28.method417(Static41.anInt687);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method6132(@OriginalArg(2) String arg0) {
		Static164.method2396("", 4, "", arg0, 0, "");
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBI)Ljava/lang/String;")
	public static String method6133(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 - arg0;
		if (local15 < -9) {
			return "<col=ff0000>";
		} else if (local15 < -6) {
			return "<col=ff3000>";
		} else if (local15 < -3) {
			return "<col=ff7000>";
		} else if (local15 < 0) {
			return "<col=ffb000>";
		} else if (local15 > 9) {
			return "<col=00ff00>";
		} else if (local15 > 6) {
			return "<col=40ff00>";
		} else if (local15 > 3) {
			return "<col=80ff00>";
		} else if (local15 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "([[BZLclient!m;)V")
	public static void method6134(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class193_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg0[local17];
			if (local23 != null) {
				@Pc(30) Class6_Sub14 local30 = new Class6_Sub14(local23);
				local36 = Static35.anIntArray45[local17] >> 8;
				@Pc(42) int local42 = Static35.anIntArray45[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static218.anInt3718;
				@Pc(56) int local56 = local42 * 64 - Static167.anInt3048;
				Static11.method182();
				arg1.method4171(local30, local56, Static167.anInt3048, local49, Static296.aClass295Array3, Static218.anInt3718);
				arg1.method4192(local56, Static176.aClass121_5, local30, local12, local49);
				if (!arg1.aBoolean293 && local36 == Static274.anInt3319 / 8 && local42 == Static374.anInt6445 / 8 && local12[0] != -1) {
					Static285.aClass89_1 = Static316.aClass141_1.method3011(local12[2], local12[0], Static264.aClass124_1, local12[1], local12[3]);
					Static209.anInt3617 = local12[4];
				}
			}
		}
		for (@Pc(132) int local132 = 0; local132 < local15; local132++) {
			@Pc(145) int local145 = (Static35.anIntArray45[local132] >> 8) * 64 - Static218.anInt3718;
			local36 = (Static35.anIntArray45[local132] & 0xFF) * 64 - Static167.anInt3048;
			@Pc(160) byte[] local160 = arg0[local132];
			if (local160 == null && Static374.anInt6445 < 800) {
				Static11.method182();
				arg1.method4176(local36, local145);
			}
		}
	}
}
