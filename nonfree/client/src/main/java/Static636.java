import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static636 {

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "Lclient!bt;")
	public static Class34 aClass34_126;

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
	public static int anInt9898;

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "Lclient!bq;")
	public static Class31 aClass31_14;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "Lclient!oh;")
	public static final Class268 aClass268_40 = new Class268("", 18);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method8470(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class4_Sub48 local20 = Static335.method4615(Static51.aClass216_13, Static669.aClass196_2);
		local20.aClass4_Sub11_Sub1_2.method8822(Static115.method2143(arg0) + 1);
		local20.aClass4_Sub11_Sub1_2.method8857(arg0);
		local20.aClass4_Sub11_Sub1_2.method8822(arg1);
		Static410.method5170(local20);
	}
}
