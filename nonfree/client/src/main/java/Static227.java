import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!jk", name = "M", descriptor = "[Lclient!gn;")
	public static Class20_Sub1[] aClass20_Sub1Array3;

	@OriginalMember(owner = "client!jk", name = "L", descriptor = "Lclient!sw;")
	public static final Class277 aClass277_35 = new Class277(4);

	@OriginalMember(owner = "client!jk", name = "P", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_64 = new Class252(43, -1);

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "(I)V")
	public static void method4089() {
		Static61.anInt1489 = 0;
		@Pc(13) int local13 = Static352.aClass1_Sub17_Sub2_2.method4467();
		@Pc(24) boolean local24 = Static352.aClass1_Sub17_Sub2_2.method4467() == 1;
		@Pc(28) int local28 = Static352.aClass1_Sub17_Sub2_2.method4472();
		@Pc(32) int local32 = Static352.aClass1_Sub17_Sub2_2.method4502();
		Static349.method5782();
		Static42.method1217(local13);
		@Pc(45) int local45 = (Static494.anInt8660 - Static352.aClass1_Sub17_Sub2_2.anInt4872) / 16;
		Static16.anIntArrayArray125 = new int[local45][4];
		@Pc(55) int local55;
		for (@Pc(51) int local51 = 0; local51 < local45; local51++) {
			for (local55 = 0; local55 < 4; local55++) {
				Static16.anIntArrayArray125[local51][local55] = Static352.aClass1_Sub17_Sub2_2.method4481();
			}
		}
		Static464.aByteArrayArray24 = new byte[local45][];
		Static214.anIntArray337 = new int[local45];
		Static77.aByteArrayArray10 = null;
		Static373.aByteArrayArray19 = new byte[local45][];
		Static473.aByteArrayArray25 = new byte[local45][];
		Static487.anIntArray754 = new int[local45];
		Static46.anIntArray85 = new int[local45];
		Static144.anIntArray245 = null;
		Static268.aByteArrayArray15 = new byte[local45][];
		Static378.anIntArray656 = new int[local45];
		Static395.anIntArray676 = new int[local45];
		local45 = 0;
		for (local55 = (local28 - (Static237.anInt4563 >> 4)) / 8; local55 <= (local28 + (Static237.anInt4563 >> 4)) / 8; local55++) {
			for (@Pc(137) int local137 = (local32 - (Static373.anInt6694 >> 4)) / 8; local137 <= (local32 + (Static373.anInt6694 >> 4)) / 8; local137++) {
				Static378.anIntArray656[local45] = local137 + (local55 << 8);
				Static46.anIntArray85[local45] = Static10.aClass69_4.method1909("m" + local55 + "_" + local137);
				Static487.anIntArray754[local45] = Static10.aClass69_4.method1909("l" + local55 + "_" + local137);
				Static214.anIntArray337[local45] = Static10.aClass69_4.method1909("um" + local55 + "_" + local137);
				Static395.anIntArray676[local45] = Static10.aClass69_4.method1909("ul" + local55 + "_" + local137);
				local45++;
			}
		}
		Static164.method2938(local28, local32, 10, local24);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZLclient!os;)V")
	public static void method4090(@OriginalArg(1) Class1_Sub17 arg0) {
		if (arg0.aByteArray58.length - arg0.anInt4872 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method4487();
		if (local19 < 0 || local19 > 1 || arg0.aByteArray58.length - arg0.anInt4872 < 2) {
			return;
		}
		@Pc(48) int local48 = arg0.method4494();
		if (local48 * 6 > arg0.aByteArray58.length - arg0.anInt4872) {
			return;
		}
		for (@Pc(66) int local66 = 0; local66 < local48; local66++) {
			@Pc(72) int local72 = arg0.method4494();
			@Pc(80) int local80 = arg0.method4481();
			if (local72 < Static540.anIntArray837.length && Static137.aBooleanArray4[local72] && (Static48.aClass269_1.method6972(local72).aChar5 != '1' || local80 >= -1 && local80 <= 1)) {
				Static540.anIntArray837[local72] = local80;
			}
		}
	}
}
