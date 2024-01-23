import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "[I")
	public static int[] anIntArray341;

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "Lclient!lk;")
	public static Class100 aClass100_3;

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "Z")
	public static boolean aBoolean250 = false;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
	public static void method3293() {
		for (@Pc(3) int local3 = 0; local3 < Static41.anInt849; local3++) {
			@Pc(10) Class109 local10 = Static198.method3233(local3);
			if (local10 != null && local10.anInt3361 == 0) {
				Static287.anIntArray454[local3] = 0;
				Static298.anIntArray414[local3] = 0;
			}
		}
		Static278.aClass163_35 = new Class163(16);
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
	public static void method3294() {
		Static161.aClass172_29.method4346();
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)V")
	public static void method3295() {
		Static161.aClass163_24.method4190();
		Static100.aClass86_2.method2179();
		Static92.aClass86_1.method2179();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IJ)V")
	public static void method3296(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static175.aClass4_Sub24_Sub1_1.method3123(228);
			Static175.aClass4_Sub24_Sub1_1.method3079(arg0);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!cg;Lclient!cg;BLclient!cg;Lclient!cg;)V")
	public static void method3297(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(3) Class22 arg2, @OriginalArg(4) Class22 arg3) {
		Static194.aClass22_68 = arg0;
		Static303.aClass22_106 = arg2;
		Static279.aClass22_97 = arg3;
		Static1.aClass22_1 = arg1;
		Static217.aClass97ArrayArray1 = new Class97[Static279.aClass22_97.method677()][];
		Static21.aBooleanArray7 = new boolean[Static279.aClass22_97.method677()];
	}
}
