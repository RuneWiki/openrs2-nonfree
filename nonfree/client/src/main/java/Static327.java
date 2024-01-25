import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!ls", name = "N", descriptor = "Lclient!wo;")
	public static final Class375 aClass375_5 = new Class375();

	@OriginalMember(owner = "client!ls", name = "O", descriptor = "Lclient!us;")
	public static final Class344 aClass344_79 = new Class344(19, 7);

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!rn;I)V")
	public static void method5498(@OriginalArg(0) Class3_Sub7 arg0) {
		if (arg0.aClass3_Sub12_6 != null) {
			arg0.aClass3_Sub12_6.anInt6622 = 0;
		}
		arg0.aBoolean625 = false;
		for (@Pc(18) Class3_Sub7 local18 = arg0.method6005(); local18 != null; local18 = arg0.method6006()) {
			method5498(local18);
		}
	}
}
