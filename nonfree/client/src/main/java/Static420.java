import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static420 {

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "[I")
	public static int[] anIntArray494;

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "[I")
	public static final int[] anIntArray493 = new int[14];

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_92 = new Class44(53, 3);

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_186 = new Class81(22, 3);

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "[Lclient!dr;")
	public static final Class2_Sub2_Sub7[] aClass2_Sub2_Sub7Array4 = new Class2_Sub2_Sub7[14];

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_187 = new Class81(77, 12);

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_156 = new Class256("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_188 = new Class81(52, -1);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!qa;IIII[[[BIIIIIII)V")
	public static void method5705(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[][][] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg10 == 0 || arg1 == 0) {
			return;
		}
		if (arg10 == 9) {
			arg3 = arg3 + 1 & 0x3;
			arg10 = 1;
		}
		if (arg10 == 10) {
			arg10 = 1;
			arg3 = arg3 + 3 & 0x3;
		}
		if (arg10 == 11) {
			arg3 = arg3 + 3 & 0x3;
			arg10 = 8;
		}
		arg0.aa(arg9, arg7, arg6, arg8, arg2, arg11, arg4[arg10 - 1][arg3], arg1, arg5);
	}
}
