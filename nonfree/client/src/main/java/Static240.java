import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!sf", name = "H", descriptor = "[[[Lclient!qg;")
	public static Class131[][][] aClass131ArrayArrayArray1;

	@OriginalMember(owner = "client!sf", name = "G", descriptor = "[I")
	public static int[] anIntArray544 = new int[25];

	@OriginalMember(owner = "client!sf", name = "L", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray29 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZIIII)V")
	public static void method4144(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static104.method831(arg0, 4);
		local8.method1192();
		local8.anInt1565 = arg1;
		local8.anInt1557 = arg3;
		local8.anInt1558 = arg2;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(ZIIII)V")
	public static void method4145(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static91.method1593(arg3)) {
			Static230.method4024(-1, arg2, Static81.aClass116ArrayArray1[arg3], arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLclient!lf;IIIII)Lclient!lf;")
	public static Class25_Sub2 method4147(@OriginalArg(1) Class25_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) long local8 = (long) arg2;
		@Pc(14) Class25_Sub2 local14 = (Class25_Sub2) Static106.aClass155_18.method4358(local8);
		if (local14 == null) {
			@Pc(21) Class25_Sub3 local21 = Static149.method2801(Static285.aClass83_199, arg2);
			if (local21 == null) {
				return null;
			}
			local14 = local21.method2821(64, 768, -50, -10, -50);
			Static106.aClass155_18.method4360(local8, local14);
		}
		@Pc(42) int local42 = arg0.method3475();
		@Pc(45) int local45 = arg0.method3466();
		@Pc(48) int local48 = arg0.method3489();
		@Pc(51) int local51 = arg0.method3470();
		local14 = local14.method3463(true, true, true);
		if (arg3 != 0) {
			local14.method3480(arg3);
		}
		@Pc(103) int local103;
		if (Static296.aBoolean335) {
			@Pc(144) Class25_Sub2_Sub1 local144 = (Class25_Sub2_Sub1) local14;
			if (Static220.method3905(local42 + arg1, local48 + arg4, Static145.anInt3477) != arg5 || Static220.method3905(local45 + arg1, local51 + arg4, Static145.anInt3477) != arg5) {
				for (local103 = 0; local103 < local144.anInt794; local103++) {
					local144.anIntArray82[local103] += Static220.method3905(local144.anIntArray81[local103] + arg1, local144.anIntArray84[local103] + arg4, Static145.anInt3477) - arg5;
				}
				local144.aClass77_1.aBoolean145 = false;
				local144.aClass167_1.aBoolean320 = false;
			}
		} else {
			@Pc(71) Class25_Sub2_Sub2 local71 = (Class25_Sub2_Sub2) local14;
			if (arg5 != Static220.method3905(arg1 + local42, arg4 - -local48, Static145.anInt3477) || arg5 != Static220.method3905(arg1 + local45, arg4 - -local51, Static145.anInt3477)) {
				for (local103 = 0; local103 < local71.anInt4409; local103++) {
					local71.anIntArray421[local103] += Static220.method3905(arg1 + local71.anIntArray409[local103], arg4 + local71.anIntArray414[local103], Static145.anInt3477) - arg5;
				}
				local71.aBoolean233 = false;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)V")
	public static void method4148(@OriginalArg(0) boolean arg0) {
		Static62.anIntArray168 = null;
		if (arg0 && Static176.aClass1_Sub2_Sub9_2 != null) {
			Static219.anInt4901 = Static176.aClass1_Sub2_Sub9_2.anInt2163;
		} else {
			Static219.anInt4901 = -1;
		}
		Static76.anIntArrayArrayArray17 = null;
		Static179.anIntArrayArrayArray15 = null;
		Static236.aClass116_15 = null;
		Static164.aByteArrayArrayArray31 = null;
		Static205.aByteArrayArrayArray41 = null;
		Static191.aByteArrayArrayArray38 = null;
		Static191.anInt4244 = 0;
		Static136.aByteArrayArrayArray26 = null;
		Static176.aClass1_Sub2_Sub9_2 = null;
		Static139.aByteArrayArrayArray54 = null;
		Static92.anIntArrayArrayArray7 = null;
		Static265.aClass131_25.method3795();
		Static280.aClass100_8 = null;
		Static190.aClass100_4 = null;
		Static131.aClass1_Sub2_Sub14_Sub1_2 = null;
		Static210.aClass100_5 = null;
		Static99.aClass100_2 = null;
		Static258.aClass100_7 = null;
		Static236.aClass100_6 = null;
		Static206.anInt4587 = -1;
		Static166.aClass100_3 = null;
		Static5.anInt145 = -1;
		Static159.aClass78_2 = null;
		Static146.aClass1_Sub2_Sub14_2 = null;
		Static80.aClass100_1 = null;
	}
}
