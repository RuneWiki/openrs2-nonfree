import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
	public static int anInt7413;

	@OriginalMember(owner = "client!wj", name = "J", descriptor = "Z")
	public static boolean aBoolean493 = false;

	@OriginalMember(owner = "client!wj", name = "R", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_268 = new Class186(41, 11);

	@OriginalMember(owner = "client!wj", name = "U", descriptor = "Z")
	public static boolean aBoolean494 = false;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method5711(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class4_Sub30 local13 = new Class4_Sub30(arg0);
		@Pc(17) int local17 = local13.method4864();
		@Pc(21) int local21 = local13.method4872();
		if (local21 < 0 || Static120.anInt2486 != 0 && local21 > Static120.anInt2486) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(41) byte[] local41 = new byte[local21];
			local13.method4863(local21, local41);
			return local41;
		} else {
			@Pc(53) int local53 = local13.method4872();
			if (local53 < 0 || Static120.anInt2486 != 0 && local53 > Static120.anInt2486) {
				throw new RuntimeException();
			}
			@Pc(70) byte[] local70 = new byte[local53];
			if (local17 == 1) {
				Static168.method2482(local70, local53, arg0, local21);
			} else {
				Static198.aClass58_1.method1461(local70, local13);
			}
			return local70;
		}
	}

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "(I)V")
	public static void method5712() {
		Static386.aClass38_1 = new Class38(8);
		Static124.anInt2538 = 0;
		for (@Pc(17) Class41_Sub1 local17 = (Class41_Sub1) Static129.aClass27_3.method730(); local17 != null; local17 = (Class41_Sub1) Static129.aClass27_3.method735()) {
			local17.method3162();
		}
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(BII)I")
	public static int method5713(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static1.anIntArray2[arg1 & 0x3] : Static329.anIntArray509[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIILclient!bv;II)Lclient!og;")
	public static Class1_Sub3_Sub1 method5714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30_Sub1 arg3, @OriginalArg(4) int arg4) {
		if (arg3.aBoolean62 || Static315.method4350(arg2) && Static315.method4350(arg1)) {
			return new Class1_Sub3_Sub1(arg3, 3553, arg0, arg4, arg2, arg1, true);
		} else if (arg3.aBoolean68) {
			return new Class1_Sub3_Sub1(arg3, 34037, arg0, arg4, arg2, arg1, true);
		} else {
			return new Class1_Sub3_Sub1(arg3, arg0, arg4, arg2, arg1, Static183.method2711(arg2), Static183.method2711(arg1), true);
		}
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(III)Lclient!dr;")
	public static Class53 method5715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static40.aClass53ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static40.aClass53ArrayArrayArray2[0][arg1][arg2] != null && Static40.aClass53ArrayArrayArray2[0][arg1][arg2].aClass53_1 != null;
			if (local28 && arg0 >= Static338.anInt5952 - 1) {
				return null;
			}
			Static70.method5672(arg0, arg1, arg2);
		}
		return Static40.aClass53ArrayArrayArray2[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIII)V")
	public static void method5716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 >= Static414.anInt7043 && Static198.anInt3778 >= arg3 && Static388.anInt6740 <= arg2 && Static387.anInt6727 >= arg0) {
			Static41.method738(arg2, arg4, arg0, arg1, arg3);
		} else {
			Static433.method5560(arg4, arg1, arg0, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIBIII)V")
	public static void method5719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static414.anInt7043 <= arg5 - arg4 && Static198.anInt3778 >= arg5 + arg4 && Static388.anInt6740 <= arg2 - arg4 && arg2 + arg4 <= Static387.anInt6727) {
			Static455.method5872(arg0, arg2, arg5, arg3, arg4, arg1);
		} else {
			Static281.method3758(arg4, arg2, arg3, arg1, arg5, arg0);
		}
	}

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "(III)Z")
	public static boolean method5720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static114.method1814(arg1, arg0) | (arg0 & 0x60000) != 0 || Static105.method1658(arg0, arg1) || Static153.method2273(arg0, arg1);
	}
}
