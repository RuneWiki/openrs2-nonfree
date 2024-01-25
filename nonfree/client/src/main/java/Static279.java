import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!le", name = "q", descriptor = "[Lclient!ha;")
	public static Class25[] aClass25Array11;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_131 = new Class150(73, 8);

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(III)Z")
	public static boolean method4553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static429.aByteArrayArrayArray17[1][arg1][arg0] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZIILclient!bj;BII)V")
	public static void method4554(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class31 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static469.anInt8085 >= 50 || (arg3 == null || arg3.anIntArrayArray4 == null || arg2 >= arg3.anIntArrayArray4.length || arg3.anIntArrayArray4[arg2] == null)) {
			return;
		}
		@Pc(36) int local36 = arg3.anIntArrayArray4[arg2][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(50) int local50 = local36 & 0x1F;
		@Pc(69) int local69;
		if (arg3.anIntArrayArray4[arg2].length > 1) {
			local69 = (int) (Math.random() * (double) arg3.anIntArrayArray4[arg2].length);
			if (local69 > 0) {
				local40 = arg3.anIntArrayArray4[arg2][local69];
			}
		}
		if (local50 == 0) {
			if (arg0) {
				Static532.method7260(local40, 255, local46, 0);
			}
		} else if (Static300.aClass5_Sub28_Sub1_1.anInt4870 != 0) {
			local69 = arg4 - 64 >> 7;
			@Pc(113) int local113 = arg1 - 64 >> 7;
			Static310.aClass217Array1[Static469.anInt8085++] = new Class217((byte) 1, local40, local46, 0, 255, local50 + (local113 << 8) + (local69 << 16) + (arg5 << 24));
		}
	}
}
