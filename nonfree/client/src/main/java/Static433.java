import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!on", name = "A", descriptor = "Lclient!gm;")
	public static Class129 aClass129_2;

	@OriginalMember(owner = "client!on", name = "w", descriptor = "Lclient!oo;")
	public static final Class264 aClass264_61 = new Class264(8);

	@OriginalMember(owner = "client!on", name = "C", descriptor = "[Lclient!fo;")
	public static final Interface7[] anInterface7Array3 = new Interface7[128];

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IB)Lclient!bea;")
	public static Class29 method8533() {
		return new Class29(1, false);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method8535(@OriginalArg(1) int[] arg0) {
		@Pc(7) StringBuffer local7 = new StringBuffer();
		@Pc(9) int local9 = Static542.anInt9266;
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(23) Class342 local23 = Static605.aClass370_1.method8865(arg0[local11]);
			if (local23.anInt9959 != -1) {
				@Pc(35) Class20 local35 = (Class20) Static546.aClass264_55.method6367((long) local23.anInt9959);
				if (local35 == null) {
					@Pc(43) Class356 local43 = Static688.method8619(Static666.aClass386_141, local23.anInt9959, 0);
					if (local43 != null) {
						local35 = Static677.aClass137_47.method7951(local43, true);
						Static546.aClass264_55.method6364((long) local23.anInt9959, local35);
					}
				}
				if (local35 != null) {
					Static135.aClass20Array3[local9] = local35;
					local7.append(" <img=").append(local9).append(">");
					local9++;
				}
			}
		}
		return local7.toString();
	}
}
