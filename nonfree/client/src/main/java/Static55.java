import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!ee", name = "ab", descriptor = "Lclient!ph;")
	public static Class138 aClass138_12;

	@OriginalMember(owner = "client!ee", name = "cb", descriptor = "I")
	public static int anInt1098;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(IB)V")
	public static void method966(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static183.method3031(arg0)) {
			return;
		}
		@Pc(20) Class146[] local20 = Static313.aClass146ArrayArray1[arg0];
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			@Pc(36) Class146 local36 = local20[local28];
			if (local36.anObjectArray8 != null) {
				@Pc(44) Class1_Sub29 local44 = new Class1_Sub29();
				local44.anObjectArray32 = local36.anObjectArray8;
				local44.aClass146_16 = local36;
				Static237.method2930(2000000, local44);
			}
		}
	}
}
