import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
	public static int anInt7524 = 0;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!es;I)V")
	public static void method6544(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(15) int local15 = arg0.method8823();
		Static368.aClass308Array4 = new Class308[local15];
		for (@Pc(20) int local20 = 0; local20 < local15; local20++) {
			Static368.aClass308Array4[local20] = new Class308();
			Static368.aClass308Array4[local20].anInt7966 = arg0.method8823();
			Static368.aClass308Array4[local20].aString99 = arg0.method8844();
		}
		Static288.anInt4570 = arg0.method8823();
		Static362.anInt5464 = arg0.method8823();
		Static180.anInt9918 = arg0.method8823();
		Static659.aClass22_Sub1Array2 = new Class22_Sub1[Static362.anInt5464 + 1 - Static288.anInt4570];
		for (@Pc(68) int local68 = 0; local68 < Static180.anInt9918; local68++) {
			@Pc(74) int local74 = arg0.method8823();
			@Pc(82) Class22_Sub1 local82 = Static659.aClass22_Sub1Array2[local74] = new Class22_Sub1();
			local82.anInt1413 = arg0.method8865();
			local82.anInt1414 = arg0.method8850();
			local82.anInt1421 = Static288.anInt4570 + local74;
			local82.aString13 = arg0.method8844();
			local82.aString12 = arg0.method8844();
		}
		Static360.anInt6722 = arg0.method8850();
		Static502.aBoolean618 = true;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZILclient!kq;I)V")
	public static void method6546(@OriginalArg(1) int arg0, @OriginalArg(2) Class199 arg1, @OriginalArg(3) int arg2) {
		if (Static463.aBoolean582) {
			@Pc(14) Class257 local14 = Static231.anInt8415 == -1 ? null : Static482.aClass84_2.method2152(Static231.anInt8415);
			if (Static75.method1604(arg1).method819() && (Static25.anInt576 & 0x20) != 0 && (local14 == null || arg1.method4421(local14.anInt6617, Static231.anInt8415) != local14.anInt6617)) {
				Static321.method4431((long) (arg1.anInt5005 << 0 | arg1.anInt5041), arg1.anInt5002, false, Static203.aString30 + " -> " + arg1.aString50, Static111.anInt2192, 0L, false, arg1.anInt5041, 5, arg1.anInt5005, Static384.aString73, true);
			}
		}
		@Pc(92) String local92;
		for (@Pc(85) int local85 = 9; local85 >= 5; local85--) {
			local92 = Static96.method1969(local85, arg1);
			if (local92 != null) {
				Static321.method4431((long) (arg1.anInt5041 | arg1.anInt5005 << 0), arg1.anInt5002, false, arg1.aString50, Static562.method7443(arg1, local85), (long) (local85 + 1), false, arg1.anInt5041, 1003, arg1.anInt5005, local92, true);
			}
		}
		local92 = Static169.method2825(arg1);
		if (local92 != null) {
			Static321.method4431((long) (arg1.anInt5005 << 0 | arg1.anInt5041), arg1.anInt5002, false, arg1.aString50, arg1.anInt4990, 0L, false, arg1.anInt5041, 45, arg1.anInt5005, local92, true);
		}
		for (@Pc(178) int local178 = 4; local178 >= 0; local178--) {
			@Pc(185) String local185 = Static96.method1969(local178, arg1);
			if (local185 != null) {
				Static321.method4431((long) (arg1.anInt5041 | arg1.anInt5005 << 0), arg1.anInt5002, false, arg1.aString50, Static562.method7443(arg1, local178), (long) (local178 + 1), false, arg1.anInt5041, 49, arg1.anInt5005, local185, true);
			}
		}
		if (!Static75.method1604(arg1).method818()) {
			return;
		}
		if (arg1.aString49 == null) {
			Static321.method4431((long) (arg1.anInt5005 << 0 | arg1.anInt5041), arg1.anInt5002, false, "", -1, 0L, false, arg1.anInt5041, 17, arg1.anInt5005, Static279.aClass179_10.method4066(Static164.anInt2984), true);
		} else {
			Static321.method4431((long) (arg1.anInt5005 << 0 | arg1.anInt5041), arg1.anInt5002, false, "", -1, 0L, false, arg1.anInt5041, 17, arg1.anInt5005, arg1.aString49, true);
		}
	}
}
