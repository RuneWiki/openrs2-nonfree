import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "Lclient!kea;")
	public static Class161 aClass161_113;

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
	public static int anInt8761 = 0;

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "[Lclient!eca;")
	public static final Class6_Sub1_Sub2_Sub1[] aClass6_Sub1_Sub2_Sub1Array1 = new Class6_Sub1_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "[F")
	public static final float[] aFloatArray72 = new float[16];

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)I")
	public static int method7192() {
		@Pc(5) Class125 local5 = Static145.aClass125_24;
		synchronized (Static145.aClass125_24) {
			return Static145.aClass125_24.method3517();
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)V")
	public static void method7193(@OriginalArg(1) int arg0) {
		if (Static24.anIntArray128 == null || arg0 > Static24.anIntArray128.length) {
			Static24.anIntArray128 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIILclient!oa;IIIIII[[[B)V")
	public static void method7194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class5 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][][] arg11) {
		if (arg3 == 0 || arg8 == 0) {
			return;
		}
		if (arg3 == 9) {
			arg5 = arg5 + 1 & 0x3;
			arg3 = 1;
		}
		if (arg3 == 10) {
			arg5 = arg5 + 3 & 0x3;
			arg3 = 1;
		}
		if (arg3 == 11) {
			arg5 = arg5 + 3 & 0x3;
			arg3 = 8;
		}
		arg4.ma(arg9, arg1, arg10, arg0, arg7, arg6, arg11[arg3 - 1][arg5], arg8, arg2);
	}
}
