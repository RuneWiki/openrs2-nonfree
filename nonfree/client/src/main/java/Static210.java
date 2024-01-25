import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!hf", name = "z", descriptor = "I")
	public static int anInt3621;

	@OriginalMember(owner = "client!hf", name = "y", descriptor = "[I")
	public static final int[] anIntArray205 = new int[14];

	@OriginalMember(owner = "client!hf", name = "A", descriptor = "Lclient!fea;")
	public static final Class104 aClass104_6 = new Class104("INTBETA", "office", "_intbeta", 6);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public static void method3098() {
		Static170.aClass4_1.method1021();
		Static193.aClass128_1.method5194();
		Static563.aClient1.method1438();
		Static140.aCanvas1.setBackground(Color.black);
		Static390.anInt6561 = -1;
		Static170.aClass4_1 = Static466.method6903(Static140.aCanvas1);
		Static193.aClass128_1 = Static417.method6240(Static140.aCanvas1);
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
	public static void method3099() {
		Static564.method7908(Static546.aClass132_13, (long) Static90.anInt1698);
		if (Static561.anInt9357 != -1) {
			Static663.method8290(Static561.anInt9357);
		}
		for (@Pc(23) int local23 = 0; local23 < Static65.anInt1203; local23++) {
			if (Static224.aBooleanArray12[local23]) {
				Static504.aBooleanArray24[local23] = true;
			}
			Static253.aBooleanArray15[local23] = Static224.aBooleanArray12[local23];
			Static224.aBooleanArray12[local23] = false;
		}
		Static188.anInt3222 = Static90.anInt1698;
		if (Static561.anInt9357 != -1) {
			Static65.anInt1203 = 0;
			Static577.method8021();
		}
		Static546.aClass132_13.la();
		Static340.method4998(Static546.aClass132_13);
		@Pc(65) int local65 = Static578.method8043();
		if (local65 == -1) {
			local65 = Static357.anInt6124;
		}
		if (local65 == -1) {
			local65 = Static471.anInt8114;
		}
		Static226.method3295(local65);
		Static332.anInt7620 = 0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(III)Z")
	public static boolean method3100(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(III)Z")
	public static boolean method3102(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}
}
