import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cu", name = "G", descriptor = "Lclient!eea;")
	public static final Class71 aClass71_16 = new Class71();

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIII)V")
	public static void method1459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg1 + Static223.anInt4827;
		@Pc(22) int local22 = arg2 + Static150.anInt3027;
		if (Static279.aClass290ArrayArrayArray7 == null || arg1 < 0 || arg2 < 0 || Static118.anInt2527 <= arg1 || Static549.anInt9482 <= arg2) {
			return;
		}
		@Pc(50) long local50 = (long) (arg0 << 28 | local22 << 14 | local9);
		@Pc(56) Class3_Sub12 local56 = (Class3_Sub12) Static476.aClass267_37.method6644(local50);
		if (local56 == null) {
			Static201.method3751(arg0, arg1, arg2);
			return;
		}
		@Pc(70) Class3_Sub32 local70 = (Class3_Sub32) local56.aClass71_13.method2089();
		if (local70 == null) {
			Static201.method3751(arg0, arg1, arg2);
			return;
		}
		@Pc(84) Class6_Sub5_Sub1 local84 = (Class6_Sub5_Sub1) Static201.method3751(arg0, arg1, arg2);
		if (local84 == null) {
			local84 = new Class6_Sub5_Sub1();
		} else {
			local84.anInt8142 = local84.anInt8145 = -1;
		}
		local84.anInt8137 = local70.anInt5994;
		local84.anInt8144 = local70.anInt5999;
		label46: while (true) {
			@Pc(112) Class3_Sub32 local112 = (Class3_Sub32) local56.aClass71_13.method2086();
			if (local112 == null) {
				break;
			}
			if (local112.anInt5999 != local84.anInt8144) {
				local84.anInt8148 = local112.anInt5994;
				local84.anInt8142 = local112.anInt5999;
				while (true) {
					@Pc(133) Class3_Sub32 local133 = (Class3_Sub32) local56.aClass71_13.method2086();
					if (local133 == null) {
						break label46;
					}
					if (local133.anInt5999 != local84.anInt8144 && local133.anInt5999 != local84.anInt8142) {
						local84.anInt8143 = local133.anInt5994;
						local84.anInt8145 = local133.anInt5999;
					}
				}
			}
		}
		@Pc(177) int local177 = Static58.method1166((arg2 << 9) + 256, (arg1 << 9) + 256, arg0);
		Static227.method4089(arg0, arg1, arg2, local177, local84);
	}
}
