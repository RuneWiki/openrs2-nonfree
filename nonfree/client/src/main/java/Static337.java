import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!nba", name = "k", descriptor = "I")
	public static int anInt6232;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "I")
	public static int anInt6225 = 0;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIBI)V")
	public static void method5317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0 + Static191.anInt4147;
		@Pc(14) int local14 = Static247.anInt5049 + arg2;
		if (Static256.aClass224ArrayArrayArray1 == null || arg0 < 0 || arg2 < 0 || Static228.anInt4746 <= arg0 || Static44.anInt1275 <= arg2) {
			return;
		}
		@Pc(45) long local45 = (long) (local10 | local14 << 14 | arg1 << 28);
		@Pc(51) Class6_Sub35 local51 = (Class6_Sub35) Static516.aClass305_37.method7447(local45);
		if (local51 == null) {
			Static123.method2428(arg1, arg0, arg2);
			return;
		}
		@Pc(70) Class6_Sub43 local70 = (Class6_Sub43) local51.aClass211_47.method5183();
		if (local70 == null) {
			Static123.method2428(arg1, arg0, arg2);
			return;
		}
		@Pc(84) Class11_Sub2_Sub1 local84 = (Class11_Sub2_Sub1) Static123.method2428(arg1, arg0, arg2);
		if (local84 == null) {
			local84 = new Class11_Sub2_Sub1();
		} else {
			local84.anInt1053 = local84.anInt1049 = -1;
		}
		local84.anInt1048 = local70.anInt8487;
		local84.anInt1046 = local70.anInt8493;
		label46: while (true) {
			@Pc(112) Class6_Sub43 local112 = (Class6_Sub43) local51.aClass211_47.method5177();
			if (local112 == null) {
				break;
			}
			if (local112.anInt8493 != local84.anInt1046) {
				local84.anInt1053 = local112.anInt8493;
				local84.anInt1050 = local112.anInt8487;
				while (true) {
					@Pc(137) Class6_Sub43 local137 = (Class6_Sub43) local51.aClass211_47.method5177();
					if (local137 == null) {
						break label46;
					}
					if (local137.anInt8493 != local84.anInt1046 && local137.anInt8493 != local84.anInt1053) {
						local84.anInt1054 = local137.anInt8487;
						local84.anInt1049 = local137.anInt8493;
					}
				}
			}
		}
		@Pc(181) int local181 = Static482.method7333(arg1, (arg2 << 9) + 256, (arg0 << 9) - -256);
		Static71.method1501(arg1, arg0, arg2, local181, local84);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)Lclient!lc;")
	public static Class192 method5319(@OriginalArg(0) int arg0) {
		@Pc(8) Class192[] local8 = Static112.method2290();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(21) Class192 local21 = local8[local15];
			if (local21.anInt5553 == arg0) {
				return local21;
			}
		}
		return null;
	}
}
