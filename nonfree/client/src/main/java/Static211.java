import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static211 {

	@OriginalMember(owner = "client!gu", name = "i", descriptor = "F")
	public static float aFloat67;

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
	public static int anInt3663;

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "Lclient!qw;")
	public static final Class302 aClass302_21 = new Class302();

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_43 = new Class171(90, 4);

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
	public static int anInt3661 = 0;

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
	public static int anInt3662 = 0;

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "[I")
	public static final int[] anIntArray203 = new int[50];

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "[I")
	public static final int[] anIntArray204 = new int[25];

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)Z")
	public static boolean method3127(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}
}
