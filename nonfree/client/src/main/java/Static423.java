import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
	public static int anInt7083;

	@OriginalMember(owner = "client!uv", name = "l", descriptor = "[Lclient!kw;")
	public static Class146[] aClass146Array1;

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "[[B")
	public static final byte[][] aByteArrayArray21 = new byte[50][];

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "Z")
	public static boolean aBoolean478 = false;

	@OriginalMember(owner = "client!uv", name = "q", descriptor = "I")
	public static int anInt7090 = 0;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)V")
	public static void method5618(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static319.aClass258ArrayArrayArray3 = Static102.aClass258ArrayArrayArray1;
			Static410.aClass125Array3 = Static408.aClass125Array2;
		} else {
			Static319.aClass258ArrayArrayArray3 = Static107.aClass258ArrayArrayArray2;
			Static410.aClass125Array3 = Static110.aClass125Array1;
		}
		Static96.anInt1667 = Static319.aClass258ArrayArrayArray3.length;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIII[BI)Z")
	public static boolean method5623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(9) int local9 = arg1 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg3 + 7) / 8);
		@Pc(41) int local41 = -((arg1 + 8 - 1) / 8);
		for (@Pc(47) int local47 = local32; local47 < 0; local47++) {
			for (@Pc(51) int local51 = local41; local51 < 0; local51++) {
				if (arg4[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local16;
			if (arg4[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg0;
		}
		return false;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(III)Z")
	public static boolean method5624(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
