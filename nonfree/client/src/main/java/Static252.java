import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "Z")
	public static boolean aBoolean336 = true;

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "Lclient!mba;")
	public static final Class184 aClass184_6 = new Class184();

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
	public static int anInt4585 = 0;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
	public static Object method3975(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static391.aBoolean557) {
			try {
				@Pc(25) Class38 local25 = (Class38) Class.forName("Class38_Sub1").getDeclaredConstructor().newInstance();
				local25.method1197(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static391.aBoolean557 = true;
			}
		}
		return arg0;
	}
}
