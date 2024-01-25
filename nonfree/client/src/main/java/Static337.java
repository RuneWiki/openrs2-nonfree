import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!oba", name = "f", descriptor = "I")
	public static int anInt6309;

	@OriginalMember(owner = "client!oba", name = "g", descriptor = "I")
	public static final int anInt6310 = -1;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(JB)V")
	public static void method5473(@OriginalArg(0) long arg0) {
		if (Static313.aClass206ArrayArrayArray2 != null) {
			if (Static464.anInt8003 == 1 || Static464.anInt8003 == 5) {
				Static335.method5458(arg0);
			} else if (Static464.anInt8003 == 4) {
				Static408.method6113(arg0);
			}
		}
		Static407.method6109(Static478.aClass9_10, (long) Static416.anInt7252);
		if (Static85.anInt2201 != -1) {
			Static136.method2912(Static85.anInt2201);
		}
		for (@Pc(41) int local41 = 0; local41 < Static361.anInt6491; local41++) {
			if (Static145.aBooleanArray14[local41]) {
				Static44.aBooleanArray8[local41] = true;
			}
			Static547.aBooleanArray42[local41] = Static145.aBooleanArray14[local41];
			Static145.aBooleanArray14[local41] = false;
		}
		Static358.anInt2385 = Static416.anInt7252;
		if (Static478.aClass9_10.method7640()) {
			Static256.aBoolean338 = true;
		}
		if (Static85.anInt2201 != -1) {
			Static361.anInt6491 = 0;
			Static27.method1183();
		}
		Static478.aClass9_10.n();
		Static199.method3709(Static478.aClass9_10);
		@Pc(98) int local98 = Static364.method5664();
		if (local98 == -1) {
			local98 = Static151.anInt3437;
		}
		if (local98 == -1) {
			local98 = Static59.anInt1653;
		}
		Static414.method6199(local98);
		Static499.method7150(Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189, Static309.anInt5936, Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191, Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94);
		Static309.anInt5936 = 0;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZBIZI)Lclient!kda;")
	public static Class160 method5474(@OriginalArg(0) boolean arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(5) Class51 local5 = null;
		if (Static231.aClass279_10 != null) {
			local5 = new Class51(arg2, Static231.aClass279_10, Static157.aClass279Array1[arg2], 1000000);
		}
		Static224.aClass87_Sub1Array1[arg2] = Static514.aClass218_1.method5553(Static298.aClass51_4, local5, arg2);
		if (arg0) {
			Static224.aClass87_Sub1Array1[arg2].method2846();
		}
		return new Class160(Static224.aClass87_Sub1Array1[arg2], arg1, 1);
	}
}
