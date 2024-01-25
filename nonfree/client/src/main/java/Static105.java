import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!et", name = "Hc", descriptor = "[Lclient!tj;")
	public static Class239_Sub1[] aClass239_Sub1Array2;

	@OriginalMember(owner = "client!et", name = "Kc", descriptor = "[[I")
	public static int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(I)V")
	public static void method1301() {
		Static78.aClass20_3.method3403();
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			Static153.aLongArray3[local15] = 0L;
		}
		for (@Pc(27) int local27 = 0; local27 < 32; local27++) {
			Static41.aLongArray1[local27] = 0L;
		}
		Static55.anInt872 = 0;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIII)V")
	public static void method1302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static281.anInt4757 <= arg1 - arg3 && arg1 + arg3 <= Static457.anInt7264 && arg0 - arg3 >= Static142.anInt2163 && Static182.anInt3402 >= arg3 + arg0) {
			Static247.method3521(arg0, arg2, arg1, arg3);
		} else {
			Static297.method3934(arg2, arg1, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I[BIIII)Z")
	public static boolean method1305(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) boolean local15 = true;
		@Pc(20) Class1_Sub19 local20 = new Class1_Sub19(arg1);
		@Pc(22) int local22 = -1;
		label54: while (true) {
			@Pc(26) int local26 = local20.method2897();
			if (local26 == 0) {
				return local15;
			}
			local22 += local26;
			@Pc(37) int local37 = 0;
			@Pc(39) boolean local39 = false;
			while (true) {
				@Pc(45) int local45;
				while (!local39) {
					local45 = local20.method2883();
					if (local45 == 0) {
						continue label54;
					}
					local37 += local45 - 1;
					@Pc(72) int local72 = local37 & 0x3F;
					@Pc(78) int local78 = local37 >> 6 & 0x3F;
					@Pc(84) int local84 = local20.method2915() >> 2;
					@Pc(88) int local88 = local78 + arg0;
					@Pc(92) int local92 = arg4 + local72;
					if (local88 > 0 && local92 > 0 && local88 < arg2 - 1 && arg3 - 1 > local92) {
						@Pc(118) Class87 local118 = Static86.aClass248_7.method5246(local22);
						if (local84 != 22 || Static126.aClass19_Sub1_1.aBoolean387 || local118.anInt1928 != 0 || local118.lb == 1 || local118.aBoolean205) {
							local39 = true;
							if (!local118.method1576()) {
								local15 = false;
								Static448.anInt7120++;
							}
						}
					}
				}
				local45 = local20.method2883();
				if (local45 == 0) {
					break;
				}
				local20.method2915();
			}
		}
	}
}
