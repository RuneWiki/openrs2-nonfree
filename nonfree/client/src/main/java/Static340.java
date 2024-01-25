import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
	public static int anInt6179 = 0;

	@OriginalMember(owner = "client!rc", name = "J", descriptor = "[Z")
	public static final boolean[] aBooleanArray22 = new boolean[100];

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!qa;B)V")
	public static void method4900(@OriginalArg(0) Class121 arg0) {
		@Pc(7) int local7 = Static256.anInt4398;
		@Pc(9) int local9 = Static423.anInt7379;
		@Pc(15) int local15 = Static102.anInt1978;
		@Pc(17) int local17 = Static369.anInt6690;
		arg0.method4600(local15, local7, -10660793, local17, local9);
		arg0.method4600(local15 - 2, local7 + 1, -16777216, 16, local9 + 1);
		arg0.method4601(local17 - 19, local7 + 1, local15 - 2, -16777216, local9 + 18);
		Static237.aClass4_5.method5839(-1, local9 + 14, -10660793, local7 - -3, Static357.aClass96_98.method1935(Static389.anInt7061));
		@Pc(76) int local76 = Static38.aClass32_1.method3517();
		@Pc(80) int local80 = Static38.aClass32_1.method3524();
		@Pc(82) int local82 = 0;
		for (@Pc(87) Class1_Sub3 local87 = (Class1_Sub3) Static251.aClass142_26.method3199(); local87 != null; local87 = (Class1_Sub3) Static251.aClass142_26.method3198()) {
			@Pc(103) int local103 = local9 + (-local82 + -1 + Static119.anInt2296) * 16 + 31;
			@Pc(105) short local105 = -1;
			if (local7 < local76 && local76 < local15 + local7 && local103 - 13 < local80 && local103 + 3 > local80 && local87.aBoolean15) {
				local105 = -256;
			}
			@Pc(142) int[] local142 = null;
			if (Static192.method3012(local87.anInt227)) {
				local142 = Static388.aClass193_3.method4249((int) local87.aLong15).anIntArray457;
			} else if (local87.anInt224 != -1) {
				local142 = Static388.aClass193_3.method4249(local87.anInt224).anIntArray457;
			} else if (Static430.method5801(local87.anInt227)) {
				@Pc(218) Class47_Sub1_Sub5_Sub1 local218 = Static307.aClass47_Sub1_Sub5_Sub1Array1[(int) local87.aLong15];
				if (local218 != null) {
					@Pc(223) Class196 local223 = local218.aClass196_1;
					if (local223.anIntArray419 != null) {
						local223 = local223.method4412(Static237.aClass80_1);
					}
					if (local223 != null) {
						local142 = local223.anIntArray420;
					}
				}
			} else if (Static112.method1762(local87.anInt227)) {
				@Pc(190) Class29 local190;
				if (local87.anInt227 == 1001) {
					local190 = Static251.aClass207_2.method4977((int) local87.aLong15);
				} else {
					local190 = Static251.aClass207_2.method4977((int) (local87.aLong15 >>> 32 & 0x7FFFFFFFL));
				}
				if (local190.anIntArray36 != null) {
					local190 = local190.method475(Static237.aClass80_1);
				}
				if (local190 != null) {
					local142 = local190.anIntArray34;
				}
			}
			@Pc(248) String local248 = Static329.method4757(local87);
			if (local142 != null) {
				local248 = local248 + Static301.method4107(local142);
			}
			Static237.aClass4_5.method5846(local7 + 3, Static13.aClass78Array1, local248, Static275.anIntArray364, local103, local105);
			local82++;
			if (local87.aBoolean16) {
				Static55.aClass78_6.method6003(Static126.aClass62_6.method1157(local248) + local7 + 5, local103 - 12);
			}
		}
		Static220.method2313(Static102.anInt1978, Static423.anInt7379, Static256.anInt4398, Static369.anInt6690);
	}
}
