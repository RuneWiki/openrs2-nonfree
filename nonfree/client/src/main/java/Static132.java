import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
	public static int anInt2554;

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "Z")
	public static boolean aBoolean176 = false;

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "[J")
	public static long[] aLongArray16 = new long[100];

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString154 = "wave:";

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)Lclient!vn;")
	public static Class4_Sub3_Sub14_Sub1 method2003() {
		@Pc(9) byte[] local9 = Static230.aByteArrayArray36[0];
		@Pc(28) int local28 = Static110.anIntArray185[0] * Static301.anIntArray643[0];
		@Pc(31) int[] local31 = new int[local28];
		for (@Pc(33) int local33 = 0; local33 < local28; local33++) {
			local31[local33] = Static58.anIntArray85[local9[local33] & 0xFF];
		}
		@Pc(68) Class4_Sub3_Sub14_Sub1 local68 = new Class4_Sub3_Sub14_Sub1(Static47.anInt889, Static105.anInt2162, Static195.anIntArray402[0], Static187.anIntArray391[0], Static110.anIntArray185[0], Static301.anIntArray643[0], local31);
		Static304.method4707();
		return local68;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static71.anIntArrayArrayArray3[arg0][local16][local20] == -Static81.anInt1871) {
						return false;
					}
				}
			}
			local16 = (arg1 << 7) + 1;
			local20 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static243.anIntArrayArrayArray13[arg0][arg1][arg3] + arg5;
			if (!Static264.method4156(local16, local156, local20)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static264.method4156(local169, local156, local20)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static264.method4156(local16, local156, local182)) {
				return false;
			} else if (Static264.method4156(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static31.method508(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static264.method4156(local16 + 1, Static243.anIntArrayArrayArray13[arg0][arg1][arg3] + arg5, local20 + 1) && Static264.method4156(local16 + 128 - 1, Static243.anIntArrayArrayArray13[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static264.method4156(local16 + 128 - 1, Static243.anIntArrayArrayArray13[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static264.method4156(local16 + 1, Static243.anIntArrayArrayArray13[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Lclient!li;")
	public static Class112 method2005(@OriginalArg(1) int arg0) {
		@Pc(10) Class112 local10 = (Class112) Static223.aClass26_45.method518((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static250.aClass58_89.method1372(Static204.method3270(arg0), Static118.method1849(arg0));
		local10 = new Class112();
		local10.anInt3138 = arg0;
		if (local25 != null) {
			local10.method2581(new Class4_Sub10(local25));
		}
		Static223.aClass26_45.method510(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLclient!fh;)V")
	public static void method2006(@OriginalArg(1) Class58 arg0) {
		Static71.aClass56_Sub1Array1 = Static312.method4827(arg0, Static164.anInt3250);
		Static118.anIntArray196 = new int[256];
		@Pc(15) int local15;
		for (local15 = 0; local15 < 3; local15++) {
			@Pc(27) float local27 = (float) (Static312.anIntArray679[local15] >> 16 & 0xFF);
			@Pc(37) int local37 = Static312.anIntArray679[local15 + 1] >> 16 & 0xFF;
			@Pc(44) float local44 = ((float) local37 - local27) / 64.0F;
			@Pc(53) float local53 = (float) (Static312.anIntArray679[local15] >> 8 & 0xFF);
			@Pc(60) float local60 = (float) (Static312.anIntArray679[local15] & 0xFF);
			@Pc(70) int local70 = Static312.anIntArray679[local15 + 1] >> 8 & 0xFF;
			@Pc(77) float local77 = ((float) local70 - local53) / 64.0F;
			@Pc(85) int local85 = Static312.anIntArray679[local15 + 1] & 0xFF;
			@Pc(92) float local92 = ((float) local85 - local60) / 64.0F;
			for (@Pc(94) int local94 = 0; local94 < 64; local94++) {
				Static118.anIntArray196[local94 + local15 * 64] = (int) local27 << 16 | (int) local53 << 8 | (int) local60;
				local53 += local77;
				local27 += local44;
				local60 += local92;
			}
		}
		for (local15 = 192; local15 < 255; local15++) {
			Static118.anIntArray196[local15] = Static312.anIntArray679[3];
		}
		Static86.anIntArray159 = new int[32768];
		Static263.anIntArray544 = new int[32768];
		Static145.method2291(null);
		Static261.anIntArray541 = new int[32768];
		Static69.anIntArray100 = new int[32768];
		Static142.aClass4_Sub3_Sub14_Sub1_4 = new Class4_Sub3_Sub14_Sub1(128, 254);
	}
}
