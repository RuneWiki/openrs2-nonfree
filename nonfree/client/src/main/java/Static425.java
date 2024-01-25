import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static425 {

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "Lclient!pm;")
	public static final Class291 aClass291_1 = new Class291(2);

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_133 = new Class186(86, 0);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!bfa;Lclient!bfa;I)V")
	public static void method6267(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class19 arg1) {
		if (arg0.aClass19_67 != null) {
			arg0.method9359();
		}
		arg0.aClass19_67 = arg1.aClass19_67;
		arg0.aClass19_68 = arg1;
		arg0.aClass19_67.aClass19_68 = arg0;
		arg0.aClass19_68.aClass19_67 = arg0;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "([BII)I")
	public static int method6268(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static7.method108(0, arg1, arg0);
	}
}
