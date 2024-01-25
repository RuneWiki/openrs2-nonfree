import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!mh", name = "E", descriptor = "[I")
	public static int[] anIntArray443;

	@OriginalMember(owner = "client!mh", name = "J", descriptor = "[Lclient!ro;")
	public static final Class6_Sub4_Sub15[] aClass6_Sub4_Sub15Array7 = new Class6_Sub4_Sub15[14];

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)Lclient!gs;")
	public static Class123 method5203(@OriginalArg(1) int arg0) {
		@Pc(13) Class123[] local13 = Static86.method1941();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class123 local21 = local13[local15];
			if (local21.anInt3994 == arg0) {
				return local21;
			}
		}
		return null;
	}
}
