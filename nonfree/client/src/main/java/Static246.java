import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
	public static int anInt4853;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "Lclient!dd;")
	public static Class31 aClass31_5;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "[I")
	public static int[] anIntArray385;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "[I")
	public static int[] anIntArray386;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "Lclient!ul;")
	public static Class172 aClass172_40 = new Class172(4);

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
	public static int[] anIntArray384 = new int[50];

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBII)V")
	public static void method3789(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) Class4_Sub2_Sub15 local4 = Static131.method1210(arg0, 9);
		local4.method2876();
		local4.anInt3539 = arg1;
		local4.anInt3536 = arg2;
	}
}
