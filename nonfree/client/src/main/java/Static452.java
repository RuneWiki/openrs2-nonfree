import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "[I")
	public static final int[] anIntArray618 = new int[8];

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_168 = new Class40(45, 2);

	@OriginalMember(owner = "client!rv", name = "o", descriptor = "I")
	public static int anInt7777 = 0;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method6442(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 <= '\u007f') {
				local10++;
			} else if (local18 <= '\u07ff') {
				local10 += 2;
			} else {
				local10 += 3;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)Lclient!maa;")
	public static Class6_Sub34 method6444() {
		if (Static349.aClass275_155 == null || Static21.aClass27_1 == null) {
			return null;
		}
		for (@Pc(22) Class6_Sub34 local22 = (Class6_Sub34) Static21.aClass27_1.method455(); local22 != null; local22 = (Class6_Sub34) Static21.aClass27_1.method455()) {
			@Pc(30) Class179 local30 = Static349.aClass276_3.method6396(local22.anInt4907);
			if (local30 != null && local30.aBoolean282 && local30.method3962(Static349.anInterface5_2)) {
				return local22;
			}
		}
		return null;
	}
}
