import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
	public static int anInt2929;

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "Lclient!jb;")
	public static Class2_Sub18_Sub2 aClass2_Sub18_Sub2_1;

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "Lclient!sf;")
	public static Class125 aClass125_1;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
	public static void method2320() {
		Static448.method6059(Static259.aClass44_63);
		Static98.aClass2_Sub20_Sub1_1.method3699(Static405.method5498());
		Static98.aClass2_Sub20_Sub1_1.method3745(Static96.anInt2175);
		Static98.aClass2_Sub20_Sub1_1.method3745(Static216.anInt4171);
		Static98.aClass2_Sub20_Sub1_1.method3699(Static399.aClass167_Sub1_1.anInt5559);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIILclient!vl;Lclient!vl;)V")
	public static void method2322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub1 arg3, @OriginalArg(4) Class4_Sub1 arg4) {
		@Pc(4) Class113 local4 = Static363.method5062(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass4_Sub1_2 = arg3;
			local4.aClass4_Sub1_3 = arg4;
		}
	}
}
