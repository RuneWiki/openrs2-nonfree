import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
	public static int anInt2074;

	@OriginalMember(owner = "client!fh", name = "W", descriptor = "I")
	public static int anInt2081;

	@OriginalMember(owner = "client!fh", name = "L", descriptor = "[I")
	public static final int[] anIntArray107 = new int[2048];

	@OriginalMember(owner = "client!fh", name = "V", descriptor = "[Z")
	public static final boolean[] aBooleanArray7 = new boolean[100];

	@OriginalMember(owner = "client!fh", name = "ab", descriptor = "I")
	public static int anInt2085 = 0;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIBIIIII)V")
	public static void method1699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < 1 || arg3 < 1 || Static80.anInt6558 - 2 < arg1 || arg3 > Static104.anInt2048 - 2) {
			return;
		}
		@Pc(33) int local33 = arg2;
		if (arg2 < 3 && Static195.method3034(arg1, arg3)) {
			local33 = arg2 + 1;
		}
		if (!Static327.aClass230_Sub1_1.method5644(Static146.anInt2664) && !Static17.method239(arg1, Static29.anInt483, arg3, local33)) {
			return;
		}
		if (Static131.aClass137ArrayArrayArray2 == null) {
			return;
		}
		Static72.aClass71_Sub1_1.method4804(Static447.aClass121_11, arg3, arg6, Static20.aClass181Array2[arg2], arg1, arg2);
		if (arg4 < 0) {
			return;
		}
		@Pc(77) boolean local77 = Static327.aClass230_Sub1_1.aBoolean609;
		Static327.aClass230_Sub1_1.aBoolean609 = true;
		Static72.aClass71_Sub1_1.method4812(arg0, arg7, Static20.aClass181Array2[arg2], arg4, arg1, arg3, arg5, arg2, local33, Static447.aClass121_11);
		Static327.aClass230_Sub1_1.aBoolean609 = local77;
		return;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZZ)V")
	public static void method1701(@OriginalArg(0) boolean arg0) {
		for (@Pc(15) Class1_Sub25 local15 = (Class1_Sub25) Static285.aClass142_2.method3199(); local15 != null; local15 = (Class1_Sub25) Static285.aClass142_2.method3198()) {
			if (local15.aClass1_Sub5_Sub2_3 != null) {
				Static292.aClass1_Sub5_Sub1_2.method423(local15.aClass1_Sub5_Sub2_3);
				local15.aClass1_Sub5_Sub2_3 = null;
			}
			if (local15.aClass1_Sub5_Sub2_2 != null) {
				Static292.aClass1_Sub5_Sub1_2.method423(local15.aClass1_Sub5_Sub2_2);
				local15.aClass1_Sub5_Sub2_2 = null;
			}
			local15.method5965();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(54) Class1_Sub25 local54 = (Class1_Sub25) Static427.aClass142_49.method3199(); local54 != null; local54 = (Class1_Sub25) Static427.aClass142_49.method3198()) {
			if (local54.aClass1_Sub5_Sub2_3 != null) {
				Static292.aClass1_Sub5_Sub1_2.method423(local54.aClass1_Sub5_Sub2_3);
				local54.aClass1_Sub5_Sub2_3 = null;
			}
			local54.method5965();
		}
		for (@Pc(81) Class1_Sub25 local81 = (Class1_Sub25) Static254.aClass51_14.method928(); local81 != null; local81 = (Class1_Sub25) Static254.aClass51_14.method926()) {
			if (local81.aClass1_Sub5_Sub2_3 != null) {
				Static292.aClass1_Sub5_Sub1_2.method423(local81.aClass1_Sub5_Sub2_3);
				local81.aClass1_Sub5_Sub2_3 = null;
			}
			local81.method5965();
		}
	}
}
