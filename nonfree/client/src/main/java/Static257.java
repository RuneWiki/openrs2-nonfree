import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "Lclient!rn;")
	public static Class155 aClass155_106;

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "Lclient!rn;")
	public static Class155 aClass155_107;

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
	public static int anInt5292 = -1;

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
	public static int anInt5293 = -1;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
	public static int anInt5294 = -1;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BI)Lclient!hi;")
	public static Class72 method4338(@OriginalArg(1) int arg0) {
		@Pc(16) Class72 local16 = (Class72) Static175.aClass98_26.method2570((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(27) byte[] local27 = Static23.aClass155_19.method4121(1, arg0);
		local16 = new Class72();
		if (local27 != null) {
			local16.method1767(arg0, new Class3_Sub26(local27));
		}
		Static175.aClass98_26.method2568(local16, (long) arg0);
		return local16;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZLclient!rn;)I")
	public static int method4339(@OriginalArg(1) Class155 arg0) {
		@Pc(11) int local11 = 0;
		if (arg0.method4133(Static131.anInt2477)) {
			local11++;
		}
		if (arg0.method4133(Static198.anInt3861)) {
			local11++;
		}
		return local11;
	}
}
