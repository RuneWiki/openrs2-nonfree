import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!id", name = "s", descriptor = "Lclient!dc;")
	public static Class17_Sub1 aClass17_Sub1_12;

	@OriginalMember(owner = "client!id", name = "v", descriptor = "Lclient!v;")
	private static Class76 aClass76_565 = Static134.method2017("FULL");

	@OriginalMember(owner = "client!id", name = "w", descriptor = "Lclient!v;")
	public static Class76 aClass76_566 = Static134.method2017("<col=00ff00>");

	@OriginalMember(owner = "client!id", name = "x", descriptor = "Lclient!v;")
	private static Class76 aClass76_567 = Static134.method2017("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!id", name = "y", descriptor = "Lclient!v;")
	public static Class76 aClass76_568 = aClass76_565;

	@OriginalMember(owner = "client!id", name = "z", descriptor = "Lclient!v;")
	public static Class76 aClass76_569 = aClass76_567;

	@OriginalMember(owner = "client!id", name = "V", descriptor = "[I")
	public static int[] anIntArray162 = new int[50];

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BILclient!cf;Lclient!ne;)V")
	public static void method872(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) Class4_Sub10 arg2) {
		@Pc(9) Class4_Sub19 local9 = new Class4_Sub19();
		local9.anInt2144 = arg2.method599();
		local9.anInt2143 = arg2.method549();
		local9.aClass24Array1 = new Class24[local9.anInt2144];
		local9.anIntArray302 = new int[local9.anInt2144];
		local9.aClass24Array2 = new Class24[local9.anInt2144];
		local9.anIntArray301 = new int[local9.anInt2144];
		local9.aByteArrayArrayArray6 = new byte[local9.anInt2144][][];
		local9.anIntArray303 = new int[local9.anInt2144];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt2144; local51++) {
			try {
				@Pc(59) int local59 = arg2.method599();
				@Pc(86) String local86;
				@Pc(95) String local95;
				@Pc(99) int local99;
				if (local59 == 0 || local59 == 1 || local59 == 2) {
					local86 = new String(arg2.method581().method1866());
					local95 = new String(arg2.method581().method1866());
					local99 = 0;
					if (local59 == 1) {
						local99 = arg2.method549();
					}
					local9.anIntArray301[local51] = local59;
					local9.anIntArray303[local51] = local99;
					local9.aClass24Array2[local51] = arg1.method186(local95, Static45.method820(local86));
				} else if (local59 == 3 || local59 == 4) {
					local86 = new String(arg2.method581().method1866());
					local95 = new String(arg2.method581().method1866());
					local99 = arg2.method599();
					@Pc(102) String[] local102 = new String[local99];
					for (@Pc(104) int local104 = 0; local104 < local99; local104++) {
						local102[local104] = new String(arg2.method581().method1866());
					}
					@Pc(128) byte[][] local128 = new byte[local99][];
					@Pc(139) int local139;
					if (local59 == 3) {
						for (@Pc(133) int local133 = 0; local133 < local99; local133++) {
							local139 = arg2.method549();
							local128[local133] = new byte[local139];
							arg2.method560(local128[local133], local139);
						}
					}
					@Pc(163) Class[] local163 = new Class[local99];
					local9.anIntArray301[local51] = local59;
					for (local139 = 0; local139 < local99; local139++) {
						local163[local139] = Static45.method820(local102[local139]);
					}
					local9.aClass24Array1[local51] = arg1.method184(local95, local163, Static45.method820(local86));
					local9.aByteArrayArrayArray6[local51] = local128;
				}
			} catch (@Pc(253) ClassNotFoundException local253) {
				local9.anIntArray302[local51] = -1;
			} catch (@Pc(260) SecurityException local260) {
				local9.anIntArray302[local51] = -2;
			} catch (@Pc(267) NullPointerException local267) {
				local9.anIntArray302[local51] = -3;
			} catch (@Pc(274) Exception local274) {
				local9.anIntArray302[local51] = -4;
			} catch (@Pc(281) Throwable local281) {
				local9.anIntArray302[local51] = -5;
			}
		}
		Static124.aClass78_14.method1914(local9);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!cf;BLjava/lang/Object;)V")
	public static void method873(@OriginalArg(0) Class14 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg0.anEventQueue1.peekEvent() != null; local16++) {
			Static6.method84(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
	public static void method874() {
		aClass76_569 = null;
		aClass76_567 = null;
		aClass76_568 = null;
		anIntArray162 = null;
		aClass17_Sub1_12 = null;
		aClass76_566 = null;
		aClass76_565 = null;
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V")
	public static void method875() {
		Static82.aClass72_21.method1786();
		Static10.aClass72_8.method1786();
	}
}
