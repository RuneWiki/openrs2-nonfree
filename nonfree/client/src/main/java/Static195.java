import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "([BB)Lclient!rk;")
	public static Class1_Sub2_Sub1 method3213(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(20) Class1_Sub2_Sub1 local20;
		if (Static277.aBoolean412) {
			local20 = new Class1_Sub2_Sub1_Sub1(arg0, Static268.anIntArray461, Static289.anIntArray543, Static31.anIntArray78, Static44.anIntArray97, Static268.aByteArrayArray13);
		} else {
			local20 = new Class1_Sub2_Sub1_Sub2(arg0, Static268.anIntArray461, Static289.anIntArray543, Static31.anIntArray78, Static44.anIntArray97, Static268.aByteArrayArray13);
		}
		Static91.method1595();
		return local20;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
	public static void method3214(@OriginalArg(0) int arg0) {
		Static20.aClass1_Sub2_Sub21_1 = (Class1_Sub2_Sub21) Static241.aClass70_16.method2075((long) arg0);
	}
}
