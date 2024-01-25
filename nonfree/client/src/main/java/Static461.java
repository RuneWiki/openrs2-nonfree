import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!wr", name = "F", descriptor = "I")
	public static int anInt7745;

	@OriginalMember(owner = "client!wr", name = "S", descriptor = "Z")
	public static boolean aBoolean516 = false;

	@OriginalMember(owner = "client!wr", name = "T", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray43 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!wr", name = "X", descriptor = "I")
	public static int anInt7758 = 0;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZII)Ljava/lang/String;")
	public static String method6266(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static298.method4258(arg0);
	}

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "(I)Lclient!fb;")
	public static Class3_Sub16 method6267() {
		if (Static211.aClass193_3 == null || Static358.aClass21_1 == null) {
			return null;
		}
		Static358.aClass21_1.method500(Static211.aClass193_3);
		@Pc(26) Class3_Sub16 local26 = (Class3_Sub16) Static358.aClass21_1.method499();
		if (local26 == null) {
			return null;
		} else {
			@Pc(36) Class152 local36 = Static211.aClass45_2.method1255(local26.anInt1896);
			return local36 != null && local36.aBoolean317 && local36.method3608(Static211.anInterface6_2) ? local26 : Static51.method967();
		}
	}

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "(I)V")
	public static void method6268() {
		@Pc(17) int local17 = Static176.aClass3_Sub25_Sub1_1.method4088();
		@Pc(21) int local21 = Static176.aClass3_Sub25_Sub1_1.method4109();
		@Pc(32) boolean local32 = Static176.aClass3_Sub25_Sub1_1.method4096() == 1;
		Static337.anInt5635 = Static176.aClass3_Sub25_Sub1_1.method4066();
		@Pc(40) int local40 = Static176.aClass3_Sub25_Sub1_1.method4095();
		Static4.method64();
		Static32.method580(local40);
		Static176.aClass3_Sub25_Sub1_1.method2785();
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(65) int local65;
		for (@Pc(50) int local50 = 0; local50 < 4; local50++) {
			for (local54 = 0; local54 < Static373.anInt6324 >> 3; local54++) {
				for (local58 = 0; local58 < Static291.anInt5062 >> 3; local58++) {
					local65 = Static176.aClass3_Sub25_Sub1_1.method2783(1);
					if (local65 == 1) {
						Static390.anIntArrayArrayArray12[local50][local54][local58] = Static176.aClass3_Sub25_Sub1_1.method2783(26);
					} else {
						Static390.anIntArrayArrayArray12[local50][local54][local58] = -1;
					}
				}
			}
		}
		Static176.aClass3_Sub25_Sub1_1.method2786();
		local54 = (Static102.anInt1839 - Static176.aClass3_Sub25_Sub1_1.anInt4974) / 16;
		Static60.anIntArrayArray8 = new int[local54][4];
		for (local58 = 0; local58 < local54; local58++) {
			for (local65 = 0; local65 < 4; local65++) {
				Static60.anIntArrayArray8[local58][local65] = Static176.aClass3_Sub25_Sub1_1.method4108();
			}
		}
		Static194.aByteArrayArray14 = new byte[local54][];
		Static298.aByteArrayArray20 = null;
		Static165.anIntArray116 = new int[local54];
		Static152.aByteArrayArray33 = new byte[local54][];
		Static192.anIntArray217 = null;
		Static73.anIntArray70 = new int[local54];
		Static127.aByteArrayArray11 = new byte[local54][];
		Static417.anIntArray447 = new int[local54];
		Static457.aByteArrayArray34 = new byte[local54][];
		Static127.anIntArray115 = new int[local54];
		Static95.anIntArray81 = new int[local54];
		local54 = 0;
		for (local65 = 0; local65 < 4; local65++) {
			for (@Pc(192) int local192 = 0; local192 < Static373.anInt6324 >> 3; local192++) {
				for (@Pc(196) int local196 = 0; local196 < Static291.anInt5062 >> 3; local196++) {
					@Pc(206) int local206 = Static390.anIntArrayArrayArray12[local65][local192][local196];
					if (local206 != -1) {
						@Pc(215) int local215 = local206 >> 14 & 0x3FF;
						@Pc(221) int local221 = local206 >> 3 & 0x7FF;
						@Pc(231) int local231 = local221 / 8 + (local215 / 8 << 8);
						for (@Pc(233) int local233 = 0; local233 < local54; local233++) {
							if (local231 == Static127.anIntArray115[local233]) {
								local231 = -1;
								break;
							}
						}
						if (local231 != -1) {
							Static127.anIntArray115[local54] = local231;
							@Pc(262) int local262 = local231 >> 8 & 0xFF;
							@Pc(266) int local266 = local231 & 0xFF;
							Static95.anIntArray81[local54] = Static92.aClass250_31.method5790("m" + local262 + "_" + local266);
							Static417.anIntArray447[local54] = Static92.aClass250_31.method5790("l" + local262 + "_" + local266);
							Static165.anIntArray116[local54] = Static92.aClass250_31.method5790("um" + local262 + "_" + local266);
							Static73.anIntArray70[local54] = Static92.aClass250_31.method5790("ul" + local262 + "_" + local266);
							local54++;
						}
					}
				}
			}
		}
		Static251.method5279(local17, 10, local21, local32);
	}

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "(I)V")
	public static void method6270(@OriginalArg(0) int arg0) {
		Static425.anInt2154 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static459.anInt5916; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static342.anInt5746; local6++) {
				if (Static389.aClass227ArrayArrayArray3[arg0][local3][local6] == null) {
					Static389.aClass227ArrayArrayArray3[arg0][local3][local6] = new Class227(arg0, local3, local6);
				}
			}
		}
	}
}
