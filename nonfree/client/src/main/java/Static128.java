import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static128 {

	@OriginalMember(owner = "client!eu", name = "j", descriptor = "[Lclient!ir;")
	public static Class20_Sub2[] aClass20_Sub2Array1;

	@OriginalMember(owner = "client!eu", name = "g", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_54 = new Class319(19, 7);

	@OriginalMember(owner = "client!eu", name = "i", descriptor = "[I")
	public static final int[] anIntArray158 = new int[25];

	@OriginalMember(owner = "client!eu", name = "l", descriptor = "Lclient!tca;")
	public static final Class307 aClass307_5 = new Class307(2, 2);

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(III)Z")
	public static boolean method2206(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return ((arg0 & 0x2000) != 0 | Static77.method6754(arg1, arg0) | Static264.method4170(arg1, arg0)) & Static171.method2608(arg1, arg0);
	}
}
