import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "Lclient!xa;")
	public static Class119 aClass119_30;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "Lclient!kea;")
	public static Class161 aClass161_110;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "Lclient!pc;")
	public static Class227 aClass227_2;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "[I")
	public static final int[] anIntArray743 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString82 = "";

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIII)V")
	public static void method7179(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static81.anInt1788 = arg0;
		Static190.anInt4314 = 0;
		Static145.anInt2941 = arg1;
		Static269.anInt5577 = 0;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)Lclient!tca;")
	public static Class127 method7180() {
		try {
			return (Class127) Class.forName("Class127_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
