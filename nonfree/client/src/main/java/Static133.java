import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!ew", name = "m", descriptor = "I")
	public static int anInt3084;

	@OriginalMember(owner = "client!ew", name = "e", descriptor = "Lclient!db;")
	public static final Class64 aClass64_118 = new Class64(35, 0);

	@OriginalMember(owner = "client!ew", name = "l", descriptor = "[I")
	public static final int[] anIntArray297 = new int[5];

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method2782(@OriginalArg(1) String arg0) {
		if (Static168.aClass193Array1 != null) {
			@Pc(20) Class4_Sub41 local20 = Static128.method2707(Static505.aClass61_117, Class16_Sub3.lb);
			local20.aClass4_Sub9_Sub1_3.method5961(-345277664, Static509.method7221(arg0));
			local20.aClass4_Sub9_Sub1_3.method6000(arg0);
			Static551.method7603(local20);
		}
	}
}
