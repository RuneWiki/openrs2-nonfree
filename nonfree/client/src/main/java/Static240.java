import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!je", name = "g", descriptor = "[I")
	public static int[] anIntArray242;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "I")
	public static int anInt4414;

	@OriginalMember(owner = "client!je", name = "i", descriptor = "F")
	public static float aFloat125 = 0.0F;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "Z")
	public static boolean aBoolean315 = false;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public static void method3545() {
		@Pc(16) Class1_Sub12 local16 = (Class1_Sub12) Static121.aClass111_9.method2547();
		@Pc(27) boolean local27 = Static488.aClass160_36 != null || Static32.anInt689 > 0;
		if (local27) {
			Static499.anInt8721 = 1;
		}
		if (aBoolean315 && Static326.aClass97_3.method2365(81) && Static22.anInt572 > 2) {
			if (local27) {
				Static337.aClass1_Sub40_2 = (Class1_Sub40) Static166.aClass111_49.aClass1_94.aClass1_285.aClass1_285;
			} else {
				Static553.method7513(local16.method6689(), local16.method6682(), (Class1_Sub40) Static166.aClass111_49.aClass1_94.aClass1_285.aClass1_285);
			}
		} else if (local27) {
			Static337.aClass1_Sub40_2 = (Class1_Sub40) Static166.aClass111_49.aClass1_94.aClass1_285;
		} else {
			Static553.method7513(local16.method6689(), local16.method6682(), (Class1_Sub40) Static166.aClass111_49.aClass1_94.aClass1_285);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZ)Z")
	public static boolean method3547(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BIIII)V")
	public static void method3548(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static361.anInt6564 == 1) {
			Static517.aClass5Array18[Static300.anInt9559 / 100].method7795(Static119.anInt2475 - 8, Static258.anInt4725 + -8);
		}
		if (Static361.anInt6564 == 2) {
			Static517.aClass5Array18[Static300.anInt9559 / 100 + 4].method7795(Static119.anInt2475 - 8, Static258.anInt4725 + -8);
		}
		Static434.method6196();
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
	public static void method3552() {
		for (@Pc(12) int local12 = 0; local12 < Static306.anInt4911; local12++) {
			@Pc(18) int local18 = Static11.anIntArray12[local12];
			@Pc(25) Class1_Sub33 local25 = (Class1_Sub33) Static372.aClass91_30.method2271((long) local18);
			if (local25 != null) {
				@Pc(30) Class11_Sub1_Sub1_Sub3_Sub2 local30 = local25.aClass11_Sub1_Sub1_Sub3_Sub2_2;
				Static556.method7539(local30.aClass354_1.anInt9418, local30);
			}
		}
	}
}
