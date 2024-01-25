import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)[Lclient!hs;")
	public static Class138[] method5667() {
		return new Class138[] { Static336.aClass138_3, Static520.aClass138_6, Static641.aClass138_10, Static346.aClass138_4, Static124.aClass138_2, Static81.aClass138_1, Static619.aClass138_8, Static540.aClass138_7, Static490.aClass138_5, Static619.aClass138_9 };
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static String method5671(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(9) int local9 = arg2.indexOf(arg0); local9 != -1; local9 = arg2.indexOf(arg0, local9 + arg1.length())) {
			arg2 = arg2.substring(0, local9) + arg1 + arg2.substring(local9 + arg0.length());
		}
		return arg2;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILclient!efa;I)V")
	public static void method5673(@OriginalArg(1) int arg0, @OriginalArg(2) Class15_Sub1_Sub2_Sub2_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static649.method5534(local6, 0, local6.length, arg2);
		Static639.method8612(arg0, arg1, local6);
	}
}
