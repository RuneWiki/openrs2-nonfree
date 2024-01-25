import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!qfa", name = "w", descriptor = "I")
	public static int anInt7945;

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method6611(@OriginalArg(0) String arg0) {
		if (Static126.aClass181Array1 != null) {
			@Pc(19) Class4_Sub14 local19 = Static196.method3380(Static17.aClass159_1, Static315.aClass173_90);
			local19.aClass4_Sub11_Sub1_3.method4957(Static163.method2969(arg0));
			local19.aClass4_Sub11_Sub1_3.method4945(arg0);
			Static353.method5712(local19);
		}
	}
}
