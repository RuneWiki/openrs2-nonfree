import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
	public static int anInt6990;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_369 = new Class305(35, 8);

	@OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
	public static int anInt6992 = 0;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)Lclient!js;")
	public static Class156 method6311(@OriginalArg(0) int arg0) {
		@Pc(8) Class156[] local8 = Static488.method5773();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (arg0 == local8[local10].anInt4526) {
				return local8[local10];
			}
		}
		return null;
	}
}
