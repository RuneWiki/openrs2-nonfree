import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ba", name = "B", descriptor = "[I")
	public static int[] anIntArray35 = new int[2048];

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V")
	public static void method322() {
		@Pc(12) boolean local12 = false;
		while (!local12) {
			local12 = true;
			for (@Pc(18) int local18 = 0; local18 < Static8.anInt259 - 1; local18++) {
				if (Static106.aShortArray30[local18] < 1000 && Static106.aShortArray30[local18 + 1] > 1000) {
					local12 = false;
					@Pc(40) Class107 local40 = Static168.aClass107Array21[local18];
					Static168.aClass107Array21[local18] = Static168.aClass107Array21[local18 + 1];
					Static168.aClass107Array21[local18 + 1] = local40;
					@Pc(58) Class107 local58 = Static210.aClass107Array28[local18];
					Static210.aClass107Array28[local18] = Static210.aClass107Array28[local18 + 1];
					Static210.aClass107Array28[local18 + 1] = local58;
					@Pc(76) int local76 = Static152.anIntArray293[local18];
					Static152.anIntArray293[local18] = Static152.anIntArray293[local18 + 1];
					Static152.anIntArray293[local18 + 1] = local76;
					@Pc(94) int local94 = Static4.anIntArray378[local18];
					Static4.anIntArray378[local18] = Static4.anIntArray378[local18 + 1];
					Static4.anIntArray378[local18 + 1] = local94;
					@Pc(112) short local112 = Static106.aShortArray30[local18];
					Static106.aShortArray30[local18] = Static106.aShortArray30[local18 + 1];
					Static106.aShortArray30[local18 + 1] = local112;
					@Pc(130) long local130 = Static199.aLongArray6[local18];
					Static199.aLongArray6[local18] = Static199.aLongArray6[local18 + 1];
					Static199.aLongArray6[local18 + 1] = local130;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIZII)V")
	public static void method323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg2 - arg5;
		if (local6 < 0) {
			local6 = 0;
		}
		@Pc(15) int local15 = arg2;
		@Pc(18) int local18 = -arg2;
		@Pc(20) int local20 = local6;
		Static23.method417(arg2);
		@Pc(25) int local25 = -1;
		@Pc(31) int local31 = 0;
		@Pc(34) int local34 = -local6;
		@Pc(40) int local40 = -1;
		@Pc(63) int local63;
		@Pc(71) int local71;
		@Pc(80) int local80;
		@Pc(88) int local88;
		if (arg4 >= Static223.anInt4869 && Static47.anInt1057 >= arg4) {
			@Pc(54) int[] local54 = Static231.anIntArrayArray44[arg4];
			local63 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg0 - arg2);
			local71 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg2 + arg0);
			local80 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg0 - local6);
			local88 = Static123.method2091(Static38.anInt784, Static99.anInt915, local6 + arg0);
			Static162.method2605(local54, local63, arg1, local80);
			Static162.method2605(local54, local80, arg3, local88);
			Static162.method2605(local54, local88, arg1, local71);
		}
		while (local31 < local15) {
			local40 += 2;
			local34 += local40;
			local25 += 2;
			local18 += local25;
			if (local34 >= 0 && local20 >= 1) {
				local20--;
				local34 -= local20 << 1;
				Static92.anIntArray204[local20] = local31;
			}
			local31++;
			@Pc(210) int local210;
			@Pc(219) int local219;
			@Pc(226) int[] local226;
			@Pc(160) int local160;
			if (local18 >= 0) {
				local15--;
				local18 -= local15 << 1;
				local63 = arg4 + local15;
				local160 = arg4 - local15;
				if (Static223.anInt4869 <= local63 && local160 <= Static47.anInt1057) {
					if (local6 > local15) {
						local71 = Static92.anIntArray204[local15];
						local80 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg0 + local31);
						local88 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg0 - local31);
						local210 = Static123.method2091(Static38.anInt784, Static99.anInt915, local71 + arg0);
						local219 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg0 - local71);
						if (local63 <= Static47.anInt1057) {
							local226 = Static231.anIntArrayArray44[local63];
							Static162.method2605(local226, local88, arg1, local219);
							Static162.method2605(local226, local219, arg3, local210);
							Static162.method2605(local226, local210, arg1, local80);
						}
						if (local160 >= Static223.anInt4869) {
							local226 = Static231.anIntArrayArray44[local160];
							Static162.method2605(local226, local88, arg1, local219);
							Static162.method2605(local226, local219, arg3, local210);
							Static162.method2605(local226, local210, arg1, local80);
						}
					} else {
						local71 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg0 + local31);
						local80 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg0 - local31);
						if (Static47.anInt1057 >= local63) {
							Static162.method2605(Static231.anIntArrayArray44[local63], local80, arg1, local71);
						}
						if (Static223.anInt4869 <= local160) {
							Static162.method2605(Static231.anIntArrayArray44[local160], local80, arg1, local71);
						}
					}
				}
			}
			local160 = arg4 - local31;
			local63 = local31 + arg4;
			if (Static223.anInt4869 <= local63 && Static47.anInt1057 >= local160) {
				local71 = local15 + arg0;
				local80 = arg0 - local15;
				if (Static99.anInt915 <= local71 && Static38.anInt784 >= local80) {
					local71 = Static123.method2091(Static38.anInt784, Static99.anInt915, local71);
					local80 = Static123.method2091(Static38.anInt784, Static99.anInt915, local80);
					if (local6 > local31) {
						local88 = local31 <= local20 ? local20 : Static92.anIntArray204[local31];
						local210 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg0 + local88);
						local219 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg0 - local88);
						if (Static47.anInt1057 >= local63) {
							local226 = Static231.anIntArrayArray44[local63];
							Static162.method2605(local226, local80, arg1, local219);
							Static162.method2605(local226, local219, arg3, local210);
							Static162.method2605(local226, local210, arg1, local71);
						}
						if (local160 >= Static223.anInt4869) {
							local226 = Static231.anIntArrayArray44[local160];
							Static162.method2605(local226, local80, arg1, local219);
							Static162.method2605(local226, local219, arg3, local210);
							Static162.method2605(local226, local210, arg1, local71);
						}
					} else {
						if (local63 <= Static47.anInt1057) {
							Static162.method2605(Static231.anIntArrayArray44[local63], local80, arg1, local71);
						}
						if (Static223.anInt4869 <= local160) {
							Static162.method2605(Static231.anIntArrayArray44[local160], local80, arg1, local71);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)Lclient!vf;")
	public static Class1_Sub26 method324() {
		@Pc(8) Class1_Sub26 local8 = new Class1_Sub26(24);
		local8.method2967(3);
		local8.method2967(Static27.anInt523);
		local8.method2967(Static89.aBoolean176 ? 1 : 0);
		local8.method2967(Static100.aBoolean195 ? 1 : 0);
		local8.method2967(Static163.aBoolean317 ? 1 : 0);
		local8.method2967(Static142.aBoolean266 ? 1 : 0);
		local8.method2967(Static14.aBoolean30 ? 1 : 0);
		local8.method2967(Static179.aBoolean357 ? 1 : 0);
		local8.method2967(Static153.aBoolean296 ? 1 : 0);
		local8.method2967(Static163.aBoolean316 ? 1 : 0);
		local8.method2967(Static85.anInt1851);
		local8.method2967(Static169.aBoolean326 ? 1 : 0);
		local8.method2967(Static182.aBoolean362 ? 1 : 0);
		local8.method2967(Static224.aBoolean434 ? 1 : 0);
		local8.method2967(Static83.anInt1786);
		local8.method2967(Static73.aBoolean151 ? 1 : 0);
		local8.method2967(Static91.anInt1982);
		local8.method2967(Static157.anInt3449);
		local8.method2967(Static90.anInt1961);
		local8.method2963(Static112.anInt2482);
		local8.method2963(Static96.anInt2088);
		local8.method2967(Static156.aBoolean301 ? 1 : 0);
		return local8;
	}
}
