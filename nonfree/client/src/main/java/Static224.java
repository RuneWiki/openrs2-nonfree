import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "Lclient!da;")
	public static Class44 aClass44_16;

	@OriginalMember(owner = "client!gs", name = "k", descriptor = "Lclient!eaa;")
	public static Class84 aClass84_1;

	@OriginalMember(owner = "client!gs", name = "p", descriptor = "D")
	public static double aDouble15;

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
	public static int anInt4275 = -1;

	@OriginalMember(owner = "client!gs", name = "q", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_70 = new Class186(102, 8);

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "J")
	public static long aLong143 = 0L;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
	public static void method3525() {
		for (@Pc(3) int local3 = 0; local3 < Static6.aByteArrayArrayArray1.length; local3++) {
			for (@Pc(9) int local9 = 0; local9 < Static6.aByteArrayArrayArray1[0].length; local9++) {
				for (@Pc(13) int local13 = 0; local13 < Static6.aByteArrayArrayArray1[0][0].length; local13++) {
					Static6.aByteArrayArrayArray1[local3][local9][local13] = 0;
				}
			}
		}
		if (32105 != 32105) {
			aLong143 = -118L;
		}
	}
}
