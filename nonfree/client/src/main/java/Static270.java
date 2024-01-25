import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "I")
	public static int anInt4659;

	@OriginalMember(owner = "client!jba", name = "h", descriptor = "I")
	public static int anInt4661;

	@OriginalMember(owner = "client!jba", name = "o", descriptor = "[[Lclient!ofa;")
	public static Class265[][] aClass265ArrayArray2;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "[I")
	public static final int[] anIntArray272 = new int[3];

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray2 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!jba", name = "g", descriptor = "I")
	public static int anInt4660 = 0;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!ha;IBILclient!qw;)V")
	public static void method3998(@OriginalArg(0) Class95 arg0, @OriginalArg(4) Class302 arg1) {
		Static310.aClass302_27.method6614();
		if (Static359.aBoolean426) {
			return;
		}
		for (@Pc(21) Class3_Sub46 local21 = (Class3_Sub46) arg1.method6603(); local21 != null; local21 = (Class3_Sub46) arg1.method6605()) {
			@Pc(29) Class188 local29 = Static671.aClass378_4.method8708(local21.anInt9112);
			if (Static140.method2324(local29)) {
				@Pc(45) boolean local45 = Static427.method5891(local29, local21, arg0);
				if (local45) {
					Static397.method7857(local21, local29, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZIZI)Lclient!uq;")
	public static Class362 method4006(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class241 local10 = null;
		if (Static674.aClass152_5 != null) {
			local10 = new Class241(arg1, Static674.aClass152_5, Static410.aClass152Array1[arg1], 1000000);
		}
		Static84.aClass229_Sub1Array1[arg1] = Static563.aClass257_1.method5623(arg1, local10, Static584.aClass241_4);
		Static84.aClass229_Sub1Array1[arg1].method5286();
		return new Class362(Static84.aClass229_Sub1Array1[arg1], arg0, arg2);
	}
}
