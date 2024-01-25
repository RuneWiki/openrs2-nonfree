import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBI[B)I")
	public static int method108(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(18) int local18 = -1;
		for (@Pc(20) int local20 = arg0; local20 < arg1; local20++) {
			local18 = local18 >>> 8 ^ Class12.anIntArray601[(arg2[local20] ^ local18) & 0xFF];
		}
		return ~local18;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public static void method109() {
		@Pc(10) int local10 = Static713.aClass3_Sub55_31.aClass15_Sub7_2.method2473();
		if (local10 == 0) {
			Static221.aByteArrayArrayArray15 = null;
			Static4.method43(0);
		} else if (local10 == 1) {
			Static219.method3496((byte) 0);
			Static4.method43(512);
			if (Static6.aByteArrayArrayArray1 != null) {
				Static174.method8804();
			}
		} else {
			Static219.method3496((byte) (Static220.anInt4252 - 4 & 0xFF));
			Static4.method43(2);
		}
		Static447.anInt7864 = Static712.anInt11117;
	}
}
