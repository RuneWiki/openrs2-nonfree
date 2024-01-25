import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!re", name = "fb", descriptor = "I")
	public static int anInt6015;

	@OriginalMember(owner = "client!re", name = "tb", descriptor = "Lclient!nd;")
	public static Class161 aClass161_4;

	@OriginalMember(owner = "client!re", name = "J", descriptor = "I")
	public static int anInt5993 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)V")
	public static void method5141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static209.aClass1_Sub33_Sub2_2.method5142(arg0);
		Static209.aClass1_Sub33_Sub2_2.method5138(arg2);
		Static209.aClass1_Sub33_Sub2_2.method5138(arg1);
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(II)V")
	public static void method5147(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub6_Sub11 local8 = Static295.method4455(arg0, 11);
		local8.method2998();
	}
}
