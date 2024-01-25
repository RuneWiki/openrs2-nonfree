import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!rja", name = "d", descriptor = "Lclient!lm;")
	private static Class219 aClass219_3;

	@OriginalMember(owner = "client!rja", name = "g", descriptor = "[I")
	private static int[] anIntArray465;

	@OriginalMember(owner = "client!rja", name = "i", descriptor = "Lclient!uf;")
	private static Class357 aClass357_134;

	@OriginalMember(owner = "client!rja", name = "m", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray57;

	@OriginalMember(owner = "client!rja", name = "o", descriptor = "Lclient!hi;")
	private static Class2_Sub30 aClass2_Sub30_3;

	@OriginalMember(owner = "client!rja", name = "p", descriptor = "Lclient!uf;")
	private static Class357 aClass357_135;

	@OriginalMember(owner = "client!rja", name = "r", descriptor = "[J")
	private static long[] aLongArray20;

	@OriginalMember(owner = "client!rja", name = "z", descriptor = "Lclient!faa;")
	private static Class100 aClass100_1;

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "I")
	private static int anInt9159 = 0;

	@OriginalMember(owner = "client!rja", name = "c", descriptor = "[J")
	private static final long[] aLongArray19 = new long[1000];

	@OriginalMember(owner = "client!rja", name = "e", descriptor = "[[I")
	private static final int[][] anIntArrayArray43 = new int[5][5000];

	@OriginalMember(owner = "client!rja", name = "k", descriptor = "[Lclient!hq;")
	private static final Class152[] aClass152Array1 = new Class152[50];

	@OriginalMember(owner = "client!rja", name = "n", descriptor = "[I")
	private static final int[] anIntArray466 = new int[3];

	@OriginalMember(owner = "client!rja", name = "s", descriptor = "[I")
	private static final int[] anIntArray467 = new int[1000];

	@OriginalMember(owner = "client!rja", name = "u", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray58 = new String[1000];

	@OriginalMember(owner = "client!rja", name = "v", descriptor = "Lclient!aq;")
	public static final Class22 aClass22_45 = new Class22(4);

	@OriginalMember(owner = "client!rja", name = "w", descriptor = "[I")
	private static final int[] anIntArray468 = new int[5];

	@OriginalMember(owner = "client!rja", name = "x", descriptor = "I")
	private static int anInt9167 = 0;

	@OriginalMember(owner = "client!rja", name = "A", descriptor = "I")
	private static int anInt9169 = 0;

	@OriginalMember(owner = "client!rja", name = "E", descriptor = "I")
	private static int anInt9173 = 0;

	@OriginalMember(owner = "client!rja", name = "F", descriptor = "I")
	private static int anInt9174 = 0;

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(I)J")
	private static long method8017(@OriginalArg(0) int arg0) {
		@Pc(9) Long local9 = aClass219_3.method6022(Static551.aClass229_15.anInt6908 << 16 | arg0);
		return local9 == null ? -1L : local9;
	}

	@OriginalMember(owner = "client!rja", name = "b", descriptor = "(I)I")
	private static int method8018(@OriginalArg(0) int arg0) {
		@Pc(4) Class387 local4 = Static87.aClass184_1.method4782(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c112");
		}
		@Pc(21) Integer local21 = aClass219_3.method6019(Static551.aClass229_15.anInt6908 << 16 | arg0);
		if (local21 == null) {
			return local4.aChar6 == 'i' || local4.aChar6 == '1' ? 0 : -1;
		} else {
			return local21;
		}
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method8019(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static31.anInt530 == 0 && (Static145.aBoolean199 && !Static501.aBoolean678 || Static530.aBoolean716)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static205.aClass134_47.method3906(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static205.aClass134_47.method3906(0).length());
		} else if (local11.startsWith(Static205.aClass134_48.method3906(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static205.aClass134_48.method3906(0).length());
		} else if (local11.startsWith(Static205.aClass134_49.method3906(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static205.aClass134_49.method3906(0).length());
		} else if (local11.startsWith(Static205.aClass134_50.method3906(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static205.aClass134_50.method3906(0).length());
		} else if (local11.startsWith(Static205.aClass134_51.method3906(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static205.aClass134_51.method3906(0).length());
		} else if (local11.startsWith(Static205.aClass134_52.method3906(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static205.aClass134_52.method3906(0).length());
		} else if (local11.startsWith(Static205.aClass134_53.method3906(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static205.aClass134_53.method3906(0).length());
		} else if (local11.startsWith(Static205.aClass134_54.method3906(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static205.aClass134_54.method3906(0).length());
		} else if (local11.startsWith(Static205.aClass134_55.method3906(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static205.aClass134_55.method3906(0).length());
		} else if (local11.startsWith(Static205.aClass134_56.method3906(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static205.aClass134_56.method3906(0).length());
		} else if (local11.startsWith(Static205.aClass134_57.method3906(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static205.aClass134_57.method3906(0).length());
		} else if (local11.startsWith(Static205.aClass134_58.method3906(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static205.aClass134_58.method3906(0).length());
		} else if (Static204.anInt8130 != 0) {
			if (local11.startsWith(Static205.aClass134_47.method3906(Static204.anInt8130))) {
				local13 = 0;
				arg0 = arg0.substring(Static205.aClass134_47.method3906(Static204.anInt8130).length());
			} else if (local11.startsWith(Static205.aClass134_48.method3906(Static204.anInt8130))) {
				local13 = 1;
				arg0 = arg0.substring(Static205.aClass134_48.method3906(Static204.anInt8130).length());
			} else if (local11.startsWith(Static205.aClass134_49.method3906(Static204.anInt8130))) {
				local13 = 2;
				arg0 = arg0.substring(Static205.aClass134_49.method3906(Static204.anInt8130).length());
			} else if (local11.startsWith(Static205.aClass134_50.method3906(Static204.anInt8130))) {
				local13 = 3;
				arg0 = arg0.substring(Static205.aClass134_50.method3906(Static204.anInt8130).length());
			} else if (local11.startsWith(Static205.aClass134_51.method3906(Static204.anInt8130))) {
				local13 = 4;
				arg0 = arg0.substring(Static205.aClass134_51.method3906(Static204.anInt8130).length());
			} else if (local11.startsWith(Static205.aClass134_52.method3906(Static204.anInt8130))) {
				local13 = 5;
				arg0 = arg0.substring(Static205.aClass134_52.method3906(Static204.anInt8130).length());
			} else if (local11.startsWith(Static205.aClass134_53.method3906(Static204.anInt8130))) {
				local13 = 6;
				arg0 = arg0.substring(Static205.aClass134_53.method3906(Static204.anInt8130).length());
			} else if (local11.startsWith(Static205.aClass134_54.method3906(Static204.anInt8130))) {
				local13 = 7;
				arg0 = arg0.substring(Static205.aClass134_54.method3906(Static204.anInt8130).length());
			} else if (local11.startsWith(Static205.aClass134_55.method3906(Static204.anInt8130))) {
				local13 = 8;
				arg0 = arg0.substring(Static205.aClass134_55.method3906(Static204.anInt8130).length());
			} else if (local11.startsWith(Static205.aClass134_56.method3906(Static204.anInt8130))) {
				local13 = 9;
				arg0 = arg0.substring(Static205.aClass134_56.method3906(Static204.anInt8130).length());
			} else if (local11.startsWith(Static205.aClass134_57.method3906(Static204.anInt8130))) {
				local13 = 10;
				arg0 = arg0.substring(Static205.aClass134_57.method3906(Static204.anInt8130).length());
			} else if (local11.startsWith(Static205.aClass134_58.method3906(Static204.anInt8130))) {
				local13 = 11;
				arg0 = arg0.substring(Static205.aClass134_58.method3906(Static204.anInt8130).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Class134.lb.method3906(0))) {
			local451 = 1;
			arg0 = arg0.substring(Class134.lb.method3906(0).length());
		} else if (local11.startsWith(Static205.aClass134_59.method3906(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static205.aClass134_59.method3906(0).length());
		} else if (local11.startsWith(Static205.aClass134_60.method3906(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static205.aClass134_60.method3906(0).length());
		} else if (local11.startsWith(Static205.aClass134_61.method3906(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static205.aClass134_61.method3906(0).length());
		} else if (local11.startsWith(Static205.aClass134_62.method3906(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static205.aClass134_62.method3906(0).length());
		} else if (Static204.anInt8130 != 0) {
			if (local11.startsWith(Class134.lb.method3906(Static204.anInt8130))) {
				local451 = 1;
				arg0 = arg0.substring(Class134.lb.method3906(Static204.anInt8130).length());
			} else if (local11.startsWith(Static205.aClass134_59.method3906(Static204.anInt8130))) {
				local451 = 2;
				arg0 = arg0.substring(Static205.aClass134_59.method3906(Static204.anInt8130).length());
			} else if (local11.startsWith(Static205.aClass134_60.method3906(Static204.anInt8130))) {
				local451 = 3;
				arg0 = arg0.substring(Static205.aClass134_60.method3906(Static204.anInt8130).length());
			} else if (local11.startsWith(Static205.aClass134_61.method3906(Static204.anInt8130))) {
				local451 = 4;
				arg0 = arg0.substring(Static205.aClass134_61.method3906(Static204.anInt8130).length());
			} else if (local11.startsWith(Static205.aClass134_62.method3906(Static204.anInt8130))) {
				local451 = 5;
				arg0 = arg0.substring(Static205.aClass134_62.method3906(Static204.anInt8130).length());
			}
		}
		@Pc(641) Class2_Sub52 local641 = Static311.method5098(Static374.aClass341_73, Static125.aClass179_1);
		local641.aClass2_Sub8_Sub2_2.method5170(0);
		@Pc(650) int local650 = local641.aClass2_Sub8_Sub2_2.anInt5725;
		local641.aClass2_Sub8_Sub2_2.method5170(local13);
		local641.aClass2_Sub8_Sub2_2.method5170(local451);
		Static628.method9328(arg0, local641.aClass2_Sub8_Sub2_2);
		local641.aClass2_Sub8_Sub2_2.method5217(local641.aClass2_Sub8_Sub2_2.anInt5725 - local650);
		Static38.method791(local641);
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(IZ)V")
	public static void method8020() {
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(C)I")
	private static int method8021(@OriginalArg(0) char arg0) {
		return Static568.method8647(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "()V")
	public static void method8022() {
	}

	@OriginalMember(owner = "client!rja", name = "c", descriptor = "(I)V")
	private static void method8023(@OriginalArg(0) int arg0) {
		@Pc(3) Class357 local3 = Static647.method9532(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class357[] local13 = Static604.aClass357ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class357[] local19 = Static111.aClass357ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static604.aClass357ArrayArray2[local9] = new Class357[local22];
			Static679.method4131(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static679.method4131(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!jn;I)V")
	private static void method8024(@OriginalArg(0) Class2_Sub1_Sub10 arg0, @OriginalArg(1) int arg1) {
		anInt9169 = 0;
		anInt9159 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray271;
		@Pc(11) int[] local11 = arg0.anIntArray272;
		@Pc(13) byte local13 = -1;
		anInt9167 = 0;
		@Pc(639) int local639;
		try {
			@Pc(17) int local17 = 0;
			label333: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 150) {
					@Pc(1134) boolean local1134;
					if (local11[local5] == 1) {
						local1134 = true;
					} else {
						local1134 = false;
					}
					if (local31 >= 150 && local31 < 5000) {
						method8034(local31, local1134);
					} else if (local31 >= 5000 && local31 < 10000) {
						method8032(local31, local1134);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray467[anInt9169++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray467[anInt9169++] = Static113.aClass282_1.anIntArray412[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static113.aClass282_1.method7367(local54, anIntArray467[--anInt9169]);
					} else if (local31 == 3) {
						aStringArray58[anInt9159++] = arg0.aStringArray31[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt9169 -= 2;
						if (anIntArray467[anInt9169] != anIntArray467[anInt9169 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt9169 -= 2;
						if (anIntArray467[anInt9169] == anIntArray467[anInt9169 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt9169 -= 2;
						if (anIntArray467[anInt9169] < anIntArray467[anInt9169 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt9169 -= 2;
						if (anIntArray467[anInt9169] > anIntArray467[anInt9169 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt9167 == 0) {
							return;
						}
						@Pc(216) Class152 local216 = aClass152Array1[--anInt9167];
						arg0 = local216.aClass2_Sub1_Sub10_1;
						local8 = arg0.anIntArray271;
						local11 = arg0.anIntArray272;
						local5 = local216.anInt4653;
						anIntArray465 = local216.anIntArray216;
						aStringArray57 = local216.aStringArray22;
						aLongArray20 = local216.aLongArray12;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray467[anInt9169++] = Static113.aClass282_1.method7360(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static113.aClass282_1.method7364(anIntArray467[--anInt9169], local54);
					} else if (local31 == 31) {
						anInt9169 -= 2;
						if (anIntArray467[anInt9169] <= anIntArray467[anInt9169 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt9169 -= 2;
						if (anIntArray467[anInt9169] >= anIntArray467[anInt9169 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray467[anInt9169++] = anIntArray465[local11[local5]];
					} else if (local31 == 34) {
						anIntArray465[local11[local5]] = anIntArray467[--anInt9169];
					} else if (local31 == 35) {
						aStringArray58[anInt9159++] = aStringArray57[local11[local5]];
					} else if (local31 == 36) {
						aStringArray57[local11[local5]] = aStringArray58[--anInt9159];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt9159 -= local54;
						@Pc(403) String local403 = Static107.method1936(local54, anInt9159, aStringArray58);
						aStringArray58[anInt9159++] = local403;
					} else if (local31 == 38) {
						anInt9169--;
					} else if (local31 == 39) {
						anInt9159--;
					} else if (local31 == 40) {
						local54 = local11[local5];
						@Pc(439) Class2_Sub1_Sub10 local439 = Static373.method6359(local54);
						if (local439 == null) {
							throw new RuntimeException();
						}
						@Pc(449) int[] local449 = new int[local439.anInt5356];
						@Pc(453) String[] local453 = new String[local439.anInt5351];
						@Pc(457) long[] local457 = new long[local439.anInt5354];
						for (@Pc(459) int local459 = 0; local459 < local439.anInt5353; local459++) {
							local449[local459] = anIntArray467[anInt9169 + local459 - local439.anInt5353];
						}
						for (@Pc(478) int local478 = 0; local478 < local439.anInt5352; local478++) {
							local453[local478] = aStringArray58[anInt9159 + local478 - local439.anInt5352];
						}
						for (@Pc(497) int local497 = 0; local497 < local439.anInt5357; local497++) {
							local457[local497] = aLongArray19[anInt9173 + local497 - local439.anInt5357];
						}
						anInt9169 -= local439.anInt5353;
						anInt9159 -= local439.anInt5352;
						anInt9173 -= local439.anInt5357;
						@Pc(533) Class152 local533 = new Class152();
						local533.aClass2_Sub1_Sub10_1 = arg0;
						local533.anInt4653 = local5;
						local533.anIntArray216 = anIntArray465;
						local533.aStringArray22 = aStringArray57;
						local533.aLongArray12 = aLongArray20;
						if (anInt9167 >= aClass152Array1.length) {
							throw new RuntimeException();
						}
						aClass152Array1[anInt9167++] = local533;
						arg0 = local439;
						local8 = local439.anIntArray271;
						local11 = local439.anIntArray272;
						local5 = -1;
						anIntArray465 = local449;
						aStringArray57 = local453;
						aLongArray20 = local457;
					} else if (local31 == 42) {
						anIntArray467[anInt9169++] = Static100.anIntArray75[local11[local5]];
					} else if (local31 == 43) {
						local54 = local11[local5];
						Static100.anIntArray75[local54] = anIntArray467[--anInt9169];
						Static571.method8695(local54);
						Static25.aBoolean24 |= Static546.aBooleanArray56[local54];
					} else if (local31 == 44) {
						local54 = local11[local5] >> 16;
						local639 = local11[local5] & 0xFFFF;
						@Pc(647) int local647 = anIntArray467[--anInt9169];
						if (local647 >= 0 && local647 <= 5000) {
							anIntArray468[local54] = local647;
							@Pc(662) byte local662 = -1;
							if (local639 == 105) {
								local662 = 0;
							}
							@Pc(669) int local669 = 0;
							while (true) {
								if (local669 >= local647) {
									continue label333;
								}
								anIntArrayArray43[local54][local669] = local662;
								local669++;
							}
						}
						throw new RuntimeException();
					} else if (local31 == 45) {
						local54 = local11[local5];
						local639 = anIntArray467[--anInt9169];
						if (local639 < 0 || local639 >= anIntArray468[local54]) {
							throw new RuntimeException();
						}
						anIntArray467[anInt9169++] = anIntArrayArray43[local54][local639];
					} else if (local31 == 46) {
						local54 = local11[local5];
						anInt9169 -= 2;
						local639 = anIntArray467[anInt9169];
						if (local639 < 0 || local639 >= anIntArray468[local54]) {
							throw new RuntimeException();
						}
						anIntArrayArray43[local54][local639] = anIntArray467[anInt9169 + 1];
					} else if (local31 == 47) {
						@Pc(766) String local766 = Static576.aStringArray67[local11[local5]];
						if (local766 == null) {
							local766 = "null";
						}
						aStringArray58[anInt9159++] = local766;
					} else if (local31 == 48) {
						local54 = local11[local5];
						Static576.aStringArray67[local54] = aStringArray58[--anInt9159];
						Static192.method3722(local54);
					} else if (local31 == 51) {
						@Pc(810) Class335 local810 = arg0.aClass335Array1[local11[local5]];
						@Pc(823) Class2_Sub14 local823 = (Class2_Sub14) local810.method8357((long) anIntArray467[--anInt9169]);
						if (local823 != null) {
							local5 += local823.anInt1303;
						}
					} else if (local31 == 54) {
						aLongArray19[anInt9173++] = arg0.aLongArray13[local5];
					} else if (local31 == 55) {
						anInt9173--;
					} else if (local31 == 66) {
						aLongArray19[anInt9173++] = aLongArray20[local11[local5]];
					} else if (local31 == 67) {
						aLongArray20[local11[local5]] = aLongArray19[--anInt9173];
					} else if (local31 == 68) {
						anInt9173 -= 2;
						if (aLongArray19[anInt9173] != aLongArray19[anInt9173 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 69) {
						anInt9173 -= 2;
						if (aLongArray19[anInt9173] == aLongArray19[anInt9173 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 70) {
						anInt9173 -= 2;
						if (aLongArray19[anInt9173] < aLongArray19[anInt9173 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 71) {
						anInt9173 -= 2;
						if (aLongArray19[anInt9173] > aLongArray19[anInt9173 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 72) {
						anInt9173 -= 2;
						if (aLongArray19[anInt9173] <= aLongArray19[anInt9173 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 73) {
						anInt9173 -= 2;
						if (aLongArray19[anInt9173] >= aLongArray19[anInt9173 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 86) {
						if (anIntArray467[--anInt9169] == 1) {
							local5 += local11[local5];
						}
					} else if (local31 == 87) {
						if (anIntArray467[--anInt9169] == 0) {
							local5 += local11[local5];
						}
					} else if (local31 == 112) {
						anIntArray467[anInt9169++] = method8018(local11[local5]);
					} else if (local31 == 113) {
						anIntArray467[anInt9169++] = method8025(local11[local5]);
					} else if (local31 == 114) {
						aLongArray19[anInt9173++] = method8017(local11[local5]);
					} else if (local31 == 115) {
						aStringArray58[anInt9159++] = method8026(local11[local5]);
					}
				}
			}
		} catch (@Pc(1169) Exception local1169) {
			@Pc(1188) StringBuffer local1188;
			if (arg0.aString65 == null) {
				local1188 = new StringBuffer(30);
				local1188.append("CS2: ").append(arg0.aLong313).append(" ");
				for (local639 = anInt9167 - 1; local639 >= 0; local639--) {
					local1188.append("v: ").append(aClass152Array1[local639].aClass2_Sub1_Sub10_1.aLong313).append(" ");
				}
				local1188.append("op: ").append(local13);
				Static165.method3319(local1169, local1188.toString());
			} else {
				Static439.method7152("Clientscript error in: " + arg0.aString65);
				local1188 = new StringBuffer(30);
				local1188.append("Clientscript error in: ").append(arg0.aString65).append("\n");
				for (local639 = anInt9167 - 1; local639 >= 0; local639--) {
					local1188.append("via: ").append(aClass152Array1[local639].aClass2_Sub1_Sub10_1.aString65).append("\n");
				}
				local1188.append("Op: ").append(local13).append("\n");
				@Pc(1228) String local1228 = local1169.getMessage();
				if (local1228 != null && local1228.length() > 0) {
					local1188.append("Message: ").append(local1228).append("\n");
				}
				Static165.method3319(local1169, local1188.toString());
				Static455.method7295(local1188.toString());
			}
		}
	}

	@OriginalMember(owner = "client!rja", name = "d", descriptor = "(I)I")
	private static int method8025(@OriginalArg(0) int arg0) {
		@Pc(4) Class387 local4 = Static87.aClass184_1.method4782(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c113");
		}
		System.out.println("activeClanSettings:" + aClass219_3);
		@Pc(35) Integer local35 = aClass219_3.method6029(local4.anInt11248, local4.anInt11247, Static551.aClass229_15.anInt6908 << 16 | local4.anInt11245);
		return local35 == null ? 0 : local35;
	}

	@OriginalMember(owner = "client!rja", name = "e", descriptor = "(I)Ljava/lang/String;")
	private static String method8026(@OriginalArg(0) int arg0) {
		@Pc(9) String local9 = aClass219_3.method6011(Static551.aClass229_15.anInt6908 << 16 | arg0);
		return local9 == null ? "" : local9;
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!rd;I)V")
	private static void method8027(@OriginalArg(0) Class2_Sub45 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray2;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class2_Sub1_Sub10 local12 = Static373.method6359(local8);
		if (local12 == null) {
			return;
		}
		anIntArray465 = new int[local12.anInt5356];
		@Pc(21) int local21 = 0;
		aStringArray57 = new String[local12.anInt5351];
		@Pc(27) int local27 = 0;
		aLongArray20 = new long[local12.anInt5354];
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = 1; local35 < local2.length; local35++) {
			if (local2[local35] instanceof Integer) {
				@Pc(47) int local47 = (Integer) local2[local35];
				if (local47 == -2147483647) {
					local47 = arg0.anInt9043;
				}
				if (local47 == -2147483646) {
					local47 = arg0.anInt9038;
				}
				if (local47 == -2147483645) {
					local47 = arg0.aClass357_131 == null ? -1 : arg0.aClass357_131.anInt10460;
				}
				if (local47 == -2147483644) {
					local47 = arg0.anInt9040;
				}
				if (local47 == -2147483643) {
					local47 = arg0.aClass357_131 == null ? -1 : arg0.aClass357_131.anInt10432;
				}
				if (local47 == -2147483642) {
					local47 = arg0.aClass357_132 == null ? -1 : arg0.aClass357_132.anInt10460;
				}
				if (local47 == -2147483641) {
					local47 = arg0.aClass357_132 == null ? -1 : arg0.aClass357_132.anInt10432;
				}
				if (local47 == -2147483640) {
					local47 = arg0.anInt9041;
				}
				if (local47 == -2147483639) {
					local47 = arg0.anInt9044;
				}
				anIntArray465[local21++] = local47;
			} else if (local2[local35] instanceof String) {
				@Pc(141) String local141 = (String) local2[local35];
				if (local141.equals("event_opbase")) {
					local141 = arg0.aString107;
				}
				aStringArray57[local27++] = local141;
			} else if (local2[local35] instanceof Long) {
				@Pc(165) long local165 = (Long) local2[local35];
				aLongArray20[local33++] = local165;
			}
		}
		anInt9174 = arg0.anInt9039;
		method8024(local12, arg1);
	}

	@OriginalMember(owner = "client!rja", name = "f", descriptor = "(I)V")
	public static void method8028(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static39.method9317(arg0)) {
			return;
		}
		@Pc(12) Class357[] local12 = Static111.aClass357ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class357 local19 = local12[local14];
			if (local19.anObjectArray23 != null) {
				@Pc(26) Class2_Sub45 local26 = new Class2_Sub45();
				local26.aClass357_131 = local19;
				local26.anObjectArray2 = local19.anObjectArray23;
				method8027(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!rja", name = "g", descriptor = "(I)V")
	private static void method8029(@OriginalArg(0) int arg0) {
		@Pc(3) Class357 local3 = Static647.method9532(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class357[] local13 = Static604.aClass357ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class357[] local19 = Static111.aClass357ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static604.aClass357ArrayArray2[local9] = new Class357[local22];
			Static679.method4131(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static679.method4131(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!ss;II)V")
	public static void method8030(@OriginalArg(0) Class340 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub1_Sub10 local5 = Static326.method5369(arg0, arg2, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray465 = new int[local5.anInt5356];
		aStringArray57 = new String[local5.anInt5351];
		if (local5.aClass340_8 == Static13.aClass340_9 || local5.aClass340_8 == Static145.aClass340_4 || local5.aClass340_8 == Static9.aClass340_1) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static527.aClass357_137 != null) {
				local30 = Static527.aClass357_137.anInt10431;
				local32 = Static527.aClass357_137.anInt10407;
			}
			anIntArray465[0] = Static7.aClass6_1.method7048() - local30;
			anIntArray465[1] = Static7.aClass6_1.method7049() - local32;
		}
		method8024(local5, 200000);
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!rd;)V")
	public static void method8031(@OriginalArg(0) Class2_Sub45 arg0) {
		method8027(arg0, 200000);
	}

	@OriginalMember(owner = "client!rja", name = "b", descriptor = "(IZ)V")
	private static void method8032(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(52) Class2_Sub52 local52;
		@Pc(776) int local776;
		@Pc(97) int local97;
		@Pc(83) String local83;
		@Pc(175) int local175;
		@Pc(1496) boolean local1496;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray467[anInt9169++] = Static54.anInt1089;
				return;
			}
			if (arg0 == 5001) {
				anInt9169 -= 3;
				Static54.anInt1089 = anIntArray467[anInt9169];
				Static566.aClass276_4 = Static571.method8694(anIntArray467[anInt9169 + 1]);
				if (Static566.aClass276_4 == null) {
					Static566.aClass276_4 = Static234.aClass276_3;
				}
				Static672.anInt11445 = anIntArray467[anInt9169 + 2];
				local52 = Static311.method5098(Static569.aClass341_93, Static125.aClass179_1);
				local52.aClass2_Sub8_Sub2_2.method5170(Static54.anInt1089);
				local52.aClass2_Sub8_Sub2_2.method5170(Static566.aClass276_4.anInt8148);
				local52.aClass2_Sub8_Sub2_2.method5170(Static672.anInt11445);
				Static38.method791(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt9159 -= 2;
				local83 = aStringArray58[anInt9159];
				local89 = aStringArray58[anInt9159 + 1];
				anInt9169 -= 2;
				local97 = anIntArray467[anInt9169];
				local103 = anIntArray467[anInt9169 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class2_Sub52 local125 = Static311.method5098(Static361.aClass341_71, Static125.aClass179_1);
				local125.aClass2_Sub8_Sub2_2.method5170(Static297.method4908(local83) + Static297.method4908(local89) + 2);
				local125.aClass2_Sub8_Sub2_2.method5212(local83);
				local125.aClass2_Sub8_Sub2_2.method5170(local97 - 1);
				local125.aClass2_Sub8_Sub2_2.method5170(local103);
				local125.aClass2_Sub8_Sub2_2.method5212(local89);
				Static38.method791(local125);
				return;
			}
			@Pc(179) Class309 local179;
			if (arg0 == 5003) {
				local175 = anIntArray467[--anInt9169];
				local179 = Static425.method7008(local175);
				local181 = "";
				if (local179 != null && local179.aString104 != null) {
					local181 = local179.aString104;
				}
				aStringArray58[anInt9159++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray467[--anInt9169];
				local179 = Static425.method7008(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt8994;
				}
				anIntArray467[anInt9169++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static566.aClass276_4 == null) {
					anIntArray467[anInt9169++] = -1;
					return;
				}
				anIntArray467[anInt9169++] = Static566.aClass276_4.anInt8148;
				return;
			}
			@Pc(269) Class2_Sub52 local269;
			if (arg0 == 5006) {
				local175 = anIntArray467[--anInt9169];
				local269 = Static311.method5098(Static396.aClass341_76, Static125.aClass179_1);
				local269.aClass2_Sub8_Sub2_2.method5170(local175);
				Static38.method791(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray58[--anInt9159];
				method8019(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt9159 -= 2;
				local83 = aStringArray58[anInt9159];
				local89 = aStringArray58[anInt9159 + 1];
				if (Static31.anInt530 != 0 || (!Static145.aBoolean199 || Static501.aBoolean678) && !Static530.aBoolean716) {
					@Pc(328) Class2_Sub52 local328 = Static311.method5098(Static350.aClass341_67, Static125.aClass179_1);
					local328.aClass2_Sub8_Sub2_2.method5170(0);
					local103 = local328.aClass2_Sub8_Sub2_2.anInt5725;
					local328.aClass2_Sub8_Sub2_2.method5212(local83);
					Static628.method9328(local89, local328.aClass2_Sub8_Sub2_2);
					local328.aClass2_Sub8_Sub2_2.method5217(local328.aClass2_Sub8_Sub2_2.anInt5725 - local103);
					Static38.method791(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray467[--anInt9169];
				local179 = Static425.method7008(local175);
				local181 = "";
				if (local179 != null && local179.aString106 != null) {
					local181 = local179.aString106;
				}
				aStringArray58[anInt9159++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray467[--anInt9169];
				local179 = Static425.method7008(local175);
				local181 = "";
				if (local179 != null && local179.aString102 != null) {
					local181 = local179.aString102;
				}
				aStringArray58[anInt9159++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray467[--anInt9169];
				local179 = Static425.method7008(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt8992;
				}
				anIntArray467[anInt9169++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2 == null || Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aString30 == null) {
					local83 = "";
				} else {
					local83 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.method2222();
				}
				aStringArray58[anInt9159++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray467[anInt9169++] = Static672.anInt11445;
				return;
			}
			if (arg0 == 5017) {
				anIntArray467[anInt9169++] = Static35.method595();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray467[--anInt9169];
				local179 = Static425.method7008(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt8999;
				}
				anIntArray467[anInt9169++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray467[--anInt9169];
				local179 = Static425.method7008(local175);
				local181 = "";
				if (local179 != null && local179.aString103 != null) {
					local181 = local179.aString103;
				}
				aStringArray58[anInt9159++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2 == null || Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aString30 == null) {
					local83 = "";
				} else {
					local83 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.method2231();
				}
				aStringArray58[anInt9159++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray467[--anInt9169];
				local179 = Static425.method7008(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt8998;
				}
				anIntArray467[anInt9169++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray467[--anInt9169];
				local179 = Static425.method7008(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt8993;
				}
				anIntArray467[anInt9169++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray467[--anInt9169];
				local179 = Static425.method7008(local175);
				local181 = "";
				if (local179 != null && local179.aString105 != null) {
					local181 = local179.aString105;
				}
				aStringArray58[anInt9159++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray467[--anInt9169];
				aStringArray58[anInt9159++] = Static406.aClass337_1.method8463(local175).aString4;
				return;
			}
			@Pc(736) Class2_Sub1_Sub2 local736;
			if (arg0 == 5051) {
				local175 = anIntArray467[--anInt9169];
				local736 = Static406.aClass337_1.method8463(local175);
				if (local736.anIntArray36 == null) {
					anIntArray467[anInt9169++] = 0;
					return;
				}
				anIntArray467[anInt9169++] = local736.anIntArray36.length;
				return;
			}
			if (arg0 == 5052) {
				anInt9169 -= 2;
				local175 = anIntArray467[anInt9169];
				local776 = anIntArray467[anInt9169 + 1];
				@Pc(781) Class2_Sub1_Sub2 local781 = Static406.aClass337_1.method8463(local175);
				local103 = local781.anIntArray36[local776];
				anIntArray467[anInt9169++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray467[--anInt9169];
				local736 = Static406.aClass337_1.method8463(local175);
				if (local736.anIntArray35 == null) {
					anIntArray467[anInt9169++] = 0;
					return;
				}
				anIntArray467[anInt9169++] = local736.anIntArray35.length;
				return;
			}
			if (arg0 == 5054) {
				anInt9169 -= 2;
				local175 = anIntArray467[anInt9169];
				local776 = anIntArray467[anInt9169 + 1];
				anIntArray467[anInt9169++] = Static406.aClass337_1.method8463(local175).anIntArray35[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray467[--anInt9169];
				aStringArray58[anInt9159++] = Static644.aClass186_2.method4870(local175).method4326();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray467[--anInt9169];
				@Pc(907) Class2_Sub1_Sub8 local907 = Static644.aClass186_2.method4870(local175);
				if (local907.anIntArray224 == null) {
					anIntArray467[anInt9169++] = 0;
					return;
				}
				anIntArray467[anInt9169++] = local907.anIntArray224.length;
				return;
			}
			if (arg0 == 5057) {
				anInt9169 -= 2;
				local175 = anIntArray467[anInt9169];
				local776 = anIntArray467[anInt9169 + 1];
				anIntArray467[anInt9169++] = Static644.aClass186_2.method4870(local175).anIntArray224[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass100_1 = new Class100();
				aClass100_1.anInt2789 = anIntArray467[--anInt9169];
				aClass100_1.aClass2_Sub1_Sub8_1 = Static644.aClass186_2.method4870(aClass100_1.anInt2789);
				aClass100_1.anIntArray157 = new int[aClass100_1.aClass2_Sub1_Sub8_1.method4325()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static311.method5098(Static432.aClass341_79, Static125.aClass179_1);
				local52.aClass2_Sub8_Sub2_2.method5170(0);
				local776 = local52.aClass2_Sub8_Sub2_2.anInt5725;
				local52.aClass2_Sub8_Sub2_2.method5170(0);
				local52.aClass2_Sub8_Sub2_2.method5192(aClass100_1.anInt2789);
				aClass100_1.aClass2_Sub1_Sub8_1.method4327(aClass100_1.anIntArray157, local52.aClass2_Sub8_Sub2_2);
				local52.aClass2_Sub8_Sub2_2.method5217(local52.aClass2_Sub8_Sub2_2.anInt5725 - local776);
				Static38.method791(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray58[--anInt9159];
				local269 = Static311.method5098(Static648.aClass341_113, Static125.aClass179_1);
				local269.aClass2_Sub8_Sub2_2.method5170(0);
				local97 = local269.aClass2_Sub8_Sub2_2.anInt5725;
				local269.aClass2_Sub8_Sub2_2.method5212(local83);
				local269.aClass2_Sub8_Sub2_2.method5192(aClass100_1.anInt2789);
				aClass100_1.aClass2_Sub1_Sub8_1.method4327(aClass100_1.anIntArray157, local269.aClass2_Sub8_Sub2_2);
				local269.aClass2_Sub8_Sub2_2.method5217(local269.aClass2_Sub8_Sub2_2.anInt5725 - local97);
				Static38.method791(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static311.method5098(Static432.aClass341_79, Static125.aClass179_1);
				local52.aClass2_Sub8_Sub2_2.method5170(0);
				local776 = local52.aClass2_Sub8_Sub2_2.anInt5725;
				local52.aClass2_Sub8_Sub2_2.method5170(1);
				local52.aClass2_Sub8_Sub2_2.method5192(aClass100_1.anInt2789);
				aClass100_1.aClass2_Sub1_Sub8_1.method4327(aClass100_1.anIntArray157, local52.aClass2_Sub8_Sub2_2);
				local52.aClass2_Sub8_Sub2_2.method5217(local52.aClass2_Sub8_Sub2_2.anInt5725 - local776);
				Static38.method791(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt9169 -= 2;
				local175 = anIntArray467[anInt9169];
				local776 = anIntArray467[anInt9169 + 1];
				anIntArray467[anInt9169++] = Static406.aClass337_1.method8463(local175).aCharArray2[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt9169 -= 2;
				local175 = anIntArray467[anInt9169];
				local776 = anIntArray467[anInt9169 + 1];
				anIntArray467[anInt9169++] = Static406.aClass337_1.method8463(local175).aCharArray1[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt9169 -= 2;
				local175 = anIntArray467[anInt9169];
				local776 = anIntArray467[anInt9169 + 1];
				if (local776 == -1) {
					anIntArray467[anInt9169++] = -1;
					return;
				}
				anIntArray467[anInt9169++] = Static406.aClass337_1.method8463(local175).method402((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt9169 -= 2;
				local175 = anIntArray467[anInt9169];
				local776 = anIntArray467[anInt9169 + 1];
				if (local776 == -1) {
					anIntArray467[anInt9169++] = -1;
					return;
				}
				anIntArray467[anInt9169++] = Static406.aClass337_1.method8463(local175).method399((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray467[--anInt9169];
				anIntArray467[anInt9169++] = Static644.aClass186_2.method4870(local175).method4325();
				return;
			}
			if (arg0 == 5067) {
				anInt9169 -= 2;
				local175 = anIntArray467[anInt9169];
				local776 = anIntArray467[anInt9169 + 1];
				local97 = Static644.aClass186_2.method4870(local175).method4328(local776).anInt4597;
				anIntArray467[anInt9169++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt9169 -= 2;
				local175 = anIntArray467[anInt9169];
				local776 = anIntArray467[anInt9169 + 1];
				aClass100_1.anIntArray157[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt9169 -= 2;
				local175 = anIntArray467[anInt9169];
				local776 = anIntArray467[anInt9169 + 1];
				aClass100_1.anIntArray157[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt9169 -= 3;
				local175 = anIntArray467[anInt9169];
				local776 = anIntArray467[anInt9169 + 1];
				local97 = anIntArray467[anInt9169 + 2];
				@Pc(1448) Class2_Sub1_Sub8 local1448 = Static644.aClass186_2.method4870(local175);
				if (local1448.method4328(local776).anInt4597 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray467[anInt9169++] = local1448.method4330(local776, local97);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray58[--anInt9159];
				local1496 = anIntArray467[--anInt9169] == 1;
				Static553.method8472(local1496, local83);
				anIntArray467[anInt9169++] = Static369.anInt11000;
				return;
			}
			if (arg0 == 5072) {
				if (Static280.aShortArray71 != null && Static632.anInt10928 < Static369.anInt11000) {
					anIntArray467[anInt9169++] = Static280.aShortArray71[Static632.anInt10928++] & 0xFFFF;
					return;
				}
				anIntArray467[anInt9169++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static632.anInt10928 = 0;
				return;
			}
			if (arg0 == 5074) {
				local52 = Static311.method5098(Static432.aClass341_79, Static125.aClass179_1);
				local52.aClass2_Sub8_Sub2_2.method5170(0);
				local776 = local52.aClass2_Sub8_Sub2_2.anInt5725;
				local52.aClass2_Sub8_Sub2_2.method5170(2);
				local52.aClass2_Sub8_Sub2_2.method5192(aClass100_1.anInt2789);
				aClass100_1.aClass2_Sub1_Sub8_1.method4327(aClass100_1.anIntArray157, local52.aClass2_Sub8_Sub2_2);
				local52.aClass2_Sub8_Sub2_2.method5217(local52.aClass2_Sub8_Sub2_2.anInt5725 - local776);
				Static38.method791(local52);
				return;
			}
			if (arg0 == 5075) {
				local52 = Static311.method5098(Static432.aClass341_79, Static125.aClass179_1);
				local52.aClass2_Sub8_Sub2_2.method5170(0);
				local776 = local52.aClass2_Sub8_Sub2_2.anInt5725;
				local52.aClass2_Sub8_Sub2_2.method5170(3);
				local52.aClass2_Sub8_Sub2_2.method5192(aClass100_1.anInt2789);
				aClass100_1.aClass2_Sub1_Sub8_1.method4327(aClass100_1.anIntArray157, local52.aClass2_Sub8_Sub2_2);
				local52.aClass2_Sub8_Sub2_2.method5217(local52.aClass2_Sub8_Sub2_2.anInt5725 - local776);
				Static38.method791(local52);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static202.aClass191_1.method8963(86)) {
					anIntArray467[anInt9169++] = 1;
					return;
				}
				anIntArray467[anInt9169++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static202.aClass191_1.method8963(82)) {
					anIntArray467[anInt9169++] = 1;
					return;
				}
				anIntArray467[anInt9169++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static202.aClass191_1.method8963(81)) {
					anIntArray467[anInt9169++] = 1;
					return;
				}
				anIntArray467[anInt9169++] = 0;
				return;
			}
		} else {
			@Pc(2931) int local2931;
			@Pc(2205) boolean local2205;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static236.method4262(anIntArray467[--anInt9169]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray467[anInt9169++] = Static23.method433();
					return;
				}
				if (arg0 == 5205) {
					Static396.method6572(-1, false, -1, anIntArray467[--anInt9169]);
					return;
				}
				@Pc(1794) Class2_Sub1_Sub9 local1794;
				if (arg0 == 5206) {
					local175 = anIntArray467[--anInt9169];
					local1794 = Static331.method9074(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1794 == null) {
						anIntArray467[anInt9169++] = -1;
						return;
					}
					anIntArray467[anInt9169++] = local1794.anInt5173;
					return;
				}
				@Pc(1827) Class2_Sub1_Sub9 local1827;
				if (arg0 == 5207) {
					local1827 = Static331.method9071(anIntArray467[--anInt9169]);
					if (local1827 != null && local1827.aString64 != null) {
						aStringArray58[anInt9159++] = local1827.aString64;
						return;
					}
					aStringArray58[anInt9159++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray467[anInt9169++] = Static203.anInt4264;
					anIntArray467[anInt9169++] = Static322.anInt5896;
					return;
				}
				if (arg0 == 5209) {
					anIntArray467[anInt9169++] = Static43.anInt8888 + Static331.anInt10589;
					anIntArray467[anInt9169++] = Static609.anInt10718 + Static331.anInt10590;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray467[--anInt9169];
					local1794 = Static331.method9071(local175);
					if (local1794 == null) {
						anIntArray467[anInt9169++] = 0;
						anIntArray467[anInt9169++] = 0;
						return;
					}
					anIntArray467[anInt9169++] = local1794.anInt5174 >> 14 & 0x3FFF;
					anIntArray467[anInt9169++] = local1794.anInt5174 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray467[--anInt9169];
					local1794 = Static331.method9071(local175);
					if (local1794 == null) {
						anIntArray467[anInt9169++] = 0;
						anIntArray467[anInt9169++] = 0;
						return;
					}
					anIntArray467[anInt9169++] = local1794.anInt5172 - local1794.anInt5175;
					anIntArray467[anInt9169++] = local1794.anInt5168 - local1794.anInt5166;
					return;
				}
				@Pc(2017) Class2_Sub33 local2017;
				if (arg0 == 5212) {
					local2017 = Static535.method8258();
					if (local2017 == null) {
						anIntArray467[anInt9169++] = -1;
						anIntArray467[anInt9169++] = -1;
						return;
					}
					anIntArray467[anInt9169++] = local2017.anInt5215;
					local776 = local2017.anInt5216 << 28 | local2017.anInt5213 + Static331.anInt10589 << 14 | local2017.anInt5210 + Static331.anInt10590;
					anIntArray467[anInt9169++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local2017 = Static305.method5017();
					if (local2017 == null) {
						anIntArray467[anInt9169++] = -1;
						anIntArray467[anInt9169++] = -1;
						return;
					}
					anIntArray467[anInt9169++] = local2017.anInt5215;
					local776 = local2017.anInt5216 << 28 | local2017.anInt5213 + Static331.anInt10589 << 14 | local2017.anInt5210 + Static331.anInt10590;
					anIntArray467[anInt9169++] = local776;
					return;
				}
				@Pc(2165) boolean local2165;
				if (arg0 == 5214) {
					local175 = anIntArray467[--anInt9169];
					local1794 = Static95.method1628();
					if (local1794 != null) {
						local2165 = local1794.method4703(local175 & 0x3FFF, local175 >> 28 & 0x3, anIntArray466, local175 >> 14 & 0x3FFF);
						if (local2165) {
							Static63.method1168(anIntArray466[2], anIntArray466[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt9169 -= 2;
					local175 = anIntArray467[anInt9169];
					local776 = anIntArray467[anInt9169 + 1];
					@Pc(2203) Class279 local2203 = Static331.method9076(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2205 = false;
					for (@Pc(2210) Class2_Sub1_Sub9 local2210 = (Class2_Sub1_Sub9) local2203.method7293(); local2210 != null; local2210 = (Class2_Sub1_Sub9) local2203.method7298()) {
						if (local2210.anInt5173 == local776) {
							local2205 = true;
							break;
						}
					}
					if (local2205) {
						anIntArray467[anInt9169++] = 1;
						return;
					}
					anIntArray467[anInt9169++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray467[--anInt9169];
					local1794 = Static331.method9071(local175);
					if (local1794 == null) {
						anIntArray467[anInt9169++] = -1;
						return;
					}
					anIntArray467[anInt9169++] = local1794.anInt5177;
					return;
				}
				if (arg0 == 5220) {
					anIntArray467[anInt9169++] = Static95.anInt1689 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray467[--anInt9169];
					Static63.method1168(local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1827 = Static95.method1628();
					if (local1827 != null) {
						local1496 = local1827.method4702(anIntArray466, Static609.anInt10718 + Static331.anInt10590, Static43.anInt8888 + Static331.anInt10589);
						if (local1496) {
							anIntArray467[anInt9169++] = anIntArray466[1];
							anIntArray467[anInt9169++] = anIntArray466[2];
							return;
						}
						anIntArray467[anInt9169++] = -1;
						anIntArray467[anInt9169++] = -1;
						return;
					}
					anIntArray467[anInt9169++] = -1;
					anIntArray467[anInt9169++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt9169 -= 2;
					local175 = anIntArray467[anInt9169];
					local776 = anIntArray467[anInt9169 + 1];
					Static396.method6572(local776 & 0x3FFF, false, local776 >> 14 & 0x3FFF, local175);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray467[--anInt9169];
					local1794 = Static95.method1628();
					if (local1794 != null) {
						local2165 = local1794.method4703(local175 & 0x3FFF, local175 >> 28 & 0x3, anIntArray466, local175 >> 14 & 0x3FFF);
						if (local2165) {
							anIntArray467[anInt9169++] = anIntArray466[1];
							anIntArray467[anInt9169++] = anIntArray466[2];
							return;
						}
						anIntArray467[anInt9169++] = -1;
						anIntArray467[anInt9169++] = -1;
						return;
					}
					anIntArray467[anInt9169++] = -1;
					anIntArray467[anInt9169++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray467[--anInt9169];
					local1794 = Static95.method1628();
					if (local1794 != null) {
						local2165 = local1794.method4702(anIntArray466, local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
						if (local2165) {
							anIntArray467[anInt9169++] = anIntArray466[1];
							anIntArray467[anInt9169++] = anIntArray466[2];
							return;
						}
						anIntArray467[anInt9169++] = -1;
						anIntArray467[anInt9169++] = -1;
						return;
					}
					anIntArray467[anInt9169++] = -1;
					anIntArray467[anInt9169++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static142.method2462(anIntArray467[--anInt9169]);
					return;
				}
				if (arg0 == 5227) {
					anInt9169 -= 2;
					local175 = anIntArray467[anInt9169];
					local776 = anIntArray467[anInt9169 + 1];
					Static396.method6572(local776 & 0x3FFF, true, local776 >> 14 & 0x3FFF, local175);
					return;
				}
				if (arg0 == 5228) {
					Static549.aBoolean709 = anIntArray467[--anInt9169] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray467[anInt9169++] = Static549.aBoolean709 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray467[--anInt9169];
					Static101.method1725(local175);
					return;
				}
				@Pc(2723) Class2 local2723;
				if (arg0 == 5231) {
					anInt9169 -= 2;
					local175 = anIntArray467[anInt9169];
					local1496 = anIntArray467[anInt9169 + 1] == 1;
					if (Static377.aClass335_23 != null) {
						local2723 = Static377.aClass335_23.method8357((long) local175);
						if (local2723 != null && !local1496) {
							local2723.method9825();
							return;
						}
						if (local2723 == null && local1496) {
							local2723 = new Class2();
							Static377.aClass335_23.method8356(local2723, (long) local175);
						}
					}
					return;
				}
				@Pc(2765) Class2 local2765;
				if (arg0 == 5232) {
					local175 = anIntArray467[--anInt9169];
					if (Static377.aClass335_23 != null) {
						local2765 = Static377.aClass335_23.method8357((long) local175);
						anIntArray467[anInt9169++] = local2765 == null ? 0 : 1;
						return;
					}
					anIntArray467[anInt9169++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt9169 -= 2;
					local175 = anIntArray467[anInt9169];
					local1496 = anIntArray467[anInt9169 + 1] == 1;
					if (Static137.aClass335_10 != null) {
						local2723 = Static137.aClass335_10.method8357((long) local175);
						if (local2723 != null && !local1496) {
							local2723.method9825();
							return;
						}
						if (local2723 == null && local1496) {
							local2723 = new Class2();
							Static137.aClass335_10.method8356(local2723, (long) local175);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray467[--anInt9169];
					if (Static137.aClass335_10 != null) {
						local2765 = Static137.aClass335_10.method8357((long) local175);
						anIntArray467[anInt9169++] = local2765 == null ? 0 : 1;
						return;
					}
					anIntArray467[anInt9169++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray467[anInt9169++] = Static331.aClass2_Sub1_Sub9_3 == null ? -1 : Static331.aClass2_Sub1_Sub9_3.anInt5173;
					return;
				}
				if (arg0 == 5236) {
					anInt9169 -= 2;
					local175 = anIntArray467[anInt9169];
					local776 = anIntArray467[anInt9169 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2931 = Static8.method136(local103, local175, local97);
					if (local2931 < 0) {
						anIntArray467[anInt9169++] = -1;
						return;
					}
					anIntArray467[anInt9169++] = local2931;
					return;
				}
				if (arg0 == 5237) {
					Static284.method4761();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt9169 -= 2;
					local175 = anIntArray467[anInt9169];
					local776 = anIntArray467[anInt9169 + 1];
					Static347.method6004(local175, 3, local776, false);
					anIntArray467[anInt9169++] = Static102.aFrame2 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static102.aFrame2 != null) {
						Static347.method6004(-1, Static230.aClass2_Sub54_15.aClass4_Sub11_2.method3216(), -1, false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(3017) Class277[] local3017 = Static227.method4162();
					anIntArray467[anInt9169++] = local3017.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray467[--anInt9169];
					@Pc(3041) Class277[] local3041 = Static227.method4162();
					anIntArray467[anInt9169++] = local3041[local175].anInt8153;
					anIntArray467[anInt9169++] = local3041[local175].anInt8154;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static377.anInt7161;
					local776 = Static431.anInt2502;
					local97 = -1;
					@Pc(3076) Class277[] local3076 = Static227.method4162();
					for (local2931 = 0; local2931 < local3076.length; local2931++) {
						@Pc(3083) Class277 local3083 = local3076[local2931];
						if (local3083.anInt8153 == local175 && local3083.anInt8154 == local776) {
							local97 = local2931;
							break;
						}
					}
					anIntArray467[anInt9169++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray467[anInt9169++] = Static255.method4444();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray467[--anInt9169];
					if (local175 >= 1 && local175 <= 2) {
						Static347.method6004(-1, local175, -1, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub11_2.method3216();
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray467[--anInt9169];
					if (local175 >= 1 && local175 <= 2) {
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub11_2, local175);
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub11_1, local175);
						Static482.method7663();
						return;
					}
					return;
				}
			} else {
				@Pc(3369) int local3369;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt9159 -= 2;
						local83 = aStringArray58[anInt9159];
						local89 = aStringArray58[anInt9159 + 1];
						local97 = anIntArray467[--anInt9169];
						@Pc(3231) Class2_Sub52 local3231 = Static311.method5098(Static329.aClass341_64, Static125.aClass179_1);
						local3231.aClass2_Sub8_Sub2_2.method5170(Static297.method4908(local83) + Static297.method4908(local89) + 1);
						local3231.aClass2_Sub8_Sub2_2.method5212(local83);
						local3231.aClass2_Sub8_Sub2_2.method5212(local89);
						local3231.aClass2_Sub8_Sub2_2.method5170(local97);
						Static38.method791(local3231);
						return;
					}
					if (arg0 == 5401) {
						anInt9169 -= 2;
						Static313.aShortArray43[anIntArray467[anInt9169]] = (short) Static76.method1363(anIntArray467[anInt9169 + 1]);
						Static372.aClass343_1.method8544();
						Static372.aClass343_1.method8546();
						Static522.aClass272_2.method7199();
						Static403.method6620();
						return;
					}
					if (arg0 == 5405) {
						anInt9169 -= 2;
						local175 = anIntArray467[anInt9169];
						local776 = anIntArray467[anInt9169 + 1];
						if (local175 >= 0 && local175 < 2) {
							Static19.anIntArrayArrayArray1[local175] = new int[local776 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt9169 -= 7;
						local175 = anIntArray467[anInt9169];
						local776 = anIntArray467[anInt9169 + 1] << 1;
						local97 = anIntArray467[anInt9169 + 2];
						local103 = anIntArray467[anInt9169 + 3];
						local2931 = anIntArray467[anInt9169 + 4];
						local3369 = anIntArray467[anInt9169 + 5];
						@Pc(3375) int local3375 = anIntArray467[anInt9169 + 6];
						if (local175 >= 0 && local175 < 2 && Static19.anIntArrayArrayArray1[local175] != null && local776 >= 0 && local776 < Static19.anIntArrayArrayArray1[local175].length) {
							Static19.anIntArrayArrayArray1[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3375 };
							Static19.anIntArrayArrayArray1[local175][local776 + 1] = new int[] { (local2931 >> 14 & 0x3FFF) << 9, local3369 << 2, (local2931 & 0x3FFF) << 9 };
						}
						return;
					}
					if (arg0 == 5407) {
						local175 = Static19.anIntArrayArrayArray1[anIntArray467[--anInt9169]].length >> 1;
						anIntArray467[anInt9169++] = local175;
						return;
					}
					if (arg0 == 5411) {
						if (Static102.aFrame2 != null) {
							Static347.method6004(-1, Static230.aClass2_Sub54_15.aClass4_Sub11_2.method3216(), -1, false);
						}
						if (Static46.aFrame1 != null) {
							Static394.method7234();
							System.exit(0);
							return;
						}
						local83 = Static47.aString8 == null ? Static488.method7740() : Static47.aString8;
						Static452.method7288(Static96.aClass48_5, false, Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907() == 1, local83);
						return;
					}
					if (arg0 == 5419) {
						local83 = "";
						if (Static185.aClass268_5 != null) {
							if (Static185.aClass268_5.anObject19 == null) {
								local83 = Static317.method6701(Static185.aClass268_5.anInt8010);
							} else {
								local83 = (String) Static185.aClass268_5.anObject19;
							}
						}
						aStringArray58[anInt9159++] = local83;
						return;
					}
					if (arg0 == 5420) {
						anIntArray467[anInt9169++] = Static96.aClass48_5.aBoolean75 ? 0 : 1;
						return;
					}
					if (arg0 == 5421) {
						if (Static102.aFrame2 != null) {
							Static347.method6004(-1, Static230.aClass2_Sub54_15.aClass4_Sub11_2.method3216(), -1, false);
						}
						local83 = aStringArray58[--anInt9159];
						local1496 = anIntArray467[--anInt9169] == 1;
						local181 = Static488.method7740() + local83;
						Static452.method7288(Static96.aClass48_5, local1496, Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907() == 1, local181);
						return;
					}
					if (arg0 == 5422) {
						anInt9159 -= 2;
						local83 = aStringArray58[anInt9159];
						local89 = aStringArray58[anInt9159 + 1];
						local97 = anIntArray467[--anInt9169];
						if (local83.length() > 0) {
							if (Static596.aStringArray76 == null) {
								Static596.aStringArray76 = new String[Static254.anIntArray249[Static551.aClass229_15.anInt6908]];
							}
							Static596.aStringArray76[local97] = local83;
						}
						if (local89.length() > 0) {
							if (Static581.aStringArray68 == null) {
								Static581.aStringArray68 = new String[Static254.anIntArray249[Static551.aClass229_15.anInt6908]];
							}
							Static581.aStringArray68[local97] = local89;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray58[--anInt9159]);
						return;
					}
					if (arg0 == 5424) {
						anInt9169 -= 11;
						Static140.anInt8825 = anIntArray467[anInt9169];
						Static316.anInt5772 = anIntArray467[anInt9169 + 1];
						Static193.anInt4102 = anIntArray467[anInt9169 + 2];
						Static22.anInt392 = anIntArray467[anInt9169 + 3];
						Static18.anInt324 = anIntArray467[anInt9169 + 4];
						Static591.anInt10305 = anIntArray467[anInt9169 + 5];
						Static132.anInt2525 = anIntArray467[anInt9169 + 6];
						Static287.anInt5264 = anIntArray467[anInt9169 + 7];
						Static411.anInt7658 = anIntArray467[anInt9169 + 8];
						Static63.anInt1213 = anIntArray467[anInt9169 + 9];
						Static430.anInt7884 = anIntArray467[anInt9169 + 10];
						Static409.aClass124_84.method3627(Static18.anInt324);
						Static409.aClass124_84.method3627(Static591.anInt10305);
						Static409.aClass124_84.method3627(Static132.anInt2525);
						Static409.aClass124_84.method3627(Static287.anInt5264);
						Static409.aClass124_84.method3627(Static411.anInt7658);
						Static91.aClass71_5 = null;
						Static618.aClass71_36 = null;
						Static486.aClass71_31 = null;
						Static167.aClass71_6 = null;
						Static307.aClass71_9 = null;
						Static418.aClass71_17 = null;
						Static358.aClass71_15 = null;
						Static434.aClass71_11 = null;
						Static300.aBoolean723 = true;
						return;
					}
					if (arg0 == 5425) {
						Static232.method9279();
						Static300.aBoolean723 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt9169 -= 2;
						Static303.anInt5522 = anIntArray467[anInt9169];
						Static373.anInt7103 = anIntArray467[anInt9169 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt9169 -= 2;
						Static198.anInt4183 = anIntArray467[anInt9169 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt9169 -= 2;
						local175 = anIntArray467[anInt9169];
						local776 = anIntArray467[anInt9169 + 1];
						anIntArray467[anInt9169++] = Static404.method6625(local776, local175) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static154.method3163(false, false, aStringArray58[--anInt9159]);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static675.method1325(Static637.anApplet2, "accountcreated");
							return;
						} catch (@Pc(3917) Throwable local3917) {
							return;
						}
					}
					if (arg0 == 5431) {
						try {
							Static675.method1325(Static637.anApplet2, "accountcreatestarted");
							return;
						} catch (@Pc(3928) Throwable local3928) {
							return;
						}
					}
					if (arg0 == 5432) {
						local83 = "";
						if (Static673.aClipboard3 != null) {
							@Pc(3940) Transferable local3940 = Static673.aClipboard3.getContents((Object) null);
							if (local3940 != null) {
								try {
									local83 = (String) local3940.getTransferData(DataFlavor.stringFlavor);
									if (local83 == null) {
										local83 = "";
									}
								} catch (@Pc(3953) Exception local3953) {
								}
							}
						}
						aStringArray58[anInt9159++] = local83;
						return;
					}
					if (arg0 == 5433) {
						Static157.anInt3422 = anIntArray467[--anInt9169];
						return;
					}
					if (arg0 == 5435) {
						anIntArray467[anInt9169++] = Static280.aBoolean388 ? 1 : 0;
						return;
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt9169 -= 4;
						local175 = anIntArray467[anInt9169];
						local776 = anIntArray467[anInt9169 + 1];
						local97 = anIntArray467[anInt9169 + 2];
						local103 = anIntArray467[anInt9169 + 3];
						Static41.method912((local175 & 0x3FFF) - Static490.anInt8763, (local175 >> 14 & 0x3FFF) - Static640.anInt11085, false, local776 << 2, local97, local103);
						return;
					}
					if (arg0 == 5501) {
						anInt9169 -= 4;
						local175 = anIntArray467[anInt9169];
						local776 = anIntArray467[anInt9169 + 1];
						local97 = anIntArray467[anInt9169 + 2];
						local103 = anIntArray467[anInt9169 + 3];
						Static81.method1406(local103, local776 << 2, (local175 & 0x3FFF) - Static490.anInt8763, (local175 >> 14 & 0x3FFF) - Static640.anInt11085, local97);
						return;
					}
					if (arg0 == 5502) {
						anInt9169 -= 6;
						local175 = anIntArray467[anInt9169];
						if (local175 >= 2) {
							throw new RuntimeException();
						}
						Static299.anInt5456 = local175;
						local776 = anIntArray467[anInt9169 + 1];
						if (local776 + 1 >= Static19.anIntArrayArrayArray1[Static299.anInt5456].length >> 1) {
							throw new RuntimeException();
						}
						Static170.anInt3601 = local776;
						Static630.anInt7989 = 0;
						Static193.anInt4103 = anIntArray467[anInt9169 + 2];
						Static329.anInt6013 = anIntArray467[anInt9169 + 3];
						local97 = anIntArray467[anInt9169 + 4];
						if (local97 >= 2) {
							throw new RuntimeException();
						}
						Static230.anInt4627 = local97;
						local103 = anIntArray467[anInt9169 + 5];
						if (local103 + 1 >= Static19.anIntArrayArrayArray1[Static230.anInt4627].length >> 1) {
							throw new RuntimeException();
						}
						Static458.anInt8233 = local103;
						Static484.anInt8685 = 3;
						Static533.anInt9359 = -1;
						Static5.anInt83 = -1;
						return;
					}
					if (arg0 == 5503) {
						Static230.method4175();
						return;
					}
					if (arg0 == 5504) {
						anInt9169 -= 2;
						Static640.method9477(anIntArray467[anInt9169 + 1], anIntArray467[anInt9169]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray467[anInt9169++] = (int) Static320.aFloat118 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray467[anInt9169++] = (int) Static278.aFloat108 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static78.method1391();
						return;
					}
					if (arg0 == 5508) {
						Static633.method9344();
						return;
					}
					if (arg0 == 5509) {
						Static285.method4766();
						return;
					}
					if (arg0 == 5510) {
						Static389.method6561();
						return;
					}
					if (arg0 == 5511) {
						local175 = anIntArray467[--anInt9169];
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static640.anInt11085;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static222.anInt4533) {
							local776 = Static222.anInt4533;
						}
						local97 -= Static490.anInt8763;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static668.anInt11370) {
							local97 = Static668.anInt11370;
						}
						Static293.anInt7589 = (local776 << 9) + 256;
						Static106.anInt1972 = (local97 << 9) + 256;
						Static484.anInt8685 = 4;
						Static533.anInt9359 = -1;
						Static5.anInt83 = -1;
						return;
					}
					if (arg0 == 5512) {
						Static187.method3578();
						return;
					}
					if (arg0 == 5514) {
						Static165.anInt3548 = anIntArray467[--anInt9169];
						return;
					}
					if (arg0 == 5516) {
						anIntArray467[anInt9169++] = Static165.anInt3548;
						return;
					}
					if (arg0 == 5517) {
						local175 = anIntArray467[--anInt9169];
						if (local175 == -1) {
							local776 = local175 >> 14 & 0x3FFF;
							local97 = local175 & 0x3FFF;
							local776 -= Static640.anInt11085;
							if (local776 < 0) {
								local776 = 0;
							} else if (local776 >= Static222.anInt4533) {
								local776 = Static222.anInt4533;
							}
							local97 -= Static490.anInt8763;
							if (local97 < 0) {
								local97 = 0;
							} else if (local97 >= Static668.anInt11370) {
								local97 = Static668.anInt11370;
							}
							Static5.anInt83 = (local776 << 9) + 256;
							Static533.anInt9359 = (local97 << 9) + 256;
							return;
						}
						Static5.anInt83 = -1;
						Static533.anInt9359 = -1;
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt9159 -= 2;
						local83 = aStringArray58[anInt9159];
						local89 = aStringArray58[anInt9159 + 1];
						local97 = anIntArray467[--anInt9169];
						if (local83.length() > 320) {
							return;
						}
						if (Static579.anInt10049 != 3) {
							return;
						}
						if (Static316.anInt5770 == 0 && Static387.anInt7336 == 0) {
							Static470.aString67 = local83;
							Static332.aString71 = local89;
							Static353.anInt6795 = local97;
							Static248.method4408(6);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static401.method6609();
						return;
					}
					if (arg0 == 5602) {
						if (Static316.anInt5770 == 0) {
							Static507.anInt9028 = -2;
							Static434.anInt5752 = -2;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt9159--;
						if (Static579.anInt10049 != 3) {
							return;
						}
						if (Static316.anInt5770 == 0 && Static387.anInt7336 == 0) {
							Static178.method3495(aStringArray58[anInt9159]);
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt9159 -= 2;
						anInt9169 -= 2;
						if (Static579.anInt10049 != 3) {
							return;
						}
						if (Static316.anInt5770 == 0 && Static387.anInt7336 == 0) {
							Static363.method6179(anIntArray467[anInt9169], anIntArray467[anInt9169 + 1] == 1, aStringArray58[anInt9159 + 1], aStringArray58[anInt9159]);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static387.anInt7336 == 0) {
							Static532.anInt9332 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray467[anInt9169++] = Static434.anInt5752;
						return;
					}
					if (arg0 == 5608) {
						anIntArray467[anInt9169++] = Static566.anInt9812;
						return;
					}
					if (arg0 == 5609) {
						anIntArray467[anInt9169++] = Static532.anInt9332;
						return;
					}
					if (arg0 == 5611) {
						anIntArray467[anInt9169++] = Static373.anInt7100;
						return;
					}
					if (arg0 == 5612) {
						local175 = anIntArray467[--anInt9169];
						if (Static579.anInt10049 != 7) {
							return;
						}
						if (Static316.anInt5770 == 0 && Static387.anInt7336 == 0) {
							if (Static395.aClass207_2 != null) {
								Static395.aClass207_2.method5436();
								Static395.aClass207_2 = null;
							}
							Static353.anInt6795 = local175;
							Static248.method4408(9);
							return;
						}
						return;
					}
					if (arg0 == 5613) {
						anIntArray467[anInt9169++] = Static434.anInt5752;
						return;
					}
					if (arg0 == 5615) {
						anInt9159 -= 2;
						local83 = aStringArray58[anInt9159];
						local89 = aStringArray58[anInt9159 + 1];
						if (local83.length() > 320) {
							return;
						}
						if (Static579.anInt10049 != 3) {
							return;
						}
						if (Static316.anInt5770 == 0 && Static387.anInt7336 == 0) {
							if (Static395.aClass207_2 != null) {
								Static395.aClass207_2.method5436();
								Static395.aClass207_2 = null;
							}
							Static470.aString67 = local83;
							Static332.aString71 = local89;
							Static248.method4408(5);
							return;
						}
						return;
					}
					if (arg0 == 5616) {
						Static425.method7012(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray467[anInt9169++] = Static507.anInt9028;
						return;
					}
					if (arg0 == 5618) {
						anInt9169--;
						return;
					}
					if (arg0 == 5619) {
						anInt9169--;
						return;
					}
					if (arg0 == 5620) {
						anIntArray467[anInt9169++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt9159 -= 2;
						anInt9169 -= 2;
						return;
					}
					if (arg0 == 5622) {
						return;
					}
					if (arg0 == 5623) {
						if (Static616.aString130 != null) {
							anIntArray467[anInt9169++] = 1;
							return;
						}
						anIntArray467[anInt9169++] = 0;
						return;
					}
					if (arg0 == 5624) {
						anIntArray467[anInt9169++] = (int) (Static113.aLong66 >> 32);
						anIntArray467[anInt9169++] = (int) (Static113.aLong66 & 0xFFFFFFFFFFFFFFFFL);
						return;
					}
					if (arg0 == 5625) {
						anIntArray467[anInt9169++] = Static425.aBoolean580 ? 1 : 0;
						return;
					}
					if (arg0 == 5626) {
						Static425.aBoolean580 = true;
						Static99.method1702();
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local175 = anIntArray467[--anInt9169];
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub1_1, local175);
						Static150.method2593();
						Static482.method7663();
						Static388.aBoolean551 = false;
						return;
					}
					@Pc(4900) boolean local4900;
					if (arg0 == 6002) {
						local4900 = anIntArray467[--anInt9169] == 1;
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub9_2, local4900 ? 1 : 0);
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub9_1, local4900 ? 1 : 0);
						Static150.method2593();
						Static597.method8974();
						Static482.method7663();
						Static388.aBoolean551 = false;
						return;
					}
					if (arg0 == 6003) {
						local4900 = anIntArray467[--anInt9169] == 1;
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub17_2, local4900 ? 2 : 1);
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub17_1, local4900 ? 2 : 1);
						Static597.method8974();
						Static482.method7663();
						Static388.aBoolean551 = false;
						return;
					}
					if (arg0 == 6005) {
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub4_1, anIntArray467[--anInt9169] == 1 ? 1 : 0);
						Static150.method2593();
						Static482.method7663();
						Static388.aBoolean551 = false;
						return;
					}
					if (arg0 == 6007) {
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub12_1, anIntArray467[--anInt9169]);
						Static482.method7663();
						Static388.aBoolean551 = false;
						return;
					}
					if (arg0 == 6008) {
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub23_1, anIntArray467[--anInt9169] == 1 ? 1 : 0);
						Static482.method7663();
						Static388.aBoolean551 = false;
						return;
					}
					if (arg0 == 6010) {
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub10_1, anIntArray467[--anInt9169] == 1 ? 1 : 0);
						Static482.method7663();
						Static388.aBoolean551 = false;
						return;
					}
					if (arg0 == 6011) {
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub18_1, anIntArray467[--anInt9169]);
						Static150.method2593();
						Static482.method7663();
						Static388.aBoolean551 = false;
						return;
					}
					if (arg0 == 6012) {
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub28_1, anIntArray467[--anInt9169] == 1 ? 1 : 0);
						Static231.method4178();
						Static593.method7276();
						Static482.method7663();
						Static388.aBoolean551 = false;
						return;
					}
					if (arg0 == 6014) {
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub24_1, anIntArray467[--anInt9169] == 1 ? 2 : 0);
						Static150.method2593();
						Static482.method7663();
						Static388.aBoolean551 = false;
						return;
					}
					if (arg0 == 6015) {
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub3_1, anIntArray467[--anInt9169] == 1 ? 1 : 0);
						Static150.method2593();
						Static482.method7663();
						Static388.aBoolean551 = false;
						return;
					}
					if (arg0 == 6016) {
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub19_1, anIntArray467[--anInt9169]);
						Static389.method6560(false, Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907());
						Static482.method7663();
						return;
					}
					if (arg0 == 6017) {
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub13_1, anIntArray467[--anInt9169] == 1 ? 1 : 0);
						Static191.method3704();
						Static482.method7663();
						Static388.aBoolean551 = false;
						return;
					}
					if (arg0 == 6018) {
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub22_1, anIntArray467[--anInt9169]);
						Static482.method7663();
						Static388.aBoolean551 = false;
						return;
					}
					if (arg0 == 6019) {
						local175 = anIntArray467[--anInt9169];
						local776 = Static230.aClass2_Sub54_15.lb.method7520();
						if (local175 != local776) {
							if (Static259.method4507(Static579.anInt10049)) {
								if (local776 == 0 && Static143.anInt2682 != -1) {
									Static494.method7792(Static143.anInt2682, local175, Static502.aClass124_105);
									Static451.method7283();
									Static239.aBoolean367 = false;
								} else if (local175 == 0) {
									Static13.method7473();
									Static239.aBoolean367 = false;
								} else {
									Static112.method1975(local175);
								}
							}
							Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.lb, local175);
							Static482.method7663();
							Static388.aBoolean551 = false;
						}
						return;
					}
					if (arg0 == 6020) {
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub22_4, anIntArray467[--anInt9169]);
						Static482.method7663();
						Static388.aBoolean551 = false;
						return;
					}
					if (arg0 == 6021) {
						local175 = Static230.aClass2_Sub54_15.aClass4_Sub17_2.method6114();
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub17_1, anIntArray467[--anInt9169] == 1 ? 0 : local175);
						Static597.method8974();
						return;
					}
					if (arg0 == 6023) {
						local175 = anIntArray467[--anInt9169];
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub5_1, local175);
						Static482.method7663();
						Static388.aBoolean551 = false;
						return;
					}
					if (arg0 == 6024) {
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub19_2, anIntArray467[--anInt9169]);
						Static482.method7663();
						return;
					}
					if (arg0 == 6025) {
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub25_1, anIntArray467[--anInt9169]);
						Static482.method7663();
						Static388.aBoolean551 = false;
						return;
					}
					if (arg0 == 6027) {
						local175 = anIntArray467[--anInt9169];
						if (local175 < 0 || local175 > 1) {
							local175 = 0;
						}
						Static640.method9474(local175 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub29_1, anIntArray467[--anInt9169] == 0 ? 0 : 1);
						Static482.method7663();
						return;
					}
					if (arg0 == 6029) {
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub12_1, anIntArray467[--anInt9169]);
						Static482.method7663();
						return;
					}
					if (arg0 == 6030) {
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub8_1, anIntArray467[--anInt9169] == 0 ? 0 : 1);
						Static482.method7663();
						Static150.method2593();
						return;
					}
					if (arg0 == 6031) {
						local175 = anIntArray467[--anInt9169];
						if (local175 < 0 || local175 > 5) {
							local175 = 2;
						}
						Static389.method6560(false, local175);
						return;
					}
					if (arg0 == 6032) {
						anInt9169 -= 2;
						local175 = anIntArray467[anInt9169];
						local1496 = anIntArray467[anInt9169 + 1] == 1;
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub16_1, local175);
						if (!local1496) {
							Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub27_1, 0);
						}
						Static482.method7663();
						Static388.aBoolean551 = false;
						return;
					}
					if (arg0 == 6033) {
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub20_1, anIntArray467[--anInt9169]);
						Static482.method7663();
						return;
					}
					if (arg0 == 6034) {
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub21_1, anIntArray467[--anInt9169] == 1 ? 1 : 0);
						Static482.method7663();
						Static231.method4178();
						Static388.aBoolean551 = false;
						return;
					}
					if (arg0 == 6035) {
						local175 = Static230.aClass2_Sub54_15.aClass4_Sub9_2.method2556();
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub9_1, anIntArray467[--anInt9169] == 1 ? 1 : local175);
						Static150.method2593();
						Static597.method8974();
						return;
					}
					if (arg0 == 6036) {
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub2_1, anIntArray467[--anInt9169]);
						Static482.method7663();
						Static101.aBoolean127 = true;
						return;
					}
					if (arg0 == 6037) {
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub22_2, anIntArray467[--anInt9169]);
						Static482.method7663();
						Static388.aBoolean551 = false;
						return;
					}
					if (arg0 == 6038) {
						local175 = anIntArray467[--anInt9169];
						local776 = Static230.aClass2_Sub54_15.aClass4_Sub22_3.method7520();
						if (local175 != local776 && Static143.anInt2682 == Static5.anInt86) {
							if (!Static259.method4507(Static579.anInt10049)) {
								if (local776 == 0) {
									Static494.method7792(Static143.anInt2682, local175, Static502.aClass124_105);
									Static451.method7283();
									Static239.aBoolean367 = false;
								} else if (local175 == 0) {
									Static13.method7473();
									Static239.aBoolean367 = false;
								} else {
									Static112.method1975(local175);
								}
							}
							Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub22_3, local175);
							Static482.method7663();
							Static388.aBoolean551 = false;
						}
						return;
					}
					if (arg0 == 6039) {
						local175 = anIntArray467[--anInt9169];
						if (local175 > 255 || local175 < 0) {
							local175 = 0;
						}
						if (local175 != Static230.aClass2_Sub54_15.aClass4_Sub14_1.method4565()) {
							Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub14_1, local175);
							Static482.method7663();
							Static388.aBoolean551 = false;
						}
						return;
					}
					if (arg0 == 6040) {
						local175 = anIntArray467[--anInt9169];
						if (local175 != Static230.aClass2_Sub54_15.aClass4_Sub6_1.method1092()) {
							Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub6_1, local175);
							Static482.method7663();
							Static388.aBoolean551 = false;
							Static654.method9605();
						}
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub1_1.method89();
						return;
					}
					if (arg0 == 6102) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub9_2.method2556() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub17_2.method6114() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub4_1.method925() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub12_1.method3303();
						return;
					}
					if (arg0 == 6108) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub23_1.method7664() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub10_1.method2604() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub18_1.method6164();
						return;
					}
					if (arg0 == 6112) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub28_1.method8732() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub24_1.method7684() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub3_1.method498() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub19_1.method6178();
						return;
					}
					if (arg0 == 6117) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub13_1.method3956() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub22_1.method7520();
						return;
					}
					if (arg0 == 6119) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.lb.method7520();
						return;
					}
					if (arg0 == 6120) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub22_4.method7520();
						return;
					}
					if (arg0 == 6123) {
						anIntArray467[anInt9169++] = Static655.method9611();
						return;
					}
					if (arg0 == 6124) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub19_2.method6178();
						return;
					}
					if (arg0 == 6125) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub25_1.method8512();
						return;
					}
					if (arg0 == 6127) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub15_1.method4882() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub29_1.method9230() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub12_1.method3303();
						return;
					}
					if (arg0 == 6130) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub8_1.method2456() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907();
						return;
					}
					if (arg0 == 6132) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub16_1.method4907();
						return;
					}
					if (arg0 == 6133) {
						anIntArray467[anInt9169++] = Static96.aClass48_5.aBoolean75 && !Static96.aClass48_5.aBoolean76 ? 1 : 0;
						return;
					}
					if (arg0 == 6135) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub20_1.method6428();
						return;
					}
					if (arg0 == 6136) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub21_1.method6610() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6138) {
						anIntArray467[anInt9169++] = Static457.method7338(200, Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907());
						return;
					}
					if (arg0 == 6139) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub2_1.method172();
						return;
					}
					if (arg0 == 6142) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub22_2.method7520();
						return;
					}
					if (arg0 == 6143) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub22_3.method7520();
						return;
					}
					if (arg0 == 6144) {
						anIntArray467[anInt9169++] = Static282.aBoolean392 ? 1 : 0;
						return;
					}
					if (arg0 == 6145) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub14_1.method4565();
						return;
					}
					if (arg0 == 6146) {
						anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub6_1.method1092();
						return;
					}
					if (arg0 == 6147) {
						anIntArray467[anInt9169++] = Static466.aClass2_Sub55_1.anInt11444 < 512 || Static282.aBoolean392 || Static377.aBoolean540 ? 1 : 0;
						return;
					}
					if (arg0 == 6148) {
						anIntArray467[anInt9169++] = Static643.aBoolean797 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt9169 -= 2;
						Static522.aShort101 = (short) anIntArray467[anInt9169];
						if (Static522.aShort101 <= 0) {
							Static522.aShort101 = 256;
						}
						Static486.aShort94 = (short) anIntArray467[anInt9169 + 1];
						if (Static486.aShort94 <= 0) {
							Static486.aShort94 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt9169 -= 2;
						Static160.aShort119 = (short) anIntArray467[anInt9169];
						if (Static160.aShort119 <= 0) {
							Static160.aShort119 = 256;
						}
						Static187.aShort43 = (short) anIntArray467[anInt9169 + 1];
						if (Static187.aShort43 <= 0) {
							Static187.aShort43 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt9169 -= 4;
						Static523.aShort102 = (short) anIntArray467[anInt9169];
						if (Static523.aShort102 <= 0) {
							Static523.aShort102 = 1;
						}
						Static589.aShort117 = (short) anIntArray467[anInt9169 + 1];
						if (Static589.aShort117 <= 0) {
							Static589.aShort117 = 32767;
						} else if (Static589.aShort117 < Static523.aShort102) {
							Static589.aShort117 = Static523.aShort102;
						}
						Static553.aShort105 = (short) anIntArray467[anInt9169 + 2];
						if (Static553.aShort105 <= 0) {
							Static553.aShort105 = 1;
						}
						Static262.aShort53 = (short) anIntArray467[anInt9169 + 3];
						if (Static262.aShort53 <= 0) {
							Static262.aShort53 = 32767;
							return;
						}
						if (Static262.aShort53 < Static553.aShort105) {
							Static262.aShort53 = Static553.aShort105;
						}
						return;
					}
					if (arg0 == 6203) {
						Static127.method2286(0, Static615.aClass357_163.anInt10395, false, 0, Static615.aClass357_163.anInt10465);
						anIntArray467[anInt9169++] = Static598.anInt10388;
						anIntArray467[anInt9169++] = Static656.anInt11250;
						return;
					}
					if (arg0 == 6204) {
						anIntArray467[anInt9169++] = Static160.aShort119;
						anIntArray467[anInt9169++] = Static187.aShort43;
						return;
					}
					if (arg0 == 6205) {
						anIntArray467[anInt9169++] = Static522.aShort101;
						anIntArray467[anInt9169++] = Static486.aShort94;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray467[anInt9169++] = (int) (Static99.method1701() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray467[anInt9169++] = (int) (Static99.method1701() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt9169 -= 3;
						local175 = anIntArray467[anInt9169];
						local776 = anIntArray467[anInt9169 + 1];
						local97 = anIntArray467[anInt9169 + 2];
						@Pc(6709) long local6709 = Static533.method8252(local175, local776, local97);
						local3369 = Static1.method6528(local6709);
						if (local97 < 1970) {
							local3369--;
						}
						anIntArray467[anInt9169++] = local3369;
						return;
					}
					if (arg0 == 6303) {
						anIntArray467[anInt9169++] = Static485.method7682(Static99.method1701());
						return;
					}
					if (arg0 == 6304) {
						local175 = anIntArray467[--anInt9169];
						local1496 = true;
						if (local175 < 0) {
							local1496 = (local175 + 1) % 4 == 0;
						} else if (local175 < 1582) {
							local1496 = local175 % 4 == 0;
						} else if (local175 % 4 != 0) {
							local1496 = false;
						} else if (local175 % 100 != 0) {
							local1496 = true;
						} else if (local175 % 400 != 0) {
							local1496 = false;
						}
						anIntArray467[anInt9169++] = local1496 ? 1 : 0;
						return;
					}
					if (arg0 == 6305) {
						local175 = anIntArray467[--anInt9169];
						@Pc(6827) int[] local6827 = Static247.method4405(local175);
						Static679.method4128(local6827, 0, anIntArray467, anInt9169, 3);
						anInt9169 += 3;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray467[anInt9169++] = Static584.method4098() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray467[anInt9169++] = Static136.method2386() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static579.anInt10049 == 7 && Static316.anInt5770 == 0 && Static387.anInt7336 == 0) {
							if (Static617.aBoolean782) {
								anIntArray467[anInt9169++] = 0;
								return;
							}
							if (Static428.aLong218 > Static99.method1701() - 1000L) {
								anIntArray467[anInt9169++] = 1;
								return;
							}
							Static617.aBoolean782 = true;
							local52 = Static311.method5098(Static613.aClass341_102, Static125.aClass179_1);
							local52.aClass2_Sub8_Sub2_2.method5194(Static186.anInt3867);
							Static38.method791(local52);
							anIntArray467[anInt9169++] = 0;
							return;
						}
						anIntArray467[anInt9169++] = 1;
						return;
					}
					@Pc(6987) Class122 local6987;
					@Pc(6954) Class234_Sub1 local6954;
					if (arg0 == 6501) {
						local6954 = Static8.method137();
						if (local6954 != null) {
							anIntArray467[anInt9169++] = local6954.anInt7096;
							anIntArray467[anInt9169++] = local6954.anInt7086;
							aStringArray58[anInt9159++] = local6954.aString86;
							local6987 = local6954.method6351();
							anIntArray467[anInt9169++] = local6987.anInt3866;
							aStringArray58[anInt9159++] = local6987.aString43;
							anIntArray467[anInt9169++] = local6954.anInt7085;
							anIntArray467[anInt9169++] = local6954.anInt7095;
							aStringArray58[anInt9159++] = local6954.aString85;
							return;
						}
						anIntArray467[anInt9169++] = -1;
						anIntArray467[anInt9169++] = 0;
						aStringArray58[anInt9159++] = "";
						anIntArray467[anInt9169++] = 0;
						aStringArray58[anInt9159++] = "";
						anIntArray467[anInt9169++] = 0;
						anIntArray467[anInt9169++] = 0;
						aStringArray58[anInt9159++] = "";
						return;
					}
					if (arg0 == 6502) {
						local6954 = Static525.method8174();
						if (local6954 != null) {
							anIntArray467[anInt9169++] = local6954.anInt7096;
							anIntArray467[anInt9169++] = local6954.anInt7086;
							aStringArray58[anInt9159++] = local6954.aString86;
							local6987 = local6954.method6351();
							anIntArray467[anInt9169++] = local6987.anInt3866;
							aStringArray58[anInt9159++] = local6987.aString43;
							anIntArray467[anInt9169++] = local6954.anInt7085;
							anIntArray467[anInt9169++] = local6954.anInt7095;
							aStringArray58[anInt9159++] = local6954.aString85;
							return;
						}
						anIntArray467[anInt9169++] = -1;
						anIntArray467[anInt9169++] = 0;
						aStringArray58[anInt9159++] = "";
						anIntArray467[anInt9169++] = 0;
						aStringArray58[anInt9159++] = "";
						anIntArray467[anInt9169++] = 0;
						anIntArray467[anInt9169++] = 0;
						aStringArray58[anInt9159++] = "";
						return;
					}
					if (arg0 == 6503) {
						local175 = anIntArray467[--anInt9169];
						local89 = aStringArray58[--anInt9159];
						if (Static579.anInt10049 == 7 && Static316.anInt5770 == 0 && Static387.anInt7336 == 0) {
							anIntArray467[anInt9169++] = Static163.method3291(local175, local89) ? 1 : 0;
							return;
						}
						anIntArray467[anInt9169++] = 0;
						return;
					}
					if (arg0 == 6506) {
						local175 = anIntArray467[--anInt9169];
						@Pc(7314) Class234_Sub1 local7314 = Static69.method1289(local175);
						if (local7314 != null) {
							anIntArray467[anInt9169++] = local7314.anInt7086;
							aStringArray58[anInt9159++] = local7314.aString86;
							@Pc(7338) Class122 local7338 = local7314.method6351();
							anIntArray467[anInt9169++] = local7338.anInt3866;
							aStringArray58[anInt9159++] = local7338.aString43;
							anIntArray467[anInt9169++] = local7314.anInt7085;
							anIntArray467[anInt9169++] = local7314.anInt7095;
							aStringArray58[anInt9159++] = local7314.aString85;
							return;
						}
						anIntArray467[anInt9169++] = -1;
						aStringArray58[anInt9159++] = "";
						anIntArray467[anInt9169++] = 0;
						aStringArray58[anInt9159++] = "";
						anIntArray467[anInt9169++] = 0;
						anIntArray467[anInt9169++] = 0;
						aStringArray58[anInt9159++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt9169 -= 4;
						local175 = anIntArray467[anInt9169];
						local1496 = anIntArray467[anInt9169 + 1] == 1;
						local97 = anIntArray467[anInt9169 + 2];
						local2205 = anIntArray467[anInt9169 + 3] == 1;
						Static139.method2441(local175, local97, local1496, local2205);
						return;
					}
					if (arg0 == 6508) {
						Static634.method9354();
						return;
					}
					if (arg0 == 6509) {
						if (Static579.anInt10049 != 7) {
							return;
						}
						Static213.aBoolean347 = anIntArray467[--anInt9169] == 1;
						return;
					}
					if (arg0 == 6510) {
						anIntArray467[anInt9169++] = Static167.anInt3593;
						return;
					}
				} else if (arg0 >= 6700) {
					if (arg0 < 6800 && Static91.aClass177_1 == Static250.aClass177_2) {
						if (arg0 == 6700) {
							local175 = Static507.aClass335_33.method8361();
							if (Static567.anInt9844 != -1) {
								local175++;
							}
							anIntArray467[anInt9169++] = local175;
							return;
						}
						if (arg0 == 6701) {
							local175 = anIntArray467[--anInt9169];
							if (Static567.anInt9844 != -1) {
								if (local175 == 0) {
									anIntArray467[anInt9169++] = Static567.anInt9844;
									return;
								}
								local175--;
							}
							@Pc(7586) Class2_Sub20 local7586 = (Class2_Sub20) Static507.aClass335_33.method8358();
							while (local175-- > 0) {
								local7586 = (Class2_Sub20) Static507.aClass335_33.method8355();
							}
							anIntArray467[anInt9169++] = local7586.anInt1667;
							return;
						}
						if (arg0 == 6702) {
							local175 = anIntArray467[--anInt9169];
							if (Static111.aClass357ArrayArray1[local175] == null) {
								aStringArray58[anInt9159++] = "";
								return;
							}
							local89 = Static111.aClass357ArrayArray1[local175][0].aString125;
							if (local89 == null) {
								aStringArray58[anInt9159++] = "";
								return;
							}
							aStringArray58[anInt9159++] = local89.substring(0, local89.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local175 = anIntArray467[--anInt9169];
							if (Static111.aClass357ArrayArray1[local175] == null) {
								anIntArray467[anInt9169++] = 0;
								return;
							}
							anIntArray467[anInt9169++] = Static111.aClass357ArrayArray1[local175].length;
							return;
						}
						if (arg0 == 6704) {
							anInt9169 -= 2;
							local175 = anIntArray467[anInt9169];
							local776 = anIntArray467[anInt9169 + 1];
							if (Static111.aClass357ArrayArray1[local175] == null) {
								aStringArray58[anInt9159++] = "";
								return;
							}
							local181 = Static111.aClass357ArrayArray1[local175][local776].aString125;
							if (local181 == null) {
								aStringArray58[anInt9159++] = "";
								return;
							}
							aStringArray58[anInt9159++] = local181;
							return;
						}
						if (arg0 == 6705) {
							anInt9169 -= 2;
							local175 = anIntArray467[anInt9169];
							local776 = anIntArray467[anInt9169 + 1];
							if (Static111.aClass357ArrayArray1[local175] == null) {
								anIntArray467[anInt9169++] = 0;
								return;
							}
							anIntArray467[anInt9169++] = Static111.aClass357ArrayArray1[local175][local776].anInt10405;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							anInt9169 -= 3;
							local175 = anIntArray467[anInt9169];
							local776 = anIntArray467[anInt9169 + 1];
							local97 = anIntArray467[anInt9169 + 2];
							Static158.method3194("", 1, local175 << 16 | local776, local97);
							return;
						}
						if (arg0 == 6708) {
							anInt9169 -= 3;
							local175 = anIntArray467[anInt9169];
							local776 = anIntArray467[anInt9169 + 1];
							local97 = anIntArray467[anInt9169 + 2];
							Static158.method3194("", 2, local175 << 16 | local776, local97);
							return;
						}
						if (arg0 == 6709) {
							anInt9169 -= 3;
							local175 = anIntArray467[anInt9169];
							local776 = anIntArray467[anInt9169 + 1];
							local97 = anIntArray467[anInt9169 + 2];
							Static158.method3194("", 3, local175 << 16 | local776, local97);
							return;
						}
						if (arg0 == 6710) {
							anInt9169 -= 3;
							local175 = anIntArray467[anInt9169];
							local776 = anIntArray467[anInt9169 + 1];
							local97 = anIntArray467[anInt9169 + 2];
							Static158.method3194("", 4, local175 << 16 | local776, local97);
							return;
						}
						if (arg0 == 6711) {
							anInt9169 -= 3;
							local175 = anIntArray467[anInt9169];
							local776 = anIntArray467[anInt9169 + 1];
							local97 = anIntArray467[anInt9169 + 2];
							Static158.method3194("", 5, local175 << 16 | local776, local97);
							return;
						}
						if (arg0 == 6712) {
							anInt9169 -= 3;
							local175 = anIntArray467[anInt9169];
							local776 = anIntArray467[anInt9169 + 1];
							local97 = anIntArray467[anInt9169 + 2];
							Static158.method3194("", 6, local175 << 16 | local776, local97);
							return;
						}
						if (arg0 == 6713) {
							anInt9169 -= 3;
							local175 = anIntArray467[anInt9169];
							local776 = anIntArray467[anInt9169 + 1];
							local97 = anIntArray467[anInt9169 + 2];
							Static158.method3194("", 7, local175 << 16 | local776, local97);
							return;
						}
						if (arg0 == 6714) {
							anInt9169 -= 3;
							local175 = anIntArray467[anInt9169];
							local776 = anIntArray467[anInt9169 + 1];
							local97 = anIntArray467[anInt9169 + 2];
							Static158.method3194("", 8, local175 << 16 | local776, local97);
							return;
						}
						if (arg0 == 6715) {
							anInt9169 -= 3;
							local175 = anIntArray467[anInt9169];
							local776 = anIntArray467[anInt9169 + 1];
							local97 = anIntArray467[anInt9169 + 2];
							Static158.method3194("", 9, local175 << 16 | local776, local97);
							return;
						}
						if (arg0 == 6716) {
							anInt9169 -= 3;
							local175 = anIntArray467[anInt9169];
							local776 = anIntArray467[anInt9169 + 1];
							local97 = anIntArray467[anInt9169 + 2];
							Static158.method3194("", 10, local175 << 16 | local776, local97);
							return;
						}
						if (arg0 == 6717) {
							anInt9169 -= 3;
							local175 = anIntArray467[anInt9169];
							local776 = anIntArray467[anInt9169 + 1];
							local97 = anIntArray467[anInt9169 + 2];
							@Pc(8174) Class357 local8174 = Static226.method4160(local97, local175 << 16 | local776);
							Static417.method6895();
							@Pc(8179) Class2_Sub11 local8179 = Static85.method1469(local8174);
							Static390.method6563(local8179.method1142(), local8179.anInt1160, local8174);
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(8207) Class218 local8207;
						if (arg0 == 6800) {
							local175 = anIntArray467[--anInt9169];
							local8207 = Static350.aClass5_3.method94(local175);
							if (local8207.aString76 == null) {
								aStringArray58[anInt9159++] = "";
								return;
							}
							aStringArray58[anInt9159++] = local8207.aString76;
							return;
						}
						if (arg0 == 6801) {
							local175 = anIntArray467[--anInt9169];
							local8207 = Static350.aClass5_3.method94(local175);
							anIntArray467[anInt9169++] = local8207.anInt6690;
							return;
						}
						if (arg0 == 6802) {
							local175 = anIntArray467[--anInt9169];
							local8207 = Static350.aClass5_3.method94(local175);
							anIntArray467[anInt9169++] = local8207.anInt6703;
							return;
						}
						if (arg0 == 6803) {
							local175 = anIntArray467[--anInt9169];
							local8207 = Static350.aClass5_3.method94(local175);
							anIntArray467[anInt9169++] = local8207.anInt6683;
							return;
						}
						if (arg0 == 6804) {
							anInt9169 -= 2;
							local175 = anIntArray467[anInt9169];
							local776 = anIntArray467[anInt9169 + 1];
							@Pc(8329) Class204 local8329 = Static142.aClass367_1.method9243(local776);
							if (local8329.method5366()) {
								aStringArray58[anInt9159++] = Static350.aClass5_3.method94(local175).method6008(local8329.aString69, local776);
								return;
							}
							anIntArray467[anInt9169++] = Static350.aClass5_3.method94(local175).method6000(local8329.anInt5933, local776);
							return;
						}
					} else if (arg0 < 7000) {
						if (arg0 == 6900) {
							anIntArray467[anInt9169++] = Static145.aBoolean199 && !Static501.aBoolean678 ? 1 : 0;
							return;
						}
						if (arg0 == 6901) {
							anIntArray467[anInt9169++] = (int) (Static41.aLong30 / 60000L);
							anIntArray467[anInt9169++] = (int) ((Static41.aLong30 - Static99.method1701() - Static201.aLong107) / 60000L);
							anIntArray467[anInt9169++] = Static629.aBoolean787 ? 1 : 0;
							return;
						}
						if (arg0 == 6902) {
							anIntArray467[anInt9169++] = Static510.anInt9054;
							return;
						}
						if (arg0 == 6903) {
							anIntArray467[anInt9169++] = Static335.anInt6094;
							return;
						}
						if (arg0 == 6904) {
							anIntArray467[anInt9169++] = Static199.anInt4198;
							return;
						}
						if (arg0 == 6905) {
							local83 = "";
							if (Static185.aClass268_5 != null) {
								if (Static185.aClass268_5.anObject19 == null) {
									local83 = Static317.method6701(Static185.aClass268_5.anInt8010);
								} else {
									local83 = (String) Static185.aClass268_5.anObject19;
								}
							}
							aStringArray58[anInt9159++] = local83;
							return;
						}
						if (arg0 == 6906) {
							anIntArray467[anInt9169++] = Static287.anInt5261;
							return;
						}
						if (arg0 == 6907) {
							anIntArray467[anInt9169++] = Static260.anInt4987;
							return;
						}
						if (arg0 == 6908) {
							anIntArray467[anInt9169++] = Static151.anInt2801;
							return;
						}
						if (arg0 == 6909) {
							anIntArray467[anInt9169++] = Static137.aBoolean194 ? 1 : 0;
							return;
						}
						if (arg0 == 6910) {
							anIntArray467[anInt9169++] = Static534.anInt9700;
							return;
						}
						if (arg0 == 6911) {
							anIntArray467[anInt9169++] = Static404.anInt7482;
							return;
						}
						if (arg0 == 6912) {
							anIntArray467[anInt9169++] = Static101.anInt1791;
							return;
						}
						if (arg0 == 6913) {
							anIntArray467[anInt9169++] = Static553.anInt9674;
							return;
						}
					} else if (arg0 < 7100) {
						if (arg0 == 7000) {
							local175 = Static615.method9216();
							anIntArray467[anInt9169++] = Static409.anInt7631 = Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907();
							anIntArray467[anInt9169++] = local175;
							Static150.method2593();
							Static482.method7663();
							Static388.aBoolean551 = false;
							return;
						}
						if (arg0 == 7001) {
							Static380.method6434();
							Static150.method2593();
							Static482.method7663();
							Static388.aBoolean551 = false;
							return;
						}
						if (arg0 == 7002) {
							Static481.method7650();
							Static150.method2593();
							Static482.method7663();
							Static388.aBoolean551 = false;
							return;
						}
						if (arg0 == 7003) {
							Static631.method9340();
							Static150.method2593();
							Static482.method7663();
							Static388.aBoolean551 = false;
							return;
						}
						if (arg0 == 7004) {
							Static520.method8043();
							Static150.method2593();
							Static482.method7663();
							Static388.aBoolean551 = false;
							return;
						}
						if (arg0 == 7005) {
							Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub27_1, 0);
							Static482.method7663();
							Static388.aBoolean551 = false;
							return;
						}
						if (arg0 == 7006) {
							if (Static409.anInt7631 == 2) {
								Static431.aBoolean188 = true;
								return;
							}
							if (Static409.anInt7631 == 1) {
								Static397.aBoolean792 = true;
								return;
							}
							if (Static409.anInt7631 == 3) {
								Static412.aBoolean569 = true;
							}
							return;
						}
						if (arg0 == 7007) {
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub27_1.method8706();
							return;
						}
					} else if (arg0 < 7200) {
						if (arg0 == 7100) {
							anInt9169 -= 2;
							local175 = anIntArray467[anInt9169];
							local776 = anIntArray467[anInt9169 + 1];
							if (local175 != -1) {
								if (local776 > 255) {
									local776 = 255;
								} else if (local776 < 0) {
									local776 = 0;
								}
								Static577.method8738(false, local776, local175);
							}
							return;
						}
						if (arg0 == 7101) {
							local175 = anIntArray467[--anInt9169];
							if (local175 != -1) {
								Static274.method4661(local175);
							}
							return;
						}
						if (arg0 == 7102) {
							local175 = anIntArray467[--anInt9169];
							if (local175 != -1) {
								Static563.method8553(local175);
							}
							return;
						}
						if (arg0 == 7103) {
							anIntArray467[anInt9169++] = Static193.method3740("jagtheora") ? 1 : 0;
							return;
						}
					} else if (arg0 < 7300) {
						if (arg0 == 7201) {
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub4_1.method924() ? 1 : 0;
							return;
						}
						if (arg0 == 7202) {
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub10_1.method2602() ? 1 : 0;
							return;
						}
						if (arg0 == 7203) {
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub18_1.method6162() ? 1 : 0;
							return;
						}
						if (arg0 == 7204) {
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub24_1.method7686() ? 1 : 0;
							return;
						}
						if (arg0 == 7205) {
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub19_2.method6182() && Static607.aClass101_15.method8133() ? 1 : 0;
							return;
						}
						if (arg0 == 7206) {
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub5_1.method1071() ? 1 : 0;
							return;
						}
						if (arg0 == 7207) {
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub25_1.method8514() ? 1 : 0;
							return;
						}
						if (arg0 == 7208) {
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub15_1.method4880() && Static607.aClass101_15.method8136() ? 1 : 0;
							return;
						}
						if (arg0 == 7209) {
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub8_1.method2461() ? 1 : 0;
							return;
						}
						if (arg0 == 7210) {
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub21_1.method6611() ? 1 : 0;
							return;
						}
						if (arg0 == 7211) {
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub2_1.method171() ? 1 : 0;
							return;
						}
						if (arg0 == 7212) {
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub3_1.method501() ? 1 : 0;
							return;
						}
						if (arg0 == 7213) {
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub6_1.method1089() ? 1 : 0;
							return;
						}
						if (arg0 == 7214) {
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub16_1.method4909() ? 1 : 0;
							return;
						}
					} else if (arg0 < 7400) {
						if (arg0 == 7301) {
							local175 = anIntArray467[--anInt9169];
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub4_1.method9223(local175);
							return;
						}
						if (arg0 == 7302) {
							local175 = anIntArray467[--anInt9169];
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub10_1.method9223(local175);
							return;
						}
						if (arg0 == 7303) {
							local175 = anIntArray467[--anInt9169];
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub18_1.method9223(local175);
							return;
						}
						if (arg0 == 7304) {
							local175 = anIntArray467[--anInt9169];
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub24_1.method9223(local175);
							return;
						}
						if (arg0 == 7305) {
							local175 = anIntArray467[--anInt9169];
							if (!Static607.aClass101_15.method8133()) {
								anIntArray467[anInt9169++] = 3;
								return;
							}
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub19_2.method9223(local175);
							return;
						}
						if (arg0 == 7306) {
							local175 = anIntArray467[--anInt9169];
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub5_1.method9223(local175);
							return;
						}
						if (arg0 == 7307) {
							local175 = anIntArray467[--anInt9169];
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub25_1.method9223(local175);
							return;
						}
						if (arg0 == 7308) {
							local175 = anIntArray467[--anInt9169];
							if (!Static607.aClass101_15.method8136()) {
								anIntArray467[anInt9169++] = 3;
								return;
							}
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub15_1.method9223(local175);
							return;
						}
						if (arg0 == 7309) {
							local175 = anIntArray467[--anInt9169];
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub8_1.method9223(local175);
							return;
						}
						if (arg0 == 7310) {
							local175 = anIntArray467[--anInt9169];
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub21_1.method9223(local175);
							return;
						}
						if (arg0 == 7311) {
							local175 = anIntArray467[--anInt9169];
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub2_1.method9223(local175);
							return;
						}
						if (arg0 == 7312) {
							local175 = anIntArray467[--anInt9169];
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub3_1.method9223(local175);
							return;
						}
						if (arg0 == 7313) {
							local175 = anIntArray467[--anInt9169];
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub6_1.method9223(local175);
							return;
						}
						if (arg0 == 7314) {
							local175 = anIntArray467[--anInt9169];
							anIntArray467[anInt9169++] = Static230.aClass2_Sub54_15.aClass4_Sub16_1.method9223(local175);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!rja", name = "c", descriptor = "(IZ)V")
	private static void method8034(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class357 local137;
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(158) Class357 local158;
		@Pc(35) Class357 local35;
		@Pc(210) Class357 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 150) {
				anInt9169 -= 3;
				local13 = anIntArray467[anInt9169];
				local19 = anIntArray467[anInt9169 + 1];
				local25 = anIntArray467[anInt9169 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static647.method9532(local13);
				if (local35.aClass357Array2 == null) {
					local35.aClass357Array2 = new Class357[local25 + 1];
				}
				if (local35.aClass357Array2.length <= local25) {
					@Pc(54) Class357[] local54 = new Class357[local25 + 1];
					for (local56 = 0; local56 < local35.aClass357Array2.length; local56++) {
						local54[local56] = local35.aClass357Array2[local56];
					}
					local35.aClass357Array2 = local54;
				}
				if (local25 > 0 && local35.aClass357Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class357 local99 = new Class357();
				local99.anInt10430 = local19;
				local99.anInt10449 = local99.anInt10460 = local35.anInt10460;
				local99.anInt10432 = local25;
				local35.aClass357Array2[local25] = local99;
				if (arg1) {
					aClass357_134 = local99;
				} else {
					aClass357_135 = local99;
				}
				Static473.method7526(local35);
				return;
			}
			if (arg0 == 151) {
				local137 = arg1 ? aClass357_134 : aClass357_135;
				if (local137.anInt10432 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static647.method9532(local137.anInt10460);
				local158.aClass357Array2[local137.anInt10432] = null;
				Static473.method7526(local158);
				return;
			}
			if (arg0 == 152) {
				local137 = Static647.method9532(anIntArray467[--anInt9169]);
				local137.aClass357Array2 = null;
				Static473.method7526(local137);
				return;
			}
			if (arg0 == 200) {
				anInt9169 -= 2;
				local13 = anIntArray467[anInt9169];
				local19 = anIntArray467[anInt9169 + 1];
				local210 = Static226.method4160(local19, local13);
				if (local210 != null && local19 != -1) {
					anIntArray467[anInt9169++] = 1;
					if (arg1) {
						aClass357_134 = local210;
						return;
					}
					aClass357_135 = local210;
					return;
				}
				anIntArray467[anInt9169++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray467[--anInt9169];
				local158 = Static647.method9532(local13);
				if (local158 != null) {
					anIntArray467[anInt9169++] = 1;
					if (arg1) {
						aClass357_134 = local158;
						return;
					}
					aClass357_135 = local158;
					return;
				}
				anIntArray467[anInt9169++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray467[--anInt9169];
				method8029(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray467[--anInt9169];
				method8023(local13);
				return;
			}
		} else {
			@Pc(357) int local357;
			@Pc(420) boolean local420;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt9169 -= 2;
					local13 = anIntArray467[anInt9169];
					local19 = anIntArray467[anInt9169 + 1];
					if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aClass9_1 == null) {
						return;
					}
					for (local25 = 0; local25 < Static581.anIntArray513.length; local25++) {
						if (Static581.anIntArray513[local25] == local13) {
							Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aClass9_1.method144(Static42.aClass96_2, local19, local25);
							return;
						}
					}
					for (local357 = 0; local357 < Static593.anIntArray406.length; local357++) {
						if (Static593.anIntArray406[local357] == local13) {
							Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aClass9_1.method144(Static42.aClass96_2, local19, local357);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt9169 -= 2;
					local13 = anIntArray467[anInt9169];
					local19 = anIntArray467[anInt9169 + 1];
					if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aClass9_1 == null) {
						return;
					}
					Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aClass9_1.method143(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local420 = anIntArray467[--anInt9169] != 0;
					if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aClass9_1 == null) {
						return;
					}
					Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aClass9_1.method140(local420);
					return;
				}
				if (arg0 == 411) {
					anInt9169 -= 2;
					local13 = anIntArray467[anInt9169];
					local19 = anIntArray467[anInt9169 + 1];
					if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aClass9_1 == null) {
						return;
					}
					Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aClass9_1.method149(local19, local13, Static372.aClass343_1);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static647.method9532(anIntArray467[--anInt9169]);
				} else {
					local137 = arg1 ? aClass357_134 : aClass357_135;
				}
				if (arg0 == 1000) {
					anInt9169 -= 4;
					local137.anInt10477 = anIntArray467[anInt9169];
					local137.anInt10391 = anIntArray467[anInt9169 + 1];
					local19 = anIntArray467[anInt9169 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray467[anInt9169 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte134 = (byte) local19;
					local137.aByte135 = (byte) local25;
					Static473.method7526(local137);
					Static614.method9214(local137);
					if (local137.anInt10432 == -1) {
						Static319.method5282(local137.anInt10460);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt9169 -= 4;
					local137.anInt10417 = anIntArray467[anInt9169];
					local137.anInt10486 = anIntArray467[anInt9169 + 1];
					local137.anInt10480 = 0;
					local137.anInt10444 = 0;
					local19 = anIntArray467[anInt9169 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray467[anInt9169 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte136 = (byte) local19;
					local137.aByte137 = (byte) local25;
					Static473.method7526(local137);
					Static614.method9214(local137);
					if (local137.anInt10430 == 0) {
						Static171.method3357(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(661) boolean local661 = anIntArray467[--anInt9169] == 1;
					if (local137.aBoolean762 != local661) {
						local137.aBoolean762 = local661;
						Static473.method7526(local137);
					}
					if (local137.anInt10432 == -1) {
						Static500.method7875(local137.anInt10460);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt9169 -= 2;
					local137.anInt10401 = anIntArray467[anInt9169];
					local137.anInt10463 = anIntArray467[anInt9169 + 1];
					Static473.method7526(local137);
					Static614.method9214(local137);
					if (local137.anInt10430 == 0) {
						Static171.method3357(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean752 = anIntArray467[--anInt9169] == 1;
					return;
				}
			} else {
				@Pc(1523) String local1523;
				@Pc(1161) String local1161;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static647.method9532(anIntArray467[--anInt9169]);
					} else {
						local137 = arg1 ? aClass357_134 : aClass357_135;
					}
					if (arg0 == 1100) {
						anInt9169 -= 2;
						local137.anInt10403 = anIntArray467[anInt9169];
						if (local137.anInt10403 > local137.anInt10393 - local137.anInt10395) {
							local137.anInt10403 = local137.anInt10393 - local137.anInt10395;
						}
						if (local137.anInt10403 < 0) {
							local137.anInt10403 = 0;
						}
						local137.anInt10458 = anIntArray467[anInt9169 + 1];
						if (local137.anInt10458 > local137.anInt10413 - local137.anInt10465) {
							local137.anInt10458 = local137.anInt10413 - local137.anInt10465;
						}
						if (local137.anInt10458 < 0) {
							local137.anInt10458 = 0;
						}
						Static473.method7526(local137);
						if (local137.anInt10432 == -1) {
							Static40.method810(local137.anInt10460);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt10411 = anIntArray467[--anInt9169];
						Static473.method7526(local137);
						if (local137.anInt10432 == -1) {
							Static519.method8037(local137.anInt10460);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean758 = anIntArray467[--anInt9169] == 1;
						Static473.method7526(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt10452 = anIntArray467[--anInt9169];
						Static473.method7526(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt10412 = anIntArray467[--anInt9169];
						Static473.method7526(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray467[--anInt9169];
						if (local137.anInt10459 != local19) {
							local137.anInt10459 = local19;
							Static473.method7526(local137);
						}
						if (local137.anInt10432 == -1) {
							Static188.method7430(local137.anInt10460);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt10464 = anIntArray467[--anInt9169];
						Static473.method7526(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean754 = anIntArray467[--anInt9169] == 1;
						Static473.method7526(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt10404 = 1;
						local137.anInt10441 = anIntArray467[--anInt9169];
						Static473.method7526(local137);
						if (local137.anInt10432 == -1) {
							Static207.method3924(local137.anInt10460);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt9169 -= 6;
						local137.anInt10445 = anIntArray467[anInt9169];
						local137.anInt10422 = anIntArray467[anInt9169 + 1];
						local137.anInt10414 = anIntArray467[anInt9169 + 2];
						local137.anInt10399 = anIntArray467[anInt9169 + 3];
						local137.anInt10469 = anIntArray467[anInt9169 + 4];
						local137.anInt10455 = anIntArray467[anInt9169 + 5];
						Static473.method7526(local137);
						if (local137.anInt10432 == -1) {
							Static296.method4895(local137.anInt10460);
							Static26.method460(local137.anInt10460);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray467[--anInt9169];
						if (local137.anInt10446 != local19) {
							local137.anInt10446 = local19;
							local137.anInt10475 = 0;
							local137.anInt10408 = 1;
							local137.anInt10467 = 0;
							@Pc(1110) Class178 local1110 = local137.anInt10446 == -1 ? null : Static354.aClass40_2.method1123(local137.anInt10446);
							if (local1110 != null) {
								Static364.method6183(local137.anInt10475, local1110);
							}
							Static473.method7526(local137);
						}
						if (local137.anInt10432 == -1) {
							Static480.method7628(local137.anInt10460);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean757 = anIntArray467[--anInt9169] == 1;
						Static473.method7526(local137);
						return;
					}
					if (arg0 == 1112) {
						local1161 = aStringArray58[--anInt9159];
						if (!local1161.equals(local137.aString123)) {
							local137.aString123 = local1161;
							Static473.method7526(local137);
						}
						if (local137.anInt10432 == -1) {
							Static124.method2253(local137.anInt10460);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt10397 = anIntArray467[--anInt9169];
						Static473.method7526(local137);
						if (local137.anInt10432 == -1) {
							Static377.method6402(local137.anInt10460);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt9169 -= 3;
						local137.anInt10479 = anIntArray467[anInt9169];
						local137.anInt10415 = anIntArray467[anInt9169 + 1];
						local137.anInt10416 = anIntArray467[anInt9169 + 2];
						Static473.method7526(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean766 = anIntArray467[--anInt9169] == 1;
						Static473.method7526(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt10400 = anIntArray467[--anInt9169];
						Static473.method7526(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt10481 = anIntArray467[--anInt9169];
						Static473.method7526(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean759 = anIntArray467[--anInt9169] == 1;
						Static473.method7526(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean756 = anIntArray467[--anInt9169] == 1;
						Static473.method7526(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt9169 -= 2;
						local137.anInt10393 = anIntArray467[anInt9169];
						local137.anInt10413 = anIntArray467[anInt9169 + 1];
						Static473.method7526(local137);
						if (local137.anInt10430 == 0) {
							Static171.method3357(false, local137);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean751 = anIntArray467[--anInt9169] == 1;
						Static473.method7526(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt10455 = anIntArray467[--anInt9169];
						Static473.method7526(local137);
						if (local137.anInt10432 == -1) {
							Static296.method4895(local137.anInt10460);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray467[--anInt9169];
						local137.aBoolean760 = local19 == 1;
						Static473.method7526(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt9169 -= 2;
						local137.anInt10484 = anIntArray467[anInt9169];
						local137.anInt10425 = anIntArray467[anInt9169 + 1];
						Static473.method7526(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt10443 = anIntArray467[--anInt9169];
						Static473.method7526(local137);
						return;
					}
					@Pc(1489) Class204 local1489;
					if (arg0 == 1127) {
						anInt9169 -= 2;
						local19 = anIntArray467[anInt9169];
						local25 = anIntArray467[anInt9169 + 1];
						local1489 = Static142.aClass367_1.method9243(local19);
						if (local25 != local1489.anInt5933) {
							local137.method8996(local25, local19);
							return;
						}
						local137.method8988(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray467[--anInt9169];
						local1523 = aStringArray58[--anInt9159];
						local1489 = Static142.aClass367_1.method9243(local19);
						if (!local1489.aString69.equals(local1523)) {
							local137.method8982(local19, local1523);
							return;
						}
						local137.method8988(local19);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local19 = anIntArray467[--anInt9169];
						if (local137.anInt10430 != 5 && arg0 == 1129 || local137.anInt10430 != 4 && arg0 == 1130) {
							return;
						}
						if (local137.anInt10439 != local19) {
							local137.anInt10439 = local19;
							Static473.method7526(local137);
						}
						if (local137.anInt10432 == -1) {
							Static370.method6319(local137.anInt10460);
						}
						return;
					}
					@Pc(1610) short local1610;
					@Pc(1617) short local1617;
					if (arg0 == 1131) {
						anInt9169 -= 3;
						local19 = anIntArray467[anInt9169];
						local1610 = (short) anIntArray467[anInt9169 + 1];
						local1617 = (short) anIntArray467[anInt9169 + 2];
						if (local19 >= 0 && local19 < 5) {
							local137.method8986(local19, local1617, local1610);
							Static473.method7526(local137);
							if (local137.anInt10432 == -1) {
								Static32.method532(local137.anInt10460, local19);
							}
							return;
						}
						return;
					}
					if (arg0 == 1132) {
						anInt9169 -= 3;
						local19 = anIntArray467[anInt9169];
						local1610 = (short) anIntArray467[anInt9169 + 1];
						local1617 = (short) anIntArray467[anInt9169 + 2];
						if (local19 >= 0 && local19 < 5) {
							local137.method8987(local1610, local19, local1617);
							Static473.method7526(local137);
							if (local137.anInt10432 == -1) {
								Static53.method1070(local19, local137.anInt10460);
							}
							return;
						}
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2473) int local2473;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static647.method9532(anIntArray467[--anInt9169]);
							} else {
								local137 = arg1 ? aClass357_134 : aClass357_135;
							}
							if (arg0 == 1499) {
								local137.method8977();
								return;
							}
							local1161 = aStringArray58[--anInt9159];
							@Pc(2559) int[] local2559 = null;
							if (local1161.length() > 0 && local1161.charAt(local1161.length() - 1) == 'Y') {
								local357 = anIntArray467[--anInt9169];
								if (local357 > 0) {
									local2559 = new int[local357];
									while (local357-- > 0) {
										local2559[local357] = anIntArray467[--anInt9169];
									}
								}
								local1161 = local1161.substring(0, local1161.length() - 1);
							}
							@Pc(2611) Object[] local2611 = new Object[local1161.length() + 1];
							for (local2473 = local2611.length - 1; local2473 >= 1; local2473--) {
								if (local1161.charAt(local2473 - 1) == 's') {
									local2611[local2473] = aStringArray58[--anInt9159];
								} else if (local1161.charAt(local2473 - 1) == '§') {
									local2611[local2473] = Long.valueOf(aLongArray19[--anInt9173]);
								} else {
									local2611[local2473] = Integer.valueOf(anIntArray467[--anInt9169]);
								}
							}
							local56 = anIntArray467[--anInt9169];
							if (local56 == -1) {
								local2611 = null;
							} else {
								local2611[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray12 = local2611;
							} else if (arg0 == 1401) {
								local137.anObjectArray21 = local2611;
							} else if (arg0 == 1402) {
								local137.anObjectArray19 = local2611;
							} else if (arg0 == 1403) {
								local137.anObjectArray8 = local2611;
							} else if (arg0 == 1404) {
								local137.anObjectArray27 = local2611;
							} else if (arg0 == 1405) {
								local137.anObjectArray6 = local2611;
							} else if (arg0 == 1406) {
								local137.anObjectArray14 = local2611;
							} else if (arg0 == 1407) {
								local137.anObjectArray10 = local2611;
								local137.anIntArray552 = local2559;
							} else if (arg0 == 1408) {
								local137.anObjectArray20 = local2611;
							} else if (arg0 == 1409) {
								local137.anObjectArray5 = local2611;
							} else if (arg0 == 1410) {
								local137.anObjectArray7 = local2611;
							} else if (arg0 == 1411) {
								local137.anObjectArray22 = local2611;
							} else if (arg0 == 1412) {
								local137.anObjectArray3 = local2611;
							} else if (arg0 == 1414) {
								local137.anObjectArray25 = local2611;
								local137.anIntArray544 = local2559;
							} else if (arg0 == 1415) {
								local137.anObjectArray35 = local2611;
								local137.anIntArray547 = local2559;
							} else if (arg0 == 1416) {
								local137.anObjectArray26 = local2611;
							} else if (arg0 == 1417) {
								local137.anObjectArray17 = local2611;
							} else if (arg0 == 1418) {
								local137.anObjectArray13 = local2611;
							} else if (arg0 == 1419) {
								local137.anObjectArray11 = local2611;
							} else if (arg0 == 1420) {
								local137.anObjectArray31 = local2611;
							} else if (arg0 == 1421) {
								local137.anObjectArray4 = local2611;
							} else if (arg0 == 1422) {
								local137.anObjectArray32 = local2611;
							} else if (arg0 == 1423) {
								local137.anObjectArray24 = local2611;
							} else if (arg0 == 1424) {
								local137.anObjectArray34 = local2611;
							} else if (arg0 == 1425) {
								local137.anObjectArray16 = local2611;
							} else if (arg0 == 1426) {
								local137.anObjectArray29 = local2611;
							} else if (arg0 == 1427) {
								local137.anObjectArray9 = local2611;
							} else if (arg0 == 1428) {
								local137.anObjectArray28 = local2611;
								local137.anIntArray551 = local2559;
							} else if (arg0 == 1429) {
								local137.anObjectArray33 = local2611;
								local137.anIntArray548 = local2559;
							} else if (arg0 == 1430) {
								local137.anObjectArray30 = local2611;
							} else if (arg0 == 1431) {
								local137.anObjectArray15 = local2611;
							} else if (arg0 == 1432) {
								local137.anObjectArray18 = local2611;
							}
							local137.aBoolean750 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass357_134 : aClass357_135;
							if (arg0 == 1500) {
								anIntArray467[anInt9169++] = local137.anInt10431;
								return;
							}
							if (arg0 == 1501) {
								anIntArray467[anInt9169++] = local137.anInt10407;
								return;
							}
							if (arg0 == 1502) {
								anIntArray467[anInt9169++] = local137.anInt10395;
								return;
							}
							if (arg0 == 1503) {
								anIntArray467[anInt9169++] = local137.anInt10465;
								return;
							}
							if (arg0 == 1504) {
								anIntArray467[anInt9169++] = local137.aBoolean762 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray467[anInt9169++] = local137.anInt10449;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static73.method1353(local137);
								anIntArray467[anInt9169++] = local158 == null ? -1 : local158.anInt10460;
								return;
							}
						} else {
							@Pc(3242) Class204 local3242;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass357_134 : aClass357_135;
								if (arg0 == 1600) {
									anIntArray467[anInt9169++] = local137.anInt10403;
									return;
								}
								if (arg0 == 1601) {
									anIntArray467[anInt9169++] = local137.anInt10458;
									return;
								}
								if (arg0 == 1602) {
									aStringArray58[anInt9159++] = local137.aString123;
									return;
								}
								if (arg0 == 1603) {
									anIntArray467[anInt9169++] = local137.anInt10393;
									return;
								}
								if (arg0 == 1604) {
									anIntArray467[anInt9169++] = local137.anInt10413;
									return;
								}
								if (arg0 == 1605) {
									anIntArray467[anInt9169++] = local137.anInt10455;
									return;
								}
								if (arg0 == 1606) {
									anIntArray467[anInt9169++] = local137.anInt10414;
									return;
								}
								if (arg0 == 1607) {
									anIntArray467[anInt9169++] = local137.anInt10469;
									return;
								}
								if (arg0 == 1608) {
									anIntArray467[anInt9169++] = local137.anInt10399;
									return;
								}
								if (arg0 == 1609) {
									anIntArray467[anInt9169++] = local137.anInt10452;
									return;
								}
								if (arg0 == 1610) {
									anIntArray467[anInt9169++] = local137.anInt10445;
									return;
								}
								if (arg0 == 1611) {
									anIntArray467[anInt9169++] = local137.anInt10422;
									return;
								}
								if (arg0 == 1612) {
									anIntArray467[anInt9169++] = local137.anInt10459;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray467[--anInt9169];
									local3242 = Static142.aClass367_1.method9243(local19);
									if (local3242.method5366()) {
										aStringArray58[anInt9159++] = local137.method8984(local3242.aString69, local19);
										return;
									}
									anIntArray467[anInt9169++] = local137.method8979(local19, local3242.anInt5933);
									return;
								}
								if (arg0 == 1614) {
									anIntArray467[anInt9169++] = local137.anInt10464;
									return;
								}
								if (arg0 == 2614) {
									anIntArray467[anInt9169++] = local137.anInt10404 == 1 ? local137.anInt10441 : -1;
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass357_134 : aClass357_135;
								if (arg0 == 1700) {
									anIntArray467[anInt9169++] = local137.anInt10396;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt10396 != -1) {
										anIntArray467[anInt9169++] = local137.anInt10398;
										return;
									}
									anIntArray467[anInt9169++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray467[anInt9169++] = local137.anInt10432;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass357_134 : aClass357_135;
								if (arg0 == 1800) {
									anIntArray467[anInt9169++] = Static85.method1469(local137).method1142();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray467[--anInt9169];
									local19--;
									if (local137.aStringArray77 != null && local19 < local137.aStringArray77.length && local137.aStringArray77[local19] != null) {
										aStringArray58[anInt9159++] = local137.aStringArray77[local19];
										return;
									}
									aStringArray58[anInt9159++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString121 == null) {
										aStringArray58[anInt9159++] = "";
										return;
									}
									aStringArray58[anInt9159++] = local137.aString121;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static647.method9532(anIntArray467[--anInt9169]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass357_134 : aClass357_135;
								}
								if (anInt9174 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray9 == null) {
										return;
									}
									@Pc(3511) Class2_Sub45 local3511 = new Class2_Sub45();
									local3511.aClass357_131 = local137;
									local3511.anObjectArray2 = local137.anObjectArray9;
									local3511.anInt9039 = anInt9174 + 1;
									Static507.aClass271_51.method7174(local3511);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static647.method9532(anIntArray467[--anInt9169]);
								if (arg0 == 2500) {
									anIntArray467[anInt9169++] = local137.anInt10431;
									return;
								}
								if (arg0 == 2501) {
									anIntArray467[anInt9169++] = local137.anInt10407;
									return;
								}
								if (arg0 == 2502) {
									anIntArray467[anInt9169++] = local137.anInt10395;
									return;
								}
								if (arg0 == 2503) {
									anIntArray467[anInt9169++] = local137.anInt10465;
									return;
								}
								if (arg0 == 2504) {
									anIntArray467[anInt9169++] = local137.aBoolean762 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray467[anInt9169++] = local137.anInt10449;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static73.method1353(local137);
									anIntArray467[anInt9169++] = local158 == null ? -1 : local158.anInt10460;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static647.method9532(anIntArray467[--anInt9169]);
								if (arg0 == 2600) {
									anIntArray467[anInt9169++] = local137.anInt10403;
									return;
								}
								if (arg0 == 2601) {
									anIntArray467[anInt9169++] = local137.anInt10458;
									return;
								}
								if (arg0 == 2602) {
									aStringArray58[anInt9159++] = local137.aString123;
									return;
								}
								if (arg0 == 2603) {
									anIntArray467[anInt9169++] = local137.anInt10393;
									return;
								}
								if (arg0 == 2604) {
									anIntArray467[anInt9169++] = local137.anInt10413;
									return;
								}
								if (arg0 == 2605) {
									anIntArray467[anInt9169++] = local137.anInt10455;
									return;
								}
								if (arg0 == 2606) {
									anIntArray467[anInt9169++] = local137.anInt10414;
									return;
								}
								if (arg0 == 2607) {
									anIntArray467[anInt9169++] = local137.anInt10469;
									return;
								}
								if (arg0 == 2608) {
									anIntArray467[anInt9169++] = local137.anInt10399;
									return;
								}
								if (arg0 == 2609) {
									anIntArray467[anInt9169++] = local137.anInt10452;
									return;
								}
								if (arg0 == 2610) {
									anIntArray467[anInt9169++] = local137.anInt10445;
									return;
								}
								if (arg0 == 2611) {
									anIntArray467[anInt9169++] = local137.anInt10422;
									return;
								}
								if (arg0 == 2612) {
									anIntArray467[anInt9169++] = local137.anInt10459;
									return;
								}
								if (arg0 == 2613) {
									anIntArray467[anInt9169++] = local137.anInt10464;
									return;
								}
								if (arg0 == 2614) {
									anIntArray467[anInt9169++] = local137.anInt10404 == 1 ? local137.anInt10441 : -1;
									return;
								}
							} else {
								@Pc(4040) Class2_Sub20 local4040;
								@Pc(3938) Class2_Sub20 local3938;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static647.method9532(anIntArray467[--anInt9169]);
										anIntArray467[anInt9169++] = local137.anInt10396;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static647.method9532(anIntArray467[--anInt9169]);
										if (local137.anInt10396 != -1) {
											anIntArray467[anInt9169++] = local137.anInt10398;
											return;
										}
										anIntArray467[anInt9169++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray467[--anInt9169];
										local3938 = (Class2_Sub20) Static507.aClass335_33.method8357((long) local13);
										if (local3938 != null) {
											anIntArray467[anInt9169++] = 1;
											return;
										}
										anIntArray467[anInt9169++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static647.method9532(anIntArray467[--anInt9169]);
										if (local137.aClass357Array2 == null) {
											anIntArray467[anInt9169++] = 0;
											return;
										}
										local19 = local137.aClass357Array2.length;
										for (local25 = 0; local25 < local137.aClass357Array2.length; local25++) {
											if (local137.aClass357Array2[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray467[anInt9169++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt9169 -= 2;
										local13 = anIntArray467[anInt9169];
										local19 = anIntArray467[anInt9169 + 1];
										local4040 = (Class2_Sub20) Static507.aClass335_33.method8357((long) local13);
										if (local4040 != null && local4040.anInt1667 == local19) {
											anIntArray467[anInt9169++] = 1;
											return;
										}
										anIntArray467[anInt9169++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static647.method9532(anIntArray467[--anInt9169]);
									if (arg0 == 2800) {
										anIntArray467[anInt9169++] = Static85.method1469(local137).method1142();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray467[--anInt9169];
										local19--;
										if (local137.aStringArray77 != null && local19 < local137.aStringArray77.length && local137.aStringArray77[local19] != null) {
											aStringArray58[anInt9159++] = local137.aStringArray77[local19];
											return;
										}
										aStringArray58[anInt9159++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString121 == null) {
											aStringArray58[anInt9159++] = "";
											return;
										}
										aStringArray58[anInt9159++] = local137.aString121;
										return;
									}
								} else {
									@Pc(4266) Class2_Sub52 local4266;
									@Pc(4177) String local4177;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local4177 = aStringArray58[--anInt9159];
											Static294.method4866(local4177);
											return;
										}
										if (arg0 == 3101) {
											anInt9169 -= 2;
											Static14.method7649(anIntArray467[anInt9169], anIntArray467[anInt9169 + 1], Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2);
											return;
										}
										if (arg0 == 3103) {
											Static535.method8254();
											return;
										}
										if (arg0 == 3104) {
											local4177 = aStringArray58[--anInt9159];
											local19 = 0;
											if (Static664.method9705(local4177)) {
												local19 = Static77.method1385(local4177);
											}
											@Pc(4237) Class2_Sub52 local4237 = Static311.method5098(Static349.aClass341_66, Static125.aClass179_1);
											local4237.aClass2_Sub8_Sub2_2.method5194(local19);
											Static38.method791(local4237);
											return;
										}
										if (arg0 == 3105) {
											local4177 = aStringArray58[--anInt9159];
											local4266 = Static311.method5098(Static91.aClass341_21, Static125.aClass179_1);
											local4266.aClass2_Sub8_Sub2_2.method5170(local4177.length() + 1);
											local4266.aClass2_Sub8_Sub2_2.method5212(local4177);
											Static38.method791(local4266);
											return;
										}
										if (arg0 == 3106) {
											local4177 = aStringArray58[--anInt9159];
											local4266 = Static311.method5098(Static21.aClass341_7, Static125.aClass179_1);
											local4266.aClass2_Sub8_Sub2_2.method5170(local4177.length() + 1);
											local4266.aClass2_Sub8_Sub2_2.method5212(local4177);
											Static38.method791(local4266);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray467[--anInt9169];
											local1161 = aStringArray58[--anInt9159];
											Static241.method4331(local1161, local13);
											return;
										}
										if (arg0 == 3108) {
											anInt9169 -= 3;
											local13 = anIntArray467[anInt9169];
											local19 = anIntArray467[anInt9169 + 1];
											local25 = anIntArray467[anInt9169 + 2];
											local35 = Static647.method9532(local25);
											Static465.method7460(local13, local35, local19);
											return;
										}
										if (arg0 == 3109) {
											anInt9169 -= 2;
											local13 = anIntArray467[anInt9169];
											local19 = anIntArray467[anInt9169 + 1];
											local210 = arg1 ? aClass357_134 : aClass357_135;
											Static465.method7460(local13, local210, local19);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray467[--anInt9169];
											local4266 = Static311.method5098(Static505.aClass341_101, Static125.aClass179_1);
											local4266.aClass2_Sub8_Sub2_2.method5192(local13);
											Static38.method791(local4266);
											return;
										}
										if (arg0 == 3111) {
											anInt9169 -= 2;
											local13 = anIntArray467[anInt9169];
											local19 = anIntArray467[anInt9169 + 1];
											local4040 = (Class2_Sub20) Static507.aClass335_33.method8357((long) local13);
											if (local4040 != null) {
												Static349.method6045(true, local4040, local4040.anInt1667 != local19);
											}
											Static240.method4308(local19, true, 3, local13);
											return;
										}
										if (arg0 == 3112) {
											anInt9169--;
											local13 = anIntArray467[anInt9169];
											local3938 = (Class2_Sub20) Static507.aClass335_33.method8357((long) local13);
											if (local3938 != null && local3938.anInt1668 == 3) {
												Static349.method6045(true, local3938, true);
											}
											return;
										}
										if (arg0 == 3113) {
											Static28.method485(aStringArray58[--anInt9159]);
											return;
										}
										if (arg0 == 3114) {
											anInt9169 -= 2;
											local13 = anIntArray467[anInt9169];
											local19 = anIntArray467[anInt9169 + 1];
											local1523 = aStringArray58[--anInt9159];
											Static159.method3207("", local1523, local13, "", "", local19);
											return;
										}
										if (arg0 == 3115) {
											anInt9169 -= 11;
											@Pc(4567) Class236[] local4567 = Static566.method8589();
											@Pc(4570) Class103[] local4570 = Static277.method9737();
											Static188.method7425(anIntArray467[anInt9169 + 3], anIntArray467[anInt9169 + 6], local4570[anIntArray467[anInt9169 + 1]], anIntArray467[anInt9169 + 9], local4567[anIntArray467[anInt9169]], anIntArray467[anInt9169 + 8], anIntArray467[anInt9169 + 10], anIntArray467[anInt9169 + 5], anIntArray467[anInt9169 + 4], anIntArray467[anInt9169 + 2], anIntArray467[anInt9169 + 7]);
											return;
										}
										if (arg0 == 3116) {
											local13 = anIntArray467[--anInt9169];
											local4266 = Static311.method5098(Static17.aClass341_85, Static125.aClass179_1);
											local4266.aClass2_Sub8_Sub2_2.method5192(local13);
											Static38.method791(local4266);
											return;
										}
										if (arg0 == 3117) {
											local4177 = aStringArray58[--anInt9159];
											local4266 = Static311.method5098(Static286.aClass341_59, Static125.aClass179_1);
											local4266.aClass2_Sub8_Sub2_2.method5170(local4177.length() + 1);
											local4266.aClass2_Sub8_Sub2_2.method5212(local4177);
											Static38.method791(local4266);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt9169 -= 3;
											Static28.method487(anIntArray467[anInt9169], anIntArray467[anInt9169 + 1], 255, 256, anIntArray467[anInt9169 + 2]);
											return;
										}
										if (arg0 == 3201) {
											Static220.method4066(50, anIntArray467[--anInt9169], 255);
											return;
										}
										if (arg0 == 3202) {
											anInt9169 -= 2;
											Static584.method4099(255, anIntArray467[anInt9169], anIntArray467[anInt9169 + 1]);
											return;
										}
										if (arg0 == 3203) {
											anInt9169 -= 4;
											Static28.method487(anIntArray467[anInt9169], anIntArray467[anInt9169 + 1], anIntArray467[anInt9169 + 3], 256, anIntArray467[anInt9169 + 2]);
											return;
										}
										if (arg0 == 3204) {
											anInt9169 -= 3;
											Static220.method4066(anIntArray467[anInt9169 + 2], anIntArray467[anInt9169], anIntArray467[anInt9169 + 1]);
											return;
										}
										if (arg0 == 3205) {
											anInt9169 -= 3;
											Static584.method4099(anIntArray467[anInt9169 + 2], anIntArray467[anInt9169], anIntArray467[anInt9169 + 1]);
											return;
										}
										if (arg0 == 3206) {
											anInt9169 -= 4;
											Static248.method4409(anIntArray467[anInt9169 + 1], anIntArray467[anInt9169 + 3], anIntArray467[anInt9169], anIntArray467[anInt9169 + 2], 256, false);
											return;
										}
										if (arg0 == 3207) {
											anInt9169 -= 4;
											Static248.method4409(anIntArray467[anInt9169 + 1], anIntArray467[anInt9169 + 3], anIntArray467[anInt9169], anIntArray467[anInt9169 + 2], 256, true);
											return;
										}
										if (arg0 == 3208) {
											anInt9169 -= 5;
											Static28.method487(anIntArray467[anInt9169], anIntArray467[anInt9169 + 1], anIntArray467[anInt9169 + 3], anIntArray467[anInt9169 + 4], anIntArray467[anInt9169 + 2]);
											return;
										}
										if (arg0 == 3209) {
											anInt9169 -= 5;
											Static248.method4409(anIntArray467[anInt9169 + 1], anIntArray467[anInt9169 + 3], anIntArray467[anInt9169], anIntArray467[anInt9169 + 2], anIntArray467[anInt9169 + 4], false);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray467[anInt9169++] = Static62.anInt1184;
											return;
										}
										if (arg0 == 3301) {
											anInt9169 -= 2;
											local13 = anIntArray467[anInt9169];
											local19 = anIntArray467[anInt9169 + 1];
											anIntArray467[anInt9169++] = Static670.method7050(local13, false, local19);
											return;
										}
										if (arg0 == 3302) {
											anInt9169 -= 2;
											local13 = anIntArray467[anInt9169];
											local19 = anIntArray467[anInt9169 + 1];
											anIntArray467[anInt9169++] = Static673.method9447(local19, local13, false);
											return;
										}
										if (arg0 == 3303) {
											anInt9169 -= 2;
											local13 = anIntArray467[anInt9169];
											local19 = anIntArray467[anInt9169 + 1];
											anIntArray467[anInt9169++] = Static394.method7235(local13, local19, false);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray467[--anInt9169];
											anIntArray467[anInt9169++] = Static503.aClass77_2.method1973(local13).anInt4086;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray467[--anInt9169];
											anIntArray467[anInt9169++] = Static330.anIntArray298[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray467[--anInt9169];
											anIntArray467[anInt9169++] = Static584.anIntArray208[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray467[--anInt9169];
											anIntArray467[anInt9169++] = Static665.anIntArray594[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(5157) byte local5157 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142;
											local19 = (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11022 >> 9) + Static640.anInt11085;
											local25 = (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11024 >> 9) + Static490.anInt8763;
											anIntArray467[anInt9169++] = (local5157 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray467[--anInt9169];
											anIntArray467[anInt9169++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray467[--anInt9169];
											anIntArray467[anInt9169++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray467[--anInt9169];
											anIntArray467[anInt9169++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray467[anInt9169++] = Static100.aBoolean97 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt9169 -= 2;
											local13 = anIntArray467[anInt9169];
											local19 = anIntArray467[anInt9169 + 1];
											anIntArray467[anInt9169++] = Static670.method7050(local13, true, local19);
											return;
										}
										if (arg0 == 3314) {
											anInt9169 -= 2;
											local13 = anIntArray467[anInt9169];
											local19 = anIntArray467[anInt9169 + 1];
											anIntArray467[anInt9169++] = Static673.method9447(local19, local13, true);
											return;
										}
										if (arg0 == 3315) {
											anInt9169 -= 2;
											local13 = anIntArray467[anInt9169];
											local19 = anIntArray467[anInt9169 + 1];
											anIntArray467[anInt9169++] = Static394.method7235(local13, local19, true);
											return;
										}
										if (arg0 == 3316) {
											if (Static31.anInt530 >= 2) {
												anIntArray467[anInt9169++] = Static31.anInt530;
												return;
											}
											anIntArray467[anInt9169++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray467[anInt9169++] = Static543.anInt9483;
											return;
										}
										if (arg0 == 3318) {
											anIntArray467[anInt9169++] = Static524.aClass66_4.anInt1756;
											return;
										}
										if (arg0 == 3321) {
											anIntArray467[anInt9169++] = Static567.anInt9849;
											return;
										}
										if (arg0 == 3322) {
											anIntArray467[anInt9169++] = Static17.anInt8640;
											return;
										}
										if (arg0 == 3323) {
											if (Static488.anInt8753 >= 5 && Static488.anInt8753 <= 9) {
												anIntArray467[anInt9169++] = 1;
												return;
											}
											anIntArray467[anInt9169++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static488.anInt8753 >= 5 && Static488.anInt8753 <= 9) {
												anIntArray467[anInt9169++] = Static488.anInt8753;
												return;
											}
											anIntArray467[anInt9169++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray467[anInt9169++] = Static64.aBoolean69 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray467[anInt9169++] = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt2403;
											return;
										}
										if (arg0 == 3327) {
											anIntArray467[anInt9169++] = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aClass9_1 != null && Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aClass9_1.aBoolean6 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray467[anInt9169++] = Static530.aBoolean716 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray467[--anInt9169];
											anIntArray467[anInt9169++] = Static138.method2434(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt9169 -= 2;
											local13 = anIntArray467[anInt9169];
											local19 = anIntArray467[anInt9169 + 1];
											anIntArray467[anInt9169++] = Static485.method7683(false, local13, local19);
											return;
										}
										if (arg0 == 3332) {
											anInt9169 -= 2;
											local13 = anIntArray467[anInt9169];
											local19 = anIntArray467[anInt9169 + 1];
											anIntArray467[anInt9169++] = Static485.method7683(true, local13, local19);
											return;
										}
										if (arg0 == 3333) {
											anIntArray467[anInt9169++] = Static353.anInt6795;
											return;
										}
										if (arg0 == 3335) {
											anIntArray467[anInt9169++] = Static204.anInt8130;
											return;
										}
										if (arg0 == 3336) {
											anInt9169 -= 4;
											local13 = anIntArray467[anInt9169];
											local19 = anIntArray467[anInt9169 + 1];
											local25 = anIntArray467[anInt9169 + 2];
											local357 = anIntArray467[anInt9169 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local357;
											anIntArray467[anInt9169++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray467[anInt9169++] = Static568.anInt9915;
											return;
										}
										if (arg0 == 3338) {
											anIntArray467[anInt9169++] = Static607.method9111();
											return;
										}
										if (arg0 == 3339) {
											anIntArray467[anInt9169++] = 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray467[anInt9169++] = Static494.aBoolean638 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray467[anInt9169++] = Static234.aBoolean363 ? 1 : 0;
											return;
										}
										if (arg0 == 3342) {
											anIntArray467[anInt9169++] = Static7.aClass6_1.method7048();
											return;
										}
										if (arg0 == 3343) {
											anIntArray467[anInt9169++] = Static7.aClass6_1.method7049();
											return;
										}
										if (arg0 == 3344) {
											aStringArray58[anInt9159++] = Static382.method9034();
											return;
										}
										if (arg0 == 3345) {
											aStringArray58[anInt9159++] = Static624.method9265();
											return;
										}
										if (arg0 == 3346) {
											anIntArray467[anInt9169++] = Static536.method4065();
											return;
										}
										if (arg0 == 3347) {
											anIntArray467[anInt9169++] = Static254.anInt4897;
											return;
										}
										if (arg0 == 3349) {
											anIntArray467[anInt9169++] = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aClass106_7.method3290() >> 3;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5908) Class289 local5908;
										if (arg0 == 3400) {
											anInt9169 -= 2;
											local13 = anIntArray467[anInt9169];
											local19 = anIntArray467[anInt9169 + 1];
											local5908 = Static203.aClass164_1.method4433(local13);
											aStringArray58[anInt9159++] = local5908.method7508(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt9169 -= 4;
											local13 = anIntArray467[anInt9169];
											local19 = anIntArray467[anInt9169 + 1];
											local25 = anIntArray467[anInt9169 + 2];
											local357 = anIntArray467[anInt9169 + 3];
											@Pc(5954) Class289 local5954 = Static203.aClass164_1.method4433(local25);
											if (local5954.aChar4 == local13 && local5954.aChar5 == local19) {
												if (local19 == 115) {
													aStringArray58[anInt9159++] = local5954.method7508(local357);
													return;
												}
												anIntArray467[anInt9169++] = local5954.method7507(local357);
												return;
											}
											throw new RuntimeException("C3408-1 " + local25 + "-" + local357);
										}
										if (arg0 == 3409) {
											anInt9169 -= 3;
											local13 = anIntArray467[anInt9169];
											local19 = anIntArray467[anInt9169 + 1];
											local25 = anIntArray467[anInt9169 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(6040) Class289 local6040 = Static203.aClass164_1.method4433(local19);
											if (local6040.aChar5 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray467[anInt9169++] = local6040.method7503(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray467[--anInt9169];
											local1161 = aStringArray58[--anInt9159];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5908 = Static203.aClass164_1.method4433(local13);
											if (local5908.aChar5 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray467[anInt9169++] = local5908.method7504(local1161) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray467[--anInt9169];
											@Pc(6138) Class289 local6138 = Static203.aClass164_1.method4433(local13);
											anIntArray467[anInt9169++] = local6138.aClass335_32.method8361();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static480.anInt8620 == 0) {
												anIntArray467[anInt9169++] = -2;
												return;
											}
											if (Static480.anInt8620 == 1) {
												anIntArray467[anInt9169++] = -1;
												return;
											}
											anIntArray467[anInt9169++] = Static340.anInt6395;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray467[--anInt9169];
											if (Static480.anInt8620 == 2 && local13 < Static340.anInt6395) {
												aStringArray58[anInt9159++] = Static438.aStringArray47[local13];
												if (Static520.aStringArray59[local13] != null) {
													aStringArray58[anInt9159++] = Static520.aStringArray59[local13];
													return;
												}
												aStringArray58[anInt9159++] = "";
												return;
											}
											aStringArray58[anInt9159++] = "";
											aStringArray58[anInt9159++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray467[--anInt9169];
											if (Static480.anInt8620 == 2 && local13 < Static340.anInt6395) {
												anIntArray467[anInt9169++] = Static568.anIntArray497[local13];
												return;
											}
											anIntArray467[anInt9169++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray467[--anInt9169];
											if (Static480.anInt8620 == 2 && local13 < Static340.anInt6395) {
												anIntArray467[anInt9169++] = Static345.anIntArray316[local13];
												return;
											}
											anIntArray467[anInt9169++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local4177 = aStringArray58[--anInt9159];
											local19 = anIntArray467[--anInt9169];
											Static543.method8322(local4177, local19);
											return;
										}
										if (arg0 == 3605) {
											local4177 = aStringArray58[--anInt9159];
											Static617.method9233(local4177);
											return;
										}
										if (arg0 == 3606) {
											local4177 = aStringArray58[--anInt9159];
											Static284.method4763(local4177);
											return;
										}
										if (arg0 == 3607) {
											local4177 = aStringArray58[--anInt9159];
											Static662.method8958(false, local4177);
											return;
										}
										if (arg0 == 3608) {
											local4177 = aStringArray58[--anInt9159];
											Static497.method7819(local4177);
											return;
										}
										if (arg0 == 3609) {
											local4177 = aStringArray58[--anInt9159];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray467[anInt9169++] = Static51.method1035(local4177) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray467[--anInt9169];
											if (Static480.anInt8620 == 2 && local13 < Static340.anInt6395) {
												aStringArray58[anInt9159++] = Static24.aStringArray2[local13];
												return;
											}
											aStringArray58[anInt9159++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static25.aString5 != null) {
												aStringArray58[anInt9159++] = Static261.method4519(Static25.aString5);
												return;
											}
											aStringArray58[anInt9159++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static25.aString5 != null) {
												anIntArray467[anInt9169++] = Static250.anInt4884;
												return;
											}
											anIntArray467[anInt9169++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray467[--anInt9169];
											if (Static25.aString5 != null && local13 < Static250.anInt4884) {
												aStringArray58[anInt9159++] = Static523.aClass263Array1[local13].aString93;
												return;
											}
											aStringArray58[anInt9159++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray467[--anInt9169];
											if (Static25.aString5 != null && local13 < Static250.anInt4884) {
												anIntArray467[anInt9169++] = Static523.aClass263Array1[local13].anInt7899;
												return;
											}
											anIntArray467[anInt9169++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray467[--anInt9169];
											if (Static25.aString5 != null && local13 < Static250.anInt4884) {
												anIntArray467[anInt9169++] = Static523.aClass263Array1[local13].aByte104;
												return;
											}
											anIntArray467[anInt9169++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray467[anInt9169++] = Static360.aByte95;
											return;
										}
										if (arg0 == 3617) {
											local4177 = aStringArray58[--anInt9159];
											Static341.method5717(local4177);
											return;
										}
										if (arg0 == 3618) {
											anIntArray467[anInt9169++] = Static47.aByte12;
											return;
										}
										if (arg0 == 3619) {
											local4177 = aStringArray58[--anInt9159];
											Static264.method4548(local4177);
											return;
										}
										if (arg0 == 3620) {
											Static261.method4514();
											return;
										}
										if (arg0 == 3621) {
											if (Static480.anInt8620 == 0) {
												anIntArray467[anInt9169++] = -1;
												return;
											}
											anIntArray467[anInt9169++] = Static645.anInt10075;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray467[--anInt9169];
											if (Static480.anInt8620 != 0 && local13 < Static645.anInt10075) {
												aStringArray58[anInt9159++] = Static587.aStringArray74[local13];
												if (Static622.aStringArray79[local13] != null) {
													aStringArray58[anInt9159++] = Static622.aStringArray79[local13];
													return;
												}
												aStringArray58[anInt9159++] = "";
												return;
											}
											aStringArray58[anInt9159++] = "";
											aStringArray58[anInt9159++] = "";
											return;
										}
										if (arg0 == 3623) {
											local4177 = aStringArray58[--anInt9159];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray467[anInt9169++] = Static329.method5442(local4177) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray467[--anInt9169];
											if (Static523.aClass263Array1 != null && local13 < Static250.anInt4884 && Static523.aClass263Array1[local13].aString91.equalsIgnoreCase(Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aString29)) {
												anIntArray467[anInt9169++] = 1;
												return;
											}
											anIntArray467[anInt9169++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static207.aString53 != null) {
												aStringArray58[anInt9159++] = Static207.aString53;
												return;
											}
											aStringArray58[anInt9159++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray467[--anInt9169];
											if (Static25.aString5 != null && local13 < Static250.anInt4884) {
												aStringArray58[anInt9159++] = Static523.aClass263Array1[local13].aString94;
												return;
											}
											aStringArray58[anInt9159++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray467[--anInt9169];
											if (Static480.anInt8620 == 2 && local13 >= 0 && local13 < Static340.anInt6395) {
												anIntArray467[anInt9169++] = Static290.aBooleanArray46[local13] ? 1 : 0;
												return;
											}
											anIntArray467[anInt9169++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local4177 = aStringArray58[--anInt9159];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray467[anInt9169++] = Static13.method7471(local4177);
											return;
										}
										if (arg0 == 3629) {
											anIntArray467[anInt9169++] = Static265.anInt5051;
											return;
										}
										if (arg0 == 3630) {
											local4177 = aStringArray58[--anInt9159];
											Static662.method8958(true, local4177);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray467[--anInt9169];
											anIntArray467[anInt9169++] = Static369.aBooleanArray67[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray467[--anInt9169];
											if (Static25.aString5 != null && local13 < Static250.anInt4884) {
												aStringArray58[anInt9159++] = Static523.aClass263Array1[local13].aString91;
												return;
											}
											aStringArray58[anInt9159++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray467[--anInt9169];
											if (Static480.anInt8620 != 0 && local13 < Static645.anInt10075) {
												aStringArray58[anInt9159++] = Static13.aStringArray49[local13];
												return;
											}
											aStringArray58[anInt9159++] = "";
											return;
										}
									} else if (arg0 < 3800) {
										if (arg0 == 3700) {
											if (Static513.aClass219_2 != null) {
												anIntArray467[anInt9169++] = 1;
												aClass219_3 = Static513.aClass219_2;
												return;
											}
											anIntArray467[anInt9169++] = 0;
											return;
										}
										if (arg0 == 3701) {
											if (Static242.aClass219_1 != null) {
												anIntArray467[anInt9169++] = 1;
												aClass219_3 = Static242.aClass219_1;
												return;
											}
											anIntArray467[anInt9169++] = 0;
											return;
										}
										if (arg0 == 3702) {
											aStringArray58[anInt9159++] = aClass219_3.aString78;
											return;
										}
										if (arg0 == 3703) {
											anIntArray467[anInt9169++] = aClass219_3.aBoolean511 ? 1 : 0;
											return;
										}
										if (arg0 == 3704) {
											anIntArray467[anInt9169++] = aClass219_3.aByte92;
											return;
										}
										if (arg0 == 3705) {
											anIntArray467[anInt9169++] = aClass219_3.aByte93;
											return;
										}
										if (arg0 == 3706) {
											anIntArray467[anInt9169++] = aClass219_3.aByte91;
											return;
										}
										if (arg0 == 3707) {
											anIntArray467[anInt9169++] = aClass219_3.aByte94;
											return;
										}
										if (arg0 == 3709) {
											anIntArray467[anInt9169++] = aClass219_3.anInt6739;
											return;
										}
										if (arg0 == 3710) {
											local13 = anIntArray467[--anInt9169];
											aStringArray58[anInt9159++] = aClass219_3.aStringArray36[local13];
											return;
										}
										if (arg0 == 3711) {
											local13 = anIntArray467[--anInt9169];
											anIntArray467[anInt9169++] = aClass219_3.aByteArray65[local13];
											return;
										}
										if (arg0 == 3712) {
											anIntArray467[anInt9169++] = aClass219_3.anInt6726;
											return;
										}
										if (arg0 == 3713) {
											local13 = anIntArray467[--anInt9169];
											aStringArray58[anInt9159++] = aClass219_3.aStringArray37[local13];
											return;
										}
										if (arg0 == 3714) {
											anInt9169 -= 3;
											local13 = anIntArray467[anInt9169];
											local19 = anIntArray467[anInt9169 + 1];
											local25 = anIntArray467[anInt9169 + 2];
											anIntArray467[anInt9169++] = aClass219_3.method6026(local19, local13, local25);
											return;
										}
										if (arg0 == 3715) {
											anIntArray467[anInt9169++] = aClass219_3.anInt6736;
											return;
										}
										if (arg0 == 3716) {
											anIntArray467[anInt9169++] = aClass219_3.anInt6738;
											return;
										}
										if (arg0 == 3750) {
											if (Static396.aClass2_Sub30_2 != null) {
												anIntArray467[anInt9169++] = 1;
												aClass2_Sub30_3 = Static396.aClass2_Sub30_2;
												return;
											}
											anIntArray467[anInt9169++] = 0;
											return;
										}
										if (arg0 == 3751) {
											if (Static366.aClass2_Sub30_1 != null) {
												anIntArray467[anInt9169++] = 1;
												aClass2_Sub30_3 = Static366.aClass2_Sub30_1;
												return;
											}
											anIntArray467[anInt9169++] = 0;
											return;
										}
										if (arg0 == 3752) {
											aStringArray58[anInt9159++] = aClass2_Sub30_3.aString54;
											return;
										}
										if (arg0 == 3753) {
											anIntArray467[anInt9169++] = aClass2_Sub30_3.aByte71;
											return;
										}
										if (arg0 == 3754) {
											anIntArray467[anInt9169++] = aClass2_Sub30_3.aByte72;
											return;
										}
										if (arg0 == 3755) {
											anIntArray467[anInt9169++] = aClass2_Sub30_3.anInt4562;
											return;
										}
										if (arg0 == 3756) {
											local13 = anIntArray467[--anInt9169];
											aStringArray58[anInt9159++] = aClass2_Sub30_3.aClass11Array1[local13].aString1;
											return;
										}
										if (arg0 == 3757) {
											local13 = anIntArray467[--anInt9169];
											anIntArray467[anInt9169++] = aClass2_Sub30_3.aClass11Array1[local13].aByte1;
											return;
										}
										if (arg0 == 3758) {
											local13 = anIntArray467[--anInt9169];
											anIntArray467[anInt9169++] = aClass2_Sub30_3.aClass11Array1[local13].anInt172;
											return;
										}
										if (arg0 == 3759) {
											local13 = anIntArray467[--anInt9169];
											Static18.method347(aClass2_Sub30_3 == Static366.aClass2_Sub30_1, local13);
											return;
										}
										if (arg0 == 3760) {
											anIntArray467[anInt9169++] = aClass2_Sub30_3.method4114(aStringArray58[--anInt9159]);
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray467[--anInt9169];
											anIntArray467[anInt9169++] = Static664.aClass113Array1[local13].method3496();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray467[--anInt9169];
											anIntArray467[anInt9169++] = Static664.aClass113Array1[local13].anInt3766;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray467[--anInt9169];
											anIntArray467[anInt9169++] = Static664.aClass113Array1[local13].anInt3767;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray467[--anInt9169];
											anIntArray467[anInt9169++] = Static664.aClass113Array1[local13].anInt3765;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray467[--anInt9169];
											anIntArray467[anInt9169++] = Static664.aClass113Array1[local13].anInt3761;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray467[--anInt9169];
											anIntArray467[anInt9169++] = Static664.aClass113Array1[local13].anInt3758;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray467[--anInt9169];
											local19 = Static664.aClass113Array1[local13].method3492();
											anIntArray467[anInt9169++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray467[--anInt9169];
											local19 = Static664.aClass113Array1[local13].method3492();
											anIntArray467[anInt9169++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray467[--anInt9169];
											local19 = Static664.aClass113Array1[local13].method3492();
											anIntArray467[anInt9169++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray467[--anInt9169];
											local19 = Static664.aClass113Array1[local13].method3492();
											anIntArray467[anInt9169++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else {
										@Pc(8150) long local8150;
										if (arg0 < 4100) {
											if (arg0 == 4000) {
												anInt9169 -= 2;
												local13 = anIntArray467[anInt9169];
												local19 = anIntArray467[anInt9169 + 1];
												anIntArray467[anInt9169++] = local13 + local19;
												return;
											}
											if (arg0 == 4001) {
												anInt9169 -= 2;
												local13 = anIntArray467[anInt9169];
												local19 = anIntArray467[anInt9169 + 1];
												anIntArray467[anInt9169++] = local13 - local19;
												return;
											}
											if (arg0 == 4002) {
												anInt9169 -= 2;
												local13 = anIntArray467[anInt9169];
												local19 = anIntArray467[anInt9169 + 1];
												anIntArray467[anInt9169++] = local13 * local19;
												return;
											}
											if (arg0 == 4003) {
												anInt9169 -= 2;
												local13 = anIntArray467[anInt9169];
												local19 = anIntArray467[anInt9169 + 1];
												anIntArray467[anInt9169++] = local13 / local19;
												return;
											}
											if (arg0 == 4004) {
												local13 = anIntArray467[--anInt9169];
												anIntArray467[anInt9169++] = (int) (Math.random() * (double) local13);
												return;
											}
											if (arg0 == 4005) {
												local13 = anIntArray467[--anInt9169];
												anIntArray467[anInt9169++] = (int) (Math.random() * (double) (local13 + 1));
												return;
											}
											if (arg0 == 4006) {
												anInt9169 -= 5;
												local13 = anIntArray467[anInt9169];
												local19 = anIntArray467[anInt9169 + 1];
												local25 = anIntArray467[anInt9169 + 2];
												local357 = anIntArray467[anInt9169 + 3];
												local2473 = anIntArray467[anInt9169 + 4];
												anIntArray467[anInt9169++] = local13 + (local19 - local13) * (local2473 - local25) / (local357 - local25);
												return;
											}
											@Pc(8157) long local8157;
											if (arg0 == 4007) {
												anInt9169 -= 2;
												local8150 = (long) anIntArray467[anInt9169];
												local8157 = (long) anIntArray467[anInt9169 + 1];
												anIntArray467[anInt9169++] = (int) (local8150 + local8150 * local8157 / 100L);
												return;
											}
											if (arg0 == 4008) {
												anInt9169 -= 2;
												local13 = anIntArray467[anInt9169];
												local19 = anIntArray467[anInt9169 + 1];
												anIntArray467[anInt9169++] = local13 | 0x1 << local19;
												return;
											}
											if (arg0 == 4009) {
												anInt9169 -= 2;
												local13 = anIntArray467[anInt9169];
												local19 = anIntArray467[anInt9169 + 1];
												anIntArray467[anInt9169++] = local13 & -(0x1 << local19) - 1;
												return;
											}
											if (arg0 == 4010) {
												anInt9169 -= 2;
												local13 = anIntArray467[anInt9169];
												local19 = anIntArray467[anInt9169 + 1];
												anIntArray467[anInt9169++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
												return;
											}
											if (arg0 == 4011) {
												anInt9169 -= 2;
												local13 = anIntArray467[anInt9169];
												local19 = anIntArray467[anInt9169 + 1];
												anIntArray467[anInt9169++] = local13 % local19;
												return;
											}
											if (arg0 == 4012) {
												anInt9169 -= 2;
												local13 = anIntArray467[anInt9169];
												local19 = anIntArray467[anInt9169 + 1];
												if (local13 == 0) {
													anIntArray467[anInt9169++] = 0;
													return;
												}
												anIntArray467[anInt9169++] = (int) Math.pow((double) local13, (double) local19);
												return;
											}
											if (arg0 == 4013) {
												anInt9169 -= 2;
												local13 = anIntArray467[anInt9169];
												local19 = anIntArray467[anInt9169 + 1];
												if (local13 == 0) {
													anIntArray467[anInt9169++] = 0;
													return;
												}
												if (local19 == 0) {
													anIntArray467[anInt9169++] = Integer.MAX_VALUE;
													return;
												}
												anIntArray467[anInt9169++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
												return;
											}
											if (arg0 == 4014) {
												anInt9169 -= 2;
												local13 = anIntArray467[anInt9169];
												local19 = anIntArray467[anInt9169 + 1];
												anIntArray467[anInt9169++] = local13 & local19;
												return;
											}
											if (arg0 == 4015) {
												anInt9169 -= 2;
												local13 = anIntArray467[anInt9169];
												local19 = anIntArray467[anInt9169 + 1];
												anIntArray467[anInt9169++] = local13 | local19;
												return;
											}
											if (arg0 == 4016) {
												anInt9169 -= 2;
												local13 = anIntArray467[anInt9169];
												local19 = anIntArray467[anInt9169 + 1];
												anIntArray467[anInt9169++] = local13 < local19 ? local13 : local19;
												return;
											}
											if (arg0 == 4017) {
												anInt9169 -= 2;
												local13 = anIntArray467[anInt9169];
												local19 = anIntArray467[anInt9169 + 1];
												anIntArray467[anInt9169++] = local13 > local19 ? local13 : local19;
												return;
											}
											if (arg0 == 4018) {
												anInt9169 -= 3;
												local8150 = (long) anIntArray467[anInt9169];
												local8157 = (long) anIntArray467[anInt9169 + 1];
												@Pc(8538) long local8538 = (long) anIntArray467[anInt9169 + 2];
												anIntArray467[anInt9169++] = (int) (local8150 * local8538 / local8157);
												return;
											}
											if (arg0 == 4019) {
												anInt9169 -= 2;
												local13 = anIntArray467[anInt9169];
												local19 = anIntArray467[anInt9169 + 1];
												if (local13 > 700 || local19 > 700) {
													anIntArray467[anInt9169++] = 256;
												}
												@Pc(8597) double local8597 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
												anIntArray467[anInt9169++] = (int) (Math.pow(2.0D, local8597) + 0.5D);
												return;
											}
											if (arg0 == 4020) {
												local13 = anIntArray467[--anInt9169];
												anIntArray467[anInt9169++] = Static454.anIntArray310[Static498.method7845(local13) & 0xFFFF];
												return;
											}
										} else if (arg0 < 4200) {
											if (arg0 == 4100) {
												local4177 = aStringArray58[--anInt9159];
												local19 = anIntArray467[--anInt9169];
												aStringArray58[anInt9159++] = local4177 + local19;
												return;
											}
											if (arg0 == 4101) {
												anInt9159 -= 2;
												local4177 = aStringArray58[anInt9159];
												local1161 = aStringArray58[anInt9159 + 1];
												aStringArray58[anInt9159++] = local4177 + local1161;
												return;
											}
											if (arg0 == 4102) {
												local4177 = aStringArray58[--anInt9159];
												local19 = anIntArray467[--anInt9169];
												aStringArray58[anInt9159++] = local4177 + Static25.method454(local19, true);
												return;
											}
											if (arg0 == 4103) {
												local4177 = aStringArray58[--anInt9159];
												aStringArray58[anInt9159++] = local4177.toLowerCase();
												return;
											}
											if (arg0 == 4104) {
												aStringArray58[anInt9159++] = Static232.method9287(Static204.anInt8130, Static155.method3184(anIntArray467[--anInt9169]));
												return;
											}
											if (arg0 == 4105) {
												anInt9159 -= 2;
												local4177 = aStringArray58[anInt9159];
												local1161 = aStringArray58[anInt9159 + 1];
												if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aClass9_1 != null && Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aClass9_1.aBoolean6) {
													aStringArray58[anInt9159++] = local1161;
													return;
												}
												aStringArray58[anInt9159++] = local4177;
												return;
											}
											if (arg0 == 4106) {
												local13 = anIntArray467[--anInt9169];
												aStringArray58[anInt9159++] = Integer.toString(local13);
												return;
											}
											if (arg0 == 4107) {
												anInt9159 -= 2;
												anIntArray467[anInt9169++] = Static509.method7936(aStringArray58[anInt9159 + 1], Static204.anInt8130, aStringArray58[anInt9159]);
												return;
											}
											@Pc(8910) Class324 local8910;
											if (arg0 == 4108) {
												local4177 = aStringArray58[--anInt9159];
												anInt9169 -= 2;
												local19 = anIntArray467[anInt9169];
												local25 = anIntArray467[anInt9169 + 1];
												local8910 = Static266.method4575(Static227.aClass124_49, local25);
												anIntArray467[anInt9169++] = local8910.method8183(local4177, Static622.aClass71Array42, local19);
												return;
											}
											if (arg0 == 4109) {
												local4177 = aStringArray58[--anInt9159];
												anInt9169 -= 2;
												local19 = anIntArray467[anInt9169];
												local25 = anIntArray467[anInt9169 + 1];
												local8910 = Static266.method4575(Static227.aClass124_49, local25);
												anIntArray467[anInt9169++] = local8910.method8177(local19, local4177, Static622.aClass71Array42);
												return;
											}
											if (arg0 == 4110) {
												anInt9159 -= 2;
												local4177 = aStringArray58[anInt9159];
												local1161 = aStringArray58[anInt9159 + 1];
												if (anIntArray467[--anInt9169] == 1) {
													aStringArray58[anInt9159++] = local4177;
													return;
												}
												aStringArray58[anInt9159++] = local1161;
												return;
											}
											if (arg0 == 4111) {
												local4177 = aStringArray58[--anInt9159];
												aStringArray58[anInt9159++] = Static322.method5330(local4177);
												return;
											}
											if (arg0 == 4112) {
												local4177 = aStringArray58[--anInt9159];
												local19 = anIntArray467[--anInt9169];
												if (local19 == -1) {
													throw new RuntimeException("null char");
												}
												aStringArray58[anInt9159++] = local4177 + (char) local19;
												return;
											}
											if (arg0 == 4113) {
												local13 = anIntArray467[--anInt9169];
												anIntArray467[anInt9169++] = method8021((char) local13);
												return;
											}
											if (arg0 == 4114) {
												local13 = anIntArray467[--anInt9169];
												anIntArray467[anInt9169++] = Static483.method7665((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4115) {
												local13 = anIntArray467[--anInt9169];
												anIntArray467[anInt9169++] = Static228.method4167((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4116) {
												local13 = anIntArray467[--anInt9169];
												anIntArray467[anInt9169++] = Static79.method1393((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4117) {
												local4177 = aStringArray58[--anInt9159];
												if (local4177 != null) {
													anIntArray467[anInt9169++] = local4177.length();
													return;
												}
												anIntArray467[anInt9169++] = 0;
												return;
											}
											if (arg0 == 4118) {
												local4177 = aStringArray58[--anInt9159];
												anInt9169 -= 2;
												local19 = anIntArray467[anInt9169];
												local25 = anIntArray467[anInt9169 + 1];
												aStringArray58[anInt9159++] = local4177.substring(local19, local25);
												return;
											}
											if (arg0 == 4119) {
												local4177 = aStringArray58[--anInt9159];
												@Pc(9268) StringBuffer local9268 = new StringBuffer(local4177.length());
												@Pc(9270) boolean local9270 = false;
												for (local357 = 0; local357 < local4177.length(); local357++) {
													@Pc(9277) char local9277 = local4177.charAt(local357);
													if (local9277 == '<') {
														local9270 = true;
													} else if (local9277 == '>') {
														local9270 = false;
													} else if (!local9270) {
														local9268.append(local9277);
													}
												}
												aStringArray58[anInt9159++] = local9268.toString();
												return;
											}
											if (arg0 == 4120) {
												local4177 = aStringArray58[--anInt9159];
												anInt9169 -= 2;
												local19 = anIntArray467[anInt9169];
												local25 = anIntArray467[anInt9169 + 1];
												anIntArray467[anInt9169++] = local4177.indexOf(local19, local25);
												return;
											}
											if (arg0 == 4121) {
												anInt9159 -= 2;
												local4177 = aStringArray58[anInt9159];
												local1161 = aStringArray58[anInt9159 + 1];
												local25 = anIntArray467[--anInt9169];
												anIntArray467[anInt9169++] = local4177.indexOf(local1161, local25);
												return;
											}
											if (arg0 == 4122) {
												local13 = anIntArray467[--anInt9169];
												anIntArray467[anInt9169++] = Character.toLowerCase((char) local13);
												return;
											}
											if (arg0 == 4123) {
												local13 = anIntArray467[--anInt9169];
												anIntArray467[anInt9169++] = Character.toUpperCase((char) local13);
												return;
											}
											if (arg0 == 4124) {
												local420 = anIntArray467[--anInt9169] != 0;
												local19 = anIntArray467[--anInt9169];
												aStringArray58[anInt9159++] = Static89.method1567((long) local19, Static204.anInt8130, 0, local420);
												return;
											}
											if (arg0 == 4125) {
												local4177 = aStringArray58[--anInt9159];
												local19 = anIntArray467[--anInt9169];
												@Pc(9491) Class324 local9491 = Static266.method4575(Static227.aClass124_49, local19);
												anIntArray467[anInt9169++] = local9491.method8179(local4177, Static622.aClass71Array42);
												return;
											}
											if (arg0 == 4126) {
												aStringArray58[anInt9159++] = Static641.method9480((long) anIntArray467[--anInt9169] * 60000L, Static204.anInt8130) + " UTC";
												return;
											}
											if (arg0 == 4127) {
												local8150 = aLongArray19[--anInt9173];
												aStringArray58[anInt9159++] = local8150 == -1L ? "" : Long.toString(local8150, 36).toUpperCase();
												return;
											}
										} else if (arg0 < 4300) {
											if (arg0 == 4200) {
												local13 = anIntArray467[--anInt9169];
												aStringArray58[anInt9159++] = Static372.aClass343_1.method8549(local13).aString119;
												return;
											}
											@Pc(9614) Class351 local9614;
											if (arg0 == 4201) {
												anInt9169 -= 2;
												local13 = anIntArray467[anInt9169];
												local19 = anIntArray467[anInt9169 + 1];
												local9614 = Static372.aClass343_1.method8549(local13);
												if (local19 >= 1 && local19 <= 5 && local9614.aStringArray72[local19 - 1] != null) {
													aStringArray58[anInt9159++] = local9614.aStringArray72[local19 - 1];
													return;
												}
												aStringArray58[anInt9159++] = "";
												return;
											}
											if (arg0 == 4202) {
												anInt9169 -= 2;
												local13 = anIntArray467[anInt9169];
												local19 = anIntArray467[anInt9169 + 1];
												local9614 = Static372.aClass343_1.method8549(local13);
												if (local19 >= 1 && local19 <= 5 && local9614.aStringArray71[local19 - 1] != null) {
													aStringArray58[anInt9159++] = local9614.aStringArray71[local19 - 1];
													return;
												}
												aStringArray58[anInt9159++] = "";
												return;
											}
											if (arg0 == 4203) {
												local13 = anIntArray467[--anInt9169];
												anIntArray467[anInt9169++] = Static372.aClass343_1.method8549(local13).anInt10197;
												return;
											}
											if (arg0 == 4204) {
												local13 = anIntArray467[--anInt9169];
												anIntArray467[anInt9169++] = Static372.aClass343_1.method8549(local13).anInt10211 == 1 ? 1 : 0;
												return;
											}
											@Pc(9777) Class351 local9777;
											if (arg0 == 4205) {
												local13 = anIntArray467[--anInt9169];
												local9777 = Static372.aClass343_1.method8549(local13);
												if (local9777.anInt10178 == -1 && local9777.anInt10210 >= 0) {
													anIntArray467[anInt9169++] = local9777.anInt10210;
													return;
												}
												anIntArray467[anInt9169++] = local13;
												return;
											}
											if (arg0 == 4206) {
												local13 = anIntArray467[--anInt9169];
												local9777 = Static372.aClass343_1.method8549(local13);
												if (local9777.anInt10178 >= 0 && local9777.anInt10210 >= 0) {
													anIntArray467[anInt9169++] = local9777.anInt10210;
													return;
												}
												anIntArray467[anInt9169++] = local13;
												return;
											}
											if (arg0 == 4207) {
												local13 = anIntArray467[--anInt9169];
												anIntArray467[anInt9169++] = Static372.aClass343_1.method8549(local13).aBoolean739 ? 1 : 0;
												return;
											}
											if (arg0 == 4208) {
												anInt9169 -= 2;
												local13 = anIntArray467[anInt9169];
												local19 = anIntArray467[anInt9169 + 1];
												local3242 = Static142.aClass367_1.method9243(local19);
												if (local3242.method5366()) {
													aStringArray58[anInt9159++] = Static372.aClass343_1.method8549(local13).method8829(local19, local3242.aString69);
													return;
												}
												anIntArray467[anInt9169++] = Static372.aClass343_1.method8549(local13).method8822(local19, local3242.anInt5933);
												return;
											}
											if (arg0 == 4209) {
												anInt9169 -= 2;
												local13 = anIntArray467[anInt9169];
												local19 = anIntArray467[anInt9169 + 1] - 1;
												local9614 = Static372.aClass343_1.method8549(local13);
												if (local9614.anInt10152 == local19) {
													anIntArray467[anInt9169++] = local9614.anInt10144;
													return;
												}
												if (local9614.anInt10204 == local19) {
													anIntArray467[anInt9169++] = local9614.anInt10209;
													return;
												}
												anIntArray467[anInt9169++] = -1;
												return;
											}
											if (arg0 == 4210) {
												local4177 = aStringArray58[--anInt9159];
												local19 = anIntArray467[--anInt9169];
												Static470.method4889(local4177, local19 == 1);
												anIntArray467[anInt9169++] = Static369.anInt11000;
												return;
											}
											if (arg0 == 4211) {
												if (Static280.aShortArray71 != null && Static632.anInt10928 < Static369.anInt11000) {
													anIntArray467[anInt9169++] = Static280.aShortArray71[Static632.anInt10928++] & 0xFFFF;
													return;
												}
												anIntArray467[anInt9169++] = -1;
												return;
											}
											if (arg0 == 4212) {
												Static632.anInt10928 = 0;
												return;
											}
											if (arg0 == 4213) {
												local13 = anIntArray467[--anInt9169];
												anIntArray467[anInt9169++] = Static372.aClass343_1.method8549(local13).anInt10205;
												return;
											}
											if (arg0 == 4214) {
												local4177 = aStringArray58[--anInt9159];
												anInt9169 -= 3;
												local19 = anIntArray467[anInt9169];
												local25 = anIntArray467[anInt9169 + 1];
												local357 = anIntArray467[anInt9169 + 2];
												Static555.method8483(local19 == 1, local4177, local25, local357);
												anIntArray467[anInt9169++] = Static369.anInt11000;
												return;
											}
											if (arg0 == 4215) {
												anInt9159 -= 2;
												anInt9169 -= 2;
												local4177 = aStringArray58[anInt9159];
												local19 = anIntArray467[anInt9169];
												local25 = anIntArray467[anInt9169 + 1];
												@Pc(10176) String local10176 = aStringArray58[anInt9159 + 1];
												Static506.method7897(local4177, local19 == 1, local10176, local25);
												anIntArray467[anInt9169++] = Static369.anInt11000;
												return;
											}
										} else if (arg0 < 4400) {
											if (arg0 == 4300) {
												anInt9169 -= 2;
												local13 = anIntArray467[anInt9169];
												local19 = anIntArray467[anInt9169 + 1];
												local3242 = Static142.aClass367_1.method9243(local19);
												if (local3242.method5366()) {
													aStringArray58[anInt9159++] = Static522.aClass272_2.method7200(local13).method7951(local19, local3242.aString69);
													return;
												}
												anIntArray467[anInt9169++] = Static522.aClass272_2.method7200(local13).method7957(local3242.anInt5933, local19);
												return;
											}
										} else if (arg0 < 4500) {
											if (arg0 == 4400) {
												anInt9169 -= 2;
												local13 = anIntArray467[anInt9169];
												local19 = anIntArray467[anInt9169 + 1];
												local3242 = Static142.aClass367_1.method9243(local19);
												if (local3242.method5366()) {
													aStringArray58[anInt9159++] = Static251.aClass328_1.method8261(local13).method8294(local3242.aString69, local19);
													return;
												}
												anIntArray467[anInt9169++] = Static251.aClass328_1.method8261(local13).method8296(local3242.anInt5933, local19);
												return;
											}
										} else if (arg0 < 4600) {
											if (arg0 == 4500) {
												anInt9169 -= 2;
												local13 = anIntArray467[anInt9169];
												local19 = anIntArray467[anInt9169 + 1];
												local3242 = Static142.aClass367_1.method9243(local19);
												if (local3242.method5366()) {
													aStringArray58[anInt9159++] = Static300.aClass197_5.method5094(local13).method8896(local3242.aString69, local19);
													return;
												}
												anIntArray467[anInt9169++] = Static300.aClass197_5.method5094(local13).method8895(local19, local3242.anInt5933);
												return;
											}
										} else if (arg0 < 4700) {
											if (arg0 == 4600) {
												local13 = anIntArray467[--anInt9169];
												@Pc(10404) Class248 local10404 = Static665.aClass267_2.method7159(local13);
												if (local10404.anIntArray359 != null && local10404.anIntArray359.length > 0) {
													local25 = 0;
													local357 = local10404.anIntArray358[0];
													for (local2473 = 1; local2473 < local10404.anIntArray359.length; local2473++) {
														if (local10404.anIntArray358[local2473] > local357) {
															local25 = local2473;
															local357 = local10404.anIntArray358[local2473];
														}
													}
													anIntArray467[anInt9169++] = local10404.anIntArray359[local25];
													return;
												}
												anIntArray467[anInt9169++] = local10404.anInt7477;
												return;
											}
										} else if (arg0 < 4800) {
											if (arg0 == 4700) {
												anIntArray467[anInt9169++] = Static274.aBoolean382 ? 1 : 0;
												return;
											}
											if (arg0 == 4701) {
												local4177 = aStringArray58[--anInt9159];
												if (Static579.anInt10049 == 7 && Static316.anInt5770 == 0) {
													if (local4177.length() > 20) {
														Static228.aByte73 = -4;
														return;
													}
													Static228.aByte73 = -1;
													local4266 = Static311.method5098(Static12.aClass341_3, Static125.aClass179_1);
													local4266.aClass2_Sub8_Sub2_2.method5170(0);
													local25 = local4266.aClass2_Sub8_Sub2_2.anInt5725;
													local4266.aClass2_Sub8_Sub2_2.method5212(local4177);
													local4266.aClass2_Sub8_Sub2_2.method5217(local4266.aClass2_Sub8_Sub2_2.anInt5725 - local25);
													Static38.method791(local4266);
													return;
												}
												Static228.aByte73 = -5;
												return;
											}
											if (arg0 == 4702) {
												anIntArray467[anInt9169++] = Static228.aByte73;
												if (Static228.aByte73 != -1) {
													Static228.aByte73 = -6;
												}
												return;
											}
										}
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static647.method9532(anIntArray467[--anInt9169]);
						} else {
							local137 = arg1 ? aClass357_134 : aClass357_135;
						}
						if (arg0 == 1300) {
							local19 = anIntArray467[--anInt9169] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method8994(local19, aStringArray58[--anInt9159]);
								return;
							}
							anInt9159--;
							return;
						}
						if (arg0 == 1301) {
							anInt9169 -= 2;
							local19 = anIntArray467[anInt9169];
							local25 = anIntArray467[anInt9169 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass357_155 = null;
								return;
							}
							local137.aClass357_155 = Static226.method4160(local25, local19);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray467[--anInt9169];
							if (local19 != Static77.anInt1433 && local19 != Static312.anInt5633 && local19 != Static449.anInt8142) {
								return;
							}
							local137.anInt10461 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt10402 = anIntArray467[--anInt9169];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt10440 = anIntArray467[--anInt9169];
							return;
						}
						if (arg0 == 1305) {
							local137.aString121 = aStringArray58[--anInt9159];
							return;
						}
						if (arg0 == 1306) {
							local137.aString122 = aStringArray58[--anInt9159];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray77 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt10478 = anIntArray467[--anInt9169];
							local137.anInt10420 = anIntArray467[--anInt9169];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray467[--anInt9169];
							local25 = anIntArray467[--anInt9169];
							if (local25 >= 1 && local25 <= 10) {
								local137.method8993(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString124 = aStringArray58[--anInt9159];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt10485 = anIntArray467[--anInt9169];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt9169 -= 3;
								local19 = anIntArray467[anInt9169] - 1;
								local25 = anIntArray467[anInt9169 + 1];
								local357 = anIntArray467[anInt9169 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt9169 -= 2;
								local19 = 10;
								local25 = anIntArray467[anInt9169];
								local357 = anIntArray467[anInt9169 + 1];
							}
							if (local137.aByteArray93 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray93 = new byte[11];
								local137.lb = new byte[11];
								local137.anIntArray545 = new int[11];
							}
							local137.aByteArray93[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean761 = false;
								for (local2473 = 0; local2473 < local137.aByteArray93.length; local2473++) {
									if (local137.aByteArray93[local2473] != 0) {
										local137.aBoolean761 = true;
										break;
									}
								}
							} else {
								local137.aBoolean761 = true;
							}
							local137.lb[local19] = (byte) local357;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt10468 = anIntArray467[--anInt9169];
							return;
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static647.method9532(anIntArray467[--anInt9169]);
					} else {
						local137 = arg1 ? aClass357_134 : aClass357_135;
					}
					Static473.method7526(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt9169 -= 2;
						local19 = anIntArray467[anInt9169];
						local25 = anIntArray467[anInt9169 + 1];
						if (local137.anInt10432 == -1) {
							Static295.method4881(local137.anInt10460);
							Static296.method4895(local137.anInt10460);
							Static26.method460(local137.anInt10460);
						}
						if (local19 == -1) {
							local137.anInt10404 = 1;
							local137.anInt10441 = -1;
							local137.anInt10396 = -1;
							return;
						}
						local137.anInt10396 = local19;
						local137.anInt10398 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean763 = true;
						} else {
							local137.aBoolean763 = false;
						}
						@Pc(1813) Class351 local1813 = Static372.aClass343_1.method8549(local19);
						local137.anInt10414 = local1813.anInt10160;
						local137.anInt10399 = local1813.anInt10199;
						local137.anInt10469 = local1813.anInt10190;
						local137.anInt10445 = local1813.anInt10188;
						local137.anInt10422 = local1813.anInt10173;
						local137.anInt10455 = local1813.anInt10174;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt10433 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt10433 = 1;
						} else {
							local137.anInt10433 = 2;
						}
						if (local137.anInt10480 > 0) {
							local137.anInt10455 = local137.anInt10455 * 32 / local137.anInt10480;
							return;
						}
						if (local137.anInt10417 > 0) {
							local137.anInt10455 = local137.anInt10455 * 32 / local137.anInt10417;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt10404 = 2;
						local137.anInt10441 = anIntArray467[--anInt9169];
						if (local137.anInt10432 == -1) {
							Static207.method3924(local137.anInt10460);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt10404 = 3;
						local137.anInt10441 = -1;
						if (local137.anInt10432 == -1) {
							Static207.method3924(local137.anInt10460);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt10404 = 6;
						local137.anInt10441 = anIntArray467[--anInt9169];
						if (local137.anInt10432 == -1) {
							Static207.method3924(local137.anInt10460);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt10404 = 5;
						local137.anInt10441 = anIntArray467[--anInt9169];
						if (local137.anInt10432 == -1) {
							Static207.method3924(local137.anInt10460);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt9169 -= 4;
						local137.anInt10456 = anIntArray467[anInt9169];
						local137.anInt10466 = anIntArray467[anInt9169 + 1];
						local137.anInt10482 = anIntArray467[anInt9169 + 2];
						local137.anInt10410 = anIntArray467[anInt9169 + 3];
						Static473.method7526(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt9169 -= 2;
						local137.anInt10448 = anIntArray467[anInt9169];
						local137.anInt10483 = anIntArray467[anInt9169 + 1];
						Static473.method7526(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt9169 -= 4;
						local137.anInt10441 = anIntArray467[anInt9169];
						local137.anInt10450 = anIntArray467[anInt9169 + 1];
						if (anIntArray467[anInt9169 + 2] == 1) {
							local137.anInt10404 = 9;
						} else {
							local137.anInt10404 = 8;
						}
						if (anIntArray467[anInt9169 + 3] == 1) {
							local137.aBoolean763 = true;
						} else {
							local137.aBoolean763 = false;
						}
						if (local137.anInt10432 == -1) {
							Static207.method3924(local137.anInt10460);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt10404 = 5;
						local137.anInt10441 = Static659.anInt11273;
						local137.anInt10450 = 0;
						if (local137.anInt10432 == -1) {
							Static207.method3924(local137.anInt10460);
						}
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}
}
