import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!ce", name = "qb", descriptor = "Lclient!ph;")
	public static Class66 aClass66_4;

	@OriginalMember(owner = "client!ce", name = "sb", descriptor = "Z")
	public static boolean aBoolean28;

	@OriginalMember(owner = "client!ce", name = "ub", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!ce", name = "W", descriptor = "Lclient!rf;")
	private static Class70 aClass70_235 = Static49.method1293("Connecting to update server");

	@OriginalMember(owner = "client!ce", name = "V", descriptor = "Lclient!rf;")
	public static Class70 aClass70_234 = aClass70_235;

	@OriginalMember(owner = "client!ce", name = "X", descriptor = "Lclient!rf;")
	private static Class70 aClass70_236 = Static49.method1293("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!ce", name = "ab", descriptor = "I")
	public static int anInt692 = 0;

	@OriginalMember(owner = "client!ce", name = "bb", descriptor = "Lclient!rf;")
	private static Class70 aClass70_237 = Static49.method1293("skill)2");

	@OriginalMember(owner = "client!ce", name = "fb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_238 = aClass70_237;

	@OriginalMember(owner = "client!ce", name = "hb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_239 = Static49.method1293("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!ce", name = "ib", descriptor = "Lclient!rf;")
	public static Class70 aClass70_240 = aClass70_236;

	@OriginalMember(owner = "client!ce", name = "mb", descriptor = "Lclient!rf;")
	private static Class70 aClass70_242 = Static49.method1293("Loading sprites )2 ");

	@OriginalMember(owner = "client!ce", name = "jb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_241 = aClass70_242;

	@OriginalMember(owner = "client!ce", name = "lb", descriptor = "I")
	public static int anInt695 = 0;

	@OriginalMember(owner = "client!ce", name = "vb", descriptor = "Lclient!rf;")
	private static Class70 aClass70_244 = Static49.method1293("Location");

	@OriginalMember(owner = "client!ce", name = "tb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_243 = aClass70_244;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "(B)V")
	public static void method547() {
		aClass70_240 = null;
		aClass70_241 = null;
		aClass70_242 = null;
		aClass70_235 = null;
		aClass70_236 = null;
		aClass70_239 = null;
		aClass70_238 = null;
		aClass70_234 = null;
		aClass70_243 = null;
		aClass70_237 = null;
		aClass70_244 = null;
		aByteArrayArrayArray2 = null;
		aClass66_4 = null;
		Class1_Sub2_Sub8.anIntArray44 = null;
	}

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "(B)V")
	public static void method549() {
		@Pc(9) int local9;
		if (Static171.anInt4442 > 0) {
			for (local9 = 0; local9 < 256; local9++) {
				if (Static171.anInt4442 > 768) {
					Static44.anIntArray149[local9] = Static34.method875(Static182.anIntArray433[local9], Static137.anIntArray345[local9], 1024 - Static171.anInt4442);
				} else if (Static171.anInt4442 > 256) {
					Static44.anIntArray149[local9] = Static137.anIntArray345[local9];
				} else {
					Static44.anIntArray149[local9] = Static34.method875(Static137.anIntArray345[local9], Static182.anIntArray433[local9], 256 - Static171.anInt4442);
				}
			}
		} else if (Static138.anInt3621 <= 0) {
			for (local9 = 0; local9 < 256; local9++) {
				Static44.anIntArray149[local9] = Static182.anIntArray433[local9];
			}
		} else {
			for (local9 = 0; local9 < 256; local9++) {
				if (Static138.anInt3621 > 768) {
					Static44.anIntArray149[local9] = Static34.method875(Static182.anIntArray433[local9], Static101.anIntArray271[local9], 1024 - Static138.anInt3621);
				} else if (Static138.anInt3621 <= 256) {
					Static44.anIntArray149[local9] = Static34.method875(Static101.anIntArray271[local9], Static182.anIntArray433[local9], 256 - Static138.anInt3621);
				} else {
					Static44.anIntArray149[local9] = Static101.anIntArray271[local9];
				}
			}
		}
		@Pc(146) int local146 = Static54.aClass1_Sub1_Sub1_Sub4_6.anInt3967 * 9;
		local9 = 0;
		@Pc(158) int local158 = 0;
		@Pc(175) int local175;
		@Pc(188) int local188;
		@Pc(201) int local201;
		@Pc(196) int local196;
		@Pc(216) int local216;
		@Pc(221) int local221;
		for (@Pc(160) int local160 = 1; local160 < 255; local160++) {
			local175 = Static35.anIntArray200[local160] * (256 - local160) / 256 + 22;
			if (local175 < 0) {
				local175 = 0;
			}
			local9 += local175;
			for (local188 = local175; local188 < 128; local188++) {
				local196 = Static54.aClass1_Sub1_Sub1_Sub4_6.anIntArray374[local146++];
				local201 = Static41.anIntArray132[local9++];
				if (local201 == 0) {
					Static5.aClass1_Sub1_Sub1_Sub4_1.anIntArray374[local158++] = local196;
				} else {
					local216 = local201;
					local221 = 256 - local201;
					local201 = Static44.anIntArray149[local201];
					Static5.aClass1_Sub1_Sub1_Sub4_1.anIntArray374[local158++] = ((local201 & 0xFF00FF) * local216 + local221 * (local196 & 0xFF00FF) & 0xFF00FF00) + (local216 * (local201 & 0xFF00) + ((local196 & 0xFF00) * local221) & 0xFF0000) >> 8;
				}
			}
			for (local201 = 0; local201 < local175; local201++) {
				Static5.aClass1_Sub1_Sub1_Sub4_1.anIntArray374[local158++] = Static54.aClass1_Sub1_Sub1_Sub4_6.anIntArray374[local146++];
			}
			local146 += Static54.aClass1_Sub1_Sub1_Sub4_6.anInt3967 - 128;
		}
		local158 = 0;
		local9 = 0;
		Static5.aClass1_Sub1_Sub1_Sub4_1.method3031(0, 9);
		local146 = Static54.aClass1_Sub1_Sub1_Sub4_6.anInt3967 * 9 + 128;
		for (local175 = 1; local175 < 255; local175++) {
			local188 = (256 - local175) * Static35.anIntArray200[local175] / 256 + 22;
			if (local188 < 0) {
				local188 = 0;
			}
			for (local201 = 0; local201 < local188; local201++) {
				@Pc(344) int local344 = local158++;
				local146--;
				Static37.aClass1_Sub1_Sub1_Sub4_4.anIntArray374[local344] = Static54.aClass1_Sub1_Sub1_Sub4_6.anIntArray374[local146];
			}
			for (local196 = local188; local196 < 128; local196++) {
				local216 = Static41.anIntArray132[local9++];
				local146--;
				local221 = Static54.aClass1_Sub1_Sub1_Sub4_6.anIntArray374[local146];
				if (local216 == 0) {
					Static37.aClass1_Sub1_Sub1_Sub4_4.anIntArray374[local158++] = local221;
				} else {
					@Pc(389) int local389 = local216;
					@Pc(394) int local394 = 256 - local216;
					local216 = Static44.anIntArray149[local216];
					Static37.aClass1_Sub1_Sub1_Sub4_4.anIntArray374[local158++] = ((local216 & 0xFF00) * local389 + local394 * (local221 & 0xFF00) & 0xFF0000) + ((local221 & 0xFF00FF) * local394 + local389 * (local216 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local146 += Static54.aClass1_Sub1_Sub1_Sub4_6.anInt3967 + 128;
			local9 += local188;
		}
		Static37.aClass1_Sub1_Sub1_Sub4_4.method3031(637, 9);
	}
}
