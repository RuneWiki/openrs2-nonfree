import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!sha", name = "hb", descriptor = "I")
	public static int anInt8929;

	@OriginalMember(owner = "client!sha", name = "Z", descriptor = "Lclient!io;")
	public static Class168 aClass168_1 = new Class168(8);

	@OriginalMember(owner = "client!sha", name = "gb", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_86 = new Class305(71, 3);

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(II)V")
	public static void method7584(@OriginalArg(0) int arg0) {
		Static516.anInt8591 = arg0;
		@Pc(7) Class340 local7 = Static607.aClass340_49;
		synchronized (Static607.aClass340_49) {
			Static607.aClass340_49.method7987();
		}
		local7 = Static201.aClass340_22;
		synchronized (Static201.aClass340_22) {
			Static201.aClass340_22.method7987();
		}
	}
}
