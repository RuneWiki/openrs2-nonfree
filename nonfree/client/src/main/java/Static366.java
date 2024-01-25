import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!wq", name = "p", descriptor = "I")
	public static int anInt7026 = 0;

	@OriginalMember(owner = "client!wq", name = "v", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_218 = new Class217(2, -1);

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(III)I")
	public static int method6067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(24) int local24 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local24;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILclient!ct;)V")
	public static void method6068(@OriginalArg(1) Class30 arg0) {
		Static96.aClass30_29 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
	public static void method6069() {
		@Pc(1) Class21 local1 = Static34.aClass21_35;
		synchronized (Static34.aClass21_35) {
			Static34.aClass21_35.method857();
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIZIIIIII)Z")
	public static boolean method6070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(30) int local30 = Static279.method4985(arg2, arg3, arg0, arg4, arg5, arg7, arg8, arg6, Static133.anIntArray215, Static11.aClass196Array2[Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79], arg9, arg1, Static191.aClass11_Sub2_Sub6_Sub1_4.method5894(), Static15.anIntArray27);
		if (local30 < 1) {
			return false;
		}
		Static237.anInt2678 = Static133.anIntArray215[local30 - 1];
		Static97.anInt2177 = Static15.anIntArray27[local30 - 1];
		Static361.aBoolean508 = false;
		Static56.method1386();
		return true;
	}
}
