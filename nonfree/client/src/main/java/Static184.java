import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!gda", name = "l", descriptor = "F")
	public static float aFloat81;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(I[B)V")
	public static void method3568(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class2_Sub8 local10 = new Class2_Sub8(arg0);
		while (true) {
			while (true) {
				@Pc(14) int local14 = local10.method5203();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					@Pc(27) int[] local27 = Static345.anIntArray317 = new int[6];
					local27[0] = local10.method5211();
					local27[1] = local10.method5211();
					local27[2] = local10.method5211();
					local27[3] = local10.method5211();
					local27[4] = local10.method5211();
					local27[5] = local10.method5211();
				} else {
					@Pc(74) int local74;
					@Pc(79) int local79;
					if (local14 == 4) {
						local74 = local10.method5203();
						Static502.anIntArray455 = new int[local74];
						for (local79 = 0; local79 < local74; local79++) {
							Static502.anIntArray455[local79] = local10.method5211();
							if (Static502.anIntArray455[local79] == 65535) {
								Static502.anIntArray455[local79] = -1;
							}
						}
					} else if (local14 == 5) {
						local74 = local10.method5203();
						Static578.anIntArray331 = new int[local74];
						for (local79 = 0; local79 < local74; local79++) {
							Static578.anIntArray331[local79] = local10.method5211();
							if (Static578.anIntArray331[local79] == 65535) {
								Static578.anIntArray331[local79] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(BCLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method3569(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(8) int local8 = Static505.method8952(arg1, arg0);
		@Pc(13) String[] local13 = new String[local8 + 1];
		@Pc(15) int local15 = 0;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local8; local27++) {
			@Pc(30) int local30;
			for (local30 = local25; arg1.charAt(local30) != arg0; local30++) {
			}
			local13[local15++] = arg1.substring(local25, local30);
			local25 = local30 + 1;
		}
		local13[local8] = arg1.substring(local25);
		return local13;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == arg4) {
			Static552.method8464(arg0, arg3, arg5, arg1, arg2, arg6);
		} else if (arg1 - arg0 >= Static457.anInt8209 && arg1 + arg0 <= Static407.anInt7583 && arg5 - arg4 >= Static427.anInt7845 && arg5 + arg4 <= Static631.anInt10922) {
			Static336.method5615(arg2, arg3, arg5, arg6, arg1, arg0, arg4);
		} else {
			Static234.method4232(arg4, arg1, arg5, arg0, arg3, arg6, arg2);
		}
	}
}
