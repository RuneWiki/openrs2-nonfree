import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "Zc", descriptor = "I")
	public static int anInt366 = 0;

	@OriginalMember(owner = "client!ae", name = "gd", descriptor = "B")
	public static byte aByte1 = 0;

	@OriginalMember(owner = "client!ae", name = "id", descriptor = "I")
	public static int anInt373 = -1;

	@OriginalMember(owner = "client!ae", name = "jd", descriptor = "Lclient!gg;")
	public static Class28 aClass28_265 = Static107.method1838("Null");

	@OriginalMember(owner = "client!ae", name = "ld", descriptor = "Lclient!gg;")
	public static Class28 aClass28_266 = Static107.method1838("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
	public static void method225(@OriginalArg(1) int arg0) {
		if (!Static131.method2109(arg0)) {
			return;
		}
		@Pc(12) Class24[] local12 = Static23.aClass24ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(22) Class24 local22 = local12[local14];
			if (local22 != null) {
				local22.anInt1359 = 0;
				local22.anInt1422 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "(B)V")
	public static void method226() {
		aClass28_266 = null;
		aClass28_265 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BIILclient!ff;IILclient!wb;)V")
	public static void method227(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2_Sub4_Sub3_Sub4 arg5) {
		if (arg5 == null) {
			return;
		}
		@Pc(12) int local12 = Static110.anInt2692 + Static66.anInt1789 & 0x7FF;
		@Pc(24) int local24 = Math.max(arg2.anInt1357 / 2, arg2.anInt1427 / 2) + 10;
		@Pc(32) int local32 = arg0 * arg0 + arg3 * arg3;
		if (local24 * local24 < local32) {
			return;
		}
		@Pc(46) int local46 = Class2_Sub4_Sub3_Sub1.anIntArray58[local12];
		@Pc(50) int local50 = Class2_Sub4_Sub3_Sub1.anIntArray60[local12];
		@Pc(63) int local63 = local50 * 256 / (Static178.anInt3957 + 256);
		@Pc(71) int local71 = local46 * 256 / (Static178.anInt3957 + 256);
		@Pc(82) int local82 = arg0 * local63 - arg3 * local71 >> 16;
		@Pc(93) int local93 = arg0 * local71 + arg3 * local63 >> 16;
		arg5.method2827(arg2.anInt1357 / 2 + arg1 + local93 - arg5.anInt3984 / 2, -local82 + arg2.anInt1427 / 2 + arg4 + -(arg5.anInt3982 / 2), arg2.anIntArray127, arg2.anIntArray118);
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(Z)V")
	public static void method228() {
		Static18.aBoolean161 = false;
		Static177.aBoolean170 = false;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZILclient!mc;IBII)V")
	public static void method229(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40_Sub1 arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) (arg1 + (arg5 << 16));
		@Pc(16) Class2_Sub4_Sub13 local16 = (Class2_Sub4_Sub13) Static152.aClass35_41.method1354(local6);
		if (local16 != null) {
			return;
		}
		local16 = (Class2_Sub4_Sub13) Static118.aClass35_47.method1354(local6);
		if (local16 != null) {
			return;
		}
		local16 = (Class2_Sub4_Sub13) Static146.aClass35_38.method1354(local6);
		if (local16 == null) {
			if (!arg0) {
				local16 = (Class2_Sub4_Sub13) Static58.aClass35_22.method1354(local6);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class2_Sub4_Sub13();
			local16.aByte5 = arg3;
			local16.aClass40_Sub1_76 = arg2;
			local16.anInt2567 = arg4;
			if (arg0) {
				Static152.aClass35_41.method1362(local16, local6);
				Static178.anInt3955++;
			} else {
				Static122.aClass4_2.method320(local16);
				Static146.aClass35_38.method1362(local16, local6);
				Static45.anInt1213++;
			}
		} else if (arg0) {
			local16.method2853();
			Static152.aClass35_41.method1362(local16, local6);
			Static178.anInt3955++;
			Static45.anInt1213--;
		}
	}
}
