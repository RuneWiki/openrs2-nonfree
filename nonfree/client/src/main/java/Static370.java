import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!ou;B)V")
	public static void method5157(@OriginalArg(0) Class30_Sub1_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt1305 - Static187.anInt3975;
		@Pc(20) int local20 = arg0.anInt1285 * 128 + arg0.method944() * 64;
		@Pc(32) int local32 = arg0.anInt1312 * 128 + arg0.method944() * 64;
		arg0.anInt7490 += (local20 - arg0.anInt7490) / local9;
		arg0.anInt1316 = 0;
		arg0.anInt7488 += (local32 - arg0.anInt7488) / local9;
		if (arg0.anInt1291 == 0) {
			arg0.method941(8192);
		}
		if (arg0.anInt1291 == 1) {
			arg0.method941(12288);
		}
		if (arg0.anInt1291 == 2) {
			arg0.method941(0);
		}
		if (arg0.anInt1291 == 3) {
			arg0.method941(4096);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIII)V")
	public static void method5158(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static105.anInt2417 <= arg3 && arg3 <= Static70.anInt1843) {
			@Pc(23) int local23 = Static337.method4744(arg0, Static164.anInt6595, Static362.anInt6654);
			@Pc(29) int local29 = Static337.method4744(arg1, Static164.anInt6595, Static362.anInt6654);
			Static204.method3270(local29, arg3, arg2, local23);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZ)Z")
	public static boolean method5159(@OriginalArg(0) int arg0) {
		if (arg0 == 12 || arg0 == 21 || arg0 == 3 || arg0 == 57 || arg0 == 59) {
			return true;
		} else {
			return arg0 == 5 || arg0 == 1010;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)I")
	public static int method5160(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
