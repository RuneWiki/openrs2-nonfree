import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
	public static int anInt5930;

	@OriginalMember(owner = "client!tf", name = "J", descriptor = "J")
	public static long aLong185 = 0L;

	@OriginalMember(owner = "client!tf", name = "K", descriptor = "Lclient!ll;")
	public static final Class143 aClass143_27 = new Class143("LIVE", 0);

	@OriginalMember(owner = "client!tf", name = "L", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[200];

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIJI)V")
	public static void method5169(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17 = (int) arg1 >> 14 & 0x1F;
		@Pc(24) int local24 = (int) arg1 >> 20 & 0x3;
		@Pc(31) int local31 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local17 != 10 && local17 != 11 && local17 != 22) {
			Static201.method4206(0, true, 0, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0], arg2, 0, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0], arg0, local17, local24);
			return;
		}
		@Pc(47) Class34 local47 = Static11.aClass123_5.method2703(local31);
		@Pc(57) int local57;
		@Pc(60) int local60;
		if (local24 == 0 || local24 == 2) {
			local57 = local47.lb;
			local60 = local47.anInt808;
		} else {
			local57 = local47.anInt808;
			local60 = local47.lb;
		}
		@Pc(71) int local71 = local47.anInt791;
		if (local24 != 0) {
			local71 = (local71 << local24 & 0xF) + (local71 >> 4 - local24);
		}
		Static201.method4206(local60, true, local71, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0], arg2, local57, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0], arg0, 0, 0);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!uq;B[[B)V")
	public static void method5170(@OriginalArg(0) Class134_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt6287; local14++) {
			Static209.method3549();
			for (@Pc(20) int local20 = 0; local20 < Static392.anInt6751 >> 3; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static307.anInt5484 >> 3; local24++) {
					@Pc(28) boolean local28 = false;
					@Pc(36) int local36 = Static32.anIntArrayArrayArray14[local14][local20][local24];
					if (local36 != -1) {
						@Pc(46) int local46 = local36 >> 24 & 0x3;
						if (!arg0.aBoolean468 || local46 == 0) {
							@Pc(60) int local60 = local36 >> 1 & 0x3;
							@Pc(66) int local66 = local36 >> 14 & 0x3FF;
							@Pc(72) int local72 = local36 >> 3 & 0x7FF;
							@Pc(82) int local82 = (local66 / 8 << 8) + local72 / 8;
							for (@Pc(84) int local84 = 0; local84 < Static372.anIntArray785.length; local84++) {
								if (local82 == Static372.anIntArray785[local84] && arg1[local84] != null) {
									@Pc(102) Class2_Sub13 local102 = new Class2_Sub13(arg1[local84]);
									arg0.method5416(local60, local46, local14, local66, local72, local24 * 8, local102, Static190.aClass239Array1, local20 * 8);
									arg0.method5435(local72, local12[0] == -1 ? local12 : null, local60, local46, Static304.aClass82_4, local24 * 8, local20 * 8, local66, local102, local14);
									local28 = true;
									break;
								}
							}
						}
					}
					if (!local28) {
						arg0.method5412(local24 * 8, local20 * 8, local14, 8, 8);
					}
				}
			}
		}
		if (local12[0] == -1) {
			Static250.aClass248_1 = null;
		} else {
			Static250.aClass248_1 = Static189.aClass119_3.method2673(Static80.aClass171_1, local12[0], local12[1], local12[2], local12[3]);
			Static208.anInt3857 = local12[4];
		}
	}
}
