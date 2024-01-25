import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!iaa", name = "D", descriptor = "Lclient!uu;")
	public static Class343 aClass343_114;

	@OriginalMember(owner = "client!iaa", name = "z", descriptor = "Lclient!st;")
	public static final Class314 aClass314_73 = new Class314(23, 7);

	@OriginalMember(owner = "client!iaa", name = "E", descriptor = "Z")
	public static boolean aBoolean336 = true;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIIII)V")
	public static void method3936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 != 8 && arg1 != 16) {
			@Pc(22) Class351 local22 = Static567.aClass351ArrayArrayArray4[arg3][arg5][arg0];
			if (local22 == null) {
				local22 = new Class351(arg3);
			}
			if (arg1 == 1) {
				local22.aShort116 = (short) arg2;
				local22.aShort117 = (short) arg4;
			} else if (arg1 == 2) {
				local22.aShort118 = (short) arg4;
				local22.aShort119 = (short) arg2;
			}
			if (Static365.aBoolean485) {
				Static405.method6309();
			}
			return;
		}
		@Pc(72) int local72;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(96) int local96;
		@Pc(106) int local106;
		if (arg1 != 8) {
			local72 = Static188.anInt3555 + (arg5 << Static485.anInt8241);
			local77 = local72 - Static188.anInt3555;
			local81 = arg0 << Static485.anInt8241;
			local86 = local81 + Static188.anInt3555;
			local96 = Static518.aClass91Array2[arg3].method7724(arg0, arg5 + 1);
			local106 = Static518.aClass91Array2[arg3].method7724(arg0 + 1, arg5);
			Static129.aClass153Array1[Static23.anInt340++] = new Class153(arg1, arg3, local72, local77, local77, local72, local96, local106, local106 - arg2, -arg2 + local96, local81, local86, local86, local81);
			return;
		}
		local72 = arg5 << Static485.anInt8241;
		local77 = local72 + Static188.anInt3555;
		local81 = arg0 << Static485.anInt8241;
		local86 = Static188.anInt3555 + local81;
		local96 = Static518.aClass91Array2[arg3].method7724(arg0, arg5);
		local106 = Static518.aClass91Array2[arg3].method7724(arg0 + 1, arg5 - -1);
		Static129.aClass153Array1[Static23.anInt340++] = new Class153(arg1, arg3, local72, local77, local77, local72, local96, local106, local106 - arg2, -arg2 + local96, local81, local86, local86, local81);
	}
}
