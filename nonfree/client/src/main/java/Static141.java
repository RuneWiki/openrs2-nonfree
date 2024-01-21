import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
	public static int anInt3598;

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1360 = Static169.method2903("<img=1>");

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "[I")
	public static int[] anIntArray476 = new int[32768];

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3 = new int[4][105][105];

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
	public static int anInt3602 = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
	public static void method2470(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class1_Sub7 local14 = (Class1_Sub7) Static78.aClass10_5.method257(); local14 != null; local14 = (Class1_Sub7) Static78.aClass10_5.method260()) {
			if ((local14.aLong140 >> 48 & 0xFFFFL) == (long) arg0) {
				local14.method3141();
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	public static void method2471() {
		anIntArray476 = null;
		aBigInteger1 = null;
		aClass23_1360 = null;
		anIntArrayArrayArray3 = null;
	}
}
