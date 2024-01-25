import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!sc", name = "H", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_127 = new Class276(41, 6);

	@OriginalMember(owner = "client!sc", name = "J", descriptor = "I")
	public static int anInt8842 = 0;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZZLclient!oa;I)Lclient!bd;")
	public static Class27 method7247(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class15 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == -1) {
			return null;
		}
		if (Static500.anIntArray611 != null) {
			for (@Pc(13) int local13 = 0; local13 < Static500.anIntArray611.length; local13++) {
				if (arg2 == Static500.anIntArray611[local13]) {
					return Static269.aClass27Array1[local13];
				}
			}
		}
		@Pc(43) Class27 local43 = (Class27) Static155.aClass211_17.method5534((long) arg2);
		if (local43 != null) {
			if (arg0 && local43.aClass297_5 == null) {
				@Pc(59) Class297 local59 = Static356.method5901(Static16.aClass254_7, arg2);
				if (local59 == null) {
					return null;
				}
				local43.aClass297_5 = local59;
			}
			return local43;
		}
		@Pc(77) Class20[] local77 = Static599.method819(Static181.aClass254_57, arg2);
		if (local77 == null) {
			return null;
		}
		@Pc(86) Class297 local86 = Static356.method5901(Static16.aClass254_7, arg2);
		if (local86 == null) {
			return null;
		}
		if (arg0) {
			local43 = new Class27(arg1.method5346(local86, local77), local86);
		} else {
			local43 = new Class27(arg1.method5346(local86, local77));
		}
		Static155.aClass211_17.method5529((long) arg2, local43);
		return local43;
	}
}
