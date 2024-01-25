import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
	public static int anInt6100;

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "I")
	public static int anInt6105;

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_145 = new Class25(100, 4);

	@OriginalMember(owner = "client!qu", name = "i", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_80 = new Class208(76, -1);

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
	public static void method4854() {
		for (@Pc(18) Class2_Sub1_Sub18 local18 = (Class2_Sub1_Sub18) Static364.aClass181_38.method3972(); local18 != null; local18 = (Class2_Sub1_Sub18) Static364.aClass181_38.method3975()) {
			@Pc(23) Class11_Sub5_Sub1 local23 = local18.aClass11_Sub5_Sub1_1;
			if (local23.aBoolean128) {
				local18.method6260();
				local23.method1945();
			} else if (local23.anInt2027 <= Static277.anInt5022) {
				local23.method1946(Static417.anInt7158);
				if (local23.aBoolean128) {
					local18.method6260();
				} else {
					Static252.method3490(local23, true);
				}
			}
		}
	}
}
