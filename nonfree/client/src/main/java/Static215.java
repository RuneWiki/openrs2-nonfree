import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!hm", name = "Z", descriptor = "Lclient!bda;")
	public static Class31 aClass31_4;

	@OriginalMember(owner = "client!hm", name = "P", descriptor = "I")
	public static int anInt4487 = 0;

	@OriginalMember(owner = "client!hm", name = "Y", descriptor = "Lclient!kca;")
	public static final Class187 aClass187_4 = new Class187(1);

	@OriginalMember(owner = "client!hm", name = "jb", descriptor = "Z")
	public static boolean aBoolean374 = false;

	@OriginalMember(owner = "client!hm", name = "kb", descriptor = "Lclient!rr;")
	public static final Class300 aClass300_4 = new Class300();

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)Z")
	public static boolean method3731(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static248.method4049(arg0, arg1) || Static518.method7273(arg0, arg1);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!bj;Z)V")
	public static void method3732(@OriginalArg(0) Class2_Sub5_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		arg0.method8464();
		for (@Pc(13) Class2_Sub5_Sub2 local13 = (Class2_Sub5_Sub2) Static61.aClass175_2.method4280(); local13 != null; local13 = (Class2_Sub5_Sub2) Static61.aClass175_2.method4288()) {
			if (Static261.method4255(local13.method861(), arg0.method861())) {
				Static587.method8112(arg0, local13);
				local5 = true;
				break;
			}
		}
		if (!local5) {
			Static61.aClass175_2.method4287(arg0);
		}
	}
}
