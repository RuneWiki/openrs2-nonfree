import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!nt", name = "l", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!nt", name = "o", descriptor = "Z")
	public static boolean aBoolean503 = false;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!uv;ILclient!aa;ILclient!ha;IIII)V")
	public static void method6061(@OriginalArg(0) Class344 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(4) Class82 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(17) Class179 local17 = Static167.aClass154_3.method3947(arg7);
		if (local17 == null || !local17.aBoolean391 || !local17.method4532(Static183.aClass285_1)) {
			return;
		}
		@Pc(37) int local37;
		if (local17.anIntArray294 != null) {
			@Pc(35) int[] local35 = new int[local17.anIntArray294.length];
			@Pc(49) int local49;
			@Pc(60) int local60;
			@Pc(64) int local64;
			for (local37 = 0; local37 < local35.length / 2; local37++) {
				if (Static471.anInt8064 == 4) {
					local49 = (int) Static170.aFloat71 & 0x3FFF;
				} else {
					local49 = Static579.anInt9458 + (int) Static170.aFloat71 & 0x3FFF;
				}
				local60 = Class3_Sub13.anIntArray147[local49];
				local64 = Class3_Sub13.anIntArray146[local49];
				if (Static471.anInt8064 != 4) {
					local64 = local64 * 256 / (Static296.anInt5883 + 256);
					local60 = local60 * 256 / (Static296.anInt5883 + 256);
				}
				local35[local37 * 2] = (local64 * (local17.anIntArray294[local37 * 2] * 4 + arg1) + (local17.anIntArray294[local37 * 2 + 1] * 4 + arg5) * local60 >> 14) + arg6 + arg0.anInt9546 / 2;
				local35[local37 * 2 + 1] = arg4 + arg0.anInt9602 / 2 - (-(local60 * (arg1 + local17.anIntArray294[local37 * 2] * 4)) + local64 * (local17.anIntArray294[local37 * 2 + 1] * 4 + arg5) >> 14);
			}
			Static482.method7118(arg3, local35, local17.anInt5310, arg0.anIntArray602, arg0.anIntArray600);
			if (local17.anInt5331 > 0) {
				@Pc(223) int local223;
				@Pc(233) int local233;
				@Pc(256) int local256;
				@Pc(268) int local268;
				for (local49 = 0; local49 < local35.length / 2 - 1; local49++) {
					local60 = local35[local49 * 2];
					local64 = local35[local49 * 2 + 1];
					local223 = local35[local49 * 2 + 2];
					local233 = local35[(local49 + 1) * 2 + 1];
					if (local223 < local60) {
						local256 = local60;
						local60 = local223;
						local268 = local64;
						local223 = local256;
						local64 = local233;
						local233 = local268;
					} else if (local60 == local223 && local233 < local64) {
						local256 = local64;
						local64 = local233;
						local233 = local256;
					}
					arg3.method6114(local60, local64, local223, local233, local17.anIntArray295[local17.aByteArray43[local49] & 0xFF], arg2, arg6, arg4, local17.anInt5331, local17.anInt5336, local17.anInt5314);
				}
				local60 = local35[local35.length - 2];
				local64 = local35[local35.length - 1];
				local223 = local35[0];
				local233 = local35[1];
				if (local60 > local223) {
					local256 = local60;
					local60 = local223;
					local268 = local64;
					local223 = local256;
					local64 = local233;
					local233 = local268;
				} else if (local223 == local60 && local233 < local64) {
					local256 = local64;
					local64 = local233;
					local233 = local256;
				}
				arg3.method6114(local60, local64, local223, local233, local17.anIntArray295[local17.aByteArray43[local17.aByteArray43.length - 1] & 0xFF], arg2, arg6, arg4, local17.anInt5331, local17.anInt5336, local17.anInt5314);
			} else {
				for (local49 = 0; local49 < local35.length / 2 - 1; local49++) {
					arg3.method6146(local35[local49 * 2], local35[local49 * 2 + 1], local35[(local49 + 1) * 2], local35[local49 * 2 + 2 + 1], local17.anIntArray295[local17.aByteArray43[local49] & 0xFF], arg2, arg6, arg4);
				}
				arg3.method6146(local35[local35.length - 2], local35[local35.length - 1], local35[0], local35[1], local17.anIntArray295[local17.aByteArray43[local17.aByteArray43.length - 1] & 0xFF], arg2, arg6, arg4);
			}
		}
		@Pc(497) Class103 local497 = null;
		if (local17.anInt5340 != -1) {
			local497 = local17.method4533(arg3, false);
			if (local497 != null) {
				Static453.method6694(arg0, arg6, arg2, arg5, arg1, arg4, local497);
			}
		}
		if (local17.aString42 == null) {
			return;
		}
		local37 = 0;
		if (local497 != null) {
			local37 = local497.method7440();
		}
		@Pc(533) Class63 local533 = Static227.aClass63_5;
		@Pc(535) Class93 local535 = Static323.aClass93_7;
		if (local17.anInt5332 == 1) {
			local535 = Static240.aClass93_4;
			local533 = Static232.aClass63_6;
		}
		if (local17.anInt5332 == 2) {
			local533 = Static374.aClass63_9;
			local535 = Static426.aClass93_11;
		}
		Static478.method7059(local17.anInt5335, arg5, arg0, local37, local535, arg2, arg1, local17.aString42, local533, arg6, arg4);
		return;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(CB)Z")
	public static boolean method6062(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
