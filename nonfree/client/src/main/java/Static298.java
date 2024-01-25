import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "F")
	public static float aFloat123;

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
	public static int anInt5670;

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
	public static int anInt5669 = 0;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)I")
	public static int method4852() {
		if (Static345.aFrame2 == null) {
			return Static155.aBoolean541 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)Lclient!kv;")
	public static Class11_Sub4 method4853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class224 local7 = Static256.aClass224ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub4_3;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!kfa;I)V")
	public static void method4854(@OriginalArg(0) Class181 arg0) {
		Static547.aClass6_Sub26_Sub2_2.method5010(arg0.method4574());
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIII)V")
	public static void method4855(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 - arg0 >= Static376.anInt7071 && arg1 + arg0 <= Class179_Sub2.lb && Static96.anInt2302 <= arg2 - arg0 && arg2 + arg0 <= Static289.anInt5545) {
			Static530.method7715(arg3, arg1, arg2, arg0);
		} else {
			Static99.method2129(arg0, arg3, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(III)I")
	public static int method4856(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static278.anIntArray402[arg1 & 0x3] : Static321.anIntArray442[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)Z")
	public static boolean method4857(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
