import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "Z")
	public static boolean aBoolean649 = false;

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "Lclient!sr;")
	public static final Class227 aClass227_33 = new Class227();

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "[I")
	public static final int[] anIntArray390 = new int[50];

	@OriginalMember(owner = "client!qo", name = "i", descriptor = "[I")
	public static final int[] anIntArray391 = new int[1000];

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!za;)V")
	public static void method4489(@OriginalArg(1) Class34 arg0) {
		if (Static247.anInt4472 != Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94 && (Static359.aClass169ArrayArrayArray5 != null && Static154.method2267(arg0, Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94))) {
			Static247.anInt4472 = Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZII)Lclient!jk;")
	public static Class124 method4492(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class124 local7 = Static412.method5315(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass124Array1 == null || local7.aClass124Array1.length <= arg1) {
			return null;
		} else {
			return local7.aClass124Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
	public static void method4494() {
		@Pc(3) Class262[] local3 = Class38_Sub8.aClass262Array1;
		synchronized (Class38_Sub8.aClass262Array1) {
			for (@Pc(7) int local7 = 0; local7 < Class38_Sub8.aClass262Array1.length; local7++) {
				Class38_Sub8.aClass262Array1[local7] = new Class262();
				Static183.anIntArray205[local7] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IB)V")
	public static void method4495(@OriginalArg(0) int arg0) {
		Static222.anInt3998 = -1;
		Static169.anInt2773 = arg0;
		Static222.anInt3998 = -1;
		Static65.method1075();
	}
}
