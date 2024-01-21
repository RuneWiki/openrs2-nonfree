import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!c", name = "Db", descriptor = "Lclient!ea;")
	public static Class20 aClass20_9;

	@OriginalMember(owner = "client!c", name = "I", descriptor = "Lclient!ec;")
	private static Class22 aClass22_89 = Static60.method1113("Connection lost");

	@OriginalMember(owner = "client!c", name = "w", descriptor = "Lclient!ec;")
	public static Class22 aClass22_84 = aClass22_89;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "Lclient!ec;")
	public static Class22 aClass22_85 = Static60.method1113(")1j");

	@OriginalMember(owner = "client!c", name = "z", descriptor = "Lclient!ec;")
	public static Class22 aClass22_86 = Static60.method1113("");

	@OriginalMember(owner = "client!c", name = "G", descriptor = "Lclient!ec;")
	private static Class22 aClass22_87 = Static60.method1113("Your profile will be transferred in:");

	@OriginalMember(owner = "client!c", name = "bb", descriptor = "Lclient!ec;")
	private static Class22 aClass22_90 = Static60.method1113("World");

	@OriginalMember(owner = "client!c", name = "H", descriptor = "Lclient!ec;")
	public static Class22 aClass22_88 = aClass22_90;

	@OriginalMember(owner = "client!c", name = "kb", descriptor = "I")
	public static volatile int anInt269 = 0;

	@OriginalMember(owner = "client!c", name = "ob", descriptor = "Lclient!ec;")
	public static Class22 aClass22_91 = aClass22_90;

	@OriginalMember(owner = "client!c", name = "Fb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_92 = aClass22_87;

	@OriginalMember(owner = "client!c", name = "Jb", descriptor = "[I")
	public static int[] anIntArray33 = new int[32768];

	@OriginalMember(owner = "client!c", name = "Pb", descriptor = "I")
	public static int anInt285 = 0;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!qd;B)V")
	public static void method217(@OriginalArg(0) Class4_Sub1_Sub3_Sub2 arg0) {
		if (arg0.anInt2482 == Static117.anInt2877 || arg0.anInt2474 == -1 || arg0.anInt2477 != 0 || arg0.anInt2492 + 1 > Static79.method1437(arg0.anInt2474).anIntArray327[arg0.anInt2483]) {
			@Pc(35) int local35 = arg0.anInt2482 - arg0.anInt2488;
			@Pc(41) int local41 = Static117.anInt2877 - arg0.anInt2488;
			@Pc(51) int local51 = arg0.anInt2473 * 64 + arg0.anInt2479 * 128;
			@Pc(61) int local61 = arg0.anInt2473 * 64 + arg0.anInt2472 * 128;
			@Pc(71) int local71 = arg0.anInt2473 * 64 + arg0.anInt2455 * 128;
			arg0.anInt2500 = ((local35 - local41) * local61 + local71 * local41) / local35;
			@Pc(96) int local96 = arg0.anInt2494 * 128 + arg0.anInt2473 * 64;
			arg0.anInt2462 = (local96 * local41 + local51 * (local35 - local41)) / local35;
		}
		if (arg0.anInt2504 == 0) {
			arg0.anInt2496 = 1024;
		}
		arg0.anInt2458 = 0;
		if (arg0.anInt2504 == 1) {
			arg0.anInt2496 = 1536;
		}
		if (arg0.anInt2504 == 2) {
			arg0.anInt2496 = 0;
		}
		if (arg0.anInt2504 == 3) {
			arg0.anInt2496 = 512;
		}
		arg0.anInt2499 = arg0.anInt2496;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([BZ)Lclient!nf;")
	public static Class4_Sub1_Sub2_Sub4_Sub1 method218(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(24) Class4_Sub1_Sub2_Sub4_Sub1 local24 = new Class4_Sub1_Sub2_Sub4_Sub1(arg0, Static57.anIntArray171, Static61.anIntArray175, Static105.anIntArray297, Static30.anIntArray77, Static27.anIntArray75, Static124.aByteArrayArray9);
			Static57.method1094();
			return local24;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZB)V")
	public static void method219(@OriginalArg(0) boolean arg0) {
		if (Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2500 >> 7 == Static39.anInt971 && Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2462 >> 7 == Static27.anInt620) {
			Static39.anInt971 = 0;
		}
		@Pc(21) int local21 = Static51.anInt1461;
		if (arg0) {
			local21 = 1;
		}
		for (@Pc(27) int local27 = 0; local27 < local21; local27++) {
			@Pc(40) Class4_Sub1_Sub3_Sub2_Sub1 local40;
			@Pc(38) int local38;
			if (arg0) {
				local38 = 33538048;
				local40 = Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1;
			} else {
				local38 = Static115.anIntArray310[local27] << 14;
				local40 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[Static115.anIntArray310[local27]];
			}
			if (local40 != null && local40.method1614()) {
				local40.aBoolean157 = false;
				if ((Static130.aBoolean279 && Static51.anInt1461 > 50 || Static51.anInt1461 > 200) && !arg0 && local40.anInt2470 == local40.anInt2452) {
					local40.aBoolean157 = true;
				}
				@Pc(94) int local94 = local40.anInt2462 >> 7;
				@Pc(99) int local99 = local40.anInt2500 >> 7;
				if (local99 >= 0 && local99 < 104 && local94 >= 0 && local94 < 104) {
					if (local40.aClass4_Sub1_Sub3_Sub3_1 == null || local40.anInt1735 > Static117.anInt2877 || Static117.anInt2877 >= local40.anInt1747) {
						if ((local40.anInt2500 & 0x7F) == 64 && (local40.anInt2462 & 0x7F) == 64) {
							if (Static134.anInt3157 == Static31.anIntArrayArray5[local99][local94]) {
								continue;
							}
							Static31.anIntArrayArray5[local99][local94] = Static134.anInt3157;
						}
						local40.anInt1738 = Static69.method1173(Static37.anInt895, local40.anInt2500, local40.anInt2462);
						Static134.aClass77_1.method1950(Static37.anInt895, local40.anInt2500, local40.anInt2462, local40.anInt1738, 60, local40, local40.anInt2499, local38, local40.aBoolean221);
					} else {
						local40.aBoolean157 = false;
						local40.anInt1738 = Static69.method1173(Static37.anInt895, local40.anInt2500, local40.anInt2462);
						Static134.aClass77_1.method1947(Static37.anInt895, local40.anInt2500, local40.anInt2462, local40.anInt1738, local40, local40.anInt2499, local38, local40.anInt1730, local40.anInt1740, local40.anInt1737, local40.anInt1733);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
	public static void method221() {
		aClass22_90 = null;
		aClass22_88 = null;
		aClass22_91 = null;
		anIntArray33 = null;
		aClass22_92 = null;
		aClass22_84 = null;
		aClass22_85 = null;
		aClass22_89 = null;
		aClass22_87 = null;
		aClass20_9 = null;
		aClass22_86 = null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!f;)Lclient!f;")
	public static Class4_Sub7 method225(@OriginalArg(1) Class4_Sub7 arg0) {
		@Pc(13) int local13 = Static43.method821(Static124.method1890(arg0));
		if (local13 == 0) {
			return null;
		}
		for (@Pc(26) int local26 = 0; local26 < local13; local26++) {
			arg0 = Static106.method1749(arg0.anInt802);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
