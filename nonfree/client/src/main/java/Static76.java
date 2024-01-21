import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!m", name = "i", descriptor = "Lclient!md;")
	public static Class14_Sub1 aClass14_Sub1_12;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "Z")
	public static boolean aBoolean69;

	@OriginalMember(owner = "client!m", name = "q", descriptor = "Lclient!dd;")
	public static Class14 aClass14_20;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "[I")
	public static int[] anIntArray231 = new int[] { 36, 43, 49, 25, 50, 58, 29, 18 };

	@OriginalMember(owner = "client!m", name = "j", descriptor = "[I")
	public static int[] anIntArray232 = new int[] { 0, 0, 0, -2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 8, 0, 4, 0, 0, 0, 0, 0, 0, 15, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 6, 0, 7, 0, 5, 3, 0, 0, 0, 0, -2, 0, 0, 0, -1, 0, 0, 0, 3, 0, 0, 0, 0, 11, 0, 6, 3, 0, 6, 2, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 4, 0, 11, 0, 0, 0, -2, 0, -1, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 4, 0, 4, 0, 0, 0, 8, 5, 2, 0, 0, 0, 0, 0, 0, 2, -2, 2, 2, 0, 0, 6, -2, 6, 0, 0, 0, 0, 0, 6, 12, 0, 0, 2, 0, -1, 0, 0, 6, 0, 0, 0, 0, 4, 3, 0, 0, 7, 0, 14, 0, 0, 0, -2, 0, 0, 0, 0, 6, 0, -2, 0, 0, 0, 2, -2, 0, 0, 10, 0, 0, 4, 0, 0, -2, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 5, 0, 6, 6, 0, 0, 0, 0, 0, 6, 0, 0, -2, 24, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, -2, 0, 0, 0 };

	@OriginalMember(owner = "client!m", name = "s", descriptor = "Lclient!ic;")
	public static Class34 aClass34_839 = Static56.method816("<)4col>");

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)Z")
	public static boolean method1106(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(18) int local18 = Static50.anIntArray166[arg0];
		if (local18 >= 2000) {
			local18 -= 2000;
		}
		return local18 == 1004;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)V")
	public static void method1111() {
		aClass34_839 = null;
		aClass14_Sub1_12 = null;
		aClass14_20 = null;
		anIntArray232 = null;
		anIntArray231 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIII[Lclient!kd;II[BLclient!q;I)V")
	public static void method1115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class42[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8, @OriginalArg(9) Class64 arg9) {
		@Pc(10) Class8_Sub20 local10 = new Class8_Sub20(arg8);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local10.method1849();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(37) int local37 = local10.method1849();
				if (local37 == 0) {
					break;
				}
				local31 += local37 - 1;
				@Pc(54) int local54 = local31 >> 6 & 0x3F;
				@Pc(58) int local58 = local31 & 0x3F;
				@Pc(62) int local62 = local31 >> 12;
				@Pc(66) int local66 = local10.method1872();
				@Pc(70) int local70 = local66 & 0x3;
				@Pc(74) int local74 = local66 >> 2;
				if (local62 == arg4 && local54 >= arg6 && arg6 + 8 > local54 && arg1 <= local58 && local58 < arg1 + 8) {
					@Pc(97) Class8_Sub1_Sub4 local97 = Static50.method752(local16);
					@Pc(114) int local114 = Static77.method1118(local97.anInt443, local54 & 0x7, local70, local58 & 0x7, arg0, local97.anInt455) + arg7;
					@Pc(131) int local131 = arg2 + Static3.method27(local58 & 0x7, arg0, local54 & 0x7, local97.anInt443, local97.anInt455, local70);
					if (local114 > 0 && local131 > 0 && local114 < 103 && local131 < 103) {
						@Pc(148) int local148 = arg3;
						if ((Static105.aByteArrayArrayArray5[1][local114][local131] & 0x2) == 2) {
							local148 = arg3 - 1;
						}
						@Pc(162) Class42 local162 = null;
						if (local148 >= 0) {
							local162 = arg5[local148];
						}
						Static18.method309(arg0 + local70 & 0x3, local16, arg3, local74, arg9, local131, local162, local114);
					}
				}
			}
		}
	}
}
