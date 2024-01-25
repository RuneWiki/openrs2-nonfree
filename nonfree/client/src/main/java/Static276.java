import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
	public static void method4413(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub3_Sub7 local8 = Static363.method5457(arg0, 7);
		local8.method845();
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)Z")
	public static boolean method4414(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)V")
	public static void method4415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class3_Sub34 local16 = Static374.method5522(Class9_Sub1_Sub2_Sub1.lb, Static220.aClass287_2);
		local16.aClass3_Sub11_Sub1_2.method3100(arg0);
		local16.aClass3_Sub11_Sub1_2.method3132(arg1);
		Static131.method2572(local16);
	}
}
