import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V")
	public static void method174() {
		Static114.aClass26_19.method328();
		Static182.aClass26_32.method328();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILclient!uo;IIIIZLclient!ep;Lclient!ms;)V")
	public static void method175(@OriginalArg(0) int arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class66 arg6, @OriginalArg(8) Class137 arg7) {
		@Pc(13) Class23 local13 = Static212.method3827(arg0);
		if (local13 == null || !local13.aBoolean15 || !local13.method250()) {
			return;
		}
		@Pc(32) int local32;
		if (local13.anIntArray19 != null) {
			@Pc(30) int[] local30 = new int[local13.anIntArray19.length];
			@Pc(44) int local44;
			for (local32 = 0; local32 < local30.length / 2; local32++) {
				if (Static81.anInt1498 == 4) {
					local44 = (int) Static246.aFloat51 & 0x3FFF;
				} else {
					local44 = Static303.anInt4931 + (int) Static246.aFloat51 & 0x3FFF;
				}
				@Pc(57) int local57 = Class140.anIntArray330[local44];
				@Pc(61) int local61 = Class140.anIntArray329[local44];
				if (Static81.anInt1498 != 4) {
					local61 = local61 * 256 / (Static231.anInt5050 + 256);
					local57 = local57 * 256 / (Static231.anInt5050 + 256);
				}
				local30[local32 * 2] = arg4 + arg7.anInt4060 / 2 + (local57 * (local13.anIntArray19[local32 * 2 + 1] * 4 + arg3) + (arg2 + local13.anIntArray19[local32 * 2] * 4) * local61 >> 15);
				local30[local32 * 2 + 1] = arg7.anInt4110 / 2 + arg5 - (local61 * (local13.anIntArray19[local32 * 2 + 1] * 4 + arg3) + -((local13.anIntArray19[local32 * 2] * 4 + arg2) * local57) >> 15);
			}
			Static60.method909(arg1, local30, local13.anInt314, arg7.anIntArray317, arg7.anIntArray315);
			for (local44 = 0; local44 < local30.length / 2 - 1; local44++) {
				arg1.method4931(local30[local44 * 2], local30[local44 * 2 + 1], local30[(local44 + 1) * 2], local30[local44 * 2 + 1 + 2], local13.anInt291, arg6, arg4, arg5);
			}
			arg1.method4931(local30[local30.length - 2], local30[local30.length - 1], local30[0], local30[1], local13.anInt291, arg6, arg4, arg5);
		}
		@Pc(264) Class97 local264 = null;
		if (local13.anInt303 != -1) {
			local264 = local13.method247(false, arg1);
			if (local264 != null) {
				Static189.method496(arg4, arg6, arg7, arg2, arg3, local264, arg5);
			}
		}
		if (local13.aString7 == null) {
			return;
		}
		local32 = 0;
		if (local264 != null) {
			local32 = local264.method5543();
		}
		@Pc(302) Class9 local302 = Static283.aClass9_3;
		@Pc(304) Class114 local304 = Static275.aClass114_7;
		if (local13.anInt299 == 1) {
			local304 = Static332.aClass114_8;
			local302 = Static30.aClass9_1;
		}
		if (local13.anInt299 == 2) {
			local304 = Static102.aClass114_3;
			local302 = Static106.aClass9_2;
		}
		Static151.method2281(arg6, arg7, arg5, arg2, local304, local13.aString7, arg3, local302, arg4, local13.anInt305, local32);
		return;
	}
}
