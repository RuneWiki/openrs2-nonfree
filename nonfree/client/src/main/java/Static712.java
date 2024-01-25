import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static712 {

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
	public static int anInt11116;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
	public static int anInt11117;

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "[[[Lclient!nt;")
	public static Class262[][][] aClass262ArrayArrayArray3;

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "Z")
	public static boolean aBoolean803 = true;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZIII)V")
	public static void method9280(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static699.aClass136_50.method3503((long) arg2) != null) {
			return;
		}
		if (Static356.aBoolean482) {
			@Pc(31) Class3_Sub24 local31 = new Class3_Sub24(arg2, new Class78_Sub1(4096, Static564.aClass221_143, arg2), arg1, arg0);
			local31.aClass78_Sub1_1.method2100(Static318.aStringArray19[Static141.anInt2658]);
			Static699.aClass136_50.method3508((long) arg2, local31);
		} else {
			Static656.method8785(arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!br;I)I")
	public static int method9282(@OriginalArg(0) Class37 arg0) {
		if (arg0 == Static573.aClass37_3) {
			return 7681;
		} else if (arg0 == Static496.aClass37_2) {
			return 8448;
		} else if (arg0 == Static477.aClass37_1) {
			return 34165;
		} else if (Static722.aClass37_5 == arg0) {
			return 260;
		} else if (arg0 == Static614.aClass37_4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)V")
	public static void method9283(@OriginalArg(0) int arg0) {
		if (Static178.anInt3225 == 7 && (Static319.anInt10907 == 0 && Static556.anInt9262 == 0)) {
			Static707.anInt11053 = arg0;
			Static638.method8657(9);
		}
	}
}
