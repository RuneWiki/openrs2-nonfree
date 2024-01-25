import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
	public static int anInt8789;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V")
	public static void method7767() {
		Static66.anInt1152 = 0;
		Static461.aClass177Array1 = new Class177[50];
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!et;I)Lclient!ge;")
	public static Class33_Sub3 method7770(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(14) Class33 local14 = Static385.method5741(arg0);
		@Pc(20) int local20 = arg0.method8555(-9372);
		@Pc(24) int local24 = arg0.method8555(-9372);
		@Pc(28) int local28 = arg0.method8575();
		return new Class33_Sub3(local14.aClass18_12, local14.aClass239_13, local14.anInt7247, local14.anInt7249, local14.anInt7246, local14.anInt7251, local14.anInt7252, local14.anInt7250, local14.anInt7245, local20, local24, local28);
	}
}
