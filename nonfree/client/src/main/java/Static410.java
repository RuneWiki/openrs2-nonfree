import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!po", name = "a", descriptor = "[Z")
	public static boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!po", name = "c", descriptor = "I")
	public static int anInt7111;

	@OriginalMember(owner = "client!po", name = "f", descriptor = "[Lclient!mw;")
	public static Class8_Sub3_Sub3[] aClass8_Sub3_Sub3Array1;

	@OriginalMember(owner = "client!po", name = "j", descriptor = "Lclient!pu;")
	public static Class270 aClass270_83;

	@OriginalMember(owner = "client!po", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString70 = null;

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V")
	public static void method5648() {
		@Pc(9) Class222 local9 = Static40.aClass222_2;
		synchronized (Static40.aClass222_2) {
			Static40.aClass222_2.method4428();
		}
		local9 = Static396.aClass222_42;
		synchronized (Static396.aClass222_42) {
			Static396.aClass222_42.method4428();
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!r;IZI)Lclient!fu;")
	public static Class110 method5649(@OriginalArg(0) Class134 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (arg2 == -1) {
			return null;
		}
		if (Static480.anIntArray622 != null) {
			for (@Pc(14) int local14 = 0; local14 < Static480.anIntArray622.length; local14++) {
				if (Static480.anIntArray622[local14] == arg2) {
					return Static515.aClass110Array1[local14];
				}
			}
		}
		@Pc(41) Class110 local41 = (Class110) Static136.aClass222_14.method4430((long) arg2);
		if (local41 != null) {
			if (arg1 && local41.aClass334_5 == null) {
				@Pc(53) Class334 local53 = Static423.method5847(Static267.aClass270_53, arg2);
				if (local53 == null) {
					return null;
				}
				local41.aClass334_5 = local53;
			}
			return local41;
		}
		@Pc(71) Class102[] local71 = Static601.method2075(Static576.aClass270_119, arg2);
		if (local71 == null) {
			return null;
		}
		@Pc(80) Class334 local80 = Static423.method5847(Static267.aClass270_53, arg2);
		if (local80 == null) {
			return null;
		}
		if (arg1) {
			local41 = new Class110(arg0.method6899(local80, local71), local80);
		} else {
			local41 = new Class110(arg0.method6899(local80, local71));
		}
		Static136.aClass222_14.method4434(local41, (long) arg2);
		return local41;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IBI)Z")
	public static boolean method5651(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}
}
