import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "I")
	public static int anInt10229;

	@OriginalMember(owner = "client!jca", name = "e", descriptor = "[I")
	public static final int[] anIntArray601 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
	public static int anInt10232 = 0;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!ig;I)Lclient!cca;")
	public static Class5_Sub2 method8261(@OriginalArg(0) Class8_Sub8 arg0) {
		return new Class5_Sub2(arg0.method8568(), arg0.method8568(), arg0.method8568(), arg0.method8568(), arg0.method8560(), arg0.method8560(), arg0.method8525());
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(BI)V")
	public static void method8267(@OriginalArg(1) int arg0) {
		@Pc(10) Class8_Sub52 local10 = (Class8_Sub52) Static16.aClass253_3.method6594((long) arg0);
		if (local10 != null) {
			local10.aBoolean758 = !local10.aBoolean758;
			local10.aClass2_Sub1_1.method4227(local10.aBoolean758);
		}
	}
}
