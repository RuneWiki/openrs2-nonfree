import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!pia", name = "g", descriptor = "I")
	public static int anInt7597;

	@OriginalMember(owner = "client!pia", name = "j", descriptor = "[I")
	public static int[] anIntArray648;

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "[I")
	public static final int[] anIntArray646 = new int[5];

	@OriginalMember(owner = "client!pia", name = "e", descriptor = "[I")
	public static final int[] anIntArray647 = new int[500];

	@OriginalMember(owner = "client!pia", name = "h", descriptor = "I")
	public static int anInt7598 = -1;

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(Ljava/lang/String;Lclient!aa;IILclient!or;IILclient!eia;Lclient!da;III)V")
	public static void method6704(@OriginalArg(0) String arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class260 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class88 arg6, @OriginalArg(8) Class69 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(13) int local13;
		if (Static428.anInt6834 == 4) {
			local13 = (int) Static618.aFloat207 & 0x3FFF;
		} else {
			local13 = (int) Static618.aFloat207 + Static490.anInt8101 & 0x3FFF;
		}
		@Pc(32) int local32 = Math.max(arg4.anInt6963 / 2, arg4.anInt6971 / 2) + 10;
		@Pc(40) int local40 = arg2 * arg2 + arg9 * arg9;
		if (local40 > local32 * local32) {
			return;
		}
		@Pc(50) int local50 = Class3_Sub20.anIntArray206[local13];
		@Pc(54) int local54 = Class3_Sub20.anIntArray204[local13];
		if (Static428.anInt6834 != 4) {
			local50 = local50 * 256 / (Static663.anInt10571 + 256);
			local54 = local54 * 256 / (Static663.anInt10571 + 256);
		}
		@Pc(85) int local85 = arg9 * local54 + local50 * arg2 >> 14;
		@Pc(104) int local104 = local54 * arg2 - local50 * arg9 >> 14;
		@Pc(111) int local111 = arg6.method2507(arg0, 100, (Class33[]) null);
		@Pc(117) int local117 = local85 - local111 / 2;
		@Pc(125) int local125 = arg6.method2510(100, arg0, (Class33[]) null, 0);
		if (local117 >= -arg4.anInt6963 && local117 <= arg4.anInt6963 && -arg4.anInt6971 <= local104 && local104 <= arg4.anInt6971) {
			arg7.method8853(arg0, arg5, arg8, (Class33[]) null, local117 + arg5 + arg4.anInt6963 / 2, arg10, 1, local111, 50, 0, 0, 0, arg1, (int[]) null, arg8 + arg4.anInt6971 / 2 - local125 - arg3 - local104);
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IC)Z")
	public static boolean method6705(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(ZB)V")
	public static void method6706(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static317.aClass3_Sub11_Sub21_2 != null) {
			Static503.anInt8166 = Static317.aClass3_Sub11_Sub21_2.anInt10862;
		} else {
			Static503.anInt8166 = -1;
		}
		Static317.aClass3_Sub11_Sub21_2 = null;
		Static677.anInt10890 = 0;
		Static601.aClass260_20 = null;
		Static93.aClass338_238 = null;
		Static317.method4953();
		Static317.aClass338_136.method8175();
		Static357.aClass256_6 = null;
		Static80.aClass256_8 = null;
		Static385.aClass256_7 = null;
		Static27.aClass33_1 = null;
		Static75.aClass256_1 = null;
		Static258.aClass256_5 = null;
		Static317.aClass130_4 = null;
		Static88.anInt1725 = -1;
		Static91.aClass256_3 = null;
		Static182.aClass256_4 = null;
		Static614.aClass256_9 = null;
		Static590.anInt9485 = -1;
		if (Static317.aClass27_3 != null) {
			Static317.aClass27_3.method697();
			Static317.aClass27_3.method695(128, 64);
		}
		if (Static317.aClass377_3 != null) {
			Static317.aClass377_3.method9044(64, 64);
		}
		if (Static317.aClass267_2 != null) {
			Static317.aClass267_2.method6685(64);
		}
		Static264.aClass110_1.method3161(64);
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V")
	public static void method6708() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static474.anInt7831 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(39) Exception local39) {
		}
	}
}
