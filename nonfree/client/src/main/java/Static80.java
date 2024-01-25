import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!dr", name = "v", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray13;

	@OriginalMember(owner = "client!dr", name = "x", descriptor = "I")
	public static int anInt1679;

	@OriginalMember(owner = "client!dr", name = "y", descriptor = "I")
	public static int anInt1680;

	@OriginalMember(owner = "client!dr", name = "m", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_32 = new Class27(9, -1);

	@OriginalMember(owner = "client!dr", name = "s", descriptor = "I")
	public static final int anInt1677 = 0;

	@OriginalMember(owner = "client!dr", name = "t", descriptor = "I")
	public static int anInt1678 = 0;

	@OriginalMember(owner = "client!dr", name = "u", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_33 = new Class27(56, 2);

	@OriginalMember(owner = "client!dr", name = "w", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_34 = new Class27(49, 7);

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BII)V")
	public static void method1515(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class10_Sub1_Sub17 local14 = Static154.method2630(7, arg1);
		local14.method5345();
		local14.anInt6806 = arg0;
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(II)V")
	public static void method1521(@OriginalArg(0) int arg0) {
		Static55.anInt999 = arg0;
		Static370.anInt6392 = -1;
		Static370.anInt6392 = -1;
		Static14.method198();
	}
}
