import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!iea", name = "l", descriptor = "I")
	public static int anInt3949;

	@OriginalMember(owner = "client!iea", name = "r", descriptor = "[[I")
	public static int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!iea", name = "u", descriptor = "I")
	public static int anInt3955;

	@OriginalMember(owner = "client!iea", name = "m", descriptor = "I")
	public static int anInt3950 = 0;

	@OriginalMember(owner = "client!iea", name = "p", descriptor = "[I")
	public static final int[] anIntArray241 = new int[32];

	@OriginalMember(owner = "client!iea", name = "q", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_143 = new Class196(16, 2);

	@OriginalMember(owner = "client!iea", name = "x", descriptor = "I")
	public static int anInt3958 = 1;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IZII)I")
	public static int method3490(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return (arg2 >> 5 << 7) + ((arg0 & 0xFF) >> 2 << 10) + (arg1 >> 1);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ILjava/lang/String;ZIILjava/lang/String;IJZZIIJ)V")
	public static void method3492(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) long arg11) {
		if (!Static423.aBoolean549 && Static223.anInt3566 < 500) {
			@Pc(16) int local16 = arg5 == -1 ? Static54.anInt8558 : arg5;
			@Pc(49) Class5_Sub2_Sub13 local49 = new Class5_Sub2_Sub13(arg4, arg1, local16, arg0, arg3, arg11, arg9, arg10, arg2, arg7, arg6, arg8);
			Static269.method3784(local49);
		}
	}
}
