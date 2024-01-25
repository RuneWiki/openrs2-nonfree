import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!bv", name = "qb", descriptor = "[I")
	public static final int[] anIntArray64 = new int[13];

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BILclient!wv;I)V")
	public static void method1232(@OriginalArg(1) int arg0, @OriginalArg(2) Class365 arg1, @OriginalArg(3) int arg2) {
		if (Static22.aBoolean43) {
			@Pc(18) Class105 local18 = Static397.anInt6847 == -1 ? null : Static88.aClass183_1.method4071(Static397.anInt6847);
			if (Static72.method1565(arg1).method4816() && (Static434.anInt7646 & 0x20) != 0 && (local18 == null || arg1.method7905(Static397.anInt6847, local18.anInt2858) != local18.anInt2858)) {
				Static374.method5440(true, arg1.anInt9573, 2, Static559.aString92, false, 0L, Static3.anInt71, arg1.anInt9646, arg1.anInt9603, Static264.aString51 + " -> " + arg1.aString98);
			}
		}
		@Pc(88) String local88;
		for (@Pc(81) int local81 = 9; local81 >= 5; local81--) {
			local88 = Static522.method7127(arg1, local81);
			if (local88 != null) {
				Static374.method5440(true, arg1.anInt9573, 1001, local88, false, (long) (local81 + 1), Static198.method3409(local81, arg1), arg1.anInt9646, arg1.anInt9603, arg1.aString98);
			}
		}
		local88 = Static161.method2491(arg1);
		if (local88 != null) {
			Static374.method5440(true, arg1.anInt9573, 60, local88, false, 0L, arg1.anInt9591, arg1.anInt9646, arg1.anInt9603, arg1.aString98);
		}
		for (@Pc(149) int local149 = 4; local149 >= 0; local149--) {
			@Pc(156) String local156 = Static522.method7127(arg1, local149);
			if (local156 != null) {
				Static374.method5440(true, arg1.anInt9573, 50, local156, false, (long) (local149 + 1), Static198.method3409(local149, arg1), arg1.anInt9646, arg1.anInt9603, arg1.aString98);
			}
		}
		if (!Static72.method1565(arg1).method4811()) {
			return;
		}
		if (arg1.aString95 == null) {
			Static374.method5440(true, arg1.anInt9573, 48, Static103.aClass77_11.method1864(Static562.anInt9127), false, 0L, -1, arg1.anInt9646, arg1.anInt9603, "");
		} else {
			Static374.method5440(true, arg1.anInt9573, 48, arg1.aString95, false, 0L, -1, arg1.anInt9646, arg1.anInt9603, "");
		}
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(IIIIII)I")
	public static int method1233(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static20.aClass17Array1 == null) {
			return 0;
		} else if (arg1 < 3) {
			@Pc(20) int local20 = arg2 >> 9;
			@Pc(24) int local24 = arg0 >> 9;
			if (arg4 < 0 || arg3 < 0 || arg4 > Static500.anInt6888 - 1 || arg3 > Static573.anInt9325 - 1) {
				return 0;
			} else if (local20 >= 1 && local24 >= 1 && Static500.anInt6888 - 1 >= local20 && local24 <= Static573.anInt9325 - 1) {
				@Pc(100) boolean local100 = (Static511.aByteArrayArrayArray19[1][arg2 >> 9][arg0 >> 9] & 0x2) != 0;
				@Pc(128) boolean local128;
				@Pc(144) boolean local144;
				if ((arg2 & 0x1FF) == 0) {
					local128 = (Static511.aByteArrayArrayArray19[1][local20 - 1][arg0 >> 9] & 0x2) != 0;
					local144 = (Static511.aByteArrayArrayArray19[1][local20][arg0 >> 9] & 0x2) != 0;
					if (local128 != local144) {
						local100 = (Static511.aByteArrayArrayArray19[1][arg4][arg3] & 0x2) != 0;
					}
				}
				if ((arg0 & 0x1FF) == 0) {
					local128 = (Static511.aByteArrayArrayArray19[1][arg2 >> 9][local24 - 1] & 0x2) != 0;
					local144 = (Static511.aByteArrayArrayArray19[1][arg2 >> 9][local24] & 0x2) != 0;
					if (local144 != local128) {
						local100 = (Static511.aByteArrayArrayArray19[1][arg4][arg3] & 0x2) != 0;
					}
				}
				if (local100) {
					arg1++;
				}
				return Static20.aClass17Array1[arg1].method6637(arg2, arg0);
			} else {
				return 0;
			}
		} else {
			return Static20.aClass17Array1[arg1].method6637(arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZLclient!kba;)V")
	public static void method1236(@OriginalArg(1) Class20_Sub2_Sub4_Sub1_Sub1 arg0) {
		@Pc(15) Class1_Sub30 local15 = (Class1_Sub30) Static332.aClass356_27.method7796((long) arg0.anInt6407);
		if (local15 == null) {
			return;
		}
		if (local15.aClass1_Sub8_Sub1_4 != null) {
			Static298.aClass1_Sub8_Sub4_2.method6033(local15.aClass1_Sub8_Sub1_4);
			local15.aClass1_Sub8_Sub1_4 = null;
		}
		local15.method7878();
	}
}
