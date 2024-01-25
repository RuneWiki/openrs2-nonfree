import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cda", name = "j", descriptor = "[Lclient!xa;")
	public static Class66[] aClass66Array1;

	@OriginalMember(owner = "client!cda", name = "i", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_32 = new Class254(116, 3);

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method1320(@OriginalArg(1) Class9 arg0) {
		arg0.ca(0, 0, Static228.anInt4744, 350);
		arg0.C(0, 0, Static228.anInt4744, 350, Static352.anInt6780 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static91.anInt2220;
		@Pc(36) int local36;
		if (Static211.anInt9770 > 0) {
			local36 = 346 - Static91.anInt2220 - 4;
			@Pc(47) int local47 = local36 * local27 / (local27 + Static211.anInt9770 - 1);
			@Pc(49) int local49 = 4;
			if (Static211.anInt9770 > 1) {
				local49 = (Static211.anInt9770 - Static63.anInt1505 - 1) * (local36 + -local47) / (Static211.anInt9770 - 1) + 4;
			}
			arg0.C(Static228.anInt4744 - 16, local49, 12, local47, Static352.anInt6780 << 24 | 0x332277, 2);
			for (@Pc(86) int local86 = Static63.anInt1505; local27 + Static63.anInt1505 > local86 && local86 < Static211.anInt9770; local86++) {
				@Pc(95) String[] local95 = Static288.method4721(Static301.aStringArray32[local86], '\b');
				@Pc(104) int local104 = (Static228.anInt4744 - 8 - 16) / local95.length;
				for (@Pc(106) int local106 = 0; local106 < local95.length; local106++) {
					@Pc(114) int local114 = local106 * local104 + 8;
					arg0.ca(local114, 0, local104 + local114 - 8, 350);
					Static42.aClass73_1.method7888(local95[local106], -1, -16777216, local114, 350 - Static91.anInt2220 * (local86 - Static63.anInt1505) - Static545.anInt9336 - Static387.aClass82_9.anInt2524 - 2);
				}
			}
		}
		arg0.ca(0, 0, Static228.anInt4744, 350);
		arg0.method5397(-1, Static228.anInt4744, 350 - Static545.anInt9336, 0);
		Static489.aClass73_5.method7888("--> " + Static466.aString103, -1, -16777216, 10, 350 - Static1.aClass82_1.anInt2524 - 1);
		if (!Static510.aBoolean503) {
			return;
		}
		local36 = -1;
		if (Static508.anInt8998 % 30 > 15) {
			local36 = 16777215;
		}
		arg0.method5467(local36, Static1.aClass82_1.method2292("--> " + Static466.aString103.substring(0, Static43.anInt1259)) + 10, -Static1.aClass82_1.anInt2524 + 350 + -11, 12);
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lclient!vp;IIII)V")
	public static void method1321(@OriginalArg(0) Class288 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static371.method5918(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static396.anInt7505) {
			Static371.method5918(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static371.method5918(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static54.anInt1441) {
			Static371.method5918(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static54.anInt1441) {
			Static371.method5918(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static396.anInt7505 && arg4 <= Static54.anInt1441) {
			Static371.method5918(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static371.method5918(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static396.anInt7505 && arg4 > 0) {
			Static371.method5918(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
