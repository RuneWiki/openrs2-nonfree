import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!po", name = "e", descriptor = "[B")
	public static byte[] aByteArray44;

	@OriginalMember(owner = "client!po", name = "f", descriptor = "Lclient!ph;")
	public static Class138 aClass138_58;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "I")
	public static int anInt4282 = -1;

	@OriginalMember(owner = "client!po", name = "g", descriptor = "Z")
	public static boolean aBoolean293 = false;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILclient!qf;)Ljava/lang/String;")
	public static String method3437(@OriginalArg(1) Class146 arg0) {
		if (Static36.method643(arg0).method3233() == 0) {
			return null;
		} else if (arg0.aString142 == null || arg0.aString142.trim().length() == 0) {
			return Static250.aBoolean231 ? "Hidden-use" : null;
		} else {
			return arg0.aString142;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!gj;I)V")
	public static void method3438(@OriginalArg(0) Class22_Sub3 arg0) {
		if (arg0.anInt4586 == Static37.anInt757 || arg0.anInt4642 == -1 || arg0.anInt4632 != 0 || arg0.anInt4645 + 1 > Static313.method4648(arg0.anInt4642).anIntArray463[arg0.anInt4597]) {
			@Pc(37) int local37 = arg0.anInt4586 - arg0.anInt4600;
			@Pc(43) int local43 = Static37.anInt757 - arg0.anInt4600;
			@Pc(54) int local54 = arg0.anInt4629 * 128 + arg0.method3660() * 64;
			@Pc(65) int local65 = arg0.anInt4565 * 128 + arg0.method3660() * 64;
			@Pc(77) int local77 = arg0.anInt4631 * 128 + arg0.method3660() * 64;
			@Pc(88) int local88 = arg0.anInt4563 * 128 + arg0.method3660() * 64;
			arg0.anInt4601 = (local43 * local77 + local54 * (local37 - local43)) / local37;
			arg0.anInt4623 = (local88 * local43 + (local37 - local43) * local65) / local37;
		}
		if (arg0.anInt4621 == 0) {
			arg0.anInt4561 = 1024;
		}
		if (arg0.anInt4621 == 1) {
			arg0.anInt4561 = 1536;
		}
		arg0.anInt4618 = 0;
		if (arg0.anInt4621 == 2) {
			arg0.anInt4561 = 0;
		}
		if (arg0.anInt4621 == 3) {
			arg0.anInt4561 = 512;
		}
		arg0.anInt4649 = arg0.anInt4561;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIII)V")
	public static void method3439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class1_Sub8 local16 = (Class1_Sub8) Static247.aClass156_23.method3821((long) arg0);
		if (local16 == null) {
			local16 = new Class1_Sub8();
			Static247.aClass156_23.method3816((long) arg0, local16);
		}
		if (local16.anIntArray57.length <= arg1) {
			@Pc(44) int[] local44 = new int[arg1 + 1];
			@Pc(49) int[] local49 = new int[arg1 + 1];
			@Pc(51) int local51;
			for (local51 = 0; local51 < local16.anIntArray57.length; local51++) {
				local44[local51] = local16.anIntArray57[local51];
				local49[local51] = local16.anIntArray58[local51];
			}
			for (local51 = local16.anIntArray57.length; local51 < arg1; local51++) {
				local44[local51] = -1;
				local49[local51] = 0;
			}
			local16.anIntArray57 = local44;
			local16.anIntArray58 = local49;
		}
		local16.anIntArray57[arg1] = arg2;
		local16.anIntArray58[arg1] = arg3;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
	public static void method3440() {
		Static17.anInt300 = 0;
		Static110.anInt2185 = 0;
		Static309.method4586();
		Static46.method816();
		Static27.method482();
		@Pc(21) int local21;
		for (local21 = 0; local21 < Static110.anInt2185; local21++) {
			@Pc(28) int local28 = Static119.anIntArray535[local21];
			if (Static265.aClass22_Sub3_Sub1Array1[local28].anInt4614 != Static37.anInt757) {
				if (Static265.aClass22_Sub3_Sub1Array1[local28].aClass112_1.method2822()) {
					Static12.method177(Static265.aClass22_Sub3_Sub1Array1[local28]);
				}
				Static265.aClass22_Sub3_Sub1Array1[local28].method3118(null);
				Static265.aClass22_Sub3_Sub1Array1[local28] = null;
			}
		}
		if (Static237.aClass1_Sub14_Sub1_7.anInt3290 != Static127.anInt2543) {
			throw new RuntimeException("gnp1 pos:" + Static237.aClass1_Sub14_Sub1_7.anInt3290 + " psize:" + Static127.anInt2543);
		}
		for (local21 = 0; local21 < Static105.anInt2015; local21++) {
			if (Static265.aClass22_Sub3_Sub1Array1[Static7.anIntArray12[local21]] == null) {
				throw new RuntimeException("gnp2 pos:" + local21 + " size:" + Static105.anInt2015);
			}
		}
	}
}
