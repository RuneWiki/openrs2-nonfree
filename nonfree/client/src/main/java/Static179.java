import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
	public static int anInt2990;

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
	public static int anInt2993;

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "Z")
	public static boolean aBoolean250 = false;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ID)V")
	public static void method2590(@OriginalArg(1) double arg0) {
		if (Static117.aDouble9 == arg0) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(29) int local29 = (int) (Math.pow((double) local15 / 255.0D, arg0) * 255.0D);
			Static449.anIntArray465[local15] = local29 <= 255 ? local29 : 255;
		}
		Static117.aDouble9 = arg0;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)Z")
	public static boolean method2591(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
	public static void method2592() {
		if (!Static199.aBoolean706) {
			return;
		}
		@Pc(12) Class73 local12 = Static506.method9206(Static7.anInt85, Static400.anInt6886);
		if (local12 != null && local12.anObjectArray5 != null) {
			@Pc(23) Class5_Sub3 local23 = new Class5_Sub3();
			local23.aClass73_1 = local12;
			local23.anObjectArray1 = local12.anObjectArray5;
			Static173.method2520(local23);
		}
		Static446.anInt7686 = -1;
		Static395.anInt6753 = -1;
		Static199.aBoolean706 = false;
		if (local12 != null) {
			Static298.method4399(local12);
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
	public static void method2593(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class5 local14 = Static131.aClass291_11.method6987(); local14 != null; local14 = Static131.aClass291_11.method6989()) {
			if ((local14.aLong314 >> 48 & 0xFFFFL) == (long) arg0) {
				local14.method9327(1);
			}
		}
	}
}
