import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray14 = new boolean[100];

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "[I")
	public static final int[] anIntArray309 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!lm;Lclient!lm;)V")
	public static void method2686(@OriginalArg(1) Class134 arg0, @OriginalArg(2) Class134 arg1) {
		Static71.aClass134_31 = arg0;
		Static344.aClass134_147 = arg1;
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V")
	public static void method2687() {
		for (@Pc(10) Class7_Sub8 local10 = (Class7_Sub8) Static340.aClass122_7.method2618(); local10 != null; local10 = (Class7_Sub8) Static340.aClass122_7.method2618()) {
			Static22.method397(local10);
		}
		Static40.method850();
		Static40.method855();
		Static40.method843();
		Static40.method842();
		Static40.method856();
		Static40.method853();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!ps;ZB)V")
	public static void method2689(@OriginalArg(0) Class163 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int local12 = arg0.anInt4928 == 0 ? arg0.anInt4991 : arg0.anInt4928;
		@Pc(21) int local21 = arg0.anInt4990 == 0 ? arg0.anInt4935 : arg0.anInt4990;
		Static99.method1592(Static313.aClass163ArrayArray1[arg0.anInt4947 >> 16], arg0.anInt4947, arg1, local12, local21);
		if (arg0.aClass163Array3 != null) {
			Static99.method1592(arg0.aClass163Array3, arg0.anInt4947, arg1, local12, local21);
		}
		@Pc(56) Class1_Sub26 local56 = (Class1_Sub26) Static298.aClass207_35.method5555((long) arg0.anInt4947);
		if (local56 != null) {
			Static37.method780(arg1, local21, local12, local56.anInt3825);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILclient!lm;I)Lclient!wp;")
	public static Class219 method2690(@OriginalArg(1) int arg0, @OriginalArg(2) Class134 arg1) {
		@Pc(9) byte[] local9 = arg1.method3009(0, arg0);
		return local9 == null ? null : new Class219(local9);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLclient!ii;)V")
	public static void method2691(@OriginalArg(1) Class105 arg0) {
		@Pc(7) int local7 = Static298.anInt6013;
		@Pc(9) int local9 = Static148.anInt3051;
		@Pc(11) int local11 = Static228.anInt4754;
		@Pc(13) int local13 = Static145.anInt3038;
		arg0.method4225(local13, -10660793, local11, local7, local9);
		arg0.method4225(16, -16777216, local11 - 2, local7 - -1, local9 + 1);
		arg0.method4293(local13 - 19, local7 + 1, local11 - 2, -16777216, local9 + 18);
		Static286.aClass29_3.method3742(local9 + 14, -1, -10660793, Static148.aString111, local7 + 3);
		@Pc(74) int local74 = Static208.anInt4358;
		@Pc(76) int local76 = Static28.anInt538;
		@Pc(78) int local78 = 0;
		for (@Pc(83) Class1_Sub12 local83 = (Class1_Sub12) Static58.aClass14_4.method302(); local83 != null; local83 = (Class1_Sub12) Static58.aClass14_4.method313()) {
			@Pc(99) int local99 = local9 + (Static61.anInt1413 - local78 - 1) * 16 + 31;
			@Pc(101) short local101 = -1;
			if (local74 > local7 && local74 < local11 + local7 && local76 > local99 - 13 && local99 + 3 > local76) {
				local101 = -256;
			}
			@Pc(127) int[] local127 = null;
			if (Static186.method3282(local83.anInt1409)) {
				local127 = Static348.method5333((int) local83.aLong30).anIntArray251;
			} else if (Static332.method5557(local83.anInt1409)) {
				@Pc(174) Class10_Sub1_Sub2_Sub1 local174 = Static178.aClass10_Sub1_Sub2_Sub1Array1[(int) local83.aLong30];
				if (local174 != null) {
					local127 = local174.aClass60_1.anIntArray111;
				}
			} else if (Static41.method885(local83.anInt1409)) {
				if (local83.anInt1409 == 1008) {
					local127 = Static129.method2097((int) local83.aLong30).anIntArray158;
				} else {
					local127 = Static129.method2097((int) (local83.aLong30 >>> 32 & 0x7FFFFFFFL)).anIntArray158;
				}
			}
			@Pc(192) String local192 = Static44.method910(local83);
			if (local127 != null) {
				local192 = local192 + Static57.method1117(local127);
			}
			Static286.aClass29_3.method3754(local101, local7 + 3, local99, Static76.anIntArray117, local192, Static67.aClass8Array4, 0);
			local78++;
		}
		Static149.method2617(Static145.anInt3038, Static298.anInt6013, Static148.anInt3051, Static228.anInt4754);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!ii;)V")
	public static void method2692(@OriginalArg(1) Class105 arg0) {
		if (Static44.aClass14_3.method309() == 0) {
			return;
		}
		@Pc(22) Class1_Sub32 local22;
		if (Static24.anInt437 == 0 || Static24.anInt437 == 2) {
			for (local22 = (Class1_Sub32) Static44.aClass14_3.method302(); local22 != null; local22 = (Class1_Sub32) Static44.aClass14_3.method313()) {
				Static168.method2927(local22.anInt4551, local22.anInt4549, arg0, local22.anInt4542, Static294.aClass29_4, local22.aBoolean362 ? Static127.aClass10_Sub1_Sub2_Sub2_1.aClass136_1 : null, arg0, false, false, local22.anInt4543, local22.anInt4555);
				local22.method5796();
			}
			Static74.method1295();
			return;
		}
		if (Static88.aClass105_6 == null) {
			@Pc(71) Canvas local71 = new Canvas();
			local71.setSize(36, 32);
			Static88.aClass105_6 = Static130.method4247(local71, Static71.anInterface2_1, Static197.aClass215_5, 0, 0);
			Static54.aClass29_1 = Static88.aClass105_6.method4264(Static140.method2320(Static142.anInt2786, Static77.aClass134_33), Static369.method5470(Static125.aClass134_55, Static142.anInt2786));
		}
		for (local22 = (Class1_Sub32) Static44.aClass14_3.method302(); local22 != null; local22 = (Class1_Sub32) Static44.aClass14_3.method313()) {
			Static168.method2927(local22.anInt4551, local22.anInt4549, arg0, local22.anInt4542, Static54.aClass29_1, local22.aBoolean362 ? Static127.aClass10_Sub1_Sub2_Sub2_1.aClass136_1 : null, Static88.aClass105_6, false, false, local22.anInt4543, local22.anInt4555);
			local22.method5796();
		}
	}
}
