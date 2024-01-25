import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!on", name = "k", descriptor = "F")
	public static float aFloat118;

	@OriginalMember(owner = "client!on", name = "o", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method5282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static204.method3515(arg5)) {
			if (Static520.aClass156ArrayArray2[arg5] == null) {
				Static449.method6412(arg4, -1, arg1, arg6, arg0, arg3, arg2, arg7, Static396.aClass156ArrayArray1[arg5]);
			} else {
				Static449.method6412(arg4, -1, arg1, arg6, arg0, arg3, arg2, arg7, Static520.aClass156ArrayArray2[arg5]);
			}
		} else if (arg2 == -1) {
			for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
				Static3.aBooleanArray1[local20] = true;
			}
		} else {
			Static3.aBooleanArray1[arg2] = true;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I[FB)[F")
	public static float[] method5283(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static551.method3491(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method5284(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		Static342.aClass171_98.anInt4998 = 1;
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(19) short[] local19 = new short[16];
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < Static342.aClass250_2.anInt7128; local23++) {
			@Pc(30) Class133 local30 = Static342.aClass250_2.method5980(local23);
			if ((!arg0 || local30.aBoolean282) && local30.anInt3921 == -1 && local30.anInt3942 == -1 && local30.anInt3947 == 0 && local30.aString38.toLowerCase().indexOf(local11) != -1) {
				if (local21 >= 250) {
					Static161.anInt2921 = -1;
					Static482.aShortArray130 = null;
					return;
				}
				if (local19.length <= local21) {
					@Pc(82) short[] local82 = new short[local19.length * 2];
					for (@Pc(84) int local84 = 0; local84 < local21; local84++) {
						local82[local84] = local19[local84];
					}
					local19 = local82;
				}
				local19[local21++] = (short) local23;
			}
		}
		Static445.anInt7648 = 0;
		Static161.anInt2921 = local21;
		Static482.aShortArray130 = local19;
		@Pc(126) String[] local126 = new String[Static161.anInt2921];
		for (@Pc(128) int local128 = 0; local128 < Static161.anInt2921; local128++) {
			local126[local128] = Static342.aClass250_2.method5980(local19[local128]).aString38;
		}
		Static412.method5617(Static482.aShortArray130, local126);
		Static342.aClass171_98.method4347();
		Static342.aClass171_98.anInt4998 = 2;
	}
}
