import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "F")
	public static float aFloat65;

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "[Lclient!hv;")
	public static Class26_Sub3[] aClass26_Sub3Array1;

	@OriginalMember(owner = "client!gw", name = "k", descriptor = "Lclient!bi;")
	public static Class31 aClass31_39;

	@OriginalMember(owner = "client!gw", name = "h", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_44 = new Class61(3, -1);

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
	public static void method3366() {
		for (@Pc(8) int local8 = 0; local8 < Static267.anInt5143; local8++) {
			@Pc(14) int local14 = Static253.anIntArray436[local8];
			@Pc(22) Class10_Sub1_Sub2_Sub1 local22 = ((Class4_Sub50) Static106.aClass183_8.method4289((long) local14)).aClass10_Sub1_Sub2_Sub1_1;
			@Pc(26) int local26 = Static487.aClass4_Sub9_Sub1_2.method6015();
			if ((local26 & 0x80) != 0) {
				local26 += Static487.aClass4_Sub9_Sub1_2.method6015() << 8;
			}
			@Pc(51) int local51;
			if ((local26 & 0x2000) != 0) {
				local51 = Static487.aClass4_Sub9_Sub1_2.method5977();
				local22.anInt8524 = Static487.aClass4_Sub9_Sub1_2.method6014();
				local22.anInt8523 = Static487.aClass4_Sub9_Sub1_2.method6009();
				local22.anInt8492 = local51 & 0x7FFF;
				local22.aBoolean593 = (local51 & 0x8000) != 0;
				local22.anInt8464 = Static237.anInt7561 + local22.anInt8492 + local22.anInt8524;
			}
			if ((local26 & 0x200) != 0) {
				local22.anInt8495 = Static487.aClass4_Sub9_Sub1_2.method6021();
				local22.anInt8485 = Static487.aClass4_Sub9_Sub1_2.method6025();
				local22.anInt8530 = Static487.aClass4_Sub9_Sub1_2.method6004();
				local22.anInt8503 = Static487.aClass4_Sub9_Sub1_2.method6025();
				local22.anInt8462 = Static487.aClass4_Sub9_Sub1_2.method5982() + Static237.anInt7561;
				local22.anInt8509 = Static487.aClass4_Sub9_Sub1_2.method5982() + Static237.anInt7561;
				local22.anInt8525 = Static487.aClass4_Sub9_Sub1_2.method6014();
				local22.anInt8485 += local22.anIntArray654[0];
				local22.anInt8537 = 1;
				local22.anInt8503 += local22.anIntArray654[0];
				local22.anInt8530 += local22.anIntArray653[0];
				local22.anInt8536 = 0;
				local22.anInt8495 += local22.anIntArray653[0];
			}
			if ((local26 & 0x4) != 0) {
				local22.anInt4177 = Static487.aClass4_Sub9_Sub1_2.method6005();
				local22.anInt4155 = Static487.aClass4_Sub9_Sub1_2.method5994();
			}
			if ((local26 & 0x8) != 0) {
				local22.anInt8465 = Static487.aClass4_Sub9_Sub1_2.method5982();
				if (local22.anInt8465 == 65535) {
					local22.anInt8465 = -1;
				}
			}
			@Pc(224) int local224;
			@Pc(233) int local233;
			if ((local26 & 0x1000) != 0) {
				local51 = Static487.aClass4_Sub9_Sub1_2.method5982();
				local224 = Static487.aClass4_Sub9_Sub1_2.method6026();
				if (local51 == 65535) {
					local51 = -1;
				}
				local233 = Static487.aClass4_Sub9_Sub1_2.method6027();
				local22.method7024(local224, local51, local233, true);
			}
			if ((local26 & 0x800) != 0) {
				local51 = Static487.aClass4_Sub9_Sub1_2.method5978();
				local224 = Static487.aClass4_Sub9_Sub1_2.method6027();
				local22.method7036(Static237.anInt7561, local51, local224);
			}
			if ((local26 & 0x2) != 0) {
				local51 = Static487.aClass4_Sub9_Sub1_2.method5978();
				local224 = Static487.aClass4_Sub9_Sub1_2.method6014();
				local22.method7036(Static237.anInt7561, local51, local224);
				local22.anInt8505 = Static237.anInt7561 + 300;
				local22.anInt8534 = Static487.aClass4_Sub9_Sub1_2.method6009();
			}
			if ((local26 & 0x100) != 0) {
				local22.aByte93 = Static487.aClass4_Sub9_Sub1_2.method6021();
				local22.aByte92 = Static487.aClass4_Sub9_Sub1_2.method6004();
				local22.aByte94 = Static487.aClass4_Sub9_Sub1_2.method6025();
				local22.aByte91 = (byte) Static487.aClass4_Sub9_Sub1_2.method6027();
				local22.anInt8490 = Static237.anInt7561 + Static487.aClass4_Sub9_Sub1_2.method5977();
				local22.anInt8463 = Static237.anInt7561 + Static487.aClass4_Sub9_Sub1_2.method5982();
			}
			if ((local26 & 0x10) != 0) {
				@Pc(335) int[] local335 = new int[4];
				for (local224 = 0; local224 < 4; local224++) {
					local335[local224] = Static487.aClass4_Sub9_Sub1_2.method5994();
					if (local335[local224] == 65535) {
						local335[local224] = -1;
					}
				}
				local233 = Static487.aClass4_Sub9_Sub1_2.method6015();
				Static136.method2808(local233, local22, local335);
			}
			if ((local26 & 0x400) != 0) {
				local51 = Static487.aClass4_Sub9_Sub1_2.method6027();
				@Pc(380) int[] local380 = new int[local51];
				@Pc(383) int[] local383 = new int[local51];
				@Pc(386) int[] local386 = new int[local51];
				for (@Pc(388) int local388 = 0; local388 < local51; local388++) {
					@Pc(394) int local394 = Static487.aClass4_Sub9_Sub1_2.method5977();
					if (local394 == 65535) {
						local394 = -1;
					}
					local380[local388] = local394;
					local383[local388] = Static487.aClass4_Sub9_Sub1_2.method6015();
					local386[local388] = Static487.aClass4_Sub9_Sub1_2.method5977();
				}
				Static196.method3549(local383, local22, local380, local386);
			}
			if ((local26 & 0x1) != 0) {
				if (local22.aClass54_1.method1117()) {
					Static158.method3140(local22);
				}
				local22.method3531(Static401.aClass345_2.method7602(Static487.aClass4_Sub9_Sub1_2.method6005()));
				local22.method7028(local22.aClass54_1.anInt1260);
				local22.anInt8513 = local22.aClass54_1.anInt1291 << 3;
				if (local22.aClass54_1.method1117()) {
					Static91.method2092(null, local22.aByte101, 0, null, local22, local22.anIntArray654[0], local22.anIntArray653[0]);
				}
			}
			if ((local26 & 0x40) != 0) {
				local22.aString91 = Static487.aClass4_Sub9_Sub1_2.method6010();
				local22.anInt8501 = 100;
			}
			if ((local26 & 0x20) != 0) {
				local51 = Static487.aClass4_Sub9_Sub1_2.method5982();
				if (local51 == 65535) {
					local51 = -1;
				}
				local224 = Static487.aClass4_Sub9_Sub1_2.method6026();
				local233 = Static487.aClass4_Sub9_Sub1_2.method6014();
				local22.method7024(local224, local51, local233, false);
			}
		}
	}
}
