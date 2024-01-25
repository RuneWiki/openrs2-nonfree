import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!vl", name = "X", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!vl", name = "db", descriptor = "I")
	public static int anInt6239;

	@OriginalMember(owner = "client!vl", name = "S", descriptor = "Lclient!wk;")
	public static final Class246 aClass246_32 = new Class246(16);

	@OriginalMember(owner = "client!vl", name = "Y", descriptor = "Lclient!vb;")
	public static final Class193 aClass193_1 = Static241.method3902();

	@OriginalMember(owner = "client!vl", name = "bb", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_90 = new Class11(81, 2);

	@OriginalMember(owner = "client!vl", name = "cb", descriptor = "Z")
	public static boolean aBoolean440 = false;

	@OriginalMember(owner = "client!vl", name = "eb", descriptor = "[I")
	public static final int[] anIntArray1313 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!vl", name = "h", descriptor = "(I)Lclient!fl;")
	public static Class2_Sub10_Sub8 method5420() {
		return Static338.aClass2_Sub10_Sub8_3;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!rs;ZLclient!rs;)V")
	public static void method5421(@OriginalArg(0) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_244 != null) {
			arg1.method5617();
		}
		arg1.aClass2_243 = arg0;
		arg1.aClass2_244 = arg0.aClass2_244;
		arg1.aClass2_244.aClass2_243 = arg1;
		arg1.aClass2_243.aClass2_244 = arg1;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIILclient!tq;Lclient!vc;)V")
	public static void method5422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface9 arg4, @OriginalArg(6) Class63 arg5) {
		if (Static309.anInt5191 < 100) {
			Static103.method2174(arg5, arg4);
		}
		arg5.method1958(arg2, arg0, arg2 + arg3, arg0 - -arg1);
		@Pc(34) int local34;
		@Pc(52) int local52;
		if (Static309.anInt5191 < 100) {
			local34 = arg3 / 2 + arg2;
			arg5.method1982(arg2, arg0, arg3, arg1, -16777216, 0);
			local52 = arg1 / 2 + arg0 - 18 - 20;
			arg5.method1955(local34 - 152, local52, 304, 34, Static282.aColorArray3[Static34.anInt731].getRGB(), 0);
			arg5.method1982(local34 - 150, local52 + 2, Static309.anInt5191 * 3, 30, Static255.aColorArray2[Static34.anInt731].getRGB(), 0);
			Static340.aClass9_4.method5054(Static188.aClass32_47.method701(Static107.anInt2498), Static202.aColorArray1[Static34.anInt731].getRGB(), -1, local52 + 20, local34);
			return;
		}
		@Pc(110) int local110 = Static82.anInt1484 - (int) ((float) arg3 / Static338.aFloat53);
		local34 = Static308.anInt5181 + (int) ((float) arg1 / Static338.aFloat53);
		local52 = (int) ((float) arg3 / Static338.aFloat53) + Static82.anInt1484;
		Static182.anInt3875 = Static308.anInt5181 - (int) ((float) arg1 / Static338.aFloat53);
		Static68.anInt1325 = (int) ((float) (arg3 * 2) / Static338.aFloat53);
		Static288.anInt5009 = Static82.anInt1484 - (int) ((float) arg3 / Static338.aFloat53);
		@Pc(160) int local160 = Static308.anInt5181 - (int) ((float) arg1 / Static338.aFloat53);
		Static17.anInt397 = (int) ((float) (arg1 * 2) / Static338.aFloat53);
		Static338.method3039(local110 + Static338.anInt3305, Static338.anInt3307 + local34, local52 + Static338.anInt3305, Static338.anInt3307 + local160, arg2, arg0, arg2 + arg3, arg1 + 1 + arg0);
		Static338.method3051(arg5);
		@Pc(197) Class30 local197 = Static338.method3052(arg5);
		Static84.method1288(local197, arg5);
		if (Static121.anInt2597 > 0) {
			Static33.anInt699--;
			if (Static33.anInt699 == 0) {
				Static121.anInt2597--;
				Static33.anInt699 = 20;
			}
		}
		if (!Static379.aBoolean456) {
			return;
		}
		@Pc(231) int local231 = arg2 + arg3 - 5;
		@Pc(237) int local237 = arg1 + arg0 - 8;
		Static319.aClass9_3.method5049(local231, local237, "Fps:" + Static70.anInt1250, 16776960);
		@Pc(252) int local252 = local237 - 15;
		@Pc(254) Runtime local254 = Runtime.getRuntime();
		@Pc(264) int local264 = (int) ((local254.totalMemory() - local254.freeMemory()) / 1024L);
		@Pc(266) int local266 = 16776960;
		if (local264 > 65536) {
			local266 = 16711680;
		}
		Static319.aClass9_3.method5049(local231, local252, "Mem:" + local264 + "k", local266);
		local237 = local252 - 15;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!fo;)I")
	public static int method5423(@OriginalArg(1) Class1_Sub5_Sub1 arg0) {
		if (arg0.anInt6435 == 0) {
			return 0;
		}
		@Pc(51) int local51;
		@Pc(57) int local57;
		if (arg0.anInt6410 != -1) {
			@Pc(19) Class1_Sub5_Sub1 local19 = null;
			if (arg0.anInt6410 < 32768) {
				local19 = Static299.aClass1_Sub5_Sub1_Sub2Array1[arg0.anInt6410];
			} else if (arg0.anInt6410 >= 32768) {
				local19 = Static125.aClass1_Sub5_Sub1_Sub1Array1[arg0.anInt6410 - 32768];
			}
			if (local19 != null) {
				local51 = arg0.anInt6390 - local19.anInt6390;
				local57 = arg0.anInt6386 - local19.anInt6386;
				if (local51 != 0 || local57 != 0) {
					arg0.method5554((int) (Math.atan2((double) local51, (double) local57) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class1_Sub5_Sub1_Sub1) {
			@Pc(151) Class1_Sub5_Sub1_Sub1 local151 = (Class1_Sub5_Sub1_Sub1) arg0;
			if (local151.anInt2280 != -1 && (local151.anInt6456 == 0 || local151.anInt6454 > 0)) {
				local151.method5554(local151.anInt2280);
				local151.anInt2280 = -1;
			}
		} else if (arg0 instanceof Class1_Sub5_Sub1_Sub2) {
			@Pc(83) Class1_Sub5_Sub1_Sub2 local83 = (Class1_Sub5_Sub1_Sub2) arg0;
			if (local83.anInt6459 != -1 && (local83.anInt6456 == 0 || local83.anInt6454 > 0)) {
				local51 = local83.anInt6390 - (local83.anInt6459 - Static28.anInt606 - Static28.anInt606) * 64;
				local57 = local83.anInt6386 - (local83.anInt6475 - Static319.anInt5425 - Static319.anInt5425) * 64;
				if (local51 != 0 || local57 != 0) {
					local83.method5554((int) (Math.atan2((double) local51, (double) local57) * 2607.5945876176133D) & 0x3FFF);
				}
				local83.anInt6459 = -1;
			}
		}
		return arg0.method5556();
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)V")
	public static void method5425() {
		for (@Pc(10) Class2_Sub43 local10 = (Class2_Sub43) Static370.aClass30_43.method694(); local10 != null; local10 = (Class2_Sub43) Static370.aClass30_43.method682()) {
			if (local10.anInt6042 == -1) {
				local10.anInt6036 = 0;
				Static44.method736(local10);
			} else {
				local10.method5617();
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)I")
	public static int method5426(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 ^ local9 << 13;
		@Pc(34) int local34 = (local15 * local15 * 15731 + 789221) * local15 + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}
}
