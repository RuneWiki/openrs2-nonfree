import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!w", name = "V", descriptor = "Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4 aClass5_Sub2_Sub1_Sub4_7;

	@OriginalMember(owner = "client!w", name = "nb", descriptor = "[I")
	public static int[] anIntArray393;

	@OriginalMember(owner = "client!w", name = "ob", descriptor = "[I")
	public static int[] anIntArray394;

	@OriginalMember(owner = "client!w", name = "W", descriptor = "I")
	public static int anInt3233 = 0;

	@OriginalMember(owner = "client!w", name = "Y", descriptor = "I")
	public static int anInt3235 = 0;

	@OriginalMember(owner = "client!w", name = "bb", descriptor = "Lclient!r;")
	public static Class61 aClass61_1066 = method2060("Hier wechseln");

	@OriginalMember(owner = "client!w", name = "db", descriptor = "Lclient!r;")
	public static Class61 aClass61_1067 = method2060("scrollen:");

	@OriginalMember(owner = "client!w", name = "eb", descriptor = "I")
	public static int anInt3238 = 0;

	@OriginalMember(owner = "client!w", name = "gb", descriptor = "I")
	public static int anInt3240 = 0;

	@OriginalMember(owner = "client!w", name = "lb", descriptor = "[I")
	public static int[] anIntArray392 = new int[1000];

	@OriginalMember(owner = "client!w", name = "qb", descriptor = "I")
	public static int anInt3245 = 0;

	@OriginalMember(owner = "client!w", name = "tb", descriptor = "Lclient!r;")
	public static Class61 aClass61_1068 = method2060(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!w", name = "xb", descriptor = "Lclient!r;")
	public static Class61 aClass61_1069 = method2060("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!w", name = "zb", descriptor = "Lclient!r;")
	public static Class61 aClass61_1070 = method2060("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!w", name = "Bb", descriptor = "I")
	public static int anInt3251 = 0;

	@OriginalMember(owner = "client!w", name = "Db", descriptor = "Lclient!r;")
	public static Class61 aClass61_1071 = method2060("null");

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I[B)[B")
	public static byte[] method2057(@OriginalArg(1) byte[] arg0) {
		@Pc(2) int local2 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local2];
		Static136.method893(arg0, 0, local14, 0, local2);
		return local14;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/lang/String;)Lclient!r;")
	public static Class61 method2060(@OriginalArg(1) String arg0) {
		@Pc(13) byte[] local13 = arg0.getBytes();
		@Pc(16) int local16 = local13.length;
		@Pc(18) int local18 = 0;
		@Pc(22) Class61 local22 = new Class61();
		local22.aByteArray38 = new byte[local16];
		while (local16 > local18) {
			@Pc(34) int local34 = local13[local18++] & 0xFF;
			if (local34 <= 45 && local34 >= 40) {
				if (local16 <= local18) {
					break;
				}
				@Pc(70) int local70 = local13[local18++] & 0xFF;
				local22.aByteArray38[local22.anInt2675++] = (byte) (local70 + local34 * 43 - 48 - 1720);
			} else if (local34 != 0) {
				local22.aByteArray38[local22.anInt2675++] = (byte) local34;
			}
		}
		local22.method1718();
		return local22.method1732();
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
	public static void method2065() {
		aClass5_Sub2_Sub1_Sub4_7 = null;
		aClass61_1068 = null;
		anIntArray394 = null;
		aClass61_1066 = null;
		aClass61_1070 = null;
		anIntArray392 = null;
		anIntArray393 = null;
		aClass61_1069 = null;
		aClass61_1067 = null;
		aClass61_1071 = null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([BI)V")
	public static void method2066(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class5_Sub14 local4 = new Class5_Sub14(arg0);
		local4.anInt2199 = arg0.length - 2;
		Static86.anInt2319 = local4.method1478();
		Static67.aByteArrayArray7 = new byte[Static86.anInt2319][];
		anIntArray393 = new int[Static86.anInt2319];
		Static48.anIntArray190 = new int[Static86.anInt2319];
		Static50.anIntArray191 = new int[Static86.anInt2319];
		Static58.anIntArray212 = new int[Static86.anInt2319];
		local4.anInt2199 = arg0.length - Static86.anInt2319 * 8 - 7;
		Static92.anInt2249 = local4.method1478();
		Static93.anInt2432 = local4.method1478();
		@Pc(59) int local59 = (local4.method1471() & 0xFF) + 1;
		for (@Pc(65) int local65 = 0; local65 < Static86.anInt2319; local65++) {
			anIntArray393[local65] = local4.method1478();
		}
		for (@Pc(82) int local82 = 0; local82 < Static86.anInt2319; local82++) {
			Static48.anIntArray190[local82] = local4.method1478();
		}
		for (@Pc(95) int local95 = 0; local95 < Static86.anInt2319; local95++) {
			Static58.anIntArray212[local95] = local4.method1478();
		}
		for (@Pc(108) int local108 = 0; local108 < Static86.anInt2319; local108++) {
			Static50.anIntArray191[local108] = local4.method1478();
		}
		local4.anInt2199 = arg0.length - (local59 - 1) * 3 - Static86.anInt2319 * 8 - 7;
		Static108.anIntArray19 = new int[local59];
		for (@Pc(142) int local142 = 1; local142 < local59; local142++) {
			Static108.anIntArray19[local142] = local4.method1439();
			if (Static108.anIntArray19[local142] == 0) {
				Static108.anIntArray19[local142] = 1;
			}
		}
		local4.anInt2199 = 0;
		for (@Pc(170) int local170 = 0; local170 < Static86.anInt2319; local170++) {
			@Pc(175) int local175 = Static50.anIntArray191[local170];
			@Pc(179) int local179 = Static58.anIntArray212[local170];
			@Pc(183) int local183 = local179 * local175;
			@Pc(186) byte[] local186 = new byte[local183];
			Static67.aByteArrayArray7[local170] = local186;
			@Pc(194) int local194 = local4.method1471();
			@Pc(198) int local198;
			if (local194 == 0) {
				for (local198 = 0; local198 < local183; local198++) {
					local186[local198] = local4.method1447();
				}
			} else if (local194 == 1) {
				for (local198 = 0; local198 < local179; local198++) {
					for (@Pc(218) int local218 = 0; local218 < local175; local218++) {
						local186[local198 + local179 * local218] = local4.method1447();
					}
				}
			}
		}
	}
}
