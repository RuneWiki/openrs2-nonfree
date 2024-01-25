import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	public static void method703() {
		if (Static114.anIntArray157 != null && Static412.anIntArray564 != null) {
			return;
		}
		Static412.anIntArray564 = new int[256];
		Static114.anIntArray157 = new int[256];
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(34) double local34 = (double) local25 / 255.0D * 6.283185307179586D;
			Static114.anIntArray157[local25] = (int) (Math.sin(local34) * 4096.0D);
			Static412.anIntArray564[local25] = (int) (Math.cos(local34) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZIIIIZ)V")
	public static void method704(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg0 <= arg4) {
			return;
		}
		@Pc(26) int local26 = (arg4 + arg0) / 2;
		@Pc(28) int local28 = arg4;
		@Pc(32) Class65_Sub1 local32 = Static85.aClass65_Sub1Array3[local26];
		Static85.aClass65_Sub1Array3[local26] = Static85.aClass65_Sub1Array3[arg0];
		Static85.aClass65_Sub1Array3[arg0] = local32;
		for (@Pc(44) int local44 = arg4; local44 < arg0; local44++) {
			if (Static162.method2270(Static85.aClass65_Sub1Array3[local44], arg1, arg5, arg3, arg2, local32) <= 0) {
				@Pc(63) Class65_Sub1 local63 = Static85.aClass65_Sub1Array3[local44];
				Static85.aClass65_Sub1Array3[local44] = Static85.aClass65_Sub1Array3[local28];
				Static85.aClass65_Sub1Array3[local28++] = local63;
			}
		}
		Static85.aClass65_Sub1Array3[arg0] = Static85.aClass65_Sub1Array3[local28];
		Static85.aClass65_Sub1Array3[local28] = local32;
		method704(local28 - 1, arg1, arg2, arg3, arg4, arg5);
		method704(arg0, arg1, arg2, arg3, local28 + 1, arg5);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(CI)Z")
	public static boolean method705(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIII)I")
	public static int method706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(8) int local8 = arg5;
			arg5 = arg3;
			arg3 = local8;
		}
		@Pc(16) int local16 = arg1 & 0x3;
		if (local16 == 0) {
			return arg2;
		} else if (local16 == 1) {
			return 1 + 7 - arg5 - arg4;
		} else if (local16 == 2) {
			return 1 + 7 - arg3 - arg2;
		} else {
			return arg4;
		}
	}
}
