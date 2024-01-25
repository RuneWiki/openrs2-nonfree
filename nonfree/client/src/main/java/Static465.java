import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
	public static int anInt8090;

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
	public static int anInt8091;

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "Z")
	public static boolean aBoolean558;

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "Lclient!la;")
	public static Class63 aClass63_10;

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
	public static int anInt8092;

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "Lclient!vg;")
	public static final Class342 aClass342_160 = new Class342(4);

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
	public static int anInt8094 = 0;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)V")
	public static void method6367(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub7_Sub19 local14 = Static73.method5992(5, arg0);
		local14.method7364();
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "()V")
	public static void method6368() {
		for (@Pc(1) int local1 = 0; local1 < Static283.anInt5319; local1++) {
			@Pc(6) Class25_Sub2_Sub2 local6 = Static34.aClass25_Sub2_Sub2Array2[local1];
			Static320.method4730(local6, true);
			Static34.aClass25_Sub2_Sub2Array2[local1] = null;
		}
		Static283.anInt5319 = 0;
	}
}
