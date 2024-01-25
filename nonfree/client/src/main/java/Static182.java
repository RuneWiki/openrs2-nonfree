import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static182 {

	@OriginalMember(owner = "client!gha", name = "b", descriptor = "I")
	public static int anInt3457;

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "I")
	public static int anInt3456 = 0;

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIILclient!kaa;B)V")
	public static void method2981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub27 arg3) {
		arg3.aClass3_Sub9_Sub2_2.method5601(arg0);
		arg3.aClass3_Sub9_Sub2_2.method5581(arg2);
		arg3.aClass3_Sub9_Sub2_2.method5595(arg1);
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIIII)V")
	public static void method2982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 - arg1 >= Static474.anInt8118 && Static576.anInt9425 >= arg0 + arg1 && arg2 - arg1 >= Static298.anInt5919 && arg2 + arg1 <= Static596.anInt9703) {
			Static206.method3227(arg0, arg1, arg2, arg3);
		} else {
			Static368.method5887(arg1, arg0, arg2, arg3);
		}
	}
}
