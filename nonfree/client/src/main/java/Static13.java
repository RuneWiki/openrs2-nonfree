import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_1;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
	public static int anInt249 = 0;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "Lclient!hh;")
	public static Class50 aClass50_108 = Static186.method3527("(U2");

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
	public static int anInt250 = 0;

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "Z")
	public static boolean aBoolean11 = false;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BZLclient!hh;)V")
	public static void method190(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class50 arg1) {
		@Pc(4) short[] local4 = new short[16];
		@Pc(8) Class50 local8 = arg1.method1233();
		@Pc(10) int local10 = 0;
		for (@Pc(20) int local20 = 0; local20 < Static109.anInt2173; local20++) {
			@Pc(26) Class70 local26 = Static16.method227(local20);
			if ((!arg0 || local26.aBoolean106) && local26.anInt2401 == -1 && local26.anInt2449 == -1 && local26.anInt2413 == 0 && local26.aClass50_833.method1233().method1257(local8) != -1) {
				if (local10 >= 250) {
					Static56.aShortArray9 = null;
					Static8.anInt180 = -1;
					return;
				}
				if (local10 >= local4.length) {
					@Pc(79) short[] local79 = new short[local4.length * 2];
					for (@Pc(81) int local81 = 0; local81 < local10; local81++) {
						local79[local81] = local4[local81];
					}
					local4 = local79;
				}
				local4[local10++] = (short) local20;
			}
		}
		Static171.anInt3500 = 0;
		Static8.anInt180 = local10;
		@Pc(116) Class50[] local116 = new Class50[Static8.anInt180];
		Static56.aShortArray9 = local4;
		for (@Pc(120) int local120 = 0; local120 < Static8.anInt180; local120++) {
			local116[local120] = Static16.method227(local4[local120]).aClass50_833;
		}
		Static195.method3166(Static56.aShortArray9, local116);
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
	public static void method193() {
		Static42.aClass84_18.method2576();
		Static224.aClass84_6.method2576();
		Static1.aClass84_1.method2576();
		Static102.aClass84_21.method2576();
	}
}
