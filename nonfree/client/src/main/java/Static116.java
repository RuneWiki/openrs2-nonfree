import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Z")
	public static boolean aBoolean64;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
	public static int anInt1300;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	public static int anInt1291 = 0;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "[S")
	public static short[] aShortArray10 = new short[] { 4, 21, 26, 18, 39, 43, 31, 49 };

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public static int anInt1292 = 0;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "Lclient!ia;")
	public static Class51 aClass51_394 = Static64.method1101("(U4");

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "Lclient!ia;")
	public static Class51 aClass51_395 = Static64.method1101("Hidden)2use");

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "Lclient!ia;")
	public static Class51 aClass51_396 = Static64.method1101(")4a=");

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V")
	public static void method964(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static167.aClass1_Sub16_Sub1_2.method3823(32);
		Static167.aClass1_Sub16_Sub1_2.method3760(arg0);
		Static167.aClass1_Sub16_Sub1_2.method3808(arg1);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ij;IIIII)V")
	public static void method967(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static174.anInt3861) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static58.anInt1373) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static172.anInt3854 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class1_Sub7 local62 = Static22.aClass1_Sub7ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static20.anIntArrayArrayArray2[local17][local23][local32] + Static20.anIntArrayArrayArray2[local17][local23 + 1][local32] + Static20.anIntArrayArrayArray2[local17][local23][local32 + 1] + Static20.anIntArrayArrayArray2[local17][local23 + 1][local32 + 1]) / 4 - (Static20.anIntArrayArrayArray2[arg1][arg2][arg3] + Static20.anIntArrayArrayArray2[arg1][arg2 + 1][arg3] + Static20.anIntArrayArrayArray2[arg1][arg2][arg3 + 1] + Static20.anIntArrayArrayArray2[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(151) Class62 local151 = local62.aClass62_1;
									if (local151 != null) {
										if (local151.aClass5_2.method3681()) {
											arg0.method3678(local151.aClass5_2, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local151.aClass5_1 != null && local151.aClass5_1.method3681()) {
											arg0.method3678(local151.aClass5_1, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(222) int local222 = 0; local222 < local62.anInt1124; local222++) {
										@Pc(228) Class83 local228 = local62.aClass83Array3[local222];
										if (local228 != null && local228.aClass5_5.method3681() && (local23 == local228.anInt3340 || local23 == local3) && (local32 == local228.anInt3336 || local32 == local11)) {
											@Pc(257) int local257 = local228.anInt3342 + 1 - local228.anInt3340;
											@Pc(265) int local265 = local228.anInt3346 + 1 - local228.anInt3336;
											arg0.method3678(local228.aClass5_5, (local228.anInt3340 - arg2) * 128 + (local257 - arg4) * 64, local148, (local228.anInt3336 - arg3) * 128 + (local265 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)I")
	public static int method968(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
