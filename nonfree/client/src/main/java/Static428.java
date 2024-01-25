import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
	public static int anInt6929;

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "J")
	public static long aLong208 = 0L;

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_214 = new Class102(48, -1);

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_155 = new Class211(22, -1);

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
	public static int anInt6928 = 0;

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "[Lclient!el;")
	public static final Class68[] aClass68Array1 = new Class68[2048];

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[5];

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!za;B)V")
	public static void method5369(@OriginalArg(0) Class163 arg0) {
		if (Static285.aBoolean329) {
			Static284.method3775(arg0);
		} else {
			Static336.method4490(arg0);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)V")
	public static void method5372(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub5_Sub11 local8 = Static316.method4316(5, arg0);
		local8.method3101();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5373(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static311.method5191("%0a", "\n", arg0));
	}
}
