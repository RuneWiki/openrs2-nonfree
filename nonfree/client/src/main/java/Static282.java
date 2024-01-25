import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
	public static int anInt5488;

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray33;

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "[I")
	public static final int[] anIntArray421 = new int[14];

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)Lclient!mj;")
	public static Class135_Sub1 method5024() {
		Static86.anInt1918 = 0;
		return Static65.method5277();
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
	public static void method5025() {
		@Pc(12) Class21 local12 = Static362.aClass21_179;
		synchronized (Static362.aClass21_179) {
			Static362.aClass21_179.method851();
		}
		local12 = Static266.aClass21_141;
		synchronized (Static266.aClass21_141) {
			Static266.aClass21_141.method851();
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(III)V")
	public static void method5026(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub4_Sub17 local8 = Static132.method2717(0, 15);
		local8.method3480();
		local8.anInt3725 = arg0;
		local8.anInt3727 = arg1;
	}
}
