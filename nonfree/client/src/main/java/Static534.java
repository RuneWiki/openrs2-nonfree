import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static534 {

	@OriginalMember(owner = "client!wf", name = "A", descriptor = "Lclient!kn;")
	public static Class163 aClass163_7;

	@OriginalMember(owner = "client!wf", name = "F", descriptor = "F")
	public static float aFloat222;

	@OriginalMember(owner = "client!wf", name = "G", descriptor = "[I")
	public static final int[] anIntArray716 = new int[14];

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZII)Z")
	public static boolean method7691(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x40000) != 0 | Static439.method6710(arg1, arg0) || Static154.method2641(arg0, arg1);
	}
}
