import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!b", name = "l", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_30 = new Class123(38, -1);

	@OriginalMember(owner = "client!b", name = "k", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_8 = new Class267("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)I")
	public static int method496(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 + arg1 * 57;
		@Pc(20) int local20 = local9 ^ local9 << 13;
		@Pc(34) int local34 = Integer.MAX_VALUE & (local20 * local20 * 15731 + 789221) * local20 + 1376312589;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!ae;I)V")
	public static void method500(@OriginalArg(0) Class6_Sub1 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static350.aClass136_13 != null) {
			@Pc(20) int local20;
			try {
				Static350.aClass136_13.method3105(0L);
				Static350.aClass136_13.method3114(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(42) Exception local42) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method6440(local8, 24);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method501(@OriginalArg(1) String arg0) {
		if (!Static174.aBoolean224) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12 = Static95.anInt2186;
		@Pc(14) int[] local14 = Static178.anIntArray542;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class3_Sub2_Sub1_Sub2 local24 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local14[local16]];
			if (local24 != null && local24 != Static302.aClass3_Sub2_Sub1_Sub2_2 && local24.aString54 != null && local24.aString54.equalsIgnoreCase(arg0)) {
				Static403.method5961(Static355.aClass92_126);
				Static109.aClass6_Sub1_Sub1_5.method6479(Static190.anInt653);
				Static109.aClass6_Sub1_Sub1_5.method6479(Static76.anInt7824);
				Static109.aClass6_Sub1_Sub1_5.method6439(0);
				Static109.aClass6_Sub1_Sub1_5.method6436(local14[local16]);
				Static109.aClass6_Sub1_Sub1_5.method6484(Static363.anInt6463);
				local10 = true;
				Static292.method4382(true, local24.anIntArray458[0], 0, local24.anIntArray459[0], local24.method5521(), 0, local24.method5521(), -2);
				break;
			}
		}
		if (!local10) {
			Static61.method1338(Static372.aClass267_89.method6581(Static161.anInt3239) + arg0);
		}
		if (Static174.aBoolean224) {
			Static54.method1224();
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(III)Z")
	public static boolean method503(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static22.method654(arg0, arg1) | (arg1 & 0x2000) != 0 | Static14.method386(arg1, arg0)) & Static368.method4872(arg1, arg0);
	}
}
