import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!tj", name = "N", descriptor = "Lclient!r;")
	public static Class134 aClass134_14;

	@OriginalMember(owner = "client!tj", name = "O", descriptor = "I")
	public static int anInt8607;

	@OriginalMember(owner = "client!tj", name = "G", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_91 = new Class70(52, 8);

	@OriginalMember(owner = "client!tj", name = "P", descriptor = "Z")
	public static boolean aBoolean668 = false;

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)Lclient!rca;")
	public static Class283 method7039(@OriginalArg(0) int arg0) {
		@Pc(8) Class283[] local8 = Static5.method57();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(24) Class283 local24 = local8[local10];
			if (arg0 == local24.anInt7694) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(III)Z")
	public static boolean method7040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}
}
