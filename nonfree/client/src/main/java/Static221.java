import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!lf", name = "J", descriptor = "Lclient!fa;")
	public static final Class68 aClass68_24 = new Class68(32);

	@OriginalMember(owner = "client!lf", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString39 = null;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!fs;I)V")
	public static void method3346(@OriginalArg(0) Class76 arg0) {
		Static338.anInt5846 = arg0.method2099("titlebg");
		Static367.anInt6320 = arg0.method2099("logo");
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I[SI)[S")
	public static short[] method3347(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static459.method3328(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
