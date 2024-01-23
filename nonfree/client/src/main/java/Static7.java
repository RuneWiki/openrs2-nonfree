import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
	public static int anInt2287;

	@OriginalMember(owner = "client!ah", name = "w", descriptor = "Z")
	public static boolean aBoolean158 = false;

	@OriginalMember(owner = "client!ah", name = "x", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray28 = new String[100];

	@OriginalMember(owner = "client!ah", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString129 = "Please remove ";

	@OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
	public static int anInt2288 = -1;

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)V")
	public static void method1803() {
		if (Static203.aBoolean318) {
			return;
		}
		Static203.aBoolean318 = true;
		Static192.aBoolean301 = true;
		if (Static19.aBoolean30) {
			Static298.aFloat58 = (int) Static298.aFloat58 - 65 & 0xFFFFFF80;
		} else {
			Static88.aFloat10 += (-24.0F - Static88.aFloat10) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILclient!in;I)V")
	public static void method1805(@OriginalArg(1) int arg0, @OriginalArg(2) Class71 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte9 == 0) {
			arg1.anInt2711 = arg1.anInt2695;
		} else if (arg1.aByte9 == 1) {
			arg1.anInt2711 = (arg0 - arg1.anInt2698) / 2 + arg1.anInt2695;
		} else if (arg1.aByte9 == 2) {
			arg1.anInt2711 = arg0 - arg1.anInt2695 - arg1.anInt2698;
		} else if (arg1.aByte9 == 3) {
			arg1.anInt2711 = arg1.anInt2695 * arg0 >> 14;
		} else if (arg1.aByte9 == 4) {
			arg1.anInt2711 = (arg0 * arg1.anInt2695 >> 14) + (arg0 - arg1.anInt2698) / 2;
		} else {
			arg1.anInt2711 = arg0 - arg1.anInt2698 - (arg1.anInt2695 * arg0 >> 14);
		}
		if (arg1.aByte10 == 0) {
			arg1.anInt2641 = arg1.anInt2714;
		} else if (arg1.aByte10 == 1) {
			arg1.anInt2641 = arg1.anInt2714 + (arg2 - arg1.anInt2722) / 2;
		} else if (arg1.aByte10 == 2) {
			arg1.anInt2641 = arg2 - arg1.anInt2722 - arg1.anInt2714;
		} else if (arg1.aByte10 == 3) {
			arg1.anInt2641 = arg2 * arg1.anInt2714 >> 14;
		} else if (arg1.aByte10 == 4) {
			arg1.anInt2641 = (arg1.anInt2714 * arg2 >> 14) + (arg2 - arg1.anInt2722) / 2;
		} else {
			arg1.anInt2641 = arg2 - (arg2 * arg1.anInt2714 >> 14) - arg1.anInt2722;
		}
		if (!Static178.aBoolean303 || Static36.method769(arg1).anInt1759 == 0 && arg1.anInt2712 != 0) {
			return;
		}
		if (arg1.anInt2711 < 0) {
			arg1.anInt2711 = 0;
		} else if (arg0 < arg1.anInt2711 + arg1.anInt2698) {
			arg1.anInt2711 = arg0 - arg1.anInt2698;
		}
		if (arg1.anInt2641 < 0) {
			arg1.anInt2641 = 0;
		} else if (arg2 < arg1.anInt2641 + arg1.anInt2722) {
			arg1.anInt2641 = arg2 - arg1.anInt2722;
		}
	}

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "(I)Z")
	public static boolean method1806() {
		return Static299.anInt5641 == 0 ? Static221.aClass1_Sub5_Sub2_2.method1640() : true;
	}

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "(I)V")
	public static void method1807() {
		@Pc(8) int[] local8 = new int[Static178.anInt3973];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16;
		for (local16 = 0; local16 < Static178.anInt3973; local16++) {
			@Pc(27) Class42 local27 = Static112.method2060(local16);
			if (local27.anInt1496 >= 0 || local27.anInt1457 >= 0) {
				local8[local14++] = local16;
			}
		}
		Static249.anIntArray435 = new int[local14];
		for (local16 = 0; local16 < local14; local16++) {
			Static249.anIntArray435[local16] = local8[local16];
		}
	}
}
