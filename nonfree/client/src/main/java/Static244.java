import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!jt", name = "o", descriptor = "Z")
	public static boolean aBoolean262 = false;

	@OriginalMember(owner = "client!jt", name = "r", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_98 = new Class40(22, 20);

	@OriginalMember(owner = "client!jt", name = "t", descriptor = "Z")
	public static boolean aBoolean263 = true;

	@OriginalMember(owner = "client!jt", name = "u", descriptor = "Lclient!cb;")
	public static Class40 aClass40_99 = null;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)V")
	public static void method3520() {
		Static466.aClass251_130 = null;
		Static396.aBoolean490 = false;
		Static259.anInt4237 = -1;
		Static140.anInt2527 = 1;
		Static221.anInt3764 = 2;
		Static74.anInt1223 = -1;
		Static192.anInt3325 = 0;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IZ)Z")
	public static boolean method3522(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILjava/awt/Canvas;ILclient!e;Lclient!pq;)Lclient!oa;")
	public static Class121 method3523(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) Interface7 arg2, @OriginalArg(4) Class251 arg3) {
		if (!Static80.method1296()) {
			throw new RuntimeException("");
		} else if (Static69.method889("jaggl")) {
			@Pc(24) OpenGL local24 = new OpenGL();
			@Pc(34) long local34 = local24.init(arg1, 8, 8, 8, 24, 0, arg0);
			if (local34 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(58) Class121_Sub2_Sub1 local58 = new Class121_Sub2_Sub1(local24, arg1, local34, arg2, arg3, arg0);
			local58.method7196();
			return local58;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(Z)V")
	public static void method3524() {
		Static451.aClass327_5.method7413();
		Static261.aClass318_1.method7324();
		Static78.aClass344_1.method7787();
		Static260.aClass100_1.method2004();
		Static51.aClass202_1.method4898();
		Static295.aClass256_2.method5927();
		Static31.aClass345_1.method7799();
		Static448.aClass117_2.method2323();
		Static386.aClass91_1.method1857();
		Static333.aClass187_1.method4088();
		Static492.aClass189_1.method4114();
		Static32.aClass245_1.method5767();
		Static474.aClass276_4.method6399();
		Static322.aClass180_1.method3992();
		Static112.aClass307_1.method6813();
		Static316.aClass141_1.method3013();
		Static264.aClass124_1.method2627();
		Static266.aClass294_1.method6539();
		Static247.aClass33_2.method597();
		Static442.aClass337_1.method7579();
		Static140.method2140();
		Static103.method7803();
		Static109.method7600();
		if (Static192.aClass287_3 != Static376.aClass287_6) {
			for (@Pc(76) int local76 = 0; local76 < Static101.aByteArrayArray5.length; local76++) {
				Static101.aByteArrayArray5[local76] = null;
			}
			Static323.anInt5818 = 0;
		}
		Static332.method5089();
		Static534.method7439();
		Static338.method5125();
		Static306.method4767();
		Static317.method4927();
		Static100.aClass332_50.method7510();
		Static176.aClass121_5.method7155();
		Static523.aClass284_4.method6448();
		Static564.method7711();
		Static361.aClass251_104.method5833();
		Static196.aClass251_67.method5833();
		Static28.aClass251_7.method5833();
		Static19.aClass251_62.method5833();
		Static527.aClass251_147.method5833();
		Static285.aClass251_84.method5833();
		Static375.aClass251_107.method5833();
		Static251.aClass251_88.method5833();
		Static447.aClass251_141.method5833();
		Static219.aClass251_71.method5833();
		Static131.aClass251_46.method5833();
		Static168.aClass251_60.method5833();
		Static58.aClass251_21.method5833();
		Static492.aClass251_136.method5833();
		Static509.aClass251_142.method5833();
		Static63.aClass251_23.method5833();
		Static543.aClass251_151.method5833();
		Static45.aClass251_17.method5833();
		Static529.aClass251_148.method5833();
		Static543.aClass251_150.method5833();
		Static505.aClass251_138.method5833();
		Static310.aClass251_94.method5833();
		Static9.aClass251_1.method5833();
		Static30.aClass251_82.method5833();
		Static228.aClass251_74.method5833();
		Static36.aClass251_12.method5833();
		Static79.aClass251_26.method5833();
		Static145.aClass251_50.method5833();
		Static118.aClass251_40.method5833();
		Static126.aClass251_44.method5833();
		Static266.aClass251_77.method5833();
		Static509.aClass251_143.method5833();
		Static574.aClass332_152.method7510();
		Static292.aClass332_123.method7510();
		Static306.aClass332_129.method7510();
		Static377.aClass332_157.method7510();
	}
}
