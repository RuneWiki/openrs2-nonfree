import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!om", name = "Q", descriptor = "[I")
	public static int[] anIntArray328;

	@OriginalMember(owner = "client!om", name = "W", descriptor = "I")
	public static int anInt4041 = 2;

	@OriginalMember(owner = "client!om", name = "gb", descriptor = "I")
	public static int anInt4050 = 0;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)V")
	public static void method3279(@OriginalArg(0) int arg0) {
		Static197.aClass2_Sub3_Sub18_2 = (Class2_Sub3_Sub18) Static186.aClass79_16.method2002((long) arg0);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIZII)I")
	public static int method3280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static163.aBoolean277) {
			Static163.aBoolean277 = false;
			arg0 = 1000000;
		}
		@Pc(21) Class147 local21 = Static96.aClass147ArrayArray1[arg3][arg1];
		@Pc(24) int local24 = local21.anInt4600;
		@Pc(34) float local34 = ((float) arg2 * 0.1F + 0.7F) * local21.aFloat48;
		@Pc(37) float local37 = local21.aFloat44;
		@Pc(40) int local40 = local21.anInt4601;
		@Pc(43) float local43 = local21.aFloat47;
		@Pc(46) int local46 = local21.anInt4596;
		if (!Static102.aBoolean176) {
			local46 = 0;
		}
		@Pc(54) Class2_Sub3_Sub12 local54 = local21.aClass2_Sub3_Sub12_6;
		@Pc(57) float local57 = local21.aFloat46;
		@Pc(60) float local60 = local21.aFloat45;
		@Pc(63) float local63 = local21.aFloat43;
		if (local24 != Static218.anInt4585 || local34 != Static227.aFloat49 || local37 != Static109.aFloat25 || local43 != Static107.aFloat24 || local40 != Static272.anInt5664 || local46 != Static197.anInt4128 || local54 != Static41.aClass2_Sub3_Sub12_3 || local60 != Static294.aFloat57 || Static151.aFloat32 != local63 || local57 != Static21.aFloat4) {
			Static90.aFloat21 = Static39.aFloat5;
			Static2.aFloat56 = Static71.aFloat17;
			Static84.anInt820 = Static131.anInt2693;
			Static142.aClass2_Sub3_Sub12_4 = Static21.aClass2_Sub3_Sub12_1;
			Static266.anInt5524 = Static145.anInt3129;
			Static249.aFloat50 = Static279.aFloat54;
			Static274.anInt5700 = Static30.anInt714;
			Static218.aFloat42 = Static162.aFloat33;
			Static173.aFloat37 = Static14.aFloat2;
			Static165.aFloat34 = Static169.aFloat36;
			if (Static40.aClass2_Sub3_Sub12_2 == null || Static40.aClass2_Sub3_Sub12_2 == Static142.aClass2_Sub3_Sub12_4) {
				Static40.aClass2_Sub3_Sub12_2 = new Class2_Sub3_Sub12();
			}
			Static227.aFloat49 = local34;
			Static21.aFloat4 = local57;
			Static272.anInt5664 = local40;
			Static218.anInt4585 = local24;
			Static109.aFloat25 = local37;
			Static294.aFloat57 = local60;
			Static197.anInt4128 = local46;
			Static151.aFloat32 = local63;
			Static270.anInt5603 = 0;
			Static41.aClass2_Sub3_Sub12_3 = local54;
			Static107.aFloat24 = local43;
		}
		if (Static270.anInt5603 < 65536) {
			Static270.anInt5603 += arg0 * 250;
			if (Static270.anInt5603 < 65536) {
				@Pc(186) int local186 = 65536 - Static270.anInt5603 >> 8;
				@Pc(190) int local190 = Static270.anInt5603 >> 8;
				Static145.anInt3129 = ((Static272.anInt5664 & 0xFF00) * local190 + local186 * (Static266.anInt5524 & 0xFF00) & 0xFF0000) + ((Static272.anInt5664 & 0xFF00FF) * local190 + (Static266.anInt5524 & 0xFF00FF) * local186 & 0xFF00FF00) >> 8;
				Static131.anInt2693 = local186 * Static84.anInt820 + local190 * Static197.anInt4128 >> 8;
				@Pc(238) float local238 = (float) (65536 - Static270.anInt5603) / 65536.0F;
				Static30.anInt714 = (local190 * (Static218.anInt4585 & 0xFF00) + (Static274.anInt5700 & 0xFF00) * local186 & 0xFF0000) + ((Static274.anInt5700 & 0xFF00FF) * local186 + (local190 * (Static218.anInt4585 & 0xFF00FF)) & 0xFF00FF00) >> 8;
				@Pc(274) float local274 = (float) Static270.anInt5603 / 65536.0F;
				Static279.aFloat54 = Static249.aFloat50 * local238 + local274 * Static151.aFloat32;
				Static14.aFloat2 = local274 * Static227.aFloat49 + local238 * Static173.aFloat37;
				Static71.aFloat17 = local238 * Static2.aFloat56 + local274 * Static294.aFloat57;
				Static39.aFloat5 = local238 * Static90.aFloat21 + Static109.aFloat25 * local274;
				Static162.aFloat33 = local274 * Static21.aFloat4 + Static218.aFloat42 * local238;
				Static169.aFloat36 = local238 * Static165.aFloat34 + Static107.aFloat24 * local274;
				if (Static142.aClass2_Sub3_Sub12_4 != Static41.aClass2_Sub3_Sub12_3) {
					if (Static142.aClass2_Sub3_Sub12_4 == null || Static41.aClass2_Sub3_Sub12_3 == null) {
						Static21.aClass2_Sub3_Sub12_1 = null;
					} else {
						Static21.aClass2_Sub3_Sub12_1 = Static40.aClass2_Sub3_Sub12_2.method2346(Static142.aClass2_Sub3_Sub12_4, Static41.aClass2_Sub3_Sub12_3, (float) Static270.anInt5603 / 65536.0F);
					}
				}
			} else {
				Static270.anInt5603 = 65536;
				Static39.aFloat5 = Static109.aFloat25;
				Static14.aFloat2 = Static227.aFloat49;
				Static142.aClass2_Sub3_Sub12_4 = null;
				Static71.aFloat17 = Static294.aFloat57;
				Static279.aFloat54 = Static151.aFloat32;
				Static30.anInt714 = Static218.anInt4585;
				Static21.aClass2_Sub3_Sub12_1 = Static41.aClass2_Sub3_Sub12_3;
				Static145.anInt3129 = Static272.anInt5664;
				Static131.anInt2693 = Static197.anInt4128;
				Static169.aFloat36 = Static107.aFloat24;
				Static162.aFloat33 = Static21.aFloat4;
			}
		}
		return Static145.anInt3129;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIII)Z")
	public static boolean method3281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static217.method3664(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static113.method2086(local10 + 1, Static141.anIntArrayArrayArray4[arg0][arg1][arg2] + arg3, local14 + 1) && Static113.method2086(local10 + 128 - 1, Static141.anIntArrayArrayArray4[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static113.method2086(local10 + 128 - 1, Static141.anIntArrayArrayArray4[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static113.method2086(local10 + 1, Static141.anIntArrayArrayArray4[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BLclient!jd;)V")
	public static void method3282(@OriginalArg(1) Class84 arg0) {
		Static288.aClass84_125 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BI)V")
	public static void method3284(@OriginalArg(1) int arg0) {
		Static216.anInt4481--;
		if (Static216.anInt4481 == arg0) {
			return;
		}
		Static301.method296(Static250.aStringArray28, arg0 + 1, Static250.aStringArray28, arg0, Static216.anInt4481 - arg0);
		Static301.method296(Static214.aStringArray22, arg0 + 1, Static214.aStringArray22, arg0, Static216.anInt4481 - arg0);
		Static301.method299(Static77.anIntArray116, arg0 + 1, Static77.anIntArray116, arg0, Static216.anInt4481 - arg0);
		Static301.method300(Static289.aShortArray93, arg0 + 1, Static289.aShortArray93, arg0, Static216.anInt4481 - arg0);
		Static301.method304(Static232.aLongArray18, arg0 + 1, Static232.aLongArray18, arg0, Static216.anInt4481 - arg0);
		Static301.method299(Static163.anIntArray262, arg0 + 1, Static163.anIntArray262, arg0, Static216.anInt4481 - arg0);
		Static301.method299(Static55.anIntArray97, arg0 + 1, Static55.anIntArray97, arg0, Static216.anInt4481 - arg0);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!wm;I)V")
	public static void method3285(@OriginalArg(0) Class2_Sub26 arg0) {
		@Pc(9) int local9 = arg0.method4217();
		Static296.aClass48Array1 = new Class48[local9];
		@Pc(14) int local14;
		for (local14 = 0; local14 < local9; local14++) {
			Static296.aClass48Array1[local14] = new Class48();
			Static296.aClass48Array1[local14].anInt1269 = arg0.method4217();
			Static296.aClass48Array1[local14].aString65 = arg0.method4229();
		}
		Static12.anInt317 = arg0.method4217();
		Static106.anInt2316 = arg0.method4217();
		Static184.anInt3909 = arg0.method4217();
		Static234.aClass132_Sub1Array1 = new Class132_Sub1[Static106.anInt2316 + 1 - Static12.anInt317];
		for (local14 = 0; local14 < Static184.anInt3909; local14++) {
			@Pc(78) int local78 = arg0.method4217();
			@Pc(86) Class132_Sub1 local86 = Static234.aClass132_Sub1Array1[local78] = new Class132_Sub1();
			local86.anInt4116 = arg0.method4261();
			local86.anInt4122 = arg0.method4228();
			local86.anInt4132 = Static12.anInt317 + local78;
			local86.aString206 = arg0.method4229();
			local86.aString205 = arg0.method4229();
		}
		Static257.anInt5354 = arg0.method4228();
		Static145.aBoolean256 = true;
	}
}
