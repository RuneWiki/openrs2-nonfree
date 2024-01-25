import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!je", name = "i", descriptor = "I")
	public static int anInt4859;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "Lclient!fj;")
	public static final Class101 aClass101_5 = new Class101();

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public static void method4101() {
		if (!Static73.aBoolean136) {
			return;
		}
		@Pc(15) Class198 local15 = Static428.method6579(Static155.anInt3381, Static148.anInt6865);
		if (local15 != null && local15.anObjectArray34 != null) {
			@Pc(24) Class12_Sub6 local24 = new Class12_Sub6();
			local24.anObjectArray2 = local15.anObjectArray34;
			local24.aClass198_2 = local15;
			Static312.method5029(local24);
		}
		Static514.anInt1498 = -1;
		Static73.aBoolean136 = false;
		Static4.anInt69 = -1;
		if (local15 != null) {
			Static331.method5282(local15);
		}
	}
}
