import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
	public static int anInt339 = 0;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1 = new int[4][13][13];

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "Lclient!af;")
	public static Class5 aClass5_178 = Static45.method1937("Okay");

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "Lclient!af;")
	public static Class5 aClass5_179 = Static45.method1937("<)4col>");

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "Lclient!af;")
	private static Class5 aClass5_181 = Static45.method1937("Loaded textures");

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "Lclient!af;")
	public static Class5 aClass5_180 = aClass5_181;

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "Lclient!af;")
	public static Class5 aClass5_182 = Static45.method1937("Einloggen");

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
	public static int anInt348 = 0;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)Lclient!oe;")
	public static Class1_Sub3_Sub14 method298(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub3_Sub14 local6 = (Class1_Sub3_Sub14) Static125.aClass28_85.method796((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static93.aClass41_19.method1710(14, arg0);
		local6 = new Class1_Sub3_Sub14();
		if (local20 != null) {
			local6.method1560(new Class1_Sub20(local20));
		}
		Static125.aClass28_85.method789(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
	public static void method299() {
		aClass5_180 = null;
		aClass5_182 = null;
		aClass5_181 = null;
		anIntArrayArrayArray1 = null;
		aClass5_178 = null;
		aClass5_179 = null;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)[Lclient!fd;")
	public static Class1_Sub3_Sub1_Sub2[] method300() {
		@Pc(15) Class1_Sub3_Sub1_Sub2[] local15 = new Class1_Sub3_Sub1_Sub2[Static46.anInt1118];
		for (@Pc(17) int local17 = 0; local17 < Static46.anInt1118; local17++) {
			@Pc(27) Class1_Sub3_Sub1_Sub2 local27 = local15[local17] = new Class1_Sub3_Sub1_Sub2();
			local27.anInt1013 = Static116.anInt2900;
			local27.anInt1017 = Static11.anInt327;
			local27.anInt1014 = Static75.anIntArray290[local17];
			local27.anInt1016 = Static48.anIntArray196[local17];
			local27.anInt1018 = Static109.anIntArray409[local17];
			local27.anInt1015 = Static76.anIntArray296[local17];
			@Pc(59) int local59 = local27.anInt1018 * local27.anInt1015;
			@Pc(63) byte[] local63 = Static73.aByteArrayArray7[local17];
			local27.anIntArray171 = new int[local59];
			for (@Pc(69) int local69 = 0; local69 < local59; local69++) {
				local27.anIntArray171[local69] = Static27.anIntArray97[local63[local69] & 0xFF];
			}
		}
		Static50.method890();
		return local15;
	}
}
