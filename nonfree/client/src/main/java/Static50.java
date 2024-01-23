import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!de", name = "x", descriptor = "I")
	public static int anInt1116;

	@OriginalMember(owner = "client!de", name = "A", descriptor = "I")
	public static int anInt1117;

	@OriginalMember(owner = "client!de", name = "B", descriptor = "I")
	public static int anInt1118;

	@OriginalMember(owner = "client!de", name = "w", descriptor = "I")
	public static int anInt1115 = 0;

	@OriginalMember(owner = "client!de", name = "y", descriptor = "Lclient!wn;")
	public static Class182 aClass182_2 = new Class182();

	@OriginalMember(owner = "client!de", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString43 = "Attack";

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!eh;IIIII)V")
	public static void method802(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static54.anInt1199) {
				for (@Pc(28) int local28 = local3; local28 <= local7; local28++) {
					if (local28 >= 0 && local28 < Static24.anInt639) {
						for (@Pc(39) int local39 = local11; local39 <= local15; local39++) {
							if (local39 >= 0 && local39 < Static27.anInt665 && (!local1 || local28 >= local7 || local39 >= local15 || local39 < arg3 && local28 != arg2)) {
								@Pc(71) Class8_Sub27 local71 = Static178.aClass8_Sub27ArrayArrayArray1[local17][local28][local39];
								if (local71 != null) {
									@Pc(158) int local158 = (Static195.anIntArrayArrayArray7[local17][local28][local39] + Static195.anIntArrayArrayArray7[local17][local28 + 1][local39] + Static195.anIntArrayArrayArray7[local17][local28][local39 + 1] + Static195.anIntArrayArrayArray7[local17][local28 + 1][local39 + 1]) / 4 - (Static195.anIntArrayArrayArray7[arg1][arg2][arg3] + Static195.anIntArrayArrayArray7[arg1][arg2 + 1][arg3] + Static195.anIntArrayArrayArray7[arg1][arg2][arg3 + 1] + Static195.anIntArrayArrayArray7[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(161) Class134 local161 = local71.aClass134_1;
									if (local161 != null) {
										if (local161.aClass36_6.method4174()) {
											arg0.method4179(local161.aClass36_6, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local161.aClass36_7 != null && local161.aClass36_7.method4174()) {
											arg0.method4179(local161.aClass36_7, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(232) int local232 = 0; local232 < local71.anInt4857; local232++) {
										@Pc(241) Class170 local241 = local71.aClass170Array3[local232];
										if (local241 != null && local241.aClass36_10.method4174() && (local28 == local241.anInt5463 || local28 == local3) && (local39 == local241.anInt5460 || local39 == local11)) {
											@Pc(270) int local270 = local241.anInt5455 + 1 - local241.anInt5463;
											@Pc(278) int local278 = local241.anInt5458 + 1 - local241.anInt5460;
											arg0.method4179(local241.aClass36_10, (local241.anInt5463 - arg2) * 128 + (local270 - arg4) * 64, local158, (local241.anInt5460 - arg3) * 128 + (local278 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method804(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class8_Sub1_Sub6 local12 = Static181.method2779(2, arg1);
		local12.method931();
		local12.aString50 = arg0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
	public static void method805() {
		Static114.aClass61_18.method1379();
	}
}
