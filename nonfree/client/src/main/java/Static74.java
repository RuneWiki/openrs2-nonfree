import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method1759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		Static221.anInt4220 = arg4;
		Static196.anInt3843 = arg1;
		Static637.anInt10169 = arg2;
		Static22.anInt921 = arg0;
		Static551.anInt9268 = arg3;
		if (arg5 && Static196.anInt3843 >= 100) {
			Static611.anInt9892 = Static221.anInt4220 * 512 + 256;
			Static20.anInt824 = Static22.anInt921 * 512 + 256;
			Static557.anInt9304 = Static192.method3263(Static20.anInt824, Static611.anInt9892, Static549.anInt9262) - Static637.anInt10169;
		}
		Static305.anInt5422 = 2;
		Static331.anInt6175 = -1;
		Static530.anInt9071 = -1;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)Lclient!lb;")
	public static Class198 method1762() {
		try {
			return (Class198) Class.forName("Class198_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V")
	public static void method1763() {
		Static56.anInt1566 = 0;
		@Pc(16) int local16 = Static299.anInt5307 + (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8916 >> 9);
		@Pc(24) int local24 = (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8911 >> 9) + Static171.anInt3340;
		if (local16 >= 3053 && local16 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static56.anInt1566 = 1;
		}
		if (local16 >= 3072 && local16 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static56.anInt1566 = 1;
		}
		if (Static56.anInt1566 == 1 && local16 >= 3139 && local16 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static56.anInt1566 = 0;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!vo;BLclient!jw;)V")
	public static void method1765(@OriginalArg(0) int arg0, @OriginalArg(1) Class361 arg1, @OriginalArg(3) Class4_Sub1 arg2) {
		if (Static393.anInt7276 >= 50 || (arg1 == null || arg1.anIntArrayArray62 == null || arg1.anIntArrayArray62.length <= arg0 || arg1.anIntArrayArray62[arg0] == null)) {
			return;
		}
		@Pc(36) int local36 = arg1.anIntArrayArray62[arg0][0];
		@Pc(44) int local44 = local36 >> 8;
		@Pc(50) int local50 = local36 >> 5 & 0x7;
		@Pc(54) int local54 = local36 & 0x1F;
		@Pc(73) int local73;
		if (arg1.anIntArrayArray62[arg0].length > 1) {
			local73 = (int) ((double) arg1.anIntArrayArray62[arg0].length * Math.random());
			if (local73 > 0) {
				local44 = arg1.anIntArrayArray62[arg0][local73];
			}
		}
		local73 = 256;
		if (arg1.anIntArray640 != null && arg1.anIntArray637 != null) {
			local73 = (int) (Math.random() * (double) (arg1.anIntArray637[arg0] - arg1.anIntArray640[arg0])) + arg1.anIntArray640[arg0];
		}
		@Pc(123) int local123 = arg1.anIntArray641 == null ? 255 : arg1.anIntArray641[arg0];
		if (local54 == 0) {
			if (arg2 == Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2) {
				if (arg1.aBoolean708) {
					Static533.method7799(local50, local44, 0, false, local73, local123);
					return;
				}
				Static137.method2968(local44, 0, local73, local123, local50);
			}
		} else if (Static262.aClass3_Sub27_12.aClass21_Sub14_5.method5405() != 0) {
			@Pc(166) int local166 = arg2.anInt8916 - 256 >> 9;
			@Pc(173) int local173 = arg2.anInt8911 - 256 >> 9;
			@Pc(194) int local194 = arg2 == Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2 ? 0 : local54 + (arg2.aByte123 << 24) + (local166 << 16) + (local173 << 8);
			Static508.aClass371Array1[Static393.anInt7276++] = new Class371((byte) (arg1.aBoolean708 ? 2 : 1), local44, local50, 0, local123, local194, local73, arg2);
		}
	}
}
