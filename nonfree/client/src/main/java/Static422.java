import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
	public static int anInt6888;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "F")
	public static float aFloat74;

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "Lclient!hu;")
	public static Class105_Sub1 aClass105_Sub1_2;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
	public static int anInt6891 = 0;

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "Lclient!no;")
	public static final Class167 aClass167_9 = new Class167("", 11);

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Z")
	public static boolean aBoolean593 = false;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method5383(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(9) int local9 = 0; local9 < Static202.anInt3950; local9++) {
			if (arg0.equalsIgnoreCase(Static388.aStringArray45[local9])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static379.aClass7_Sub2_Sub3_Sub2_2.aString36);
	}
}
