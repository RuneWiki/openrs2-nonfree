import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ak", name = "X", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_10 = new Class21(64);

	@OriginalMember(owner = "client!ak", name = "bb", descriptor = "I")
	public static final int anInt276 = 1401;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!ct;Z)V")
	public static void method317(@OriginalArg(0) Class30 arg0) {
		Static152.aClass30_44 = arg0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)V")
	public static void method318(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static336.anInt6389 != -1) {
				Static181.method3455(Static336.anInt6389);
			}
			for (@Pc(14) Class1_Sub15 local14 = (Class1_Sub15) Static281.aClass38_30.method1474(); local14 != null; local14 = (Class1_Sub15) Static281.aClass38_30.method1470()) {
				if (!local14.method6047()) {
					local14 = (Class1_Sub15) Static281.aClass38_30.method1474();
					if (local14 == null) {
						break;
					}
				}
				Static15.method343(false, true, local14);
			}
			Static336.anInt6389 = -1;
			Static281.aClass38_30 = new Class38(8);
			Static46.method1123();
			Static336.anInt6389 = Static301.anInt5788;
			Static14.method4534(false);
			Static113.method2415();
			Static302.method5245(Static336.anInt6389);
		}
		Static281.method5016();
		Static45.anInt1171 = -1;
		Static290.method5227(Static235.anInt4746);
		Static191.aClass11_Sub2_Sub6_Sub1_4 = new Class11_Sub2_Sub6_Sub1();
		Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0] = 52;
		Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726 = 6656;
		Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729 = 6656;
		Static260.anInt5192 = 0;
		Static14.anInt4971 = 0;
		Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0] = 52;
		if (Static50.anInt1273 == 2) {
			Static260.anInt5192 = Static129.anInt2807 << 7;
			Static14.anInt4971 = Static319.anInt6112 << 7;
		} else {
			Static218.method4030();
		}
		Static119.method2539();
		if (Static14.anInt4971 == 0 || Static260.anInt5192 == 0) {
			Static44.method1064(10);
		} else {
			Static62.method1476();
			Static44.method1064(28);
		}
	}

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "(I)Lclient!eg;")
	public static Class1_Sub17 method321() {
		if (Static269.aClass42_21 == null || Static286.aClass50_4 == null) {
			return null;
		}
		for (@Pc(24) Class1_Sub17 local24 = (Class1_Sub17) Static286.aClass50_4.method1691(); local24 != null; local24 = (Class1_Sub17) Static286.aClass50_4.method1691()) {
			@Pc(31) Class194 local31 = Static226.method4184(local24.anInt1640);
			if (local31 != null && local31.aBoolean435 && local31.method5269()) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLclient!kg;II)V")
	public static void method322(@OriginalArg(1) Class112 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte23 == 0) {
			arg0.anInt3408 = arg0.anInt3375;
		} else if (arg0.aByte23 == 1) {
			arg0.anInt3408 = arg0.anInt3375 + (arg2 - arg0.anInt3381) / 2;
		} else if (arg0.aByte23 == 2) {
			arg0.anInt3408 = arg2 - arg0.anInt3381 - arg0.anInt3375;
		} else if (arg0.aByte23 == 3) {
			arg0.anInt3408 = arg2 * arg0.anInt3375 >> 14;
		} else if (arg0.aByte23 == 4) {
			arg0.anInt3408 = (arg0.anInt3375 * arg2 >> 14) + (arg2 - arg0.anInt3381) / 2;
		} else {
			arg0.anInt3408 = arg2 - arg0.anInt3381 - (arg0.anInt3375 * arg2 >> 14);
		}
		if (arg0.aByte21 == 0) {
			arg0.anInt3450 = arg0.anInt3416;
		} else if (arg0.aByte21 == 1) {
			arg0.anInt3450 = (arg1 - arg0.anInt3444) / 2 + arg0.anInt3416;
		} else if (arg0.aByte21 == 2) {
			arg0.anInt3450 = arg1 - arg0.anInt3416 - arg0.anInt3444;
		} else if (arg0.aByte21 == 3) {
			arg0.anInt3450 = arg1 * arg0.anInt3416 >> 14;
		} else if (arg0.aByte21 == 4) {
			arg0.anInt3450 = (arg1 - arg0.anInt3444) / 2 + (arg0.anInt3416 * arg1 >> 14);
		} else {
			arg0.anInt3450 = arg1 - arg0.anInt3444 - (arg0.anInt3416 * arg1 >> 14);
		}
		if (!Static339.aBoolean444) {
			return;
		}
		if (Static44.method1079(arg0).anInt6536 == 0 && arg0.anInt3373 != 0) {
			return;
		}
		if (arg0.anInt3408 < 0) {
			arg0.anInt3408 = 0;
		} else if (arg0.anInt3381 + arg0.anInt3408 > arg2) {
			arg0.anInt3408 = arg2 - arg0.anInt3381;
		}
		if (arg0.anInt3450 < 0) {
			arg0.anInt3450 = 0;
			return;
		}
		if (arg1 < arg0.anInt3444 + arg0.anInt3450) {
			arg0.anInt3450 = arg1 - arg0.anInt3444;
			return;
		}
	}
}
