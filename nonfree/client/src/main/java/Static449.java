import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
	public static int anInt7375;

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "F")
	public static float aFloat180;

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "Lclient!fj;")
	public static Class77 aClass77_1;

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
	public static int anInt7379;

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_121 = new Class194(33, -1);

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray27 = new boolean[8];

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
	public static int anInt7378 = -1;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZIII)V")
	public static void method5909(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static418.aLong219 = 0L;
		@Pc(8) int local8 = Static213.method2819();
		if (arg0 == 3 || local8 == 3) {
			arg1 = true;
		}
		if (!Static407.aClass200_9.method5853()) {
			arg1 = true;
		}
		Static167.method2336(arg3, arg2, local8, arg1, arg0);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Z")
	public static boolean method5910(@OriginalArg(0) int arg0) {
		if (arg0 == 51 || arg0 == 44 || arg0 == 16 || arg0 == 57 || arg0 == 58) {
			return true;
		} else {
			return arg0 == 11 || arg0 == 1012;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)[Lclient!rp;")
	public static Class212[] method5912() {
		return new Class212[] { Static427.aClass212_3, Static435.aClass212_4, Static421.aClass212_2 };
	}
}
