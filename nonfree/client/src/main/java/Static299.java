import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "Lclient!f;")
	public static Class78 aClass78_11;

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "Lclient!ob;")
	public static Class241 aClass241_3;

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "Lclient!jn;")
	public static Class176 aClass176_76;

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
	public static int anInt6041;

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "[I")
	public static final int[] anIntArray295 = new int[13];

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "S")
	public static short aShort76 = 205;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
	public static void method5142() {
		Static401.aClass32Array1 = null;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method5143(@OriginalArg(0) String arg0) {
		if (!Static368.aClass354_4.aBoolean711) {
			return -1;
		} else if (Static210.aHashtable4.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static102.method5286(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(33) String local33 = Static210.aString36 + local20;
			if (!Static357.aClass176_90.method4006("", local33)) {
				return -1;
			} else if (Static357.aClass176_90.method4004(local33)) {
				@Pc(61) byte[] local61 = Static357.aClass176_90.method3972(local33, "");
				@Pc(75) File local75;
				try {
					local75 = Static131.method2639(local20);
				} catch (@Pc(77) RuntimeException local77) {
					return -1;
				}
				if (local61 == null || local75 == null) {
					return -1;
				}
				@Pc(85) boolean local85 = true;
				@Pc(89) byte[] local89 = Static378.method5224(local75);
				if (local89 != null && local89.length == local61.length) {
					for (@Pc(102) int local102 = 0; local102 < local89.length; local102++) {
						if (local89[local102] != local61[local102]) {
							local85 = false;
							break;
						}
					}
				} else {
					local85 = false;
				}
				try {
					if (!local85) {
						Static368.aClass354_4.method8229(local61, local75);
					}
				} catch (@Pc(130) Throwable local130) {
					return -1;
				}
				Static221.method3602(local75, arg0);
				return 100;
			} else {
				return Static357.aClass176_90.method3983(local33);
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IFIIIIII[FIIFF)V")
	public static void method5147(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) float arg11) {
		@Pc(5) int local5 = arg0 - arg2;
		@Pc(13) int local13 = arg6 - arg9;
		@Pc(17) int local17 = arg5 - arg8;
		@Pc(38) float local38 = arg7[1] * (float) local5 + arg7[0] * (float) local13 + arg7[2] * (float) local17;
		@Pc(59) float local59 = arg7[5] * (float) local17 + (float) local13 * arg7[3] + (float) local5 * arg7[4];
		@Pc(80) float local80 = (float) local5 * arg7[7] + arg7[6] * (float) local13 + (float) local17 * arg7[8];
		@Pc(95) float local95;
		@Pc(89) float local89;
		if (arg3 == 0) {
			local89 = arg11 + 0.5F - local80;
			local95 = arg1 + local38 + 0.5F;
		} else if (arg3 == 1) {
			local89 = arg11 + local80 + 0.5F;
			local95 = arg1 + local38 + 0.5F;
		} else if (arg3 == 2) {
			local89 = arg10 + 0.5F - local59;
			local95 = arg1 + 0.5F - local38;
		} else if (arg3 == 3) {
			local95 = arg1 + local38 + 0.5F;
			local89 = arg10 + 0.5F - local59;
		} else if (arg3 == 4) {
			local89 = arg10 + 0.5F - local59;
			local95 = local80 + arg11 + 0.5F;
		} else {
			local95 = arg11 + 0.5F - local80;
			local89 = arg10 + 0.5F - local59;
		}
		@Pc(208) float local208;
		if (arg4 == 1) {
			local208 = local95;
			local95 = -local89;
			local89 = local208;
		} else if (arg4 == 2) {
			local89 = -local89;
			local95 = -local95;
		} else if (arg4 == 3) {
			local208 = local95;
			local95 = local89;
			local89 = -local208;
		}
		Static592.aFloat230 = local89;
		Static56.aFloat28 = local95;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIZ)Z")
	public static boolean method5148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static562.method8063(arg0, arg1) | (arg0 & 0x70000) != 0 || Static485.method7231(arg0, arg1);
	}
}
