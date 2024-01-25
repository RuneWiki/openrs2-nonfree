import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_50 = new Class160(47, -1);

	@OriginalMember(owner = "client!jg", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray16 = new String[100];

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "[I")
	public static final int[] anIntArray418 = new int[1000];

	@OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
	public static int anInt3958 = 0;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!dga;II)V")
	public static void method3410(@OriginalArg(0) Class6_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (Static225.aClass320_3 == null) {
			return;
		}
		try {
			Static225.aClass320_3.method7334(0L);
			Static225.aClass320_3.method7332(arg1, 24, arg0.aByteArray88);
		} catch (@Pc(24) Exception local24) {
		}
	}
}
