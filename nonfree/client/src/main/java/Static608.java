import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static608 {

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
	public static int anInt10050;

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
	public static int anInt10054;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
	public static int anInt10053 = 0;

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
	public static int anInt10055 = 0;

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
	public static int anInt10056 = -1;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(CB)Z")
	public static boolean method8538(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(27) char[] local27 = Static45.aCharArray1;
			for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
				@Pc(35) char local35 = local27[local29];
				if (local35 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)Z")
	public static boolean method8539(@OriginalArg(1) int arg0) {
		return (arg0 & -arg0) == arg0;
	}
}
