import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!td", name = "c", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_249 = new Class363(89, -1);

	@OriginalMember(owner = "client!td", name = "i", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_150 = new Class286(42, 2);

	@OriginalMember(owner = "client!td", name = "l", descriptor = "I")
	public static int anInt8425 = -2;

	@OriginalMember(owner = "client!td", name = "n", descriptor = "[J")
	public static final long[] aLongArray13 = new long[32];

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IBJI)V")
	public static void method7005(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = (int) arg1 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg1 >> 20 & 0x3;
		@Pc(24) int local24 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static295.method7121(local17, local10, 0, 0, true, arg0, arg2, 0);
			return;
		}
		@Pc(44) Class32 local44 = Static541.aClass97_4.method1794(local24);
		@Pc(58) int local58;
		@Pc(55) int local55;
		if (local17 == 0 || local17 == 2) {
			local58 = local44.anInt788;
			local55 = local44.anInt793;
		} else {
			local55 = local44.anInt788;
			local58 = local44.anInt793;
		}
		@Pc(69) int local69 = local44.anInt805;
		if (local17 != 0) {
			local69 = (local69 << local17 & 0xF) + (local69 >> 4 - local17);
		}
		Static295.method7121(0, 0, local55, local69, true, arg0, arg2, local58);
	}
}
