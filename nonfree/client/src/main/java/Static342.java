import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!oaa", name = "ab", descriptor = "Lclient!fj;")
	public static final Class101 aClass101_4 = new Class101();

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!bea;I)V")
	public static void method2040(@OriginalArg(0) Class30_Sub1_Sub1_Sub1 arg0) {
		@Pc(17) Class12_Sub22 local17 = (Class12_Sub22) Static451.aClass68_35.method1917((long) arg0.anInt4197);
		if (local17 == null) {
			return;
		}
		if (local17.aClass12_Sub13_Sub4_3 != null) {
			Static328.aClass12_Sub13_Sub1_1.method2443(local17.aClass12_Sub13_Sub4_3);
			local17.aClass12_Sub13_Sub4_3 = null;
		}
		local17.method7967();
	}
}
