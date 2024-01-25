import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!il", name = "b", descriptor = "I")
	public static int anInt4543;

	@OriginalMember(owner = "client!il", name = "f", descriptor = "I")
	public static int anInt4546;

	@OriginalMember(owner = "client!il", name = "g", descriptor = "Ljava/lang/Object;")
	public static Object anObject10;

	@OriginalMember(owner = "client!il", name = "d", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_62 = new Class200(16, 6);

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BILclient!aj;I)V")
	public static void method4001(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (!Static447.aBoolean555) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(22) int local22;
		for (@Pc(16) Class3_Sub4_Sub13 local16 = (Class3_Sub4_Sub13) arg1.aClass15_1.method897(); local16 != null; local16 = (Class3_Sub4_Sub13) arg1.aClass15_1.method898()) {
			local22 = Static114.method2324(local16);
			if (local22 > local10) {
				local10 = local22;
			}
		}
		local10 += 8;
		Static261.anInt4795 = arg1.anInt805 * 16 + (Static519.aBoolean557 ? 26 : 22);
		local22 = arg1.anInt805 * 16 + 21;
		@Pc(62) int local62 = Static452.anInt3209 + Static276.anInt4979;
		if (local62 + local10 > Static109.anInt2357) {
			local62 = Static276.anInt4979 - local10;
		}
		if (local62 < 0) {
			local62 = 0;
		}
		@Pc(90) int local90 = Static519.aBoolean557 ? 33 : 31;
		@Pc(96) int local96 = arg0 + 13 - local90;
		if (local22 + local96 > Static330.anInt6165) {
			local96 = Static330.anInt6165 - local22;
		}
		Static107.anInt2316 = local62;
		if (local96 < 0) {
			local96 = 0;
		}
		Static312.anInt5897 = local96;
		Static528.aClass3_Sub4_Sub1_1 = arg1;
		Static416.anInt7575 = local10;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/String;IC)I")
	public static int method4003(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg0.charAt(local12) == arg1) {
				local7++;
			}
		}
		return local7;
	}
}
