import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method361(@OriginalArg(1) Class30 arg0) {
		arg0.w(0, 0, Static374.anInt6595, 350);
		arg0.M(0, 0, Static374.anInt6595, 350, Static72.anInt1777 << 24 | 0x332277, 1);
		@Pc(38) int local38 = 350 / Static332.anInt5914;
		@Pc(50) int local50;
		if (Static15.anInt304 > 0) {
			local50 = 346 - Static332.anInt5914 - 4;
			@Pc(60) int local60 = local38 * local50 / (Static15.anInt304 + local38 - 1);
			@Pc(62) int local62 = 4;
			if (Static15.anInt304 > 1) {
				local62 = (Static15.anInt304 - Static210.anInt4285 - 1) * (-local60 + local50) / (Static15.anInt304 - 1) + 4;
			}
			arg0.M(Static374.anInt6595 - 16, local62, 12, local60, Static72.anInt1777 << 24 | 0x332277, 2);
			for (@Pc(99) int local99 = Static210.anInt4285; local38 + Static210.anInt4285 > local99 && local99 < Static15.anInt304; local99++) {
				@Pc(108) String[] local108 = Static399.method5642(Static65.aStringArray8[local99], '\b');
				@Pc(117) int local117 = (Static374.anInt6595 - 16 - 8) / local108.length;
				for (@Pc(119) int local119 = 0; local119 < local108.length; local119++) {
					@Pc(127) int local127 = local119 * local117 + 8;
					arg0.w(local127, 0, local117 + local127 - 8, 350);
					Static330.aClass18_3.method5769(local108[local119], local127, -16777216, 350 - Static115.aClass84_4.anInt2634 - Static395.anInt6979 - (-Static210.anInt4285 + local99) * Static332.anInt5914 - 2, -1);
				}
			}
		}
		arg0.w(0, 0, Static374.anInt6595, 350);
		arg0.method2037(350 - Static395.anInt6979, -1, 0, Static374.anInt6595);
		Static247.aClass18_2.method5769("--> " + Static132.aString19, 10, -16777216, 350 - Static296.aClass84_10.anInt2634 - 1, -1);
		local50 = -1;
		if (Static277.anInt2834 % 30 > 15) {
			local50 = 16777215;
		}
		arg0.method2093(350 - Static296.aClass84_10.anInt2634 - 11, local50, Static296.aClass84_10.method2381("--> " + Static132.aString19.substring(0, Static18.anInt358)) + 10, 12);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIZIII)V")
	public static void method363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static54.anInt1312 = arg0;
		Static111.anInt2407 = arg1;
		Static335.anInt5944 = arg2;
		Static5.anInt65 = arg4;
		Static372.anInt6454 = arg5;
		if (arg3 && Static335.anInt5944 >= 100) {
			Static235.anInt4645 = Static111.anInt2407 * 128 + 64;
			Static108.anInt2350 = Static372.anInt6454 * 128 + 64;
			Static405.anInt7103 = Static21.method356(Static235.anInt4645, Static108.anInt2350, Static59.anInt1472) - Static5.anInt65;
		}
		Static275.anInt5173 = 2;
	}
}
