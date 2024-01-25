import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!sk", name = "eb", descriptor = "I")
	public static int anInt8849;

	@OriginalMember(owner = "client!sk", name = "nb", descriptor = "Lclient!aea;")
	public static Class3_Sub3_Sub1 aClass3_Sub3_Sub1_4;

	@OriginalMember(owner = "client!sk", name = "z", descriptor = "Lclient!al;")
	public static final Class15 aClass15_11 = new Class15();

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IB)Z")
	public static boolean method7585(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!uq;Lclient!pia;Z)V")
	public static void method7586(@OriginalArg(0) int arg0, @OriginalArg(1) Class9_Sub2 arg1, @OriginalArg(2) Class267 arg2) {
		if (Static154.anInt3152 >= 50 || (arg2 == null || arg2.anIntArrayArray40 == null || arg0 >= arg2.anIntArrayArray40.length || arg2.anIntArrayArray40[arg0] == null)) {
			return;
		}
		@Pc(44) int local44 = arg2.anIntArrayArray40[arg0][0];
		@Pc(48) int local48 = local44 >> 8;
		@Pc(54) int local54 = local44 >> 5 & 0x7;
		@Pc(73) int local73;
		if (arg2.anIntArrayArray40[arg0].length > 1) {
			local73 = (int) ((double) arg2.anIntArrayArray40[arg0].length * Math.random());
			if (local73 > 0) {
				local48 = arg2.anIntArrayArray40[arg0][local73];
			}
		}
		@Pc(86) int local86 = local44 & 0x1F;
		local73 = 256;
		if (arg2.anIntArray457 != null && arg2.anIntArray459 != null) {
			local73 = arg2.anIntArray457[arg0] + (int) ((double) (arg2.anIntArray459[arg0] - arg2.anIntArray457[arg0]) * Math.random());
		}
		@Pc(124) int local124 = arg2.anIntArray453 == null ? 255 : arg2.anIntArray453[arg0];
		if (local86 == 0) {
			if (arg1 == Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1) {
				if (!arg2.aBoolean544) {
					Static93.method1568(local48, local73, local124, local54, 0);
					return;
				}
				Static84.method7777(local124, local48, local73, false, 0, local54);
			}
		} else if (Static32.aClass3_Sub41_3.aClass7_Sub15_5.method5663() != 0) {
			@Pc(168) int local168 = arg1.anInt10152 - 256 >> 9;
			@Pc(175) int local175 = arg1.anInt10158 - 256 >> 9;
			@Pc(197) int local197 = arg1 == Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1 ? 0 : local86 + (arg1.aByte127 << 24) - (-(local168 << 16) - (local175 << 8));
			Static110.aClass130Array1[Static154.anInt3152++] = new Class130((byte) (arg2.aBoolean544 ? 2 : 1), local48, local54, 0, local124, local197, local73, arg1);
		}
	}
}
