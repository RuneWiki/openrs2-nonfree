import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
	public static int anInt862;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZLjava/lang/String;Lclient!et;)I")
	public static int method744(@OriginalArg(1) String arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		@Pc(6) int local6 = arg1.anInt9723;
		@Pc(20) byte[] local20 = Static491.method7041(arg0);
		arg1.method8570(local20.length);
		arg1.anInt9723 += Static25.aClass102_1.method2146(local20.length, arg1.aByteArray111, 0, local20, arg1.anInt9723);
		return arg1.anInt9723 - local6;
	}
}
