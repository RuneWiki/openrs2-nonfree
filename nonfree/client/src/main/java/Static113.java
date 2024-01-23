import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString86 = "You can't add yourself to your own friend list.";

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "Z")
	public static boolean aBoolean182 = true;

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
	public static int anInt2317 = -1;

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "[I")
	public static int[] anIntArray188 = new int[50];

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
	public static void method1838() {
		if (Static230.anInt4668 == 0) {
			return;
		}
		try {
			if (++Static214.anInt4413 > 2000) {
				if (Static95.aClass92_4 != null) {
					Static95.aClass92_4.method2176();
					Static95.aClass92_4 = null;
				}
				if (Static90.anInt1918 >= 1) {
					Static230.anInt4668 = 0;
					Static242.anInt4854 = -5;
					return;
				}
				Static214.anInt4413 = 0;
				Static230.anInt4668 = 1;
				Static90.anInt1918++;
				if (Static159.anInt3248 == Static2.anInt8) {
					Static159.anInt3248 = Static190.anInt3820;
				} else {
					Static159.anInt3248 = Static2.anInt8;
				}
			}
			if (Static230.anInt4668 == 1) {
				Static39.aClass163_4 = Static199.aClass17_3.method445(Static224.aString162, Static159.anInt3248);
				Static230.anInt4668 = 2;
			}
			@Pc(128) int local128;
			if (Static230.anInt4668 == 2) {
				if (Static39.aClass163_4.anInt5259 == 2) {
					throw new IOException();
				}
				if (Static39.aClass163_4.anInt5259 != 1) {
					return;
				}
				Static95.aClass92_4 = new Class92((Socket) Static39.aClass163_4.anObject7, Static199.aClass17_3);
				Static39.aClass163_4 = null;
				Static95.aClass92_4.method2178(Static66.aClass8_Sub2_Sub1_4.aByteArray24, Static66.aClass8_Sub2_Sub1_4.anInt2955);
				if (Static153.aClass111_2 != null) {
					Static153.aClass111_2.method4153();
				}
				if (Static79.aClass111_1 != null) {
					Static79.aClass111_1.method4153();
				}
				local128 = Static95.aClass92_4.method2177();
				if (Static153.aClass111_2 != null) {
					Static153.aClass111_2.method4153();
				}
				if (Static79.aClass111_1 != null) {
					Static79.aClass111_1.method4153();
				}
				if (local128 != 21) {
					Static230.anInt4668 = 0;
					Static242.anInt4854 = local128;
					Static95.aClass92_4.method2176();
					Static95.aClass92_4 = null;
					return;
				}
				Static230.anInt4668 = 3;
			}
			if (Static230.anInt4668 == 3) {
				if (Static95.aClass92_4.method2175() < 1) {
					return;
				}
				Static95.aStringArray31 = new String[Static95.aClass92_4.method2177()];
				Static230.anInt4668 = 4;
			}
			if (Static230.anInt4668 == 4) {
				if (Static95.aClass92_4.method2175() < Static95.aStringArray31.length * 8) {
					return;
				}
				Static275.aClass8_Sub2_Sub1_6.anInt2955 = 0;
				Static95.aClass92_4.method2182(0, Static95.aStringArray31.length * 8, Static275.aClass8_Sub2_Sub1_6.aByteArray24);
				for (local128 = 0; local128 < Static95.aStringArray31.length; local128++) {
					Static95.aStringArray31[local128] = Static72.method1149(Static275.aClass8_Sub2_Sub1_6.method2347());
				}
				Static230.anInt4668 = 0;
				Static242.anInt4854 = 21;
				Static95.aClass92_4.method2176();
				Static95.aClass92_4 = null;
				return;
			}
		} catch (@Pc(236) IOException local236) {
			if (Static95.aClass92_4 != null) {
				Static95.aClass92_4.method2176();
				Static95.aClass92_4 = null;
			}
			if (Static90.anInt1918 < 1) {
				if (Static159.anInt3248 == Static2.anInt8) {
					Static159.anInt3248 = Static190.anInt3820;
				} else {
					Static159.anInt3248 = Static2.anInt8;
				}
				Static90.anInt1918++;
				Static214.anInt4413 = 0;
				Static230.anInt4668 = 1;
			} else {
				Static230.anInt4668 = 0;
				Static242.anInt4854 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)I")
	public static int method1841(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(23) int local23 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local23;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V")
	public static void method1842() {
		for (@Pc(17) Class8_Sub9 local17 = (Class8_Sub9) Static84.aClass182_10.method4319(); local17 != null; local17 = (Class8_Sub9) Static84.aClass182_10.method4329()) {
			if (local17.anInt1245 == -1) {
				local17.anInt1248 = 0;
				Static122.method1968(local17);
			} else {
				local17.method4273();
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZZ)V")
	public static void method1843(@OriginalArg(0) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(13) byte[][] local13;
		if (Static116.aBoolean188 && arg0) {
			local13 = Static109.aByteArrayArray8;
			local11 = 1;
		} else {
			local11 = 4;
			local13 = Static177.aByteArrayArray7;
		}
		@Pc(22) int local22 = local13.length;
		@Pc(24) int local24;
		@Pc(49) int local49;
		for (local24 = 0; local24 < local22; local24++) {
			@Pc(35) byte[] local35 = local13[local24];
			@Pc(37) int[] local37 = null;
			@Pc(43) int local43 = Static13.anIntArray15[local24] >> 8;
			local49 = Static13.anIntArray15[local24] & 0xFF;
			@Pc(56) int local56 = local43 * 64 - Static49.anInt1089;
			@Pc(63) int local63 = local49 * 64 - Static130.anInt2601;
			if (local35 != null) {
				Static16.method2745();
				local37 = Static89.method1448(Static130.anInt2601, Static49.anInt1089, arg0, local63, local35, Static159.aClass112Array1, local56);
			}
			if (!arg0 && Static250.anInt4960 / 8 == local43 && local49 == Static42.anInt957 / 8) {
				if (local37 == null) {
					Static181.anInt3564 = -1;
				} else {
					Static82.anInt1791 = local37[4];
					Static216.anInt4457 = local37[1];
					Static39.anInt857 = local37[3];
					Static181.anInt3564 = local37[0];
					Static160.anInt3256 = local37[2];
				}
			}
		}
		for (local24 = 0; local24 < local22; local24++) {
			@Pc(135) int local135 = (Static13.anIntArray15[local24] >> 8) * 64 - Static49.anInt1089;
			@Pc(139) byte[] local139 = local13[local24];
			@Pc(150) int local150 = (Static13.anIntArray15[local24] & 0xFF) * 64 - Static130.anInt2601;
			if (local139 == null && Static42.anInt957 < 800) {
				Static16.method2745();
				for (local49 = 0; local49 < local11; local49++) {
					Static182.method2786(local135, local49, 64, 64, local150);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BIIIII)V")
	public static void method1844(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == arg2) {
			Static265.method4000(arg3, arg1, arg0, arg4);
		} else if (arg0 - arg3 >= Static253.anInt4996 && arg0 + arg3 <= Static52.anInt1146 && Static228.anInt4643 <= arg4 - arg2 && Static244.anInt4872 >= arg2 + arg4) {
			Static261.method3926(arg1, arg2, arg4, arg0, arg3);
		} else {
			Static299.method4323(arg2, arg4, arg1, arg0, arg3);
		}
	}
}
