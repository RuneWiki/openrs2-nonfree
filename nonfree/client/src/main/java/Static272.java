import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
	public static int anInt6592;

	@OriginalMember(owner = "client!jv", name = "j", descriptor = "[Lclient!pga;")
	public static Class32[] aClass32Array15;

	@OriginalMember(owner = "client!jv", name = "l", descriptor = "[[[Lclient!ffa;")
	public static Class97[][][] aClass97ArrayArrayArray3;

	@OriginalMember(owner = "client!jv", name = "g", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_116 = new Class268(15, 6);

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IZIII)V")
	public static void method5662(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 - arg0 >= Static347.anInt6542 && arg0 + arg3 <= Static553.anInt9425 && arg1 - arg0 >= Static100.anInt10042 && Static567.anInt9578 >= arg0 + arg1) {
			Static10.method213(arg2, arg0, arg1, arg3);
		} else {
			Static316.method5294(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)V")
	public static void method5664() {
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			Static303.aBooleanArray32[local12] = false;
		}
		Static624.anInt10280 = -1;
		Static160.anInt3352 = -1;
		Static518.anInt9068 = -1;
		Static224.anInt4365 = -1;
		Static358.anInt6653 = 0;
		Static334.anInt6354 = 1;
		Static222.anInt4352 = 0;
	}
}
