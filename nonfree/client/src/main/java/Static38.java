import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ee", name = "T", descriptor = "[Lclient!ta;")
	public static Class2_Sub3_Sub2_Sub3[] aClass2_Sub3_Sub2_Sub3Array1;

	@OriginalMember(owner = "client!ee", name = "U", descriptor = "Z")
	public static boolean aBoolean39;

	@OriginalMember(owner = "client!ee", name = "V", descriptor = "Lclient!qf;")
	public static Class2_Sub3_Sub14 aClass2_Sub3_Sub14_1;

	@OriginalMember(owner = "client!ee", name = "ab", descriptor = "B")
	public static byte aByte2;

	@OriginalMember(owner = "client!ee", name = "R", descriptor = "Lclient!ai;")
	public static Class6 aClass6_293 = method685("k");

	@OriginalMember(owner = "client!ee", name = "W", descriptor = "I")
	public static int anInt1087 = 0;

	@OriginalMember(owner = "client!ee", name = "Z", descriptor = "I")
	public static int anInt1090 = 0;

	@OriginalMember(owner = "client!ee", name = "bb", descriptor = "[I")
	public static int[] anIntArray58 = new int[1000];

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[B)V")
	public static void method682(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class2_Sub13 local10 = new Class2_Sub13(arg0);
		local10.anInt2154 = arg0.length - 2;
		Static31.anInt774 = local10.method1397();
		Static131.anIntArray278 = new int[Static31.anInt774];
		Static76.anIntArray121 = new int[Static31.anInt774];
		Static14.anIntArray16 = new int[Static31.anInt774];
		Static88.anIntArray153 = new int[Static31.anInt774];
		Static167.aByteArrayArray10 = new byte[Static31.anInt774][];
		local10.anInt2154 = arg0.length - Static31.anInt774 * 8 - 7;
		Static163.anInt3833 = local10.method1397();
		Static130.anInt3018 = local10.method1397();
		@Pc(62) int local62 = (local10.method1402() & 0xFF) + 1;
		for (@Pc(64) int local64 = 0; local64 < Static31.anInt774; local64++) {
			Static76.anIntArray121[local64] = local10.method1397();
		}
		for (@Pc(82) int local82 = 0; local82 < Static31.anInt774; local82++) {
			Static14.anIntArray16[local82] = local10.method1397();
		}
		for (@Pc(96) int local96 = 0; local96 < Static31.anInt774; local96++) {
			Static88.anIntArray153[local96] = local10.method1397();
		}
		for (@Pc(119) int local119 = 0; local119 < Static31.anInt774; local119++) {
			Static131.anIntArray278[local119] = local10.method1397();
		}
		local10.anInt2154 = arg0.length - Static31.anInt774 * 8 - local62 * 3 - 4;
		Static127.anIntArray258 = new int[local62];
		for (@Pc(151) int local151 = 1; local151 < local62; local151++) {
			Static127.anIntArray258[local151] = local10.method1406();
			if (Static127.anIntArray258[local151] == 0) {
				Static127.anIntArray258[local151] = 1;
			}
		}
		local10.anInt2154 = 0;
		for (@Pc(179) int local179 = 0; local179 < Static31.anInt774; local179++) {
			@Pc(185) int local185 = Static88.anIntArray153[local179];
			@Pc(189) int local189 = Static131.anIntArray278[local179];
			@Pc(193) int local193 = local185 * local189;
			@Pc(196) byte[] local196 = new byte[local193];
			Static167.aByteArrayArray10[local179] = local196;
			@Pc(204) int local204 = local10.method1402();
			@Pc(208) int local208;
			if (local204 == 0) {
				for (local208 = 0; local208 < local193; local208++) {
					local196[local208] = local10.method1394();
				}
			} else if (local204 == 1) {
				for (local208 = 0; local208 < local185; local208++) {
					for (@Pc(233) int local233 = 0; local233 < local189; local233++) {
						local196[local185 * local233 + local208] = local10.method1394();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
	public static void method683() {
		Static89.aClass16_7 = new Class16(32);
	}

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
	public static void method684() {
		aClass6_293 = null;
		aClass2_Sub3_Sub14_1 = null;
		anIntArray58 = null;
		aClass2_Sub3_Sub2_Sub3Array1 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!ai;")
	public static Class6 method685(@OriginalArg(0) String arg0) {
		@Pc(14) byte[] local14 = arg0.getBytes();
		@Pc(17) int local17 = local14.length;
		@Pc(19) int local19 = 0;
		@Pc(23) Class6 local23 = new Class6();
		local23.aByteArray2 = new byte[local17];
		while (local17 > local19) {
			@Pc(35) int local35 = local14[local19++] & 0xFF;
			if (local35 <= 45 && local35 >= 40) {
				if (local19 >= local17) {
					break;
				}
				@Pc(70) int local70 = local14[local19++] & 0xFF;
				local23.aByteArray2[local23.anInt165++] = (byte) ((local35 - 40) * 43 + local70 - 48);
			} else if (local35 != 0) {
				local23.aByteArray2[local23.anInt165++] = (byte) local35;
			}
		}
		local23.method127();
		return local23.method136();
	}
}
