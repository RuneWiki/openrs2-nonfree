import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
	public static int anInt3552;

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "Lclient!cg;")
	public static Class22 aClass22_63;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "[I")
	public static int[] anIntArray298 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
	public static int anInt3548 = 0;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "Lclient!ul;")
	public static Class172 aClass172_32 = new Class172(64);

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
	public static int anInt3550 = 1;

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "Lclient!no;")
	public static Class4_Sub24_Sub1 aClass4_Sub24_Sub1_1 = new Class4_Sub24_Sub1(5000);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIII)V")
	public static void method2885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class4_Sub2_Sub15 local8 = Static131.method1210(arg0, 4);
		local8.method2876();
		local8.anInt3536 = arg2;
		local8.anInt3539 = arg3;
		local8.anInt3526 = arg1;
	}
}
