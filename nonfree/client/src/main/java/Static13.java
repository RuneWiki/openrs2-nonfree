import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "Lclient!jf;")
	public static Class2_Sub14 aClass2_Sub14_1;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "[Lclient!p;")
	public static Class75[] aClass75Array1;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "[I")
	public static final int[] anIntArray22 = new int[] { 2, 2, 4, 0, 1, 8, 0 };

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
	public static int anInt386 = 0;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_76 = Static181.method2795("::fpsoff");

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "[Lclient!qe;")
	public static final Class83[] aClass83Array6 = new Class83[100];

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!qe;Lclient!qe;ILclient!eh;)[Lclient!nb;")
	public static Class2_Sub2_Sub17[] method303(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(3) Class28 arg2) {
		@Pc(15) int local15 = arg2.method870(arg1);
		@Pc(21) int local21 = arg2.method875(local15, arg0);
		return Static90.method1584(arg2, local21, local15);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!eh;III)[Lclient!gg;")
	public static Class29_Sub1[] method304(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static66.method1261(arg2, arg1, arg0) ? Static93.method1607() : null;
	}
}
