import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!bu", name = "m", descriptor = "Lclient!lga;")
	public static Class223 aClass223_11;

	@OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
	public static int anInt698;

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "Lclient!lga;")
	public static Class223 aClass223_12;

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_14 = new Class241(75, 18);

	@OriginalMember(owner = "client!bu", name = "j", descriptor = "Lclient!vo;")
	public static Class381 aClass381_1 = null;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIILclient!ao;II)V")
	public static void method680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class22 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 < 1 || arg4 < 1 || arg1 > Static29.anInt380 - 2 || arg4 > Static327.anInt5650 - 2) {
			return;
		}
		if (Static334.aClass243ArrayArrayArray2 == null) {
			return;
		}
		@Pc(46) Interface23 local46 = Static286.aClass116_Sub1_4.method3292(arg0, arg4, arg1, arg3);
		if (local46 == null) {
			return;
		}
		if (local46 instanceof Class60_Sub1_Sub1_Sub4) {
			((Class60_Sub1_Sub1_Sub4) local46).method5482(arg2);
			return;
		}
		if (local46 instanceof Class60_Sub1_Sub2_Sub1) {
			((Class60_Sub1_Sub2_Sub1) local46).method2791(arg2);
			return;
		}
		if (local46 instanceof Class60_Sub1_Sub3_Sub2) {
			((Class60_Sub1_Sub3_Sub2) local46).method7936(arg2);
		} else if (local46 instanceof Class60_Sub1_Sub5_Sub1) {
			((Class60_Sub1_Sub5_Sub1) local46).method6563(arg2);
			return;
		}
		return;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIIIII)V")
	public static void method681(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 != 8 && arg5 != 16) {
			@Pc(35) Class243 local35 = Static334.aClass243ArrayArrayArray2[arg1][arg3][arg2];
			if (local35 == null) {
				local35 = new Class243(arg1);
			}
			if (arg5 == 1) {
				local35.aShort73 = (short) arg0;
				local35.aShort72 = (short) arg4;
			} else if (arg5 == 2) {
				local35.aShort74 = (short) arg4;
				local35.aShort75 = (short) arg0;
			}
			if (Static370.aBoolean273) {
				Static19.method237();
				return;
			}
			return;
		}
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(97) int local97;
		@Pc(101) int local101;
		@Pc(111) int local111;
		@Pc(121) int local121;
		if (arg5 != 8) {
			local88 = (arg3 << Static594.anInt9440) + Static234.anInt4537;
			local93 = local88 - Static234.anInt4537;
			local97 = arg2 << Static594.anInt9440;
			local101 = Static234.anInt4537 + local97;
			local111 = Static524.aClass96Array2[arg1].method8080(arg3 + 1, arg2);
			local121 = Static524.aClass96Array2[arg1].method8080(arg3, arg2 + 1);
			Static329.aClass230Array4[Static373.anInt6284++] = new Class230(arg5, arg1, local88, local93, local93, local88, local111, local121, local121 - arg4, -arg4 + local111, local97, local101, local101, local97);
			return;
		}
		local88 = arg3 << Static594.anInt9440;
		local93 = local88 + Static234.anInt4537;
		local97 = arg2 << Static594.anInt9440;
		local101 = local97 + Static234.anInt4537;
		local111 = Static524.aClass96Array2[arg1].method8080(arg3, arg2);
		local121 = Static524.aClass96Array2[arg1].method8080(arg3 + 1, arg2 + 1);
		Static329.aClass230Array4[Static373.anInt6284++] = new Class230(arg5, arg1, local88, local93, local93, local88, local111, local121, local121 - arg4, local111 + -arg4, local97, local101, local101, local97);
	}
}
