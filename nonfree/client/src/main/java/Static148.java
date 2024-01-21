import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static148 {

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "Lclient!fg;")
	public static Class33 aClass33_2;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public static final int anInt3035 = 50;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "[Lclient!oc;")
	public static final Class70[] aClass70Array53 = new Class70[anInt3035];

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "[I")
	public static final int[] anIntArray213 = new int[anInt3035];

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "[I")
	public static final int[] anIntArray214 = new int[anInt3035];

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "[I")
	public static final int[] anIntArray215 = new int[anInt3035];

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1428 = Static193.method3027("New User");

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "[I")
	public static final int[] anIntArray216 = new int[anInt3035];

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1429 = aClass70_1428;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1430 = Static193.method3027("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "[I")
	public static final int[] anIntArray217 = new int[anInt3035];

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1431 = Static193.method3027(":clanreq:");

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "[I")
	public static final int[] anIntArray218 = new int[anInt3035];

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "Lclient!vc;")
	public static final Class94 aClass94_7 = new Class94(50);

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "[I")
	public static final int[] anIntArray219 = new int[anInt3035];

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Z")
	public static boolean method2160(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}
}
