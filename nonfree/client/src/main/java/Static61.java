import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cca", name = "g", descriptor = "Lclient!gaa;")
	public static Class119 aClass119_1;

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "Lclient!cca;")
	public static final Class44 aClass44_1 = new Class44();

	@OriginalMember(owner = "client!cca", name = "d", descriptor = "Lclient!cca;")
	public static final Class44 aClass44_2 = new Class44();

	@OriginalMember(owner = "client!cca", name = "e", descriptor = "Lclient!cca;")
	public static final Class44 aClass44_3 = new Class44();

	@OriginalMember(owner = "client!cca", name = "f", descriptor = "Lclient!cca;")
	public static final Class44 aClass44_4 = new Class44();

	@OriginalMember(owner = "client!cca", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray4 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!cca", name = "i", descriptor = "Z")
	public static boolean aBoolean57 = false;

	@OriginalMember(owner = "client!cca", name = "j", descriptor = "Lclient!jn;")
	public static final Class178 aClass178_2 = new Class178(2, 4, 4, 0);

	@OriginalMember(owner = "client!cca", name = "k", descriptor = "I")
	public static final int anInt1088 = 0;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIII)V")
	public static void method1047(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17 = Static427.anInt7462 + arg2;
		@Pc(21) int local21 = Static22.anInt329 + arg1;
		if (Static567.aClass351ArrayArrayArray4 == null || arg2 < 0 || arg1 < 0 || arg2 >= Static399.anInt7121 || arg1 >= Static24.anInt345 || Static32.aClass3_Sub41_3.aClass7_Sub13_2.method5385() == 0 && arg0 != Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127) {
			return;
		}
		@Pc(72) long local72 = (long) (local17 | arg0 << 28 | local21 << 14);
		@Pc(78) Class3_Sub25 local78 = (Class3_Sub25) Static39.aClass25_8.method426(local72);
		if (local78 == null) {
			Static186.method3037(arg0, arg2, arg1);
			return;
		}
		@Pc(92) Class3_Sub32 local92 = (Class3_Sub32) local78.aClass216_44.method5457();
		if (local92 == null) {
			Static186.method3037(arg0, arg2, arg1);
			return;
		}
		@Pc(106) Class9_Sub2_Sub2_Sub1 local106 = (Class9_Sub2_Sub2_Sub1) Static186.method3037(arg0, arg2, arg1);
		if (local106 == null) {
			local106 = new Class9_Sub2_Sub2_Sub1(arg2 << 9, Static637.aClass91Array4[arg0].method7724(arg1, arg2), arg1 << 9, arg0, arg0);
		} else {
			local106.anInt1818 = local106.anInt1804 = -1;
		}
		local106.anInt1823 = local92.anInt5957;
		local106.anInt1825 = local92.anInt5954;
		label56: while (true) {
			@Pc(149) Class3_Sub32 local149 = (Class3_Sub32) local78.aClass216_44.method5458();
			if (local149 == null) {
				break;
			}
			if (local106.anInt1825 != local149.anInt5954) {
				local106.anInt1818 = local149.anInt5954;
				local106.anInt1815 = local149.anInt5957;
				while (true) {
					@Pc(170) Class3_Sub32 local170 = (Class3_Sub32) local78.aClass216_44.method5458();
					if (local170 == null) {
						break label56;
					}
					if (local106.anInt1825 != local170.anInt5954 && local106.anInt1818 != local170.anInt5954) {
						local106.anInt1812 = local170.anInt5957;
						local106.anInt1804 = local170.anInt5954;
					}
				}
			}
		}
		@Pc(210) int local210 = Static594.method8211((arg2 << 9) + 256, (arg1 << 9) + 256, arg0);
		local106.anInt10152 = arg2 << 9;
		local106.aByte128 = (byte) arg0;
		local106.anInt10154 = local210;
		local106.aByte127 = (byte) arg0;
		local106.anInt1821 = 0;
		local106.anInt10158 = arg1 << 9;
		if (Static97.method1657(arg1, arg2)) {
			local106.aByte128++;
		}
		Static71.method1245(arg0, arg2, arg1, local210, local106);
	}
}
