import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "Lclient!fv;")
	public static Class111 aClass111_2;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "Lclient!db;")
	public static final Class64 aClass64_346 = new Class64(4, 6);

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray30 = new boolean[100];

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!gba;ZI)V")
	public static void method6072(@OriginalArg(0) Class115 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int local12 = arg0.anInt3462 == 0 ? arg0.anInt3474 : arg0.anInt3462;
		@Pc(24) int local24 = arg0.anInt3484 == 0 ? arg0.anInt3481 : arg0.anInt3484;
		Static245.method4151(local12, Static458.aClass115ArrayArray2[arg0.anInt3464 >> 16], local24, arg1, arg0.anInt3464);
		if (arg0.aClass115Array1 != null) {
			Static245.method4151(local12, arg0.aClass115Array1, local24, arg1, arg0.anInt3464);
		}
		@Pc(57) Class4_Sub49 local57 = (Class4_Sub49) Static543.aClass183_39.method4289((long) arg0.anInt3464);
		if (local57 != null) {
			Static252.method4233(arg1, local57.anInt9337, local12, local24);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)Lclient!ed;")
	public static Class84 method6074(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class84 local15 = new Class84();
		local15.anInt2635 = -1;
		local15.anInt2631 = arg0 + 1 + 5;
		local15.anInt2638 = -1;
		local15.anInt2646 = arg1 + 5 + 1;
		local15.anIntArrayArray37 = new int[local15.anInt2631][local15.anInt2646];
		local15.method2344();
		return local15;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZIIII)V")
	public static void method6075(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(12) int local12 = -arg3;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static572.method7817(Static68.anInt1306, arg3 + arg0, Static589.anInt9684);
		@Pc(35) int local35 = Static572.method7817(Static68.anInt1306, arg0 - arg3, Static589.anInt9684);
		Static336.method5023(arg2, local22, Static383.anIntArrayArray62[arg1], local35);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			@Pc(67) int local67;
			@Pc(72) int local72;
			@Pc(90) int local90;
			@Pc(99) int local99;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local67 = arg1 - local9;
				local72 = arg1 + local9;
				if (Static252.anInt4971 <= local72 && Static359.anInt6232 >= local67) {
					local90 = Static572.method7817(Static68.anInt1306, arg0 + local7, Static589.anInt9684);
					local99 = Static572.method7817(Static68.anInt1306, arg0 - local7, Static589.anInt9684);
					if (Static359.anInt6232 >= local72) {
						Static336.method5023(arg2, local90, Static383.anIntArrayArray62[local72], local99);
					}
					if (local67 >= Static252.anInt4971) {
						Static336.method5023(arg2, local90, Static383.anIntArrayArray62[local67], local99);
					}
				}
			}
			local7++;
			local67 = arg1 - local7;
			local72 = local7 + arg1;
			if (local72 >= Static252.anInt4971 && Static359.anInt6232 >= local67) {
				local90 = Static572.method7817(Static68.anInt1306, local9 + arg0, Static589.anInt9684);
				local99 = Static572.method7817(Static68.anInt1306, arg0 - local9, Static589.anInt9684);
				if (local72 <= Static359.anInt6232) {
					Static336.method5023(arg2, local90, Static383.anIntArrayArray62[local72], local99);
				}
				if (local67 >= Static252.anInt4971) {
					Static336.method5023(arg2, local90, Static383.anIntArrayArray62[local67], local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public static void method6076() {
		Static529.aClass223_62.method4941();
		Static401.aClass223_47.method4941();
		Static304.aClass223_43.method4941();
		Static258.aClass223_37.method4941();
	}
}
