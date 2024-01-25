import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static362 {

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_75 = new Class179(66, 15);

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "J")
	public static long aLong185 = 0L;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "[Lclient!ir;")
	public static final Class1_Sub2_Sub9[] aClass1_Sub2_Sub9Array3 = new Class1_Sub2_Sub9[14];

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)Z")
	public static boolean method4968(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static199.method3241(arg0, arg1) | (arg0 & 0x60000) != 0 || Static408.method5470(arg0, arg1) || Static60.method1283(arg0, arg1);
	}
}
