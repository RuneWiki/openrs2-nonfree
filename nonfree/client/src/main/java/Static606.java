import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static606 {

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "Lclient!kg;")
	public static Class200 aClass200_222;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "[Lclient!iea;")
	public static Class31[] aClass31Array18;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "Lclient!ria;")
	public static Class303 aClass303_24 = null;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
	public static int anInt10276 = -60;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILclient!td;III)V")
	public static void method8736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class326 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) Class2_Sub2 local5 = null;
		for (@Pc(12) Class2_Sub2 local12 = (Class2_Sub2) Static387.aClass114_33.method2772(); local12 != null; local12 = (Class2_Sub2) Static387.aClass114_33.method2762()) {
			if (arg4 == local12.anInt125 && local12.anInt129 == arg0 && local12.anInt119 == arg3 && arg1 == local12.anInt120) {
				local5 = local12;
				break;
			}
		}
		if (local5 == null) {
			local5 = new Class2_Sub2();
			local5.anInt119 = arg3;
			local5.anInt125 = arg4;
			local5.anInt129 = arg0;
			local5.anInt120 = arg1;
			Static387.aClass114_33.method2771(local5);
		}
		local5.aClass326_1 = arg2;
		local5.aBoolean18 = false;
		local5.aBoolean17 = true;
	}
}
