import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
	public static int anInt1255;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)[B", line = 6)
	public static synchronized byte[] method1467(@OriginalArg(0) int arg0) {
		@Pc(19) byte[] local19;
		if (arg0 == 100 && Class43.anInt1452 > 0) {
			local19 = Class2_Sub3_Sub28.aByteArrayArray16[--Class43.anInt1452];
			Class2_Sub3_Sub28.aByteArrayArray16[Class43.anInt1452] = null;
			return local19;
		} else if (arg0 == 5000 && Class179.anInt4958 > 0) {
			local19 = Class149.aByteArrayArray8[--Class179.anInt4958];
			Class149.aByteArrayArray8[Class179.anInt4958] = null;
			return local19;
		} else if (arg0 == 30000 && Class2_Sub2_Sub10.anInt6178 > 0) {
			local19 = Class2_Sub12_Sub3.aByteArrayArray12[--Class2_Sub2_Sub10.anInt6178];
			Class2_Sub12_Sub3.aByteArrayArray12[Class2_Sub2_Sub10.anInt6178] = null;
			return local19;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIII)I", line = 65)
	public static int method1469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 1023 - arg1;
		} else if (local7 == 2) {
			return 1023 - arg0;
		} else {
			return arg1;
		}
	}
}
