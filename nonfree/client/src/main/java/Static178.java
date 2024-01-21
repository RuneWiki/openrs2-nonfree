import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!wd", name = "X", descriptor = "Lclient!ef;")
	public static Class3_Sub2_Sub3_Sub1_Sub1 aClass3_Sub2_Sub3_Sub1_Sub1_5;

	@OriginalMember(owner = "client!wd", name = "ab", descriptor = "I")
	public static int anInt3927;

	@OriginalMember(owner = "client!wd", name = "db", descriptor = "Lclient!me;")
	public static Class44_Sub1 aClass44_Sub1_16;

	@OriginalMember(owner = "client!wd", name = "hb", descriptor = "I")
	public static int anInt3929;

	@OriginalMember(owner = "client!wd", name = "Q", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1409 = Static65.method1172("Prepared sound engine");

	@OriginalMember(owner = "client!wd", name = "N", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1408 = aClass46_1409;

	@OriginalMember(owner = "client!wd", name = "O", descriptor = "Lclient!vd;")
	public static Class85 aClass85_1 = new Class85();

	@OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
	public static int anInt3923 = 0;

	@OriginalMember(owner = "client!wd", name = "bb", descriptor = "[Z")
	public static boolean[] aBooleanArray20 = new boolean[100];

	@OriginalMember(owner = "client!wd", name = "cb", descriptor = "I")
	public static int anInt3928 = 1;

	@OriginalMember(owner = "client!wd", name = "gb", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1412 = Static65.method1172("Take");

	@OriginalMember(owner = "client!wd", name = "eb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1410 = aClass46_1412;

	@OriginalMember(owner = "client!wd", name = "fb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1411 = Static65.method1172("Nehmen");

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)V")
	public static void method2857() {
		aClass46_1409 = null;
		aClass46_1412 = null;
		aClass85_1 = null;
		aClass46_1411 = null;
		aClass44_Sub1_16 = null;
		aClass46_1408 = null;
		aBooleanArray20 = null;
		aClass46_1410 = null;
		aClass3_Sub2_Sub3_Sub1_Sub1_5 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[B)V")
	public static void method2858(@OriginalArg(1) byte[] arg0) {
		@Pc(6) Class3_Sub4 local6 = new Class3_Sub4(arg0);
		local6.anInt232 = arg0.length - 2;
		Static8.anInt276 = local6.method208();
		Static87.anIntArray219 = new int[Static8.anInt276];
		Static54.anIntArray131 = new int[Static8.anInt276];
		Static32.aByteArrayArray4 = new byte[Static8.anInt276][];
		Static135.anIntArray363 = new int[Static8.anInt276];
		Static71.anIntArray172 = new int[Static8.anInt276];
		local6.anInt232 = arg0.length - Static8.anInt276 * 8 - 7;
		Static168.anInt3719 = local6.method208();
		Static116.anInt2760 = local6.method208();
		@Pc(62) int local62 = (local6.method191() & 0xFF) + 1;
		for (@Pc(64) int local64 = 0; local64 < Static8.anInt276; local64++) {
			Static135.anIntArray363[local64] = local6.method208();
		}
		for (@Pc(80) int local80 = 0; local80 < Static8.anInt276; local80++) {
			Static71.anIntArray172[local80] = local6.method208();
		}
		for (@Pc(94) int local94 = 0; local94 < Static8.anInt276; local94++) {
			Static54.anIntArray131[local94] = local6.method208();
		}
		for (@Pc(113) int local113 = 0; local113 < Static8.anInt276; local113++) {
			Static87.anIntArray219[local113] = local6.method208();
		}
		local6.anInt232 = arg0.length + 3 - local62 * 3 - Static8.anInt276 * 8 - 7;
		Static90.anIntArray226 = new int[local62];
		for (@Pc(148) int local148 = 1; local148 < local62; local148++) {
			Static90.anIntArray226[local148] = local6.method197();
			if (Static90.anIntArray226[local148] == 0) {
				Static90.anIntArray226[local148] = 1;
			}
		}
		local6.anInt232 = 0;
		for (@Pc(176) int local176 = 0; local176 < Static8.anInt276; local176++) {
			@Pc(182) int local182 = Static54.anIntArray131[local176];
			@Pc(186) int local186 = Static87.anIntArray219[local176];
			@Pc(190) int local190 = local186 * local182;
			@Pc(193) byte[] local193 = new byte[local190];
			Static32.aByteArrayArray4[local176] = local193;
			@Pc(201) int local201 = local6.method191();
			@Pc(208) int local208;
			if (local201 == 0) {
				for (local208 = 0; local208 < local190; local208++) {
					local193[local208] = local6.method203();
				}
			} else if (local201 == 1) {
				for (local208 = 0; local208 < local182; local208++) {
					for (@Pc(212) int local212 = 0; local212 < local186; local212++) {
						local193[local208 + local182 * local212] = local6.method203();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)Lclient!kb;")
	public static Class46 method2859(@OriginalArg(1) int arg0) {
		return Static32.aClass46Array5[arg0].method1376() > 0 ? method2860(new Class46[] { Static150.aClass46Array22[arg0], Static83.aClass46_696, Static32.aClass46Array5[arg0] }) : Static150.aClass46Array22[arg0];
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([Lclient!kb;I)Lclient!kb;")
	public static Class46 method2860(@OriginalArg(0) Class46[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static62.method1138(0, arg0, arg0.length);
	}
}
