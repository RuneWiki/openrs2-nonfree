import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!em", name = "i", descriptor = "I")
	public static int anInt3468;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)Lclient!pea;")
	public static Class251 method2873(@OriginalArg(0) int arg0) {
		@Pc(8) Class251[] local8 = Static385.method8095();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class251 local16 = local8[local10];
			if (local16.anInt7941 == arg0) {
				return local16;
			}
		}
		return null;
	}
}
