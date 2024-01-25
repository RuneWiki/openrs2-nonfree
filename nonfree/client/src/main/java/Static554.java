import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!vca", name = "C", descriptor = "I")
	public static int anInt9174 = 0;

	@OriginalMember(owner = "client!vca", name = "E", descriptor = "Z")
	public static boolean aBoolean711 = false;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method7515(@OriginalArg(1) String arg0) {
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
}
