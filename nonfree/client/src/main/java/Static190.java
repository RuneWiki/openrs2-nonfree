import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
	public static int anInt4139;

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
	public static int anInt4134 = -1;

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1935 = Static187.method3089("::");

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1936 = Static187.method3089("Loaded input handler");

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1937 = aClass92_1936;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIB)V")
	public static void method3113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static96.anInt2010 == 1) {
			Static40.aClass1_Sub3_Sub1_Sub1Array20[Static108.anInt2346 / 100].method358(Static127.anInt2648 - 8, Static50.anInt3129 + -8);
		}
		if (Static96.anInt2010 == 2) {
			Static40.aClass1_Sub3_Sub1_Sub1Array20[Static108.anInt2346 / 100 + 4].method358(Static127.anInt2648 - 8, Static50.anInt3129 + -8);
		}
		Static91.method1353();
		if (!Static184.aBoolean225) {
			return;
		}
		@Pc(52) int local52 = arg0 + 20;
		@Pc(58) int local58 = arg2 + 512 - 5;
		Static82.aClass1_Sub3_Sub1_Sub3_Sub1_2.method2444(Static208.method787(new Class92[] { Static163.aClass92_1726, Static49.method872(Static43.anInt1136) }), local58, local52, 16776960, -1);
		@Pc(82) int local82 = 16776960;
		@Pc(84) Runtime local84 = Runtime.getRuntime();
		@Pc(93) int local93 = (int) ((local84.totalMemory() - local84.freeMemory()) / 1024L);
		@Pc(94) int local94 = local52 + 15;
		if (local93 > 32768 && Static111.aBoolean141) {
			local82 = 16711680;
		}
		if (local93 > 65536 && !Static111.aBoolean141) {
			local82 = 16711680;
		}
		Static82.aClass1_Sub3_Sub1_Sub3_Sub1_2.method2444(Static208.method787(new Class92[] { Static38.aClass92_414, Static49.method872(local93), Static1.aClass92_32 }), local58, local94, local82, -1);
		local52 = local94 + 15;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZILclient!vd;)V")
	public static void method3114(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class92 arg1) {
		@Pc(9) Class92 local9 = arg1.method3220();
		@Pc(11) int local11 = 0;
		@Pc(14) short[] local14 = new short[16];
		for (@Pc(16) int local16 = 0; local16 < Static153.anInt3182; local16++) {
			@Pc(22) Class1_Sub3_Sub22 local22 = Static102.method1549(local16);
			if ((!arg0 || local22.aBoolean220) && local22.aClass92_1846.method3220().method3234(local9) != -1) {
				if (local11 >= 250) {
					Static12.anInt363 = -1;
					Static170.aShortArray38 = null;
					return;
				}
				if (local11 >= local14.length) {
					@Pc(58) short[] local58 = new short[local14.length * 2];
					for (@Pc(60) int local60 = 0; local60 < local11; local60++) {
						local58[local60] = local14[local60];
					}
					local14 = local58;
				}
				local14[local11++] = (short) local16;
			}
		}
		Static12.anInt363 = local11;
		Static27.anInt614 = 0;
		Static170.aShortArray38 = local14;
		@Pc(101) Class92[] local101 = new Class92[Static12.anInt363];
		for (@Pc(103) int local103 = 0; local103 < Static12.anInt363; local103++) {
			local101[local103] = Static102.method1549(local14[local103]).aClass92_1846;
		}
		Static149.method2258(local101, Static170.aShortArray38);
	}
}
