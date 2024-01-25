import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!nfa", name = "R", descriptor = "F")
	public static float aFloat192;

	@OriginalMember(owner = "client!nfa", name = "P", descriptor = "[I")
	public static final int[] anIntArray682 = new int[8];

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IBI)Z")
	public static boolean method7378(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x60000) != 0 | Static211.method3680(arg1, arg0) || Static378.method5648(arg0, arg1);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ILclient!ii;)[Lclient!nga;")
	public static Class242[] method7379(@OriginalArg(1) Class161 arg0) {
		if (!arg0.method3816()) {
			return new Class242[0];
		}
		@Pc(18) Class299 local18 = arg0.method3825();
		while (local18.anInt7985 == 0) {
			Static55.method845(10L);
		}
		if (local18.anInt7985 == 2) {
			return new Class242[0];
		}
		@Pc(45) int[] local45 = (int[]) local18.anObject41;
		@Pc(51) Class242[] local51 = new Class242[local45.length >> 2];
		for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
			@Pc(59) Class242 local59 = new Class242();
			local51[local53] = local59;
			local59.anInt6163 = local45[local53 << 2];
			local59.anInt6170 = local45[(local53 << 2) + 1];
			local59.anInt6161 = local45[(local53 << 2) + 2];
			local59.anInt6166 = local45[(local53 << 2) + 3];
		}
		return local51;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lclient!gba;I)Lclient!gba;")
	public static Class115 method7380(@OriginalArg(0) Class115 arg0) {
		if (arg0.anInt3441 != -1) {
			return Static92.method2118(arg0.anInt3441);
		}
		@Pc(24) int local24 = arg0.anInt3464 >>> 16;
		@Pc(29) Class112 local29 = new Class112(Static543.aClass183_39);
		for (@Pc(34) Class4_Sub49 local34 = (Class4_Sub49) local29.method3093(); local34 != null; local34 = (Class4_Sub49) local29.method3094()) {
			if (local24 == local34.anInt9337) {
				return Static92.method2118((int) local34.aLong307);
			}
		}
		return null;
	}
}
