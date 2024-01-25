import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "[Lclient!gj;")
	public static Class31[] aClass31Array11;

	@OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
	public static int anInt3039;

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray26 = new String[8];

	@OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
	public static int anInt3040 = 0;

	@OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
	public static int anInt3042 = 0;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)V")
	public static void method2881(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub11_Sub19 local12 = Static306.method5411(15, 0);
		local12.method5537();
		local12.anInt6362 = arg0;
		local12.anInt6365 = arg1;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)Z")
	public static boolean method2882(@OriginalArg(0) int arg0) {
		return arg0 == 5 || arg0 == 17 || arg0 == 1006 || arg0 == 23 || arg0 == 48;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZIIZ)V")
	public static void method2883(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static129.anInt2728 == 0) {
			Static12.method424(false);
		} else {
			Static95.anInt6379 = Static129.anInt2728;
			Static291.method5166(0);
		}
		Static166.aBoolean298 = arg3;
		Static335.anInt6702 = arg1;
		Static249.anInt4907 = arg2;
		Static127.method1624(arg0);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII)V")
	public static void method2884(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg0) {
			Static205.method3670(arg1, arg0, Static146.anIntArrayArray91[arg3], arg2);
		} else {
			Static205.method3670(arg1, arg2, Static146.anIntArrayArray91[arg3], arg0);
		}
	}
}
