import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!eaa", name = "y", descriptor = "Lclient!cb;")
	public static Class50 aClass50_34;

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BILclient!sf;Lclient!co;)V")
	public static void method1899(@OriginalArg(1) int arg0, @OriginalArg(2) Class41_Sub1 arg1, @OriginalArg(3) Class65 arg2) {
		if (Static331.anInt6013 >= 50 || (arg2 == null || arg2.anIntArrayArray7 == null || arg2.anIntArrayArray7.length <= arg0 || arg2.anIntArrayArray7[arg0] == null)) {
			return;
		}
		@Pc(39) int local39 = arg2.anIntArrayArray7[arg0][0];
		@Pc(43) int local43 = local39 >> 8;
		@Pc(49) int local49 = local39 >> 5 & 0x7;
		@Pc(66) int local66;
		if (arg2.anIntArrayArray7[arg0].length > 1) {
			local66 = (int) ((double) arg2.anIntArrayArray7[arg0].length * Math.random());
			if (local66 > 0) {
				local43 = arg2.anIntArrayArray7[arg0][local66];
			}
		}
		@Pc(79) int local79 = local39 & 0x1F;
		local66 = 256;
		if (arg2.anIntArray76 != null && arg2.anIntArray73 != null) {
			local66 = (int) (Math.random() * (double) (arg2.anIntArray73[arg0] - arg2.anIntArray76[arg0])) + arg2.anIntArray76[arg0];
		}
		@Pc(117) int local117 = arg2.anIntArray74 == null ? 255 : arg2.anIntArray74[arg0];
		if (local79 == 0) {
			if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1 == arg1) {
				if (!arg2.aBoolean104) {
					Static85.method1307(local43, 0, local49, local66, local117);
					return;
				}
				Static99.method1646(local66, 0, local43, false, local49, local117);
			}
		} else if (Static655.aClass5_Sub36_29.aClass2_Sub6_1.method3364() != 0) {
			@Pc(158) int local158 = arg1.anInt10366 - 256 >> 9;
			@Pc(165) int local165 = arg1.anInt10367 - 256 >> 9;
			@Pc(185) int local185 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1 == arg1 ? 0 : (local158 << 16) + (arg1.aByte149 << 24) + (local165 << 8) + local79;
			Static515.aClass178Array2[Static331.anInt6013++] = new Class178((byte) (arg2.aBoolean104 ? 2 : 1), local43, local49, 0, local117, local185, local66, arg1);
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Ljava/lang/String;ZIII)V")
	public static void method1903(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static311.method4774(arg0, arg2, arg1, arg3, (String) null, false);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V")
	public static void method1904() {
		for (@Pc(11) Class5_Sub27 local11 = (Class5_Sub27) Static298.aClass335_23.method7768(); local11 != null; local11 = (Class5_Sub27) Static298.aClass335_23.method7777()) {
			if (local11.aBoolean265) {
				local11.aBoolean265 = false;
			} else {
				Static314.method4802(local11.anInt3825);
			}
		}
	}
}
