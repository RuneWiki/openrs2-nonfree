import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "Lclient!sj;")
	public static Class181 aClass181_4;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "Lclient!ir;")
	public static Class100 aClass100_11;

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_7 = new Class198(16);

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
	public static int anInt527 = 13156520;

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "[I")
	public static final int[] anIntArray19 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([BBZ)Ljava/lang/Object;")
	public static Object method401(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static350.aBoolean450) {
			try {
				@Pc(28) Class89 local28 = (Class89) Class.forName("Class89_Sub1").getDeclaredConstructor().newInstance();
				local28.method3742(arg0);
				return local28;
			} catch (@Pc(35) Throwable local35) {
				Static350.aBoolean450 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)Lclient!ka;")
	public static Class3_Sub7_Sub13 method403() {
		return Static193.aClass3_Sub7_Sub13_4;
	}
}
