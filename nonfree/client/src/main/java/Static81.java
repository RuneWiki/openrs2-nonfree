import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "[Lclient!bi;")
	public static Class4_Sub2_Sub1[] aClass4_Sub2_Sub1Array10;

	@OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
	public static int anInt4033;

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
	public static int anInt4013 = 0;

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
	public static int anInt4025 = 0;

	@OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
	public static int anInt4026 = 0;

	@OriginalMember(owner = "client!fl", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString129 = "Loading textures - ";

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
	public static void method3267() {
		try {
			if (Static42.anInt863 == 1) {
				@Pc(11) int local11 = Static67.aClass4_Sub9_Sub2_1.method1176();
				if (local11 > 0 && Static67.aClass4_Sub9_Sub2_1.method1175()) {
					local11 -= Static57.anInt1137;
					if (local11 < 0) {
						local11 = 0;
					}
					Static67.aClass4_Sub9_Sub2_1.method1169(local11);
					return;
				}
				Static67.aClass4_Sub9_Sub2_1.method1208();
				Static67.aClass4_Sub9_Sub2_1.method1178();
				Static196.aClass4_Sub18_2 = null;
				Static2.aClass102_1 = null;
				if (Static125.aClass98_78 == null) {
					Static42.anInt863 = 0;
				} else {
					Static42.anInt863 = 2;
				}
			}
		} catch (@Pc(51) Exception local51) {
			local51.printStackTrace();
			Static67.aClass4_Sub9_Sub2_1.method1208();
			Static196.aClass4_Sub18_2 = null;
			Static2.aClass102_1 = null;
			Static42.anInt863 = 0;
			Static125.aClass98_78 = null;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILclient!cc;)V")
	public static void method3274(@OriginalArg(1) Class22 arg0) {
		if (arg0.anInt540 == Static236.anInt3712) {
			Static222.aBooleanArray20[arg0.anInt586] = true;
		}
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V")
	public static void method3275() {
		if (Static147.aClass51_3 != null) {
			Static147.aClass51_3.method3286();
		}
		if (Static83.aClass51_4 != null) {
			Static83.aClass51_4.method3286();
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!cc;BII)V")
	public static void method3279(@OriginalArg(0) Class22 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static60.anInt1152 < 2 && Static216.anInt4288 == 0 && !Static26.aBoolean30) {
			return;
		}
		@Pc(24) String local24 = Static145.method2348();
		if (arg0 == null) {
			@Pc(41) int local41 = Static289.aClass4_Sub2_Sub12_3.method4182(local24, arg2 + 4, arg1 + 15, Static103.aRandom1, Static207.anInt4059);
			Static115.method1995(arg1, 15, arg2 + 4, Static289.aClass4_Sub2_Sub12_3.method4195(local24) + local41);
			return;
		}
		@Pc(60) Class4_Sub2_Sub12 local60 = arg0.method468(Static88.aClass59Array2);
		if (local60 == null) {
			local60 = Static289.aClass4_Sub2_Sub12_3;
		}
		local60.method4187(local24, arg2, arg1, arg0.anInt546, arg0.anInt602, arg0.anInt585, arg0.anInt543, arg0.anInt564, arg0.anInt603, Static103.aRandom1, Static207.anInt4059, Static197.anIntArray323);
		Static115.method1995(Static197.anIntArray323[1], Static197.anIntArray323[3], Static197.anIntArray323[0], Static197.anIntArray323[2]);
	}

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V")
	public static void method3281() {
		aString129 = null;
		aClass4_Sub2_Sub1Array10 = null;
		aByteArrayArray16 = null;
		aByteArrayArrayArray15 = null;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method3282() {
		@Pc(11) String local11 = "www";
		if (Static251.anInt4743 != 0) {
			local11 = "www-wtqa";
		}
		@Pc(21) String local21 = "";
		if (Static90.aString56 != null) {
			local21 = "/p=" + Static90.aString56;
		}
		return "http://" + local11 + ".runescape.com/l=" + Static139.anInt2870 + "/a=" + Static168.anInt3340 + local21 + "/";
	}
}
