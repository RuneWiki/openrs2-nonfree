import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static501 {

	@OriginalMember(owner = "client!rv", name = "W", descriptor = "Lclient!sn;")
	public static final Class313 aClass313_13 = new Class313("WTI", 5);

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!mc;BLclient!mc;)V")
	public static void method7286(@OriginalArg(0) Class8 arg0, @OriginalArg(2) Class8 arg1) {
		if (arg1.aClass8_299 != null) {
			arg1.method8640();
		}
		arg1.aClass8_299 = arg0.aClass8_299;
		arg1.aClass8_300 = arg0;
		arg1.aClass8_299.aClass8_300 = arg1;
		arg1.aClass8_300.aClass8_299 = arg1;
	}
}
