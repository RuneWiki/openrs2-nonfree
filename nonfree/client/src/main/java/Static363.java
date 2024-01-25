import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!sm", name = "B", descriptor = "Lclient!nd;")
	public static Class165 aClass165_1;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)Lclient!ht;")
	public static Class113 method5062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static176.aClass113ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static176.aClass113ArrayArrayArray3[0][arg1][arg2] != null && Static176.aClass113ArrayArrayArray3[0][arg1][arg2].aClass113_1 != null;
			if (local28 && arg0 >= Static58.anInt1578 - 1) {
				return null;
			}
			Static389.method5365(arg0, arg1, arg2);
		}
		return Static176.aClass113ArrayArrayArray3[arg0][arg1][arg2];
	}
}
