import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "Lclient!ff;")
	public static final Class104 aClass104_2 = new Class104(0);

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)V")
	public static void method3850() {
		if (Static213.anInt4349 != -1) {
			Static122.method6962(-1, Static213.anInt4349, false, -1);
			Static213.anInt4349 = -1;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method3851(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(16) Class4_Sub41 local16 = Static128.method2707(Static524.aClass61_121, Class16_Sub3.lb);
		local16.aClass4_Sub9_Sub1_3.method5961(-345277664, Static509.method7221(arg1) + 1);
		local16.aClass4_Sub9_Sub1_3.method6000(arg1);
		local16.aClass4_Sub9_Sub1_3.method5993(arg0);
		Static551.method7603(local16);
	}
}
