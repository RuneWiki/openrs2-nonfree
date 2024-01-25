import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static178 {

	@OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
	public static int anInt3756;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
	public static int anInt3745 = 0;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "Lclient!jn;")
	public static final Class118 aClass118_1 = new Class118();

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "[Lclient!cd;")
	public static final Class10_Sub1_Sub2_Sub1[] aClass10_Sub1_Sub2_Sub1Array1 = new Class10_Sub1_Sub2_Sub1[32768];

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString139 = "Loaded sprites";

	@OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
	public static int anInt3758 = -1;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIII)V")
	public static void method3170(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static319.anInt3288 == 1) {
			Static304.aClass8Array13[Static166.anInt3452 / 100].method4393(Static328.anInt486 - 8, Static33.anInt646 + -8);
		}
		if (Static319.anInt3288 == 2) {
			Static304.aClass8Array13[Static166.anInt3452 / 100 + 4].method4393(Static328.anInt486 - 8, Static33.anInt646 + -8);
		}
		Static302.method5238();
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)Lclient!ur;")
	public static Class127_Sub1 method3171() {
		Static268.anInt5500 = 0;
		return Static329.method5544();
	}
}
