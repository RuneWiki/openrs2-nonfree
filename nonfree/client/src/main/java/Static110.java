import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)I")
	public static int method1713(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(16) int local16 = (arg0 & 0x7F) * 96 >> 7;
		if (local16 < 2) {
			local16 = 2;
		} else if (local16 > 126) {
			local16 = 126;
		}
		return local16 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
	public static void method1715() {
		Static302.method4384((long) Static122.anInt2190, Static119.aClass95_4);
		if (Static187.anInt3418 != -1) {
			Static340.method4972(Static187.anInt3418);
		}
		for (@Pc(26) int local26 = 0; local26 < Static514.anInt8102; local26++) {
			if (Static89.aBooleanArray7[local26]) {
				Static170.aBooleanArray10[local26] = true;
			}
			Static68.aBooleanArray4[local26] = Static89.aBooleanArray7[local26];
			Static89.aBooleanArray7[local26] = false;
		}
		Static493.anInt7812 = Static122.anInt2190;
		if (Static187.anInt3418 != -1) {
			Static514.anInt8102 = 0;
			Static181.method2866();
		}
		Static119.aClass95_4.la();
		Static182.method2873(Static119.aClass95_4);
		@Pc(71) int local71 = Static544.method6986();
		if (local71 == -1) {
			local71 = Static530.anInt8325;
		}
		if (local71 == -1) {
			local71 = Static452.anInt7275;
		}
		Static108.method1705(local71);
		Static281.anInt4774 = 0;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIBIIII)V")
	public static void method1716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg4 - arg5;
		@Pc(18) int local18 = arg5 + arg0;
		for (@Pc(20) int local20 = arg0; local20 < local18; local20++) {
			Static578.method7640(arg3, arg2, arg1, Static276.anIntArrayArray32[local20]);
		}
		@Pc(39) int local39 = arg1 - arg5;
		@Pc(43) int local43 = arg5 + arg2;
		for (@Pc(45) int local45 = arg4; local45 > local14; local45--) {
			Static578.method7640(arg3, arg2, arg1, Static276.anIntArrayArray32[local45]);
		}
		for (@Pc(65) int local65 = local18; local65 <= local14; local65++) {
			@Pc(71) int[] local71 = Static276.anIntArrayArray32[local65];
			Static578.method7640(arg3, arg2, local43, local71);
			Static578.method7640(arg3, local39, arg1, local71);
		}
	}
}
