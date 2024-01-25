import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!nf", name = "Gb", descriptor = "[[Lclient!ga;")
	public static Class116[][] aClass116ArrayArray1;

	@OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
	public static int anInt6686 = 0;

	@OriginalMember(owner = "client!nf", name = "N", descriptor = "Z")
	public static boolean aBoolean457 = false;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)Z")
	public static boolean method5293() {
		try {
			return Static314.method4959();
		} catch (@Pc(17) IOException local17) {
			Static114.method2103();
			return true;
		} catch (@Pc(22) Exception local22) {
			@Pc(80) String local80 = "T2 - " + (Static100.aClass90_34 == null ? -1 : Static100.aClass90_34.method2107()) + "," + (Static528.aClass90_133 == null ? -1 : Static528.aClass90_133.method2107()) + "," + (Static79.aClass90_29 == null ? -1 : Static79.aClass90_29.method2107()) + " - " + Static488.anInt9250 + "," + (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anIntArray206[0] + Static242.anInt10133) + "," + (Static157.anInt3323 + Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anIntArray207[0]) + " - ";
			for (@Pc(82) int local82 = 0; Static488.anInt9250 > local82 && local82 < 50; local82++) {
				local80 = local80 + Static549.aClass4_Sub13_Sub2_2.aByteArray88[local82] + ",";
			}
			Static109.method2014(local80, local22);
			Static254.method4043(false);
			return true;
		}
	}
}
