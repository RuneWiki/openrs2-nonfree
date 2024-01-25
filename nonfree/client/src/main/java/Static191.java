import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!gda", name = "p", descriptor = "[I")
	public static final int[] anIntArray177 = new int[3];

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lclient!jca;IIIII)V")
	public static void method2950(@OriginalArg(0) Class173 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) Class3_Sub33 local12 = null;
		for (@Pc(17) Class3_Sub33 local17 = (Class3_Sub33) Static153.aClass302_15.method6603(); local17 != null; local17 = (Class3_Sub33) Static153.aClass302_15.method6605()) {
			if (local17.anInt5157 == arg4 && arg1 == local17.anInt5169 && arg3 == local17.anInt5170 && local17.anInt5163 == arg2) {
				local12 = local17;
				break;
			}
		}
		if (local12 == null) {
			local12 = new Class3_Sub33();
			local12.anInt5157 = arg4;
			local12.anInt5169 = arg1;
			local12.anInt5163 = arg2;
			local12.anInt5170 = arg3;
			Static153.aClass302_15.method6613(local12);
		}
		local12.aClass173_2 = arg0;
		local12.aBoolean341 = false;
		local12.aBoolean342 = true;
	}
}
