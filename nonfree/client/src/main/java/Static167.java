import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!fv", name = "v", descriptor = "I")
	public static int anInt4124;

	@OriginalMember(owner = "client!fv", name = "r", descriptor = "Z")
	public static boolean aBoolean305 = false;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(CI)Z")
	public static boolean method3598(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static149.method3404(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static454.aCharArray5;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (local26 == arg0) {
					return true;
				}
			}
			@Pc(50) char[] local50 = Static379.aCharArray4;
			for (@Pc(52) int local52 = 0; local52 < local50.length; local52++) {
				@Pc(58) char local58 = local50[local52];
				if (arg0 == local58) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "(II)I")
	public static int method3599(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V")
	public static void method3600() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static446.aBooleanArray21[local7] = false;
		}
		Static141.anInt3414 = Static621.anInt10870;
		Static601.anInt10558 = Static266.anInt5673;
		Static552.anInt9898 = Static639.anInt11034;
		Static183.anInt4412 = Static407.anInt7704;
		Static442.anInt8212 = -1;
		Static194.anInt4508 = -1;
		Static148.anInt3618 = Static135.anInt3347;
		Static26.anInt546 = 0;
		Static558.anInt9998 = Static189.anInt11070;
		Static407.anInt7708 = 0;
		Static496.anInt9165 = 5;
		Static13.anInt196 = -1;
		Static616.anInt10782 = -1;
	}
}
