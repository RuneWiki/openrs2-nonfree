import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bf", name = "S", descriptor = "Lclient!rn;")
	public static Class155 aClass155_17;

	@OriginalMember(owner = "client!bf", name = "Q", descriptor = "Lclient!l;")
	public static Class98 aClass98_4 = new Class98(5);

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)V")
	public static void method347() {
		Static152.aClass34_1.method5034();
		@Pc(6) int local6;
		for (local6 = 0; local6 < 32; local6++) {
			Static11.aLongArray11[local6] = 0L;
		}
		for (local6 = 0; local6 < 32; local6++) {
			Static302.aLongArray13[local6] = 0L;
		}
		Static31.anInt568 = 0;
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "(I)Lclient!ho;")
	public static Class3_Sub4_Sub12 method348() {
		@Pc(13) int local13 = Static306.anIntArray618[0] * Static101.anIntArray185[0];
		@Pc(17) byte[] local17 = Static314.aByteArrayArray130[0];
		@Pc(20) int[] local20 = new int[local13];
		for (@Pc(22) int local22 = 0; local22 < local13; local22++) {
			local20[local22] = Static299.anIntArray611[local17[local22] & 0xFF];
		}
		@Pc(59) Class3_Sub4_Sub12 local59;
		if (Static283.aBoolean393) {
			local59 = new Class3_Sub4_Sub12_Sub1(Static148.anInt2816, Static43.anInt812, Static93.anIntArray162[0], Static35.anIntArray54[0], Static101.anIntArray185[0], Static306.anIntArray618[0], local20);
		} else {
			local59 = new Class3_Sub4_Sub12_Sub2(Static148.anInt2816, Static43.anInt812, Static93.anIntArray162[0], Static35.anIntArray54[0], Static101.anIntArray185[0], Static306.anIntArray618[0], local20);
		}
		Static6.method108();
		return local59;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIBI)V")
	public static void method350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 - arg2 >= Static175.anInt3267 && Static204.anInt4020 >= arg2 + arg0 && arg1 - arg2 >= Static245.anInt6027 && Static111.anInt2039 >= arg2 + arg1) {
			Static103.method1667(arg2, arg1, arg0, arg3);
		} else {
			Static75.method1162(arg0, arg2, arg3, arg1);
		}
	}
}
