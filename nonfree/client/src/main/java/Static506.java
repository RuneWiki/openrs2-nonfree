import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
	public static int anInt7915;

	@OriginalMember(owner = "client!ra", name = "U", descriptor = "[Lclient!gda;")
	public static Class3_Sub1[] aClass3_Sub1Array3;

	@OriginalMember(owner = "client!ra", name = "ab", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[100];

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!jw;B)V")
	public static void method6898(@OriginalArg(0) Class4_Sub5_Sub12 arg0) {
		@Pc(7) boolean local7 = false;
		arg0.method8990();
		for (@Pc(20) Class4_Sub5_Sub12 local20 = (Class4_Sub5_Sub12) Static256.aClass367_3.method8308(); local20 != null; local20 = (Class4_Sub5_Sub12) Static256.aClass367_3.method8309()) {
			if (Static416.method5244(arg0.method4194(), local20.method4194())) {
				local7 = true;
				Static663.method8789(local20, arg0);
				break;
			}
		}
		if (!local7) {
			Static256.aClass367_3.method8310(arg0);
		}
	}
}
