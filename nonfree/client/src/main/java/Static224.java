import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!qf", name = "pc", descriptor = "I")
	public static int anInt4398;

	@OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
	public static int anInt4349 = 0;

	@OriginalMember(owner = "client!qf", name = "ib", descriptor = "[S")
	public static short[] aShortArray62 = new short[256];

	@OriginalMember(owner = "client!qf", name = "tb", descriptor = "[I")
	public static int[] anIntArray361 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!qf", name = "sc", descriptor = "I")
	public static int anInt4401 = 0;

	@OriginalMember(owner = "client!qf", name = "Gc", descriptor = "I")
	public static int anInt4410 = 1;

	@OriginalMember(owner = "client!qf", name = "vd", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)V")
	public static void method3516(@OriginalArg(0) boolean arg0) {
		if (arg0 != Static8.aBoolean9) {
			Static8.aBoolean9 = arg0;
			Static134.method2183();
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)Lclient!mo;")
	public static Class103 method3521() {
		@Pc(32) Class103 local32;
		if (Static291.aBoolean404) {
			local32 = new Class103_Sub1(Static268.anInt5936, Static110.anInt2184, Static201.anIntArray327[0], Static148.anIntArray242[0], Static134.anIntArray220[0], Static255.anIntArray450[0], Static255.aByteArrayArray15[0], Static40.anIntArray59);
		} else {
			local32 = new Class103_Sub2(Static268.anInt5936, Static110.anInt2184, Static201.anIntArray327[0], Static148.anIntArray242[0], Static134.anIntArray220[0], Static255.anIntArray450[0], Static255.aByteArrayArray15[0], Static40.anIntArray59);
		}
		Static295.method4395();
		return local32;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!h;III)V")
	public static void method3524(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1_Sub17 local12;
		if (arg2 < Static6.anInt118) {
			local12 = Static122.aClass1_Sub17ArrayArrayArray3[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass171_1 != null && local12.aClass171_1.aClass22_10.method4076()) {
				arg0.method4072(local12.aClass171_1.aClass22_10, 128, 0, 0, true);
			}
		}
		if (arg3 < Static6.anInt118) {
			local12 = Static122.aClass1_Sub17ArrayArrayArray3[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass171_1 != null && local12.aClass171_1.aClass22_10.method4076()) {
				arg0.method4072(local12.aClass171_1.aClass22_10, 0, 0, 128, true);
			}
		}
		if (arg2 < Static6.anInt118 && arg3 < Static178.anInt3591) {
			local12 = Static122.aClass1_Sub17ArrayArrayArray3[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass171_1 != null && local12.aClass171_1.aClass22_10.method4076()) {
				arg0.method4072(local12.aClass171_1.aClass22_10, 128, 0, 128, true);
			}
		}
		if (arg2 < Static6.anInt118 && arg3 > 0) {
			local12 = Static122.aClass1_Sub17ArrayArrayArray3[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass171_1 != null && local12.aClass171_1.aClass22_10.method4076()) {
				arg0.method4072(local12.aClass171_1.aClass22_10, 128, 0, -128, true);
			}
		}
	}
}
