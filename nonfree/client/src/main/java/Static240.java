import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!o", name = "h", descriptor = "I")
	public static int anInt4284;

	@OriginalMember(owner = "client!o", name = "j", descriptor = "Lclient!ae;")
	public static Class4 aClass4_18;

	@OriginalMember(owner = "client!o", name = "l", descriptor = "Lclient!nl;")
	public static Class171 aClass171_59;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_68 = new Class11(31, 2);

	@OriginalMember(owner = "client!o", name = "k", descriptor = "J")
	public static long aLong143 = 0L;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	public static void method3873() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static331.aBooleanArray30[local3] = true;
		}
	}
}
