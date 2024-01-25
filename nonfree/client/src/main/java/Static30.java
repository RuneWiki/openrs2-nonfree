import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static30 {

	@OriginalMember(owner = "client!bba", name = "g", descriptor = "Lclient!il;")
	public static Class156 aClass156_1;

	@OriginalMember(owner = "client!bba", name = "f", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_7 = new Class173(40, -1);

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIILclient!eba;I)V")
	public static void method404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub14 arg2, @OriginalArg(4) int arg3) {
		arg2.aClass4_Sub11_Sub1_3.method4909(arg0);
		arg2.aClass4_Sub11_Sub1_3.method4902(arg1);
		arg2.aClass4_Sub11_Sub1_3.method4932(arg3);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lclient!sj;Lclient!sj;I)V")
	public static void method406(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		if (arg1.aClass1_67 != null) {
			arg1.method8252();
		}
		arg1.aClass1_68 = arg0;
		arg1.aClass1_67 = arg0.aClass1_67;
		arg1.aClass1_67.aClass1_68 = arg1;
		arg1.aClass1_68.aClass1_67 = arg1;
	}
}
