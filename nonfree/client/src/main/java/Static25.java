import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!at", name = "j", descriptor = "Lclient!vv;")
	public static final Class363 aClass363_1 = new Class363();

	@OriginalMember(owner = "client!at", name = "Ab", descriptor = "Lclient!wga;")
	public static final Class371 aClass371_1 = new Class371();

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(III)Z")
	public static boolean method426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static398.method6370(arg0, arg1) & Static7.method101(arg1, arg0);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIBLclient!jo;)V")
	public static void method428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub1_Sub10 arg2) {
		if (!Static433.aBoolean672) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(22) int local22;
		for (@Pc(16) Class3_Sub1_Sub4 local16 = (Class3_Sub1_Sub4) arg2.aClass30_7.method780(); local16 != null; local16 = (Class3_Sub1_Sub4) arg2.aClass30_7.method783()) {
			local22 = Static390.method6146(local16);
			if (local10 < local22) {
				local10 = local22;
			}
		}
		local10 += 8;
		local22 = arg2.anInt5812 * 16 + 21;
		Static609.anInt10063 = (Static599.aBoolean832 ? 26 : 22) + arg2.anInt5812 * 16;
		@Pc(58) int local58 = Static582.anInt9731 + Static326.anInt6543;
		if (Static114.anInt2970 < local10 + local58) {
			local58 = Static326.anInt6543 - local10;
		}
		if (local58 < 0) {
			local58 = 0;
		}
		@Pc(82) int local82 = Static599.aBoolean832 ? 33 : 31;
		@Pc(88) int local88 = arg1 + 13 - local82;
		if (local22 + local88 > Static256.anInt5669) {
			local88 = Static256.anInt5669 - local22;
		}
		if (local88 < 0) {
			local88 = 0;
		}
		Static285.anInt5876 = local58;
		Static198.aClass3_Sub1_Sub10_1 = arg2;
		Static468.anInt8459 = local10;
		Static280.anInt5854 = local88;
	}
}
