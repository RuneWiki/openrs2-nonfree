import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!lp", name = "t", descriptor = "Lclient!bp;")
	public static Class42 aClass42_1 = new Class42();

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!pu;Lclient!ha;IIII)V")
	public static void method5224(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class194 local9 = Static370.aClass377_4.method9048(arg0.anInt7713);
		if (local9.anInt5324 == -1) {
			return;
		}
		if (arg0.aBoolean585) {
			@Pc(36) int local36 = arg2 + arg0.anInt7723;
			arg2 = local36 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(48) Class33 local48 = local9.method4870(arg2, arg0.aBoolean586, arg1);
		if (local48 == null) {
			return;
		}
		@Pc(54) int local54 = arg0.anInt7764;
		@Pc(57) int local57 = arg0.anInt7765;
		if ((arg2 & 0x1) == 1) {
			local54 = arg0.anInt7765;
			local57 = arg0.anInt7764;
		}
		@Pc(71) int local71 = local48.method7645();
		@Pc(74) int local74 = local48.method7658();
		if (local9.aBoolean389) {
			local71 = local54 * 4;
			local74 = local57 * 4;
		}
		if (local9.anInt5325 == 0) {
			local48.method7651(arg4, arg3 + 4 - local57 * 4, local71, local74);
		} else {
			local48.method7656(arg4, arg3 + 4 - local57 * 4, local71, local74, 0, local9.anInt5325 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(IIII)Z")
	public static boolean method5230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static568.aClass239_8.method9238(arg2, arg1, arg0, Static78.anIntArray317);
		@Pc(13) int local13 = Static78.anIntArray317[2];
		if (local13 < 50) {
			return false;
		} else {
			Static78.anIntArray317[0] = Static69.anInt1323 + Static78.anIntArray317[0] * Static636.anInt10127 / local13;
			Static78.anIntArray317[1] = Static215.anInt4112 + Static78.anIntArray317[1] * Static587.anInt9462 / local13;
			Static78.anIntArray317[2] = local13;
			return true;
		}
	}
}
