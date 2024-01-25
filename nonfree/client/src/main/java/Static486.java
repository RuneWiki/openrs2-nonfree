import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!uda", name = "h", descriptor = "[I")
	public static int[] anIntArray751;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "Lclient!bda;")
	public static final Class21 aClass21_7 = new Class21("WTRC", 1);

	@OriginalMember(owner = "client!uda", name = "e", descriptor = "Lclient!sm;")
	public static final Class271 aClass271_5 = new Class271();

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lclient!qa;ILclient!kr;Lclient!kr;)V")
	public static void method6640(@OriginalArg(0) Class122 arg0, @OriginalArg(2) Class171 arg1, @OriginalArg(3) Class171 arg2) {
		Static454.aClass232_8 = Static372.method5725(Static11.anInt295, arg2);
		Static435.aClass67_11 = arg0.method7270(Static454.aClass232_8, Static552.method3538(arg1, Static11.anInt295));
		Static448.aClass232_7 = Static372.method5725(Static341.anInt6104, arg2);
		Static112.aClass67_3 = arg0.method7270(Static448.aClass232_7, Static552.method3538(arg1, Static341.anInt6104));
		Static381.aClass232_6 = Static372.method5725(Static518.anInt8715, arg2);
		Static296.aClass67_9 = arg0.method7270(Static381.aClass232_6, Static552.method3538(arg1, Static518.anInt8715));
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIIIZ)V")
	public static void method6641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static544.aClass1_Sub22_Sub1_1.anInt5444 != 0 && arg3 != 0 && Static482.anInt7992 < 50 && arg2 != -1) {
			Static527.aClass35Array1[Static482.anInt7992++] = new Class35((byte) 1, arg2, arg3, arg4, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)V")
	public static void method6643() {
		@Pc(10) int local10 = Static544.aClass1_Sub22_Sub1_1.method4661(Static374.anInt6861);
		if (local10 == 0) {
			Static406.aByteArrayArrayArray15 = null;
			Static34.method784(0);
		} else if (local10 == 1) {
			Static432.method6286((byte) 0);
			Static34.method784(512);
			if (Static530.aByteArrayArrayArray17 != null) {
				Static126.method2142();
			}
		} else {
			Static432.method6286((byte) (Static45.anInt915 - 4 & 0xFF));
			Static34.method784(2);
		}
		Static429.anInt8178 = Static501.anInt8491;
	}

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "(I)V")
	public static void method6644() {
		if (Static50.aFloat13 < 1024.0F) {
			Static50.aFloat13 = 1024.0F;
		}
		if (Static50.aFloat13 > 3072.0F) {
			Static50.aFloat13 = 3072.0F;
		}
		while (Static404.aFloat156 >= 16384.0F) {
			Static404.aFloat156 -= 16384.0F;
		}
		while (Static404.aFloat156 < 0.0F) {
			Static404.aFloat156 += 16384.0F;
		}
		@Pc(41) int local41 = Static81.anInt1467 >> 9;
		@Pc(45) int local45 = Static69.anInt1327 >> 9;
		@Pc(53) int local53 = Static38.method884(Static501.anInt8491, Static81.anInt1467, Static69.anInt1327);
		@Pc(55) int local55 = 0;
		@Pc(79) int local79;
		if (local41 > 3 && local45 > 3 && local41 < Static459.anInt7799 - 4 && Static482.anInt7990 - 4 > local45) {
			for (local79 = local41 - 4; local79 <= local41 + 4; local79++) {
				for (@Pc(85) int local85 = local45 - 4; local85 <= local45 + 4; local85++) {
					@Pc(89) int local89 = Static501.anInt8491;
					if (local89 < 3 && Static505.method7002(local85, local79)) {
						local89++;
					}
					@Pc(100) int local100 = 0;
					if (Static367.aClass149_Sub1_2.aByteArrayArrayArray14 != null && Static367.aClass149_Sub1_2.aByteArrayArrayArray14[local89] != null) {
						local100 = (Static367.aClass149_Sub1_2.aByteArrayArrayArray14[local89][local79][local85] & 0xFF) * 8;
					}
					@Pc(133) int local133 = local53 + local100 - Static544.aClass205Array3[local89].ba(local79, local85);
					if (local55 < local133) {
						local55 = local133;
					}
				}
			}
		}
		local79 = (local55 >> 2) * 1536;
		if (local79 > 786432) {
			local79 = 786432;
		}
		if (local79 < 262144) {
			local79 = 262144;
		}
		if (Static384.anInt6973 < local79) {
			Static384.anInt6973 += (local79 - Static384.anInt6973) / 24;
		} else if (Static384.anInt6973 > local79) {
			Static384.anInt6973 += (local79 - Static384.anInt6973) / 80;
			return;
		}
	}
}
