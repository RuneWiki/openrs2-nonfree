import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "Lclient!l;")
	public static Class57 aClass57_23;

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
	public static int anInt6258;

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
	public static int anInt6259;

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
	public static int anInt6260;

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_57 = new Class198(30);

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
	public static int anInt6256 = -1;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_58 = new Class198(2);

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString233 = "Opened title screen";

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
	public static int anInt6261 = 0;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5307(@OriginalArg(0) String arg0) {
		Static306.method5148(0, 0, arg0, "", "");
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BZ)V")
	public static void method5308(@OriginalArg(1) boolean arg0) {
		Static123.method2158();
		if (Static266.anInt5370 != 30 && Static266.anInt5370 != 25) {
			return;
		}
		Static179.anInt3791++;
		if (Static179.anInt3791 < 50 && !arg0) {
			return;
		}
		Static179.anInt3791 = 0;
		if (!Static273.aBoolean343 && Static76.aClass16_2 != null) {
			Static291.aClass3_Sub4_Sub2_3.method3682(135);
			try {
				Static76.aClass16_2.method397(Static291.aClass3_Sub4_Sub2_3.aByteArray70, Static291.aClass3_Sub4_Sub2_3.anInt4268);
				Static291.aClass3_Sub4_Sub2_3.anInt4268 = 0;
			} catch (@Pc(62) IOException local62) {
				Static273.aBoolean343 = true;
			}
		}
		Static123.method2158();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!vo;)V")
	public static void method5310(@OriginalArg(1) Class3_Sub42 arg0) {
		if (Static256.aClass45ArrayArrayArray2 == null) {
			return;
		}
		@Pc(8) Interface5 local8 = null;
		if (arg0.anInt6539 == 0) {
			local8 = (Interface5) Static132.method2235(arg0.anInt6538, arg0.anInt6544, arg0.anInt6546);
		}
		if (arg0.anInt6539 == 1) {
			local8 = (Interface5) Static2.method11(arg0.anInt6538, arg0.anInt6544, arg0.anInt6546);
		}
		if (arg0.anInt6539 == 2) {
			local8 = (Interface5) Static134.method2239(arg0.anInt6538, arg0.anInt6544, arg0.anInt6546, lk.class);
		}
		if (arg0.anInt6539 == 3) {
			local8 = (Interface5) Static135.method2262(arg0.anInt6538, arg0.anInt6544, arg0.anInt6546);
		}
		if (local8 == null) {
			arg0.anInt6551 = 0;
			arg0.anInt6547 = 0;
			arg0.anInt6548 = -1;
		} else {
			arg0.anInt6548 = local8.method5344();
			arg0.anInt6547 = local8.method5342();
			arg0.anInt6551 = local8.method5337();
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
	public static void method5311() {
		Static181.aClass198_14.method5230();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
	public static void method5312() {
		if (Static306.anInt6045 != -1) {
			Static174.method2864(Static306.anInt6045, -1, -1, false);
			Static306.anInt6045 = -1;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIII)V")
	public static void method5313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class3_Sub7_Sub11 local8 = Static116.method2029(arg1, 4);
		local8.method2509();
		local8.anInt3053 = arg2;
		local8.anInt3054 = arg3;
		local8.anInt3057 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!tj;IILclient!ug;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method5314(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class56 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static140.aClass122_3 = arg0;
		Static268.anInt5408 = arg1;
		Static147.aClass56_2 = arg3;
		Static201.aBoolean235 = Static140.aClass122_3.method4800() > 0;
		Static74.anInt1441 = arg4 >> 7;
		Static89.anInt6705 = arg6 >> 7;
		Static55.anInt5576 = arg4;
		Static300.anInt5966 = arg6;
		Static221.anInt4559 = arg5;
		Static309.anInt6136 = Static74.anInt1441 - Static14.anInt494;
		if (Static309.anInt6136 < 0) {
			Static113.anInt6413 = -Static309.anInt6136;
			Static309.anInt6136 = 0;
		} else {
			Static113.anInt6413 = 0;
		}
		Static88.anInt1752 = Static89.anInt6705 - Static14.anInt494;
		if (Static88.anInt1752 < 0) {
			Static63.anInt1294 = -Static88.anInt1752;
			Static88.anInt1752 = 0;
		} else {
			Static63.anInt1294 = 0;
		}
		Static127.anInt2725 = Static74.anInt1441 + Static14.anInt494;
		if (Static127.anInt2725 > Static103.anInt2156) {
			Static127.anInt2725 = Static103.anInt2156;
		}
		Static36.anInt806 = Static89.anInt6705 + Static14.anInt494;
		if (Static36.anInt806 > Static116.anInt2499) {
			Static36.anInt806 = Static116.anInt2499;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static14.anInt494 + Static14.anInt494 + 2; local74++) {
			for (local77 = 0; local77 < Static14.anInt494 + Static14.anInt494 + 2; local77++) {
				local84 = Static74.anInt1441 + local74 - Static14.anInt494;
				local90 = Static89.anInt6705 + local77 - Static14.anInt494;
				if (local84 >= 0 && local90 >= 0 && local84 < Static103.anInt2156 && local90 < Static116.anInt2499) {
					@Pc(104) int local104 = local84 << 7;
					@Pc(108) int local108 = local90 << 7;
					@Pc(117) int local117 = Static355.aClass22Array3[3].method4672(local84, local90) - 1000;
					@Pc(137) int local137 = Static182.aClass22Array2 == null ? Static355.aClass22Array3[0].method4672(local84, local90) + 128 : Static182.aClass22Array2[0].method4672(local84, local90) + 128;
					Static108.aBooleanArrayArray15[local74][local77] = Static140.aClass122_3.method4713(local104, local117, local108, local104, local137, local108);
				} else {
					Static108.aBooleanArrayArray15[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static14.anInt494 + Static14.anInt494 + 1; local77++) {
			for (local84 = 0; local84 < Static14.anInt494 + Static14.anInt494 + 1; local84++) {
				Static192.aBooleanArrayArray9[local77][local84] = Static108.aBooleanArrayArray15[local77][local84] || Static108.aBooleanArrayArray15[local77 + 1][local84] || Static108.aBooleanArrayArray15[local77][local84 + 1] || Static108.aBooleanArrayArray15[local77 + 1][local84 + 1];
			}
		}
		Static97.anIntArray119 = arg8;
		Static84.anIntArray100 = arg9;
		Static154.anIntArray530 = arg10;
		Static176.anIntArray481 = arg11;
		Static1.anIntArray1 = arg12;
		Static168.method2717();
		Static74.method1133();
		for (@Pc(253) Class8_Sub7 local253 = (Class8_Sub7) Static35.aClass65_5.method1462(); local253 != null; local253 = (Class8_Sub7) Static35.aClass65_5.method1461()) {
			local253.method4645();
			Static93.method1567(local253);
		}
		if (Static201.aBoolean235) {
			for (local90 = 0; local90 < Static321.anInt6217; local90++) {
				Static13.aClass3_Sub13_Sub1Array3[local90].method5601(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static140.aClass122_3.method4729(0);
			if (Static71.aClass103_3 == null || Static71.aClass103_3 instanceof Class103_Sub1) {
				Static71.aClass103_3 = new Class103_Sub2();
			}
		} else if (Static71.aClass103_3 == null || Static71.aClass103_3 instanceof Class103_Sub2) {
			Static71.aClass103_3 = new Class103_Sub1();
		}
		Static71.aClass103_3.method5636(arg2);
		Static71.aClass103_3.method5634();
		if (Static321.aClass45ArrayArrayArray3 != null) {
			Static197.method3454(true);
			Static71.aClass103_3.method5629(22);
			Static347.method5659(arg2, null, 0, (byte) 0, arg15, arg16);
			Static71.aClass103_3.method5634();
			Static71.aClass103_3.method5629(23);
			Static197.method3454(false);
		}
		Static347.method5659(arg2, arg7, arg13, arg14, arg15, arg16);
		Static71.aClass103_3.method5634();
		Static71.aClass103_3.method5638();
		Static71.aClass103_3.method5634();
		if (arg2 > 1) {
			Static140.aClass122_3.method4787(0);
		}
		Static140.aClass122_3.method4742(0, null);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V")
	public static void method5315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class24 local10 = new Class24(16);
		for (@Pc(19) Class3_Sub40 local19 = (Class3_Sub40) Static128.aClass24_18.method595(); local19 != null; local19 = (Class3_Sub40) Static128.aClass24_18.method602()) {
			local19.method5717();
			@Pc(30) int local30 = (int) (local19.aLong211 >> 28);
			@Pc(41) int local41 = (int) (local19.aLong211 >> 14 & 0x3FFFL) - arg1;
			@Pc(50) int local50 = (int) (local19.aLong211 & 0x3FFFL) - arg0;
			if (local50 >= 0 && local41 >= 0 && Static162.anInt2152 > local50 && Static122.anInt2632 > local41) {
				local10.method598((long) (local41 << 14 | local30 << 28 | local50), local19);
			}
		}
		Static128.aClass24_18 = local10;
	}
}
