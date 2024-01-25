import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cea", name = "h", descriptor = "[I")
	public static final int[] anIntArray72 = new int[6];

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
	public static void method946(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static405.method5913(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static350.method5215(local7);
			local7 = Static131.method7332(local7, ":", "%3a");
			local7 = Static131.method7332(local7, "@", "%40");
			local7 = Static131.method7332(local7, "&", "%26");
			local7 = Static131.method7332(local7, "#", "%23");
			if (Static516.anApplet1 != null) {
				@Pc(97) Class347 local97 = Static13.aClass287_6.method6531(new URL(Static516.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static225.anInt4213 + "&u=" + Static430.aLong205 + "&v1=" + Static464.aString77 + "&v2=" + Static464.aString82 + "&e=" + local7));
				while (local97.anInt9172 == 0) {
					Static459.method6498(1L);
				}
				if (local97.anInt9172 == 1) {
					@Pc(118) DataInputStream local118 = (DataInputStream) local97.anObject49;
					local118.read();
					local118.close();
				}
			}
		} catch (@Pc(125) Exception local125) {
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "([[BLclient!gl;I)V")
	public static void method947(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class49_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg0[local17];
			if (local23 != null) {
				@Pc(30) Class2_Sub15 local30 = new Class2_Sub15(local23);
				local36 = Static234.anIntArray280[local17] >> 8;
				@Pc(42) int local42 = Static234.anIntArray280[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static35.anInt906;
				@Pc(56) int local56 = local42 * 64 - Static130.anInt5246;
				Static352.method5248();
				arg1.method2994(local56, local49, Static35.anInt906, local30, Static130.anInt5246, Static495.aClass355Array1);
				arg1.method3009(Static307.aClass100_6, local56, local30, local12, local49);
				if (!arg1.aBoolean301 && local36 == Static584.anInt9529 / 8 && Static274.anInt4959 / 8 == local42 && local12[0] != -1) {
					Static459.aClass326_1 = Static197.aClass147_1.method3348(Static416.aClass232_1, local12[1], local12[2], local12[3], local12[0]);
					Static153.anInt3072 = local12[4];
				}
			}
		}
		for (@Pc(136) int local136 = 0; local136 < local15; local136++) {
			@Pc(149) int local149 = (Static234.anIntArray280[local136] >> 8) * 64 - Static35.anInt906;
			local36 = (Static234.anIntArray280[local136] & 0xFF) * 64 - Static130.anInt5246;
			@Pc(164) byte[] local164 = arg0[local136];
			if (local164 == null && Static274.anInt4959 < 800) {
				Static352.method5248();
				arg1.method2996(local36, local149);
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(III)Z")
	public static boolean method949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZLjava/lang/String;IILjava/lang/String;)V")
	public static void method950(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		Static229.method3603(-1, arg1, arg0, arg2, true, arg3);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!dr;BI)V")
	public static void method951(@OriginalArg(0) Class84 arg0, @OriginalArg(2) int arg1) {
		if (Static245.anInt4559 >= 50 || (arg0 == null || arg0.anIntArrayArray7 == null || arg0.anIntArrayArray7.length <= arg1 || arg0.anIntArrayArray7[arg1] == null)) {
			return;
		}
		@Pc(34) int local34 = arg0.anIntArrayArray7[arg1][0];
		@Pc(38) int local38 = local34 >> 8;
		if (arg0.anIntArrayArray7[arg1].length > 1) {
			@Pc(57) int local57 = (int) (Math.random() * (double) arg0.anIntArrayArray7[arg1].length);
			if (local57 > 0) {
				local38 = arg0.anIntArrayArray7[arg1][local57];
			}
		}
		@Pc(72) int local72 = local34 >> 5 & 0x7;
		if (arg0.aBoolean185) {
			Static385.method5669(local38, local72, 0, 255, false);
		} else {
			Static228.method3557(255, local38, local72, 0);
		}
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(III)V")
	public static void method952(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static168.method2918(arg0)) {
			Static548.method7440(Static2.aClass196ArrayArray1[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method953(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			@Pc(22) int local22 = arg1[local12 + arg2] & 0xFF;
			if (local22 != 0) {
				if (local22 >= 128 && local22 < 160) {
					@Pc(39) char local39 = Static510.aCharArray12[local22 - 128];
					if (local39 == '\u0000') {
						local39 = '?';
					}
					local22 = local39;
				}
				local8[local10++] = (char) local22;
			}
		}
		return new String(local8, 0, local10);
	}
}
