import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "Lclient!qk;")
	public static Class1_Sub26 aClass1_Sub26_2;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "[I")
	public static int[] anIntArray511;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
	public static int anInt4601;

	@OriginalMember(owner = "client!sb", name = "B", descriptor = "Lclient!fk;")
	public static Class55 aClass55_1;

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "[S")
	public static short[] aShortArray81 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method3912() {
		Static242.aClass175_36.method4294();
		Static83.aClass175_11.method4294();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method3918(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(4) short[] local4 = new short[16];
		@Pc(6) int local6 = 0;
		@Pc(9) String local9 = arg1.toLowerCase();
		for (@Pc(15) int local15 = 0; local15 < Static73.anInt1580; local15++) {
			@Pc(22) Class3 local22 = Static69.method1330(local15);
			if ((!arg0 || local22.aBoolean15) && local22.anInt125 == -1 && local22.anInt127 == -1 && local22.anInt123 == 0 && local22.aString3.toLowerCase().indexOf(local9) != -1) {
				if (local6 >= 250) {
					Static85.aShortArray45 = null;
					Static46.anInt1052 = -1;
					return;
				}
				if (local6 >= local4.length) {
					@Pc(79) short[] local79 = new short[local4.length * 2];
					for (@Pc(81) int local81 = 0; local81 < local6; local81++) {
						local79[local81] = local4[local81];
					}
					local4 = local79;
				}
				local4[local6++] = (short) local15;
			}
		}
		Static85.aShortArray45 = local4;
		Static46.anInt1052 = local6;
		Static114.anInt2344 = 0;
		@Pc(125) String[] local125 = new String[Static46.anInt1052];
		for (@Pc(127) int local127 = 0; local127 < Static46.anInt1052; local127++) {
			local125[local127] = Static69.method1330(local4[local127]).aString3;
		}
		Static253.method3962(local125, Static85.aShortArray45);
	}
}
