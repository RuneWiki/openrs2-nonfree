import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!n", name = "c", descriptor = "Lclient!wb;")
	public static Class3_Sub51_Sub1 aClass3_Sub51_Sub1_5;

	@OriginalMember(owner = "client!n", name = "w", descriptor = "Lclient!hga;")
	public static Class123 aClass123_128;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "I")
	public static int anInt3837 = -1;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIII)V")
	public static void method3098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class333 local7 = Static189.aClass333ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class25_Sub2_Sub1 local13 = local7.aClass25_Sub2_Sub1_2;
		@Pc(16) Class25_Sub2_Sub1 local16 = local7.aClass25_Sub2_Sub1_1;
		if (local13 != null) {
			local13.aShort79 = (short) (local13.aShort79 * arg3 / (0x10 << Static385.anInt6657 - 7));
			local13.aShort78 = (short) (local13.aShort78 * arg3 / (0x10 << Static385.anInt6657 - 7));
		}
		if (local16 != null) {
			local16.aShort79 = (short) (local16.aShort79 * arg3 / (0x10 << Static385.anInt6657 - 7));
			local16.aShort78 = (short) (local16.aShort78 * arg3 / (0x10 << Static385.anInt6657 - 7));
		}
	}
}
