import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!lr", name = "w", descriptor = "Lclient!fl;")
	public static Class5_Sub16_Sub1 aClass5_Sub16_Sub1_3;

	@OriginalMember(owner = "client!lr", name = "x", descriptor = "Z")
	public static boolean aBoolean287;

	@OriginalMember(owner = "client!lr", name = "z", descriptor = "Lclient!vg;")
	public static Class201 aClass201_7;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIB)V")
	public static void method3358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class5_Sub1_Sub2 local12 = Static166.method3027(arg0, 13);
		local12.method850();
		local12.anInt996 = arg1;
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
	public static void method3360() {
		@Pc(1) Class109 local1 = Static60.aClass109_23;
		synchronized (Static60.aClass109_23) {
			Static60.aClass109_23.method2858();
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IZII)V")
	public static void method3368(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			Static125.aClass5_Sub12_Sub2_3.method5125(162);
		}
		if (arg1 == 1) {
			Static125.aClass5_Sub12_Sub2_3.method5125(250);
		}
		Static125.aClass5_Sub12_Sub2_3.method5089(Static174.aClass2_1.method1425(82) ? 1 : 0);
		Static125.aClass5_Sub12_Sub2_3.method5095(arg2 + Static172.anInt4394);
		Static125.aClass5_Sub12_Sub2_3.method5088(arg0 + Static12.anInt3797);
		Static48.aBoolean65 = false;
		Static224.anInt4437 = arg2;
		Static159.anInt3128 = arg0;
		Static141.method2510();
	}
}
