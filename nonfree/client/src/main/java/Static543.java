import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
	public static int anInt9322 = 0;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray30 = new boolean[100];

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Lclient!uj;")
	public static final Class321 aClass321_8 = new Class321();

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "Z")
	public static boolean aBoolean621 = false;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Z")
	public static boolean method7377(@OriginalArg(0) int arg0) {
		if (arg0 == 11 || arg0 == 19 || arg0 == 2 || arg0 == 25 || arg0 == 59) {
			return true;
		} else {
			return arg0 == 44 || arg0 == 1004;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BC)Z")
	public static boolean method7378(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(35) char[] local35 = Static73.aCharArray1;
			for (@Pc(37) int local37 = 0; local37 < local35.length; local37++) {
				@Pc(43) char local43 = local35[local37];
				if (arg0 == local43) {
					return true;
				}
			}
		}
		return false;
	}
}
