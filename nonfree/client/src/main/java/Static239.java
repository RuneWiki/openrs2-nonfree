import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!jba", name = "q", descriptor = "J")
	public static long aLong103 = 0L;

	@OriginalMember(owner = "client!jba", name = "r", descriptor = "[Lclient!pi;")
	public static final Class11_Sub1_Sub1_Sub2[] aClass11_Sub1_Sub1_Sub2Array1 = new Class11_Sub1_Sub1_Sub2[2048];

	@OriginalMember(owner = "client!jba", name = "x", descriptor = "I")
	public static int anInt4899 = 0;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILclient!fp;)V")
	public static void method4217(@OriginalArg(1) Class11_Sub1_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt7391 - Static508.anInt8998;
		@Pc(25) int local25 = arg0.anInt7372 * 512 + arg0.method6212() * 256;
		@Pc(36) int local36 = arg0.anInt7367 * 512 + arg0.method6212() * 256;
		arg0.anInt7351 += (local36 - arg0.anInt7351) / local9;
		arg0.anInt7347 += (local25 - arg0.anInt7347) / local9;
		arg0.anInt7433 = 0;
		if (arg0.anInt7431 == 0) {
			arg0.method6213(8192);
		}
		if (arg0.anInt7431 == 1) {
			arg0.method6213(12288);
		}
		if (arg0.anInt7431 == 2) {
			arg0.method6213(0);
		}
		if (arg0.anInt7431 == 3) {
			arg0.method6213(4096);
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method4218(@OriginalArg(1) Class9 arg0) {
		if (Static478.aClass211_69.method5174() == 0) {
			return;
		}
		@Pc(52) Class6_Sub36 local52;
		if (Static5.anInt145 == 0) {
			for (local52 = (Class6_Sub36) Static478.aClass211_69.method5183(); local52 != null; local52 = (Class6_Sub36) Static478.aClass211_69.method5177()) {
				Static98.aClass203_1.method4905(local52.anInt6769, local52.anInt6770, arg0, false, local52.anInt6768, local52.anInt6767, arg0, local52.anInt6771, Static467.aClass73_3, local52.aBoolean509 ? Static350.aClass11_Sub1_Sub1_Sub2_4.aClass67_1 : null, false);
				local52.method8151();
			}
			Static101.method2148();
			return;
		}
		if (Static126.aClass9_6 == null) {
			@Pc(22) Canvas local22 = new Canvas();
			local22.setSize(36, 32);
			Static126.aClass9_6 = Static359.method5440(Static107.aClass168_27, 0, local22, Static517.anInterface2_13, 0);
			Static468.aClass73_4 = Static126.aClass9_6.method5393(Static436.method6660(Static29.aClass168_15, Static129.anInt2834), Static583.method50(Static132.aClass168_118, Static129.anInt2834));
		}
		for (local52 = (Class6_Sub36) Static478.aClass211_69.method5183(); local52 != null; local52 = (Class6_Sub36) Static478.aClass211_69.method5177()) {
			Static98.aClass203_1.method4905(local52.anInt6769, local52.anInt6770, Static126.aClass9_6, false, local52.anInt6768, local52.anInt6767, arg0, local52.anInt6771, Static468.aClass73_4, local52.aBoolean509 ? Static350.aClass11_Sub1_Sub1_Sub2_4.aClass67_1 : null, false);
			local52.method8151();
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(BLclient!pi;)V")
	public static void method4219(@OriginalArg(1) Class11_Sub1_Sub1_Sub2 arg0) {
		@Pc(11) Class6_Sub2 local11 = (Class6_Sub2) Static580.aClass305_42.method7447((long) arg0.anInt7392);
		if (local11 == null) {
			return;
		}
		if (local11.aClass6_Sub10_Sub2_1 != null) {
			Static35.aClass6_Sub10_Sub3_1.method4742(local11.aClass6_Sub10_Sub2_1);
			local11.aClass6_Sub10_Sub2_1 = null;
		}
		local11.method8151();
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(BII)I")
	public static int method4221(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static38.anInt1214 == -1) {
			return 1;
		}
		if (Static5.anInt145 != arg0) {
			Static419.method6517(arg0);
			if (arg0 != Static5.anInt145) {
				return -1;
			}
		}
		try {
			@Pc(28) Dimension local28 = Static38.aCanvas4.getSize();
			Static526.method7658(Static222.aClass152_12.method4002(Static286.anInt5468), true, Static42.aClass73_1);
			@Pc(48) Class260 local48 = Static198.method3731(Static38.anInt1214, Static406.aClass168_127);
			@Pc(51) long local51 = Static174.method3502();
			Static323.aClass9_8.F();
			Static19.aClass8_2.GA(0, Static406.anInt9843, 0);
			Static323.aClass9_8.method5429(Static19.aClass8_2);
			Static323.aClass9_8.m(local28.width / 2, local28.height / 2, 512, 512);
			Static323.aClass9_8.ha(1.0F);
			Static323.aClass9_8.YA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(92) Class23 local92 = Static323.aClass9_8.method5404(local48, 2048, 64, 64, 768);
			@Pc(94) int local94 = 0;
			label41: for (@Pc(96) int local96 = 0; local96 < 500; local96++) {
				Static323.aClass9_8.D(0);
				Static323.aClass9_8.method5430();
				for (@Pc(105) int local105 = 15; local105 >= 0; local105--) {
					for (@Pc(109) int local109 = 0; local109 <= local105; local109++) {
						Static308.aClass8_7.GA((int) ((float) Static364.anInt7313 * ((float) local109 - (float) local105 / 2.0F)), 0, (local105 + 1) * Static364.anInt7313);
						local92.method7077(Static308.aClass8_7, null, 0);
						local94++;
						if (Static174.method3502() - local51 >= (long) arg1) {
							break label41;
						}
					}
				}
			}
			Static323.aClass9_8.method5420();
			@Pc(180) long local180 = (long) (local94 * 1000) / (Static174.method3502() - local51);
			Static323.aClass9_8.D(0);
			Static323.aClass9_8.method5430();
			return (int) local180;
		} catch (@Pc(189) Throwable local189) {
			local189.printStackTrace();
			return -1;
		}
	}
}
