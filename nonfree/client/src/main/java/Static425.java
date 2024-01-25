import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!vf", name = "q", descriptor = "Lclient!s;")
	public static final Class217 aClass217_156 = new Class217(61, 6);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIII)V")
	public static void method5649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) int local12 = arg4 + 1;
		Static212.method3267(arg1, arg0, arg2, Class10_Sub10_Sub1.lb[arg4]);
		@Pc(21) int local21 = arg3 - 1;
		Static212.method3267(arg1, arg0, arg2, Class10_Sub10_Sub1.lb[arg3]);
		for (@Pc(25) int local25 = local12; local25 <= local21; local25++) {
			@Pc(31) int[] local31 = Class10_Sub10_Sub1.lb[local25];
			local31[arg1] = local31[arg0] = arg2;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)Z")
	public static boolean method5651(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static62.method1044(arg1, arg0) | (arg1 & 0x70000) != 0 || Static214.method3288(arg1, arg0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIIIZ)V")
	public static void method5652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (Static419.method5518(arg6)) {
			if (Static61.aClass89ArrayArray1[arg6] == null) {
				Static218.method3307(arg0, arg1, arg2, arg5, Static166.aClass89ArrayArray2[arg6], arg7, -1, arg3, arg4);
			} else {
				Static218.method3307(arg0, arg1, arg2, arg5, Static61.aClass89ArrayArray1[arg6], arg7, -1, arg3, arg4);
			}
		} else if (arg1 == -1) {
			for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
				Static432.aBooleanArray24[local20] = true;
			}
		} else {
			Static432.aBooleanArray24[arg1] = true;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method5653(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = local8[local15] + arg0[local15];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method5654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class11 local7 = Static309.aClass11ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class1 local13 = local7.aClass1_3; local13 != null; local13 = local13.aClass1_1) {
			@Pc(17) Class24_Sub3 local17 = local13.aClass24_Sub3_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort107 == arg1 && local17.aShort105 == arg2) {
				Static419.method5515(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BIZII)V")
	public static void method5655(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static419.method5518(arg3)) {
			Static387.method5174(arg2, -1, arg1, Static166.aClass89ArrayArray2[arg3], arg0);
		}
	}
}
