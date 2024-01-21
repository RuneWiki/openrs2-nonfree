import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!qf", name = "u", descriptor = "[I")
	public static int[] anIntArray283;

	@OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
	public static int anInt3195;

	@OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
	public static int anInt3199;

	@OriginalMember(owner = "client!qf", name = "H", descriptor = "[I")
	public static int[] anIntArray285;

	@OriginalMember(owner = "client!qf", name = "B", descriptor = "[I")
	public static final int[] anIntArray284 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!qf", name = "D", descriptor = "Z")
	public static boolean aBoolean182 = false;

	@OriginalMember(owner = "client!qf", name = "G", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1533 = Static187.method3089("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIII)V")
	public static void method2358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static74.method1123(arg4 - arg2, arg0, Static142.anIntArrayArray25[arg1], arg2 + arg4);
		@Pc(20) int local20 = 0;
		@Pc(24) int local24 = arg2 * arg2;
		@Pc(28) int local28 = arg3 * arg3;
		@Pc(30) int local30 = arg3;
		@Pc(34) int local34 = local28 << 1;
		@Pc(46) int local46 = arg3 << 1;
		@Pc(50) int local50 = local24 << 1;
		@Pc(60) int local60 = local24 * (1 - local46) + local34;
		@Pc(68) int local68 = local28 - (local46 - 1) * local50;
		@Pc(76) int local76 = ((arg3 << 1) - 3) * local50;
		@Pc(80) int local80 = local24 << 2;
		@Pc(86) int local86 = (arg3 - 1) * local80;
		@Pc(90) int local90 = local28 << 2;
		@Pc(98) int local98 = local34 * 3;
		@Pc(104) int local104 = local90;
		while (local30 > 0) {
			local30--;
			@Pc(111) int local111 = arg1 - local30;
			if (local60 < 0) {
				while (local60 < 0) {
					local60 += local98;
					local98 += local90;
					local20++;
					local68 += local104;
					local104 += local90;
				}
			}
			@Pc(144) int local144 = local30 + arg1;
			if (local68 < 0) {
				local68 += local104;
				local104 += local90;
				local60 += local98;
				local20++;
				local98 += local90;
			}
			@Pc(167) int local167 = arg4 + local20;
			local60 += -local86;
			@Pc(177) int local177 = arg4 - local20;
			local68 += -local76;
			Static74.method1123(local177, arg0, Static142.anIntArrayArray25[local111], local167);
			Static74.method1123(local177, arg0, Static142.anIntArrayArray25[local144], local167);
			local86 -= local80;
			local76 -= local80;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)V")
	public static void method2359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 128 || arg0 < 128 || arg2 > 13056 || arg0 > 13056) {
			Static9.anInt3178 = -1;
			Static23.anInt563 = -1;
			return;
		}
		@Pc(40) int local40 = Static64.method1027(arg0, arg2, Static192.anInt4180) - arg1;
		@Pc(44) int local44 = arg2 - Static186.anInt4074;
		@Pc(48) int local48 = arg0 - Static100.anInt2140;
		@Pc(52) int local52 = Class1_Sub3_Sub1_Sub4.anIntArray320[Static10.anInt243];
		@Pc(56) int local56 = local40 - Static107.anInt2320;
		@Pc(60) int local60 = Class1_Sub3_Sub1_Sub4.anIntArray317[Static10.anInt243];
		@Pc(64) int local64 = Class1_Sub3_Sub1_Sub4.anIntArray320[Static47.anInt1197];
		@Pc(68) int local68 = Class1_Sub3_Sub1_Sub4.anIntArray317[Static47.anInt1197];
		@Pc(78) int local78 = local48 * local64 + local68 * local44 >> 16;
		@Pc(88) int local88 = local68 * local48 - local44 * local64 >> 16;
		@Pc(90) int local90 = local78;
		@Pc(101) int local101 = local60 * local56 - local52 * local88 >> 16;
		@Pc(111) int local111 = local56 * local52 + local60 * local88 >> 16;
		if (local111 >= 50) {
			Static23.anInt563 = (local90 << 9) / local111 + 256;
			Static9.anInt3178 = (local101 << 9) / local111 + 167;
		} else {
			Static9.anInt3178 = -1;
			Static23.anInt563 = -1;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)I")
	public static int method2360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)Lclient!fj;")
	public static Class1_Sub3_Sub5 method2362(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub3_Sub5 local12 = (Class1_Sub3_Sub5) Static100.aClass47_14.method1281((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(28) byte[] local28 = Static196.aClass3_36.method3265(Static191.method3130(arg0), Static192.method3134(arg0));
		local12 = new Class1_Sub3_Sub5();
		local12.anInt1389 = arg0;
		if (local28 != null) {
			local12.method962(new Class1_Sub14(local28));
		}
		local12.method960();
		if (local12.aBoolean96) {
			local12.aBoolean87 = false;
			local12.anInt1420 = 0;
		}
		Static100.aClass47_14.method1273((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIII)V")
	public static void method2363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub17 local7 = Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2].anInt2376 = arg3;
		}
	}
}
