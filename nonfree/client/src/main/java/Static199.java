import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!hw", name = "i", descriptor = "Lclient!ek;")
	public static Class85 aClass85_5;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "I")
	public static int anInt3446 = 0;

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
	public static int anInt3448 = 0;

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "Z")
	public static boolean aBoolean227 = false;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)Z")
	public static boolean method2983(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIII)V")
	public static void method2984(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class6_Sub1_Sub5 local8 = Static77.method1176(arg3, 8);
		local8.method776();
		local8.anInt972 = arg0;
		local8.anInt979 = arg2;
		local8.anInt974 = arg1;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IILclient!fca;B)V")
	public static void method2986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2) {
		if (arg2.aByte44 == 0) {
			arg2.anInt2331 = arg2.anInt2260;
		} else if (arg2.aByte44 == 1) {
			arg2.anInt2331 = (arg0 - arg2.anInt2305) / 2 + arg2.anInt2260;
		} else if (arg2.aByte44 == 2) {
			arg2.anInt2331 = arg0 - arg2.anInt2260 - arg2.anInt2305;
		} else if (arg2.aByte44 == 3) {
			arg2.anInt2331 = arg2.anInt2260 * arg0 >> 14;
		} else if (arg2.aByte44 == 4) {
			arg2.anInt2331 = (arg0 * arg2.anInt2260 >> 14) + (arg0 - arg2.anInt2305) / 2;
		} else {
			arg2.anInt2331 = arg0 - arg2.anInt2305 - (arg0 * arg2.anInt2260 >> 14);
		}
		if (arg2.aByte41 == 0) {
			arg2.anInt2265 = arg2.anInt2320;
		} else if (arg2.aByte41 == 1) {
			arg2.anInt2265 = (arg1 - arg2.anInt2340) / 2 + arg2.anInt2320;
		} else if (arg2.aByte41 == 2) {
			arg2.anInt2265 = arg1 - arg2.anInt2340 - arg2.anInt2320;
		} else if (arg2.aByte41 == 3) {
			arg2.anInt2265 = arg1 * arg2.anInt2320 >> 14;
		} else if (arg2.aByte41 == 4) {
			arg2.anInt2265 = (arg2.anInt2320 * arg1 >> 14) + (arg1 - arg2.anInt2340) / 2;
		} else {
			arg2.anInt2265 = arg1 - arg2.anInt2340 - (arg2.anInt2320 * arg1 >> 14);
		}
		if (!Static446.aBoolean529 || Static65.method862(arg2).anInt7805 == 0 && arg2.anInt2264 != 0) {
			return;
		}
		if (arg2.anInt2331 < 0) {
			arg2.anInt2331 = 0;
		} else if (arg2.anInt2331 + arg2.anInt2305 > arg0) {
			arg2.anInt2331 = arg0 - arg2.anInt2305;
		}
		if (arg2.anInt2265 < 0) {
			arg2.anInt2265 = 0;
		} else if (arg2.anInt2340 + arg2.anInt2265 > arg1) {
			arg2.anInt2265 = arg1 - arg2.anInt2340;
		}
	}
}
