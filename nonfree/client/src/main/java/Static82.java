import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!cga", name = "m", descriptor = "[B")
	public static byte[] aByteArray11;

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "Lclient!eu;")
	public static Class2_Sub21 aClass2_Sub21_1 = null;

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIII)V")
	public static void method1229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class311 local7 = Static632.aClass311ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(14) Class4_Sub2_Sub4 local14 = local7.aClass4_Sub2_Sub4_1;
		@Pc(17) Class4_Sub2_Sub4 local17 = local7.aClass4_Sub2_Sub4_2;
		if (local14 != null) {
			local14.aShort58 = (short) (local14.aShort58 * arg3 / (0x10 << Static260.anInt4053 - 7));
			local14.aShort59 = (short) (local14.aShort59 * arg3 / (0x10 << Static260.anInt4053 - 7));
		}
		if (local17 != null) {
			local17.aShort58 = (short) (local17.aShort58 * arg3 / (0x10 << Static260.anInt4053 - 7));
			local17.aShort59 = (short) (local17.aShort59 * arg3 / (0x10 << Static260.anInt4053 - 7));
		}
	}
}
