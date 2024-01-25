import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static421 {

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
	public static int anInt7061;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "Lclient!aj;")
	public static final Class10 aClass10_45 = new Class10(4);

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
	public static int anInt7062 = -1;

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_146 = new Class298(41, -1);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ru;BLclient!ru;)V")
	public static void method6018(@OriginalArg(0) Class9 arg0, @OriginalArg(2) Class9 arg1) {
		if (arg0.aClass9_67 != null) {
			arg0.method7465();
		}
		arg0.aClass9_67 = arg1.aClass9_67;
		arg0.aClass9_68 = arg1;
		arg0.aClass9_67.aClass9_68 = arg0;
		arg0.aClass9_68.aClass9_67 = arg0;
	}
}
