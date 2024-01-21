import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "[Lclient!e;")
	public static Class2_Sub1_Sub4_Sub1[] aClass2_Sub1_Sub4_Sub1Array4;

	@OriginalMember(owner = "client!g", name = "o", descriptor = "I")
	public static int anInt791;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Z")
	public static boolean aBoolean33 = false;

	@OriginalMember(owner = "client!g", name = "r", descriptor = "Lclient!pe;")
	private static Class65 aClass65_370 = Static119.method1462("Loaded config");

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Lclient!pe;")
	public static Class65 aClass65_368 = aClass65_370;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "I")
	public static int anInt787 = 0;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "Lclient!pe;")
	public static Class65 aClass65_369 = Static119.method1462("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!g", name = "p", descriptor = "Lclient!jb;")
	public static Class40 aClass40_9 = new Class40(32);

	@OriginalMember(owner = "client!g", name = "s", descriptor = "Lclient!pe;")
	private static Class65 aClass65_371 = Static119.method1462("To create a new account you need to");

	@OriginalMember(owner = "client!g", name = "t", descriptor = "[I")
	public static int[] anIntArray99 = new int[50];

	@OriginalMember(owner = "client!g", name = "u", descriptor = "Lclient!pe;")
	public static Class65 aClass65_372 = aClass65_371;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method634(@OriginalArg(1) Component arg0) {
		@Pc(5) Method local5 = Static24.aMethod2;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static96.aClass43_1);
		arg0.addFocusListener(Static96.aClass43_1);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZ[B)I")
	public static int method635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(10) int local10 = -1;
		for (@Pc(12) int local12 = arg1; local12 < arg0; local12++) {
			local10 = local10 >>> 8 ^ Class2_Sub1_Sub17.anIntArray409[(local10 ^ arg2[local12]) & 0xFF];
		}
		return ~local10;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public static void method636() {
		aClass65_370 = null;
		aClass65_371 = null;
		aClass40_9 = null;
		aClass65_368 = null;
		aClass65_369 = null;
		aClass2_Sub1_Sub4_Sub1Array4 = null;
		aClass65_372 = null;
		anIntArray99 = null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!wa;II)V")
	public static void method637(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub22 arg1, @OriginalArg(2) int arg2) {
		if (Static52.aClass2_Sub22_6 != null || Static3.aBoolean5 || (arg1 == null || Static1.method14(arg1) == null)) {
			return;
		}
		Static52.aClass2_Sub22_6 = arg1;
		Static82.aClass2_Sub22_17 = Static1.method14(arg1);
		Static23.anInt1753 = 0;
		Static48.anInt1180 = arg0;
		Static60.anInt460 = arg2;
		Static26.aBoolean24 = false;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIB)V")
	public static void method638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static42.anInt1052 == arg3 && Static50.anInt1210 == arg1 && (Static37.anInt812 == arg4 || !Static48.aBoolean47)) {
			return;
		}
		Static37.anInt812 = arg4;
		Static50.anInt1210 = arg1;
		Static42.anInt1052 = arg3;
		if (!Static48.aBoolean47) {
			Static37.anInt812 = 0;
		}
		Static98.method1604(25);
		Static20.method338(Static37.aClass65_390, true);
		@Pc(48) int local48 = Static66.anInt1577;
		@Pc(50) int local50 = anInt791;
		Static66.anInt1577 = arg1 * 8 - 48;
		anInt791 = arg3 * 8 - 48;
		@Pc(67) int local67 = Static66.anInt1577 - local48;
		@Pc(74) int local74 = anInt791 - local50;
		for (@Pc(78) int local78 = 0; local78 < 32768; local78++) {
			@Pc(84) Class2_Sub1_Sub1_Sub4_Sub2 local84 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local78];
			if (local84 != null) {
				for (@Pc(88) int local88 = 0; local88 < 10; local88++) {
					local84.anIntArray263[local88] -= local74;
					local84.anIntArray264[local88] -= local67;
				}
				local84.anInt1948 -= local74 * 128;
				local84.anInt1958 -= local67 * 128;
			}
		}
		for (@Pc(132) int local132 = 0; local132 < 2048; local132++) {
			@Pc(138) Class2_Sub1_Sub1_Sub4_Sub1 local138 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local132];
			if (local138 != null) {
				for (@Pc(142) int local142 = 0; local142 < 10; local142++) {
					local138.anIntArray263[local142] -= local74;
					local138.anIntArray264[local142] -= local67;
				}
				local138.anInt1948 -= local74 * 128;
				local138.anInt1958 -= local67 * 128;
			}
		}
		@Pc(188) byte local188 = 104;
		@Pc(190) byte local190 = 1;
		Static59.anInt1479 = arg4;
		Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.method1468(false, arg0, arg2);
		@Pc(202) byte local202 = 0;
		if (local74 < 0) {
			local190 = -1;
			local202 = 103;
			local188 = -1;
		}
		@Pc(212) byte local212 = 104;
		@Pc(214) byte local214 = 0;
		@Pc(216) byte local216 = 1;
		if (local67 < 0) {
			local216 = -1;
			local214 = 103;
			local212 = -1;
		}
		for (@Pc(229) int local229 = local202; local229 != local188; local229 += local190) {
			for (@Pc(233) int local233 = local214; local233 != local212; local233 += local216) {
				@Pc(239) int local239 = local74 + local229;
				@Pc(243) int local243 = local233 + local67;
				for (@Pc(245) int local245 = 0; local245 < 4; local245++) {
					if (local239 >= 0 && local243 >= 0 && local239 < 104 && local243 < 104) {
						Static76.aClass13ArrayArrayArray1[local245][local229][local233] = Static76.aClass13ArrayArrayArray1[local245][local239][local243];
					} else {
						Static76.aClass13ArrayArrayArray1[local245][local229][local233] = null;
					}
				}
			}
		}
		for (@Pc(311) Class2_Sub18 local311 = (Class2_Sub18) Static23.aClass13_12.method270(); local311 != null; local311 = (Class2_Sub18) Static23.aClass13_12.method273()) {
			local311.anInt2501 -= local67;
			local311.anInt2499 -= local74;
			if (local311.anInt2499 < 0 || local311.anInt2501 < 0 || local311.anInt2499 >= 104 || local311.anInt2501 >= 104) {
				local311.method2053();
			}
		}
		Static68.anInt2858 = -1;
		Static38.aBoolean36 = false;
		if (Static72.anInt1648 != 0) {
			Static72.anInt1648 -= local74;
			Static120.anInt2599 -= local67;
		}
		Static50.anInt1215 = 0;
		Static67.aClass13_10.method275();
		Static124.aClass13_18.method275();
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	public static void method639() {
		for (@Pc(5) int local5 = 0; local5 < Static33.anInt761; local5++) {
			@Pc(10) int local10 = Static68.anIntArray376[local5];
			@Pc(14) Class2_Sub1_Sub1_Sub4_Sub1 local14 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local10];
			@Pc(18) int local18 = Static66.aClass2_Sub4_Sub1_2.method933();
			if ((local18 & 0x2) != 0) {
				local18 += Static66.aClass2_Sub4_Sub1_2.method933() << 8;
			}
			Static17.method266(local18, local10, local14);
		}
	}
}
