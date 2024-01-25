import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ie", name = "M", descriptor = "[Lclient!ae;")
	public static Class4[] aClass4Array5;

	@OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
	public static int anInt2868 = -1;

	@OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
	public static int anInt2873 = 0;

	@OriginalMember(owner = "client!ie", name = "Q", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_94 = new Class217(72, 20);

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lclient!na;")
	public static Class142 method2713(@OriginalArg(0) Component arg0) {
		return new Class142_Sub1(arg0, true);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(IIZ)V")
	public static void method2714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static64.aClass80_17.method2543(Static110.aClass106_84.method2927(Static254.anInt5172));
		@Pc(24) int local24;
		for (@Pc(18) Class1_Sub22 local18 = (Class1_Sub22) Static317.aClass42_43.method1543(); local18 != null; local18 = (Class1_Sub22) Static317.aClass42_43.method1551()) {
			local24 = Static198.method3717(local18);
			if (local24 > local13) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static224.anInt4512 * 16 + 21;
		@Pc(49) int local49 = arg1 - local13 / 2;
		if (Static213.anInt4274 < local13 + local49) {
			local49 = Static213.anInt4274 - local13;
		}
		if (local49 < 0) {
			local49 = 0;
		}
		@Pc(65) int local65 = arg0;
		if (Static130.anInt2825 < arg0 + local24) {
			local65 = Static130.anInt2825 - local24;
		}
		Static35.anInt920 = local49;
		if (local65 < 0) {
			local65 = 0;
		}
		Static217.aBoolean322 = true;
		Static208.anInt4100 = Static224.anInt4512 * 16 + (Static171.aBoolean246 ? 26 : 22);
		Static361.anInt6937 = local65;
		Static182.anInt3706 = local13;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg4 - arg6;
		@Pc(21) int local21 = arg1 - arg6;
		@Pc(25) int local25 = arg4 * arg4;
		@Pc(29) int local29 = arg1 * arg1;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg1 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(71) int local71 = (1 - local57) * local25 + local41;
		@Pc(80) int local80 = local29 - (local57 - 1) * local45;
		@Pc(90) int local90 = local33 * (1 - local61) + local49;
		@Pc(99) int local99 = local37 - local53 * (local61 - 1);
		@Pc(103) int local103 = local25 << 2;
		@Pc(107) int local107 = local29 << 2;
		@Pc(111) int local111 = local33 << 2;
		@Pc(115) int local115 = local37 << 2;
		@Pc(119) int local119 = local41 * 3;
		@Pc(125) int local125 = local45 * (local57 - 3);
		@Pc(129) int local129 = local49 * 3;
		@Pc(135) int local135 = (local61 - 3) * local53;
		@Pc(137) int local137 = local107;
		@Pc(143) int local143 = (arg1 - 1) * local103;
		@Pc(145) int local145 = local115;
		@Pc(151) int local151 = (local21 - 1) * local111;
		@Pc(155) int[] local155 = Static43.anIntArrayArray57[arg0];
		Static367.method6081(arg2, arg3 - arg4, local155, arg3 - local16);
		Static367.method6081(arg5, arg3 - local16, local155, local16 + arg3);
		Static367.method6081(arg2, local16 + arg3, local155, arg4 + arg3);
		while (local9 > 0) {
			@Pc(205) boolean local205 = local9 <= local21;
			if (local205) {
				if (local90 < 0) {
					while (local90 < 0) {
						local99 += local145;
						local90 += local129;
						local11++;
						local129 += local115;
						local145 += local115;
					}
				}
				if (local99 < 0) {
					local90 += local129;
					local99 += local145;
					local145 += local115;
					local129 += local115;
					local11++;
				}
				local99 += -local135;
				local90 += -local151;
				local135 -= local111;
				local151 -= local111;
			}
			if (local71 < 0) {
				while (local71 < 0) {
					local71 += local119;
					local80 += local137;
					local7++;
					local137 += local107;
					local119 += local107;
				}
			}
			if (local80 < 0) {
				local80 += local137;
				local71 += local119;
				local119 += local107;
				local7++;
				local137 += local107;
			}
			local71 += -local143;
			local80 += -local125;
			local143 -= local103;
			local125 -= local103;
			local9--;
			@Pc(345) int local345 = arg0 - local9;
			@Pc(349) int local349 = local9 + arg0;
			@Pc(353) int local353 = arg3 + local7;
			@Pc(357) int local357 = arg3 - local7;
			if (local205) {
				@Pc(382) int local382 = arg3 + local11;
				@Pc(387) int local387 = arg3 - local11;
				Static367.method6081(arg2, local357, Static43.anIntArrayArray57[local345], local387);
				Static367.method6081(arg5, local387, Static43.anIntArrayArray57[local345], local382);
				Static367.method6081(arg2, local382, Static43.anIntArrayArray57[local345], local353);
				Static367.method6081(arg2, local357, Static43.anIntArrayArray57[local349], local387);
				Static367.method6081(arg5, local387, Static43.anIntArrayArray57[local349], local382);
				Static367.method6081(arg2, local382, Static43.anIntArrayArray57[local349], local353);
			} else {
				Static367.method6081(arg2, local357, Static43.anIntArrayArray57[local345], local353);
				Static367.method6081(arg2, local357, Static43.anIntArrayArray57[local349], local353);
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(III)Lclient!lk;")
	public static Class1_Sub4_Sub17 method2717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Class1_Sub4_Sub17 local20 = (Class1_Sub4_Sub17) Static5.aClass38_1.method1475((long) arg1 << 32 | (long) arg0);
		if (local20 == null) {
			local20 = new Class1_Sub4_Sub17(arg1, arg0);
			Static5.aClass38_1.method1472(local20, local20.aLong217);
		}
		return local20;
	}
}
