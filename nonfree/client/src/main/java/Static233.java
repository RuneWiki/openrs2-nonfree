import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!ln", name = "N", descriptor = "I")
	public static final int anInt4266 = 0;

	@OriginalMember(owner = "client!ln", name = "Q", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_86 = new Class92(33, 7);

	@OriginalMember(owner = "client!ln", name = "U", descriptor = "I")
	public static int anInt4271 = -1;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)V")
	public static void method3616(@OriginalArg(0) int arg0) {
		if (arg0 == Static98.anInt6275) {
			return;
		}
		Static181.anInt3574 = Static117.anInt2450 = Static131.anIntArray163[arg0];
		Static337.method4900();
		Static320.anIntArrayArray31 = new int[Static181.anInt3574][Static117.anInt2450];
		Static287.anIntArrayArrayArray10 = new int[4][Static181.anInt3574 >> 3][Static117.anInt2450 >> 3];
		Static443.anIntArrayArray60 = new int[Static181.anInt3574][Static117.anInt2450];
		for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
			Static209.aClass210Array2[local36] = Static15.method394(Static181.anInt3574, Static117.anInt2450);
		}
		Static112.aByteArrayArrayArray4 = new byte[4][Static181.anInt3574][Static117.anInt2450];
		Static14.method388(Static117.anInt2450, Static181.anInt3574);
		Static442.method6408(Static117.anInt2450 >> 3, Static126.aClass66_5, Static181.anInt3574 >> 3);
		Static98.anInt6275 = arg0;
	}
}
