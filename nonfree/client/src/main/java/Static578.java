import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "Lclient!pga;")
	public static Class268 aClass268_4;

	@OriginalMember(owner = "client!wc", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString97;

	@OriginalMember(owner = "client!wc", name = "N", descriptor = "Lclient!cp;")
	public static Class58 aClass58_14;

	@OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
	public static int anInt9587;

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "Lclient!db;")
	public static final Class64 aClass64_476 = new Class64(117, 20);

	@OriginalMember(owner = "client!wc", name = "J", descriptor = "Lclient!jw;")
	public static final Class183 aClass183_42 = new Class183(32);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
	public static void method7861(@OriginalArg(0) int arg0) {
		Static64.anInt1206 = arg0;
		Static140.anInt3152 = 2;
		if (Static248.aString61 == null) {
			Static112.method2333(35);
		} else {
			@Pc(28) Class4_Sub9 local28 = new Class4_Sub9(Static385.method5687(Static52.method797(Static248.aString61)));
			@Pc(32) long local32 = local28.method5997();
			Static290.aLong151 = local28.method5997();
			Static108.method2316(Static446.method6284(local32), true, "");
		}
	}
}
