import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "[I")
	public static int[] anIntArray220;

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
	public static int anInt2683;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "Lclient!th;")
	public static Class169 aClass169_75 = new Class169(64);

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
	public static int anInt2682 = 0;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!wi;)V")
	public static void method2181(@OriginalArg(1) Class103_Sub2 arg0) {
		@Pc(7) int local7;
		for (local7 = 0; local7 < Static95.anIntArray474.length; local7++) {
			Static95.anIntArray474[local7] = 0;
		}
		@Pc(39) int local39;
		for (local7 = 0; local7 < 5000; local7++) {
			local39 = (int) (Math.random() * 128.0D * (double) 256);
			Static95.anIntArray474[local39] = (int) (Math.random() * 284.0D);
		}
		@Pc(65) int local65;
		@Pc(74) int local74;
		for (local7 = 0; local7 < 20; local7++) {
			for (local39 = 1; local39 < 255; local39++) {
				for (local65 = 1; local65 < 127; local65++) {
					local74 = (local39 << 7) + local65;
					Static167.anIntArray281[local74] = (Static95.anIntArray474[local74 + 1] + Static95.anIntArray474[local74 - 1] + Static95.anIntArray474[local74 + -128] + Static95.anIntArray474[local74 + 128]) / 4;
				}
			}
			@Pc(110) int[] local110 = Static95.anIntArray474;
			Static95.anIntArray474 = Static167.anIntArray281;
			Static167.anIntArray281 = local110;
		}
		if (arg0 == null) {
			return;
		}
		local7 = 0;
		for (local39 = 0; local39 < arg0.anInt5858; local39++) {
			for (local65 = 0; local65 < arg0.anInt5857; local65++) {
				if (arg0.aByteArray74[local7++] != 0) {
					local74 = local65 + arg0.anInt5851 + 16;
					@Pc(171) int local171 = local39 + arg0.anInt5854 + 16;
					@Pc(178) int local178 = local74 + (local171 << 7);
					Static95.anIntArray474[local178] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)V")
	public static void method2182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static303.aBoolean421 = true;
		Static79.anInt1466 = arg0;
		Static306.anInt5528 = arg1;
		Static272.anInt5176 = arg2;
		Static211.anInt4150 = -1;
		Static127.anInt2547 = -1;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
	public static void method2183() {
		Static197.aClass169_109.method4018();
		Static79.aClass169_54.method4018();
		Static292.aClass169_153.method4018();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIII)V")
	public static void method2184(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			Static137.aClass1_Sub14_Sub1_6.method2661(57);
		}
		if (arg1 == 1) {
			Static137.aClass1_Sub14_Sub1_6.method2661(131);
		}
		Static137.aClass1_Sub14_Sub1_6.method2618(arg0 + Static290.anInt5497);
		Static137.aClass1_Sub14_Sub1_6.method2639(++Static167.aByte11);
		Static137.aClass1_Sub14_Sub1_6.method2639(Static88.aBooleanArray16[82] ? 1 : 0);
		Static137.aClass1_Sub14_Sub1_6.method2618(arg2 + Static118.anInt2409);
	}
}
