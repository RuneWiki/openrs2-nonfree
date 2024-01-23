import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!ab;")
	public static Class3 aClass3_21 = new Class3();

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString328 = "Connecting to update server";

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "[I")
	public static int[] anIntArray356 = new int[32];

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "Lclient!cj;")
	public static Class19 aClass19_1 = Static139.method4199();

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "Z")
	public static boolean aBoolean227 = false;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!hc;Lclient!hc;Z)V")
	public static void method3508(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class51 arg1) {
		Static244.aClass1_Sub2_Sub7_3 = Static139.method4197(arg1, arg0, Static262.anInt5502);
		Static22.aClass1_Sub2_Sub7_Sub1_3 = (Class1_Sub2_Sub7_Sub1) Static244.aClass1_Sub2_Sub7_3;
		Static63.aClass1_Sub2_Sub7_1 = Static139.method4197(arg1, arg0, Static231.anInt5058);
		Static120.aClass1_Sub2_Sub7_2 = Static139.method4197(arg1, arg0, Static74.anInt2005);
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lclient!hc;Lclient!hc;Z)V")
	public static void method3509(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class51 arg1) {
		Static178.aClass51_59 = arg1;
		Static144.aClass51_47 = arg0;
		Static115.anInt3016 = Static178.aClass51_59.method1875(3);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3510(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static156.method2772(arg0)) {
			Static23.method429(arg1, arg5, -1, arg7, arg6, arg3, arg4, arg2, Static80.aClass122ArrayArray1[arg0]);
		} else if (arg2 == -1) {
			for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
				Static198.aBooleanArray19[local20] = true;
			}
		} else {
			Static198.aBooleanArray19[arg2] = true;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public static void method3511() {
		Static57.aClass79_6.method2489();
		Static170.aClass79_26.method2489();
	}
}
