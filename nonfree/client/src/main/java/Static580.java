import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray3;

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
	public static int anInt9189 = 0;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!gj;ZLclient!gj;)V")
	public static void method7794(@OriginalArg(1) Class143 arg0, @OriginalArg(3) Class143 arg1) {
		Static416.aClass143_102 = arg1;
		Static30.aClass143_7 = arg0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIILclient!jia;Lclient!ha;)V")
	public static void method7797(@OriginalArg(3) Class193 arg0, @OriginalArg(4) Class16 arg1) {
		Static553.aClass193_57.method4458();
		if (Static290.aBoolean413) {
			return;
		}
		for (@Pc(16) Class3_Sub8 local16 = (Class3_Sub8) arg0.method4457(); local16 != null; local16 = (Class3_Sub8) arg0.method4459()) {
			@Pc(24) Class145 local24 = Static574.aClass321_3.method7485(local16.anInt1242);
			if (Static95.method1899(local24)) {
				@Pc(36) boolean local36 = Static656.method1365(arg1, local24, local16);
				if (local36) {
					Static345.method5207(local16, local24, arg1);
				}
			}
		}
	}
}
