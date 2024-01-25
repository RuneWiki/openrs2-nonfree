import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!hf", name = "N", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!hf", name = "M", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!hf", name = "O", descriptor = "Lclient!er;")
	public static final Class102 aClass102_1 = Static28.method5495();

	@OriginalMember(owner = "client!hf", name = "T", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[200];

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V")
	public static void method3765() {
		@Pc(8) int local8 = Static511.aByteArrayArray23.length;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			if (Static511.aByteArrayArray23[local17] != null) {
				@Pc(27) int local27 = -1;
				for (@Pc(29) int local29 = 0; local29 < Static681.anInt11083; local29++) {
					if (Static365.anIntArray336[local17] == Static66.anIntArray64[local29]) {
						local27 = local29;
						break;
					}
				}
				if (local27 == -1) {
					Static66.anIntArray64[Static681.anInt11083] = Static365.anIntArray336[local17];
					local27 = Static681.anInt11083++;
				}
				@Pc(84) Class14_Sub21 local84 = new Class14_Sub21(Static511.aByteArrayArray23[local17]);
				@Pc(86) int local86 = 0;
				while (Static511.aByteArrayArray23[local17].length > local84.anInt8936 && local86 < 511 && Static662.anInt10795 < 1023) {
					@Pc(111) int local111 = local27 | local86++ << 6;
					@Pc(115) int local115 = local84.method7717(-1978450544);
					@Pc(119) int local119 = local115 >> 14;
					@Pc(125) int local125 = local115 >> 7 & 0x3F;
					@Pc(129) int local129 = local115 & 0x3F;
					@Pc(141) int local141 = (Static365.anIntArray336[local17] >> 8) * 64 + local125 - Static36.anInt617;
					@Pc(155) int local155 = (Static365.anIntArray336[local17] & 0xFF) * 64 + local129 - Static550.anInt9242;
					@Pc(162) Class362 local162 = Static152.aClass61_1.method1230(local84.method7717(-1978450544));
					@Pc(169) Class14_Sub44 local169 = (Class14_Sub44) Static100.aClass125_9.method2630((long) local111);
					if (local169 == null && (local162.aByte129 & 0x1) > 0 && local119 == Static114.anInt1886 && local141 >= 0 && local141 + local162.anInt10069 < Static380.anInt6689 && local155 >= 0 && Static542.anInt9214 > local162.anInt10069 + local155) {
						@Pc(226) Class4_Sub3_Sub3_Sub3_Sub1 local226 = new Class4_Sub3_Sub3_Sub3_Sub1();
						local226.anInt3238 = local111;
						@Pc(234) Class14_Sub44 local234 = new Class14_Sub44(local226);
						Static100.aClass125_9.method2626(local234, (long) local111);
						Static28.aClass14_Sub44Array2[Static549.anInt1216++] = local234;
						Static253.anIntArray241[Static662.anInt10795++] = local111;
						local226.anInt3285 = Static530.anInt9105;
						local226.method2572(local162);
						local226.method2882(local226.aClass362_1.anInt10069);
						local226.anInt3295 = local226.aClass362_1.anInt10063 << 3;
						local226.method2873((local226.aClass362_1.aByte128 + 4 & 0xB2400007) << 11, true);
						local226.method2571(local226.method2870(0), local119, local141, true, local155);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(III)Z")
	public static boolean method3766(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V")
	public static void method3767(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		@Pc(12) Class30 local12 = Static398.aClass30Array1[99];
		for (@Pc(14) int local14 = 99; local14 > 0; local14--) {
			Static398.aClass30Array1[local14] = Static398.aClass30Array1[local14 - 1];
		}
		if (local12 == null) {
			local12 = new Class30(arg3, arg5, arg7, arg2, arg1, arg0, arg4, arg6);
		} else {
			local12.method573(arg3, arg7, arg1, arg0, arg2, arg4, arg5, arg6);
		}
		Static501.anInt8737++;
		Static637.anInt10425 = Static154.anInt2379;
		Static398.aClass30Array1[0] = local12;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(III)Z")
	public static boolean method3768(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZIIIIILclient!ha;)V")
	public static void method3769(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(7) Class144 arg4) {
		Static22.aClass144_1 = arg4;
		Static65.aClass263_1 = Static22.aClass144_1.method6914();
		Static289.aClass263_5 = Static22.aClass144_1.method6914();
		Static314.aClass263_6 = Static22.aClass144_1.method6914();
		Static456.anInterface22_1 = null;
		Static515.anInt8875 = 0;
		Static611.anInt10061 = arg2;
		Static469.anInt11070 = 2;
		Static322.anInt5594 = 2;
		Static599.anInt9885 = arg0;
		Static511.anInt8867 = 0;
		Static18.anInt243 = 1;
		Static471.method7069(arg1, arg3);
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V")
	public static void method3771() {
		Static444.method6621();
		for (@Pc(11) int local11 = 0; local11 < 4; local11++) {
			Static40.aClass289Array1[local11].method7082();
		}
		Static563.method4401();
		Static419.method9119();
		Static87.method1439();
		System.gc();
		Static103.aClass144_3.ya();
	}
}
