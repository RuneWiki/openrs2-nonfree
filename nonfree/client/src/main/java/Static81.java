import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static81 {

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
	public static int anInt1431;

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "I")
	public static int anInt1432;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "Lclient!gda;")
	public static Class126 aClass126_52;

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_26 = new Class156(93, 0);

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(III)Z")
	public static boolean method1329(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
