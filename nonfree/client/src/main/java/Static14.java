import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ch;Lclient!r;I)I")
	public static int method8200(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class7 arg1) {
		if (arg0.anInt1739 != -1) {
			return arg0.anInt1739;
		}
		if (arg0.anInt1740 != -1) {
			@Pc(24) Class69 local24 = arg1.anInterface7_12.method4460(arg0.anInt1740);
			if (!local24.aBoolean182) {
				return local24.aShort21;
			}
		}
		return arg0.anInt1744;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(III)I")
	public static int method8204(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (arg1 + local12) / arg0 - local12;
	}
}
