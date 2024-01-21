import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!cd", name = "Q", descriptor = "Lclient!de;")
	public static Class19 aClass19_1;

	@OriginalMember(owner = "client!cd", name = "R", descriptor = "I")
	public static int anInt537;

	@OriginalMember(owner = "client!cd", name = "X", descriptor = "[Lclient!sa;")
	public static Class3_Sub1_Sub4_Sub4[] aClass3_Sub1_Sub4_Sub4Array5;

	@OriginalMember(owner = "client!cd", name = "L", descriptor = "B")
	public static byte aByte1 = 0;

	@OriginalMember(owner = "client!cd", name = "N", descriptor = "Z")
	public static boolean aBoolean30 = false;

	@OriginalMember(owner = "client!cd", name = "S", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_173 = Static120.method1824("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!cd", name = "V", descriptor = "I")
	public static int anInt540 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ob;IIIII)V")
	public static void method360(@OriginalArg(0) Class3_Sub1_Sub5_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static97.anInt2061) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static64.anInt1390) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static49.anInt1086 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class3_Sub15 local62 = Static185.aClass3_Sub15ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static111.anIntArrayArrayArray7[local17][local23][local32] + Static111.anIntArrayArrayArray7[local17][local23 + 1][local32] + Static111.anIntArrayArrayArray7[local17][local23][local32 + 1] + Static111.anIntArrayArrayArray7[local17][local23 + 1][local32 + 1]) / 4 - (Static111.anIntArrayArrayArray7[arg1][arg2][arg3] + Static111.anIntArrayArrayArray7[arg1][arg2 + 1][arg3] + Static111.anIntArrayArrayArray7[arg1][arg2][arg3 + 1] + Static111.anIntArrayArrayArray7[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(151) Class51 local151 = local62.aClass51_1;
									if (local151 != null) {
										@Pc(161) Class3_Sub1_Sub5_Sub5 local161;
										if (local151.aClass3_Sub1_Sub5_5 instanceof Class3_Sub1_Sub5_Sub5) {
											local161 = (Class3_Sub1_Sub5_Sub5) local151.aClass3_Sub1_Sub5_5;
											Static127.method1888(arg0, local161, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local151.aClass3_Sub1_Sub5_4 instanceof Class3_Sub1_Sub5_Sub5) {
											local161 = (Class3_Sub1_Sub5_Sub5) local151.aClass3_Sub1_Sub5_4;
											Static127.method1888(arg0, local161, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(225) int local225 = 0; local225 < local62.anInt2014; local225++) {
										@Pc(231) Class4 local231 = local62.aClass4Array3[local225];
										if (local231 != null && local231.aClass3_Sub1_Sub5_1 instanceof Class3_Sub1_Sub5_Sub5) {
											@Pc(241) Class3_Sub1_Sub5_Sub5 local241 = (Class3_Sub1_Sub5_Sub5) local231.aClass3_Sub1_Sub5_1;
											@Pc(249) int local249 = local231.anInt178 + 1 - local231.anInt185;
											@Pc(257) int local257 = local231.anInt172 + 1 - local231.anInt188;
											Static127.method1888(arg0, local241, (local231.anInt185 - arg2) * 128 + (local249 - arg4) * 64, local148, (local231.anInt188 - arg3) * 128 + (local257 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)V")
	public static void method362(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub7 local10 = (Class3_Sub7) Static6.aClass54_2.method1496((long) arg0);
		if (local10 != null) {
			local10.method3159();
		}
	}
}
