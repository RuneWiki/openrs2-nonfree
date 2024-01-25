import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static669 {

	@OriginalMember(owner = "client!we", name = "D", descriptor = "F")
	public static float aFloat200;

	@OriginalMember(owner = "client!we", name = "E", descriptor = "I")
	public static int anInt10290;

	@OriginalMember(owner = "client!we", name = "K", descriptor = "[Lclient!uda;")
	public static final Class356[] aClass356Array1 = new Class356[4];

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IZIIII)V")
	public static void method8872(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(22) long local22 = (long) (arg4 | (arg1 ? Integer.MIN_VALUE : 0));
		@Pc(28) Class6_Sub3 local28 = (Class6_Sub3) Static410.aClass74_43.method1401(local22);
		if (local28 == null) {
			local28 = new Class6_Sub3();
			Static410.aClass74_43.method1399(local28, local22);
		}
		if (local28.anIntArray21.length <= arg3) {
			@Pc(53) int[] local53 = new int[arg3 + 1];
			@Pc(58) int[] local58 = new int[arg3 + 1];
			for (@Pc(60) int local60 = 0; local60 < local28.anIntArray21.length; local60++) {
				local53[local60] = local28.anIntArray21[local60];
				local58[local60] = local28.anIntArray20[local60];
			}
			for (@Pc(88) int local88 = local28.anIntArray21.length; local88 < arg3; local88++) {
				local53[local88] = -1;
				local58[local88] = 0;
			}
			local28.anIntArray20 = local58;
			local28.anIntArray21 = local53;
		}
		local28.anIntArray21[arg3] = arg0;
		local28.anIntArray20[arg3] = arg2;
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(II)I")
	public static int method8873(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(II)Z")
	public static boolean method8874(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IBI)Z")
	public static boolean method8875(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}
}
