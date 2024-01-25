import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!pca", name = "u", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_112 = new Class6(73, 12);

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IBIII)V")
	public static void method5662(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg2;
		@Pc(20) int local20 = -arg2;
		@Pc(22) int local22 = -1;
		@Pc(30) int local30 = Static193.method3621(Static299.anInt4491, arg2 + arg0, Static95.anInt2358);
		@Pc(39) int local39 = Static193.method3621(Static299.anInt4491, arg0 - arg2, Static95.anInt2358);
		Static227.method7421(local39, arg3, local30, Static81.anIntArrayArray25[arg1]);
		while (local15 < local17) {
			local22 += 2;
			local20 += local22;
			@Pc(70) int local70;
			@Pc(74) int local74;
			@Pc(92) int local92;
			@Pc(101) int local101;
			if (local20 > 0) {
				local17--;
				local20 -= local17 << 1;
				local70 = arg1 - local17;
				local74 = local17 + arg1;
				if (Static92.anInt2338 <= local74 && local70 <= Static341.anInt6379) {
					local92 = Static193.method3621(Static299.anInt4491, local15 + arg0, Static95.anInt2358);
					local101 = Static193.method3621(Static299.anInt4491, arg0 - local15, Static95.anInt2358);
					if (local74 <= Static341.anInt6379) {
						Static227.method7421(local101, arg3, local92, Static81.anIntArrayArray25[local74]);
					}
					if (Static92.anInt2338 <= local70) {
						Static227.method7421(local101, arg3, local92, Static81.anIntArrayArray25[local70]);
					}
				}
			}
			local15++;
			local70 = arg1 - local15;
			local74 = arg1 + local15;
			if (Static92.anInt2338 <= local74 && local70 <= Static341.anInt6379) {
				local92 = Static193.method3621(Static299.anInt4491, local17 + arg0, Static95.anInt2358);
				local101 = Static193.method3621(Static299.anInt4491, arg0 - local17, Static95.anInt2358);
				if (Static341.anInt6379 >= local74) {
					Static227.method7421(local101, arg3, local92, Static81.anIntArrayArray25[local74]);
				}
				if (Static92.anInt2338 <= local70) {
					Static227.method7421(local101, arg3, local92, Static81.anIntArrayArray25[local70]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)I")
	public static int method5664() {
		if (Static279.aClass309_6 == null) {
			if (!Static25.aBoolean94 && Static267.anInt5167 > 0) {
				if (Static179.aBoolean243 && Static126.aClass60_1.method5384(81) && Static267.anInt5167 > 2) {
					return ((Class1_Sub50) Static475.aClass38_69.aClass1_27.aClass1_284.aClass1_284).anInt8977;
				}
				return ((Class1_Sub50) Static475.aClass38_69.aClass1_27.aClass1_284).anInt8977;
			}
			@Pc(40) int local40 = Static42.aClass191_1.method5138();
			@Pc(44) int local44 = Static42.aClass191_1.method5141();
			@Pc(46) int local46 = Static504.anInt8565;
			@Pc(48) int local48 = Static380.anInt6684;
			@Pc(50) int local50 = Static85.anInt2199;
			if (local46 < local40 && local50 + local46 > local40) {
				@Pc(68) int local68 = -1;
				@Pc(87) int local87;
				for (@Pc(70) int local70 = 0; local70 < Static267.anInt5167; local70++) {
					if (Static536.aBoolean650) {
						local87 = local48 + (-local70 + -1 + Static267.anInt5167) * 16 + 33;
						if (local87 - 13 < local44 && local87 + 3 >= local44) {
							local68 = local70;
						}
					} else {
						local87 = (Static267.anInt5167 - local70 - 1) * 16 + local48 + 31;
						if (local44 > local87 - 13 && local44 <= local87 + 3) {
							local68 = local70;
						}
					}
				}
				if (local68 != -1) {
					local87 = 0;
					@Pc(160) Class157 local160 = new Class157(Static475.aClass38_69);
					for (@Pc(165) Class1_Sub50 local165 = (Class1_Sub50) local160.method4036(); local165 != null; local165 = (Class1_Sub50) local160.method4037()) {
						if (local87++ == local68) {
							return local165.anInt8977;
						}
					}
				}
			}
		}
		return -1;
	}
}
