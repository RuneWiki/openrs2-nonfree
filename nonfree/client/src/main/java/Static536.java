import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
	public static int anInt9434;

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "[I")
	public static int[] anIntArray830;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZ)V")
	public static void method8132() {
		Static216.method3997(Static67.aClass252_34);
		for (@Pc(20) Class1_Sub35 local20 = (Class1_Sub35) Static362.aClass230_45.method6137(); local20 != null; local20 = (Class1_Sub35) Static362.aClass230_45.method6140()) {
			if (!local20.method8241()) {
				local20 = (Class1_Sub35) Static362.aClass230_45.method6137();
				if (local20 == null) {
					break;
				}
			}
			if (local20.anInt5499 == 0) {
				Static537.method8142(local20, true, true);
			}
		}
		if (Static447.aClass91_14 != null) {
			Static243.method4316(Static447.aClass91_14);
			Static447.aClass91_14 = null;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIIII)V")
	public static void method8133(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(6) Class46_Sub5 local6 = (Class46_Sub5) Static16.aClass184_50.method5138(); local6 != null; local6 = (Class46_Sub5) Static16.aClass184_50.method5145()) {
			if (local6.anInt5230 <= Static445.anInt7791) {
				local6.method8227();
			} else {
				Static524.method8019((local6.anInt5225 << 7) + 64, (local6.anInt5226 << 7) + 64, arg0 >> 1, local6.anInt5224, arg3 >> 1, local6.anInt5227 * 2);
				Static511.aClass36_4.method7948(local6.aString117, 0, Static32.anIntArray66[1] + arg2, local6.anInt5229 | 0xFF000000, arg1 + Static32.anIntArray66[0]);
			}
		}
	}
}
