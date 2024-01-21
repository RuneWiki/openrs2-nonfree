import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "Lclient!gb;")
	public static Class34 aClass34_5;

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "Lclient!he;")
	public static Class39 aClass39_3;

	@OriginalMember(owner = "client!qf", name = "r", descriptor = "[[[Lclient!bf;")
	public static Class5_Sub3[][][] aClass5_Sub3ArrayArrayArray2;

	@OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
	public static int anInt3190;

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "[I")
	public static final int[] anIntArray346 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!qf", name = "s", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1185 = Static161.method2452("Hier wechseln");

	@OriginalMember(owner = "client!qf", name = "u", descriptor = "Lclient!ce;")
	public static final Class5_Sub6 aClass5_Sub6_3 = new Class5_Sub6(new byte[5000]);

	@OriginalMember(owner = "client!qf", name = "v", descriptor = "Z")
	public static boolean aBoolean140 = true;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLclient!ce;)Lclient!dc;")
	public static Class20 method2387(@OriginalArg(1) Class5_Sub6 arg0) {
		return Static118.method2466(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIII)V")
	public static void method2388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == arg2) {
			Static211.method3124(arg1, arg3, arg0, arg4);
		} else if (arg0 - arg1 >= Static27.anInt493 && arg0 + arg1 <= Static72.anInt1572 && arg4 - arg2 >= Static173.anInt3464 && Static174.anInt3493 >= arg2 + arg4) {
			Static92.method1512(arg3, arg4, arg2, arg1, arg0);
		} else {
			Static107.method1724(arg4, arg2, arg3, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)V")
	public static void method2389(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static72.anInt1572 = arg0;
		Static27.anInt493 = 0;
		Static173.anInt3464 = 0;
		Static174.anInt3493 = arg1;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZIII)Lclient!dc;")
	public static Class20 method2390(@OriginalArg(0) boolean arg0, @OriginalArg(3) int arg1) {
		@Pc(28) int local28 = arg1 / 10;
		@Pc(30) int local30 = 1;
		while (local28 != 0) {
			local30++;
			local28 /= 10;
		}
		@Pc(46) int local46 = local30;
		if (arg1 < 0 || arg0) {
			local46 = local30 + 1;
		}
		@Pc(54) byte[] local54 = new byte[local46];
		if (arg1 < 0) {
			local54[0] = 45;
		} else if (arg0) {
			local54[0] = 43;
		}
		for (@Pc(73) int local73 = 0; local73 < local30; local73++) {
			@Pc(79) int local79 = arg1 % 10;
			if (local79 < 0) {
				local79 = -local79;
			}
			if (local79 > 9) {
				local79 += 39;
			}
			arg1 /= 10;
			local54[local46 - local73 - 1] = (byte) (local79 + 48);
		}
		@Pc(118) Class20 local118 = new Class20();
		local118.anInt712 = local46;
		local118.aByteArray10 = local54;
		return local118;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([BB)[B")
	public static byte[] method2391(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(16) byte[] local16 = new byte[local6];
		Static220.method51(arg0, 0, local16, 0, local6);
		return local16;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)Lclient!mf;")
	public static Class69 method2392(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 & 0xFFFF;
		@Pc(16) int local16 = arg0 >> 16;
		if (Static155.aClass69ArrayArray1[local16] == null || Static155.aClass69ArrayArray1[local16][local12] == null) {
			@Pc(30) boolean local30 = Static37.method1027(local16);
			if (!local30) {
				return null;
			}
		}
		return Static155.aClass69ArrayArray1[local16][local12];
	}
}
