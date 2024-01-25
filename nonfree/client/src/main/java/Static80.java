import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
	public static int anInt1103;

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
	public static int anInt1104;

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
	public static int anInt1106;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IZ)Lclient!mg;")
	public static Class156 method972(@OriginalArg(0) int arg0) {
		@Pc(8) Class156[] local8 = Static109.method1379();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class156 local16 = local8[local10];
			if (arg0 == local16.anInt4501) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method973(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static151.aStringArray14.length; local7++) {
			if (Static151.aStringArray14[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}
}
