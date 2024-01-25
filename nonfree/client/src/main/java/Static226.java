import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "Lclient!fd;")
	public static Class102 aClass102_1;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
	public static int anInt4603;

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "Z")
	public static boolean aBoolean360 = false;

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
	public static final int anInt4601 = 1401;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)I")
	public static int method4158(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static96.aByteArrayArrayArray10[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static96.aByteArrayArrayArray10[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)Lclient!uf;")
	public static Class357 method4160(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class357 local7 = Static647.method9532(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass357Array2 == null || local7.aClass357Array2.length <= arg0) {
			return null;
		} else {
			return local7.aClass357Array2[arg0];
		}
	}
}
