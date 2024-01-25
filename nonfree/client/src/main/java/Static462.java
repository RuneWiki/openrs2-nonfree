import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
	public static int anInt7532;

	@OriginalMember(owner = "client!wv", name = "r", descriptor = "I")
	public static int anInt7543;

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
	public static final int anInt7531 = 2;

	@OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
	public static int anInt7537 = 500;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V")
	public static void method6051() {
		@Pc(5) Class44 local5 = Static74.aClass44_9;
		synchronized (Static74.aClass44_9) {
			Static74.aClass44_9.method1031();
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZI)V")
	public static void method6052(@OriginalArg(0) boolean arg0) {
		Static217.anInt3644 = 0;
		Static182.anInt3087 = 0;
		Static340.method4407();
		Static70.method1069(arg0);
		Static239.method4852();
		@Pc(18) boolean local18 = false;
		@Pc(30) int local30;
		for (@Pc(24) int local24 = 0; local24 < Static217.anInt3644; local24++) {
			local30 = Static419.anIntArray477[local24];
			@Pc(37) Class5_Sub7 local37 = (Class5_Sub7) Static380.aClass252_36.method5659((long) local30);
			@Pc(40) Class2_Sub1_Sub3_Sub1 local40 = local37.aClass2_Sub1_Sub3_Sub1_1;
			if (Static272.aBoolean283 && Static178.method4589(local30)) {
				Static284.method3503();
			}
			if (local40.anInt6163 != Static85.anInt1536) {
				if (local40.aClass131_1.method2779()) {
					Static166.method2328(local40);
				}
				local40.method4091(null);
				local37.method6003();
				local18 = true;
			}
		}
		if (local18) {
			Static111.anInt1879 = Static380.aClass252_36.method5665();
			Static380.aClass252_36.method5662(Static277.aClass5_Sub7Array1);
		}
		if (Static76.aClass5_Sub15_Sub2_1.anInt7013 != Static128.anInt2223) {
			throw new RuntimeException("gnp1 pos:" + Static76.aClass5_Sub15_Sub2_1.anInt7013 + " psize:" + Static128.anInt2223);
		}
		for (local30 = 0; local30 < Static424.anInt7114; local30++) {
			if (Static380.aClass252_36.method5659((long) Static218.anIntArray351[local30]) == null) {
				throw new RuntimeException("gnp2 pos:" + local30 + " size:" + Static424.anInt7114);
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(B)V")
	public static void method6053() {
		Static348.aClass200_7.JA(((float) Static216.aClass1_Sub1_1.anInt4515 * 0.1F + 0.7F) * 1.1523438F);
		Static348.aClass200_7.B(Static331.anInt5294, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static348.aClass200_7.Q(Static226.anInt3766, -1, 256);
		Static348.aClass200_7.method5826(Static191.aClass24_1);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
	public static void method6054() {
		if (Static282.anInt4369 < 0) {
			Static390.anInt6394 = -1;
			Static282.anInt4369 = 0;
			Static438.anInt7278 = -1;
		}
		if (Static98.anInt3334 < Static282.anInt4369) {
			Static282.anInt4369 = Static98.anInt3334;
			Static390.anInt6394 = -1;
			Static438.anInt7278 = -1;
		}
		if (Static110.anInt1841 < 0) {
			Static110.anInt1841 = 0;
			Static390.anInt6394 = -1;
			Static438.anInt7278 = -1;
		}
		if (Static110.anInt1841 > Static98.anInt3331) {
			Static390.anInt6394 = -1;
			Static438.anInt7278 = -1;
			Static110.anInt1841 = Static98.anInt3331;
		}
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)V")
	public static void method6055() {
		if (Static346.aClass170_9 != Static350.aClass170_10) {
			try {
				Static471.method4680("tbrefresh", Static440.aClient1);
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!aa;Z)Z")
	public static boolean method6056(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static410.aClass125Array3 == Static408.aClass125Array2;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method6032();
		if (arg0.aShort107 < 0 || arg0.aShort106 < 0 || arg0.aShort104 >= Static439.anInt7318 || arg0.aShort105 >= Static459.anInt4775) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort107; local34 <= arg0.aShort104; local34++) {
			for (local38 = arg0.aShort106; local38 <= arg0.aShort105; local38++) {
				@Pc(45) Class258 local45 = Static121.method1714(arg0.aByte105, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort107) {
						local49++;
					}
					if (local34 < arg0.aShort104) {
						local49 += 4;
					}
					if (local38 > arg0.aShort106) {
						local49 += 8;
					}
					if (local38 < arg0.aShort105) {
						local49 += 2;
					}
					@Pc(74) Class122 local74 = Static448.method5906(arg0, local49);
					@Pc(77) Class122 local77 = local45.aClass122_3;
					if (local77 == null) {
						local45.aClass122_3 = local74;
					} else {
						while (local77.aClass122_1 != null) {
							local77 = local77.aClass122_1;
						}
						local77.aClass122_1 = local74;
					}
					local45.aByte97 = (byte) (local45.aByte97 | local49);
					if (local6 && (Static419.anIntArrayArray62[local34][local38] & 0xFF000000) != 0) {
						local8 = Static419.anIntArrayArray62[local34][local38];
						local10 = Static130.aShortArrayArray6[local34][local38];
						local12 = Static145.aByteArrayArray5[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort107; local38 <= arg0.aShort104; local38++) {
				for (@Pc(150) int local150 = arg0.aShort106; local150 <= arg0.aShort105; local150++) {
					if ((Static419.anIntArrayArray62[local38][local150] & 0xFF000000) == 0) {
						Static419.anIntArrayArray62[local38][local150] = local8;
						Static130.aShortArrayArray6[local38][local150] = local10;
						Static145.aByteArrayArray5[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static430.aClass2_Sub1Array3[Static371.anInt6082++] = arg0;
		}
		return true;
	}
}
