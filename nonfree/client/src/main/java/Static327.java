import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "Lclient!gg;")
	public static Class45 aClass45_1;

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_58 = new Class70(15, -1);

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!mo;)Lclient!ih;")
	public static Class54_Sub3 method4481(@OriginalArg(1) Class1_Sub35 arg0) {
		@Pc(15) Class54 local15 = Static536.method7335(arg0);
		@Pc(19) int local19 = arg0.method5804();
		@Pc(23) int local23 = arg0.method5804();
		return new Class54_Sub3(local15.aClass335_10, local15.aClass122_9, local15.anInt4146, local15.anInt4142, local15.anInt4145, local15.anInt4141, local15.anInt4143, local15.anInt4144, local15.anInt4139, local19, local23);
	}
}
