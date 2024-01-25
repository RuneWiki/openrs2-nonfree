import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "Lclient!fn;")
	public static Class2_Sub3_Sub2 aClass2_Sub3_Sub2_5;

	@OriginalMember(owner = "client!sh", name = "n", descriptor = "F")
	public static float aFloat203;

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "[Lclient!caa;")
	public static Class12_Sub2[] aClass12_Sub2Array2;

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "Lclient!vea;")
	public static final Class347 aClass347_10 = new Class347();

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V")
	public static void method6256(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static532.anInt8757 - Static285.anInt2210;
		if (local8 >= 100) {
			Static489.anInt7763 = 1;
			Static203.anInt2978 = -1;
			Static148.anInt2359 = -1;
			return;
		}
		@Pc(23) int local23 = (int) Static541.aFloat128;
		if (local23 < Static542.anInt6417 >> 8) {
			local23 = Static542.anInt6417 >> 8;
		}
		if (Static416.aBooleanArray7[4] && Static464.anIntArray498[4] + 128 > local23) {
			local23 = Static464.anIntArray498[4] + 128;
		}
		@Pc(57) int local57 = (int) Static313.aFloat157 + Static83.anInt1438 & 0x3FFF;
		Static413.method5562((local23 >> 3) * 3 + 600 << 2, Static47.anInt873, Static14.anInt328, arg0, local57, local23, Static24.method347(Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9375, Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9374, Static402.anInt6620) - 200);
		@Pc(109) float local109 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static285.anInt2206 = (int) ((float) Static272.anInt4717 + (float) (Static285.anInt2206 - Static272.anInt4717) * local109);
		Static469.anInt7519 = (int) ((float) Static360.anInt6111 + local109 * (float) (Static469.anInt7519 - Static360.anInt6111));
		Static151.anInt2436 = (int) ((float) Static427.anInt6931 + local109 * (float) (Static151.anInt2436 - Static427.anInt6931));
		Static396.anInt6527 = (int) ((float) Static215.anInt3119 + (float) (Static396.anInt6527 - Static215.anInt3119) * local109);
		@Pc(162) int local162 = Static584.anInt9487 - Static415.anInt1625;
		if (local162 > 8192) {
			local162 -= 16384;
		} else if (local162 < -8192) {
			local162 += 16384;
		}
		Static584.anInt9487 = (int) ((float) Static415.anInt1625 + local109 * (float) local162);
		Static584.anInt9487 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
	public static void method6257() {
		if (Static138.anInt2261 != -1) {
			Static160.method2138(-1, Static138.anInt2261, false, -1);
			Static138.anInt2261 = -1;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!fa;Ljava/awt/Canvas;ILclient!mv;)Lclient!r;")
	public static Class162 method6258(@OriginalArg(0) int arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(4) Class229 arg3) {
		if (!Static463.method5982()) {
			throw new RuntimeException("");
		} else if (Static560.method7324("jaggl")) {
			@Pc(29) OpenGL local29 = new OpenGL();
			@Pc(39) long local39 = local29.init(arg2, 8, 8, 8, 24, 0, arg0);
			if (local39 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(58) Class162_Sub1_Sub2 local58 = new Class162_Sub1_Sub2(local29, arg2, local39, arg1, arg3, arg0);
			local58.method3864();
			return local58;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(CZ)Z")
	public static boolean method6259(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
