import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!j", name = "x", descriptor = "[Lclient!ke;")
	public static Class1_Sub2_Sub4[] aClass1_Sub2_Sub4Array9;

	@OriginalMember(owner = "client!j", name = "O", descriptor = "I")
	public static int anInt2860;

	@OriginalMember(owner = "client!j", name = "s", descriptor = "I")
	public static int anInt2847 = 255;

	@OriginalMember(owner = "client!j", name = "y", descriptor = "Lclient!ab;")
	public static Class3 aClass3_12 = new Class3();

	@OriginalMember(owner = "client!j", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString182 = "flash3:";

	@OriginalMember(owner = "client!j", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString183 = null;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)Lclient!se;")
	public static Class122 method2192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class122 local9 = Static206.method3444(arg1);
		if (arg0 == -1) {
			return local9;
		} else if (local9 == null || local9.aClass122Array2 == null || local9.aClass122Array2.length <= arg0) {
			return null;
		} else {
			return local9.aClass122Array2[arg0];
		}
	}
}
