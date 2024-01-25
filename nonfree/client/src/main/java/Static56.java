import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!df", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString109;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "I")
	public static int anInt1465 = -1;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)I")
	public static int method1167(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class7_Sub9 local18 = (Class7_Sub9) Static175.aClass10_32.method163((long) arg1);
		if (local18 == null) {
			return 0;
		} else if (arg0 >= 0 && local18.anIntArray263.length > arg0) {
			return local18.anIntArray263[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	public static void method1168() {
		for (@Pc(16) Class7_Sub1_Sub17 local16 = (Class7_Sub1_Sub17) Static338.aClass74_36.method1793(); local16 != null; local16 = (Class7_Sub1_Sub17) Static338.aClass74_36.method1798()) {
			@Pc(20) Class22_Sub2_Sub2 local20 = local16.aClass22_Sub2_Sub2_1;
			if (Static168.anInt3508 != local20.aByte69 || local20.aBoolean337) {
				local16.method5648();
				local20.method3936();
			} else if (local20.anInt4445 <= Static212.anInt4234) {
				local20.method3927(Static105.anInt6011);
				if (local20.aBoolean337) {
					local16.method5648();
				} else {
					Static235.method4081(local20, true, true);
				}
			}
		}
	}
}
