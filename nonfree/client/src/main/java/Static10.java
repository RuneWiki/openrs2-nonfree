import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
	public static int anInt6517;

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "Lclient!fc;")
	public static Class73 aClass73_13;

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
	public static int anInt6518;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_194 = new Class208(8, 20);

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "Lclient!co;")
	public static final Class41 aClass41_72 = new Class41(10);

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)Lclient!gu;")
	public static Class92 method5618() {
		try {
			return (Class92) Class.forName("Class92_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
