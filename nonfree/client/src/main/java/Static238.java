import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!se", name = "q", descriptor = "Lclient!mn;")
	public static Class115 aClass115_15;

	@OriginalMember(owner = "client!se", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString238 = "Drop";

	@OriginalMember(owner = "client!se", name = "w", descriptor = "Lclient!a;")
	public static Class1 aClass1_24 = new Class1();

	@OriginalMember(owner = "client!se", name = "db", descriptor = "I")
	public static int anInt4852 = 0;

	@OriginalMember(owner = "client!se", name = "wb", descriptor = "J")
	public static volatile long aLong254 = 0L;

	@OriginalMember(owner = "client!se", name = "xb", descriptor = "[I")
	public static int[] anIntArray439 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILjava/lang/StringBuffer;CI)Ljava/lang/StringBuffer;")
	public static StringBuffer method3923(@OriginalArg(1) StringBuffer arg0) {
		@Pc(8) int local8 = arg0.length();
		arg0.setLength(0);
		for (@Pc(21) int local21 = local8; local21 < 0; local21++) {
			arg0.setCharAt(local21, ' ');
		}
		return arg0;
	}
}
