import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!jk", name = "S", descriptor = "[[[Lclient!wr;")
	public static Class270[][][] aClass270ArrayArrayArray2;

	@OriginalMember(owner = "client!jk", name = "V", descriptor = "Ljava/lang/Object;")
	public static Object anObject5;

	@OriginalMember(owner = "client!jk", name = "Q", descriptor = "Lclient!ka;")
	public static final Class132 aClass132_24 = new Class132(260);

	@OriginalMember(owner = "client!jk", name = "T", descriptor = "[I")
	public static final int[] anIntArray265 = new int[1];

	@OriginalMember(owner = "client!jk", name = "U", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_78 = new Class211(83, 8);

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!jm;Z)V")
	public static void method2588(@OriginalArg(0) Class3_Sub4_Sub1_Sub1 arg0) {
		for (@Pc(10) Class2_Sub35 local10 = (Class2_Sub35) Static289.aClass156_36.method3155(); local10 != null; local10 = (Class2_Sub35) Static289.aClass156_36.method3150()) {
			if (arg0 == local10.aClass3_Sub4_Sub1_Sub1_2) {
				if (local10.aClass2_Sub1_Sub3_3 != null) {
					Static421.aClass2_Sub1_Sub4_2.method3237(local10.aClass2_Sub1_Sub3_3);
					local10.aClass2_Sub1_Sub3_3 = null;
				}
				local10.method5703();
				return;
			}
		}
	}
}
