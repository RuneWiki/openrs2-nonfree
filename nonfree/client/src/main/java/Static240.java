import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "Lclient!ph;")
	public static Class138 aClass138_19;

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "Lclient!th;")
	public static Class169 aClass169_51 = new Class169(64);

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "[I")
	public static int[] anIntArray107 = new int[128];

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
	public static int anInt1319 = 0;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIII)V")
	public static void method1122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub1_Sub2 local8 = Static46.method824(8, arg1);
		local8.method294();
		local8.anInt293 = arg3;
		local8.anInt296 = arg0;
		local8.anInt294 = arg2;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)I")
	public static int method1123(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}
}
