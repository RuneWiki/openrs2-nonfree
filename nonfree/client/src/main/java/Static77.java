import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "[Lclient!ec;")
	public static Class68[] aClass68Array1;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!dk", name = "l", descriptor = "[I")
	public static final int[] anIntArray176 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!dk", name = "m", descriptor = "[I")
	public static final int[] anIntArray177 = new int[500];

	@OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
	public static final int anInt1950 = 1407;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)V")
	public static void method1421(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub11 local12 = Static248.method3707(arg0, 2);
		local12.method2954();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Z")
	public static boolean method1422(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
