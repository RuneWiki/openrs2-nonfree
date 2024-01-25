import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static603 {

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "Z")
	public static boolean aBoolean801 = true;

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(Lclient!et;I)Lclient!ck;")
	public static Class33_Sub2 method8250(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(7) Class33 local7 = Static385.method5741(arg0);
		@Pc(17) int local17 = arg0.method8575();
		@Pc(21) int local21 = arg0.method8575();
		@Pc(25) int local25 = arg0.method8575();
		@Pc(29) int local29 = arg0.method8575();
		@Pc(33) int local33 = arg0.method8575();
		@Pc(37) int local37 = arg0.method8575();
		return new Class33_Sub2(local7.aClass18_12, local7.aClass239_13, local7.anInt7247, local7.anInt7249, local7.anInt7246, local7.anInt7251, local7.anInt7252, local7.anInt7250, local7.anInt7245, local17, local21, local25, local29, local33, local37);
	}
}
