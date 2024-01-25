import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
	public static int anInt1176;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_37 = new Class56(69, 4);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIBI)I")
	public static int method999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(13) int local13 = arg1 - 1 & arg0;
		@Pc(17) int local17 = arg2 / arg1;
		@Pc(23) int local23 = arg1 - 1 & arg2;
		@Pc(30) int local30 = Static267.method4085(local17, local7);
		@Pc(37) int local37 = Static267.method4085(local17, local7 + 1);
		@Pc(49) int local49 = Static267.method4085(local17 + 1, local7);
		@Pc(58) int local58 = Static267.method4085(local17 + 1, local7 + 1);
		@Pc(65) int local65 = Static211.method3414(local13, local30, arg1, local37);
		@Pc(72) int local72 = Static211.method3414(local13, local49, arg1, local58);
		return Static211.method3414(local23, local65, arg1, local72);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(JLjava/lang/String;ZI)V")
	public static void method1001(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		if (arg2) {
			Static214.method3432();
			if (Static501.aString78.equals("")) {
				Static479.anInt8303 = 39;
				return;
			}
		}
		@Pc(19) Class3_Sub11 local19 = new Class3_Sub11(576);
		local19.method5213(10);
		local19.method5200((int) (Math.random() * 65535.0D));
		local19.method5225(arg0);
		local19.method5200(arg2 ? Static357.anInt6226 : Static535.anInt8570);
		local19.method5227(arg1);
		local19.method5225(arg2 ? Static589.aLong274 : Static149.aLong80);
		if (arg2) {
			local19.method5225(Static554.method7335(Static501.aString78));
			try {
				local19.method5225(Long.parseLong(Static423.aString64));
			} catch (@Pc(99) Exception local99) {
				Static479.anInt8303 = 39;
				return;
			}
		} else {
			local19.method5215((int) (Math.random() * 9.9999999E7D));
			local19.method5215((int) (Math.random() * 9.9999999E7D));
			local19.method5215((int) (Math.random() * 9.9999999E7D));
			local19.method5215((int) (Math.random() * 9.9999999E7D));
		}
		local19.method5215((int) (Math.random() * 9.9999999E7D));
		local19.method5189(Static134.aBigInteger1, Static384.aBigInteger2);
		@Pc(117) Class3_Sub42 local117 = Static366.method5366();
		local117.aClass3_Sub11_Sub1_1.method5213(arg2 ? Static546.aClass224_12.anInt6213 : Static546.aClass224_9.anInt6213);
		@Pc(130) int local130 = 1;
		if (Static286.aString34 != null) {
			local130 = Static286.aString34.length() + 1 + 1;
		}
		local117.aClass3_Sub11_Sub1_1.method5200(local19.anInt6128 + local130 + 28);
		local117.aClass3_Sub11_Sub1_1.method5200(622);
		local117.aClass3_Sub11_Sub1_1.method5213(Static256.anInt4535);
		local117.aClass3_Sub11_Sub1_1.method5213(Static121.aClass274_1.anInt7264);
		Static514.method6920(local117.aClass3_Sub11_Sub1_1);
		@Pc(176) String local176 = arg2 ? Static326.aString39 : Static286.aString34;
		local117.aClass3_Sub11_Sub1_1.method5213(local176 == null ? 0 : 1);
		if (local176 != null) {
			local117.aClass3_Sub11_Sub1_1.method5227(local176);
		}
		local117.aClass3_Sub11_Sub1_1.method5184(local19.aByteArray62, local19.anInt6128);
		Static511.method6885(local117);
		Static230.anInt4042 = 0;
		Static126.anInt2887 = 1;
		Static300.anInt5105 = 0;
		Static479.anInt8303 = -3;
	}
}
