import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "n", descriptor = "Z")
	public static boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "I")
	public static int anInt14 = 0;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "I")
	public static int anInt20 = 0;

	@OriginalMember(owner = "client!a", name = "L", descriptor = "Lclient!tg;")
	public static Class81 aClass81_7 = Static120.method2057("<)4col> x");

	@OriginalMember(owner = "client!a", name = "O", descriptor = "Lclient!tg;")
	public static Class81 aClass81_8 = Static120.method2057("p11_full");

	@OriginalMember(owner = "client!a", name = "S", descriptor = "Lclient!tg;")
	private static Class81 aClass81_11 = Static120.method2057("Loaded textures");

	@OriginalMember(owner = "client!a", name = "P", descriptor = "Lclient!tg;")
	public static Class81 aClass81_9 = aClass81_11;

	@OriginalMember(owner = "client!a", name = "R", descriptor = "Lclient!tg;")
	public static Class81 aClass81_10 = Static120.method2057("hitmarks");

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public static void method13() {
		aClass81_8 = null;
		aClass81_11 = null;
		aClass81_7 = null;
		aClass81_10 = null;
		aClass81_9 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IILclient!rh;IIII)V")
	public static void method14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int local13 = Math.min(arg2.anInt3217 / 2, arg2.anInt3245 / 2);
		@Pc(21) int local21 = arg5 * arg5 + arg3 * arg3;
		if (local13 * local13 >= local21 || local21 >= 90000) {
			Static168.method2985(arg2, Static36.aClass1_Sub2_Sub2_Sub3Array3[arg1], arg5, arg4, arg3, arg0);
			return;
		}
		@Pc(37) int local37 = Static35.anInt964 + Static2.anInt37 & 0x7FF;
		@Pc(41) int local41 = Class1_Sub2_Sub2_Sub1.anIntArray30[local37];
		@Pc(45) int local45 = Class1_Sub2_Sub2_Sub1.anIntArray33[local37];
		@Pc(53) int local53 = local45 * 256 / (Static160.anInt3643 + 256);
		local13 -= 10;
		@Pc(62) int local62 = local41 * 256 / (Static160.anInt3643 + 256);
		@Pc(72) int local72 = arg3 * local53 + arg5 * local62 >> 16;
		@Pc(83) int local83 = arg5 * local53 - local62 * arg3 >> 16;
		@Pc(89) double local89 = Math.atan2((double) local72, (double) local83);
		@Pc(96) int local96 = (int) (Math.sin(local89) * (double) local13);
		@Pc(103) int local103 = (int) ((double) local13 * Math.cos(local89));
		Static181.aClass1_Sub2_Sub2_Sub3Array12[arg1].method2128(arg2.anInt3217 / 2 + arg0 + local96 - 10, -local103 + arg4 - (-(arg2.anInt3245 / 2) + 10), local89);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)Z")
	public static boolean method15(@OriginalArg(1) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(BI)V")
	public static void method16(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class1_Sub9 local10 = (Class1_Sub9) Static180.aClass5_12.method140(); local10 != null; local10 = (Class1_Sub9) Static180.aClass5_12.method132()) {
			if ((local10.aLong148 >> 48 & 0xFFFFL) == (long) arg0) {
				local10.method3134();
			}
		}
	}
}
