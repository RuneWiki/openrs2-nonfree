import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "Lclient!fi;")
	public static Class109 aClass109_5;

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
	public static int anInt8775;

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "[S")
	private static final short[] aShortArray137 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "[S")
	private static final short[] aShortArray138 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!sm", name = "p", descriptor = "[S")
	private static final short[] aShortArray139 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "[[S")
	public static final short[][] aShortArrayArray18 = new short[][] { aShortArray137, aShortArray139, aShortArray138 };

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!gu;B)V")
	public static void method7536(@OriginalArg(0) Class5_Sub16 arg0) {
		if (arg0.aClass5_Sub11_6 != null) {
			arg0.aClass5_Sub11_6.anInt1317 = 0;
		}
		arg0.aBoolean774 = false;
		for (@Pc(22) Class5_Sub16 local22 = arg0.method8283(); local22 != null; local22 = arg0.method8281()) {
			method7536(local22);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method7538(@OriginalArg(1) String[] arg0) {
		@Pc(13) String[] local13 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = local13[local15] + arg0[local15];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method7539(@OriginalArg(1) Class126 arg0) {
		Static288.aClass6_8 = Static330.method5145(Static499.anInt8495, arg0, true);
		Static363.aClass298_7 = Static220.method3394(arg0, Static499.anInt8495);
		Static437.aClass6_11 = Static330.method5145(Static360.anInt6361, arg0, true);
		Static530.aClass298_13 = Static220.method3394(arg0, Static360.anInt6361);
		Static471.aClass6_12 = Static330.method5145(Static580.anInt10246, arg0, true);
		Static457.aClass298_11 = Static220.method3394(arg0, Static580.anInt10246);
	}

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "(I)V")
	public static void method7542() {
		Static243.aClass293_29.method6930();
		Static436.aClass293_49.method6930();
		Static593.aClass293_66.method6930();
		Static476.aClass293_56.method6930();
	}
}
