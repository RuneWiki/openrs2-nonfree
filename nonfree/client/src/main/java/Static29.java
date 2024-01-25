import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bba", name = "v", descriptor = "Lclient!db;")
	public static Class64 aClass64_37;

	@OriginalMember(owner = "client!bba", name = "s", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_5 = new Class61(43, 3);

	@OriginalMember(owner = "client!bba", name = "t", descriptor = "[I")
	public static final int[] anIntArray110 = new int[5];

	@OriginalMember(owner = "client!bba", name = "u", descriptor = "Lclient!jw;")
	public static final Class183 aClass183_3 = new Class183(16);

	@OriginalMember(owner = "client!bba", name = "w", descriptor = "I")
	public static int anInt566 = 0;

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)V")
	public static void method531() {
		for (@Pc(10) Class26_Sub8 local10 = (Class26_Sub8) Static517.aClass8_8.method111(); local10 != null; local10 = (Class26_Sub8) Static517.aClass8_8.method111()) {
			Static468.method2157(local10);
		}
		@Pc(31) int local31;
		@Pc(30) int local30;
		if (Static189.aClass4_Sub2_Sub1_1.method7652(Static403.anInt6994)) {
			local30 = 3;
			local31 = 0;
		} else {
			local30 = Static312.anInt9775;
			local31 = Static312.anInt9775;
		}
		Static69.method1221();
		for (@Pc(40) int local40 = local31; local40 <= local30; local40++) {
			Static69.method1230();
			Static69.method1219(local40);
			Static69.method1220(local40);
		}
		Static69.method1228();
		Static69.method1225();
	}
}
