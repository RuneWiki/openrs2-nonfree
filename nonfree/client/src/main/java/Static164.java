import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "Lclient!eh;")
	public static final Class94 aClass94_1 = new Class94();

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString29 = null;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILclient!ha;I)Lclient!hk;")
	public static Class155 method3005(@OriginalArg(1) Class100 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class5_Sub11 local16 = (Class5_Sub11) Static3.aClass306_1.method6943((long) arg1);
		if (local16 != null) {
			@Pc(23) Class5_Sub14_Sub4 local23 = local16.aClass275_Sub1_1.method6321();
			local16.aBoolean88 = true;
			if (local23 != null) {
				return local23.method8237(arg0);
			}
		}
		return null;
	}
}
