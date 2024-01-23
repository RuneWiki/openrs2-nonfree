import java.awt.Container;
import java.awt.Insets;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!co", name = "r", descriptor = "[Lclient!t;")
	public static Class152_Sub1[] aClass152_Sub1Array2;

	@OriginalMember(owner = "client!co", name = "v", descriptor = "[[I")
	public static int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!co", name = "w", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!co", name = "q", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!co", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString27 = "Loading defaults - ";

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([IIIB[J)V")
	public static void method827(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(10) int local10 = (arg1 + arg2) / 2;
		@Pc(14) long local14 = arg3[local10];
		@Pc(16) int local16 = arg2;
		arg3[local10] = arg3[arg1];
		arg3[arg1] = local14;
		@Pc(30) int local30 = arg0[local10];
		arg0[local10] = arg0[arg1];
		arg0[arg1] = local30;
		for (@Pc(42) int local42 = arg2; local42 < arg1; local42++) {
			if (arg3[local42] < (long) (local42 & 0x1) + local14) {
				@Pc(64) long local64 = arg3[local42];
				arg3[local42] = arg3[local16];
				arg3[local16] = local64;
				@Pc(78) int local78 = arg0[local42];
				arg0[local42] = arg0[local16];
				arg0[local16++] = local78;
			}
		}
		arg3[arg1] = arg3[local16];
		arg3[local16] = local14;
		arg0[arg1] = arg0[local16];
		arg0[local16] = local30;
		method827(arg0, local16 - 1, arg2, arg3);
		method827(arg0, arg1, local16 + 1, arg3);
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(I)V")
	public static void method828() {
		@Pc(12) Container local12;
		if (Static136.aFrame1 != null) {
			local12 = Static136.aFrame1;
		} else if (Static299.aFrame2 == null) {
			local12 = Static13.aClass84_3.anApplet1;
		} else {
			local12 = Static299.aFrame2;
		}
		Static139.anInt2621 = local12.getSize().width;
		Static269.anInt5394 = local12.getSize().height;
		if (Static299.aFrame2 == local12) {
			@Pc(36) Insets local36 = Static299.aFrame2.getInsets();
			Static269.anInt5394 -= local36.top + local36.bottom;
			Static139.anInt2621 -= local36.left + local36.right;
		}
		if (Static136.method2157() >= 2) {
			Static166.anInt3046 = Static269.anInt5394;
			Static125.anInt2380 = 0;
			Static145.anInt2690 = Static139.anInt2621;
			Static47.anInt5869 = 0;
		} else {
			Static47.anInt5869 = (Static139.anInt2621 - 765) / 2;
			Static166.anInt3046 = 503;
			Static145.anInt2690 = 765;
			Static125.anInt2380 = 0;
		}
		if (Static240.aBoolean369) {
			Static240.method3793(Static145.anInt2690, Static166.anInt3046);
		}
		Static189.aCanvas1.setSize(Static145.anInt2690, Static166.anInt3046);
		if (local12 == Static299.aFrame2) {
			@Pc(104) Insets local104 = Static299.aFrame2.getInsets();
			Static189.aCanvas1.setLocation(Static47.anInt5869 + local104.left, Static125.anInt2380 + local104.top);
		} else {
			Static189.aCanvas1.setLocation(Static47.anInt5869, Static125.anInt2380);
		}
		if (Static121.anInt2350 != -1) {
			Static156.method1490(true);
		}
		Static109.method1723();
	}
}
