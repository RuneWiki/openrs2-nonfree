import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
	public static int anInt5940;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)I")
	public static int method5133(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(16) int local16 = (arg0 & 0x7F) * 96 >> 7;
		if (local16 < 2) {
			local16 = 2;
		} else if (local16 > 126) {
			local16 = 126;
		}
		return local16 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BJ)V")
	public static void method5135(@OriginalArg(1) long arg0) {
		if (Static554.aClass63ArrayArrayArray4 != null) {
			if (Static446.anInt7363 == 1 || Static446.anInt7363 == 5) {
				Static407.method5896(arg0);
			} else if (Static446.anInt7363 == 4) {
				Static540.method7112(arg0);
			}
		}
		Static493.method5818((long) Static305.anInt5560, Static4.aClass43_1);
		if (Static307.anInt5578 != -1) {
			Static550.method6450(Static307.anInt5578);
		}
		for (@Pc(50) int local50 = 0; local50 < Static591.anInt9382; local50++) {
			if (Static253.aBooleanArray17[local50]) {
				Static97.aBooleanArray4[local50] = true;
			}
			Static332.aBooleanArray24[local50] = Static253.aBooleanArray17[local50];
			Static253.aBooleanArray17[local50] = false;
		}
		Static304.anInt5464 = Static305.anInt5560;
		if (Static307.anInt5578 != -1) {
			Static591.anInt9382 = 0;
			Static49.method821();
		}
		Static4.aClass43_1.JA();
		Static238.method3981(Static4.aClass43_1);
		@Pc(93) int local93 = Static159.method2854();
		if (local93 == -1) {
			local93 = Static212.anInt4226;
		}
		if (local93 == -1) {
			local93 = Static215.anInt4261;
		}
		Static144.method2733(local93);
		Static241.method4004(Static14.anInt217, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8975, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8980, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126);
		Static14.anInt217 = 0;
	}
}
