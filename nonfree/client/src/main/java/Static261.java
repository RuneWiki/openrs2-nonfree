import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "Lclient!in;")
	public static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_8;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "[I")
	public static int[] anIntArray454;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "Lclient!sb;")
	public static Class1_Sub14 aClass1_Sub14_10 = new Class1_Sub14(new byte[5000]);

	@OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
	public static int anInt5044 = 0;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V")
	public static void method3919(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub1_Sub2 local8 = Static46.method824(10, arg0);
		local8.method299();
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)V")
	public static void method3920(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub1_Sub2 local8 = Static46.method824(2, arg0);
		local8.method299();
	}
}
