import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
	public static int anInt2483;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "Lclient!mv;")
	public static final Class219 aClass219_3 = new Class219(1, 2, 2, 0);

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "Z")
	public static boolean aBoolean188 = false;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V")
	public static void method2189(@OriginalArg(0) int arg0) {
		Static92.anInt2296 = arg0;
		@Pc(7) Class211 local7 = Static204.aClass211_30;
		synchronized (Static204.aClass211_30) {
			Static204.aClass211_30.method5535();
		}
		local7 = Static232.aClass211_34;
		synchronized (Static232.aClass211_34) {
			Static232.aClass211_34.method5535();
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method2190(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class3_Sub4_Sub6 local16 = Static367.method6025(2, arg1);
		local16.method1898();
		local16.aString18 = arg0;
	}
}
