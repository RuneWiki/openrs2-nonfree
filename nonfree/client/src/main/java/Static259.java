import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!t", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!t", name = "i", descriptor = "Lclient!nm;")
	public static Class119 aClass119_81;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "I")
	public static int anInt4811 = 0;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString179 = "white:";

	@OriginalMember(owner = "client!t", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString180 = "glow1:";

	@OriginalMember(owner = "client!t", name = "g", descriptor = "I")
	public static int anInt4814 = 0;

	@OriginalMember(owner = "client!t", name = "h", descriptor = "I")
	public static int anInt4815 = -1;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method4028(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(4) short[] local4 = new short[16];
		@Pc(7) String local7 = arg0.toLowerCase();
		@Pc(9) int local9 = 0;
		@Pc(24) int local24 = arg1 ? 32768 : 0;
		@Pc(32) int local32 = (arg1 ? Static242.anInt4493 : Static14.anInt310) + local24;
		for (@Pc(34) int local34 = local24; local34 < local32; local34++) {
			@Pc(41) Class1_Sub5_Sub19 local41 = Static271.method4175(local34);
			if (local41.aBoolean391 && local41.method3708().toLowerCase().indexOf(local7) != -1) {
				if (local9 >= 50) {
					Static46.anInt1052 = -1;
					Static85.aShortArray45 = null;
					return;
				}
				if (local9 >= local4.length) {
					@Pc(77) short[] local77 = new short[local4.length * 2];
					for (@Pc(79) int local79 = 0; local79 < local9; local79++) {
						local77[local79] = local4[local79];
					}
					local4 = local77;
				}
				local4[local9++] = (short) local34;
			}
		}
		Static46.anInt1052 = local9;
		Static85.aShortArray45 = local4;
		Static114.anInt2344 = 0;
		@Pc(111) String[] local111 = new String[Static46.anInt1052];
		for (@Pc(113) int local113 = 0; local113 < Static46.anInt1052; local113++) {
			local111[local113] = Static271.method4175(local4[local113]).method3708();
		}
		Static253.method3962(local111, Static85.aShortArray45);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V")
	public static void method4029() {
		Static183.aClass175_28.method4288(5);
	}
}
