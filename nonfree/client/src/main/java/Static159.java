import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!jq", name = "S", descriptor = "Lclient!e;")
	public static Class2_Sub11_Sub1 aClass2_Sub11_Sub1_4;

	@OriginalMember(owner = "client!jq", name = "U", descriptor = "Lclient!iq;")
	public static Class104 aClass104_78;

	@OriginalMember(owner = "client!jq", name = "N", descriptor = "Lclient!ik;")
	public static final Class102 aClass102_54 = new Class102("", 17);

	@OriginalMember(owner = "client!jq", name = "Q", descriptor = "I")
	public static int anInt2742 = 0;

	@OriginalMember(owner = "client!jq", name = "R", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_65 = new Class140("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!jq", name = "T", descriptor = "I")
	public static int anInt2743 = 0;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!ps;I)Ljava/lang/String;")
	public static String method2497(@OriginalArg(0) Class2_Sub31 arg0) {
		return arg0.aString51 == null || arg0.aString51.length() <= 0 ? arg0.aString52 : arg0.aString52 + Static176.aClass140_94.method4155(Static239.anInt2803) + arg0.aString51;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)V")
	public static void method2498() {
		@Pc(5) Class107 local5 = Static150.aClass107_17;
		synchronized (Static150.aClass107_17) {
			Static150.aClass107_17.method3011(5);
		}
		local5 = Static88.aClass107_10;
		synchronized (Static88.aClass107_10) {
			Static88.aClass107_10.method3011(5);
		}
		local5 = Static224.aClass107_53;
		synchronized (Static224.aClass107_53) {
			Static224.aClass107_53.method3011(5);
		}
		local5 = Static356.aClass107_59;
		synchronized (Static356.aClass107_59) {
			Static356.aClass107_59.method3011(5);
		}
	}
}
