import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!nu", name = "nd", descriptor = "I")
	public static int anInt6484;

	@OriginalMember(owner = "client!nu", name = "pd", descriptor = "[Lclient!ir;")
	public static Class20_Sub2[] aClass20_Sub2Array2;

	@OriginalMember(owner = "client!nu", name = "bd", descriptor = "Ljava/lang/String;")
	public static String aString67 = "";

	@OriginalMember(owner = "client!nu", name = "md", descriptor = "I")
	public static int anInt6483 = 0;

	@OriginalMember(owner = "client!nu", name = "rd", descriptor = "Z")
	public static boolean aBoolean462 = false;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZI)V")
	public static void method5361(@OriginalArg(1) int arg0) {
		Static482.anInt8057 = arg0;
		@Pc(7) Class326 local7 = Static282.aClass326_26;
		synchronized (Static282.aClass326_26) {
			Static282.aClass326_26.method7230();
		}
		local7 = Static11.aClass326_1;
		synchronized (Static11.aClass326_1) {
			Static11.aClass326_1.method7230();
		}
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(IZI)Lclient!tda;")
	public static Class1_Sub46 method5363(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(19) long local19 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
		return (Class1_Sub46) Static289.aClass356_25.method7796(local19);
	}
}
