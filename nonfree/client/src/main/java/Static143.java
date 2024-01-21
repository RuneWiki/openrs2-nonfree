import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!s", name = "q", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1401 = Static51.method932("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!s", name = "c", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1395 = aClass10_1401;

	@OriginalMember(owner = "client!s", name = "v", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1402 = Static51.method932("shake:");

	@OriginalMember(owner = "client!s", name = "d", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1396 = aClass10_1402;

	@OriginalMember(owner = "client!s", name = "o", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1400 = Static51.method932("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!s", name = "h", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1397 = aClass10_1400;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "[Lclient!cd;")
	public static Class10[] aClass10Array23 = new Class10[100];

	@OriginalMember(owner = "client!s", name = "k", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1398 = Static51.method932("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!s", name = "l", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1399 = aClass10_1402;

	@OriginalMember(owner = "client!s", name = "u", descriptor = "I")
	public static int anInt3171 = 0;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
	public static void method2251() {
		aClass10_1402 = null;
		aClass10_1395 = null;
		aClass10_1400 = null;
		aClass10_1397 = null;
		aClass10_1401 = null;
		aClass10_1398 = null;
		aClass10_1399 = null;
		aClass10_1396 = null;
		aClass10Array23 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IBIIZLclient!gd;I)V")
	public static void method2252(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class29_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) ((arg2 << 16) + arg0);
		@Pc(16) Class2_Sub1_Sub11 local16 = (Class2_Sub1_Sub11) Static179.aClass18_12.method683(local6);
		if (local16 != null) {
			return;
		}
		local16 = (Class2_Sub1_Sub11) Static22.aClass18_1.method683(local6);
		if (local16 != null) {
			return;
		}
		local16 = (Class2_Sub1_Sub11) Static155.aClass18_10.method683(local6);
		if (local16 == null) {
			if (!arg3) {
				local16 = (Class2_Sub1_Sub11) Static57.aClass18_7.method683(local6);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class2_Sub1_Sub11();
			local16.anInt2339 = arg5;
			local16.aByte3 = arg1;
			local16.aClass29_Sub1_33 = arg4;
			if (arg3) {
				Static179.aClass18_12.method685(local6, local16);
				Static130.anInt2900++;
			} else {
				Static22.aClass28_1.method951(local16);
				Static155.aClass18_10.method685(local6, local16);
				Static30.anInt818++;
			}
		} else if (arg3) {
			local16.method2540();
			Static179.aClass18_12.method685(local6, local16);
			Static130.anInt2900++;
			Static30.anInt818--;
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
	public static void method2253() {
		@Pc(3) int local3 = Static119.anInt2712;
		@Pc(10) int local10 = Static107.anInt2462;
		@Pc(12) int local12 = Static167.anInt2027;
		@Pc(18) int local18 = Static159.anInt3393;
		Static172.method2026(local3, local10, local18, local12, 6116423);
		Static172.method2026(local3 + 1, local10 - -1, local18 - 2, 16, 0);
		Static172.method2018(local3 + 1, local10 + 18, local18 - 2, local12 - 19, 0);
		Static167.aClass2_Sub1_Sub4_Sub1_Sub1_4.method532(Static78.aClass10_339, local3 + 3, local10 + 14, 6116423, -1);
		@Pc(65) int local65 = Static61.anInt3635;
		@Pc(67) int local67 = Static72.anInt1723;
		for (@Pc(69) int local69 = 0; local69 < Static46.anInt1135; local69++) {
			@Pc(73) int local73 = 16777215;
			@Pc(85) int local85 = (Static46.anInt1135 - local69 - 1) * 15 + local10 + 31;
			if (local3 < local67 && local67 < local18 + local3 && local65 > local85 - 13 && local85 + 3 > local65) {
				local73 = 16776960;
			}
			Static167.aClass2_Sub1_Sub4_Sub1_Sub1_4.method532(Static9.method163(local69), local3 + 3, local85, local73, 0);
		}
		Static64.method1128(Static159.anInt3393, Static107.anInt2462, Static167.anInt2027, Static119.anInt2712);
	}
}
