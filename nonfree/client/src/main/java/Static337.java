import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!tr", name = "V", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray147;

	@OriginalMember(owner = "client!tr", name = "Y", descriptor = "I")
	public static int anInt5770;

	@OriginalMember(owner = "client!tr", name = "U", descriptor = "I")
	public static int anInt5767 = 0;

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)V")
	public static void method4968() {
		for (@Pc(15) Class2_Sub10_Sub1 local15 = (Class2_Sub10_Sub1) Static169.aClass30_19.method694(); local15 != null; local15 = (Class2_Sub10_Sub1) Static169.aClass30_19.method682()) {
			@Pc(20) Class1_Sub5_Sub2 local20 = local15.aClass1_Sub5_Sub2_1;
			if (local20.aByte69 != Static382.anInt6523 || Static253.anInt4469 > local20.anInt2526) {
				local15.method5617();
				local20.method2444();
			} else if (Static253.anInt4469 >= local20.anInt2539) {
				if (local20.anInt2548 > 0) {
					@Pc(53) Class1_Sub5_Sub1_Sub2 local53 = Static299.aClass1_Sub5_Sub1_Sub2Array1[local20.anInt2548 - 1];
					if (local53 != null && local53.anInt6390 >= 0 && Static246.anInt4374 * 128 > local53.anInt6390 && local53.anInt6386 >= 0 && local53.anInt6386 < Static185.anInt3485 * 128) {
						local20.method2442(local53.anInt6386, local53.anInt6390, Static170.method3006(local53.anInt6390, local53.anInt6386, local20.aByte69) - local20.anInt2535, Static253.anInt4469);
					}
				}
				if (local20.anInt2548 < 0) {
					@Pc(105) int local105 = -local20.anInt2548 - 1;
					@Pc(114) Class1_Sub5_Sub1_Sub1 local114;
					if (Static176.anInt3381 == local105) {
						local114 = Static206.aClass1_Sub5_Sub1_Sub1_1;
					} else {
						local114 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local105];
					}
					if (local114 != null && local114.anInt6390 >= 0 && Static246.anInt4374 * 128 > local114.anInt6390 && local114.anInt6386 >= 0 && local114.anInt6386 < Static185.anInt3485 * 128) {
						local20.method2442(local114.anInt6386, local114.anInt6390, Static170.method3006(local114.anInt6390, local114.anInt6386, local20.aByte69) - local20.anInt2535, Static253.anInt4469);
					}
				}
				local20.method2443(Static64.anInt1278);
				Static356.method5230(local20, true);
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IB)V")
	public static void method4969(@OriginalArg(0) int arg0) {
		Static67.anInt1291 = arg0;
		@Pc(7) Class160 local7 = Static238.aClass160_36;
		synchronized (Static238.aClass160_36) {
			Static238.aClass160_36.method3595();
		}
		local7 = Static208.aClass160_33;
		synchronized (Static208.aClass160_33) {
			Static208.aClass160_33.method3595();
		}
	}
}
