import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_86 = new Class214(40, -1);

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLclient!hf;)V")
	public static void method1777(@OriginalArg(1) Class1_Sub9 arg0) {
		if (arg0.aClass1_Sub28_5 != null) {
			arg0.aClass1_Sub28_5.anInt4312 = 0;
		}
		arg0.aBoolean492 = false;
		for (@Pc(23) Class1_Sub9 local23 = arg0.method4595(); local23 != null; local23 = arg0.method4591()) {
			method1777(local23);
		}
	}
}
