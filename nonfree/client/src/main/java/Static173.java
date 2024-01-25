import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!gba", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray18 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!gba", name = "u", descriptor = "[I")
	public static final int[] anIntArray208 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)V")
	public static void method2878() {
		@Pc(7) Class4 local7 = null;
		try {
			local7 = Static501.method7272("2");
			@Pc(20) Class3_Sub9 local20 = new Class3_Sub9(Static419.anInt7367 * 6 + 3);
			local20.method5572(1);
			local20.method5620(Static419.anInt7367);
			for (@Pc(30) int local30 = 0; local30 < Static584.anIntArray595.length; local30++) {
				if (Static586.aBooleanArray29[local30]) {
					local20.method5620(local30);
					local20.method5601(Static584.anIntArray595[local30]);
				}
			}
			local7.method86(local20.aByteArray51, 0, local20.anInt6453);
		} catch (@Pc(61) Exception local61) {
		}
		try {
			if (local7 != null) {
				local7.method84();
			}
		} catch (@Pc(73) Exception local73) {
		}
		Static648.aLong276 = Static191.method3071();
		Static644.aBoolean777 = false;
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(IIIII)V")
	public static void method2879(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class3_Sub7_Sub5 local8 = Static138.method2377(8, arg2);
		local8.method1474();
		local8.anInt1728 = arg0;
		local8.anInt1720 = arg3;
		local8.anInt1723 = arg1;
	}
}
