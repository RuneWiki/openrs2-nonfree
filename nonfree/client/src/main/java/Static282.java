import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!nq", name = "ob", descriptor = "[Lclient!gp;")
	public static Class91[] aClass91Array1;

	@OriginalMember(owner = "client!nq", name = "Q", descriptor = "[I")
	public static final int[] anIntArray317 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "(B)I")
	public static int method3967() {
		if (Static52.aFrame1 == null) {
			return Static235.aBoolean295 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)I")
	public static int method3970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg0 >>> 24;
		@Pc(33) int local33 = ((arg0 & 0xFF00) * local15 & 0xFF0000 | local15 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(38) int local38 = 255 - local15;
		return local33 + ((local38 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local38 * (arg1 & 0xFF00) & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!mk;Lclient!fb;Lclient!qa;ILclient!gw;II)V")
	public static void method3979(@OriginalArg(0) int arg0, @OriginalArg(1) Class152 arg1, @OriginalArg(2) Class3_Sub16 arg2, @OriginalArg(3) Class167 arg3, @OriginalArg(5) Class93 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = arg2.anInt1899 - arg6 / 2 - 5;
		@Pc(31) int local31 = arg5 + 2;
		if (arg1.anInt4319 != 0) {
			arg3.method5951(arg5 + arg4.method2211() * arg0 + 1 - local31, local31, arg1.anInt4319, local15, arg6 + 10);
		}
		if (arg1.anInt4329 != 0) {
			arg3.method6016(local15, arg0 * arg4.method2211() + arg5 + 1 - local31, arg1.anInt4329, arg6 + 10, local31);
		}
		@Pc(88) int local88 = arg1.anInt4336;
		if (arg2.aBoolean115 && arg1.anInt4325 != -1) {
			local88 = arg1.anInt4325;
		}
		for (@Pc(100) int local100 = 0; local100 < arg0; local100++) {
			@Pc(106) String local106 = Static178.aStringArray17[local100];
			if (local100 < arg0 - 1) {
				local106 = local106.substring(0, local106.length() - 4);
			}
			arg4.method2214(arg3, local106, arg2.anInt1899, arg5, local88);
			arg5 += arg4.method2211();
		}
	}

	@OriginalMember(owner = "client!nq", name = "n", descriptor = "(I)V")
	public static void method3996() {
		Static326.aClass250_81.anInt7168 = 1;
		Static214.method3198();
		Static82.aBoolean99 = true;
		Static58.aBoolean72 = true;
		Static245.method3514();
		for (@Pc(5650) int local5650 = 0; local5650 < Static138.aClass36Array1.length; local5650++) {
			Static138.aClass36Array1[local5650] = null;
		}
		Static73.aBoolean88 = false;
		Static29.method4780();
		Static197.anInt3551 = (int) (Math.random() * 30.0D) - 20;
		Static310.anInt5306 = (int) (Math.random() * 80.0D) - 40;
		Static19.aFloat6 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static139.anInt2475 = (int) (Math.random() * 120.0D) - 60;
		Static353.anInt7448 = (int) (Math.random() * 110.0D) - 55;
		Static193.anInt3509 = (int) (Math.random() * 100.0D) - 50;
		Static287.method5414();
		for (@Pc(5723) int local5723 = 0; local5723 < 2048; local5723++) {
			Static216.aClass1_Sub2_Sub6_Sub2Array1[local5723] = null;
		}
		Static379.anInt6398 = 0;
		Static76.anInt1390 = 0;
		Static63.aClass140_37.method3488();
		client.lb.method4524();
		Static236.aClass193_34.method4524();
		Static125.aClass194_3.method4583();
		Static242.aClass140_26.method3488();
		Static305.aClass193_49 = new Class193();
		Static119.aClass47_1.method1272();
		Static181.method4210();
		Static199.anInt3573 = 0;
		Static136.anInt2402 = 0;
		Static317.anInt5360 = 0;
		Static330.anInt5523 = 0;
		Static83.anInt1536 = 0;
		Static416.anInt6989 = 0;
		Static443.anInt7442 = 0;
		Static359.anInt6118 = 0;
		Static87.anInt1583 = 0;
		Static218.anInt7513 = 0;
		for (@Pc(5785) int local5785 = 0; local5785 < Static59.anIntArray56.length; local5785++) {
			if (!Static322.aBooleanArray19[local5785]) {
				Static59.anIntArray56[local5785] = -1;
			}
		}
		if (Static343.anInt5785 != -1) {
			Static292.method4190(Static343.anInt5785);
		}
		for (@Pc(5815) Class3_Sub10 local5815 = (Class3_Sub10) Static32.aClass140_5.method3486(); local5815 != null; local5815 = (Class3_Sub10) Static32.aClass140_5.method3485()) {
			if (!local5815.method6287()) {
				local5815 = (Class3_Sub10) Static32.aClass140_5.method3486();
				if (local5815 == null) {
					break;
				}
			}
			Static87.method1538(local5815, false, true);
		}
		Static343.anInt5785 = -1;
		Static32.aClass140_5 = new Class140(8);
		Static247.method5474();
		Static444.aClass82_23 = null;
		for (@Pc(5855) int local5855 = 0; local5855 < 8; local5855++) {
			Static100.aStringArray11[local5855] = null;
			Static142.aBooleanArray10[local5855] = false;
			Static314.anIntArray336[local5855] = -1;
		}
		Static346.method4834();
		Static64.aBoolean83 = true;
		for (@Pc(5881) int local5881 = 0; local5881 < 100; local5881++) {
			Static391.aBooleanArray22[local5881] = true;
		}
		for (@Pc(5893) int local5893 = 0; local5893 < 6; local5893++) {
			Static295.aClass161Array1[local5893] = new Class161();
		}
		for (@Pc(5907) int local5907 = 0; local5907 < 25; local5907++) {
			Static226.anIntArray443[local5907] = 0;
			Static95.anIntArray80[local5907] = 0;
			Static400.anIntArray418[local5907] = 0;
		}
		Static106.method4449();
		Static179.aBoolean252 = true;
		Static207.aShortArray48 = Static406.aShortArray112 = Static67.aShortArray16 = Static7.aShortArray31 = new short[256];
		Static225.aString47 = Static310.aClass174_151.method4208(Static300.anInt5192);
		Static39.aClass79_Sub1_1.aBoolean163 = false;
		Static179.anInt3324 = 0;
		Static39.aClass79_Sub1_1.aBoolean164 = false;
		Static81.method1462();
		Static162.method2549();
		Static76.aLong53 = 0L;
		Static39.aClass3_Sub23_1 = null;
		Static326.aClass250_81.anInt7168 = 2;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "([S[Ljava/lang/String;III)V")
	public static void method4009(@OriginalArg(0) short[] arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg3) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) String local20 = arg1[local14];
		arg1[local14] = arg1[arg2];
		arg1[arg2] = local20;
		@Pc(34) short local34 = arg0[local14];
		arg0[local14] = arg0[arg2];
		arg0[arg2] = local34;
		for (@Pc(46) int local46 = arg3; local46 < arg2; local46++) {
			if (local20 == null || arg1[local46] != null && (local46 & 0x1) > arg1[local46].compareTo(local20)) {
				@Pc(67) String local67 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16] = local67;
				@Pc(81) short local81 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local81;
			}
		}
		arg1[arg2] = arg1[local16];
		arg1[local16] = local20;
		arg0[arg2] = arg0[local16];
		arg0[local16] = local34;
		method4009(arg0, arg1, local16 - 1, arg3);
		method4009(arg0, arg1, arg2, local16 + 1);
	}
}
