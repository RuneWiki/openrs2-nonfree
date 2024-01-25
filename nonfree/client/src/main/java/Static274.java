import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "F")
	public static float aFloat64;

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
	public static int anInt4835;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "Lclient!la;")
	public static Class208 aClass208_64;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
	public static int anInt4832 = 0;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "Lclient!um;")
	public static final Class354 aClass354_10 = new Class354("", 16);

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZLjava/lang/String;I)I")
	public static int method4092(@OriginalArg(1) String arg0) {
		return Static664.method9165(arg0, 16);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/String;BI)Lclient!tha;")
	public static Class17 method4094(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class17 local15;
		try {
			local15 = (Class17) Class.forName("ak").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			local15 = new Class17_Sub2();
		}
		local15.aString76 = arg0;
		local15.anInt6195 = arg1;
		return local15;
	}
}
