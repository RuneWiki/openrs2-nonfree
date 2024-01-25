import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!sca", name = "n", descriptor = "Lclient!hia;")
	public static Class133 aClass133_41;

	@OriginalMember(owner = "client!sca", name = "db", descriptor = "[Lclient!s;")
	public static Class199[] aClass199Array3;

	@OriginalMember(owner = "client!sca", name = "Xc", descriptor = "[[B")
	public static byte[][] aByteArrayArray140;

	@OriginalMember(owner = "client!sca", name = "Pb", descriptor = "[[I")
	public static final int[][] anIntArrayArray45 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(III[B)Ljava/lang/String;")
	public static String method7547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			@Pc(23) int local23 = arg2[arg1 + local12] & 0xFF;
			if (local23 != 0) {
				if (local23 >= 128 && local23 < 160) {
					@Pc(40) char local40 = Static15.aCharArray9[local23 - 128];
					if (local40 == '\u0000') {
						local40 = '?';
					}
					local23 = local40;
				}
				local8[local10++] = (char) local23;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V")
	public static void method7548() {
		if (!Static374.aBoolean457) {
			Static48.aFloat15 += (-24.0F - Static48.aFloat15) / 2.0F;
			Static374.aBoolean457 = true;
			Static246.aBoolean346 = true;
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!ge;B)[Lclient!hc;")
	public static Class125[] method7558(@OriginalArg(0) Class112 arg0) {
		if (!arg0.method3222()) {
			return new Class125[0];
		}
		@Pc(24) Class328 local24 = arg0.method3235();
		while (local24.anInt9389 == 0) {
			Static179.method3254(10L);
		}
		if (local24.anInt9389 == 2) {
			return new Class125[0];
		}
		@Pc(45) int[] local45 = (int[]) local24.anObject21;
		@Pc(51) Class125[] local51 = new Class125[local45.length >> 2];
		for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
			@Pc(59) Class125 local59 = new Class125();
			local51[local53] = local59;
			local59.anInt4044 = local45[local53 << 2];
			local59.anInt4045 = local45[(local53 << 2) + 1];
			local59.anInt4047 = local45[(local53 << 2) + 2];
			local59.anInt4046 = local45[(local53 << 2) + 3];
		}
		return local51;
	}

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "(I)V")
	public static void method7561() {
		Static152.anInt5122 = 0;
		@Pc(11) int local11 = Static456.aClass6_Sub40_Sub2_2.method8571();
		@Pc(15) int local15 = Static456.aClass6_Sub40_Sub2_2.method8552();
		@Pc(19) int local19 = Static456.aClass6_Sub40_Sub2_2.method8576();
		@Pc(30) boolean local30 = Static456.aClass6_Sub40_Sub2_2.method8576() == 1;
		Static518.method7753();
		Static351.method5660(local19);
		@Pc(48) int local48 = (Static501.anInt8676 - Static456.aClass6_Sub40_Sub2_2.anInt10169) / 16;
		Static495.anIntArrayArray43 = new int[local48][4];
		@Pc(58) int local58;
		for (@Pc(54) int local54 = 0; local54 < local48; local54++) {
			for (local58 = 0; local58 < 4; local58++) {
				Static495.anIntArrayArray43[local54][local58] = Static456.aClass6_Sub40_Sub2_2.method8579();
			}
		}
		Static29.anIntArray36 = new int[local48];
		Static480.anIntArray523 = new int[local48];
		aByteArrayArray140 = new byte[local48][];
		Static85.aByteArrayArray31 = new byte[local48][];
		Static82.anIntArray114 = null;
		Static117.aByteArrayArray43 = new byte[local48][];
		Static330.anIntArray372 = new int[local48];
		Static173.anIntArray217 = new int[local48];
		Static91.aByteArrayArray23 = new byte[local48][];
		Static69.anIntArray100 = new int[local48];
		Static327.aByteArrayArray102 = null;
		local48 = 0;
		for (local58 = (local15 - (Static442.anInt7975 >> 4)) / 8; local58 <= (local15 + (Static442.anInt7975 >> 4)) / 8; local58++) {
			for (@Pc(134) int local134 = (local11 - (Static284.anInt7916 >> 4)) / 8; local134 <= ((Static284.anInt7916 >> 4) + local11) / 8; local134++) {
				Static480.anIntArray523[local48] = (local58 << 8) + local134;
				Static29.anIntArray36[local48] = Static503.aClass353_102.method8410("m" + local58 + "_" + local134);
				Static69.anIntArray100[local48] = Static503.aClass353_102.method8410("l" + local58 + "_" + local134);
				Static173.anIntArray217[local48] = Static503.aClass353_102.method8410("um" + local58 + "_" + local134);
				Static330.anIntArray372[local48] = Static503.aClass353_102.method8410("ul" + local58 + "_" + local134);
				local48++;
			}
		}
		Static323.method5375(local30, local15, local11, 11);
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIIII)Z")
	public static boolean method7565(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static197.aByteArrayArrayArray24[0][arg3][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static197.aByteArrayArrayArray24[arg2][arg3][arg1] & 0x10) == 0) {
			return arg0 == Static562.method8097(arg3, arg2, arg1);
		} else {
			return false;
		}
	}
}
