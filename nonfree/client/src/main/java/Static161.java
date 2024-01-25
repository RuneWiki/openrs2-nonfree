import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!gfa", name = "E", descriptor = "Lclient!sea;")
	public static Class308 aClass308_66;

	@OriginalMember(owner = "client!gfa", name = "F", descriptor = "I")
	public static int anInt3095 = 0;

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
	public static Object method2652(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static526.aBoolean671) {
			try {
				@Pc(18) Class184 local18 = (Class184) Class.forName("Class184_Sub1").getDeclaredConstructor().newInstance();
				local18.method3814(arg0);
				return local18;
			} catch (@Pc(25) Throwable local25) {
				Static526.aBoolean671 = true;
			}
		}
		return arg0;
	}
}
