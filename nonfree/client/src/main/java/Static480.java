import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "Lclient!cm;")
	public static Class57 aClass57_11;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
	public static int anInt9428 = 0;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
	public static void method7889() {
		Static205.anInt4369 = 0;
		Static207.aClass211_29.method5179();
		Static218.aBoolean366 = false;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
	public static void method7890(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(39) String local39 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local39);
		Static27.method980(false, true, local39);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg2 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(31) int local31 = (Static366.aShort68 - Static294.aShort49) * local7 / 100 + Static294.aShort49;
		@Pc(37) int local37 = arg4 * local31 >> 8;
		@Pc(44) int local44 = 16384 - arg6 & 0x3FFF;
		@Pc(51) int local51 = 16384 - arg5 & 0x3FFF;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		@Pc(69) int local69 = local37;
		if (local44 != 0) {
			local67 = Class179.anIntArray756[local44] * -local37 >> 14;
			local69 = Class179.anIntArray757[local44] * local37 >> 14;
		}
		if (local51 != 0) {
			local65 = Class179.anIntArray756[local51] * local69 >> 14;
			local69 = Class179.anIntArray757[local51] * local69 >> 14;
		}
		Static348.anInt6726 = arg6;
		Static86.anInt2132 = arg3 - local65;
		Static268.anInt9015 = 0;
		Static5.anInt142 = arg1 - local67;
		Static390.anInt7318 = arg0 - local69;
		Static393.anInt7341 = arg5;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILclient!oa;)V")
	public static void method7895(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class9 arg2) {
		Static192.aClass348ArrayArray1 = new Class348[arg1][arg0];
		Static101.aClass9_4 = arg2;
		if (Static319.anIntArray441 != null) {
			Static408.aClass65_95 = Static173.method3493(Static319.anIntArray441[2], Static319.anIntArray441[3], Static319.anIntArray441[4], Static319.anIntArray441[0], Static319.anIntArray441[5], Static319.anIntArray441[1]);
		}
		Static393.aClass348_2 = new Class348();
		Static321.method5186();
	}
}
