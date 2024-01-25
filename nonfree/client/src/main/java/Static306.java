import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!rn", name = "D", descriptor = "Lclient!oe;")
	public static Class168 aClass168_3;

	@OriginalMember(owner = "client!rn", name = "H", descriptor = "I")
	public static int anInt5658;

	@OriginalMember(owner = "client!rn", name = "M", descriptor = "Lclient!db;")
	public static Class49 aClass49_7;

	@OriginalMember(owner = "client!rn", name = "O", descriptor = "I")
	public static int anInt5661;

	@OriginalMember(owner = "client!rn", name = "A", descriptor = "I")
	public static int anInt5654 = 0;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZI)V")
	public static void method5009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static328.method5290(15, 0);
		local8.method1198();
		local8.anInt1462 = arg1;
		local8.anInt1465 = arg0;
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(III)V")
	public static void method5014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class188 local7 = Static45.aClass188ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass1_Sub5_2 != null) {
			local7.aClass1_Sub5_2 = null;
		}
		if (local7.aClass1_Sub5_1 != null) {
			local7.aClass1_Sub5_1 = null;
		}
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(IZI)V")
	public static void method5016(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class2_Sub32 local10 = Static76.method1317(arg0, arg1);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray470.length; local15++) {
				local10.anIntArray470[local15] = -1;
				local10.anIntArray471[local15] = 0;
			}
		}
	}
}
