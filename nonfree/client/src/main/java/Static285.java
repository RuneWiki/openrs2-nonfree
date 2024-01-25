import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!q", name = "E", descriptor = "I")
	public static int anInt5066;

	@OriginalMember(owner = "client!q", name = "O", descriptor = "Lclient!mq;")
	public static final Class154 aClass154_38 = new Class154(32);

	@OriginalMember(owner = "client!q", name = "ob", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_155 = new Class41(1, 8);

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ZLclient!lk;)Lclient!ph;")
	public static Class178 method4387(@OriginalArg(1) Class2_Sub13 arg0) {
		@Pc(7) Class178 local7 = new Class178();
		local7.anInt4883 = arg0.method4245();
		local7.aClass2_Sub1_Sub10_1 = Static145.method2497(local7.anInt4883);
		return local7;
	}
}
