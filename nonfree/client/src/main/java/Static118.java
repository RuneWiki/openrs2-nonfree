import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!et", name = "n", descriptor = "Lclient!kda;")
	public static Class160 aClass160_26;

	@OriginalMember(owner = "client!et", name = "o", descriptor = "I")
	public static int anInt2858;

	@OriginalMember(owner = "client!et", name = "p", descriptor = "I")
	public static int anInt2859;

	@OriginalMember(owner = "client!et", name = "m", descriptor = "J")
	public static long aLong70 = 0L;

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(B)V")
	public static void method2664() {
		for (@Pc(8) Class1_Sub37 local8 = (Class1_Sub37) Static500.aClass38_71.method1419(); local8 != null; local8 = (Class1_Sub37) Static500.aClass38_71.method1415()) {
			if (local8.anInt6620 == -1) {
				local8.anInt6623 = 0;
				if (local8.anInt6624 >= 0 && local8.anInt6615 >= 0 && local8.anInt6624 < Static542.anInt9387 && Static36.anInt1324 > local8.anInt6615) {
					Static381.method7904(local8);
				}
			} else {
				local8.method7983();
			}
		}
	}
}
