import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!oo", name = "D", descriptor = "[Lclient!hk;")
	public static Class98[] aClass98Array1;

	@OriginalMember(owner = "client!oo", name = "y", descriptor = "[I")
	public static final int[] anIntArray409 = new int[32];

	@OriginalMember(owner = "client!oo", name = "z", descriptor = "I")
	public static int anInt5353 = 0;

	@OriginalMember(owner = "client!oo", name = "E", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[8];

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method4286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(12) int local12 = arg1 - 334;
		if (local12 < 0) {
			local12 = 0;
		} else if (local12 > 100) {
			local12 = 100;
		}
		@Pc(34) int local34 = (Static139.aShort93 - Static404.aShort214) * local12 / 100 + Static404.aShort214;
		@Pc(40) int local40 = local34 * arg3 >> 8;
		@Pc(47) int local47 = 16384 - arg6 & 0x3FFF;
		@Pc(54) int local54 = 16384 - arg2 & 0x3FFF;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = local40;
		if (local47 != 0) {
			local58 = Applet_Sub1.anIntArray85[local47] * -local40 >> 15;
			local60 = Applet_Sub1.anIntArray87[local47] * local40 >> 15;
		}
		if (local54 != 0) {
			local56 = local60 * Applet_Sub1.anIntArray85[local54] >> 15;
			local60 = local60 * Applet_Sub1.anIntArray87[local54] >> 15;
		}
		Static430.anInt7326 = arg2;
		Static285.anInt5234 = 0;
		Static80.anInt1722 = arg0 - local60;
		Static398.anInt6901 = arg5 - local56;
		Static141.anInt3177 = arg6;
		Static422.anInt7281 = arg4 - local58;
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(II)V")
	public static void method4288(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub3_Sub7 local8 = Static139.method2522(4, arg0);
		local8.method1563();
	}
}
