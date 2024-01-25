import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cga", name = "m", descriptor = "[Lclient!tc;")
	public static Class305[] aClass305Array1;

	@OriginalMember(owner = "client!cga", name = "j", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_15 = new Class230(44, 8);

	@OriginalMember(owner = "client!cga", name = "k", descriptor = "Lclient!ki;")
	public static final Class183 aClass183_5 = new Class183();

	@OriginalMember(owner = "client!cga", name = "l", descriptor = "Lclient!fs;")
	public static final Class109 aClass109_3 = new Class109("WTI", 5);

	@OriginalMember(owner = "client!cga", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString16 = null;

	@OriginalMember(owner = "client!cga", name = "o", descriptor = "I")
	public static int anInt1638 = -1;

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IZ)V")
	public static void method1599() {
		@Pc(1) Class211 local1 = Static419.aClass211_51;
		synchronized (Static419.aClass211_51) {
			Static419.aClass211_51.method5538(5);
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method1601(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class3_Sub4_Sub6 local14 = Static367.method6025(3, arg1);
		local14.method1898();
		local14.aString18 = arg0;
	}
}
