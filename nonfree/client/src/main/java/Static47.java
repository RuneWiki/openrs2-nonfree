import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!db", name = "b", descriptor = "I")
	public static int anInt881;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "Lclient!fh;")
	public static Class58 aClass58_23;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "[I")
	public static int[] anIntArray63;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	public static int anInt889;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "I")
	public static int anInt890;

	@OriginalMember(owner = "client!db", name = "h", descriptor = "I")
	public static int anInt885 = 0;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "Lclient!ue;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "Lclient!fe;")
	public static Class56_Sub1 aClass56_Sub1_1 = null;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "Z")
	public static boolean aBoolean52 = false;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "I")
	public static int anInt891 = 0;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public static void method734() {
		while (true) {
			if (Static189.aClass4_Sub10_Sub1_2.method4688(Static21.anInt1052) >= 27) {
				@Pc(22) int local22 = Static189.aClass4_Sub10_Sub1_2.method4689(15);
				if (local22 != 32767) {
					@Pc(31) boolean local31 = false;
					if (Static110.aClass53_Sub1_Sub2Array1[local22] == null) {
						local31 = true;
						Static110.aClass53_Sub1_Sub2Array1[local22] = new Class53_Sub1_Sub2();
					}
					@Pc(49) Class53_Sub1_Sub2 local49 = Static110.aClass53_Sub1_Sub2Array1[local22];
					Static278.anIntArray595[Static236.anInt4452++] = local22;
					local49.anInt3990 = Static50.anInt954;
					if (local49.aClass171_1 != null && local49.aClass171_1.method4297()) {
						Static181.method2944(local49);
					}
					@Pc(77) int local77 = Static189.aClass4_Sub10_Sub1_2.method4689(5);
					if (local77 > 15) {
						local77 -= 32;
					}
					@Pc(89) int local89 = Static18.anIntArray27[Static189.aClass4_Sub10_Sub1_2.method4689(3)];
					if (local31) {
						local49.anInt4017 = local49.anInt4031 = local89;
					}
					@Pc(102) int local102 = Static189.aClass4_Sub10_Sub1_2.method4689(5);
					local49.method3330(Static84.method1495(Static189.aClass4_Sub10_Sub1_2.method4689(14)));
					@Pc(116) int local116 = Static189.aClass4_Sub10_Sub1_2.method4689(1);
					if (local102 > 15) {
						local102 -= 32;
					}
					if (local116 == 1) {
						Static275.anIntArray587[Static250.anInt4761++] = local22;
					}
					@Pc(139) int local139 = Static189.aClass4_Sub10_Sub1_2.method4689(1);
					local49.method3329(local49.aClass171_1.anInt5263);
					local49.anInt3986 = local49.aClass171_1.anInt5262;
					local49.anInt4009 = local49.aClass171_1.anInt5244;
					if (local49.anInt4009 == 0) {
						local49.anInt4031 = 0;
					}
					local49.method3314(Static154.aClass53_Sub1_Sub1_2.anIntArray426[0] + local77, local49.method3324(), local102 + Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], local139 == 1);
					if (local49.aClass171_1.method4297()) {
						Static7.method109(null, local49.anIntArray422[0], local49, local49.anIntArray426[0], null, 0, Static281.anInt5335);
					}
					continue;
				}
			}
			Static189.aClass4_Sub10_Sub1_2.method4681();
			return;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)I")
	public static int method735(@OriginalArg(1) boolean arg0) {
		@Pc(13) long local13 = Static101.method1677();
		for (@Pc(27) Class4_Sub5 local27 = arg0 ? (Class4_Sub5) Static289.aClass85_25.method1843() : (Class4_Sub5) Static289.aClass85_25.method1844(); local27 != null; local27 = (Class4_Sub5) Static289.aClass85_25.method1844()) {
			if (local13 > (local27.aLong17 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local27.aLong17 & 0x4000000000000000L) != 0L) {
					@Pc(55) int local55 = (int) local27.aLong217;
					Static2.anIntArray2[local55] = Static46.anIntArray62[local55];
					local27.method4854();
					return local55;
				}
				local27.method4854();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIII)V")
	public static void method736(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 1 || arg2 < 1 || arg5 > 102 || arg2 > 102) {
			return;
		}
		@Pc(39) int local39;
		if (!Static29.method456() && (Static174.aByteArrayArrayArray17[0][arg5][arg2] & 0x2) == 0) {
			local39 = arg0;
			if ((Static174.aByteArrayArrayArray17[arg0][arg5][arg2] & 0x8) != 0) {
				local39 = 0;
			}
			if (local39 != Static60.anInt1216) {
				return;
			}
		}
		local39 = arg0;
		if (arg0 < 3 && (Static174.aByteArrayArrayArray17[1][arg5][arg2] & 0x2) == 2) {
			local39 = arg0 + 1;
		}
		Static135.method2019(arg0, local39, arg2, Static296.aClass30Array1[arg0], arg3, arg5);
		if (arg4 >= 0) {
			@Pc(97) boolean local97 = Static117.aBoolean159;
			Static117.aBoolean159 = true;
			Static143.method2194(arg1, arg0, arg4, local39, arg5, false, arg2, Static296.aClass30Array1[arg0], false, arg6);
			Static117.aBoolean159 = local97;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method737(@OriginalArg(1) String arg0) {
		return Static229.method3651(10, arg0);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!f;)V")
	public static void method739(@OriginalArg(1) Class53_Sub1_Sub1 arg0) {
		@Pc(19) Class4_Sub11 local19 = (Class4_Sub11) Static206.aClass85_18.method1845(Static108.method1747(arg0.aString88));
		if (local19 == null) {
			return;
		}
		if (local19.aClass4_Sub6_Sub4_3 != null) {
			Static211.aClass4_Sub6_Sub3_2.method2683(local19.aClass4_Sub6_Sub4_3);
			local19.aClass4_Sub6_Sub4_3 = null;
		}
		local19.method4854();
	}
}
