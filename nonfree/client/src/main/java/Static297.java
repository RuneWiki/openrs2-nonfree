import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "Lclient!vj;")
	public static Class58 aClass58_38;

	@OriginalMember(owner = "client!sr", name = "n", descriptor = "[I")
	public static final int[] anIntArray459 = new int[500];

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!vq;B)V")
	public static void method4926(@OriginalArg(0) Class47 arg0) {
		if (Static105.anInt2645 < 2 && !Static344.aBoolean219 || Static103.aClass21_5 != null) {
			return;
		}
		@Pc(45) String local45;
		if (Static344.aBoolean219 && Static105.anInt2645 < 2) {
			local45 = Static171.aString34 + Static44.aClass159_66.method4311(Static180.anInt3835) + Static194.aString36 + " ->";
		} else if (Static73.aBoolean139 && Static264.aClass92_3.method2620(81) && Static105.anInt2645 > 2) {
			local45 = Static218.method3959((Class4_Sub39) Static58.aClass116_7.aClass4_121.aClass4_251.aClass4_251);
		} else {
			@Pc(41) Class4_Sub39 local41 = (Class4_Sub39) Static58.aClass116_7.aClass4_121.aClass4_251;
			local45 = Static218.method3959(local41);
			@Pc(47) int[] local47 = null;
			if (Static152.method3020(local41.anInt5716)) {
				local47 = Static177.method3465((int) local41.aLong184).anIntArray496;
			} else if (Static304.method4987(local41.anInt5716)) {
				@Pc(65) Class8_Sub1_Sub2_Sub2 local65 = Static169.aClass8_Sub1_Sub2_Sub2Array1[(int) local41.aLong184];
				if (local65 != null) {
					local47 = local65.aClass141_1.anIntArray377;
				}
			} else if (Static183.method3518(local41.anInt5716)) {
				if (local41.anInt5716 == 1004) {
					local47 = Static113.method2380((int) local41.aLong184).anIntArray21;
				} else {
					local47 = Static113.method2380((int) (local41.aLong184 >>> 32 & 0x7FFFFFFFL)).anIntArray21;
				}
			}
			if (local47 != null) {
				local45 = local45 + Static184.method3524(local47);
			}
		}
		if (Static105.anInt2645 > 2) {
			local45 = local45 + "<col=ffffff> / " + (Static105.anInt2645 - 2) + Static232.aClass159_246.method4311(Static180.anInt3835);
		}
		if (Static251.aClass21_14 != null) {
			@Pc(218) Class51 local218 = Static251.aClass21_14.method539(arg0);
			if (local218 == null) {
				local218 = Static282.aClass51_4;
			}
			local218.method4234(Static217.anInt4446, Static251.aClass21_14.anInt715, Static40.anInt1097, Static312.anIntArray475, Static251.aClass21_14.anInt740, Static251.aClass21_14.anInt729, Static225.aClass58Array87, Static123.anInt2949, Static187.anIntArray332, Static251.aClass21_14.anInt724, Static251.aClass21_14.anInt784, Static319.aRandom1, Static251.aClass21_14.anInt758, local45);
			Static168.method5617(Static187.anIntArray332[3], Static187.anIntArray332[1], Static187.anIntArray332[0], Static187.anIntArray332[2]);
		} else if (Static181.aClass21_10 != null && Static330.anInt6312 == 0) {
			@Pc(199) int local199 = Static282.aClass51_4.method4248(local45, Static217.anInt4446, Static225.aClass58Array87, Static312.anIntArray475, Static312.anInt6062 + 4, Static319.aRandom1, Static156.anInt5229 + 16);
			Static168.method5617(16, Static156.anInt5229, Static312.anInt6062 + 4, local199 + Static348.aClass16_8.method327(local45));
			return;
		}
	}
}
