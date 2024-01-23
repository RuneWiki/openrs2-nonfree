import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
	public static int anInt3341;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
	public static void method2741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static300.anInt5636 * 128) {
			arg0 = Static300.anInt5636 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static299.anInt5591 * 128) {
			arg2 = Static299.anInt5591 * 128 - 1;
		}
		Static52.anInt2247 = Class111.anIntArray299[arg3];
		Static183.anInt3487 = Class111.anIntArray298[arg3];
		Static251.anInt4795 = Class111.anIntArray299[arg4];
		Static113.anInt2272 = Class111.anIntArray298[arg4];
		Static277.anInt5282 = arg0;
		Static228.anInt4376 = arg1;
		Static230.anInt4401 = arg2;
		Static239.anInt4514 = arg0 / 128;
		Static172.anInt3329 = arg2 / 128;
		Static261.anInt4979 = Static239.anInt4514 - Static164.anInt3253;
		if (Static261.anInt4979 < 0) {
			Static261.anInt4979 = 0;
		}
		Static47.anInt890 = Static172.anInt3329 - Static164.anInt3253;
		if (Static47.anInt890 < 0) {
			Static47.anInt890 = 0;
		}
		Static87.anInt5782 = Static239.anInt4514 + Static164.anInt3253;
		if (Static87.anInt5782 > Static300.anInt5636) {
			Static87.anInt5782 = Static300.anInt5636;
		}
		Static70.anInt1344 = Static172.anInt3329 + Static164.anInt3253;
		if (Static70.anInt1344 > Static299.anInt5591) {
			Static70.anInt1344 = Static299.anInt5591;
		}
		@Pc(99) short local99;
		if (Static94.aBoolean138) {
			local99 = 3584;
		} else {
			local99 = 3500;
		}
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (local104 = 0; local104 < Static164.anInt3253 + Static164.anInt3253 + 2; local104++) {
			for (local113 = 0; local113 < Static164.anInt3253 + Static164.anInt3253 + 2; local113++) {
				@Pc(130) int local130 = (local104 - Static164.anInt3253 << 7) - (Static277.anInt5282 & 0x7F);
				@Pc(140) int local140 = (local113 - Static164.anInt3253 << 7) - (Static230.anInt4401 & 0x7F);
				@Pc(146) int local146 = Static239.anInt4514 + local104 - Static164.anInt3253;
				@Pc(152) int local152 = Static172.anInt3329 + local113 - Static164.anInt3253;
				if (local146 >= 0 && local152 >= 0 && local146 < Static300.anInt5636 && local152 < Static299.anInt5591) {
					@Pc(176) int local176;
					if (Static36.anIntArrayArrayArray2 == null) {
						local176 = Static259.anIntArrayArrayArray14[0][local146][local152] + 128 - Static228.anInt4376;
					} else {
						local176 = Static36.anIntArrayArrayArray2[0][local146][local152] + 128 - Static228.anInt4376;
					}
					@Pc(201) int local201 = Static259.anIntArrayArrayArray14[3][local146][local152] - Static228.anInt4376 - 1000;
					Static152.aBooleanArrayArray4[local104][local113] = Static16.method759(local130, local201, local176, local140, local99);
				} else {
					Static152.aBooleanArrayArray4[local104][local113] = false;
				}
			}
		}
		for (local104 = 0; local104 < Static164.anInt3253 + Static164.anInt3253 + 1; local104++) {
			for (local113 = 0; local113 < Static164.anInt3253 + Static164.anInt3253 + 1; local113++) {
				Static160.aBooleanArrayArray5[local104][local113] = Static152.aBooleanArrayArray4[local104][local113] || Static152.aBooleanArrayArray4[local104 + 1][local113] || Static152.aBooleanArrayArray4[local104][local113 + 1] || Static152.aBooleanArrayArray4[local104 + 1][local113 + 1];
			}
		}
		Static98.anIntArray170 = arg6;
		Static47.anIntArray63 = arg7;
		Static193.anIntArray399 = arg8;
		Static165.anIntArray309 = arg9;
		Static136.anIntArray226 = arg10;
		Static308.method4774();
		if (Static299.aClass4_Sub19ArrayArrayArray3 != null) {
			Static288.method4405(true);
			Static246.method3834(arg0, arg1, arg2, null, 0, (byte) 0, arg13, arg14);
			if (Static94.aBoolean138) {
				Static131.aBoolean175 = false;
				Static164.method2665(0, 0);
				Static178.method2785(null);
				Static196.method3125();
			}
			Static288.method4405(false);
		}
		Static246.method3834(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIBLclient!fh;)[Lclient!vn;")
	public static Class4_Sub3_Sub14_Sub1[] method2742(@OriginalArg(1) int arg0, @OriginalArg(3) Class58 arg1) {
		return Static12.method197(arg1, arg0, 0) ? Static6.method103() : null;
	}
}
