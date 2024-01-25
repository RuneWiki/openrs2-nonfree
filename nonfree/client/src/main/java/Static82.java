import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "[Lclient!dk;")
	public static Class46[] aClass46Array2;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "Z")
	public static boolean aBoolean110 = false;

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString61 = "slide:";

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)Z")
	public static boolean method1316() {
		@Pc(14) Class1_Sub12 local14 = (Class1_Sub12) Static58.aClass14_4.aClass1_17.aClass1_248;
		if (local14 == null || local14 == Static58.aClass14_4.aClass1_17) {
			return false;
		} else {
			if (local14.anInt1409 >= 2000) {
				local14.anInt1409 -= 2000;
			}
			return local14.anInt1409 == 1003;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!ii;Z)V")
	public static void method1317(@OriginalArg(0) Class105 arg0) {
		if (Static345.aBoolean548) {
			Static128.method2974(arg0);
		} else {
			Static154.method2691(arg0);
		}
	}
}
