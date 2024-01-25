import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!hha", name = "D", descriptor = "S")
	public static short aShort58 = 256;

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "([[BB[B[I[II[[BI)I")
	public static int method3605(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg3[arg6];
		@Pc(15) int local15 = arg2[arg6] + local9;
		@Pc(19) int local19 = arg3[arg4];
		@Pc(25) int local25 = arg2[arg4] + local19;
		@Pc(27) int local27 = local9;
		if (local9 < local19) {
			local27 = local19;
		}
		@Pc(38) int local38 = local15;
		if (local15 > local25) {
			local38 = local25;
		}
		@Pc(49) int local49 = arg1[arg6] & 0xFF;
		if ((arg1[arg4] & 0xFF) < local49) {
			local49 = arg1[arg4] & 0xFF;
		}
		@Pc(70) byte[] local70 = arg5[arg6];
		@Pc(74) byte[] local74 = arg0[arg4];
		@Pc(79) int local79 = local27 - local9;
		@Pc(89) int local89 = local27 - local19;
		for (@Pc(91) int local91 = local27; local91 < local38; local91++) {
			@Pc(104) int local104 = local70[local79++] + local74[local89++];
			if (local104 < local49) {
				local49 = local104;
			}
		}
		return -local49;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(I[BIZII)V")
	public static void method3606(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(24) int local24 = arg2 - arg3 >> 2;
		arg1 += arg3;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg2 - arg3 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg0[arg1++] = 1;
				}
			}
			@Pc(33) int local33 = arg1 + 1;
			arg0[arg1] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg0[local33] = 1;
			@Pc(43) int local43 = local38 + 1;
			arg0[local38] = 1;
			arg1 = local43 + 1;
			arg0[local43] = 1;
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(IB)Z")
	public static boolean method3609(@OriginalArg(0) int arg0) {
		if (arg0 == 6 || arg0 == 15 || arg0 == 30 || arg0 == 44 || arg0 == 1012) {
			return true;
		} else {
			return arg0 == 8 || arg0 == 1009;
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(CI)Z")
	public static boolean method3611(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(36) char[] local36 = Static66.aCharArray1;
			for (@Pc(38) int local38 = 0; local38 < local36.length; local38++) {
				@Pc(44) char local44 = local36[local38];
				if (arg0 == local44) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(IILjava/lang/String;)I")
	public static int method3613(@OriginalArg(2) String arg0) {
		return Static187.method3216(16, arg0);
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(IIIIIII)V")
	public static void method3614(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(10) Class4_Sub7 local10 = (Class4_Sub7) Static543.aClass120_8.method2966(); local10 != null; local10 = (Class4_Sub7) Static543.aClass120_8.method2962()) {
			if (local10.anInt7527 <= Static101.anInt2262) {
				local10.method7841();
			} else {
				Static344.method5775(local10.anInt7524, arg0 >> 1, local10.anInt7522 * 2, arg1 >> 1, (local10.anInt7521 << 9) + 256, (local10.anInt7525 << 9) + 256);
				Static460.aClass62_9.method8363(0, Static312.anIntArray311[1] + arg3, Static312.anIntArray311[0] + arg2, local10.aString81, local10.anInt7526 | 0xFF000000);
			}
		}
	}
}
