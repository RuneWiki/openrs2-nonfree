import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
	public static int anInt1807;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method1721(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class6_Sub31 local12 = Static114.method2007(Static268.aClass47_125, Static337.aClass324_1);
		local12.aClass6_Sub21_Sub2_2.method6062(Static391.method5746(arg0) + 1);
		local12.aClass6_Sub21_Sub2_2.method6022(arg0);
		local12.aClass6_Sub21_Sub2_2.method6024(arg1);
		Static534.method7251(local12);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZZ)Z")
	public static boolean method1722(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
