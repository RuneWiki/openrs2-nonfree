import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "Lclient!il;")
	public static Class86 aClass86_34;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "F")
	public static float aFloat86;

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)Z")
	public static boolean method4031(@OriginalArg(0) boolean arg0) {
		@Pc(12) boolean local12 = Static152.method2651();
		if (arg0 == local12) {
			return true;
		}
		if (!arg0) {
			Static152.method2657();
		} else if (!Static152.method2654() || !Static152.method2652() || !Static152.method2649()) {
			arg0 = false;
		}
		Static5.aBoolean18 = arg0;
		Static304.method4550(Static222.aClass176_3);
		if (local12 == arg0) {
			return false;
		} else {
			((Class52_Sub1) Static119.anInterface5_1).method1488();
			return true;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 >= Static188.anInt3598 && arg5 <= Static289.anInt5245 && Static188.anInt3598 <= arg6 && Static289.anInt5245 >= arg6 && arg4 >= Static188.anInt3598 && Static289.anInt5245 >= arg4 && Static188.anInt3598 <= arg2 && arg2 <= Static289.anInt5245 && Static231.anInt4333 <= arg7 && arg7 <= Static218.anInt4086 && Static231.anInt4333 <= arg1 && arg1 <= Static218.anInt4086 && Static231.anInt4333 <= arg8 && arg8 <= Static218.anInt4086 && Static231.anInt4333 <= arg3 && arg3 <= Static218.anInt4086) {
			Static142.method2508(arg1, arg3, arg5, arg0, arg2, arg8, arg4, arg6, arg7);
		} else {
			Static97.method1899(arg8, arg3, arg7, arg6, arg1, arg4, arg5, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZZBZ)Lclient!nm;")
	public static Class119 method4033(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(5) Class141 local5 = null;
		if (Static91.aClass38_2 != null) {
			local5 = new Class141(arg0, Static91.aClass38_2, Static42.aClass38Array1[arg0], 1000000);
		}
		Static129.aClass53_Sub1Array1[arg0] = Static209.aClass147_1.method3854(Static132.aClass141_1, arg0, local5);
		if (arg2) {
			Static129.aClass53_Sub1Array1[arg0].method3993();
		}
		return new Class119(Static129.aClass53_Sub1Array1[arg0], arg3, arg1);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
	public static int method4035(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static274.method4207(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
	public static void method4036(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static231.anInt4330 > 0) {
			Static128.method2264(Static231.anInt4330);
			Static231.anInt4330 = 0;
		}
		@Pc(23) int local23 = Static77.anInt1706 * arg1;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(31) int local31 = 1; local31 < 255; local31++) {
			@Pc(51) int local51 = (256 - local31) * Static199.anIntArray414[local31] / 256;
			if (local51 < 0) {
				local51 = 0;
			}
			local25 += local51;
			@Pc(62) int local62;
			for (local62 = local51; local62 < 128; local62++) {
				@Pc(72) int local72 = Static23.anIntArray52[local25++];
				@Pc(79) int local79 = Static77.anIntArray131[local23++ + arg0];
				if (local72 == 0) {
					Static137.aClass1_Sub5_Sub6_Sub1_1.anIntArray117[local27++] = local79;
				} else {
					@Pc(96) int local96 = local72 + 18;
					if (local96 > 255) {
						local96 = 255;
					}
					@Pc(107) int local107 = 238 - local72;
					if (local107 > 255) {
						local107 = 255;
					}
					local72 = Static58.anIntArray97[local72];
					Static137.aClass1_Sub5_Sub6_Sub1_1.anIntArray117[local27++] = ((local79 & 0xFF00) * local107 + local96 * (local72 & 0xFF00) & 0xFF0000) + ((local72 & 0xFF00FF) * local96 + (local107 * (local79 & 0xFF00FF)) & 0xFF00FF00) >> 8;
				}
			}
			for (local62 = 0; local62 < local51; local62++) {
				Static137.aClass1_Sub5_Sub6_Sub1_1.anIntArray117[local27++] = Static77.anIntArray131[local23++ + arg0];
			}
			local23 += Static77.anInt1706 - 128;
		}
		if (Static71.aBoolean165) {
			Static93.method1770(Static137.aClass1_Sub5_Sub6_Sub1_1.anIntArray117, arg0, arg1, Static137.aClass1_Sub5_Sub6_Sub1_1.anInt3617, Static137.aClass1_Sub5_Sub6_Sub1_1.anInt3625);
		} else {
			Static137.aClass1_Sub5_Sub6_Sub1_1.method3202(arg0, arg1);
		}
	}
}
