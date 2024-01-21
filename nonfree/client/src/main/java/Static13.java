import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "Lclient!oa;")
	public static Class56 aClass56_181 = Static33.method650("::gc");

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "Lclient!oa;")
	public static Class56 aClass56_182 = Static33.method650("Spiel)2Fenster geladen)3");

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "Lclient!oa;")
	public static Class56 aClass56_183 = Static33.method650("Mitglieder)2Welt");

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "Lclient!oa;")
	public static Class56 aClass56_184 = Static33.method650("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "Lclient!td;")
	public static Class3_Sub1_Sub16 aClass3_Sub1_Sub16_1 = null;

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1 = new int[4][13][13];

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!oa;)I")
	public static int method243(@OriginalArg(1) Class56 arg0) {
		if (Static117.anInt2965 == 1) {
			return 7;
		} else if (arg0.method1428(Static92.aClass56_1290)) {
			return 1;
		} else if (arg0.method1428(Static91.aClass56_1270)) {
			return 1;
		} else if (arg0.method1428(Static84.aClass56_1218)) {
			return 2;
		} else if (arg0.method1428(Static95.aClass56_1345)) {
			return 2;
		} else if (arg0.method1428(Static31.aClass56_503)) {
			return 3;
		} else if (arg0.method1428(Static42.aClass56_671)) {
			return 4;
		} else if (arg0.method1428(Static34.aClass56_530)) {
			return 5;
		} else if (arg0.method1428(Static33.aClass56_529)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	public static void method244() {
		aClass3_Sub1_Sub16_1 = null;
		aClass56_181 = null;
		aClass56_183 = null;
		aClass56_184 = null;
		aClass56_182 = null;
		anIntArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public static void method245() {
		@Pc(10) int local10 = Static31.aClass3_Sub2_Sub1_3.method323(8);
		@Pc(19) int local19;
		if (local10 < Static110.anInt2767) {
			for (local19 = local10; local19 < Static110.anInt2767; local19++) {
				Static7.anIntArray28[Static50.anInt1424++] = Static54.anIntArray108[local19];
			}
		}
		if (Static110.anInt2767 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static110.anInt2767 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(61) int local61 = Static54.anIntArray108[local19];
			@Pc(65) Class3_Sub1_Sub2_Sub4_Sub1 local65 = Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local61];
			@Pc(70) int local70 = Static31.aClass3_Sub2_Sub1_3.method323(1);
			if (local70 == 0) {
				Static54.anIntArray108[Static110.anInt2767++] = local61;
				local65.anInt3147 = Static98.anInt2566;
			} else {
				@Pc(90) int local90 = Static31.aClass3_Sub2_Sub1_3.method323(2);
				if (local90 == 0) {
					Static54.anIntArray108[Static110.anInt2767++] = local61;
					local65.anInt3147 = Static98.anInt2566;
					Static79.anIntArray186[Static60.anInt1776++] = local61;
				} else {
					@Pc(137) int local137;
					@Pc(147) int local147;
					if (local90 == 1) {
						Static54.anIntArray108[Static110.anInt2767++] = local61;
						local65.anInt3147 = Static98.anInt2566;
						local137 = Static31.aClass3_Sub2_Sub1_3.method323(3);
						local65.method2034(false, local137);
						local147 = Static31.aClass3_Sub2_Sub1_3.method323(1);
						if (local147 == 1) {
							Static79.anIntArray186[Static60.anInt1776++] = local61;
						}
					} else if (local90 == 2) {
						Static54.anIntArray108[Static110.anInt2767++] = local61;
						local65.anInt3147 = Static98.anInt2566;
						local137 = Static31.aClass3_Sub2_Sub1_3.method323(3);
						local65.method2034(true, local137);
						local147 = Static31.aClass3_Sub2_Sub1_3.method323(3);
						local65.method2034(true, local147);
						@Pc(201) int local201 = Static31.aClass3_Sub2_Sub1_3.method323(1);
						if (local201 == 1) {
							Static79.anIntArray186[Static60.anInt1776++] = local61;
						}
					} else if (local90 == 3) {
						Static7.anIntArray28[Static50.anInt1424++] = local61;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)Z")
	public static boolean method246(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}
}
