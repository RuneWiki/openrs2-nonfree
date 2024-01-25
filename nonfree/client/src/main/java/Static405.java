import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "Lclient!ff;")
	public static Class81 aClass81_177;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_86 = new Class44(38, 4);

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
	public static int anInt7041 = 0;

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "[Z")
	public static final boolean[] aBooleanArray49 = new boolean[8];

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)I")
	public static int method5498() {
		if (Static140.aFrame12 == null) {
			return Static196.aBoolean467 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5499(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg0 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(32) int local32 = local7 * (Static297.aShort68 - Static266.aShort59) / 100 + Static266.aShort59;
		@Pc(38) int local38 = local32 * arg5 >> 8;
		@Pc(44) int local44 = 16384 - arg3 & 0x3FFF;
		@Pc(51) int local51 = 16384 - arg2 & 0x3FFF;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = local38;
		if (local44 != 0) {
			local55 = Class184.anIntArray349[local44] * -local38 >> 15;
			local57 = local38 * Class184.anIntArray350[local44] >> 15;
		}
		if (local51 != 0) {
			local53 = local57 * Class184.anIntArray349[local51] >> 15;
			local57 = Class184.anIntArray350[local51] * local57 >> 15;
		}
		Static110.anInt2281 = arg4 - local55;
		Static436.anInt7610 = 0;
		Static293.anInt5621 = arg1 - local57;
		Static258.anInt4308 = arg2;
		Static293.anInt5622 = arg3;
		Static225.anInt4310 = arg6 - local53;
	}
}
