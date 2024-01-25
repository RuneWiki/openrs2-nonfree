import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BB)V")
	public static void method3758(@OriginalArg(0) byte arg0) {
		if (Static45.aByteArrayArrayArray8 == null) {
			Static45.aByteArrayArrayArray8 = new byte[4][Static54.anInt1038][Static140.anInt3026];
		}
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			for (@Pc(24) int local24 = 0; local24 < Static54.anInt1038; local24++) {
				for (@Pc(28) int local28 = 0; local28 < Static140.anInt3026; local28++) {
					Static45.aByteArrayArrayArray8[local20][local24][local28] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I[BZ)V")
	public static void method3759(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1) {
		if (Static229.aClass3_Sub11_1 == null) {
			Static229.aClass3_Sub11_1 = new Class3_Sub11(20000);
		}
		Static229.aClass3_Sub11_1.method5184(arg0, arg0.length);
		if (!arg1) {
			return;
		}
		Static76.method1595(Static229.aClass3_Sub11_1.aByteArray62);
		Static563.aClass119_Sub1Array2 = new Class119_Sub1[Static320.anInt5439];
		@Pc(39) int local39 = 0;
		for (@Pc(41) int local41 = Static245.anInt4334; local41 <= Static24.anInt485; local41++) {
			@Pc(47) Class119_Sub1 local47 = Static368.method5399(local41);
			if (local47 != null) {
				Static563.aClass119_Sub1Array2[local39++] = local47;
			}
		}
		Static209.aBoolean287 = false;
		Static313.aLong147 = Static158.method2936();
		Static229.aClass3_Sub11_1 = null;
	}
}
