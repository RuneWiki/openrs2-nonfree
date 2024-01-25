import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!jh", name = "L", descriptor = "Lclient!lg;")
	public static Class207 aClass207_3;

	@OriginalMember(owner = "client!jh", name = "M", descriptor = "I")
	public static int anInt4263;

	@OriginalMember(owner = "client!jh", name = "Q", descriptor = "Lclient!cw;")
	public static Class61 aClass61_17;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!wu;)I")
	public static int method3723(@OriginalArg(1) Class380 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method8638(Static219.anInt3586)) {
			local5++;
		}
		if (arg0.method8638(Static255.anInt4054)) {
			local5++;
		}
		if (arg0.method8638(Static198.anInt8168)) {
			local5++;
		}
		if (arg0.method8638(Static50.anInt1047)) {
			local5++;
		}
		if (arg0.method8638(Static392.anInt6183)) {
			local5++;
		}
		if (arg0.method8638(Static311.anInt5006)) {
			local5++;
		}
		if (arg0.method8638(Static617.anInt9939)) {
			local5++;
		}
		if (arg0.method8638(Static200.anInt3400)) {
			local5++;
		}
		if (arg0.method8638(Static96.anInt1823)) {
			local5++;
		}
		if (arg0.method8638(Static211.anInt3250)) {
			local5++;
		}
		if (arg0.method8638(Static81.anInt1424)) {
			local5++;
		}
		if (arg0.method8638(Static197.anInt3366)) {
			local5++;
		}
		if (arg0.method8638(Static497.anInt8117)) {
			local5++;
		}
		if (arg0.method8638(Static179.anInt3513)) {
			local5++;
		}
		if (arg0.method8638(Static410.anInt6384)) {
			local5++;
		}
		if (arg0.method8638(Static5.anInt80)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBLclient!vj;)Ljava/lang/String;")
	public static String method3724(@OriginalArg(2) Class2_Sub22 arg0) {
		try {
			@Pc(7) int local7 = arg0.method8543();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.anInt10247 += Static106.aClass86_1.method1798(local7, 0, arg0.aByteArray115, arg0.anInt10247, local15);
			return Static131.method8468(0, local15, local7);
		} catch (@Pc(47) Exception local47) {
			return "Cabbage";
		}
	}
}
