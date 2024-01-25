import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!nfa", name = "n", descriptor = "I")
	public static int anInt7036;

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_70 = new Class230(6, -1);

	@OriginalMember(owner = "client!nfa", name = "e", descriptor = "I")
	public static int anInt7032 = 0;

	@OriginalMember(owner = "client!nfa", name = "h", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_90 = new Class276(6, 8);

	@OriginalMember(owner = "client!nfa", name = "i", descriptor = "Z")
	public static volatile boolean aBoolean595 = false;

	@OriginalMember(owner = "client!nfa", name = "m", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_91 = new Class276(38, 14);

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IC)Z")
	public static boolean method5844(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static146.method8075(arg0)) {
			return true;
		} else {
			@Pc(16) char[] local16 = Static313.aCharArray3;
			for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
				@Pc(23) char local23 = local16[local18];
				if (local23 == arg0) {
					return true;
				}
			}
			@Pc(39) char[] local39 = Static329.aCharArray4;
			for (@Pc(41) int local41 = 0; local41 < local39.length; local41++) {
				@Pc(46) char local46 = local39[local41];
				if (arg0 == local46) {
					return true;
				}
			}
			return false;
		}
	}
}
