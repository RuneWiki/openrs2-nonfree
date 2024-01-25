import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "V", descriptor = "I")
	public static int anInt225;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLclient!ic;IZIII)V")
	public static void method176(@OriginalArg(1) Class113 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static218.anInt5620 = arg3;
		Static436.aClass113_131 = arg0;
		Static402.aBoolean534 = false;
		Static356.anInt5885 = 1;
		Static81.anInt1504 = 0;
		Static156.anInt2618 = arg1;
		Static442.anInt7354 = Static312.aClass1_Sub9_Sub4_3.method4624() / arg2;
		if (Static442.anInt7354 < 1) {
			Static442.anInt7354 = 1;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B[Ljava/lang/Object;[I)V")
	public static void method178(@OriginalArg(1) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static417.method1207(arg1.length - 1, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(CI)Z")
	public static boolean method180(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(27) char[] local27 = Static440.aCharArray6;
			for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
				@Pc(35) char local35 = local27[local29];
				if (arg0 == local35) {
					return true;
				}
			}
		}
		return false;
	}
}
