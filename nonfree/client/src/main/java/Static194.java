import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!jl", name = "E", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
	public static int anInt3448;

	@OriginalMember(owner = "client!jl", name = "J", descriptor = "Lclient!co;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
	public static int anInt3446 = -1;

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(III)Z")
	public static boolean method2806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static440.anIntArrayArrayArray14[arg0][arg1][arg2];
		if (local7 == -Static226.anInt3951) {
			return false;
		} else if (local7 == Static226.anInt3951) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static168.anInt3026;
			@Pc(26) int local26 = arg2 << Static168.anInt3026;
			if (Static302.method4020(local22 + 1, Static244.aClass165Array8[arg0].l(arg1, arg2), local26 + 1) && Static302.method4020(local22 + Static363.anInt5820 - 1, Static244.aClass165Array8[arg0].l(arg1 + 1, arg2), local26 + 1) && Static302.method4020(local22 + Static363.anInt5820 - 1, Static244.aClass165Array8[arg0].l(arg1 + 1, arg2 + 1), local26 + Static363.anInt5820 - 1) && Static302.method4020(local22 + 1, Static244.aClass165Array8[arg0].l(arg1, arg2 + 1), local26 + Static363.anInt5820 - 1) && Static302.method4020(local22 + Static297.anInt4923, Static244.aClass165Array8[arg0].l(arg1, arg2), local26 + 1) && Static302.method4020(local22 + Static363.anInt5820 - 1, Static244.aClass165Array8[arg0].l(arg1 + 1, arg2), local26 + Static297.anInt4923) && Static302.method4020(local22 + Static297.anInt4923, Static244.aClass165Array8[arg0].l(arg1, arg2 + 1), local26 + Static363.anInt5820 - 1) && Static302.method4020(local22 + Static363.anInt5820 - 1, Static244.aClass165Array8[arg0].l(arg1, arg2), local26 + Static297.anInt4923) && Static302.method4020(local22 + Static297.anInt4923, Static244.aClass165Array8[arg0].l(arg1, arg2), local26 + Static297.anInt4923)) {
				Static440.anIntArrayArrayArray14[arg0][arg1][arg2] = Static226.anInt3951;
				return true;
			} else {
				Static440.anIntArrayArrayArray14[arg0][arg1][arg2] = -Static226.anInt3951;
				return false;
			}
		}
	}
}
