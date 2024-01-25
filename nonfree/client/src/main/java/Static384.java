import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static384 {

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_144 = new Class180(2, 6);

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_145 = new Class180(63, -1);

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!tia;ZLclient!tia;)V")
	public static void method5495(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (arg1.aClass3_Sub11_66 != null) {
			arg1.method9345();
		}
		arg1.aClass3_Sub11_66 = arg0;
		arg1.aClass3_Sub11_67 = arg0.aClass3_Sub11_67;
		arg1.aClass3_Sub11_66.aClass3_Sub11_67 = arg1;
		arg1.aClass3_Sub11_67.aClass3_Sub11_66 = arg1;
	}
}
