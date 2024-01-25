import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!an", name = "p", descriptor = "I")
	public static int anInt229 = -1;

	@OriginalMember(owner = "client!an", name = "B", descriptor = "[[I")
	public static final int[][] anIntArrayArray2 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!an", name = "F", descriptor = "Z")
	public static boolean aBoolean20 = false;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(III)Lclient!je;")
	public static Class10_Sub4 method198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class83 local7 = Static347.aClass83ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass10_Sub4_2;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V")
	public static void method204() {
		Static305.aClass1_Sub21_Sub2_3.method5757(130);
		Static305.aClass1_Sub21_Sub2_3.method5718(Static151.method2632());
		Static305.aClass1_Sub21_Sub2_3.method5698(Static26.anInt476);
		Static305.aClass1_Sub21_Sub2_3.method5698(Static321.anInt6388);
		Static305.aClass1_Sub21_Sub2_3.method5718(Static231.anInt4828);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIC)I")
	public static int method205(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local7 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(Z)V")
	public static void method206() {
		Static323.aClass37_110.method914();
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method207(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(17) String local17 = Static44.method909(arg0);
		if (local17 == null) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < Static295.anInt5953; local22++) {
			@Pc(30) String local30 = Static44.method909(Static301.aStringArray36[local22]);
			if (local30 != null && local30.equals(local17)) {
				Static295.anInt5953--;
				for (@Pc(42) int local42 = local22; local42 < Static295.anInt5953; local42++) {
					Static301.aStringArray36[local42] = Static301.aStringArray36[local42 + 1];
					Static315.aStringArray39[local42] = Static315.aStringArray39[local42 + 1];
					Static311.anIntArray622[local42] = Static311.anIntArray622[local42 + 1];
					Static355.aStringArray43[local42] = Static355.aStringArray43[local42 + 1];
					Static213.anIntArray421[local42] = Static213.anIntArray421[local42 + 1];
					Static57.aBooleanArray4[local42] = Static57.aBooleanArray4[local42 + 1];
				}
				Static182.anInt3808 = Static244.anInt6207;
				Static305.aClass1_Sub21_Sub2_3.method5757(103);
				Static305.aClass1_Sub21_Sub2_3.method5718(Static165.method2895(arg0));
				Static305.aClass1_Sub21_Sub2_3.method5752(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "d", descriptor = "(I)V")
	public static void method208() {
		Static314.method5370();
		Static335.method5588();
		Static10.method170();
		Static146.method4166();
		Static226.method4888();
		Static295.method5183();
		Static117.method1845();
		Static171.method3054();
		Static213.method3953();
		Static43.method897();
		Static287.method5027();
		Static237.method4323();
		Static354.method5862();
		Static220.method4068();
		Static337.method5607();
		Static173.method3112();
		Static250.method4497();
		Static107.method1706();
		Static301.method5234();
		Static335.method5586();
		Static140.method2318();
		Static351.method3412();
		if (Static254.anInt5234 != 0) {
			for (@Pc(59) int local59 = 0; local59 < Static172.aByteArrayArray11.length; local59++) {
				Static172.aByteArrayArray11[local59] = null;
			}
			Static303.anInt6079 = 0;
		}
		Static208.method3730();
		Static344.method5765();
		Static200.method3658();
		Static259.method4657();
		Static272.method4372();
		Static122.aClass37_42.method919();
		Static217.aClass105_5.method4300();
		Static191.aClass88_7.method1650();
		Static74.method1293();
		Static315.aClass134_139.method3022();
		Static10.aClass134_7.method3022();
		Static137.aClass134_128.method3022();
		Static317.aClass134_140.method3022();
		Static330.aClass134_144.method3022();
		Static29.aClass134_12.method3022();
		Static88.aClass134_38.method3022();
		Static200.aClass134_97.method3022();
		Static125.aClass134_55.method3022();
		Static129.aClass134_60.method3022();
		Static344.aClass134_146.method3022();
		Static312.aClass134_138.method3022();
		Static189.aClass134_135.method3022();
		Static77.aClass134_33.method3022();
		Static192.aClass134_92.method3022();
		Static210.aClass134_102.method3022();
		Static94.aClass134_41.method3022();
		Static184.aClass134_87.method3022();
		Class10_Sub1_Sub4.lb.method3022();
		Static37.aClass134_18.method3022();
		Static233.aClass134_111.method3022();
		Static55.aClass134_29.method3022();
		Static132.aClass134_153.method3022();
		Static282.aClass134_79.method3022();
		Static264.aClass134_123.method3022();
		Static350.aClass134_101.method3022();
		Static218.aClass134_104.method3022();
		Static152.aClass134_71.method3022();
		Static89.aClass134_39.method3022();
		Static9.aClass37_2.method919();
		Static89.aClass37_33.method919();
		Static120.aClass37_41.method919();
		Static11.aClass37_96.method919();
	}
}
