import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!ho", name = "J", descriptor = "I")
	public static int anInt3831;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(II[BBII)Z")
	public static boolean method3349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) boolean local13 = true;
		@Pc(18) Class5_Sub23 local18 = new Class5_Sub23(arg2);
		@Pc(20) int local20 = -1;
		label54: while (true) {
			@Pc(24) int local24 = local18.method8542();
			if (local24 == 0) {
				return local13;
			}
			local20 += local24;
			@Pc(32) int local32 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(42) int local42;
				while (!local36) {
					local42 = local18.method8499();
					if (local42 == 0) {
						continue label54;
					}
					local32 += local42 - 1;
					@Pc(71) int local71 = local32 & 0x3F;
					@Pc(77) int local77 = local32 >> 6 & 0x3F;
					@Pc(83) int local83 = local18.method8529() >> 2;
					@Pc(88) int local88 = local77 + arg1;
					@Pc(92) int local92 = arg0 + local71;
					if (local88 > 0 && local92 > 0 && arg4 - 1 > local88 && arg3 - 1 > local92) {
						@Pc(118) Class55 local118 = Static536.aClass392_2.method9293(0, local20);
						if (local83 != 22 || Static637.aClass5_Sub20_31.aClass24_Sub18_1.method6492() != 0 || local118.anInt951 != 0 || local118.anInt948 == 1 || local118.aBoolean91) {
							local36 = true;
							if (!local118.method850()) {
								local13 = false;
								Static68.anInt1101++;
							}
						}
					}
				}
				local42 = local18.method8499();
				if (local42 == 0) {
					break;
				}
				local18.method8529();
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "(I)V")
	public static void method3356() {
		for (@Pc(6) Class5_Sub5_Sub19 local6 = (Class5_Sub5_Sub19) Static199.aClass102_63.method1916(); local6 != null; local6 = (Class5_Sub5_Sub19) Static199.aClass102_63.method1915()) {
			if (Static169.method2466(local6.anInt9210)) {
				Static281.method4143(local6);
			}
		}
		if (255 == 255) {
			;
		}
	}
}
