import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
	public static int anInt4373;

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "F")
	public static float aFloat136;

	@OriginalMember(owner = "client!ll", name = "j", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_47 = new Class215(49, 6);

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(B[B)Lclient!ae;")
	public static Class4_Sub1_Sub1 method3441(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class4_Sub1_Sub1 local9 = new Class4_Sub1_Sub1();
		@Pc(14) Class4_Sub12 local14 = new Class4_Sub12(arg0);
		local14.anInt2997 = local14.aByteArray36.length - 2;
		@Pc(25) int local25 = local14.method2536();
		@Pc(36) int local36 = local14.aByteArray36.length - local25 - 12 - 2;
		local14.anInt2997 = local36;
		@Pc(43) int local43 = local14.method2529();
		local9.anInt55 = local14.method2536();
		local9.anInt56 = local14.method2536();
		local9.anInt54 = local14.method2536();
		local9.anInt58 = local14.method2536();
		@Pc(67) int local67 = local14.method2490();
		@Pc(84) int local84;
		if (local67 > 0) {
			local9.aClass102Array1 = new Class102[local67];
			for (@Pc(78) int local78 = 0; local78 < local67; local78++) {
				local84 = local14.method2536();
				@Pc(91) Class102 local91 = new Class102(Static370.method4949(local84));
				local9.aClass102Array1[local78] = local91;
				while (local84-- > 0) {
					@Pc(102) int local102 = local14.method2529();
					@Pc(106) int local106 = local14.method2529();
					local91.method2703((long) local102, new Class4_Sub37(local106));
				}
			}
		}
		local14.anInt2997 = 0;
		local9.aString2 = local14.method2516();
		local9.anIntArray5 = new int[local43];
		local9.aStringArray1 = new String[local43];
		local9.anIntArray6 = new int[local43];
		local84 = 0;
		while (local14.anInt2997 < local36) {
			@Pc(162) int local162 = local14.method2536();
			if (local162 == 3) {
				local9.aStringArray1[local84] = local14.method2537().intern();
			} else if (local162 >= 100 || local162 == 21 || local162 == 38 || local162 == 39) {
				local9.anIntArray6[local84] = local14.method2490();
			} else {
				local9.anIntArray6[local84] = local14.method2529();
			}
			local9.anIntArray5[local84++] = local162;
		}
		return local9;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
	public static void method3442() {
		if (Static32.aBoolean63) {
			return;
		}
		Static32.aBoolean63 = true;
		if (Static323.aClass50_Sub1_1.aBoolean303) {
			Static164.aFloat142 = (int) Static164.aFloat142 + 47 & 0xFFFFFFF0;
		} else {
			Static50.aFloat28 += (12.0F - Static50.aFloat28) / 2.0F;
		}
		Static251.aBoolean429 = true;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLjava/util/Random;I)I")
	public static int method3443(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static424.method5413(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(45) int local45;
			do {
				local45 = arg0.nextInt();
			} while (local45 >= local42);
			return Static81.method1460(arg1, local45);
		}
	}
}
