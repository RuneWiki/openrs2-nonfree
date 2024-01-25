import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bd", name = "O", descriptor = "I")
	public static int anInt356;

	@OriginalMember(owner = "client!bd", name = "M", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_28 = new Class221(47, 12);

	@OriginalMember(owner = "client!bd", name = "N", descriptor = "J")
	public static long aLong23 = 0L;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)V")
	public static void method302() {
		for (@Pc(15) Class2_Sub9_Sub9 local15 = (Class2_Sub9_Sub9) Static30.aClass180_3.method4919(); local15 != null; local15 = (Class2_Sub9_Sub9) Static30.aClass180_3.method4916()) {
			@Pc(20) Class1_Sub2_Sub6 local20 = local15.aClass1_Sub2_Sub6_1;
			if (local20.aBoolean532) {
				local15.method5723();
				local20.method5089();
			} else if (local20.anInt6011 <= Static6.anInt91) {
				local20.method5087(Static170.anInt5086);
				if (local20.aBoolean532) {
					local15.method5723();
				} else {
					Static342.method5581(local20, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V")
	public static void method303() {
		Static57.anInt1013 = -1;
		Static360.anInt6858 = -1;
		Static222.anInt6838 = 0;
	}
}
