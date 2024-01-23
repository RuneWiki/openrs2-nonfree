import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!s", name = "C", descriptor = "Z")
	public static boolean aBoolean415 = false;

	@OriginalMember(owner = "client!s", name = "yb", descriptor = "Z")
	public static boolean aBoolean423 = false;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IBIIIII)V")
	public static void method3881(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 + arg3;
		@Pc(13) int local13 = arg2 + arg4;
		@Pc(18) int local18 = arg1 - arg2;
		@Pc(25) int local25;
		for (local25 = arg3; local25 < local9; local25++) {
			Static103.method1978(arg5, arg1, arg4, Static40.anIntArrayArray6[local25]);
		}
		@Pc(44) int local44 = arg0 - arg2;
		for (local25 = arg0; local25 > local44; local25--) {
			Static103.method1978(arg5, arg1, arg4, Static40.anIntArrayArray6[local25]);
		}
		for (local25 = local9; local25 <= local44; local25++) {
			@Pc(73) int[] local73 = Static40.anIntArrayArray6[local25];
			Static103.method1978(arg5, local13, arg4, local73);
			Static103.method1978(arg5, arg1, local18, local73);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
	public static void method3885() {
		while (Static148.aFloat64 >= 2048.0F) {
			Static148.aFloat64 -= 2048.0F;
		}
		@Pc(15) int local15 = Static21.anInt443 >> 7;
		if (Static8.aFloat4 < 128.0F) {
			Static8.aFloat4 = 128.0F;
		}
		if (Static8.aFloat4 > 383.0F) {
			Static8.aFloat4 = 383.0F;
		}
		@Pc(40) int local40 = Static106.anInt3753 >> 7;
		while (Static148.aFloat64 < 0.0F) {
			Static148.aFloat64 += 2048.0F;
		}
		@Pc(52) int local52 = 0;
		@Pc(58) int local58 = Static42.method768(Static21.anInt443, Static132.anInt2608, Static106.anInt3753);
		@Pc(80) int local80;
		if (local15 > 3 && local40 > 3 && local15 < 100 && local40 < 100) {
			for (local80 = local15 - 4; local80 <= local15 + 4; local80++) {
				for (@Pc(93) int local93 = local40 - 4; local93 <= local40 + 4; local93++) {
					@Pc(100) int local100 = Static132.anInt2608;
					if (local100 < 3 && (Static17.aByteArrayArrayArray1[1][local80][local93] & 0x2) == 2) {
						local100++;
					}
					@Pc(141) int local141 = local58 + (Static199.aByteArrayArrayArray8[local100][local80][local93] & 0xFF) * 8 - Static280.anIntArrayArrayArray13[local100][local80][local93];
					if (local52 < local141) {
						local52 = local141;
					}
				}
			}
		}
		local80 = local52 * 192;
		if (local80 > 98048) {
			local80 = 98048;
		}
		if (local80 < 32768) {
			local80 = 32768;
		}
		if (Static221.anInt4151 < local80) {
			Static221.anInt4151 += (local80 - Static221.anInt4151) / 24;
		} else if (Static221.anInt4151 > local80) {
			Static221.anInt4151 += (local80 - Static221.anInt4151) / 80;
		}
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
	public static void method3891() {
		for (@Pc(3) int local3 = 0; local3 < Static125.anInt2513; local3++) {
			@Pc(10) int local10 = Static18.anIntArray36[local3];
			@Pc(14) Class11_Sub4_Sub1 local14 = Static14.aClass11_Sub4_Sub1Array1[local10];
			@Pc(20) int local20 = Static10.aClass1_Sub13_Sub1_117.method1853();
			if ((local20 & 0x80) != 0) {
				local20 += Static10.aClass1_Sub13_Sub1_117.method1853() << 8;
			}
			Static118.method2143(local10, local14, local20);
		}
	}
}
