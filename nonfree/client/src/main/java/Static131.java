import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!pb", name = "tb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray36;

	@OriginalMember(owner = "client!pb", name = "Ob", descriptor = "[Lclient!bg;")
	public static Class1_Sub2_Sub1_Sub4[] aClass1_Sub2_Sub1_Sub4Array12;

	@OriginalMember(owner = "client!pb", name = "R", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!pb", name = "Nb", descriptor = "[[[Lclient!th;")
	public static Class82[][][] aClass82ArrayArrayArray1 = new Class82[4][104][104];

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
	public static void method2376() {
		if (Static22.aClass53_3 != null) {
			Static22.aClass53_3.method3053();
		}
		if (Static20.aClass53_1 != null) {
			Static20.aClass53_1.method3053();
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(III)V")
	public static void method2377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub10 local7 = Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass69_1 = null;
		}
	}

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)V")
	public static void method2379() {
		if (!Static46.aBoolean106) {
			Static58.aClass13Array15[0] = Static133.aClass13_1125;
			Static164.aClass13Array27[0] = Static16.aClass13_253;
			Static147.aShortArray41[0] = 1001;
			Static53.anInt1722 = 1;
		}
		if (Static82.anInt2319 != -1) {
			Static43.method1143(Static82.anInt2319);
		}
		for (@Pc(30) int local30 = 0; local30 < Static125.anInt3241; local30++) {
			if (Static140.aBooleanArray45[local30]) {
				Static28.aBooleanArray19[local30] = true;
			}
			Static170.aBooleanArray52[local30] = Static140.aBooleanArray45[local30];
			Static140.aBooleanArray45[local30] = false;
		}
		Static63.anInt1919 = -1;
		Static77.anInt2153 = -1;
		Static69.anInt1980 = Static78.anInt2168;
		Static11.aClass20_1 = null;
		if (Static82.anInt2319 != -1) {
			Static125.anInt3241 = 0;
			Static18.method659(0, 0, -1, 0, 503, 0, Static82.anInt2319, 765);
		}
		Static128.method557();
		Static109.method2127();
		if (Static46.aBoolean106) {
			Static20.method685();
		} else if (Static63.anInt1919 != -1) {
			Static35.method978(Static77.anInt2153, Static63.anInt1919);
		}
		if (Static139.anInt3458 == 3) {
			for (@Pc(106) int local106 = 0; local106 < Static125.anInt3241; local106++) {
				if (Static170.aBooleanArray52[local106]) {
					Static128.method551(Static181.anIntArray448[local106], Static123.anIntArray308[local106], Static132.anIntArray330[local106], Static26.anIntArray111[local106], 16711935, 128);
				} else if (Static28.aBooleanArray19[local106]) {
					Static128.method551(Static181.anIntArray448[local106], Static123.anIntArray308[local106], Static132.anIntArray330[local106], Static26.anIntArray111[local106], 16711680, 128);
				}
			}
		}
		Static108.method2115(Static156.anInt3696, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2606, Static117.anInt3116, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2596);
		Static117.anInt3116 = 0;
	}

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "(I)V")
	public static void method2380() {
		aClass82ArrayArrayArray1 = null;
		aBigInteger2 = null;
		aByteArrayArrayArray36 = null;
		aClass1_Sub2_Sub1_Sub4Array12 = null;
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(III)I")
	public static int method2381(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 + arg0 * 57;
		@Pc(20) int local20 = local14 << 13 ^ local14;
		@Pc(34) int local34 = Integer.MAX_VALUE & local20 * (local20 * 15731 * local20 + 789221) + 1376312589;
		return local34 >> 19 & 0xFF;
	}
}
