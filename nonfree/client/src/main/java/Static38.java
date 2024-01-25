import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bm", name = "C", descriptor = "[Lclient!xa;")
	public static Class119[] aClass119Array3;

	@OriginalMember(owner = "client!bm", name = "A", descriptor = "Lclient!hb;")
	public static final Class117 aClass117_2 = new Class117(13, 3);

	@OriginalMember(owner = "client!bm", name = "B", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_22 = new Class133(95, 1);

	@OriginalMember(owner = "client!bm", name = "D", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_23 = new Class133(91, 4);

	@OriginalMember(owner = "client!bm", name = "E", descriptor = "I")
	public static int anInt992 = 0;

	@OriginalMember(owner = "client!bm", name = "F", descriptor = "[F")
	public static final float[] aFloatArray5 = new float[4];

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!oa;IILclient!q;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method932(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class205 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static263.aClass5_9 = arg0;
		Static24.anInt753 = arg1;
		Static531.aClass205_6 = arg3;
		Static531.aBoolean676 = Static263.aClass5_9.method7479() > 0;
		Static227.anInt4884 = arg4 >> Static33.anInt880;
		Static320.anInt6157 = arg6 >> Static33.anInt880;
		Static184.anInt4224 = arg4;
		Static371.anInt6982 = arg6;
		Static122.anInt2785 = arg5;
		Static165.anInt3845 = Static227.anInt4884 - Static345.anInt6586;
		if (Static165.anInt3845 < 0) {
			Static331.anInt6307 = -Static165.anInt3845;
			Static165.anInt3845 = 0;
		} else {
			Static331.anInt6307 = 0;
		}
		Static407.anInt7474 = Static320.anInt6157 - Static345.anInt6586;
		if (Static407.anInt7474 < 0) {
			Static80.anInt1724 = -Static407.anInt7474;
			Static407.anInt7474 = 0;
		} else {
			Static80.anInt1724 = 0;
		}
		Static44.anInt1046 = Static227.anInt4884 + Static345.anInt6586;
		if (Static44.anInt1046 > Static126.anInt2626) {
			Static44.anInt1046 = Static126.anInt2626;
		}
		Static33.anInt875 = Static320.anInt6157 + Static345.anInt6586;
		if (Static33.anInt875 > Static108.anInt2385) {
			Static33.anInt875 = Static108.anInt2385;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static345.anInt6586 + Static345.anInt6586 + 2; local74++) {
			for (local77 = 0; local77 < Static345.anInt6586 + Static345.anInt6586 + 2; local77++) {
				local84 = Static227.anInt4884 + local74 - Static345.anInt6586;
				local90 = Static320.anInt6157 + local77 - Static345.anInt6586;
				if (local84 >= 0 && local90 >= 0 && local84 < Static126.anInt2626 && local90 < Static108.anInt2385) {
					@Pc(104) int local104 = local84 << Static33.anInt880;
					@Pc(108) int local108 = local90 << Static33.anInt880;
					@Pc(124) int local124 = Static163.aClass52Array4[Static163.aClass52Array4.length - 1].JA(local84, local90) - (0x3E8 << Static33.anInt880 - 7);
					@Pc(144) int local144 = Static238.aClass52Array2 == null ? Static163.aClass52Array4[0].JA(local84, local90) + Static219.anInt4777 : Static238.aClass52Array2[0].JA(local84, local90) + Static219.anInt4777;
					Static131.aBooleanArrayArray4[local74][local77] = Static263.aClass5_9.FA(local104, local124, local108, local104, local144, local108);
				} else {
					Static131.aBooleanArrayArray4[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static345.anInt6586 + Static345.anInt6586 + 1; local77++) {
			for (local84 = 0; local84 < Static345.anInt6586 + Static345.anInt6586 + 1; local84++) {
				Static30.aBooleanArrayArray3[local77][local84] = Static131.aBooleanArrayArray4[local77][local84] || Static131.aBooleanArrayArray4[local77 + 1][local84] || Static131.aBooleanArrayArray4[local77][local84 + 1] || Static131.aBooleanArrayArray4[local77 + 1][local84 + 1];
			}
		}
		Static7.anIntArray96 = arg8;
		Static7.anIntArray95 = arg9;
		Static451.anIntArray707 = arg10;
		Static216.anIntArray225 = arg11;
		Static253.anIntArray454 = arg12;
		Static390.method5969();
		Static348.method5672(Static263.aClass5_9);
		for (@Pc(261) Class4_Sub1 local261 = (Class4_Sub1) Static210.aClass90_9.method2326(); local261 != null; local261 = (Class4_Sub1) Static210.aClass90_9.method2325()) {
			local261.method7407();
			Static216.method1968(local261);
		}
		if (Static531.aBoolean676) {
			for (local90 = 0; local90 < Static84.anInt1836; local90++) {
				Static513.aClass103Array1[local90].method2647(arg17, arg1);
			}
		}
		if (arg2 > 1) {
			Static263.aClass5_9.method7454(0);
			if (Static442.aClass7_1 == null || Static442.aClass7_1 instanceof Class7_Sub2) {
				Static442.aClass7_1 = new Class7_Sub1();
			}
		} else if (Static442.aClass7_1 == null || Static442.aClass7_1 instanceof Class7_Sub1) {
			Static442.aClass7_1 = new Class7_Sub2();
		}
		Static442.aClass7_1.method1153(arg2);
		Static442.aClass7_1.method1155();
		if (Static23.aClass290ArrayArrayArray9 != null) {
			Static124.method7288(true);
			Static442.aClass7_1.method1154(22);
			Static444.method6749(arg2, null, 0, (byte) 0, arg15, arg16);
			Static442.aClass7_1.method1155();
			Static442.aClass7_1.method1154(23);
			Static124.method7288(false);
		}
		Static444.method6749(arg2, arg7, arg13, arg14, arg15, arg16);
		Static442.aClass7_1.method1155();
		Static442.aClass7_1.method1152();
		Static442.aClass7_1.method1155();
		if (arg2 > 1) {
			Static263.aClass5_9.method7438(0);
		}
		Static263.aClass5_9.method7460(0, null);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)V")
	public static void method933(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static152.anInt3124 = arg0 - Static55.anInt1978;
		Static531.anInt9235 = arg1 - Static55.anInt1974;
	}
}
