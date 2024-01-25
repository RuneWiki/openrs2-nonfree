import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Z")
	public static boolean aBoolean453 = false;

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "F")
	public static float aFloat70 = 0.25F;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIII)V")
	public static void method3934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(17) int local17 = -arg3;
		@Pc(19) int local19 = -1;
		@Pc(27) int local27 = Static241.method3467(arg3 + arg1, Static281.anInt4757, Static457.anInt7264);
		@Pc(35) int local35 = Static241.method3467(arg1 - arg3, Static281.anInt4757, Static457.anInt7264);
		Static298.method3977(local35, arg0, local27, Static194.anIntArrayArray28[arg2]);
		while (local9 > local7) {
			local19 += 2;
			local17 += local19;
			@Pc(69) int local69;
			@Pc(73) int local73;
			@Pc(91) int local91;
			@Pc(99) int local99;
			if (local17 > 0) {
				local9--;
				local17 -= local9 << 1;
				local69 = arg2 - local9;
				local73 = local9 + arg2;
				if (Static142.anInt2163 <= local73 && Static182.anInt3402 >= local69) {
					local91 = Static241.method3467(arg1 + local7, Static281.anInt4757, Static457.anInt7264);
					local99 = Static241.method3467(arg1 - local7, Static281.anInt4757, Static457.anInt7264);
					if (Static182.anInt3402 >= local73) {
						Static298.method3977(local99, arg0, local91, Static194.anIntArrayArray28[local73]);
					}
					if (local69 >= Static142.anInt2163) {
						Static298.method3977(local99, arg0, local91, Static194.anIntArrayArray28[local69]);
					}
				}
			}
			local7++;
			local69 = arg2 - local7;
			local73 = arg2 + local7;
			if (local73 >= Static142.anInt2163 && local69 <= Static182.anInt3402) {
				local91 = Static241.method3467(local9 + arg1, Static281.anInt4757, Static457.anInt7264);
				local99 = Static241.method3467(arg1 - local9, Static281.anInt4757, Static457.anInt7264);
				if (local73 <= Static182.anInt3402) {
					Static298.method3977(local99, arg0, local91, Static194.anIntArrayArray28[local73]);
				}
				if (Static142.anInt2163 <= local69) {
					Static298.method3977(local99, arg0, local91, Static194.anIntArrayArray28[local69]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!oi;IIIIIZ)V")
	public static void method3935(@OriginalArg(0) Class185 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		Static451.anInt7187 = arg3;
		Static371.aClass185_97 = arg0;
		Static64.anInt996 = arg2;
		Static270.anInt1979 = 1;
		Static107.aBoolean183 = false;
		Static318.anInt5262 = 0;
		Static353.anInt5706 = Static181.aClass1_Sub9_Sub3_2.method4663() / arg1;
		if (Static353.anInt5706 < 1) {
			Static353.anInt5706 = 1;
		}
	}
}
