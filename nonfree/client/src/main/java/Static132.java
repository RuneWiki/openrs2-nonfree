import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!in", name = "a", descriptor = "I")
	public static int anInt6772;

	@OriginalMember(owner = "client!in", name = "b", descriptor = "I")
	public static int anInt6773;

	@OriginalMember(owner = "client!in", name = "c", descriptor = "Lclient!lm;")
	public static Class134 aClass134_153;

	@OriginalMember(owner = "client!in", name = "f", descriptor = "I")
	public static int anInt6775;

	@OriginalMember(owner = "client!in", name = "d", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray7 = new Rectangle[100];

	@OriginalMember(owner = "client!in", name = "e", descriptor = "I")
	public static int anInt6774 = 0;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BLclient!ii;)V")
	public static void method5857(@OriginalArg(1) Class105 arg0) {
		if (Static61.anInt1413 < 2 && Static254.anInt5233 == 0 && !Static265.aBoolean456) {
			return;
		}
		@Pc(50) String local50;
		if (Static254.anInt5233 == 1 && Static61.anInt1413 < 2) {
			local50 = Static319.aString120 + Static204.aString276 + Static142.aString102 + " ->";
		} else if (Static265.aBoolean456 && Static61.anInt1413 < 2) {
			local50 = Static238.aString191 + Static204.aString276 + Static49.aString203 + " ->";
		} else if (Static290.aBoolean485 && Static112.aBooleanArray11[81] && Static61.anInt1413 > 2) {
			local50 = Static44.method910((Class1_Sub12) Static58.aClass14_4.aClass1_17.aClass1_248.aClass1_248);
		} else {
			@Pc(57) Class1_Sub12 local57 = (Class1_Sub12) Static58.aClass14_4.aClass1_17.aClass1_248;
			local50 = Static44.method910(local57);
			@Pc(63) int[] local63 = null;
			if (Static186.method3282(local57.anInt1409)) {
				local63 = Static348.method5333((int) local57.aLong30).anIntArray251;
			} else if (Static332.method5557(local57.anInt1409)) {
				@Pc(110) Class10_Sub1_Sub2_Sub1 local110 = Static178.aClass10_Sub1_Sub2_Sub1Array1[(int) local57.aLong30];
				if (local110 != null) {
					local63 = local110.aClass60_1.anIntArray111;
				}
			} else if (Static41.method885(local57.anInt1409)) {
				if (local57.anInt1409 == 1008) {
					local63 = Static129.method2097((int) local57.aLong30).anIntArray158;
				} else {
					local63 = Static129.method2097((int) (local57.aLong30 >>> 32 & 0x7FFFFFFFL)).anIntArray158;
				}
			}
			if (local63 != null) {
				local50 = local50 + Static57.method1117(local63);
			}
		}
		if (Static61.anInt1413 > 2) {
			local50 = local50 + "<col=ffffff> / " + (Static61.anInt1413 - 2) + Static221.aString177;
		}
		if (Static284.aClass163_18 != null) {
			@Pc(197) Class29 local197 = Static284.aClass163_18.method4342(arg0);
			if (local197 == null) {
				local197 = Static286.aClass29_3;
			}
			local197.method3759(Static67.aClass8Array4, Static272.anInt5035, Static76.anIntArray117, Static137.anInt5688, Static284.aClass163_18.anInt4948, local50, Static284.aClass163_18.anInt4942, Static284.aClass163_18.anInt4991, Static100.aRandom1, Static284.aClass163_18.anInt4968, Static116.anInt2236, Static284.aClass163_18.anInt4935, Static284.aClass163_18.anInt5001, Static355.anIntArray680);
			Static177.method3159(Static355.anIntArray680[0], Static355.anIntArray680[3], Static355.anIntArray680[1], Static355.anIntArray680[2]);
		} else if (Static215.aClass163_13 != null && Class10_Sub1_Sub1.lb == 0) {
			@Pc(266) int local266 = Static286.aClass29_3.method3758(Static272.anInt5035, Static152.anInt3124 + 4, Static100.aRandom1, Static67.aClass8Array4, local50, Static76.anIntArray117, Static208.anInt4363 + 16);
			Static177.method3159(Static152.anInt3124 + 4, 16, Static208.anInt4363, local266 + Static81.aClass34_4.method796(local50));
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIII)V")
	public static void method5859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static174.anInt5776 = arg0;
		Static266.anInt5482 = arg3;
		Static324.anInt6407 = arg4;
		Static275.anInt5626 = arg1;
		Static63.anInt2655 = arg2;
		if (Static324.anInt6407 >= 100) {
			@Pc(28) int local28 = Static63.anInt2655 * 128 + 64;
			@Pc(34) int local34 = Static266.anInt5482 * 128 + 64;
			@Pc(43) int local43 = Static352.method5834(local34, local28, Static127.anInt2487) - Static174.anInt5776;
			@Pc(48) int local48 = local28 - Static4.anInt41;
			@Pc(53) int local53 = local43 - Static117.anInt2244;
			@Pc(58) int local58 = local34 - Static177.anInt3734;
			@Pc(69) int local69 = (int) Math.sqrt((double) (local58 * local58 + local48 * local48));
			Static338.anInt6530 = (int) (Math.atan2((double) local53, (double) local69) * 2607.5945876176133D) & 0x3FFF;
			Static296.anInt5982 = (int) (-2607.5945876176133D * Math.atan2((double) local48, (double) local58)) & 0x3FFF;
			if (Static338.anInt6530 < 1024) {
				Static338.anInt6530 = 1024;
			}
			if (Static338.anInt6530 > 3072) {
				Static338.anInt6530 = 3072;
			}
		}
		Static246.anInt5156 = 2;
	}
}
