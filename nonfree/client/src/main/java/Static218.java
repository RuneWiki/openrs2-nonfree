import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "Lclient!ik;")
	public static Class182 aClass182_59;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "[I")
	public static int[] anIntArray249;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIZ)V")
	public static void method3251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static488.anInt7680 != 1) {
			return;
		}
		@Pc(14) int local14 = arg1 / Static91.anInt2080;
		@Pc(18) int local18 = arg2 / Static91.anInt2080;
		@Pc(22) int local22 = arg3 / Static703.anInt10979;
		@Pc(33) int local33 = arg0 / Static703.anInt10979;
		if (Static268.anInt4147 <= local14 || local18 < 0 || Static250.anInt3897 <= local22 || local33 < 0) {
			return;
		}
		if (local22 < 0) {
			local22 = 0;
		}
		if (Static250.anInt3897 <= local33) {
			local33 = Static250.anInt3897 - 1;
		}
		if (Static268.anInt4147 <= local18) {
			local18 = Static268.anInt4147 - 1;
		}
		if (local14 < 0) {
			local14 = 0;
		}
		for (@Pc(85) int local85 = local22; local85 <= local33; local85++) {
			@Pc(103) int local103 = Static639.method8418(Static250.anInt3897, Static406.anInt10703 + local85) * Static268.anInt4147;
			for (@Pc(105) int local105 = local14; local105 <= local18; local105++) {
				@Pc(117) int local117 = local103 + Static639.method8418(Static268.anInt4147, Static614.anInt9291 + local105);
				Static705.anIntArray783[local117] = Static683.anInt10656;
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)Z")
	public static boolean method3253(@OriginalArg(1) int arg0) {
		for (@Pc(18) Class3_Sub7_Sub10 local18 = (Class3_Sub7_Sub10) Static419.aClass342_81.method7644(); local18 != null; local18 = (Class3_Sub7_Sub10) Static419.aClass342_81.method7650()) {
			if (Static496.method6774(local18.anInt3913) && (long) arg0 == local18.aLong145) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIII)Z")
	public static boolean method3254(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static42.aBoolean87 || !Static497.aBoolean530) {
			return false;
		} else if (Static532.anInt8283 < 100) {
			return false;
		} else if (Static323.method4705(arg0, arg1, arg3)) {
			@Pc(31) int local31 = arg3 << Static626.anInt9669;
			@Pc(43) int local43 = arg1 << Static626.anInt9669;
			if (Static84.method1820(local43, Static308.anInt4969, Static308.anInt4969, local31, arg2, Static477.aClass259Array3[arg0].method9295(arg1, arg3))) {
				Static456.anInt7106++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
