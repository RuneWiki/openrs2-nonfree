import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
	public static int anInt2125 = 0;

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "Z")
	public static boolean aBoolean160 = false;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)Lclient!di;")
	public static Class38 method1772(@OriginalArg(1) int arg0) {
		@Pc(10) Class38 local10 = (Class38) Static242.aClass169_131.method4017((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static218.aClass138_58.method3346(33, arg0);
		local10 = new Class38();
		if (local20 != null) {
			local10.method818(arg0, new Class1_Sub14(local20));
		}
		Static242.aClass169_131.method4016(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static290.anIntArrayArrayArray16[arg0][local16][local20] == -Static68.anInt1344) {
						return false;
					}
				}
			}
			local16 = (arg1 << 7) + 1;
			local20 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static208.anIntArrayArrayArray11[arg0][arg1][arg3] + arg5;
			if (!Static271.method4002(local16, local156, local20)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static271.method4002(local169, local156, local20)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static271.method4002(local16, local156, local182)) {
				return false;
			} else if (Static271.method4002(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static140.method2233(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static271.method4002(local16 + 1, Static208.anIntArrayArrayArray11[arg0][arg1][arg3] + arg5, local20 + 1) && Static271.method4002(local16 + 128 - 1, Static208.anIntArrayArrayArray11[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static271.method4002(local16 + 128 - 1, Static208.anIntArrayArrayArray11[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static271.method4002(local16 + 1, Static208.anIntArrayArrayArray11[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V")
	public static void method1774() {
		Static168.aClass169_164.method4014();
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)V")
	public static void method1775() {
		Static228.aClass169_25.method4014();
		Static249.aClass169_133.method4014();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIII)V")
	public static void method1776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static189.method3079(arg1);
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = arg1;
		@Pc(15) int local15 = -arg1;
		@Pc(19) int local19 = arg1 - arg2;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(37) int local37 = -1;
		@Pc(42) int local42 = arg4 - local19;
		@Pc(44) int local44 = local19;
		@Pc(48) int[] local48 = Static51.anIntArrayArray1[arg5];
		@Pc(53) int local53 = arg4 + local19;
		@Pc(56) int local56 = -local19;
		@Pc(58) int local58 = -1;
		Static109.method1795(arg4 - arg1, local48, local42, arg0);
		Static109.method1795(local42, local48, local53, arg3);
		Static109.method1795(local53, local48, arg4 + arg1, arg0);
		while (local12 > local10) {
			local37 += 2;
			local58 += 2;
			local15 += local37;
			local56 += local58;
			if (local56 >= 0 && local44 >= 1) {
				Static177.anIntArray183[local44] = local10;
				local44--;
				local56 -= local44 << 1;
			}
			local10++;
			@Pc(136) int[] local136;
			@Pc(142) int[] local142;
			@Pc(151) int local151;
			@Pc(147) int local147;
			@Pc(186) int local186;
			@Pc(195) int local195;
			@Pc(200) int local200;
			if (local15 >= 0) {
				local12--;
				local15 -= local12 << 1;
				if (local12 >= local19) {
					local136 = Static51.anIntArrayArray1[arg5 + local12];
					local142 = Static51.anIntArrayArray1[arg5 - local12];
					local147 = arg4 - local10;
					local151 = arg4 + local10;
					Static109.method1795(local147, local136, local151, arg0);
					Static109.method1795(local147, local142, local151, arg0);
				} else {
					local142 = Static51.anIntArrayArray1[arg5 - local12];
					local151 = Static177.anIntArray183[local12];
					local136 = Static51.anIntArrayArray1[local12 + arg5];
					local186 = arg4 - local10;
					local147 = arg4 + local10;
					local195 = arg4 + local151;
					local200 = arg4 - local151;
					Static109.method1795(local186, local136, local200, arg0);
					Static109.method1795(local200, local136, local195, arg3);
					Static109.method1795(local195, local136, local147, arg0);
					Static109.method1795(local186, local142, local200, arg0);
					Static109.method1795(local200, local142, local195, arg3);
					Static109.method1795(local195, local142, local147, arg0);
				}
			}
			local136 = Static51.anIntArrayArray1[arg5 + local10];
			local142 = Static51.anIntArrayArray1[arg5 - local10];
			local151 = local12 + arg4;
			local147 = arg4 - local12;
			if (local19 <= local10) {
				Static109.method1795(local147, local136, local151, arg0);
				Static109.method1795(local147, local142, local151, arg0);
			} else {
				local186 = local10 > local44 ? Static177.anIntArray183[local10] : local44;
				local195 = arg4 + local186;
				local200 = arg4 - local186;
				Static109.method1795(local147, local136, local200, arg0);
				Static109.method1795(local200, local136, local195, arg3);
				Static109.method1795(local195, local136, local151, arg0);
				Static109.method1795(local147, local142, local200, arg0);
				Static109.method1795(local200, local142, local195, arg3);
				Static109.method1795(local195, local142, local151, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BZIZI)V")
	public static void method1777(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static103.method1604(Static29.aClass182_Sub1Array1.length - 1, arg0, arg1, 0, arg3, arg2);
	}
}
