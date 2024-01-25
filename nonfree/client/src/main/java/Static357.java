import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!mb", name = "K", descriptor = "Lclient!so;")
	public static Class328 aClass328_1;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(Z)V")
	public static void method5168() {
		if (Static187.anInt3418 == -1) {
			return;
		}
		@Pc(12) int local12 = Static627.aClass48_1.method7512();
		@Pc(16) int local16 = Static627.aClass48_1.method7511();
		@Pc(21) Class3_Sub6 local21 = (Class3_Sub6) Static388.aClass302_43.method6603();
		if (local21 != null) {
			local12 = local21.method5324();
			local16 = local21.method5323();
		}
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		if (Static498.aBoolean757) {
			local37 = Static84.method1336();
			local39 = Static614.method8324();
		}
		Static74.method1277(local37 + Static531.anInt8327, local37, local12, local16 + local39, local37, local37 + local12, local39, Static187.anInt3418, local39 + Static13.anInt306, local16, local39);
		if (Static118.aClass265_13 != null) {
			Static235.method3561(local16 + local39, local12 - -local37);
		}
	}
}
