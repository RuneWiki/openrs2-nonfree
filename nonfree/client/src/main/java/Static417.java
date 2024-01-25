import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!pw", name = "d", descriptor = "Lclient!vo;")
	public static Class348 aClass348_56;

	@OriginalMember(owner = "client!pw", name = "e", descriptor = "I")
	public static int anInt5248;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_38 = new Class344(70, 15);

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "([Ljava/lang/Object;I[J)V")
	public static void method4089(@OriginalArg(0) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static337.method5139(arg0, arg1.length - 1, 0, arg1);
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IJ)V")
	public static void method4092(@OriginalArg(1) long arg0) {
		if (Static571.aClass182ArrayArrayArray3 != null) {
			if (Static300.anInt6053 == 1 || Static300.anInt6053 == 5) {
				Static180.method7443(arg0);
			} else if (Static300.anInt6053 == 4) {
				Static375.method5819(arg0);
			}
		}
		Static433.method6463((long) Static306.anInt6122, Static39.aClass7_2);
		if (Static446.anInt8493 != -1) {
			Static503.method7241(Static446.anInt8493);
		}
		for (@Pc(45) int local45 = 0; local45 < Static365.anInt7047; local45++) {
			if (Static155.aBooleanArray6[local45]) {
				Static322.aBooleanArray15[local45] = true;
			}
			Static222.aBooleanArray13[local45] = Static155.aBooleanArray6[local45];
			Static155.aBooleanArray6[local45] = false;
		}
		Static136.anInt3034 = Static306.anInt6122;
		if (Static446.anInt8493 != -1) {
			Static365.anInt7047 = 0;
			Static289.method4602();
		}
		Static39.aClass7_2.JA();
		Static524.method7425(Static39.aClass7_2);
		@Pc(93) int local93 = Static68.method1512();
		if (local93 == -1) {
			local93 = Static117.anInt2703;
		}
		if (local93 == -1) {
			local93 = Static538.anInt9806;
		}
		Static458.method6742(local93);
		@Pc(112) int local112 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.method3339() << 8;
		Static351.method5320(Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127, Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10551 + local112, Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10550 - -local112, Static92.anInt8628);
		Static92.anInt8628 = 0;
	}
}
