import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "I")
	public static int anInt6065;

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "Lclient!dea;")
	public static final Class68 aClass68_49 = new Class68(32);

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "Z")
	public static boolean aBoolean462 = true;

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(II)V")
	public static void method5081(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class12 local12 = Static545.aClass68_82.method1923(); local12 != null; local12 = Static545.aClass68_82.method1920()) {
			if ((local12.aLong248 >> 48 & 0xFFFFL) == (long) arg0) {
				local12.method7967();
			}
		}
	}
}
